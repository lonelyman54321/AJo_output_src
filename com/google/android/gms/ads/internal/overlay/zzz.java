/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zza;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbvf;

public final class zzz
extends zzbvf {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private boolean zzc = false;
    private boolean zzd = false;
    private boolean zze = false;

    public zzz(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzb() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                block4: {
                    try {
                        bl2 = this.zzd;
                        if (bl2) {
                            return;
                        }
                        Object object = this.zza;
                        object = ((AdOverlayInfoParcel)object).zzc;
                        if (object == null) break block4;
                        int n3 = 4;
                        object.zzdu(n3);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                this.zzd = bl2 = true;
                return;
            }
            throw throwable2;
        }
    }

    public final boolean zzH() {
        return false;
    }

    public final void zzh(int n3, int n4, Intent intent) {
    }

    public final void zzi() {
    }

    public final void zzk(IObjectWrapper iObjectWrapper) {
    }

    public final void zzl(Bundle object) {
        boolean bl2;
        Object object2;
        boolean bl3;
        Object object3 = zzbep.zziS;
        Object object4 = zzba.zzc();
        object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
        boolean bl4 = (Boolean)object3;
        boolean bl5 = true;
        if (bl4 && !(bl4 = this.zze)) {
            object3 = this.zzb;
            object3.requestWindowFeature((int)(bl5 ? 1 : 0));
        }
        bl4 = false;
        object3 = null;
        if (object != null && (bl3 = object.getBoolean((String)(object2 = "com.google.android.gms.ads.internal.overlay.hasResumed"), false))) {
            bl4 = true;
        }
        if ((object2 = this.zza) == null) {
            this.zzb.finish();
            return;
        }
        if (bl4) {
            this.zzb.finish();
            return;
        }
        if (object == null) {
            object = ((AdOverlayInfoParcel)object2).zzb;
            if (object != null) {
                object.onAdClicked();
            }
            if ((object = this.zza.zzu) != null) {
                object.zzdG();
            }
            if ((object = this.zzb.getIntent()) != null && (bl2 = (object = this.zzb.getIntent()).getBooleanExtra((String)(object3 = "shouldCallOnOverlayOpened"), bl5)) && (object = this.zza.zzc) != null) {
                object.zzdr();
            }
        }
        object = this.zzb;
        object3 = this.zza;
        zzu.zzh();
        object4 = ((AdOverlayInfoParcel)object3).zza;
        object3 = ((AdOverlayInfoParcel)object3).zzi;
        object2 = ((zzc)object4).zzi;
        bl2 = com.google.android.gms.ads.internal.overlay.zza.zzb((Context)object, (zzc)object4, (zzaa)object3, (zzy)object2);
        if (!bl2) {
            object = this.zzb;
            object.finish();
        }
    }

    public final void zzm() {
        Activity activity = this.zzb;
        boolean bl2 = activity.isFinishing();
        if (bl2) {
            this.zzb();
        }
    }

    public final void zzo() {
        boolean bl2;
        zzp zzp2 = this.zza.zzc;
        if (zzp2 != null) {
            zzp2.zzdk();
        }
        if (bl2 = (zzp2 = this.zzb).isFinishing()) {
            this.zzb();
        }
    }

    public final void zzp(int n3, String[] stringArray, int[] nArray) {
    }

    public final void zzq() {
    }

    public final void zzr() {
        boolean bl2 = this.zzc;
        if (bl2) {
            this.zzb.finish();
            return;
        }
        this.zzc = bl2 = true;
        zzp zzp2 = this.zza.zzc;
        if (zzp2 != null) {
            zzp2.zzdH();
        }
    }

    public final void zzs(Bundle bundle) {
        boolean bl2 = this.zzc;
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", bl2);
    }

    public final void zzt() {
    }

    public final void zzu() {
        Activity activity = this.zzb;
        boolean bl2 = activity.isFinishing();
        if (bl2) {
            this.zzb();
        }
    }

    public final void zzv() {
        zzp zzp2 = this.zza.zzc;
        if (zzp2 != null) {
            zzp2.zzdt();
        }
    }

    public final void zzx() {
        this.zze = true;
    }
}

