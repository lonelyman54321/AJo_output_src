/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzbzl;

public final class zzbzm {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final zzbza zza(Context object, String object2, zzbrf zzbrf2) {
        void var0_3;
        block5: {
            IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(object);
            Object object3 = null;
            String string2 = "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl";
            try {
                zzbzl zzbzl2 = new zzbzl();
                object = zzq.zzb((Context)object, string2, zzbzl2);
                object = (zzbze)object;
                int n3 = 241806000;
                object = ((zzbze)object).zze(iObjectWrapper, (String)object2, zzbrf2, n3);
                if (object == null) {
                    return object3;
                }
                object2 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd";
            }
            catch (RemoteException remoteException) {
                break block5;
            }
            catch (zzp zzp2) {
                break block5;
            }
            boolean bl2 = (object2 = object.queryLocalInterface((String)object2)) instanceof zzbza;
            if (!bl2) return new zzbyy((IBinder)object);
            object2 = (zzbza)object2;
            return object2;
        }
        zzm.zzl("#007 Could not call remote method.", (Throwable)var0_3);
        return null;
    }
}

