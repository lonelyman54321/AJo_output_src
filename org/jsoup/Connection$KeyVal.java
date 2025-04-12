/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup;

import java.io.InputStream;

public interface Connection$KeyVal {
    public String contentType();

    public Connection$KeyVal contentType(String var1);

    public boolean hasInputStream();

    public InputStream inputStream();

    public Connection$KeyVal inputStream(InputStream var1);

    public String key();

    public Connection$KeyVal key(String var1);

    public String value();

    public Connection$KeyVal value(String var1);
}

