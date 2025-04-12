/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCodec$CryptoException
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.SystemClock
 *  android.os.Trace
 */
package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.gms.internal.ads.zzaep;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfxv;
import com.google.android.gms.internal.ads.zzga;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzih;
import com.google.android.gms.internal.ads.zzik;
import com.google.android.gms.internal.ads.zzim;
import com.google.android.gms.internal.ads.zzin;
import com.google.android.gms.internal.ads.zziw;
import com.google.android.gms.internal.ads.zzix;
import com.google.android.gms.internal.ads.zziy;
import com.google.android.gms.internal.ads.zzjh;
import com.google.android.gms.internal.ads.zzlj;
import com.google.android.gms.internal.ads.zzo;
import com.google.android.gms.internal.ads.zzpj;
import com.google.android.gms.internal.ads.zzsg;
import com.google.android.gms.internal.ads.zzsu;
import com.google.android.gms.internal.ads.zzsv;
import com.google.android.gms.internal.ads.zzti;
import com.google.android.gms.internal.ads.zztk;
import com.google.android.gms.internal.ads.zztl;
import com.google.android.gms.internal.ads.zztm;
import com.google.android.gms.internal.ads.zzto;
import com.google.android.gms.internal.ads.zztp;
import com.google.android.gms.internal.ads.zzts;
import com.google.android.gms.internal.ads.zztt;
import com.google.android.gms.internal.ads.zztu;
import com.google.android.gms.internal.ads.zztx;
import com.google.android.gms.internal.ads.zzud;
import com.google.android.gms.internal.ads.zzvo;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public abstract class zztv
extends zziw {
    private static final byte[] zzb;
    private boolean zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private long zzF;
    private int zzG;
    private int zzH;
    private ByteBuffer zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private int zzP;
    private int zzQ;
    private int zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private long zzV;
    private long zzW;
    private boolean zzX;
    private boolean zzY;
    private boolean zzZ;
    protected zzix zza;
    private zztu zzaa;
    private long zzab;
    private boolean zzac;
    private zzsu zzad;
    private zzsu zzae;
    private final zztl zzc;
    private final zztx zzd;
    private final float zze;
    private final zzin zzf;
    private final zzin zzg;
    private final zzin zzh;
    private final zzti zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzsg zzl;
    private zzan zzm;
    private zzan zzn;
    private MediaCrypto zzo;
    private float zzp;
    private zztm zzq;
    private zzan zzr;
    private MediaFormat zzs;
    private boolean zzt;
    private float zzu;
    private ArrayDeque zzv;
    private zztt zzw;
    private zztp zzx;
    private int zzy;
    private boolean zzz;

    static {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[38];
        byte[] byArray3 = byArray;
        byArray2[0] = 0;
        byArray3[1] = 0;
        byArray2[2] = 1;
        byArray3[3] = 103;
        byArray2[4] = 66;
        byArray3[5] = -64;
        byArray2[6] = 11;
        byArray3[7] = -38;
        byArray2[8] = 37;
        byArray3[9] = -112;
        byArray2[10] = 0;
        byArray3[11] = 0;
        byArray2[12] = 1;
        byArray3[13] = 104;
        byArray2[14] = -50;
        byArray3[15] = 15;
        byArray2[16] = 19;
        byArray3[17] = 32;
        byArray2[18] = 0;
        byArray3[19] = 0;
        byArray2[20] = 1;
        byArray3[21] = 101;
        byArray2[22] = -120;
        byArray3[23] = -124;
        byArray2[24] = 13;
        byArray3[25] = -50;
        byArray2[26] = 113;
        byArray3[27] = 24;
        byArray2[28] = -96;
        byArray3[29] = 0;
        byArray2[30] = 47;
        byArray3[31] = -65;
        byArray2[32] = 28;
        byArray3[33] = 49;
        byArray2[34] = -61;
        byArray3[35] = 39;
        byArray2[36] = 93;
        byArray3[37] = 120;
        zzb = byArray;
    }

    public zztv(int n3, zztl zztl2, zztx object, boolean bl2, float f5) {
        super(n3);
        long l2;
        this.zzc = zztl2;
        this.zzd = object;
        this.zze = f5;
        Object object2 = new zzin(0, 0);
        this.zzf = object2;
        object2 = new zzin(0, 0);
        this.zzg = object2;
        object2 = new zzin(2, 0);
        this.zzh = object2;
        super();
        this.zzi = object2;
        super();
        this.zzj = object;
        this.zzp = 1.0f;
        object = new ArrayDeque();
        this.zzk = object;
        this.zzaa = object = zztu.zza;
        ((zzin)object2).zzi(0);
        object2 = ((zzin)object2).zzc;
        object = ByteOrder.nativeOrder();
        ((ByteBuffer)object2).order((ByteOrder)object);
        this.zzl = object2 = new zzsg();
        this.zzu = -1.0f;
        this.zzy = 0;
        this.zzP = 0;
        this.zzG = n3 = -1;
        this.zzH = n3;
        this.zzF = l2 = -9223372036854775807L;
        this.zzV = l2;
        this.zzW = l2;
        this.zzab = l2;
        this.zzQ = 0;
        this.zzR = 0;
        this.zza = object2 = new zzix();
    }

    public static boolean zzaL(zzan zzan2) {
        int n3 = zzan2.zzH;
        return n3 == 0;
    }

    private final void zzaM() {
        this.zzG = -1;
        this.zzg.zzc = null;
    }

    private final void zzaN() {
        this.zzH = -1;
        this.zzI = null;
    }

    private final void zzaO(zztu zztu2) {
        this.zzaa = zztu2;
        long l2 = zztu2.zzd;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            object = 1;
            this.zzac = object;
        }
    }

    private final void zzaP() {
        zzsu zzsu2 = this.zzae;
        zzsu2.getClass();
        this.zzad = zzsu2;
        this.zzQ = 0;
        this.zzR = 0;
    }

    private final boolean zzaQ() {
        int n3 = this.zzS;
        boolean bl2 = true;
        if (n3 != 0) {
            this.zzQ = bl2;
            n3 = this.zzA;
            if (n3 != 0) {
                this.zzR = 3;
                return false;
            }
            this.zzR = n3 = 2;
        } else {
            this.zzaP();
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zzaR() {
        MediaCodec.CryptoException cryptoException3;
        int n3;
        Object object;
        block34: {
            Object object2;
            block35: {
                int n4;
                int n7;
                block33: {
                    zzin zzin2;
                    long l2;
                    int n8;
                    int n10;
                    Object object3;
                    Object object4;
                    int n14;
                    block32: {
                        long l3;
                        object2 = this.zzq;
                        if (object2 == null) return false;
                        n7 = this.zzQ;
                        n14 = 2;
                        if (n7 == n14) return false;
                        n7 = (int)(this.zzX ? 1 : 0);
                        if (n7) {
                            return false;
                        }
                        n7 = this.zzG;
                        if (n7 < 0) {
                            n7 = object2.zza();
                            this.zzG = n7;
                            if (n7 < 0) {
                                return false;
                            }
                            object4 = this.zzg;
                            object = object2.zzf(n7);
                            ((zzin)object4).zzc = object;
                            object = this.zzg;
                            ((zzin)object).zzb();
                        }
                        if ((n7 = this.zzQ) == (n4 = 1)) {
                            n7 = (int)(this.zzE ? 1 : 0);
                            if (!n7) {
                                this.zzT = n4;
                                n7 = this.zzG;
                                long l4 = 0L;
                                int n15 = 4;
                                boolean bl2 = false;
                                object4 = null;
                                boolean bl3 = false;
                                Object var12_20 = null;
                                object2.zzj(n7, 0, 0, l4, n15);
                                this.zzaM();
                            }
                            this.zzQ = n14;
                            return false;
                        }
                        n7 = (int)(this.zzC ? 1 : 0);
                        if (n7) {
                            this.zzC = false;
                            object = this.zzg.zzc;
                            object.getClass();
                            object4 = zzb;
                            ((ByteBuffer)object).put((byte[])object4);
                            n7 = this.zzG;
                            object2.zzj(n7, 0, 38, 0L, 0);
                            this.zzaM();
                            this.zzS = n4;
                            return n4 != 0;
                        }
                        n7 = this.zzP;
                        if (n7 == n4) {
                            n7 = 0;
                            object = null;
                            while (true) {
                                object4 = this.zzr;
                                object4.getClass();
                                object4 = ((zzan)object4).zzp;
                                n3 = object4.size();
                                if (n7 >= n3) break;
                                object4 = (byte[])this.zzr.zzp.get(n7);
                                object3 = this.zzg.zzc;
                                object3.getClass();
                                ((ByteBuffer)object3).put((byte[])object4);
                                n7 += 1;
                            }
                            this.zzP = n14;
                        }
                        object = this.zzg.zzc;
                        object.getClass();
                        n7 = ((Buffer)object).position();
                        object4 = this.zzcX();
                        try {
                            object3 = this.zzg;
                            n10 = this.zzcV((zzlj)object4, (zzin)object3, 0);
                            n8 = -3;
                            if (n10 != n8) break block32;
                        }
                        catch (zzim zzim2) {
                            this.zzak(zzim2);
                            this.zzaU(0);
                            this.zzah();
                            return n4 != 0;
                        }
                        boolean bl4 = this.zzQ();
                        if (!bl4) return false;
                        this.zzW = l3 = this.zzV;
                        return false;
                    }
                    n8 = -5;
                    if (n10 == n8) {
                        int n16 = this.zzP;
                        if (n16 == n14) {
                            object2 = this.zzg;
                            ((zzin)object2).zzb();
                            this.zzP = n4;
                        }
                        this.zzac((zzlj)object4);
                        return n4 != 0;
                    }
                    object4 = this.zzg;
                    n10 = (int)(((zzih)object4).zzf() ? 1 : 0);
                    if (n10 != 0) {
                        long l7;
                        this.zzW = l7 = this.zzV;
                        n7 = this.zzP;
                        if (n7 == n14) {
                            ((zzin)object4).zzb();
                            this.zzP = n4;
                        }
                        this.zzX = n4;
                        n7 = (int)(this.zzS ? 1 : 0);
                        if (!n7) {
                            this.zzao();
                            return false;
                        }
                        try {
                            n7 = (int)(this.zzE ? 1 : 0);
                            if (n7 != 0) return false;
                            this.zzT = n4;
                            n7 = this.zzG;
                            long l8 = 0L;
                            int n17 = 4;
                            n3 = 0;
                            object4 = null;
                            n10 = 0;
                            object3 = null;
                            object2.zzj(n7, 0, 0, l8, n17);
                            this.zzaM();
                            return false;
                        }
                        catch (MediaCodec.CryptoException cryptoException2) {}
                        object = this.zzm;
                        n3 = zzgd.zzj(cryptoException2.getErrorCode());
                        throw this.zzi(cryptoException2, (zzan)object, false, n3);
                    }
                    n10 = (int)(this.zzS ? 1 : 0);
                    if (n10 == 0 && (n10 = (int)(((zzih)object4).zzg() ? 1 : 0)) == 0) {
                        ((zzin)object4).zzb();
                        int n18 = this.zzP;
                        if (n18 != n14) return n4 != 0;
                        this.zzP = n4;
                        return n4 != 0;
                    }
                    n10 = (int)(((zzin)object4).zzk() ? 1 : 0);
                    if (n10 != 0) {
                        object4 = ((zzin)object4).zzb;
                        ((zzik)object4).zzb(n7);
                    }
                    object = this.zzg;
                    long l12 = ((zzin)object).zze;
                    n7 = (int)(this.zzZ ? 1 : 0);
                    if (n7) {
                        object = this.zzk;
                        n7 = (int)(((ArrayDeque)object).isEmpty() ? 1 : 0);
                        if (!n7) {
                            object = ((zztu)this.zzk.peekLast()).zze;
                            object4 = this.zzm;
                            object4.getClass();
                            ((zzga)object).zzd(l12, object4);
                        } else {
                            object = this.zzaa.zze;
                            object4 = this.zzm;
                            object4.getClass();
                            ((zzga)object).zzd(l12, object4);
                        }
                        this.zzZ = false;
                    }
                    this.zzV = l2 = Math.max(this.zzV, l12);
                    boolean bl5 = this.zzQ();
                    if (bl5 || (bl5 = (zzin2 = this.zzg).zzh())) {
                        this.zzW = l2;
                    }
                    this.zzg.zzj();
                    object = this.zzg;
                    n3 = (int)(((zzih)object).zze() ? 1 : 0);
                    if (n3 != 0) {
                        this.zzaj((zzin)object);
                    }
                    object = this.zzg;
                    this.zzaB((zzin)object);
                    object = this.zzg;
                    this.zzat((zzin)object);
                    if (n10 != 0) {
                        try {
                            n7 = this.zzG;
                            object4 = this.zzg;
                            object3 = ((zzin)object4).zzb;
                            bl5 = false;
                            zzin2 = null;
                            n3 = 0;
                            object4 = null;
                            object2.zzk(n7, 0, (zzik)object3, l12, 0);
                            break block33;
                        }
                        catch (MediaCodec.CryptoException cryptoException3) {
                            break block34;
                        }
                    }
                    n7 = this.zzG;
                    object4 = this.zzg;
                    object4 = ((zzin)object4).zzc;
                    if (object4 == null) break block35;
                    n10 = ((Buffer)object4).limit();
                    bl5 = false;
                    zzin2 = null;
                    n3 = 0;
                    object4 = null;
                    object2.zzj(n7, 0, n10, l12, 0);
                }
                this.zzaM();
                this.zzS = n4;
                this.zzP = 0;
                object2 = this.zza;
                n7 = ((zzix)object2).zzc + n4;
                ((zzix)object2).zzc = n7;
                return n4 != 0;
            }
            boolean bl6 = false;
            object2 = null;
            throw null;
        }
        object = this.zzm;
        n3 = zzgd.zzj(cryptoException3.getErrorCode());
        throw this.zzi(cryptoException3, (zzan)object, false, n3);
    }

    private final boolean zzaS() {
        int n3 = this.zzH;
        return n3 >= 0;
    }

    private final boolean zzaT(long l2, long l3) {
        boolean bl2 = false;
        Object object = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (object < 0) {
            String string2;
            Object object2 = this.zzn;
            boolean bl3 = true;
            if (object2 != null && (object = (Object)Objects.equals(object2 = ((zzan)object2).zzn, string2 = "audio/opus")) != false) {
                boolean bl4 = zzaep.zzf(l2, l3);
                if (!bl4) {
                    return bl3;
                }
            } else {
                bl2 = true;
            }
        }
        return bl2;
    }

    private final boolean zzaU(int n3) {
        zzin zzin2;
        zzin zzin3 = this.zzf;
        zzlj zzlj2 = this.zzcX();
        zzin3.zzb();
        zzin3 = this.zzf;
        n3 |= 4;
        n3 = this.zzcV(zzlj2, zzin3, n3);
        int n4 = -5;
        boolean bl2 = true;
        if (n3 == n4) {
            this.zzac(zzlj2);
            return bl2;
        }
        n4 = -4;
        if (n3 == n4 && (n3 = (int)((zzin2 = this.zzf).zzf() ? 1 : 0)) != 0) {
            this.zzX = bl2;
            this.zzao();
        }
        return false;
    }

    private final boolean zzaV(zzan zzan2) {
        zztm zztm2;
        int n3 = zzgd.zza;
        int n4 = 23;
        float f5 = 3.2E-44f;
        boolean bl2 = true;
        if (n3 >= n4 && (zztm2 = this.zzq) != null) {
            n3 = this.zzR;
            n4 = 3;
            f5 = 4.2E-45f;
            if (n3 != n4 && (n3 = this.zzcU()) != 0) {
                float f6 = this.zzp;
                zzan2.getClass();
                Object object = this.zzT();
                float f7 = this.zzZ(f6, zzan2, (zzan[])object);
                f6 = this.zzu;
                n4 = (int)(f6 == f7 ? 0 : (f6 > f7 ? 1 : -1));
                if (n4 != 0) {
                    float f8;
                    n4 = -1082130432;
                    f5 = -1.0f;
                    float f11 = f7 - f5;
                    Object object2 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                    if (object2 == false) {
                        this.zzae();
                        return false;
                    }
                    n3 = (int)(f6 == f5 ? 0 : (f6 > f5 ? 1 : -1));
                    if (n3 != 0 || (n3 = (int)((f8 = f7 - (f6 = this.zze)) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1))) > 0) {
                        zztm2 = new Bundle();
                        zztm2.putFloat("operating-rate", f7);
                        object = this.zzq;
                        object.getClass();
                        object.zzp((Bundle)zztm2);
                        this.zzu = f7;
                    }
                }
            }
        }
        return bl2;
    }

    private final void zzad() {
        this.zzN = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzM = false;
        this.zzL = false;
        this.zzl.zzb();
    }

    private final void zzae() {
        boolean bl2 = this.zzS;
        if (bl2) {
            this.zzQ = 1;
            this.zzR = 3;
            return;
        }
        this.zzaD();
        this.zzaz();
    }

    private final void zzah() {
        try {
            zztm zztm2 = this.zzq;
            zzeq.zzb(zztm2);
            zztm2.zzi();
            return;
        }
        finally {
            this.zzaE();
        }
    }

    /*
     * Unable to fully structure code
     */
    private final void zzai(zztp var1_1, MediaCrypto var2_2) {
        block67: {
            block61: {
                block66: {
                    block62: {
                        var3_3 = this;
                        var4_4 = var1_1;
                        var5_6 = "createCodec:";
                        var6_7 = this.zzm;
                        var6_7.getClass();
                        var7_8 = var1_1.zza;
                        var8_9 = zzgd.zza;
                        var9_10 = 23;
                        if (var8_9 < var9_10) {
                            var10_11 = -1.0f;
                        } else {
                            var10_11 = this.zzp;
                            var11_12 = this.zzT();
                            var10_11 = this.zzZ(var10_11, (zzan)var6_7, var11_12);
                        }
                        var12_13 = var3_3.zze;
                        var13_14 = var10_11 == var12_13 ? 0 : (var10_11 < var12_13 ? -1 : 1);
                        if (var13_14 <= 0) {
                            var10_11 = -1.0f;
                        }
                        var3_3.zzaC((zzan)var6_7);
                        this.zzh();
                        var14_15 = SystemClock.elapsedRealtime();
                        var16_16 = var3_3.zzaf((zztp)var4_4, (zzan)var6_7, null, var10_11);
                        var17_17 = 31;
                        if (var8_9 >= var17_17) {
                            var18_18 = this.zzn();
                            zzts.zza((zztk)var16_16, (zzpj)var18_18);
                        }
                        var18_18 = new StringBuilder((String)var5_6);
                        var18_18.append((String)var7_8);
                        var5_6 = var18_18.toString();
                        Trace.beginSection((String)var5_6);
                        var5_6 = var3_3.zzc;
                        var3_3.zzq = var5_6 = var5_6.zzd((zztk)var16_16);
                        this.zzh();
                        var19_19 = SystemClock.elapsedRealtime();
                        var21_20 = var4_4.zze((zzan)var6_7);
                        if (var21_20 != 0) break block61;
                        var5_6 = Ex0.a("id=");
                        var22_21 = var6_7.zzb;
                        var5_6.append((String)var22_21);
                        var5_6.append(", mimeType=");
                        var22_21 = var6_7.zzn;
                        var5_6.append((String)var22_21);
                        var22_21 = var6_7.zzm;
                        if (var22_21 != null) {
                            var5_6.append(", container=");
                            var22_21 = var6_7.zzm;
                            var5_6.append((String)var22_21);
                        }
                        if ((var23_22 = var6_7.zzj) != (var24_23 = -1)) {
                            var22_21 = ", bitrate=";
                            var5_6.append((String)var22_21);
                            var23_22 = var6_7.zzj;
                            var5_6.append(var23_22);
                        }
                        if ((var22_21 = var6_7.zzk) != null) {
                            var5_6.append(", codecs=");
                            var22_21 = var6_7.zzk;
                            var5_6.append((String)var22_21);
                        }
                        var22_21 = var6_7.zzq;
                        var25_24 = ",";
                        if (var22_21 == null) break block62;
                        var22_21 = new LinkedHashSet<Object>();
                        var8_9 = 0;
                        var26_25 = 0.0f;
                        var18_18 = null;
                        while (true) {
                            block60: {
                                block65: {
                                    block64: {
                                        block63: {
                                            var27_26 = var6_7.zzq;
                                            var24_23 = var27_26.zzb;
                                            if (var8_9 >= var24_23) break;
                                            var27_26 = var27_26.zza((int)var8_9).zza;
                                            var28_27 = com.google.android.gms.internal.ads.zzo.zzb;
                                            var24_23 = (int)var27_26.equals(var28_27);
                                            if (var24_23 != 0) {
                                                var27_26 = "cenc";
                                                var22_21.add(var27_26);
lbl89:
                                                // 5 sources

                                                while (true) {
                                                    var29_28 = var16_16;
                                                    break block60;
                                                    break;
                                                }
                                            }
                                            var28_27 = com.google.android.gms.internal.ads.zzo.zzc;
                                            var24_23 = (int)var27_26.equals(var28_27);
                                            if (var24_23 == 0) break block63;
                                            var27_26 = "clearkey";
                                            var22_21.add(var27_26);
                                            ** GOTO lbl89
                                        }
                                        var28_27 = com.google.android.gms.internal.ads.zzo.zze;
                                        var24_23 = (int)var27_26.equals(var28_27);
                                        if (var24_23 == 0) break block64;
                                        var27_26 = "playready";
                                        var22_21.add(var27_26);
                                        ** GOTO lbl89
                                    }
                                    var28_27 = com.google.android.gms.internal.ads.zzo.zzd;
                                    var24_23 = (int)var27_26.equals(var28_27);
                                    if (var24_23 == 0) break block65;
                                    var27_26 = "widevine";
                                    var22_21.add(var27_26);
                                    ** GOTO lbl89
                                }
                                var28_27 = com.google.android.gms.internal.ads.zzo.zza;
                                var24_23 = (int)var27_26.equals(var28_27);
                                if (var24_23 != 0) {
                                    var27_26 = "universal";
                                    var22_21.add(var27_26);
                                    ** continue;
                                }
                                var27_26 = var27_26.toString();
                                var29_28 = var16_16;
                                var16_16 = "unknown (";
                                var28_27 = new StringBuilder((String)var16_16);
                                var28_27.append((String)var27_26);
                                var28_27.append(")");
                                var27_26 = var28_27.toString();
                                var22_21.add(var27_26);
                            }
                            ++var8_9;
                            var16_16 = var29_28;
                            var24_23 = -1;
                        }
                        var29_28 = var16_16;
                        var18_18 = ", drm=[";
                        var5_6.append((String)var18_18);
                        zzfxv.zzb((StringBuilder)var5_6, var22_21, var25_24);
                        var8_9 = 93;
                        var26_25 = 1.3E-43f;
                        var5_6.append((char)var8_9);
                        break block66;
                    }
                    var29_28 = var16_16;
                }
                var8_9 = var6_7.zzs;
                var30_29 = -1;
                var31_30 = 0.0f / 0.0f;
                if (var8_9 != var30_29 && (var8_9 = var6_7.zzt) != var30_29) {
                    var5_6.append(", res=");
                    var8_9 = var6_7.zzs;
                    var5_6.append(var8_9);
                    var18_18 = "x";
                    var5_6.append((String)var18_18);
                    var8_9 = var6_7.zzt;
                    var5_6.append(var8_9);
                }
                if ((var18_18 = var6_7.zzz) != null && ((var30_29 = (int)var18_18.zze()) != 0 || (var8_9 = (int)var18_18.zzf()) != 0)) {
                    var5_6.append(", color=");
                    var18_18 = var6_7.zzz.zzd();
                    var5_6.append((String)var18_18);
                }
                var26_25 = var6_7.zzu;
                var30_29 = -1082130432;
                var31_30 = -1.0f;
                cfr_temp_0 = var26_25 - var31_30;
                var8_9 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                if (var8_9 != 0) {
                    var18_18 = ", fps=";
                    var5_6.append((String)var18_18);
                    var26_25 = var6_7.zzu;
                    var5_6.append(var26_25);
                }
                var8_9 = var6_7.zzA;
                var30_29 = -1;
                var31_30 = 0.0f / 0.0f;
                if (var8_9 != var30_29) {
                    var18_18 = ", channels=";
                    var5_6.append((String)var18_18);
                    var8_9 = var6_7.zzA;
                    var5_6.append(var8_9);
                }
                if ((var8_9 = var6_7.zzB) != var30_29) {
                    var18_18 = ", sample_rate=";
                    var5_6.append((String)var18_18);
                    var8_9 = var6_7.zzB;
                    var5_6.append(var8_9);
                }
                if ((var18_18 = var6_7.zze) != null) {
                    var5_6.append(", language=");
                    var18_18 = var6_7.zze;
                    var5_6.append((String)var18_18);
                }
                var18_18 = var6_7.zzd;
                var8_9 = (int)var18_18.isEmpty();
                var27_26 = "]";
                if (var8_9 == 0) {
                    var5_6.append(", labels=[");
                    var18_18 = var6_7.zzd;
                    zzfxv.zzb((StringBuilder)var5_6, (Iterable)var18_18, var25_24);
                    var5_6.append((String)var27_26);
                }
                if ((var8_9 = var6_7.zzf) != 0) {
                    var18_18 = ", selectionFlags=[";
                    var5_6.append((String)var18_18);
                    var8_9 = var6_7.zzf;
                    var16_16 = new ArrayList<Object>();
                    var24_23 = var8_9 & 1;
                    if (var24_23 != 0) {
                        var28_27 = "default";
                        var16_16.add(var28_27);
                    }
                    if ((var8_9 &= (var24_23 = 2)) != 0) {
                        var18_18 = "forced";
                        var16_16.add(var18_18);
                    }
                    zzfxv.zzb((StringBuilder)var5_6, var16_16, var25_24);
                    var5_6.append((String)var27_26);
                }
                if ((var8_9 = var6_7.zzg) != 0) {
                    var18_18 = ", roleFlags=[";
                    var5_6.append((String)var18_18);
                    var8_9 = var6_7.zzg;
                    var16_16 = new ArrayList<Object>();
                    var24_23 = var8_9 & 1;
                    if (var24_23 != 0) {
                        var28_27 = "main";
                        var16_16.add(var28_27);
                    }
                    if ((var24_23 = var8_9 & 2) != 0) {
                        var28_27 = "alt";
                        var16_16.add(var28_27);
                    }
                    if ((var24_23 = var8_9 & 4) != 0) {
                        var28_27 = "supplementary";
                        var16_16.add(var28_27);
                    }
                    if ((var24_23 = var8_9 & 8) != 0) {
                        var28_27 = "commentary";
                        var16_16.add(var28_27);
                    }
                    if ((var24_23 = var8_9 & 16) != 0) {
                        var28_27 = "dub";
                        var16_16.add(var28_27);
                    }
                    if ((var24_23 = var8_9 & 32) != 0) {
                        var28_27 = "emergency";
                        var16_16.add(var28_27);
                    }
                    if ((var24_23 = var8_9 & 64) != 0) {
                        var28_27 = "caption";
                        var16_16.add(var28_27);
                    }
                    if ((var24_23 = var8_9 & 128) != 0) {
                        var28_27 = "subtitle";
                        var16_16.add(var28_27);
                    }
                    if ((var24_23 = var8_9 & 256) != 0) {
                        var28_27 = "sign";
                        var16_16.add(var28_27);
                    }
                    if ((var24_23 = var8_9 & 512) != 0) {
                        var28_27 = "describes-video";
                        var16_16.add(var28_27);
                    }
                    if ((var24_23 = var8_9 & 1024) != 0) {
                        var28_27 = "describes-music";
                        var16_16.add(var28_27);
                    }
                    if ((var24_23 = var8_9 & 2048) != 0) {
                        var28_27 = "enhanced-intelligibility";
                        var16_16.add(var28_27);
                    }
                    if ((var24_23 = var8_9 & 4096) != 0) {
                        var28_27 = "transcribes-dialog";
                        var16_16.add(var28_27);
                    }
                    if ((var24_23 = var8_9 & 8192) != 0) {
                        var28_27 = "easy-read";
                        var16_16.add(var28_27);
                    }
                    if ((var8_9 &= 16384) != 0) {
                        var18_18 = "trick-play";
                        var16_16.add(var18_18);
                    }
                    zzfxv.zzb((StringBuilder)var5_6, var16_16, var25_24);
                    var5_6.append((String)var27_26);
                }
                var5_6 = var5_6.toString();
                var18_18 = Locale.US;
                var25_24 = ", ";
                var5_6 = uc0_0.a("Format exceeds selected codec's capabilities [", (String)var5_6, var25_24, (String)var7_8, (String)var27_26);
                var18_18 = "MediaCodecRenderer";
                zzfk.zzf((String)var18_18, (String)var5_6);
                break block67;
            }
            var29_28 = var16_16;
        }
        var3_3.zzx = var4_4;
        var3_3.zzu = var10_11;
        var3_3.zzr = var6_7;
        var21_20 = zzgd.zza;
        var32_31 = 25;
        var24_23 = 1;
        if (var21_20 <= var32_31 && (var8_9 = (int)(var18_18 = "OMX.Exynos.avc.dec.secure").equals(var7_8)) != 0 && ((var9_10 = (int)(var18_18 = zzgd.zzd).startsWith(var25_24 = "SM-T585")) != 0 || (var9_10 = (int)var18_18.startsWith(var25_24 = "SM-A510")) != 0 || (var9_10 = (int)var18_18.startsWith(var25_24 = "SM-A520")) != 0 || (var8_9 = (int)var18_18.startsWith(var25_24 = "SM-J700")) != 0)) {
            var8_9 = 2;
            var26_25 = 2.8E-45f;
        } else {
            var8_9 = 24;
            var26_25 = 3.4E-44f;
            if (var21_20 >= var8_9 || (var8_9 = (int)(var18_18 = "OMX.Nvidia.h264.decode").equals(var7_8)) == 0 && (var8_9 = (int)(var18_18 = "OMX.Nvidia.h264.decode.secure").equals(var7_8)) == 0) {
                while (true) {
                    var8_9 = 0;
                    var26_25 = 0.0f;
                    var18_18 = null;
                    break;
                }
            } else {
                if ((var9_10 = (int)(var25_24 = "flounder").equals(var18_18 = zzgd.zzb)) == 0 && (var9_10 = (int)(var25_24 = "flounder_lte").equals(var18_18)) == 0 && (var9_10 = (int)(var25_24 = "grouper").equals(var18_18)) == 0 && (var8_9 = (int)(var25_24 = "tilapia").equals(var18_18)) == 0) ** continue;
                var8_9 = 1;
                var26_25 = 1.4E-45f;
            }
        }
        var3_3.zzy = var8_9;
        var18_18 = var3_3.zzr;
        var18_18.getClass();
        var8_9 = 29;
        var26_25 = 4.1E-44f;
        if (var21_20 == var8_9 && (var9_10 = (int)(var25_24 = "c2.android.aac.decoder").equals(var7_8)) != 0) {
            var9_10 = 1;
        } else {
            var9_10 = 0;
            var25_24 = null;
        }
        var3_3.zzz = var9_10;
        var9_10 = 23;
        if (var21_20 > var9_10 || (var9_10 = (int)(var25_24 = "OMX.google.vorbis.decoder").equals(var7_8)) == 0) {
            var9_10 = 0;
            var25_24 = null;
        } else {
            var9_10 = 1;
        }
        var3_3.zzA = var9_10;
        var9_10 = 21;
        if (var21_20 == var9_10 && (var9_10 = (int)(var25_24 = "OMX.google.aac.decoder").equals(var7_8)) != 0) {
            var9_10 = 1;
        } else {
            var9_10 = 0;
            var25_24 = null;
        }
        var3_3.zzB = var9_10;
        var25_24 = var4_4.zza;
        if (var21_20 <= var32_31 && (var32_31 = (int)(var6_7 = "OMX.rk.video_decoder.avc").equals(var25_24)) != 0) {
            while (true) {
                var33_32 = 1;
                break;
            }
        } else {
            if (var21_20 <= var8_9 && ((var21_20 = (int)(var5_6 = "OMX.broadcom.video_decoder.tunnel").equals(var25_24)) != 0 || (var21_20 = (int)(var5_6 = "OMX.broadcom.video_decoder.tunnel.secure").equals(var25_24)) != 0 || (var21_20 = (int)(var5_6 = "OMX.bcm.vdec.avc.tunnel").equals(var25_24)) != 0 || (var21_20 = (int)(var5_6 = "OMX.bcm.vdec.avc.tunnel.secure").equals(var25_24)) != 0 || (var21_20 = (int)(var5_6 = "OMX.bcm.vdec.hevc.tunnel").equals(var25_24)) != 0 || (var21_20 = (int)(var5_6 = "OMX.bcm.vdec.hevc.tunnel.secure").equals(var25_24)) != 0) || (var21_20 = (int)(var5_6 = "Amazon").equals(var6_7 = zzgd.zzc)) != 0 && (var21_20 = (int)(var5_6 = "AFTS").equals(var6_7 = zzgd.zzd)) != 0 && (var33_32 = (int)var4_4.zzf) != 0) ** continue;
            var33_32 = 0;
            var4_4 = null;
        }
        var3_3.zzE = var33_32;
        var4_4 = var3_3.zzq;
        var4_4.getClass();
        var33_32 = this.zzcU();
        var21_20 = 2;
        if (var33_32 == var21_20) {
            this.zzh();
            var34_33 = SystemClock.elapsedRealtime();
            var36_34 = 1000L;
            var3_3.zzF = var34_33 += var36_34;
        }
        var4_4 = var3_3.zza;
        var4_4.zza = var21_20 = var4_4.zza + var24_23;
        var38_35 = var19_19 - var14_15;
        var5_6 = this;
        var6_7 = var7_8;
        var7_8 = var29_28;
        var36_34 = var19_19;
        this.zzal((String)var6_7, var29_28, var19_19, var38_35);
        return;
        finally {
            Trace.endSection();
        }
    }

    private final void zzao() {
        int n3 = this.zzR;
        int n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    this.zzY = n4;
                    this.zzaq();
                    return;
                }
                this.zzaD();
                this.zzaz();
                return;
            }
            this.zzah();
            this.zzaP();
            return;
        }
        this.zzah();
    }

    public void zzC() {
        try {
            this.zzad();
            this.zzaD();
            return;
        }
        finally {
            this.zzae = null;
        }
    }

    public final void zzF(zzan[] zzanArray, long l2, long l3, zzvo zzvo2) {
        long l4;
        long l7;
        long l8;
        long l12;
        zztv zztv2 = this;
        Object object = this.zzaa;
        long l14 = ((zztu)object).zzd;
        long l15 = -9223372036854775807L;
        long l16 = l14 - l15;
        Object object2 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
        if (object2 == false) {
            long l17 = l2;
            object = new zztu(-9223372036854775807L, l2, l3);
            this.zzaO((zztu)object);
            return;
        }
        object = this.zzk;
        boolean bl2 = ((ArrayDeque)object).isEmpty();
        if (bl2 && ((object2 = (l12 = (l14 = this.zzV) - l15) == 0L ? 0 : (l12 < 0L ? -1 : 1)) == false || (l8 = (l7 = (l4 = this.zzab) - l15) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false && (l8 = l4 == l14 ? 0 : (l4 < l14 ? -1 : 1)) >= 0)) {
            long l18 = -9223372036854775807L;
            object = new zztu(l18, l2, l3);
            this.zzaO((zztu)object);
            object = zztv2.zzaa;
            l14 = ((zztu)object).zzd;
            object2 = l14 == l15 ? 0 : (l14 < l15 ? -1 : 1);
            if (object2 != false) {
                this.zzap();
            }
            return;
        }
        object = zztv2.zzk;
        l15 = zztv2.zzV;
        l4 = l2;
        zztu zztu2 = new zztu(l15, l2, l3);
        ((ArrayDeque)object).add(zztu2);
    }

    public void zzM(float f5, float f6) {
        this.zzp = f6;
        zzan zzan2 = this.zzr;
        this.zzaV(zzan2);
    }

    /*
     * Exception decompiling
     */
    public void zzV(long var1_1, long var3_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 34->38)] java.lang.IllegalStateException
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

    public boolean zzW() {
        return this.zzY;
    }

    public boolean zzX() {
        zzan zzan2 = this.zzm;
        boolean bl2 = false;
        if (zzan2 != null) {
            Object object = this.zzS();
            boolean bl3 = true;
            if (object == 0 && (object = this.zzaS()) == 0) {
                long l2 = this.zzF;
                long l3 = -9223372036854775807L;
                long l4 = l2 - l3;
                object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object != 0) {
                    this.zzh();
                    l2 = SystemClock.elapsedRealtime();
                    l3 = this.zzF;
                    object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (object < 0) {
                        return bl3;
                    }
                }
            } else {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int zzY(zzan zzan2) {
        zztx zztx2;
        try {
            zztx2 = this.zzd;
        }
        catch (zzud zzud2) {
            throw this.zzi(zzud2, zzan2, false, 4002);
        }
        return this.zzaa(zztx2, zzan2);
    }

    public float zzZ(float f5, zzan zzan2, zzan[] zzanArray) {
        throw null;
    }

    public void zzaA(long l2) {
        Object object;
        boolean bl2;
        this.zzab = l2;
        while (!(bl2 = ((ArrayDeque)(object = this.zzk)).isEmpty())) {
            object = (zztu)this.zzk.peek();
            long l3 = ((zztu)object).zzb;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 < 0) break;
            object = (zztu)this.zzk.poll();
            object.getClass();
            this.zzaO((zztu)object);
            this.zzap();
        }
    }

    public void zzaB(zzin zzin2) {
    }

    public void zzaC(zzan zzan2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzaD() {
        Throwable throwable2;
        block4: {
            block3: {
                try {
                    int n3;
                    Object object = this.zzq;
                    if (object == null) break block3;
                    object.zzl();
                    object = this.zza;
                    ((zzix)object).zzb = n3 = ((zzix)object).zzb + 1;
                    object = this.zzx;
                    if (object == null) {
                        throw null;
                    }
                    object = ((zztp)object).zza;
                    this.zzam((String)object);
                }
                catch (Throwable throwable2) {
                    break block4;
                }
            }
            this.zzq = null;
            this.zzo = null;
            this.zzad = null;
            this.zzaF();
            return;
        }
        this.zzq = null;
        this.zzo = null;
        this.zzad = null;
        this.zzaF();
        throw throwable2;
    }

    public void zzaE() {
        long l2;
        this.zzaM();
        this.zzaN();
        this.zzF = l2 = -9223372036854775807L;
        this.zzT = false;
        this.zzS = false;
        this.zzC = false;
        this.zzD = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzV = l2;
        this.zzW = l2;
        this.zzab = l2;
        this.zzQ = 0;
        this.zzR = 0;
        boolean bl2 = this.zzO;
        this.zzP = (int)(bl2 ? 1 : 0);
    }

    public final void zzaF() {
        this.zzaE();
        this.zzv = null;
        this.zzx = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = false;
        this.zzU = false;
        this.zzu = -1.0f;
        this.zzy = 0;
        this.zzz = false;
        this.zzA = false;
        this.zzB = false;
        this.zzE = false;
        this.zzO = false;
        this.zzP = 0;
    }

    public final boolean zzaG() {
        boolean bl2 = this.zzaH();
        if (bl2) {
            this.zzaz();
        }
        return bl2;
    }

    public final boolean zzaH() {
        zztm zztm2 = this.zzq;
        if (zztm2 == null) {
            return false;
        }
        int n3 = this.zzR;
        int n4 = 3;
        boolean bl2 = true;
        if (!(n3 == n4 || (n4 = (int)(this.zzz ? 1 : 0)) != 0 && (n4 = (int)(this.zzU ? 1 : 0)) == 0 || (n4 = (int)(this.zzA ? 1 : 0)) != 0 && (n4 = (int)(this.zzT ? 1 : 0)) != 0)) {
            n4 = 2;
            if (n3 == n4) {
                n3 = zzgd.zza;
                n4 = 23;
                boolean bl3 = n3 >= n4;
                zzeq.zzf(bl3);
                if (n3 >= n4) {
                    try {
                        this.zzaP();
                    }
                    catch (zzjh zzjh2) {
                        zzfk.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", zzjh2);
                        this.zzaD();
                        return bl2;
                    }
                }
            }
            this.zzah();
            return false;
        }
        this.zzaD();
        return bl2;
    }

    public final boolean zzaI() {
        return this.zzL;
    }

    public final boolean zzaJ(zzan zzan2) {
        boolean bl2;
        zzsu zzsu2 = this.zzae;
        return zzsu2 == null && (bl2 = this.zzas(zzan2));
    }

    public boolean zzaK(zztp zztp2) {
        return true;
    }

    public abstract int zzaa(zztx var1, zzan var2);

    public zziy zzab(zztp zztp2, zzan zzan2, zzan zzan3) {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public zziy zzac(zzlj object) {
        zztm zztm2;
        int n3;
        int n4;
        int n7;
        Object object2;
        zzan zzan2;
        int n8;
        String string2;
        Object object3;
        zzan zzan3;
        int n10;
        block15: {
            block14: {
                block10: {
                    block18: {
                        boolean bl2;
                        block17: {
                            block16: {
                                block13: {
                                    int n14;
                                    block11: {
                                        int n15;
                                        block12: {
                                            this.zzZ = n10 = 1;
                                            zzan3 = ((zzlj)object).zza;
                                            zzan3.getClass();
                                            object3 = zzan3.zzn;
                                            string2 = null;
                                            if (object3 == null) {
                                                object = new IllegalArgumentException("Sample MIME type is null.");
                                                throw this.zzi((Throwable)object, zzan3, false, 4005);
                                            }
                                            this.zzae = object = ((zzlj)object).zzb;
                                            this.zzm = zzan3;
                                            n8 = this.zzL;
                                            object3 = null;
                                            if (n8 != 0) {
                                                this.zzN = n10;
                                                return null;
                                            }
                                            object = this.zzq;
                                            if (object == null) {
                                                this.zzv = null;
                                                this.zzaz();
                                                return null;
                                            }
                                            object3 = this.zzx;
                                            object3.getClass();
                                            zzan2 = this.zzr;
                                            zzan2.getClass();
                                            zzsu zzsu2 = this.zzad;
                                            object2 = this.zzae;
                                            if (zzsu2 != object2) {
                                                this.zzae();
                                                string2 = ((zztp)object3).zza;
                                                object3 = object;
                                                return new zziy(string2, zzan2, zzan3, 0, 128);
                                            }
                                            if (object2 != zzsu2) {
                                                bl2 = true;
                                            } else {
                                                bl2 = false;
                                                zzsu2 = null;
                                            }
                                            if (!bl2 || (n7 = zzgd.zza) >= (n14 = 23)) {
                                                n7 = 1;
                                            } else {
                                                n7 = 0;
                                                object2 = null;
                                            }
                                            zzeq.zzf(n7 != 0);
                                            object2 = this.zzab((zztp)object3, zzan2, zzan3);
                                            n14 = ((zziy)object2).zzd;
                                            n4 = 3;
                                            if (n14 == 0) break block10;
                                            n15 = 16;
                                            n3 = 2;
                                            if (n14 == n10) break block11;
                                            if (n14 == n3) break block12;
                                            n10 = (int)(this.zzaV(zzan3) ? 1 : 0);
                                            if (n10 == 0) break block13;
                                            this.zzr = zzan3;
                                            if (!bl2 || (n10 = (int)(this.zzaQ() ? 1 : 0)) != 0) break block14;
                                            break block15;
                                        }
                                        n14 = (int)(this.zzaV(zzan3) ? 1 : 0);
                                        if (n14 == 0) break block13;
                                        this.zzO = n10;
                                        this.zzP = n10;
                                        n14 = this.zzy;
                                        if (n14 != n3 && (n14 != n10 || (n14 = zzan3.zzs) != (n15 = zzan2.zzs) || (n14 = zzan3.zzt) != (n15 = zzan2.zzt))) {
                                            n10 = 0;
                                            zztm2 = null;
                                        }
                                        this.zzC = n10;
                                        this.zzr = zzan3;
                                        if (!bl2 || (n10 = (int)(this.zzaQ() ? 1 : 0)) != 0) break block14;
                                        break block15;
                                    }
                                    n14 = (int)(this.zzaV(zzan3) ? 1 : 0);
                                    if (n14 != 0) break block16;
                                }
                                n3 = 16;
                                break block15;
                            }
                            this.zzr = zzan3;
                            if (!bl2) break block17;
                            n10 = (int)(this.zzaQ() ? 1 : 0);
                            if (n10 != 0) break block14;
                            break block15;
                        }
                        bl2 = this.zzS;
                        if (!bl2) break block14;
                        this.zzQ = n10;
                        bl2 = this.zzA;
                        if (!bl2) break block18;
                        this.zzR = n4;
                        break block15;
                    }
                    this.zzR = n10;
                    break block14;
                }
                this.zzae();
            }
            n3 = 0;
        }
        n10 = ((zziy)object2).zzd;
        if (n10 == 0) return object2;
        zztm2 = this.zzq;
        if (zztm2 == object) {
            n8 = this.zzR;
            if (n8 != n4) return object2;
        }
        string2 = ((zztp)object3).zza;
        object3 = object;
        n7 = n3;
        return new zziy(string2, zzan2, zzan3, 0, n3);
    }

    public abstract zztk zzaf(zztp var1, zzan var2, MediaCrypto var3, float var4);

    public abstract List zzag(zztx var1, zzan var2, boolean var3);

    public void zzaj(zzin zzin2) {
        throw null;
    }

    public void zzak(Exception exception) {
        throw null;
    }

    public void zzal(String string2, zztk zztk2, long l2, long l3) {
        throw null;
    }

    public void zzam(String string2) {
        throw null;
    }

    public void zzan(zzan zzan2, MediaFormat mediaFormat) {
        throw null;
    }

    public void zzap() {
    }

    public void zzaq() {
    }

    public abstract boolean zzar(long var1, long var3, zztm var5, ByteBuffer var6, int var7, int var8, int var9, long var10, boolean var12, boolean var13, zzan var14);

    public boolean zzas(zzan zzan2) {
        return false;
    }

    public int zzat(zzin zzin2) {
        return 0;
    }

    public final long zzau() {
        return this.zzaa.zzd;
    }

    public final long zzav() {
        return this.zzaa.zzc;
    }

    public final zztm zzaw() {
        return this.zzq;
    }

    public zzto zzax(Throwable throwable, zztp zztp2) {
        zzto zzto2 = new zzto(throwable, zztp2);
        return zzto2;
    }

    public final zztp zzay() {
        return this.zzx;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzaz() {
        boolean bl2;
        int n3;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        block20: {
            zzsu zzsu2;
            object4 = this.zzq;
            if (object4 != null) return;
            boolean bl3 = this.zzL;
            if (bl3) return;
            object4 = this.zzm;
            if (object4 == null) {
                return;
            }
            int n4 = this.zzaJ((zzan)object4);
            int n7 = 1;
            if (n4 != 0) {
                this.zzad();
                object4 = ((zzan)object4).zzn;
                String string2 = "audio/mp4a-latm";
                n4 = string2.equals(object4);
                if (n4 == 0 && (n4 = (int)((string2 = "audio/mpeg").equals(object4) ? 1 : 0)) == 0 && !(bl3 = (string2 = "audio/opus").equals(object4))) {
                    object4 = this.zzi;
                    ((zzti)object4).zzn(n7);
                } else {
                    object4 = this.zzi;
                    n4 = 32;
                    ((zzti)object4).zzn(n4);
                }
                this.zzL = n7;
                return;
            }
            this.zzad = zzsu2 = this.zzae;
            if (zzsu2 != null) {
                zzeq.zzf(n7 != 0);
                zzsu2 = this.zzad;
                n7 = zzsv.zza;
                zzsu2.zza();
            }
            n4 = 0;
            zzsu2 = null;
            object3 = this.zzad;
            if (object3 != null) {
                object3 = ((zzan)object4).zzn;
                zzeq.zzb(object3);
            }
            object3 = this.zzm;
            Object var7_9 = null;
            if (object3 == null) throw null;
            object2 = this.zzv;
            if (object2 == null) {
                zzud zzud2222;
                block19: {
                    block18: {
                        try {
                            object2 = this.zzd;
                            object2 = this.zzag((zztx)object2, (zzan)object3, false);
                            object2.isEmpty();
                            object = new ArrayDeque();
                            this.zzv = object;
                            n3 = (int)(object2.isEmpty() ? 1 : 0);
                            if (n3 != 0) break block18;
                            object = this.zzv;
                            object2 = object2.get(0);
                            object2 = (zztp)object2;
                            ((ArrayDeque)object).add(object2);
                        }
                        catch (zzud zzud2222) {
                            break block19;
                        }
                    }
                    this.zzw = null;
                    break block20;
                }
                int n8 = -49998;
                object2 = new zztt((zzan)object3, (Throwable)zzud2222, false, n8);
                throw object2;
            }
        }
        if (bl2 = ((ArrayDeque)(object2 = this.zzv)).isEmpty()) {
            n3 = -49999;
            object2 = new zztt((zzan)object3, null, false, n3);
            throw object2;
        }
        object2 = this.zzv;
        if (object2 == null) throw null;
        object = ((ArrayDeque)object2).peekFirst();
        object = (zztp)object;
        {
            Object object5;
            catch (zztt zztt2) {
                throw this.zzi(zztt2, (zzan)object4, false, 4001);
            }
            while ((object5 = this.zzq) == null) {
                object5 = ((ArrayDeque)object2).peekFirst();
                if ((object5 = (zztp)object5) == null) throw null;
                boolean bl4 = this.zzaK((zztp)object5);
                if (!bl4) return;
                try {
                    this.zzai((zztp)object5, null);
                    continue;
                }
                catch (Exception exception) {}
                Object object6 = "MediaCodecRenderer";
                if (object5 != object) throw exception;
                String string3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.";
                try {
                    zzfk.zzf((String)object6, string3);
                    long l2 = 50;
                    Thread.sleep(l2);
                    this.zzai((zztp)object5, null);
                    continue;
                }
                catch (Exception exception) {}
                String string4 = ((zztp)object5).zza;
                String string5 = "Failed to initialize decoder: ";
                string4 = string5.concat(string4);
                zzfk.zzg((String)object6, string4, exception);
                ((ArrayDeque)object2).removeFirst();
                object6 = new zztt((zzan)object3, (Throwable)exception, false, (zztp)object5);
                this.zzak((Exception)object6);
                object5 = this.zzw;
                this.zzw = object5 == null ? object6 : (object5 = zztt.zza((zztt)object5, (zztt)object6));
                boolean bl5 = ((ArrayDeque)object2).isEmpty();
                if (!bl5) continue;
                object3 = this.zzw;
                throw object3;
            }
        }
        this.zzv = null;
    }

    public final int zze() {
        return 8;
    }

    public void zzw() {
        this.zzm = null;
        zztu zztu2 = zztu.zza;
        this.zzaO(zztu2);
        this.zzk.clear();
        this.zzaH();
    }

    public void zzx(boolean bl2, boolean bl3) {
        zzix zzix2;
        this.zza = zzix2 = new zzix();
    }

    public void zzz(long l2, boolean bl2) {
        Object object = null;
        this.zzX = false;
        this.zzY = false;
        int n3 = this.zzL;
        if (n3 != 0) {
            this.zzi.zzb();
            zzin zzin2 = this.zzh;
            zzin2.zzb();
            this.zzM = false;
            object = this.zzl;
            ((zzsg)object).zzb();
        } else {
            this.zzaG();
        }
        object = this.zzaa.zze;
        n3 = ((zzga)object).zza();
        if (n3 > 0) {
            n3 = 1;
            this.zzZ = n3;
        }
        ((zzga)object).zze();
        this.zzk.clear();
    }
}

