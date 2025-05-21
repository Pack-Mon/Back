package USA.TEAM.PACKMON.domain.auth.exception;

import USA.TEAM.PACKMON.global.exception.UserException;

public class UserNotFoundException extends UserException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
