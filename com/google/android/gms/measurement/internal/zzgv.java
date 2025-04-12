/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 */
package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.measurement.zzgf$zzj;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzot;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzov;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public final class zzgv
extends zzot {
    public zzgv(zzou zzou2) {
        super(zzou2);
    }

    public static /* bridge */ /* synthetic */ byte[] zza(zzgv zzgv2, HttpURLConnection httpURLConnection) {
        return zzgv.zza(httpURLConnection);
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

    public final void zza(String object, zzov object2, zzgf$zzj object3, zzgu zzgu2) {
        this.zzv();
        this.zzam();
        String string2 = ((zzov)object2).zzc();
        Object object4 = new URI(string2);
        URL uRL = ((URI)object4).toURL();
        this.h_();
        byte[] byArray = ((zzio)object3).zzce();
        object3 = this.zzl();
        Map map2 = ((zzov)object2).zzd();
        object4 = new zzgw(this, (String)object, uRL, byArray, map2, zzgu2);
        try {
            ((zzhv)object3).zza((Runnable)object4);
            return;
        }
        catch (IllegalArgumentException | MalformedURLException | URISyntaxException exception) {
            object3 = this.zzj().zzg();
            object = zzgo.zza((String)object);
            object2 = ((zzov)object2).zzc();
            ((zzgq)object3).zza("Failed to parse URL. Not uploading MeasurementBatch. appId", object, object2);
            return;
        }
    }

    public final boolean zzc() {
        return false;
    }

    public final boolean zzr() {
        boolean bl2;
        this.zzam();
        ConnectivityManager connectivityManager = (ConnectivityManager)this.zza().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            catch (SecurityException securityException) {}
        }
        return networkInfo != null && (bl2 = networkInfo.isConnected());
    }
}

