/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzn;
import com.google.android.gms.internal.ads.zzp;
import com.google.android.gms.internal.ads.zzr;
import com.google.android.gms.internal.ads.zzs;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

public final class zzt {
    public static final zzt zza;
    public static final zzt zzb;
    public static final zzn zzc;
    private static final String zzj;
    private static final String zzk;
    private static final String zzl;
    private static final String zzm;
    private static final String zzn;
    private static final String zzo;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final byte[] zzg;
    public final int zzh;
    public final int zzi;
    private int zzp;

    static {
        Object object = new zzr();
        int n3 = 1;
        ((zzr)object).zzc(n3);
        int n4 = 2;
        ((zzr)object).zzb(n4);
        int n7 = 3;
        ((zzr)object).zzd(n7);
        zza = ((zzr)object).zzg();
        object = new zzr();
        ((zzr)object).zzc(n3);
        ((zzr)object).zzb(n3);
        ((zzr)object).zzd(n4);
        zzb = ((zzr)object).zzg();
        int n8 = 36;
        zzj = Integer.toString(0, n8);
        zzk = Integer.toString(n3, n8);
        zzl = Integer.toString(n4, n8);
        zzm = Integer.toString(n7, n8);
        zzn = Integer.toString(4, n8);
        zzo = Integer.toString(5, n8);
        zzc = object = new zzp();
    }

    public /* synthetic */ zzt(int n3, int n4, int n7, byte[] byArray, int n8, int n10, zzs zzs2) {
        this.zzd = n3;
        this.zze = n4;
        this.zzf = n7;
        this.zzg = byArray;
        this.zzh = n8;
        this.zzi = n10;
    }

