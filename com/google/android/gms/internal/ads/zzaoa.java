/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadq;
import com.google.android.gms.internal.ads.zzadr;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgea;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzaoa
implements zzaoc {
    private final zzfu zza;
    private final AtomicInteger zzb;
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzafa zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;
    private zzan zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private long zzp;

    public zzaoa(String string2, int n3, int n4) {
        zzfu zzfu2;
        Object object = new byte[n4];
        this.zza = zzfu2 = new zzfu((byte[])object);
        this.zzg = 0;
        this.zzp = -9223372036854775807L;
        object = new AtomicInteger;
        this.zzb = object;
        this.zzn = n4 = -1;
        this.zzo = n4;
        this.zzc = string2;
        this.zzd = n3;
    }

    private final void zzf(zzadq object) {
        String string2;
        Object object2;
        int n3;
        zzan zzan2;
        int n4;
        int n7 = ((zzadq)object).zzb;
        int n8 = -2147483647;
        if (n7 != n8 && (n8 = ((zzadq)object).zzc) != (n4 = -1) && ((zzan2 = this.zzk) == null || n8 != (n3 = zzan2.zzA) || n7 != (n8 = zzan2.zzB) || (n7 = (int)(zzgd.zzG(object2 = ((zzadq)object).zza, string2 = zzan2.zzn) ? 1 : 0)) == 0)) {
            object2 = this.zzk;
            object2 = object2 == null ? new zzal() : ((zzan)object2).zzb();
            string2 = this.zze;
            ((zzal)object2).zzK(string2);
            string2 = ((zzadq)object).zza;
            ((zzal)object2).zzX(string2);
            n8 = ((zzadq)object).zzc;
            ((zzal)object2).zzy(n8);
            int n10 = ((zzadq)object).zzb;
            ((zzal)object2).zzY(n10);
            object = this.zzc;
            ((zzal)object2).zzO((String)object);
            n10 = this.zzd;
            ((zzal)object2).zzV(n10);
            this.zzk = object = ((zzal)object2).zzad();
            object2 = this.zzf;
            object2.zzl((zzan)object);
        }
    }

    private final boolean zzg(zzfu zzfu2, byte[] byArray, int n3) {
        int n4;
        int n7 = zzfu2.zzb();
        int n8 = this.zzh;
        n8 = n3 - n8;
        n7 = Math.min(n7, n8);
        n8 = this.zzh;
        zzfu2.zzG(byArray, n8, n7);
        this.zzh = n4 = this.zzh + n7;
        return n4 == n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zza(zzfu zzfu2) {
        zzaoa zzaoa2 = this;
        zzfu zzfu3 = zzfu2;
        Object object = this.zzf;
        zzeq.zzb(object);
        block0: while (true) {
            int n3;
            int n4;
            int n7;
            int n8;
            Object object2;
            int n10;
            int n14;
            int n15;
            Object object3;
            block28: {
                long l2;
                long l3;
                int n16;
                block40: {
                    block38: {
                        block35: {
                            block39: {
                                block36: {
                                    block37: {
                                        int n17;
                                        int n18;
                                        int n19;
                                        Object object4;
                                        block34: {
                                            block32: {
                                                block29: {
                                                    block33: {
                                                        block30: {
                                                            block31: {
                                                                String string2;
                                                                zzan zzan2;
                                                                if ((object3 = zzfu2.zzb()) <= 0) {
                                                                    return;
                                                                }
                                                                object3 = zzaoa2.zzg;
                                                                n15 = 8;
                                                                n14 = 3;
                                                                n10 = 2;
                                                                object2 = 0;
                                                                n8 = 4;
                                                                n7 = 1;
                                                                if (object3 == 0) break block28;
                                                                n4 = 5;
                                                                n3 = 7;
                                                                n16 = 6;
                                                                if (object3 != n7) {
                                                                    if (object3 != n10) {
                                                                        long l4 = 0L;
                                                                        long l7 = -9223372036854775807L;
                                                                        if (object3 != n14) {
                                                                            if (object3 != n8) {
                                                                                if (object3 != n4) {
                                                                                    object3 = zzfu2.zzb();
                                                                                    n15 = zzaoa2.zzl;
                                                                                    n14 = zzaoa2.zzh;
                                                                                    object3 = Math.min(object3, n15 -= n14);
                                                                                    zzafa zzafa2 = zzaoa2.zzf;
                                                                                    zzafa2.zzq(zzfu3, (int)object3);
                                                                                    zzaoa2.zzh = n15 = zzaoa2.zzh + object3;
                                                                                    object3 = zzaoa2.zzl;
                                                                                    if (n15 != object3) continue;
                                                                                    l3 = zzaoa2.zzp;
                                                                                    long l8 = l3 - l7;
                                                                                    n14 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
                                                                                    if (n14 != 0) {
                                                                                        object3 = 1;
                                                                                    } else {
                                                                                        object3 = 0;
                                                                                        object = null;
                                                                                    }
                                                                                    zzeq.zzf((boolean)object3);
                                                                                    zzafa zzafa3 = zzaoa2.zzf;
                                                                                    long l12 = zzaoa2.zzp;
                                                                                    object3 = zzaoa2.zzm;
                                                                                    if (object3 == n8) {
                                                                                        object4 = 0;
                                                                                        zzan2 = null;
                                                                                    } else {
                                                                                        object4 = 1;
                                                                                    }
                                                                                    n19 = zzaoa2.zzl;
                                                                                    n18 = 0;
                                                                                    string2 = null;
                                                                                    n17 = 0;
                                                                                    zzafa3.zzs(l12, (int)object4, n19, 0, null);
                                                                                    l3 = zzaoa2.zzp;
                                                                                    l2 = zzaoa2.zzj;
                                                                                    zzaoa2.zzp = l3 += l2;
                                                                                    zzaoa2.zzg = 0;
                                                                                    continue;
                                                                                }
                                                                                object = zzaoa2.zza.zzM();
                                                                                object3 = zzaoa2.zzg(zzfu3, (byte[])object, n15 = zzaoa2.zzo);
                                                                                if (object3 == 0) continue;
                                                                                object = zzaoa2.zza;
                                                                                AtomicInteger atomicInteger = zzaoa2.zzb;
                                                                                object = zzadr.zze(((zzfu)object).zzM(), atomicInteger);
                                                                                n15 = zzaoa2.zzm;
                                                                                if (n15 == n14) {
                                                                                    zzaoa2.zzf((zzadq)object);
                                                                                }
                                                                                zzaoa2.zzl = n15 = ((zzadq)object).zzd;
                                                                                l3 = ((zzadq)object).zze;
                                                                                long l14 = l3 - l7;
                                                                                n14 = (int)(l14 == 0L ? 0 : (l14 < 0L ? -1 : 1));
                                                                                if (n14 != 0) {
                                                                                    l4 = l3;
                                                                                }
                                                                                zzaoa2.zzj = l4;
                                                                                zzaoa2.zza.zzK(0);
                                                                                object = zzaoa2.zzf;
                                                                                zzfu zzfu4 = zzaoa2.zza;
                                                                                n14 = zzaoa2.zzo;
                                                                                object.zzq(zzfu4, n14);
                                                                                zzaoa2.zzg = n16;
                                                                                continue;
                                                                            }
                                                                            object = zzaoa2.zza.zzM();
                                                                            object3 = zzaoa2.zzg(zzfu3, (byte[])object, n16);
                                                                            if (object3 == 0) continue;
                                                                            object = zzaoa2.zza.zzM();
                                                                            zzaoa2.zzo = object3 = zzadr.zzb((byte[])object);
                                                                            n15 = zzaoa2.zzh;
                                                                            if (n15 > object3) {
                                                                                object3 = n15 - object3;
                                                                                zzaoa2.zzh = n15 -= object3;
                                                                                n15 = zzfu2.zzd() - object3;
                                                                                zzfu3.zzK(n15);
                                                                            }
                                                                            zzaoa2.zzg = n4;
                                                                            continue;
                                                                        }
                                                                        object = zzaoa2.zza.zzM();
                                                                        object3 = zzaoa2.zzg(zzfu3, (byte[])object, n15 = zzaoa2.zzn);
                                                                        if (object3 == 0) continue;
                                                                        object = zzadr.zzd(zzaoa2.zza.zzM());
                                                                        zzaoa2.zzf((zzadq)object);
                                                                        zzaoa2.zzl = n15 = ((zzadq)object).zzd;
                                                                        l3 = ((zzadq)object).zze;
                                                                        n14 = (int)(l3 == l7 ? 0 : (l3 < l7 ? -1 : 1));
                                                                        if (n14 != 0) {
                                                                            l4 = l3;
                                                                        }
                                                                        zzaoa2.zzj = l4;
                                                                        zzaoa2.zza.zzK(0);
                                                                        object = zzaoa2.zzf;
                                                                        zzfu zzfu5 = zzaoa2.zza;
                                                                        n14 = zzaoa2.zzn;
                                                                        object.zzq(zzfu5, n14);
                                                                        zzaoa2.zzg = n16;
                                                                        continue;
                                                                    }
                                                                    object = zzaoa2.zza.zzM();
                                                                    object3 = zzaoa2.zzg(zzfu3, (byte[])object, n3);
                                                                    if (object3 == 0) continue;
                                                                    object = zzaoa2.zza.zzM();
                                                                    zzaoa2.zzn = object3 = zzadr.zza((byte[])object);
                                                                    zzaoa2.zzg = n14;
                                                                    continue;
                                                                }
                                                                object = zzaoa2.zza.zzM();
                                                                object3 = zzaoa2.zzg(zzfu3, (byte[])object, (int)(object4 = 18));
                                                                if (object3 == 0) continue;
                                                                object = zzaoa2.zza.zzM();
                                                                Object object5 = zzaoa2.zzk;
                                                                if (object5 == null) {
                                                                    object5 = zzaoa2.zze;
                                                                    string2 = zzaoa2.zzc;
                                                                    n17 = zzaoa2.zzd;
                                                                    object4 = 0;
                                                                    zzaoa2.zzk = zzan2 = zzadr.zzc((byte[])object, (String)object5, string2, n17, null);
                                                                    object5 = zzaoa2.zzf;
                                                                    object5.zzl(zzan2);
                                                                }
                                                                object4 = object[0];
                                                                n19 = 31;
                                                                n18 = -1;
                                                                n17 = -2;
                                                                if (object4 == n17) break block29;
                                                                if (object4 == n18) break block30;
                                                                if (object4 == n19) break block31;
                                                                n15 = (object[n4] & n14) << 12;
                                                                n14 = (object[n16] & 0xFF) << n8;
                                                                object2 = object[n3];
                                                                break block32;
                                                            }
                                                            object2 = object[n16];
                                                            n14 = (n14 & object2) << 12;
                                                            object2 = (object[n3] & 0xFF) << n8;
                                                            n15 = (object[n15] & 0x3C) >> n10;
                                                            n15 |= (n14 |= object2);
                                                            break block33;
                                                        }
                                                        n15 = (object[n3] & n14) << 12;
                                                        n14 = (object[n16] & 0xFF) << n8;
                                                        object2 = (object[9] & 0x3C) >> n10;
                                                        n15 = n15 | n14 | object2;
                                                    }
                                                    n15 += n7;
                                                    n14 = 1;
                                                    break block34;
                                                }
                                                n15 = (object[n8] & n14) << 12;
                                                n14 = (object[n3] & 0xFF) << n8;
                                                object2 = object[n16];
                                            }
                                            object2 = (object2 & 0xF0) >> n8;
                                            n15 = (n15 | n14 | object2) + n7;
                                            n14 = 0;
                                        }
                                        if (n14 != 0) {
                                            n15 = n15 * 16 / 14;
                                        }
                                        zzaoa2.zzl = n15;
                                        if (object4 == n17) break block35;
                                        if (object4 == n18) break block36;
                                        if (object4 == n19) break block37;
                                        n15 = (object[n8] & n7) << n16;
                                        object3 = object[n4];
                                        break block38;
                                    }
                                    n15 = (object[n4] & n3) << n8;
                                    object3 = object[n16];
                                    break block39;
                                }
                                n15 = (object[n8] & n3) << n8;
                                object3 = object[n3];
                            }
                            object3 &= 0x3C;
                            break block40;
                        }
                        n15 = (object[n4] & n7) << n16;
                        object3 = object[n8];
                    }
                    object3 &= 0xFC;
                }
                object3 = object3 >> n10 | n15;
                n15 = zzaoa2.zzk.zzB;
                l2 = (object3 += n7) * 32;
                object3 = zzgea.zzb(zzgd.zzs(l2, n15));
                zzaoa2.zzj = l3 = (long)object3;
                object = zzaoa2.zza;
                n15 = 0;
                ((zzfu)object).zzK(0);
                object = zzaoa2.zzf;
                zzfu zzfu6 = zzaoa2.zza;
                n14 = 18;
                object.zzq(zzfu6, n14);
                zzaoa2.zzg = n16;
                continue;
            }
            do {
                if ((object3 = zzfu2.zzb()) <= 0) continue block0;
                zzaoa2.zzi = object3 = zzaoa2.zzi << n15;
                object2 = zzfu2.zzm();
                zzaoa2.zzi = object3 |= object2;
                object2 = 2147385345;
                if (object3 == object2 || object3 == (object2 = -25230976) || object3 == (object2 = 536864768) || object3 == (object2 = -14745368)) {
                    object3 = 1;
                } else {
                    object2 = 1683496997;
                    if (object3 == object2 || object3 == (object2 = 622876772)) {
                        object3 = 2;
                    } else {
                        object2 = 1078008818;
                        if (object3 == object2 || object3 == (object2 = -233094848)) {
                            object3 = 3;
                        } else {
                            object2 = 1908687592;
                            if (object3 == object2 || object3 == (object2 = -398277519)) {
                                object3 = 4;
                            } else {
                                object3 = 0;
                                object = null;
                            }
                        }
                    }
                }
                zzaoa2.zzm = object3;
            } while (object3 == 0);
            byte[] byArray = zzaoa2.zza.zzM();
            object2 = zzaoa2.zzi;
            n4 = (byte)(object2 >> 24 & 0xFF);
            n3 = 0;
            byArray[0] = n4;
            byArray[n7] = n4 = (int)((byte)(object2 >> 16 & 0xFF));
            byArray[n10] = n4 = (int)((byte)(object2 >> 8 & 0xFF));
            byArray[n14] = object2 = (Object)((byte)(object2 & 0xFF));
            zzaoa2.zzh = n8;
            object2 = 0;
            zzaoa2.zzi = 0;
            if (object3 != n14 && object3 != n8) {
                if (object3 == n7) {
                    zzaoa2.zzg = n7;
                    continue;
                }
                zzaoa2.zzg = n10;
                continue;
            }
            zzaoa2.zzg = n8;
        }
    }

    public final void zzb(zzadx object, zzapo zzapo2) {
        String string2;
        zzapo2.zzc();
        this.zze = string2 = zzapo2.zzb();
        int n3 = zzapo2.zza();
        this.zzf = object = object.zzw(n3, 1);
    }

    public final void zzc() {
    }

    public final void zzd(long l2, int n3) {
        this.zzp = l2;
    }

    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zzp = -9223372036854775807L;
        this.zzb.set(0);
    }
}

