package com.begentgroup.samplelbs.request;

import android.content.Context;

import com.begentgroup.samplelbs.data.CarRouteInfo;
import com.begentgroup.samplelbs.data.Geometry;
import com.begentgroup.samplelbs.data.GeometryDeserializer;
import com.begentgroup.samplelbs.manager.NetworkRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/**
 * Created by Administrator on 2016-08-19.
 */
public class RouteRequest extends NetworkRequest<CarRouteInfo> {
    Request request;
    public RouteRequest(Context context, double startLat, double startLng,
                        double endLat, double endLng) {
        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host("apis.skplanetx.com")
                .addPathSegments("/tmap/routes")
                .addQueryParameter("version","1")
                .build();

        RequestBody body = new FormBody.Builder()
                .add("startX", ""+startLng)
                .add("startY", ""+startLat)
                .add("endX", "" + endLng)
                .add("endY", "" + endLat)
                .add("resCoordType","WGS84GEO")
                .add("reqCoordType","WGS84GEO")
                .build();

        request = new Request.Builder()
                .url(url)
                .header("Accept","application/json")
                .header("appKey","2bc7afe3-fc89-3125-b699-b9fb7cfe2fae")
                .post(body)
                .tag(context)
                .build();

    }
    @Override
    public Request getRequest() {
        return request;
    }

    @Override
    protected CarRouteInfo parse(ResponseBody body) throws IOException {
        Gson gson = new GsonBuilder().registerTypeAdapter(Geometry.class, new GeometryDeserializer()).create();
        CarRouteInfo result = gson.fromJson(body.charStream(), CarRouteInfo.class);
        return result;
    }
}
