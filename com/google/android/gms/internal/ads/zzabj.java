/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaCodecInfo$CodecProfileLevel
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.SystemClock
 *  android.os.Trace
 *  android.util.Pair
 *  android.view.Surface
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzaar;
import com.google.android.gms.internal.ads.zzaba;
import com.google.android.gms.internal.ads.zzabc;
import com.google.android.gms.internal.ads.zzabf;
import com.google.android.gms.internal.ads.zzabg;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzabi;
import com.google.android.gms.internal.ads.zzabm;
import com.google.android.gms.internal.ads.zzabn;
import com.google.android.gms.internal.ads.zzabo;
import com.google.android.gms.internal.ads.zzabp;
import com.google.android.gms.internal.ads.zzabq;
import com.google.android.gms.internal.ads.zzach;
import com.google.android.gms.internal.ads.zzaci;
import com.google.android.gms.internal.ads.zzack;
import com.google.android.gms.internal.ads.zzacl;
import com.google.android.gms.internal.ads.zzacm;
import com.google.android.gms.internal.ads.zzacn;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzdv;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfn;
import com.google.android.gms.internal.ads.zzfv;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzggk;
import com.google.android.gms.internal.ads.zzin;
import com.google.android.gms.internal.ads.zzix;
import com.google.android.gms.internal.ads.zziy;
import com.google.android.gms.internal.ads.zzlj;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zztk;
import com.google.android.gms.internal.ads.zztl;
import com.google.android.gms.internal.ads.zztm;
import com.google.android.gms.internal.ads.zzto;
import com.google.android.gms.internal.ads.zztp;
import com.google.android.gms.internal.ads.zztv;
import com.google.android.gms.internal.ads.zztx;
import com.google.android.gms.internal.ads.zzuj;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;

