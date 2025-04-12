/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.view.ViewGroup
 *  android.view.Window
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzeva;
import com.google.android.gms.internal.ads.zzevc;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;

public final class zzevb
implements zzexw {
    private final zzgge zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzevb(zzgge zzgge2, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzgge2;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    public final int zza() {
        return 22;
    }

    public final ListenableFuture zzb() {
        zzeva zzeva2 = new zzeva(this);
        return this.zza.zzb(zzeva2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ zzevc zzc() {
        int n3;
        Object object;
        block10: {
            Object object2 = zzbep.zzgb;
            object = zzba.zzc();
            object2 = (Boolean)((zzben)object).zza((zzbeg)object2);
            int n4 = ((Boolean)object2).booleanValue();
            if (n4 != 0 && (object2 = this.zzb) != null && (n4 = (object2 = this.zzd).contains(object = "banner")) != 0) {
                object2 = this.zzb;
                object2 = object2.isHardwareAccelerated();
                return new zzevc((Boolean)object2);
            }
            object2 = zzbep.zzgc;
            object2 = (Boolean)zzba.zzc().zza((zzbeg)object2);
            n4 = ((Boolean)object2).booleanValue();
            object = null;
            if (n4 == 0) return new zzevc(null);
            object2 = this.zzd;
            String string2 = "native";
            n4 = object2.contains(string2);
            if (n4 == 0) return new zzevc(null);
            object2 = this.zzc;
            boolean bl2 = object2 instanceof Activity;
            if (!bl2) return new zzevc(null);
            Window window = (object2 = (Activity)object2).getWindow();
            if (window != null) {
                window = window.getAttributes();
                int n7 = window.flags;
                n3 = 0x1000000;
                if ((n7 &= n3) != 0) {
                    object = Boolean.TRUE;
                    return new zzevc((Boolean)object);
                }
            }
            try {
                window = object2.getPackageManager();
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                return new zzevc((Boolean)object);
            }
            object2 = object2.getComponentName();
            n3 = 0;
            object2 = window.getActivityInfo((ComponentName)object2, 0);
            n4 = ((ActivityInfo)object2).flags & 0x200;
            if (n4 == 0) break block10;
            n3 = 1;
        }
        object = n3 != 0;
        return new zzevc((Boolean)object);
    }
}

