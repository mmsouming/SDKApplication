package com.tanwan.gson;

import com.tanwan.httplibs.callback.Callback;
import com.tanwan.httplibs.okhttp3.Response;
import com.tanwan.commomutils.TUtil;


/**
 * Created by mms on 2018/3/2.
 */

public abstract class GsonCallBack<T> extends Callback<T> {
    @Override
    public T parseNetworkResponse(Response response, int id) throws Exception {
        String string = response.body().string();
        T t =  TUtil.getT(this, 0);
        t = (T) new Gson().fromJson(string, t.getClass());
        return t;
    }


}
