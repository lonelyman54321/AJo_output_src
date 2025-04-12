/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

public final class zzedu
implements zzgfa {
    public final ListenableFuture zza(Object object) {
        object = (JSONObject)object;
        object = object.toString();
        Charset charset = StandardCharsets.UTF_8;
        object = ((String)object).getBytes(charset);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
        return zzgft.zzh(byteArrayInputStream);
    }
}

