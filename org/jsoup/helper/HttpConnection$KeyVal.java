/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.helper;

import java.io.InputStream;
import org.jsoup.Connection$KeyVal;
import org.jsoup.helper.Validate;

public class HttpConnection$KeyVal
implements Connection$KeyVal {
    private String contentType;
    private String key;
    private InputStream stream;
    private String value;

    private HttpConnection$KeyVal(String string2, String string3) {
        Validate.notEmptyParam(string2, "key");
        Validate.notNullParam(string3, "value");
        this.key = string2;
        this.value = string3;
    }

    public static HttpConnection$KeyVal create(String string2, String string3) {
        HttpConnection$KeyVal httpConnection$KeyVal = new HttpConnection$KeyVal(string2, string3);
        return httpConnection$KeyVal;
    }

    public static HttpConnection$KeyVal create(String string2, String string3, InputStream inputStream) {
        HttpConnection$KeyVal httpConnection$KeyVal = new HttpConnection$KeyVal(string2, string3);
        return httpConnection$KeyVal.inputStream(inputStream);
    }

    public String contentType() {
        return this.contentType;
    }

    public Connection$KeyVal contentType(String string2) {
        Validate.notEmpty(string2);
        this.contentType = string2;
        return this;
    }

    public boolean hasInputStream() {
        boolean bl2;
        InputStream inputStream = this.stream;
        if (inputStream != null) {
            bl2 = true;
        } else {
            bl2 = false;
            inputStream = null;
        }
        return bl2;
    }

    public InputStream inputStream() {
        return this.stream;
    }

    public HttpConnection$KeyVal inputStream(InputStream inputStream) {
        Validate.notNullParam(this.value, "inputStream");
        this.stream = inputStream;
        return this;
    }

    public String key() {
        return this.key;
    }

    public HttpConnection$KeyVal key(String string2) {
        Validate.notEmptyParam(string2, "key");
        this.key = string2;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.key;
        stringBuilder.append(string2);
        stringBuilder.append("=");
        string2 = this.value;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public String value() {
        return this.value;
    }

    public HttpConnection$KeyVal value(String string2) {
        Validate.notNullParam(string2, "value");
        this.value = string2;
        return this;
    }
}

