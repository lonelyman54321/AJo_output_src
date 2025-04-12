/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzgn;
import com.google.android.gms.internal.gtm.zzgp;
import com.google.android.gms.internal.gtm.zzhd;
import com.google.android.gms.internal.gtm.zzjb;

final class zziy
implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzhd zzd;
    final /* synthetic */ zzjb zze;

    public zziy(zzjb zzjb2, String string2, String string3, String string4, zzhd zzhd2) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = string4;
        this.zzd = zzhd2;
        this.zze = zzjb2;
    }

    public final void run() {
        RemoteException remoteException2;
        Object object;
        block21: {
            block20: {
                Object object2;
                boolean bl2;
                Object object3;
                block19: {
                    object3 = this.zze;
                    object3 = zzjb.zzj((zzjb)object3);
                    object = this.zza;
                    boolean bl3 = object3.containsKey(object);
                    bl2 = true;
                    if (bl3) break block19;
                    object3 = this.zze;
                    object3 = zzjb.zzd((zzjb)object3);
                    object2 = this.zza;
                    String string2 = this.zzb;
                    String string3 = this.zzc;
                    object3 = ((zzgn)object3).zza((String)object2, string2, string3);
                    object2 = this.zze;
                    object2 = zzjb.zzj((zzjb)object2);
                    string2 = this.zza;
                    try {
                        object2.put(string2, object3);
                    }
                    catch (Exception exception) {
                        object = zzjb.zzc(this.zze);
                        object2 = "Fail to load container: ";
                        zzgp.zzb((String)object2, exception, object);
                        bl2 = false;
                        object = null;
                    }
                }
                try {
                    object3 = this.zzd;
                    if (object3 == null) break block20;
                }
                catch (RemoteException remoteException2) {}
                object2 = this.zza;
                object3.zze(bl2, (String)object2);
                return;
                break block21;
            }
            return;
        }
        object = zzjb.zzc(this.zze);
        zzgp.zzb("Error relaying callback: ", remoteException2, object);
    }
}

