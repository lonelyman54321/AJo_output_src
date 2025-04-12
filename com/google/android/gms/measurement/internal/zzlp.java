/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzji;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;

public final class zzlp
extends zzji {
    public zzlp(zzic zzic2) {
        super(zzic2);
    }

    public static /* bridge */ /* synthetic */ byte[] zza(zzlp zzlp2, HttpURLConnection httpURLConnection) {
        return zzlp.zza(httpURLConnection);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static byte[] zza(HttpURLConnection object) {
        Throwable throwable2;
        InputStream inputStream;
        block4: {
            ByteArrayOutputStream byteArrayOutputStream;
            inputStream = null;
            try {
                int n3;
                byteArrayOutputStream = new ByteArrayOutputStream();
                inputStream = ((URLConnection)object).getInputStream();
                int n4 = 1024;
                object = new byte[n4];
                while ((n3 = inputStream.read((byte[])object)) > 0) {
                    byteArrayOutputStream.write((byte[])object, 0, n3);
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            object = byteArrayOutputStream.toByteArray();
            inputStream.close();
            return object;
        }
        if (inputStream != null) {
            inputStream.close();
        }
        throw throwable2;
    }

    public final boolean zzc() {
        boolean bl2;
        Context context;
        block3: {
            this.zzad();
            context = this.zza();
            String string2 = "connectivity";
            context = (ConnectivityManager)context.getSystemService(string2);
            if (context != null) {
                try {
                    context = context.getActiveNetworkInfo();
                    break block3;
                }
                catch (SecurityException securityException) {}
            }
            bl2 = false;
            context = null;
        }
        return context != null && (bl2 = context.isConnected());
    }

    public final boolean zzh() {
        return false;
    }
}

