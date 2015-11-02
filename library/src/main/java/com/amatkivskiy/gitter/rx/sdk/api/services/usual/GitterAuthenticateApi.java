package com.amatkivskiy.gitter.rx.sdk.api.services.usual;

import com.amatkivskiy.gitter.rx.sdk.model.response.AccessTokenResponse;
import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

public interface GitterAuthenticateApi {

  @POST("/login/oauth/token")
  @FormUrlEncoded
  void getAccessToken(
      @Field("client_id") String clientId,
      @Field("client_secret") String clientSecret,
      @Field("code") String code,
      @Field("redirect_uri") String redirectUri,
      @Field("grant_type") String grantType,
      Callback<AccessTokenResponse> callback
  );
}