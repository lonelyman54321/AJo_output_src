/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzin;
import com.google.android.gms.internal.ads.zzjh;
import com.google.android.gms.internal.ads.zzlj;
import com.google.android.gms.internal.ads.zzlp;
import com.google.android.gms.internal.ads.zzmn;
import com.google.android.gms.internal.ads.zzmo;
import com.google.android.gms.internal.ads.zzmp;
import com.google.android.gms.internal.ads.zzmq;
import com.google.android.gms.internal.ads.zzpj;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzxf;

public abstract class zziw
implements zzmn,
zzmp {
    private final Object zza;
    private final int zzb;
    private final zzlj zzc;
    private zzmq zzd;
    private int zze;
    private zzpj zzf;
    private zzer zzg;
    private int zzh;
    private zzxf zzi;
    private zzan[] zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private boolean zzo;
    private zzdc zzp;
    private zzmo zzq;

    public zziw(int n3) {
        Object object;
        this.zza = object = new Object();
        this.zzb = n3;
        Object object2 = new zzlj();
        this.zzc = object2;
        this.zzm = Long.MIN_VALUE;
        this.zzp = object2 = zzdc.zza;
    }

    private final void zzZ(long l2, boolean bl2) {
        this.zzn = false;
        this.zzl = l2;
        this.zzm = l2;
        this.zzz(l2, bl2);
    }

    public void zzA() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzB() {
        Object object = this.zza;
        // MONITORENTER : object
        zzmo zzmo2 = this.zzq;
        // MONITOREXIT : object
        if (zzmo2 == null) return;
        zzmo2.zza(this);
    }

    public void zzC() {
    }

    public void zzD() {
    }

    public void zzE() {
    }

    public void zzF(zzan[] zzanArray, long l2, long l3, zzvo zzvo2) {
        throw null;
    }

    public final void zzG() {
        int n3 = this.zzh;
        n3 = n3 == 0 ? 1 : 0;
        zzeq.zzf(n3 != 0);
        this.zzA();
    }

    public final void zzH(zzan[] zzanArray, zzxf zzxf2, long l2, long l3, zzvo zzvo2) {
        boolean bl2 = this.zzn ^ true;
        zzeq.zzf(bl2);
        this.zzi = zzxf2;
        long l4 = this.zzm;
        long l7 = Long.MIN_VALUE;
        long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (l8 == false) {
            this.zzm = l2;
        }
        this.zzj = zzanArray;
        this.zzk = l3;
        l7 = l2;
        this.zzF(zzanArray, l2, l3, zzvo2);
    }

    public final void zzI() {
        zzlj zzlj2;
        int n3 = this.zzh;
        if (!n3) {
            n3 = 1;
        } else {
            n3 = 0;
            zzlj2 = null;
        }
        zzeq.zzf(n3 != 0);
        zzlj2 = this.zzc;
        zzlj2.zzb = null;
        zzlj2.zza = null;
        this.zzC();
    }

    public final void zzJ(long l2) {
        this.zzZ(l2, false);
    }

    public final void zzK() {
        this.zzn = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzL(zzmo zzmo2) {
        Object object = this.zza;
        synchronized (object) {
            this.zzq = zzmo2;
            return;
        }
    }

    public /* synthetic */ void zzM(float f5, float f6) {
    }

    public final void zzN(zzdc zzdc2) {
        zzdc zzdc3 = this.zzp;
        boolean bl2 = zzgd.zzG(zzdc3, zzdc2);
        if (!bl2) {
            this.zzp = zzdc2;
        }
    }

    public final void zzO() {
        int n3 = this.zzh;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        zzeq.zzf(n4 != 0);
        this.zzh = 2;
        this.zzD();
    }

    /*
     * WARNING - void declaration
     */
    public final void zzP() {
        void var1_4;
        int bl2 = this.zzh;
        int n3 = 2;
        int n4 = 1;
        if (bl2 == n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        zzeq.zzf((boolean)var1_4);
        this.zzh = n4;
        this.zzE();
    }

    public final boolean zzQ() {
        long l2 = this.zzm;
        long l3 = Long.MIN_VALUE;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object == false;
    }

    public final boolean zzR() {
        return this.zzn;
    }

    public final boolean zzS() {
        boolean bl2 = this.zzQ();
        if (bl2) {
            bl2 = this.zzn;
        } else {
            zzxf zzxf2 = this.zzi;
            zzxf2.getClass();
            bl2 = zzxf2.zze();
        }
        return bl2;
    }

    public final zzan[] zzT() {
        zzan[] zzanArray = this.zzj;
        zzanArray.getClass();
        return zzanArray;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzcU() {
        return this.zzh;
    }

    public final int zzcV(zzlj zzlj2, zzin zzin2, int n3) {
        Object object = this.zzi;
        object.getClass();
        n3 = object.zza(zzlj2, zzin2, n3);
        int n4 = -4;
        if (n3 == n4) {
            long l2;
            boolean bl2 = zzin2.zzf();
            if (bl2) {
                long l3;
                this.zzm = l3 = Long.MIN_VALUE;
                bl2 = this.zzn;
                if (bl2) {
                    return n4;
                }
                return -3;
            }
            long l4 = zzin2.zze;
            long l7 = this.zzk;
            zzin2.zze = l4 += l7;
            this.zzm = l2 = Math.max(this.zzm, l4);
        } else {
            int n7 = -5;
            if (n3 == n7) {
                object = zzlj2.zza;
                object.getClass();
                long l8 = ((zzan)object).zzr;
                long l12 = Long.MAX_VALUE;
                long l14 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
                if (l14 != false) {
                    Object object2 = ((zzan)object).zzb();
                    l12 = this.zzk;
                    ((zzal)object2).zzab(l8 += l12);
                    zzlj2.zza = object2 = ((zzal)object2).zzad();
                    return n7;
                }
            }
        }
        return n3;
    }

    public final long zzcW() {
        return this.zzm;
    }

    public final zzlj zzcX() {
        zzlj zzlj2 = this.zzc;
        zzlj2.zzb = null;
        zzlj2.zza = null;
        return zzlj2;
    }

    public final int zzd(long l2) {
        zzxf zzxf2 = this.zzi;
        zzxf2.getClass();
        long l3 = this.zzk;
        return zzxf2.zzb(l2 -= l3);
    }

    public int zze() {
        return 0;
    }

    public final long zzf() {
        return this.zzl;
    }

    public final zzer zzh() {
        zzer zzer2 = this.zzg;
        zzer2.getClass();
        return zzer2;
    }

    public final zzjh zzi(Throwable throwable, zzan zzan2, boolean bl2, int n3) {
        int n4;
        block5: {
            boolean bl3;
            int n7 = 4;
            if (zzan2 != null && !(bl3 = this.zzo)) {
                this.zzo = true;
                bl3 = false;
                try {
                    n7 = this.zzY(zzan2) & 7;
                    n4 = n7;
                    break block5;
                }
                catch (zzjh zzjh2) {
                    this.zzo = false;
                }
                finally {
                    this.zzo = false;
                }
            }
            n4 = 4;
        }
        String string2 = this.zzU();
        int n8 = this.zze;
        return zzjh.zzb(throwable, string2, n8, zzan2, n4, bl2, n3);
    }

    public zzlp zzk() {
        return null;
    }

    public final zzmp zzl() {
        return this;
    }

    public final zzmq zzm() {
        zzmq zzmq2 = this.zzd;
        zzmq2.getClass();
        return zzmq2;
    }

    public final zzpj zzn() {
        zzpj zzpj2 = this.zzf;
        zzpj2.getClass();
        return zzpj2;
    }

    public final zzxf zzo() {
        return this.zzi;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzp() {
        Object object = this.zza;
        synchronized (object) {
            Object var2_2 = null;
            this.zzq = null;
            return;
        }
    }

    public final void zzq() {
        int n3 = this.zzh;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        zzeq.zzf(n4 != 0);
        zzlj zzlj2 = this.zzc;
        zzlj2.zzb = null;
        zzlj2.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        this.zzw();
    }

    /*
     * WARNING - void declaration
     */
    public final void zzr(zzmq zzmq2, zzan[] zzanArray, zzxf zzxf2, long l2, boolean bl2, boolean bl3, long l3, long l4, zzvo zzvo2) {
        void var15_15;
        zziw zziw2 = this;
        boolean bl4 = bl2;
        int bl5 = this.zzh;
        int n3 = 1;
        if (bl5 == 0) {
            boolean bl6 = true;
        } else {
            boolean bl7 = false;
        }
        zzeq.zzf((boolean)var15_15);
        zziw2.zzd = zzmq2;
        zziw2.zzh = n3;
        boolean bl8 = bl3;
        this.zzx(bl4, bl3);
        this.zzH(zzanArray, zzxf2, l3, l4, zzvo2);
        this.zzZ(l3, bl4);
    }

    public /* synthetic */ void zzs() {
    }

    public void zzt(int n3, Object object) {
    }

    public final void zzu(int n3, zzpj zzpj2, zzer zzer2) {
        this.zze = n3;
        this.zzf = zzpj2;
        this.zzg = zzer2;
        this.zzy();
    }

    public final void zzv() {
        zzxf zzxf2 = this.zzi;
        zzxf2.getClass();
        zzxf2.zzd();
    }

    public void zzw() {
        throw null;
    }

    public void zzx(boolean bl2, boolean bl3) {
    }

    public void zzy() {
    }

    public void zzz(long l2, boolean bl2) {
        throw null;
    }
}

