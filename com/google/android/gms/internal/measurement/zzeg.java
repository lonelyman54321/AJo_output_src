/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzdz;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.internal.measurement.zzed$zzb;
import com.google.android.gms.measurement.internal.zzhw;

final class zzeg
extends zzed$zzb {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Context zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ zzed zzg;

    public zzeg(zzed zzed2, String string2, String string3, Context context, Bundle bundle) {
        this.zzc = string2;
        this.zzd = string3;
        this.zze = context;
        this.zzf = bundle;
        this.zzg = zzed2;
        super(zzed2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Exception exception2;
        boolean bl2;
        block5: {
            Object object;
            String string2;
            Object object2;
            int n3;
            Object object3;
            Object object4;
            Object object5;
            block4: {
                block3: {
                    object5 = "com.google.android.gms.measurement.dynamite";
                    bl2 = true;
                    try {
                        object4 = this.zzg;
                        object3 = this.zzc;
                        Object object6 = this.zzd;
                        n3 = zzed.zza((zzed)object4, (String)object3, (String)object6);
                        if (n3 == 0) break block3;
                        object4 = this.zzd;
                        object3 = this.zzc;
                        object6 = this.zzg;
                        object6 = zzed.zzb((zzed)object6);
                        object2 = object4;
                        string2 = object3;
                        object = object6;
                        break block4;
                    }
                    catch (Exception exception2) {
                        break block5;
                    }
                }
                n3 = 0;
                object4 = null;
                object = null;
                string2 = null;
                object2 = null;
            }
            object4 = this.zze;
            Preconditions.checkNotNull(object4);
            object4 = this.zzg;
            object3 = this.zze;
            object3 = ((zzed)object4).zza((Context)object3, bl2);
            zzed.zza((zzed)object4, (zzdl)object3);
            object4 = this.zzg;
            object4 = zzed.zza((zzed)object4);
            if (object4 == null) {
                object5 = this.zzg;
                zzed.zzb((zzed)object5);
                return;
            }
            object4 = this.zze;
            n3 = DynamiteModule.getLocalVersion((Context)object4, (String)object5);
            object3 = this.zze;
            int n4 = DynamiteModule.getRemoteVersion((Context)object3, (String)object5);
            int n7 = Math.max(n3, n4);
            boolean bl3 = n4 < n3;
            long l2 = n7;
            Bundle bundle = this.zzf;
            object4 = this.zze;
            String string3 = zzhw.zza((Context)object4);
            long l3 = 114010L;
            object3 = object5;
            object5 = new zzdz(l3, l2, bl3, (String)object, string2, (String)object2, bundle, string3);
            object4 = this.zzg;
            object4 = zzed.zza((zzed)object4);
            object4 = Preconditions.checkNotNull(object4);
            object4 = (zzdl)object4;
            object3 = this.zze;
            object3 = ObjectWrapper.wrap(object3);
            l3 = this.zza;
            object4.initialize((IObjectWrapper)object3, (zzdz)object5, l3);
            return;
        }
        zzed.zza(this.zzg, exception2, bl2, false);
    }
}

