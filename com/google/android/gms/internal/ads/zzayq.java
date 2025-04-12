/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.provider.Settings$SettingNotFoundException
 */
package com.google.android.gms.internal.ads;

import android.provider.Settings;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzayq
extends zzazs {
    public zzayq(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4) {
        super(zzaye2, "d7YRusR2mxxBt1bBYjK2gXVvJl/MfqFw2IiZZVeFOFqksQBErGXLOKgf56kYtWpK", "q4VBjxb/Ij/RcUKEcmQK+TpC64QFNLpq6sfIawaWN1g=", zzatp2, n3, 49);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        InvocationTargetException invocationTargetException2;
        Object object;
        block3: {
            Object object2 = this.zze;
            object = zzavc.zzc;
            ((zzatp)object2).zzf((zzavc)object);
            try {
                object2 = this.zzf;
                object = this.zzb;
                object = ((zzaye)object).zzb();
                int n3 = 1;
                Object[] objectArray = new Object[n3];
                objectArray[0] = object;
                boolean bl2 = false;
                object = null;
                object2 = ((Method)object2).invoke(null, objectArray);
                object2 = (Boolean)object2;
                boolean bl3 = (Boolean)object2;
                object = this.zze;
                object2 = bl3 ? zzavc.zzb : zzavc.zza;
            }
            catch (InvocationTargetException invocationTargetException2) {
                break block3;
            }
            ((zzatp)object).zzf((zzavc)object2);
            return;
        }
        object = invocationTargetException2.getTargetException();
        boolean bl4 = object instanceof Settings.SettingNotFoundException;
        if (bl4) {
            return;
        }
        throw invocationTargetException2;
    }
}

