package com.tanwan.httplibs.request;

import java.util.Map;

import com.tanwan.httplibs.okhttp3.Request;
import com.tanwan.httplibs.okhttp3.RequestBody;

/**
 * Created by zhy on 15/12/14.
 */
public class GetRequest extends OkHttpRequest
{
    public GetRequest(String url, Object tag, Map<String, String> params, Map<String, String> headers, int id)
    {
        super(url, tag, params, headers,id);
    }

    @Override
    protected RequestBody buildRequestBody()
    {
        return null;
    }

    @Override
    protected Request buildRequest(RequestBody requestBody)
    {
        return builder.get().build();
    }


}
