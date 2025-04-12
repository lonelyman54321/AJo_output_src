/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.net.Uri
 */
package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsIntent$e;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzhlh;

final class zzo
implements zzbfl {
    final /* synthetic */ zzbfm zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    public zzo(zzt zzt2, zzbfm zzbfm2, Context context, Uri uri) {
        this.zza = zzbfm2;
        this.zzb = context;
        this.zzc = uri;
    }

    public final void zza() {
        Object object = this.zza.zza();
        Object object2 = new CustomTabsIntent$e((bg0)object);
        object = ((CustomTabsIntent$e)object2).a();
        object2 = ((CustomTabsIntent)object).intent;
        String string2 = zzhlh.zza(this.zzb);
        object2.setPackage(string2);
        object2 = this.zzb;
        string2 = this.zzc;
        ((CustomTabsIntent)object).launchUrl((Context)object2, (Uri)string2);
        object = this.zzb;
        object2 = this.zza;
        object = (Activity)object;
        ((zzbfm)object2).zzf((Activity)object);
    }
}

