/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.measurement.internal;

import android.net.Uri;
import com.google.android.gms.measurement.internal.zzlk;

final class zzln
implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ Uri zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzlk zze;

    public zzln(zzlk zzlk2, boolean bl2, Uri uri, String string2, String string3) {
        this.zza = bl2;
        this.zzb = uri;
        this.zzc = string2;
        this.zzd = string3;
        this.zze = zzlk2;
    }

    public final void run() {
        zzlk zzlk2 = this.zze;
        boolean bl2 = this.zza;
        Uri uri = this.zzb;
        String string2 = this.zzc;
        String string3 = this.zzd;
        zzlk.zza(zzlk2, bl2, uri, string2, string3);
    }
}

