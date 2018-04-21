package com.tanwan.httplibs.cookie.store;


import com.tanwan.httplibs.okhttp3.Cookie;
import com.tanwan.httplibs.okhttp3.HttpUrl;

import java.util.List;

public interface CookieStore
{

    void add(HttpUrl uri, List<Cookie> cookie);

    List<Cookie> get(HttpUrl uri);

    List<Cookie> getCookies();

    boolean remove(HttpUrl uri, Cookie cookie);

    boolean removeAll();

}
