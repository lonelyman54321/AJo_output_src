/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzit;
import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzkg$zzb;
import com.google.android.gms.internal.measurement.zzkh;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.measurement.zzlq;
import com.google.android.gms.internal.measurement.zzme;
import com.google.android.gms.internal.measurement.zzmu;
import com.google.android.gms.internal.measurement.zzmx;
import com.google.android.gms.internal.measurement.zzna;

final class zziu {
    private static volatile int zza = 100;

    public static double zza(byte[] byArray, int n3) {
        return Double.longBitsToDouble(zziu.zzd(byArray, n3));
    }

    public static int zza(int n3, byte[] byArray, int n4, int n7, zzit zzit2) {
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
                            throw zzkp.zzc();
                        }
                        n3 = n3 & 0xFFFFFFF8 | 4;
                        n8 = 0;
                        while (n4 < n7) {
                            n4 = zziu.zzc(byArray, n4, zzit2);
                            n8 = zzit2.zza;
                            if (n8 == n3) break;
                            n4 = zziu.zza(n8, byArray, n4, n7, zzit2);
                        }
                        if (n4 <= n7 && n8 == n3) {
                            return n4;
                        }
                        throw zzkp.zzg();
                    }
                    n3 = zziu.zzc(byArray, n4, zzit2);
                    int n14 = zzit2.zza;
                    return n3 + n14;
                }
                return n4 + 8;
            }
            return zziu.zzd(byArray, n4, zzit2);
        }
        throw zzkp.zzc();
    }

    public static int zza(int n3, byte[] byArray, int n4, int n7, zzkm zzkm2, zzit zzit2) {
        zzkm2 = (zzkh)zzkm2;
        n4 = zziu.zzc(byArray, n4, zzit2);
        int n8 = zzit2.zza;
        ((zzkh)zzkm2).zzd(n8);
        while (n4 < n7) {
            n8 = zziu.zzc(byArray, n4, zzit2);
            int n10 = zzit2.zza;
            if (n3 != n10) break;
            n4 = zziu.zzc(byArray, n8, zzit2);
            n8 = zzit2.zza;
            ((zzkh)zzkm2).zzd(n8);
        }
        return n4;
    }

    public static int zza(int n3, byte[] object, int n4, int n7, zzmx zzmx2, zzit zzit2) {
        int n8 = n3 >>> 3;
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
                                object = zziu.zzc(object, n4);
                                zzmx2.zza(n3, object);
                                return n4 + 4;
                            }
                            throw zzkp.zzc();
                        }
                        zzmx zzmx3 = zzmx.zzd();
                        int n16 = n3 & 0xFFFFFFF8 | 4;
                        zzit2.zze = n14 = zzit2.zze + n10;
                        zziu.zza(n14);
                        n14 = 0;
                        while (n4 < n7) {
                            int n17 = zziu.zzc(object, n4, zzit2);
                            n14 = n4 = zzit2.zza;
                            if (n4 != n16) {
                                int n18 = zziu.zza(n4, object, n17, n7, zzmx3, zzit2);
                                n14 = n4;
                                n4 = n18;
                                continue;
                            }
                            n4 = n17;
                            break;
                        }
                        zzit2.zze = n15 = zzit2.zze - n10;
                        if (n4 <= n7 && n14 == n16) {
                            zzmx2.zza(n3, zzmx3);
                            return n4;
                        }
                        throw zzkp.zzg();
                    }
                    n4 = zziu.zzc(object, n4, zzit2);
                    n7 = zzit2.zza;
                    if (n7 >= 0) {
                        int n19 = ((byte[])object).length - n4;
                        if (n7 <= n19) {
                            if (n7 == 0) {
                                object = zziy.zza;
                                zzmx2.zza(n3, object);
                            } else {
                                object = zziy.zza(object, n4, n7);
                                zzmx2.zza(n3, object);
                            }
                            return n4 + n7;
                        }
                        throw zzkp.zzi();
                    }
                    throw zzkp.zzf();
                }
                object = zziu.zzd(object, n4);
                zzmx2.zza(n3, object);
                return n4 + 8;
            }
            int n20 = zziu.zzd(object, n4, zzit2);
            Long l2 = zzit2.zzb;
            zzmx2.zza(n3, l2);
            return n20;
        }
        throw zzkp.zzc();
    }

    public static int zza(int n3, byte[] byArray, int n4, int n7, Object object, zzlm object2, zzmu zzmu2, zzit zzit2) {
        zzjt zzjt2 = zzit2.zzd;
        int n8 = n3 >>> 3;
        if ((object2 = zzjt2.zza((zzlm)object2, n8)) == null) {
            zzmx zzmx2 = zzlq.zzc(object);
            return zziu.zza(n3, byArray, n4, n7, zzmx2, zzit2);
        }
        object = (zzkg$zzb)object;
        ((zzkg$zzb)object).zza();
        Object object3 = ((zzkg$zzb)object).zzc;
        object3 = new NoSuchMethodError();
        throw object3;
    }

    public static int zza(int n3, byte[] byArray, int n4, zzit zzit2) {
        n3 &= 0x7F;
        int n7 = n4 + 1;
        int n8 = byArray[n4];
        if (n8 >= 0) {
            int n10 = n8 << 7;
            zzit2.zza = n3 |= n10;
            return n7;
        }
        n8 = (n8 & 0x7F) << 7;
        n3 |= n8;
        n8 = n4 + 2;
        if ((n7 = byArray[n7]) >= 0) {
            int n14 = n7 << 14;
            zzit2.zza = n3 |= n14;
            return n8;
        }
        n7 = (n7 & 0x7F) << 14;
        n3 |= n7;
        n7 = n4 + 3;
        if ((n8 = byArray[n8]) >= 0) {
            int n15 = n8 << 21;
            zzit2.zza = n3 |= n15;
            return n7;
        }
        n8 = (n8 & 0x7F) << 21;
        n3 |= n8;
        n4 += 4;
        if ((n7 = byArray[n7]) >= 0) {
            int n16 = n7 << 28;
            zzit2.zza = n3 |= n16;
            return n4;
        }
        n7 = (n7 & 0x7F) << 28;
        n3 |= n7;
        while (true) {
            n7 = n4 + 1;
            if ((n4 = byArray[n4]) >= 0) {
                zzit2.zza = n3;
                return n7;
            }
            n4 = n7;
        }
    }

    public static int zza(zzme zzme2, int n3, byte[] byArray, int n4, int n7, zzkm zzkm2, zzit zzit2) {
        int n8 = n3 & 0xFFFFFFF8 | 4;
        Object object = zzme2;
        int n10 = n4;
        n4 = zziu.zza(zzme2, byArray, n4, n7, n8, zzit2);
        object = zzit2.zzc;
        zzkm2.add(object);
        while (n4 < n7) {
            n10 = zziu.zzc(byArray, n4, zzit2);
            int n14 = zzit2.zza;
            if (n3 != n14) break;
            object = zzme2;
            n4 = zziu.zza(zzme2, byArray, n10, n7, n8, zzit2);
            object = zzit2.zzc;
            zzkm2.add(object);
        }
        return n4;
    }

    private static int zza(zzme zzme2, byte[] byArray, int n3, int n4, int n7, zzit zzit2) {
        Object object = zzme2.zza();
        int n8 = zziu.zza(object, zzme2, byArray, n3, n4, n7, zzit2);
        zzme2.zzd(object);
        zzit2.zzc = object;
        return n8;
    }

    public static int zza(zzme zzme2, byte[] byArray, int n3, int n4, zzit zzit2) {
        Object object = zzme2.zza();
        int n7 = zziu.zza(object, zzme2, byArray, n3, n4, zzit2);
        zzme2.zzd(object);
        zzit2.zzc = object;
        return n7;
    }

    public static int zza(Object object, zzme zzme2, byte[] byArray, int n3, int n4, int n7, zzit zzit2) {
        int n8;
        int n10;
        zzme zzme3 = zzme2;
        zzme3 = (zzlq)zzme2;
        zzit2.zze = n10 = zzit2.zze + 1;
        zziu.zza(n10);
        n10 = ((zzlq)zzme3).zza(object, byArray, n3, n4, n7, zzit2);
        zzit2.zze = n8 = zzit2.zze + -1;
        zzit2.zzc = object;
        return n10;
    }

    public static int zza(Object object, zzme zzme2, byte[] byArray, int n3, int n4, zzit zzit2) {
        int n7 = n3 + 1;
        if ((n3 = byArray[n3]) < 0) {
            n7 = zziu.zza(n3, byArray, n7, zzit2);
            n3 = zzit2.zza;
        }
        if (n3 >= 0 && n3 <= (n4 -= n7)) {
            int n8;
            zzit2.zze = n4 = zzit2.zze + 1;
            zziu.zza(n4);
            zzme2.zza(object, byArray, n7, n3 += n7, zzit2);
            zzit2.zze = n8 = zzit2.zze + -1;
            zzit2.zzc = object;
            return n3;
        }
        throw zzkp.zzi();
    }

    public static int zza(byte[] object, int n3, zzit zzit2) {
        n3 = zziu.zzc(object, n3, zzit2);
        int n4 = zzit2.zza;
        if (n4 >= 0) {
            int n7 = ((byte[])object).length - n3;
            if (n4 <= n7) {
                if (n4 == 0) {
                    object = zziy.zza;
                    zzit2.zzc = object;
                    return n3;
                }
                object = zziy.zza(object, n3, n4);
                zzit2.zzc = object;
                return n3 + n4;
            }
            throw zzkp.zzi();
        }
        throw zzkp.zzf();
    }

    public static int zza(byte[] byArray, int n3, zzkm zzkm2, zzit zzit2) {
        zzkm2 = (zzkh)zzkm2;
        n3 = zziu.zzc(byArray, n3, zzit2);
        int n4 = zzit2.zza + n3;
        while (n3 < n4) {
            n3 = zziu.zzc(byArray, n3, zzit2);
            int n7 = zzit2.zza;
            ((zzkh)zzkm2).zzd(n7);
        }
        if (n3 == n4) {
            return n3;
        }
        throw zzkp.zzi();
    }

    private static void zza(int n3) {
        int n4 = zza;
        if (n3 < n4) {
            return;
        }
        throw zzkp.zzh();
    }

    public static float zzb(byte[] byArray, int n3) {
        return Float.intBitsToFloat(zziu.zzc(byArray, n3));
    }

    public static int zzb(zzme zzme2, int n3, byte[] byArray, int n4, int n7, zzkm zzkm2, zzit zzit2) {
        n4 = zziu.zza(zzme2, byArray, n4, n7, zzit2);
        Object object = zzit2.zzc;
        zzkm2.add(object);
        while (n4 < n7) {
            int n8 = zziu.zzc(byArray, n4, zzit2);
            int n10 = zzit2.zza;
            if (n3 != n10) break;
            n4 = zziu.zza(zzme2, byArray, n8, n7, zzit2);
            object = zzit2.zzc;
            zzkm2.add(object);
        }
        return n4;
    }

    public static int zzb(byte[] object, int n3, zzit zzit2) {
        n3 = zziu.zzc(object, n3, zzit2);
        int n4 = zzit2.zza;
        if (n4 >= 0) {
            if (n4 == 0) {
                zzit2.zzc = "";
                return n3;
            }
            object = zzna.zzb(object, n3, n4);
            zzit2.zzc = object;
            return n3 + n4;
        }
        throw zzkp.zzf();
    }

    public static int zzc(byte[] byArray, int n3) {
        int n4 = byArray[n3] & 0xFF;
        int n7 = n3 + 1;
        n7 = (byArray[n7] & 0xFF) << 8;
        n4 |= n7;
        n7 = n3 + 2;
        n7 = (byArray[n7] & 0xFF) << 16;
        return (byArray[n3 += 3] & 0xFF) << 24 | (n4 |= n7);
    }

    public static int zzc(byte[] byArray, int n3, zzit zzit2) {
        int n4 = n3 + 1;
        if ((n3 = byArray[n3]) >= 0) {
            zzit2.zza = n3;
            return n4;
        }
        return zziu.zza(n3, byArray, n4, zzit2);
    }

    public static int zzd(byte[] byArray, int n3, zzit zzit2) {
        int n4 = n3 + 1;
        byte by2 = byArray[n3];
        long l2 = by2;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            zzit2.zzb = l2;
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
        zzit2.zzb = l2;
        return n3;
    }

    public static long zzd(byte[] byArray, int n3) {
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

