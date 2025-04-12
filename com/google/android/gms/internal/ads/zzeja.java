/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsIntent$e;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzcvf;
import com.google.android.gms.internal.ads.zzdbr;
import com.google.android.gms.internal.ads.zzdih;
import com.google.android.gms.internal.ads.zzdik;
import com.google.android.gms.internal.ads.zzdjh;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzehl;
import com.google.android.gms.internal.ads.zzeiy;
import com.google.android.gms.internal.ads.zzeiz;
import com.google.android.gms.internal.ads.zzfgs;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class zzeja
implements zzehl {
    private final Context zza;
    private final zzdjh zzb;
    private final Executor zzc;
    private final zzfgs zzd;

    public zzeja(Context context, Executor executor, zzdjh zzdjh2, zzfgs zzfgs2) {
        this.zza = context;
        this.zzb = zzdjh2;
        this.zzc = executor;
        this.zzd = zzfgs2;
    }

    private static String zzd(zzfgt zzfgt2) {
        String string2;
        try {
            zzfgt2 = zzfgt2.zzw;
            string2 = "tab_url";
        }
        catch (Exception exception) {
            return null;
        }
        return zzfgt2.getString(string2);
    }

    public final ListenableFuture zza(zzfhf object, zzfgt zzfgt2) {
        String string2 = zzeja.zzd(zzfgt2);
        ListenableFuture listenableFuture = null;
        string2 = string2 != null ? Uri.parse((String)string2) : null;
        listenableFuture = zzgft.zzh(null);
        zzeiy zzeiy2 = new zzeiy(this, (Uri)string2, (zzfhf)object, zzfgt2);
        object = this.zzc;
        return zzgft.zzn(listenableFuture, zzeiy2, (Executor)object);
    }

    public final boolean zzb(zzfhf object, zzfgt zzfgt2) {
        boolean bl2;
        object = this.zza;
        boolean bl3 = object instanceof Activity;
        return bl3 && (bl2 = zzbfm.zzg((Context)object)) && !(bl2 = TextUtils.isEmpty((CharSequence)(object = zzeja.zzd(zzfgt2))));
    }

    public final /* synthetic */ ListenableFuture zzc(Uri object, zzfhf object2, zzfgt object3, Object object4) {
        try {
            object4 = new CustomTabsIntent$e();
            object4 = ((CustomTabsIntent$e)object4).a();
        }
        catch (Throwable throwable) {
            zzm.zzh("Error in CustomTabsAdRenderer", throwable);
            throw throwable;
        }
        Object object5 = ((CustomTabsIntent)object4).intent;
        object5.setData((Uri)object);
        object = ((CustomTabsIntent)object4).intent;
        object4 = null;
        zzc zzc2 = new zzc((Intent)object, null);
        object = new zzccn();
        object5 = this.zzb;
        Object object6 = new zzcvf((zzfhf)object2, (zzfgt)object3, null);
        object3 = new zzeiz((zzccn)object);
        object2 = new zzdik((zzdjp)object3, null);
        object2 = ((zzdjh)object5).zze((zzcvf)object6, (zzdik)object2);
        zzdbr zzdbr2 = ((zzdih)object2).zza();
        object4 = null;
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0, 0, false);
        object6 = object3;
        object3 = new AdOverlayInfoParcel(zzc2, null, zzdbr2, null, versionInfoParcel, null, null);
        ((zzccn)object).zzc(object3);
        object = this.zzd;
        ((zzfgs)object).zza();
        object = ((zzdih)object2).zzg();
        return zzgft.zzh(object);
    }
}

