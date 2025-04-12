/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzehr;
import com.google.android.gms.internal.ads.zzelv;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhb;
import com.google.android.gms.internal.ads.zzfhc;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;

public final class zzelw
implements zzehr {
    private final Context zza;
    private final zzdrm zzb;

    public zzelw(Context context, zzdrm zzdrm2) {
        this.zza = context;
        this.zzb = zzdrm2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(zzfhf object, zzfgt zzfgt2, zzeho zzeho2) {
        RemoteException remoteException2;
        block3: {
            Object object2;
            try {
                object2 = zzeho2.zzb;
                object2 = (zzbte)object2;
                String string2 = zzfgt2.zzaa;
                object2.zzq(string2);
                object2 = ((zzfhf)object).zza;
                object2 = ((zzfhc)object2).zza;
                object2 = ((zzfho)object2).zzo;
                int n3 = ((zzfhb)object2).zza;
                int n4 = 3;
                if (n3 == n4) {
                    Object object3 = object2 = zzeho2.zzb;
                    object3 = (zzbte)object2;
                    String string3 = zzfgt2.zzV;
                    zzfgt2 = zzfgt2.zzw;
                    String string4 = zzfgt2.toString();
                    object = ((zzfhf)object).zza;
                    object = ((zzfhc)object).zza;
                    zzl zzl2 = ((zzfho)object).zzd;
                    object = this.zza;
                    IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(object);
                    zzelv zzelv2 = new zzelv(this, zzeho2, null);
                    Object object4 = object = zzeho2.zzc;
                    object4 = (zzbrl)object;
                    object3.zzo(string3, string4, zzl2, iObjectWrapper, zzelv2, (zzbrl)object4);
                    return;
                }
            }
            catch (RemoteException remoteException2) {
                break block3;
            }
            Object object5 = object2 = zzeho2.zzb;
            object5 = (zzbte)object2;
            String string5 = zzfgt2.zzV;
            zzfgt2 = zzfgt2.zzw;
            String string6 = zzfgt2.toString();
            object = ((zzfhf)object).zza;
            object = ((zzfhc)object).zza;
            zzl zzl3 = ((zzfho)object).zzd;
            object = this.zza;
            IObjectWrapper iObjectWrapper = ObjectWrapper.wrap(object);
            zzelv zzelv3 = new zzelv(this, zzeho2, null);
            Object object6 = object = zzeho2.zzc;
            object6 = (zzbrl)object;
            object5.zzp(string5, string6, zzl3, iObjectWrapper, zzelv3, (zzbrl)object6);
            return;
        }
        zze.zzb("Remote exception loading a rewarded RTB ad", remoteException2);
    }
}

