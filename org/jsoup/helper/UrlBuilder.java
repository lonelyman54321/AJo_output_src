/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.helper;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import org.jsoup.Connection$KeyVal;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;

final class UrlBuilder {
    static final /* synthetic */ boolean $assertionsDisabled;
    StringBuilder q;
    URL u;

    public UrlBuilder(URL object) {
        this.u = object;
        object = ((URL)object).getQuery();
        if (object != null) {
            object = StringUtil.borrowBuilder();
            String string2 = this.u.getQuery();
            ((StringBuilder)object).append(string2);
            this.q = object;
        }
    }

    private static void appendToAscii(String string2, boolean bl2, StringBuilder stringBuilder) {
        int n3;
        for (int i3 = 0; i3 < (n3 = string2.length()); ++i3) {
            int n4;
            n3 = string2.codePointAt(i3);
            if (n3 == (n4 = 32)) {
                Object object;
                if (bl2) {
                    n3 = 43;
                    object = Character.valueOf((char)n3);
                } else {
                    object = "%20";
                }
                stringBuilder.append(object);
                continue;
            }
            n4 = 127;
            if (n3 > n4) {
                Object object = Character.toChars(n3);
                String string3 = new String((char[])object);
                object = DataUtil.UTF_8.name();
                string3 = URLEncoder.encode(string3, (String)object);
                stringBuilder.append(string3);
                n3 = Character.charCount(n3);
                n4 = 2;
                if (n3 != n4) continue;
                ++i3;
                continue;
            }
            n3 = (char)n3;
            stringBuilder.append((char)n3);
        }
    }

    private static String decodePart(String string2) {
        Object object;
        try {
            object = DataUtil.UTF_8;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            object = new RuntimeException(unsupportedEncodingException);
            throw object;
        }
        object = ((Charset)object).name();
        return URLDecoder.decode(string2, (String)object);
    }

    public void appendKeyVal(Connection$KeyVal object) {
        StringBuilder stringBuilder = this.q;
        if (stringBuilder == null) {
            this.q = stringBuilder = StringUtil.borrowBuilder();
        } else {
            char c2 = '&';
            stringBuilder.append(c2);
        }
        stringBuilder = this.q;
        String string2 = object.key();
        Charset charset = DataUtil.UTF_8;
        String string3 = charset.name();
        string2 = URLEncoder.encode(string2, string3);
        stringBuilder.append(string2);
        stringBuilder.append('=');
        object = object.value();
        string2 = charset.name();
        object = URLEncoder.encode((String)object, string2);
        stringBuilder.append((String)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public URL build() {
        try {
            char c2;
            URI uRI;
            Object object = this.u;
            Object object2 = ((URL)object).getProtocol();
            object = this.u;
            String string2 = ((URL)object).getUserInfo();
            object = this.u;
            object = ((URL)object).getHost();
            object = UrlBuilder.decodePart((String)object);
            String string3 = IDN.toASCII((String)object);
            object = this.u;
            int n3 = ((URL)object).getPort();
            object = uRI;
            uRI = new URI((String)object2, string2, string3, n3, null, null, null);
            object = StringUtil.borrowBuilder();
            object2 = uRI.toASCIIString();
            ((StringBuilder)object).append((String)object2);
            object2 = this.u;
            object2 = ((URL)object2).getPath();
            string2 = null;
            UrlBuilder.appendToAscii((String)object2, false, (StringBuilder)object);
            object2 = this.q;
            if (object2 != null) {
                c2 = '?';
                ((StringBuilder)object).append(c2);
                object2 = this.q;
                object2 = StringUtil.releaseBuilder((StringBuilder)object2);
                boolean bl2 = true;
                UrlBuilder.appendToAscii((String)object2, bl2, (StringBuilder)object);
            }
            object2 = this.u;
            if ((object2 = ((URL)object2).getRef()) != null) {
                c2 = '#';
                ((StringBuilder)object).append(c2);
                object2 = this.u;
                object2 = ((URL)object2).getRef();
                UrlBuilder.appendToAscii((String)object2, false, (StringBuilder)object);
            }
            object = StringUtil.releaseBuilder((StringBuilder)object);
            this.u = object2 = new URL((String)object);
            return object2;
        }
        catch (UnsupportedEncodingException | MalformedURLException | URISyntaxException exception) {
            return this.u;
        }
    }
}

