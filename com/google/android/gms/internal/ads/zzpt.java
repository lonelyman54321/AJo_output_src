/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.database.ContentObserver
 *  android.net.Uri
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzpp;
import com.google.android.gms.internal.ads.zzpw;
import com.google.android.gms.internal.ads.zzpx;

final class zzpt
extends ContentObserver {
    final /* synthetic */ zzpw zza;
    private final ContentResolver zzb;
    private final Uri zzc;

    public zzpt(zzpw zzpw2, Handler handler, ContentResolver contentResolver, Uri uri) {
        this.zza = zzpw2;
        super(handler);
        this.zzb = contentResolver;
        this.zzc = uri;
    }

    public final void onChange(boolean bl2) {
        Object object = this.zza;
        Context context = zzpw.zza((zzpw)object);
        zzk zzk2 = zzpw.zzb((zzpw)object);
        object = zzpw.zzd((zzpw)object);
        object = zzpp.zzc(context, zzk2, (zzpx)object);
        zzpw.zzf(this.zza, (zzpp)object);
    }

    public final void zza() {
        ContentResolver contentResolver = this.zzb;
        Uri uri = this.zzc;
        contentResolver.registerContentObserver(uri, false, (ContentObserver)this);
    }

    public final void zzb() {
        this.zzb.unregisterContentObserver((ContentObserver)this);
    }
}

