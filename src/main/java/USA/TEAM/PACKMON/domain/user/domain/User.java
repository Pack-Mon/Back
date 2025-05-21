package USA.TEAM.PACKMON.domain.user.domain;

import USA.TEAM.PACKMON.domain.auth.dto.SignUpRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String loginId;
    public User(SignUpRequestDto signUpRequestDto) {
        this.email = signUpRequestDto.getEmail();
        this.password = signUpRequestDto.getPassword();
        this.address = signUpRequestDto.getAddress();
        this.phone = signUpRequestDto.getPhone();
        this.loginId = signUpRequestDto.getLoginId();
    }
}
