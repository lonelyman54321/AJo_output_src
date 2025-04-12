/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzay;
import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzch;
import com.google.android.gms.internal.clearcut.zzci;
import com.google.android.gms.internal.clearcut.zzcn;
import com.google.android.gms.internal.clearcut.zzco;
import com.google.android.gms.internal.clearcut.zzey;
import com.google.android.gms.internal.clearcut.zzff;
import java.nio.charset.Charset;

final class zzax {
    public static int zza(int n3, byte[] byArray, int n4, int n7, zzay zzay2) {
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
                            throw zzco.zzbm();
                        }
                        n3 = n3 & 0xFFFFFFF8 | 4;
                        n8 = 0;
                        while (n4 < n7) {
                            n4 = zzax.zza(byArray, n4, zzay2);
                            n8 = zzay2.zzfd;
                            if (n8 == n3) break;
                            n4 = zzax.zza(n8, byArray, n4, n7, zzay2);
                        }
                        if (n4 <= n7 && n8 == n3) {
                            return n4;
                        }
                        throw zzco.zzbo();
                    }
                    n3 = zzax.zza(byArray, n4, zzay2);
                    int n14 = zzay2.zzfd;
                    return n3 + n14;
                }
                return n4 + 8;
            }
            return zzax.zzb(byArray, n4, zzay2);
        }
        throw zzco.zzbm();
    }

    public static int zza(int n3, byte[] byArray, int n4, int n7, zzcn zzcn2, zzay zzay2) {
        zzcn2 = (zzch)zzcn2;
        n4 = zzax.zza(byArray, n4, zzay2);
        while (true) {
            int n8 = zzay2.zzfd;
            ((zzch)zzcn2).zzac(n8);
            if (n4 >= n7) break;
            n8 = zzax.zza(byArray, n4, zzay2);
            int n10 = zzay2.zzfd;
            if (n3 != n10) break;
            n4 = zzax.zza(byArray, n8, zzay2);
        }
        return n4;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static int zza(int n3, byte[] object, int n4, int n7, zzey zzey2, zzay zzay2) {
        void var1_4;
        int n8;
        void var4_9;
        void var5_10;
        int n10;
        int n14 = n3 >>> 3;
        if (n14 == 0) throw zzco.zzbm();
        n14 = n3 & 7;
        if (n14 == 0) {
            int n15 = zzax.zzb(object, n10, (zzay)var5_10);
            Long l2 = var5_10.zzfe;
            var4_9.zzb(n3, l2);
            return n15;
        }
        int n16 = 1;
        if (n14 == n16) {
            Long l3 = zzax.zzd(object, n10);
            var4_9.zzb(n3, l3);
            return n10 + 8;
        }
        n16 = 2;
        if (n14 != n16) {
            n16 = 3;
            if (n14 != n16) {
                n8 = 5;
                if (n14 != n8) throw zzco.zzbm();
                Integer n17 = zzax.zzc(object, n10);
                var4_9.zzb(n3, n17);
                return n10 + 4;
            }
            zzey zzey3 = zzey.zzeb();
            int n18 = n3 & 0xFFFFFFF8 | 4;
            n14 = 0;
            while (n10 < n8) {
                int n19 = zzax.zza(object, n10, (zzay)var5_10);
                n14 = n10 = var5_10.zzfd;
                if (n10 != n18) {
                    int n20 = zzax.zza(n10, object, n19, n8, zzey3, (zzay)var5_10);
                    n14 = n10;
                    n10 = n20;
                    continue;
                }
                n10 = n19;
                break;
            }
            if (n10 > n8) throw zzco.zzbo();
            if (n14 != n18) throw zzco.zzbo();
            var4_9.zzb(n3, zzey3);
            return n10;
        }
        n10 = zzax.zza(object, n10, (zzay)var5_10);
        n8 = var5_10.zzfd;
        if (n8 == 0) {
            zzbb zzbb2 = zzbb.zzfi;
        } else {
            zzbb zzbb3 = zzbb.zzb(object, n10, n8);
        }
        var4_9.zzb(n3, var1_4);
        return n10 + n8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int zza(int n3, byte[] byArray, int n4, zzay zzay2) {
        int n7;
        int n8;
        block9: {
            int n10;
            block8: {
                block7: {
                    n3 &= 0x7F;
                    n8 = n4 + 1;
                    n7 = byArray[n4];
                    if (n7 < 0) break block7;
                    n10 = n7 << 7;
                    break block8;
                }
                n7 = (n7 & 0x7F) << 7;
                n3 |= n7;
                n7 = n4 + 2;
                if ((n8 = byArray[n8]) >= 0) {
                    int n14 = n8 << 14;
                    zzay2.zzfd = n3 |= n14;
                    return n7;
                }
                n8 = (n8 & 0x7F) << 14;
                n3 |= n8;
                n8 = n4 + 3;
                if ((n7 = byArray[n7]) < 0) break block9;
                n10 = n7 << 21;
            }
            zzay2.zzfd = n3 |= n10;
            return n8;
        }
        n7 = (n7 & 0x7F) << 21;
        n3 |= n7;
        n4 += 4;
        if ((n8 = byArray[n8]) >= 0) {
            int n15 = n8 << 28;
            zzay2.zzfd = n3 |= n15;
            return n4;
        }
        n8 = (n8 & 0x7F) << 28;
        n3 |= n8;
        while (true) {
            n8 = n4 + 1;
            if ((n4 = byArray[n4]) >= 0) {
                zzay2.zzfd = n3;
                return n8;
            }
            n4 = n8;
        }
    }

    public static int zza(byte[] byArray, int n3, zzay zzay2) {
        int n4 = n3 + 1;
        if ((n3 = byArray[n3]) >= 0) {
            zzay2.zzfd = n3;
            return n4;
        }
        return zzax.zza(n3, byArray, n4, zzay2);
    }

    public static int zza(byte[] byArray, int n3, zzcn zzcn2, zzay zzay2) {
        zzcn2 = (zzch)zzcn2;
        n3 = zzax.zza(byArray, n3, zzay2);
        int n4 = zzay2.zzfd + n3;
        while (n3 < n4) {
            n3 = zzax.zza(byArray, n3, zzay2);
            int n7 = zzay2.zzfd;
            ((zzch)zzcn2).zzac(n7);
        }
        if (n3 == n4) {
            return n3;
        }
        throw zzco.zzbl();
    }

    public static int zzb(byte[] byArray, int n3, zzay zzay2) {
        int n4 = n3 + 1;
        byte by2 = byArray[n3];
        long l2 = by2;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            zzay2.zzfe = l2;
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
        zzay2.zzfe = l2;
        return n3;
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

    public static int zzc(byte[] byArray, int n3, zzay zzay2) {
        n3 = zzax.zza(byArray, n3, zzay2);
        int n4 = zzay2.zzfd;
        if (n4 == 0) {
            zzay2.zzff = "";
            return n3;
        }
        Charset charset = zzci.UTF_8;
        String string2 = new String(byArray, n3, n4, charset);
        zzay2.zzff = string2;
        return n3 + n4;
    }

    public static int zzd(byte[] byArray, int n3, zzay zzay2) {
        n3 = zzax.zza(byArray, n3, zzay2);
        int n4 = zzay2.zzfd;
        if (n4 == 0) {
            zzay2.zzff = "";
            return n3;
        }
        int n7 = n3 + n4;
        boolean bl2 = zzff.zze(byArray, n3, n7);
        if (bl2) {
            Charset charset = zzci.UTF_8;
            String string2 = new String(byArray, n3, n4, charset);
            zzay2.zzff = string2;
            return n7;
        }
        throw zzco.zzbp();
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

    public static double zze(byte[] byArray, int n3) {
        return Double.longBitsToDouble(zzax.zzd(byArray, n3));
    }

    public static int zze(byte[] object, int n3, zzay zzay2) {
        n3 = zzax.zza(object, n3, zzay2);
        int n4 = zzay2.zzfd;
        if (n4 == 0) {
            object = zzbb.zzfi;
            zzay2.zzff = object;
            return n3;
        }
        object = zzbb.zzb(object, n3, n4);
        zzay2.zzff = object;
        return n3 + n4;
    }

    public static float zzf(byte[] byArray, int n3) {
        return Float.intBitsToFloat(zzax.zzc(byArray, n3));
    }
}

