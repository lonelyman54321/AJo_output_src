/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioDeviceInfo
 *  android.media.AudioTrack
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.SystemClock
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcl;
import com.google.android.gms.internal.ads.zzdw;
import com.google.android.gms.internal.ads.zzdx;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzdz;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgds;
import com.google.android.gms.internal.ads.zzgea;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzl;
import com.google.android.gms.internal.ads.zzmm;
import com.google.android.gms.internal.ads.zzpj;
import com.google.android.gms.internal.ads.zzpp;
import com.google.android.gms.internal.ads.zzpw;
import com.google.android.gms.internal.ads.zzpx;
import com.google.android.gms.internal.ads.zzqa;
import com.google.android.gms.internal.ads.zzqn;
import com.google.android.gms.internal.ads.zzqp;
import com.google.android.gms.internal.ads.zzqq;
import com.google.android.gms.internal.ads.zzqr;
import com.google.android.gms.internal.ads.zzqs;
import com.google.android.gms.internal.ads.zzqu;
import com.google.android.gms.internal.ads.zzqv;
import com.google.android.gms.internal.ads.zzqy;
import com.google.android.gms.internal.ads.zzqz;
import com.google.android.gms.internal.ads.zzra;
import com.google.android.gms.internal.ads.zzrd;
import com.google.android.gms.internal.ads.zzre;
import com.google.android.gms.internal.ads.zzrf;
import com.google.android.gms.internal.ads.zzrg;
import com.google.android.gms.internal.ads.zzrh;
import com.google.android.gms.internal.ads.zzri;
import com.google.android.gms.internal.ads.zzrk;
import com.google.android.gms.internal.ads.zzrl;
import com.google.android.gms.internal.ads.zzrm;
import com.google.android.gms.internal.ads.zzrn;
import com.google.android.gms.internal.ads.zzrp;
import com.google.android.gms.internal.ads.zzrr;
import com.google.android.gms.internal.ads.zzrs;
import com.google.android.gms.internal.ads.zzru;
import com.google.android.gms.internal.ads.zzrx;
import com.google.android.gms.internal.ads.zzry;
import com.google.android.gms.internal.ads.zzsb;
import com.google.android.gms.internal.ads.zzse;
import com.google.android.gms.internal.ads.zzsf;
import com.google.android.gms.internal.ads.zzsi;
import com.google.android.gms.internal.ads.zzsj;
import java.math.RoundingMode;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

