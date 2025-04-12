/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacg;
import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzaco;
import com.google.android.gms.internal.gtm.zzacq;
import com.google.android.gms.internal.gtm.zzado;
import com.google.android.gms.internal.gtm.zzadx;
import com.google.android.gms.internal.gtm.zzaen;
import com.google.android.gms.internal.gtm.zzyl;
import com.google.android.gms.internal.gtm.zzyx;
import java.nio.charset.Charset;

final class zzym {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] object, int n3, zzyl zzyl2) {
        n3 = zzym.zzi(object, n3, zzyl2);
        int n4 = zzyl2.zza;
        if (n4 >= 0) {
            int n7 = ((byte[])object).length - n3;
            if (n4 <= n7) {
                if (n4 == 0) {
                    object = zzyx.zzb;
                    zzyl2.zzc = object;
                    return n3;
                }
                object = zzyx.zzj(object, n3, n4);
                zzyl2.zzc = object;
                return n3 + n4;
            }
            object = new zzacq;
            object("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            throw object;
        }
        object = new zzacq;
        object("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        throw object;
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

    public static int zzc(zzadx zzadx2, byte[] byArray, int n3, int n4, int n7, zzyl zzyl2) {
        Object object = zzadx2.zze();
        int n8 = zzym.zzm(object, zzadx2, byArray, n3, n4, n7, zzyl2);
        zzadx2.zzf(object);
        zzyl2.zzc = object;
        return n8;
    }

    public static int zzd(zzadx zzadx2, byte[] byArray, int n3, int n4, zzyl zzyl2) {
        Object object = zzadx2.zze();
        int n7 = zzym.zzn(object, zzadx2, byArray, n3, n4, zzyl2);
        zzadx2.zzf(object);
        zzyl2.zzc = object;
        return n7;
    }

    public static int zze(zzadx zzadx2, int n3, byte[] byArray, int n4, int n7, zzacn zzacn2, zzyl zzyl2) {
        n4 = zzym.zzd(zzadx2, byArray, n4, n7, zzyl2);
        Object object = zzyl2.zzc;
        zzacn2.add(object);
        while (n4 < n7) {
            int n8 = zzym.zzi(byArray, n4, zzyl2);
            int n10 = zzyl2.zza;
            if (n3 != n10) break;
            n4 = zzym.zzd(zzadx2, byArray, n8, n7, zzyl2);
            object = zzyl2.zzc;
            zzacn2.add(object);
        }
        return n4;
    }

    public static int zzf(byte[] object, int n3, zzacn zzacn2, zzyl zzyl2) {
        zzacn2 = (zzacg)zzacn2;
        n3 = zzym.zzi(object, n3, zzyl2);
        int n4 = zzyl2.zza + n3;
        while (n3 < n4) {
            n3 = zzym.zzi(object, n3, zzyl2);
            int n7 = zzyl2.zza;
            ((zzacg)zzacn2).zzh(n7);
        }
        if (n3 == n4) {
            return n3;
        }
        object = new zzacq;
        object("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        throw object;
    }

    public static int zzg(byte[] object, int n3, zzyl zzyl2) {
        n3 = zzym.zzi(object, n3, zzyl2);
        int n4 = zzyl2.zza;
        if (n4 >= 0) {
            if (n4 == 0) {
                zzyl2.zzc = "";
                return n3;
            }
            Charset charset = zzaco.zza;
            String string2 = new String((byte[])object, n3, n4, charset);
            zzyl2.zzc = string2;
            return n3 + n4;
        }
        object = new zzacq;
        object("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        throw object;
    }

    public static int zzh(int n3, byte[] object, int n4, int n7, zzaen zzaen2, zzyl zzyl2) {
        int n8 = n3 >>> 3;
        Object object2 = "Protocol message contained an invalid tag (zero).";
        if (n8 != 0) {
            n8 = n3 & 7;
            if (n8 != 0) {
                int n10 = 1;
                if (n8 != n10) {
                    int n14 = 2;
                    if (n8 != n14) {
                        int n15;
                        n14 = 3;
                        if (n8 != n14) {
                            n7 = 5;
                            if (n8 == n7) {
                                object = zzym.zzb(object, n4);
                                zzaen2.zzj(n3, object);
                                return n4 + 4;
                            }
                            zzacq zzacq2 = new zzacq((String)object2);
                            throw zzacq2;
                        }
                        n8 = n3 & 0xFFFFFFF8 | 4;
                        object2 = zzaen.zzf();
                        zzyl2.zze = n14 = zzyl2.zze + n10;
                        zzym.zzq(n14);
                        n10 = 0;
                        while (n4 < n7) {
                            int n16 = zzym.zzi(object, n4, zzyl2);
                            n10 = zzyl2.zza;
                            if (n10 == n8) {
                                n4 = n16;
                                break;
                            }
                            n14 = n10;
                            n4 = zzym.zzh(n10, object, n16, n7, (zzaen)object2, zzyl2);
                        }
                        zzyl2.zze = n15 = zzyl2.zze + -1;
                        if (n4 <= n7 && n10 == n8) {
                            zzaen2.zzj(n3, object2);
                            return n4;
                        }
                        zzacq zzacq3 = new zzacq("Failed to parse the message.");
                        throw zzacq3;
                    }
                    n4 = zzym.zzi(object, n4, zzyl2);
                    n7 = zzyl2.zza;
                    if (n7 >= 0) {
                        int n17 = ((byte[])object).length - n4;
                        if (n7 <= n17) {
                            if (n7 == 0) {
                                object = zzyx.zzb;
                                zzaen2.zzj(n3, object);
                            } else {
                                object = zzyx.zzj(object, n4, n7);
                                zzaen2.zzj(n3, object);
                            }
                            return n4 + n7;
                        }
                        zzacq zzacq4 = new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        throw zzacq4;
                    }
                    zzacq zzacq5 = new zzacq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    throw zzacq5;
                }
                object = zzym.zzp(object, n4);
                zzaen2.zzj(n3, object);
                return n4 + 8;
            }
            int n18 = zzym.zzl(object, n4, zzyl2);
            Long l2 = zzyl2.zzb;
            zzaen2.zzj(n3, l2);
            return n18;
        }
        zzacq zzacq6 = new zzacq((String)object2);
        throw zzacq6;
    }

    public static int zzi(byte[] byArray, int n3, zzyl zzyl2) {
        int n4 = n3 + 1;
        if ((n3 = byArray[n3]) >= 0) {
            zzyl2.zza = n3;
            return n4;
        }
        return zzym.zzj(n3, byArray, n4, zzyl2);
    }

    public static int zzj(int n3, byte[] byArray, int n4, zzyl zzyl2) {
        int n7 = byArray[n4];
        int n8 = n4 + 1;
        n3 &= 0x7F;
        if (n7 >= 0) {
            int n10 = n7 << 7;
            zzyl2.zza = n3 |= n10;
            return n8;
        }
        n7 = (n7 & 0x7F) << 7;
        n3 |= n7;
        n7 = n4 + 2;
        if ((n8 = byArray[n8]) >= 0) {
            int n14 = n8 << 14;
            zzyl2.zza = n3 |= n14;
            return n7;
        }
        n8 = (n8 & 0x7F) << 14;
        n3 |= n8;
        n8 = n4 + 3;
        if ((n7 = byArray[n7]) >= 0) {
            int n15 = n7 << 21;
            zzyl2.zza = n3 |= n15;
            return n8;
        }
        n7 = (n7 & 0x7F) << 21;
        n3 |= n7;
        n4 += 4;
        n7 = byArray[n8];
        if (n7 >= 0) {
            int n16 = n7 << 28;
            zzyl2.zza = n3 |= n16;
            return n4;
        }
        n7 = (n7 & 0x7F) << 28;
        n3 |= n7;
        while (true) {
            n7 = n4 + 1;
            if ((n4 = byArray[n4]) >= 0) break;
            n4 = n7;
        }
        zzyl2.zza = n3;
        return n7;
    }

    public static int zzk(int n3, byte[] byArray, int n4, int n7, zzacn zzacn2, zzyl zzyl2) {
        zzacn2 = (zzacg)zzacn2;
        n4 = zzym.zzi(byArray, n4, zzyl2);
        int n8 = zzyl2.zza;
        ((zzacg)zzacn2).zzh(n8);
        while (n4 < n7) {
            n8 = zzym.zzi(byArray, n4, zzyl2);
            int n10 = zzyl2.zza;
            if (n3 != n10) break;
            n4 = zzym.zzi(byArray, n8, zzyl2);
            n8 = zzyl2.zza;
            ((zzacg)zzacn2).zzh(n8);
        }
        return n4;
    }

    public static int zzl(byte[] byArray, int n3, zzyl zzyl2) {
        byte by2 = byArray[n3];
        long l2 = by2;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        int n4 = n3 + 1;
        if (l4 >= 0) {
            zzyl2.zzb = l2;
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
        zzyl2.zzb = l2;
        return n3;
    }

    public static int zzm(Object object, zzadx zzadx2, byte[] byArray, int n3, int n4, int n7, zzyl zzyl2) {
        int n8;
        int n10;
        zzadx zzadx3 = zzadx2;
        zzadx3 = (zzado)zzadx2;
        zzyl2.zze = n10 = zzyl2.zze + 1;
        zzym.zzq(n10);
        n10 = ((zzado)zzadx3).zzc(object, byArray, n3, n4, n7, zzyl2);
        zzyl2.zze = n8 = zzyl2.zze + -1;
        zzyl2.zzc = object;
        return n10;
    }

    public static int zzn(Object object, zzadx zzadx2, byte[] byArray, int n3, int n4, zzyl zzyl2) {
        int n7 = n3 + 1;
        if ((n3 = byArray[n3]) < 0) {
            n7 = zzym.zzj(n3, byArray, n7, zzyl2);
            n3 = zzyl2.zza;
        }
        if (n3 >= 0 && n3 <= (n4 -= n7)) {
            int n8;
            zzyl2.zze = n4 = zzyl2.zze + 1;
            zzym.zzq(n4);
            zzadx2.zzi(object, byArray, n7, n3 += n7, zzyl2);
            zzyl2.zze = n8 = zzyl2.zze + -1;
            zzyl2.zzc = object;
            return n3;
        }
        object = new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        throw object;
    }

    public static int zzo(int n3, byte[] byArray, int n4, int n7, zzyl zzyl2) {
        int n8 = n3 >>> 3;
        String string2 = "Protocol message contained an invalid tag (zero).";
        if (n8 != 0) {
            n8 = n3 & 7;
            if (n8 != 0) {
                int n10 = 1;
                if (n8 != n10) {
                    n10 = 2;
                    if (n8 != n10) {
                        n10 = 3;
                        if (n8 != n10) {
                            n3 = 5;
                            if (n8 == n3) {
                                return n4 + 4;
                            }
                            zzacq zzacq2 = new zzacq(string2);
                            throw zzacq2;
                        }
                        n3 = n3 & 0xFFFFFFF8 | 4;
                        n8 = 0;
                        while (n4 < n7) {
                            n4 = zzym.zzi(byArray, n4, zzyl2);
                            n8 = zzyl2.zza;
                            if (n8 == n3) break;
                            n4 = zzym.zzo(n8, byArray, n4, n7, zzyl2);
                        }
                        if (n4 <= n7 && n8 == n3) {
                            return n4;
                        }
                        zzacq zzacq3 = new zzacq("Failed to parse the message.");
                        throw zzacq3;
                    }
                    n3 = zzym.zzi(byArray, n4, zzyl2);
                    int n14 = zzyl2.zza;
                    return n3 + n14;
                }
                return n4 + 8;
            }
            return zzym.zzl(byArray, n4, zzyl2);
        }
        zzacq zzacq4 = new zzacq(string2);
        throw zzacq4;
    }

    public static long zzp(byte[] byArray, int n3) {
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

    private static void zzq(int n3) {
        int n4 = zzb;
        if (n3 < n4) {
            return;
        }
        zzacq zzacq2 = new zzacq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        throw zzacq2;
    }
}

