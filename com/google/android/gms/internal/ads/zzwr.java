/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzaaa;
import com.google.android.gms.internal.ads.zzaae;
import com.google.android.gms.internal.ads.zzaaf;
import com.google.android.gms.internal.ads.zzaai;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaes;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzaha;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzde;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzin;
import com.google.android.gms.internal.ads.zzlj;
import com.google.android.gms.internal.ads.zzlo;
import com.google.android.gms.internal.ads.zzmr;
import com.google.android.gms.internal.ads.zzso;
import com.google.android.gms.internal.ads.zzst;
import com.google.android.gms.internal.ads.zzvf;
import com.google.android.gms.internal.ads.zzvk;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvm;
import com.google.android.gms.internal.ads.zzvx;
import com.google.android.gms.internal.ads.zzwg;
import com.google.android.gms.internal.ads.zzwh;
import com.google.android.gms.internal.ads.zzwi;
import com.google.android.gms.internal.ads.zzwj;
import com.google.android.gms.internal.ads.zzwk;
import com.google.android.gms.internal.ads.zzwl;
import com.google.android.gms.internal.ads.zzwm;
import com.google.android.gms.internal.ads.zzwn;
import com.google.android.gms.internal.ads.zzwo;
import com.google.android.gms.internal.ads.zzwp;
import com.google.android.gms.internal.ads.zzwq;
import com.google.android.gms.internal.ads.zzxd;
import com.google.android.gms.internal.ads.zzxe;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzv;
import com.google.android.gms.internal.ads.zzzz;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zzwr
implements zzvm,
zzadx,
zzaaa,
zzaaf,
zzxd {
    private static final Map zzb;
    private static final zzan zzc;
    private long zzA;
    private boolean zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private int zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private boolean zzJ;
    private int zzK;
    private boolean zzL;
    private boolean zzM;
    private final zzzz zzN;
    private final zzzv zzO;
    private final Uri zzd;
    private final zzhb zze;
    private final zzst zzf;
    private final zzvx zzg;
    private final zzso zzh;
    private final zzwn zzi;
    private final long zzj;
    private final zzaai zzk;
    private final zzwg zzl;
    private final zzeu zzm;
    private final Runnable zzn;
    private final Runnable zzo;
    private final Handler zzp;
    private final boolean zzq;
    private zzvl zzr;
    private zzaha zzs;
    private zzxe[] zzt;
    private zzwp[] zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private zzwq zzy;
    private zzaet zzz;

    static {
        Object object = new HashMap();
        ((HashMap)object).put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(object);
        object = new zzal();
        ((zzal)object).zzK("icy");
        ((zzal)object).zzX("application/x-icy");
        zzc = ((zzal)object).zzad();
    }

    public zzwr(Uri object, zzhb zzxeArray, zzwg zzwg2, zzst zzst2, zzso zzwpArray, zzzz object2, zzvx zzvx2, zzwn zzwn2, zzzv zzzv2, String string2, int n3, long l2) {
        long l3;
        this.zzd = object;
        this.zze = zzxeArray;
        this.zzf = zzst2;
        this.zzh = zzwpArray;
        this.zzN = object2;
        this.zzg = zzvx2;
        this.zzi = zzwn2;
        this.zzO = zzzv2;
        this.zzj = l3 = (long)n3;
        super("ProgressiveMediaPeriod");
        this.zzk = object;
        this.zzl = zzwg2;
        this.zzA = l2;
        int n4 = 1;
        zzxeArray = null;
        long l4 = -9223372036854775807L;
        long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (l7 != false) {
            l7 = 1;
        } else {
            l7 = 0;
            zzwpArray = null;
        }
        this.zzq = l7;
        object2 = zzer.zza;
        zzwpArray = new zzeu((zzer)object2);
        this.zzm = zzwpArray;
        zzwpArray = new zzwi(this);
        this.zzn = zzwpArray;
        zzwpArray = new zzwj(this);
        this.zzo = zzwpArray;
        zzwpArray = zzgd.zzx(null);
        this.zzp = zzwpArray;
        zzwpArray = new zzwp[]{};
        this.zzu = zzwpArray;
        zzxeArray = new zzxe[]{};
        this.zzt = zzxeArray;
        this.zzI = l4;
        this.zzC = n4;
    }

    public static /* synthetic */ void zzA(zzwr zzwr2) {
        zzwr2.zzU();
    }

    public static /* bridge */ /* synthetic */ void zzB(zzwr zzwr2, zzaha zzaha2) {
        zzwr2.zzs = zzaha2;
    }

    public static /* bridge */ /* synthetic */ void zzC(zzwr zzwr2) {
        zzwh zzwh2 = new zzwh(zzwr2);
        zzwr2.zzp.post((Runnable)zzwh2);
    }

    private final int zzQ() {
        zzxe[] zzxeArray = this.zzt;
        int n3 = zzxeArray.length;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            zzxe zzxe2 = zzxeArray[i3];
            int n7 = zzxe2.zzd();
            n4 += n7;
        }
        return n4;
    }

    private final long zzR(boolean bl2) {
        Object object;
        Object object2;
        long l2 = Long.MIN_VALUE;
        for (int i3 = 0; i3 < (object2 = ((zzxe[])(object = this.zzt)).length); ++i3) {
            if (!bl2) {
                Object object3 = this.zzy;
                object3.getClass();
                object3 = ((zzwq)object3).zzc;
                object2 = object3[i3];
                if (object2 == 0) continue;
            }
            object = object[i3];
            long l3 = ((zzxe)object).zzh();
            l2 = Math.max(l2, l3);
        }
        return l2;
    }

    private final zzafa zzS(zzwp zzxeArray) {
        int n3;
        Object object;
        zzxe[] zzxeArray2 = this.zzt;
        int n4 = zzxeArray2.length;
        zzwp[] zzwpArray = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            object = this.zzu[i3];
            n3 = zzxeArray.equals(object);
            if (n3 == 0) continue;
            return this.zzt[i3];
        }
        zzwpArray = this.zzO;
        object = this.zzf;
        zzso zzso2 = this.zzh;
        zzxe zzxe2 = new zzxe((zzzv)zzwpArray, (zzst)object, zzso2);
        zzxe2.zzu(this);
        zzwpArray = this.zzu;
        n3 = n4 + 1;
        zzwpArray = Arrays.copyOf(zzwpArray, n3);
        zzwpArray[n4] = zzxeArray;
        this.zzu = zzwpArray;
        zzxeArray = Arrays.copyOf(this.zzt, n3);
        zzxeArray[n4] = zzxe2;
        this.zzt = zzxeArray;
        return zzxe2;
    }

    private final void zzT() {
        zzeq.zzf(this.zzw);
        this.zzy.getClass();
        this.zzz.getClass();
    }

    private final void zzU() {
        block12: {
            zzan zzan2;
            Object object;
            Object object2 = null;
            int n3 = 1;
            int n4 = this.zzM;
            if (n4 != 0 || (n4 = this.zzw) != 0 || (n4 = this.zzv) == 0 || (object = this.zzz) == null) break block12;
            object = this.zzt;
            int n7 = ((zzxe[])object).length;
            boolean[] blArray = null;
            for (int i3 = 0; i3 < n7; i3 += n3) {
                zzan2 = object[i3].zzi();
                if (zzan2 != null) {
                    continue;
                }
                break block12;
            }
            this.zzm.zzc();
            object = this.zzt;
            n4 = ((zzxe[])object).length;
            zzde[] zzdeArray = new zzde[n4];
            blArray = new boolean[n4];
            zzan2 = null;
            for (int i8 = 0; i8 < n4; i8 += n3) {
                zzan[] zzanArray;
                int n8;
                Object object3;
                Object object4;
                block13: {
                    int n10;
                    int n14;
                    block15: {
                        block14: {
                            object4 = this.zzt[i8].zzi();
                            object4.getClass();
                            object3 = ((zzan)object4).zzn;
                            n14 = zzcg.zzg((String)object3);
                            if (n14 != 0 || (n8 = zzcg.zzh((String)object3)) != 0) {
                                n8 = 1;
                            } else {
                                n8 = 0;
                                object3 = null;
                            }
                            blArray[i8] = n8;
                            n10 = this.zzx;
                            this.zzx = n8 |= n10;
                            object3 = this.zzs;
                            if (object3 == null) break block13;
                            if (n14 != 0) break block14;
                            zzanArray = this.zzu[i8];
                            n10 = zzanArray.zzb;
                            if (n10 == 0) break block15;
                        }
                        if ((zzanArray = ((zzan)object4).zzl) == null) {
                            long l2 = -9223372036854775807L;
                            zzcc[] zzccArray = new zzcc[n3];
                            zzccArray[0] = object3;
                            zzanArray = new zzcd(l2, zzccArray);
                        } else {
                            zzcc[] zzccArray = new zzcc[n3];
                            zzccArray[0] = object3;
                            zzanArray = zzanArray.zzc(zzccArray);
                        }
                        object4 = ((zzan)object4).zzb();
                        ((zzal)object4).zzQ((zzcd)zzanArray);
                        object4 = ((zzal)object4).zzad();
                    }
                    if (n14 != 0 && (n14 = ((zzan)object4).zzh) == (n10 = -1) && (n14 = ((zzan)object4).zzi) == n10 && (n8 = ((zzaha)object3).zza) != n10) {
                        object4 = ((zzan)object4).zzb();
                        ((zzal)object4).zzx(n8);
                        object4 = ((zzal)object4).zzad();
                    }
                }
                n8 = this.zzf.zza((zzan)object4);
                object4 = ((zzan)object4).zzc(n8);
                String string2 = Integer.toString(i8);
                zzanArray = new zzan[n3];
                zzanArray[0] = object4;
                zzdeArray[i8] = object3 = new zzde(string2, zzanArray);
            }
            object = new zzxr(zzdeArray);
            object2 = new zzwq((zzxr)object, blArray);
            this.zzy = object2;
            this.zzw = n3;
            object2 = this.zzr;
            object2.getClass();
            object2.zzi(this);
        }
    }

    private final void zzV(int n3) {
        this.zzT();
        Object object = this.zzy;
        boolean[] blArray = ((zzwq)object).zzd;
        boolean bl2 = blArray[n3];
        if (!bl2) {
            boolean bl3;
            object = ((zzwq)object).zza.zzb(n3);
            bl2 = false;
            zzan zzan2 = ((zzde)object).zzb(0);
            object = this.zzg;
            String string2 = zzan2.zzn;
            int n4 = zzcg.zzb(string2);
            long l2 = this.zzH;
            long l3 = zzgd.zzu(l2);
            long l4 = -9223372036854775807L;
            int n7 = 1;
            zzvk zzvk2 = new zzvk(n7, n4, zzan2, 0, null, l3, l4);
            ((zzvx)object).zzc(zzvk2);
            blArray[n3] = bl3 = true;
        }
    }

    private final void zzW(int n3) {
        boolean bl2;
        this.zzT();
        boolean[] blArray = this.zzy.zzb;
        int n4 = this.zzJ;
        if (n4 != 0 && (bl2 = blArray[n3])) {
            Object object = this.zzt[n3];
            bl2 = false;
            blArray = null;
            n3 = (int)(((zzxe)object).zzx(false) ? 1 : 0);
            if (n3 == 0) {
                long l2;
                this.zzI = l2 = 0L;
                this.zzJ = false;
                n3 = 1;
                this.zzE = n3;
                this.zzH = l2;
                this.zzK = 0;
                for (zzxe zzxe2 : this.zzt) {
                    zzxe2.zzp(false);
                }
                object = this.zzr;
                object.getClass();
                object.zzg(this);
            }
        }
    }

    private final void zzX() {
        int n3;
        long l2;
        long l3;
        Object object;
        zzwr zzwr2 = this;
        Uri uri = this.zzd;
        zzhb zzhb2 = this.zze;
        zzwg zzwg2 = this.zzl;
        Object object2 = this.zzm;
        zzxe[] zzxeArray = object;
        Object object3 = this;
        Object object4 = this;
        object = new zzwm(this, uri, zzhb2, zzwg2, this, (zzeu)object2);
        int n4 = this.zzw;
        if (n4 != 0) {
            long l4;
            long l7;
            n4 = this.zzY();
            zzeq.zzf(n4 != 0);
            long l8 = this.zzA;
            l3 = -9223372036854775807L;
            long l12 = l8 == l3 ? 0 : (l8 < l3 ? -1 : 1);
            if (l12 != false && (l7 = (l4 = (l2 = this.zzI) - l8) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
                this.zzL = true;
                this.zzI = l3;
                return;
            }
            zzxeArray = zzwr2.zzz;
            zzxeArray.getClass();
            l2 = zzwr2.zzI;
            zzxeArray = zzxeArray.zzg((long)l2).zza;
            l2 = zzwr2.zzI;
            l8 = zzxeArray.zzc;
            zzwm.zzf((zzwm)object, l8, l2);
            zzxeArray = zzwr2.zzt;
            n3 = zzxeArray.length;
            zzwg2 = null;
            for (l12 = (long)0; l12 < n3; ++l12) {
                object4 = zzxeArray[l12];
                long l14 = zzwr2.zzI;
                ((zzxe)object4).zzt(l14);
            }
            zzwr2.zzI = l3;
        }
        zzwr2.zzK = n4 = this.zzQ();
        zzxeArray = zzwr2.zzk;
        n3 = zzzz.zza(zzwr2.zzC);
        long l15 = zzxeArray.zza((zzaae)object, zzwr2, n3);
        zzhh zzhh2 = zzwm.zzd((zzwm)object);
        zzxeArray = zzwr2.zzg;
        long l16 = zzwm.zzb((zzwm)object);
        Uri uri2 = zzhh2.zza;
        Map map2 = Collections.emptyMap();
        object3 = new zzvf(l16, zzhh2, uri2, map2, l15, 0L, 0L);
        l3 = zzwm.zzc((zzwm)object);
        l2 = zzwr2.zzA;
        long l17 = zzgd.zzu(l3);
        long l18 = zzgd.zzu(l2);
        object = object2;
        object2 = new zzvk(1, -1, null, 0, null, l17, l18);
        zzxeArray.zzg((zzvf)object3, (zzvk)object2);
    }

    private final boolean zzY() {
        long l2 = this.zzI;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object != false;
    }

    private final boolean zzZ() {
        boolean bl2 = this.zzE;
        return bl2 || (bl2 = this.zzY());
        {
        }
    }

    public static /* bridge */ /* synthetic */ long zzn(zzwr zzwr2) {
        return zzwr2.zzj;
    }

    public static /* bridge */ /* synthetic */ long zzq(zzwr zzwr2) {
        return zzwr2.zzA;
    }

    public static /* bridge */ /* synthetic */ long zzr(zzwr zzwr2, boolean bl2) {
        return zzwr2.zzR(true);
    }

    public static /* bridge */ /* synthetic */ Handler zzs(zzwr zzwr2) {
        return zzwr2.zzp;
    }

    public static /* bridge */ /* synthetic */ zzan zzt() {
        return zzc;
    }

    public static /* bridge */ /* synthetic */ zzaha zzx(zzwr zzwr2) {
        return zzwr2.zzs;
    }

    public static /* bridge */ /* synthetic */ Runnable zzy(zzwr zzwr2) {
        return zzwr2.zzo;
    }

    public static /* bridge */ /* synthetic */ Map zzz() {
        return zzb;
    }

    public final void zzD() {
        this.zzv = true;
        Handler handler = this.zzp;
        Runnable runnable2 = this.zzn;
        handler.post(runnable2);
    }

    public final /* synthetic */ void zzE() {
        boolean bl2 = this.zzM;
        if (!bl2) {
            zzvl zzvl2 = this.zzr;
            zzvl2.getClass();
            zzvl2.zzg(this);
        }
    }

    public final /* synthetic */ void zzF() {
        this.zzG = true;
    }

    public final /* synthetic */ void zzG(zzaet zzaet2) {
        long l2;
        long l3;
        zzaet zzaet3;
        long l4;
        long l7;
        Object object = this.zzs;
        long l8 = -9223372036854775807L;
        if (object == null) {
            object = zzaet2;
        } else {
            l7 = 0L;
            object = new zzaes(l8, l7);
        }
        this.zzz = object;
        l7 = zzaet2.zza();
        long l12 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
        if (l12 == false && (l12 = (l4 = (l7 = this.zzA) - l8) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            zzaet3 = this.zzz;
            this.zzz = object = new zzwl(this, zzaet3);
        }
        object = this.zzz;
        this.zzA = l7 = object.zza();
        l12 = (long)this.zzG;
        int n3 = 0;
        zzaet3 = null;
        int n4 = 1;
        if (l12 == false && (l12 = (l3 = (l2 = zzaet2.zza()) - l8) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
            n3 = 1;
        }
        this.zzB = n3;
        if (n4 == n3) {
            n4 = 7;
        }
        this.zzC = n4;
        object = this.zzi;
        l8 = this.zzA;
        boolean bl2 = zzaet2.zzh();
        n3 = (int)(this.zzB ? 1 : 0);
        object.zza(l8, bl2, n3 != 0);
        bl2 = this.zzw;
        if (!bl2) {
            this.zzU();
        }
    }

    public final void zzH() {
        int n3 = zzzz.zza(this.zzC);
        this.zzk.zzi(n3);
    }

    public final void zzI(int n3) {
        this.zzt[n3].zzm();
        this.zzH();
    }

    public final void zzL() {
        for (zzxe zzxe2 : this.zzt) {
            zzxe2.zzo();
        }
        this.zzl.zze();
    }

    public final void zzM(zzan zzan2) {
        zzan2 = this.zzp;
        Runnable runnable2 = this.zzn;
        zzan2.post(runnable2);
    }

    public final void zzN() {
        boolean bl2 = this.zzw;
        if (bl2) {
            for (zzxe zzxe2 : this.zzt) {
                zzxe2.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzM = true;
    }

    public final void zzO(zzaet zzaet2) {
        zzwk zzwk2 = new zzwk(this, zzaet2);
        this.zzp.post((Runnable)zzwk2);
    }

    public final boolean zzP(int n3) {
        zzxe[] zzxeArray;
        zzxe zzxe2;
        boolean bl2 = this.zzZ();
        return !bl2 && (n3 = (int)((zzxe2 = (zzxeArray = this.zzt)[n3]).zzx(bl2 = this.zzL) ? 1 : 0)) != 0;
    }

    public final long zza(long l2, zzmr zzmr2) {
        long l3;
        block14: {
            long l4;
            block10: {
                Object object;
                long l7;
                block13: {
                    long l8;
                    block12: {
                        Object object2;
                        block11: {
                            long l12;
                            long l14;
                            zzaeu zzaeu2;
                            long l15;
                            int n3;
                            Object object3;
                            zzmr zzmr3;
                            block9: {
                                l4 = l2;
                                zzmr3 = zzmr2;
                                this.zzT();
                                object3 = this.zzz;
                                n3 = object3.zzh();
                                l15 = 0L;
                                if (n3 == 0) {
                                    return l15;
                                }
                                object3 = this.zzz.zzg(l2);
                                zzaeu2 = ((zzaer)object3).zza;
                                object3 = ((zzaer)object3).zzb;
                                l14 = zzmr2.zzf;
                                long l16 = l14 - l15;
                                Object object4 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                                if (object4 != false) break block9;
                                l14 = zzmr2.zzg;
                                long l17 = l14 - l15;
                                object4 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
                                if (object4 == false) break block10;
                                l14 = l15;
                            }
                            l8 = zzaeu2.zzb;
                            l3 = l4 - l14;
                            l7 = l4 ^ l14;
                            long l18 = l4 ^ l3;
                            l15 = zzmr3.zzg;
                            long l19 = l4 + l15;
                            long l20 = l4 ^ l19;
                            l15 ^= l19;
                            long l21 = (l7 &= l18) - (l18 = 0L);
                            object = l21 == 0L ? 0 : (l21 < 0L ? -1 : 1);
                            if (object < 0) {
                                l3 = Long.MIN_VALUE;
                            }
                            if ((object = (l12 = (l15 = l20 & l15) - l18) == 0L ? 0 : (l12 < 0L ? -1 : 1)) < 0) {
                                l19 = Long.MAX_VALUE;
                            }
                            object = 1;
                            Object object5 = 0;
                            object2 = l3 == l8 ? 0 : (l3 < l8 ? -1 : 1);
                            object2 = object2 <= 0 && (object2 = l8 == l19 ? 0 : (l8 < l19 ? -1 : 1)) <= 0 ? (Object)1 : (Object)0;
                            l7 = ((zzaeu)object3).zzb;
                            n3 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1);
                            if (n3 > 0 || (n3 = (int)(l7 == l19 ? 0 : (l7 < l19 ? -1 : 1))) > 0) {
                                object = 0;
                                zzmr3 = null;
                            }
                            if (object2 == false || object == false) break block11;
                            long l22 = l8 - l4;
                            l4 = l7 - l4;
                            long l23 = (l22 = Math.abs(l22)) - (l4 = Math.abs(l4));
                            object5 = l23 == 0L ? 0 : (l23 < 0L ? -1 : 1);
                            if (object5 > 0) {
                                return l7;
                            }
                            break block12;
                        }
                        if (object2 == false) break block13;
                    }
                    l4 = l8;
                    break block10;
                }
                if (object == false) break block14;
                l4 = l7;
            }
            return l4;
        }
        return l3;
    }

    public final long zzb() {
        this.zzT();
        int n3 = this.zzL;
        long l2 = Long.MIN_VALUE;
        if (n3 == 0 && (n3 = this.zzF) != 0) {
            long l3;
            n3 = (int)(this.zzY() ? 1 : 0);
            if (n3 != 0) {
                return this.zzI;
            }
            n3 = (int)(this.zzx ? 1 : 0);
            long l4 = Long.MAX_VALUE;
            if (n3 != 0) {
                zzxe[] zzxeArray = this.zzt;
                n3 = zzxeArray.length;
                l3 = l4;
                for (int i3 = 0; i3 < n3; ++i3) {
                    Object object;
                    Object object2 = this.zzy;
                    boolean[] blArray = ((zzwq)object2).zzb;
                    boolean bl2 = blArray[i3];
                    if (!bl2 || (object = (object2 = (Object)((zzwq)object2).zzc)[i3]) == false || (object = (Object)((zzxe)(object2 = this.zzt[i3])).zzw()) != false) continue;
                    object2 = this.zzt[i3];
                    long l7 = ((zzxe)object2).zzh();
                    l3 = Math.min(l3, l7);
                }
            } else {
                l3 = l4;
            }
            if ((n3 = (int)(l3 == l4 ? 0 : (l3 < l4 ? -1 : 1))) == 0) {
                l3 = this.zzR(false);
            }
            if ((n3 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1))) == 0) {
                return this.zzH;
            }
            return l3;
        }
        return l2;
    }

    public final long zzc() {
        return this.zzb();
    }

    public final long zzd() {
        int n3;
        int n4 = this.zzE;
        if (n4 != 0 && ((n4 = this.zzL) != 0 || (n4 = this.zzQ()) > (n3 = this.zzK))) {
            this.zzE = false;
            return this.zzH;
        }
        return -9223372036854775807L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final long zze(long l2) {
        Object object;
        Object object2;
        int n3;
        int n4;
        int n7;
        Object object3;
        block11: {
            this.zzT();
            object3 = this.zzy.zzb;
            zzaet zzaet2 = this.zzz;
            n7 = zzaet2.zzh();
            n4 = 1;
            if (n4 != n7) {
                l2 = 0L;
            }
            n7 = 0;
            zzaet2 = null;
            this.zzE = false;
            this.zzH = l2;
            n4 = this.zzY();
            if (n4 != 0) {
                this.zzI = l2;
                return l2;
            }
            n4 = this.zzC;
            n3 = 7;
            if (n4 != n3) {
                zzxe[] zzxeArray = this.zzt;
                n4 = zzxeArray.length;
                n3 = 0;
                object2 = null;
                while (n3 < n4) {
                    Object object4;
                    object = this.zzt[n3];
                    int n8 = this.zzq;
                    if (n8 != 0) {
                        n8 = ((zzxe)object).zza();
                        object4 = ((zzxe)object).zzy(n8);
                    } else {
                        object4 = ((zzxe)object).zzz(l2, false);
                    }
                    if (object4 || !(object4 = object3[n3]) && (object4 = this.zzx)) {
                        ++n3;
                        continue;
                    }
                    break block11;
                }
                return l2;
            }
        }
        this.zzJ = false;
        this.zzI = l2;
        this.zzL = false;
        object3 = this.zzk;
        n4 = (int)(((zzaai)object3).zzl() ? 1 : 0);
        if (n4 != 0) {
            object3 = this.zzt;
            n4 = ((Object)object3).length;
            while (true) {
                if (n7 >= n4) {
                    object3 = this.zzk;
                    ((zzaai)object3).zzg();
                    return l2;
                }
                object2 = object3[n7];
                ((zzxe)object2).zzk();
                ++n7;
            }
        }
        ((zzaai)object3).zzh();
        object3 = this.zzt;
        n4 = ((Object)object3).length;
        n3 = 0;
        object2 = null;
        while (n3 < n4) {
            object = object3[n3];
            ((zzxe)object).zzp(false);
            ++n3;
        }
        return l2;
    }

    /*
     * Unable to fully structure code
     */
    public final long zzf(zzzg[] var1_1, boolean[] var2_2, zzxf[] var3_3, boolean[] var4_4, long var5_5) {
        block22: {
            this.zzT();
            var7_6 = this.zzy;
            var8_7 = var7_6.zza;
            var7_6 = var7_6.zzc;
            var9_8 = this.zzF;
            var10_9 = 0;
            for (var11_10 = 0; var11_10 < (var12_11 = ((zzzg[])var1_1).length); ++var11_10) {
                var13_12 = var3_3[var11_10];
                if (var13_12 == null || (var14_13 = var1_1[var11_10]) != null && (var15_14 = var2_2[var11_10]) != 0) continue;
                var12_11 = zzwo.zzc((zzwo)var13_12);
                zzeq.zzf((boolean)var7_6[var12_11]);
                this.zzF = var15_14 = this.zzF + -1;
                var7_6[var12_11] = false;
                var12_11 = 0;
                var13_12 = null;
                var3_3[var11_10] = null;
            }
            var16_15 = this.zzq;
            var11_10 = 1;
            if (var16_15 == 0) {
                var16_15 = this.zzD;
                if (var16_15 != 0) {
                    if (var9_8 == 0) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var16_15 = 1;
                            break block22;
                            break;
                        }
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 4 sources

            {
                while (true) {
                    var16_15 = 0;
                    var2_2 = null;
                    break block22;
                    break;
                }
            }
            ** while ((var16_15 = (cfr_temp_0 = var5_5 - (var17_16 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) != 0)
lbl33:
            // 1 sources

            var5_5 = var17_16;
            ** while (true)
        }
        for (var9_8 = 0; var9_8 < (var12_11 = ((zzzg[])var1_1).length); ++var9_8) {
            var13_12 = var3_3[var9_8];
            if (var13_12 != null || (var13_12 = var1_1[var9_8]) == null) continue;
            var15_14 = var13_12.zzc();
            if (var15_14 == var11_10) {
                var15_14 = 1;
            } else {
                var15_14 = 0;
                var14_13 = null;
            }
            zzeq.zzf((boolean)var15_14);
            var15_14 = var13_12.zza(0);
            if (var15_14 == 0) {
                var15_14 = 1;
            } else {
                var15_14 = 0;
                var14_13 = null;
            }
            zzeq.zzf((boolean)var15_14);
            var13_12 = var13_12.zze();
            var12_11 = var8_7.zza((zzde)var13_12);
            zzeq.zzf((boolean)(var7_6[var12_11] ^ var11_10));
            this.zzF = var15_14 = this.zzF + var11_10;
            var7_6[var12_11] = var11_10;
            var3_3[var9_8] = var14_13 = new zzwo(this, var12_11);
            var4_4[var9_8] = var11_10;
            if (var16_15 != 0) continue;
            var2_2 = this.zzt[var12_11];
            if ((var12_11 = var2_2.zzb()) != 0 && (var16_15 = (int)var2_2.zzz(var5_5, (boolean)var11_10)) == 0) {
                var16_15 = 1;
                continue;
            }
            var16_15 = 0;
            var2_2 = null;
        }
        var19_17 = this.zzF;
        if (var19_17 == 0) {
            this.zzJ = false;
            this.zzE = false;
            var1_1 = this.zzk;
            var19_17 = (int)var1_1.zzl();
            if (var19_17 != 0) {
                var1_1 = this.zzt;
                var16_15 = ((Object)var1_1).length;
                while (var10_9 < var16_15) {
                    var3_3 = var1_1[var10_9];
                    var3_3.zzk();
                    ++var10_9;
                }
                var1_1 = this.zzk;
                var1_1.zzg();
            } else {
                var1_1 = this.zzt;
                var16_15 = ((Object)var1_1).length;
                var3_3 = null;
                for (var20_18 = 0; var20_18 < var16_15; ++var20_18) {
                    var4_4 = var1_1[var20_18];
                    var4_4.zzp(false);
                }
            }
        } else if (var16_15 != 0) {
            var5_5 = this.zze(var5_5);
            while (var10_9 < (var19_17 = ((zzxf[])var3_3).length)) {
                var1_1 = var3_3[var10_9];
                if (var1_1 != null) {
                    var4_4[var10_9] = var11_10;
                }
                ++var10_9;
            }
        }
        this.zzD = var11_10;
        return var5_5;
    }

    public final int zzg(int n3, zzlj zzlj2, zzin zzin2, int n4) {
        boolean bl2 = this.zzZ();
        int n7 = -3;
        if (bl2) {
            return n7;
        }
        this.zzV(n3);
        zzxe zzxe2 = this.zzt[n3];
        boolean bl3 = this.zzL;
        int n8 = zzxe2.zze(zzlj2, zzin2, n4, bl3);
        if (n8 == n7) {
            this.zzW(n3);
        }
        return n8;
    }

    public final zzxr zzh() {
        this.zzT();
        return this.zzy.zza;
    }

    public final int zzi(int n3, long l2) {
        boolean bl2 = this.zzZ();
        if (bl2) {
            return 0;
        }
        this.zzV(n3);
        zzxe zzxe2 = this.zzt[n3];
        boolean bl3 = this.zzL;
        int n4 = zzxe2.zzc(l2, bl3);
        zzxe2.zzv(n4);
        if (n4 == 0) {
            this.zzW(n3);
            return 0;
        }
        return n4;
    }

    public final void zzj(long l2, boolean bl2) {
        bl2 = this.zzq;
        if (!bl2) {
            this.zzT();
            bl2 = this.zzY();
            if (!bl2) {
                boolean[] blArray = this.zzy.zzc;
                zzxe[] zzxeArray = this.zzt;
                int n3 = zzxeArray.length;
                for (int i3 = 0; i3 < n3; ++i3) {
                    zzxe zzxe2 = this.zzt[i3];
                    boolean bl3 = blArray[i3];
                    zzxe2.zzj(l2, false, bl3);
                }
            }
        }
    }

    public final void zzk() {
        this.zzH();
        boolean bl2 = this.zzL;
        if (bl2 && !(bl2 = this.zzw)) {
            throw zzch.zza("Loading finished before preparation is complete.", null);
        }
    }

    public final void zzl(zzvl zzvl2, long l2) {
        this.zzr = zzvl2;
        this.zzm.zze();
        this.zzX();
    }

    public final void zzm(long l2) {
    }

    public final boolean zzo(zzlo object) {
        boolean bl2;
        boolean bl3 = this.zzL;
        if (!(bl3 || (bl2 = ((zzaai)(object = this.zzk)).zzk()) || (bl2 = this.zzJ) || (bl2 = this.zzw) && !(bl2 = this.zzF))) {
            zzeu zzeu2 = this.zzm;
            bl2 = zzeu2.zze();
            bl3 = ((zzaai)object).zzl();
            if (!bl3) {
                this.zzX();
                return true;
            }
            return bl2;
        }
        return false;
    }

    public final boolean zzp() {
        Object object = this.zzk;
        boolean bl2 = ((zzaai)object).zzl();
        return bl2 && (bl2 = ((zzeu)(object = this.zzm)).zzd());
    }

    public final zzafa zzv() {
        zzwp zzwp2 = new zzwp(0, true);
        return this.zzS(zzwp2);
    }

    public final zzafa zzw(int n3, int n4) {
        zzwp zzwp2 = new zzwp(n3, false);
        return this.zzS(zzwp2);
    }
}

