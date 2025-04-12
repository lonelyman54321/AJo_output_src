/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzds;
import com.google.android.gms.internal.auth.zzee;
import com.google.android.gms.internal.auth.zzev;
import com.google.android.gms.internal.auth.zzey;
import com.google.android.gms.internal.auth.zzez;
import com.google.android.gms.internal.auth.zzfa;
import com.google.android.gms.internal.auth.zzfz;
import com.google.android.gms.internal.auth.zzgh;
import com.google.android.gms.internal.auth.zzgz;
import com.google.android.gms.internal.auth.zzhm;
import java.nio.charset.Charset;

final class zzdt {
    public static int zza(byte[] object, int n3, zzds zzds2) {
        n3 = zzdt.zzj(object, n3, zzds2);
        int n4 = zzds2.zza;
        if (n4 >= 0) {
            int n7 = ((byte[])object).length - n3;
            if (n4 <= n7) {
                if (n4 == 0) {
                    object = zzee.zzb;
                    zzds2.zzc = object;
                    return n3;
                }
                object = zzee.zzk(object, n3, n4);
                zzds2.zzc = object;
                return n3 + n4;
            }
            throw zzfa.zzf();
        }
        throw zzfa.zzc();
    }

    public static int zzb(byte[] byArray, int n3) {
        int n4 = byArray[n3] & 0xFF;
        int n7 = n3 + 1;
        n7 = (byArray[n7] & 0xFF) << 8;
        n4 |= n7;
        n7 = n3 + 2;
        n7 = (byArray[n7] & 0xFF) << 16;
        return (byArray[n3 += 3] & 0xFF) << 24 | (n4 |= n7);
    }

    public static int zzc(zzgh zzgh2, byte[] byArray, int n3, int n4, int n7, zzds zzds2) {
        zzgh2 = (zzfz)zzgh2;
        Object object = ((zzfz)zzgh2).zzd();
        int n8 = ((zzfz)zzgh2).zzb(object, byArray, n3, n4, n7, zzds2);
        ((zzfz)zzgh2).zze(object);
        zzds2.zzc = object;
        return n8;
    }

    public static int zzd(zzgh zzgh2, byte[] byArray, int n3, int n4, zzds zzds2) {
        int n7 = n3 + 1;
        if ((n3 = byArray[n3]) < 0) {
            n7 = zzdt.zzk(n3, byArray, n7, zzds2);
            n3 = zzds2.zza;
        }
        if (n3 >= 0 && n3 <= (n4 -= n7)) {
            Object object = zzgh2.zzd();
            zzgh2.zzg(object, byArray, n7, n3 += n7, zzds2);
            zzgh2.zze(object);
            zzds2.zzc = object;
            return n3;
        }
        throw zzfa.zzf();
    }

    public static int zze(zzgh zzgh2, int n3, byte[] byArray, int n4, int n7, zzey zzey2, zzds zzds2) {
        n4 = zzdt.zzd(zzgh2, byArray, n4, n7, zzds2);
        Object object = zzds2.zzc;
        zzey2.add(object);
        while (n4 < n7) {
            int n8 = zzdt.zzj(byArray, n4, zzds2);
            int n10 = zzds2.zza;
            if (n3 != n10) break;
            n4 = zzdt.zzd(zzgh2, byArray, n8, n7, zzds2);
            object = zzds2.zzc;
            zzey2.add(object);
        }
        return n4;
    }

    public static int zzf(byte[] byArray, int n3, zzey zzey2, zzds zzds2) {
        zzey2 = (zzev)zzey2;
        n3 = zzdt.zzj(byArray, n3, zzds2);
        int n4 = zzds2.zza + n3;
        while (n3 < n4) {
            n3 = zzdt.zzj(byArray, n3, zzds2);
            int n7 = zzds2.zza;
            ((zzev)zzey2).zze(n7);
        }
        if (n3 == n4) {
            return n3;
        }
        throw zzfa.zzf();
    }

    public static int zzg(byte[] byArray, int n3, zzds zzds2) {
        n3 = zzdt.zzj(byArray, n3, zzds2);
        int n4 = zzds2.zza;
        if (n4 >= 0) {
            if (n4 == 0) {
                zzds2.zzc = "";
                return n3;
            }
            Charset charset = zzez.zzb;
            String string2 = new String(byArray, n3, n4, charset);
            zzds2.zzc = string2;
            return n3 + n4;
        }
        throw zzfa.zzc();
    }

    public static int zzh(byte[] object, int n3, zzds zzds2) {
        n3 = zzdt.zzj(object, n3, zzds2);
        int n4 = zzds2.zza;
        if (n4 >= 0) {
            if (n4 == 0) {
                zzds2.zzc = "";
                return n3;
            }
            object = zzhm.zzb(object, n3, n4);
            zzds2.zzc = object;
            return n3 + n4;
        }
        throw zzfa.zzc();
    }

