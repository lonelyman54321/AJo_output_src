/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzds;
import com.google.android.gms.internal.auth.zzdt;
import com.google.android.gms.internal.auth.zzdu;
import com.google.android.gms.internal.auth.zzee;
import com.google.android.gms.internal.auth.zzei;
import com.google.android.gms.internal.auth.zzej;
import com.google.android.gms.internal.auth.zzel;
import com.google.android.gms.internal.auth.zzeq;
import com.google.android.gms.internal.auth.zzeu;
import com.google.android.gms.internal.auth.zzev;
import com.google.android.gms.internal.auth.zzex;
import com.google.android.gms.internal.auth.zzey;
import com.google.android.gms.internal.auth.zzez;
import com.google.android.gms.internal.auth.zzfa;
import com.google.android.gms.internal.auth.zzfk;
import com.google.android.gms.internal.auth.zzfl;
import com.google.android.gms.internal.auth.zzfp;
import com.google.android.gms.internal.auth.zzfq;
import com.google.android.gms.internal.auth.zzfr;
import com.google.android.gms.internal.auth.zzft;
import com.google.android.gms.internal.auth.zzfw;
import com.google.android.gms.internal.auth.zzgb;
import com.google.android.gms.internal.auth.zzge;
import com.google.android.gms.internal.auth.zzgg;
import com.google.android.gms.internal.auth.zzgh;
import com.google.android.gms.internal.auth.zzgj;
import com.google.android.gms.internal.auth.zzgv;
import com.google.android.gms.internal.auth.zzgy;
import com.google.android.gms.internal.auth.zzgz;
import com.google.android.gms.internal.auth.zzhi;
import com.google.android.gms.internal.auth.zzhm;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import sun.misc.Unsafe;

