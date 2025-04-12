/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzn;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhcd;
import com.google.android.gms.internal.ads.zzhdh;
import com.google.android.gms.internal.ads.zzhdz;
import com.google.android.gms.internal.ads.zzher;

final class zzgzo {
    public static int zza(byte[] object, int n3, zzgzn zzgzn2) {
        n3 = zzgzo.zzh(object, n3, zzgzn2);
        int n4 = zzgzn2.zza;
        if (n4 >= 0) {
            int n7 = ((byte[])object).length - n3;
            if (n4 <= n7) {
                if (n4 == 0) {
                    object = zzhac.zzb;
                    zzgzn2.zzc = object;
                    return n3;
                }
                object = zzhac.zzv(object, n3, n4);
                zzgzn2.zzc = object;
                return n3 + n4;
            }
            throw zzhcd.zzj();
        }
        throw zzhcd.zzf();
    }

    public static int zzb(byte[] byArray, int n3) {
        int n4 = byArray[n3] & 0xFF;
        int n7 = n3 + 1;
        n7 = byArray[n7] & 0xFF;
        int n8 = n3 + 2;
        n8 = byArray[n8] & 0xFF;
        int n10 = byArray[n3 += 3] & 0xFF;
        n3 = n7 << 8 | n4;
        n4 = n8 << 16;
        return n10 << 24 | (n3 |= n4);
    }

    public static int zzc(zzhdz zzhdz2, byte[] byArray, int n3, int n4, int n7, zzgzn zzgzn2) {
        Object object = zzhdz2.zze();
        int n8 = zzgzo.zzl(object, zzhdz2, byArray, n3, n4, n7, zzgzn2);
        zzhdz2.zzf(object);
        zzgzn2.zzc = object;
        return n8;
    }

    public static int zzd(zzhdz zzhdz2, byte[] byArray, int n3, int n4, zzgzn zzgzn2) {
        Object object = zzhdz2.zze();
        int n7 = zzgzo.zzm(object, zzhdz2, byArray, n3, n4, zzgzn2);
        zzhdz2.zzf(object);
        zzgzn2.zzc = object;
        return n7;
    }

    public static int zze(zzhdz zzhdz2, int n3, byte[] byArray, int n4, int n7, zzhca zzhca2, zzgzn zzgzn2) {
        n4 = zzgzo.zzd(zzhdz2, byArray, n4, n7, zzgzn2);
        Object object = zzgzn2.zzc;
        zzhca2.add(object);
        while (n4 < n7) {
            int n8 = zzgzo.zzh(byArray, n4, zzgzn2);
            int n10 = zzgzn2.zza;
            if (n3 != n10) break;
            n4 = zzgzo.zzd(zzhdz2, byArray, n8, n7, zzgzn2);
            object = zzgzn2.zzc;
            zzhca2.add(object);
        }
        return n4;
    }

    public static int zzf(byte[] byArray, int n3, zzhca zzhca2, zzgzn zzgzn2) {
        zzhca2 = (zzhbp)zzhca2;
        n3 = zzgzo.zzh(byArray, n3, zzgzn2);
        int n4 = zzgzn2.zza + n3;
        while (n3 < n4) {
            n3 = zzgzo.zzh(byArray, n3, zzgzn2);
            int n7 = zzgzn2.zza;
            ((zzhbp)zzhca2).zzi(n7);
        }
        if (n3 == n4) {
            return n3;
        }
        throw zzhcd.zzj();
    }

    public static int zzg(int n3, byte[] object, int n4, int n7, zzher zzher2, zzgzn zzgzn2) {
        int n8 = n3 >>> 3;
        if (n8 != 0) {
            n8 = n3 & 7;
            if (n8 != 0) {
                int n10 = 1;
                if (n8 != n10) {
                    n10 = 2;
                    if (n8 != n10) {
                        n10 = 3;
                        if (n8 != n10) {
                            n7 = 5;
                            if (n8 == n7) {
                                object = zzgzo.zzb(object, n4);
                                zzher2.zzj(n3, object);
                                return n4 + 4;
                            }
                            throw zzhcd.zzc();
                        }
                        n8 = n3 & 0xFFFFFFF8 | 4;
                        zzher zzher3 = zzher.zzf();
                        n10 = 0;
                        while (n4 < n7) {
                            int n14 = zzgzo.zzh(object, n4, zzgzn2);
                            n10 = n4 = zzgzn2.zza;
                            if (n4 != n8) {
                                int n15 = zzgzo.zzg(n4, object, n14, n7, zzher3, zzgzn2);
                                n10 = n4;
                                n4 = n15;
                                continue;
                            }
                            n4 = n14;
                            break;
                        }
                        if (n4 <= n7 && n10 == n8) {
                            zzher2.zzj(n3, zzher3);
                            return n4;
                        }
                        throw zzhcd.zzg();
                    }
                    n4 = zzgzo.zzh(object, n4, zzgzn2);
                    n7 = zzgzn2.zza;
                    if (n7 >= 0) {
                        int n16 = ((byte[])object).length - n4;
                        if (n7 <= n16) {
                            if (n7 == 0) {
                                object = zzhac.zzb;
                                zzher2.zzj(n3, object);
                            } else {
                                object = zzhac.zzv(object, n4, n7);
                                zzher2.zzj(n3, object);
                            }
                            return n4 + n7;
                        }
                        throw zzhcd.zzj();
                    }
                    throw zzhcd.zzf();
                }
                object = zzgzo.zzn(object, n4);
                zzher2.zzj(n3, object);
                return n4 + 8;
            }
            int n17 = zzgzo.zzk(object, n4, zzgzn2);
            Long l2 = zzgzn2.zzb;
            zzher2.zzj(n3, l2);
            return n17;
        }
        throw zzhcd.zzc();
    }

