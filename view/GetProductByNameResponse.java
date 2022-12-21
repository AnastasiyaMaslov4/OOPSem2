package view;

public class GetProductByNameResponse {
    
    private String errorMessage;
    private String positiveResponse;

    public GetProductByNameResponse(String errorMessage, String positiveResponse) {
        this.errorMessage = errorMessage;
        this.positiveResponse = positiveResponse;
    }

    @Override
    public String toString() {
        if (errorMessage == null) return positiveResponse;
        else return errorMessage;
    }

}
