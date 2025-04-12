/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzro;
import com.google.android.gms.internal.gtm.zzrq;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

final class zzrn
implements zzro {
    private HttpURLConnection zza;
    private InputStream zzb = null;

    public final InputStream zza(String object) {
        Serializable serializable = new URL((String)object);
        object = (HttpURLConnection)serializable.openConnection();
        int n3 = 20000;
        ((URLConnection)object).setReadTimeout(n3);
        ((URLConnection)object).setConnectTimeout(n3);
        this.zza = object;
        n3 = ((HttpURLConnection)object).getResponseCode();
        int n4 = 200;
        if (n3 == n4) {
            this.zzb = object = ((URLConnection)object).getInputStream();
            return object;
        }
        object = hj0_0.a(n3, "Bad response: ");
        n4 = 404;
        if (n3 != n4) {
            n4 = 503;
            if (n3 == n4) {
                serializable = new zzrq((String)object);
                throw serializable;
            }
            serializable = new IOException((String)object);
            throw serializable;
        }
        serializable = new FileNotFoundException((String)object);
        throw serializable;
    }

    public final void zzb() {
        HttpURLConnection httpURLConnection;
        block4: {
            httpURLConnection = this.zza;
            Object object = this.zzb;
            if (object == null) break block4;
            try {
                ((InputStream)object).close();
            }
            catch (IOException iOException) {
                object = String.valueOf(iOException.getMessage());
                String string2 = "HttpUrlConnectionNetworkClient: Error when closing http input stream: ";
                string2.concat((String)object);
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}

