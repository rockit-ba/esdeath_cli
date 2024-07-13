package cn.pan.esdeathcli.commom;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtil {
    private final static Gson GSON;
    static {
        GsonBuilder builder = new GsonBuilder();
        builder.disableHtmlEscaping();
        GSON = builder.create();
    }

    public static <T> T toBean(String json, Class<T> tClass) {
        return GSON.fromJson(json,tClass);
    }
}