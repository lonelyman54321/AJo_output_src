/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.helper;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jsoup.Connection$Base;
import org.jsoup.Connection$Method;
import org.jsoup.helper.HttpConnection$1;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;

abstract class HttpConnection$Base
implements Connection$Base {
    private static final URL UnsetUrl;
    Map cookies;
    Map headers;
    Connection$Method method;
    URL url;

    static {
        Object object = "http://undefined/";
        try {
            URL uRL;
            UnsetUrl = uRL = new URL((String)object);
            return;
        }
        catch (MalformedURLException malformedURLException) {
            object = new IllegalStateException(malformedURLException);
            throw object;
        }
    }

    private HttpConnection$Base() {
        Object object;
        this.url = object = UnsetUrl;
        object = Connection$Method.GET;
        this.method = object;
        this.headers = object;
        super();
        this.cookies = object;
    }

    public /* synthetic */ HttpConnection$Base(HttpConnection$1 httpConnection$1) {
        this();
    }

    private HttpConnection$Base(HttpConnection$Base object) {
        boolean bl2;
        Object object2 = UnsetUrl;
        this.url = object2;
        object2 = Connection$Method.GET;
        this.method = object2;
        object2 = ((HttpConnection$Base)object).url;
        this.url = object2;
        object2 = ((HttpConnection$Base)object).method;
        this.method = object2;
        this.headers = object2;
        object2 = ((HttpConnection$Base)object).headers.entrySet().iterator();
        while (bl2 = object2.hasNext()) {
            Object object3 = (Map.Entry)object2.next();
            Map map2 = this.headers;
            String string2 = (String)object3.getKey();
            object3 = (Collection)object3.getValue();
            ArrayList arrayList = new ArrayList(object3);
            map2.put(string2, arrayList);
        }
        this.cookies = object2 = new LinkedHashMap();
        object = ((HttpConnection$Base)object).cookies;
        object2.putAll(object);
    }

    public /* synthetic */ HttpConnection$Base(HttpConnection$Base httpConnection$Base, HttpConnection$1 httpConnection$1) {
        this(httpConnection$Base);
    }

    private List getHeadersCaseInsensitive(String string2) {
        boolean bl2;
        Validate.notNull(string2);
        Iterator iterator = this.headers.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            String string3 = (String)entry.getKey();
            boolean bl3 = string2.equalsIgnoreCase(string3);
            if (!bl3) continue;
            return (List)entry.getValue();
        }
        return Collections.emptyList();
    }

    private Map.Entry scanHeaders(String string2) {
        boolean bl2;
        string2 = Normalizer.lowerCase(string2);
        Iterator iterator = this.headers.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            String string3 = Normalizer.lowerCase((String)entry.getKey());
            boolean bl3 = string3.equals(string2);
            if (!bl3) continue;
            return entry;
        }
        return null;
    }

    public Connection$Base addHeader(String string2, String string3) {
        boolean bl2;
        ArrayList<String> arrayList = "name";
        Validate.notEmptyParam(string2, (String)((Object)arrayList));
        if (string3 == null) {
            string3 = "";
        }
        if (bl2 = (arrayList = this.headers(string2)).isEmpty()) {
            arrayList = new ArrayList<String>();
            Map map2 = this.headers;
            map2.put(string2, arrayList);
        }
        arrayList.add(string3);
        return this;
    }

    public String cookie(String string2) {
        Validate.notEmptyParam(string2, "name");
        return (String)this.cookies.get(string2);
    }

    public Connection$Base cookie(String string2, String string3) {
        Validate.notEmptyParam(string2, "name");
        Validate.notNullParam(string3, "value");
        this.cookies.put(string2, string3);
        return this;
    }

    public Map cookies() {
        return this.cookies;
    }

    public boolean hasCookie(String string2) {
        Validate.notEmptyParam(string2, "name");
        return this.cookies.containsKey(string2);
    }

    public boolean hasHeader(String string2) {
        Validate.notEmptyParam(string2, "name");
        return this.getHeadersCaseInsensitive(string2).isEmpty() ^ true;
    }

    public boolean hasHeaderWithValue(String object, String string2) {
        boolean bl2;
        Validate.notEmpty((String)object);
        Validate.notEmpty(string2);
        object = this.headers((String)object).iterator();
        while (bl2 = object.hasNext()) {
            String string3 = (String)object.next();
            bl2 = string2.equalsIgnoreCase(string3);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public String header(String object) {
        String string2 = "name";
        Validate.notNullParam(object, string2);
        object = this.getHeadersCaseInsensitive((String)object);
        int n3 = object.size();
        if (n3 > 0) {
            return StringUtil.join((Collection)object, ", ");
        }
        return null;
    }

    public Connection$Base header(String string2, String string3) {
        Validate.notEmptyParam(string2, "name");
        this.removeHeader(string2);
        this.addHeader(string2, string3);
        return this;
    }

    public List headers(String string2) {
        Validate.notEmptyParam(string2, "name");
        return this.getHeadersCaseInsensitive(string2);
    }

    public Map headers() {
        boolean bl2;
        int n3 = this.headers.size();
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>(n3);
        Iterator iterator = this.headers.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            String string2 = (String)object.getKey();
            int n4 = (object = (List)object.getValue()).size();
            if (n4 <= 0) continue;
            n4 = 0;
            object = (String)object.get(0);
            ((AbstractMap)linkedHashMap).put(string2, object);
        }
        return linkedHashMap;
    }

    public Connection$Base method(Connection$Method connection$Method) {
        Validate.notNullParam((Object)connection$Method, "method");
        this.method = connection$Method;
        return this;
    }

    public Connection$Method method() {
        return this.method;
    }

    public Map multiHeaders() {
        return this.headers;
    }

    public Connection$Base removeCookie(String string2) {
        Validate.notEmptyParam(string2, "name");
        this.cookies.remove(string2);
        return this;
    }

    public Connection$Base removeHeader(String object) {
        Object object2 = "name";
        Validate.notEmptyParam((String)object, (String)object2);
        object = this.scanHeaders((String)object);
        if (object != null) {
            object2 = this.headers;
            object = object.getKey();
            object2.remove(object);
        }
        return this;
    }

    public URL url() {
        Serializable serializable = this.url;
        URL uRL = UnsetUrl;
        if (serializable != uRL) {
            return serializable;
        }
        serializable = new IllegalArgumentException("URL not set. Make sure to call #url(...) before executing the request.");
        throw serializable;
    }

    public Connection$Base url(URL uRL) {
        Validate.notNullParam(uRL, "url");
        UrlBuilder urlBuilder = new UrlBuilder(uRL);
        this.url = uRL = urlBuilder.build();
        return this;
    }
}

