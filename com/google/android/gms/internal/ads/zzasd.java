/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

final class zzasd
extends FilterInputStream {
    private final HttpURLConnection zza;

    public zzasd(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
        }
        catch (IOException iOException) {
            inputStream = httpURLConnection.getErrorStream();
        }
        super(inputStream);
        this.zza = httpURLConnection;
    }

    public final void close() {
        super.close();
        this.zza.disconnect();
    }
}

