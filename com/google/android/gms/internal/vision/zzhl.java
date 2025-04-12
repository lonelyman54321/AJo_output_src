/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhn;
import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzjd;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjk;
import com.google.android.gms.internal.vision.zzjl;
import com.google.android.gms.internal.vision.zzko;
import com.google.android.gms.internal.vision.zzlc;
import com.google.android.gms.internal.vision.zzlx;
import com.google.android.gms.internal.vision.zzmd;
import java.nio.charset.Charset;

final class zzhl {
    public static int zza(int n3, byte[] byArray, int n4, int n7, zzhn zzhn2) {
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
                            n3 = 5;
                            if (n8 == n3) {
                                return n4 + 4;
                            }
                            throw zzjk.zzd();
                        }
                        n3 = n3 & 0xFFFFFFF8 | 4;
                        n8 = 0;
                        while (n4 < n7) {
                            n4 = zzhl.zza(byArray, n4, zzhn2);
                            n8 = zzhn2.zza;
                            if (n8 == n3) break;
                            n4 = zzhl.zza(n8, byArray, n4, n7, zzhn2);
                        }
                        if (n4 <= n7 && n8 == n3) {
                            return n4;
                        }
                        throw zzjk.zzg();
                    }
                    n3 = zzhl.zza(byArray, n4, zzhn2);
                    int n14 = zzhn2.zza;
                    return n3 + n14;
                }
                return n4 + 8;
            }
            return zzhl.zzb(byArray, n4, zzhn2);
        }
        throw zzjk.zzd();
    }

    public static int zza(int n3, byte[] byArray, int n4, int n7, zzjl zzjl2, zzhn zzhn2) {
        zzjl2 = (zzjd)zzjl2;
        n4 = zzhl.zza(byArray, n4, zzhn2);
        int n8 = zzhn2.zza;
        ((zzjd)zzjl2).zzc(n8);
        while (n4 < n7) {
            n8 = zzhl.zza(byArray, n4, zzhn2);
            int n10 = zzhn2.zza;
            if (n3 != n10) break;
            n4 = zzhl.zza(byArray, n8, zzhn2);
            n8 = zzhn2.zza;
            ((zzjd)zzjl2).zzc(n8);
        }
        return n4;
    }

    public static int zza(int n3, byte[] object, int n4, int n7, zzlx zzlx2, zzhn zzhn2) {
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
                                object = zzhl.zza(object, n4);
                                zzlx2.zza(n3, object);
                                return n4 + 4;
                            }
                            throw zzjk.zzd();
                        }
                        zzlx zzlx3 = zzlx.zzb();
                        int n14 = n3 & 0xFFFFFFF8 | 4;
                        n8 = 0;
                        while (n4 < n7) {
                            int n15 = zzhl.zza(object, n4, zzhn2);
                            n8 = n4 = zzhn2.zza;
                            if (n4 != n14) {
                                int n16 = zzhl.zza(n4, object, n15, n7, zzlx3, zzhn2);
                                n8 = n4;
                                n4 = n16;
                                continue;
                            }
                            n4 = n15;
                            break;
                        }
                        if (n4 <= n7 && n8 == n14) {
                            zzlx2.zza(n3, zzlx3);
                            return n4;
                        }
                        throw zzjk.zzg();
                    }
                    n4 = zzhl.zza(object, n4, zzhn2);
                    n7 = zzhn2.zza;
                    if (n7 >= 0) {
                        int n17 = ((byte[])object).length - n4;
                        if (n7 <= n17) {
                            if (n7 == 0) {
                                object = zzht.zza;
                                zzlx2.zza(n3, object);
                            } else {
                                object = zzht.zza(object, n4, n7);
                                zzlx2.zza(n3, object);
                            }
                            return n4 + n7;
                        }
                        throw zzjk.zza();
                    }
                    throw zzjk.zzb();
                }
                object = zzhl.zzb(object, n4);
                zzlx2.zza(n3, object);
                return n4 + 8;
            }
            int n18 = zzhl.zzb(object, n4, zzhn2);
            Long l2 = zzhn2.zzb;
            zzlx2.zza(n3, l2);
            return n18;
        }
        throw zzjk.zzd();
    }

    public static int zza(int n3, byte[] byArray, int n4, zzhn zzhn2) {
        n3 &= 0x7F;
        int n7 = n4 + 1;
        int n8 = byArray[n4];
        if (n8 >= 0) {
            int n10 = n8 << 7;
            zzhn2.zza = n3 |= n10;
            return n7;
        }
        n8 = (n8 & 0x7F) << 7;
        n3 |= n8;
        n8 = n4 + 2;
        if ((n7 = byArray[n7]) >= 0) {
            int n14 = n7 << 14;
            zzhn2.zza = n3 |= n14;
            return n8;
        }
        n7 = (n7 & 0x7F) << 14;
        n3 |= n7;
        n7 = n4 + 3;
        if ((n8 = byArray[n8]) >= 0) {
            int n15 = n8 << 21;
            zzhn2.zza = n3 |= n15;
            return n7;
        }
        n8 = (n8 & 0x7F) << 21;
        n3 |= n8;
        n4 += 4;
        if ((n7 = byArray[n7]) >= 0) {
            int n16 = n7 << 28;
            zzhn2.zza = n3 |= n16;
            return n4;
        }
        n7 = (n7 & 0x7F) << 28;
        n3 |= n7;
        while (true) {
            n7 = n4 + 1;
            if ((n4 = byArray[n4]) >= 0) {
                zzhn2.zza = n3;
                return n7;
            }
            n4 = n7;
        }
    }

    public static int zza(zzlc zzlc2, int n3, byte[] byArray, int n4, int n7, zzjl zzjl2, zzhn zzhn2) {
        n4 = zzhl.zza(zzlc2, byArray, n4, n7, zzhn2);
        Object object = zzhn2.zzc;
        zzjl2.add(object);
        while (n4 < n7) {
            int n8 = zzhl.zza(byArray, n4, zzhn2);
            int n10 = zzhn2.zza;
            if (n3 != n10) break;
            n4 = zzhl.zza(zzlc2, byArray, n8, n7, zzhn2);
            object = zzhn2.zzc;
            zzjl2.add(object);
        }
        return n4;
    }

    public static int zza(zzlc zzlc2, byte[] byArray, int n3, int n4, int n7, zzhn zzhn2) {
        zzlc2 = (zzko)zzlc2;
        Object object = ((zzko)zzlc2).zza();
        int n8 = ((zzko)zzlc2).zza(object, byArray, n3, n4, n7, zzhn2);
        ((zzko)zzlc2).zzc(object);
        zzhn2.zzc = object;
        return n8;
    }

    public static int zza(zzlc zzlc2, byte[] byArray, int n3, int n4, zzhn zzhn2) {
        int n7 = n3 + 1;
        if ((n3 = byArray[n3]) < 0) {
            n7 = zzhl.zza(n3, byArray, n7, zzhn2);
            n3 = zzhn2.zza;
        }
        if (n3 >= 0 && n3 <= (n4 -= n7)) {
            Object object = zzlc2.zza();
            zzlc2.zza(object, byArray, n7, n3 += n7, zzhn2);
            zzlc2.zzc(object);
            zzhn2.zzc = object;
            return n3;
        }
        throw zzjk.zza();
    }

    public static int zza(byte[] byArray, int n3) {
        int n4 = byArray[n3] & 0xFF;
        int n7 = n3 + 1;
        n7 = (byArray[n7] & 0xFF) << 8;
        n4 |= n7;
        n7 = n3 + 2;
        n7 = (byArray[n7] & 0xFF) << 16;
        return (byArray[n3 += 3] & 0xFF) << 24 | (n4 |= n7);
    }

    public static int zza(byte[] byArray, int n3, zzhn zzhn2) {
        int n4 = n3 + 1;
        if ((n3 = byArray[n3]) >= 0) {
            zzhn2.zza = n3;
            return n4;
        }
        return zzhl.zza(n3, byArray, n4, zzhn2);
    }

    public static int zza(byte[] byArray, int n3, zzjl zzjl2, zzhn zzhn2) {
        zzjl2 = (zzjd)zzjl2;
        n3 = zzhl.zza(byArray, n3, zzhn2);
        int n4 = zzhn2.zza + n3;
        while (n3 < n4) {
            n3 = zzhl.zza(byArray, n3, zzhn2);
            int n7 = zzhn2.zza;
            ((zzjd)zzjl2).zzc(n7);
        }
        if (n3 == n4) {
            return n3;
        }
        throw zzjk.zza();
    }

    public static int zzb(byte[] byArray, int n3, zzhn zzhn2) {
        int n4 = n3 + 1;
        byte by2 = byArray[n3];
        long l2 = by2;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            zzhn2.zzb = l2;
            return n4;
        }
        l2 &= (long)127;
        n3 += 2;
        n4 = byArray[n4];
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
        zzhn2.zzb = l2;
        return n3;
    }

    public static long zzb(byte[] byArray, int n3) {
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

    public static double zzc(byte[] byArray, int n3) {
        return Double.longBitsToDouble(zzhl.zzb(byArray, n3));
    }

    public static int zzc(byte[] byArray, int n3, zzhn zzhn2) {
        n3 = zzhl.zza(byArray, n3, zzhn2);
        int n4 = zzhn2.zza;
        if (n4 >= 0) {
            if (n4 == 0) {
                zzhn2.zzc = "";
                return n3;
            }
            Charset charset = zzjf.zza;
            String string2 = new String(byArray, n3, n4, charset);
            zzhn2.zzc = string2;
            return n3 + n4;
        }
        throw zzjk.zzb();
    }

    public static float zzd(byte[] byArray, int n3) {
        return Float.intBitsToFloat(zzhl.zza(byArray, n3));
    }

    public static int zzd(byte[] object, int n3, zzhn zzhn2) {
        n3 = zzhl.zza(object, n3, zzhn2);
        int n4 = zzhn2.zza;
        if (n4 >= 0) {
            if (n4 == 0) {
                zzhn2.zzc = "";
                return n3;
            }
            object = zzmd.zzb(object, n3, n4);
            zzhn2.zzc = object;
            return n3 + n4;
        }
        throw zzjk.zzb();
    }

    public static int zze(byte[] object, int n3, zzhn zzhn2) {
        n3 = zzhl.zza(object, n3, zzhn2);
        int n4 = zzhn2.zza;
        if (n4 >= 0) {
            int n7 = ((byte[])object).length - n3;
            if (n4 <= n7) {
                if (n4 == 0) {
                    object = zzht.zza;
                    zzhn2.zzc = object;
                    return n3;
                }
                object = zzht.zza(object, n3, n4);
                zzhn2.zzc = object;
                return n3 + n4;
            }
            throw zzjk.zza();
        }
        throw zzjk.zzb();
    }
}

