package USA.TEAM.PACKMON.domain.auth.exception;

import USA.TEAM.PACKMON.global.exception.UserException;

public class DuplicateLoginIdException extends UserException {
    public DuplicateLoginIdException(String message) {
        super(message);
    }
}