final class zzfz
implements zzgh {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] nArray, Object[] objectArray, int n3, int n4, zzfw zzfw2, boolean bl2, boolean bl3, int[] nArray2, int n7, int n8, zzgb zzgb2, zzfk zzfk2, zzgy zzgy2, zzel zzel2, zzfr zzfr2, byte[] byArray) {
        this.zzc = nArray;
        this.zzd = objectArray;
        this.zze = n3;
        this.zzf = n4;
        this.zzh = bl2;
        this.zzi = nArray2;
        this.zzj = n7;
        this.zzk = n8;
        this.zzo = zzgb2;
        this.zzl = zzfk2;
        this.zzm = zzgy2;
        this.zzn = zzel2;
        this.zzg = zzfw2;
        this.zzp = zzfr2;
    }

    private static Field zzA(Class object, String string2) {
        try {
            return ((Class)object).getDeclaredField(string2);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            Object[] object2 = ((Class)object).getDeclaredFields();
            int n3 = object2.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                Field field = object2[i3];
                String string3 = field.getName();
                boolean bl2 = string2.equals(string3);
                if (!bl2) continue;
                return field;
            }
            object = ((Class)object).getName();
            String string4 = Arrays.toString(object2);
            object = og_1.a("Field ", string2, " for ", (String)object, " not found. Known fields are ");
            ((StringBuilder)object).append(string4);
            object = ((StringBuilder)object).toString();
            RuntimeException runtimeException = new RuntimeException((String)object);
            throw runtimeException;
        }
    }

    private final void zzB(Object object, Object object2, int n3) {
        int n4 = this.zzv(n3);
        int n7 = 1048575;
        long l2 = n4 &= n7;
        boolean bl2 = this.zzG(object2, n3);
        if (!bl2) {
            return;
        }
        Object object3 = zzhi.zzf(object, l2);
        object2 = zzhi.zzf(object2, l2);
        if (object3 != null && object2 != null) {
            object2 = zzez.zzg(object3, object2);
            zzhi.zzp(object, l2, object2);
            this.zzD(object, n3);
            return;
        }
        if (object2 != null) {
            zzhi.zzp(object, l2, object2);
            this.zzD(object, n3);
        }
    }

    private final void zzC(Object object, Object object2, int n3) {
        Object object3;
        int n4 = this.zzv(n3);
        int[] nArray = this.zzc;
        int n7 = nArray[n3];
        int n8 = 1048575;
        long l2 = n4 & n8;
        n4 = (int)(this.zzJ(object2, n7, n3) ? 1 : 0);
        if (n4 == 0) {
            return;
        }
        n4 = (int)(this.zzJ(object, n7, n3) ? 1 : 0);
        if (n4 != 0) {
            object3 = zzhi.zzf(object, l2);
        } else {
            n4 = 0;
            object3 = null;
        }
        object2 = zzhi.zzf(object2, l2);
        if (object3 != null && object2 != null) {
            object2 = zzez.zzg(object3, object2);
            zzhi.zzp(object, l2, object2);
            this.zzE(object, n7, n3);
            return;
        }
        if (object2 != null) {
            zzhi.zzp(object, l2, object2);
            this.zzE(object, n7, n3);
        }
    }

    private final void zzD(Object object, int n3) {
        long l2;
        int n4 = 0xFFFFF & (n3 = this.zzs(n3));
        long l3 = n4;
        long l4 = l3 - (l2 = 1048575L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false) {
            return;
        }
        int n7 = zzhi.zzc(object, l3);
        n3 >>>= 20;
        n3 = 1 << n3 | n7;
        zzhi.zzn(object, l3, n3);
    }

    private final void zzE(Object object, int n3, int n4) {
        long l2 = this.zzs(n4) & 0xFFFFF;
        zzhi.zzn(object, l2, n3);
    }

    private final boolean zzF(Object object, Object object2, int n3) {
        boolean bl2;
        boolean bl3 = this.zzG(object, n3);
        return bl3 == (bl2 = this.zzG(object2, n3));
    }

    private final boolean zzG(Object object, int n3) {
        int n4 = this.zzs(n3);
        int n7 = 1048575;
        int n8 = n4 & n7;
        long l2 = n8;
        long l3 = 1048575L;
        int n10 = 1;
        Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object2 == false) {
            n3 = this.zzv(n3);
            n4 = n3 & n7;
            long l4 = n4;
            n3 = zzfz.zzu(n3);
            l2 = 0L;
            switch (n3) {
                default: {
                    object = new IllegalArgumentException();
                    throw object;
                }
                case 17: {
                    object = zzhi.zzf(object, l4);
                    if (object != null) {
                        return n10 != 0;
                    }
                    return false;
                }
                case 16: {
                    long l7 = zzhi.zzd(object, l4);
                    n4 = (int)(l7 == l2 ? 0 : (l7 < l2 ? -1 : 1));
                    if (n4 != 0) {
                        return n10 != 0;
                    }
                    return false;
                }
                case 15: {
                    int n14 = zzhi.zzc(object, l4);
                    if (n14 != 0) {
                        return n10 != 0;
                    }
                    return false;
                }
                case 14: {
                    long l8 = zzhi.zzd(object, l4);
                    n4 = (int)(l8 == l2 ? 0 : (l8 < l2 ? -1 : 1));
                    if (n4 != 0) {
                        return n10 != 0;
                    }
                    return false;
                }
                case 13: {
                    int n15 = zzhi.zzc(object, l4);
                    if (n15 != 0) {
                        return n10 != 0;
                    }
                    return false;
                }
                case 12: {
                    int n16 = zzhi.zzc(object, l4);
                    if (n16 != 0) {
                        return n10 != 0;
                    }
                    return false;
                }
                case 11: {
                    int n17 = zzhi.zzc(object, l4);
                    if (n17 != 0) {
                        return n10 != 0;
                    }
                    return false;
                }
                case 10: {
                    zzee zzee2 = zzee.zzb;
                    object = zzhi.zzf(object, l4);
                    boolean bl2 = zzee2.equals(object);
                    if (!bl2) {
                        return n10 != 0;
                    }
                    return false;
                }
                case 9: {
                    object = zzhi.zzf(object, l4);
                    if (object != null) {
                        return n10 != 0;
                    }
                    return false;
                }
                case 8: {
                    object = zzhi.zzf(object, l4);
                    n3 = object instanceof String;
                    if (n3 != 0) {
                        boolean bl3 = ((String)(object = (String)object)).isEmpty();
                        if (!bl3) {
                            return n10 != 0;
                        }
                        return false;
                    }
                    n3 = object instanceof zzee;
                    if (n3 != 0) {
                        zzee zzee3 = zzee.zzb;
                        boolean bl4 = zzee3.equals(object);
                        if (!bl4) {
                            return n10 != 0;
                        }
                        return false;
                    }
                    object = new IllegalArgumentException();
                    throw object;
                }
                case 7: {
                    return zzhi.zzt(object, l4);
                }
                case 6: {
                    int n18 = zzhi.zzc(object, l4);
                    if (n18 != 0) {
                        return n10 != 0;
                    }
                    return false;
                }
                case 5: {
                    long l12 = zzhi.zzd(object, l4);
                    n4 = (int)(l12 == l2 ? 0 : (l12 < l2 ? -1 : 1));
                    if (n4 != 0) {
                        return n10 != 0;
                    }
                    return false;
                }
                case 4: {
                    int n19 = zzhi.zzc(object, l4);
                    if (n19 != 0) {
                        return n10 != 0;
                    }
                    return false;
                }
                case 3: {
                    long l14 = zzhi.zzd(object, l4);
                    n4 = (int)(l14 == l2 ? 0 : (l14 < l2 ? -1 : 1));
                    if (n4 != 0) {
                        return n10 != 0;
                    }
                    return false;
                }
                case 2: {
                    long l15 = zzhi.zzd(object, l4);
                    n4 = (int)(l15 == l2 ? 0 : (l15 < l2 ? -1 : 1));
                    if (n4 != 0) {
                        return n10 != 0;
                    }
                    return false;
                }
                case 1: {
                    float f5 = zzhi.zzb(object, l4);
                    int n20 = Float.floatToRawIntBits(f5);
                    if (n20 != 0) {
                        return n10 != 0;
                    }
                    return false;
                }
                case 0: 
            }
            double d2 = zzhi.zza(object, l4);
            long l16 = Double.doubleToRawLongBits(d2);
            n4 = (int)(l16 == l2 ? 0 : (l16 < l2 ? -1 : 1));
            if (n4 != 0) {
                return n10 != 0;
            }
            return false;
        }
        int n21 = zzhi.zzc(object, l2);
        n3 = n4 >>> 20;
        if ((n21 &= (n3 = n10 << n3)) != 0) {
            return n10 != 0;
        }
        return false;
    }

    private final boolean zzH(Object object, int n3, int n4, int n7, int n8) {
        int n10 = 1048575;
        if (n4 == n10) {
            return this.zzG(object, n3);
        }
        int n14 = n7 & n8;
        return n14 != 0;
    }

    private static boolean zzI(Object object, int n3, zzgh zzgh2) {
        long l2 = n3 & 0xFFFFF;
        object = zzhi.zzf(object, l2);
        return zzgh2.zzi(object);
    }

    private final boolean zzJ(Object object, int n3, int n4) {
        n4 = this.zzs(n4);
        int n7 = 1048575;
        long l2 = n4 &= n7;
        int n8 = zzhi.zzc(object, l2);
        return n8 == n3;
    }

    public static zzgz zzc(Object object) {
        object = (zzeu)object;
        zzgz zzgz2 = ((zzeu)object).zzc;
        zzgz zzgz3 = zzgz.zza();
        if (zzgz2 == zzgz3) {
            ((zzeu)object).zzc = zzgz2 = zzgz.zzc();
        }
        return zzgz2;
    }

    public static zzfz zzj(Class clazz, zzft zzft2, zzgb zzgb2, zzfk zzfk2, zzgy zzgy2, zzel zzel2, zzfr zzfr2) {
        boolean bl2 = zzft2 instanceof zzgg;
        if (bl2) {
            return zzfz.zzk((zzgg)zzft2, zzgb2, zzfk2, zzgy2, zzel2, zzfr2);
        }
        zzft2 = (zzgv)zzft2;
        throw null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static zzfz zzk(zzgg zzgg2, zzgb zzgb2, zzfk zzfk2, zzgy zzgy2, zzel zzel2, zzfr zzfr2) {
        int n3;
        Object object;
        int n4;
        int n7;
        int n8;
        Object[] objectArray;
        int n10;
        zzfw zzfw2;
        Object object2;
        int[] nArray;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18 = zzgg2.zzc();
        int n19 = 2;
        Class<?> clazz = null;
        boolean bl2 = n18 == n19;
        String string2 = zzgg2.zzd();
        n19 = string2.length();
        int n20 = string2.charAt(0);
        if (n20 >= (n17 = 55296)) {
            n20 = 1;
            while (true) {
                n16 = n20 + '\u0001';
                if ((n20 = (int)string2.charAt(n20)) >= n17) {
                    n20 = n16;
                    continue;
                }
                break;
            }
        } else {
            n16 = 1;
        }
        n20 = n16 + 1;
        if ((n16 = (int)string2.charAt(n16)) >= n17) {
            n16 &= 0x1FFF;
            n15 = 13;
            while (true) {
                n14 = n20 + 1;
                if ((n20 = (int)string2.charAt(n20)) < n17) break;
                n20 = (n20 & 0x1FFF) << n15;
                n16 |= n20;
                n15 += 13;
                n20 = n14;
            }
            n16 |= (n20 <<= n15);
            n20 = n14;
        }
        if (n16 == 0) {
            nArray = zza;
            n16 = 0;
            n15 = 0;
            object2 = null;
            n14 = 0;
            zzfw2 = null;
            n10 = 0;
            objectArray = null;
            n8 = 0;
            Object var22_22 = null;
            n7 = 0;
            n4 = 0;
            object = null;
        } else {
            int n21;
            n16 = n20 + 1;
            if ((n20 = (int)string2.charAt(n20)) >= n17) {
                n20 &= 0x1FFF;
                n15 = 13;
                while (true) {
                    n14 = n16 + 1;
                    if ((n16 = (int)string2.charAt(n16)) < n17) break;
                    n16 = (n16 & 0x1FFF) << n15;
                    n20 |= n16;
                    n15 += 13;
                    n16 = n14;
                }
                n20 |= (n16 <<= n15);
                n16 = n14;
            }
            n15 = n16 + 1;
            if ((n16 = (int)string2.charAt(n16)) >= n17) {
                n16 &= 0x1FFF;
                n14 = 13;
                while (true) {
                    n10 = n15 + 1;
                    if ((n15 = (int)string2.charAt(n15)) < n17) break;
                    n15 = (n15 & 0x1FFF) << n14;
                    n16 |= n15;
                    n14 += 13;
                    n15 = n10;
                }
                n16 |= (n15 <<= n14);
                n15 = n10;
            }
            n14 = n15 + 1;
            if ((n15 = (int)string2.charAt(n15)) >= n17) {
                n15 &= 0x1FFF;
                n10 = 13;
                while (true) {
                    n8 = n14 + 1;
                    if ((n14 = (int)string2.charAt(n14)) < n17) break;
                    n14 = (n14 & 0x1FFF) << n10;
                    n15 |= n14;
                    n10 += 13;
                    n14 = n8;
                }
                n15 |= (n14 <<= n10);
                n14 = n8;
            }
            n10 = n14 + 1;
            if ((n14 = (int)string2.charAt(n14)) >= n17) {
                n14 &= 0x1FFF;
                n8 = 13;
                while (true) {
                    n3 = n10 + 1;
                    if ((n10 = (int)string2.charAt(n10)) < n17) break;
                    n10 = (n10 & 0x1FFF) << n8;
                    n14 |= n10;
                    n8 += 13;
                    n10 = n3;
                }
                n14 |= (n10 <<= n8);
                n10 = n3;
            }
            n8 = n10 + 1;
            if ((n10 = (int)string2.charAt(n10)) >= n17) {
                n10 &= 0x1FFF;
                n3 = 13;
                while (true) {
                    n7 = n8 + 1;
                    if ((n8 = (int)string2.charAt(n8)) < n17) break;
                    n8 = (n8 & 0x1FFF) << n3;
                    n10 |= n8;
                    n3 += 13;
                    n8 = n7;
                }
                n10 |= (n8 <<= n3);
                n8 = n7;
            }
            n3 = n8 + 1;
            if ((n8 = (int)string2.charAt(n8)) >= n17) {
                n8 &= 0x1FFF;
                n7 = 13;
                while (true) {
                    n21 = n3 + 1;
                    if ((n3 = (int)string2.charAt(n3)) < n17) break;
                    n3 = (n3 & 0x1FFF) << n7;
                    n8 |= n3;
                    n7 += 13;
                    n3 = n21;
                }
                n8 |= (n3 <<= n7);
                n3 = n21;
            }
            n7 = n3 + 1;
            if ((n3 = (int)string2.charAt(n3)) >= n17) {
                n3 &= 0x1FFF;
                n21 = 13;
                while (true) {
                    n4 = n7 + 1;
                    if ((n7 = (int)string2.charAt(n7)) < n17) break;
                    n7 = (n7 & 0x1FFF) << n21;
                    n3 |= n7;
                    n21 += 13;
                    n7 = n4;
                }
                n3 |= (n7 <<= n21);
                n7 = n4;
            }
            n21 = n7 + 1;
            if ((n7 = (int)string2.charAt(n7)) >= n17) {
                int n22;
                n7 &= 0x1FFF;
                n4 = 13;
                while (true) {
                    n22 = n21 + 1;
                    if ((n21 = (int)string2.charAt(n21)) < n17) break;
                    n21 = (n21 & 0x1FFF) << n4;
                    n7 |= n21;
                    n4 += 13;
                    n21 = n22;
                }
                n7 |= (n21 <<= n4);
                n21 = n22;
            }
            n3 = n7 + n8 + n3;
            nArray = new int[n3];
            n4 = n20 + n20 + n16;
            n16 = n20;
            n20 = n21;
            int n24 = n8;
            n8 = n14;
            n14 = n24;
        }
        Object object3 = zzb;
        Object[] objectArray2 = zzgg2.zze();
        Object object4 = zzgg2.zza();
        clazz = object4.getClass();
        int n25 = n10 * 3;
        int[] nArray2 = new int[n25];
        n10 += n10;
        objectArray = new Object[n10];
        int n26 = n7 + n14;
        int n27 = n7;
        int n28 = n26;
        n14 = 0;
        zzfw2 = null;
        int n29 = 0;
        while (true) {
            int n30;
            int n32;
            int n34;
            int n35;
            int n36;
            Object[] objectArray3;
            void var46_76;
            block54: {
                long l2;
                block60: {
                    block58: {
                        block55: {
                            block61: {
                                Object object5;
                                block56: {
                                    Object object6;
                                    block57: {
                                        int n37;
                                        block59: {
                                            Object object7;
                                            void var34_43;
                                            block50: {
                                                void var34_46;
                                                void var22_26;
                                                Object object8;
                                                int n38;
                                                block52: {
                                                    block53: {
                                                        block51: {
                                                            if (n20 >= n19) {
                                                                var46_76 = var34_43;
                                                                objectArray3 = objectArray;
                                                                n36 = n8;
                                                                n35 = n7;
                                                                n7 = n15;
                                                                zzfw2 = zzgg2.zza();
                                                                n25 = n15;
                                                                n15 = n8;
                                                                int[] nArray3 = nArray;
                                                                n3 = n35;
                                                                n7 = n26;
                                                                object3 = zzgb2;
                                                                object = zzfk2;
                                                                zzgy zzgy3 = zzgy2;
                                                                object4 = zzel2;
                                                                return new zzfz((int[])var34_43, objectArray, n25, n8, zzfw2, bl2, false, nArray, n35, n26, zzgb2, zzfk2, zzgy2, zzel2, zzfr2, null);
                                                            }
                                                            n35 = n20 + 1;
                                                            if ((n20 = (int)string2.charAt(n20)) >= n17) {
                                                                n20 &= 0x1FFF;
                                                                n34 = n35;
                                                                n35 = 13;
                                                                while (true) {
                                                                    n32 = n34 + 1;
                                                                    if ((n34 = (int)string2.charAt(n34)) < n17) break;
                                                                    n34 = (n34 & 0x1FFF) << n35;
                                                                    n20 |= n34;
                                                                    n35 += 13;
                                                                    n34 = n32;
                                                                }
                                                                n20 |= (n34 <<= n35);
                                                                n34 = n32;
                                                            } else {
                                                                n34 = n35;
                                                            }
                                                            n35 = n34 + 1;
                                                            n34 = string2.charAt(n34);
                                                            if (n34 >= n17) {
                                                                n34 &= 0x1FFF;
                                                                n17 = n35;
                                                                n35 = 13;
                                                                while (true) {
                                                                    n38 = n17 + 1;
                                                                    n17 = string2.charAt(n17);
                                                                    n30 = n19;
                                                                    n19 = 55296;
                                                                    if (n17 < n19) break;
                                                                    n19 = (n17 & 0x1FFF) << n35;
                                                                    n34 |= n19;
                                                                    n35 += 13;
                                                                    n17 = n38;
                                                                    n19 = n30;
                                                                }
                                                                n19 = n17 << n35;
                                                                n34 |= n19;
                                                                n19 = n38;
                                                            } else {
                                                                n30 = n19;
                                                                n19 = n35;
                                                            }
                                                            n17 = n34 & 0xFF;
                                                            n35 = n7;
                                                            n7 = n34 & 0x400;
                                                            if (n7 != 0) {
                                                                n7 = n29 + 1;
                                                                nArray[n29] = n14;
                                                                n29 = n7;
                                                            }
                                                            if (n17 < (n7 = 51)) break block50;
                                                            n7 = n19 + 1;
                                                            n19 = string2.charAt(n19);
                                                            n38 = n7;
                                                            n7 = 55296;
                                                            if (n19 >= n7) {
                                                                int n39;
                                                                n19 &= 0x1FFF;
                                                                n7 = n38;
                                                                n38 = 13;
                                                                while (true) {
                                                                    n39 = n7 + 1;
                                                                    n7 = string2.charAt(n7);
                                                                    n36 = n8;
                                                                    n8 = 55296;
                                                                    if (n7 < n8) break;
                                                                    n8 = (n7 & 0x1FFF) << n38;
                                                                    n19 |= n8;
                                                                    n38 += 13;
                                                                    n7 = n39;
                                                                    n8 = n36;
                                                                }
                                                                n8 = n7 << n38;
                                                                n19 |= n8;
                                                                n7 = n39;
                                                            } else {
                                                                n36 = n8;
                                                                n7 = n38;
                                                            }
                                                            n8 = n17 + -51;
                                                            n38 = n7;
                                                            n7 = 9;
                                                            if (n8 == n7 || n8 == (n7 = 17)) break block51;
                                                            n7 = 12;
                                                            if (n8 != n7 || bl2) break block52;
                                                            n8 = n14 / 3;
                                                            n7 = n4 + 1;
                                                            n8 = n8 + n8 + 1;
                                                            objectArray[n8] = object = objectArray2[n4];
                                                            break block53;
                                                        }
                                                        n8 = n14 / 3;
                                                        n7 = n4 + 1;
                                                        n8 = n8 + n8 + 1;
                                                        objectArray[n8] = object = objectArray2[n4];
                                                    }
                                                    n4 = n7;
                                                }
                                                if ((n7 = (object8 = objectArray2[n19 += n19]) instanceof Field) != 0) {
                                                    Field field = (Field)object8;
                                                } else {
                                                    String string3 = (String)object8;
                                                    Field field = zzfz.zzA(clazz, string3);
                                                    objectArray2[n19] = field;
                                                }
                                                var46_76 = var34_43;
                                                n7 = n15;
                                                l2 = ((Unsafe)object3).objectFieldOffset((Field)var22_26);
                                                n15 = (int)l2;
                                                Object object9 = objectArray2[++n19];
                                                n8 = object9 instanceof Field;
                                                if (n8 != 0) {
                                                    Field field = (Field)object9;
                                                } else {
                                                    String string4 = (String)object9;
                                                    Field field = zzfz.zzA(clazz, string4);
                                                    objectArray2[n19] = field;
                                                }
                                                n19 = n15;
                                                l2 = ((Unsafe)object3).objectFieldOffset((Field)var34_46);
                                                n15 = (int)l2;
                                                objectArray3 = objectArray;
                                                n8 = n4;
                                                n32 = n38;
                                                n10 = n16;
                                                n4 = n15;
                                                n15 = n19;
                                                n19 = 0;
                                                break block54;
                                            }
                                            var46_76 = var34_43;
                                            n7 = n15;
                                            n36 = n8;
                                            n25 = n4 + 1;
                                            object2 = (String)objectArray2[n4];
                                            object2 = zzfz.zzA(clazz, (String)object2);
                                            n8 = 9;
                                            if (n17 == n8 || n17 == (n8 = 17)) break block55;
                                            n8 = 27;
                                            if (n17 == n8 || n17 == (n8 = 49)) break block56;
                                            n8 = 12;
                                            if (n17 == n8 || n17 == (n8 = 30) || n17 == (n8 = 44)) break block57;
                                            n8 = 50;
                                            if (n17 != n8) break block58;
                                            n8 = n27 + 1;
                                            nArray[n27] = n14;
                                            n27 = n14 / 3;
                                            n27 += n27;
                                            n37 = n4 + 2;
                                            objectArray[n27] = object7 = objectArray2[n25];
                                            n25 = n34 & 0x800;
                                            if (n25 == 0) break block59;
                                            n25 = n4 + 3;
                                            objectArray[++n27] = object = objectArray2[n37];
                                            n27 = n8;
                                            break block58;
                                        }
                                        n27 = n8;
                                        n8 = n37;
                                        break block60;
                                    }
                                    if (bl2) break block58;
                                    n8 = n14 / 3;
                                    n4 += 2;
                                    n8 = n8 + n8 + 1;
                                    objectArray[n8] = object6 = objectArray2[n25];
                                    break block61;
                                }
                                n8 = n14 / 3;
                                n4 += 2;
                                n8 = n8 + n8 + 1;
                                objectArray[n8] = object5 = objectArray2[n25];
                            }
                            n8 = n4;
                            break block60;
                        }
                        n8 = n14 / 3;
                        n8 = n8 + n8 + 1;
                        objectArray[n8] = object = ((Field)object2).getType();
                    }
                    n8 = n25;
                }
                l2 = ((Unsafe)object3).objectFieldOffset((Field)object2);
                n15 = (int)l2;
                n25 = n34 & 0x1000;
                n4 = 1048575;
                objectArray3 = objectArray;
                n10 = 4096;
                if (n25 == n10 && n17 <= (n25 = 17)) {
                    void var34_57;
                    n25 = n19 + 1;
                    if ((n19 = (int)string2.charAt(n19)) >= (n10 = 55296)) {
                        n19 &= 0x1FFF;
                        n4 = 13;
                        while (true) {
                            n32 = n25 + 1;
                            if ((n25 = (int)string2.charAt(n25)) < n10) break;
                            n25 = (n25 & 0x1FFF) << n4;
                            n19 |= n25;
                            n4 += 13;
                            n25 = n32;
                        }
                        n19 |= (n25 <<= n4);
                    } else {
                        n32 = n25;
                    }
                    n25 = n16 + n16;
                    n4 = n19 / 32 + n25;
                    Object object10 = objectArray2[n4];
                    n10 = object10 instanceof Field;
                    if (n10 != 0) {
                        Field field = (Field)object10;
                    } else {
                        String string5 = (String)object10;
                        Field field = zzfz.zzA(clazz, string5);
                        objectArray2[n4] = field;
                    }
                    n10 = n16;
                    long l3 = ((Unsafe)object3).objectFieldOffset((Field)var34_57);
                    n25 = (int)l3;
                    n19 %= 32;
                    n4 = n25;
                } else {
                    n10 = n16;
                    n32 = n19;
                    n19 = 0;
                }
                n16 = 18;
                if (n17 >= n16 && n17 <= (n16 = 49)) {
                    n16 = n28 + 1;
                    nArray[n28] = n15;
                    n28 = n16;
                }
            }
            n16 = n14 + 1;
            var46_76[n14] = n20;
            n20 = n14 + 2;
            n25 = n34 & 0x200;
            if (n25 != 0) {
                n25 = 0x20000000;
            } else {
                n25 = 0;
                Object var34_62 = null;
            }
            n34 = (n34 &= 0x100) != 0 ? 0x10000000 : 0;
            n34 |= n25;
            var46_76[n16] = n34 = n34 | (n17 <<= 20) | n15;
            n14 += 3;
            var46_76[n20] = n19 = n19 << 20 | n4;
            n16 = n10;
            n4 = n8;
            n15 = n7;
            n7 = n35;
            n20 = n32;
            n19 = n30;
            objectArray = objectArray3;
            void var34_64 = var46_76;
            n8 = n36;
            n17 = 55296;
        }
    }

    private static int zzl(Object object, long l2) {
        return (Integer)zzhi.zzf(object, l2);
    }

    private final int zzm(Object object, byte[] object2, int n3, int n4, int n7, long l2, zzds zzds2) {
        Object object3;
        object2 = zzb;
        Object object4 = this.zzz(n7);
        Object object5 = object3 = ((Unsafe)object2).getObject(object, l2);
        object5 = (zzfq)object3;
        n7 = (int)(((zzfq)object5).zze() ? 1 : 0);
        if (n7 == 0) {
            object5 = zzfq.zza().zzb();
            zzfr.zza(object5, object3);
            ((Unsafe)object2).putObject(object, l2, object5);
        }
        object4 = (zzfp)object4;
        throw null;
    }

    private final int zzn(Object object, byte[] byArray, int n3, int n4, int n7, int n8, int n10, int n14, int n15, long l2, int n16, zzds zzds2) {
        long l3;
        Unsafe unsafe;
        block33: {
            int n17;
            block32: {
                Object object2 = object;
                Object object3 = byArray;
                int n18 = n3;
                n17 = n7;
                int n19 = n8;
                int n20 = n10;
                long l4 = l2;
                int n21 = n16;
                zzds zzds3 = zzds2;
                unsafe = zzb;
                Object object4 = this.zzc;
                int n22 = n16 + 2;
                int n24 = object4[n22];
                n22 = 1048575;
                l3 = n24 & n22;
                n24 = 5;
                int n25 = 2;
                switch (n15) {
                    default: {
                        break;
                    }
                    case 68: {
                        Object object5;
                        n24 = 3;
                        if (n10 != n24) break;
                        zzgh zzgh2 = this.zzy(n16);
                        n21 = n7 & 0xFFFFFFF8 | 4;
                        zzgh zzgh3 = zzgh2;
                        n20 = n4;
                        object4 = zzds2;
                        n17 = zzdt.zzc(zzgh2, byArray, n3, n4, n21, zzds2);
                        int n26 = unsafe.getInt(object, l3);
                        if (n26 == n8) {
                            object5 = unsafe.getObject(object, l2);
                        } else {
                            n25 = 0;
                            object5 = null;
                        }
                        if (object5 == null) {
                            object3 = zzds3.zzc;
                            unsafe.putObject(object2, l4, object3);
                        } else {
                            object3 = zzds3.zzc;
                            object3 = zzez.zzg(object5, object3);
                            unsafe.putObject(object2, l4, object3);
                        }
                        unsafe.putInt(object2, l3, n19);
                        break block32;
                    }
                    case 67: {
                        if (n10 != 0) break;
                        n17 = zzdt.zzm(byArray, n3, zzds2);
                        object3 = zzei.zzc(zzds2.zzb);
                        unsafe.putObject(object, l2, object3);
                        unsafe.putInt(object, l3, n8);
                        return n17;
                    }
                    case 66: {
                        if (n10 != 0) break;
                        n17 = zzdt.zzj(byArray, n3, zzds2);
                        object3 = zzei.zzb(zzds2.zza);
                        unsafe.putObject(object, l2, object3);
                        unsafe.putInt(object, l3, n8);
                        return n17;
                    }
                    case 63: {
                        if (n10 != 0) break;
                        int n27 = zzdt.zzj(byArray, n3, zzds2);
                        n18 = zzds2.zza;
                        zzex zzex2 = this.zzx(n16);
                        if (zzex2 != null && (n20 = (int)(zzex2.zza() ? 1 : 0)) == 0) {
                            object2 = zzfz.zzc(object);
                            long l7 = n18;
                            Long l8 = l7;
                            ((zzgz)object2).zzf(n7, l8);
                        } else {
                            Integer n28 = n18;
                            unsafe.putObject(object2, l4, n28);
                            unsafe.putInt(object2, l3, n19);
                        }
                        n17 = n27;
                        break block32;
                    }
                    case 61: {
                        if (n10 != n25) break;
                        n17 = zzdt.zza(byArray, n3, zzds2);
                        object3 = zzds2.zzc;
                        unsafe.putObject(object, l2, object3);
                        unsafe.putInt(object, l3, n8);
                        return n17;
                    }
                    case 60: {
                        Object object6;
                        if (n10 != n25) break;
                        zzgh zzgh4 = this.zzy(n16);
                        n20 = n4;
                        n17 = zzdt.zzd(zzgh4, byArray, n3, n4, zzds2);
                        int n29 = unsafe.getInt(object, l3);
                        if (n29 == n8) {
                            object6 = unsafe.getObject(object, l2);
                        } else {
                            n25 = 0;
                            object6 = null;
                        }
                        if (object6 == null) {
                            object3 = zzds3.zzc;
                            unsafe.putObject(object2, l4, object3);
                        } else {
                            object3 = zzds3.zzc;
                            object3 = zzez.zzg(object6, object3);
                            unsafe.putObject(object2, l4, object3);
                        }
                        unsafe.putInt(object2, l3, n19);
                        break block32;
                    }
                    case 59: {
                        if (n10 != n25) break;
                        n17 = zzdt.zzj(byArray, n3, zzds2);
                        n18 = zzds2.zza;
                        if (n18 == 0) {
                            object3 = "";
                            unsafe.putObject(object, l2, object3);
                        } else {
                            n20 = n14 & 0x20000000;
                            if (n20 != 0) {
                                n20 = n17 + n18;
                                if ((n20 = (int)(zzhm.zzd(byArray, n17, n20) ? 1 : 0)) == 0) {
                                    throw zzfa.zzb();
                                }
                            }
                            Charset charset = zzez.zzb;
                            String string2 = new String((byte[])object3, n17, n18, charset);
                            unsafe.putObject(object2, l4, string2);
                            n17 += n18;
                        }
                        unsafe.putInt(object2, l3, n19);
                        break block32;
                    }
                    case 58: {
                        if (n10 != 0) break;
                        n17 = zzdt.zzm(byArray, n3, zzds2);
                        long l12 = zzds2.zzb;
                        long l14 = 0L;
                        long l15 = l12 - l14;
                        n24 = (int)(l15 == 0L ? 0 : (l15 < 0L ? -1 : 1));
                        if (n24 != 0) {
                            n25 = 1;
                        } else {
                            n25 = 0;
                            Object var34_43 = null;
                        }
                        object3 = n25 != 0;
                        unsafe.putObject(object2, l4, object3);
                        unsafe.putInt(object2, l3, n19);
                        return n17;
                    }
                    case 57: 
                    case 64: {
                        if (n10 != n24) break;
                        Integer n30 = zzdt.zzb(byArray, n3);
                        unsafe.putObject(object, l2, n30);
                        unsafe.putInt(object, l3, n8);
                        return n3 + 4;
                    }
                    case 56: 
                    case 65: {
                        n17 = 1;
                        if (n10 != n17) break;
                        Long l16 = zzdt.zzn(byArray, n3);
                        unsafe.putObject(object, l2, l16);
                        unsafe.putInt(object, l3, n8);
                        return n3 + 8;
                    }
                    case 55: 
                    case 62: {
                        if (n10 != 0) break;
                        n17 = zzdt.zzj(byArray, n3, zzds2);
                        object3 = zzds2.zza;
                        unsafe.putObject(object, l2, object3);
                        unsafe.putInt(object, l3, n8);
                        return n17;
                    }
                    case 53: 
                    case 54: {
                        if (n10 != 0) break;
                        n17 = zzdt.zzm(byArray, n3, zzds2);
                        object3 = zzds2.zzb;
                        unsafe.putObject(object, l2, object3);
                        unsafe.putInt(object, l3, n8);
                        return n17;
                    }
                    case 52: {
                        if (n10 != n24) break;
                        Float f5 = Float.valueOf(Float.intBitsToFloat(zzdt.zzb(byArray, n3)));
                        unsafe.putObject(object, l2, f5);
                        unsafe.putInt(object, l3, n8);
                        return n3 + 4;
                    }
                    case 51: {
                        n17 = 1;
                        if (n10 == n17) break block33;
                    }
                }
                n17 = n18;
            }
            return n17;
        }
        Double d2 = Double.longBitsToDouble(zzdt.zzn(byArray, n3));
        unsafe.putObject(object, l2, d2);
        unsafe.putInt(object, l3, n8);
        return n3 + 8;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final int zzo(Object var1_1, byte[] var2_2, int var3_3, int var4_4, zzds var5_5) {
        var6_6 = this;
        var7_7 = var1_1;
        var8_8 = var2_2;
        var9_9 = var4_4;
        var10_10 = var5_5;
        var11_11 = zzfz.zzb;
        var12_12 = 1048575;
        var13_13 = -1;
        var14_14 = var3_3;
        var15_15 = -1;
        var16_16 = 0;
        var17_17 /* !! */  = null;
        var18_18 = 0;
        var19_19 = 1048575;
        block15: while (var14_14 < var9_9) {
            block42: {
                block47: {
                    block46: {
                        block45: {
                            block44: {
                                block43: {
                                    var20_20 = var14_14 + 1;
                                    if ((var14_14 = var8_8[var14_14]) < 0) {
                                        var14_14 = zzdt.zzk(var14_14, var8_8, var20_20, var10_10);
                                        var20_20 = var10_10.zza;
                                        var21_21 = var14_14;
                                        var22_22 = var20_20;
                                    } else {
                                        var22_22 = var14_14;
                                        var21_21 = var20_20;
                                    }
                                    var23_23 = var22_22 >>> 3;
                                    var20_20 = var22_22 & 7;
                                    if (var23_23 > var15_15) {
                                        var14_14 = var6_6.zzr(var23_23, var16_16 /= 3);
lbl29:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var14_14 = var6_6.zzq(var23_23);
                                    ** continue;
                                    var16_16 = var14_14;
                                    if (var14_14 != var13_13) break block43;
                                    var16_16 = var21_21;
                                    var24_24 = var23_23;
                                    var25_25 = var11_11;
                                    var26_26 = 0;
                                    break block42;
                                }
                                var27_27 = var6_6.zzc;
                                var15_15 = var14_14 + 1;
                                var15_15 = var27_27[var15_15];
                                var13_13 = zzfz.zzu(var15_15);
                                var3_3 = var23_23;
                                var28_28 = var15_15 & var12_12;
                                var23_23 = 17;
                                var30_29 = var28_28;
                                if (var13_13 > var23_23) break block44;
                                var23_23 = var14_14 + 2;
                                var14_14 = var27_27[var23_23];
                                var23_23 = var14_14 >>> 20;
                                var32_30 = 1;
                                var33_31 = var32_30 << var23_23;
                                var23_23 = 1048575;
                                if ((var14_14 &= var23_23) != var19_19) {
                                    if (var19_19 != var23_23) {
                                        var28_28 = var19_19;
                                        var11_11.putInt(var7_7, var28_28, var18_18);
                                    }
                                    if (var14_14 != var23_23) {
                                        var34_32 = var14_14;
                                        var18_18 = var11_11.getInt(var7_7, var34_32);
                                    }
                                    var19_19 = var14_14;
                                }
                                var14_14 = 5;
                                var36_33 = 7.0E-45f;
                                block0 : switch (var13_13) {
                                    default: {
                                        var24_24 = var3_3;
                                        var10_10 = var5_5;
                                        var12_12 = var16_16;
                                        var13_13 = var21_21;
                                        var26_26 = 1048575;
                                        break;
                                    }
                                    case 16: {
                                        if (var20_20 == 0) {
                                            var10_10 = var5_5;
                                            var37_34 = var30_29;
                                            var13_13 = zzdt.zzm(var8_8, var21_21, var5_5);
                                            var39_35 = zzei.zzc(var5_5.zzb);
                                            var41_36 = var30_29;
                                            var27_27 = var11_11;
                                            var43_37 /* !! */  = (byte[])var1_1;
                                            var12_12 = var16_16;
                                            var44_38 = var30_29;
                                            var24_24 = var3_3;
                                            var26_26 = 1048575;
                                            var46_39 = var39_35;
                                            var11_11.putLong(var1_1, var30_29, var39_35);
lbl89:
                                            // 2 sources

                                            while (true) {
                                                var18_18 |= var33_31;
                                                var14_14 = var13_13;
lbl92:
                                                // 4 sources

                                                while (true) {
                                                    var16_16 = var12_12;
                                                    var15_15 = var24_24;
lbl95:
                                                    // 2 sources

                                                    while (true) {
                                                        var13_13 = -1;
                                                        var12_12 = 1048575;
                                                        continue block15;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                        var24_24 = var3_3;
                                        var10_10 = var5_5;
                                        var12_12 = var16_16;
                                        var26_26 = 1048575;
lbl103:
                                        // 9 sources

                                        while (true) {
                                            var13_13 = var21_21;
                                            break block0;
                                            break;
                                        }
                                    }
                                    case 15: {
                                        var10_10 = var5_5;
                                        var12_12 = var16_16;
                                        var37_34 = var30_29;
                                        var26_26 = 1048575;
                                        var24_24 = var3_3;
                                        if (var20_20 != 0) ** GOTO lbl103
                                        var16_16 = zzdt.zzj(var8_8, var21_21, var5_5);
                                        var20_20 = zzei.zzb(var5_5.zza);
                                        var11_11.putInt(var7_7, var30_29, var20_20);
lbl116:
                                        // 5 sources

                                        while (true) {
                                            var18_18 |= var33_31;
                                            var14_14 = var16_16;
                                            ** GOTO lbl92
                                            break;
                                        }
                                    }
                                    case 12: {
                                        var10_10 = var5_5;
                                        var12_12 = var16_16;
                                        var37_34 = var30_29;
                                        var26_26 = 1048575;
                                        var24_24 = var3_3;
                                        if (var20_20 != 0) ** GOTO lbl103
                                        var16_16 = zzdt.zzj(var8_8, var21_21, var5_5);
                                        var20_20 = var5_5.zza;
                                        var11_11.putInt(var7_7, var30_29, var20_20);
                                        ** GOTO lbl116
                                    }
                                    case 10: {
                                        var10_10 = var5_5;
                                        var12_12 = var16_16;
                                        var37_34 = var30_29;
                                        var16_16 = 2;
                                        var26_26 = 1048575;
                                        var24_24 = var3_3;
                                        if (var20_20 != var16_16) ** GOTO lbl103
                                        var16_16 = zzdt.zza(var8_8, var21_21, var5_5);
                                        var48_40 = var5_5.zzc;
                                        var11_11.putObject(var7_7, var30_29, var48_40);
                                        ** GOTO lbl116
                                    }
                                    case 9: {
                                        var10_10 = var5_5;
                                        var12_12 = var16_16;
                                        var37_34 = var30_29;
                                        var16_16 = 2;
                                        var26_26 = 1048575;
                                        var24_24 = var3_3;
                                        if (var20_20 != var16_16) ** GOTO lbl103
                                        var17_17 /* !! */  = (byte[])var6_6.zzy(var12_12);
                                        var16_16 = zzdt.zzd((zzgh)var17_17 /* !! */ , var8_8, var21_21, var9_9, var5_5);
                                        var48_40 = var11_11.getObject(var7_7, var30_29);
                                        if (var48_40 != null) ** GOTO lbl158
                                        var48_40 = var5_5.zzc;
                                        var11_11.putObject(var7_7, var30_29, var48_40);
                                        ** GOTO lbl116
lbl158:
                                        // 1 sources

                                        var49_41 = var5_5.zzc;
                                        var48_40 = zzez.zzg(var48_40, var49_41);
                                        var11_11.putObject(var7_7, var30_29, var48_40);
                                        ** continue;
                                    }
                                    case 8: {
                                        var10_10 = var5_5;
                                        var12_12 = var16_16;
                                        var50_42 = var30_29;
                                        var14_14 = 2;
                                        var36_33 = 2.8E-45f;
                                        var26_26 = 1048575;
                                        var24_24 = var3_3;
                                        if (var20_20 != var14_14) ** GOTO lbl103
                                        var36_33 = 1.0842022E-19f;
                                        var14_14 = 0x20000000 & var15_15;
                                        var14_14 = var14_14 == 0 ? zzdt.zzg(var8_8, var21_21, var5_5) : zzdt.zzh(var8_8, var21_21, var5_5);
                                        var43_37 /* !! */  = (byte[])var10_10.zzc;
                                        var44_38 = var50_42;
                                        var11_11.putObject(var7_7, var50_42, var43_37 /* !! */ );
lbl177:
                                        // 6 sources

                                        while (true) {
                                            var18_18 |= var33_31;
                                            ** GOTO lbl92
                                            break;
                                        }
                                    }
                                    case 7: {
                                        var10_10 = var5_5;
                                        var12_12 = var16_16;
                                        var52_43 = var30_29;
                                        var26_26 = 1048575;
                                        var24_24 = var3_3;
                                        if (var20_20 != 0) ** GOTO lbl103
                                        var14_14 = zzdt.zzm(var8_8, var21_21, var5_5);
                                        var41_36 = var5_5.zzb;
                                        var39_35 = 0L;
                                        cfr_temp_0 = var41_36 - var39_35;
                                        var23_23 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                        if (var23_23 != 0) {
                                            var20_20 = 1;
                                        } else {
                                            var20_20 = 0;
                                            var48_40 = null;
                                        }
                                        zzhi.zzk(var7_7, var52_43, (boolean)var20_20);
                                        ** GOTO lbl177
                                    }
                                    case 6: 
                                    case 13: {
                                        var10_10 = var5_5;
                                        var12_12 = var16_16;
                                        var52_43 = var30_29;
                                        var26_26 = 1048575;
                                        var24_24 = var3_3;
                                        if (var20_20 != var14_14) ** GOTO lbl103
                                        var14_14 = zzdt.zzb(var8_8, var21_21);
                                        var11_11.putInt(var7_7, var30_29, var14_14);
                                        var14_14 = var21_21 + 4;
                                        ** GOTO lbl177
                                    }
                                    case 5: 
                                    case 14: {
                                        var10_10 = var5_5;
                                        var12_12 = var16_16;
                                        var52_43 = var30_29;
                                        var14_14 = 1;
                                        var36_33 = 1.4E-45f;
                                        var26_26 = 1048575;
                                        var24_24 = var3_3;
                                        if (var20_20 == var14_14) ** break;
                                        ** continue;
                                        var39_35 = zzdt.zzn(var8_8, var21_21);
                                        var27_27 = var11_11;
                                        var44_38 = var30_29;
                                        var43_37 /* !! */  = (byte[])var1_1;
                                        var13_13 = var21_21;
                                        var46_39 = var39_35;
                                        var11_11.putLong(var1_1, var30_29, var39_35);
lbl227:
                                        // 2 sources

                                        while (true) {
                                            var14_14 = var13_13 + 8;
                                            ** GOTO lbl177
                                            break;
                                        }
                                    }
                                    case 4: 
                                    case 11: {
                                        var10_10 = var5_5;
                                        var12_12 = var16_16;
                                        var13_13 = var21_21;
                                        var46_39 = var30_29;
                                        var26_26 = 1048575;
                                        var24_24 = var3_3;
                                        if (var20_20 != 0) break;
                                        var14_14 = zzdt.zzj(var8_8, var21_21, var5_5);
                                        var15_15 = var5_5.zza;
                                        var11_11.putInt(var7_7, var30_29, var15_15);
                                        ** GOTO lbl177
                                    }
                                    case 2: 
                                    case 3: {
                                        var10_10 = var5_5;
                                        var12_12 = var16_16;
                                        var13_13 = var21_21;
                                        var46_39 = var30_29;
                                        var26_26 = 1048575;
                                        var24_24 = var3_3;
                                        if (var20_20 != 0) break;
                                        var13_13 = zzdt.zzm(var8_8, var21_21, var5_5);
                                        var44_38 = var5_5.zzb;
                                        var27_27 = var11_11;
                                        var43_37 /* !! */  = (byte[])var1_1;
                                        var39_35 = var44_38;
                                        var44_38 = var30_29;
                                        var46_39 = var39_35;
                                        var11_11.putLong(var1_1, var30_29, var39_35);
                                        ** continue;
                                    }
                                    case 1: {
                                        var10_10 = var5_5;
                                        var12_12 = var16_16;
                                        var13_13 = var21_21;
                                        var46_39 = var30_29;
                                        var26_26 = 1048575;
                                        var24_24 = var3_3;
                                        if (var20_20 != var14_14) break;
                                        var36_33 = Float.intBitsToFloat(zzdt.zzb(var8_8, var21_21));
                                        zzhi.zzm(var7_7, var30_29, var36_33);
                                        var14_14 = var21_21 + 4;
                                        ** continue;
                                    }
                                    case 0: {
                                        var10_10 = var5_5;
                                        var12_12 = var16_16;
                                        var13_13 = var21_21;
                                        var46_39 = var30_29;
                                        var14_14 = 1;
                                        var36_33 = 1.4E-45f;
                                        var26_26 = 1048575;
                                        var24_24 = var3_3;
                                        if (var20_20 != var14_14) break;
                                        var37_34 = zzdt.zzn(var8_8, var21_21);
                                        var54_44 = Double.longBitsToDouble(var37_34);
                                        zzhi.zzl(var7_7, var30_29, var54_44);
                                        ** continue;
                                    }
                                }
                                var16_16 = var13_13;
                                var25_25 = var11_11;
                                var26_26 = var12_12;
                                break block42;
                            }
                            var10_10 = var5_5;
                            var12_12 = var14_14;
                            var16_16 = var21_21;
                            var46_39 = var28_28;
                            var26_26 = 1048575;
                            var24_24 = var3_3;
                            var14_14 = 27;
                            var36_33 = 3.8E-44f;
                            if (var13_13 != var14_14) break block45;
                            var14_14 = 2;
                            var36_33 = 2.8E-45f;
                            if (var20_20 == var14_14) {
                                var27_27 = (zzey)var11_11.getObject(var7_7, var28_28);
                                var15_15 = (int)var27_27.zzc();
                                if (var15_15 == 0) {
                                    var15_15 = var27_27.size();
                                    var15_15 = var15_15 == 0 ? 10 : (var15_15 += var15_15);
                                    var27_27 = var27_27.zzd(var15_15);
                                    var11_11.putObject(var7_7, var46_39, var27_27);
                                }
                                var56_45 = var27_27;
                                var27_27 = var6_6.zzy(var12_12);
                                var15_15 = var22_22;
                                var20_20 = var16_16;
                                var17_17 /* !! */  = var2_2;
                                var21_21 = var4_4;
                                var13_13 = var18_18;
                                var14_14 = zzdt.zze((zzgh)var27_27, var22_22, var2_2, var16_16, var4_4, (zzey)var56_45, var5_5);
                                ** continue;
                            }
                            var57_46 = var21_21;
                            var58_47 = var18_18;
                            var59_48 = var19_19;
                            var25_25 = var11_11;
                            var26_26 = var12_12;
                            break block46;
                        }
                        var14_14 = 49;
                        var36_33 = 6.9E-44f;
                        if (var13_13 <= var14_14) {
                            var39_35 = var37_34 = (long)var15_15;
                            var27_27 = this;
                            var43_37 /* !! */  = (byte[])var1_1;
                            var3_3 = var21_21;
                            var17_17 /* !! */  = var2_2;
                            var33_31 = var20_20;
                            var20_20 = var21_21;
                            var50_42 = var28_28;
                            var21_21 = var4_4;
                            var23_23 = var22_22;
                            var59_48 = var18_18;
                            var18_18 = var24_24;
                            var58_47 = var59_48;
                            var59_48 = var19_19;
                            var19_19 = var33_31;
                            var60_49 = var13_13;
                            var13_13 = var12_12;
                            var25_25 = var11_11;
                            var26_26 = var12_12;
                            var32_30 = var60_49;
                            var7_7 = var5_5;
                            var14_14 = this.zzp(var1_1, var2_2, var16_16, var4_4, var22_22, var24_24, var33_31, var12_12, var37_34, var60_49, var28_28, var5_5);
                            var57_46 = var16_16;
                            if (var14_14 != var16_16) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    var7_7 = var1_1;
                                    var8_8 = var2_2;
                                    var9_9 = var4_4;
                                    var10_10 = var5_5;
                                    var19_19 = var59_48;
                                    var15_15 = var24_24;
                                    var18_18 = var58_47;
                                    var16_16 = var26_26;
                                    var11_11 = var25_25;
                                    var13_13 = -1;
                                    var12_12 = 1048575;
                                    var6_6 = this;
                                    continue block15;
                                    break;
                                }
                            }
lbl366:
                            // 4 sources

                            while (true) {
                                var16_16 = var14_14;
lbl368:
                                // 2 sources

                                while (true) {
                                    var19_19 = var59_48;
                                    var18_18 = var58_47;
                                    break block42;
                                    break;
                                }
                                break;
                            }
                        }
                        var57_46 = var21_21;
                        var33_31 = var20_20;
                        var50_42 = var28_28;
                        var58_47 = var18_18;
                        var59_48 = var19_19;
                        var60_49 = var13_13;
                        var25_25 = var11_11;
                        var26_26 = var12_12;
                        var14_14 = 50;
                        var36_33 = 7.0E-44f;
                        if (var13_13 != var14_14) break block47;
                        var19_19 = var20_20;
                        var14_14 = 2;
                        var36_33 = 2.8E-45f;
                        if (var20_20 != var14_14) break block46;
                        var27_27 = this;
                        var43_37 /* !! */  = (byte[])var1_1;
                        var17_17 /* !! */  = var2_2;
                        var20_20 = var21_21;
                        var21_21 = var4_4;
                        var23_23 = var12_12;
                        var34_32 = var28_28;
                        var14_14 = this.zzm(var1_1, var2_2, var16_16, var4_4, var12_12, var28_28, var5_5);
                        if (var14_14 == var16_16) ** GOTO lbl366
                        ** GOTO lbl-1000
                    }
                    var16_16 = var57_46;
                    ** continue;
                }
                var19_19 = var20_20;
                var27_27 = this;
                var13_13 = var15_15;
                var43_37 /* !! */  = (byte[])var1_1;
                var17_17 /* !! */  = var2_2;
                var20_20 = var21_21;
                var21_21 = var4_4;
                var23_23 = var22_22;
                var18_18 = var3_3;
                var14_14 = this.zzn(var1_1, var2_2, var16_16, var4_4, var22_22, var3_3, var33_31, var15_15, var60_49, var28_28, var12_12, var5_5);
                if (var14_14 != var16_16) ** break;
                ** continue;
                ** continue;
            }
            var49_41 = zzfz.zzc(var1_1);
            var14_14 = var22_22;
            var43_37 /* !! */  = var2_2;
            var20_20 = var4_4;
            var56_45 = var5_5;
            var14_14 = zzdt.zzi(var22_22, var2_2, var16_16, var4_4, (zzgz)var49_41, var5_5);
            var6_6 = this;
            var7_7 = var1_1;
            var8_8 = var2_2;
            var9_9 = var4_4;
            var10_10 = var5_5;
            var15_15 = var24_24;
            var16_16 = var26_26;
            var11_11 = var25_25;
            ** continue;
        }
        var58_47 = var18_18;
        var59_48 = var19_19;
        var25_25 = var11_11;
        var15_15 = 1048575;
        if (var19_19 != var15_15) {
            var52_43 = var19_19;
            var48_40 = var1_1;
            var49_41 = var11_11;
            var11_11.putInt(var1_1, var52_43, var18_18);
        }
        var15_15 = var4_4;
        if (var14_14 == var4_4) {
            return var14_14;
        }
        throw zzfa.zzd();
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final int zzp(Object var1_1, byte[] var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8, long var9_9, int var11_10, long var12_11, zzds var14_12) {
        var15_13 = this;
        var16_14 = var1_1;
        var17_15 /* !! */  = var2_2;
        var18_16 = var3_3;
        var19_17 = var4_4;
        var20_18 = var5_5;
        var21_19 = var7_7;
        var22_20 = var8_8;
        var23_21 = var12_11;
        var25_22 = var14_12;
        var26_23 = zzfz.zzb;
        var27_24 = (zzey)var26_23.getObject(var1_1, var12_11);
        var28_25 = var27_24.zzc();
        if (var28_25 == 0) {
            var28_25 = var27_24.size();
            var28_25 = var28_25 == 0 ? 10 : (var28_25 += var28_25);
            var27_24 = var27_24.zzd(var28_25);
            var26_23.putObject(var16_14, var23_21, var27_24);
        }
        var29_26 = 5;
        var30_27 = 0L;
        var28_25 = 1;
        var32_28 = 2;
        switch (var11_10) {
            default: {
                var33_29 = 3;
                var34_37 = 4.2E-45f;
                if (var21_19 != var33_29) return var18_16;
                var16_14 = this.zzy(var22_20);
                var21_19 = var20_18 & -8 | 4;
                var8_8 = var3_3;
                var18_16 = zzdt.zzc((zzgh)var16_14, var2_2, var3_3, var4_4, var21_19, var14_12);
                var35_40 = var25_22.zzc;
                var27_24.add(var35_40);
                while (var18_16 < var19_17) {
                    var22_20 = zzdt.zzj(var17_15 /* !! */ , var18_16, var25_22);
                    var29_26 = var25_22.zza;
                    if (var20_18 != var29_26) return var18_16;
                    var8_8 = var22_20;
                    var18_16 = zzdt.zzc((zzgh)var16_14, var2_2, var22_20, var4_4, var21_19, var14_12);
                    var35_40 = var25_22.zzc;
                    var27_24.add(var35_40);
                }
                return var18_16;
            }
            case 34: 
            case 48: {
                if (var21_19 == var32_28) {
                    var27_24 = (zzfl)var27_24;
                    var33_29 = zzdt.zzj(var17_15 /* !! */ , var18_16, var25_22);
                    var20_18 = var25_22.zza + var33_29;
                    while (var33_29 < var20_18) {
                        var33_29 = zzdt.zzm(var17_15 /* !! */ , var33_29, var25_22);
                        var36_42 = zzei.zzc(var25_22.zzb);
                        var27_24.zze(var36_42);
                    }
                    if (var33_29 != var20_18) throw zzfa.zzf();
                    return var33_29;
                }
                if (var21_19 != 0) return var18_16;
                var27_24 = (zzfl)var27_24;
                var33_30 = zzdt.zzm(var17_15 /* !! */ , var18_16, var25_22);
                var38_46 = zzei.zzc(var25_22.zzb);
                var27_24.zze(var38_46);
                while (var33_30 < var19_17) {
                    var18_16 = zzdt.zzj(var17_15 /* !! */ , var33_30, var25_22);
                    var21_19 = var25_22.zza;
                    if (var20_18 != var21_19) return var33_30;
                    var33_30 = zzdt.zzm(var17_15 /* !! */ , var18_16, var25_22);
                    var38_46 = zzei.zzc(var25_22.zzb);
                    var27_24.zze(var38_46);
                }
                return var33_30;
            }
            case 33: 
            case 47: {
                if (var21_19 == var32_28) {
                    var27_24 = (zzev)var27_24;
                    var33_29 = zzdt.zzj(var17_15 /* !! */ , var18_16, var25_22);
                    var20_18 = var25_22.zza + var33_29;
                    while (var33_29 < var20_18) {
                        var33_29 = zzdt.zzj(var17_15 /* !! */ , var33_29, var25_22);
                        var18_16 = zzei.zzb(var25_22.zza);
                        var27_24.zze(var18_16);
                    }
                    if (var33_29 != var20_18) throw zzfa.zzf();
                    return var33_29;
                }
                if (var21_19 != 0) return var18_16;
                var27_24 = (zzev)var27_24;
                var33_31 = zzdt.zzj(var17_15 /* !! */ , var18_16, var25_22);
                var18_16 = zzei.zzb(var25_22.zza);
                var27_24.zze(var18_16);
                while (var33_31 < var19_17) {
                    var18_16 = zzdt.zzj(var17_15 /* !! */ , var33_31, var25_22);
                    var21_19 = var25_22.zza;
                    if (var20_18 != var21_19) return var33_31;
                    var33_31 = zzdt.zzj(var17_15 /* !! */ , var18_16, var25_22);
                    var18_16 = zzei.zzb(var25_22.zza);
                    var27_24.zze(var18_16);
                }
                return var33_31;
            }
            case 30: 
            case 44: {
                if (var21_19 == var32_28) {
                    var20_18 = zzdt.zzf(var17_15 /* !! */ , var18_16, var27_24, var25_22);
                } else {
                    if (var21_19 != 0) return var18_16;
                    var20_18 = var5_5;
                    var17_15 /* !! */  = var2_2;
                    var18_16 = var3_3;
                    var19_17 = var4_4;
                    var40_52 = var27_24;
                    var25_22 = var14_12;
                    var20_18 = zzdt.zzl(var5_5, var2_2, var3_3, var4_4, var27_24, var14_12);
                }
                var16_14 = (zzeu)var16_14;
                var17_15 /* !! */  = (byte[])var16_14.zzc;
                var41_55 = zzgz.zza();
                if (var17_15 /* !! */  == var41_55) {
                    var17_15 /* !! */  = null;
                }
                var41_55 = this.zzx(var22_20);
                var42_57 = var15_13.zzm;
                var21_19 = var6_6;
                if ((var17_15 /* !! */  = (byte[])zzgj.zzd(var6_6, var27_24, (zzex)var41_55, var17_15 /* !! */ , var42_57)) == null) {
                    return var20_18;
                }
                var17_15 /* !! */  = (byte[])((zzgz)var17_15 /* !! */ );
                var16_14.zzc = var17_15 /* !! */ ;
                return var20_18;
            }
            case 28: {
                if (var21_19 != var32_28) return var18_16;
                var33_32 = zzdt.zzj(var17_15 /* !! */ , var18_16, var25_22);
                var18_16 = var25_22.zza;
                if (var18_16 < 0) throw zzfa.zzc();
                var21_19 = var17_15 /* !! */ .length - var33_32;
                if (var18_16 > var21_19) throw zzfa.zzf();
                if (var18_16 != 0) ** GOTO lbl136
                var41_56 = zzee.zzb;
                var27_24.add(var41_56);
                ** GOTO lbl141
lbl136:
                // 1 sources

                var40_53 = zzee.zzk(var17_15 /* !! */ , var33_32, var18_16);
                var27_24.add(var40_53);
                while (true) {
                    var33_32 += var18_16;
lbl141:
                    // 3 sources

                    while (var33_32 < var19_17) {
                        var18_16 = zzdt.zzj(var17_15 /* !! */ , var33_32, var25_22);
                        var21_19 = var25_22.zza;
                        if (var20_18 != var21_19) return var33_32;
                        var33_32 = zzdt.zzj(var17_15 /* !! */ , var18_16, var25_22);
                        var18_16 = var25_22.zza;
                        if (var18_16 < 0) throw zzfa.zzc();
                        var21_19 = var17_15 /* !! */ .length - var33_32;
                        if (var18_16 > var21_19) throw zzfa.zzf();
                        if (var18_16 == 0) {
                            var41_56 = zzee.zzb;
                            var27_24.add(var41_56);
                            continue;
                        }
                        ** GOTO lbl157
                    }
                    return var33_32;
lbl157:
                    // 1 sources

                    var40_53 = zzee.zzk(var17_15 /* !! */ , var33_32, var18_16);
                    var27_24.add(var40_53);
                }
            }
            case 27: {
                if (var21_19 != var32_28) return var18_16;
                var16_14 = this.zzy(var22_20);
                var7_7 = var5_5;
                return zzdt.zze((zzgh)var16_14, var5_5, var2_2, var3_3, var4_4, var27_24, var14_12);
            }
            case 26: {
                if (var21_19 != var32_28) return var18_16;
                var43_59 = 2.65249474E-315;
                var38_47 = var9_9 & 0x20000000L;
                var16_14 = "";
                var21_19 = (int)(var38_47 == var30_27 ? 0 : (var38_47 < var30_27 ? -1 : 1));
                if (var21_19 != 0) ** GOTO lbl206
                var18_16 = zzdt.zzj(var17_15 /* !! */ , var18_16, var25_22);
                var21_19 = var25_22.zza;
                if (var21_19 < 0) throw zzfa.zzc();
                if (var21_19 != 0) ** GOTO lbl180
                var27_24.add(var16_14);
                ** GOTO lbl186
lbl180:
                // 1 sources

                var45_61 = zzez.zzb;
                var35_41 = new String(var17_15 /* !! */ , var18_16, var21_19, var45_61);
                var27_24.add(var35_41);
                while (true) {
                    var18_16 += var21_19;
lbl186:
                    // 3 sources

                    while (var18_16 < var19_17) {
                        var21_19 = zzdt.zzj(var17_15 /* !! */ , var18_16, var25_22);
                        var22_20 = var25_22.zza;
                        if (var20_18 != var22_20) return var18_16;
                        var18_16 = zzdt.zzj(var17_15 /* !! */ , var21_19, var25_22);
                        var21_19 = var25_22.zza;
                        if (var21_19 < 0) throw zzfa.zzc();
                        if (var21_19 == 0) {
                            var27_24.add(var16_14);
                            continue;
                        }
                        ** GOTO lbl199
                    }
                    return var18_16;
lbl199:
                    // 1 sources

                    var45_61 = zzez.zzb;
                    var35_41 = new String(var17_15 /* !! */ , var18_16, var21_19, var45_61);
                    var27_24.add(var35_41);
                }
                return var18_16;
lbl206:
                // 1 sources

                var18_16 = zzdt.zzj(var17_15 /* !! */ , var18_16, var25_22);
                var21_19 = var25_22.zza;
                if (var21_19 < 0) throw zzfa.zzc();
                if (var21_19 != 0) ** GOTO lbl213
                var27_24.add(var16_14);
                ** GOTO lbl222
lbl213:
                // 1 sources

                var22_20 = var18_16 + var21_19;
                var29_26 = (int)zzhm.zzd(var17_15 /* !! */ , var18_16, var22_20);
                if (var29_26 == 0) throw zzfa.zzb();
                var46_63 = zzez.zzb;
                var45_62 = new String(var17_15 /* !! */ , var18_16, var21_19, var46_63);
                var27_24.add(var45_62);
                while (true) {
                    var18_16 = var22_20;
lbl222:
                    // 3 sources

                    while (var18_16 < var19_17) {
                        var21_19 = zzdt.zzj(var17_15 /* !! */ , var18_16, var25_22);
                        var22_20 = var25_22.zza;
                        if (var20_18 != var22_20) return var18_16;
                        var18_16 = zzdt.zzj(var17_15 /* !! */ , var21_19, var25_22);
                        var21_19 = var25_22.zza;
                        if (var21_19 < 0) throw zzfa.zzc();
                        if (var21_19 == 0) {
                            var27_24.add(var16_14);
                            continue;
                        }
                        ** GOTO lbl235
                    }
                    return var18_16;
lbl235:
                    // 1 sources

                    var22_20 = var18_16 + var21_19;
                    var29_26 = zzhm.zzd(var17_15 /* !! */ , var18_16, var22_20);
                    if (var29_26 == 0) throw zzfa.zzb();
                    var46_63 = zzez.zzb;
                    var45_62 = new String(var17_15 /* !! */ , var18_16, var21_19, var46_63);
                    var27_24.add(var45_62);
                }
            }
            case 25: 
            case 42: {
                var33_29 = 0;
                var34_38 = 0.0f;
                var16_14 = null;
                if (var21_19 == var32_28) {
                    var27_24 = (zzdu)var27_24;
                    var20_18 = zzdt.zzj(var17_15 /* !! */ , var18_16, var25_22);
                    var18_16 = var25_22.zza + var20_18;
                    while (var20_18 < var18_16) {
                        var20_18 = zzdt.zzm(var17_15 /* !! */ , var20_18, var25_22);
                        var47_64 = var25_22.zzb;
                        cfr_temp_0 = var47_64 - var30_27;
                        var22_20 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var22_20 != 0) {
                            var19_17 = 1;
                        } else {
                            var19_17 = 0;
                            var42_58 = null;
                        }
                        var27_24.zze((boolean)var19_17);
                    }
                    if (var20_18 != var18_16) throw zzfa.zzf();
                    return var20_18;
                }
                if (var21_19 != 0) return var18_16;
                var27_24 = (zzdu)var27_24;
                var18_16 = zzdt.zzm(var17_15 /* !! */ , var18_16, var25_22);
                var38_48 = var25_22.zzb;
                cfr_temp_1 = var38_48 - var30_27;
                var21_19 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                if (var21_19 != 0) {
                    var21_19 = 1;
                } else {
                    var21_19 = 0;
                    var40_54 = null;
                }
                var27_24.zze((boolean)var21_19);
                while (var18_16 < var19_17) {
                    var21_19 = zzdt.zzj(var17_15 /* !! */ , var18_16, var25_22);
                    var22_20 = var25_22.zza;
                    if (var20_18 != var22_20) return var18_16;
                    var18_16 = zzdt.zzm(var17_15 /* !! */ , var21_19, var25_22);
                    var38_48 = var25_22.zzb;
                    cfr_temp_2 = var38_48 - var30_27;
                    var21_19 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                    if (var21_19 != 0) {
                        var21_19 = 1;
                    } else {
                        var21_19 = 0;
                        var40_54 = null;
                    }
                    var27_24.zze((boolean)var21_19);
                }
                return var18_16;
            }
            case 24: 
            case 31: 
            case 41: 
            case 45: {
                if (var21_19 == var32_28) {
                    var27_24 = (zzev)var27_24;
                    var20_18 = var25_22.zza + var33_29;
                    for (var33_29 = zzdt.zzj(var17_15 /* !! */ , var18_16, var25_22); var33_29 < var20_18; var33_29 += 4) {
                        var18_16 = zzdt.zzb(var17_15 /* !! */ , var33_29);
                        var27_24.zze(var18_16);
                    }
                    if (var33_29 != var20_18) throw zzfa.zzf();
                    return var33_29;
                }
                if (var21_19 != var29_26) return var18_16;
                var27_24 = (zzev)var27_24;
                var33_33 = zzdt.zzb(var2_2, var3_3);
                var27_24.zze(var33_33);
                while ((var33_33 = var18_16 + 4) < var19_17) {
                    var18_16 = zzdt.zzj(var17_15 /* !! */ , var33_33, var25_22);
                    var21_19 = var25_22.zza;
                    if (var20_18 != var21_19) return var33_33;
                    var33_33 = zzdt.zzb(var17_15 /* !! */ , var18_16);
                    var27_24.zze(var33_33);
                }
                return var33_33;
            }
            case 23: 
            case 32: 
            case 40: 
            case 46: {
                if (var21_19 == var32_28) {
                    var27_24 = (zzfl)var27_24;
                    var20_18 = var25_22.zza + var33_29;
                    for (var33_29 = zzdt.zzj(var17_15 /* !! */ , var18_16, var25_22); var33_29 < var20_18; var33_29 += 8) {
                        var36_43 = zzdt.zzn(var17_15 /* !! */ , var33_29);
                        var27_24.zze(var36_43);
                    }
                    if (var33_29 != var20_18) throw zzfa.zzf();
                    return var33_29;
                }
                if (var21_19 != var28_25) return var18_16;
                var27_24 = (zzfl)var27_24;
                var38_49 = zzdt.zzn(var2_2, var3_3);
                var27_24.zze(var38_49);
                while ((var33_34 = var18_16 + 8) < var19_17) {
                    var18_16 = zzdt.zzj(var17_15 /* !! */ , var33_34, var25_22);
                    var21_19 = var25_22.zza;
                    if (var20_18 != var21_19) return var33_34;
                    var38_49 = zzdt.zzn(var17_15 /* !! */ , var18_16);
                    var27_24.zze(var38_49);
                }
                return var33_34;
            }
            case 22: 
            case 29: 
            case 39: 
            case 43: {
                if (var21_19 == var32_28) {
                    return zzdt.zzf(var17_15 /* !! */ , var18_16, var27_24, var25_22);
                }
                if (var21_19 != 0) ** continue;
                var7_7 = var3_3;
                var8_8 = var4_4;
                return zzdt.zzl(var5_5, var2_2, var3_3, var4_4, var27_24, var14_12);
            }
            case 20: 
            case 21: 
            case 37: 
            case 38: {
                if (var21_19 == var32_28) {
                    var27_24 = (zzfl)var27_24;
                    var33_29 = zzdt.zzj(var17_15 /* !! */ , var18_16, var25_22);
                    var20_18 = var25_22.zza + var33_29;
                    while (var33_29 < var20_18) {
                        var33_29 = zzdt.zzm(var17_15 /* !! */ , var33_29, var25_22);
                        var36_44 = var25_22.zzb;
                        var27_24.zze(var36_44);
                    }
                    if (var33_29 != var20_18) throw zzfa.zzf();
                    return var33_29;
                }
                if (var21_19 != 0) return var18_16;
                var27_24 = (zzfl)var27_24;
                var33_35 = zzdt.zzm(var17_15 /* !! */ , var18_16, var25_22);
                var38_50 = var25_22.zzb;
                var27_24.zze(var38_50);
                while (var33_35 < var19_17) {
                    var18_16 = zzdt.zzj(var17_15 /* !! */ , var33_35, var25_22);
                    var21_19 = var25_22.zza;
                    if (var20_18 != var21_19) return var33_35;
                    var33_35 = zzdt.zzm(var17_15 /* !! */ , var18_16, var25_22);
                    var38_50 = var25_22.zzb;
                    var27_24.zze(var38_50);
                }
                return var33_35;
            }
            case 19: 
            case 36: {
                if (var21_19 == var32_28) {
                    var27_24 = (zzeq)var27_24;
                    var20_18 = var25_22.zza + var33_29;
                    for (var33_29 = zzdt.zzj(var17_15 /* !! */ , var18_16, var25_22); var33_29 < var20_18; var33_29 += 4) {
                        var18_16 = zzdt.zzb(var17_15 /* !! */ , var33_29);
                        var49_65 = Float.intBitsToFloat(var18_16);
                        var27_24.zze(var49_65);
                    }
                    if (var33_29 != var20_18) throw zzfa.zzf();
                    return var33_29;
                }
                if (var21_19 != var29_26) return var18_16;
                var27_24 = (zzeq)var27_24;
                var33_36 = zzdt.zzb(var2_2, var3_3);
                var34_39 = Float.intBitsToFloat(var33_36);
                var27_24.zze(var34_39);
                while ((var33_36 = var18_16 + 4) < var19_17) {
                    var18_16 = zzdt.zzj(var17_15 /* !! */ , var33_36, var25_22);
                    var21_19 = var25_22.zza;
                    if (var20_18 != var21_19) return var33_36;
                    var33_36 = zzdt.zzb(var17_15 /* !! */ , var18_16);
                    var34_39 = Float.intBitsToFloat(var33_36);
                    var27_24.zze(var34_39);
                }
                return var33_36;
            }
            case 18: 
            case 35: 
        }
        if (var21_19 == var32_28) {
            var27_24 = (zzej)var27_24;
            var20_18 = var25_22.zza + var33_29;
            for (var33_29 = zzdt.zzj(var17_15 /* !! */ , var18_16, var25_22); var33_29 < var20_18; var33_29 += 8) {
                var36_45 = zzdt.zzn(var17_15 /* !! */ , var33_29);
                var50_66 = Double.longBitsToDouble(var36_45);
                var27_24.zze(var50_66);
            }
            if (var33_29 != var20_18) throw zzfa.zzf();
            return var33_29;
        } else {
            if (var21_19 != var28_25) return var18_16;
            var27_24 = (zzej)var27_24;
            var38_51 = zzdt.zzn(var2_2, var3_3);
            var43_60 = Double.longBitsToDouble(var38_51);
            var27_24.zze(var43_60);
            while ((var33_29 = var18_16 + 8) < var19_17) {
                var18_16 = zzdt.zzj(var17_15 /* !! */ , var33_29, var25_22);
                var21_19 = var25_22.zza;
                if (var20_18 != var21_19) return var33_29;
                var38_51 = zzdt.zzn(var17_15 /* !! */ , var18_16);
                var43_60 = Double.longBitsToDouble(var38_51);
                var27_24.zze(var43_60);
            }
            return var33_29;
        }
    }

    private final int zzq(int n3) {
        int n4 = this.zze;
        if (n3 >= n4 && n3 <= (n4 = this.zzf)) {
            return this.zzt(n3, 0);
        }
        return -1;
    }

    private final int zzr(int n3, int n4) {
        int n7 = this.zze;
        if (n3 >= n7 && n3 <= (n7 = this.zzf)) {
            return this.zzt(n3, n4);
        }
        return -1;
    }

    private final int zzs(int n3) {
        int[] nArray = this.zzc;
        return nArray[n3 += 2];
    }

    private final int zzt(int n3, int n4) {
        int[] nArray = this.zzc;
        int n7 = nArray.length / 3;
        int n8 = -1;
        n7 += n8;
        while (n4 <= n7) {
            int[] nArray2 = this.zzc;
            int n10 = n7 + n4 >>> 1;
            int n14 = n10 * 3;
            int n15 = nArray2[n14];
            if (n3 == n15) {
                return n14;
            }
            if (n3 < n15) {
                n7 = n10 += -1;
                continue;
            }
            n4 = ++n10;
        }
        return n8;
    }

    private static int zzu(int n3) {
        return n3 >>> 20 & 0xFF;
    }

    private final int zzv(int n3) {
        int[] nArray = this.zzc;
        return nArray[++n3];
    }

    private static long zzw(Object object, long l2) {
        return (Long)zzhi.zzf(object, l2);
    }

    private final zzex zzx(int n3) {
        n3 /= 3;
        Object[] objectArray = this.zzd;
        n3 = n3 + n3 + 1;
        return (zzex)objectArray[n3];
    }

    private final zzgh zzy(int n3) {
        Object object;
        n3 /= 3;
        if ((object = (zzgh)this.zzd[n3 += n3]) != null) {
            return object;
        }
        object = zzge.zza();
        Object object2 = this.zzd;
        int n4 = n3 + 1;
        object2 = (Class)object2[n4];
        this.zzd[n3] = object = ((zzge)object).zzb((Class)object2);
        return object;
    }

    private final Object zzz(int n3) {
        n3 /= 3;
        Object[] objectArray = this.zzd;
        n3 += n3;
        return objectArray[n3];
    }

    /*
     * Unable to fully structure code
     */
    public final int zza(Object var1_1) {
        var2_2 = this.zzc;
        var3_3 = var2_2.length;
        var5_5 = 0;
        block40: for (var4_4 = 0; var4_4 < var3_3; var4_4 += 3) {
            var6_6 = this.zzv(var4_4);
            var7_7 = this.zzc;
            var8_8 = var7_7[var4_4];
            var9_9 = 1048575 & var6_6;
            var10_10 = var9_9;
            var6_6 = zzfz.zzu(var6_6);
            var12_11 = 37;
            switch (var6_6) {
                default: {
                    continue block40;
                }
                case 68: {
                    var6_6 = (int)this.zzJ(var1_1, var8_8, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var13_12 = zzhi.zzf(var1_1, var10_10);
                    var6_6 = var13_12.hashCode();
lbl21:
                    // 24 sources

                    while (true) {
                        var6_6 += var5_5;
                        var5_5 = var6_6;
                        continue block40;
                        break;
                    }
                }
                case 67: {
                    var6_6 = (int)this.zzJ(var1_1, var8_8, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var14_13 = zzfz.zzw(var1_1, var10_10);
                    var6_6 = zzez.zzc(var14_13);
                    ** GOTO lbl21
                }
                case 66: {
                    var6_6 = (int)this.zzJ(var1_1, var8_8, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var6_6 = zzfz.zzl(var1_1, var10_10);
lbl37:
                    // 12 sources

                    while (true) {
                        var5_5 += var6_6;
                        continue block40;
                        break;
                    }
                }
                case 65: {
                    var6_6 = (int)this.zzJ(var1_1, var8_8, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var14_13 = zzfz.zzw(var1_1, var10_10);
                    var6_6 = zzez.zzc(var14_13);
                    ** GOTO lbl21
                }
                case 64: {
                    var6_6 = (int)this.zzJ(var1_1, var8_8, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var6_6 = zzfz.zzl(var1_1, var10_10);
                    ** GOTO lbl37
                }
                case 63: {
                    var6_6 = (int)this.zzJ(var1_1, var8_8, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var6_6 = zzfz.zzl(var1_1, var10_10);
                    ** GOTO lbl37
                }
                case 62: {
                    var6_6 = (int)this.zzJ(var1_1, var8_8, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var6_6 = zzfz.zzl(var1_1, var10_10);
                    ** GOTO lbl37
                }
                case 61: {
                    var6_6 = (int)this.zzJ(var1_1, var8_8, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var13_12 = zzhi.zzf(var1_1, var10_10);
                    var6_6 = var13_12.hashCode();
                    ** GOTO lbl21
                }
                case 60: {
                    var6_6 = (int)this.zzJ(var1_1, var8_8, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var13_12 = zzhi.zzf(var1_1, var10_10);
                    var6_6 = var13_12.hashCode();
                    ** GOTO lbl21
                }
                case 59: {
                    var6_6 = (int)this.zzJ(var1_1, var8_8, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var13_12 = (String)zzhi.zzf(var1_1, var10_10);
                    var6_6 = var13_12.hashCode();
                    ** GOTO lbl21
                }
                case 58: {
                    var6_6 = (int)this.zzJ(var1_1, var8_8, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var13_12 = (Boolean)zzhi.zzf(var1_1, var10_10);
                    var6_6 = zzez.zza(var13_12.booleanValue());
                    ** GOTO lbl21
                }
                case 57: {
                    var6_6 = (int)this.zzJ(var1_1, var8_8, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var6_6 = zzfz.zzl(var1_1, var10_10);
                    ** GOTO lbl37
                }
                case 56: {
                    var6_6 = (int)this.zzJ(var1_1, var8_8, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var14_13 = zzfz.zzw(var1_1, var10_10);
                    var6_6 = zzez.zzc(var14_13);
                    ** GOTO lbl21
                }
                case 55: {
                    var6_6 = (int)this.zzJ(var1_1, var8_8, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var6_6 = zzfz.zzl(var1_1, var10_10);
                    ** GOTO lbl37
                }
                case 54: {
                    var6_6 = (int)this.zzJ(var1_1, var8_8, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var14_13 = zzfz.zzw(var1_1, var10_10);
                    var6_6 = zzez.zzc(var14_13);
                    ** GOTO lbl21
                }
                case 53: {
                    var6_6 = (int)this.zzJ(var1_1, var8_8, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var14_13 = zzfz.zzw(var1_1, var10_10);
                    var6_6 = zzez.zzc(var14_13);
                    ** GOTO lbl21
                }
                case 52: {
                    var6_6 = (int)this.zzJ(var1_1, var8_8, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var13_12 = (Float)zzhi.zzf(var1_1, var10_10);
                    var16_14 = var13_12.floatValue();
                    var6_6 = Float.floatToIntBits(var16_14);
                    ** GOTO lbl21
                }
                case 51: {
                    var6_6 = (int)this.zzJ(var1_1, var8_8, var4_4);
                    if (var6_6 == 0) continue block40;
                    var5_5 *= 53;
                    var13_12 = (Double)zzhi.zzf(var1_1, var10_10);
                    var17_15 = var13_12.doubleValue();
                    var14_13 = Double.doubleToLongBits(var17_15);
                    var6_6 = zzez.zzc(var14_13);
                    ** GOTO lbl21
                }
                case 50: {
                    var5_5 *= 53;
                    var13_12 = zzhi.zzf(var1_1, var10_10);
                    var6_6 = var13_12.hashCode();
                    ** GOTO lbl21
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 31: 
                case 32: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 47: 
                case 48: 
                case 49: {
                    var5_5 *= 53;
                    var13_12 = zzhi.zzf(var1_1, var10_10);
                    var6_6 = var13_12.hashCode();
                    ** GOTO lbl21
                }
                case 17: {
                    var13_12 = zzhi.zzf(var1_1, var10_10);
                    if (var13_12 != null) {
                        var12_11 = var13_12.hashCode();
                    }
lbl157:
                    // 5 sources

                    while (true) {
                        var5_5 = var5_5 * 53 + var12_11;
                        continue block40;
                        break;
                    }
                }
                case 16: {
                    var5_5 *= 53;
                    var14_13 = zzhi.zzd(var1_1, var10_10);
                    var6_6 = zzez.zzc(var14_13);
                    ** GOTO lbl21
                }
                case 15: {
                    var5_5 *= 53;
                    var6_6 = zzhi.zzc(var1_1, var10_10);
                    ** GOTO lbl37
                }
                case 14: {
                    var5_5 *= 53;
                    var14_13 = zzhi.zzd(var1_1, var10_10);
                    var6_6 = zzez.zzc(var14_13);
                    ** GOTO lbl21
                }
                case 13: {
                    var5_5 *= 53;
                    var6_6 = zzhi.zzc(var1_1, var10_10);
                    ** GOTO lbl37
                }
                case 12: {
                    var5_5 *= 53;
                    var6_6 = zzhi.zzc(var1_1, var10_10);
                    ** GOTO lbl37
                }
                case 11: {
                    var5_5 *= 53;
                    var6_6 = zzhi.zzc(var1_1, var10_10);
                    ** GOTO lbl37
                }
                case 10: {
                    var5_5 *= 53;
                    var13_12 = zzhi.zzf(var1_1, var10_10);
                    var6_6 = var13_12.hashCode();
                    ** GOTO lbl21
                }
                case 9: {
                    var13_12 = zzhi.zzf(var1_1, var10_10);
                    if (var13_12 == null) ** GOTO lbl157
                    var12_11 = var13_12.hashCode();
                    ** continue;
                }
                case 8: {
                    var5_5 *= 53;
                    var13_12 = (String)zzhi.zzf(var1_1, var10_10);
                    var6_6 = var13_12.hashCode();
                    ** GOTO lbl21
                }
                case 7: {
                    var5_5 *= 53;
                    var6_6 = zzez.zza(zzhi.zzt(var1_1, var10_10));
                    ** GOTO lbl21
                }
                case 6: {
                    var5_5 *= 53;
                    var6_6 = zzhi.zzc(var1_1, var10_10);
                    ** GOTO lbl37
                }
                case 5: {
                    var5_5 *= 53;
                    var14_13 = zzhi.zzd(var1_1, var10_10);
                    var6_6 = zzez.zzc(var14_13);
                    ** GOTO lbl21
                }
                case 4: {
                    var5_5 *= 53;
                    var6_6 = zzhi.zzc(var1_1, var10_10);
                    ** continue;
                }
                case 3: {
                    var5_5 *= 53;
                    var14_13 = zzhi.zzd(var1_1, var10_10);
                    var6_6 = zzez.zzc(var14_13);
                    ** GOTO lbl21
                }
                case 2: {
                    var5_5 *= 53;
                    var14_13 = zzhi.zzd(var1_1, var10_10);
                    var6_6 = zzez.zzc(var14_13);
                    ** GOTO lbl21
                }
                case 1: {
                    var5_5 *= 53;
                    var16_14 = zzhi.zzb(var1_1, var10_10);
                    var6_6 = Float.floatToIntBits(var16_14);
                    ** GOTO lbl21
                }
                case 0: {
                    var5_5 *= 53;
                    var17_15 = zzhi.zza(var1_1, var10_10);
                    var14_13 = Double.doubleToLongBits(var17_15);
                    var6_6 = zzez.zzc(var14_13);
                    ** continue;
                }
            }
        }
        return this.zzm.zza(var1_1).hashCode() + (var5_5 *= 53);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int zzb(Object var1_1, byte[] var2_2, int var3_3, int var4_4, int var5_5, zzds var6_6) {
        block72: {
            block71: {
                block70: {
                    var7_7 = this;
                    var8_8 = var1_1;
                    var9_9 = var2_2;
                    var10_10 = var4_4;
                    var11_11 = var5_5;
                    var12_12 = var6_6;
                    var13_13 = zzfz.zzb;
                    var14_14 = var3_3;
                    var15_15 = 0;
                    var16_16 /* !! */  = null;
                    var17_17 = -1;
                    var18_18 = 0;
                    var19_19 = null;
                    var20_20 = 0;
                    var21_21 /* !! */  = null;
                    var22_22 = 1048575;
                    block15: while (var14_14 < var10_10) {
                        block63: {
                            block69: {
                                block67: {
                                    block68: {
                                        block66: {
                                            block65: {
                                                block64: {
                                                    var15_15 = var14_14 + 1;
                                                    if ((var14_14 = var9_9[var14_14]) < 0) {
                                                        var14_14 = zzdt.zzk(var14_14, var9_9, var15_15, (zzds)var12_12);
                                                        var23_23 = var12_12.zza;
                                                        var15_15 = var14_14;
                                                    } else {
                                                        var23_23 = var14_14;
                                                    }
                                                    var14_14 = var23_23 >>> 3;
                                                    var24_24 = var23_23 & 7;
                                                    var25_25 = 3;
                                                    if (var14_14 > var17_17) {
                                                        var17_17 = var7_7.zzr(var14_14, var18_18 /= var25_25);
lbl30:
                                                        // 2 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
                                                    var17_17 = var7_7.zzq(var14_14);
                                                    ** continue;
                                                    var18_18 = var17_17;
                                                    var17_17 = -1;
                                                    if (var18_18 != var17_17) break block64;
                                                    var26_26 = var14_14;
                                                    var17_17 = var15_15;
                                                    var24_24 = var23_23;
                                                    var27_27 = var20_20;
                                                    var28_28 = var13_13;
                                                    var25_25 = var11_11;
                                                    var29_29 = 0;
                                                    var30_30 = -1;
                                                    break block63;
                                                }
                                                var31_31 = var7_7.zzc;
                                                var30_30 = var18_18 + 1;
                                                var25_25 = var31_31[var30_30];
                                                var11_11 = zzfz.zzu(var25_25);
                                                var30_30 = var15_15;
                                                var26_26 = 1048575;
                                                var32_32 = var25_25 & var26_26;
                                                var15_15 = 17;
                                                var34_33 = var23_23;
                                                if (var11_11 > var15_15) break block65;
                                                var15_15 = var18_18 + 2;
                                                var15_15 = var31_31[var15_15];
                                                var17_17 = var15_15 >>> 20;
                                                var23_23 = 1;
                                                var27_27 = var23_23 << var17_17;
                                                var17_17 = 1048575;
                                                if ((var15_15 &= var17_17) != var22_22) {
                                                    var26_26 = var18_18;
                                                    if (var22_22 != var17_17) {
                                                        var35_34 = var22_22;
                                                        var13_13.putInt(var8_8, var35_34, var20_20);
                                                    }
                                                    var35_34 = var15_15;
                                                    var17_17 = var13_13.getInt(var8_8, var35_34);
                                                    var37_35 = var15_15;
                                                    var22_22 = var17_17;
                                                } else {
                                                    var26_26 = var18_18;
                                                    var37_35 = var22_22;
                                                    var22_22 = var20_20;
                                                }
                                                var15_15 = 5;
                                                block0 : switch (var11_11) {
                                                    default: {
                                                        var17_17 = 3;
                                                        if (var24_24 == var17_17) {
                                                            var18_18 = var26_26;
                                                            var16_16 /* !! */  = (byte[])var7_7.zzy(var26_26);
                                                            var23_23 = var14_14 << 3 | 4;
                                                            var26_26 = var14_14;
                                                            var38_36 = var16_16 /* !! */ ;
                                                            var11_11 = var30_30;
                                                            var16_16 /* !! */  = var2_2;
                                                            var29_29 = 1048575;
                                                            var30_30 = -1;
                                                            var17_17 = var11_11;
                                                            var25_25 = var18_18;
                                                            var18_18 = var4_4;
                                                            var24_24 = var34_33;
                                                            var21_21 /* !! */  = (int[])var6_6;
                                                            var14_14 = zzdt.zzc((zzgh)var38_36, var2_2, var11_11, var4_4, var23_23, var6_6);
                                                            var15_15 = var22_22 & var27_27;
                                                            if (var15_15 == 0) {
                                                                var16_16 /* !! */  = (byte[])var12_12.zzc;
                                                                var13_13.putObject(var8_8, var32_32, var16_16 /* !! */ );
                                                            } else {
                                                                var16_16 /* !! */  = (byte[])var13_13.getObject(var8_8, var32_32);
                                                                var31_31 = var12_12.zzc;
                                                                var16_16 /* !! */  = (byte[])zzez.zzg(var16_16 /* !! */ , var31_31);
                                                                var13_13.putObject(var8_8, var32_32, var16_16 /* !! */ );
                                                            }
                                                            var20_20 = var22_22 | var27_27;
                                                            var9_9 = var2_2;
                                                            var10_10 = var4_4;
                                                            var11_11 = var5_5;
                                                            var18_18 = var25_25;
                                                            var15_15 = var24_24;
                                                            var17_17 = var26_26;
                                                            var22_22 = var37_35;
                                                            continue block15;
                                                        }
                                                        var25_25 = var26_26;
                                                        var11_11 = var30_30;
                                                        var29_29 = 1048575;
                                                        var30_30 = -1;
                                                        var26_26 = var14_14;
                                                        var9_9 = var2_2;
lbl120:
                                                        // 3 sources

                                                        while (true) {
                                                            var10_10 = var25_25;
                                                            break block0;
                                                            break;
                                                        }
                                                    }
                                                    case 16: {
                                                        var25_25 = var26_26;
                                                        var11_11 = var30_30;
                                                        var23_23 = var34_33;
                                                        var29_29 = 1048575;
                                                        var30_30 = -1;
                                                        var26_26 = var14_14;
                                                        if (var24_24 == 0) {
                                                            var35_34 = var32_32;
                                                            var9_9 = var2_2;
                                                            var24_24 = zzdt.zzm(var2_2, var11_11, (zzds)var12_12);
                                                            var39_37 = var12_12.zzb;
                                                            var41_38 = zzei.zzc(var39_37);
                                                            var38_36 = var13_13;
                                                            var16_16 /* !! */  = (byte[])var1_1;
                                                            var10_10 = var34_33;
                                                            var43_39 = var41_38;
                                                            var13_13.putLong(var1_1, var32_32, var41_38);
                                                            var20_20 = var22_22 | var27_27;
                                                            var11_11 = var5_5;
                                                            var18_18 = var25_25;
                                                            var14_14 = var24_24;
lbl145:
                                                            // 2 sources

                                                            while (true) {
                                                                var15_15 = var10_10;
                                                                var17_17 = var26_26;
lbl148:
                                                                // 3 sources

                                                                while (true) {
                                                                    var22_22 = var37_35;
                                                                    var10_10 = var4_4;
                                                                    continue block15;
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        var9_9 = var2_2;
                                                        ** GOTO lbl120
                                                    }
                                                    case 15: {
                                                        var35_34 = var32_32;
                                                        var25_25 = var26_26;
                                                        var11_11 = var30_30;
                                                        var10_10 = var34_33;
                                                        var29_29 = 1048575;
                                                        var30_30 = -1;
                                                        var9_9 = var2_2;
                                                        var26_26 = var14_14;
                                                        if (var24_24 == 0) {
                                                            var14_14 = zzdt.zzj(var2_2, var11_11, (zzds)var12_12);
                                                            var15_15 = zzei.zzb(var12_12.zza);
                                                            var13_13.putInt(var8_8, var32_32, var15_15);
lbl167:
                                                            // 3 sources

                                                            while (true) {
                                                                var20_20 = var22_22 | var27_27;
                                                                var11_11 = var5_5;
lbl170:
                                                                // 2 sources

                                                                while (true) {
                                                                    var18_18 = var25_25;
                                                                    ** continue;
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                        }
lbl173:
                                                        // 5 sources

                                                        while (true) {
                                                            var34_33 = var10_10;
                                                            ** continue;
                                                            break;
                                                        }
                                                    }
                                                    case 12: {
                                                        var35_34 = var32_32;
                                                        var25_25 = var26_26;
                                                        var11_11 = var30_30;
                                                        var10_10 = var34_33;
                                                        var29_29 = 1048575;
                                                        var30_30 = -1;
                                                        var9_9 = var2_2;
                                                        var26_26 = var14_14;
                                                        if (var24_24 != 0) ** GOTO lbl173
                                                        var14_14 = zzdt.zzj(var2_2, var11_11, (zzds)var12_12);
                                                        var15_15 = var12_12.zza;
                                                        var45_40 = var7_7.zzx(var25_25);
                                                        if (var45_40 != null && (var23_23 = (int)var45_40.zza()) == 0) {
                                                            var31_31 = zzfz.zzc(var1_1);
                                                            var46_41 = var15_15;
                                                            var16_16 /* !! */  = (byte[])var46_41;
                                                            var31_31.zzf(var34_33, var16_16 /* !! */ );
                                                            var11_11 = var5_5;
                                                            var20_20 = var22_22;
                                                            ** continue;
                                                        }
                                                        var13_13.putInt(var8_8, var35_34, var15_15);
                                                        ** GOTO lbl167
                                                    }
                                                    case 10: {
                                                        var35_34 = var32_32;
                                                        var25_25 = var26_26;
                                                        var11_11 = var30_30;
                                                        var10_10 = var34_33;
                                                        var29_29 = 1048575;
                                                        var30_30 = -1;
                                                        var9_9 = var2_2;
                                                        var26_26 = var14_14;
                                                        var14_14 = 2;
                                                        var48_42 = 2.8E-45f;
                                                        if (var24_24 != var14_14) ** GOTO lbl173
                                                        var14_14 = zzdt.zza(var2_2, var11_11, (zzds)var12_12);
                                                        var16_16 /* !! */  = (byte[])var12_12.zzc;
                                                        var13_13.putObject(var8_8, var32_32, var16_16 /* !! */ );
                                                        ** continue;
                                                    }
                                                    case 9: {
                                                        var35_34 = var32_32;
                                                        var25_25 = var26_26;
                                                        var11_11 = var30_30;
                                                        var10_10 = var34_33;
                                                        var29_29 = 1048575;
                                                        var30_30 = -1;
                                                        var9_9 = var2_2;
                                                        var26_26 = var14_14;
                                                        var14_14 = 2;
                                                        var48_42 = 2.8E-45f;
                                                        if (var24_24 == var14_14) {
                                                            var38_36 = var7_7.zzy(var25_25);
                                                            var20_20 = var4_4;
                                                            var14_14 = zzdt.zzd((zzgh)var38_36, var2_2, var11_11, var4_4, (zzds)var12_12);
                                                            var15_15 = var22_22 & var27_27;
                                                            if (var15_15 == 0) {
                                                                var16_16 /* !! */  = (byte[])var12_12.zzc;
                                                                var13_13.putObject(var8_8, var32_32, var16_16 /* !! */ );
                                                            } else {
                                                                var16_16 /* !! */  = (byte[])var13_13.getObject(var8_8, var32_32);
                                                                var45_40 = var12_12.zzc;
                                                                var16_16 /* !! */  = (byte[])zzez.zzg(var16_16 /* !! */ , var45_40);
                                                                var13_13.putObject(var8_8, var32_32, var16_16 /* !! */ );
                                                            }
                                                            var15_15 = var22_22 | var27_27;
                                                            var11_11 = var5_5;
                                                            var18_18 = var25_25;
                                                            var17_17 = var26_26;
                                                            var22_22 = var37_35;
                                                            var49_43 = var20_20;
                                                            var20_20 = var15_15;
                                                            var15_15 = var10_10;
                                                            var10_10 = var49_43;
                                                            continue block15;
                                                        }
                                                        var20_20 = var4_4;
                                                        ** continue;
                                                    }
                                                    case 8: {
                                                        var20_20 = var4_4;
                                                        var35_34 = var32_32;
                                                        var11_11 = var30_30;
                                                        var10_10 = var34_33;
                                                        var15_15 = 2;
                                                        var29_29 = 1048575;
                                                        var30_30 = -1;
                                                        var9_9 = var2_2;
                                                        var49_43 = var26_26;
                                                        var26_26 = var14_14;
                                                        var14_14 = var49_43;
                                                        if (var24_24 == var15_15) {
                                                            var15_15 = 0x20000000 & var25_25;
                                                            var15_15 = var15_15 == 0 ? zzdt.zzg(var2_2, var11_11, (zzds)var12_12) : zzdt.zzh(var2_2, var11_11, (zzds)var12_12);
                                                            var45_40 = var12_12.zzc;
                                                            var13_13.putObject(var8_8, var35_34, var45_40);
lbl268:
                                                            // 3 sources

                                                            while (true) {
                                                                var17_17 = var22_22 | var27_27;
                                                                var11_11 = var5_5;
                                                                var18_18 = var14_14;
                                                                var14_14 = var15_15;
                                                                var15_15 = var10_10;
                                                                var22_22 = var37_35;
                                                                var10_10 = var20_20;
                                                                var20_20 = var17_17;
                                                                var17_17 = var26_26;
                                                                continue block15;
                                                                break;
                                                            }
                                                        }
lbl279:
                                                        // 5 sources

                                                        while (true) {
                                                            var34_33 = var10_10;
                                                            var10_10 = var14_14;
                                                            break block0;
                                                            break;
                                                        }
                                                    }
                                                    case 7: {
                                                        var20_20 = var4_4;
                                                        var35_34 = var32_32;
                                                        var11_11 = var30_30;
                                                        var10_10 = var34_33;
                                                        var29_29 = 1048575;
                                                        var30_30 = -1;
                                                        var9_9 = var2_2;
                                                        var49_43 = var26_26;
                                                        var26_26 = var14_14;
                                                        var14_14 = var49_43;
                                                        if (var24_24 != 0) ** GOTO lbl279
                                                        var15_15 = zzdt.zzm(var2_2, var11_11, (zzds)var12_12);
                                                        var50_44 = var12_12.zzb;
                                                        var41_38 = 0L;
                                                        cfr_temp_0 = var50_44 - var41_38;
                                                        var11_11 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                        if (var11_11 == 0) {
                                                            var23_23 = 0;
                                                            var45_40 = null;
                                                        }
                                                        zzhi.zzk(var8_8, var35_34, (boolean)var23_23);
                                                        ** GOTO lbl268
                                                    }
                                                    case 6: 
                                                    case 13: {
                                                        var20_20 = var4_4;
                                                        var35_34 = var32_32;
                                                        var11_11 = var30_30;
                                                        var10_10 = var34_33;
                                                        var29_29 = 1048575;
                                                        var30_30 = -1;
                                                        var9_9 = var2_2;
                                                        var49_43 = var26_26;
                                                        var26_26 = var14_14;
                                                        var14_14 = var49_43;
                                                        if (var24_24 != var15_15) ** GOTO lbl279
                                                        var15_15 = zzdt.zzb(var2_2, var11_11);
                                                        var13_13.putInt(var8_8, var32_32, var15_15);
                                                        var15_15 = var11_11 + 4;
                                                        ** continue;
                                                    }
                                                    case 5: 
                                                    case 14: {
                                                        var20_20 = var4_4;
                                                        var35_34 = var32_32;
                                                        var11_11 = var30_30;
                                                        var10_10 = var34_33;
                                                        var29_29 = 1048575;
                                                        var30_30 = -1;
                                                        var9_9 = var2_2;
                                                        var49_43 = var26_26;
                                                        var26_26 = var14_14;
                                                        var14_14 = var49_43;
                                                        if (var24_24 == var23_23) ** break;
                                                        ** continue;
                                                        var50_44 = zzdt.zzn(var2_2, var11_11);
                                                        var23_23 = var49_43;
                                                        var38_36 = var13_13;
                                                        var16_16 /* !! */  = (byte[])var1_1;
                                                        var10_10 = var49_43;
                                                        var43_39 = var50_44;
                                                        var13_13.putLong(var1_1, var32_32, var50_44);
lbl341:
                                                        // 2 sources

                                                        while (true) {
                                                            var14_14 = var11_11 + 8;
lbl343:
                                                            // 3 sources

                                                            while (true) {
                                                                var20_20 = var22_22 | var27_27;
                                                                var11_11 = var5_5;
lbl346:
                                                                // 2 sources

                                                                while (true) {
                                                                    var18_18 = var10_10;
                                                                    var17_17 = var26_26;
                                                                    var15_15 = var34_33;
                                                                    ** GOTO lbl148
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    case 4: 
                                                    case 11: {
                                                        var35_34 = var32_32;
                                                        var10_10 = var26_26;
                                                        var11_11 = var30_30;
                                                        var29_29 = 1048575;
                                                        var30_30 = -1;
                                                        var9_9 = var2_2;
                                                        var26_26 = var14_14;
                                                        if (var24_24 != 0) break;
                                                        var14_14 = zzdt.zzj(var2_2, var11_11, (zzds)var12_12);
                                                        var15_15 = var12_12.zza;
                                                        var13_13.putInt(var8_8, var32_32, var15_15);
                                                        ** GOTO lbl343
                                                    }
                                                    case 2: 
                                                    case 3: {
                                                        var35_34 = var32_32;
                                                        var10_10 = var26_26;
                                                        var11_11 = var30_30;
                                                        var29_29 = 1048575;
                                                        var30_30 = -1;
                                                        var9_9 = var2_2;
                                                        var26_26 = var14_14;
                                                        if (var24_24 != 0) break;
                                                        var25_25 = zzdt.zzm(var2_2, var11_11, (zzds)var12_12);
                                                        var43_39 = var12_12.zzb;
                                                        var38_36 = var13_13;
                                                        var16_16 /* !! */  = (byte[])var1_1;
                                                        var13_13.putLong(var1_1, var32_32, var43_39);
                                                        var20_20 = var22_22 | var27_27;
                                                        var11_11 = var5_5;
                                                        var14_14 = var25_25;
                                                        ** continue;
                                                    }
                                                    case 1: {
                                                        var35_34 = var32_32;
                                                        var10_10 = var26_26;
                                                        var11_11 = var30_30;
                                                        var29_29 = 1048575;
                                                        var30_30 = -1;
                                                        var9_9 = var2_2;
                                                        var26_26 = var14_14;
                                                        if (var24_24 != var15_15) break;
                                                        var48_42 = Float.intBitsToFloat(zzdt.zzb(var2_2, var11_11));
                                                        zzhi.zzm(var8_8, var32_32, var48_42);
                                                        var14_14 = var11_11 + 4;
                                                        ** continue;
                                                    }
                                                    case 0: {
                                                        var35_34 = var32_32;
                                                        var10_10 = var26_26;
                                                        var11_11 = var30_30;
                                                        var29_29 = 1048575;
                                                        var30_30 = -1;
                                                        var9_9 = var2_2;
                                                        var26_26 = var14_14;
                                                        if (var24_24 != var23_23) break;
                                                        var39_37 = zzdt.zzn(var2_2, var11_11);
                                                        var52_45 = Double.longBitsToDouble(var39_37);
                                                        zzhi.zzl(var8_8, var32_32, var52_45);
                                                        ** continue;
                                                    }
                                                }
                                                var25_25 = var5_5;
                                                var27_27 = var22_22;
                                                var28_28 = var13_13;
                                                var17_17 = var11_11;
                                                var29_29 = var10_10;
lbl413:
                                                // 3 sources

                                                while (true) {
                                                    var24_24 = var34_33;
                                                    var22_22 = var37_35;
                                                    break block63;
                                                    break;
                                                }
                                            }
                                            var26_26 = var14_14;
                                            var23_23 = var30_30;
                                            var29_29 = 1048575;
                                            var30_30 = -1;
                                            var9_9 = var2_2;
                                            var10_10 = var18_18;
                                            var35_34 = var32_32;
                                            var14_14 = 27;
                                            var48_42 = 3.8E-44f;
                                            if (var11_11 != var14_14) break block66;
                                            var14_14 = 2;
                                            var48_42 = 2.8E-45f;
                                            if (var24_24 == var14_14) {
                                                var38_36 = (zzey)var13_13.getObject(var8_8, var32_32);
                                                var15_15 = (int)var38_36.zzc();
                                                if (var15_15 == 0) {
                                                    var15_15 = var38_36.size();
                                                    var15_15 = var15_15 == 0 ? 10 : (var15_15 += var15_15);
                                                    var38_36 = var38_36.zzd(var15_15);
                                                    var13_13.putObject(var8_8, var35_34, var38_36);
                                                }
                                                var54_46 = var38_36;
                                                var38_36 = var7_7.zzy(var10_10);
                                                var15_15 = var34_33;
                                                var31_31 = var2_2;
                                                var18_18 = var23_23;
                                                var23_23 = var4_4;
                                                var27_27 = var20_20;
                                                var21_21 /* !! */  = (int[])var54_46;
                                                var37_35 = var22_22;
                                                var55_47 = var6_6;
                                                var14_14 = zzdt.zze((zzgh)var38_36, var34_33, var2_2, var18_18, var4_4, (zzey)var54_46, var6_6);
                                                var11_11 = var5_5;
                                                var18_18 = var10_10;
                                                var17_17 = var26_26;
                                                ** continue;
                                            }
                                            var27_27 = var20_20;
                                            var37_35 = var22_22;
                                            var56_48 = var23_23;
                                            var28_28 = var13_13;
                                            var29_29 = var18_18;
                                            break block67;
                                        }
                                        var27_27 = var20_20;
                                        var37_35 = var22_22;
                                        var14_14 = 49;
                                        var48_42 = 6.9E-44f;
                                        if (var11_11 > var14_14) break block68;
                                        var57_49 = var25_25;
                                        var38_36 = this;
                                        var16_16 /* !! */  = (byte[])var1_1;
                                        var31_31 = var2_2;
                                        var18_18 = var23_23;
                                        var20_20 = var23_23;
                                        var23_23 = var4_4;
                                        var56_48 = var18_18;
                                        var20_20 = var34_33;
                                        var22_22 = var26_26;
                                        var25_25 = var24_24;
                                        var24_24 = var10_10;
                                        var28_28 = var13_13;
                                        var29_29 = var10_10;
                                        var8_8 = var6_6;
                                        var14_14 = this.zzp(var1_1, var2_2, var18_18, var4_4, var34_33, var26_26, var25_25, var10_10, var57_49, var11_11, var32_32, var6_6);
                                        if (var14_14 != var18_18) lbl-1000:
                                        // 3 sources

                                        {
                                            while (true) {
                                                var7_7 = this;
                                                var8_8 = var1_1;
                                                var9_9 = var2_2;
                                                var10_10 = var4_4;
                                                var11_11 = var5_5;
                                                var12_12 = var6_6;
                                                var17_17 = var26_26;
                                                var18_18 = var29_29;
                                                var15_15 = var34_33;
                                                var20_20 = var27_27;
                                                var22_22 = var37_35;
lbl494:
                                                // 2 sources

                                                while (true) {
                                                    var13_13 = var28_28;
                                                    continue block15;
                                                    break;
                                                }
                                                break;
                                            }
                                        }
lbl497:
                                        // 4 sources

                                        while (true) {
                                            var25_25 = var5_5;
                                            var17_17 = var14_14;
                                            ** GOTO lbl413
                                            break;
                                        }
                                    }
                                    var56_48 = var23_23;
                                    var28_28 = var13_13;
                                    var29_29 = var18_18;
                                    var14_14 = 50;
                                    var48_42 = 7.0E-44f;
                                    if (var11_11 != var14_14) break block69;
                                    var14_14 = 2;
                                    var48_42 = 2.8E-45f;
                                    if (var24_24 != var14_14) break block67;
                                    var38_36 = this;
                                    var16_16 /* !! */  = (byte[])var1_1;
                                    var31_31 = var2_2;
                                    var18_18 = var23_23;
                                    var23_23 = var4_4;
                                    var20_20 = var10_10;
                                    var57_49 = var32_32;
                                    var59_50 = var6_6;
                                    var14_14 = this.zzm(var1_1, var2_2, var56_48, var4_4, var10_10, var32_32, var6_6);
                                    if (var14_14 == var56_48) ** GOTO lbl497
                                    ** GOTO lbl-1000
                                }
                                var25_25 = var5_5;
                                var17_17 = var56_48;
                                ** continue;
                            }
                            var38_36 = this;
                            var16_16 /* !! */  = (byte[])var1_1;
                            var31_31 = var2_2;
                            var18_18 = var23_23;
                            var23_23 = var4_4;
                            var20_20 = var34_33;
                            var22_22 = var26_26;
                            var60_51 = var25_25;
                            var25_25 = var24_24;
                            var24_24 = var60_51;
                            var60_51 = var11_11;
                            var14_14 = this.zzn(var1_1, var2_2, var56_48, var4_4, var34_33, var26_26, var25_25, var24_24, var11_11, var32_32, var10_10, var6_6);
                            if (var14_14 != var56_48) ** break;
                            ** continue;
                            ** continue;
                        }
                        if (var24_24 == var25_25 && var25_25 != 0) {
                            var14_14 = var17_17;
                            var15_15 = var24_24;
                            var20_20 = var27_27;
lbl547:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var45_40 = zzfz.zzc(var1_1);
                        var14_14 = var24_24;
                        var16_16 /* !! */  = var2_2;
                        var18_18 = var4_4;
                        var21_21 /* !! */  = (int[])var6_6;
                        var14_14 = zzdt.zzi(var24_24, var2_2, var17_17, var4_4, (zzgz)var45_40, var6_6);
                        var7_7 = this;
                        var8_8 = var1_1;
                        var9_9 = var2_2;
                        var10_10 = var4_4;
                        var12_12 = var6_6;
                        var11_11 = var25_25;
                        var15_15 = var24_24;
                        var17_17 = var26_26;
                        var18_18 = var29_29;
                        var20_20 = var27_27;
                        ** continue;
                    }
                    var27_27 = var20_20;
                    var37_35 = var22_22;
                    var28_28 = var13_13;
                    var25_25 = var11_11;
                    ** while (true)
                    var17_17 = 1048575;
                    if (var22_22 != var17_17) {
                        var46_41 = var22_22;
                        var55_47 = var1_1;
                        var59_50 = var28_28;
                        var28_28.putInt(var1_1, var46_41, var20_20);
lbl577:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var55_47 = var1_1;
                    ** while (true)
                    var19_19 = this;
                    for (var23_23 = this.zzj; var23_23 < (var20_20 = var19_19.zzk); ++var23_23) {
                        var21_21 /* !! */  = var19_19.zzi;
                        var20_20 = var21_21 /* !! */ [var23_23];
                        var24_24 = var19_19.zzc[var20_20];
                        var24_24 = var19_19.zzv(var20_20) & var17_17;
                        var61_52 = var24_24;
                        var59_50 = zzhi.zzf(var55_47, var61_52);
                        if (var59_50 == null || (var12_12 = var19_19.zzx(var20_20)) == null) {
                            continue;
                        }
                        var59_50 = (zzfq)var59_50;
                        var38_36 = (zzfp)var19_19.zzz(var20_20);
                        throw null;
                    }
                    if (var25_25 != 0) break block70;
                    var17_17 = var4_4;
                    if (var14_14 != var4_4) {
                        throw zzfa.zzd();
                    }
                    break block71;
                }
                var17_17 = var4_4;
                if (var14_14 > var4_4 || var15_15 != var25_25) break block72;
            }
            return var14_14;
        }
        throw zzfa.zzd();
    }

    public final Object zzd() {
        return ((zzeu)this.zzg).zzi(4, null, null);
    }

    public final void zze(Object object) {
        Object object2;
        int n3;
        int n4;
        for (n4 = this.zzj; n4 < (n3 = this.zzk); ++n4) {
            int[] nArray = this.zzi;
            n3 = nArray[n4];
            n3 = this.zzv(n3);
            int n7 = 1048575;
            long l2 = n3 &= n7;
            object2 = zzhi.zzf(object, l2);
            if (object2 == null) continue;
            Object object3 = object2;
            object3 = (zzfq)object2;
            ((zzfq)object3).zzc();
            zzhi.zzp(object, l2, object2);
        }
        int[] nArray = this.zzi;
        n4 = nArray.length;
        while (n3 < n4) {
            zzfk zzfk2 = this.zzl;
            object2 = this.zzi;
            int n8 = object2[n3];
            long l3 = n8;
            zzfk2.zza(object, l3);
            ++n3;
        }
        this.zzm.zze(object);
    }

    public final void zzf(Object object, Object object2) {
        Object object3;
        int n3;
        object2.getClass();
        block26: for (int i3 = 0; i3 < (n3 = ((int[])(object3 = this.zzc)).length); i3 += 3) {
            n3 = this.zzv(i3);
            int n4 = 0xFFFFF & n3;
            long l2 = n4;
            int[] nArray = this.zzc;
            int n7 = nArray[i3];
            n3 = zzfz.zzu(n3);
            switch (n3) {
                default: {
                    continue block26;
                }
                case 68: {
                    this.zzC(object, object2, i3);
                    continue block26;
                }
                case 61: 
                case 62: 
                case 63: 
                case 64: 
                case 65: 
                case 66: 
                case 67: {
                    n3 = (int)(this.zzJ(object2, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    object3 = zzhi.zzf(object2, l2);
                    zzhi.zzp(object, l2, object3);
                    this.zzE(object, n7, i3);
                    continue block26;
                }
                case 60: {
                    this.zzC(object, object2, i3);
                    continue block26;
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: {
                    n3 = (int)(this.zzJ(object2, n7, i3) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    object3 = zzhi.zzf(object2, l2);
                    zzhi.zzp(object, l2, object3);
                    this.zzE(object, n7, i3);
                    continue block26;
                }
                case 50: {
                    object3 = this.zzp;
                    zzgj.zzi((zzfr)object3, object, object2, l2);
                    continue block26;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 31: 
                case 32: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 47: 
                case 48: 
                case 49: {
                    object3 = this.zzl;
                    ((zzfk)object3).zzb(object, object2, l2);
                    continue block26;
                }
                case 17: {
                    this.zzB(object, object2, i3);
                    continue block26;
                }
                case 16: {
                    n3 = (int)(this.zzG(object2, i3) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    long l3 = zzhi.zzd(object2, l2);
                    zzhi.zzo(object, l2, l3);
                    this.zzD(object, i3);
                    continue block26;
                }
                case 15: {
                    n3 = (int)(this.zzG(object2, i3) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    n3 = zzhi.zzc(object2, l2);
                    zzhi.zzn(object, l2, n3);
                    this.zzD(object, i3);
                    continue block26;
                }
                case 14: {
                    n3 = (int)(this.zzG(object2, i3) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    long l3 = zzhi.zzd(object2, l2);
                    zzhi.zzo(object, l2, l3);
                    this.zzD(object, i3);
                    continue block26;
                }
                case 13: {
                    n3 = (int)(this.zzG(object2, i3) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    n3 = zzhi.zzc(object2, l2);
                    zzhi.zzn(object, l2, n3);
                    this.zzD(object, i3);
                    continue block26;
                }
                case 12: {
                    n3 = (int)(this.zzG(object2, i3) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    n3 = zzhi.zzc(object2, l2);
                    zzhi.zzn(object, l2, n3);
                    this.zzD(object, i3);
                    continue block26;
                }
                case 11: {
                    n3 = (int)(this.zzG(object2, i3) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    n3 = zzhi.zzc(object2, l2);
                    zzhi.zzn(object, l2, n3);
                    this.zzD(object, i3);
                    continue block26;
                }
                case 10: {
                    n3 = (int)(this.zzG(object2, i3) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    object3 = zzhi.zzf(object2, l2);
                    zzhi.zzp(object, l2, object3);
                    this.zzD(object, i3);
                    continue block26;
                }
                case 9: {
                    this.zzB(object, object2, i3);
                    continue block26;
                }
                case 8: {
                    n3 = (int)(this.zzG(object2, i3) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    object3 = zzhi.zzf(object2, l2);
                    zzhi.zzp(object, l2, object3);
                    this.zzD(object, i3);
                    continue block26;
                }
                case 7: {
                    n3 = (int)(this.zzG(object2, i3) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    n3 = (int)(zzhi.zzt(object2, l2) ? 1 : 0);
                    zzhi.zzk(object, l2, n3 != 0);
                    this.zzD(object, i3);
                    continue block26;
                }
                case 6: {
                    n3 = (int)(this.zzG(object2, i3) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    n3 = zzhi.zzc(object2, l2);
                    zzhi.zzn(object, l2, n3);
                    this.zzD(object, i3);
                    continue block26;
                }
                case 5: {
                    n3 = (int)(this.zzG(object2, i3) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    long l3 = zzhi.zzd(object2, l2);
                    zzhi.zzo(object, l2, l3);
                    this.zzD(object, i3);
                    continue block26;
                }
                case 4: {
                    n3 = (int)(this.zzG(object2, i3) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    n3 = zzhi.zzc(object2, l2);
                    zzhi.zzn(object, l2, n3);
                    this.zzD(object, i3);
                    continue block26;
                }
                case 3: {
                    n3 = (int)(this.zzG(object2, i3) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    long l3 = zzhi.zzd(object2, l2);
                    zzhi.zzo(object, l2, l3);
                    this.zzD(object, i3);
                    continue block26;
                }
                case 2: {
                    n3 = (int)(this.zzG(object2, i3) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    long l3 = zzhi.zzd(object2, l2);
                    zzhi.zzo(object, l2, l3);
                    this.zzD(object, i3);
                    continue block26;
                }
                case 1: {
                    n3 = (int)(this.zzG(object2, i3) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    float f5 = zzhi.zzb(object2, l2);
                    zzhi.zzm(object, l2, f5);
                    this.zzD(object, i3);
                    continue block26;
                }
                case 0: {
                    n3 = (int)(this.zzG(object2, i3) ? 1 : 0);
                    if (n3 == 0) continue block26;
                    double d2 = zzhi.zza(object2, l2);
                    zzhi.zzl(object, l2, d2);
                    this.zzD(object, i3);
                }
            }
        }
        zzgj.zzf(this.zzm, object, object2);
    }

    public final void zzg(Object object, byte[] byArray, int n3, int n4, zzds zzds2) {
        boolean bl2 = this.zzh;
        if (bl2) {
            this.zzo(object, byArray, n3, n4, zzds2);
            return;
        }
        this.zzb(object, byArray, n3, n4, 0, zzds2);
    }

    /*
     * Unable to fully structure code
     */
    public final boolean zzh(Object var1_1, Object var2_2) {
        var3_3 = this.zzc;
        var4_4 = ((int[])var3_3).length;
        block23: for (var5_5 = 0; var5_5 < var4_4; var5_5 += 3) {
            block42: {
                var6_6 = this.zzv(var5_5);
                var7_7 = 1048575;
                var8_8 = 1.469367E-39f;
                var9_9 = var6_6 & var7_7;
                var10_10 = var9_9;
                var6_6 = zzfz.zzu(var6_6);
                switch (var6_6) {
                    default: {
                        continue block23;
                    }
                    case 51: 
                    case 52: 
                    case 53: 
                    case 54: 
                    case 55: 
                    case 56: 
                    case 57: 
                    case 58: 
                    case 59: 
                    case 60: 
                    case 61: 
                    case 62: 
                    case 63: 
                    case 64: 
                    case 65: 
                    case 66: 
                    case 67: 
                    case 68: {
                        var12_11 = this.zzs(var5_5) & var7_7;
                        var14_12 = zzhi.zzc(var1_1, var12_11);
                        var6_6 = zzhi.zzc(var2_2, var12_11);
                        if (var14_12 == var6_6 && (var6_6 = (int)zzgj.zzh(var15_13 = zzhi.zzf(var1_1, var10_10), var16_14 = zzhi.zzf(var2_2, var10_10))) != 0) continue block23;
                        break block42;
                    }
                    case 50: {
                        var15_13 = zzhi.zzf(var1_1, var10_10);
                        var16_14 = zzhi.zzf(var2_2, var10_10);
                        var6_6 = (int)zzgj.zzh(var15_13, var16_14);
                        ** GOTO lbl28
                    }
                    case 18: 
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: 
                    case 23: 
                    case 24: 
                    case 25: 
                    case 26: 
                    case 27: 
                    case 28: 
                    case 29: 
                    case 30: 
                    case 31: 
                    case 32: 
                    case 33: 
                    case 34: 
                    case 35: 
                    case 36: 
                    case 37: 
                    case 38: 
                    case 39: 
                    case 40: 
                    case 41: 
                    case 42: 
                    case 43: 
                    case 44: 
                    case 45: 
                    case 46: 
                    case 47: 
                    case 48: 
                    case 49: {
                        var15_13 = zzhi.zzf(var1_1, var10_10);
                        var16_14 = zzhi.zzf(var2_2, var10_10);
                        var6_6 = (int)zzgj.zzh(var15_13, var16_14);
lbl28:
                        // 2 sources

                        if (var6_6 != 0) continue block23;
                        break block42;
                    }
                    case 17: {
                        var6_6 = (int)this.zzF(var1_1, var2_2, var5_5);
                        if (var6_6 != 0 && (var6_6 = (int)zzgj.zzh(var15_13 = zzhi.zzf(var1_1, var10_10), var16_14 = zzhi.zzf(var2_2, var10_10))) != 0) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 16: {
                        var6_6 = (int)this.zzF(var1_1, var2_2, var5_5);
                        if (var6_6 != 0 && (var14_12 = (int)((cfr_temp_0 = (var12_11 = zzhi.zzd(var1_1, var10_10)) - (var10_10 = zzhi.zzd(var2_2, var10_10))) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) == 0) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 15: {
                        var6_6 = (int)this.zzF(var1_1, var2_2, var5_5);
                        if (var6_6 != 0 && (var6_6 = zzhi.zzc(var1_1, var10_10)) == (var7_7 = zzhi.zzc(var2_2, var10_10))) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 14: {
                        var6_6 = (int)this.zzF(var1_1, var2_2, var5_5);
                        if (var6_6 != 0 && (var14_12 = (int)((cfr_temp_1 = (var12_11 = zzhi.zzd(var1_1, var10_10)) - (var10_10 = zzhi.zzd(var2_2, var10_10))) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) == 0) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 13: {
                        var6_6 = (int)this.zzF(var1_1, var2_2, var5_5);
                        if (var6_6 != 0 && (var6_6 = zzhi.zzc(var1_1, var10_10)) == (var7_7 = zzhi.zzc(var2_2, var10_10))) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 12: {
                        var6_6 = (int)this.zzF(var1_1, var2_2, var5_5);
                        if (var6_6 != 0 && (var6_6 = zzhi.zzc(var1_1, var10_10)) == (var7_7 = zzhi.zzc(var2_2, var10_10))) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 11: {
                        var6_6 = (int)this.zzF(var1_1, var2_2, var5_5);
                        if (var6_6 != 0 && (var6_6 = zzhi.zzc(var1_1, var10_10)) == (var7_7 = zzhi.zzc(var2_2, var10_10))) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 10: {
                        var6_6 = (int)this.zzF(var1_1, var2_2, var5_5);
                        if (var6_6 != 0 && (var6_6 = (int)zzgj.zzh(var15_13 = zzhi.zzf(var1_1, var10_10), var16_14 = zzhi.zzf(var2_2, var10_10))) != 0) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 9: {
                        var6_6 = (int)this.zzF(var1_1, var2_2, var5_5);
                        if (var6_6 != 0 && (var6_6 = (int)zzgj.zzh(var15_13 = zzhi.zzf(var1_1, var10_10), var16_14 = zzhi.zzf(var2_2, var10_10))) != 0) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 8: {
                        var6_6 = (int)this.zzF(var1_1, var2_2, var5_5);
                        if (var6_6 != 0 && (var6_6 = (int)zzgj.zzh(var15_13 = zzhi.zzf(var1_1, var10_10), var16_14 = zzhi.zzf(var2_2, var10_10))) != 0) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 7: {
                        var6_6 = (int)this.zzF(var1_1, var2_2, var5_5);
                        if (var6_6 != 0 && (var6_6 = (int)zzhi.zzt(var1_1, var10_10)) == (var7_7 = (int)zzhi.zzt(var2_2, var10_10))) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 6: {
                        var6_6 = (int)this.zzF(var1_1, var2_2, var5_5);
                        if (var6_6 != 0 && (var6_6 = zzhi.zzc(var1_1, var10_10)) == (var7_7 = zzhi.zzc(var2_2, var10_10))) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 5: {
                        var6_6 = (int)this.zzF(var1_1, var2_2, var5_5);
                        if (var6_6 != 0 && (var14_12 = (int)((cfr_temp_2 = (var12_11 = zzhi.zzd(var1_1, var10_10)) - (var10_10 = zzhi.zzd(var2_2, var10_10))) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) == 0) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 4: {
                        var6_6 = (int)this.zzF(var1_1, var2_2, var5_5);
                        if (var6_6 != 0 && (var6_6 = zzhi.zzc(var1_1, var10_10)) == (var7_7 = zzhi.zzc(var2_2, var10_10))) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 3: {
                        var6_6 = (int)this.zzF(var1_1, var2_2, var5_5);
                        if (var6_6 != 0 && (var14_12 = (int)((cfr_temp_3 = (var12_11 = zzhi.zzd(var1_1, var10_10)) - (var10_10 = zzhi.zzd(var2_2, var10_10))) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1))) == 0) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 2: {
                        var6_6 = (int)this.zzF(var1_1, var2_2, var5_5);
                        if (var6_6 != 0 && (var14_12 = (int)((cfr_temp_4 = (var12_11 = zzhi.zzd(var1_1, var10_10)) - (var10_10 = zzhi.zzd(var2_2, var10_10))) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1))) == 0) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 1: {
                        var6_6 = (int)this.zzF(var1_1, var2_2, var5_5);
                        if (var6_6 != 0 && (var6_6 = Float.floatToIntBits(var17_15 = zzhi.zzb(var1_1, var10_10))) == (var7_7 = Float.floatToIntBits(var8_8 = zzhi.zzb(var2_2, var10_10)))) {
                            continue block23;
                        }
                        break block42;
                    }
                    case 0: 
                }
                var6_6 = (int)this.zzF(var1_1, var2_2, var5_5);
                if (var6_6 != 0 && (var14_12 = (int)((cfr_temp_5 = (var12_11 = Double.doubleToLongBits(var18_16 = zzhi.zza(var1_1, var10_10))) - (var10_10 = Double.doubleToLongBits(var20_17 = zzhi.zza(var2_2, var10_10)))) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1))) == 0) {
                    continue;
                }
            }
            return false;
        }
        var22_18 = (var1_1 = this.zzm.zza(var1_1)).equals(var2_2 = (var3_3 = (Object)this.zzm).zza(var2_2));
        return var22_18 != false;
    }

    public final boolean zzi(Object object) {
        int n3;
        zzfz zzfz2 = this;
        Object object2 = object;
        int n4 = 1048575;
        int n7 = 1048575;
        int n8 = 0;
        Object object3 = null;
        int n10 = 0;
        while (true) {
            int n14;
            int n15;
            block14: {
                Object object4;
                int n16;
                int n17;
                int n18;
                int n19;
                int n20;
                block11: {
                    long l2;
                    int[] nArray;
                    block12: {
                        int n21;
                        block13: {
                            n20 = zzfz2.zzj;
                            n3 = 1;
                            if (n10 >= n20) break;
                            n19 = zzfz2.zzi[n10];
                            n21 = zzfz2.zzc[n19];
                            n18 = zzfz2.zzv(n19);
                            nArray = zzfz2.zzc;
                            n17 = n19 + 2;
                            n20 = nArray[n17];
                            n17 = n20 & n4;
                            n16 = n3 << (n20 >>>= 20);
                            if (n17 != n7) {
                                if (n17 != n4) {
                                    object4 = zzb;
                                    long l3 = n17;
                                    n8 = ((Unsafe)object4).getInt(object2, l3);
                                }
                                n15 = n8;
                                n14 = n17;
                            } else {
                                n14 = n7;
                                n15 = n8;
                            }
                            n7 = 0x10000000 & n18;
                            if (n7 != 0) {
                                object4 = this;
                                object3 = object;
                                n20 = n19;
                                n3 = n14;
                                n17 = n15;
                                n7 = (int)(this.zzH(object, n19, n14, n15, n16) ? 1 : 0);
                                if (n7 == 0) {
                                    return false;
                                }
                            }
                            if ((n7 = zzfz.zzu(n18)) == (n8 = 9) || n7 == (n8 = 17)) break block11;
                            n8 = 27;
                            if (n7 == n8) break block12;
                            n8 = 60;
                            if (n7 == n8 || n7 == (n8 = 68)) break block13;
                            n8 = 49;
                            if (n7 == n8) break block12;
                            n8 = 50;
                            if (n7 == n8 && (n7 = (int)(((HashMap)(object4 = (zzfq)zzhi.zzf(object2, l2 = (long)(n18 & n4)))).isEmpty() ? 1 : 0)) == 0) {
                                object4 = (zzfp)zzfz2.zzz(n19);
                                throw null;
                            }
                            break block14;
                        }
                        n7 = (int)(zzfz2.zzJ(object2, n21, n19) ? 1 : 0);
                        if (n7 != 0 && (n7 = (int)(zzfz.zzI(object2, n18, (zzgh)(object4 = zzfz2.zzy(n19))) ? 1 : 0)) == 0) {
                            return false;
                        }
                        break block14;
                    }
                    if ((n8 = (int)((object4 = (List)zzhi.zzf(object2, l2 = (long)(n7 = n18 & n4))).isEmpty() ? 1 : 0)) == 0) {
                        object3 = zzfz2.zzy(n19);
                        nArray = null;
                        for (n20 = 0; n20 < (n3 = object4.size()); ++n20) {
                            Object e2 = object4.get(n20);
                            n3 = (int)(object3.zzi(e2) ? 1 : 0);
                            if (n3 != 0) continue;
                            return false;
                        }
                    }
                    break block14;
                }
                object4 = this;
                object3 = object;
                n20 = n19;
                n3 = n14;
                n17 = n15;
                n7 = (int)(this.zzH(object, n19, n14, n15, n16) ? 1 : 0);
                if (n7 != 0 && (n7 = (int)(zzfz.zzI(object2, n18, (zzgh)(object4 = zzfz2.zzy(n19))) ? 1 : 0)) == 0) {
                    return false;
                }
            }
            ++n10;
            n7 = n14;
            n8 = n15;
        }
        return n3 != 0;
    }
}

