package USA.TEAM.PACKMON.domain.auth.exception;

import USA.TEAM.PACKMON.global.exception.UserException;

public class InvalidPasswordException extends UserException {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
