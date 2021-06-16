package com.example.chatapp.Remote;

import com.example.chatapp.model.FCMResponse;
import com.example.chatapp.model.FCMSendData;

import java.util.Observable;

import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
   @Headers({
      "Content-Type:application/json",
           "Authorization:key="
   })
   @POST ("fcm/send")
   io.reactivex.Observable<FCMResponse> sendNotification(@Body FCMSendData body);
}