public final class zzrz
implements zzqv {
    private static final Object zza;
    private static ExecutorService zzb;
    private static int zzc;
    private zzrp zzA;
    private zzcl zzB;
    private boolean zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private float zzL;
    private ByteBuffer zzM;
    private int zzN;
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private int zzT;
    private zzl zzU;
    private zzpx zzV;
    private long zzW;
    private boolean zzX;
    private boolean zzY;
    private Looper zzZ;
    private long zzaa;
    private long zzab;
    private Handler zzac;
    private final zzrn zzad;
    private final zzrd zzae;
    private final Context zzd;
    private final zzra zze;
    private final zzsj zzf;
    private final zzgbc zzg;
    private final zzgbc zzh;
    private final zzeu zzi;
    private final zzqz zzj;
    private final ArrayDeque zzk;
    private zzrx zzl;
    private final zzrs zzm;
    private final zzrs zzn;
    private final zzrk zzo;
    private zzpj zzp;
    private zzqs zzq;
    private zzrm zzr;
    private zzrm zzs;
    private zzdw zzt;
    private AudioTrack zzu;
    private zzpp zzv;
    private zzpw zzw;
    private zzrr zzx;
    private zzk zzy;
    private zzrp zzz;

    static {
        Object object;
        zza = object = new Object();
    }

    public /* synthetic */ zzrz(zzrl object, zzry object2) {
        object2 = zzrl.zza((zzrl)object);
        this.zzd = object2;
        Object object3 = com.google.android.gms.internal.ads.zzk.zza;
        this.zzy = object3;
        object2 = object2 != null ? zzpp.zzc((Context)object2, (zzk)object3, null) : zzrl.zzb((zzrl)object);
        this.zzv = object2;
        this.zzad = object2 = zzrl.zze((zzrl)object);
        this.zzo = object2 = zzrl.zzc((zzrl)object);
        object = zzrl.zzf((zzrl)object);
        object.getClass();
        this.zzae = object;
        object2 = zzer.zza;
        this.zzi = object = new zzeu((zzer)object2);
        ((zzeu)object).zze();
        object2 = new zzru(this, null);
        this.zzj = object = new zzqz((zzqy)object2);
        this.zze = object = new zzra();
        this.zzf = object2 = new zzsj();
        object3 = new zzed();
        this.zzg = object = zzgbc.zzp(object3, object, object2);
        object = new zzsi();
        this.zzh = object = zzgbc.zzn(object);
        this.zzL = 1.0f;
        this.zzT = 0;
        this.zzU = object2 = new zzl(0, 0.0f);
        object3 = zzcl.zza;
        this.zzA = object2 = new zzrp((zzcl)object3, 0L, 0L, null);
        this.zzB = object3;
        this.zzC = false;
        object = new ArrayDeque();
        this.zzk = object;
        long l2 = 100;
        this.zzm = object = new zzrs(l2);
        this.zzn = object = new zzrs(l2);
    }

    public static /* bridge */ /* synthetic */ long zzB(zzrz zzrz2) {
        return zzrz2.zzW;
    }

    public static /* bridge */ /* synthetic */ long zzC(zzrz zzrz2) {
        return zzrz2.zzL();
    }

    public static /* bridge */ /* synthetic */ long zzD(zzrz zzrz2) {
        return zzrz2.zzM();
    }

    public static /* bridge */ /* synthetic */ AudioTrack zzE(zzrz zzrz2) {
        return zzrz2.zzu;
    }

    public static /* bridge */ /* synthetic */ zzqs zzF(zzrz zzrz2) {
        return zzrz2.zzq;
    }

    public static /* synthetic */ void zzG(zzrz zzrz2) {
        long l2 = zzrz2.zzab;
        long l3 = 300000L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            zzsf zzsf2 = ((zzse)zzrz2.zzq).zza;
            boolean bl2 = true;
            zzsf.zzah(zzsf2, bl2);
            zzrz2.zzab = l2 = 0L;
        }
    }

    public static /* bridge */ /* synthetic */ void zzH(zzrz zzrz2, boolean bl2) {
        zzrz2.zzR = true;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zzI(AudioTrack object, zzqs object2, Handler object3, zzqp zzqp2, zzeu zzeu2) {
        block11: {
            try {
                object.flush();
                object.release();
                if (object2 == null) break block11;
            }
            catch (Throwable throwable) {
                Runnable runnable2;
                boolean bl2;
                if (object2 != null && (bl2 = (runnable2 = object3.getLooper().getThread()).isAlive())) {
                    runnable2 = new zzrf((zzqs)object2, zzqp2);
                    object3.post(runnable2);
                }
                zzeu2.zze();
                object2 = zza;
                synchronized (object2) {
                    Throwable throwable22;
                    block15: {
                        block12: {
                            try {
                                int n3;
                                zzc = n3 = zzc + -1;
                                if (n3 != 0) break block12;
                                object3 = zzb;
                                object3.shutdown();
                                zzb = null;
                            }
                            catch (Throwable throwable22) {
                                break block15;
                            }
                        }
                        throw throwable;
                    }
                    throw throwable22;
                }
            }
            object = object3.getLooper().getThread();
            boolean bl3 = object.isAlive();
            if (bl3) {
                object = new zzrf((zzqs)object2, zzqp2);
                object3.post((Runnable)object);
            }
        }
        zzeu2.zze();
        object = zza;
        synchronized (object) {
            Throwable throwable3;
            block14: {
                block13: {
                    try {
                        int n4;
                        zzc = n4 = zzc + -1;
                        if (n4 != 0) break block13;
                        object2 = zzb;
                        object2.shutdown();
                        zzb = null;
                    }
                    catch (Throwable throwable3) {
                        break block14;
                    }
                }
                return;
            }
            throw throwable3;
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzK(zzrz zzrz2) {
        return zzrz2.zzS;
    }

    private final long zzL() {
        long l2;
        zzrm zzrm2 = this.zzs;
        int n3 = zzrm2.zzc;
        if (n3 == 0) {
            l2 = this.zzD;
            int n4 = zzrm2.zzb;
            long l3 = n4;
            l2 /= l3;
        } else {
            l2 = this.zzE;
        }
        return l2;
    }

    private final long zzM() {
        long l2;
        zzrm zzrm2 = this.zzs;
        int n3 = zzrm2.zzc;
        if (n3 == 0) {
            l2 = this.zzF;
            long l3 = zzrm2.zzd;
            l2 += l3;
            long l4 = -1;
            l2 = (l2 + l4) / l3;
        } else {
            l2 = this.zzG;
        }
        return l2;
    }

    private final AudioTrack zzN(zzrm zzrm2) {
        Object object;
        try {
            object = this.zzy;
        }
        catch (zzqr zzqr2) {
            object = this.zzq;
            if (object != null) {
                object.zza(zzqr2);
            }
            throw zzqr2;
        }
        int n3 = this.zzT;
        return zzrm2.zza((zzk)object, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zzO(long l2) {
        boolean bl2;
        Object object;
        Object object2;
        boolean bl3 = this.zzaa();
        if (bl3) {
            object2 = this.zzad;
            object = this.zzB;
            ((zzrn)object2).zzc((zzcl)object);
        } else {
            object = zzcl.zza;
        }
        zzcl zzcl2 = object;
        this.zzB = object;
        bl3 = this.zzaa();
        if (bl3) {
            object2 = this.zzad;
            bl2 = this.zzC;
            ((zzrn)object2).zzd(bl2);
        } else {
            bl2 = false;
            object = null;
        }
        this.zzC = bl2;
        object2 = this.zzk;
        long l3 = Math.max(0L, l2);
        Object object3 = this.zzs;
        long l4 = this.zzM();
        int n3 = ((zzrm)object3).zze;
        l4 = zzgd.zzs(l4, n3);
        object = new zzrp(zzcl2, l3, l4, null);
        ((ArrayDeque)object2).add(object);
        this.zzV();
        object3 = this.zzq;
        if (object3 != null) {
            boolean bl4 = this.zzC;
            object3 = zzsf.zzae(((zzse)object3).zza);
            ((zzqn)object3).zzw(bl4);
        }
    }

    private final void zzP() {
        zzrm zzrm2 = this.zzs;
        boolean bl2 = zzrm2.zzc();
        if (!bl2) {
            return;
        }
        this.zzX = true;
    }

    private final void zzQ() {
        Object object = this.zzw;
        if (object == null && (object = this.zzd) != null) {
            zzpw zzpw2;
            object = Looper.myLooper();
            this.zzZ = object;
            object = this.zzd;
            zzrh zzrh2 = new zzrh(this);
            zzk zzk2 = this.zzy;
            zzpx zzpx2 = this.zzV;
            this.zzw = zzpw2 = new zzpw((Context)object, zzrh2, zzk2, zzpx2);
            this.zzv = object = zzpw2.zzc();
        }
    }

    private final void zzR() {
        boolean bl2 = this.zzQ;
        if (!bl2) {
            this.zzQ = bl2 = true;
            zzqz zzqz2 = this.zzj;
            long l2 = this.zzM();
            zzqz2.zzb(l2);
            zzqz2 = this.zzu;
            zzqz2.stop();
        }
    }

    private final void zzS(long l2) {
        Object object = this.zzt;
        boolean bl2 = ((zzdw)object).zzh();
        if (bl2) {
            block0: while (!(bl2 = ((zzdw)(object = this.zzt)).zzg())) {
                boolean bl3;
                while (bl3 = ((Buffer)(object = this.zzt.zzb())).hasRemaining()) {
                    this.zzW((ByteBuffer)object, l2);
                    bl2 = ((Buffer)object).hasRemaining();
                    if (!bl2) continue;
                    break block0;
                }
                object = this.zzM;
                if (object == null || !(bl2 = ((Buffer)object).hasRemaining())) break;
                object = this.zzt;
                ByteBuffer byteBuffer = this.zzM;
                ((zzdw)object).zze(byteBuffer);
            }
            return;
        }
        object = this.zzM;
        if (object == null) {
            object = zzdz.zza;
        }
        this.zzW((ByteBuffer)object, l2);
    }

    private final void zzT(zzcl zzcl2) {
        long l2 = -9223372036854775807L;
        zzrp zzrp2 = new zzrp(zzcl2, l2, l2, null);
        boolean bl2 = this.zzY();
        if (bl2) {
            this.zzz = zzrp2;
            return;
        }
        this.zzA = zzrp2;
    }

    private final void zzU() {
        int n3 = this.zzY();
        if (n3 == 0) {
            return;
        }
        n3 = zzgd.zza;
        AudioTrack audioTrack = this.zzu;
        float f5 = this.zzL;
        audioTrack.setVolume(f5);
    }

    private final void zzV() {
        zzdw zzdw2;
        this.zzt = zzdw2 = this.zzs.zzi;
        zzdw2.zzc();
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zzW(ByteBuffer object, long l2) {
        Object object2;
        int n3;
        long l3;
        int n4;
        int n7;
        Object object3;
        int n8;
        block16: {
            block17: {
                block18: {
                    n8 = ((Buffer)object).hasRemaining();
                    if (n8 == 0) {
                        return;
                    }
                    object3 = this.zzO;
                    n7 = 0;
                    int n10 = 1;
                    if (object3 != null) {
                        if (object3 == object) {
                            n8 = 1;
                        } else {
                            n8 = 0;
                            object3 = null;
                        }
                        zzeq.zzd(n8 != 0);
                    } else {
                        this.zzO = object;
                        n8 = zzgd.zza;
                    }
                    n8 = ((Buffer)object).remaining();
                    n4 = zzgd.zza;
                    AudioTrack audioTrack = this.zzu;
                    n4 = audioTrack.write((ByteBuffer)object, n8, n10);
                    this.zzW = l3 = SystemClock.elapsedRealtime();
                    l3 = 0L;
                    if (n4 >= 0) break block16;
                    int n14 = zzgd.zza;
                    n8 = 24;
                    if ((n14 < n8 || n4 != (n14 = -6)) && n4 != (n14 = -32)) break block17;
                    long l4 = this.zzM();
                    long l7 = l4 - l3;
                    Object object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object4 > 0) break block18;
                    object = this.zzu;
                    n14 = (int)(zzrz.zzZ((AudioTrack)object) ? 1 : 0);
                    if (n14 == 0) break block17;
                    this.zzP();
                }
                n7 = 1;
            }
            object3 = this.zzs.zza;
            object = new zzqu(n4, (zzan)object3, n7 != 0);
            object3 = this.zzq;
            if (object3 != null) {
                object3.zza((Exception)object);
            }
            if ((n8 = (int)(((zzqu)object).zzb ? 1 : 0)) == 0) {
                this.zzn.zzb((Exception)object);
                return;
            }
            this.zzv = object3 = zzpp.zza;
            throw object;
        }
        this.zzn.zza();
        AudioTrack audioTrack = this.zzu;
        boolean bl2 = zzrz.zzZ(audioTrack);
        if (bl2) {
            zzmm zzmm2;
            long l8 = this.zzG;
            long l12 = l8 - l3;
            Object object5 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object5 > 0) {
                this.zzY = false;
            }
            if ((n3 = (int)(this.zzS ? 1 : 0)) != 0 && (object2 = this.zzq) != null && n4 < n8 && (zzmm2 = zzsf.zzad((zzsf)(object2 = ((zzse)object2).zza))) != null) {
                object2 = zzsf.zzad((zzsf)object2);
                object2.zza();
            }
        }
        object2 = this.zzs;
        n3 = ((zzrm)object2).zzc;
        if (n3 == 0) {
            long l14 = this.zzF;
            long l15 = n4;
            this.zzF = l14 += l15;
        }
        if (n4 != n8) return;
        if (n3 != 0) {
            object3 = this.zzM;
            if (object == object3) {
                n7 = 1;
            }
            zzeq.zzf(n7 != 0);
            long l16 = this.zzG;
            long l17 = this.zzH;
            n7 = this.zzN;
            l3 = n7;
            this.zzG = l17 = l17 * l3 + l16;
        }
        boolean bl3 = false;
        object = null;
        this.zzO = null;
    }

    private final boolean zzX() {
        Object object = this.zzt;
        boolean bl2 = ((zzdw)object).zzh();
        long l2 = Long.MIN_VALUE;
        boolean bl3 = false;
        boolean bl4 = true;
        if (!bl2) {
            object = this.zzO;
            if (object == null) {
                return bl4;
            }
            this.zzW((ByteBuffer)object, l2);
            object = this.zzO;
            if (object == null) {
                return bl4;
            }
            return false;
        }
        this.zzt.zzd();
        this.zzS(l2);
        object = this.zzt;
        bl2 = ((zzdw)object).zzg();
        if (bl2) {
            object = this.zzO;
            if (object != null) {
                bl2 = ((Buffer)object).hasRemaining();
                if (!bl2) {
                    return bl4;
                }
            } else {
                bl3 = true;
            }
        }
        return bl3;
    }

    private final boolean zzY() {
        AudioTrack audioTrack = this.zzu;
        return audioTrack != null;
    }

    private static boolean zzZ(AudioTrack audioTrack) {
        boolean bl2;
        int n3 = zzgd.zza;
        int n4 = 29;
        return n3 >= n4 && (bl2 = Kk0.b(audioTrack));
    }

    private final boolean zzaa() {
        zzrm zzrm2 = this.zzs;
        int n3 = zzrm2.zzc;
        if (n3 == 0) {
            int cfr_ignored_0 = zzrm2.zza.zzC;
            return true;
        }
        return false;
    }

    public final boolean zzA(zzan zzan2) {
        int n3 = this.zza(zzan2);
        return n3 != 0;
    }

    public final void zzJ(zzpp object) {
        boolean bl2;
        Object object2 = this.zzZ;
        Looper looper = Looper.myLooper();
        if (object2 == looper) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        zzeq.zzf(bl2);
        object2 = this.zzv;
        bl2 = ((zzpp)object).equals(object2);
        if (!bl2) {
            this.zzv = object;
            object = this.zzq;
            if (object != null) {
                object = ((zzse)object).zza;
                zzsf.zzai((zzsf)object);
            }
        }
    }

    public final int zza(zzan zzan2) {
        this.zzQ();
        Object object = zzan2.zzn;
        boolean bl2 = "audio/raw".equals(object);
        int n3 = 2;
        if (bl2) {
            bl2 = zzgd.zzK(zzan2.zzC);
            if (!bl2) {
                w12_0.a(zzan2.zzC, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            int n4 = zzan2.zzC;
            if (n4 != n3) {
                return 1;
            }
            return n3;
        }
        object = this.zzv;
        zzk zzk2 = this.zzy;
        if ((zzan2 = ((zzpp)object).zzb(zzan2, zzk2)) != null) {
            return n3;
        }
        return 0;
    }

    public final long zzb(boolean object) {
        boolean bl2 = this.zzY();
        if (bl2 && !(bl2 = this.zzJ)) {
            float f5;
            Object object2 = this.zzj;
            long l2 = ((zzqz)object2).zza((boolean)object);
            Object object3 = this.zzs;
            long l3 = this.zzM();
            object = ((zzrm)object3).zze;
            l3 = zzgd.zzs(l3, object);
            l2 = Math.min(l2, l3);
            while ((object = ((ArrayDeque)(object3 = this.zzk)).isEmpty()) == 0) {
                object3 = (zzrp)this.zzk.getFirst();
                l3 = ((zzrp)object3).zzc;
                long l4 = l2 - l3;
                object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object < 0) break;
                this.zzA = object3 = (zzrp)this.zzk.remove();
            }
            object3 = this.zzA;
            l3 = ((zzrp)object3).zzc;
            l3 = l2 - l3;
            object3 = ((zzrp)object3).zza;
            zzcl zzcl2 = zzcl.zza;
            object = ((zzcl)object3).equals(zzcl2);
            if (object != 0) {
                object3 = this.zzA;
                l2 = ((zzrp)object3).zzb + l3;
            } else {
                object3 = this.zzk;
                object = ((ArrayDeque)object3).isEmpty();
                if (object != 0) {
                    l2 = this.zzad.zza(l3);
                    object3 = this.zzA;
                    l3 = ((zzrp)object3).zzb;
                    l2 += l3;
                } else {
                    object3 = (zzrp)this.zzk.getFirst();
                    l3 = ((zzrp)object3).zzc - l2;
                    object2 = this.zzA.zza;
                    f5 = ((zzcl)object2).zzc;
                    l2 = zzgd.zzp(l3, f5);
                    l3 = ((zzrp)object3).zzb;
                    l2 = l3 - l2;
                }
            }
            l3 = this.zzad.zzb();
            object3 = this.zzs;
            object = ((zzrm)object3).zze;
            long l7 = zzgd.zzs(l3, object) + l2;
            l2 = this.zzaa;
            object = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (object > 0) {
                object = this.zzs.zze;
                l2 = zzgd.zzs(l3 - l2, object);
                this.zzaa = l3;
                this.zzab = l3 = this.zzab + l2;
                object3 = this.zzac;
                if (object3 == null) {
                    object2 = Looper.myLooper();
                    object3 = new Handler((Looper)object2);
                    this.zzac = object3;
                }
                object3 = this.zzac;
                bl2 = false;
                f5 = 0.0f;
                object3.removeCallbacksAndMessages(null);
                object3 = this.zzac;
                object2 = new zzrg(this);
                long l8 = 100;
                object3.postDelayed((Runnable)object2, l8);
            }
            return l7;
        }
        return Long.MIN_VALUE;
    }

    public final zzcl zzc() {
        return this.zzB;
    }

    public final zzqa zzd(zzan zzan2) {
        boolean bl2 = this.zzX;
        if (bl2) {
            return zzqa.zza;
        }
        zzrd zzrd2 = this.zzae;
        zzk zzk2 = this.zzy;
        return zzrd2.zza(zzan2, zzk2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze(zzan zzan2, int n3, int[] nArray) {
        zzrm zzrm2;
        float f5;
        int n4;
        RoundingMode roundingMode;
        int n7;
        float f6;
        int n8;
        Object object;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        Object object2;
        Object object3;
        zzan zzan3;
        block21: {
            block20: {
                zzrz zzrz2 = this;
                zzan3 = zzan2;
                this.zzQ();
                object3 = zzan2.zzn;
                object2 = "audio/raw";
                n18 = ((String)object2).equals(object3);
                n17 = -1;
                if (n18 == 0) break block20;
                zzeq.zzd(zzgd.zzK(zzan2.zzC));
                n18 = zzan2.zzC;
                n16 = zzan2.zzA;
                n18 = zzgd.zzm(n18, n16);
                Object object4 = new zzgaz();
                Object object5 = this.zzg;
                ((zzgaz)object4).zzh((Iterable)object5);
                object5 = this.zzad.zze();
                ((zzgaz)object4).zzg((Object[])object5);
                object4 = ((zzgaz)object4).zzi();
                object5 = new zzdw((zzgbc)object4);
                object4 = this.zzt;
                n16 = (int)(((zzdw)object5).equals(object4) ? 1 : 0);
                if (n16 != 0) {
                    object5 = this.zzt;
                }
                object4 = zzrz2.zzf;
                n15 = zzan3.zzD;
                n14 = zzan3.zzE;
                ((zzsj)object4).zzq(n15, n14);
                object4 = zzrz2.zze;
                int[] nArray2 = nArray;
                ((zzra)object4).zzo(nArray);
                n15 = zzan3.zzB;
                n14 = zzan3.zzA;
                n10 = zzan3.zzC;
                object4 = new zzdx(n15, n14, n10);
                try {
                    object4 = ((zzdw)object5).zza((zzdx)object4);
                    n15 = ((zzdx)object4).zzd;
                    n14 = ((zzdx)object4).zzb;
                    n16 = ((zzdx)object4).zzc;
                }
                catch (zzdy zzdy2) {
                    object3 = new zzqq(zzdy2, zzan3);
                    throw object3;
                }
                n10 = zzgd.zzh(n16);
                n16 = zzgd.zzm(n15, n16);
                object = object5;
                n8 = n16;
                n16 = 0;
                f6 = 0.0f;
                object4 = null;
                break block21;
            }
            zzgbc zzgbc2 = zzgbc.zzm();
            object3 = new zzdw(zzgbc2);
            n16 = zzan2.zzB;
            Object object6 = zzqa.zza;
            object6 = this.zzv;
            Object object7 = this.zzy;
            if ((object6 = ((zzpp)object6).zzb(zzan2, (zzk)object7)) == null) {
                object2 = String.valueOf(zzan2);
                object2 = "Unable to configure passthrough for: ".concat((String)object2);
                object3 = new zzqq((String)object2, zzan2);
                throw object3;
            }
            object7 = (Integer)((Pair)object6).first;
            n15 = (Integer)object7;
            object6 = (Integer)((Pair)object6).second;
            n8 = (Integer)object6;
            object = object3;
            n14 = n16;
            n10 = n8;
            n18 = -1;
            n16 = 2;
            f6 = 2.8E-45f;
            n8 = -1;
        }
        String string2 = ") for: ";
        if (n15 == 0) {
            n14 = n16;
            object2 = String.valueOf(zzan2);
            StringBuilder stringBuilder = new StringBuilder("Invalid output encoding (mode=");
            stringBuilder.append(n16);
            stringBuilder.append(string2);
            stringBuilder.append((String)object2);
            object2 = stringBuilder.toString();
            object3 = new zzqq((String)object2, zzan3);
            throw object3;
        }
        if (n10 == 0) {
            int n19 = n16;
            float f7 = f6;
            object2 = String.valueOf(zzan2);
            StringBuilder stringBuilder = new StringBuilder("Invalid output channel config (mode=");
            n14 = n16;
            stringBuilder.append(n16);
            stringBuilder.append(string2);
            stringBuilder.append((String)object2);
            object2 = stringBuilder.toString();
            object3 = new zzqq((String)object2, zzan3);
            throw object3;
        }
        int n20 = zzan3.zzj;
        String string3 = "audio/vnd.dts.hd;profile=lbr";
        String string4 = zzan3.zzn;
        int n21 = string3.equals(string4);
        if (n21 != 0 && n20 == n17) {
            n20 = 768000;
        }
        n21 = AudioTrack.getMinBufferSize((int)n14, (int)n10, (int)n15);
        int n22 = -2;
        int n24 = 1;
        if (n21 != n22) {
            n22 = 1;
        } else {
            n22 = 0;
            string3 = null;
        }
        zzeq.zzf(n22 != 0);
        n22 = n8 != n17 ? n8 : 1;
        int n25 = 250000;
        if (n16 != 0) {
            long l2 = 1000000L;
            if (n16 != n24) {
                n24 = 5;
                n7 = 8;
                if (n15 == n24) {
                    n25 = 500000;
                } else if (n15 == n7) {
                    n25 = 1000000;
                    n15 = 8;
                }
                if (n20 != n17) {
                    roundingMode = RoundingMode.CEILING;
                    n7 = zzgds.zza(n20, n7, roundingMode);
                } else {
                    n7 = zzsb.zzb(n15);
                }
                long l3 = n25;
                n4 = n16;
                f5 = f6;
                long l4 = n7;
                l3 = l3 * l4 / l2;
                n7 = zzgea.zzb(l3);
            } else {
                n4 = n16;
                f5 = f6;
                long l7 = zzsb.zzb(n15);
                long l8 = 50000000L;
                l7 = l7 * l8 / l2;
                n7 = zzgea.zzb(l7);
            }
        } else {
            n4 = n16;
            f5 = f6;
            n7 = n21 * 4;
            n17 = zzsb.zza(n25, n14, n22);
            f6 = 1.050974E-39f;
            n16 = zzsb.zza(750000, n14, n22);
            n7 = Math.min(n7, n16);
            n7 = Math.max(n17, n7);
        }
        n20 = n15;
        double d2 = n7;
        n7 = (int)d2;
        n21 = (Math.max(n21, n7) + n22 + -1) / n22 * n22;
        n7 = 0;
        zzrz2.zzX = false;
        n22 = 0;
        string3 = null;
        n24 = 0;
        roundingMode = null;
        object2 = zzrm2;
        zzan3 = zzan2;
        n17 = n18;
        n16 = n4;
        f6 = f5;
        n15 = n14;
        n14 = n10;
        n10 = n20;
        n20 = n21;
        n21 = 0;
        string4 = null;
        zzrm2 = new zzrm(zzan2, n18, n4, n8, n15, n14, n10, n20, (zzdw)object, false, false, false);
        n18 = (int)(this.zzY() ? 1 : 0);
        if (n18 == 0) {
            zzrz2.zzs = zzrm2;
            return;
        }
        zzrz2.zzr = zzrm2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzf() {
        Object object;
        int n3 = this.zzY();
        Object var2_2 = null;
        long l2 = 0L;
        if (n3 != 0) {
            Object object2;
            this.zzD = l2;
            this.zzE = l2;
            this.zzF = l2;
            this.zzG = l2;
            this.zzY = false;
            this.zzH = 0;
            zzcl zzcl2 = this.zzB;
            long l3 = 0L;
            ExecutorService executorService = null;
            long l4 = 0L;
            Object object3 = object2;
            object2 = new zzrp(zzcl2, l4, l3, null);
            this.zzA = object2;
            this.zzK = l2;
            this.zzz = null;
            object3 = this.zzk;
            ((ArrayDeque)object3).clear();
            this.zzM = null;
            this.zzN = 0;
            this.zzO = null;
            this.zzQ = false;
            this.zzP = false;
            this.zzR = false;
            this.zzf.zzp();
            this.zzV();
            object = this.zzj;
            n3 = ((zzqz)object).zzh();
            if (n3 != 0) {
                object = this.zzu;
                object.pause();
            }
            if ((n3 = zzrz.zzZ((AudioTrack)(object = this.zzu))) != 0) {
                object = this.zzl;
                object.getClass();
                object3 = this.zzu;
                ((zzrx)object).zzb((AudioTrack)object3);
            }
            n3 = zzgd.zza;
            zzqp zzqp2 = this.zzs.zzb();
            object = this.zzr;
            if (object != null) {
                this.zzs = object;
                this.zzr = null;
            }
            object = this.zzj;
            ((zzqz)object).zzc();
            n3 = zzgd.zza;
            int n4 = 24;
            if (n3 >= n4 && (object = this.zzx) != null) {
                ((zzrr)object).zzb();
                this.zzx = null;
            }
            zzcl2 = this.zzu;
            zzeu zzeu2 = this.zzi;
            zzqs zzqs2 = this.zzq;
            zzeu2.zzc();
            object = Looper.myLooper();
            Handler handler = new Handler((Looper)object);
            object = zza;
            // MONITORENTER : object
            object3 = zzb;
            if (object3 == null) {
                object3 = "ExoPlayer:AudioTrackReleaseThread";
                zzb = object3 = zzgd.zzE((String)object3);
            }
            zzc = n4 = zzc + 1;
            executorService = zzb;
            object3 = object2;
            object2 = new zzre((AudioTrack)zzcl2, zzqs2, handler, zzqp2, zzeu2);
            executorService.execute((Runnable)object2);
            // MONITOREXIT : object
            this.zzu = null;
        }
        this.zzn.zza();
        this.zzm.zza();
        this.zzaa = l2;
        this.zzab = l2;
        object = this.zzac;
        if (object == null) return;
        object.removeCallbacksAndMessages(null);
    }

    public final void zzg() {
        this.zzI = true;
    }

    public final void zzh() {
        zzqz zzqz2 = null;
        this.zzS = false;
        boolean bl2 = this.zzY();
        if (bl2 && ((bl2 = (zzqz2 = this.zzj).zzk()) || (bl2 = zzrz.zzZ((AudioTrack)(zzqz2 = this.zzu))))) {
            zzqz2 = this.zzu;
            zzqz2.pause();
        }
    }

    public final void zzi() {
        this.zzS = true;
        boolean bl2 = this.zzY();
        if (bl2) {
            this.zzj.zzf();
            AudioTrack audioTrack = this.zzu;
            audioTrack.play();
        }
    }

    public final void zzj() {
        boolean bl2 = this.zzP;
        if (!bl2 && (bl2 = this.zzY()) && (bl2 = this.zzX())) {
            this.zzR();
            this.zzP = bl2 = true;
        }
    }

    public final void zzk() {
        zzpw zzpw2 = this.zzw;
        if (zzpw2 != null) {
            zzpw2.zzi();
        }
    }

    public final void zzl() {
        zzdz zzdz2;
        int n3;
        this.zzf();
        Object object = this.zzg;
        int n4 = object.size();
        for (n3 = 0; n3 < n4; ++n3) {
            zzdz2 = (zzdz)object.get(n3);
            zzdz2.zzf();
        }
        object = this.zzh;
        n4 = object.size();
        for (n3 = 0; n3 < n4; ++n3) {
            zzdz2 = (zzdz)object.get(n3);
            zzdz2.zzf();
        }
        object = this.zzt;
        if (object != null) {
            ((zzdw)object).zzf();
        }
        this.zzS = false;
        this.zzX = false;
    }

    public final void zzm(zzk zzk2) {
        Object object = this.zzy;
        boolean bl2 = ((zzk)object).equals(zzk2);
        if (bl2) {
            return;
        }
        this.zzy = zzk2;
        object = this.zzw;
        if (object != null) {
            ((zzpw)object).zzg(zzk2);
        }
        this.zzf();
    }

    public final void zzn(int n3) {
        int n4 = this.zzT;
        if (n4 != n3) {
            this.zzT = n3;
            this.zzf();
        }
    }

    public final void zzo(zzl zzl2) {
        zzl zzl3 = this.zzU;
        int n3 = zzl3.equals(zzl2);
        if (n3 != 0) {
            return;
        }
        zzl3 = this.zzu;
        if (zzl3 != null) {
            zzl3 = this.zzU;
            n3 = zzl3.zza;
        }
        this.zzU = zzl2;
    }

    public final void zzp(zzer zzer2) {
        this.zzj.zze(zzer2);
    }

    public final void zzq(zzqs zzqs2) {
        this.zzq = zzqs2;
    }

    public final void zzr(int n3, int n4) {
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzrz.zzZ(audioTrack);
        }
    }

    public final void zzs(zzcl zzcl2) {
        zzcl zzcl3;
        float f5 = zzcl2.zzc;
        float f6 = 8.0f;
        f5 = Math.min(f5, f6);
        float f7 = 0.1f;
        f5 = Math.max(f7, f5);
        f6 = Math.min(zzcl2.zzd, f6);
        f6 = Math.max(f7, f6);
        this.zzB = zzcl3 = new zzcl(f5, f6);
        this.zzT(zzcl2);
    }

    public final void zzt(zzpj zzpj2) {
        this.zzp = zzpj2;
    }

    public final void zzu(AudioDeviceInfo audioDeviceInfo) {
        Object object = audioDeviceInfo == null ? null : new zzpx(audioDeviceInfo);
        this.zzV = object;
        object = this.zzw;
        if (object != null) {
            ((zzpw)object).zzh(audioDeviceInfo);
        }
        if ((audioDeviceInfo = this.zzu) != null) {
            object = this.zzV;
            zzri.zza((AudioTrack)audioDeviceInfo, (zzpx)object);
        }
    }

    public final void zzv(boolean bl2) {
        this.zzC = bl2;
        zzcl zzcl2 = this.zzB;
        this.zzT(zzcl2);
    }

    public final void zzw(float f5) {
        float f6 = this.zzL;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.zzL = f5;
            this.zzU();
        }
    }

    /*
     * Exception decompiling
     */
    public final boolean zzx(ByteBuffer var1_1, long var2_2, int var4_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 357->359)] com.google.android.gms.internal.ads.zzqr
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final boolean zzy() {
        long l2;
        Object object;
        int n3;
        int n4 = this.zzY();
        return n4 != 0 && ((n4 = zzgd.zza) < (n3 = 29) || (n4 = (int)(Kk0.b((AudioTrack)(object = this.zzu)) ? 1 : 0)) == 0 || (n4 = (int)(this.zzR ? 1 : 0)) == 0) && (n4 = (int)(((zzqz)(object = this.zzj)).zzg(l2 = this.zzM()) ? 1 : 0)) != 0;
    }

    public final boolean zzz() {
        boolean bl2 = this.zzY();
        boolean bl3 = true;
        if (bl2) {
            bl2 = this.zzP;
            if (bl2) {
                bl2 = this.zzy();
                if (bl2) {
                    return false;
                }
            } else {
                bl3 = false;
            }
        }
        return bl3;
    }
}