public final class zzabj
extends zztv
implements zzabp {
    private static final int[] zzb;
    private static boolean zzc;
    private static boolean zzd;
    private zzdv zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private zzabn zzE;
    private zzacm zzF;
    private final Context zze;
    private final zzacn zzf;
    private final zzach zzg;
    private final boolean zzh;
    private final zzabq zzi;
    private final zzabo zzj;
    private zzabi zzk;
    private boolean zzl;
    private boolean zzm;
    private Surface zzn;
    private zzfv zzo;
    private zzabm zzp;
    private boolean zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private int zzx;
    private long zzy;
    private zzdv zzz;

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[9];
        int[] nArray3 = nArray;
        nArray2[0] = 1920;
        nArray3[1] = 1600;
        nArray2[2] = 1440;
        nArray3[3] = 1280;
        nArray2[4] = 960;
        nArray3[5] = 854;
        nArray2[6] = 640;
        nArray3[7] = 540;
        nArray3[8] = 480;
        zzb = nArray;
    }

    public zzabj(Context context, zztl zztl2, zztx zztx2, long l2, boolean bl2, Handler handler, zzaci zzaci2, int n3, float f5) {
        boolean bl3;
        zzabj zzabj2 = this;
        float f6 = 30.0f;
        int n4 = 2;
        Object object = this;
        Object object2 = zztl2;
        super(n4, zztl2, zztx2, false, f6);
        object = context.getApplicationContext();
        this.zze = object;
        object2 = handler;
        Object object3 = new zzach(handler, zzaci2);
        this.zzg = object3;
        object3 = new zzaar((Context)object);
        object3 = ((zzaar)object3).zzc();
        object2 = object3.zzc();
        if (object2 == null) {
            long l3 = 0L;
            object2 = new zzabq((Context)object, this, l3);
            object3.zzs((zzabq)object2);
        }
        zzabj2.zzf = object3;
        object = object3.zzc();
        zzeq.zzb(object);
        zzabj2.zzi = object;
        zzabj2.zzj = object = new zzabo();
        object3 = zzgd.zzc;
        zzabj2.zzh = bl3 = "NVIDIA".equals(object3);
        zzabj2.zzr = 1;
        zzabj2.zzz = object = zzdv.zza;
        zzabj2.zzD = 0;
        zzabj2.zzA = null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final boolean zzaQ(String var0) {
        var1_1 = "OMX.google";
        var2_3 = var0.startsWith(var1_1);
        var3_4 = false;
        if (var2_3 != 0) {
            return false;
        }
        var4_5 = zzabj.class;
        synchronized (var4_5) {
            block182: {
                block185: {
                    block184: {
                        block183: {
                            try {
                                var2_3 = zzabj.zzc;
                                if (var2_3 != 0) ** GOTO lbl1006
                                var2_3 = zzgd.zza;
                                var5_6 = 28;
                                var6_7 = true;
                                if (var2_3 <= var5_6) {
                                    var7_8 = zzgd.zzb;
                                    var8_9 = var7_8.hashCode();
                                }
                                ** GOTO lbl-1000
                            }
                            catch (Throwable var1_2) {
                                break block182;
                            }
                            switch (var8_9) {
                                default: {
                                    break;
                                }
                                case 825323514: {
                                    var9_10 = "machuca";
                                    var10_11 = (int)var7_8.equals(var9_10);
                                    if (var10_11 == 0) break;
                                    var10_11 = 5;
                                    break block183;
                                }
                                case 3415681: {
                                    var9_10 = "once";
                                    var10_11 = (int)var7_8.equals(var9_10);
                                    if (var10_11 == 0) break;
                                    var10_11 = 6;
                                    break block183;
                                }
                                case -64886864: {
                                    var9_10 = "magnolia";
                                    var10_11 = (int)var7_8.equals(var9_10);
                                    if (var10_11 == 0) break;
                                    var10_11 = 4;
                                    break block183;
                                }
                                case -760312546: {
                                    var9_10 = "aquaman";
                                    var10_11 = (int)var7_8.equals(var9_10);
                                    if (var10_11 == 0) break;
                                    var10_11 = 0;
                                    var7_8 = null;
                                    break block183;
                                }
                                case -1012436106: {
                                    var9_10 = "oneday";
                                    var10_11 = (int)var7_8.equals(var9_10);
                                    if (var10_11 == 0) break;
                                    var10_11 = 7;
                                    break block183;
                                }
                                case -1220066608: {
                                    var9_10 = "dangalUHD";
                                    var10_11 = (int)var7_8.equals(var9_10);
                                    if (var10_11 == 0) break;
                                    var10_11 = 2;
                                    break block183;
                                }
                                case -1220081023: {
                                    var9_10 = "dangalFHD";
                                    var10_11 = (int)var7_8.equals(var9_10);
                                    if (var10_11 == 0) break;
                                    var10_11 = 3;
                                    break block183;
                                }
                                case -1339091551: {
                                    var9_10 = "dangal";
                                    var10_11 = (int)var7_8.equals(var9_10);
                                    if (var10_11 == 0) break;
                                    var10_11 = 1;
                                    break block183;
                                }
                            }
                            var10_11 = -1;
                        }
                        switch (var10_11) {
                            default: {
                                break;
                            }
                            case 0: 
                            case 1: 
                            case 2: 
                            case 3: 
                            case 4: 
                            case 5: 
                            case 6: 
                            case 7: lbl-1000:
                            // 5 sources

                            {
                                while (true) {
                                    var3_4 = true;
                                    ** GOTO lbl-1000
                                    break;
                                }
                            }
                        }
lbl-1000:
                        // 2 sources

                        {
                            if (var2_3 <= (var10_11 = 27) && (var8_9 = (int)(var9_10 = "HWEML").equals(var11_12 = zzgd.zzb)) != 0) ** GOTO lbl-1000
                            var9_10 = zzgd.zzd;
                            var12_13 = var9_10.hashCode();
                        }
                        switch (var12_13) {
                            default: {
                                break;
                            }
                            case 2119412532: {
                                var11_12 = "AFTEUFF014";
                                var12_13 = (int)var9_10.equals(var11_12);
                                if (var12_13 == 0) break;
                                var12_13 = 5;
                                break block184;
                            }
                            case 1798172390: {
                                var11_12 = "AFTSO001";
                                var12_13 = (int)var9_10.equals(var11_12);
                                if (var12_13 == 0) break;
                                var12_13 = 8;
                                break block184;
                            }
                            case 1785421876: {
                                var11_12 = "AFTEU014";
                                var12_13 = (int)var9_10.equals(var11_12);
                                if (var12_13 == 0) break;
                                var12_13 = 4;
                                break block184;
                            }
                            case 1785421873: {
                                var11_12 = "AFTEU011";
                                var12_13 = (int)var9_10.equals(var11_12);
                                if (var12_13 == 0) break;
                                var12_13 = 3;
                                break block184;
                            }
                            case 2006371: {
                                var11_12 = "AFTR";
                                var12_13 = (int)var9_10.equals(var11_12);
                                if (var12_13 == 0) break;
                                var12_13 = 2;
                                break block184;
                            }
                            case 2006367: {
                                var11_12 = "AFTN";
                                var12_13 = (int)var9_10.equals(var11_12);
                                if (var12_13 == 0) break;
                                var12_13 = 1;
                                break block184;
                            }
                            case 2006354: {
                                var11_12 = "AFTA";
                                var12_13 = (int)var9_10.equals(var11_12);
                                if (var12_13 == 0) break;
                                var12_13 = 0;
                                var11_12 = null;
                                break block184;
                            }
                            case -321033677: {
                                var11_12 = "AFTKMST12";
                                var12_13 = (int)var9_10.equals(var11_12);
                                if (var12_13 == 0) break;
                                var12_13 = 7;
                                break block184;
                            }
                            case -349662828: {
                                var11_12 = "AFTJMST12";
                                var12_13 = (int)var9_10.equals(var11_12);
                                if (var12_13 == 0) break;
                                var12_13 = 6;
                                break block184;
                            }
                        }
                        var12_13 = -1;
                    }
                    switch (var12_13) {
                        case 0: 
                        case 1: 
                        case 2: 
                        case 3: 
                        case 4: 
                        case 5: 
                        case 6: 
                        case 7: 
                        case 8: {
                            ** GOTO lbl-1000
                        }
                    }
                    var12_13 = 26;
                    if (var2_3 > var12_13) ** GOTO lbl-1000
                    {
                        var1_1 = zzgd.zzb;
                        var13_14 = var1_1.hashCode();
                    }
                    switch (var13_14) {
                        default: {
                            break;
                        }
                        case 2048855701: {
                            var14_15 = "HWWAS-H";
                            var2_3 = (int)var1_1.equals(var14_15);
                            if (var2_3 == 0) break;
                            var5_6 = 66;
                            break block185;
                        }
                        case 2048319463: {
                            var14_16 = "HWVNS-H";
                            var2_3 = (int)var1_1.equals(var14_16);
                            if (var2_3 == 0) break;
                            var5_6 = 65;
                            break block185;
                        }
                        case 2047252157: {
                            var14_17 = "ELUGA_Prim";
                            var2_3 = (int)var1_1.equals(var14_17);
                            if (var2_3 == 0) break;
                            var5_6 = 33;
                            break block185;
                        }
                        case 2047190025: {
                            var14_18 = "ELUGA_Note";
                            var2_3 = (int)var1_1.equals(var14_18);
                            if (var2_3 == 0) break;
                            var5_6 = 32;
                            break block185;
                        }
                        case 2033393791: {
                            var14_19 = "ASUS_X00AD_2";
                            var2_3 = (int)var1_1.equals(var14_19);
                            if (var2_3 == 0) break;
                            var5_6 = 14;
                            break block185;
                        }
                        case 2030379515: {
                            var14_20 = "HWCAM-H";
                            var2_3 = (int)var1_1.equals(var14_20);
                            if (var2_3 == 0) break;
                            var5_6 = 64;
                            break block185;
                        }
                        case 2029784656: {
                            var14_21 = "HWBLN-H";
                            var2_3 = (int)var1_1.equals(var14_21);
                            if (var2_3 == 0) break;
                            var5_6 = 63;
                            break block185;
                        }
                        case 2019281702: {
                            var14_22 = "DM-01K";
                            var2_3 = (int)var1_1.equals(var14_22);
                            if (var2_3 == 0) break;
                            var5_6 = 29;
                            break block185;
                        }
                        case 2006372676: {
                            var14_23 = "BRAVIA_ATV3_4K";
                            var2_3 = (int)var1_1.equals(var14_23);
                            if (var2_3 == 0) break;
                            var5_6 = 19;
                            break block185;
                        }
                        case 1977196784: {
                            var14_24 = "Infinix-X572";
                            var2_3 = (int)var1_1.equals(var14_24);
                            if (var2_3 == 0) break;
                            var5_6 = 69;
                            break block185;
                        }
                        case 1906253259: {
                            var14_25 = "PB2-670M";
                            var2_3 = (int)var1_1.equals(var14_25);
                            if (var2_3 == 0) break;
                            var5_6 = 100;
                            break block185;
                        }
                        case 1865889110: {
                            var14_26 = "santoni";
                            var2_3 = (int)var1_1.equals(var14_26);
                            if (var2_3 == 0) break;
                            var5_6 = 117;
                            break block185;
                        }
                        case 1709443163: {
                            var14_27 = "iball8735_9806";
                            var2_3 = (int)var1_1.equals(var14_27);
                            if (var2_3 == 0) break;
                            var5_6 = 68;
                            break block185;
                        }
                        case 1691544261: {
                            var14_28 = "CPH1715";
                            var2_3 = (int)var1_1.equals(var14_28);
                            if (var2_3 == 0) break;
                            var5_6 = 24;
                            break block185;
                        }
                        case 1691543273: {
                            var14_29 = "CPH1609";
                            var2_3 = (int)var1_1.equals(var14_29);
                            if (var2_3 == 0) break;
                            var5_6 = 23;
                            break block185;
                        }
                        case 1522194893: {
                            var14_30 = "woods_f";
                            var2_3 = (int)var1_1.equals(var14_30);
                            if (var2_3 == 0) break;
                            var5_6 = 133;
                            break block185;
                        }
                        case 1349174697: {
                            var14_31 = "htc_e56ml_dtul";
                            var2_3 = (int)var1_1.equals(var14_31);
                            if (var2_3 == 0) break;
                            var5_6 = 61;
                            break block185;
                        }
                        case 1306947716: {
                            var14_32 = "EverStar_S";
                            var2_3 = (int)var1_1.equals(var14_32);
                            if (var2_3 == 0) break;
                            var5_6 = 35;
                            break block185;
                        }
                        case 1280332038: {
                            var14_33 = "hwALE-H";
                            var2_3 = (int)var1_1.equals(var14_33);
                            if (var2_3 == 0) break;
                            var5_6 = 62;
                            break block185;
                        }
                        case 1176899427: {
                            var14_34 = "itel_S41";
                            var2_3 = (int)var1_1.equals(var14_34);
                            if (var2_3 == 0) break;
                            var5_6 = 71;
                            break block185;
                        }
                        case 1150207623: {
                            var14_35 = "LS-5017";
                            var2_3 = (int)var1_1.equals(var14_35);
                            if (var2_3 == 0) break;
                            var5_6 = 78;
                            break block185;
                        }
                        case 1060579533: {
                            var14_36 = "panell_d";
                            var2_3 = (int)var1_1.equals(var14_36);
                            if (var2_3 == 0) break;
                            var5_6 = 96;
                            break block185;
                        }
                        case 958008161: {
                            var14_37 = "j2xlteins";
                            var2_3 = (int)var1_1.equals(var14_37);
                            if (var2_3 == 0) break;
                            var5_6 = 72;
                            break block185;
                        }
                        case 917340916: {
                            var14_38 = "A7000plus";
                            var2_3 = (int)var1_1.equals(var14_38);
                            if (var2_3 == 0) break;
                            var5_6 = 10;
                            break block185;
                        }
                        case 835649806: {
                            var14_39 = "manning";
                            var2_3 = (int)var1_1.equals(var14_39);
                            if (var2_3 == 0) break;
                            var5_6 = 81;
                            break block185;
                        }
                        case 794040393: {
                            var14_40 = "GIONEE_WBL7519";
                            var2_3 = (int)var1_1.equals(var14_40);
                            if (var2_3 == 0) break;
                            var5_6 = 59;
                            break block185;
                        }
                        case 794038622: {
                            var14_41 = "GIONEE_WBL7365";
                            var2_3 = (int)var1_1.equals(var14_41);
                            if (var2_3 == 0) break;
                            var5_6 = 58;
                            break block185;
                        }
                        case 793982701: {
                            var14_42 = "GIONEE_WBL5708";
                            var2_3 = (int)var1_1.equals(var14_42);
                            if (var2_3 == 0) break;
                            var5_6 = 57;
                            break block185;
                        }
                        case 507412548: {
                            var14_43 = "QM16XE_U";
                            var2_3 = (int)var1_1.equals(var14_43);
                            if (var2_3 == 0) break;
                            var5_6 = 114;
                            break block185;
                        }
                        case 407160593: {
                            var14_44 = "Pixi5-10_4G";
                            var2_3 = (int)var1_1.equals(var14_44);
                            if (var2_3 == 0) break;
                            var5_6 = 106;
                            break block185;
                        }
                        case 316246818: {
                            var14_45 = "TB3-850M";
                            var2_3 = (int)var1_1.equals(var14_45);
                            if (var2_3 == 0) break;
                            var5_6 = 125;
                            break block185;
                        }
                        case 316246811: {
                            var14_46 = "TB3-850F";
                            var2_3 = (int)var1_1.equals(var14_46);
                            if (var2_3 == 0) break;
                            var5_6 = 124;
                            break block185;
                        }
                        case 316215116: {
                            var14_47 = "TB3-730X";
                            var2_3 = (int)var1_1.equals(var14_47);
                            if (var2_3 == 0) break;
                            var5_6 = 123;
                            break block185;
                        }
                        case 316215098: {
                            var14_48 = "TB3-730F";
                            var2_3 = (int)var1_1.equals(var14_48);
                            if (var2_3 == 0) break;
                            var5_6 = 122;
                            break block185;
                        }
                        case 308517133: {
                            var14_49 = "A7020a48";
                            var2_3 = (int)var1_1.equals(var14_49);
                            if (var2_3 == 0) break;
                            var5_6 = 12;
                            break block185;
                        }
                        case 307593612: {
                            var14_50 = "A7010a48";
                            var2_3 = (int)var1_1.equals(var14_50);
                            if (var2_3 == 0) break;
                            var5_6 = 11;
                            break block185;
                        }
                        case 287431619: {
                            var14_51 = "griffin";
                            var2_3 = (int)var1_1.equals(var14_51);
                            if (var2_3 == 0) break;
                            var5_6 = 60;
                            break block185;
                        }
                        case 245388979: {
                            var14_52 = "marino_f";
                            var2_3 = (int)var1_1.equals(var14_52);
                            if (var2_3 == 0) break;
                            var5_6 = 82;
                            break block185;
                        }
                        case 182191441: {
                            var14_53 = "CPY83_I00";
                            var2_3 = (int)var1_1.equals(var14_53);
                            if (var2_3 == 0) break;
                            var5_6 = 25;
                            break block185;
                        }
                        case 165221241: {
                            var14_54 = "A2016a40";
                            var2_3 = (int)var1_1.equals(var14_54);
                            if (var2_3 == 0) break;
                            var5_6 = 8;
                            break block185;
                        }
                        case 102844228: {
                            var14_55 = "le_x6";
                            var2_3 = (int)var1_1.equals(var14_55);
                            if (var2_3 == 0) break;
                            var5_6 = 77;
                            break block185;
                        }
                        case 101370885: {
                            var14_56 = "l5460";
                            var2_3 = (int)var1_1.equals(var14_56);
                            if (var2_3 == 0) break;
                            var5_6 = 76;
                            break block185;
                        }
                        case 98715550: {
                            var14_57 = "i9031";
                            var2_3 = (int)var1_1.equals(var14_57);
                            if (var2_3 == 0) break;
                            var5_6 = 67;
                            break block185;
                        }
                        case 82882791: {
                            var14_58 = "X3_HK";
                            var2_3 = (int)var1_1.equals(var14_58);
                            if (var2_3 == 0) break;
                            var5_6 = 135;
                            break block185;
                        }
                        case 80963634: {
                            var14_59 = "V23GB";
                            var2_3 = (int)var1_1.equals(var14_59);
                            if (var2_3 == 0) break;
                            var5_6 = 128;
                            break block185;
                        }
                        case 76404911: {
                            var14_60 = "Q4310";
                            var2_3 = (int)var1_1.equals(var14_60);
                            if (var2_3 == 0) break;
                            var5_6 = 112;
                            break block185;
                        }
                        case 76404105: {
                            var14_61 = "Q4260";
                            var2_3 = (int)var1_1.equals(var14_61);
                            if (var2_3 == 0) break;
                            var5_6 = 110;
                            break block185;
                        }
                        case 76402249: {
                            var14_62 = "PRO7S";
                            var2_3 = (int)var1_1.equals(var14_62);
                            if (var2_3 == 0) break;
                            var5_6 = 108;
                            break block185;
                        }
                        case 66216390: {
                            var14_63 = "F3311";
                            var2_3 = (int)var1_1.equals(var14_63);
                            if (var2_3 == 0) break;
                            var5_6 = 48;
                            break block185;
                        }
                        case 66215433: {
                            var14_64 = "F3215";
                            var2_3 = (int)var1_1.equals(var14_64);
                            if (var2_3 == 0) break;
                            var5_6 = 47;
                            break block185;
                        }
                        case 66215431: {
                            var14_65 = "F3213";
                            var2_3 = (int)var1_1.equals(var14_65);
                            if (var2_3 == 0) break;
                            var5_6 = 46;
                            break block185;
                        }
                        case 66215429: {
                            var14_66 = "F3211";
                            var2_3 = (int)var1_1.equals(var14_66);
                            if (var2_3 == 0) break;
                            var5_6 = 45;
                            break block185;
                        }
                        case 66214473: {
                            var14_67 = "F3116";
                            var2_3 = (int)var1_1.equals(var14_67);
                            if (var2_3 == 0) break;
                            var5_6 = 44;
                            break block185;
                        }
                        case 66214470: {
                            var14_68 = "F3113";
                            var2_3 = (int)var1_1.equals(var14_68);
                            if (var2_3 == 0) break;
                            var5_6 = 43;
                            break block185;
                        }
                        case 66214468: {
                            var14_69 = "F3111";
                            var2_3 = (int)var1_1.equals(var14_69);
                            if (var2_3 == 0) break;
                            var5_6 = 42;
                            break block185;
                        }
                        case 65355429: {
                            var14_70 = "E5643";
                            var2_3 = (int)var1_1.equals(var14_70);
                            if (var2_3 == 0) break;
                            var5_6 = 30;
                            break block185;
                        }
                        case 61542055: {
                            var14_71 = "A1601";
                            var2_3 = (int)var1_1.equals(var14_71);
                            if (var2_3 == 0) break;
                            var5_6 = 7;
                            break block185;
                        }
                        case 55178625: {
                            var14_72 = "Aura_Note_2";
                            var2_3 = (int)var1_1.equals(var14_72);
                            if (var2_3 == 0) break;
                            var5_6 = 15;
                            break block185;
                        }
                        case 51350594: {
                            var14_73 = "602LV";
                            var2_3 = (int)var1_1.equals(var14_73);
                            if (var2_3 == 0) break;
                            var5_6 = 4;
                            break block185;
                        }
                        case 51349633: {
                            var14_74 = "601LV";
                            var2_3 = (int)var1_1.equals(var14_74);
                            if (var2_3 == 0) break;
                            var5_6 = 3;
                            break block185;
                        }
                        case 41325051: {
                            var14_75 = "MEIZU_M5";
                            var2_3 = (int)var1_1.equals(var14_75);
                            if (var2_3 == 0) break;
                            var5_6 = 83;
                            break block185;
                        }
                        case 3386211: {
                            var14_76 = "p212";
                            var2_3 = (int)var1_1.equals(var14_76);
                            if (var2_3 == 0) break;
                            var5_6 = 92;
                            break block185;
                        }
                        case 0x332327: {
                            var14_77 = "mido";
                            var2_3 = (int)var1_1.equals(var14_77);
                            if (var2_3 == 0) break;
                            var5_6 = 85;
                            break block185;
                        }
                        case 3284551: {
                            var14_78 = "kate";
                            var2_3 = (int)var1_1.equals(var14_78);
                            if (var2_3 == 0) break;
                            var5_6 = 75;
                            break block185;
                        }
                        case 3154429: {
                            var14_79 = "fugu";
                            var2_3 = (int)var1_1.equals(var14_79);
                            if (var2_3 == 0) break;
                            var5_6 = 50;
                            break block185;
                        }
                        case 2689555: {
                            var14_80 = "XE2X";
                            var2_3 = (int)var1_1.equals(var14_80);
                            if (var2_3 == 0) break;
                            var5_6 = 136;
                            break block185;
                        }
                        case 2464648: {
                            var14_81 = "Q427";
                            var2_3 = (int)var1_1.equals(var14_81);
                            if (var2_3 == 0) break;
                            var5_6 = 111;
                            break block185;
                        }
                        case 2463773: {
                            var14_82 = "Q350";
                            var2_3 = (int)var1_1.equals(var14_82);
                            if (var2_3 == 0) break;
                            var5_6 = 109;
                            break block185;
                        }
                        case 0x252F5F: {
                            var14_83 = "P681";
                            var2_3 = (int)var1_1.equals(var14_83);
                            if (var2_3 == 0) break;
                            var5_6 = 93;
                            break block185;
                        }
                        case 2133184: {
                            var14_84 = "F04J";
                            var2_3 = (int)var1_1.equals(var14_84);
                            if (var2_3 == 0) break;
                            var5_6 = 41;
                            break block185;
                        }
                        case 2133182: {
                            var14_85 = "F04H";
                            var2_3 = (int)var1_1.equals(var14_85);
                            if (var2_3 == 0) break;
                            var5_6 = 40;
                            break block185;
                        }
                        case 2133151: {
                            var14_86 = "F03H";
                            var2_3 = (int)var1_1.equals(var14_86);
                            if (var2_3 == 0) break;
                            var5_6 = 39;
                            break block185;
                        }
                        case 2133120: {
                            var14_87 = "F02H";
                            var2_3 = (int)var1_1.equals(var14_87);
                            if (var2_3 == 0) break;
                            var5_6 = 38;
                            break block185;
                        }
                        case 2133091: {
                            var14_88 = "F01J";
                            var2_3 = (int)var1_1.equals(var14_88);
                            if (var2_3 == 0) break;
                            var5_6 = 37;
                            break block185;
                        }
                        case 2133089: {
                            var14_89 = "F01H";
                            var2_3 = (int)var1_1.equals(var14_89);
                            if (var2_3 == 0) break;
                            var5_6 = 36;
                            break block185;
                        }
                        case 1514185: {
                            var14_90 = "1714";
                            var2_3 = (int)var1_1.equals(var14_90);
                            if (var2_3 == 0) break;
                            var5_6 = 2;
                            break block185;
                        }
                        case 1514184: {
                            var14_91 = "1713";
                            var2_3 = (int)var1_1.equals(var14_91);
                            if (var2_3 == 0) break;
                            var5_6 = 1;
                            break block185;
                        }
                        case 1513190: {
                            var14_92 = "1601";
                            var2_3 = (int)var1_1.equals(var14_92);
                            if (var2_3 == 0) break;
                            var5_6 = 0;
                            var14_92 = null;
                            break block185;
                        }
                        case 101481: {
                            var14_93 = "flo";
                            var2_3 = (int)var1_1.equals(var14_93);
                            if (var2_3 == 0) break;
                            var5_6 = 49;
                            break block185;
                        }
                        case 99329: {
                            var15_154 = "deb";
                            var2_3 = (int)var1_1.equals(var15_154);
                            if (var2_3 == 0) break;
                            break block185;
                        }
                        case 98848: {
                            var14_94 = "cv3";
                            var2_3 = (int)var1_1.equals(var14_94);
                            if (var2_3 == 0) break;
                            var5_6 = 27;
                            break block185;
                        }
                        case 98846: {
                            var14_95 = "cv1";
                            var2_3 = (int)var1_1.equals(var14_95);
                            if (var2_3 == 0) break;
                            var5_6 = 26;
                            break block185;
                        }
                        case 88274: {
                            var14_96 = "Z80";
                            var2_3 = (int)var1_1.equals(var14_96);
                            if (var2_3 == 0) break;
                            var5_6 = 139;
                            break block185;
                        }
                        case 80618: {
                            var14_97 = "QX1";
                            var2_3 = (int)var1_1.equals(var14_97);
                            if (var2_3 == 0) break;
                            var5_6 = 115;
                            break block185;
                        }
                        case 79305: {
                            var14_98 = "PLE";
                            var2_3 = (int)var1_1.equals(var14_98);
                            if (var2_3 == 0) break;
                            var5_6 = 107;
                            break block185;
                        }
                        case 78669: {
                            var14_99 = "P85";
                            var2_3 = (int)var1_1.equals(var14_99);
                            if (var2_3 == 0) break;
                            var5_6 = 94;
                            break block185;
                        }
                        case 76779: {
                            var14_100 = "MX6";
                            var2_3 = (int)var1_1.equals(var14_100);
                            if (var2_3 == 0) break;
                            var5_6 = 86;
                            break block185;
                        }
                        case 75739: {
                            var14_101 = "M5c";
                            var2_3 = (int)var1_1.equals(var14_101);
                            if (var2_3 == 0) break;
                            var5_6 = 80;
                            break block185;
                        }
                        case 75537: {
                            var14_102 = "M04";
                            var2_3 = (int)var1_1.equals(var14_102);
                            if (var2_3 == 0) break;
                            var5_6 = 79;
                            break block185;
                        }
                        case 73405: {
                            var14_103 = "JGZ";
                            var2_3 = (int)var1_1.equals(var14_103);
                            if (var2_3 == 0) break;
                            var5_6 = 73;
                            break block185;
                        }
                        case 3483: {
                            var14_104 = "mh";
                            var2_3 = (int)var1_1.equals(var14_104);
                            if (var2_3 == 0) break;
                            var5_6 = 84;
                            break block185;
                        }
                        case 3091: {
                            var14_105 = "b5";
                            var2_3 = (int)var1_1.equals(var14_105);
                            if (var2_3 == 0) break;
                            var5_6 = 16;
                            break block185;
                        }
                        case 2719: {
                            var14_106 = "V5";
                            var2_3 = (int)var1_1.equals(var14_106);
                            if (var2_3 == 0) break;
                            var5_6 = 129;
                            break block185;
                        }
                        case 2715: {
                            var14_107 = "V1";
                            var2_3 = (int)var1_1.equals(var14_107);
                            if (var2_3 == 0) break;
                            var5_6 = 127;
                            break block185;
                        }
                        case 2564: {
                            var14_108 = "Q5";
                            var2_3 = (int)var1_1.equals(var14_108);
                            if (var2_3 == 0) break;
                            var5_6 = 113;
                            break block185;
                        }
                        case 2126: {
                            var14_109 = "C1";
                            var2_3 = (int)var1_1.equals(var14_109);
                            if (var2_3 == 0) break;
                            var5_6 = 20;
                            break block185;
                        }
                        case -56598463: {
                            var14_110 = "woods_fn";
                            var2_3 = (int)var1_1.equals(var14_110);
                            if (var2_3 == 0) break;
                            var5_6 = 134;
                            break block185;
                        }
                        case -173639913: {
                            var14_111 = "ELUGA_A3_Pro";
                            var2_3 = (int)var1_1.equals(var14_111);
                            if (var2_3 == 0) break;
                            var5_6 = 31;
                            break block185;
                        }
                        case -277133239: {
                            var14_112 = "Z12_PRO";
                            var2_3 = (int)var1_1.equals(var14_112);
                            if (var2_3 == 0) break;
                            var5_6 = 138;
                            break block185;
                        }
                        case -282781963: {
                            var14_113 = "BLACK-1X";
                            var2_3 = (int)var1_1.equals(var14_113);
                            if (var2_3 == 0) break;
                            var5_6 = 17;
                            break block185;
                        }
                        case -290434366: {
                            var14_114 = "taido_row";
                            var2_3 = (int)var1_1.equals(var14_114);
                            if (var2_3 == 0) break;
                            var5_6 = 121;
                            break block185;
                        }
                        case -430914369: {
                            var14_115 = "Pixi4-7_3G";
                            var2_3 = (int)var1_1.equals(var14_115);
                            if (var2_3 == 0) break;
                            var5_6 = 105;
                            break block185;
                        }
                        case -521118391: {
                            var14_116 = "GIONEE_GBL7360";
                            var2_3 = (int)var1_1.equals(var14_116);
                            if (var2_3 == 0) break;
                            var5_6 = 53;
                            break block185;
                        }
                        case -575125681: {
                            var14_117 = "GiONEE_CBL7513";
                            var2_3 = (int)var1_1.equals(var14_117);
                            if (var2_3 == 0) break;
                            var5_6 = 51;
                            break block185;
                        }
                        case -782144577: {
                            var14_118 = "OnePlus5T";
                            var2_3 = (int)var1_1.equals(var14_118);
                            if (var2_3 == 0) break;
                            var5_6 = 91;
                            break block185;
                        }
                        case -788334647: {
                            var14_119 = "whyred";
                            var2_3 = (int)var1_1.equals(var14_119);
                            if (var2_3 == 0) break;
                            var5_6 = 132;
                            break block185;
                        }
                        case -794946968: {
                            var14_120 = "watson";
                            var2_3 = (int)var1_1.equals(var14_120);
                            if (var2_3 == 0) break;
                            var5_6 = 131;
                            break block185;
                        }
                        case -797483286: {
                            var14_121 = "SVP-DTV15";
                            var2_3 = (int)var1_1.equals(var14_121);
                            if (var2_3 == 0) break;
                            var5_6 = 119;
                            break block185;
                        }
                        case -821392978: {
                            var14_122 = "A7000-a";
                            var2_3 = (int)var1_1.equals(var14_122);
                            if (var2_3 == 0) break;
                            var5_6 = 9;
                            break block185;
                        }
                        case -842500323: {
                            var14_123 = "nicklaus_f";
                            var2_3 = (int)var1_1.equals(var14_123);
                            if (var2_3 == 0) break;
                            var5_6 = 88;
                            break block185;
                        }
                        case -879245230: {
                            var14_124 = "tcl_eu";
                            var2_3 = (int)var1_1.equals(var14_124);
                            if (var2_3 == 0) break;
                            var5_6 = 126;
                            break block185;
                        }
                        case -958336948: {
                            var14_125 = "ELUGA_Ray_X";
                            var2_3 = (int)var1_1.equals(var14_125);
                            if (var2_3 == 0) break;
                            var5_6 = 34;
                            break block185;
                        }
                        case -965403638: {
                            var14_126 = "s905x018";
                            var2_3 = (int)var1_1.equals(var14_126);
                            if (var2_3 == 0) break;
                            var5_6 = 120;
                            break block185;
                        }
                        case -993250458: {
                            var14_127 = "A10-70L";
                            var2_3 = (int)var1_1.equals(var14_127);
                            if (var2_3 == 0) break;
                            var5_6 = 6;
                            break block185;
                        }
                        case -993250464: {
                            var14_128 = "A10-70F";
                            var2_3 = (int)var1_1.equals(var14_128);
                            if (var2_3 == 0) break;
                            var5_6 = 5;
                            break block185;
                        }
                        case -1052835013: {
                            var14_129 = "namath";
                            var2_3 = (int)var1_1.equals(var14_129);
                            if (var2_3 == 0) break;
                            var5_6 = 87;
                            break block185;
                        }
                        case -1139198265: {
                            var14_130 = "Slate_Pro";
                            var2_3 = (int)var1_1.equals(var14_130);
                            if (var2_3 == 0) break;
                            var5_6 = 118;
                            break block185;
                        }
                        case -1180384755: {
                            var14_131 = "iris60";
                            var2_3 = (int)var1_1.equals(var14_131);
                            if (var2_3 == 0) break;
                            var5_6 = 70;
                            break block185;
                        }
                        case -1217592143: {
                            var14_132 = "BRAVIA_ATV2";
                            var2_3 = (int)var1_1.equals(var14_132);
                            if (var2_3 == 0) break;
                            var5_6 = 18;
                            break block185;
                        }
                        case -1320080169: {
                            var14_133 = "GiONEE_GBL7319";
                            var2_3 = (int)var1_1.equals(var14_133);
                            if (var2_3 == 0) break;
                            var5_6 = 52;
                            break block185;
                        }
                        case -1481772729: {
                            var14_134 = "panell_dt";
                            var2_3 = (int)var1_1.equals(var14_134);
                            if (var2_3 == 0) break;
                            var5_6 = 99;
                            break block185;
                        }
                        case -1481772730: {
                            var14_135 = "panell_ds";
                            var2_3 = (int)var1_1.equals(var14_135);
                            if (var2_3 == 0) break;
                            var5_6 = 98;
                            break block185;
                        }
                        case -1481772737: {
                            var14_136 = "panell_dl";
                            var2_3 = (int)var1_1.equals(var14_136);
                            if (var2_3 == 0) break;
                            var5_6 = 97;
                            break block185;
                        }
                        case -1554255044: {
                            var14_137 = "vernee_M5";
                            var2_3 = (int)var1_1.equals(var14_137);
                            if (var2_3 == 0) break;
                            var5_6 = 130;
                            break block185;
                        }
                        case -1600724499: {
                            var14_138 = "pacificrim";
                            var2_3 = (int)var1_1.equals(var14_138);
                            if (var2_3 == 0) break;
                            var5_6 = 95;
                            break block185;
                        }
                        case -1615810839: {
                            var14_139 = "Phantom6";
                            var2_3 = (int)var1_1.equals(var14_139);
                            if (var2_3 == 0) break;
                            var5_6 = 104;
                            break block185;
                        }
                        case -1680025915: {
                            var14_140 = "ComioS1";
                            var2_3 = (int)var1_1.equals(var14_140);
                            if (var2_3 == 0) break;
                            var5_6 = 21;
                            break block185;
                        }
                        case -1696512866: {
                            var14_141 = "XT1663";
                            var2_3 = (int)var1_1.equals(var14_141);
                            if (var2_3 == 0) break;
                            var5_6 = 137;
                            break block185;
                        }
                        case -1885099851: {
                            var14_142 = "RAIJIN";
                            var2_3 = (int)var1_1.equals(var14_142);
                            if (var2_3 == 0) break;
                            var5_6 = 116;
                            break block185;
                        }
                        case -1931988508: {
                            var14_143 = "AquaPowerM";
                            var2_3 = (int)var1_1.equals(var14_143);
                            if (var2_3 == 0) break;
                            var5_6 = 13;
                            break block185;
                        }
                        case -1936688065: {
                            var14_144 = "PGN611";
                            var2_3 = (int)var1_1.equals(var14_144);
                            if (var2_3 == 0) break;
                            var5_6 = 103;
                            break block185;
                        }
                        case -1936688066: {
                            var14_145 = "PGN610";
                            var2_3 = (int)var1_1.equals(var14_145);
                            if (var2_3 == 0) break;
                            var5_6 = 102;
                            break block185;
                        }
                        case -1936688988: {
                            var14_146 = "PGN528";
                            var2_3 = (int)var1_1.equals(var14_146);
                            if (var2_3 == 0) break;
                            var5_6 = 101;
                            break block185;
                        }
                        case -1978990237: {
                            var14_147 = "NX573J";
                            var2_3 = (int)var1_1.equals(var14_147);
                            if (var2_3 == 0) break;
                            var5_6 = 90;
                            break block185;
                        }
                        case -1978993182: {
                            var14_148 = "NX541J";
                            var2_3 = (int)var1_1.equals(var14_148);
                            if (var2_3 == 0) break;
                            var5_6 = 89;
                            break block185;
                        }
                        case -2022874474: {
                            var14_149 = "CP8676_I02";
                            var2_3 = (int)var1_1.equals(var14_149);
                            if (var2_3 == 0) break;
                            var5_6 = 22;
                            break block185;
                        }
                        case -2097309513: {
                            var14_150 = "K50a40";
                            var2_3 = (int)var1_1.equals(var14_150);
                            if (var2_3 == 0) break;
                            var5_6 = 74;
                            break block185;
                        }
                        case -2144781160: {
                            var14_151 = "GIONEE_SWW1631";
                            var2_3 = (int)var1_1.equals(var14_151);
                            if (var2_3 == 0) break;
                            var5_6 = 56;
                            break block185;
                        }
                        case -2144781185: {
                            var14_152 = "GIONEE_SWW1627";
                            var2_3 = (int)var1_1.equals(var14_152);
                            if (var2_3 == 0) break;
                            var5_6 = 55;
                            break block185;
                        }
                        case -2144781245: {
                            var14_153 = "GIONEE_SWW1609";
                            var2_3 = (int)var1_1.equals(var14_153);
                            if (var2_3 == 0) break;
                            var5_6 = 54;
                            break block185;
                        }
                    }
                    var5_6 = -1;
                }
                switch (var5_6) {
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: 
                    case 13: 
                    case 14: 
                    case 15: 
                    case 16: 
                    case 17: 
                    case 18: 
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: 
                    case 23: 
                    case 24: 
                    case 25: 
                    case 26: 
                    case 27: 
                    case 28: 
                    case 29: 
                    case 30: 
                    case 31: 
                    case 32: 
                    case 33: 
                    case 34: 
                    case 35: 
                    case 36: 
                    case 37: 
                    case 38: 
                    case 39: 
                    case 40: 
                    case 41: 
                    case 42: 
                    case 43: 
                    case 44: 
                    case 45: 
                    case 46: 
                    case 47: 
                    case 48: 
                    case 49: 
                    case 50: 
                    case 51: 
                    case 52: 
                    case 53: 
                    case 54: 
                    case 55: 
                    case 56: 
                    case 57: 
                    case 58: 
                    case 59: 
                    case 60: 
                    case 61: 
                    case 62: 
                    case 63: 
                    case 64: 
                    case 65: 
                    case 66: 
                    case 67: 
                    case 68: 
                    case 69: 
                    case 70: 
                    case 71: 
                    case 72: 
                    case 73: 
                    case 74: 
                    case 75: 
                    case 76: 
                    case 77: 
                    case 78: 
                    case 79: 
                    case 80: 
                    case 81: 
                    case 82: 
                    case 83: 
                    case 84: 
                    case 85: 
                    case 86: 
                    case 87: 
                    case 88: 
                    case 89: 
                    case 90: 
                    case 91: 
                    case 92: 
                    case 93: 
                    case 94: 
                    case 95: 
                    case 96: 
                    case 97: 
                    case 98: 
                    case 99: 
                    case 100: 
                    case 101: 
                    case 102: 
                    case 103: 
                    case 104: 
                    case 105: 
                    case 106: 
                    case 107: 
                    case 108: 
                    case 109: 
                    case 110: 
                    case 111: 
                    case 112: 
                    case 113: 
                    case 114: 
                    case 115: 
                    case 116: 
                    case 117: 
                    case 118: 
                    case 119: 
                    case 120: 
                    case 121: 
                    case 122: 
                    case 123: 
                    case 124: 
                    case 125: 
                    case 126: 
                    case 127: 
                    case 128: 
                    case 129: 
                    case 130: 
                    case 131: 
                    case 132: 
                    case 133: 
                    case 134: 
                    case 135: 
                    case 136: 
                    case 137: 
                    case 138: 
                    case 139: {
                        ** GOTO lbl-1000
                    }
                }
                {
                    var2_3 = var9_10.hashCode();
                    var5_6 = -594534941;
                }
                if (var2_3 != var5_6 || (var2_3 = (int)var9_10.equals(var1_1 = "JSN-L21")) == 0) ** break;
                ** continue;
lbl-1000:
                // 3 sources

                {
                    zzabj.zzd = var3_4;
                    zzabj.zzc = var6_7;
lbl1006:
                    // 2 sources

                    return zzabj.zzd;
                }
            }
            throw var1_2;
        }
    }

    private static List zzaR(Context object, zztx zztx2, zzan zzan2, boolean bl2, boolean bl3) {
        boolean bl4;
        String string2;
        boolean bl5;
        String string3 = zzan2.zzn;
        if (string3 == null) {
            return zzgbc.zzm();
        }
        int n3 = zzgd.zza;
        int n4 = 26;
        if (n3 >= n4 && (bl5 = (string2 = "video/dolby-vision").equals(string3)) && !(bl4 = zzabh.zza((Context)object)) && !(bl5 = (object = zzuj.zzd(zztx2, zzan2, bl2, bl3)).isEmpty())) {
            return object;
        }
        return zzuj.zzf(zztx2, zzan2, bl2, bl3);
    }

    private final void zzaS() {
        zzdv zzdv2 = this.zzA;
        if (zzdv2 != null) {
            zzach zzach2 = this.zzg;
            zzach2.zzt(zzdv2);
        }
    }

    private final void zzaT() {
        zzach zzach2 = this.zzg;
        Surface surface = this.zzn;
        zzach2.zzq(surface);
        this.zzq = true;
    }

    private final void zzaU() {
        Surface surface = this.zzn;
        zzabm zzabm2 = this.zzp;
        if (surface == zzabm2) {
            this.zzn = null;
        }
        if (zzabm2 != null) {
            zzabm2.release();
            this.zzp = null;
        }
    }

    private final boolean zzaV(zztp zztp2) {
        String string2;
        boolean bl2;
        int bl22 = zzgd.zza;
        int n3 = 23;
        boolean bl3 = false;
        if (bl22 >= n3 && !(bl2 = zzabj.zzaQ(string2 = zztp2.zza))) {
            boolean bl4 = zztp2.zzf;
            boolean bl5 = true;
            if (bl4) {
                zztp2 = this.zze;
                bl4 = zzabm.zzb((Context)zztp2);
                if (bl4) {
                    return bl5;
                }
            } else {
                bl3 = true;
            }
        }
        return bl3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int zzad(zztp zztp2, zzan object) {
        int n3;
        int n4;
        int n7;
        int n8;
        String string2;
        String string3;
        int n10;
        int n14;
        int n15;
        block19: {
            n15 = ((zzan)object).zzs;
            n14 = ((zzan)object).zzt;
            n10 = -1;
            if (n15 == n10) return n10;
            if (n14 == n10) {
                return n10;
            }
            string3 = ((zzan)object).zzn;
            string3.getClass();
            string2 = "video/dolby-vision";
            int n16 = string2.equals(string3);
            String string4 = "video/avc";
            n8 = 2;
            int n17 = 1;
            String string5 = "video/hevc";
            if (n16 != 0) {
                string3 = (object = zzuj.zza((zzan)object)) != null && ((n7 = ((Integer)(object = (Integer)((Pair)object).first)).intValue()) == (n4 = 512) || n7 == n17 || n7 == n8) ? string4 : string5;
            }
            n7 = string3.hashCode();
            n16 = 3;
            n3 = 4;
            switch (n7) {
                default: {
                    break;
                }
                case 1599127257: {
                    object = "video/x-vnd.on2.vp9";
                    n7 = (int)(string3.equals(object) ? 1 : 0);
                    if (n7 == 0) break;
                    n8 = 6;
                    break block19;
                }
                case 1599127256: {
                    object = "video/x-vnd.on2.vp8";
                    n7 = (int)(string3.equals(object) ? 1 : 0);
                    if (n7 == 0) break;
                    n8 = 3;
                    break block19;
                }
                case 1331836730: {
                    n7 = (int)(string3.equals(string4) ? 1 : 0);
                    if (n7 == 0) break;
                    n8 = 5;
                    break block19;
                }
                case 1187890754: {
                    object = "video/mp4v-es";
                    n7 = (int)(string3.equals(object) ? 1 : 0);
                    if (n7 == 0) break;
                    n8 = 1;
                    break block19;
                }
                case -1662541442: {
                    n7 = (int)(string3.equals(string5) ? 1 : 0);
                    if (n7 == 0) break;
                    n8 = 4;
                    break block19;
                }
                case -1662735862: {
                    object = "video/av01";
                    n7 = (int)(string3.equals(object) ? 1 : 0);
                    if (n7 == 0) break;
                    break block19;
                }
                case -1664118616: {
                    object = "video/3gpp";
                    n7 = (int)(string3.equals(object) ? 1 : 0);
                    if (n7 == 0) break;
                    n8 = 0;
                    break block19;
                }
            }
            n8 = -1;
        }
        switch (n8) {
            default: {
                return n10;
            }
            case 6: {
                n3 = 8;
                return n15 * n14 * 3 / n3;
            }
            case 5: {
                object = zzgd.zzd;
                string3 = "BRAVIA 4K 2015";
                n4 = (int)(string3.equals(object) ? 1 : 0);
                if (n4 != 0) return n10;
                string3 = "Amazon";
                string2 = zzgd.zzc;
                n4 = (int)(string3.equals(string2) ? 1 : 0);
                if (n4 != 0) {
                    string3 = "KFSOWI";
                    n4 = (int)(string3.equals(object) ? 1 : 0);
                    if (n4 != 0) return n10;
                    string3 = "AFTS";
                    n7 = (int)(string3.equals(object) ? 1 : 0);
                    if (n7 != 0) {
                        boolean bl2 = zztp2.zzf;
                        if (bl2) return n10;
                    }
                }
                n15 += 15;
                return (n14 += 15) / 16 * (n15 /= 16) * 768 / n3;
            }
            case 4: {
                n15 = n15 * n14 * 3 / n3;
                return Math.max(0x200000, n15);
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
        }
        return n15 * n14 * 3 / n3;
    }

    public static int zzae(zztp object, zzan zzan2) {
        int n3 = zzan2.zzo;
        int n4 = -1;
        if (n3 != n4) {
            object = zzan2.zzp;
            int n7 = object.size();
            n4 = 0;
            for (n3 = 0; n3 < n7; ++n3) {
                byte[] byArray = (byte[])zzan2.zzp.get(n3);
                int n8 = byArray.length;
                n4 += n8;
            }
            return zzan2.zzo + n4;
        }
        return zzabj.zzad((zztp)object, zzan2);
    }

    public static /* bridge */ /* synthetic */ Surface zzah(zzabj zzabj2) {
        return zzabj2.zzn;
    }

    public static /* bridge */ /* synthetic */ void zzai(zzabj zzabj2) {
        zzabj2.zzaT();
    }

    public final void zzA() {
        Object object = this.zzF;
        if (object != null) {
            object = this.zzf;
            object.zzn();
        }
    }

    public final void zzC() {
        zzabm zzabm2 = null;
        try {
            super.zzC();
            this.zzC = false;
            zzabm2 = this.zzp;
            if (zzabm2 != null) {
                this.zzaU();
            }
            return;
        }
        catch (Throwable throwable) {
            this.zzC = false;
            zzabm2 = this.zzp;
            if (zzabm2 != null) {
                this.zzaU();
            }
            throw throwable;
        }
    }

    public final void zzD() {
        long l2;
        this.zzt = 0;
        this.zzh();
        this.zzs = l2 = SystemClock.elapsedRealtime();
        this.zzw = 0L;
        this.zzx = 0;
        this.zzi.zzg();
    }

    public final void zzE() {
        long l2;
        int n3 = this.zzt;
        if (n3 > 0) {
            this.zzh();
            l2 = SystemClock.elapsedRealtime();
            long l3 = this.zzs;
            l3 = l2 - l3;
            zzach zzach2 = this.zzg;
            int n4 = this.zzt;
            zzach2.zzd(n4, l3);
            this.zzt = 0;
            this.zzs = l2;
        }
        if ((n3 = this.zzx) != 0) {
            zzach zzach3 = this.zzg;
            long l4 = this.zzw;
            zzach3.zzr(l4, n3);
            this.zzw = l2 = 0L;
            this.zzx = 0;
        }
        this.zzi.zzh();
    }

    public final void zzM(float f5, float f6) {
        super.zzM(f5, f6);
        this.zzi.zzn(f5);
        Object object = this.zzF;
        if (object != null) {
            object = ((zzaba)object).zza;
            zzabc.zzi((zzabc)object, f5);
        }
    }

    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    public final void zzV(long l2, long l3) {
        super.zzV(l2, l3);
        zzacm zzacm2 = this.zzF;
        if (zzacm2 != null) {
            try {
                zzacm2.zzh(l2, l3);
                return;
            }
            catch (zzacl zzacl2) {
                zzan zzan2 = zzacl2.zza;
                throw this.zzi(zzacl2, zzan2, false, 7001);
            }
        }
    }

    public final boolean zzW() {
        zzacm zzacm2;
        boolean bl2 = super.zzW();
        boolean bl3 = false;
        if (bl2 && (zzacm2 = this.zzF) == null) {
            bl3 = true;
        }
        return bl3;
    }

    public final boolean zzX() {
        Surface surface;
        Object object;
        boolean bl2 = super.zzX();
        boolean bl3 = true;
        boolean bl4 = false;
        if (bl2 && (object = this.zzF) == null) {
            bl4 = true;
        }
        if (bl4 && ((object = this.zzp) != null && (surface = this.zzn) == object || (object = this.zzaw()) == null)) {
            return bl3;
        }
        return this.zzi.zzo(bl4);
    }

    public final float zzZ(float f5, zzan zzan2, zzan[] zzanArray) {
        int n3;
        int n4;
        float f6 = -1.0f;
        float f7 = -1.0f;
        for (n4 = 0; n4 < (n3 = zzanArray.length); ++n4) {
            zzan zzan3 = zzanArray[n4];
            float f8 = zzan3.zzu;
            float f11 = f8 - f6;
            Object object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
            if (object == false) continue;
            f7 = Math.max(f7, f8);
        }
        n4 = (int)(f7 == f6 ? 0 : (f7 > f6 ? 1 : -1));
        if (n4 == 0) {
            return f6;
        }
        return f7 * f5;
    }

    public final void zzaA(long l2) {
        int n3;
        super.zzaA(l2);
        this.zzv = n3 = this.zzv + -1;
    }

    public final void zzaB(zzin zzin2) {
        int n3;
        this.zzv = n3 = this.zzv + 1;
        n3 = zzgd.zza;
    }

    public final void zzaC(zzan object) {
        boolean bl2 = this.zzB;
        if (bl2 && !(bl2 = this.zzC)) {
            Object object2;
            Object object3 = this.zzf.zzd();
            this.zzF = object3;
            try {
                object2 = this.zzh();
            }
            catch (zzacl zzacl2) {
                throw this.zzi(zzacl2, (zzan)object, false, 7000);
            }
            object3.zzf((zzan)object, (zzer)object2);
            object = this.zzF;
            object3 = new zzabg(this);
            object2 = zzggk.zzb();
            object.zzi((zzack)object3, (Executor)object2);
            object = this.zzE;
            if (object != null) {
                object3 = ((zzaba)this.zzF).zza;
                zzabc.zzj((zzabc)object3, (zzabn)object);
            }
            object = this.zzF;
            long l2 = this.zzau();
            object.zzj(l2);
            object = this.zzn;
            if (object != null && (object3 = this.zzo) != null) {
                object2 = this.zzf;
                object2.zzq((Surface)object, (zzfv)object3);
            }
        }
        this.zzC = true;
    }

    public final void zzaE() {
        super.zzaE();
        this.zzv = 0;
    }

    public final boolean zzaK(zztp zztp2) {
        boolean bl2;
        Surface surface = this.zzn;
        return surface != null || (bl2 = this.zzaV(zztp2));
        {
        }
    }

    public final void zzaM(zztm object, int n3, long l2) {
        Trace.beginSection((String)"skipVideoBuffer");
        object.zzn(n3, false);
        Trace.endSection();
        object = this.zza;
        ((zzix)object).zzf = n3 = ((zzix)object).zzf + 1;
    }

    public final void zzaN(int n3, int n4) {
        int n7;
        zzix zzix2 = this.zza;
        zzix2.zzh = n7 = zzix2.zzh + n3;
        n7 = zzix2.zzg;
        zzix2.zzg = n7 += (n3 += n4);
        this.zzt = n4 = this.zzt + n3;
        this.zzu = n4 = this.zzu + n3;
        n3 = zzix2.zzi;
        zzix2.zzi = n3 = Math.max(n4, n3);
    }

    public final void zzaO(long l2) {
        int n3;
        long l3;
        int n4;
        long l4;
        zzix zzix2 = this.zza;
        zzix2.zzk = l4 = zzix2.zzk + l2;
        zzix2.zzl = n4 = zzix2.zzl + 1;
        this.zzw = l3 = this.zzw + l2;
        this.zzx = n3 = this.zzx + 1;
    }

    public final boolean zzaP(long l2, boolean bl2) {
        int n3 = this.zzd(l2);
        if (n3 == 0) {
            return false;
        }
        int n4 = 1;
        if (bl2) {
            int n8;
            zzix zzix3 = this.zza;
            zzix3.zzd = n8 = zzix3.zzd + n3;
            n3 = zzix3.zzf;
            n8 = this.zzv;
            zzix3.zzf = n3 += n8;
        } else {
            int n7;
            zzix zzix2 = this.zza;
            zzix2.zzj = n7 = zzix2.zzj + n4;
            int n8 = this.zzv;
            this.zzaN(n3, n8);
        }
        this.zzaG();
        zzacm zzacm2 = this.zzF;
        if (zzacm2 != null) {
            zzacm2.zze();
        }
        return n4 != 0;
    }

    public final int zzaa(zztx object, zzan zzan2) {
        boolean bl2;
        String string2;
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        Object object2;
        int n14;
        int n15;
        int n16;
        boolean bl3;
        block16: {
            block15: {
                Object object3 = zzan2.zzn;
                bl3 = zzcg.zzh((String)object3);
                n16 = 128;
                if (!bl3) {
                    return n16;
                }
                object3 = zzan2.zzq;
                n15 = 1;
                n14 = 0;
                if (object3 != null) {
                    bl3 = true;
                } else {
                    bl3 = false;
                    object3 = null;
                }
                object2 = zzabj.zzaR(this.zze, (zztx)object, zzan2, bl3, false);
                if (bl3 && (n10 = object2.isEmpty()) != 0) {
                    object2 = zzabj.zzaR(this.zze, (zztx)object, zzan2, false, false);
                }
                if ((n10 = object2.isEmpty()) != 0) break block15;
                n10 = zztv.zzaL(zzan2);
                if (n10 != 0) break block16;
                n15 = 2;
            }
            return n15 | 0x80;
        }
        zztp zztp2 = (zztp)object2.get(0);
        int n17 = zztp2.zze(zzan2);
        if (n17 == 0) {
            for (n8 = 1; n8 < (n7 = object2.size()); ++n8) {
                zztp zztp3 = (zztp)object2.get(n8);
                n4 = zztp3.zze(zzan2);
                if (n4 == 0) continue;
                zztp2 = zztp3;
                n3 = 0;
                object2 = null;
                n17 = 1;
                break;
            }
        } else {
            n3 = 1;
        }
        n8 = n15 != n17 ? 3 : 4;
        n7 = (int)(zztp2.zzf(zzan2) ? 1 : 0);
        n7 = n15 != n7 ? 8 : 16;
        n10 = zztp2.zzg;
        if (n15 != n10) {
            n10 = 0;
            zztp2 = null;
        } else {
            n10 = 64;
        }
        if (n15 != n3) {
            n16 = 0;
        }
        if ((n3 = zzgd.zza) >= (n4 = 26) && (n3 = (int)((string2 = "video/dolby-vision").equals(object2 = zzan2.zzn) ? 1 : 0)) != 0 && (n3 = zzabh.zza((Context)(object2 = this.zze))) == 0) {
            n16 = 256;
        }
        if (n17 != 0 && !(bl3 = (object = zzabj.zzaR((Context)(object2 = this.zze), (zztx)object, zzan2, bl3, n15 != 0)).isEmpty()) && (bl3 = ((zztp)(object = (zztp)zzuj.zzg((List)object, zzan2).get(0))).zze(zzan2)) && (bl2 = ((zztp)object).zzf(zzan2))) {
            n14 = 32;
        }
        return n8 | n7 | n14 | n10 | n16;
    }

    public final zziy zzab(zztp object, zzan zzan2, zzan zzan3) {
        int n3;
        int n4;
        int n7;
        zziy zziy2 = ((zztp)object).zzb(zzan2, zzan3);
        int n8 = zziy2.zze;
        Object object2 = this.zzk;
        object2.getClass();
        int n10 = zzan3.zzs;
        int n14 = ((zzabi)object2).zza;
        if (n10 > n14 || (n10 = zzan3.zzt) > (n14 = ((zzabi)object2).zzb)) {
            n8 |= 0x100;
        }
        if ((n10 = zzabj.zzae((zztp)object, zzan3)) > (n7 = ((zzabi)object2).zzc)) {
            n8 |= 0x40;
        }
        String string2 = ((zztp)object).zza;
        n7 = 0;
        object2 = null;
        if (n8 != 0) {
            n4 = n8;
            n3 = 0;
        } else {
            int n15;
            n3 = n15 = zziy2.zzd;
            n4 = 0;
        }
        object2 = object;
        object = new zziy(string2, zzan2, zzan3, n3, n4);
        return object;
    }

    public final zziy zzac(zzlj object) {
        zziy zziy2 = super.zzac((zzlj)object);
        object = ((zzlj)object).zza;
        object.getClass();
        this.zzg.zzf((zzan)object, zziy2);
        return zziy2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final zztk zzaf(zztp var1_1, zzan var2_2, MediaCrypto var3_3, float var4_4) {
        block35: {
            block36: {
                var5_5 = this;
                var6_6 = var1_1;
                var7_7 = var2_2;
                var8_8 = var4_4;
                var9_9 = 1;
                var10_10 /* !! */  = this.zzp;
                if (var10_10 /* !! */  != null && (var12_12 = var10_10 /* !! */ .zza) != (var11_11 = var1_1.zzf)) {
                    this.zzaU();
                }
                var10_10 /* !! */  = var6_6.zzc;
                var13_13 /* !! */  = this.zzT();
                var14_14 = var7_7.zzs;
                var15_15 = var7_7.zzt;
                var16_16 = zzabj.zzae(var1_1, var2_2);
                var17_17 = ((zzan[])var13_13 /* !! */ ).length;
                var18_18 = -1;
                var19_19 = 0.0f / 0.0f;
                if (var17_17 == var9_9) {
                    if (var16_16 != var18_18 && (var11_11 = zzabj.zzad(var1_1, var2_2)) != var18_18) {
                        var20_20 = var16_16;
                        var17_17 = 1069547520;
                        var21_21 = 1.5f;
                        var16_16 = Math.min((int)(var20_20 *= var21_21), var11_11);
                    }
lbl23:
                    // 4 sources

                    while (true) {
                        var22_23 /* !! */  = var10_10 /* !! */ ;
                        break block35;
                        break;
                    }
                }
                var24_25 = 0;
                var25_26 = 0.0f;
                for (var23_24 = 0; var23_24 < var17_17; var23_24 += var9_9) {
                    var26_27 = var13_13 /* !! */ [var23_24];
                    var27_28 = var7_7.zzz;
                    if (var27_28 != null && (var27_28 = var26_27.zzz) == null) {
                        var26_27 = var26_27.zzb();
                        var27_28 = var7_7.zzz;
                        var26_27.zzA((zzt)var27_28);
                        var26_27 = var26_27.zzad();
                    }
                    var27_28 = var6_6.zzb(var7_7, (zzan)var26_27);
                    var28_29 = var27_28.zzd;
                    if (!var28_29) continue;
                    var28_29 = var26_27.zzs;
                    if (var28_29 == var18_18 || (var9_9 = var26_27.zzt) == var18_18) {
                        var9_9 = 1;
                    } else {
                        var9_9 = 0;
                        var29_22 /* !! */  = null;
                    }
                    var24_25 |= var9_9;
                    var9_9 = Math.max(var14_14, var28_29);
                    var14_14 = var26_27.zzt;
                    var14_14 = Math.max(var15_15, var14_14);
                    var15_15 = zzabj.zzae((zztp)var6_6, (zzan)var26_27);
                    var16_16 = Math.max(var16_16, var15_15);
                    var15_15 = var14_14;
                    var14_14 = var9_9;
                    var9_9 = 1;
                }
                ** while (!var24_25)
lbl57:
                // 1 sources

                var29_22 /* !! */  = new StringBuilder("Resolutions unknown. Codec max resolution: ");
                var29_22 /* !! */ .append(var14_14);
                var13_13 /* !! */  = "x";
                var29_22 /* !! */ .append((String)var13_13 /* !! */ );
                var29_22 /* !! */ .append(var15_15);
                var29_22 /* !! */  = var29_22 /* !! */ .toString();
                var30_30 = "MediaCodecVideoRenderer";
                zzfk.zzf(var30_30, (String)var29_22 /* !! */ );
                var9_9 = var7_7.zzt;
                var18_18 = var7_7.zzs;
                if (var9_9 > var18_18) {
                    var31_31 = 1;
                } else {
                    var31_31 = 0;
                    var26_27 = null;
                }
                if (var31_31) {
                    var28_29 = var9_9;
lbl77:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var28_29 = var18_18;
                ** while (true)
                var23_24 = 1;
                if (var23_24 == var31_31) {
                    var9_9 = var18_18;
                }
                var32_32 = zzabj.zzb;
                var23_24 = 0;
                while (true) {
                    var24_25 = 9;
                    var25_26 = 1.3E-44f;
                    if (var23_24 >= var24_25) break;
                    var25_26 = var9_9;
                    var8_8 = var28_29;
                    var22_23 /* !! */  = var10_10 /* !! */ ;
                    var12_12 = var32_32[var23_24];
                    var33_33 = var32_32;
                    var19_19 = var12_12;
                    if (var12_12 <= var28_29 || (var34_34 = (int)(var25_26 = var25_26 / var8_8 * var19_19)) <= var9_9) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var34_34 = 0;
                            var8_8 = 0.0f;
                            var35_35 /* !! */  = null;
                            break block36;
                            break;
                        }
                    }
                    var18_18 = zzgd.zza;
                    var18_18 = 1;
                    var19_19 = 1.4E-45f;
                    var24_25 = var18_18 != var31_31 ? var12_12 : var34_34;
                    if (var18_18 != var31_31) {
                        var12_12 = var34_34;
                    }
                    var35_35 /* !! */  = var6_6.zza(var24_25, var12_12);
                    var36_36 = var7_7.zzu;
                    if (var35_35 /* !! */  != null) {
                        var18_18 = var9_9;
                        var37_37 = var36_36;
                        var24_25 = var35_35 /* !! */ .x;
                        var39_38 = var9_9;
                        var18_18 = var35_35 /* !! */ .y;
                        var9_9 = (int)var6_6.zzg(var24_25, var18_18, var37_37);
                        if (!var9_9) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                continue;
                                break;
                            }
                        }
                        break block36;
                    }
                    var39_38 = var9_9;
                    ** continue;
                    var34_34 = 1;
                    var8_8 = 1.4E-45f;
                    var23_24 += var34_34;
                    var8_8 = var4_4;
                    var10_10 /* !! */  = var22_23 /* !! */ ;
                    var32_32 = var33_33;
                    var9_9 = var39_38;
                }
                var22_23 /* !! */  = var10_10 /* !! */ ;
                ** while (true)
            }
            if (var35_35 /* !! */  != null) {
                var9_9 = var35_35 /* !! */ .x;
                var14_14 = Math.max(var14_14, var9_9);
                var34_34 = var35_35 /* !! */ .y;
                var15_15 = Math.max(var15_15, var34_34);
                var35_35 /* !! */  = var2_2.zzb();
                var35_35 /* !! */ .zzac(var14_14);
                var35_35 /* !! */ .zzI(var15_15);
                var35_35 /* !! */  = var35_35 /* !! */ .zzad();
                var34_34 = zzabj.zzad((zztp)var6_6, (zzan)var35_35 /* !! */ );
                var16_16 = Math.max(var16_16, var34_34);
                var29_22 /* !! */  = "Codec max resolution adjusted to: ";
                var35_35 /* !! */  = new StringBuilder((String)var29_22 /* !! */ );
                var35_35 /* !! */ .append(var14_14);
                var35_35 /* !! */ .append((String)var13_13 /* !! */ );
                var35_35 /* !! */ .append(var15_15);
                var35_35 /* !! */  = var35_35 /* !! */ .toString();
                zzfk.zzf(var30_30, (String)var35_35 /* !! */ );
            }
        }
        var35_35 /* !! */  = new zzabi(var14_14, var15_15, var16_16);
        var5_5.zzk = var35_35 /* !! */ ;
        var9_9 = (int)var5_5.zzh;
        var10_10 /* !! */  = new MediaFormat();
        var40_39 /* !! */  = var22_23 /* !! */ ;
        var10_10 /* !! */ .setString("mime", (String)var22_23 /* !! */ );
        var11_11 = var7_7.zzs;
        var10_10 /* !! */ .setInteger("width", var11_11);
        var11_11 = var7_7.zzt;
        var40_39 /* !! */  = "height";
        var10_10 /* !! */ .setInteger((String)var40_39 /* !! */ , var11_11);
        var13_13 /* !! */  = var7_7.zzp;
        zzfn.zzb((MediaFormat)var10_10 /* !! */ , (List)var13_13 /* !! */ );
        var41_40 = var7_7.zzu;
        var14_14 = -1082130432;
        var42_41 = -1.0f;
        var15_15 = (int)(var41_40 == var42_41 ? 0 : (var41_40 > var42_41 ? 1 : -1));
        if (var15_15 != 0) {
            var43_42 = "frame-rate";
            var10_10 /* !! */ .setFloat(var43_42, var41_40);
        }
        var11_11 = var7_7.zzv;
        var43_42 = "rotation-degrees";
        zzfn.zza((MediaFormat)var10_10 /* !! */ , var43_42, var11_11);
        var13_13 /* !! */  = var7_7.zzz;
        if (var13_13 /* !! */  != null) {
            var16_16 = var13_13 /* !! */ .zzf;
            zzfn.zza((MediaFormat)var10_10 /* !! */ , "color-transfer", var16_16);
            var16_16 = var13_13 /* !! */ .zzd;
            zzfn.zza((MediaFormat)var10_10 /* !! */ , "color-standard", var16_16);
            var43_42 = "color-range";
            var16_16 = var13_13 /* !! */ .zze;
            zzfn.zza((MediaFormat)var10_10 /* !! */ , var43_42, var16_16);
            var13_13 /* !! */  = (Pair)var13_13 /* !! */ .zzg;
            if (var13_13 /* !! */  != null) {
                var43_42 = "hdr-static-info";
                var13_13 /* !! */  = ByteBuffer.wrap((byte[])var13_13 /* !! */ );
                var10_10 /* !! */ .setByteBuffer(var43_42, (ByteBuffer)var13_13 /* !! */ );
            }
        }
        if ((var11_11 = (int)(var43_42 = "video/dolby-vision").equals(var13_13 /* !! */  = var7_7.zzn)) != 0 && (var13_13 /* !! */  = zzuj.zza(var2_2)) != null) {
            var13_13 /* !! */  = (Integer)var13_13 /* !! */ .first;
            var11_11 = var13_13 /* !! */ .intValue();
            var43_42 = "profile";
            zzfn.zza((MediaFormat)var10_10 /* !! */ , var43_42, var11_11);
        }
        var11_11 = var35_35 /* !! */ .zza;
        var10_10 /* !! */ .setInteger("max-width", var11_11);
        var11_11 = var35_35 /* !! */ .zzb;
        var43_42 = "max-height";
        var10_10 /* !! */ .setInteger(var43_42, var11_11);
        var34_34 = var35_35 /* !! */ .zzc;
        var13_13 /* !! */  = "max-input-size";
        zzfn.zza((MediaFormat)var10_10 /* !! */ , (String)var13_13 /* !! */ , var34_34);
        var34_34 = zzgd.zza;
        var11_11 = 23;
        var41_40 = 3.2E-44f;
        if (var34_34 >= var11_11) {
            var35_35 /* !! */  = "priority";
            var41_40 = 0.0f;
            var13_13 /* !! */  = null;
            var10_10 /* !! */ .setInteger((String)var35_35 /* !! */ , 0);
            var8_8 = var4_4;
            var11_11 = (int)(var4_4 == var42_41 ? 0 : (var4_4 > var42_41 ? 1 : -1));
            if (var11_11 != 0) {
                var13_13 /* !! */  = "operating-rate";
                var10_10 /* !! */ .setFloat((String)var13_13 /* !! */ , var4_4);
            }
        }
        if (var9_9) {
            var10_10 /* !! */ .setInteger("no-post-process", 1);
            var35_35 /* !! */  = "auto-frc";
            var9_9 = 0;
            var29_22 /* !! */  = null;
            var10_10 /* !! */ .setInteger((String)var35_35 /* !! */ , 0);
        }
        if ((var35_35 /* !! */  = var5_5.zzn) == null) {
            var34_34 = (int)this.zzaV(var1_1);
            if (var34_34) {
                var35_35 /* !! */  = var5_5.zzp;
                if (var35_35 /* !! */  == null) {
                    var35_35 /* !! */  = var5_5.zze;
                    var9_9 = (int)var6_6.zzf;
                    var35_35 /* !! */  = zzabm.zza((Context)var35_35 /* !! */ , (boolean)var9_9);
                    var5_5.zzp = var35_35 /* !! */ ;
                }
                var35_35 /* !! */  = var5_5.zzp;
                var5_5.zzn = var35_35 /* !! */ ;
            } else {
                var6_6 = new IllegalStateException();
                throw var6_6;
            }
        }
        if ((var35_35 /* !! */  = var5_5.zzF) != null && !(var34_34 = (int)var35_35 /* !! */ .zzl())) {
            var35_35 /* !! */  = "allow-frame-drop";
            var9_9 = 0;
            var29_22 /* !! */  = null;
            var10_10 /* !! */ .setInteger((String)var35_35 /* !! */ , 0);
        } else {
            var9_9 = 0;
            var29_22 /* !! */  = null;
        }
        var35_35 /* !! */  = var5_5.zzF;
        if (var35_35 /* !! */  == null) {
            var35_35 /* !! */  = var5_5.zzn;
            return zztk.zzb((zztp)var6_6, (MediaFormat)var10_10 /* !! */ , var7_7, (Surface)var35_35 /* !! */ , null);
        }
        zzeq.zzf(false);
        zzeq.zzb(null);
        throw null;
    }

    public final List zzag(zztx zztx2, zzan zzan2, boolean bl2) {
        return zzuj.zzg(zzabj.zzaR(this.zze, zztx2, zzan2, false, false), zzan2);
    }

    public final void zzaj(zzin object) {
        int n3 = this.zzm;
        if (n3 != 0) {
            object = ((zzin)object).zzf;
            object.getClass();
            n3 = ((Buffer)object).remaining();
            int n4 = 7;
            if (n3 >= n4) {
                n3 = ((ByteBuffer)object).get();
                n4 = ((ByteBuffer)object).getShort();
                short s7 = ((ByteBuffer)object).getShort();
                byte by2 = ((ByteBuffer)object).get();
                byte by4 = ((ByteBuffer)object).get();
                ((ByteBuffer)object).position(0);
                int n7 = -75;
                if (n3 == n7 && n4 == (n3 = 60) && s7 == (n3 = 1) && by2 == (n4 = 4) && (by4 == 0 || by4 == n3)) {
                    n3 = ((Buffer)object).remaining();
                    byte[] byArray = new byte[n3];
                    ((ByteBuffer)object).get(byArray);
                    ((ByteBuffer)object).position(0);
                    object = this.zzaw();
                    object.getClass();
                    Bundle bundle = new Bundle();
                    String string2 = "hdr10-plus-info";
                    bundle.putByteArray(string2, byArray);
                    object.zzp(bundle);
                }
            }
        }
    }

    public final void zzak(Exception exception) {
        zzfk.zzd("MediaCodecVideoRenderer", "Video codec error", exception);
        this.zzg.zzs(exception);
    }

    public final void zzal(String codecProfileLevelArray, zztk object, long l2, long l3) {
        String string2;
        boolean bl2;
        zzach zzach2 = this.zzg;
        zzach2.zza((String)codecProfileLevelArray, l2, l3);
        this.zzl = bl2 = zzabj.zzaQ((String)codecProfileLevelArray);
        codecProfileLevelArray = this.zzay();
        codecProfileLevelArray.getClass();
        int n3 = zzgd.zza;
        int n4 = 29;
        boolean bl3 = false;
        if (n3 >= n4 && (n3 = (int)((string2 = "video/x-vnd.on2.vp9").equals(object = codecProfileLevelArray.zzb) ? 1 : 0)) != 0) {
            codecProfileLevelArray = codecProfileLevelArray.zzh();
            n3 = codecProfileLevelArray.length;
            string2 = null;
            for (n4 = 0; n4 < n3; ++n4) {
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArray[n4];
                int n7 = codecProfileLevel.profile;
                int n8 = 16384;
                if (n7 != n8) continue;
                bl3 = true;
                break;
            }
        }
        this.zzm = bl3;
    }

    public final void zzam(String string2) {
        this.zzg.zzb(string2);
    }

    public final void zzan(zzan object, MediaFormat mediaFormat) {
        float f5;
        float f6;
        int n3;
        int n4;
        Object object2;
        int n7;
        block12: {
            int n8;
            block11: {
                String string2;
                Object object3 = this.zzaw();
                if (object3 != null) {
                    n7 = this.zzr;
                    object3.zzq(n7);
                }
                mediaFormat.getClass();
                object3 = "crop-right";
                n7 = (int)(mediaFormat.containsKey((String)object3) ? 1 : 0);
                object2 = "crop-top";
                String string3 = "crop-bottom";
                String string4 = "crop-left";
                n4 = 1;
                if (n7 != 0 && (n7 = (int)(mediaFormat.containsKey(string4) ? 1 : 0)) != 0 && (n7 = (int)(mediaFormat.containsKey(string3) ? 1 : 0)) != 0 && (n7 = (int)(mediaFormat.containsKey((String)object2) ? 1 : 0)) != 0) {
                    n7 = 1;
                } else {
                    n7 = 0;
                    string2 = null;
                }
                if (n7 != 0) {
                    n3 = mediaFormat.getInteger((String)object3);
                    int n10 = mediaFormat.getInteger(string4);
                    n3 = n3 - n10 + n4;
                } else {
                    object3 = "width";
                    n3 = mediaFormat.getInteger((String)object3);
                }
                if (n7 != 0) {
                    n7 = mediaFormat.getInteger(string3);
                    int n14 = mediaFormat.getInteger((String)object2);
                    n7 = n7 - n14 + n4;
                } else {
                    string2 = "height";
                    n7 = mediaFormat.getInteger(string2);
                }
                f6 = ((zzan)object).zzw;
                n8 = zzgd.zza;
                n8 = ((zzan)object).zzv;
                int n15 = 90;
                f5 = 1.26E-43f;
                if (n8 == n15) break block11;
                n15 = 270;
                f5 = 3.78E-43f;
                if (n8 != n15) break block12;
            }
            n8 = 1065353216;
            float f7 = 1.0f;
            f6 = f7 / f6;
            int n16 = n7;
            n7 = n3;
            n3 = n16;
        }
        this.zzz = object2 = new zzdv(n3, n7, 0, f6);
        object2 = this.zzi;
        f5 = ((zzan)object).zzu;
        ((zzabq)object2).zzl(f5);
        object2 = this.zzF;
        if (object2 != null) {
            object = ((zzan)object).zzb();
            ((zzal)object).zzac(n3);
            ((zzal)object).zzI(n7);
            ((zzal)object).zzW(0);
            ((zzal)object).zzT(f6);
            object = ((zzal)object).zzad();
            object2.zzg(n4, (zzan)object);
        }
    }

    public final void zzao(zztm object, int n3, long l2, long l3) {
        String string2 = "releaseOutputBuffer";
        Trace.beginSection((String)string2);
        object.zzm(n3, l3);
        Trace.endSection();
        object = this.zza;
        ((zzix)object).zze = n3 = ((zzix)object).zze + 1;
        boolean bl2 = false;
        this.zzu = 0;
        object = this.zzF;
        if (object == null) {
            object = this.zzz;
            Object object2 = zzdv.zza;
            n3 = (int)(((zzdv)object).equals(object2) ? 1 : 0);
            if (n3 == 0 && (n3 = (int)(((zzdv)object).equals(object2 = this.zzA) ? 1 : 0)) == 0) {
                this.zzA = object;
                object2 = this.zzg;
                ((zzach)object2).zzt((zzdv)object);
            }
            if ((bl2 = ((zzabq)(object = this.zzi)).zzp()) && (object = this.zzn) != null) {
                this.zzaT();
            }
        }
    }

    public final void zzap() {
        this.zzi.zzf();
        zzacm zzacm2 = this.zzf.zzd();
        long l2 = this.zzau();
        zzacm2.zzj(l2);
    }

    public final boolean zzar(long l2, long l3, zztm zztm2, ByteBuffer byteBuffer, int n3, int n4, int n7, long l4, boolean bl2, boolean bl3, zzan zzan2) {
        long l7;
        boolean bl4;
        zzabj zzabj2;
        block15: {
            Object object;
            int n8;
            zztm zztm3;
            block16: {
                block17: {
                    block18: {
                        block13: {
                            Object object2;
                            boolean bl5;
                            long l12;
                            long l14;
                            boolean bl6;
                            block14: {
                                zzabj2 = this;
                                zztm3 = zztm2;
                                n8 = n3;
                                bl6 = bl3;
                                zztm2.getClass();
                                long l15 = this.zzau();
                                l14 = l4 - l15;
                                object = this.zzi;
                                l12 = this.zzav();
                                zzabo zzabo2 = this.zzj;
                                long l16 = l14;
                                bl5 = ((zzabq)object).zza(l4, l2, l3, l12, bl3, zzabo2);
                                bl4 = true;
                                if (bl2 && !bl3) {
                                    long l8 = l14;
                                    this.zzaM(zztm2, n3, l14);
                                    return bl4;
                                }
                                l7 = l16;
                                object2 = zzabj2.zzn;
                                zzabm zzabm2 = zzabj2.zzp;
                                if (object2 != zzabm2 || (object2 = zzabj2.zzF) != null) break block14;
                                object = zzabj2.zzj;
                                long l17 = ((zzabo)object).zzc();
                                long l18 = l17 - (l12 = 30000L);
                                Object object3 = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
                                if (object3 < 0) {
                                    zzabj2.zzaM(zztm3, n8, l16);
                                    long l19 = zzabj2.zzj.zzc();
                                    zzabj2.zzaO(l19);
                                    return bl4;
                                }
                                break block13;
                            }
                            object2 = zzabj2.zzF;
                            if (object2 != null) {
                                l12 = l2;
                                l14 = l3;
                                try {
                                    object2.zzh(l2, l3);
                                    object = zzabj2.zzF;
                                    long l20 = object.zzd(l7, bl6);
                                    l12 = -9223372036854775807L;
                                    long l21 = l20 == l12 ? 0 : (l20 < l12 ? -1 : 1);
                                    if (l21 != false) {
                                        int n10 = zzgd.zza;
                                        this.zzao(zztm2, n3, l7, l20);
                                        return bl4;
                                    }
                                    break block13;
                                }
                                catch (zzacl zzacl2) {
                                    zzacl zzacl3 = zzacl2;
                                    zzan zzan3 = zzacl2.zza;
                                    throw zzabj2.zzi(zzacl3, zzan3, false, 7001);
                                }
                            }
                            if (!bl5) break block15;
                            if (bl5 == bl4) break block16;
                            boolean bl7 = 2 != 0;
                            if (bl5 == bl7) break block17;
                            boolean bl8 = 3 != 0;
                            if (bl5 == bl8) break block18;
                        }
                        return false;
                    }
                    zzabj2.zzaM(zztm3, n8, l7);
                    long l22 = zzabj2.zzj.zzc();
                    zzabj2.zzaO(l22);
                    return bl4;
                }
                Trace.beginSection((String)"dropVideoBuffer");
                zztm3.zzn(n8, false);
                Trace.endSection();
                zzabj2.zzaN(0, (int)(bl4 ? 1 : 0));
                long l23 = zzabj2.zzj.zzc();
                zzabj2.zzaO(l23);
                return bl4;
            }
            object = zzabj2.zzj;
            long l24 = ((zzabo)object).zzd();
            long l25 = ((zzabo)object).zzc();
            int n14 = zzgd.zza;
            long l26 = zzabj2.zzy;
            long l27 = l24 - l26;
            Object object4 = l27 == 0L ? 0 : (l27 < 0L ? -1 : 1);
            if (object4 == false) {
                zzabj2.zzaM(zztm3, n8, l7);
            } else {
                this.zzao(zztm2, n3, l7, l24);
            }
            zzabj2.zzaO(l25);
            zzabj2.zzy = l24;
            return bl4;
        }
        this.zzh();
        long l28 = System.nanoTime();
        int n15 = zzgd.zza;
        this.zzao(zztm2, n3, l7, l28);
        long l29 = zzabj2.zzj.zzc();
        zzabj2.zzaO(l29);
        return bl4;
    }

    public final int zzat(zzin zzin2) {
        return 0;
    }

    public final zzto zzax(Throwable throwable, zztp zztp2) {
        Surface surface = this.zzn;
        zzabf zzabf2 = new zzabf(throwable, zztp2, surface);
        return zzabf2;
    }

    public final void zzs() {
        this.zzi.zzb();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zzt(int n3, Object object) {
        zzabm zzabm2;
        boolean bl2;
        block14: {
            Object object2;
            int n4;
            int n7;
            block15: {
                block16: {
                    block17: {
                        zzacm zzacm2;
                        Surface surface;
                        n7 = 1;
                        if (n3 != n7) {
                            int n8 = 7;
                            if (n3 != n8) {
                                n8 = 10;
                                if (n3 != n8) {
                                    n8 = 4;
                                    if (n3 != n8) {
                                        n8 = 5;
                                        if (n3 != n8) {
                                            n8 = 13;
                                            if (n3 != n8) {
                                                Surface surface2;
                                                n7 = 14;
                                                if (n3 != n7) return;
                                                object.getClass();
                                                this.zzo = object = (zzfv)object;
                                                zzacm zzacm3 = this.zzF;
                                                if (zzacm3 == null || (n3 = ((zzfv)object).zzb()) == 0 || (n3 = ((zzfv)object).zza()) == 0 || (surface2 = this.zzn) == null) return;
                                                this.zzf.zzq(surface2, (zzfv)object);
                                                return;
                                            }
                                            object.getClass();
                                            zzacn zzacn2 = this.zzf;
                                            object = (List)object;
                                            zzacn2.zzr((List)object);
                                            this.zzB = n7;
                                            return;
                                        }
                                        zzabq zzabq2 = this.zzi;
                                        object.getClass();
                                        int n10 = (Integer)object;
                                        zzabq2.zzj(n10);
                                        return;
                                    }
                                    object.getClass();
                                    this.zzr = n3 = ((Integer)object).intValue();
                                    object = this.zzaw();
                                    if (object == null) return;
                                    object.zzq(n3);
                                    return;
                                }
                                object.getClass();
                                object = (Integer)object;
                                n3 = (Integer)object;
                                int n14 = this.zzD;
                                if (n14 == n3) return;
                                this.zzD = n3;
                                return;
                            }
                            object.getClass();
                            this.zzE = object = (zzabn)object;
                            zzacm zzacm4 = this.zzF;
                            if (zzacm4 == null) return;
                            zzabc.zzj(((zzaba)zzacm4).zza, (zzabn)object);
                            return;
                        }
                        n3 = object instanceof Surface;
                        n4 = 0;
                        if (n3 != 0) {
                            object = (Surface)object;
                        } else {
                            bl2 = false;
                            object = null;
                        }
                        if (object == null) {
                            zzabm zzabm3 = this.zzp;
                            if (zzabm3 != null) {
                                object = zzabm3;
                            } else {
                                boolean bl3;
                                zztp zztp2 = this.zzay();
                                if (zztp2 != null && (bl3 = this.zzaV(zztp2))) {
                                    object = this.zze;
                                    n3 = (int)(zztp2.zzf ? 1 : 0);
                                    object = zzabm.zza((Context)object, n3 != 0);
                                    this.zzp = object;
                                }
                            }
                        }
                        if ((surface = this.zzn) == object) break block14;
                        this.zzn = object;
                        this.zzi.zzm((Surface)object);
                        Object var5_15 = null;
                        this.zzq = false;
                        n3 = this.zzcU();
                        object2 = this.zzaw();
                        if (object2 == null || (zzacm2 = this.zzF) != null) break block15;
                        int n15 = zzgd.zza;
                        int n16 = 23;
                        if (n15 < n16) break block16;
                        if (object == null) break block17;
                        n15 = (int)(this.zzl ? 1 : 0);
                        if (n15 != 0) break block16;
                        object2.zzo((Surface)object);
                        break block15;
                    }
                    bl2 = false;
                    object = null;
                }
                this.zzaD();
                this.zzaz();
            }
            if (object != null && object != (object2 = this.zzp)) {
                zzacm zzacm5;
                this.zzaS();
                n4 = 2;
                if (n3 == n4) {
                    zzabq zzabq3 = this.zzi;
                    zzabq3.zzc(n7 != 0);
                }
                if ((zzacm5 = this.zzF) == null) return;
                zzacn zzacn3 = this.zzf;
                zzfv zzfv2 = zzfv.zza;
                zzacn3.zzq((Surface)object, zzfv2);
                return;
            }
            this.zzA = null;
            zzacm zzacm6 = this.zzF;
            if (zzacm6 == null) return;
            this.zzf.zzk();
            return;
        }
        if (object == null || object == (zzabm2 = this.zzp)) return;
        this.zzaS();
        Surface surface = this.zzn;
        if (surface == null || !(bl2 = this.zzq)) return;
        object = this.zzg;
        ((zzach)object).zzq(surface);
    }

    public final void zzw() {
        this.zzA = null;
        this.zzi.zzd();
        zzach zzach2 = null;
        this.zzq = false;
        try {
            super.zzw();
            return;
        }
        finally {
            zzach2 = this.zzg;
            Object object = this.zza;
            zzach2.zzc((zzix)object);
            zzach2 = this.zzg;
            object = zzdv.zza;
            zzach2.zzt((zzdv)object);
        }
    }

    public final void zzx(boolean bl2, boolean bl3) {
        super.zzx(bl2, bl3);
        this.zzm();
        zzach zzach2 = this.zzg;
        zzix zzix2 = this.zza;
        zzach2.zze(zzix2);
        this.zzi.zze(bl3);
    }

    public final void zzy() {
        zzabq zzabq2 = this.zzi;
        zzer zzer2 = this.zzh();
        zzabq2.zzk(zzer2);
    }

    public final void zzz(long l2, boolean bl2) {
        zzacm zzacm2 = this.zzf.zzd();
        zzacm2.zze();
        super.zzz(l2, bl2);
        this.zzi.zzi();
        if (bl2) {
            zzabq zzabq2 = this.zzi;
            zzabq2.zzc(false);
        }
        this.zzu = 0;
    }
}

