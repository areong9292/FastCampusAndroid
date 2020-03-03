package com.example.network;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MyService {

    // https://api.github.com/users/{user}/repos
    // 이 주소에 request 요청, {user}는 값 변경되는 변수
    // GET, POST, 등등 다 된다
    @GET("users/{user}/repos")

    // 요청 시 받을 응답이 어떤 타입(JsonArray)인지 지정
    // {user에 어떤 게 들어가는지 지정}
    // getUseRepositories 사용 시 스트링 값을 인자로 보내면 된다
    Call<JsonObject> getUseRepositories(@Path("user")String userName);
}
