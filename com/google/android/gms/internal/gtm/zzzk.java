/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacj;
import com.google.android.gms.internal.gtm.zzzl;

final class zzzk
implements zzacj {
    static final zzacj zza;

    static {
        zzzk zzzk2 = new zzzk();
        zza = zzzk2;
    }

    private zzzk() {
    }

    public final boolean zza(int n3) {
        zzzl zzzl2;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                int n7 = 2;
                if (n3 != n7) {
                    n7 = 900;
                    if (n3 != n7) {
                        n7 = -1 >>> 1;
                        if (n3 != n7) {
                            block0 : switch (n3) {
                                default: {
                                    switch (n3) {
                                        default: {
                                            n3 = 0;
                                            zzzl2 = null;
                                            break block0;
                                        }
                                        case 99999: {
                                            zzzl2 = zzzl.zzk;
                                            break block0;
                                        }
                                        case 99998: {
                                            zzzl2 = zzzl.zzj;
                                            break block0;
                                        }
                                        case 99997: 
                                    }
                                    zzzl2 = zzzl.zzi;
                                    break;
                                }
                                case 1001: {
                                    zzzl2 = zzzl.zzf;
                                    break;
                                }
                                case 1000: {
                                    zzzl2 = zzzl.zze;
                                    break;
                                }
                                case 999: {
                                    zzzl2 = zzzl.zzd;
                                    break;
                                }
                                case 998: {
                                    zzzl2 = zzzl.zzc;
                                    break;
                                }
                            }
                        } else {
                            zzzl2 = zzzl.zzl;
                        }
                    } else {
                        zzzl2 = zzzl.zzb;
                    }
                } else {
                    zzzl2 = zzzl.zzh;
                }
            } else {
                zzzl2 = zzzl.zzg;
            }
        } else {
            zzzl2 = zzzl.zza;
        }
        if (zzzl2 != null) {
            return n4;
        }
        return false;
    }
}

