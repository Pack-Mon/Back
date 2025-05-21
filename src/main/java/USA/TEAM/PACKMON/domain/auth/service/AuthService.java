package USA.TEAM.PACKMON.domain.auth.service;

import USA.TEAM.PACKMON.domain.auth.dto.LoginRequestDto;
import USA.TEAM.PACKMON.domain.auth.dto.SignUpRequestDto;
import USA.TEAM.PACKMON.domain.auth.exception.DuplicateLoginIdException;
import USA.TEAM.PACKMON.domain.auth.exception.InvalidPasswordException;
import USA.TEAM.PACKMON.domain.auth.exception.UserNotFoundException;
import USA.TEAM.PACKMON.domain.user.domain.User;
import USA.TEAM.PACKMON.domain.user.domain.repository.UserRepository;
import USA.TEAM.PACKMON.global.security.jwt.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public void signUp(SignUpRequestDto signUpRequestDto) {
        if(userRepository.findByLoginId(signUpRequestDto.getLoginId()).isPresent()){
            throw new DuplicateLoginIdException("이미 회원가입이 되어 있습니다.");
        }
        User user = new User(signUpRequestDto);
        userRepository.save(user);
    }
    public String login(LoginRequestDto loginRequestDto) {
        User user = userRepository.findByLoginId(loginRequestDto.getLoginId()).
                orElseThrow(() -> new UserNotFoundException("존재하지 않는 로그인 ID입니다."));;

        /*if (!userRepository.findByPassword(loginRequestDto.getPassword()).equals(user.getPassword())) {
            throw new InvalidPasswordException("비밀번호가 일치하지 않습니다.");
        }*/
        return jwtUtil.generateToken(user.getLoginId());
    }
}
