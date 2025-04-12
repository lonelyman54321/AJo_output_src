/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup;

import java.io.BufferedInputStream;
import org.jsoup.Connection$Base;
import org.jsoup.nodes.Document;

public interface Connection$Response
extends Connection$Base {
    public String body();

    public byte[] bodyAsBytes();

    public BufferedInputStream bodyStream();

    public Connection$Response bufferUp();

    public String charset();

    public Connection$Response charset(String var1);

    public String contentType();

    public Document parse();

    public int statusCode();

    public String statusMessage();
}

