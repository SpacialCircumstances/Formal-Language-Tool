package space.uber.stk.flt;

class ParserException extends Exception {

    private String errorMessage = "";

    ParserException(String error){
        this.errorMessage = error;
        System.out.println(errorMessage);
    }



    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}