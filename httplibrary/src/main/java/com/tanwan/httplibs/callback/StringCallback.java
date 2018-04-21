package com.tanwan.httplibs.callback;

import com.tanwan.httplibs.okhttp3.Response;

import java.io.IOException;


/**
 * Created by zhy on 15/12/14.
 */
public abstract class StringCallback extends Callback<String>
{
    @Override
    public String parseNetworkResponse(Response response, int id) throws IOException
    {
        return response.body().string();
    }
}
