/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.SurfaceTexture
 *  android.media.AudioManager
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Pair
 *  android.view.Surface
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzaa;
import com.google.android.gms.internal.ads.zzaci;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzar;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzbv;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzca;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzcn;
import com.google.android.gms.internal.ads.zzcp;
import com.google.android.gms.internal.ads.zzcq;
import com.google.android.gms.internal.ads.zzcs;
import com.google.android.gms.internal.ads.zzct;
import com.google.android.gms.internal.ads.zzcz;
import com.google.android.gms.internal.ads.zzdb;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzdp;
import com.google.android.gms.internal.ads.zzdv;
import com.google.android.gms.internal.ads.zzek;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzfb;
import com.google.android.gms.internal.ads.zzfe;
import com.google.android.gms.internal.ads.zzff;
import com.google.android.gms.internal.ads.zzfh;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfv;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzio;
import com.google.android.gms.internal.ads.zziq;
import com.google.android.gms.internal.ads.zzir;
import com.google.android.gms.internal.ads.zziu;
import com.google.android.gms.internal.ads.zziv;
import com.google.android.gms.internal.ads.zzix;
import com.google.android.gms.internal.ads.zzja;
import com.google.android.gms.internal.ads.zzjh;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjk;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzjq;
import com.google.android.gms.internal.ads.zzjr;
import com.google.android.gms.internal.ads.zzjs;
import com.google.android.gms.internal.ads.zzjt;
import com.google.android.gms.internal.ads.zzju;
import com.google.android.gms.internal.ads.zzjv;
import com.google.android.gms.internal.ads.zzjw;
import com.google.android.gms.internal.ads.zzjx;
import com.google.android.gms.internal.ads.zzjy;
import com.google.android.gms.internal.ads.zzjz;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzka;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zzkc;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zzke;
import com.google.android.gms.internal.ads.zzkf;
import com.google.android.gms.internal.ads.zzkg;
import com.google.android.gms.internal.ads.zzkh;
import com.google.android.gms.internal.ads.zzki;
import com.google.android.gms.internal.ads.zzkj;
import com.google.android.gms.internal.ads.zzkk;
import com.google.android.gms.internal.ads.zzkl;
import com.google.android.gms.internal.ads.zzkn;
import com.google.android.gms.internal.ads.zzks;
import com.google.android.gms.internal.ads.zzku;
import com.google.android.gms.internal.ads.zzkv;
import com.google.android.gms.internal.ads.zzlf;
import com.google.android.gms.internal.ads.zzlh;
import com.google.android.gms.internal.ads.zzli;
import com.google.android.gms.internal.ads.zzlk;
import com.google.android.gms.internal.ads.zzm;
import com.google.android.gms.internal.ads.zzmd;
import com.google.android.gms.internal.ads.zzmg;
import com.google.android.gms.internal.ads.zzmi;
import com.google.android.gms.internal.ads.zzmj;
import com.google.android.gms.internal.ads.zzml;
import com.google.android.gms.internal.ads.zzmn;
import com.google.android.gms.internal.ads.zzmq;
import com.google.android.gms.internal.ads.zzmr;
import com.google.android.gms.internal.ads.zzmv;
import com.google.android.gms.internal.ads.zzmw;
import com.google.android.gms.internal.ads.zzmx;
import com.google.android.gms.internal.ads.zzna;
import com.google.android.gms.internal.ads.zzpj;
import com.google.android.gms.internal.ads.zzqo;
import com.google.android.gms.internal.ads.zzun;
import com.google.android.gms.internal.ads.zzvj;
import com.google.android.gms.internal.ads.zzvn;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzvq;
import com.google.android.gms.internal.ads.zzxi;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzxu;
import com.google.android.gms.internal.ads.zzy;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzm;
import com.google.android.gms.internal.ads.zzzn;
import com.google.android.gms.internal.ads.zzzt;
import com.google.android.gms.internal.ads.zzzu;
import com.google.android.gms.internal.ads.zzzy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

