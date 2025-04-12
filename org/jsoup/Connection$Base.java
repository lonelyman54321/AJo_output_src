/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup;

import java.net.URL;
import java.util.List;
import java.util.Map;
import org.jsoup.Connection$Method;

public interface Connection$Base {
    public Connection$Base addHeader(String var1, String var2);

    public String cookie(String var1);

    public Connection$Base cookie(String var1, String var2);

    public Map cookies();

    public boolean hasCookie(String var1);

    public boolean hasHeader(String var1);

    public boolean hasHeaderWithValue(String var1, String var2);

    public String header(String var1);

    public Connection$Base header(String var1, String var2);

    public List headers(String var1);

    public Map headers();

    public Connection$Base method(Connection.Method var1);

    public Connection.Method method();

    public Map multiHeaders();

    public Connection$Base removeCookie(String var1);

    public Connection$Base removeHeader(String var1);

    public URL url();

    public Connection$Base url(URL var1);
}

