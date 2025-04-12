/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzafc;
import com.google.android.gms.internal.ads.zzafd;
import com.google.android.gms.internal.ads.zzafe;
import com.google.android.gms.internal.ads.zzaff;
import com.google.android.gms.internal.ads.zzafg;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzalf;
import com.google.android.gms.internal.ads.zzali;
import com.google.android.gms.internal.ads.zzalj;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class zzalk
extends zzali {
    private zzalj zza;
    private int zzb;
    private boolean zzc;
    private zzaff zzd;
    private zzafd zze;

    public final long zza(zzfu zzfu2) {
        Object object = zzfu2.zzM();
        int n3 = 0;
        byte[] byArray = null;
        int n4 = object[0];
        int n7 = 1;
        if ((n4 &= n7) == n7) {
            return -1;
        }
        n4 = zzfu2.zzM()[0];
        Object object2 = this.zza;
        zzeq.zzb(object2);
        n4 >>= n7;
        int n8 = ((zzalj)object2).zze;
        zzafe[] zzafeArray = ((zzalj)object2).zzd;
        int n10 = 255;
        int n14 = 8;
        n8 = 8 - n8;
        n8 = n10 >>> n8;
        object = zzafeArray[n4 &= n8];
        n4 = (int)(object.zza ? 1 : 0);
        if (n4 == 0) {
            object = ((zzalj)object2).zza;
            n4 = object.zze;
        } else {
            object = ((zzalj)object2).zza;
            n4 = object.zzf;
        }
        int n15 = this.zzc;
        if (n15 != 0) {
            n3 = (this.zzb + n4) / 4;
        }
        if ((n15 = zzfu2.zzc()) < (n8 = zzfu2.zze() + 4)) {
            object2 = zzfu2.zzM();
            n8 = zzfu2.zze() + 4;
            object2 = Arrays.copyOf((byte[])object2, n8);
            n8 = ((Object)object2).length;
            zzfu2.zzI((byte[])object2, n8);
        } else {
            n15 = zzfu2.zze() + 4;
            zzfu2.zzJ(n15);
        }
        long l2 = n3;
        byArray = zzfu2.zzM();
        int n16 = zzfu2.zze() + -4;
        long l3 = 255L;
        byArray[n16] = n10 = (int)((byte)(l2 & l3));
        n16 = zzfu2.zze() + -3;
        byArray[n16] = n10 = (int)((byte)(l2 >>> n14 & l3));
        n16 = zzfu2.zze() + -2;
        byArray[n16] = n10 = (int)((byte)(l2 >>> 16 & l3));
        int n17 = zzfu2.zze() + -1;
        byArray[n17] = n16 = (int)((byte)(l2 >>> 24 & l3));
        this.zzc = n7;
        this.zzb = n4;
        return l2;
    }

    public final void zzb(boolean bl2) {
        super.zzb(bl2);
        if (bl2) {
            bl2 = false;
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean zzc(zzfu zzfu2, long l2, zzalf zzalf2) {
        Object object;
        Object object2;
        int n3;
        int n4;
        Object object3;
        Object object4;
        block50: {
            int n7;
            zzaff zzaff2;
            zzafe zzafe2;
            int n8;
            int n10;
            Object object5;
            int n14;
            int n15;
            Object object6;
            int n16;
            block49: {
                block48: {
                    block47: {
                        zzalk zzalk2 = this;
                        object4 = zzfu2;
                        zzalf zzalf3 = zzalf2;
                        object3 = this.zza;
                        n16 = 0;
                        Object var10_9 = null;
                        if (object3 != null) {
                            zzalf2.zza.getClass();
                            return false;
                        }
                        object6 = this.zzd;
                        n15 = 4;
                        n14 = 1;
                        if (object6 != null) break block47;
                        zzafg.zzd(n14, zzfu2, false);
                        int n17 = zzfu2.zzj();
                        int n18 = zzfu2.zzm();
                        int n19 = zzfu2.zzj();
                        n4 = zzfu2.zzi();
                        int n20 = n4 <= 0 ? -1 : n4;
                        n4 = zzfu2.zzi();
                        int n21 = n4 <= 0 ? -1 : n4;
                        n4 = zzfu2.zzi();
                        int n22 = n4 <= 0 ? -1 : n4;
                        n3 = zzfu2.zzm();
                        double d2 = n3 & 0xF;
                        double d5 = 2.0;
                        n4 = (int)Math.pow(d5, d2);
                        d2 = (n3 & 0xF0) >> n15;
                        d2 = Math.pow(d5, d2);
                        n3 = (int)d2;
                        n15 = zzfu2.zzm();
                        int n24 = 1;
                        boolean bl2 = n24 == (n15 &= n24);
                        byte[] byArray = zzfu2.zzM();
                        int n25 = zzfu2.zze();
                        byte[] byArray2 = Arrays.copyOf(byArray, n25);
                        int n26 = n3;
                        zzalk2.zzd = object4 = new zzaff(n17, n18, n19, n20, n21, n22, n4, n3, bl2, byArray2);
                        break block48;
                    }
                    object5 = this.zze;
                    if (object5 != null) break block49;
                    boolean bl3 = true;
                    this.zze = object4 = zzafg.zzc(zzfu2, bl3, bl3);
                }
                boolean bl4 = false;
                object2 = null;
                break block50;
            }
            int n27 = zzfu2.zze();
            Object[] objectArray = new byte[n27];
            byte[] byArray = zzfu2.zzM();
            n14 = zzfu2.zze();
            System.arraycopy(byArray, 0, objectArray, 0, n14);
            int n28 = ((zzaff)object6).zza;
            n14 = 5;
            zzafg.zzd(n14, zzfu2, false);
            int n29 = zzfu2.zzm();
            int n30 = 1;
            int n32 = n29 + n30;
            byte[] byArray3 = zzfu2.zzM();
            zzafc zzafc2 = new zzafc(byArray3);
            int n34 = zzfu2.zzd();
            int n35 = 8;
            zzafc2.zzc(n34 *= 8);
            n34 = 0;
            object4 = null;
            while (true) {
                block57: {
                    long l3;
                    long l4;
                    block56: {
                        block55: {
                            block54: {
                                block53: {
                                    block51: {
                                        block52: {
                                            n10 = 24;
                                            n3 = 2;
                                            n16 = 16;
                                            if (n34 >= n32) break block51;
                                            n35 = zzafc2.zzb(n10);
                                            if (n35 != (n8 = 5653314)) {
                                                n34 = zzafc2.zza();
                                                object3 = new StringBuilder("expected code book to start with [0x56, 0x43, 0x42] at ");
                                                ((StringBuilder)object3).append(n34);
                                                throw zzch.zza(((StringBuilder)object3).toString(), null);
                                            }
                                            n16 = zzafc2.zzb(n16);
                                            n8 = zzafc2.zzb(n10);
                                            n35 = (int)(zzafc2.zzd() ? 1 : 0);
                                            if (n35 != 0) break block52;
                                            n35 = (int)(zzafc2.zzd() ? 1 : 0);
                                            zzafe2 = null;
                                            break block53;
                                        }
                                        zzafc2.zzc(n14);
                                        Object var40_69 = null;
                                        for (n35 = 0; n35 < n8; n35 += n10) {
                                            n10 = zzafg.zza(n8 - n35);
                                            n10 = zzafc2.zzb(n10);
                                        }
                                        break block54;
                                    }
                                    zzaff2 = object6;
                                    n34 = 6;
                                    n15 = zzafc2.zzb(n34) + 1;
                                    object6 = null;
                                    for (n4 = 0; n4 < n15; ++n4) {
                                        n8 = zzafc2.zzb(n16);
                                        if (n8 == 0) continue;
                                        throw zzch.zza("placeholder of time domain transforms not zeroed out", null);
                                    }
                                    n15 = zzafc2.zzb(n34);
                                    n4 = 1;
                                    n15 += n4;
                                    break;
                                }
                                for (n10 = 0; n10 < n8; ++n10) {
                                    if (n35 != 0) {
                                        boolean bl5 = zzafc2.zzd();
                                        if (!bl5) continue;
                                        zzafc2.zzc(n14);
                                        continue;
                                    }
                                    zzafc2.zzc(n14);
                                }
                            }
                            if ((n35 = zzafc2.zzb(n15)) > n3) {
                                object4 = new StringBuilder("lookup type greater than 2 not decodable: ");
                                ((StringBuilder)object4).append(n35);
                                throw zzch.zza(((StringBuilder)object4).toString(), null);
                            }
                            n10 = 1;
                            if (n35 == n10) break block55;
                            if (n35 == n3) break block56;
                            zzaff2 = object6;
                            break block57;
                        }
                        n3 = n35;
                    }
                    n35 = 32;
                    zzafc2.zzc(n35);
                    zzafc2.zzc(n35);
                    n35 = zzafc2.zzb(n15) + n10;
                    zzafc2.zzc(n10);
                    if (n3 == n10) {
                        double d7;
                        if (n16 != 0) {
                            zzaff2 = object6;
                            l4 = n8;
                            d7 = n16;
                            double d9 = l4;
                            double d12 = 1.0;
                            d7 = d12 / d7;
                            d7 = Math.floor(Math.pow(d9, d7));
                            l3 = (long)d7;
                        } else {
                            zzaff2 = object6;
                            l3 = 0L;
                            d7 = 0.0;
                        }
                    } else {
                        zzaff2 = object6;
                        l3 = n16;
                        l4 = n8;
                        l3 *= l4;
                    }
                    l4 = n35;
                    n16 = (int)(l3 *= l4);
                    zzafc2.zzc(n16);
                }
                ++n34;
                object6 = zzaff2;
                n16 = 0;
                Object var10_13 = null;
                n15 = 4;
                n35 = 8;
            }
            n8 = 0;
            object2 = null;
            while (true) {
                int n36;
                block61: {
                    int[] nArray;
                    Object object7;
                    block60: {
                        block58: {
                            block59: {
                                object7 = 3;
                                if (n8 >= n15) break block58;
                                n35 = zzafc2.zzb(n16);
                                if (n35 == 0) break block59;
                                if (n35 != n4) {
                                    object4 = new StringBuilder("floor type greater than 1 not decodable: ");
                                    ((StringBuilder)object4).append(n35);
                                    throw zzch.zza(((StringBuilder)object4).toString(), null);
                                }
                                n4 = zzafc2.zzb(n14);
                                nArray = new int[n4];
                                n10 = -1;
                                for (n14 = 0; n14 < n4; ++n14) {
                                    n34 = 4;
                                    nArray[n14] = n16 = zzafc2.zzb(n34);
                                    if (n16 > n10) {
                                        n10 = n16;
                                    }
                                    n34 = 6;
                                    n16 = 16;
                                }
                                object4 = new int[++n10];
                                Object var10_15 = null;
                                break block60;
                            }
                            n36 = n15;
                            n34 = 8;
                            zzafc2.zzc(n34);
                            n3 = 16;
                            zzafc2.zzc(n3);
                            zzafc2.zzc(n3);
                            zzafc2.zzc(6);
                            zzafc2.zzc(n34);
                            n16 = zzafc2.zzb(4) + 1;
                            object3 = null;
                            for (n3 = 0; n3 < n16; ++n3) {
                                zzafc2.zzc(n34);
                                n34 = 8;
                            }
                            break block61;
                        }
                        n3 = zzafc2.zzb(n34);
                        n16 = 1;
                        n3 += n16;
                        break;
                    }
                    for (n16 = 0; n16 < n10; ++n16) {
                        n14 = zzafc2.zzb((int)object7);
                        n7 = 1;
                        object4[n16] = ++n14;
                        n14 = zzafc2.zzb(n3);
                        if (n14 > 0) {
                            object7 = 8;
                            zzafc2.zzc((int)object7);
                        } else {
                            object7 = 8;
                        }
                        n36 = n15;
                        object3 = null;
                        for (n3 = 0; n3 < (n15 = n7 << n14); ++n3) {
                            zzafc2.zzc((int)object7);
                            object7 = 8;
                            n7 = 1;
                        }
                        n15 = n36;
                        n3 = 2;
                        object7 = 3;
                    }
                    n36 = n15;
                    zzafc2.zzc(n3);
                    n16 = zzafc2.zzb(4);
                    object3 = null;
                    n15 = 0;
                    object = null;
                    n14 = 0;
                    for (n3 = 0; n3 < n4; ++n3) {
                        Object object7 = nArray[n3];
                        object7 = object4[object7];
                        n15 += object7;
                        while (n14 < n15) {
                            zzafc2.zzc(n16);
                            ++n14;
                        }
                    }
                }
                ++n8;
                n15 = n36;
                n34 = 6;
                n3 = 2;
                n16 = 16;
                n4 = 1;
                n14 = 5;
                n10 = 24;
            }
            n15 = 0;
            object = null;
            while (true) {
                int n37;
                int n38;
                int[] nArray;
                if (n15 < n3) {
                    n8 = zzafc2.zzb(16);
                    if (n8 > (n4 = 2)) {
                        throw zzch.zza("residueType greater than 2 is not decodable", null);
                    }
                    n4 = 24;
                    zzafc2.zzc(n4);
                    zzafc2.zzc(n4);
                    zzafc2.zzc(n4);
                    n8 = zzafc2.zzb(n34) + n16;
                    n34 = 8;
                    zzafc2.zzc(n34);
                    nArray = new int[n8];
                } else {
                    n3 = zzafc2.zzb(n34) + 1;
                    object4 = null;
                    break;
                }
                for (n14 = 0; n14 < n8; ++n14) {
                    n38 = 3;
                    n35 = zzafc2.zzb(n38);
                    n10 = (int)(zzafc2.zzd() ? 1 : 0);
                    if (n10 != 0) {
                        n10 = 5;
                        n37 = zzafc2.zzb(n10);
                    } else {
                        n10 = 5;
                        n37 = 0;
                    }
                    nArray[n14] = n37 = n37 * 8 + n35;
                }
                n38 = 3;
                n10 = 5;
                for (n14 = 0; n14 < n8; ++n14) {
                    Object var40_73 = null;
                    for (n35 = 0; n35 < n34; ++n35) {
                        n37 = nArray[n14];
                        int n39 = 1;
                        n7 = n39 << n35;
                        if ((n37 &= n7) != 0) {
                            zzafc2.zzc(n34);
                        }
                        n34 = 8;
                    }
                    n34 = 8;
                }
                ++n15;
                n34 = 6;
                n16 = 1;
            }
            for (n34 = 0; n34 < n3; ++n34) {
                n16 = 16;
                n15 = zzafc2.zzb(n16);
                if (n15 != 0) {
                    object6 = "mapping type other than 0 not supported: ";
                    StringBuilder stringBuilder = new StringBuilder((String)object6);
                    stringBuilder.append(n15);
                    String string2 = stringBuilder.toString();
                    object = "VorbisUtil";
                    zzfk.zzc((String)object, string2);
                    n16 = 2;
                    n8 = 4;
                    continue;
                }
                n16 = (int)(zzafc2.zzd() ? 1 : 0);
                if (n16 != 0) {
                    n15 = zzafc2.zzb(4);
                    n16 = 1;
                    n15 += n16;
                } else {
                    n16 = 1;
                    n15 = 1;
                }
                n4 = (int)(zzafc2.zzd() ? 1 : 0);
                if (n4 != 0) {
                    n4 = 8;
                    n8 = zzafc2.zzb(n4) + n16;
                    Object var10_21 = null;
                    for (n16 = 0; n16 < n8; ++n16) {
                        n4 = n28 + -1;
                        n14 = zzafg.zza(n4);
                        zzafc2.zzc(n14);
                        n4 = zzafg.zza(n4);
                        zzafc2.zzc(n4);
                    }
                }
                if ((n4 = zzafc2.zzb(n16 = 2)) != 0) {
                    throw zzch.zza("to reserved bits must be zero after mapping coupling steps", null);
                }
                n4 = 1;
                if (n15 > n4) {
                    object6 = null;
                    for (n4 = 0; n4 < n28; ++n4) {
                        n8 = 4;
                        zzafc2.zzc(n8);
                    }
                }
                n8 = 4;
                object6 = null;
                for (n4 = 0; n4 < n15; ++n4) {
                    n14 = 8;
                    zzafc2.zzc(n14);
                    zzafc2.zzc(n14);
                    zzafc2.zzc(n14);
                }
            }
            n34 = zzafc2.zzb(6);
            n3 = n34 + 1;
            zzafe[] zzafeArray = new zzafe[n3];
            object = null;
            for (n15 = 0; n15 < n3; ++n15) {
                n4 = (int)(zzafc2.zzd() ? 1 : 0);
                n8 = 16;
                n28 = zzafc2.zzb(n8);
                n14 = zzafc2.zzb(n8);
                int n41 = 8;
                n35 = zzafc2.zzb(n41);
                zzafeArray[n15] = zzafe2 = new zzafe(n4 != 0, n28, n14, n35);
            }
            n3 = (int)(zzafc2.zzd() ? 1 : 0);
            if (n3 == 0) {
                throw zzch.zza("framing bit after modes not set as expected", null);
            }
            n28 = zzafg.zza(n34);
            object = object3;
            object6 = zzaff2;
            object2 = object5;
            object5 = objectArray;
            objectArray = zzafeArray;
            object2 = object3 = new zzalj(zzaff2, (zzafd)object2, (byte[])object5, zzafeArray, n28);
        }
        zzalk2.zza = object2;
        if (object2 == null) {
            return true;
        }
        object4 = new ArrayList();
        object3 = ((zzalj)object2).zza;
        byte[] byArray = ((zzaff)object3).zzg;
        ((ArrayList)object4).add(byArray);
        byte[] byArray4 = ((zzalj)object2).zzc;
        ((ArrayList)object4).add(byArray4);
        zzcd zzcd2 = zzafg.zzb(zzgbc.zzl(((zzalj)object2).zzb.zzb));
        object = new zzal();
        ((zzal)object).zzX("audio/vorbis");
        n4 = ((zzaff)object3).zzd;
        ((zzal)object).zzx(n4);
        n4 = ((zzaff)object3).zzc;
        ((zzal)object).zzS(n4);
        n4 = ((zzaff)object3).zza;
        ((zzal)object).zzy(n4);
        n3 = ((zzaff)object3).zzb;
        ((zzal)object).zzY(n3);
        ((zzal)object).zzL((List)object4);
        ((zzal)object).zzQ(zzcd2);
        zzalf3.zza = object4 = ((zzal)object).zzad();
        return true;
    }

    public final void zzi(long l2) {
        zzaff zzaff2;
        boolean bl2;
        super.zzi(l2);
        long l3 = 0L;
        int n3 = 0;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 != false) {
            bl2 = true;
        } else {
            bl2 = false;
            zzaff2 = null;
        }
        this.zzc = bl2;
        zzaff2 = this.zzd;
        if (zzaff2 != null) {
            n3 = zzaff2.zze;
        }
        this.zzb = n3;
    }
}

