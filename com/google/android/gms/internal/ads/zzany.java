/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzacp;
import com.google.android.gms.internal.ads.zzacq;
import com.google.android.gms.internal.ads.zzadt;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzft;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzany
implements zzaoc {
    private static final byte[] zza;
    private final boolean zzb;
    private final zzft zzc;
    private final zzfu zzd;
    private final String zze;
    private final int zzf;
    private String zzg;
    private zzafa zzh;
    private zzafa zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private zzafa zzv;
    private long zzw;

    static {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[3];
        byArray[0] = 73;
        byArray2[1] = 68;
        byArray2[2] = 51;
        zza = byArray;
    }

    public zzany(boolean bl2, String string2, int n3) {
        long l2;
        int n4;
        int n7 = 7;
        byte[] byArray = new byte[n7];
        Object object = new zzft(byArray, n7);
        this.zzc = object;
        byte[] byArray2 = Arrays.copyOf(zza, 10);
        this.zzd = object = new zzfu(byArray2);
        this.zzh();
        this.zzo = n4 = -1;
        this.zzp = n4;
        this.zzs = l2 = -9223372036854775807L;
        this.zzu = l2;
        this.zzb = bl2;
        this.zze = string2;
        this.zzf = n3;
    }

    public static boolean zzf(int n3) {
        char c2 = (char)-16;
        return (n3 &= (char)-10) == c2;
    }

    private final void zzg() {
        this.zzn = false;
        this.zzh();
    }

    private final void zzh() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 256;
    }

    private final void zzi() {
        this.zzj = 3;
        this.zzk = 0;
    }

    private final void zzj(zzafa zzafa2, long l2, int n3, int n4) {
        this.zzj = 4;
        this.zzk = n3;
        this.zzv = zzafa2;
        this.zzw = l2;
        this.zzt = n4;
    }

    private final boolean zzk(zzfu zzfu2, byte[] byArray, int n3) {
        int n4;
        int n7 = zzfu2.zzb();
        int n8 = this.zzk;
        n8 = n3 - n8;
        n7 = Math.min(n7, n8);
        n8 = this.zzk;
        zzfu2.zzG(byArray, n8, n7);
        this.zzk = n4 = this.zzk + n7;
        return n4 == n3;
    }

    private static final boolean zzl(byte by2, byte by4) {
        return zzany.zzf(by4 & 0xFF | 0xFF00);
    }

    private static final boolean zzm(zzfu zzfu2, byte[] byArray, int n3) {
        int n4 = zzfu2.zzb();
        if (n4 < n3) {
            return false;
        }
        zzfu2.zzG(byArray, 0, n3);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zza(zzfu zzfu2) {
        zzany zzany2 = this;
        zzfu zzfu3 = zzfu2;
        int n3 = 0;
        int n4 = -1;
        int n7 = 2;
        int n8 = 1;
        Object object = this.zzh;
        object.getClass();
        int n10 = zzgd.zza;
        while (true) {
            block20: {
                Object object2;
                int n14;
                int n15;
                int n16;
                if ((n10 = zzfu2.zzb()) <= 0) {
                    return;
                }
                n10 = zzany2.zzj;
                int n17 = 13;
                int n18 = 7;
                int n19 = 4;
                int n20 = 3;
                if (n10 != 0) {
                    Object object3;
                    if (n10 != n8) {
                        long l2;
                        n16 = 10;
                        if (n10 != n7) {
                            if (n10 != n20) {
                                n10 = zzfu2.zzb();
                                n17 = zzany2.zzt;
                                n18 = zzany2.zzk;
                                n10 = Math.min(n10, n17 -= n18);
                                object3 = zzany2.zzv;
                                object3.zzq(zzfu3, n10);
                                zzany2.zzk = n17 = zzany2.zzk + n10;
                                n10 = zzany2.zzt;
                                if (n17 != n10) continue;
                                long l3 = zzany2.zzu;
                                l2 = -9223372036854775807L;
                                long l4 = l3 - l2;
                                n20 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
                                if (n20 != 0) {
                                    n10 = 1;
                                } else {
                                    n10 = 0;
                                    object = null;
                                }
                                zzeq.zzf(n10 != 0);
                                zzafa zzafa2 = zzany2.zzv;
                                long l7 = zzany2.zzu;
                                n10 = zzany2.zzt;
                                n15 = 1;
                                zzafa2.zzs(l7, n15, n10, 0, null);
                                l3 = zzany2.zzu;
                                l2 = zzany2.zzw;
                                zzany2.zzu = l3 += l2;
                                this.zzh();
                                continue;
                            }
                            n10 = (int)(zzany2.zzm ? 1 : 0);
                            n14 = 5;
                            n10 = n8 != n10 ? 5 : 7;
                            byte[] byArray = zzany2.zzc.zza;
                            if ((n10 = (int)(zzany2.zzk(zzfu3, byArray, n10) ? 1 : 0)) == 0) continue;
                            object = zzany2.zzc;
                            ((zzft)object).zzk(0);
                            n10 = (int)(zzany2.zzr ? 1 : 0);
                            if (n10 == 0) {
                                long l8;
                                object = zzany2.zzc;
                                n10 = ((zzft)object).zzd(n7) + n8;
                                if (n10 != n7) {
                                    String string2 = "Detected audio object type: ";
                                    StringBuilder stringBuilder = new StringBuilder(string2);
                                    stringBuilder.append(n10);
                                    stringBuilder.append(", but assuming AAC LC.");
                                    object = stringBuilder.toString();
                                    String string3 = "AdtsReader";
                                    zzfk.zzf(string3, (String)object);
                                }
                                zzany2.zzc.zzm(n14);
                                n10 = zzany2.zzc.zzd(n20);
                                n16 = zzany2.zzp;
                                n14 = (byte)(n16 >> 1 & n18 | 0x10);
                                n18 = n16 << 7;
                                n10 <<= n20;
                                n10 = (byte)(n10 & 0x78 | (n18 &= 0x80));
                                byte[] byArray2 = new byte[n7];
                                byArray2[0] = n14;
                                byArray2[n8] = n10;
                                object = zzacq.zza(byArray2);
                                object2 = new zzal();
                                String string4 = zzany2.zzg;
                                ((zzal)object2).zzK(string4);
                                ((zzal)object2).zzX("audio/mp4a-latm");
                                String string5 = ((zzacp)object).zzc;
                                ((zzal)object2).zzz(string5);
                                n16 = ((zzacp)object).zzb;
                                ((zzal)object2).zzy(n16);
                                n10 = ((zzacp)object).zza;
                                ((zzal)object2).zzY(n10);
                                object = Collections.singletonList(byArray2);
                                ((zzal)object2).zzL((List)object);
                                object = zzany2.zze;
                                ((zzal)object2).zzO((String)object);
                                n10 = zzany2.zzf;
                                ((zzal)object2).zzV(n10);
                                object = ((zzal)object2).zzad();
                                n18 = ((zzan)object).zzB;
                                long l12 = n18;
                                zzany2.zzs = l8 = 1024000000L / l12;
                                zzafa zzafa3 = zzany2.zzh;
                                zzafa3.zzl((zzan)object);
                                zzany2.zzr = n8;
                            } else {
                                object = zzany2.zzc;
                                ((zzft)object).zzm(n16);
                            }
                            zzany2.zzc.zzm(n19);
                            object = zzany2.zzc;
                            n10 = ((zzft)object).zzd(n17);
                            n17 = n10 + -7;
                            n18 = (int)(zzany2.zzm ? 1 : 0);
                            n16 = n18 != 0 ? (n10 += -9) : n17;
                            object3 = zzany2.zzh;
                            l2 = zzany2.zzs;
                            n20 = 0;
                            object2 = null;
                            object = this;
                            this.zzj((zzafa)object3, l2, 0, n16);
                            continue;
                        }
                        object = zzany2.zzd.zzM();
                        n10 = (int)(zzany2.zzk(zzfu3, (byte[])object, n16) ? 1 : 0);
                        if (n10 == 0) continue;
                        object = zzany2.zzi;
                        object3 = zzany2.zzd;
                        object.zzq((zzfu)object3, n16);
                        object = zzany2.zzd;
                        n17 = 6;
                        ((zzfu)object).zzK(n17);
                        object3 = zzany2.zzi;
                        n10 = zzany2.zzd.zzl();
                        n20 = 10;
                        n16 = n10 + 10;
                        l2 = 0L;
                        object = this;
                        this.zzj((zzafa)object3, l2, n20, n16);
                        continue;
                    }
                    n10 = zzfu2.zzb();
                    if (n10 == 0) continue;
                    object = zzany2.zzc;
                    object3 = ((zzft)object).zza;
                    byte[] byArray = zzfu2.zzM();
                    n20 = zzfu2.zzd();
                    object3[0] = n18 = byArray[n20];
                    ((zzft)object).zzk(n7);
                    object = zzany2.zzc;
                    n10 = ((zzft)object).zzd(n19);
                    n17 = zzany2.zzp;
                    if (n17 != n4 && n10 != n17) {
                        this.zzg();
                        continue;
                    }
                    n17 = (int)(zzany2.zzn ? 1 : 0);
                    if (n17 == 0) {
                        zzany2.zzn = n8;
                        zzany2.zzo = n17 = zzany2.zzq;
                        zzany2.zzp = n10;
                    }
                    this.zzi();
                    continue;
                }
                object = zzfu2.zzM();
                n16 = zzfu2.zzd();
                n14 = zzfu2.zze();
                while (n16 < n14) {
                    block31: {
                        int n21;
                        block32: {
                            block33: {
                                block26: {
                                    block27: {
                                        block28: {
                                            block29: {
                                                block30: {
                                                    block24: {
                                                        Object object4;
                                                        block22: {
                                                            byte[] byArray;
                                                            block25: {
                                                                block23: {
                                                                    block21: {
                                                                        n21 = n16 + 1;
                                                                        object4 = object[n16];
                                                                        n15 = object4 & 0xFF;
                                                                        n3 = zzany2.zzl;
                                                                        n20 = 512;
                                                                        if (n3 != n20) break block21;
                                                                        n3 = (byte)n15;
                                                                        if ((n3 = (int)(zzany.zzl((byte)n4, (byte)n3) ? 1 : 0)) == 0) break block21;
                                                                        n3 = (int)(zzany2.zzn ? 1 : 0);
                                                                        if (n3 != 0) break block22;
                                                                        n3 = n16 + -1;
                                                                        zzfu3.zzK(n16);
                                                                        object2 = zzany2.zzc.zza;
                                                                        n20 = (int)(zzany.zzm(zzfu3, (byte[])object2, n8) ? 1 : 0);
                                                                        if (n20 == 0) break block21;
                                                                        zzany2.zzc.zzk(n19);
                                                                        object2 = zzany2.zzc;
                                                                        n20 = ((zzft)object2).zzd(n8);
                                                                        n18 = zzany2.zzo;
                                                                        if (n18 != n4 && n20 != n18) break block21;
                                                                        n18 = zzany2.zzp;
                                                                        if (n18 == n4) break block23;
                                                                        byte[] byArray3 = zzany2.zzc.zza;
                                                                        n18 = (int)(zzany.zzm(zzfu3, byArray3, n8) ? 1 : 0);
                                                                        if (n18 == 0) break block22;
                                                                        zzany2.zzc.zzk(n7);
                                                                        zzft zzft2 = zzany2.zzc;
                                                                        n18 = zzft2.zzd(n19);
                                                                        if (n18 != (n7 = zzany2.zzp)) break block21;
                                                                        n18 = n16 + 1;
                                                                        zzfu3.zzK(n18);
                                                                        break block23;
                                                                    }
                                                                    n7 = 7;
                                                                    break block24;
                                                                }
                                                                byte[] byArray4 = zzany2.zzc.zza;
                                                                n18 = (int)(zzany.zzm(zzfu3, byArray4, n19) ? 1 : 0);
                                                                if (n18 == 0) break block22;
                                                                zzany2.zzc.zzk(14);
                                                                zzft zzft3 = zzany2.zzc;
                                                                n18 = zzft3.zzd(n17);
                                                                n7 = 7;
                                                                if (n18 < n7) break block24;
                                                                byArray = zzfu2.zzM();
                                                                n17 = zzfu2.zze();
                                                                if ((n3 += n18) >= n17) break block22;
                                                                n18 = byArray[n3];
                                                                if (n18 != n4) break block25;
                                                                if ((n3 += n8) == n17) break block22;
                                                                n17 = byArray[n3];
                                                                n18 = (int)(zzany.zzl((byte)n4, (byte)n17) ? 1 : 0);
                                                                if (n18 == 0) break block24;
                                                                n17 &= 8;
                                                                n18 = 3;
                                                                if ((n17 >>= n18) != n20) break block24;
                                                                break block22;
                                                            }
                                                            n20 = 73;
                                                            if (n18 != n20 || (n18 = n3 + 1) != n17 && ((n18 = byArray[n18]) != (n20 = 68) || (n3 += (n18 = 2)) != n17 && (n17 = byArray[n3]) != (n18 = 51))) break block24;
                                                        }
                                                        n10 = object4 & 8;
                                                        n17 = 3;
                                                        zzany2.zzq = n10 >>= n17;
                                                        n10 = object4 & 1 ^ n8;
                                                        if (n8 != n10) {
                                                            n10 = 0;
                                                            object = null;
                                                        } else {
                                                            n10 = 1;
                                                        }
                                                        zzany2.zzm = n10;
                                                        n10 = (int)(zzany2.zzn ? 1 : 0);
                                                        if (n10 == 0) {
                                                            zzany2.zzj = n8;
                                                            n10 = 0;
                                                            object = null;
                                                            zzany2.zzk = 0;
                                                        } else {
                                                            this.zzi();
                                                        }
                                                        zzfu3.zzK(n21);
                                                        break block20;
                                                    }
                                                    n17 = zzany2.zzl;
                                                    n18 = n17 | n15;
                                                    n20 = 329;
                                                    if (n18 == n20) break block26;
                                                    n20 = 511;
                                                    if (n18 == n20) break block27;
                                                    n20 = 836;
                                                    if (n18 == n20) break block28;
                                                    n20 = 1075;
                                                    if (n18 == n20) break block29;
                                                    n18 = 256;
                                                    if (n17 == n18) break block30;
                                                    zzany2.zzl = n18;
                                                    break block31;
                                                }
                                                n17 = 2;
                                                n18 = 3;
                                                n20 = 0;
                                                object2 = null;
                                                break block32;
                                            }
                                            zzany2.zzj = n17 = 2;
                                            zzany2.zzk = n18 = 3;
                                            n20 = 0;
                                            object2 = null;
                                            zzany2.zzt = 0;
                                            object = zzany2.zzd;
                                            ((zzfu)object).zzK(0);
                                            zzfu3.zzK(n21);
                                            break block20;
                                        }
                                        n17 = 2;
                                        n18 = 3;
                                        n20 = 0;
                                        object2 = null;
                                        n16 = 1024;
                                        break block33;
                                    }
                                    n17 = 2;
                                    n18 = 3;
                                    n20 = 0;
                                    object2 = null;
                                    n16 = 512;
                                    break block33;
                                }
                                n17 = 2;
                                n18 = 3;
                                n20 = 0;
                                object2 = null;
                                n16 = 768;
                            }
                            zzany2.zzl = n16;
                        }
                        n16 = n21;
                    }
                    n17 = 13;
                    n18 = 7;
                    n20 = 3;
                    n3 = 0;
                    n7 = 2;
                }
                n17 = 2;
                n20 = 0;
                object2 = null;
                zzfu3.zzK(n16);
            }
            n3 = 0;
            n7 = 2;
        }
    }

    public final void zzb(zzadx object, zzapo object2) {
        ((zzapo)object2).zzc();
        Object object3 = ((zzapo)object2).zzb();
        this.zzg = object3;
        int n3 = ((zzapo)object2).zza();
        int n4 = 1;
        this.zzh = object3 = object.zzw(n3, n4);
        this.zzv = object3;
        n3 = (int)(this.zzb ? 1 : 0);
        if (n3 != 0) {
            ((zzapo)object2).zzc();
            n3 = ((zzapo)object2).zza();
            this.zzi = object = object.zzw(n3, 5);
            object3 = new zzal();
            object2 = ((zzapo)object2).zzb();
            ((zzal)object3).zzK((String)object2);
            ((zzal)object3).zzX("application/id3");
            object2 = ((zzal)object3).zzad();
            object.zzl((zzan)object2);
            return;
        }
        this.zzi = object = new zzadt();
    }

    public final void zzc() {
    }

    public final void zzd(long l2, int n3) {
        this.zzu = l2;
    }

    public final void zze() {
        this.zzu = -9223372036854775807L;
        this.zzg();
    }
}

