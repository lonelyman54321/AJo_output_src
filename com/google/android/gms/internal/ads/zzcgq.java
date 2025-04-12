/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Handler
 *  android.view.Surface
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzabj;
import com.google.android.gms.internal.ads.zzaci;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzaw;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzcdu;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzced;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcga;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.android.gms.internal.ads.zzcgd;
import com.google.android.gms.internal.ads.zzcgf;
import com.google.android.gms.internal.ads.zzcgg;
import com.google.android.gms.internal.ads.zzcgh;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcgk;
import com.google.android.gms.internal.ads.zzcgl;
import com.google.android.gms.internal.ads.zzcgm;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzcj;
import com.google.android.gms.internal.ads.zzcs;
import com.google.android.gms.internal.ads.zzct;
import com.google.android.gms.internal.ads.zzdv;
import com.google.android.gms.internal.ads.zzfxm;
import com.google.android.gms.internal.ads.zzfyb;
import com.google.android.gms.internal.ads.zzha;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzhk;
import com.google.android.gms.internal.ads.zzhz;
import com.google.android.gms.internal.ads.zzie;
import com.google.android.gms.internal.ads.zzix;
import com.google.android.gms.internal.ads.zziy;
import com.google.android.gms.internal.ads.zzjr;
import com.google.android.gms.internal.ads.zzlk;
import com.google.android.gms.internal.ads.zzm;
import com.google.android.gms.internal.ads.zzmn;
import com.google.android.gms.internal.ads.zzms;
import com.google.android.gms.internal.ads.zzmy;
import com.google.android.gms.internal.ads.zzmz;
import com.google.android.gms.internal.ads.zzna;
import com.google.android.gms.internal.ads.zzqo;
import com.google.android.gms.internal.ads.zzrl;
import com.google.android.gms.internal.ads.zzrz;
import com.google.android.gms.internal.ads.zzsf;
import com.google.android.gms.internal.ads.zztj;
import com.google.android.gms.internal.ads.zztx;
import com.google.android.gms.internal.ads.zzun;
import com.google.android.gms.internal.ads.zzuz;
import com.google.android.gms.internal.ads.zzvf;
import com.google.android.gms.internal.ads.zzvk;
import com.google.android.gms.internal.ads.zzvq;
import com.google.android.gms.internal.ads.zzwf;
import com.google.android.gms.internal.ads.zzwt;
import com.google.android.gms.internal.ads.zzwu;
import com.google.android.gms.internal.ads.zzxu;
import com.google.android.gms.internal.ads.zzyq;
import com.google.android.gms.internal.ads.zzze;
import com.google.android.gms.internal.ads.zzzm;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzcgq
extends zzcdv
implements zzie,
zzna {
    public static final /* synthetic */ int zza;
    private final Context zzb;
    private final zzcgb zzc;
    private final zzze zzd;
    private final zzced zze;
    private final WeakReference zzf;
    private final zzwu zzg;
    private zzjr zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcdu zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private final Object zzq;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcgd zzt;
    private final Set zzu;

    /*
     * Enabled aggressive block sorting
     */
    public zzcgq(Context object, zzced object2, zzcee object3, Integer object4) {
        int n3;
        Object object5;
        block11: {
            int n4;
            boolean bl2;
            block14: {
                block13: {
                    block12: {
                        Object object6;
                        Object object7;
                        boolean bl3;
                        block10: {
                            long l2;
                            this.zzq = object5 = new Object();
                            object5 = new HashSet();
                            this.zzu = object5;
                            this.zzb = object;
                            this.zze = object2;
                            this.zzr = object4;
                            object4 = new WeakReference(object3);
                            this.zzf = object4;
                            this.zzc = object4 = new zzcgb();
                            this.zzd = object5 = new zzze((Context)object);
                            bl3 = com.google.android.gms.ads.internal.util.zze.zzc();
                            if (bl3) {
                                object7 = this.toString();
                                object6 = "SimpleExoPlayerAdapter initialize ";
                                object7 = ((String)object6).concat((String)object7);
                                com.google.android.gms.ads.internal.util.zze.zza((String)object7);
                            }
                            zzcdv.zzD().incrementAndGet();
                            object6 = new zzcgn(this);
                            object7 = new zzms((Context)object, (zzcgn)object6);
                            ((zzms)object7).zzb((zzzm)object5);
                            ((zzms)object7).zza((zzlk)object4);
                            this.zzh = object4 = ((zzms)object7).zzc();
                            object4.zzz(this);
                            bl2 = false;
                            object4 = null;
                            this.zzl = 0;
                            this.zzn = l2 = 0L;
                            this.zzm = 0;
                            object5 = new ArrayList();
                            this.zzs = object5;
                            int n7 = 0;
                            object5 = null;
                            this.zzt = null;
                            if (object3 != null) {
                                object5 = object3.zzr();
                            }
                            object5 = zzfyb.zzd(object5);
                            object7 = "";
                            this.zzo = object5 = (String)((zzfyb)object5).zzb(object7);
                            if (object3 != null) {
                                n7 = object3.zzf();
                            } else {
                                n7 = 0;
                                object5 = null;
                            }
                            this.zzp = n7;
                            object7 = com.google.android.gms.ads.internal.zzu.zzp();
                            object3 = object3.zzn().afmaVersion;
                            object = ((zzt)object7).zzc((Context)object, (String)object3);
                            n4 = this.zzj;
                            if (n4 == 0 || (n4 = ((Buffer)(object3 = this.zzi)).limit()) <= 0) break block10;
                            n3 = this.zzi.limit();
                            object = new byte[n3];
                            this.zzi.get((byte[])object);
                            object2 = new zzcgf((byte[])object);
                            break block11;
                        }
                        object3 = zzbep.zzbZ;
                        object7 = zzba.zzc();
                        object3 = (Boolean)((zzben)object7).zza((zzbeg)object3);
                        n4 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
                        bl3 = true;
                        if (n4 == 0) break block12;
                        object3 = zzbep.zzbR;
                        object6 = zzba.zzc();
                        object3 = (Boolean)((zzben)object6).zza((zzbeg)object3);
                        n4 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
                        if (n4 != 0) break block13;
                    }
                    if ((n4 = (int)(((zzced)object2).zzj ? 1 : 0)) != 0) break block14;
                }
                bl2 = true;
            }
            object3 = (n4 = (int)(((zzced)object2).zzm ? 1 : 0)) != 0 ? new zzcgh(this, (String)object, bl2) : ((n4 = ((zzced)object2).zzi) > 0 ? new zzcgi(this, (String)object, bl2) : new zzcgj(this, (String)object, bl2));
            n3 = (int)(((zzced)object2).zzj ? 1 : 0);
            if (n3 != 0) {
                object = new zzcgk(this, (zzha)object3);
                object2 = object;
            } else {
                object2 = object3;
            }
            object = this.zzi;
            if (object != null && (n3 = ((Buffer)object).limit()) > 0) {
                n3 = this.zzi.limit();
                object = new byte[n3];
                this.zzi.get((byte[])object);
                object2 = object3 = new zzcgl((zzha)object2, (byte[])object);
            }
        }
        object = zzbep.zzo;
        object3 = zzba.zzc();
        object = (Boolean)((zzben)object3).zza((zzbeg)object);
        n3 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
        object = n3 != 0 ? new zzcgp() : new zzcgg();
        object3 = new zzwt((zzaea)object);
        this.zzg = object5 = new zzwu((zzha)object2, (zzwt)object3);
    }

    private final boolean zzad() {
        boolean bl2;
        zzcgd zzcgd2 = this.zzt;
        return zzcgd2 != null && (bl2 = (zzcgd2 = this.zzt).zzq());
    }

    public final void finalize() {
        Object object = zzcdv.zzD();
        ((AtomicInteger)object).decrementAndGet();
        boolean bl2 = com.google.android.gms.ads.internal.util.zze.zzc();
        if (bl2) {
            object = this.toString();
            String string2 = "SimpleExoPlayerAdapter finalize ";
            object = string2.concat((String)object);
            com.google.android.gms.ads.internal.util.zze.zza((String)object);
        }
    }

    public final long zzA() {
        boolean bl2 = this.zzad();
        if (!bl2) {
            return this.zzl;
        }
        return 0L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzB() {
        boolean bl2 = this.zzad();
        if (bl2) {
            return this.zzt.zzl();
        }
        Object object = this.zzq;
        synchronized (object) {
            try {
                while (true) {
                    ArrayList arrayList;
                    boolean bl3;
                    if (bl3 = (arrayList = this.zzs).isEmpty()) {
                        return this.zzn;
                    }
                    long l2 = this.zzn;
                    Object object2 = this.zzs;
                    object2 = ((ArrayList)object2).remove(0);
                    object2 = (zzhz)object2;
                    object2 = object2.zze();
                    long l3 = 0L;
                    if (object2 != null) {
                        boolean bl4;
                        object2 = object2.entrySet();
                        object2 = object2.iterator();
                        while (bl4 = object2.hasNext()) {
                            Object object3 = object2.next();
                            if ((object3 = (Map.Entry)object3) == null) continue;
                            try {
                                Object object4 = object3.getKey();
                                if (object4 == null) continue;
                                object4 = "content-length";
                                Object object5 = object3.getKey();
                                boolean bl5 = zzfxm.zzc(object4, object5 = (CharSequence)object5);
                                if (!bl5 || (object4 = object3.getValue()) == null) continue;
                                object4 = object3.getValue();
                                object4 = (List)object4;
                                if ((object4 = object4.get(0)) == null) continue;
                                object3 = object3.getValue();
                                object3 = (List)object3;
                                object3 = object3.get(0);
                                object3 = (String)object3;
                                l3 = Long.parseLong(object3);
                                break;
                            }
                            catch (NumberFormatException numberFormatException) {
                            }
                        }
                    }
                    this.zzn = l2 += l3;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Integer zzC() {
        return this.zzr;
    }

    public final void zzF(Uri[] uriArray, String string2) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(0);
        this.zzG(uriArray, string2, byteBuffer, false);
    }

    public final void zzG(Uri[] object, String object2, ByteBuffer object3, boolean bl2) {
        object2 = this.zzh;
        if (object2 != null) {
            this.zzi = object3;
            this.zzj = bl2;
            int n3 = ((Uri[])object).length;
            int n4 = 1;
            bl2 = false;
            if (n3 == n4) {
                object = object[0];
                object = this.zzaa((Uri)object);
            } else {
                int n7;
                object2 = new zzvq[n3];
                object3 = null;
                for (n4 = 0; n4 < (n7 = ((Uri)object).length); ++n4) {
                    Object object4 = object[n4];
                    object4 = this.zzaa((Uri)object4);
                    object2[n4] = object4;
                }
                object3 = new zzuz();
                object = new zzwf(false, false, (zzuz)object3, (zzvq[])object2);
            }
            object2 = this.zzh;
            object2.zzB((zzvq)object);
            this.zzh.zzp();
            object = zzcdv.zzE();
            ((AtomicInteger)object).incrementAndGet();
        }
    }

    public final void zzH() {
        Object object = this.zzh;
        if (object != null) {
            object.zzA(this);
            this.zzh.zzq();
            this.zzh = null;
            object = zzcdv.zzE();
            ((AtomicInteger)object).decrementAndGet();
        }
    }

    public final void zzI(long l2) {
        zzjr zzjr2 = this.zzh;
        zzct zzct2 = zzjr2;
        zzct2 = (zzm)((Object)zzjr2);
        int n3 = zzct2.zzd();
        ((zzm)zzct2).zza(n3, l2, 5, false);
    }

    public final void zzJ(int n3) {
        this.zzc.zzk(n3);
    }

    public final void zzK(int n3) {
        this.zzc.zzl(n3);
    }

    public final void zzL(zzcdu zzcdu2) {
        this.zzk = zzcdu2;
    }

    public final void zzM(int n3) {
        this.zzc.zzm(n3);
    }

    public final void zzN(int n3) {
        this.zzc.zzn(n3);
    }

    public final void zzO(boolean bl2) {
        this.zzh.zzr(bl2);
    }

    public final void zzP(Integer n3) {
        this.zzr = n3;
    }

    public final void zzQ(boolean bl2) {
        zzjr zzjr2 = this.zzh;
        if (zzjr2 != null) {
            int n3 = 0;
            zzjr2 = null;
            while (true) {
                Object object = this.zzh;
                object.zzy();
                int n4 = 2;
                if (n3 >= n4) break;
                object = this.zzd;
                zzyq zzyq2 = ((zzze)object).zzf().zzc();
                boolean bl3 = bl2 ^ true;
                zzyq2.zzp(n3, bl3);
                ((zzze)object).zzl(zzyq2);
                ++n3;
            }
        }
    }

    public final void zzR(int n3) {
        boolean bl2;
        Iterator iterator = this.zzu.iterator();
        while (bl2 = iterator.hasNext()) {
            zzcga zzcga2 = (zzcga)((WeakReference)iterator.next()).get();
            if (zzcga2 == null) continue;
            zzcga2.zzm(n3);
        }
    }

    public final void zzS(Surface surface, boolean bl2) {
        zzjr zzjr2 = this.zzh;
        if (zzjr2 != null) {
            zzjr2.zzs(surface);
        }
    }

    public final void zzT(float f5, boolean bl2) {
        zzjr zzjr2 = this.zzh;
        if (zzjr2 != null) {
            zzjr2.zzt(f5);
        }
    }

    public final void zzU() {
        this.zzh.zzu();
    }

    public final boolean zzV() {
        zzjr zzjr2 = this.zzh;
        return zzjr2 != null;
    }

    public final /* synthetic */ zzhb zzW(String string2, boolean bl2) {
        zzcgq zzcgq2;
        zzced zzced2;
        boolean bl3 = true;
        if (bl3 != bl2) {
            bl2 = false;
            zzced2 = null;
            zzcgq2 = null;
        } else {
            zzcgq2 = this;
        }
        zzced2 = this.zze;
        int n3 = zzced2.zzd;
        int n4 = zzced2.zzf;
        long l2 = zzced2.zzn;
        long l3 = zzced2.zzo;
        zzcgt zzcgt2 = new zzcgt(string2, zzcgq2, n3, n4, l2, l3);
        return zzcgt2;
    }

    public final /* synthetic */ zzhb zzX(String weakReference, boolean bl2) {
        zzcgq zzcgq2;
        zzced zzced2;
        boolean bl3 = true;
        if (bl3 != bl2) {
            bl2 = false;
            zzced2 = null;
            zzcgq2 = null;
        } else {
            zzcgq2 = this;
        }
        zzced2 = this.zze;
        int n3 = zzced2.zzd;
        int n4 = zzced2.zzf;
        int n7 = zzced2.zzi;
        zzcga zzcga2 = new zzcga((String)((Object)weakReference), zzcgq2, n3, n4, n7);
        weakReference = new WeakReference<zzcga>(zzcga2);
        this.zzu.add(weakReference);
        return zzcga2;
    }

    public final /* synthetic */ zzhb zzY(String string2, boolean bl2) {
        zzcgq zzcgq2;
        zzhk zzhk2 = new zzhk();
        zzhk2.zzf(string2);
        boolean bl3 = true;
        if (bl3 != bl2) {
            boolean bl4 = false;
            zzcgq2 = null;
        } else {
            zzcgq2 = this;
        }
        zzhk2.zze(zzcgq2);
        int n3 = this.zze.zzd;
        zzhk2.zzc(n3);
        int n4 = this.zze.zzf;
        zzhk2.zzd(n4);
        zzhk2.zzb(bl3);
        return zzhk2.zzg();
    }

    public final /* synthetic */ zzhb zzZ(zzha zzha2) {
        zzhb zzhb2 = zzha2.zza();
        zzcgo zzcgo2 = new zzcgo(this);
        String string2 = this.zzo;
        int n3 = this.zzp;
        Context context = this.zzb;
        zzcgd zzcgd2 = new zzcgd(context, zzhb2, string2, n3, this, zzcgo2);
        return zzcgd2;
    }

    public final void zza(zzhb zzhb2, zzhh zzhh2, boolean bl2, int n3) {
        int n4;
        this.zzl = n4 = this.zzl + n3;
    }

    public final zzvq zzaa(Uri object) {
        Object object2 = new zzaw();
        ((zzaw)object2).zzb((Uri)object);
        object = ((zzaw)object2).zzc();
        object2 = this.zzg;
        int n3 = this.zze.zzg;
        ((zzwu)object2).zza(n3);
        return ((zzwu)object2).zzb((zzbu)object);
    }

    public final /* synthetic */ void zzab(boolean bl2, long l2) {
        zzcdu zzcdu2 = this.zzk;
        if (zzcdu2 != null) {
            zzcdu2.zzi(bl2, l2);
        }
    }

    public final /* synthetic */ zzmn[] zzac(Handler handler, zzaci zzaci2, zzqo zzqo2, zzxu zzxu2, zzun zzun2) {
        zzsf zzsf2;
        zztx zztx2 = zztx.zza;
        zzmn[] zzmnArray = this.zzb;
        Object object = new zzrl((Context)zzmnArray);
        zzrz zzrz2 = ((zzrl)object).zzd();
        zztj zztj2 = new zztj((Context)zzmnArray);
        object = zzsf2;
        zzsf2 = new zzsf((Context)zzmnArray, zztj2, zztx2, false, handler, zzqo2, zzrz2);
        Context context = this.zzb;
        zztj zztj3 = new zztj(context);
        object = new zzabj(context, zztj3, zztx2, 0L, false, handler, zzaci2, -1, 30.0f);
        zzmnArray = new zzmn[]{zzsf2, object};
        return zzmnArray;
    }

    public final void zzb(zzhb zzhb2, zzhh zzhh2, boolean bl2) {
    }

    public final void zzc(zzhb zzhb2, zzhh zzhh2, boolean bl2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(zzhb object, zzhh serializable, boolean bl2) {
        boolean bl3 = object instanceof zzhz;
        if (bl3) {
            serializable = this.zzq;
            synchronized (serializable) {
                ArrayList arrayList = this.zzs;
                object = (zzhz)object;
                arrayList.add(object);
                return;
            }
        }
        bl3 = object instanceof zzcgd;
        if (bl3) {
            object = (zzcgd)object;
            this.zzt = object;
            object = (zzcee)this.zzf.get();
            serializable = zzbep.zzbR;
            Object object2 = zzba.zzc();
            serializable = (Boolean)((zzben)object2).zza((zzbeg)((Object)serializable));
            bl3 = (Boolean)serializable;
            if (bl3 && object != null && (bl3 = ((zzcgd)((Object)(serializable = this.zzt))).zzn())) {
                serializable = new Serializable();
                object2 = String.valueOf(this.zzt.zzp());
                serializable.put("gcacheHit", object2);
                bl2 = this.zzt.zzo();
                object2 = String.valueOf(bl2);
                serializable.put("gcacheDownloaded", object2);
                object2 = com.google.android.gms.ads.internal.util.zzt.zza;
                zzcgm zzcgm2 = new zzcgm((zzcee)object, (Map)((Object)serializable));
                object2.post((Runnable)zzcgm2);
            }
        }
    }

    public final void zze(zzmy object, zzan object2, zziy serializable) {
        object = (zzcee)this.zzf.get();
        serializable = zzbep.zzbR;
        Object object3 = zzba.zzc();
        serializable = (Boolean)((zzben)object3).zza((zzbeg)((Object)serializable));
        boolean bl2 = (Boolean)serializable;
        if (bl2 && object != null) {
            String string2;
            serializable = new Serializable();
            object3 = ((zzan)object2).zzm;
            if (object3 != null) {
                string2 = "audioMime";
                serializable.put(string2, object3);
            }
            if ((object3 = ((zzan)object2).zzn) != null) {
                string2 = "audioSampleMime";
                serializable.put(string2, object3);
            }
            if ((object2 = ((zzan)object2).zzk) != null) {
                object3 = "audioCodec";
                serializable.put((String)object3, object2);
            }
            object2 = "onMetadataEvent";
            object.zzd((String)object2, (Map)((Object)serializable));
        }
    }

    public final /* synthetic */ void zzf(zzmy zzmy2, int n3, long l2, long l3) {
    }

    public final /* synthetic */ void zzg(zzmy zzmy2, zzvk zzvk2) {
    }

    public final void zzh(zzmy zzmy2, int n3, long l2) {
        int n4;
        this.zzm = n4 = this.zzm + n3;
    }

    public final /* synthetic */ void zzi(zzct zzct2, zzmz zzmz2) {
    }

    public final void zzj(zzmy object, zzvf object2, zzvk zzvk2, IOException iOException, boolean bl2) {
        object = this.zzk;
        if (object != null) {
            object2 = this.zze;
            boolean bl3 = ((zzced)object2).zzk;
            if (bl3) {
                object.zzl("onLoadException", iOException);
                return;
            }
            object2 = "onLoadError";
            object.zzk((String)object2, iOException);
        }
    }

    public final void zzk(zzmy object, int n3) {
        object = this.zzk;
        if (object != null) {
            object.zzm(n3);
        }
    }

    public final void zzl(zzmy object, zzcj zzcj2) {
        object = this.zzk;
        if (object != null) {
            String string2 = "onPlayerError";
            object.zzk(string2, zzcj2);
        }
    }

    public final /* synthetic */ void zzm(zzmy zzmy2, zzcs zzcs2, zzcs zzcs3, int n3) {
    }

    public final void zzn(zzmy object, Object object2, long l2) {
        object = this.zzk;
        if (object != null) {
            object.zzv();
        }
    }

    public final /* synthetic */ void zzo(zzmy zzmy2, zzix zzix2) {
    }

    public final void zzp(zzmy object, zzan object2, zziy serializable) {
        object = (zzcee)this.zzf.get();
        serializable = zzbep.zzbR;
        Object object3 = zzba.zzc();
        serializable = (Boolean)((zzben)object3).zza((zzbeg)((Object)serializable));
        boolean bl2 = (Boolean)serializable;
        if (bl2 && object != null) {
            serializable = new Serializable();
            float f5 = ((zzan)object2).zzu;
            object3 = String.valueOf(f5);
            serializable.put("frameRate", object3);
            object3 = String.valueOf(((zzan)object2).zzj);
            serializable.put("bitRate", object3);
            int n3 = ((zzan)object2).zzs;
            int n4 = ((zzan)object2).zzt;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n3);
            stringBuilder.append("x");
            stringBuilder.append(n4);
            object3 = stringBuilder.toString();
            String string2 = "resolution";
            serializable.put(string2, object3);
            object3 = ((zzan)object2).zzm;
            if (object3 != null) {
                string2 = "videoMime";
                serializable.put(string2, object3);
            }
            if ((object3 = ((zzan)object2).zzn) != null) {
                string2 = "videoSampleMime";
                serializable.put(string2, object3);
            }
            if ((object2 = ((zzan)object2).zzk) != null) {
                object3 = "videoCodec";
                serializable.put((String)object3, object2);
            }
            object2 = "onMetadataEvent";
            object.zzd((String)object2, (Map)((Object)serializable));
        }
    }

    public final void zzq(zzmy object, zzdv zzdv2) {
        object = this.zzk;
        if (object != null) {
            int n3 = zzdv2.zzc;
            int n4 = zzdv2.zzd;
            object.zzD(n3, n4);
        }
    }

    public final int zzr() {
        return this.zzm;
    }

    public final int zzt() {
        return this.zzh.zzf();
    }

    public final long zzv() {
        return this.zzh.zzi();
    }

    public final long zzw() {
        return this.zzl;
    }

    public final long zzx() {
        zzcgd zzcgd2;
        boolean bl2 = this.zzad();
        if (bl2 && (bl2 = (zzcgd2 = this.zzt).zzp())) {
            long l2 = this.zzl;
            long l3 = this.zzt.zzk();
            return Math.min(l2, l3);
        }
        return 0L;
    }

    public final long zzy() {
        return this.zzh.zzk();
    }

    public final long zzz() {
        return this.zzh.zzl();
    }
}

