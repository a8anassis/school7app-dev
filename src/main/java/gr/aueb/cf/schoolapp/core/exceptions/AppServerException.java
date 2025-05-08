package gr.aueb.cf.schoolapp.core.exceptions;

public class AppServerException extends EntityGenericException {

    public AppServerException(String code, String message) {
        super(code, message);
    }

    public AppServerException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
