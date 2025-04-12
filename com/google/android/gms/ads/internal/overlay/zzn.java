/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 */
package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zza;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.PlatformVersion;

public final class zzn {
    public static final void zza(Context object, AdOverlayInfoParcel object2, boolean bl2) {
        Object object3;
        int n3 = ((AdOverlayInfoParcel)object2).zzk;
        int n4 = 4;
        if (n3 == n4 && (object3 = ((AdOverlayInfoParcel)object2).zzc) == null) {
            Object object4 = ((AdOverlayInfoParcel)object2).zzb;
            if (object4 != null) {
                object4.onAdClicked();
            }
            if ((object4 = ((AdOverlayInfoParcel)object2).zzu) != null) {
                object4.zzdG();
            }
            object4 = ((AdOverlayInfoParcel)object2).zzd.zzi();
            object3 = ((AdOverlayInfoParcel)object2).zza;
            if (object3 != null && (n3 = object3.zzj) != 0 && object4 != null) {
                object = object4;
            }
            zzu.zzh();
            object4 = ((AdOverlayInfoParcel)object2).zza;
            object2 = ((AdOverlayInfoParcel)object2).zzi;
            if (object4 != null) {
                object3 = ((zzc)object4).zzi;
            } else {
                n3 = 0;
                object3 = null;
            }
            zza.zzb(object, (zzc)object4, (zzaa)object2, (zzy)object3);
            return;
        }
        object3 = new Intent();
        object3.setClassName(object, "com.google.android.gms.ads.AdActivity");
        n4 = (int)(((AdOverlayInfoParcel)object2).zzm.isClientJar ? 1 : 0);
        String string2 = "com.google.android.gms.ads.internal.overlay.useClientJar";
        object3.putExtra(string2, n4 != 0);
        object3.putExtra("shouldCallOnOverlayOpened", bl2);
        n4 = 1;
        Bundle bundle = new Bundle(n4);
        String string3 = "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo";
        bundle.putParcelable(string3, (Parcelable)object2);
        object3.putExtra(string3, bundle);
        int n7 = PlatformVersion.isAtLeastLollipop();
        if (n7 == 0) {
            n7 = 524288;
            object3.addFlags(n7);
        }
        if ((n7 = object instanceof Activity) == 0) {
            n7 = 0x10000000;
            object3.addFlags(n7);
        }
        zzu.zzp();
        zzt.zzT(object, object3);
    }
}

