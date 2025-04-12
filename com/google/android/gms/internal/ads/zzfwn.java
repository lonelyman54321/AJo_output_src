/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ads.zzfwe;
import com.google.android.gms.internal.ads.zzfwi;
import com.google.android.gms.internal.ads.zzfwj;
import com.google.android.gms.internal.ads.zzfwk;
import com.google.android.gms.internal.ads.zzfwl;
import com.google.android.gms.internal.ads.zzfwp;
import com.google.android.gms.internal.ads.zzfwq;
import com.google.android.gms.internal.ads.zzfwr;
import com.google.android.gms.internal.ads.zzfws;
import com.google.android.gms.internal.ads.zzfwu;
import com.google.android.gms.internal.ads.zzfwv;
import com.google.android.gms.internal.ads.zzfxg;
import com.google.android.gms.internal.ads.zzfxj;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzfwn {
    private static final zzfwv zzb;
    private static final Intent zzc;
    final zzfxg zza;
    private final String zzd;

    static {
        zzfwv zzfwv2;
        zzb = zzfwv2 = new zzfwv("OverlayDisplayService");
        zzfwv2 = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE");
        zzc = zzfwv2.setPackage("com.android.vending");
    }

    public zzfwn(Context object) {
        boolean bl2 = zzfxj.zza(object);
        if (bl2) {
            zzfxg zzfxg2;
            Context context = object.getApplicationContext();
            zzfwv zzfwv2 = zzb;
            Intent intent = zzc;
            zzfwi zzfwi2 = new zzfwi();
            String string2 = "OverlayDisplayService";
            this.zza = zzfxg2 = new zzfxg(context, zzfwv2, string2, intent, zzfwi2, null);
        } else {
            bl2 = false;
            Object var3_4 = null;
            this.zza = null;
        }
        object = object.getPackageName();
        this.zzd = object;
    }

    public static /* bridge */ /* synthetic */ zzfwv zza() {
        return zzb;
    }

    public static /* bridge */ /* synthetic */ String zzb(zzfwn zzfwn2) {
        return zzfwn2.zzd;
    }

    public final void zzc() {
        Object object = this.zza;
        if (object == null) {
            return;
        }
        object = zzb;
        Object[] objectArray = new Object[]{};
        ((zzfwv)object).zzc("unbind LMD display overlay service", objectArray);
        this.zza.zzu();
    }

    public final void zzd(zzfwe object, zzfws objectArray) {
        Object object2 = this.zza;
        if (object2 == null) {
            object = zzb;
            objectArray = new Object[]{"Play Store not found."};
            ((zzfwv)object).zza("error: %s", objectArray);
            return;
        }
        object2 = new TaskCompletionSource();
        zzfxg zzfxg2 = this.zza;
        zzfwk zzfwk2 = new zzfwk(this, (TaskCompletionSource)object2, (zzfwe)object, (zzfws)objectArray, (TaskCompletionSource)object2);
        zzfxg2.zzs(zzfwk2, (TaskCompletionSource)object2);
    }

    public final void zze(zzfwp object, zzfws objectArray) {
        zzfwj zzfwj2;
        Object object2 = null;
        Object object3 = this.zza;
        if (object3 == null) {
            object = zzb;
            objectArray = new Object[]{"Play Store not found."};
            ((zzfwv)object).zza("error: %s", objectArray);
            return;
        }
        object3 = ((zzfwp)object).zzh();
        if (object3 == null) {
            object = zzb;
            object2 = new Object[]{};
            ((zzfwv)object).zza("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", object2);
            object = zzfwr.zzc();
            ((zzfwq)object).zzb(8160);
            object = ((zzfwq)object).zzc();
            objectArray.zza((zzfwr)object);
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzfxg zzfxg2 = this.zza;
        object2 = zzfwj2;
        object3 = this;
        zzfwj2 = new zzfwj(this, taskCompletionSource, (zzfwp)object, (zzfws)objectArray, taskCompletionSource);
        zzfxg2.zzs(zzfwj2, taskCompletionSource);
    }

    public final void zzf(zzfwu object, zzfws objectArray, int n3) {
        zzfwl zzfwl2;
        Object object2 = this.zza;
        if (object2 == null) {
            object = zzb;
            objectArray = new Object[]{"Play Store not found."};
            ((zzfwv)object).zza("error: %s", objectArray);
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zzfxg zzfxg2 = this.zza;
        object2 = zzfwl2;
        zzfwl2 = new zzfwl(this, taskCompletionSource, (zzfwu)object, n3, (zzfws)objectArray, taskCompletionSource);
        zzfxg2.zzs(zzfwl2, taskCompletionSource);
    }
}

