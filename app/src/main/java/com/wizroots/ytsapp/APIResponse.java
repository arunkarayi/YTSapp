package com.wizroots.ytsapp;

import com.google.gson.annotations.SerializedName;

/**
 * Created by arun on 6/29/18.
 * Purpose -
 */

public class APIResponse {

    @SerializedName("status")
    String status;

    @SerializedName("status_message")
    String status_message;

    @SerializedName("data")
    ApiData apiData;
}
