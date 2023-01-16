package se.uu.homebasedmonitoring;

import java.time.LocalDateTime;
import org.springframework.web.client.HttpServerErrorException.NotImplemented;

enum TypeOfRequest {
    TipRequest,
    MoreInfoRequest
  }

public class UserRequest implements RequestSubscriber{

   private TypeOfRequest typeOfRequest;

   public void updateState(Request request) {
    throw new UnsupportedOperationException("Not implemented yet");
    }

   public void setUserRequest(TypeOfRequest typeOfRequest){
    this.typeOfRequest = typeOfRequest;
   }  

   public TypeOfRequest getUserRequest(TypeOfRequest typeOfRequest){
    return this.typeOfRequest;
   } 

   private void callExternalPayment(float amount, String currency, String requesterAccount, String responderAccount)
   {
      throw new UnsupportedOperationException("Not implemented yet");
   }
}
