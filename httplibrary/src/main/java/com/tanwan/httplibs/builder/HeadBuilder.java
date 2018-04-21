package com.tanwan.httplibs.builder;


import com.tanwan.httplibs.OkHttpUtils;
import com.tanwan.httplibs.request.OtherRequest;
import com.tanwan.httplibs.request.RequestCall;

public class HeadBuilder extends GetBuilder
{
    @Override
    public RequestCall build()
    {
        return new OtherRequest(null, null, OkHttpUtils.METHOD.HEAD, url, tag, params, headers,id).build();
    }
}
