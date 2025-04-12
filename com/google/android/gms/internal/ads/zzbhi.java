/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhu;

public final class zzbhi
extends zzbhu {
    private final Drawable zza;
    private final Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;

    public zzbhi(Drawable drawable2, Uri uri, double d2, int n3, int n4) {
        this.zza = drawable2;
        this.zzb = uri;
        this.zzc = d2;
        this.zzd = n3;
        this.zze = n4;
    }

    public final double zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final Uri zze() {
        return this.zzb;
    }

    public final IObjectWrapper zzf() {
        return ObjectWrapper.wrap(this.zza);
    }
}

