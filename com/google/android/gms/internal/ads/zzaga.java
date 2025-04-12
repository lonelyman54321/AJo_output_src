/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzade;
import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaeb;
import com.google.android.gms.internal.ads.zzaec;
import com.google.android.gms.internal.ads.zzaed;
import com.google.android.gms.internal.ads.zzaee;
import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzaeg;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaes;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaey;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzafg;
import com.google.android.gms.internal.ads.zzafy;
import com.google.android.gms.internal.ads.zzafz;
import com.google.android.gms.internal.ads.zzagw;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzft;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import java.util.Arrays;
import java.util.List;

public final class zzaga
implements zzadu {
    public static final zzaea zza;
    private final byte[] zzb;
    private final zzfu zzc;
    private final zzaeb zzd;
    private zzadx zze;
    private zzafa zzf;
    private int zzg;
    private zzcd zzh;
    private zzaeg zzi;
    private int zzj;
    private int zzk;
    private zzafy zzl;
    private int zzm;
    private long zzn;

    static {
        zzafz zzafz2 = new zzafz();
        zza = zzafz2;
    }

    public zzaga() {
        throw null;
    }

    public zzaga(int n3) {
        Object object = new byte[42];
        this.zzb = object;
        object = new zzfu;
        byte[] byArray = new byte[32768];
        super(byArray, 0);
        this.zzc = object;
        object = new zzaeb;
        super();
        this.zzd = object;
        this.zzg = 0;
    }

    private final long zza(zzfu zzfu2, boolean n3) {
        int n4;
        int n7;
        int n8;
        zzaeg zzaeg2 = this.zzi;
        zzaeg2.getClass();
        for (n8 = zzfu2.zzd(); n8 <= (n7 = zzfu2.zze() + -16); ++n8) {
            zzfu2.zzK(n8);
            zzaeg zzaeg3 = this.zzi;
            n4 = this.zzk;
            zzaeb zzaeb2 = this.zzd;
            n7 = (int)(zzaec.zzc(zzfu2, zzaeg3, n4, zzaeb2) ? 1 : 0);
            if (n7 == 0) continue;
            zzfu2.zzK(n8);
            return this.zzd.zza;
        }
        if (n3 != 0) {
            while (true) {
                n3 = zzfu2.zze();
                n7 = this.zzj;
                if (n8 > (n3 -= n7)) break;
                zzfu2.zzK(n8);
                zzaeg zzaeg4 = this.zzi;
                n7 = this.zzk;
                zzaeb zzaeb3 = this.zzd;
                try {
                    n3 = (int)(zzaec.zzc(zzfu2, zzaeg4, n7, zzaeb3) ? 1 : 0);
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    n3 = 0;
                    zzaeg4 = null;
                }
                n7 = zzfu2.zzd();
                n4 = zzfu2.zze();
                if (n7 <= n4 && n3 != 0) {
                    zzfu2.zzK(n8);
                    return this.zzd.zza;
                }
                ++n8;
            }
            n3 = zzfu2.zze();
            zzfu2.zzK(n3);
        } else {
            zzfu2.zzK(n8);
        }
        return -1;
    }

    private final void zzg() {
        long l2 = this.zzn * 1000000L;
        zzaeg zzaeg2 = this.zzi;
        long l3 = zzaeg2.zze;
        long l4 = l2 / l3;
        zzafa zzafa2 = this.zzf;
        int n3 = this.zzm;
        zzafa2.zzs(l4, 1, n3, 0, null);
    }

    public final int zzb(zzadv zzadv2, zzaeq zzaeq2) {
        int n3;
        int n4;
        Object object;
        block23: {
            block24: {
                int n7;
                int n8;
                block25: {
                    block22: {
                        int n10;
                        int n14;
                        Object object2;
                        Object object3;
                        Object object4;
                        int n15;
                        zzaga zzaga2;
                        block26: {
                            long l2;
                            block27: {
                                Object object5;
                                block34: {
                                    int n16;
                                    block29: {
                                        int n17;
                                        Object object6;
                                        int n18;
                                        block33: {
                                            block31: {
                                                block32: {
                                                    block30: {
                                                        long l3;
                                                        block28: {
                                                            zzaga2 = this;
                                                            object = zzadv2;
                                                            n4 = 2;
                                                            n15 = this.zzg;
                                                            n3 = 1;
                                                            n16 = 0;
                                                            if (n15 == 0) break block23;
                                                            if (n15 == n3) break block24;
                                                            n18 = 0;
                                                            object4 = null;
                                                            n8 = 3;
                                                            n7 = 4;
                                                            if (n15 == n4) break block25;
                                                            if (n15 == n8) break block26;
                                                            l2 = -1;
                                                            if (n15 == n7) break block27;
                                                            this.zzf.getClass();
                                                            object6 = this.zzi;
                                                            object6.getClass();
                                                            object5 = this.zzl;
                                                            if (object5 == null || (n18 = ((zzade)object5).zze()) == 0) break block28;
                                                            object4 = zzaeq2;
                                                            n16 = ((zzade)object5).zza(zzadv2, zzaeq2);
                                                            break block29;
                                                        }
                                                        long l4 = zzaga2.zzn;
                                                        long l7 = l4 - l2;
                                                        n15 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
                                                        if (n15 != 0) break block30;
                                                        zzaga2.zzn = l3 = zzaec.zzb((zzadv)object, (zzaeg)object6);
                                                        break block29;
                                                    }
                                                    object6 = zzaga2.zzc;
                                                    n15 = ((zzfu)object6).zze();
                                                    if (n15 >= (n18 = 32768)) break block31;
                                                    n17 = object.zza((byte[])(object6 = (Object)((zzfu)object6).zzM()), n15, n18 -= n15);
                                                    if (n17 != (n4 = -1)) {
                                                        n3 = 0;
                                                        Object var22_31 = null;
                                                    }
                                                    if (n3 != 0) break block32;
                                                    object6 = zzaga2.zzc;
                                                    ((zzfu)object6).zzJ(n15 += n17);
                                                    break block33;
                                                }
                                                object = zzaga2.zzc;
                                                n17 = ((zzfu)object).zzb();
                                                if (n17 != 0) break block33;
                                                this.zzg();
                                                n16 = -1;
                                                break block29;
                                            }
                                            n3 = 0;
                                            Object var22_32 = null;
                                        }
                                        object = zzaga2.zzc;
                                        n4 = ((zzfu)object).zzd();
                                        n15 = zzaga2.zzm;
                                        n18 = zzaga2.zzj;
                                        if (n15 < n18) {
                                            n8 = ((zzfu)object).zzb();
                                            n18 -= n15;
                                            n15 = Math.min(n18, n8);
                                            ((zzfu)object).zzL(n15);
                                        }
                                        object = zzaga2.zzc;
                                        long l8 = zzaga2.zza((zzfu)object, n3 != 0);
                                        object = zzaga2.zzc;
                                        n18 = ((zzfu)object).zzd() - n4;
                                        ((zzfu)object).zzK(n4);
                                        object = zzaga2.zzf;
                                        object6 = zzaga2.zzc;
                                        zzaey.zzb((zzafa)object, (zzfu)object6, n18);
                                        zzaga2.zzm = n17 = zzaga2.zzm + n18;
                                        n17 = (int)(l8 == l2 ? 0 : (l8 < l2 ? -1 : 1));
                                        if (n17 != 0) {
                                            this.zzg();
                                            zzaga2.zzm = 0;
                                            zzaga2.zzn = l8;
                                        }
                                        if ((n4 = ((zzfu)(object = zzaga2.zzc)).zzb()) < (n15 = 16)) break block34;
                                    }
                                    return n16;
                                }
                                n4 = ((zzfu)object).zzb();
                                object5 = ((zzfu)object).zzM();
                                n3 = ((zzfu)object).zzd();
                                object = ((zzfu)object).zzM();
                                System.arraycopy(object5, n3, object, 0, n4);
                                zzaga2.zzc.zzK(0);
                                zzaga2.zzc.zzJ(n4);
                                return 0;
                            }
                            zzadv2.zzj();
                            zzfu zzfu2 = new zzfu(n4);
                            byte[] byArray = zzfu2.zzM();
                            zzadv zzadv3 = zzadv2;
                            zzadv3 = (zzadi)zzadv2;
                            ((zzadi)zzadv3).zzm(byArray, 0, n4, false);
                            n15 = zzfu2.zzq();
                            n4 = n15 >> 2;
                            n3 = 16382;
                            if (n4 == n3) {
                                zzadv2.zzj();
                                this.zzk = n15;
                                zzadx zzadx2 = this.zze;
                                n15 = zzgd.zza;
                                long l12 = zzadv2.zzf();
                                long l14 = zzadv2.zzd();
                                zzaeg zzaeg2 = this.zzi;
                                zzaeg2.getClass();
                                object = zzaeg2.zzk;
                                if (object != null) {
                                    object = new zzaee(zzaeg2, l12);
                                } else {
                                    long l15;
                                    long l16;
                                    long l17 = 0L;
                                    Object object7 = l14 == l2 ? 0 : (l14 < l2 ? -1 : 1);
                                    if (object7 != false && (object7 = (l16 = (l15 = zzaeg2.zzj) - l17) == 0L ? 0 : (l16 < 0L ? -1 : 1)) > 0) {
                                        int n19 = this.zzk;
                                        Object object8 = object;
                                        this.zzl = object = new zzafy(zzaeg2, n19, l12, l14);
                                        object = ((zzade)object).zzb();
                                    } else {
                                        l15 = zzaeg2.zza();
                                        object = new zzaes(l15, l17);
                                    }
                                }
                                zzadx2.zzO((zzaet)object);
                                zzaga2.zzg = 5;
                                return 0;
                            }
                            zzadv2.zzj();
                            throw zzch.zza("First frame does not start with sync code.", null);
                        }
                        Object object9 = this.zzi;
                        do {
                            zzadv2.zzj();
                            object3 = new byte[n7];
                            object2 = new zzft((byte[])object3, n7);
                            object3 = ((zzft)object2).zza;
                            object4 = object;
                            object4 = (zzadi)object;
                            ((zzadi)object4).zzm((byte[])object3, 0, n7, false);
                            n3 = (int)(((zzft)object2).zzo() ? 1 : 0);
                            int n20 = ((zzft)object2).zzd(7);
                            n15 = ((zzft)object2).zzd(24) + n7;
                            n14 = 6;
                            if (n20 == 0) {
                                n4 = 38;
                                object2 = new byte[n4];
                                ((zzadi)object4).zzn((byte[])object2, 0, n4, false);
                                object9 = new zzaeg((byte[])object2, n7);
                            } else {
                                byte[] byArray;
                                zzfu zzfu3;
                                if (object9 == null) break block22;
                                if (n20 == n8) {
                                    zzfu3 = new zzfu(n15);
                                    byArray = zzfu3.zzM();
                                    ((zzadi)object4).zzn(byArray, 0, n15, false);
                                    object2 = zzaed.zzb(zzfu3);
                                    object9 = ((zzaeg)object9).zzf((zzaef)object2);
                                } else if (n20 == n7) {
                                    zzfu3 = new zzfu(n15);
                                    byArray = zzfu3.zzM();
                                    ((zzadi)object4).zzn(byArray, 0, n15, false);
                                    zzfu3.zzL(n7);
                                    object2 = Arrays.asList(zzafg.zzc((zzfu)zzfu3, (boolean)false, (boolean)false).zzb);
                                    object9 = ((zzaeg)object9).zzg((List)object2);
                                } else if (n20 == n14) {
                                    zzfu3 = new zzfu(n15);
                                    byArray = zzfu3.zzM();
                                    ((zzadi)object4).zzn(byArray, 0, n15, false);
                                    zzfu3.zzL(n7);
                                    object2 = zzgbc.zzn(zzagw.zzb(zzfu3));
                                    object9 = ((zzaeg)object9).zze((List)object2);
                                } else {
                                    ((zzadi)object4).zzo(n15, false);
                                }
                            }
                            n15 = zzgd.zza;
                            zzaga2.zzi = object9;
                        } while (n3 == 0);
                        object9.getClass();
                        zzaga2.zzj = n10 = Math.max(((zzaeg)object9).zzc, n14);
                        object = zzaga2.zzf;
                        object9 = zzaga2.zzi;
                        object2 = zzaga2.zzb;
                        object3 = zzaga2.zzh;
                        object9 = ((zzaeg)object9).zzc((byte[])object2, (zzcd)object3);
                        object.zzl((zzan)object9);
                        zzaga2.zzg = n7;
                        return 0;
                    }
                    object = new IllegalArgumentException();
                    throw object;
                }
                zzfu zzfu4 = new zzfu(n7);
                byte[] byArray = zzfu4.zzM();
                object = (zzadi)zzadv2;
                ((zzadi)object).zzn(byArray, 0, n7, false);
                long l18 = zzfu4.zzu();
                long l19 = 1716281667L;
                n7 = (int)(l18 == l19 ? 0 : (l18 < l19 ? -1 : 1));
                if (n7 == 0) {
                    this.zzg = n8;
                    return 0;
                }
                throw zzch.zza("Failed to read FLAC stream marker.", null);
            }
            byte[] byArray = this.zzb;
            zzadv zzadv4 = zzadv2;
            ((zzadi)zzadv2).zzm(byArray, 0, 42, false);
            zzadv2.zzj();
            this.zzg = n4;
            return 0;
        }
        zzadv2.zzj();
        long l20 = zzadv2.zze();
        zzcd zzcd2 = zzaed.zza(zzadv2, n3 != 0);
        long l21 = zzadv2.zze() - l20;
        object = (zzadi)zzadv2;
        n4 = (int)l21;
        ((zzadi)object).zzo(n4, false);
        this.zzh = zzcd2;
        this.zzg = n3;
        return 0;
    }

    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    public final void zzd(zzadx zzadx2) {
        zzafa zzafa2;
        this.zze = zzadx2;
        this.zzf = zzafa2 = zzadx2.zzw(0, 1);
        zzadx2.zzD();
    }

    public final void zze(long l2, long l3) {
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            this.zzg = 0;
        } else {
            zzafy zzafy2 = this.zzl;
            if (zzafy2 != null) {
                zzafy2.zzd(l3);
            }
        }
        long l8 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l8 != false) {
            l4 = -1;
        }
        this.zzn = l4;
        this.zzm = 0;
        this.zzc.zzH(0);
    }

    public final boolean zzf(zzadv zzadv2) {
        zzaed.zza(zzadv2, false);
        int n3 = 4;
        zzfu zzfu2 = new zzfu(n3);
        byte[] byArray = zzfu2.zzM();
        zzadv2 = (zzadi)zzadv2;
        ((zzadi)zzadv2).zzm(byArray, 0, n3, false);
        long l2 = zzfu2.zzu();
        long l3 = 1716281667L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        return l4 == false;
    }
}

