package se.uu.homebasedmonitoring;

import org.springframework.web.client.HttpServerErrorException.NotImplemented;

public class ExternalPaymentService {
    private float amount;
    private String currency;
    private String requesterAccount;
    private String responderAccount;

    public Boolean executePayment(){
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void setCurrency(String currency){
        this.currency = currency;
    }

    public String getCurrency(){
        return this.currency;
    }

    public void setAmount(float amount){
        this.amount = amount;
    }

    public float getAmount(){
        return this.amount;
    }

    public void setRequesterAccount(String requesterAccount){
        this.requesterAccount = requesterAccount;
    }

    public String getRequesterAccount(){
        return this.requesterAccount;
    }

    public void setResponderAccount(String responderAccount){
        this.responderAccount = responderAccount;
    }

    public String getResponderAccount(){
        return this.responderAccount;
    }

    

}
