package gr.bytecode.exceptionhandling.config;

/**
 * @author Dimi Balaouras
 */
public class ErrorMessage {

    /**
     * Constructor
     *
     * @param errorMessage
     */
    public ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * The error message
     */
    private String errorMessage;

    /**
     * @return the errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * @param errorMessage the errorMessage to set
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
