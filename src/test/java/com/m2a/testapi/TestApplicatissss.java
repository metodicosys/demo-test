package com.m2a.testapi;

import java.awt.PageAttributes.MediaType;
import java.util.UUID;

import org.eclipse.core.internal.runtime.Product;

//import org.graalvm.compiler.core.GraalCompiler.Request;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

//import io.cucumber.gherkin.internal.com.eclipsesource.json.JsonObject;
//import io.cucumber.gherkin.internal.com.eclipsesource.json.JsonParser;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TestApplicatissss {
    private String key;

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

        Response response = client.newCall(request).execute();
        JsonParser parser = new JsonParser();
        JsonObject obj = parser.parse(response.body().string()).getAsJsonObject();
        key = obj.get("key").getAsString();
        System.out.println("Key: " + key);
    }

/*
    public Product[] getBucket() throws Exception{
        OkHttpClient client = new OkHttpClient();

        okhttp3.MediaType mediaType = okhttp3.MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\n    \"type\": \"get_bucket\",\n    \"json\": \"{'key': '" + key + "'}\"\n}");
        Request request = new Request.Builder()
                .url("https://qhiug7xk62.execute-api.eu-central-1.amazonaws.com/default/Bucket")
                .post(body)
                .addHeader("x-api-key", "B8q6CdR6707ZV9YxGnivN4kHl9zbvP0h6jwxOsBS")
                .addHeader("Content-Type", "application/json")
                .addHeader("cache-control", "no-cache")
                .addHeader("Postman-Token", "399988a1-22a3-487f-874f-b35c32442b3a")
                .build();

        Response response = client.newCall(request).execute();

        return new Gson().fromJson(response.body().string(), Product[].class);
    }

    public void removeBucketElement(String id) throws Exception{
        OkHttpClient client = new OkHttpClient();

        okhttp3.MediaType mediaType = okhttp3.MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "{'type':'remove_entity', 'json':'{\"id\": \"" + id + "\"}'}");
        Request request = new Request.Builder()
                .url("https://qhiug7xk62.execute-api.eu-central-1.amazonaws.com/default/Bucket")
                .post(body)
                .addHeader("x-api-key", "B8q6CdR6707ZV9YxGnivN4kHl9zbvP0h6jwxOsBS")
                .addHeader("Content-Type", "application/json")
                .addHeader("cache-control", "no-cache")
                .addHeader("Postman-Token", "7a36e0d9-b7fd-49d7-94b2-1cbcc3039a8c")
                .build();

        Response response = client.newCall(request).execute();
    }
    public void addProduct(String product, int count) throws Exception{
        OkHttpClient client = new OkHttpClient();

        okhttp3.MediaType mediaType = okhttp3.MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "{'type':'add_entity', 'json':'{\"productName\": \"" + product + "\", \"count\": " + count + ", \"id\": \"" + UUID.randomUUID().toString() +"\", \"key\": \"" + key + "\", \"active\": true}'}");
        Request request = new Request.Builder()
                .url("https://qhiug7xk62.execute-api.eu-central-1.amazonaws.com/default/Bucket")
                .post(body)
                .addHeader("x-api-key", "B8q6CdR6707ZV9YxGnivN4kHl9zbvP0h6jwxOsBS")
                .addHeader("Content-Type", "application/json")
                .addHeader("cache-control", "no-cache")
                .addHeader("Postman-Token", "4e0fb756-ddbf-45d4-a9c1-79739345684c")
                .build();

        Response response = client.newCall(request).execute();
    }
*/

    public static void main(String ... args) throws Exception{
     //   new ApplicationApi().login("company", "company");
    }

}