final class zzkw
extends zzm
implements zzjr {
    public static final /* synthetic */ int zzd;
    private final zzmw zzA;
    private final long zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private int zzF;
    private zzmr zzG;
    private zzcp zzH;
    private zzca zzI;
    private zzca zzJ;
    private zzan zzK;
    private zzan zzL;
    private Object zzM;
    private Surface zzN;
    private int zzO;
    private zzfv zzP;
    private zzix zzQ;
    private zzix zzR;
    private int zzS;
    private zzk zzT;
    private float zzU;
    private boolean zzV;
    private zzek zzW;
    private boolean zzX;
    private boolean zzY;
    private zzaa zzZ;
    private zzdv zzaa;
    private zzca zzab;
    private zzmg zzac;
    private int zzad;
    private long zzae;
    private final zzjs zzaf;
    private zzxi zzag;
    final zzzn zzb;
    final zzcp zzc;
    private final zzeu zze;
    private final Context zzf;
    private final zzct zzg;
    private final zzmn[] zzh;
    private final zzzm zzi;
    private final zzfb zzj;
    private final zzlh zzk;
    private final zzfh zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzcz zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzvn zzq;
    private final zzmx zzr;
    private final Looper zzs;
    private final zzzu zzt;
    private final zzer zzu;
    private final zzks zzv;
    private final zzku zzw;
    private final zzir zzx;
    private final zziv zzy;
    private final zzmv zzz;

    static {
        zzbv.zzb("media3.exoplayer");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzkw(zzjq zzjq2, zzct zzct2) {
        Throwable throwable2;
        zzkw zzkw2;
        block8: {
            Object object;
            block9: {
                float f5;
                zzmr zzmr2;
                boolean bl2;
                Object object2;
                zzmn[] zzmnArray;
                Object object3;
                Object object4;
                Object object5;
                boolean bl3;
                Object[] objectArray;
                Object object6;
                Object object7;
                zzkw2 = this;
                object = zzjq2;
                Object object8 = zzct2;
                String string2 = "Init ";
                Object object9 = zzer.zza;
                Object object10 = new zzeu((zzer)object9);
                this.zze = object10;
                object9 = "ExoPlayerImpl";
                try {
                    long l2;
                    int n3 = System.identityHashCode(this);
                    object7 = Integer.toHexString(n3);
                    object6 = zzgd.zze;
                    objectArray = new StringBuilder(string2);
                    objectArray.append((String)object7);
                    string2 = " [AndroidXMedia3/1.4.0-alpha01] [";
                    objectArray.append(string2);
                    objectArray.append((String)object6);
                    string2 = "]";
                    objectArray.append(string2);
                    string2 = objectArray.toString();
                    zzfk.zze((String)object9, string2);
                    string2 = zzjq2.zza;
                    string2 = string2.getApplicationContext();
                    this.zzf = string2;
                    object9 = zzjq2.zzh;
                    object7 = zzjq2.zzb;
                    this.zzr = object9 = object9.apply(object7);
                    this.zzT = object7 = zzjq2.zzj;
                    this.zzO = n3 = zzjq2.zzk;
                    n3 = 0;
                    object7 = null;
                    this.zzV = false;
                    this.zzB = l2 = zzjq2.zzo;
                    bl3 = false;
                    object6 = null;
                    objectArray = new zzks(this, null);
                    this.zzv = objectArray;
                    object5 = new zzku(null);
                    this.zzw = object5;
                    object4 = zzjq2.zzi;
                    object3 = new Handler((Looper)object4);
                    object4 = zzjq2.zzc;
                    object4 = (zzjj)object4;
                    object4 = ((zzjj)object4).zza;
                    zzmnArray = object3;
                    object3 = object4;
                    object4 = object5;
                    object5 = zzmnArray;
                    object2 = objectArray;
                    object3 = object3.zza((Handler)zzmnArray, (zzaci)objectArray, (zzqo)objectArray, (zzxu)objectArray, (zzun)objectArray);
                    this.zzh = object3;
                    int cfr_ignored_0 = ((zzmn[])object3).length;
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                object5 = zzjq2.zze;
                object5 = object5.zza();
                this.zzi = object5 = (zzzm)object5;
                Object object11 = zzjq2.zzd;
                object11 = (zzjk)object11;
                object11 = ((zzjk)object11).zza;
                this.zzq = object11 = zzjq.zza((Context)object11);
                object11 = zzjq2.zzg;
                object11 = (zzjn)object11;
                object11 = ((zzjn)object11).zza;
                this.zzt = object11 = zzzy.zzg((Context)object11);
                this.zzp = bl2 = zzjq2.zzl;
                this.zzG = zzmr2 = zzjq2.zzm;
                zzmr2 = zzjq2.zzi;
                this.zzs = zzmr2;
                Object object12 = zzjq2.zzb;
                this.zzu = object12;
                this.zzg = zzct2;
                CopyOnWriteArraySet<zzmq[]> copyOnWriteArraySet = new CopyOnWriteArraySet<zzmq[]>(this);
                this.zzl = object6 = new zzfh((Looper)zzmr2, (zzer)object12, (zzff)((Object)copyOnWriteArraySet));
                this.zzm = copyOnWriteArraySet = new CopyOnWriteArraySet<zzmq[]>();
                object7 = new ArrayList();
                this.zzo = object7;
                Object object13 = object6;
                bl3 = false;
                object6 = null;
                this.zzag = object7 = new zzxi(0);
                bl3 = ((zzmn[])object3).length;
                Object object14 = objectArray;
                bl3 = 2 != 0;
                objectArray = new zzmq[bl3];
                zzzg[] zzzgArray = object10;
                object10 = new zzzg[bl3];
                object6 = zzdp.zza;
                Object object15 = object4;
                int n4 = 0;
                object4 = null;
                this.zzb = object7 = new zzzn((zzmq[])objectArray, (zzzg[])object10, (zzdp)object6, null);
                this.zzn = object4;
                super();
                int n7 = 20;
                object10 = new int[n7];
                Object[] objectArray2 = object10;
                Object[] objectArray3 = object10;
                objectArray2[0] = (zzzg)true;
                objectArray3[1] = (zzzg)2;
                objectArray2[2] = (zzzg)3;
                objectArray3[3] = (zzzg)13;
                objectArray2[4] = (zzzg)14;
                objectArray3[5] = (zzzg)15;
                objectArray2[6] = (zzzg)16;
                objectArray3[7] = (zzzg)17;
                objectArray2[8] = (zzzg)18;
                objectArray3[9] = (zzzg)19;
                objectArray2[10] = (zzzg)31;
                objectArray3[11] = (zzzg)20;
                objectArray2[12] = (zzzg)30;
                objectArray3[13] = (zzzg)21;
                objectArray2[14] = (zzzg)35;
                objectArray3[15] = (zzzg)22;
                objectArray2[16] = (zzzg)24;
                objectArray3[17] = (zzzg)27;
                objectArray2[18] = (zzzg)28;
                objectArray3[19] = (zzzg)32;
                ((zzcn)object4).zzc((int[])object10);
                ((zzzm)object5).zzn();
                n7 = 29;
                bl3 = true;
                ((zzcn)object4).zzd(n7, bl3);
                n7 = 23;
                bl3 = false;
                object6 = null;
                ((zzcn)object4).zzd(n7, false);
                n7 = 25;
                ((zzcn)object4).zzd(n7, false);
                n7 = 33;
                ((zzcn)object4).zzd(n7, false);
                n7 = 26;
                ((zzcn)object4).zzd(n7, false);
                n7 = 34;
                ((zzcn)object4).zzd(n7, false);
                this.zzc = object4 = ((zzcn)object4).zze();
                super();
                ((zzcn)object10).zzb((zzcp)object4);
                n4 = 4;
                ((zzcn)object10).zza(n4);
                int n8 = 10;
                ((zzcn)object10).zza(n8);
                this.zzH = object10 = ((zzcn)object10).zze();
                n7 = 0;
                object10 = null;
                this.zzj = object6 = object12.zzb((Looper)zzmr2, null);
                this.zzaf = object6 = new zzjs(this);
                this.zzac = object10 = zzmg.zzg((zzzn)object7);
                object9.zzR(zzct2, (Looper)zzmr2);
                int n10 = zzgd.zza;
                n7 = 31;
                if (n10 < n7) {
                    object10 = zzjq2.zzr;
                    object8 = new zzpj((String)object10);
                } else {
                    n10 = (int)(zzjq2.zzp ? 1 : 0);
                    object10 = zzjq2.zzr;
                    object8 = zzkn.zza((Context)string2, this, n10 != 0, (String)object10);
                }
                CopyOnWriteArraySet<zzmq[]> copyOnWriteArraySet2 = object8;
                object10 = ((zzjq)object).zzf;
                object10 = object10.zza();
                object2 = object10;
                object2 = (zzlk)object10;
                object10 = zzkw2.zzG;
                object4 = ((zzjq)object).zzs;
                CopyOnWriteArraySet<zzmq[]> copyOnWriteArraySet3 = copyOnWriteArraySet;
                long l3 = ((zzjq)object).zzn;
                Object object16 = object6;
                object = object13;
                object6 = object8;
                zzmq[] zzmqArray = object14;
                objectArray = object3;
                object3 = object5;
                Object object17 = object5;
                object5 = object7;
                object13 = object10;
                object14 = object4;
                zzkw2.zzk = object8 = new zzlh((zzmn[])objectArray, (zzzm)object3, (zzzn)object7, (zzlk)object2, (zzzu)object11, 0, false, (zzmx)object9, (zzmr)object10, (zzja)object4, l3, false, (Looper)zzmr2, (zzer)object12, (zzjs)object16, (zzpj)((Object)copyOnWriteArraySet2), null);
                n10 = 1065353216;
                zzkw2.zzU = f5 = 1.0f;
                zzkw2.zzI = object8 = zzca.zza;
                zzkw2.zzJ = object8;
                zzkw2.zzab = object8;
                n10 = -1;
                f5 = 0.0f / 0.0f;
                {
                    zzkw2.zzad = n10;
                    object12 = "audio";
                    object4 = string2;
                    object12 = string2.getSystemService((String)object12);
                    object12 = (AudioManager)object12;
                    if (object12 != null) {
                        n10 = object12.generateAudioSessionId();
                    }
                    zzkw2.zzS = n10;
                    zzkw2.zzW = object8 = zzek.zza;
                    n10 = 1;
                    f5 = Float.MIN_VALUE;
                    zzkw2.zzX = n10;
                    if (object9 == null) break block9;
                    ((zzfh)object).zzb(object9);
                    object = new Handler((Looper)zzmr2);
                    object11.zze((Handler)object, (zzzt)object9);
                    object8 = copyOnWriteArraySet3;
                    object = zzmqArray;
                    copyOnWriteArraySet3.add(zzmqArray);
                    object12 = zzjq2;
                    object11 = zzjq2.zza;
                    object4 = zzmnArray;
                    zzkw2.zzx = object8 = new zzir((Context)object11, (Handler)zzmnArray, (zziq)zzmqArray);
                    object11 = zzjq2.zza;
                    zzkw2.zzy = object8 = new zziv((Context)object11, (Handler)zzmnArray, (zziu)zzmqArray);
                    int n14 = 0;
                    object = null;
                    zzgd.zzG(null, null);
                    object8 = zzjq2.zza;
                    super((Context)object8);
                    zzkw2.zzz = object;
                    object8 = zzjq2.zza;
                    super((Context)object8);
                    zzkw2.zzA = object;
                    n10 = 0;
                    f5 = 0.0f;
                    object8 = null;
                    super(0);
                    zzkw2.zzZ = object = ((zzy)object).zza();
                    zzkw2.zzaa = object = zzdv.zza;
                    zzkw2.zzP = object = zzfv.zza;
                    object = zzkw2.zzT;
                    object5 = object17;
                    ((zzzm)object17).zzk((zzk)object);
                    n14 = zzkw2.zzS;
                    object = n14;
                    n10 = 10;
                    f5 = 1.4E-44f;
                    int n15 = 1;
                    zzkw2.zzag(n15, n10, object);
                    n14 = zzkw2.zzS;
                    object = n14;
                    int n16 = 2;
                    zzkw2.zzag(n16, n10, object);
                    object = zzkw2.zzT;
                    n10 = 3;
                    f5 = 4.2E-45f;
                    zzkw2.zzag(n15, n10, object);
                    n14 = zzkw2.zzO;
                    object = n14;
                    n10 = 4;
                    f5 = 5.6E-45f;
                    zzkw2.zzag(n16, n10, object);
                    n14 = 0;
                    object = null;
                    object = 0;
                    n10 = 5;
                    f5 = 7.0E-45f;
                    zzkw2.zzag(n16, n10, object);
                    n14 = (int)(zzkw2.zzV ? 1 : 0);
                    object = n14 != 0;
                    n10 = 9;
                    f5 = 1.3E-44f;
                    n15 = 1;
                    zzkw2.zzag(n15, n10, object);
                    n14 = 7;
                    object8 = object15;
                    zzkw2.zzag(n16, n14, object15);
                    n14 = 6;
                    n15 = 8;
                    zzkw2.zzag(n14, n15, object15);
                    zzzgArray.zze();
                }
                return;
            }
            boolean bl4 = false;
            object = null;
            {
                throw null;
            }
        }
        zzkw2.zze.zze();
        throw throwable2;
    }

    public static /* bridge */ /* synthetic */ int zzC(boolean bl2, int n3) {
        return zzkw.zzX(bl2, n3);
    }

    public static /* bridge */ /* synthetic */ zzfh zzD(zzkw zzkw2) {
        return zzkw2.zzl;
    }

    public static /* bridge */ /* synthetic */ zzmx zzF(zzkw zzkw2) {
        return zzkw2.zzr;
    }

    public static /* bridge */ /* synthetic */ Object zzG(zzkw zzkw2) {
        return zzkw2.zzM;
    }

    public static /* bridge */ /* synthetic */ void zzH(zzkw zzkw2, zzix zzix2) {
        zzkw2.zzR = zzix2;
    }

    public static /* bridge */ /* synthetic */ void zzI(zzkw zzkw2, zzan zzan2) {
        zzkw2.zzL = zzan2;
    }

    public static /* bridge */ /* synthetic */ void zzJ(zzkw zzkw2, boolean bl2) {
        zzkw2.zzV = bl2;
    }

    public static /* bridge */ /* synthetic */ void zzK(zzkw zzkw2, zzix zzix2) {
        zzkw2.zzQ = zzix2;
    }

    public static /* bridge */ /* synthetic */ void zzL(zzkw zzkw2, zzan zzan2) {
        zzkw2.zzK = zzan2;
    }

    public static /* bridge */ /* synthetic */ void zzM(zzkw zzkw2, zzdv zzdv2) {
        zzkw2.zzaa = zzdv2;
    }

    public static /* bridge */ /* synthetic */ void zzN(zzkw zzkw2, int n3, int n4) {
        zzkw2.zzaf(n3, n4);
    }

    public static /* bridge */ /* synthetic */ void zzO(zzkw zzkw2) {
        zzkw2.zzah();
    }

    public static /* bridge */ /* synthetic */ void zzP(zzkw zzkw2, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzkw2.zzai(surface);
        zzkw2.zzN = surface;
    }

    public static /* bridge */ /* synthetic */ void zzQ(zzkw zzkw2, Object object) {
        zzkw2.zzai(null);
    }

    public static /* bridge */ /* synthetic */ void zzR(zzkw zzkw2, boolean bl2, int n3, int n4) {
        zzkw2.zzak(bl2, n3, n4);
    }

    public static /* bridge */ /* synthetic */ boolean zzV(zzkw zzkw2) {
        return zzkw2.zzV;
    }

    private final int zzW(zzmg object) {
        zzdc zzdc2 = ((zzmg)object).zza;
        boolean bl2 = zzdc2.zzo();
        if (bl2) {
            return this.zzad;
        }
        zzdc2 = ((zzmg)object).zza;
        object = ((zzmg)object).zzb.zza;
        zzcz zzcz2 = this.zzn;
        return zzdc2.zzn((Object)object, (zzcz)zzcz2).zzd;
    }

    private static int zzX(boolean bl2, int n3) {
        int n4 = 1;
        if (bl2 && n3 != n4) {
            return 2;
        }
        return n4;
    }

    private final long zzY(zzmg object) {
        Object object2 = ((zzmg)object).zzb;
        boolean bl2 = ((zzvo)object2).zzb();
        if (bl2) {
            object2 = ((zzmg)object).zza;
            Object object3 = ((zzmg)object).zzb.zza;
            zzcz zzcz2 = this.zzn;
            ((zzdc)object2).zzn(object3, zzcz2);
            long l2 = ((zzmg)object).zzc;
            long l3 = -9223372036854775807L;
            long l4 = 0L;
            long l7 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l7 == false) {
                object2 = ((zzmg)object).zza;
                int n3 = this.zzW((zzmg)object);
                object3 = this.zza;
                object = ((zzdc)object2).zze(n3, (zzdb)object3, l4);
                l2 = ((zzdb)object).zzn;
                l2 = zzgd.zzu(l4);
            } else {
                l2 = zzgd.zzu(l2);
                l3 = zzgd.zzu(l4);
                l2 += l3;
            }
            return l2;
        }
        return zzgd.zzu(this.zzZ((zzmg)object));
    }

    private final long zzZ(zzmg object) {
        zzdc zzdc2 = ((zzmg)object).zza;
        boolean bl2 = zzdc2.zzo();
        if (bl2) {
            return zzgd.zzr(this.zzae);
        }
        long l2 = ((zzmg)object).zzr;
        Object object2 = ((zzmg)object).zzb;
        boolean bl3 = ((zzvo)object2).zzb();
        if (bl3) {
            return l2;
        }
        object2 = ((zzmg)object).zza;
        object = ((zzmg)object).zzb;
        this.zzab((zzdc)object2, (zzvo)object, l2);
        return l2;
    }

    private static long zzaa(zzmg object) {
        zzdb zzdb2 = new zzdb();
        zzcz zzcz2 = new zzcz();
        zzdc zzdc2 = ((zzmg)object).zza;
        Object object2 = ((zzmg)object).zzb.zza;
        zzdc2.zzn(object2, zzcz2);
        long l2 = ((zzmg)object).zzc;
        long l3 = -9223372036854775807L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            object = ((zzmg)object).zza;
            int n3 = zzcz2.zzd;
            l2 = 0L;
            object = ((zzdc)object).zze(n3, zzdb2, l2);
            long cfr_ignored_0 = ((zzdb)object).zzn;
        }
        return l2;
    }

    private final long zzab(zzdc zzdc2, zzvo object, long l2) {
        object = ((zzvo)object).zza;
        zzcz zzcz2 = this.zzn;
        zzdc2.zzn(object, zzcz2);
        return l2;
    }

    private final Pair zzac(zzdc zzdc2, int n3, long l2) {
        int n4 = zzdc2.zzo();
        long l3 = 0L;
        if (n4 != 0) {
            this.zzad = n3;
            long l4 = -9223372036854775807L;
            long l7 = l2 - l4;
            n4 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
            if (n4 == 0) {
                l2 = l3;
            }
            this.zzae = l2;
            return null;
        }
        n4 = -1;
        if (n3 == n4 || n3 >= (n4 = zzdc2.zzc())) {
            n3 = zzdc2.zzg(false);
            zzdb zzdb2 = this.zza;
            zzdb2 = zzdc2.zze(n3, zzdb2, l3);
            l2 = zzdb2.zzn;
            l2 = zzgd.zzu(l3);
        }
        zzdb zzdb3 = this.zza;
        zzcz zzcz2 = this.zzn;
        long l8 = zzgd.zzr(l2);
        return zzdc2.zzl(zzdb3, zzcz2, n3, l8);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final zzmg zzad(zzmg zzmg2, zzdc zzdc2, Pair pair) {
        long l2;
        Object object;
        int n3;
        zzmg zzmg3;
        long l3;
        Object object2;
        Object object3;
        zzkw zzkw2;
        block14: {
            block12: {
                block13: {
                    int n4;
                    zzvo zzvo2;
                    Object object4;
                    Object object5;
                    int n7;
                    Object object6;
                    boolean bl2;
                    int n8;
                    block11: {
                        zzvo zzvo3;
                        zzkw2 = this;
                        object3 = zzdc2;
                        object2 = pair;
                        n8 = zzdc2.zzo();
                        bl2 = false;
                        object6 = null;
                        n7 = 1;
                        if (n8 != 0 || pair != null) {
                            n8 = 1;
                        } else {
                            n8 = 0;
                            object5 = null;
                        }
                        zzeq.zzd(n8 != 0);
                        object5 = zzmg2;
                        object4 = zzmg2.zza;
                        l3 = this.zzY(zzmg2);
                        zzmg3 = zzmg2.zzf(zzdc2);
                        n8 = zzdc2.zzo();
                        if (n8 != 0) {
                            long l4;
                            object3 = zzmg.zzh();
                            long l7 = zzgd.zzr(zzkw2.zzae);
                            object2 = zzkw2.zzb;
                            zzxr zzxr2 = zzxr.zza;
                            zzgbc zzgbc2 = zzgbc.zzm();
                            Object object7 = object3;
                            long l8 = l7;
                            long l12 = l7;
                            Object object8 = object2;
                            object3 = zzmg3.zzb((zzvo)object3, l7, l7, l7, 0L, zzxr2, (zzzn)object2, zzgbc2).zza((zzvo)object3);
                            ((zzmg)object3).zzp = l4 = ((zzmg)object3).zzr;
                            return object3;
                        }
                        object5 = zzmg3.zzb.zza;
                        n3 = zzgd.zza;
                        object = ((Pair)object2).first;
                        n3 = object5.equals(object) ^ n7;
                        if (n3 != 0) {
                            Object object9 = ((Pair)object2).first;
                            l2 = -1;
                            zzvo3 = new zzvo(object9, l2);
                        } else {
                            zzvo3 = zzmg3.zzb;
                        }
                        zzvo2 = zzvo3;
                        object2 = (Long)((Pair)object2).second;
                        l2 = (Long)object2;
                        l3 = zzgd.zzr(l3);
                        n4 = ((zzdc)object4).zzo();
                        if (n4 == 0) {
                            object2 = zzkw2.zzn;
                            ((zzdc)object4).zzn(object5, (zzcz)object2);
                        }
                        if (n3 == 0 && (n4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1)) >= 0) break block11;
                        l3 = l2;
                        object3 = zzvo2;
                        n4 = zzvo2.zzb() ^ n7;
                        zzeq.zzf(n4 != 0);
                        if (n3 == 0) break block12;
                        break block13;
                    }
                    if (n4 == 0) {
                        long l14;
                        object2 = zzmg3.zzk.zza;
                        n4 = ((zzdc)object3).zza(object2);
                        if (n4 != (n8 = -1)) {
                            object5 = zzkw2.zzn;
                            object2 = ((zzdc)object3).zzd(n4, (zzcz)object5, false);
                            n4 = ((zzcz)object2).zzd;
                            object5 = zzvo2.zza;
                            object6 = zzkw2.zzn;
                            object5 = ((zzdc)object3).zzn(object5, (zzcz)object6);
                            n8 = ((zzcz)object5).zzd;
                            if (n4 == n8) return zzmg3;
                        }
                        object2 = zzvo2.zza;
                        object5 = zzkw2.zzn;
                        ((zzdc)object3).zzn(object2, (zzcz)object5);
                        boolean bl3 = zzvo2.zzb();
                        if (bl3) {
                            object3 = zzkw2.zzn;
                            n4 = zzvo2.zzb;
                            n8 = zzvo2.zzc;
                            l14 = ((zzcz)object3).zzh(n4, n8);
                        } else {
                            object3 = zzkw2.zzn;
                            l14 = ((zzcz)object3).zze;
                        }
                        long l15 = zzmg3.zzr;
                        l2 = zzmg3.zzr;
                        long l16 = zzmg3.zzd;
                        long l17 = zzmg3.zzr;
                        long l18 = l14 - l17;
                        zzxr zzxr3 = zzmg3.zzh;
                        object4 = zzmg3.zzi;
                        List list = zzmg3.zzj;
                        object = zzvo2;
                        long l19 = l16;
                        zzxr zzxr4 = zzxr3;
                        Object object10 = object4;
                        List list2 = list;
                        object5 = zzmg3.zzb(zzvo2, l15, l2, l16, l18, zzxr3, (zzzn)object4, list);
                        zzmg3 = ((zzmg)object5).zza(zzvo2);
                        zzmg3.zzp = l14;
                        return zzmg3;
                    }
                    object3 = zzvo2;
                    n4 = zzvo2.zzb() ^ n7;
                    zzeq.zzf(n4 != 0);
                    long l20 = zzmg3.zzq;
                    long l21 = l2 - l3;
                    l20 -= l21;
                    l21 = 0L;
                    long l22 = Math.max(l21, l20);
                    l20 = zzmg3.zzp;
                    object6 = zzmg3.zzk;
                    Object object11 = zzmg3.zzb;
                    bl2 = ((zzvo)object6).equals(object11);
                    if (bl2) {
                        l20 = l2 + l22;
                    }
                    object6 = zzmg3.zzh;
                    object11 = zzmg3.zzi;
                    object4 = zzmg3.zzj;
                    object = object3;
                    long l23 = l2;
                    l3 = l2;
                    long l24 = l2;
                    Object object12 = object6;
                    Object object13 = object11;
                    Object object14 = object4;
                    zzmg3 = zzmg3.zzb((zzvo)object3, l2, l2, l2, l22, (zzxr)object6, (zzzn)object11, (List)object4);
                    zzmg3.zzp = l20;
                    return zzmg3;
                }
                object2 = zzxr.zza;
                break block14;
            }
            object2 = zzmg3.zzh;
        }
        Object object15 = object2;
        object2 = n3 != 0 ? zzkw2.zzb : zzmg3.zzi;
        Object object16 = object2;
        object2 = n3 != 0 ? zzgbc.zzm() : zzmg3.zzj;
        Object object17 = object2;
        long l25 = 0L;
        object = object3;
        long l26 = l3;
        l2 = l3;
        long l27 = l3;
        object2 = zzmg3.zzb((zzvo)object3, l3, l3, l3, l25, (zzxr)object15, (zzzn)object16, (List)object2);
        zzmg3 = ((zzmg)object2).zza((zzvo)object3);
        zzmg3.zzp = l3;
        return zzmg3;
    }

    private final zzmj zzae(zzmi zzmi2) {
        zzmj zzmj2;
        int n3;
        zzmg zzmg2 = this.zzac;
        int n4 = this.zzW(zzmg2);
        Object object = this.zzac;
        zzdc zzdc2 = ((zzmg)object).zza;
        int n7 = -1;
        if (n4 == n7) {
            n4 = 0;
            zzmg2 = null;
            n3 = 0;
        } else {
            n3 = n4;
        }
        zzer zzer2 = this.zzu;
        zzlh zzlh2 = this.zzk;
        Looper looper = zzlh2.zzb();
        object = zzmj2;
        zzmj2 = new zzmj(zzlh2, zzmi2, zzdc2, n3, zzer2, looper);
        return zzmj2;
    }

    private final void zzaf(int n3, int n4) {
        Object object = this.zzP;
        int n7 = ((zzfv)object).zzb();
        if (n3 == n7 && n4 == (n7 = ((zzfv)(object = this.zzP)).zza())) {
            return;
        }
        object = new zzfv(n3, n4);
        this.zzP = object;
        object = this.zzl;
        zzkj zzkj2 = new zzkj(n3, n4);
        ((zzfh)object).zzd(24, zzkj2);
        ((zzfh)object).zzc();
        object = new zzfv(n3, n4);
        this.zzag(2, 14, object);
    }

    private final void zzag(int n3, int n4, Object object) {
        int n7;
        zzmn[] zzmnArray = this.zzh;
        int n8 = zzmnArray.length;
        for (n8 = 0; n8 < (n7 = 2); ++n8) {
            Object object2 = zzmnArray[n8];
            int n10 = object2.zzb();
            if (n10 != n3) continue;
            object2 = this.zzae((zzmi)object2);
            ((zzmj)object2).zzf(n4);
            ((zzmj)object2).zze(object);
            ((zzmj)object2).zzd();
        }
    }

    private final void zzah() {
        Object object = this.zzy;
        float f5 = this.zzU;
        float f6 = ((zziv)object).zza();
        object = Float.valueOf(f5 * f6);
        this.zzag(1, 2, object);
    }

    private final void zzai(Object object) {
        int n3;
        Object object2 = new ArrayList();
        Object object3 = this.zzh;
        int n4 = ((zzmn[])object3).length;
        n4 = 0;
        int n7 = 0;
        while (true) {
            int n8 = 2;
            int n10 = 1;
            if (n7 >= n8) break;
            zzmn zzmn2 = object3[n7];
            int n14 = zzmn2.zzb();
            if (n14 == n8) {
                zzmj zzmj2 = this.zzae(zzmn2);
                zzmj2.zzf(n10);
                zzmj2.zze(object);
                zzmj2.zzd();
                ((ArrayList)object2).add(zzmj2);
            }
            ++n7;
        }
        object3 = this.zzM;
        if (object3 != null && object3 != object) {
            block14: {
                try {
                    object2 = ((ArrayList)object2).iterator();
                }
                catch (TimeoutException timeoutException) {
                    n4 = 1;
                    break block14;
                }
                catch (InterruptedException interruptedException) {
                    object2 = Thread.currentThread();
                    ((Thread)object2).interrupt();
                }
                while (true) {
                    boolean bl2 = object2.hasNext();
                    if (!bl2) break;
                    object3 = object2.next();
                    object3 = (zzmj)object3;
                    long l2 = this.zzB;
                    ((zzmj)object3).zzi(l2);
                    continue;
                    break;
                }
            }
            if ((object2 = this.zzM) == (object3 = this.zzN)) {
                object3.release();
                n3 = 0;
                object2 = null;
                this.zzN = null;
            }
        }
        this.zzM = object;
        if (n4 != 0) {
            object = new zzli(3);
            n3 = 1003;
            object = zzjh.zzd((RuntimeException)object, n3);
            this.zzaj((zzjh)object);
        }
    }

    private final void zzaj(zzjh zzjh2) {
        int n3;
        long l2;
        zzmg zzmg2 = this.zzac;
        zzvo zzvo2 = zzmg2.zzb;
        zzmg2 = zzmg2.zza(zzvo2);
        zzmg2.zzp = l2 = zzmg2.zzr;
        zzmg2.zzq = l2 = 0L;
        int n4 = 1;
        zzmg2 = zzmg2.zze(n4);
        if (zzjh2 != null) {
            zzmg2 = zzmg2.zzd(zzjh2);
        }
        this.zzC = n3 = this.zzC + n4;
        this.zzk.zzo();
        this.zzal(zzmg2, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    private final void zzak(boolean bl2, int n3, int n4) {
        int n7;
        int n8 = 0;
        int n10 = 1;
        n7 = bl2 && n3 != (n7 = -1) ? 1 : 0;
        if (n7 != 0 && n3 != n10) {
            n8 = 1;
        }
        Object object = this.zzac;
        int n14 = ((zzmg)object).zzl;
        if (n14 == n7 && (n14 = ((zzmg)object).zzm) == n8) {
            return;
        }
        this.zzC = n14 = this.zzC + n10;
        zzmg zzmg2 = ((zzmg)object).zzc(n7 != 0, n8);
        this.zzk.zzn(n7 != 0, n8);
        object = this;
        n7 = n4;
        this.zzal(zzmg2, 0, n4, false, 5, -9223372036854775807L, -1, false);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void zzal(zzmg var1_1, int var2_2, int var3_3, boolean var4_4, int var5_5, long var6_6, int var8_7, boolean var9_8) {
        block74: {
            block89: {
                block86: {
                    block73: {
                        block87: {
                            block88: {
                                block72: {
                                    block85: {
                                        block82: {
                                            block83: {
                                                block84: {
                                                    block75: {
                                                        block81: {
                                                            block78: {
                                                                block80: {
                                                                    block79: {
                                                                        block76: {
                                                                            block77: {
                                                                                var10_9 = this;
                                                                                var11_10 = var1_1;
                                                                                var12_11 = var5_5;
                                                                                var13_12 = this.zzac;
                                                                                this.zzac = var1_1;
                                                                                var14_13 = var13_12.zza;
                                                                                var15_14 = var1_1.zza;
                                                                                var16_15 = var14_13.equals(var15_14);
                                                                                var17_16 = 1;
                                                                                var16_15 ^= var17_16;
                                                                                var18_17 = var13_12.zza;
                                                                                var19_18 = var1_1.zza;
                                                                                var20_19 = var19_18.zzo();
                                                                                var21_20 = 3 != 0;
                                                                                var22_21 = -1 != 0;
                                                                                var23_22 = (int)var22_21;
                                                                                var24_23 = 0L;
                                                                                var26_24 = false;
                                                                                var27_25 = null;
                                                                                if (var20_19 != 0 && (var20_19 = var18_17.zzo()) != 0) {
                                                                                    var19_18 = Boolean.FALSE;
                                                                                    var18_17 = new Pair(var19_18, var23_22);
lbl23:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        var19_18 = var18_17;
                                                                                        var28_28 = var4_4;
                                                                                        break block72;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                var20_19 = var19_18.zzo();
                                                                                if (var20_19 != (var29_26 = var18_17.zzo())) {
                                                                                    var19_18 = Boolean.TRUE;
                                                                                    var30_27 = (int)var21_20;
                                                                                    var18_17 = new Pair(var19_18, var30_27);
                                                                                    ** continue;
                                                                                }
                                                                                var30_27 = var13_12.zzb.zza;
                                                                                var31_29 = var10_9.zzn;
                                                                                var20_19 = var18_17.zzn((Object)var30_27, (zzcz)var31_29).zzd;
                                                                                var31_29 = var10_9.zza;
                                                                                var18_17 = var18_17.zze((int)var20_19, (zzdb)var31_29, (long)var24_23).zzc;
                                                                                var30_27 = var11_10.zzb.zza;
                                                                                var31_29 = var10_9.zzn;
                                                                                var30_27 = var19_18.zzn(var30_27, (zzcz)var31_29);
                                                                                var20_19 = var30_27.zzd;
                                                                                var31_29 = var10_9.zza;
                                                                                var19_18 = var19_18.zze((int)var20_19, (zzdb)var31_29, (long)var24_23).zzc;
                                                                                var28_28 = var18_17.equals(var19_18);
                                                                                if (var28_28 != 0) break block75;
                                                                                if (var4_4 == 0) break block76;
                                                                                if (var12_11 != 0) break block77;
                                                                                var12_11 = 0;
                                                                                var32_30 = null;
                                                                                var28_28 = 1;
                                                                                var33_31 = 1;
                                                                                break block78;
                                                                            }
                                                                            var28_28 = 1;
                                                                            var33_31 = 1;
                                                                            break block79;
                                                                        }
                                                                        var28_28 = 0;
                                                                        var18_17 = null;
                                                                        var33_31 = 0;
                                                                        var19_18 = null;
                                                                    }
                                                                    if (var28_28 == 0 || var12_11 != var17_16) break block80;
                                                                    var28_28 = var33_31;
                                                                    var33_31 = 2;
                                                                    break block78;
                                                                }
                                                                if (var16_15 == 0) break block81;
                                                                var33_31 = 3;
                                                            }
                                                            var31_29 = Boolean.TRUE;
                                                            var19_18 = var33_31;
                                                            var19_18 = var30_27 = new Pair(var31_29, var19_18);
                                                            break block72;
                                                        }
                                                        var11_10 = new IllegalStateException();
                                                        throw var11_10;
                                                    }
                                                    if (var4_4 == 0) break block82;
                                                    if (var12_11 != 0) break block83;
                                                    var34_32 = var13_12.zzb.zzd;
                                                    var32_30 = var11_10.zzb;
                                                    var36_33 = var32_30.zzd;
                                                    cfr_temp_0 = var34_32 - var36_33;
                                                    var12_11 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                    if (var12_11 >= 0) break block84;
                                                    var32_30 = Boolean.TRUE;
                                                    var19_18 = 0;
                                                    var19_18 = var18_17 = new Pair(var32_30, var19_18);
                                                    var12_11 = 0;
                                                    var32_30 = null;
                                                    var28_28 = 1;
                                                    break block72;
                                                }
                                                var12_11 = 1;
                                                var28_28 = 0;
                                                var18_17 = null;
                                                break block85;
                                            }
                                            var28_28 = var12_11;
                                            var12_11 = 1;
                                            break block85;
                                        }
                                        var28_28 = var12_11;
                                        var12_11 = 0;
                                        var32_30 = null;
                                    }
                                    var30_27 = Boolean.FALSE;
                                    var19_18 = new Pair(var30_27, var23_22);
                                    var38_34 = var28_28;
                                    var28_28 = var12_11;
                                    var12_11 = var38_34;
                                }
                                var30_27 = (Boolean)var19_18.first;
                                var20_19 = (int)var30_27.booleanValue();
                                var19_18 = (Integer)var19_18.second;
                                var33_31 = var19_18.intValue();
                                if (var20_19 != 0) {
                                    var23_22 = var11_10.zza;
                                    var39_35 = var23_22.zzo();
                                    if (!var39_35) {
                                        var23_22 = var11_10.zza;
                                        var31_29 = var11_10.zzb.zza;
                                        var40_36 = var10_9.zzn;
                                        var29_26 = var23_22.zzn((Object)var31_29, (zzcz)var40_36).zzd;
                                        var40_36 = var11_10.zza;
                                        var23_22 = var10_9.zza;
                                        var31_29 = var40_36.zze((int)var29_26, (zzdb)var23_22, (long)var24_23).zze;
                                    } else {
                                        var29_26 = 0;
                                        var31_29 = null;
                                    }
                                    var10_9.zzab = var40_36 = zzca.zza;
                                } else {
                                    var29_26 = 0;
                                    var31_29 = null;
                                }
                                if (var20_19 != 0 || !(var21_20 = (boolean)(var40_36 = var13_12.zzj).equals(var23_22 = var11_10.zzj))) {
                                    var40_36 = var10_9.zzab.zza();
                                    var23_22 = var11_10.zzj;
                                    var41_37 = null;
                                    for (var22_21 = false; var22_21 < (var26_24 = var23_22.size()); var22_21 += var17_16) {
                                        var27_25 = (zzcd)var23_22.get((int)var22_21);
                                        var43_39 = null;
                                        for (var42_38 = false; var42_38 < (var44_40 = var27_25.zza()); var42_38 += var17_16) {
                                            var45_41 = var27_25.zzb((int)var42_38);
                                            var45_41.zza((zzby)var40_36);
                                        }
                                        var24_23 = 0L;
                                    }
                                    var10_9.zzab = var40_36 = var40_36.zzu();
                                }
                                if (var22_21 = (boolean)(var40_36 = this.zzn()).zzo()) {
                                    var40_36 = var10_9.zzab;
                                } else {
                                    var22_21 = this.zzd();
                                    var23_22 = var10_9.zza;
                                    var24_23 = 0L;
                                    var40_36 = var40_36.zze((int)var22_21, (zzdb)var23_22, (long)var24_23).zze;
                                    var41_37 = var10_9.zzab.zza();
                                    var40_36 = var40_36.zzg;
                                    var41_37.zzb((zzca)var40_36);
                                    var40_36 = var41_37.zzu();
                                }
                                var41_37 = var10_9.zzI;
                                var22_21 = var40_36.equals(var41_37) ^ var17_16;
                                var10_9.zzI = var40_36;
                                var21_20 = var13_12.zzl;
                                var39_35 = var11_10.zzl;
                                if (var21_20 != var39_35) {
                                    var21_20 = true;
                                } else {
                                    var21_20 = false;
                                    var40_36 = null;
                                }
                                var39_35 = var13_12.zze;
                                var42_38 = var11_10.zze;
                                if (var39_35 != var42_38) {
                                    var39_35 = true;
                                } else {
                                    var39_35 = false;
                                    var23_22 = null;
                                }
                                if (var39_35 || var21_20) {
                                    this.zzam();
                                }
                                if ((var42_38 = (boolean)var13_12.zzg) != (var44_40 = (boolean)var11_10.zzg)) {
                                    var42_38 = true;
                                } else {
                                    var42_38 = false;
                                    var43_39 = null;
                                }
                                if (var16_15 != 0) {
                                    var14_13 = var10_9.zzl;
                                    var26_24 = var2_2;
                                    var45_41 = new zzju((zzmg)var11_10, (int)var2_2);
                                    var26_24 = false;
                                    var27_25 = null;
                                    var14_13.zzd(0, (zzfe)var45_41);
                                }
                                if (var28_28 == 0) break block86;
                                var18_17 = new zzcz();
                                var45_41 = var13_12.zza;
                                var44_40 = var45_41.zzo();
                                if (!var44_40) {
                                    var45_41 = var13_12.zzb.zza;
                                    var27_25 = var13_12.zza;
                                    var27_25.zzn(var45_41, (zzcz)var18_17);
                                    var26_24 = var18_17.zzd;
                                    var17_16 = var13_12.zza.zza(var45_41);
                                    var14_13 = var13_12.zza;
                                    var5_5 = var17_16;
                                    var15_14 = var10_9.zza;
                                    var46_42 = var39_35;
                                    var47_43 = var42_38;
                                    var48_44 = 0L;
                                    var14_13 = var14_13.zze((int)var26_24, (zzdb)var15_14, (long)var48_44).zzc;
                                    var15_14 = var10_9.zza.zze;
                                    var50_45 = var17_16;
                                    var51_46 = var14_13;
                                    var52_47 = var15_14;
                                    var53_48 = var45_41;
                                    var54_49 = var26_24;
                                } else {
                                    var46_42 = var39_35;
                                    var47_43 = var42_38;
                                    var54_49 = var8_7;
                                    var51_46 = null;
                                    var52_47 = null;
                                    var53_48 = null;
                                    var50_45 = -1;
                                }
                                if (var12_11 != 0) break block87;
                                var14_13 = var13_12.zzb;
                                var16_15 = var14_13.zzb();
                                if (var16_15 == 0) break block88;
                                var14_13 = var13_12.zzb;
                                var17_16 = var14_13.zzb;
                                var16_15 = var14_13.zzc;
                                var55_50 = var18_17.zzh(var17_16, var16_15);
                                var48_44 = zzkw.zzaa((zzmg)var13_12);
                                break block73;
                            }
                            var14_13 = var13_12.zzb;
                            var16_15 = var14_13.zze;
                            var17_16 = -1;
                            if (var16_15 != var17_16) {
                                var14_13 = var10_9.zzac;
                                var55_50 = zzkw.zzaa((zzmg)var14_13);
lbl242:
                                // 3 sources

                                while (true) {
                                    var48_44 = var55_50;
                                    break block73;
                                    break;
                                }
                            }
                            var55_50 = var18_17.zze;
                            ** GOTO lbl242
                        }
                        var14_13 = var13_12.zzb;
                        var16_15 = var14_13.zzb();
                        if (var16_15 != 0) {
                            var55_50 = var13_12.zzr;
                            var48_44 = zzkw.zzaa((zzmg)var13_12);
                        } else {
                            var55_50 = var13_12.zzr;
                            ** continue;
                        }
                    }
                    var44_40 = zzgd.zza;
                    var45_41 = var13_12.zzb;
                    var26_24 = var45_41.zzb;
                    var44_40 = var45_41.zzc;
                    var57_51 = zzgd.zzu(var55_50);
                    var59_52 = zzgd.zzu(var48_44);
                    var18_17 = new zzcs(var51_46, var54_49, (zzbu)var52_47, var53_48, var50_45, var57_51, var59_52, (int)var26_24, (int)var44_40);
                    var16_15 = this.zzd();
                    var15_14 = var10_9.zzac.zza;
                    var17_16 = (int)var15_14.zzo();
                    if (var17_16 == 0) {
                        var15_14 = var10_9.zzac;
                        var23_22 = var15_14.zzb.zza;
                        var15_14 = var15_14.zza;
                        var43_39 = var10_9.zzn;
                        var15_14.zzn(var23_22, (zzcz)var43_39);
                        var15_14 = var10_9.zzac.zza;
                        var17_16 = var15_14.zza(var23_22);
                        var43_39 = var10_9.zzac.zza;
                        var45_41 = var10_9.zza;
                        var26_24 = var21_20;
                        var5_5 = var22_21;
                        var61_53 = 0L;
                        var43_39 = var43_39.zze(var16_15, (zzdb)var45_41, var61_53);
                        var40_36 = var43_39.zzc;
                        var41_37 = var10_9.zza.zze;
                        var63_54 = var17_16;
                        var64_55 = var40_36;
                        var65_56 = var41_37;
                        var66_57 = var23_22;
                    } else {
                        var26_24 = var21_20;
                        var5_5 = var22_21;
                        var64_55 = null;
                        var65_56 = null;
                        var66_57 = null;
                        var63_54 = -1;
                    }
                    var67_58 = zzgd.zzu(var6_6);
                    var40_36 = var10_9.zzac.zzb;
                    var21_20 = var40_36.zzb();
                    if (var21_20) {
                        var40_36 = var10_9.zzac;
                        var69_59 = var61_53 = zzgd.zzu(zzkw.zzaa((zzmg)var40_36));
                    } else {
                        var69_59 = var67_58;
                    }
                    var40_36 = var10_9.zzac.zzb;
                    var22_21 = var40_36.zzb;
                    var21_20 = var40_36.zzc;
                    var15_14 = new zzcs(var64_55, var16_15, (zzbu)var65_56, var66_57, var63_54, var67_58, var69_59, (int)var22_21, (int)var21_20);
                    var14_13 = var10_9.zzl;
                    var40_36 = new zzjz(var12_11, (zzcs)var18_17, (zzcs)var15_14);
                    var12_11 = 11;
                    var14_13.zzd(var12_11, (zzfe)var40_36);
                    break block89;
                }
                var26_24 = var21_20;
                var5_5 = var22_21;
                var46_42 = var39_35;
                var47_43 = var42_38;
            }
            if (var20_19 != 0) {
                var32_30 = var10_9.zzl;
                var14_13 = new zzkb((zzbu)var31_29, var33_31);
                var17_16 = 1;
                var32_30.zzd(var17_16, (zzfe)var14_13);
            }
            var32_30 = var13_12.zzf;
            var14_13 = var11_10.zzf;
            var17_16 = 10;
            if (var32_30 != var14_13) {
                var32_30 = var10_9.zzl;
                var14_13 = new zzkc((zzmg)var11_10);
                var32_30.zzd(var17_16, (zzfe)var14_13);
                var32_30 = var11_10.zzf;
                if (var32_30 != null) {
                    var32_30 = var10_9.zzl;
                    var14_13 = new zzkd((zzmg)var11_10);
                    var32_30.zzd(var17_16, (zzfe)var14_13);
                }
            }
            if ((var32_30 = var13_12.zzi) != (var14_13 = var11_10.zzi)) {
                var32_30 = var10_9.zzi;
                var14_13 = var14_13.zze;
                var32_30.zzq(var14_13);
                var32_30 = var10_9.zzl;
                var14_13 = new zzke((zzmg)var11_10);
                var28_28 = 2;
                var32_30.zzd(var28_28, (zzfe)var14_13);
            }
            if (var5_5 != 0) {
                var32_30 = var10_9.zzI;
                var14_13 = var10_9.zzl;
                var18_17 = new zzkf((zzca)var32_30);
                var12_11 = 14;
                var14_13.zzd(var12_11, (zzfe)var18_17);
            }
            if (var47_43) {
                var32_30 = var10_9.zzl;
                var14_13 = new zzkg((zzmg)var11_10);
                var28_28 = 3;
                var32_30.zzd(var28_28, (zzfe)var14_13);
            }
            if (var46_42 || var26_24) {
                var32_30 = var10_9.zzl;
                var14_13 = new zzkh((zzmg)var11_10);
                var28_28 = -1;
                var32_30.zzd(var28_28, (zzfe)var14_13);
            }
            var12_11 = 4;
            if (var46_42) {
                var14_13 = var10_9.zzl;
                var18_17 = new zzki((zzmg)var11_10);
                var14_13.zzd(var12_11, (zzfe)var18_17);
            }
            var16_15 = 5;
            if (var26_24) {
                var18_17 = var10_9.zzl;
                var20_19 = var3_3;
                var19_18 = new zzjv((zzmg)var11_10, var3_3);
                var18_17.zzd(var16_15, (zzfe)var19_18);
            }
            var28_28 = var13_12.zzm;
            var33_31 = var11_10.zzm;
            var20_19 = 6;
            if (var28_28 != var33_31) {
                var18_17 = var10_9.zzl;
                var19_18 = new zzjw((zzmg)var11_10);
                var18_17.zzd(var20_19, (zzfe)var19_18);
            }
            var28_28 = (int)var13_12.zzi();
            var33_31 = (int)var1_1.zzi();
            var29_26 = 7;
            if (var28_28 != var33_31) {
                var18_17 = var10_9.zzl;
                var19_18 = new zzjx((zzmg)var11_10);
                var18_17.zzd(var29_26, (zzfe)var19_18);
            }
            var13_12 = var13_12.zzn;
            var18_17 = var11_10.zzn;
            var71_60 = var13_12.equals(var18_17);
            var28_28 = 12;
            if (var71_60 == 0) {
                var13_12 = var10_9.zzl;
                var19_18 = new zzjy((zzmg)var11_10);
                var13_12.zzd(var28_28, (zzfe)var19_18);
            }
            var11_10 = var10_9.zzH;
            var13_12 = var10_9.zzg;
            var19_18 = var10_9.zzc;
            var21_20 = zzgd.zza;
            var21_20 = var13_12.zzx();
            var41_37 = var13_12;
            var41_37 = (zzm)var13_12;
            var23_22 = var41_37.zzn();
            var42_38 = var23_22.zzo();
            if (var42_38) ** GOTO lbl-1000
            var42_38 = var41_37.zzd();
            var45_41 = var41_37.zza;
            var72_61 = 0L;
            var23_22 = var23_22.zze((int)var42_38, (zzdb)var45_41, var72_61);
            var17_16 = (int)var23_22.zzi;
            if (var17_16 != 0) {
                var26_24 = true;
            } else lbl-1000:
            // 2 sources

            {
                var26_24 = false;
                var27_25 = null;
            }
            var15_14 = var41_37.zzn();
            var28_28 = (int)var15_14.zzo();
            if (var28_28 != 0) {
                var28_28 = -1;
                var39_35 = false;
                var23_22 = null;
                while (true) {
                    var74_62 = false;
                    break;
                }
            } else {
                var28_28 = var41_37.zzd();
                var41_37.zzh();
                var41_37.zzw();
                var39_35 = false;
                var23_22 = null;
                if ((var17_16 = var15_14.zzk(var28_28, 0, false)) == (var28_28 = -1)) ** continue;
                var74_62 = true;
            }
            var15_14 = var41_37.zzn();
            var42_38 = var15_14.zzo();
            if (var42_38) {
                while (true) {
                    var17_16 = 0;
                    var15_14 = null;
                    break;
                }
            } else {
                var42_38 = var41_37.zzd();
                var41_37.zzh();
                var41_37.zzw();
                if ((var17_16 = var15_14.zzj((int)var42_38, 0, false)) == var28_28) ** continue;
                var17_16 = 1;
            }
            var18_17 = var41_37.zzn();
            var42_38 = var18_17.zzo();
            if (var42_38) ** GOTO lbl456
            var42_38 = var41_37.zzd();
            var28_28 = (int)(var18_17 = var18_17.zze((int)var42_38, (zzdb)(var45_41 = var41_37.zza), var36_33 = 0L)).zzb();
            if (var28_28 != 0) {
                var28_28 = 1;
            } else lbl-1000:
            // 2 sources

            {
                while (true) {
                    var28_28 = 0;
                    var18_17 = null;
                    break block74;
                    break;
                }
lbl456:
                // 1 sources

                var36_33 = 0L;
                ** continue;
            }
        }
        var43_39 = var41_37.zzn();
        var44_40 = var43_39.zzo();
        if (var44_40) ** GOTO lbl-1000
        var44_40 = var41_37.zzd();
        var41_37 = var41_37.zza;
        var30_27 = var43_39.zze((int)var44_40, (zzdb)var41_37, var36_33);
        var20_19 = (int)var30_27.zzj;
        if (var20_19 != 0) {
            var20_19 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var20_19 = 0;
            var30_27 = null;
        }
        var13_12 = var13_12.zzn();
        var71_60 = var13_12.zzo();
        var31_29 = new zzcn();
        var31_29.zzb((zzcp)var19_18);
        var33_31 = 1;
        var22_21 = var21_20 ^ 1;
        var31_29.zzd(var12_11, var22_21);
        if (var26_24 && !var21_20) {
            var12_11 = 1;
        } else {
            var12_11 = 0;
            var32_30 = null;
        }
        var31_29.zzd(var16_15, (boolean)var12_11);
        if (var74_62 && !var21_20) {
            var12_11 = 1;
lbl489:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var12_11 = 0;
        var32_30 = null;
        ** while (true)
        var16_15 = 6;
        var31_29.zzd(var16_15, (boolean)var12_11);
        if (var71_60 != 0 || !var74_62 && var28_28 != 0 && !var26_24) lbl-1000:
        // 2 sources

        {
            while (true) {
                var12_11 = 0;
                var32_30 = null;
lbl501:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
                break;
            }
        }
        ** while (var21_20)
lbl504:
        // 1 sources

        var12_11 = 1;
        ** while (true)
        var16_15 = 7;
        var31_29.zzd(var16_15, (boolean)var12_11);
        if (var17_16 != 0 && !var21_20) {
            var12_11 = 1;
        } else {
            var12_11 = 0;
            var32_30 = null;
        }
        var16_15 = 8;
        var31_29.zzd(var16_15, (boolean)var12_11);
        if (var71_60 != 0 || var17_16 == 0 && (var28_28 == 0 || var20_19 == 0)) {
            while (true) {
                var12_11 = 0;
                var32_30 = null;
                break;
            }
        } else {
            if (var21_20) ** continue;
            var12_11 = 1;
        }
        var71_60 = 9;
        var31_29.zzd(var71_60, (boolean)var12_11);
        var12_11 = 10;
        var31_29.zzd(var12_11, var22_21);
        if (var26_24 && !var21_20) {
            var12_11 = 1;
lbl532:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var12_11 = 0;
        var32_30 = null;
        ** while (true)
        var71_60 = 11;
        var31_29.zzd(var71_60, (boolean)var12_11);
        if (var26_24 && !var21_20) {
            var12_11 = 12;
            var17_16 = 1;
        } else {
            var12_11 = 12;
            var17_16 = 0;
            var15_14 = null;
        }
        var31_29.zzd(var12_11, (boolean)var17_16);
        var10_9.zzH = var32_30 = var31_29.zze();
        var75_63 = var32_30.equals(var11_10);
        if (!var75_63) {
            var11_10 = var10_9.zzl;
            var32_30 = new zzjt(var10_9);
            var71_60 = 13;
            var11_10.zzd(var71_60, (zzfe)var32_30);
        }
        var10_9.zzl.zzc();
    }

    private final void zzam() {
        int n3;
        int n4 = this.zzf();
        if (n4 != (n3 = 2) && n4 != (n3 = 3)) {
            return;
        }
        this.zzan();
        n4 = (int)(this.zzac.zzo ? 1 : 0);
        this.zzv();
        this.zzv();
    }

    private final void zzan() {
        this.zze.zzb();
        Object object = this.zzs;
        Object object2 = Thread.currentThread();
        object = object.getThread();
        if (object2 != object) {
            object = Thread.currentThread().getName();
            object2 = this.zzs.getThread().getName();
            Object object3 = Locale.US;
            object3 = "Player is accessed on the wrong thread.\nCurrent thread: '";
            String string2 = "'\nExpected thread: '";
            String string3 = "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            object = uc0_0.a((String)object3, (String)object, string2, (String)object2, string3);
            boolean bl2 = this.zzX;
            if (!bl2) {
                bl2 = this.zzY;
                if (bl2) {
                    bl2 = false;
                    object2 = null;
                } else {
                    object2 = new IllegalStateException();
                }
                zzfk.zzg("ExoPlayerImpl", (String)object, (Throwable)object2);
                this.zzY = true;
                return;
            }
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
    }

    public final void zzA(zzna zzna2) {
        this.zzan();
        this.zzr.zzQ(zzna2);
    }

    public final void zzB(zzvq zzvq2) {
        boolean bl2;
        int n3;
        Object object;
        Object object2;
        List<Object> list;
        int n32;
        this.zzan();
        Object object3 = Collections.singletonList(zzvq2);
        this.zzan();
        this.zzan();
        Object object4 = this.zzac;
        this.zzW((zzmg)object4);
        this.zzk();
        int n4 = this.zzC;
        int n7 = 1;
        this.zzC = n4 += n7;
        object4 = this.zzo;
        n4 = (int)(object4.isEmpty() ? 1 : 0);
        if (n4 == 0) {
            object4 = this.zzo;
            n4 = object4.size();
            for (n32 = n4 + -1; n32 >= 0; n32 += -1) {
                list = this.zzo;
                list.remove(n32);
            }
            object2 = this.zzag;
            this.zzag = object4 = ((zzxi)object2).zzh(0, n4);
        }
        list = new List<Object>();
        object4 = null;
        for (n4 = 0; n4 < (n32 = object3.size()); ++n4) {
            Object object5 = object3.get(n4);
            boolean bl22 = this.zzp;
            object2 = new zzmd((zzvq)object5, bl22);
            ((ArrayList)list).add(object2);
            object5 = this.zzo;
            Object object6 = ((zzmd)object2).zzb;
            object2 = ((zzmd)object2).zza;
            object = new zzkv(object6, (zzvj)object2);
            object5.add(n4, object);
        }
        object3 = this.zzag;
        n4 = ((ArrayList)list).size();
        this.zzag = object3 = ((zzxi)object3).zzg(0, n4);
        object3 = this.zzo;
        object2 = this.zzag;
        object4 = new zzml((Collection)object3, (zzxi)object2);
        boolean n8 = ((zzdc)object4).zzo();
        long l2 = -9223372036854775807L;
        n32 = -1;
        if (!n8 && (n3 = ((zzml)object4).zzc()) < 0) {
            object3 = new zzar((zzdc)object4, n32, l2);
            throw object3;
        }
        int n10 = ((zzio)object4).zzg(false);
        object = this.zzac;
        Object object5 = this.zzac((zzdc)object4, n10, l2);
        object = this.zzad((zzmg)object, (zzdc)object4, (Pair)object5);
        int n14 = ((zzmg)object).zze;
        if (n10 != n32 && n14 != n7) {
            n32 = (int)(((zzdc)object4).zzo() ? 1 : 0);
            n14 = 4;
            if (!n32 && n10 < (n4 = ((zzml)object4).zzc())) {
                n14 = 2;
            }
        }
        object4 = ((zzmg)object).zze(n14);
        object2 = this.zzk;
        long l3 = zzgd.zzr(l2);
        object5 = this.zzag;
        ((zzlh)object2).zzq(list, n10, l3, (zzxi)object5);
        object3 = this.zzac.zzb.zza;
        object2 = ((zzmg)object4).zzb.zza;
        boolean bl3 = object3.equals(object2);
        if (!bl3 && !(bl2 = ((zzdc)(object3 = this.zzac.zza)).zzo())) {
            n32 = 1;
        } else {
            n32 = 0;
            object2 = null;
        }
        l2 = this.zzZ((zzmg)object4);
        object3 = this;
        this.zzal((zzmg)object4, 0, 1, n32 != 0, 4, l2, -1, false);
    }

    public final zzjh zzE() {
        this.zzan();
        return this.zzac.zzf;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final /* synthetic */ void zzS(zzlf zzlf2) {
        int n3 = this.zzC;
        int n4 = zzlf2.zzb;
        this.zzC = n3 -= n4;
        n4 = (int)(zzlf2.zzc ? 1 : 0);
        int n7 = 1;
        float f5 = Float.MIN_VALUE;
        if (n4 != 0) {
            this.zzD = n4 = zzlf2.zzd;
            this.zzE = n7;
        }
        if ((n4 = (int)(zzlf2.zze ? 1 : 0)) != 0) {
            this.zzF = n4 = zzlf2.zzf;
        }
        if (n3 == 0) {
            long l2;
            Object object;
            zzvo zzvo2;
            int n8;
            Object object2 = zzlf2.zza.zza;
            Object object3 = this.zzac.zza;
            n4 = (int)(((zzdc)object3).zzo() ? 1 : 0);
            if (n4 == 0 && (n4 = (int)(((zzdc)object2).zzo() ? 1 : 0)) != 0) {
                long l3;
                this.zzad = n4 = -1;
                this.zzae = l3 = 0L;
            }
            n4 = (int)(((zzdc)object2).zzo() ? 1 : 0);
            int n10 = 0;
            if (n4 == 0) {
                Object object4;
                int n14;
                object3 = object2;
                object3 = ((zzml)object2).zzw();
                n8 = object3.size();
                if (n8 == (n14 = (object4 = this.zzo).size())) {
                    n8 = 1;
                } else {
                    n8 = 0;
                    zzvo2 = null;
                }
                zzeq.zzf(n8 != 0);
                zzvo2 = null;
                for (n8 = 0; n8 < (n14 = object3.size()); ++n8) {
                    object4 = (zzkv)this.zzo.get(n8);
                    object = (zzdc)object3.get(n8);
                    ((zzkv)object4).zzc((zzdc)object);
                }
            }
            n4 = (int)(this.zzE ? 1 : 0);
            long l4 = -9223372036854775807L;
            if (n4 != 0) {
                object3 = zzlf2.zza.zzb;
                object = this.zzac.zzb;
                n4 = (int)(((zzvo)object3).equals(object) ? 1 : 0);
                if (n4 != 0) {
                    long l7 = zzlf2.zza.zzd;
                    object3 = this.zzac;
                    long l8 = ((zzmg)object3).zzr;
                    long l12 = l7 - l8;
                    n4 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1));
                    if (n4 == 0) {
                        n7 = 0;
                        f5 = 0.0f;
                    }
                }
                if (n7 != 0) {
                    n4 = (int)(((zzdc)object2).zzo() ? 1 : 0);
                    if (n4 == 0 && (n4 = (int)(((zzvo)(object3 = zzlf2.zza.zzb)).zzb() ? 1 : 0)) == 0) {
                        object3 = zzlf2.zza;
                        zzvo2 = ((zzmg)object3).zzb;
                        l2 = ((zzmg)object3).zzd;
                        this.zzab((zzdc)object2, zzvo2, l2);
                    } else {
                        object2 = zzlf2.zza;
                        l2 = ((zzmg)object2).zzd;
                    }
                } else {
                    l2 = l4;
                }
                n8 = n7;
            } else {
                l2 = l4;
                n8 = 0;
                zzvo2 = null;
            }
            this.zzE = false;
            object2 = zzlf2.zza;
            n7 = this.zzF;
            int n15 = this.zzD;
            n4 = 1;
            n10 = n8;
            n8 = n15;
            n15 = -1;
            this.zzal((zzmg)object2, n4, n7, n10 != 0, n8, l2, n15, false);
        }
    }

    public final /* synthetic */ void zzT(zzlf zzlf2) {
        zzkl zzkl2 = new zzkl(this, zzlf2);
        this.zzj.zzh(zzkl2);
    }

    public final /* synthetic */ void zzU(zzcq zzcq2) {
        zzcp zzcp2 = this.zzH;
        zzcq2.zza(zzcp2);
    }

    public final void zza(int n3, long l2, int n4, boolean bl2) {
        int n7;
        zzdc zzdc2;
        block8: {
            block7: {
                this.zzan();
                n4 = -1;
                if (n3 == n4) break block7;
                n4 = 1;
                if (n3 >= 0) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    zzdc2 = null;
                }
                zzeq.zzd(bl2);
                zzdc2 = this.zzac.zza;
                n7 = zzdc2.zzo();
                if (n7 != 0 || n3 < (n7 = zzdc2.zzc())) break block8;
            }
            return;
        }
        Object object = this.zzr;
        object.zzu();
        this.zzC = n7 = this.zzC + n4;
        n7 = (int)(this.zzx() ? 1 : 0);
        if (n7 != 0) {
            zzfk.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            zzmg zzmg2 = this.zzac;
            zzlf zzlf2 = new zzlf(zzmg2);
            zzlf2.zza(n4);
            this.zzaf.zza.zzT(zzlf2);
            return;
        }
        Object object2 = this.zzac;
        n7 = ((zzmg)object2).zze;
        int n8 = 3;
        if (n7 == n8 || n7 == (n8 = 4) && (n7 = (int)(zzdc2.zzo() ? 1 : 0)) == 0) {
            object2 = this.zzac;
            n7 = 2;
            object2 = ((zzmg)object2).zze(n7);
        }
        int n10 = this.zzd();
        object = this.zzac(zzdc2, n3, l2);
        zzmg zzmg3 = this.zzad((zzmg)object2, zzdc2, (Pair)object);
        object2 = this.zzk;
        l2 = zzgd.zzr(l2);
        ((zzlh)object2).zzl(zzdc2, n3, l2);
        long l3 = this.zzZ(zzmg3);
        object = this;
        this.zzal(zzmg3, 0, 1, true, 1, l3, n10, false);
    }

    public final int zzb() {
        this.zzan();
        boolean bl2 = this.zzx();
        if (bl2) {
            return this.zzac.zzb.zzb;
        }
        return -1;
    }

    public final int zzc() {
        this.zzan();
        boolean bl2 = this.zzx();
        if (bl2) {
            return this.zzac.zzb.zzc;
        }
        return -1;
    }

    public final int zzd() {
        this.zzan();
        zzmg zzmg2 = this.zzac;
        int n3 = this.zzW(zzmg2);
        int n4 = -1;
        if (n3 == n4) {
            n3 = 0;
            zzmg2 = null;
        }
        return n3;
    }

    public final int zze() {
        this.zzan();
        Object object = this.zzac.zza;
        boolean bl2 = ((zzdc)object).zzo();
        if (bl2) {
            return 0;
        }
        object = this.zzac;
        zzdc zzdc2 = ((zzmg)object).zza;
        object = ((zzmg)object).zzb.zza;
        return zzdc2.zza(object);
    }

    public final int zzf() {
        this.zzan();
        return this.zzac.zze;
    }

    public final int zzg() {
        this.zzan();
        return this.zzac.zzm;
    }

    public final int zzh() {
        this.zzan();
        return 0;
    }

    public final long zzi() {
        long l2;
        this.zzan();
        boolean bl2 = this.zzx();
        if (bl2) {
            Object object = this.zzac;
            zzvo zzvo2 = ((zzmg)object).zzk;
            object = ((zzmg)object).zzb;
            bl2 = zzvo2.equals(object);
            if (bl2) {
                object = this.zzac;
                l2 = zzgd.zzu(((zzmg)object).zzp);
            } else {
                l2 = this.zzl();
            }
        } else {
            this.zzan();
            Object object = this.zzac.zza;
            bl2 = ((zzdc)object).zzo();
            if (bl2) {
                l2 = this.zzae;
            } else {
                object = this.zzac;
                Object object2 = ((zzmg)object).zzk;
                long l3 = ((zzvo)object2).zzd;
                zzvo zzvo3 = ((zzmg)object).zzb;
                long l4 = zzvo3.zzd;
                long l7 = 0L;
                Object object3 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                if (object3 != false) {
                    object = ((zzmg)object).zza;
                    int n3 = this.zzd();
                    zzdb zzdb2 = this.zza;
                    object = ((zzdc)object).zze(n3, zzdb2, l7);
                    l2 = zzgd.zzu(((zzdb)object).zzo);
                } else {
                    l2 = ((zzmg)object).zzp;
                    Object object4 = this.zzac.zzk;
                    boolean bl3 = ((zzvo)object4).zzb();
                    if (bl3) {
                        object = this.zzac;
                        object2 = ((zzmg)object).zza;
                        object = ((zzmg)object).zzk.zza;
                        object4 = this.zzn;
                        object = ((zzdc)object2).zzn(object, (zzcz)object4);
                        object2 = this.zzac.zzk;
                        int n4 = ((zzvo)object2).zzb;
                        ((zzcz)object).zzi(n4);
                    } else {
                        l7 = l2;
                    }
                    object = this.zzac;
                    object2 = ((zzmg)object).zza;
                    object = ((zzmg)object).zzk;
                    this.zzab((zzdc)object2, (zzvo)object, l7);
                    l2 = zzgd.zzu(l7);
                }
            }
        }
        return l2;
    }

    public final long zzj() {
        this.zzan();
        zzmg zzmg2 = this.zzac;
        return this.zzY(zzmg2);
    }

    public final long zzk() {
        this.zzan();
        zzmg zzmg2 = this.zzac;
        return zzgd.zzu(this.zzZ(zzmg2));
    }

    public final long zzl() {
        this.zzan();
        boolean bl2 = this.zzx();
        if (!bl2) {
            zzdc zzdc2 = this.zzn();
            int n3 = zzdc2.zzo();
            if (n3 != 0) {
                return -9223372036854775807L;
            }
            n3 = this.zzd();
            zzdb zzdb2 = this.zza;
            return zzgd.zzu(zzdc2.zze((int)n3, (zzdb)zzdb2, (long)0L).zzo);
        }
        Object object = this.zzac;
        zzvo zzvo2 = ((zzmg)object).zzb;
        object = ((zzmg)object).zza;
        Object object2 = zzvo2.zza;
        zzcz zzcz2 = this.zzn;
        ((zzdc)object).zzn(object2, zzcz2);
        object = this.zzn;
        int n4 = zzvo2.zzb;
        int n7 = zzvo2.zzc;
        return zzgd.zzu(((zzcz)object).zzh(n4, n7));
    }

    public final long zzm() {
        this.zzan();
        return zzgd.zzu(this.zzac.zzq);
    }

    public final zzdc zzn() {
        this.zzan();
        return this.zzac.zza;
    }

    public final zzdp zzo() {
        this.zzan();
        return this.zzac.zzi.zzd;
    }

    public final void zzp() {
        this.zzan();
        Object object = this.zzy;
        int n3 = this.zzv();
        int n4 = 2;
        int n7 = ((zziv)object).zzb(n3 != 0, n4);
        int n8 = zzkw.zzX(n3 != 0, n7);
        this.zzak(n3 != 0, n7, n8);
        object = this.zzac;
        n3 = ((zzmg)object).zze;
        n8 = 1;
        if (n3 != n8) {
            return;
        }
        object = ((zzmg)object).zzd(null);
        zzdc zzdc2 = ((zzmg)object).zza;
        n3 = (int)(zzdc2.zzo() ? 1 : 0);
        if (n8 == n3) {
            n4 = 4;
        }
        zzmg zzmg2 = ((zzmg)object).zze(n4);
        this.zzC = n7 = this.zzC + n8;
        this.zzk.zzk();
        this.zzal(zzmg2, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void zzq() {
        long l2;
        int n3;
        Object object = Integer.toHexString(System.identityHashCode(this));
        Object object2 = zzgd.zze;
        Object object3 = zzbv.zza();
        String string2 = "Release ";
        String string3 = " [AndroidXMedia3/1.4.0-alpha01] [";
        String string4 = "] [";
        object = og_1.a(string2, (String)object, string3, (String)object2, string4);
        ((StringBuilder)object).append((String)object3);
        ((StringBuilder)object).append("]");
        object = ((StringBuilder)object).toString();
        object2 = "ExoPlayerImpl";
        zzfk.zze((String)object2, (String)object);
        this.zzan();
        this.zzy.zzd();
        object = this.zzk;
        boolean bl2 = ((zzlh)object).zzp();
        if (!bl2) {
            object = this.zzl;
            object2 = new zzkk();
            n3 = 10;
            ((zzfh)object).zzd(n3, (zzfe)object2);
            ((zzfh)object).zzc();
        }
        this.zzl.zze();
        object = this.zzj;
        object2 = null;
        object.zze(null);
        object = this.zzt;
        object3 = this.zzr;
        object.zzf((zzzt)object3);
        object = this.zzac;
        n3 = (int)(((zzmg)object).zzo ? 1 : 0);
        n3 = 1;
        this.zzac = object = ((zzmg)object).zze(n3);
        object3 = ((zzmg)object).zzb;
        this.zzac = object = ((zzmg)object).zza((zzvo)object3);
        ((zzmg)object).zzp = l2 = ((zzmg)object).zzr;
        object = this.zzac;
        ((zzmg)object).zzq = l2 = 0L;
        this.zzr.zzP();
        this.zzi.zzj();
        object = this.zzN;
        if (object != null) {
            object.release();
            this.zzN = null;
        }
        this.zzW = object = zzek.zza;
    }

    public final void zzr(boolean bl2) {
        this.zzan();
        int n3 = this.zzf();
        n3 = this.zzy.zzb(bl2, n3);
        int n4 = zzkw.zzX(bl2, n3);
        this.zzak(bl2, n3, n4);
    }

    public final void zzs(Surface surface) {
        int n3;
        this.zzan();
        this.zzai(surface);
        if (surface == null) {
            n3 = 0;
            surface = null;
        } else {
            n3 = -1;
        }
        this.zzaf(n3, n3);
    }

    public final void zzt(float f5) {
        this.zzan();
        f5 = Math.min(f5, 1.0f);
        zzfh zzfh2 = null;
        f5 = Math.max(0.0f, f5);
        float f6 = this.zzU;
        float f7 = f6 == f5 ? 0 : (f6 > f5 ? 1 : -1);
        if (f7 == false) {
            return;
        }
        this.zzU = f5;
        this.zzah();
        zzfh2 = this.zzl;
        zzka zzka2 = new zzka(f5);
        zzfh2.zzd(22, zzka2);
        zzfh2.zzc();
    }

    public final void zzu() {
        this.zzan();
        Object object = this.zzy;
        boolean bl2 = this.zzv();
        ((zziv)object).zzb(bl2, 1);
        this.zzaj(null);
        zzgbc zzgbc2 = zzgbc.zzm();
        long l2 = this.zzac.zzr;
        this.zzW = object = new zzek(zzgbc2, l2);
    }

    public final boolean zzv() {
        this.zzan();
        return this.zzac.zzl;
    }

    public final boolean zzw() {
        this.zzan();
        return false;
    }

    public final boolean zzx() {
        this.zzan();
        return this.zzac.zzb.zzb();
    }

    public final int zzy() {
        this.zzan();
        int cfr_ignored_0 = this.zzh.length;
        return 2;
    }

    public final void zzz(zzna zzna2) {
        this.zzr.zzt(zzna2);
    }
}

