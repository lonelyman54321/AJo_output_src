/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpz;
import com.google.android.gms.internal.ads.zzbqb;
import com.google.android.gms.internal.ads.zzbqc;
import com.google.android.gms.internal.ads.zzbqd;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

public final class zzbqe {
    public static final zzbqb zza;
    public static final zzbpz zzb;
    private static final Charset zzc;

    static {
        zzc = Charset.forName("UTF-8");
        zzbpz zzbpz2 = new zzbqd();
        zza = zzbpz2;
        zzbpz2 = new zzbqc();
        zzb = zzbpz2;
    }

    public static /* synthetic */ InputStream zza(JSONObject object) {
        object = object.toString();
        Charset charset = zzc;
        object = object.getBytes(charset);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
        return byteArrayInputStream;
    }
}

