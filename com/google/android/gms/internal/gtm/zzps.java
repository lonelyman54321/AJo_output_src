/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzpt;
import com.google.android.gms.internal.gtm.zzpw;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

final class zzps
implements zzpt {
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
                serializable = new zzpw((String)object);
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
            InputStream inputStream = this.zzb;
            if (inputStream == null) break block4;
            try {
                inputStream.close();
            }
            catch (IOException iOException) {
                String string2 = String.valueOf(iOException.getMessage());
                String string3 = "HttpUrlConnectionNetworkClient: Error when closing http input stream: ";
                string2 = string3.concat(string2);
                zzhi.zzb(string2, iOException);
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}