    public static int zzh(byte[] byArray, int n3, zzgzn zzgzn2) {
        int n4 = n3 + 1;
        if ((n3 = byArray[n3]) >= 0) {
            zzgzn2.zza = n3;
            return n4;
        }
        return zzgzo.zzi(n3, byArray, n4, zzgzn2);
    }

    public static int zzi(int n3, byte[] byArray, int n4, zzgzn zzgzn2) {
        int n7 = byArray[n4];
        int n8 = n4 + 1;
        n3 &= 0x7F;
        if (n7 >= 0) {
            int n10 = n7 << 7;
            zzgzn2.zza = n3 |= n10;
            return n8;
        }
        n7 = (n7 & 0x7F) << 7;
        n3 |= n7;
        n7 = n4 + 2;
        if ((n8 = byArray[n8]) >= 0) {
            int n14 = n8 << 14;
            zzgzn2.zza = n3 |= n14;
            return n7;
        }
        n8 = (n8 & 0x7F) << 14;
        n3 |= n8;
        n8 = n4 + 3;
        if ((n7 = byArray[n7]) >= 0) {
            int n15 = n7 << 21;
            zzgzn2.zza = n3 |= n15;
            return n8;
        }
        n7 = (n7 & 0x7F) << 21;
        n3 |= n7;
        n4 += 4;
        n7 = byArray[n8];
        if (n7 >= 0) {
            int n16 = n7 << 28;
            zzgzn2.zza = n3 |= n16;
            return n4;
        }
        n7 = (n7 & 0x7F) << 28;
        n3 |= n7;
        while (true) {
            n7 = n4 + 1;
            if ((n4 = byArray[n4]) >= 0) break;
            n4 = n7;
        }
        zzgzn2.zza = n3;
        return n7;
    }

    public static int zzj(int n3, byte[] byArray, int n4, int n7, zzhca zzhca2, zzgzn zzgzn2) {
        zzhca2 = (zzhbp)zzhca2;
        n4 = zzgzo.zzh(byArray, n4, zzgzn2);
        int n8 = zzgzn2.zza;
        ((zzhbp)zzhca2).zzi(n8);
        while (n4 < n7) {
            n8 = zzgzo.zzh(byArray, n4, zzgzn2);
            int n10 = zzgzn2.zza;
            if (n3 != n10) break;
            n4 = zzgzo.zzh(byArray, n8, zzgzn2);
            n8 = zzgzn2.zza;
            ((zzhbp)zzhca2).zzi(n8);
        }
        return n4;
    }

    public static int zzk(byte[] byArray, int n3, zzgzn zzgzn2) {
        byte by2 = byArray[n3];
        long l2 = by2;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        int n4 = n3 + 1;
        if (l4 >= 0) {
            zzgzn2.zzb = l2;
            return n4;
        }
        n3 += 2;
        n4 = byArray[n4];
        int n7 = n4 & 0x7F;
        long l7 = 127;
        l2 &= l7;
        long l8 = n7;
        int n8 = 7;
        l2 |= (l8 <<= n8);
        n7 = 7;
        while (n4 < 0) {
            n4 = n3 + 1;
            n3 = byArray[n3];
            l4 = n3 & 0x7F;
            long l12 = (long)l4 << (n7 += n8);
            l2 |= l12;
            int n10 = n4;
            n4 = n3;
            n3 = n10;
        }
        zzgzn2.zzb = l2;
        return n3;
    }

    public static int zzl(Object object, zzhdz zzhdz2, byte[] byArray, int n3, int n4, int n7, zzgzn zzgzn2) {
        int n8 = ((zzhdh)zzhdz2).zzc(object, byArray, n3, n4, n7, zzgzn2);
        zzgzn2.zzc = object;
        return n8;
    }

    public static int zzm(Object object, zzhdz zzhdz2, byte[] byArray, int n3, int n4, zzgzn zzgzn2) {
        int n7 = n3 + 1;
        if ((n3 = byArray[n3]) < 0) {
            n7 = zzgzo.zzi(n3, byArray, n7, zzgzn2);
            n3 = zzgzn2.zza;
        }
        if (n3 >= 0 && n3 <= (n4 -= n7)) {
            zzhdz2.zzi(object, byArray, n7, n3 += n7, zzgzn2);
            zzgzn2.zzc = object;
            return n3;
        }
        throw zzhcd.zzj();
    }

    public static long zzn(byte[] byArray, int n3) {
        long l2 = byArray[n3];
        int n4 = n3 + 1;
        long l3 = byArray[n4];
        int n7 = n3 + 2;
        long l4 = byArray[n7];
        int n8 = n3 + 3;
        long l7 = byArray[n8];
        int n10 = n3 + 4;
        long l8 = byArray[n10];
        int n14 = n3 + 5;
        long l12 = byArray[n14];
        int n15 = n3 + 6;
        long l14 = byArray[n15];
        int n16 = n3 + 7;
        long l15 = byArray[n16];
        long l16 = 255L;
        l3 &= l16;
        l4 &= l16;
        l7 &= l16;
        l8 &= l16;
        l12 &= l16;
        l14 &= l16;
        l15 &= l16;
        l2 &= l16;
        l2 |= (l3 <<= 8);
        l3 = l4 << 16;
        l2 |= l3;
        l3 = l7 << 24;
        l2 |= l3;
        l3 = l8 << 32;
        l2 |= l3;
        l3 = l12 << 40;
        l2 |= l3;
        l3 = l14 << 48;
        l2 |= l3;
        l3 = l15 << 56;
        return l2 | l3;
    }
}

