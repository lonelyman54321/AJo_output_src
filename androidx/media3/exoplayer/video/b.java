/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Point
 *  android.media.MediaCodecInfo$CodecCapabilities
 *  android.media.MediaCodecInfo$CodecProfileLevel
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.SystemClock
 *  android.os.Trace
 *  android.util.Pair
 *  android.view.Surface
 */
package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.g;
import androidx.media3.common.g$b;
import androidx.media3.common.util.EGLSurfaceTexture;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.e$b;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$e;
import androidx.media3.exoplayer.mediacodec.e;
import androidx.media3.exoplayer.n$a;
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import androidx.media3.exoplayer.video.PlaceholderSurface$PlaceholderSurfaceThread;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import androidx.media3.exoplayer.video.b$a;
import androidx.media3.exoplayer.video.b$b;
import androidx.media3.exoplayer.video.b$c;
import androidx.media3.exoplayer.video.b$d;
import androidx.media3.exoplayer.video.b$e;
import androidx.media3.exoplayer.video.c;
import androidx.media3.exoplayer.video.c$a;
import androidx.media3.exoplayer.video.c$e;
import androidx.media3.exoplayer.video.c$f;
import androidx.media3.exoplayer.video.d;
import androidx.media3.exoplayer.video.d$a;
import androidx.media3.exoplayer.video.d$b;
import androidx.media3.exoplayer.video.f$a;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.MoreExecutors;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public final class b
extends MediaCodecRenderer
implements d$b {
    public static final int[] D1;
    public static boolean E1;
    public static boolean F1;
    public long A1;
    public long B1;
    public boolean C1;
    public final Context T0;
    public final boolean U0;
    public final f$a V0;
    public final int W0;
    public final boolean X0;
    public final d Y0;
    public final d$a Z0;
    public b$d a1;
    public boolean b1;
    public boolean c1;
    public VideoSink d1;
    public boolean e1;
    public List f1;
    public Surface g1;
    public PlaceholderSurface h1;
    public A63 i1;
    public boolean j1;
    public int k1;
    public int l1;
    public long m1;
    public int n1;
    public int o1;
    public int p1;
    public long q1;
    public int r1;
    public long s1;
    public wc3_0 t1;
    public wc3_0 u1;
    public int v1;
    public boolean w1;
    public int x1;
    public b$e y1;
    public LB3 z1;

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
        D1 = nArray;
    }

    public b(Context object, androidx.media3.exoplayer.mediacodec.d$b d$b, boolean bl2, Handler object2, e$b e$b) {
        super(2, d$b, bl2, 30.0f);
        long l2;
        boolean bl3;
        this.T0 = object = object.getApplicationContext();
        this.W0 = 50;
        this.d1 = null;
        Object object3 = new f$a((Handler)object2, e$b);
        this.V0 = object3;
        this.U0 = bl2 = true;
        super((Context)object, this);
        this.Y0 = object2;
        super();
        this.Z0 = object;
        object2 = gz3.c;
        this.X0 = bl3 = "NVIDIA".equals(object2);
        object = A63.c;
        this.i1 = object;
        this.k1 = (int)(bl2 ? 1 : 0);
        this.l1 = 0;
        this.t1 = object3 = wc3_0.d;
        this.x1 = 0;
        this.u1 = null;
        this.v1 = -1000;
        this.A1 = l2 = -9223372036854775807L;
        this.B1 = l2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean D0(String var0) {
        var1_1 = 26;
        var2_2 = 27;
        var3_3 = 28;
        var4_4 = true;
        var5_5 = "OMX.google";
        var6_6 = var0.startsWith((String)var5_5);
        var7_7 = false;
        if (var6_6) {
            return false;
        }
        var5_5 = b.class;
        synchronized (var5_5) {
            block185: {
                block184: {
                    block186: {
                        try {
                            var8_8 = androidx.media3.exoplayer.video.b.E1;
                            if (var8_8 != 0) break block184;
                            var8_8 = gz3.a;
                            if (var8_8 <= var3_3) {
                                var9_9 = gz3.b;
                                var9_9.getClass();
                                var10_10 = var9_9.hashCode();
                            }
                            ** GOTO lbl-1000
                        }
                        catch (Throwable var15_14) {
                            break block185;
                        }
                        switch (var10_10) lbl-1000:
                        // 9 sources

                        {
                            default: {
                                var11_11 = -1;
                                break;
                            }
                            case 825323514: {
                                var12_12 = "machuca";
                                var11_11 = (int)var9_9.equals(var12_12);
                                if (var11_11 == 0) ** GOTO lbl-1000
                                var11_11 = 7;
                                break;
                            }
                            case 3415681: {
                                var12_12 = "once";
                                var11_11 = (int)var9_9.equals(var12_12);
                                if (var11_11 == 0) ** GOTO lbl-1000
                                var11_11 = 6;
                                break;
                            }
                            case -64886864: {
                                var12_12 = "magnolia";
                                var11_11 = (int)var9_9.equals(var12_12);
                                if (var11_11 == 0) ** GOTO lbl-1000
                                var11_11 = 5;
                                break;
                            }
                            case -760312546: {
                                var12_12 = "aquaman";
                                var11_11 = (int)var9_9.equals(var12_12);
                                if (var11_11 == 0) ** GOTO lbl-1000
                                var11_11 = 4;
                                break;
                            }
                            case -1012436106: {
                                var12_12 = "oneday";
                                var11_11 = (int)var9_9.equals(var12_12);
                                if (var11_11 == 0) ** GOTO lbl-1000
                                var11_11 = 3;
                                break;
                            }
                            case -1220066608: {
                                var12_12 = "dangalUHD";
                                var11_11 = (int)var9_9.equals(var12_12);
                                if (var11_11 == 0) ** GOTO lbl-1000
                                var11_11 = 2;
                                break;
                            }
                            case -1220081023: {
                                var12_12 = "dangalFHD";
                                var11_11 = (int)var9_9.equals(var12_12);
                                if (var11_11 == 0) ** GOTO lbl-1000
                                var11_11 = 1;
                                break;
                            }
                            case -1339091551: {
                                var12_12 = "dangal";
                                var11_11 = (int)var9_9.equals(var12_12);
                                if (var11_11 == 0) ** GOTO lbl-1000
                                var11_11 = 0;
                                var12_12 = null;
                            }
                        }
                        switch (var11_11) {
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
                                    var7_7 = true;
                                    break block186;
                                    break;
                                }
                            }
                        }
lbl-1000:
                        // 2 sources

                        {
                            if (var8_8 <= var2_2 && (var11_11 = (int)(var12_12 = "HWEML").equals(var9_9 = gz3.b)) != 0) ** GOTO lbl-1000
                            var12_12 = gz3.d;
                            var12_12.getClass();
                            var13_15 = var12_12.hashCode();
                        }
                        switch (var13_15) lbl-1000:
                        // 10 sources

                        {
                            default: {
                                var13_15 = -1;
                                break;
                            }
                            case 2119412532: {
                                var9_9 = "AFTEUFF014";
                                var13_15 = (int)var12_12.equals(var9_9);
                                if (var13_15 == 0) ** GOTO lbl-1000
                                var13_15 = 8;
                                break;
                            }
                            case 1798172390: {
                                var9_9 = "AFTSO001";
                                var13_15 = (int)var12_12.equals(var9_9);
                                if (var13_15 == 0) ** GOTO lbl-1000
                                var13_15 = 7;
                                break;
                            }
                            case 1785421876: {
                                var9_9 = "AFTEU014";
                                var13_15 = (int)var12_12.equals(var9_9);
                                if (var13_15 == 0) ** GOTO lbl-1000
                                var13_15 = 6;
                                break;
                            }
                            case 1785421873: {
                                var9_9 = "AFTEU011";
                                var13_15 = (int)var12_12.equals(var9_9);
                                if (var13_15 == 0) ** GOTO lbl-1000
                                var13_15 = 5;
                                break;
                            }
                            case 2006371: {
                                var9_9 = "AFTR";
                                var13_15 = (int)var12_12.equals(var9_9);
                                if (var13_15 == 0) ** GOTO lbl-1000
                                var13_15 = 4;
                                break;
                            }
                            case 2006367: {
                                var9_9 = "AFTN";
                                var13_15 = (int)var12_12.equals(var9_9);
                                if (var13_15 == 0) ** GOTO lbl-1000
                                var13_15 = 3;
                                break;
                            }
                            case 2006354: {
                                var9_9 = "AFTA";
                                var13_15 = (int)var12_12.equals(var9_9);
                                if (var13_15 == 0) ** GOTO lbl-1000
                                var13_15 = 2;
                                break;
                            }
                            case -321033677: {
                                var9_9 = "AFTKMST12";
                                var13_15 = (int)var12_12.equals(var9_9);
                                if (var13_15 == 0) ** GOTO lbl-1000
                                var13_15 = 1;
                                break;
                            }
                            case -349662828: {
                                var9_9 = "AFTJMST12";
                                var13_15 = (int)var12_12.equals(var9_9);
                                if (var13_15 == 0) ** GOTO lbl-1000
                                var13_15 = 0;
                                var9_9 = null;
                            }
                        }
                        switch (var13_15) {
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
                        if (var8_8 > var1_1) break block186;
                        {
                            var14_16 = gz3.b;
                            var14_16.getClass();
                            var13_15 = var14_16.hashCode();
                        }
                        switch (var13_15) lbl-1000:
                        // 141 sources

                        {
                            default: {
                                var1_1 = -1;
                                break;
                            }
                            case 2048855701: {
                                var15_13 = "HWWAS-H";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 139;
                                break;
                            }
                            case 2048319463: {
                                var15_13 = "HWVNS-H";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 138;
                                break;
                            }
                            case 2047252157: {
                                var15_13 = "ELUGA_Prim";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 137;
                                break;
                            }
                            case 2047190025: {
                                var15_13 = "ELUGA_Note";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 136;
                                break;
                            }
                            case 2033393791: {
                                var15_13 = "ASUS_X00AD_2";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 135;
                                break;
                            }
                            case 2030379515: {
                                var15_13 = "HWCAM-H";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 134;
                                break;
                            }
                            case 2029784656: {
                                var15_13 = "HWBLN-H";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 133;
                                break;
                            }
                            case 2019281702: {
                                var15_13 = "DM-01K";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 132;
                                break;
                            }
                            case 2006372676: {
                                var15_13 = "BRAVIA_ATV3_4K";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 131;
                                break;
                            }
                            case 1977196784: {
                                var15_13 = "Infinix-X572";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 130;
                                break;
                            }
                            case 1906253259: {
                                var15_13 = "PB2-670M";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 129;
                                break;
                            }
                            case 1865889110: {
                                var15_13 = "santoni";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 128;
                                break;
                            }
                            case 1709443163: {
                                var15_13 = "iball8735_9806";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 127;
                                break;
                            }
                            case 1691544261: {
                                var15_13 = "CPH1715";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 126;
                                break;
                            }
                            case 1691543273: {
                                var15_13 = "CPH1609";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 125;
                                break;
                            }
                            case 1522194893: {
                                var15_13 = "woods_f";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 124;
                                break;
                            }
                            case 1349174697: {
                                var15_13 = "htc_e56ml_dtul";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 123;
                                break;
                            }
                            case 1306947716: {
                                var15_13 = "EverStar_S";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 122;
                                break;
                            }
                            case 1280332038: {
                                var15_13 = "hwALE-H";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 121;
                                break;
                            }
                            case 1176899427: {
                                var15_13 = "itel_S41";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 120;
                                break;
                            }
                            case 1150207623: {
                                var15_13 = "LS-5017";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 119;
                                break;
                            }
                            case 1060579533: {
                                var15_13 = "panell_d";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 118;
                                break;
                            }
                            case 958008161: {
                                var15_13 = "j2xlteins";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 117;
                                break;
                            }
                            case 917340916: {
                                var15_13 = "A7000plus";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 116;
                                break;
                            }
                            case 835649806: {
                                var15_13 = "manning";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 115;
                                break;
                            }
                            case 794040393: {
                                var15_13 = "GIONEE_WBL7519";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 114;
                                break;
                            }
                            case 794038622: {
                                var15_13 = "GIONEE_WBL7365";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 113;
                                break;
                            }
                            case 793982701: {
                                var15_13 = "GIONEE_WBL5708";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 112;
                                break;
                            }
                            case 507412548: {
                                var15_13 = "QM16XE_U";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 111;
                                break;
                            }
                            case 407160593: {
                                var15_13 = "Pixi5-10_4G";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 110;
                                break;
                            }
                            case 316246818: {
                                var15_13 = "TB3-850M";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 109;
                                break;
                            }
                            case 316246811: {
                                var15_13 = "TB3-850F";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 108;
                                break;
                            }
                            case 316215116: {
                                var15_13 = "TB3-730X";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 107;
                                break;
                            }
                            case 316215098: {
                                var15_13 = "TB3-730F";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 106;
                                break;
                            }
                            case 308517133: {
                                var15_13 = "A7020a48";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 105;
                                break;
                            }
                            case 307593612: {
                                var15_13 = "A7010a48";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 104;
                                break;
                            }
                            case 287431619: {
                                var15_13 = "griffin";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 103;
                                break;
                            }
                            case 245388979: {
                                var15_13 = "marino_f";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 102;
                                break;
                            }
                            case 182191441: {
                                var15_13 = "CPY83_I00";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 101;
                                break;
                            }
                            case 165221241: {
                                var15_13 = "A2016a40";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 100;
                                break;
                            }
                            case 102844228: {
                                var15_13 = "le_x6";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 99;
                                break;
                            }
                            case 101370885: {
                                var15_13 = "l5460";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 98;
                                break;
                            }
                            case 98715550: {
                                var15_13 = "i9031";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 97;
                                break;
                            }
                            case 82882791: {
                                var15_13 = "X3_HK";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 96;
                                break;
                            }
                            case 80963634: {
                                var15_13 = "V23GB";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 95;
                                break;
                            }
                            case 76404911: {
                                var15_13 = "Q4310";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 94;
                                break;
                            }
                            case 76404105: {
                                var15_13 = "Q4260";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 93;
                                break;
                            }
                            case 76402249: {
                                var15_13 = "PRO7S";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 92;
                                break;
                            }
                            case 66216390: {
                                var15_13 = "F3311";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 91;
                                break;
                            }
                            case 66215433: {
                                var15_13 = "F3215";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 90;
                                break;
                            }
                            case 66215431: {
                                var15_13 = "F3213";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 89;
                                break;
                            }
                            case 66215429: {
                                var15_13 = "F3211";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 88;
                                break;
                            }
                            case 66214473: {
                                var15_13 = "F3116";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 87;
                                break;
                            }
                            case 66214470: {
                                var15_13 = "F3113";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 86;
                                break;
                            }
                            case 66214468: {
                                var15_13 = "F3111";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 85;
                                break;
                            }
                            case 65355429: {
                                var15_13 = "E5643";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 84;
                                break;
                            }
                            case 61542055: {
                                var15_13 = "A1601";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 83;
                                break;
                            }
                            case 55178625: {
                                var15_13 = "Aura_Note_2";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 82;
                                break;
                            }
                            case 51350594: {
                                var15_13 = "602LV";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 81;
                                break;
                            }
                            case 51349633: {
                                var15_13 = "601LV";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 80;
                                break;
                            }
                            case 41325051: {
                                var15_13 = "MEIZU_M5";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 79;
                                break;
                            }
                            case 3386211: {
                                var15_13 = "p212";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 78;
                                break;
                            }
                            case 0x332327: {
                                var15_13 = "mido";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 77;
                                break;
                            }
                            case 3284551: {
                                var15_13 = "kate";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 76;
                                break;
                            }
                            case 3154429: {
                                var15_13 = "fugu";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 75;
                                break;
                            }
                            case 2689555: {
                                var15_13 = "XE2X";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 74;
                                break;
                            }
                            case 2464648: {
                                var15_13 = "Q427";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 73;
                                break;
                            }
                            case 2463773: {
                                var15_13 = "Q350";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 72;
                                break;
                            }
                            case 0x252F5F: {
                                var15_13 = "P681";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 71;
                                break;
                            }
                            case 2133184: {
                                var15_13 = "F04J";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 70;
                                break;
                            }
                            case 2133182: {
                                var15_13 = "F04H";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 69;
                                break;
                            }
                            case 2133151: {
                                var15_13 = "F03H";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 68;
                                break;
                            }
                            case 2133120: {
                                var15_13 = "F02H";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 67;
                                break;
                            }
                            case 2133091: {
                                var15_13 = "F01J";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 66;
                                break;
                            }
                            case 2133089: {
                                var15_13 = "F01H";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 65;
                                break;
                            }
                            case 1514185: {
                                var15_13 = "1714";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 64;
                                break;
                            }
                            case 1514184: {
                                var15_13 = "1713";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 63;
                                break;
                            }
                            case 1513190: {
                                var15_13 = "1601";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 62;
                                break;
                            }
                            case 101481: {
                                var15_13 = "flo";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 61;
                                break;
                            }
                            case 99329: {
                                var15_13 = "deb";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 60;
                                break;
                            }
                            case 98848: {
                                var15_13 = "cv3";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 59;
                                break;
                            }
                            case 98846: {
                                var15_13 = "cv1";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 58;
                                break;
                            }
                            case 88274: {
                                var15_13 = "Z80";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 57;
                                break;
                            }
                            case 80618: {
                                var15_13 = "QX1";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 56;
                                break;
                            }
                            case 79305: {
                                var15_13 = "PLE";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 55;
                                break;
                            }
                            case 78669: {
                                var15_13 = "P85";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 54;
                                break;
                            }
                            case 76779: {
                                var15_13 = "MX6";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 53;
                                break;
                            }
                            case 75739: {
                                var15_13 = "M5c";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 52;
                                break;
                            }
                            case 75537: {
                                var15_13 = "M04";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 51;
                                break;
                            }
                            case 73405: {
                                var15_13 = "JGZ";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 50;
                                break;
                            }
                            case 3483: {
                                var15_13 = "mh";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 49;
                                break;
                            }
                            case 3091: {
                                var15_13 = "b5";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 48;
                                break;
                            }
                            case 2719: {
                                var15_13 = "V5";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 47;
                                break;
                            }
                            case 2715: {
                                var15_13 = "V1";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 46;
                                break;
                            }
                            case 2564: {
                                var15_13 = "Q5";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 45;
                                break;
                            }
                            case 2126: {
                                var15_13 = "C1";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 44;
                                break;
                            }
                            case -56598463: {
                                var15_13 = "woods_fn";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 43;
                                break;
                            }
                            case -173639913: {
                                var15_13 = "ELUGA_A3_Pro";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 42;
                                break;
                            }
                            case -277133239: {
                                var15_13 = "Z12_PRO";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 41;
                                break;
                            }
                            case -282781963: {
                                var15_13 = "BLACK-1X";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 40;
                                break;
                            }
                            case -290434366: {
                                var15_13 = "taido_row";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 39;
                                break;
                            }
                            case -430914369: {
                                var15_13 = "Pixi4-7_3G";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 38;
                                break;
                            }
                            case -521118391: {
                                var15_13 = "GIONEE_GBL7360";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 37;
                                break;
                            }
                            case -575125681: {
                                var15_13 = "GiONEE_CBL7513";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 36;
                                break;
                            }
                            case -782144577: {
                                var15_13 = "OnePlus5T";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 35;
                                break;
                            }
                            case -788334647: {
                                var15_13 = "whyred";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 34;
                                break;
                            }
                            case -794946968: {
                                var15_13 = "watson";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 33;
                                break;
                            }
                            case -797483286: {
                                var15_13 = "SVP-DTV15";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 32;
                                break;
                            }
                            case -821392978: {
                                var15_13 = "A7000-a";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 31;
                                break;
                            }
                            case -842500323: {
                                var15_13 = "nicklaus_f";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 30;
                                break;
                            }
                            case -879245230: {
                                var15_13 = "tcl_eu";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 29;
                                break;
                            }
                            case -958336948: {
                                var15_13 = "ELUGA_Ray_X";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 28;
                                break;
                            }
                            case -965403638: {
                                var15_13 = "s905x018";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 27;
                                break;
                            }
                            case -993250458: {
                                var16_17 = "A10-70L";
                                var2_2 = (int)var14_16.equals(var16_17);
                                if (var2_2 != 0) break;
                                ** GOTO lbl-1000
                            }
                            case -993250464: {
                                var15_13 = "A10-70F";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 25;
                                break;
                            }
                            case -1052835013: {
                                var15_13 = "namath";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 24;
                                break;
                            }
                            case -1139198265: {
                                var15_13 = "Slate_Pro";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 23;
                                break;
                            }
                            case -1180384755: {
                                var15_13 = "iris60";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 22;
                                break;
                            }
                            case -1217592143: {
                                var15_13 = "BRAVIA_ATV2";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 21;
                                break;
                            }
                            case -1320080169: {
                                var15_13 = "GiONEE_GBL7319";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 20;
                                break;
                            }
                            case -1481772729: {
                                var15_13 = "panell_dt";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 19;
                                break;
                            }
                            case -1481772730: {
                                var15_13 = "panell_ds";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 18;
                                break;
                            }
                            case -1481772737: {
                                var15_13 = "panell_dl";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 17;
                                break;
                            }
                            case -1554255044: {
                                var15_13 = "vernee_M5";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 16;
                                break;
                            }
                            case -1600724499: {
                                var15_13 = "pacificrim";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 15;
                                break;
                            }
                            case -1615810839: {
                                var15_13 = "Phantom6";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 14;
                                break;
                            }
                            case -1680025915: {
                                var15_13 = "ComioS1";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 13;
                                break;
                            }
                            case -1696512866: {
                                var15_13 = "XT1663";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 12;
                                break;
                            }
                            case -1885099851: {
                                var15_13 = "RAIJIN";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 11;
                                break;
                            }
                            case -1931988508: {
                                var15_13 = "AquaPowerM";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 10;
                                break;
                            }
                            case -1936688065: {
                                var15_13 = "PGN611";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 9;
                                break;
                            }
                            case -1936688066: {
                                var15_13 = "PGN610";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 8;
                                break;
                            }
                            case -1936688988: {
                                var15_13 = "PGN528";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 7;
                                break;
                            }
                            case -1978990237: {
                                var15_13 = "NX573J";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 6;
                                break;
                            }
                            case -1978993182: {
                                var15_13 = "NX541J";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 5;
                                break;
                            }
                            case -2022874474: {
                                var15_13 = "CP8676_I02";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 4;
                                break;
                            }
                            case -2097309513: {
                                var15_13 = "K50a40";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 3;
                                break;
                            }
                            case -2144781160: {
                                var15_13 = "GIONEE_SWW1631";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 2;
                                break;
                            }
                            case -2144781185: {
                                var15_13 = "GIONEE_SWW1627";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 1;
                                break;
                            }
                            case -2144781245: {
                                var15_13 = "GIONEE_SWW1609";
                                var1_1 = (int)var14_16.equals(var15_13);
                                if (var1_1 == 0) ** GOTO lbl-1000
                                var1_1 = 0;
                                var15_13 = null;
                            }
                        }
                        switch (var1_1) {
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
                        var15_13 = "JSN-L21";
                        var1_1 = (int)var12_12.equals(var15_13);
                        if (var1_1 == 0) ** break;
                        ** continue;
                    }
                    androidx.media3.exoplayer.video.b.F1 = var7_7;
                    androidx.media3.exoplayer.video.b.E1 = var4_4;
                }
                return androidx.media3.exoplayer.video.b.F1;
            }
            throw var15_14;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int E0(e e2, androidx.media3.common.d object) {
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        String string2;
        int n14;
        int n15;
        block20: {
            block21: {
                n15 = 3;
                n14 = 4;
                string2 = "video/hevc";
                String string3 = "video/avc";
                n10 = 2;
                int n16 = 1;
                n8 = ((androidx.media3.common.d)object).v;
                n7 = -1;
                if (n8 == n7) return n7;
                n4 = ((androidx.media3.common.d)object).w;
                if (n4 == n7) {
                    return n7;
                }
                String string4 = ((androidx.media3.common.d)object).o;
                string4.getClass();
                String string5 = "video/dolby-vision";
                boolean bl2 = string5.equals(string4);
                if (bl2) {
                    int n17;
                    string4 = (object = MediaCodecUtil.d((androidx.media3.common.d)object)) != null && ((n3 = ((Integer)(object = (Integer)((Pair)object).first)).intValue()) == (n17 = 512) || n3 == n16 || n3 == n10) ? string3 : string2;
                }
                n3 = string4.hashCode();
                switch (n3) {
                    case 1599127257: {
                        object = "video/x-vnd.on2.vp9";
                        n3 = (int)(string4.equals(object) ? 1 : 0);
                        if (n3 == 0) break;
                        n10 = 6;
                        break block20;
                    }
                    case 1599127256: {
                        object = "video/x-vnd.on2.vp8";
                        n3 = (int)(string4.equals(object) ? 1 : 0);
                        if (n3 == 0) break;
                        n10 = 5;
                        break block20;
                    }
                    case 1331836730: {
                        n3 = (int)(string4.equals(string3) ? 1 : 0);
                        if (n3 == 0) break;
                        n10 = 4;
                        break block20;
                    }
                    case 1187890754: {
                        object = "video/mp4v-es";
                        n3 = (int)(string4.equals(object) ? 1 : 0);
                        if (n3 == 0) break;
                        n10 = 3;
                        break block20;
                    }
                    case -1662541442: {
                        n3 = (int)(string4.equals(string2) ? 1 : 0);
                        if (n3 == 0) {
                            break;
                        }
                        break block20;
                    }
                    case -1662735862: {
                        object = "video/av01";
                        n3 = (int)(string4.equals(object) ? 1 : 0);
                        if (n3 == 0) break;
                        n10 = 1;
                        break block20;
                    }
                    case -1664118616: {
                        object = "video/3gpp";
                        n3 = (int)(string4.equals(object) ? 1 : 0);
                        if (n3 != 0) break block21;
                    }
                }
                n10 = -1;
                break block20;
            }
            n10 = 0;
        }
        switch (n10) {
            default: {
                return n7;
            }
            case 6: {
                return n8 * n4 * 3 / 8;
            }
            case 4: {
                int n18;
                object = gz3.d;
                String string6 = "BRAVIA 4K 2015";
                n15 = (int)(string6.equals(object) ? 1 : 0);
                if (n15 != 0) return n7;
                string6 = "Amazon";
                string2 = gz3.c;
                n15 = (int)(string6.equals(string2) ? 1 : 0);
                if (n15 != 0) {
                    string6 = "KFSOWI";
                    n15 = (int)(string6.equals(object) ? 1 : 0);
                    if (n15 != 0) return n7;
                    string6 = "AFTS";
                    n3 = (int)(string6.equals(object) ? 1 : 0);
                    if (n3 != 0 && (n18 = (int)(e2.f ? 1 : 0)) != 0) {
                        return n7;
                    }
                }
                n18 = 16;
                n3 = gz3.e(n8, n18);
                return gz3.e(n4, n18) * n3 * 768 / n14;
            }
            case 2: {
                n8 = n8 * n4 * 3 / n14;
                return Math.max(0x200000, n8);
            }
            case 0: 
            case 1: 
            case 3: 
            case 5: 
        }
        return n8 * n4 * 3 / n14;
    }

    public static List F0(Context object, androidx.media3.exoplayer.mediacodec.g g3, androidx.media3.common.d d2, boolean bl2, boolean bl3) {
        boolean bl4;
        String string2;
        boolean bl5;
        String string3 = d2.o;
        if (string3 == null) {
            return ImmutableList.of();
        }
        int n3 = gz3.a;
        int n4 = 26;
        if (n3 >= n4 && (bl5 = (string2 = "video/dolby-vision").equals(string3)) && !(bl4 = b$c.a((Context)object)) && !(bl5 = (object = (object = MediaCodecUtil.b(d2)) == null ? ImmutableList.of() : g3.a((String)object, bl2, bl3)).isEmpty())) {
            return object;
        }
        return MediaCodecUtil.g(g3, d2, bl2, bl3);
    }

    public static int G0(e object, androidx.media3.common.d d2) {
        int n3 = d2.p;
        int n4 = -1;
        if (n3 != n4) {
            object = d2.r;
            n3 = object.size();
            int n7 = 0;
            for (n4 = 0; n4 < n3; ++n4) {
                byte[] byArray = (byte[])object.get(n4);
                int n8 = byArray.length;
                n7 += n8;
            }
            return d2.p + n7;
        }
        return androidx.media3.exoplayer.video.b.E0((e)object, d2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void A() {
        long l2;
        f$a f$a = this.V0;
        Object object = null;
        this.u1 = null;
        this.B1 = l2 = -9223372036854775807L;
        Object object2 = this.d1;
        uC3 uC32 = null;
        if (object2 != null) {
            object2.q();
        } else {
            object2 = this.Y0;
            ((d)object2).d(0);
        }
        this.J0();
        this.j1 = false;
        this.y1 = null;
        try {
            super.A();
            object = this.O0;
            f$a.getClass();
        }
        catch (Throwable throwable) {
            object2 = this.O0;
            f$a.a((fj0)object2);
            object2 = wc3_0.d;
            f$a.b((wc3_0)object2);
            throw throwable;
        }
        object2 = f$a.a;
        if (object2 != null) {
            uC32 = new uC3(f$a, (fj0)object);
            object2.post((Runnable)uC32);
        }
        object = wc3_0.d;
        f$a.b((wc3_0)object);
    }

    public final void B(boolean bl2, boolean bl3) {
        Object object;
        Object object2;
        boolean bl4;
        Object object3 = new Object();
        this.O0 = object3;
        object3 = this.d;
        object3.getClass();
        int n3 = 1;
        float f5 = Float.MIN_VALUE;
        bl2 = ((uJ2)object3).b;
        if (bl2 && !(bl4 = this.x1)) {
            bl4 = false;
            object2 = null;
        } else {
            bl4 = true;
        }
        ct3.f(bl4);
        bl4 = this.w1;
        if (bl4 != bl2) {
            this.w1 = bl2;
            this.q0();
        }
        object3 = this.O0;
        object2 = this.V0;
        Object object4 = ((f$a)object2).a;
        if (object4 != null) {
            int n4 = 1;
            object = new yl1_2(n4, object2, object3);
            object4.post((Runnable)object);
        }
        bl2 = this.e1;
        object2 = this.Y0;
        if (!bl2) {
            object3 = this.f1;
            if (object3 != null && (object3 = this.d1) == null) {
                object4 = this.T0;
                object3 = new c$a((Context)object4, (d)object2);
                object4 = this.g;
                object4.getClass();
                ((c$a)object3).f = object4;
                boolean bl5 = ((c$a)object3).g ^ n3;
                ct3.f(bl5);
                object4 = ((c$a)object3).d;
                if (object4 == null) {
                    object4 = ((c$a)object3).c;
                    if (object4 == null) {
                        ((c$a)object3).c = object4 = new Object();
                    }
                    object = ((c$a)object3).c;
                    ((c$a)object3).d = object4 = new c$f((c$e)object);
                }
                object4 = new c((c$a)object3);
                ((c$a)object3).g = n3;
                this.d1 = object3 = ((c)object4).b;
            }
            this.e1 = n3;
        }
        if ((object3 = this.d1) != null) {
            Object object5 = new b$a(this);
            object2 = MoreExecutors.directExecutor();
            object3.v((b$a)object5, (Executor)object2);
            object3 = this.z1;
            if (object3 != null) {
                object5 = this.d1;
                object5.setVideoFrameMetadataListener((LB3)object3);
            }
            if ((object3 = this.g1) != null && !(bl2 = ((A63)(object3 = this.i1)).equals(object5 = A63.c))) {
                object3 = this.d1;
                object5 = this.g1;
                object2 = this.i1;
                object3.l((Surface)object5, (A63)object2);
            }
            object3 = this.d1;
            n3 = this.l1;
            object3.r(n3);
            object3 = this.d1;
            f5 = this.J;
            object3.setPlaybackSpeed(f5);
            object3 = this.f1;
            if (object3 != null) {
                object5 = this.d1;
                object5.setVideoEffects((List)object3);
            }
            object3 = this.d1;
            object3.n(bl3);
        } else {
            object3 = this.g;
            object3.getClass();
            ((d)object2).l = object3;
            ((d)object2).e = (int)(bl3 ? 1 : 0);
        }
    }

    public final void C(long l2, boolean bl2) {
        Object object = this.d1;
        int n3 = 1;
        if (object != null) {
            object.t(n3 != 0);
            VideoSink videoSink = this.d1;
            object = this.P0;
            long l3 = ((MediaCodecRenderer$b)object).b;
            long l4 = -this.A1;
            long l7 = this.l;
            long l8 = ((MediaCodecRenderer$b)object).c;
            videoSink.h(l3, l8, l4, l7);
            this.C1 = n3;
        }
        super.C(l2, bl2);
        Object object2 = this.d1;
        d d2 = this.Y0;
        if (object2 == null) {
            long l12;
            object2 = d2.b;
            ((OB3)object2).m = 0L;
            ((OB3)object2).p = l12 = (long)-1;
            ((OB3)object2).n = l12;
            d2.h = l12 = -9223372036854775807L;
            d2.f = l12;
            d2.d(n3);
            d2.i = l12;
        }
        object2 = null;
        if (bl2) {
            VideoSink videoSink = this.d1;
            if (videoSink != null) {
                videoSink.u(false);
            } else {
                d2.c(false);
            }
        }
        this.J0();
        this.o1 = 0;
    }

    public final void D() {
        boolean bl2;
        VideoSink videoSink = this.d1;
        if (videoSink != null && (bl2 = this.U0)) {
            videoSink.release();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void E() {
        Throwable throwable222222;
        long l2 = -9223372036854775807L;
        this.M();
        this.q0();
        DrmSession drmSession = this.F;
        if (drmSession != null) {
            drmSession.e(null);
        }
        this.F = null;
        this.e1 = false;
        this.A1 = l2;
        PlaceholderSurface placeholderSurface = this.h1;
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.h1 = null;
        }
        return;
        {
            catch (Throwable throwable222222) {}
        }
        catch (Throwable throwable3) {
            DrmSession drmSession2 = this.F;
            if (drmSession2 != null) {
                drmSession2.e(null);
            }
            this.F = null;
            throw throwable3;
        }
        this.e1 = false;
        this.A1 = l2;
        PlaceholderSurface placeholderSurface2 = this.h1;
        if (placeholderSurface2 != null) {
            placeholderSurface2.release();
            this.h1 = null;
        }
        throw throwable222222;
    }

    public final void F() {
        long l2;
        this.n1 = 0;
        VV vV = this.g;
        vV.getClass();
        this.m1 = l2 = vV.elapsedRealtime();
        this.q1 = l2 = 0L;
        this.r1 = 0;
        Object object = this.d1;
        if (object != null) {
            object.o();
        } else {
            object = this.Y0;
            ((d)object).e();
        }
    }

    public final void G() {
        Object object;
        this.I0();
        int n3 = this.r1;
        if (n3 != 0) {
            long l2;
            long l3 = this.q1;
            f$a f$a = this.V0;
            Handler handler = f$a.a;
            if (handler != null) {
                rC3 rC32 = new rC3(n3, l3, f$a);
                handler.post((Runnable)rC32);
            }
            this.q1 = l2 = 0L;
            n3 = 0;
            object = null;
            this.r1 = 0;
        }
        if ((object = this.d1) != null) {
            object.i();
        } else {
            object = this.Y0;
            ((d)object).f();
        }
    }

    public final void H(androidx.media3.common.d[] object, long l2, long l3, j$b j$b) {
        boolean bl2;
        super.H((androidx.media3.common.d[])object, l2, l3, j$b);
        l3 = this.A1;
        long l4 = -9223372036854775807L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 == false) {
            this.A1 = l2;
        }
        if (bl2 = ((g)(object = this.p)).q()) {
            this.B1 = l4;
        } else {
            long l8;
            j$b.getClass();
            g$b g$b = new g$b();
            Object object2 = j$b.a;
            object = ((g)object).h(object2, g$b);
            this.B1 = l8 = ((g$b)object).d;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Surface H0(e object) {
        Object object2;
        block14: {
            Handler handler;
            int n3;
            boolean bl2;
            int n4;
            int n7;
            block17: {
                block16: {
                    block15: {
                        int n8;
                        object2 = this.d1;
                        if (object2 != null) {
                            return object2.e();
                        }
                        object2 = this.g1;
                        if (object2 != null) {
                            return object2;
                        }
                        n7 = gz3.a;
                        n4 = 35;
                        bl2 = false;
                        if (n7 >= n4 && (n7 = (int)(((e)object).h ? 1 : 0)) != 0) {
                            return null;
                        }
                        n7 = (int)(this.L0((e)object) ? 1 : 0);
                        ct3.f(n7 != 0);
                        object2 = this.h1;
                        if (object2 != null && (n4 = ((PlaceholderSurface)((Object)object2)).a) != (n8 = ((e)object).f) && object2 != null) {
                            ((PlaceholderSurface)((Object)object2)).release();
                            this.h1 = null;
                        }
                        if ((object2 = this.h1) != null) return this.h1;
                        object2 = this.T0;
                        n3 = ((e)object).f;
                        n4 = 1;
                        bl2 = false;
                        if (n3 == 0) break block15;
                        n7 = (int)(PlaceholderSurface.a((Context)object2) ? 1 : 0);
                        if (n7 != 0) break block16;
                        n7 = 0;
                        object2 = null;
                        break block17;
                    }
                    n7 = PlaceholderSurface.d;
                }
                n7 = 1;
            }
            ct3.f(n7 != 0);
            object2 = new PlaceholderSurface$PlaceholderSurfaceThread();
            if (n3 != 0) {
                n3 = PlaceholderSurface.d;
            } else {
                n3 = 0;
                object = null;
            }
            ((Thread)object2).start();
            Object object3 = object2.getLooper();
            ((PlaceholderSurface$PlaceholderSurfaceThread)((Object)object2)).b = handler = new Handler(object3, (Handler.Callback)object2);
            object3 = new EGLSurfaceTexture(handler);
            ((PlaceholderSurface$PlaceholderSurfaceThread)((Object)object2)).a = object3;
            synchronized (object2) {
                handler = ((PlaceholderSurface$PlaceholderSurfaceThread)((Object)object2)).b;
                object = handler.obtainMessage(n4, n3, 0);
                object.sendToTarget();
                while ((object = ((PlaceholderSurface$PlaceholderSurfaceThread)((Object)object2)).e) == null && (object = ((PlaceholderSurface$PlaceholderSurfaceThread)((Object)object2)).d) == null && (object = ((PlaceholderSurface$PlaceholderSurfaceThread)((Object)object2)).c) == null) {
                    try {
                        object2.wait();
                    }
                    catch (InterruptedException interruptedException) {
                        bl2 = true;
                    }
                }
                // MONITOREXIT @DISABLED, blocks:[0, 4] lbl55 : MonitorExitStatement: MONITOREXIT : var2_3
                if (!bl2) break block14;
            }
            object = Thread.currentThread();
            ((Thread)object).interrupt();
        }
        if ((object = ((PlaceholderSurface$PlaceholderSurfaceThread)((Object)object2)).d) != null) throw object;
        object = ((PlaceholderSurface$PlaceholderSurfaceThread)((Object)object2)).c;
        if (object != null) throw object;
        object = ((PlaceholderSurface$PlaceholderSurfaceThread)((Object)object2)).e;
        object.getClass();
        this.h1 = object;
        return this.h1;
        {
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void I0() {
        int n3 = this.n1;
        if (n3 > 0) {
            VV vV = this.g;
            vV.getClass();
            long l2 = vV.elapsedRealtime();
            long l3 = this.m1;
            l3 = l2 - l3;
            int n4 = this.n1;
            f$a f$a = this.V0;
            Handler handler = f$a.a;
            if (handler != null) {
                pc3_1 pc3_12 = new pc3_1(n4, l3, f$a);
                handler.post((Runnable)pc3_12);
            }
            this.n1 = 0;
            this.m1 = l2;
        }
    }

    public final void J0() {
        int n3;
        int n4 = this.w1;
        if (n4 != 0 && (n4 = gz3.a) >= (n3 = 23)) {
            androidx.media3.exoplayer.mediacodec.d d2 = this.L;
            if (d2 == null) {
                return;
            }
            Object object = new b$e(this, d2);
            this.y1 = object;
            int n7 = 33;
            if (n4 >= n7) {
                Bundle bundle = new Bundle();
                object = "tunnel-peek";
                int n8 = 1;
                bundle.putInt((String)object, n8);
                d2.b(bundle);
            }
        }
    }

    public final hj0 K(e e2, androidx.media3.common.d d2, androidx.media3.common.d d5) {
        int n3;
        int n4;
        hj0 hj02 = e2.b(d2, d5);
        Object object = this.a1;
        object.getClass();
        int n7 = d5.v;
        int n8 = ((b$d)object).a;
        int n10 = hj02.e;
        if (n7 > n8 || (n7 = d5.w) > (n8 = ((b$d)object).b)) {
            n10 |= 0x100;
        }
        if ((n7 = androidx.media3.exoplayer.video.b.G0(e2, d5)) > (n4 = ((b$d)object).c)) {
            n10 |= 0x40;
        }
        int n14 = n10;
        if (n10 != 0) {
            boolean bl2 = false;
            hj02 = null;
            n3 = 0;
        } else {
            int n15;
            n3 = n15 = hj02.d;
        }
        String string2 = e2.a;
        object = new hj0(string2, d2, d5, n3, n14);
        return object;
    }

    public final void K0(androidx.media3.exoplayer.mediacodec.d object, int n3, long l2) {
        Object object2 = "releaseOutputBuffer";
        Trace.beginSection((String)object2);
        object.j(n3, l2);
        Trace.endSection();
        object = this.O0;
        n3 = ((fj0)object).e;
        int n4 = 1;
        ((fj0)object).e = n3 += n4;
        boolean bl2 = false;
        object = null;
        this.o1 = 0;
        Object object3 = this.d1;
        if (object3 == null) {
            long l3;
            boolean bl3;
            object3 = this.t1;
            Object object4 = wc3_0.d;
            boolean n7 = ((wc3_0)object3).equals(object4);
            object2 = this.V0;
            if (!n7 && !(bl3 = ((wc3_0)object3).equals(object4 = this.u1))) {
                this.u1 = object3;
                ((f$a)object2).b((wc3_0)object3);
            }
            object3 = this.Y0;
            int n8 = ((d)object3).e;
            int n10 = 3;
            if (n8 != n10) {
                bl2 = true;
            }
            ((d)object3).e = n10;
            object4 = ((d)object3).l;
            ((d)object3).g = l3 = gz3.I(object4.elapsedRealtime());
            if (bl2 && (object = this.g1) != null) {
                object3 = ((f$a)object2).a;
                if (object3 != null) {
                    l3 = SystemClock.elapsedRealtime();
                    object4 = new qc3_1((f$a)object2, object, l3);
                    object3.post((Runnable)object4);
                }
                this.j1 = n4;
            }
        }
    }

    public final MediaCodecDecoderException L(IllegalStateException illegalStateException, e e2) {
        Surface surface = this.g1;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecDecoderException(illegalStateException, e2);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    public final boolean L0(e e2) {
        boolean bl2;
        String string2;
        int n3 = gz3.a;
        int n4 = 23;
        if (n3 >= n4 && (n3 = (int)(this.w1 ? 1 : 0)) == 0 && (n3 = (int)(androidx.media3.exoplayer.video.b.D0(string2 = e2.a) ? 1 : 0)) == 0 && (!(bl2 = e2.f) || (bl2 = PlaceholderSurface.a((Context)(e2 = this.T0))))) {
            bl2 = true;
        } else {
            bl2 = false;
            e2 = null;
        }
        return bl2;
    }

    public final void M0(androidx.media3.exoplayer.mediacodec.d object, int n3) {
        Trace.beginSection((String)"skipVideoBuffer");
        object.i(n3);
        Trace.endSection();
        object = this.O0;
        ((fj0)object).f = n3 = ((fj0)object).f + 1;
    }

    public final void N0(int n3, int n4) {
        int n7;
        fj0 fj02 = this.O0;
        fj02.h = n7 = fj02.h + n3;
        n3 += n4;
        fj02.g = n4 = fj02.g + n3;
        this.n1 = n4 = this.n1 + n3;
        this.o1 = n4 = this.o1 + n3;
        n3 = fj02.i;
        fj02.i = n3 = Math.max(n4, n3);
        n3 = this.W0;
        if (n3 > 0 && (n4 = this.n1) >= n3) {
            this.I0();
        }
    }

    public final void O0(long l2) {
        int n3;
        long l3;
        int n4;
        long l4;
        fj0 fj02 = this.O0;
        fj02.k = l4 = fj02.k + l2;
        fj02.l = n4 = fj02.l + 1;
        this.q1 = l3 = this.q1 + l2;
        this.r1 = n3 = this.r1 + 1;
    }

    public final int T(DecoderInputBuffer decoderInputBuffer) {
        long l2;
        long l3;
        long l4;
        long l7;
        int n3 = gz3.a;
        int n4 = 34;
        if (n3 >= n4 && (n3 = (int)(this.w1 ? 1 : 0)) != 0 && (l7 = (l4 = (l3 = decoderInputBuffer.f) - (l2 = this.l)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) < 0) {
            return 32;
        }
        return 0;
    }

    public final boolean U() {
        int n3;
        int n4 = this.w1;
        n4 = n4 != 0 && (n4 = gz3.a) < (n3 = 23) ? 1 : 0;
        return n4 != 0;
    }

    public final float V(float f5, androidx.media3.common.d[] dArray) {
        int n3 = dArray.length;
        float f6 = -1.0f;
        float f7 = -1.0f;
        for (int i3 = 0; i3 < n3; ++i3) {
            androidx.media3.common.d d2 = dArray[i3];
            float f8 = d2.x;
            float f11 = f8 - f6;
            Object object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
            if (object == false) continue;
            f7 = Math.max(f7, f8);
        }
        Object object = f7 == f6 ? 0 : (f7 > f6 ? 1 : -1);
        if (object != false) {
            f6 = f7 * f5;
        }
        return f6;
    }

    public final ArrayList W(androidx.media3.exoplayer.mediacodec.g object, androidx.media3.common.d object2, boolean bl2) {
        Context context = this.T0;
        boolean bl3 = this.w1;
        object = androidx.media3.exoplayer.video.b.F0(context, (androidx.media3.exoplayer.mediacodec.g)object, (androidx.media3.common.d)object2, bl2, bl3);
        Cloneable cloneable = MediaCodecUtil.a;
        cloneable = new ArrayList(object);
        object = new tl1_0(object2);
        object2 = new UL1((MediaCodecUtil$e)object);
        Collections.sort(cloneable, object2);
        return cloneable;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final androidx.media3.exoplayer.mediacodec.d$a X(e e2, androidx.media3.common.d d2, MediaCrypto mediaCrypto, float f5) {
        Object object;
        int n3;
        Object object2;
        int n4;
        float f6;
        Object object3;
        VX vX;
        float f7;
        float f8;
        int n7;
        b b2 = this;
        e e5 = e2;
        androidx.media3.common.d d5 = d2;
        float f11 = f5;
        Object object4 = this.j;
        object4.getClass();
        int n8 = d2.v;
        int n10 = androidx.media3.exoplayer.video.b.G0(e2, d2);
        int n14 = ((androidx.media3.common.d[])object4).length;
        int n15 = 1;
        float f12 = d2.x;
        int n16 = d2.v;
        VX vX2 = d2.C;
        int n17 = d2.w;
        int n18 = -1;
        if (n14 == n15) {
            if (n10 != n18 && (n7 = androidx.media3.exoplayer.video.b.E0(e2, d2)) != n18) {
                f8 = n10;
                n14 = 1069547520;
                f7 = 1.5f;
                n10 = Math.min((int)(f8 *= f7), n7);
            }
            object4 = new b$d(n8, n17, n10);
            vX = vX2;
        } else {
            boolean bl2;
            int n19;
            Object object5;
            Object object6;
            Object object7;
            n14 = ((androidx.media3.common.d[])object4).length;
            n15 = n17;
            float f14 = 0.0f;
            boolean bl3 = false;
            vX = null;
            for (int i3 = 0; i3 < n14; ++i3) {
                object7 = object4[i3];
                if (vX2 != null && (object6 = ((androidx.media3.common.d)object7).C) == null) {
                    object7 = ((androidx.media3.common.d)object7).a();
                    ((androidx.media3.common.d$a)object7).B = vX2;
                    object7 = object6 = new androidx.media3.common.d((androidx.media3.common.d$a)object7);
                }
                object6 = e5.b(d5, (androidx.media3.common.d)object7);
                n18 = ((hj0)object6).d;
                if (n18 != 0) {
                    n18 = ((androidx.media3.common.d)object7).w;
                    object5 = object4;
                    n7 = ((androidx.media3.common.d)object7).v;
                    n19 = n14;
                    n14 = -1;
                    f7 = 0.0f / 0.0f;
                    bl2 = n7 == n14 || n18 == n14;
                    bl3 |= bl2;
                    n7 = Math.max(n8, n7);
                    n15 = Math.max(n15, n18);
                    n8 = androidx.media3.exoplayer.video.b.G0(e5, (androidx.media3.common.d)object7);
                    n10 = Math.max(n10, n8);
                    n8 = n7;
                } else {
                    object5 = object4;
                    n19 = n14;
                    n14 = -1;
                    f7 = 0.0f / 0.0f;
                }
                object4 = object5;
                n14 = n19;
                n18 = -1;
            }
            if (!bl3) {
                vX = vX2;
            } else {
                block33: {
                    object4 = new StringBuilder("Resolutions unknown. Codec max resolution: ");
                    ((StringBuilder)object4).append(n8);
                    object3 = "x";
                    ((StringBuilder)object4).append((String)object3);
                    ((StringBuilder)object4).append(n15);
                    object4 = ((StringBuilder)object4).toString();
                    Cx.f((String)object4);
                    if (n17 > n16) {
                        n7 = 1;
                        f6 = Float.MIN_VALUE;
                    } else {
                        n7 = 0;
                        f6 = 0.0f;
                        object4 = null;
                    }
                    n4 = n7 != 0 ? n17 : n16;
                    n18 = n7 != 0 ? n16 : n17;
                    f14 = n18;
                    f11 = n4;
                    f14 /= f11;
                    object2 = D1;
                    vX = vX2;
                    int n20 = 0;
                    vX2 = null;
                    while (true) {
                        int n21;
                        int n22;
                        int n24 = 9;
                        float f15 = 1.3E-44f;
                        bl2 = false;
                        if (n20 >= n24) break;
                        n24 = object2[n20];
                        object5 = object2;
                        f11 = (float)n24 * f14;
                        n3 = (int)f11;
                        if (n24 <= n4 || n3 <= n18) break;
                        n19 = n3;
                        if (n7 == 0) {
                            n3 = n24;
                        }
                        if (n7 == 0) {
                            n24 = n19;
                        }
                        n19 = n7;
                        float f16 = f6;
                        object4 = e5.d;
                        if (object4 == null || (object4 = object4.getVideoCapabilities()) == null) {
                            n22 = n4;
                            n21 = n18;
                            n18 = 0;
                            object6 = null;
                        } else {
                            n22 = n4;
                            n4 = object4.getWidthAlignment();
                            n7 = object4.getHeightAlignment();
                            n21 = n18;
                            n3 = gz3.e(n3, n4) * n4;
                            n24 = gz3.e(n24, n7) * n7;
                            object6 = new Point(n3, n24);
                        }
                        if (object6 != null) {
                            n3 = ((Point)object6).x;
                            n7 = ((Point)object6).y;
                            object7 = object6;
                            f15 = f14;
                            double d7 = f12;
                            if ((n3 = (int)(e5.f(n3, n7, d7) ? 1 : 0)) != 0) {
                                break block33;
                            }
                        } else {
                            f15 = f14;
                        }
                        ++n20;
                        f14 = f15;
                        object2 = object5;
                        n7 = n19;
                        f6 = f16;
                        n4 = n22;
                        n18 = n21;
                    }
                    n4 = 0;
                    object7 = null;
                }
                if (object7 != null) {
                    n3 = ((Point)object7).x;
                    n8 = Math.max(n8, n3);
                    n3 = ((Point)object7).y;
                    n15 = Math.max(n15, n3);
                    object2 = d2.a();
                    ((androidx.media3.common.d$a)object2).u = n8;
                    ((androidx.media3.common.d$a)object2).v = n15;
                    object4 = new androidx.media3.common.d((androidx.media3.common.d$a)object2);
                    n3 = androidx.media3.exoplayer.video.b.E0(e5, (androidx.media3.common.d)object4);
                    n10 = Math.max(n10, n3);
                    object2 = new StringBuilder;
                    object4 = "Codec max resolution adjusted to: ";
                    ((StringBuilder)object2)((String)object4);
                    ((StringBuilder)object2).append(n8);
                    ((StringBuilder)object2).append((String)object3);
                    ((StringBuilder)object2).append(n15);
                    object2 = ((StringBuilder)object2).toString();
                    Cx.f((String)object2);
                }
            }
            object4 = new b$d(n8, n15, n10);
        }
        b2.a1 = object4;
        n3 = b2.w1;
        if (n3 != 0) {
            n3 = b2.x1;
        } else {
            n3 = 0;
            f11 = 0.0f;
            object2 = null;
        }
        d5 = new MediaFormat();
        Object object8 = e5.c;
        d5.setString("mime", (String)object8);
        d5.setInteger("width", n16);
        d5.setInteger("height", n17);
        Object object9 = d2;
        object8 = d2.r;
        hm1_0.b((MediaFormat)d5, (List)object8);
        n10 = -1082130432;
        f8 = -1.0f;
        n14 = (int)(f12 == f8 ? 0 : (f12 > f8 ? 1 : -1));
        if (n14 != 0) {
            object3 = "frame-rate";
            d5.setFloat((String)object3, f12);
        }
        object3 = "rotation-degrees";
        n15 = ((androidx.media3.common.d)object9).y;
        hm1_0.a((MediaFormat)d5, (String)object3, n15);
        if (vX != null) {
            object = vX;
            n4 = vX.c;
            hm1_0.a((MediaFormat)d5, "color-transfer", n4);
            n4 = vX.a;
            hm1_0.a((MediaFormat)d5, "color-standard", n4);
            n4 = vX.b;
            hm1_0.a((MediaFormat)d5, "color-range", n4);
            object3 = vX.d;
            if (object3 != null) {
                object3 = ByteBuffer.wrap((byte[])object3);
                object = "hdr-static-info";
                d5.setByteBuffer((String)object, (ByteBuffer)object3);
            }
        }
        if ((n14 = (int)(((String)(object3 = "video/dolby-vision")).equals(object = ((androidx.media3.common.d)object9).o) ? 1 : 0)) != 0 && (object3 = MediaCodecUtil.d(d2)) != null) {
            object3 = (Integer)((Pair)object3).first;
            n14 = (Integer)object3;
            object = "profile";
            hm1_0.a((MediaFormat)d5, (String)object, n14);
        }
        n14 = ((b$d)object4).a;
        object = "max-width";
        d5.setInteger((String)object, n14);
        n15 = ((b$d)object4).b;
        d5.setInteger("max-height", n15);
        object3 = "max-input-size";
        n7 = ((b$d)object4).c;
        hm1_0.a((MediaFormat)d5, (String)object3, n7);
        n7 = gz3.a;
        n14 = 23;
        f7 = 3.2E-44f;
        if (n7 >= n14) {
            object3 = "priority";
            n15 = 0;
            object = null;
            d5.setInteger((String)object3, 0);
            f7 = f5;
            n10 = f5 == f8 ? 0 : (f5 > f8 ? 1 : -1);
            if (n10 != 0) {
                object8 = "operating-rate";
                d5.setFloat((String)object8, f5);
            }
        }
        if ((n10 = (int)(b2.X0 ? 1 : 0)) != 0) {
            n14 = 1;
            f7 = Float.MIN_VALUE;
            d5.setInteger("no-post-process", n14);
            object8 = "auto-frc";
            n15 = 0;
            object = null;
            d5.setInteger((String)object8, 0);
        } else {
            n14 = 1;
            f7 = Float.MIN_VALUE;
        }
        if (n3 != 0) {
            d5.setFeatureEnabled("tunneled-playback", n14 != 0);
            object8 = "audio-session-id";
            d5.setInteger((String)object8, n3);
        }
        n3 = 35;
        f11 = 4.9E-44f;
        if (n7 >= n3) {
            n3 = -b2.v1;
            n7 = 0;
            f6 = 0.0f;
            n3 = Math.max(0, n3);
            object4 = "importance";
            d5.setInteger((String)object4, n3);
        }
        object8 = this.H0(e2);
        object2 = b2.d1;
        if (object2 != null && (n3 = (int)(gz3.F((Context)(object2 = b2.T0)) ? 1 : 0)) == 0) {
            object2 = "allow-frame-drop";
            n7 = 0;
            f6 = 0.0f;
            object4 = null;
            d5.setInteger((String)object2, 0);
        }
        object2 = object;
        e5 = e2;
        object4 = d5;
        d5 = d2;
        object9 = object8;
        object8 = mediaCrypto;
        return new androidx.media3.exoplayer.mediacodec.d$a(e2, (MediaFormat)object4, d2, (Surface)object9, mediaCrypto, null);
    }

    public final void Y(DecoderInputBuffer object) {
        int n3 = this.c1;
        if (n3 == 0) {
            return;
        }
        object = ((DecoderInputBuffer)object).g;
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
                object = this.L;
                object.getClass();
                Bundle bundle = new Bundle();
                String string2 = "hdr10-plus-info";
                bundle.putByteArray(string2, byArray);
                object.b(bundle);
            }
        }
    }

    public final boolean b() {
        VideoSink videoSink;
        boolean bl2 = this.K0;
        if (bl2 && ((videoSink = this.d1) == null || (bl2 = videoSink.b()))) {
            bl2 = true;
        } else {
            bl2 = false;
            videoSink = null;
        }
        return bl2;
    }

    public final boolean c() {
        boolean bl2;
        boolean bl3 = super.c();
        Object object = this.d1;
        if (object != null) {
            return object.j(bl3);
        }
        if (bl3 && ((object = this.L) == null || (object = this.g1) == null || (bl2 = this.w1))) {
            return true;
        }
        return this.Y0.b(bl3);
    }

    public final void d() {
        Object object = this.d1;
        if (object != null) {
            object.d();
        } else {
            object = this.Y0;
            int n3 = ((d)object).e;
            if (n3 == 0) {
                ((d)object).e = n3 = 1;
            }
        }
    }

    public final void d0(Exception exception) {
        Cx.d("Video codec error", exception);
        f$a f$a = this.V0;
        Handler handler = f$a.a;
        if (handler != null) {
            sC3 sC32 = new sC3(f$a, exception);
            handler.post((Runnable)sC32);
        }
    }

    public final void e0(long l2, String string2, long l3) {
        String string3;
        boolean bl2;
        f$a f$a = this.V0;
        Handler handler = f$a.a;
        if (handler != null) {
            oc3_0 oc3_02 = new oc3_0(f$a, string2, l2, l3);
            handler.post((Runnable)oc3_02);
        }
        this.b1 = bl2 = androidx.media3.exoplayer.video.b.D0(string2);
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.S;
        codecCapabilities.getClass();
        int n3 = gz3.a;
        int n4 = 29;
        boolean bl3 = false;
        if (n3 >= n4 && (n3 = (int)((string3 = "video/x-vnd.on2.vp9").equals(string2 = codecCapabilities.b) ? 1 : 0)) != 0) {
            codecCapabilities = codecCapabilities.d;
            if (codecCapabilities == null || (codecCapabilities = codecCapabilities.profileLevels) == null) {
                codecCapabilities = new MediaCodecInfo.CodecProfileLevel[]{};
            }
            n3 = ((MediaCodecInfo.CodecProfileLevel[])codecCapabilities).length;
            string2 = null;
            for (n4 = 0; n4 < n3; ++n4) {
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecCapabilities[n4];
                int n7 = codecProfileLevel.profile;
                int n8 = 16384;
                if (n7 != n8) continue;
                bl3 = true;
                break;
            }
        }
        this.c1 = bl3;
        this.J0();
    }

    public final void f0(String string2) {
        f$a f$a = this.V0;
        Handler handler = f$a.a;
        if (handler != null) {
            vc3_0 vc3_02 = new vc3_0(f$a, string2);
            handler.post((Runnable)vc3_02);
        }
    }

    public final void g(long l2, long l3) {
        super.g(l2, l3);
        VideoSink videoSink = this.d1;
        if (videoSink != null) {
            try {
                videoSink.g(l2, l3);
            }
            catch (VideoSink$VideoSinkException videoSink$VideoSinkException) {
                androidx.media3.common.d d2 = videoSink$VideoSinkException.a;
                throw this.z(videoSink$VideoSinkException, d2, false, 7001);
            }
        }
    }

    public final hj0 g0(HV0 object) {
        hj0 hj02 = super.g0((HV0)object);
        object = ((HV0)object).b;
        object.getClass();
        f$a f$a = this.V0;
        Handler handler = f$a.a;
        if (handler != null) {
            tC3 tC32 = new tC3(f$a, (androidx.media3.common.d)object, hj02);
            handler.post((Runnable)tC32);
        }
        return hj02;
    }

    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    public final void h0(androidx.media3.common.d object, MediaFormat object2) {
        int n3;
        float f5;
        int n4;
        int n7;
        block15: {
            int n8;
            float f6;
            int n10;
            block14: {
                int n14;
                Object object3 = this.L;
                if (object3 != null) {
                    n14 = this.k1;
                    object3.setVideoScalingMode(n14);
                }
                n7 = this.w1;
                n14 = 0;
                if (n7 != 0) {
                    n4 = ((androidx.media3.common.d)object).v;
                    n7 = ((androidx.media3.common.d)object).w;
                } else {
                    String string2;
                    object2.getClass();
                    object3 = "crop-right";
                    int n15 = object2.containsKey((String)object3);
                    n10 = 1;
                    f6 = Float.MIN_VALUE;
                    String string3 = "crop-top";
                    String string4 = "crop-bottom";
                    String string5 = "crop-left";
                    if (n15 != 0 && (n15 = object2.containsKey(string5)) != 0 && (n15 = object2.containsKey(string4)) != 0 && (n15 = object2.containsKey(string3)) != 0) {
                        n15 = 1;
                        f5 = Float.MIN_VALUE;
                    } else {
                        n15 = 0;
                        f5 = 0.0f;
                        string2 = null;
                    }
                    if (n15 != 0) {
                        n7 = object2.getInteger((String)object3);
                        int n16 = object2.getInteger(string5);
                        n7 = n7 - n16 + n10;
                    } else {
                        object3 = "width";
                        n7 = object2.getInteger((String)object3);
                    }
                    if (n15 != 0) {
                        n15 = object2.getInteger(string4);
                        n4 = object2.getInteger(string3);
                        n4 = n15 = n15 - n4 + n10;
                    } else {
                        string2 = "height";
                        n4 = object2.getInteger(string2);
                    }
                    n8 = n7;
                    n7 = n4;
                    n4 = n8;
                }
                f5 = ((androidx.media3.common.d)object).z;
                n10 = 90;
                f6 = 1.26E-43f;
                n3 = ((androidx.media3.common.d)object).y;
                if (n3 == n10) break block14;
                n10 = 270;
                f6 = 3.78E-43f;
                if (n3 != n10) break block15;
            }
            n10 = 1065353216;
            f6 = 1.0f;
            f5 = f6 / f5;
            n8 = n7;
            n7 = n4;
            n4 = n8;
        }
        Object object4 = new wc3_0(n4, n7, f5);
        this.t1 = object4;
        object4 = this.d1;
        if (object4 != null && (n3 = (int)(this.C1 ? 1 : 0)) != 0) {
            object = ((androidx.media3.common.d)object).a();
            ((androidx.media3.common.d$a)object).u = n4;
            ((androidx.media3.common.d$a)object).v = n7;
            ((androidx.media3.common.d$a)object).y = f5;
            object2 = new androidx.media3.common.d((androidx.media3.common.d$a)object);
            object4.p((androidx.media3.common.d)object2);
        } else {
            object2 = this.Y0;
            float f7 = ((androidx.media3.common.d)object).x;
            ((d)object2).g(f7);
        }
        this.C1 = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void j(int n3, Object object) {
        int n4;
        int n7 = 35;
        boolean bl2 = false;
        String string2 = null;
        int n8 = 1;
        d d2 = this.Y0;
        if (n3 != n8) {
            int n10 = 7;
            if (n3 == n10) {
                object.getClass();
                this.z1 = object = (LB3)object;
                VideoSink videoSink = this.d1;
                if (videoSink == null) return;
                videoSink.setVideoFrameMetadataListener((LB3)object);
                return;
            }
            n10 = 10;
            if (n3 == n10) {
                object.getClass();
                object = (Integer)object;
                n3 = (Integer)object;
                int n14 = this.x1;
                if (n14 == n3) return;
                this.x1 = n3;
                n3 = (int)(this.w1 ? 1 : 0);
                if (n3 == 0) return;
                this.q0();
                return;
            }
            n10 = 16;
            if (n3 != n10) {
                n7 = 4;
                if (n3 == n7) {
                    object.getClass();
                    this.k1 = n3 = ((Integer)object).intValue();
                    object = this.L;
                    if (object == null) return;
                    object.setVideoScalingMode(n3);
                    return;
                }
                n7 = 5;
                if (n3 != n7) {
                    n7 = 13;
                    if (n3 == n7) {
                        object.getClass();
                        this.f1 = object = (List)object;
                        VideoSink videoSink = this.d1;
                        if (videoSink == null) return;
                        videoSink.setVideoEffects((List)object);
                        return;
                    }
                    n7 = 14;
                    if (n3 != n7) {
                        n7 = 11;
                        if (n3 != n7) return;
                        this.G = object = (n$a)object;
                        return;
                    }
                    object.getClass();
                    object = (A63)object;
                    n3 = ((A63)object).a;
                    if (n3 == 0) return;
                    n3 = ((A63)object).b;
                    if (n3 == 0) return;
                    this.i1 = object;
                    VideoSink videoSink = this.d1;
                    if (videoSink == null) return;
                    Surface surface = this.g1;
                    ct3.h(surface);
                    videoSink.l(surface, (A63)object);
                    return;
                }
                object.getClass();
                this.l1 = n3 = ((Integer)object).intValue();
                object = this.d1;
                if (object != null) {
                    object.r(n3);
                    return;
                }
                object = d2.b;
                n7 = ((OB3)object).j;
                if (n7 == n3) {
                    return;
                }
                ((OB3)object).j = n3;
                ((OB3)object).d(n8 != 0);
                return;
            }
            object.getClass();
            object = (Integer)object;
            this.v1 = n3 = ((Integer)object).intValue();
            androidx.media3.exoplayer.mediacodec.d d5 = this.L;
            if (d5 == null) {
                return;
            }
            int n15 = gz3.a;
            if (n15 < n7) return;
            object = new Bundle();
            n7 = -this.v1;
            n7 = Math.max(0, n7);
            string2 = "importance";
            object.putInt(string2, n7);
            d5.b((Bundle)object);
            return;
        }
        n3 = object instanceof Surface;
        boolean bl3 = false;
        if (n3 != 0) {
            object = (Surface)object;
        } else {
            n4 = 0;
            object = null;
        }
        Object object2 = this.g1;
        f$a f$a = this.V0;
        if (object2 != object) {
            Object object3;
            this.g1 = object;
            object2 = this.d1;
            if (object2 == null) {
                d2.h((Surface)object);
            }
            this.j1 = false;
            n3 = this.h;
            androidx.media3.exoplayer.mediacodec.d d7 = this.L;
            if (d7 != null && (object3 = this.d1) == null) {
                int n16;
                int n17;
                object3 = this.S;
                object3.getClass();
                Surface surface = this.g1;
                if (surface != null && (n17 = (int)(surface.isValid() ? 1 : 0)) != 0 || (n17 = gz3.a) >= n7 && (n17 = (int)(((e)object3).h ? 1 : 0)) != 0 || (n17 = (int)(this.L0((e)object3) ? 1 : 0)) != 0) {
                    bl2 = true;
                }
                if ((n17 = gz3.a) >= (n16 = 23) && bl2 && !(bl2 = this.b1)) {
                    string2 = this.H0((e)object3);
                    if (n17 >= n16 && string2 != null) {
                        d7.h((Surface)string2);
                    } else {
                        if (n17 < n7) {
                            object2 = new IllegalStateException();
                            throw object2;
                        }
                        d7.f();
                    }
                } else {
                    this.q0();
                    this.b0();
                }
            }
            if (object != null) {
                object = this.u1;
                if (object != null) {
                    f$a.b((wc3_0)object);
                }
                if (n3 == (n4 = 2)) {
                    object2 = this.d1;
                    if (object2 != null) {
                        object2.u(n8 != 0);
                    } else {
                        d2.c(n8 != 0);
                    }
                }
            } else {
                this.u1 = null;
                object2 = this.d1;
                if (object2 != null) {
                    object2.s();
                }
            }
            this.J0();
            return;
        }
        if (object == null) return;
        object2 = this.u1;
        if (object2 != null) {
            f$a.b((wc3_0)object2);
        }
        if ((object2 = this.g1) == null) return;
        n4 = this.j1;
        if (n4 == 0) return;
        object = f$a.a;
        if (object == null) return;
        long l2 = SystemClock.elapsedRealtime();
        qc3_1 qc3_12 = new qc3_1(f$a, object2, l2);
        object.post((Runnable)qc3_12);
    }

    public final void j0(long l2) {
        super.j0(l2);
        int n3 = this.w1;
        if (n3 == 0) {
            this.p1 = n3 = this.p1 + -1;
        }
    }

    public final void k0() {
        VideoSink videoSink = this.d1;
        if (videoSink != null) {
            MediaCodecRenderer$b mediaCodecRenderer$b = this.P0;
            long l2 = mediaCodecRenderer$b.b;
            long l3 = mediaCodecRenderer$b.c;
            long l4 = -this.A1;
            long l7 = this.l;
            videoSink.h(l2, l3, l4, l7);
        } else {
            int n3 = 2;
            d d2 = this.Y0;
            d2.d(n3);
        }
        this.C1 = true;
        this.J0();
    }

    /*
     * WARNING - void declaration
     */
    public final void l0(DecoderInputBuffer object) {
        int n3;
        int n4;
        boolean n7 = this.w1;
        int n8 = 1;
        if (!n7) {
            this.p1 = n4 = this.p1 + n8;
        }
        if ((n4 = gz3.a) < (n3 = 23) && n7) {
            void var2_9;
            long l2;
            int n10;
            boolean bl2;
            long l3 = ((DecoderInputBuffer)object).f;
            this.C0(l3);
            object = this.t1;
            wc3_0 wc3_02 = wc3_0.d;
            boolean bl3 = ((wc3_0)object).equals(wc3_02);
            f$a f$a = this.V0;
            if (!bl3 && !(bl2 = ((wc3_0)object).equals(wc3_02 = this.u1))) {
                this.u1 = object;
                f$a.b((wc3_0)object);
            }
            object = this.O0;
            ((fj0)object).e = n10 = ((fj0)object).e + n8;
            object = this.Y0;
            int n14 = ((d)object).e;
            int n15 = 3;
            if (n14 != n15) {
                boolean bl4 = true;
            } else {
                boolean bl5 = false;
                wc3_02 = null;
            }
            ((d)object).e = n15;
            VV vV = ((d)object).l;
            ((d)object).g = l2 = gz3.I(vV.elapsedRealtime());
            if (var2_9 != false && (object = this.g1) != null) {
                wc3_02 = f$a.a;
                if (wc3_02 != null) {
                    l2 = SystemClock.elapsedRealtime();
                    qc3_1 qc3_12 = new qc3_1(f$a, object, l2);
                    wc3_02.post(qc3_12);
                }
                this.j1 = n8;
            }
            this.j0(l3);
        }
    }

    public final void m0(androidx.media3.common.d d2) {
        boolean bl2;
        VideoSink videoSink = this.d1;
        if (videoSink != null && !(bl2 = videoSink.isInitialized())) {
            try {
                videoSink = this.d1;
            }
            catch (VideoSink$VideoSinkException videoSink$VideoSinkException) {
                throw this.z(videoSink$VideoSinkException, d2, false, 7000);
            }
            videoSink.m(d2);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean o0(long l2, long l3, androidx.media3.exoplayer.mediacodec.d d2, ByteBuffer byteBuffer, int n3, int n4, int n7, long l4, boolean bl2, boolean bl3, androidx.media3.common.d d5) {
        int n8;
        b b2 = this;
        Object object = d2;
        int n10 = n3;
        d2.getClass();
        Object object2 = this.P0;
        long l7 = ((MediaCodecRenderer$b)object2).c;
        long l8 = l4 - l7;
        Object object3 = this.d1;
        MediaFormat mediaFormat = null;
        if (object3 != null) {
            void var16_16;
            block19: {
                b$b b$b;
                long l12 = -this.A1;
                long l14 = l4 + l12;
                try {
                    object2 = b$b;
                    androidx.media3.exoplayer.mediacodec.d d7 = d2;
                    b$b = new b$b(this, d2, n3, l8);
                    long l15 = l3;
                }
                catch (VideoSink$VideoSinkException videoSink$VideoSinkException) {
                    // empty catch block
                    break block19;
                }
                try {
                    return object3.k(l14, bl3, l2, l3, b$b);
                }
                catch (VideoSink$VideoSinkException videoSink$VideoSinkException) {}
            }
            object2 = var16_16.a;
            throw b2.z((Exception)var16_16, (androidx.media3.common.d)object2, false, 7001);
        }
        d$a d$a = this.Z0;
        object3 = this.Y0;
        long l16 = ((MediaCodecRenderer$b)object2).b;
        long l17 = l4;
        long l18 = l16;
        l16 = l3;
        Object object4 = ((d)object3).a(l4, l2, l3, l18, bl3, d$a);
        if (object4 == (n8 = 4)) {
            return false;
        }
        n8 = 1;
        if (bl2 && !bl3) {
            this.M0(d2, n3);
            return n8 != 0;
        }
        object3 = b2.g1;
        d$a d$a2 = b2.Z0;
        if (object3 == null) {
            l8 = d$a2.a;
            long l19 = 30000L;
            long l12 = l8 - l19;
            object4 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object4 < 0) {
                b2.M0((androidx.media3.exoplayer.mediacodec.d)object, n10);
                long l21 = d$a2.a;
                b2.O0(l21);
                return n8 != 0;
            }
            return false;
        }
        if (object4) {
            long l22;
            if (object4 != n8) {
                int n14 = 2;
                if (object4 == n14) {
                    Trace.beginSection((String)"dropVideoBuffer");
                    object.i(n10);
                    Trace.endSection();
                    b2.N0(0, n8);
                    long l24 = d$a2.a;
                    b2.O0(l24);
                    return n8 != 0;
                }
                n14 = 3;
                if (object4 == n14) {
                    b2.M0((androidx.media3.exoplayer.mediacodec.d)object, n10);
                    long l23 = d$a2.a;
                    b2.O0(l23);
                    return n8 != 0;
                }
                Object object5 = 5;
                if (object4 == object5) {
                    return false;
                }
                object2 = String.valueOf(object4);
                object = new IllegalStateException((String)object2);
                throw object;
            }
            long l25 = d$a2.b;
            long l26 = d$a2.a;
            long l27 = b2.s1;
            long l14 = l25 - l27;
            Object object6 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            if (object6 == false) {
                b2.M0((androidx.media3.exoplayer.mediacodec.d)object, n10);
                l22 = l26;
            } else {
                long l29;
                object3 = b2.z1;
                if (object3 != null) {
                    Object object7 = b2.N;
                    l17 = l8;
                    MediaFormat mediaFormat2 = object7;
                    object7 = d5;
                    l29 = l26;
                    mediaFormat = mediaFormat2;
                    object3.q(l8, l25, d5, mediaFormat2);
                } else {
                    l29 = l26;
                }
                b2.K0((androidx.media3.exoplayer.mediacodec.d)object, n10, l25);
                l22 = l29;
            }
            b2.O0(l22);
            b2.s1 = l25;
            return n8 != 0;
        }
        object2 = b2.g;
        object2.getClass();
        long l30 = object2.nanoTime();
        object3 = b2.z1;
        if (object3 != null) {
            mediaFormat = b2.N;
            l17 = l8;
            androidx.media3.common.d d9 = d5;
            object3.q(l8, l30, d5, mediaFormat);
        }
        b2.K0((androidx.media3.exoplayer.mediacodec.d)object, n10, l30);
        long l31 = d$a2.a;
        b2.O0(l31);
        return n8 != 0;
    }

    public final void s0() {
        super.s0();
        this.p1 = 0;
    }

    public final void t(float f5, float f6) {
        super.t(f5, f6);
        Object object = this.d1;
        if (object != null) {
            object.setPlaybackSpeed(f5);
        } else {
            object = this.Y0;
            ((d)object).i(f5);
        }
    }

    public final boolean w0(e e2) {
        boolean bl2;
        int n3;
        int n4;
        Surface surface = this.g1;
        if (surface != null && (n4 = (int)(surface.isValid() ? 1 : 0)) != 0 || (n4 = gz3.a) >= (n3 = 35) && (n4 = (int)(e2.h ? 1 : 0)) != 0 || (bl2 = this.L0(e2))) {
            bl2 = true;
        } else {
            bl2 = false;
            e2 = null;
        }
        return bl2;
    }

    public final boolean x0(DecoderInputBuffer decoderInputBuffer) {
        long l2;
        long l3;
        long l4;
        Object object = decoderInputBuffer.f(0x4000000);
        boolean bl2 = false;
        if (object == 0) {
            return false;
        }
        object = this.h();
        if (object == 0 && (object = decoderInputBuffer.f(0x20000000)) == 0 && (object = (l4 = (l3 = this.B1) - (l2 = -9223372036854775807L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != 0) {
            l2 = decoderInputBuffer.f;
            MediaCodecRenderer$b mediaCodecRenderer$b = this.P0;
            long l7 = mediaCodecRenderer$b.c;
            l2 -= l7;
            long l8 = (l3 -= l2) - (l2 = 100000L);
            object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object > 0) {
                object = decoderInputBuffer.f(0x40000000);
                if (object != 0) {
                    return false;
                }
                l3 = decoderInputBuffer.f;
                l2 = this.l;
                long l12 = l3 - l2;
                Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (object2 < 0) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    public final int z0(Sj0 object, androidx.media3.common.d d2) {
        int n3;
        int n4 = 1;
        Object object2 = d2.o;
        boolean bl2 = ip1_0.k((String)object2);
        int n7 = 0;
        if (!bl2) {
            n3 = tj2_0.a(0, 0, 0, 0);
        } else {
            int n8;
            object2 = d2.s;
            if (object2 != null) {
                bl2 = true;
            } else {
                bl2 = false;
                object2 = null;
            }
            Context context = this.T0;
            List list = androidx.media3.exoplayer.video.b.F0(context, (androidx.media3.exoplayer.mediacodec.g)object, d2, bl2, false);
            if (bl2 && (n8 = list.isEmpty()) != 0) {
                list = androidx.media3.exoplayer.video.b.F0(context, (androidx.media3.exoplayer.mediacodec.g)object, d2, false, false);
            }
            if ((n8 = list.isEmpty()) != 0) {
                n3 = tj2_0.a(n4, 0, 0, 0);
            } else {
                int n10;
                n8 = d2.M;
                if (n8 != 0 && n8 != (n10 = 2)) {
                    n3 = tj2_0.a(n10, 0, 0, 0);
                } else {
                    boolean bl3;
                    String string2;
                    String string3;
                    int n14;
                    int n15;
                    int n16;
                    int n17;
                    e e2 = (e)list.get(0);
                    n10 = (int)(e2.d(d2) ? 1 : 0);
                    if (n10 == 0) {
                        for (n17 = 1; n17 < (n16 = list.size()); n17 += n4) {
                            e e5 = (e)list.get(n17);
                            n15 = e5.d(d2);
                            if (n15 == 0) continue;
                            e2 = e5;
                            n14 = 0;
                            list = null;
                            n10 = 1;
                            break;
                        }
                    } else {
                        n14 = 1;
                    }
                    n17 = n10 != 0 ? 4 : 3;
                    n16 = (int)(e2.e(d2) ? 1 : 0);
                    n16 = n16 != 0 ? 16 : 8;
                    n8 = (int)(e2.g ? 1 : 0);
                    if (n8 != 0) {
                        n8 = 64;
                    } else {
                        n8 = 0;
                        e2 = null;
                    }
                    if (n14 != 0) {
                        n14 = 128;
                    } else {
                        n14 = 0;
                        list = null;
                    }
                    n15 = gz3.a;
                    int n18 = 26;
                    if (n15 >= n18 && (n15 = (int)((string3 = "video/dolby-vision").equals(string2 = d2.o) ? 1 : 0)) != 0 && (n15 = (int)(b$c.a(context) ? 1 : 0)) == 0) {
                        n14 = 256;
                    }
                    if (n10 != 0 && !(bl3 = (object = androidx.media3.exoplayer.video.b.F0(context, (androidx.media3.exoplayer.mediacodec.g)object, d2, bl2, n4 != 0)).isEmpty())) {
                        Cloneable cloneable = MediaCodecUtil.a;
                        cloneable = new ArrayList(object);
                        object = new tl1_0(d2);
                        object2 = new UL1((MediaCodecUtil$e)object);
                        Collections.sort(cloneable, object2);
                        object = (e)((ArrayList)cloneable).get(0);
                        boolean bl4 = ((e)object).d(d2);
                        if (bl4 && (n3 = (int)(((e)object).e(d2) ? 1 : 0)) != 0) {
                            n7 = 32;
                        }
                    }
                    n3 = n17 | n16 | n7 | n8 | n14;
                }
            }
        }
        return n3;
    }
}

