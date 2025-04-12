/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzfz;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzp;

final class zznf
implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzp zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzag zzd;
    private final /* synthetic */ zzag zze;
    private final /* synthetic */ zzme zzf;

    public zznf(zzme zzme2, boolean bl2, zzp zzp2, boolean bl3, zzag zzag2, zzag zzag3) {
        this.zza = true;
        this.zzb = zzp2;
        this.zzc = bl3;
        this.zzd = zzag2;
        this.zze = zzag3;
        this.zzf = zzme2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block8: {
            RemoteException remoteException2;
            block9: {
                zzfz zzfz2 = zzme.zza(this.zzf);
                if (zzfz2 == null) {
                    this.zzf.zzj().zzg().zza("Discarding data. Failed to send conditional user property to service");
                    return;
                }
                boolean bl2 = this.zza;
                if (bl2) {
                    zzag zzag2;
                    Preconditions.checkNotNull(this.zzb);
                    zzme zzme2 = this.zzf;
                    boolean bl3 = this.zzc;
                    if (bl3) {
                        bl3 = false;
                        zzag2 = null;
                    } else {
                        zzag2 = this.zzd;
                    }
                    zzp zzp2 = this.zzb;
                    zzme2.zza(zzfz2, zzag2, zzp2);
                } else {
                    Object object;
                    block7: {
                        try {
                            object = this.zze;
                            object = ((zzag)object).zza;
                            bl2 = TextUtils.isEmpty((CharSequence)object);
                            if (!bl2) break block7;
                            object = this.zzb;
                            Preconditions.checkNotNull(object);
                            object = this.zzd;
                            zzp zzp3 = this.zzb;
                            zzfz2.zza((zzag)object, zzp3);
                            break block8;
                        }
                        catch (RemoteException remoteException2) {
                            break block9;
                        }
                    }
                    object = this.zzd;
                    zzfz2.zza((zzag)object);
                }
                break block8;
            }
            zzgq zzgq2 = this.zzf.zzj().zzg();
            String string2 = "Failed to send conditional user property to the service";
            zzgq2.zza(string2, (Object)remoteException2);
        }
        zzme.zzg(this.zzf);
    }
}