    public static int zzi(int n3, byte[] object, int n4, int n7, zzgz zzgz2, zzds zzds2) {
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
                                object = zzdt.zzb(object, n4);
                                zzgz2.zzf(n3, object);
                                return n4 + 4;
                            }
                            throw zzfa.zza();
                        }
                        n8 = n3 & 0xFFFFFFF8 | 4;
                        zzgz zzgz3 = zzgz.zzc();
                        n10 = 0;
                        while (n4 < n7) {
                            int n14 = zzdt.zzj(object, n4, zzds2);
                            n4 = zzds2.zza;
                            if (n4 == n8) {
                                n10 = n4;
                                n4 = n14;
                                break;
                            }
                            n10 = n4;
                            int n15 = zzdt.zzi(n4, object, n14, n7, zzgz3, zzds2);
                            n10 = n4;
                            n4 = n15;
                        }
                        if (n4 <= n7 && n10 == n8) {
                            zzgz2.zzf(n3, zzgz3);
                            return n4;
                        }
                        throw zzfa.zzd();
                    }
                    n4 = zzdt.zzj(object, n4, zzds2);
                    n7 = zzds2.zza;
                    if (n7 >= 0) {
                        int n16 = ((byte[])object).length - n4;
                        if (n7 <= n16) {
                            if (n7 == 0) {
                                object = zzee.zzb;
                                zzgz2.zzf(n3, object);
                            } else {
                                object = zzee.zzk(object, n4, n7);
                                zzgz2.zzf(n3, object);
                            }
                            return n4 + n7;
                        }
                        throw zzfa.zzf();
                    }
                    throw zzfa.zzc();
                }
                object = zzdt.zzn(object, n4);
                zzgz2.zzf(n3, object);
                return n4 + 8;
            }
            int n17 = zzdt.zzm(object, n4, zzds2);
            Long l2 = zzds2.zzb;
            zzgz2.zzf(n3, l2);
            return n17;
        }
        throw zzfa.zza();
    }

    public static int zzj(byte[] byArray, int n3, zzds zzds2) {
        int n4 = n3 + 1;
        if ((n3 = byArray[n3]) >= 0) {
            zzds2.zza = n3;
            return n4;
        }
        return zzdt.zzk(n3, byArray, n4, zzds2);
    }

    public static int zzk(int n3, byte[] byArray, int n4, zzds zzds2) {
        n3 &= 0x7F;
        int n7 = n4 + 1;
        int n8 = byArray[n4];
        if (n8 >= 0) {
            int n10 = n8 << 7;
            zzds2.zza = n3 |= n10;
            return n7;
        }
        n8 = (n8 & 0x7F) << 7;
        n3 |= n8;
        n8 = n4 + 2;
        if ((n7 = byArray[n7]) >= 0) {
            int n14 = n7 << 14;
            zzds2.zza = n3 |= n14;
            return n8;
        }
        n7 = (n7 & 0x7F) << 14;
        n3 |= n7;
        n7 = n4 + 3;
        if ((n8 = byArray[n8]) >= 0) {
            int n15 = n8 << 21;
            zzds2.zza = n3 |= n15;
            return n7;
        }
        n8 = (n8 & 0x7F) << 21;
        n3 |= n8;
        n4 += 4;
        if ((n7 = byArray[n7]) >= 0) {
            int n16 = n7 << 28;
            zzds2.zza = n3 |= n16;
            return n4;
        }
        n7 = (n7 & 0x7F) << 28;
        n3 |= n7;
        while (true) {
            n7 = n4 + 1;
            if ((n4 = byArray[n4]) >= 0) break;
            n4 = n7;
        }
        zzds2.zza = n3;
        return n7;
    }

    public static int zzl(int n3, byte[] byArray, int n4, int n7, zzey zzey2, zzds zzds2) {
        zzey2 = (zzev)zzey2;
        n4 = zzdt.zzj(byArray, n4, zzds2);
        int n8 = zzds2.zza;
        ((zzev)zzey2).zze(n8);
        while (n4 < n7) {
            n8 = zzdt.zzj(byArray, n4, zzds2);
            int n10 = zzds2.zza;
            if (n3 != n10) break;
            n4 = zzdt.zzj(byArray, n8, zzds2);
            n8 = zzds2.zza;
            ((zzev)zzey2).zze(n8);
        }
        return n4;
    }

    public static int zzm(byte[] byArray, int n3, zzds zzds2) {
        int n4 = n3 + 1;
        byte by2 = byArray[n3];
        long l2 = by2;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            zzds2.zzb = l2;
            return n4;
        }
        n3 += 2;
        n4 = byArray[n4];
        l2 &= (long)127;
        l3 = n4 & 0x7F;
        object = 7;
        l2 |= (l3 <<= object);
        int n7 = 7;
        while (n4 < 0) {
            n4 = n3 + 1;
            n3 = byArray[n3];
            int n8 = n3 & 0x7F;
            long l7 = (long)n8 << (n7 += object);
            l2 |= l7;
            int n10 = n4;
            n4 = n3;
            n3 = n10;
        }
        zzds2.zzb = l2;
        return n3;
    }

    public static long zzn(byte[] byArray, int n3) {
        long l2 = byArray[n3];
        long l3 = 255L;
        l2 &= l3;
        int n4 = n3 + 1;
        long l4 = ((long)byArray[n4] & l3) << 8;
        l2 |= l4;
        n4 = n3 + 2;
        l4 = ((long)byArray[n4] & l3) << 16;
        l2 |= l4;
        n4 = n3 + 3;
        l4 = ((long)byArray[n4] & l3) << 24;
        l2 |= l4;
        n4 = n3 + 4;
        l4 = ((long)byArray[n4] & l3) << 32;
        l2 |= l4;
        n4 = n3 + 5;
        l4 = ((long)byArray[n4] & l3) << 40;
        l2 |= l4;
        n4 = n3 + 6;
        l4 = ((long)byArray[n4] & l3) << 48;
        return ((long)byArray[n3 += 7] & l3) << 56 | (l2 |= l4);
    }
}

