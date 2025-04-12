/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzn;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhaz;
import com.google.android.gms.internal.ads.zzhbc;
import com.google.android.gms.internal.ads.zzhbd;
import com.google.android.gms.internal.ads.zzhbk;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhcd;
import com.google.android.gms.internal.ads.zzhch;
import com.google.android.gms.internal.ads.zzhde;
import com.google.android.gms.internal.ads.zzhdr;
import com.google.android.gms.internal.ads.zzhdz;
import com.google.android.gms.internal.ads.zzheb;
import com.google.android.gms.internal.ads.zzhem;
import com.google.android.gms.internal.ads.zzheq;
import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhfh;
import com.google.android.gms.internal.ads.zzhfi;
import java.util.Map;

final class zzhdi
implements zzhdz {
    private final zzhde zza;
    private final zzheq zzb;
    private final boolean zzc;
    private final zzhaz zzd;

    private zzhdi(zzheq zzheq2, zzhaz zzhaz2, zzhde zzhde2) {
        boolean bl2;
        this.zzb = zzheq2;
        this.zzc = bl2 = zzhaz2.zzj(zzhde2);
        this.zzd = zzhaz2;
        this.zza = zzhde2;
    }

    public static zzhdi zzc(zzheq zzheq2, zzhaz zzhaz2, zzhde zzhde2) {
        zzhdi zzhdi2 = new zzhdi(zzheq2, zzhaz2, zzhde2);
        return zzhdi2;
    }

    public final int zza(Object object) {
        zzheq zzheq2 = this.zzb;
        Object object2 = zzheq2.zzd(object);
        int n3 = zzheq2.zzb(object2);
        boolean bl2 = this.zzc;
        if (bl2) {
            object2 = this.zzd;
            object = ((zzhaz)object2).zzb(object);
            int n4 = ((zzhbd)object).zzd();
            n3 += n4;
        }
        return n3;
    }

    public final int zzb(Object object) {
        Object object2 = this.zzb.zzd(object);
        int n3 = object2.hashCode();
        boolean bl2 = this.zzc;
        if (bl2) {
            zzhaz zzhaz2 = this.zzd;
            object = zzhaz2.zzb(object);
            n3 *= 53;
            object = ((zzhbd)object).zza;
            int n4 = ((zzhem)object).hashCode();
            n3 += n4;
        }
        return n3;
    }

    public final Object zze() {
        zzhde zzhde2 = this.zza;
        boolean bl2 = zzhde2 instanceof zzhbo;
        if (bl2) {
            return ((zzhbo)zzhde2).zzbj();
        }
        return zzhde2.zzcY().zzbs();
    }

    public final void zzf(Object object) {
        this.zzb.zzm(object);
        this.zzd.zzf(object);
    }

    public final void zzg(Object object, Object object2) {
        Object object3 = this.zzb;
        zzheb.zzr((zzheq)object3, object, object2);
        boolean bl2 = this.zzc;
        if (bl2) {
            object3 = this.zzd;
            zzheb.zzq((zzhaz)object3, object, object2);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh(Object object, zzhdr object2, zzhay zzhay2) {
        Throwable throwable2;
        zzheq zzheq2 = this.zzb;
        Object object3 = zzheq2.zzc(object);
        zzhaz zzhaz2 = this.zzd;
        zzhbd zzhbd2 = zzhaz2.zzc(object);
        while (true) {
            Object object4;
            int n3;
            int n4;
            int n7;
            block15: {
                block14: {
                    block17: {
                        block16: {
                            try {
                                n7 = object2.zzc();
                                n4 = -1 >>> 1;
                                if (n7 == n4) {
                                    break block14;
                                }
                            }
                            catch (Throwable throwable2) {
                                break;
                            }
                            {
                                n7 = object2.zzd();
                                if (n7 == (n3 = 11)) break block15;
                                n4 = n7 & 7;
                                n3 = 2;
                                if (n4 != n3) break block16;
                            }
                            zzhde zzhde2 = this.zza;
                            object4 = zzhaz2.zzd(zzhay2, zzhde2, n7 >>>= 3);
                            if (object4 != null) {
                                zzhaz2.zzg((zzhdr)object2, object4, zzhay2, zzhbd2);
                                continue;
                            }
                            n7 = (int)(zzheq2.zzr(object3, (zzhdr)object2) ? 1 : 0);
                            break block17;
                        }
                        n7 = (int)(object2.zzQ() ? 1 : 0);
                    }
                    if (n7 != 0) continue;
                }
                zzheq2.zzn(object, object3);
                return;
            }
            n7 = 0;
            object4 = null;
            n3 = 0;
            zzhac zzhac2 = null;
            int n8 = 0;
            {
                int n10;
                while ((n10 = object2.zzc()) != n4) {
                    int n14;
                    n10 = object2.zzd();
                    if (n10 == (n14 = 16)) {
                        n8 = object2.zzj();
                        object4 = this.zza;
                        object4 = zzhaz2.zzd(zzhay2, (zzhde)object4, n8);
                        continue;
                    }
                    n14 = 26;
                    if (n10 == n14) {
                        if (object4 != null) {
                            zzhaz2.zzg((zzhdr)object2, object4, zzhay2, zzhbd2);
                            continue;
                        }
                        zzhac2 = object2.zzp();
                        continue;
                    }
                    n10 = (int)(object2.zzQ() ? 1 : 0);
                    if (n10 != 0) continue;
                }
                if ((n4 = object2.zzd()) != (n10 = 12)) {
                    object2 = zzhcd.zzb();
                    throw object2;
                }
                if (zzhac2 == null) continue;
                if (object4 != null) {
                    zzhaz2.zzh(zzhac2, object4, zzhay2, zzhbd2);
                    continue;
                }
                zzheq2.zzk(object3, n8, zzhac2);
                continue;
            }
            break;
        }
        zzheq2.zzn(object, object3);
        throw throwable2;
    }

    public final void zzi(Object object, byte[] object2, int n3, int n4, zzgzn zzgzn2) {
        object2 = object;
        object2 = (zzhbo)object;
        zzher zzher2 = object2.zzt;
        zzher zzher3 = zzher.zzc();
        if (zzher2 == zzher3) {
            object2.zzt = zzher2 = zzher.zzf();
        }
        object = (zzhbk)object;
        throw null;
    }

    public final void zzj(Object object, zzhfi zzhfi2) {
        boolean bl2;
        Object object2 = this.zzd.zzb(object).zzg();
        while (bl2 = object2.hasNext()) {
            boolean bl3;
            zzhfh zzhfh2;
            Object object3 = (Map.Entry)object2.next();
            zzhbc zzhbc2 = (zzhbc)object3.getKey();
            zzhfh zzhfh3 = zzhbc2.zze();
            if (zzhfh3 == (zzhfh2 = zzhfh.zzi) && !(bl3 = zzhbc2.zzg()) && !(bl3 = zzhbc2.zzf())) {
                int n3;
                bl3 = object3 instanceof zzhch;
                if (bl3) {
                    n3 = zzhbc2.zza();
                    object3 = ((zzhch)object3).zza().zzb();
                    zzhfi2.zzw(n3, object3);
                    continue;
                }
                n3 = zzhbc2.zza();
                object3 = object3.getValue();
                zzhfi2.zzw(n3, object3);
                continue;
            }
            object = new IllegalStateException("Found invalid MessageSet item.");
            throw object;
        }
        object2 = this.zzb;
        object = ((zzheq)object2).zzd(object);
        ((zzheq)object2).zzp(object, zzhfi2);
    }

    public final boolean zzk(Object object, Object object2) {
        Object object3 = this.zzb;
        Object object4 = ((zzheq)object3).zzd(object);
        boolean bl2 = object4.equals(object3 = ((zzheq)object3).zzd(object2));
        if (!bl2) {
            return false;
        }
        bl2 = this.zzc;
        if (bl2) {
            object = this.zzd.zzb(object);
            object2 = this.zzd.zzb(object2);
            return ((zzhbd)object).equals(object2);
        }
        return true;
    }

    public final boolean zzl(Object object) {
        return this.zzd.zzb(object).zzl();
    }
}

