package com.tanwan.httplibs.builder;


import com.tanwan.httplibs.okhttp3.MediaType;
import com.tanwan.httplibs.request.PostFileRequest;
import com.tanwan.httplibs.request.RequestCall;

import java.io.File;


public class PostFileBuilder extends OkHttpRequestBuilder<PostFileBuilder>
{
    private File file;
    private MediaType mediaType;


    public OkHttpRequestBuilder file(File file)
    {
        this.file = file;
        return this;
    }

    public OkHttpRequestBuilder mediaType(MediaType mediaType)
    {
        this.mediaType = mediaType;
        return this;
    }

    @Override
    public RequestCall build()
    {
        return new PostFileRequest(url, tag, params, headers, file, mediaType,id).build();
    }


}
