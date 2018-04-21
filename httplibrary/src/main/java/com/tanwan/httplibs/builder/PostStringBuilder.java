package com.tanwan.httplibs.builder;


import com.tanwan.httplibs.okhttp3.MediaType;
import com.tanwan.httplibs.request.PostStringRequest;
import com.tanwan.httplibs.request.RequestCall;

public class PostStringBuilder extends OkHttpRequestBuilder<PostStringBuilder>
{
    private String content;
    private MediaType mediaType;


    public PostStringBuilder content(String content)
    {
        this.content = content;
        return this;
    }

    public PostStringBuilder mediaType(MediaType mediaType)
    {
        this.mediaType = mediaType;
        return this;
    }

    @Override
    public RequestCall build()
    {
        return new PostStringRequest(url, tag, params, headers, content, mediaType,id).build();
    }


}
