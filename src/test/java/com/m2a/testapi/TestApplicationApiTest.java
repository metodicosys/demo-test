package com.m2a.testapi;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TestApplicationApiTest {
  @Test
  public void login(String user, String password) throws Exception{
      OkHttpClient client = new OkHttpClient();

    //  MediaType mediaType = MediaType.parse("application/json");
      okhttp3.MediaType mediaType = okhttp3.MediaType.parse("application/json");
      RequestBody body = RequestBody.create(mediaType, "{\n    \"type\": \"login\",\n    \"json\": \"{'user': '" + user + "', 'password': '" + password + "'}\"\n}");
      Request request = new Request.Builder()
              .url("https://stg.api.authentication.saf-pe.cobiscloud.com/users/v1/auth")
              .post(body)
              .addHeader("x-api-key", "swGwRN7X65XLuBqFFsthpwxMjhXjxL9CrUmvtW80")
              .addHeader("Content-Type", "application/json")
              .addHeader("cache-control", "no-cache")
           //   .addHeader("Postman-Token", "6c90d274-9497-4e5f-a261-39f77450e5bb")
              .build();

  }
}
