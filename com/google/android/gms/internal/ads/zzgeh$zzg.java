/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgeh;
import com.google.android.gms.internal.ads.zzgeh$zza;
import com.google.android.gms.internal.ads.zzgeh$zzd;
import com.google.android.gms.internal.ads.zzgeh$zzk;
import com.google.android.gms.internal.ads.zzgej;

final class zzgeh$zzg
extends zzgeh$zza {
    private zzgeh$zzg() {
        throw null;
    }

    public /* synthetic */ zzgeh$zzg(zzgej zzgej2) {
        super(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzgeh$zzd zza(zzgeh zzgeh2, zzgeh$zzd zzgeh$zzd) {
        synchronized (zzgeh2) {
            Throwable throwable2;
            block5: {
                zzgeh$zzd zzgeh$zzd2;
                block4: {
                    try {
                        zzgeh$zzd2 = zzgeh.zzh(zzgeh2);
                        if (zzgeh$zzd2 == zzgeh$zzd) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    zzgeh.zzm(zzgeh2, zzgeh$zzd);
                }
                return zzgeh$zzd2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzgeh$zzk zzb(zzgeh zzgeh2, zzgeh$zzk zzgeh$zzk) {
        synchronized (zzgeh2) {
            Throwable throwable2;
            block5: {
                zzgeh$zzk zzgeh$zzk2;
                block4: {
                    try {
                        zzgeh$zzk2 = zzgeh.zzi(zzgeh2);
                        if (zzgeh$zzk2 == zzgeh$zzk) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    zzgeh.zzo(zzgeh2, zzgeh$zzk);
                }
                return zzgeh$zzk2;
            }
            throw throwable2;
        }
    }

    public final void zzc(zzgeh$zzk zzgeh$zzk, zzgeh$zzk zzgeh$zzk2) {
        zzgeh$zzk.next = zzgeh$zzk2;
    }

    public final void zzd(zzgeh$zzk zzgeh$zzk, Thread thread2) {
        zzgeh$zzk.thread = thread2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zze(zzgeh zzgeh2, zzgeh$zzd zzgeh$zzd, zzgeh$zzd zzgeh$zzd2) {
        synchronized (zzgeh2) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        zzgeh$zzd zzgeh$zzd3 = zzgeh.zzh(zzgeh2);
                        if (zzgeh$zzd3 != zzgeh$zzd) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    zzgeh.zzm(zzgeh2, zzgeh$zzd2);
                    return true;
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzf(zzgeh zzgeh2, Object object, Object object2) {
        synchronized (zzgeh2) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object3 = zzgeh.zzj(zzgeh2);
                        if (object3 != object) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    zzgeh.zzn(zzgeh2, object2);
                    return true;
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzg(zzgeh zzgeh2, zzgeh$zzk zzgeh$zzk, zzgeh$zzk zzgeh$zzk2) {
        synchronized (zzgeh2) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        zzgeh$zzk zzgeh$zzk3 = zzgeh.zzi(zzgeh2);
                        if (zzgeh$zzk3 != zzgeh$zzk) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    zzgeh.zzo(zzgeh2, zzgeh$zzk2);
                    return true;
                }
                return false;
            }
            throw throwable2;
        }
    }
}

