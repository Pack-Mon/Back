package USA.TEAM.PACKMON.domain.auth.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class LoginRequestDto {
    @NotBlank
    private String loginId;
    @NotBlank
    @Size(min = 6)
    private String password;
}
