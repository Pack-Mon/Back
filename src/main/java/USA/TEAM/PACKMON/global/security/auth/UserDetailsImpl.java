package USA.TEAM.PACKMON.global.security.auth;

import USA.TEAM.PACKMON.domain.user.domain.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.Collections;

public class UserDetailsImpl implements UserDetails {
    private final User user;

    public UserDetailsImpl(User user) {
        this.user = user;
    }
    public Long getMemberId() {
        return user.getId();
    }
    @Override public Collection<? extends GrantedAuthority> getAuthorities() { return Collections.emptyList(); }//권한 정보 반환
    @Override public String getPassword() { return user.getPassword(); }
    @Override public String getUsername() { return user.getLoginId(); }
    @Override public boolean isAccountNonExpired() { return true; }
    @Override public boolean isAccountNonLocked() { return true; }
    @Override public boolean isCredentialsNonExpired() { return true; }
    @Override public boolean isEnabled() { return true; }
}