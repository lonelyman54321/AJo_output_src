/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.helper;

import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.jsoup.Connection$Request;
import org.jsoup.helper.HttpConnection$Base;
import org.jsoup.helper.HttpConnection$Request;
import org.jsoup.internal.StringUtil;

class CookieUtil {
    private static final String Cookie2Name = "Cookie2";
    private static final String CookieName = "Cookie";
    private static final Map EmptyRequestHeaders;
    private static final String Sep = "; ";

    static {
        HashMap hashMap = new HashMap();
        EmptyRequestHeaders = Collections.unmodifiableMap(hashMap);
    }

    public static void applyCookiesToRequest(HttpConnection$Request object, HttpURLConnection httpURLConnection) {
        String string2;
        String string3;
        LinkedHashSet linkedHashSet = CookieUtil.requestCookieSet((Connection$Request)object);
        Object object2 = ((HttpConnection$Request)object).cookieManager();
        object = CookieUtil.asUri(((HttpConnection$Base)object).url);
        Map.Entry<String, List<String>> entry = EmptyRequestHeaders;
        object = ((CookieManager)object2).get((URI)object, (Map<String, List<String>>)((Object)entry)).entrySet().iterator();
        object2 = null;
        while (true) {
            int n3;
            boolean bl2 = object.hasNext();
            string3 = Cookie2Name;
            string2 = CookieName;
            if (!bl2) break;
            entry = object.next();
            List list = (List)entry.getValue();
            if (list == null || (n3 = list.size()) == 0) continue;
            boolean bl3 = string2.equals(entry = (String)entry.getKey());
            if (bl3) {
                entry = object2;
                object2 = linkedHashSet;
            } else {
                bl2 = string3.equals(entry);
                if (!bl2) continue;
                entry = object2 = new HashSet();
            }
            object2.addAll(list);
            object2 = entry;
        }
        int n4 = linkedHashSet.size();
        entry = Sep;
        if (n4 > 0) {
            object = StringUtil.join(linkedHashSet, (String)((Object)entry));
            httpURLConnection.addRequestProperty(string2, (String)object);
        }
        if (object2 != null && (n4 = object2.size()) > 0) {
            object = StringUtil.join((Collection)object2, (String)((Object)entry));
            httpURLConnection.addRequestProperty(string3, (String)object);
        }
    }

    public static URI asUri(URL uRL) {
        try {
            return uRL.toURI();
        }
        catch (URISyntaxException uRISyntaxException) {
            String string2 = uRISyntaxException.getMessage();
            MalformedURLException malformedURLException = new MalformedURLException(string2);
            malformedURLException.initCause(uRISyntaxException);
            throw malformedURLException;
        }
    }

    private static LinkedHashSet requestCookieSet(Connection$Request object) {
        boolean bl2;
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<Object>();
        object = object.cookies().entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            StringBuilder stringBuilder = new StringBuilder();
            String string2 = (String)object2.getKey();
            stringBuilder.append(string2);
            string2 = "=";
            stringBuilder.append(string2);
            object2 = (String)object2.getValue();
            stringBuilder.append((String)object2);
            object2 = stringBuilder.toString();
            ((AbstractCollection)linkedHashSet).add(object2);
        }
        return linkedHashSet;
    }

    public static void storeCookies(HttpConnection$Request object, URL serializable, Map map2) {
        object = ((HttpConnection$Request)object).cookieManager();
        serializable = CookieUtil.asUri(serializable);
        ((CookieManager)object).put((URI)serializable, map2);
    }
}