    public static int zza(int n3) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 9;
            int n7 = 6;
            if (n3 != n4) {
                n4 = 4;
                if (n3 != n4 && n3 != (n4 = 5) && n3 != n7 && n3 != (n4 = 7)) {
                    return -1;
                }
                return 2;
            }
            return n7;
        }
        return n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int zzb(int n3) {
        int n4 = 1;
        if (n3 == n4) return 3;
        n4 = 4;
        if (n3 == n4) return 10;
        n4 = 13;
        if (n3 == n4) return 2;
        n4 = 16;
        int n7 = 6;
        if (n3 == n4) return n7;
        n4 = 18;
        int n8 = 7;
        if (n3 == n4) return n8;
        if (n3 == n7 || n3 == n8) return 3;
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean zzg(zzt zzt2) {
        int n3;
        byte[] byArray;
        int n4 = 1;
        if (zzt2 == null) {
            return n4 != 0;
        }
        int n7 = zzt2.zzd;
        int n8 = 2;
        int n10 = -1;
        if (n7 != n10 && n7 != n4) {
            if (n7 != n8) return 0 != 0;
        }
        if ((n7 = zzt2.zze) != n10) {
            if (n7 != n8) return 0 != 0;
        }
        if ((n7 = zzt2.zzf) != n10) {
            n8 = 3;
            if (n7 != n8) return 0 != 0;
        }
        if ((byArray = zzt2.zzg) != null) return 0 != 0;
        n7 = zzt2.zzi;
        n8 = 8;
        if (n7 != n10) {
            if (n7 != n8) return 0 != 0;
        }
        if ((n3 = zzt2.zzh) == n10) return n4 != 0;
        if (n3 == n8) return n4 != 0;
        return 0 != 0;
    }

    private static String zzh(int n3) {
        int n4 = -1;
        if (n3 != n4) {
            n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return hj0_0.a(n3, "Undefined color range ");
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    private static String zzi(int n3) {
        int n4 = -1;
        if (n3 != n4) {
            n4 = 6;
            if (n3 != n4) {
                n4 = 1;
                if (n3 != n4) {
                    n4 = 2;
                    if (n3 != n4) {
                        return hj0_0.a(n3, "Undefined color space ");
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    private static String zzj(int n3) {
        int n4 = -1;
        if (n3 != n4) {
            n4 = 10;
            if (n3 != n4) {
                n4 = 1;
                if (n3 != n4) {
                    n4 = 2;
                    if (n3 != n4) {
                        n4 = 3;
                        if (n3 != n4) {
                            n4 = 6;
                            if (n3 != n4) {
                                n4 = 7;
                                if (n3 != n4) {
                                    return hj0_0.a(n3, "Undefined color transfer ");
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zzt.class) == (object2 = object.getClass())) {
            int n3;
            object = (zzt)object;
            int n4 = this.zzd;
            int n7 = ((zzt)object).zzd;
            if (n4 == n7 && (n4 = this.zze) == (n7 = ((zzt)object).zze) && (n4 = this.zzf) == (n7 = ((zzt)object).zzf) && (n4 = (int)(Arrays.equals((byte[])(object2 = (Object)this.zzg), (byte[])(object3 = (Object)((zzt)object).zzg)) ? 1 : 0)) != 0 && (n4 = this.zzh) == (n7 = ((zzt)object).zzh) && (n4 = this.zzi) == (n3 = ((zzt)object).zzi)) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zzp;
        if (n3 == 0) {
            n3 = (this.zzd + 527) * 31;
            int n4 = this.zze;
            n3 = (n3 + n4) * 31;
            n4 = this.zzf;
            byte[] byArray = this.zzg;
            n3 = (n3 + n4) * 31;
            n4 = (Arrays.hashCode(byArray) + n3) * 31;
            n3 = this.zzh;
            n4 = (n4 + n3) * 31;
            n3 = this.zzi;
            this.zzp = n4 += n3;
            return n4;
        }
        return n3;
    }

    public final String toString() {
        byte[] byArray;
        String string2;
        int n3 = this.zzh;
        int n4 = this.zzf;
        int n7 = this.zze;
        int n8 = this.zzd;
        String string3 = zzt.zzi(n8);
        CharSequence charSequence = zzt.zzh(n7);
        String string4 = zzt.zzj(n4);
        String string5 = "NA";
        int n10 = -1;
        if (n3 != n10) {
            String string6 = "bit Luma";
            string2 = UX.a(n3, string6);
        } else {
            string2 = string5;
        }
        int n14 = this.zzi;
        if (n14 != n10) {
            string5 = UX.a(n14, "bit Chroma");
        }
        if ((byArray = this.zzg) != null) {
            n10 = 1;
        } else {
            n10 = 0;
            byArray = null;
        }
        String string7 = ", ";
        charSequence = og_1.a("ColorInfo(", string3, string7, (String)charSequence, string7);
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append(string7);
        ((StringBuilder)charSequence).append(n10 != 0);
        ((StringBuilder)charSequence).append(string7);
        return ko_0.a((StringBuilder)charSequence, string2, string7, string5, ")");
    }

    public final zzr zzc() {
        zzr zzr2 = new zzr(this, null);
        return zzr2;
    }

    public final String zzd() {
        Serializable serializable;
        int n3;
        String string2;
        int n4;
        String string3;
        int n7 = this.zzf();
        String string4 = "/";
        if (n7 != 0) {
            n7 = this.zzd;
            string3 = zzt.zzi(n7);
            n4 = this.zze;
            string2 = zzt.zzh(n4);
            n3 = this.zzf;
            String string5 = zzt.zzj(n3);
            serializable = Locale.US;
            string3 = KW.a(string3, string4, string2, string4, string5);
        } else {
            string3 = "NA/NA/NA";
        }
        n4 = this.zze();
        if (n4 != 0) {
            n4 = this.zzh;
            n3 = this.zzi;
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append(n4);
            ((StringBuilder)serializable).append(string4);
            ((StringBuilder)serializable).append(n3);
            string2 = ((StringBuilder)serializable).toString();
        } else {
            string2 = "NA/NA";
        }
        return n1.a(string3, string4, string2);
    }

    public final boolean zze() {
        int n3 = this.zzh;
        int n4 = -1;
        return n3 != n4 && (n3 = this.zzi) != n4;
    }

    public final boolean zzf() {
        int n3 = this.zzd;
        int n4 = -1;
        return n3 != n4 && (n3 = this.zze) != n4 && (n3 = this.zzf) != n4;
    }
}

