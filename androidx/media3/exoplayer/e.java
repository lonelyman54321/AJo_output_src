/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.SurfaceTexture
 *  android.media.AudioDeviceInfo
 *  android.media.AudioManager
 *  android.net.Uri
 *  android.os.Looper
 *  android.os.PowerManager$WakeLock
 *  android.util.Pair
 *  android.util.SparseBooleanArray
 *  android.view.Surface
 *  android.view.SurfaceHolder
 *  android.view.SurfaceHolder$Callback
 *  android.view.SurfaceView
 *  android.view.TextureView
 */
package androidx.media3.exoplayer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.b;
import androidx.media3.common.c;
import androidx.media3.common.c$a;
import androidx.media3.common.d;
import androidx.media3.common.e$a;
import androidx.media3.common.f;
import androidx.media3.common.f$a;
import androidx.media3.common.f$a$a;
import androidx.media3.common.f$c;
import androidx.media3.common.f$d;
import androidx.media3.common.g$c;
import androidx.media3.exoplayer.AudioBecomingNoisyManager;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayer$a;
import androidx.media3.exoplayer.ExoPlayer$b;
import androidx.media3.exoplayer.ExoPlayer$c;
import androidx.media3.exoplayer.ExoPlayer$d;
import androidx.media3.exoplayer.ExoPlayer$e;
import androidx.media3.exoplayer.ExoPlayer$f;
import androidx.media3.exoplayer.ExoPlayer$g;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.a;
import androidx.media3.exoplayer.e$b;
import androidx.media3.exoplayer.e$c;
import androidx.media3.exoplayer.e$d;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.g$a;
import androidx.media3.exoplayer.g$b;
import androidx.media3.exoplayer.g$d;
import androidx.media3.exoplayer.g$g;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.l$c;
import androidx.media3.exoplayer.m;
import androidx.media3.exoplayer.m$b;
import androidx.media3.exoplayer.n;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.j$a;
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.source.s$a;
import androidx.media3.exoplayer.source.w;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class e
extends b
implements ExoPlayer,
ExoPlayer$a,
ExoPlayer$g,
ExoPlayer$f,
ExoPlayer$d {
    public final AudioBecomingNoisyManager A;
    public final a B;
    public final PE3 C;
    public final XF3 D;
    public final long E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public ex2_0 L;
    public s M;
    public ExoPlayer$e N;
    public boolean O;
    public f$a P;
    public androidx.media3.common.e Q;
    public androidx.media3.common.e R;
    public d S;
    public d T;
    public Object U;
    public Surface V;
    public SurfaceHolder W;
    public SphericalGLSurfaceView X;
    public boolean Y;
    public TextureView Z;
    public int a0;
    public final Hp3 b;
    public int b0;
    public final f$a c;
    public A63 c0;
    public final f40 d;
    public fj0 d0;
    public final Context e;
    public fj0 e0;
    public final f f;
    public int f0;
    public final n[] g;
    public dr_1 g0;
    public final Gp3 h;
    public float h0;
    public final H21 i;
    public boolean i0;
    public final if0_0 j;
    public Ue0 j0;
    public final g k;
    public LB3 k0;
    public final vv1_0 l;
    public jk_0 l0;
    public final CopyOnWriteArraySet m;
    public final boolean m0;
    public final androidx.media3.common.g$b n;
    public boolean n0;
    public final ArrayList o;
    public int o0;
    public final boolean p;
    public boolean p0;
    public final j$a q;
    public boolean q0;
    public final je r;
    public final Ip0 r0;
    public final Looper s;
    public wc3_0 s0;
    public final iv_0 t;
    public androidx.media3.common.e t0;
    public final long u;
    public Mt2 u0;
    public final long v;
    public int v0;
    public final long w;
    public long w0;
    public final ph3_0 x;
    public final e$b y;
    public final e$c z;

    static {
        im1_0.a("media3.exoplayer");
    }

    /*
     * Exception decompiling
     */
    public e(ExoPlayer$c var1_1, f var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 107[TRYBLOCK] [147 : 1265->1269)] java.lang.Throwable
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

    public static long o(Mt2 object) {
        long l2;
        g$c g$c = new g$c();
        androidx.media3.common.g$b g$b = new androidx.media3.common.g$b();
        androidx.media3.common.g g3 = ((Mt2)object).a;
        Object object2 = ((Mt2)object).b.a;
        g3.h(object2, g$b);
        long l3 = -9223372036854775807L;
        long l4 = ((Mt2)object).c;
        long l7 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
        if (l7 == false) {
            int n3 = g$b.c;
            l3 = 0L;
            object = ((Mt2)object).a.n(n3, g$c, l3);
            l2 = ((g$c)object).l;
        } else {
            l2 = g$b.e + l4;
        }
        return l2;
    }

    public final void A(int n3, int n4, boolean n7) {
        int n8 = 0;
        int n10 = 1;
        n7 = n7 != 0 && n3 != (n7 = -1) ? 1 : 0;
        if (n3 == 0) {
            n8 = 1;
        }
        Mt2 mt2 = this.u0;
        n10 = mt2.l;
        if (n10 == n7 && (n10 = mt2.n) == n8 && (n3 = mt2.m) == n4) {
            return;
        }
        this.C(n4, n8, n7 != 0);
    }

    /*
     * Unable to fully structure code
     */
    public final void B(Mt2 var1_1, int var2_2, boolean var3_3, int var4_4, long var5_5, int var7_6, boolean var8_7) {
        block54: {
            block51: {
                block45: {
                    block52: {
                        block53: {
                            block47: {
                                block50: {
                                    block49: {
                                        block48: {
                                            block46: {
                                                var9_8 = this;
                                                var10_9 = var1_1;
                                                var11_10 = var4_4;
                                                var12_11 = this.u0;
                                                this.u0 = var1_1;
                                                var13_12 = var12_11.a;
                                                var14_13 = var1_1.a;
                                                var15_14 = var13_12.equals(var14_13);
                                                var16_15 = 1;
                                                var15_14 ^= var16_15;
                                                var17_16 = var12_11.a;
                                                var18_17 = var1_1.a;
                                                var19_18 = var18_17.q();
                                                var20_19 = -1;
                                                var21_20 = var20_19;
                                                var22_21 = 3;
                                                var23_22 = 0L;
                                                if (var19_18 == 0 || (var19_18 = var17_16.q()) == 0) break block46;
                                                var18_17 = Boolean.FALSE;
                                                var17_16 = new Pair(var18_17, var21_20);
                                                break block47;
                                            }
                                            var19_18 = var18_17.q();
                                            if (var19_18 == (var20_19 = (int)var17_16.q())) break block48;
                                            var18_17 = Boolean.TRUE;
                                            var25_23 = var22_21;
                                            var17_16 = new Pair(var18_17, var25_23);
                                            break block47;
                                        }
                                        var25_23 = var12_11.b;
                                        var26_24 = var25_23.a;
                                        var27_25 = var9_8.n;
                                        var20_19 = var17_16.h((Object)var26_24, (androidx.media3.common.g$b)var27_25).c;
                                        var28_26 = var9_8.a;
                                        var17_16 = var17_16.n((int)var20_19, (g$c)var28_26, (long)var23_22).a;
                                        var26_24 = var10_9.b;
                                        var29_27 = var26_24.a;
                                        var27_25 = var18_17.h(var29_27, (androidx.media3.common.g$b)var27_25);
                                        var22_21 = var27_25.c;
                                        var18_17 = var18_17.n((int)var22_21, (g$c)var28_26, (long)var23_22).a;
                                        var30_28 = (int)var17_16.equals(var18_17);
                                        if (var30_28 != 0) ** GOTO lbl59
                                        if (!var3_3 || var11_10 != 0) break block49;
                                        var30_28 = 1;
                                        ** GOTO lbl53
                                    }
                                    if (!var3_3 || var11_10 != var16_15) break block50;
                                    var30_28 = 2;
                                    ** GOTO lbl53
                                }
                                if (var15_14 != 0) {
                                    var30_28 = 3;
lbl53:
                                    // 3 sources

                                    var25_23 = Boolean.TRUE;
                                    var17_16 = var30_28;
                                    var17_16 = var18_17 = new Pair(var25_23, var17_16);
                                } else {
                                    var10_9 = new Iterator<E>();
                                    throw var10_9;
lbl59:
                                    // 1 sources

                                    if (var3_3 && var11_10 == 0 && (var35_31 = (int)((cfr_temp_0 = (var31_29 = var25_23.d) - (var33_30 = var26_24.d)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) < 0) {
                                        var18_17 = Boolean.TRUE;
                                        var19_18 = 0;
                                        var25_23 = null;
                                        var26_24 = 0;
                                        var17_16 = new Pair(var18_17, var26_24);
                                    } else if (var3_3 && var11_10 == var16_15 && var8_7) {
                                        var18_17 = Boolean.TRUE;
                                        var19_18 = 2;
                                        var26_24 = var19_18;
                                        var17_16 = new Pair(var18_17, var26_24);
                                    } else {
                                        var18_17 = Boolean.FALSE;
                                        var17_16 = new Pair(var18_17, var21_20);
                                    }
                                }
                            }
                            var18_17 = (Boolean)var17_16.first;
                            var36_32 = var18_17.booleanValue();
                            var17_16 = (Integer)var17_16.second;
                            var30_28 = var17_16.intValue();
                            if (var36_32) {
                                var26_24 = var10_9.a;
                                var20_19 = (int)var26_24.q();
                                if (var20_19 == 0) {
                                    var26_24 = var10_9.a;
                                    var21_20 = var10_9.b.a;
                                    var28_26 = var9_8.n;
                                    var20_19 = var26_24.h((Object)var21_20, (androidx.media3.common.g$b)var28_26).c;
                                    var21_20 = var10_9.a;
                                    var28_26 = var9_8.a;
                                    var26_24 = var21_20.n((int)var20_19, (g$c)var28_26, (long)var23_22).c;
                                } else {
                                    var20_19 = 0;
                                    var26_24 = null;
                                }
                                var9_8.t0 = var21_20 = androidx.media3.common.e.I;
                            } else {
                                var20_19 = 0;
                                var26_24 = null;
                            }
                            if (var36_32 || (var37_33 = (var21_20 = var12_11.j).equals(var28_26 = var10_9.j)) == 0) {
                                var21_20 = var9_8.t0.a();
                                var28_26 = var10_9.j;
                                var27_25 = null;
                                for (var22_21 = 0; var22_21 < (var38_34 = var28_26.size()); ++var22_21) {
                                    var29_27 = (Metadata)var28_26.get(var22_21);
                                    var25_23 = null;
                                    for (var19_18 = 0; var19_18 < (var40_36 = ((Metadata$Entry[])(var39_35 = var29_27.a)).length); ++var19_18) {
                                        var39_35 = var39_35[var19_18];
                                        var39_35.u((e$a)var21_20);
                                    }
                                    var23_22 = 0L;
                                }
                                var9_8.t0 = var25_23 = new androidx.media3.common.e((e$a)var21_20);
                            }
                            var25_23 = this.g();
                            var21_20 = var9_8.Q;
                            var37_33 = var25_23.equals(var21_20) ^ var16_15;
                            var9_8.Q = var25_23;
                            var19_18 = (int)var12_11.l;
                            var35_31 = var10_9.l;
                            if (var19_18 != var35_31) {
                                var19_18 = 1;
                            } else {
                                var19_18 = 0;
                                var25_23 = null;
                            }
                            var35_31 = var12_11.e;
                            var22_21 = var10_9.e;
                            if (var35_31 != var22_21) {
                                var35_31 = 1;
                            } else {
                                var35_31 = 0;
                                var28_26 = null;
                            }
                            if (var35_31 != 0 || var19_18 != 0) {
                                this.D();
                            }
                            if ((var22_21 = (int)var12_11.g) != (var41_37 = var10_9.g)) {
                                var22_21 = 1;
                            } else {
                                var22_21 = 0;
                                var27_25 = null;
                            }
                            if (var15_14 != 0) {
                                var13_12 = var9_8.l;
                                var40_36 = var2_2;
                                var39_35 = new fF0((Mt2)var10_9, var2_2);
                                var40_36 = 0;
                                var42_38 = null;
                                var13_12.c(0, (vv1$a)var39_35);
                            }
                            if (!var3_3) break block51;
                            var13_12 = new androidx.media3.common.g$b();
                            var39_35 = var12_11.a;
                            var41_37 = (int)var39_35.q();
                            if (var41_37 == 0) {
                                var39_35 = var12_11.b.a;
                                var42_38 = var12_11.a;
                                var42_38.h(var39_35, (androidx.media3.common.g$b)var13_12);
                                var40_36 = var13_12.c;
                                var29_27 = var12_11.a;
                                var38_34 = var29_27.b(var39_35);
                                var14_13 = var12_11.a;
                                var43_39 = var39_35;
                                var39_35 = var9_8.a;
                                var44_40 = var35_31;
                                var45_41 = var22_21;
                                var46_42 = 0L;
                                var14_13 = var14_13.n((int)var40_36, (g$c)var39_35, (long)var46_42).a;
                                var28_26 = var9_8.a.c;
                                var48_43 = var43_39;
                                var49_44 = var14_13;
                                var50_45 = var28_26;
                                var51_46 = var40_36;
                                var52_47 = var38_34;
                            } else {
                                var44_40 = var35_31;
                                var45_41 = var22_21;
                                var51_46 = var7_6;
                                var49_44 = null;
                                var50_45 = null;
                                var48_43 = null;
                                var52_47 = -1;
                            }
                            if (var11_10 != 0) break block52;
                            var14_13 = var12_11.b;
                            var16_15 = (int)var14_13.b();
                            if (var16_15 == 0) break block53;
                            var14_13 = var12_11.b;
                            var35_31 = var14_13.b;
                            var16_15 = var14_13.c;
                            var53_48 = var13_12.a(var35_31, var16_15);
                            var46_42 = androidx.media3.exoplayer.e.o(var12_11);
                            break block45;
                        }
                        var14_13 = var12_11.b;
                        var16_15 = var14_13.e;
                        var35_31 = -1;
                        if (var16_15 != var35_31) {
                            var13_12 = var9_8.u0;
                            var53_48 = androidx.media3.exoplayer.e.o((Mt2)var13_12);
lbl193:
                            // 3 sources

                            while (true) {
                                var46_42 = var53_48;
                                break block45;
                                break;
                            }
                        }
                        var46_42 = var13_12.e;
                        var53_48 = var13_12.d + var46_42;
                        ** GOTO lbl193
                    }
                    var14_13 = var12_11.b;
                    var16_15 = (int)var14_13.b();
                    if (var16_15 != 0) {
                        var53_48 = var12_11.s;
                        var46_42 = androidx.media3.exoplayer.e.o(var12_11);
                    } else {
                        var53_48 = var13_12.e;
                        var46_42 = var12_11.s;
                        var53_48 += var46_42;
                        ** continue;
                    }
                }
                var55_49 = gz3.T(var53_48);
                var57_50 = gz3.T(var46_42);
                var13_12 = var12_11.b;
                var16_15 = var13_12.b;
                var15_14 = var13_12.c;
                var59_51 = var39_35;
                var39_35 = new f$d(var49_44, var51_46, (MediaItem)var50_45, var48_43, var52_47, var55_49, var57_50, var16_15, var15_14);
                var15_14 = this.getCurrentMediaItemIndex();
                var14_13 = var9_8.u0.a;
                var16_15 = (int)var14_13.q();
                if (var16_15 == 0) {
                    var14_13 = var9_8.u0;
                    var28_26 = var14_13.b.a;
                    var14_13 = var14_13.a;
                    var27_25 = var9_8.n;
                    var14_13.h(var28_26, (androidx.media3.common.g$b)var27_25);
                    var14_13 = var9_8.u0.a;
                    var16_15 = var14_13.b(var28_26);
                    var27_25 = var9_8.u0.a;
                    var42_38 = var9_8.a;
                    var38_34 = var37_33;
                    var59_51 = var28_26;
                    var60_52 = 0L;
                    var21_20 = var27_25.n((int)var15_14, (g$c)var42_38, (long)var60_52).a;
                    var28_26 = var42_38.c;
                    var62_53 = var16_15;
                    var63_54 = var21_20;
                    var64_55 = var28_26;
                    var65_56 = var59_51;
                } else {
                    var38_34 = var37_33;
                    var63_54 = null;
                    var64_55 = null;
                    var65_56 = null;
                    var62_53 = -1;
                }
                var66_57 = gz3.T(var5_5);
                var21_20 = var9_8.u0.b;
                var37_33 = var21_20.b();
                if (var37_33 != 0) {
                    var21_20 = var9_8.u0;
                    var68_58 = var60_52 = gz3.T(androidx.media3.exoplayer.e.o((Mt2)var21_20));
                } else {
                    var68_58 = var66_57;
                }
                var21_20 = var9_8.u0.b;
                var35_31 = var21_20.b;
                var37_33 = var21_20.c;
                var14_13 = new f$d(var63_54, var15_14, (MediaItem)var64_55, var65_56, var62_53, var66_57, var68_58, var35_31, var37_33);
                var13_12 = var9_8.l;
                var21_20 = new pf0_1(var11_10, (f$d)var39_35, (f$d)var14_13);
                var11_10 = 11;
                var13_12.c(var11_10, (vv1$a)var21_20);
                break block54;
            }
            var38_34 = var37_33;
            var44_40 = var35_31;
            var45_41 = var22_21;
        }
        if (var36_32) {
            var70_59 = var9_8.l;
            var13_12 = new qf0_1(var30_28, (MediaItem)var26_24);
            var16_15 = 1;
            var70_59.c(var16_15, (vv1$a)var13_12);
        }
        if ((var70_59 = var12_11.f) != (var13_12 = var10_9.f)) {
            var70_59 = var9_8.l;
            var13_12 = new rf0_0((Mt2)var10_9);
            var16_15 = 10;
            var70_59.c(var16_15, (vv1$a)var13_12);
            var70_59 = var10_9.f;
            if (var70_59 != null) {
                var70_59 = var9_8.l;
                var30_28 = 2;
                var13_12 = new tc0_1(var10_9, var30_28);
                var70_59.c(var16_15, (vv1$a)var13_12);
            }
        }
        if ((var70_59 = var12_11.i) != (var13_12 = var10_9.i)) {
            var70_59 = var9_8.h;
            var13_12 = (cH1$a)var13_12.e;
            var70_59.c((cH1$a)var13_12);
            var70_59 = var9_8.l;
            var13_12 = new we0_2(var10_9);
            var16_15 = 2;
            var70_59.c(var16_15, (vv1$a)var13_12);
        }
        if (var38_34 != 0) {
            var70_59 = var9_8.Q;
            var13_12 = var9_8.l;
            var30_28 = 2;
            var14_13 = new vq0_1(var70_59, var30_28);
            var11_10 = 14;
            var13_12.c(var11_10, (vv1$a)var14_13);
        }
        if (var45_41 != 0) {
            var70_59 = var9_8.l;
            var13_12 = new xe0_0(var10_9);
            var16_15 = 3;
            var70_59.c(var16_15, (vv1$a)var13_12);
        }
        if (var44_40 != 0 || var19_18 != 0) {
            var70_59 = var9_8.l;
            var13_12 = new ye0_0(var10_9);
            var16_15 = -1;
            var70_59.c(var16_15, (vv1$a)var13_12);
        }
        if (var44_40 != 0) {
            var70_59 = var9_8.l;
            var13_12 = new ze0_0(var10_9);
            var16_15 = 4;
            var70_59.c(var16_15, (vv1$a)var13_12);
        }
        if (var19_18 != 0 || (var11_10 = var12_11.m) != (var15_14 = var10_9.m)) {
            var70_59 = var9_8.l;
            var13_12 = new nf0_0((Mt2)var10_9);
            var16_15 = 5;
            var70_59.c(var16_15, (vv1$a)var13_12);
        }
        if ((var11_10 = var12_11.n) != (var15_14 = var10_9.n)) {
            var70_59 = var9_8.l;
            var13_12 = new rg2_0(var10_9);
            var16_15 = 6;
            var70_59.c(var16_15, (vv1$a)var13_12);
        }
        if ((var11_10 = (int)var12_11.k()) != (var15_14 = (int)var1_1.k())) {
            var70_59 = var9_8.l;
            var13_12 = new of0_0(var10_9);
            var16_15 = 7;
            var70_59.c(var16_15, (vv1$a)var13_12);
        }
        if ((var11_10 = (int)(var70_59 = var12_11.o).equals(var13_12 = var10_9.o)) == 0) {
            var70_59 = var9_8.l;
            var13_12 = new tg2_0(var10_9);
            var16_15 = 12;
            var70_59.c(var16_15, (vv1$a)var13_12);
        }
        this.z();
        var70_59 = var9_8.l;
        var70_59.b();
        var11_10 = (int)var12_11.p;
        var71_60 = var10_9.p;
        if (var11_10 != var71_60) {
            var10_9 = var9_8.m.iterator();
            while ((var11_10 = (int)var10_9.hasNext()) != 0) {
                var70_59 = (ExoPlayer$b)var10_9.next();
                var70_59.A();
            }
        }
    }

    public final void C(int n3, int n4, boolean bl2) {
        int n7 = this.H;
        int n8 = 1;
        this.H = n7 += n8;
        Mt2 mt2 = this.u0;
        boolean bl3 = mt2.p;
        if (bl3) {
            mt2 = mt2.a();
        }
        Mt2 mt22 = mt2.d(n3, n4, bl2);
        this.k.i.f(n8, (int)(bl2 ? 1 : 0), n3 |= (n4 <<= 4)).b();
        this.B(mt22, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void D() {
        int n3 = this.getPlaybackState();
        XF3 xF3 = this.D;
        PE3 pE3 = this.C;
        int n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7 && n3 != (n7 = 3)) {
                n4 = 4;
                if (n3 != n4) {
                    IllegalStateException illegalStateException = new IllegalStateException();
                    throw illegalStateException;
                }
            } else {
                n3 = (int)(this.isSleepingForOffload() ? 1 : 0);
                n7 = (int)(this.getPlayWhenReady() ? 1 : 0);
                if (n7 == 0 || n3 != 0) {
                    n4 = 0;
                }
                pE3.d = n4;
                PowerManager.WakeLock wakeLock = pE3.b;
                if (wakeLock != null) {
                    boolean bl2 = pE3.c;
                    if (bl2 && n4 != 0) {
                        wakeLock.acquire();
                    } else {
                        wakeLock.release();
                    }
                }
                n3 = (int)(this.getPlayWhenReady() ? 1 : 0);
                xF3.d = n3;
                pE3 = xF3.b;
                if (pE3 == null) {
                    return;
                }
                boolean bl3 = xF3.c;
                if (bl3 && n3 != 0) {
                    pE3.acquire();
                    return;
                }
                pE3.release();
                return;
            }
        }
        pE3.d = false;
        PowerManager.WakeLock wakeLock = pE3.b;
        if (wakeLock != null) {
            wakeLock.release();
        }
        xF3.d = false;
        wakeLock = xF3.b;
        if (wakeLock == null) {
            return;
        }
        wakeLock.release();
    }

    public final void E() {
        this.d.b();
        Object object = Thread.currentThread();
        Object object2 = this.s;
        Object object3 = object2.getThread();
        if (object != object3) {
            object = Thread.currentThread().getName();
            object2 = object2.getThread().getName();
            object3 = Locale.US;
            object3 = "Player is accessed on the wrong thread.\nCurrent thread: '";
            String string2 = "'\nExpected thread: '";
            String string3 = "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            object = uc0_0.a((String)object3, (String)object, string2, (String)object2, string3);
            boolean bl2 = this.m0;
            if (!bl2) {
                boolean bl3;
                bl2 = this.n0;
                if (bl2) {
                    bl2 = false;
                    object2 = null;
                } else {
                    object2 = new IllegalStateException();
                }
                Cx.g((String)object, (Throwable)object2);
                this.n0 = bl3 = true;
            } else {
                object2 = new IllegalStateException((String)object);
                throw object2;
            }
        }
    }

    public final void addAnalyticsListener(oe oe2) {
        oe2.getClass();
        this.r.f0(oe2);
    }

    public final void addAudioOffloadListener(ExoPlayer$b exoPlayer$b) {
        this.m.add(exoPlayer$b);
    }

    public final void addListener(f$c f$c) {
        f$c.getClass();
        this.l.a(f$c);
    }

    public final void addMediaItems(int n3, List list) {
        this.E();
        list = this.i(list);
        this.addMediaSources(n3, list);
    }

    public final void addMediaSource(int n3, j object) {
        this.E();
        object = Collections.singletonList(object);
        this.addMediaSources(n3, (List)object);
    }

    public final void addMediaSource(j object) {
        this.E();
        object = Collections.singletonList(object);
        this.addMediaSources((List)object);
    }

    /*
     * WARNING - void declaration
     */
    public final void addMediaSources(int n3, List list) {
        void var5_7;
        Object object;
        this.E();
        boolean bl2 = false;
        Mt2 mt2 = null;
        if (n3 >= 0) {
            boolean n4 = true;
        } else {
            boolean bl3 = false;
            object = null;
        }
        ct3.a((boolean)var5_7);
        object = this.o;
        int n4 = ((ArrayList)object).size();
        n3 = Math.min(n3, n4);
        boolean bl4 = ((ArrayList)object).isEmpty();
        if (bl4) {
            n3 = this.v0;
            int n7 = -1;
            if (n3 == n7) {
                bl2 = true;
            }
            this.setMediaSources(list, bl2);
            return;
        }
        mt2 = this.u0;
        object = this.f(mt2, n3, list);
        this.B((Mt2)object, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void addMediaSources(List list) {
        this.E();
        int n3 = this.o.size();
        this.addMediaSources(n3, list);
    }

    public final void b(int n3, int n4, long l2, boolean bl2) {
        boolean bl3;
        int n7;
        int n8;
        int n10;
        Object object;
        boolean bl32;
        this.E();
        int n84 = -1;
        if (n3 == n84) {
            return;
        }
        n84 = 1;
        if (n3 >= 0) {
            bl32 = true;
        } else {
            bl32 = false;
            object = null;
        }
        ct3.a(bl32);
        object = this.u0.a;
        boolean n102 = ((androidx.media3.common.g)object).q();
        if (!n102 && n3 >= (n10 = ((androidx.media3.common.g)object).p())) {
            return;
        }
        Object object2 = this.r;
        object2.G();
        this.H = n8 = this.H + n84;
        boolean bl4 = this.isPlayingAd();
        if (bl4) {
            Cx.f("seekTo ignored because an ad is playing");
            object = this.u0;
            g$d g$d = new g$d((Mt2)object);
            g$d.a(n84);
            e e2 = (e)this.j.a;
            e2.getClass();
            object = new jF0(e2, g$d);
            e2.i.i((Runnable)object);
            return;
        }
        Mt2 mt2 = this.u0;
        int n14 = mt2.e;
        int n15 = 3;
        if (n14 == n15 || n14 == (n7 = 4) && !(bl3 = ((androidx.media3.common.g)object).q())) {
            mt2 = this.u0;
            int n16 = 2;
            mt2 = mt2.g(n16);
        }
        int n17 = this.getCurrentMediaItemIndex();
        object2 = this.q((androidx.media3.common.g)object, n3, l2);
        mt2 = this.p(mt2, (androidx.media3.common.g)object, (Pair)object2);
        long l3 = gz3.I(l2);
        object2 = this.k;
        object2.getClass();
        g$g g$g = new g$g((androidx.media3.common.g)object, n3, l3);
        ((g)object2).i.d(n15, g$g).b();
        l3 = this.l(mt2);
        e e5 = this;
        this.B(mt2, 0, true, 1, l3, n17, bl2);
    }

    public final void clearAuxEffectInfo() {
        this.E();
        dt dt2 = new dt();
        this.setAuxEffectInfo(dt2);
    }

    public final void clearCameraMotionListener(jk_0 object) {
        this.E();
        jk_0 jk_02 = this.l0;
        if (jk_02 != object) {
            return;
        }
        object = this.z;
        object = this.j((m$b)object);
        ((m)object).e(8);
        ((m)object).d(null);
        ((m)object).c();
    }

    public final void clearVideoFrameMetadataListener(LB3 object) {
        this.E();
        LB3 lB3 = this.k0;
        if (lB3 != object) {
            return;
        }
        object = this.z;
        object = this.j((m$b)object);
        ((m)object).e(7);
        ((m)object).d(null);
        ((m)object).c();
    }

    public final void clearVideoSurface() {
        this.E();
        this.t();
        this.x(null);
        this.r(0, 0);
    }

    public final void clearVideoSurface(Surface surface) {
        Object object;
        this.E();
        if (surface != null && surface == (object = this.U)) {
            this.clearVideoSurface();
        }
    }

    public final void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        SurfaceHolder surfaceHolder2;
        this.E();
        if (surfaceHolder != null && surfaceHolder == (surfaceHolder2 = this.W)) {
            this.clearVideoSurface();
        }
    }

    public final void clearVideoSurfaceView(SurfaceView object) {
        this.E();
        object = object == null ? null : object.getHolder();
        this.clearVideoSurfaceHolder((SurfaceHolder)object);
    }

    public final void clearVideoTextureView(TextureView textureView) {
        TextureView textureView2;
        this.E();
        if (textureView != null && textureView == (textureView2 = this.Z)) {
            this.clearVideoSurface();
        }
    }

    public final m createMessage(m$b m$b) {
        this.E();
        return this.j(m$b);
    }

    public final void decreaseDeviceVolume() {
        this.E();
    }

    public final void decreaseDeviceVolume(int n3) {
        this.E();
    }

    public final ArrayList e(int n3, List object) {
        int n4;
        int n7;
        ArrayList<l$c> arrayList = new ArrayList<l$c>();
        for (n7 = 0; n7 < (n4 = object.size()); ++n7) {
            Object object2 = (j)object.get(n7);
            int n8 = this.p;
            Object object3 = new l$c((j)object2, n8 != 0);
            arrayList.add((l$c)object3);
            object2 = this.o;
            n8 = n7 + n3;
            Object object4 = ((l$c)object3).b;
            object3 = ((l$c)object3).a;
            e$d e$d = new e$d(object4, (h)object3);
            ((ArrayList)object2).add(n8, e$d);
        }
        object = this.M;
        n7 = arrayList.size();
        s$a s$a = object.g(n3, n7);
        this.M = s$a;
        return arrayList;
    }

    public final Mt2 f(Mt2 mt2, int n3, List list) {
        int n4;
        Object object = mt2.a;
        this.H = n4 = this.H + 1;
        list = this.e(n3, list);
        au2_0 au2_02 = this.h();
        int n7 = this.m(mt2);
        long l2 = this.k(mt2);
        Object object2 = this;
        object2 = this.n((androidx.media3.common.g)object, au2_02, n7, l2);
        mt2 = this.p(mt2, au2_02, (Pair)object2);
        s s7 = this.M;
        object2 = this.k;
        object2.getClass();
        object = new g$a((ArrayList)list, s7, -1, -9223372036854775807L);
        ((g)object2).i.h(18, object, n3, 0).b();
        return mt2;
    }

    public final androidx.media3.common.e g() {
        Object object = this.getCurrentTimeline();
        boolean n3 = ((androidx.media3.common.g)object).q();
        if (n3) {
            return this.t0;
        }
        int n4 = this.getCurrentMediaItemIndex();
        Object object2 = this.a;
        long l2 = 0L;
        object = ((androidx.media3.common.g)object).n((int)n4, (g$c)object2, (long)l2).c;
        e$a e$a = this.t0.a();
        object = ((MediaItem)object).d;
        if (object != null) {
            boolean bl2;
            Uri uri;
            object2 = ((androidx.media3.common.e)object).a;
            if (object2 != null) {
                e$a.a = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).b) != null) {
                e$a.b = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).c) != null) {
                e$a.c = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).d) != null) {
                e$a.d = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).e) != null) {
                e$a.e = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).f) != null) {
                e$a.f = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).g) != null) {
                e$a.g = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).h) != null) {
                boolean bl3;
                long l3 = (Long)object2;
                long l4 = l3 - l2;
                Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object3 >= 0) {
                    bl3 = true;
                } else {
                    bl3 = false;
                    uri = null;
                }
                ct3.a(bl3);
                e$a.h = object2;
            }
            object2 = ((androidx.media3.common.e)object).i;
            uri = ((androidx.media3.common.e)object).k;
            if (uri != null || object2 != null) {
                e$a.k = uri;
                if (object2 == null) {
                    bl2 = false;
                    object2 = null;
                } else {
                    object2 = (byte[])object2.clone();
                }
                e$a.i = (byte[])object2;
                e$a.j = object2 = ((androidx.media3.common.e)object).j;
            }
            if ((object2 = ((androidx.media3.common.e)object).l) != null) {
                e$a.l = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).m) != null) {
                e$a.m = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).n) != null) {
                e$a.n = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).o) != null) {
                e$a.o = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).p) != null) {
                e$a.p = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).q) != null) {
                e$a.q = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).r) != null) {
                e$a.q = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).s) != null) {
                e$a.r = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).t) != null) {
                e$a.s = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).u) != null) {
                e$a.t = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).v) != null) {
                e$a.u = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).w) != null) {
                e$a.v = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).x) != null) {
                e$a.w = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).y) != null) {
                e$a.x = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).z) != null) {
                e$a.y = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).A) != null) {
                e$a.z = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).B) != null) {
                e$a.A = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).C) != null) {
                e$a.B = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).D) != null) {
                e$a.C = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).E) != null) {
                e$a.D = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).F) != null) {
                e$a.E = object2;
            }
            if ((object2 = ((androidx.media3.common.e)object).G) != null) {
                e$a.F = object2;
            }
            if (!(bl2 = ((AbstractCollection)(object = ((androidx.media3.common.e)object).H)).isEmpty())) {
                e$a.G = object = ImmutableList.copyOf((Collection)object);
            }
        }
        object = new androidx.media3.common.e(e$a);
        return object;
    }

    public final je getAnalyticsCollector() {
        this.E();
        return this.r;
    }

    public final Looper getApplicationLooper() {
        return this.s;
    }

    public final dr_1 getAudioAttributes() {
        this.E();
        return this.g0;
    }

    public final ExoPlayer$a getAudioComponent() {
        this.E();
        return this;
    }

    public final fj0 getAudioDecoderCounters() {
        this.E();
        return this.e0;
    }

    public final d getAudioFormat() {
        this.E();
        return this.T;
    }

    public final int getAudioSessionId() {
        this.E();
        return this.f0;
    }

    public final f$a getAvailableCommands() {
        this.E();
        return this.P;
    }

    public final long getBufferedPosition() {
        this.E();
        boolean bl2 = this.isPlayingAd();
        if (bl2) {
            long l2;
            Object object = this.u0;
            j$b j$b = ((Mt2)object).k;
            object = ((Mt2)object).b;
            bl2 = j$b.equals(object);
            if (bl2) {
                object = this.u0;
                l2 = gz3.T(((Mt2)object).q);
            } else {
                l2 = this.getDuration();
            }
            return l2;
        }
        return this.getContentBufferedPosition();
    }

    public final VV getClock() {
        return this.x;
    }

    public final long getContentBufferedPosition() {
        this.E();
        Object object = this.u0.a;
        boolean bl2 = ((androidx.media3.common.g)object).q();
        if (bl2) {
            return this.w0;
        }
        object = this.u0;
        Object object2 = ((Mt2)object).k;
        long l2 = ((j$b)object2).d;
        Object object3 = ((Mt2)object).b;
        long l3 = ((j$b)object3).d;
        long l4 = l2 - l3;
        Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object4 != false) {
            object = ((Mt2)object).a;
            int n3 = this.getCurrentMediaItemIndex();
            g$c g$c = this.a;
            return gz3.T(((androidx.media3.common.g)object).n((int)n3, (g$c)g$c, (long)0L).m);
        }
        long l7 = ((Mt2)object).q;
        Object object5 = this.u0.k;
        boolean bl3 = ((j$b)object5).b();
        if (bl3) {
            object = this.u0;
            object2 = ((Mt2)object).a;
            object = ((Mt2)object).k.a;
            object5 = this.n;
            object = ((androidx.media3.common.g)object2).h(object, (androidx.media3.common.g$b)object5);
            object2 = this.u0.k;
            int n4 = ((j$b)object2).b;
            l2 = ((androidx.media3.common.g$b)object).d(n4);
            long l8 = l2 - (l3 = Long.MIN_VALUE);
            object4 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            l7 = object4 == false ? ((androidx.media3.common.g$b)object).d : l2;
        }
        object5 = this.u0;
        object3 = ((Mt2)object5).a;
        object5 = ((Mt2)object5).k.a;
        androidx.media3.common.g$b g$b = this.n;
        ((androidx.media3.common.g)object3).h(object5, g$b);
        long l12 = g$b.e;
        return gz3.T(l7 + l12);
    }

    public final long getContentPosition() {
        this.E();
        Mt2 mt2 = this.u0;
        return this.k(mt2);
    }

    public final int getCurrentAdGroupIndex() {
        this.E();
        int n3 = this.isPlayingAd();
        if (n3 != 0) {
            j$b j$b = this.u0.b;
            n3 = j$b.b;
        } else {
            n3 = -1;
        }
        return n3;
    }

    public final int getCurrentAdIndexInAdGroup() {
        this.E();
        int n3 = this.isPlayingAd();
        if (n3 != 0) {
            j$b j$b = this.u0.b;
            n3 = j$b.c;
        } else {
            n3 = -1;
        }
        return n3;
    }

    public final Ue0 getCurrentCues() {
        this.E();
        return this.j0;
    }

    public final int getCurrentMediaItemIndex() {
        this.E();
        Mt2 mt2 = this.u0;
        int n3 = this.m(mt2);
        int n4 = -1;
        if (n3 == n4) {
            n3 = 0;
            mt2 = null;
        }
        return n3;
    }

    public final int getCurrentPeriodIndex() {
        this.E();
        Object object = this.u0.a;
        boolean bl2 = ((androidx.media3.common.g)object).q();
        if (bl2) {
            return 0;
        }
        object = this.u0;
        androidx.media3.common.g g3 = ((Mt2)object).a;
        object = ((Mt2)object).b.a;
        return g3.b(object);
    }

    public final long getCurrentPosition() {
        this.E();
        Mt2 mt2 = this.u0;
        return gz3.T(this.l(mt2));
    }

    public final androidx.media3.common.g getCurrentTimeline() {
        this.E();
        return this.u0.a;
    }

    public final sp3 getCurrentTrackGroups() {
        this.E();
        return this.u0.h;
    }

    public final Dp3 getCurrentTrackSelections() {
        this.E();
        Cp3[] cp3Array = this.u0.i.c;
        Dp3 dp3 = new Dp3(cp3Array);
        return dp3;
    }

    public final bq3 getCurrentTracks() {
        this.E();
        return this.u0.i.d;
    }

    public final ExoPlayer$d getDeviceComponent() {
        this.E();
        return this;
    }

    public final Ip0 getDeviceInfo() {
        this.E();
        return this.r0;
    }

    public final int getDeviceVolume() {
        this.E();
        return 0;
    }

    public final long getDuration() {
        this.E();
        int n3 = this.isPlayingAd();
        if (n3 != 0) {
            Object object = this.u0;
            j$b j$b = ((Mt2)object).b;
            object = ((Mt2)object).a;
            Object object2 = j$b.a;
            androidx.media3.common.g$b g$b = this.n;
            ((androidx.media3.common.g)object).h(object2, g$b);
            n3 = j$b.b;
            int n4 = j$b.c;
            return gz3.T(g$b.a(n3, n4));
        }
        return this.getContentDuration();
    }

    public final long getMaxSeekToPreviousPosition() {
        this.E();
        return this.w;
    }

    public final androidx.media3.common.e getMediaMetadata() {
        this.E();
        return this.Q;
    }

    public final boolean getPauseAtEndOfMediaItems() {
        this.E();
        return this.O;
    }

    public final boolean getPlayWhenReady() {
        this.E();
        return this.u0.l;
    }

    public final Looper getPlaybackLooper() {
        return this.k.k;
    }

    public final ot2_0 getPlaybackParameters() {
        this.E();
        return this.u0.o;
    }

    public final int getPlaybackState() {
        this.E();
        return this.u0.e;
    }

    public final int getPlaybackSuppressionReason() {
        this.E();
        return this.u0.n;
    }

    public final ExoPlaybackException getPlayerError() {
        this.E();
        return this.u0.f;
    }

    public final androidx.media3.common.e getPlaylistMetadata() {
        this.E();
        return this.R;
    }

    public final ExoPlayer$e getPreloadConfiguration() {
        return this.N;
    }

    public final n getRenderer(int n3) {
        this.E();
        return this.g[n3];
    }

    public final int getRendererCount() {
        this.E();
        return this.g.length;
    }

    public final int getRendererType(int n3) {
        this.E();
        return this.g[n3].m();
    }

    public final int getRepeatMode() {
        this.E();
        return this.F;
    }

    public final long getSeekBackIncrement() {
        this.E();
        return this.u;
    }

    public final long getSeekForwardIncrement() {
        this.E();
        return this.v;
    }

    public final ex2_0 getSeekParameters() {
        this.E();
        return this.L;
    }

    public final boolean getShuffleModeEnabled() {
        this.E();
        return this.G;
    }

    public final boolean getSkipSilenceEnabled() {
        this.E();
        return this.i0;
    }

    public final A63 getSurfaceSize() {
        this.E();
        return this.c0;
    }

    public final ExoPlayer$f getTextComponent() {
        this.E();
        return this;
    }

    public final long getTotalBufferedDuration() {
        this.E();
        return gz3.T(this.u0.r);
    }

    public final Fp3 getTrackSelectionParameters() {
        this.E();
        return this.h.a();
    }

    public final Gp3 getTrackSelector() {
        this.E();
        return this.h;
    }

    public final int getVideoChangeFrameRateStrategy() {
        this.E();
        return this.b0;
    }

    public final ExoPlayer$g getVideoComponent() {
        this.E();
        return this;
    }

    public final fj0 getVideoDecoderCounters() {
        this.E();
        return this.d0;
    }

    public final d getVideoFormat() {
        this.E();
        return this.S;
    }

    public final int getVideoScalingMode() {
        this.E();
        return this.a0;
    }

    public final wc3_0 getVideoSize() {
        this.E();
        return this.s0;
    }

    public final float getVolume() {
        this.E();
        return this.h0;
    }

    public final au2_0 h() {
        ArrayList arrayList = this.o;
        s s7 = this.M;
        au2_0 au2_02 = new au2_0(arrayList, s7);
        return au2_02;
    }

    public final ArrayList i(List list) {
        int n3;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int i3 = 0; i3 < (n3 = list.size()); ++i3) {
            Object object = (MediaItem)list.get(i3);
            j$a j$a = this.q;
            object = j$a.b((MediaItem)object);
            arrayList.add(object);
        }
        return arrayList;
    }

    public final void increaseDeviceVolume() {
        this.E();
    }

    public final void increaseDeviceVolume(int n3) {
        this.E();
    }

    public final boolean isDeviceMuted() {
        this.E();
        return false;
    }

    public final boolean isLoading() {
        this.E();
        return this.u0.g;
    }

    public final boolean isPlayingAd() {
        this.E();
        return this.u0.b.b();
    }

    public final boolean isReleased() {
        this.E();
        return this.q0;
    }

    public final boolean isSleepingForOffload() {
        this.E();
        return this.u0.p;
    }

    public final boolean isTunnelingEnabled() {
        this.E();
        for (uJ2 uJ22 : this.u0.i.b) {
            boolean bl2;
            if (uJ22 == null || !(bl2 = uJ22.b)) continue;
            return true;
        }
        return false;
    }

    public final m j(m$b m$b) {
        m m2;
        int n3;
        Mt2 mt2 = this.u0;
        int n4 = this.m(mt2);
        Object object = this.u0;
        androidx.media3.common.g g3 = ((Mt2)object).a;
        int n7 = -1;
        if (n4 == n7) {
            n4 = 0;
            mt2 = null;
            n3 = 0;
        } else {
            n3 = n4;
        }
        g g5 = this.k;
        Looper looper = g5.k;
        ph3_0 ph3_02 = this.x;
        object = m2;
        m2 = new m(g5, m$b, g3, n3, ph3_02, looper);
        return m2;
    }

    public final long k(Mt2 object) {
        Object object2 = ((Mt2)object).b;
        boolean bl2 = ((j$b)object2).b();
        if (bl2) {
            long l2;
            object2 = ((Mt2)object).b.a;
            androidx.media3.common.g g3 = ((Mt2)object).a;
            androidx.media3.common.g$b g$b = this.n;
            g3.h(object2, g$b);
            long l3 = -9223372036854775807L;
            long l4 = ((Mt2)object).c;
            bl2 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
            if (!bl2) {
                int n3 = this.m((Mt2)object);
                long l7 = 0L;
                object2 = this.a;
                object = g3.n(n3, (g$c)object2, l7);
                l2 = gz3.T(((g$c)object).l);
            } else {
                l2 = gz3.T(g$b.e);
                long l8 = gz3.T(l4);
                l2 += l8;
            }
            return l2;
        }
        return gz3.T(this.l((Mt2)object));
    }

    public final long l(Mt2 object) {
        androidx.media3.common.g g3 = ((Mt2)object).a;
        boolean bl2 = g3.q();
        if (bl2) {
            return gz3.I(this.w0);
        }
        bl2 = ((Mt2)object).p;
        long l2 = bl2 ? ((Mt2)object).j() : ((Mt2)object).s;
        Object object2 = ((Mt2)object).b;
        boolean bl3 = ((j$b)object2).b();
        if (bl3) {
            return l2;
        }
        object2 = ((Mt2)object).a;
        object = ((Mt2)object).b.a;
        androidx.media3.common.g$b g$b = this.n;
        ((androidx.media3.common.g)object2).h(object, g$b);
        long l3 = g$b.e;
        return l2 + l3;
    }

    public final int m(Mt2 mt2) {
        Object object = mt2.a;
        boolean bl2 = ((androidx.media3.common.g)object).q();
        if (bl2) {
            return this.v0;
        }
        object = mt2.b.a;
        androidx.media3.common.g$b g$b = this.n;
        return mt2.a.h((Object)object, (androidx.media3.common.g$b)g$b).c;
    }

    public final void moveMediaItems(int n3, int n4, int n7) {
        Object object;
        boolean bl2;
        this.E();
        int n8 = 1;
        if (n3 >= 0 && n3 <= n4 && n7 >= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        ct3.a(bl2);
        object = this.o;
        int n10 = ((ArrayList)object).size();
        n4 = Math.min(n4, n10);
        int n14 = n4 - n3;
        n14 = n10 - n14;
        n7 = Math.min(n7, n14);
        if (n3 < n10 && n3 != n4 && n3 != n7) {
            Object object2 = this.getCurrentTimeline();
            this.H = n10 = this.H + n8;
            gz3.H((List)object, n3, n4, n7);
            Object object3 = this.h();
            object = this.u0;
            int n15 = this.m((Mt2)object);
            Object object4 = this.u0;
            long l2 = this.k((Mt2)object4);
            object4 = this.n((androidx.media3.common.g)object2, (au2_0)object3, n15, l2);
            object2 = this.p((Mt2)object, (androidx.media3.common.g)object3, (Pair)object4);
            object3 = this.M;
            object = this.k;
            object.getClass();
            object4 = new g$b(n3, n4, n7, (s)object3);
            Object object5 = ((g)object).i;
            n4 = 19;
            object5 = object5.d(n4, object4);
            ((rh3$a_0)object5).b();
            int n16 = 5;
            long l3 = -9223372036854775807L;
            n15 = 0;
            int n17 = -1;
            this.B((Mt2)object2, 0, false, n16, l3, n17, false);
        }
    }

    public final Pair n(androidx.media3.common.g g3, au2_0 au2_02, int n3, long l2) {
        int n4 = g3.q();
        long l3 = -9223372036854775807L;
        int n7 = -1;
        if (n4 == 0 && (n4 = au2_02.q()) == 0) {
            long l4 = gz3.I(l2);
            g$c g$c = this.a;
            androidx.media3.common.g$b g$b = this.n;
            Object object = g3;
            Object object2 = g3.j(g$c, g$b, n3, l4);
            Object object3 = object2.first;
            int n8 = au2_02.b(object3);
            if (n8 != n7) {
                return object2;
            }
            object2 = this.a;
            object = this.n;
            int n10 = this.F;
            boolean bl2 = this.G;
            n4 = androidx.media3.exoplayer.g.M((g$c)object2, (androidx.media3.common.g$b)object, n10, bl2, object3, g3, au2_02);
            if (n4 != n7) {
                object = this.a;
                au2_02.n(n4, (g$c)object, 0L);
                long l7 = gz3.T(((g$c)object).l);
                return this.q(au2_02, n4, l7);
            }
            return this.q(au2_02, n7, l3);
        }
        n4 = g3.q();
        if (n4 == 0 && (n4 = au2_02.q()) != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            Object var15_13 = null;
        }
        if (n4 == 0) {
            n7 = n3;
        }
        if (n4 == 0) {
            l3 = l2;
        }
        return this.q(au2_02, n7, l3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Mt2 p(Mt2 mt2, androidx.media3.common.g g3, Pair pair) {
        long l2;
        boolean bl2;
        Object object;
        Mt2 mt22;
        long l3;
        Object object2;
        Object object3;
        e e2;
        block14: {
            block12: {
                block13: {
                    long l4;
                    int n3;
                    j$b j$b;
                    Object object4;
                    Object object5;
                    int n4;
                    Object object6;
                    boolean bl3;
                    int n7;
                    block11: {
                        j$b j$b2;
                        e2 = this;
                        object3 = g3;
                        object2 = pair;
                        n7 = g3.q();
                        bl3 = false;
                        object6 = null;
                        n4 = 1;
                        if (n7 == 0 && pair == null) {
                            n7 = 0;
                            object5 = null;
                        } else {
                            n7 = 1;
                        }
                        ct3.a(n7 != 0);
                        object5 = mt2;
                        object4 = mt2.a;
                        l3 = this.k(mt2);
                        mt22 = mt2.h(g3);
                        n7 = g3.q();
                        if (n7 != 0) {
                            long l7;
                            object3 = Mt2.u;
                            long l8 = gz3.I(e2.w0);
                            sp3 sp32 = sp3.d;
                            object2 = e2.b;
                            ImmutableList immutableList = ImmutableList.of();
                            Object object7 = object3;
                            long l12 = l8;
                            long l14 = l8;
                            Object object8 = object2;
                            object3 = mt22.c((j$b)object3, l8, l8, l8, 0L, sp32, (Hp3)object2, immutableList).b((j$b)object3);
                            ((Mt2)object3).q = l7 = ((Mt2)object3).s;
                            return object3;
                        }
                        object5 = mt22.b.a;
                        object = ((Pair)object2).first;
                        bl2 = object5.equals(object) ^ n4;
                        if (bl2) {
                            Object object9 = ((Pair)object2).first;
                            j$b2 = new j$b(object9);
                        } else {
                            j$b2 = mt22.b;
                        }
                        j$b = j$b2;
                        object2 = (Long)((Pair)object2).second;
                        l2 = (Long)object2;
                        l3 = gz3.I(l3);
                        n3 = ((androidx.media3.common.g)object4).q();
                        if (n3 == 0) {
                            object2 = e2.n;
                            object2 = ((androidx.media3.common.g)object4).h(object5, (androidx.media3.common.g$b)object2);
                            l4 = ((androidx.media3.common.g$b)object2).e;
                            l3 -= l4;
                        }
                        if (!bl2 && (n3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1)) >= 0) break block11;
                        l3 = l2;
                        object3 = j$b;
                        n3 = j$b.b() ^ n4;
                        ct3.f(n3 != 0);
                        if (!bl2) break block12;
                        break block13;
                    }
                    if (n3 == 0) {
                        long l15;
                        object2 = mt22.k.a;
                        n3 = ((androidx.media3.common.g)object3).b(object2);
                        if (n3 != (n7 = -1)) {
                            object5 = e2.n;
                            object2 = ((androidx.media3.common.g)object3).g(n3, (androidx.media3.common.g$b)object5, false);
                            n3 = ((androidx.media3.common.g$b)object2).c;
                            object5 = j$b.a;
                            object6 = e2.n;
                            object5 = ((androidx.media3.common.g)object3).h(object5, (androidx.media3.common.g$b)object6);
                            n7 = ((androidx.media3.common.g$b)object5).c;
                            if (n3 == n7) return mt22;
                        }
                        object2 = j$b.a;
                        object5 = e2.n;
                        ((androidx.media3.common.g)object3).h(object2, (androidx.media3.common.g$b)object5);
                        boolean bl4 = j$b.b();
                        if (bl4) {
                            object3 = e2.n;
                            n3 = j$b.b;
                            n7 = j$b.c;
                            l15 = ((androidx.media3.common.g$b)object3).a(n3, n7);
                        } else {
                            object3 = e2.n;
                            l15 = ((androidx.media3.common.g$b)object3).d;
                        }
                        long l16 = mt22.s;
                        l2 = mt22.s;
                        long l17 = mt22.d;
                        long l18 = mt22.s;
                        long l19 = l15 - l18;
                        sp3 sp33 = mt22.h;
                        object4 = mt22.i;
                        List list = mt22.j;
                        object = j$b;
                        long l20 = l17;
                        sp3 sp34 = sp33;
                        Object object10 = object4;
                        List list2 = list;
                        object5 = mt22.c(j$b, l16, l2, l17, l19, sp33, (Hp3)object4, list);
                        mt22 = ((Mt2)object5).b(j$b);
                        mt22.q = l15;
                        return mt22;
                    }
                    object3 = j$b;
                    n3 = j$b.b() ^ n4;
                    ct3.f(n3 != 0);
                    l4 = mt22.r;
                    long l21 = l2 - l3;
                    l4 -= l21;
                    l21 = 0L;
                    long l22 = Math.max(l21, l4);
                    l4 = mt22.q;
                    object6 = mt22.k;
                    Object object11 = mt22.b;
                    bl3 = ((j$b)object6).equals(object11);
                    if (bl3) {
                        l4 = l2 + l22;
                    }
                    object6 = mt22.h;
                    object11 = mt22.i;
                    object4 = mt22.j;
                    object = object3;
                    long l23 = l2;
                    l3 = l2;
                    long l24 = l2;
                    Object object12 = object6;
                    Object object13 = object11;
                    Object object14 = object4;
                    mt22 = mt22.c((j$b)object3, l2, l2, l2, l22, (sp3)object6, (Hp3)object11, (List)object4);
                    mt22.q = l4;
                    return mt22;
                }
                object2 = sp3.d;
                break block14;
            }
            object2 = mt22.h;
        }
        Object object15 = object2;
        object2 = bl2 ? e2.b : mt22.i;
        Object object16 = object2;
        object2 = bl2 ? ImmutableList.of() : mt22.j;
        Object object17 = object2;
        long l25 = 0L;
        object = object3;
        long l26 = l3;
        l2 = l3;
        long l27 = l3;
        object2 = mt22.c((j$b)object3, l3, l3, l3, l25, (sp3)object15, (Hp3)object16, (List)object2);
        mt22 = ((Mt2)object2).b((j$b)object3);
        mt22.q = l3;
        return mt22;
    }

    public final void prepare() {
        this.E();
        int n3 = this.getPlayWhenReady();
        Object object = this.B;
        int n4 = 2;
        int n7 = ((a)object).e(n4, n3 != 0);
        int n8 = -1;
        int n10 = 1;
        n8 = n7 == n8 ? 2 : 1;
        this.A(n7, n8, n3 != 0);
        Mt2 mt2 = this.u0;
        n7 = mt2.e;
        if (n7 != n10) {
            return;
        }
        mt2 = mt2.e(null);
        object = mt2.a;
        n7 = (int)(((androidx.media3.common.g)object).q() ? 1 : 0);
        if (n7 != 0) {
            n4 = 4;
        }
        Mt2 mt22 = mt2.g(n4);
        this.H = n3 = this.H + n10;
        this.k.i.b(29).b();
        this.B(mt22, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void prepare(j j3) {
        this.E();
        this.setMediaSource(j3);
        this.prepare();
    }

    public final void prepare(j j3, boolean bl2, boolean bl3) {
        this.E();
        this.setMediaSource(j3, bl2);
        this.prepare();
    }

    public final Pair q(androidx.media3.common.g g3, int n3, long l2) {
        int n4 = g3.q();
        long l3 = 0L;
        if (n4 != 0) {
            this.v0 = n3;
            long l4 = -9223372036854775807L;
            long l7 = l2 - l4;
            n4 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
            if (n4 == 0) {
                l2 = l3;
            }
            this.w0 = l2;
            return null;
        }
        n4 = -1;
        if (n3 == n4 || n3 >= (n4 = g3.p())) {
            n3 = (int)(this.G ? 1 : 0);
            n3 = g3.a(n3 != 0);
            g$c g$c = this.a;
            g$c = g3.n(n3, g$c, l3);
            l2 = gz3.T(g$c.l);
        }
        long l8 = gz3.I(l2);
        g$c g$c = this.a;
        androidx.media3.common.g$b g$b = this.n;
        return g3.j(g$c, g$b, n3, l8);
    }

    public final void r(int n3, int n4) {
        int n7;
        Object object = this.c0;
        int n8 = ((A63)object).a;
        if (n3 != n8 || n4 != (n7 = ((A63)object).b)) {
            object = new A63(n3, n4);
            this.c0 = object;
            object = new cf0_0(n3, n4);
            vv1_0 vv1_02 = this.l;
            int n10 = 24;
            vv1_02.f(n10, (vv1$a)object);
            object = new A63(n3, n4);
            n3 = 2;
            n4 = 14;
            this.u(n3, n4, object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void release() {
        long l2;
        Object object;
        Ue0 ue0 = null;
        Object object2 = new StringBuilder("Release ");
        int n3 = System.identityHashCode(this);
        Object object3 = Integer.toHexString(n3);
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append(" [AndroidXMedia3/1.5.1] [");
        object3 = gz3.e;
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append("] [");
        object3 = im1_0.a;
        object3 = im1_0.class;
        synchronized (object3) {
            object = im1_0.b;
        }
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append("]");
        Cx.e(((StringBuilder)object2).toString());
        this.E();
        object2 = this.A;
        n3 = 0;
        object3 = null;
        ((AudioBecomingNoisyManager)object2).a(false);
        object2 = this.C;
        ((PE3)object2).d = false;
        object2 = ((PE3)object2).b;
        if (object2 != null) {
            object2.release();
        }
        object2 = this.D;
        ((XF3)object2).d = false;
        object2 = ((XF3)object2).b;
        if (object2 != null) {
            object2.release();
        }
        object2 = this.B;
        ((a)object2).c = null;
        ((a)object2).a();
        ((a)object2).d(0);
        object2 = this.k;
        boolean bl2 = ((g)object2).C();
        if (!bl2) {
            object2 = this.l;
            object3 = new Object();
            int n4 = 10;
            ((vv1_0)object2).f(n4, (vv1$a)object3);
        }
        this.l.d();
        this.i.c();
        object2 = this.t;
        object3 = this.r;
        object2.d((iv$a)object3);
        object2 = this.u0;
        n3 = (int)(((Mt2)object2).p ? 1 : 0);
        if (n3 != 0) {
            this.u0 = object2 = ((Mt2)object2).a();
        }
        object2 = this.u0;
        n3 = 1;
        this.u0 = object2 = ((Mt2)object2).g(n3);
        object = ((Mt2)object2).b;
        this.u0 = object2 = ((Mt2)object2).b((j$b)object);
        ((Mt2)object2).q = l2 = ((Mt2)object2).s;
        object2 = this.u0;
        ((Mt2)object2).r = l2 = 0L;
        this.r.release();
        this.h.d();
        this.t();
        object2 = this.V;
        if (object2 != null) {
            object2.release();
            this.V = null;
        }
        if (!(bl2 = this.p0)) {
            this.j0 = ue0 = Ue0.b;
            this.q0 = n3;
            return;
        }
        throw null;
    }

    public final void removeAnalyticsListener(oe oe2) {
        this.E();
        oe2.getClass();
        this.r.B(oe2);
    }

    public final void removeAudioOffloadListener(ExoPlayer$b exoPlayer$b) {
        this.E();
        this.m.remove(exoPlayer$b);
    }

    public final void removeListener(f$c f$c) {
        this.E();
        f$c.getClass();
        this.l.e(f$c);
    }

    public final void removeMediaItems(int n3, int n4) {
        Object object;
        int n7;
        this.E();
        if (n3 >= 0 && n4 >= n3) {
            n7 = 1;
        } else {
            n7 = 0;
            object = null;
        }
        ct3.a(n7 != 0);
        object = this.o;
        n7 = ((ArrayList)object).size();
        n4 = Math.min(n4, n7);
        if (n3 < n7 && n3 != n4) {
            object = this.u0;
            Mt2 mt2 = this.s((Mt2)object, n3, n4);
            Object object2 = mt2.b.a;
            Object object3 = this.u0.b.a;
            n3 = (int)(object2.equals(object3) ? 1 : 0);
            boolean bl2 = n3 ^ 1;
            long l2 = this.l(mt2);
            int n8 = 4;
            int n10 = -1;
            this.B(mt2, 0, bl2, n8, l2, n10, false);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void replaceMediaItems(int n3, int n4, List object) {
        Object object2;
        boolean bl2;
        Object object3;
        int n7;
        block10: {
            int n8;
            this.E();
            n7 = 0;
            object3 = null;
            int n10 = 1;
            if (n3 >= 0 && n4 >= n3) {
                bl2 = true;
            } else {
                bl2 = false;
                object2 = null;
            }
            ct3.a(bl2);
            object2 = this.o;
            int n14 = ((ArrayList)object2).size();
            if (n3 > n14) {
                return;
            }
            if ((n14 = (n4 = Math.min(n4, n14)) - n3) == (n8 = object.size())) {
                MediaItem mediaItem;
                Object object4;
                for (n14 = n3; n14 < n4; ++n14) {
                    object4 = ((e$d)((ArrayList)object2).get((int)n14)).b;
                    object4 = ((w)object4).k;
                    int n15 = n14 - n3;
                    mediaItem = (MediaItem)object.get(n15);
                    n8 = (int)(object4.p(mediaItem) ? 1 : 0);
                    if (n8 != 0) {
                        continue;
                    }
                    break block10;
                }
                this.H = n7 = this.H + n10;
                object3 = this.k.i;
                n10 = 27;
                object3 = object3.h(n10, object, n3, n4);
                ((rh3$a_0)object3).b();
                n7 = n3;
                while (true) {
                    Object object5;
                    if (n7 >= n4) {
                        au2_0 au2_02 = this.h();
                        object5 = this.u0.h(au2_02);
                        object3 = this;
                        this.B((Mt2)object5, 0, false, 4, -9223372036854775807L, -1, false);
                        return;
                    }
                    object5 = (e$d)((ArrayList)object2).get(n7);
                    object4 = ((e$d)object5).c;
                    int n16 = n7 - n3;
                    mediaItem = (MediaItem)object.get(n16);
                    en3_0 en3_02 = new en3_0((androidx.media3.common.g)object4, mediaItem);
                    ((e$d)object5).c = en3_02;
                    ++n7;
                }
            }
        }
        object = this.i((List)object);
        bl2 = ((ArrayList)object2).isEmpty();
        if (!bl2) {
            object3 = this.u0;
            object = this.f((Mt2)object3, n4, (List)object);
            Mt2 mt2 = this.s((Mt2)object, n3, n4);
            Object object6 = mt2.b.a;
            Object object7 = this.u0.b.a;
            boolean bl3 = object6.equals(object7) ^ true;
            long l2 = this.l(mt2);
            object2 = this;
            this.B(mt2, 0, bl3, 4, l2, -1, false);
            return;
        }
        n3 = this.v0;
        n4 = -1;
        if (n3 == n4) {
            n7 = 1;
        }
        this.setMediaSources((List)object, n7 != 0);
    }

    public final Mt2 s(Mt2 mt2, int n3, int n4) {
        int n7 = this.m(mt2);
        long l2 = this.k(mt2);
        Object object = this.o;
        int n8 = ((ArrayList)object).size();
        int n10 = this.H;
        int n14 = 1;
        this.H = n10 += n14;
        for (n10 = n4 + -1; n10 >= n3; n10 += -1) {
            ((ArrayList)object).remove(n10);
        }
        this.M = object = this.M.a(n3, n4);
        au2_0 au2_02 = this.h();
        androidx.media3.common.g g3 = mt2.a;
        object = this;
        object = this.n(g3, au2_02, n7, l2);
        mt2 = this.p(mt2, au2_02, (Pair)object);
        int n15 = mt2.e;
        if (n15 != n14 && n15 != (n10 = 4) && n3 < n4 && n4 == n8 && n7 >= (n15 = ((androidx.media3.common.g)(object = mt2.a)).p())) {
            mt2 = mt2.g(n10);
        }
        object = this.M;
        this.k.i.h(20, object, n3, n4).b();
        return mt2;
    }

    public final void setAudioAttributes(dr_1 dr_12, boolean n3) {
        Object object;
        this.E();
        int n4 = this.q0;
        if (n4 != 0) {
            return;
        }
        Object object2 = this.g0;
        int n7 = gz3.a;
        n4 = Objects.equals(object2, dr_12);
        n7 = 1;
        vv1_0 vv1_02 = this.l;
        if (n4 == 0) {
            this.g0 = dr_12;
            n4 = 3;
            this.u(n7, n4, dr_12);
            object2 = new ng2_0(dr_12);
            int n8 = 20;
            vv1_02.c(n8, (vv1$a)object2);
        }
        if (n3 != 0) {
            object = dr_12;
        } else {
            n3 = 0;
            object = null;
        }
        object2 = this.B;
        ((a)object2).c((dr_1)object);
        object = this.h;
        ((Gp3)object).f(dr_12);
        boolean bl2 = this.getPlayWhenReady();
        n3 = this.getPlaybackState();
        n3 = ((a)object2).e(n3, bl2);
        n4 = -1;
        if (n3 == n4) {
            n7 = 2;
        }
        this.A(n3, n7, bl2);
        vv1_02.b();
    }

    public final void setAudioSessionId(int n3) {
        Object object;
        this.E();
        int n4 = this.f0;
        if (n4 == n3) {
            return;
        }
        if (n3 == 0) {
            n3 = gz3.a;
            object = this.e;
            AudioManager audioManager = (AudioManager)object.getSystemService("audio");
            n3 = audioManager == null ? -1 : audioManager.generateAudioSessionId();
        }
        this.f0 = n3;
        object = n3;
        int n7 = 10;
        this.u(1, n7, object);
        object = n3;
        this.u(2, n7, object);
        object = new df0_0(n3);
        this.l.f(21, (vv1$a)object);
    }

    public final void setAuxEffectInfo(dt dt2) {
        this.E();
        this.u(1, 6, dt2);
    }

    public final void setCameraMotionListener(jk_0 jk_02) {
        this.E();
        this.l0 = jk_02;
        Object object = this.z;
        object = this.j((m$b)object);
        ((m)object).e(8);
        ((m)object).d(jk_02);
        ((m)object).c();
    }

    public final void setDeviceMuted(boolean bl2) {
        this.E();
    }

    public final void setDeviceMuted(boolean bl2, int n3) {
        this.E();
    }

    public final void setDeviceVolume(int n3) {
        this.E();
    }

    public final void setDeviceVolume(int n3, int n4) {
        this.E();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void setForegroundMode(boolean bl2) {
        Object object;
        Object object2;
        int n3;
        int n4;
        block6: {
            block4: {
                int n7;
                g g3;
                block5: {
                    this.E();
                    n4 = this.K;
                    if (n4 == bl2) return;
                    this.K = bl2;
                    g3 = this.k;
                    // MONITORENTER : g3
                    n7 = g3.D;
                    n3 = 1;
                    if (n7 != 0) break block4;
                    object2 = g3.k;
                    n7 = ((Thread)(object2 = object2.getThread())).isAlive();
                    if (n7 == 0) break block4;
                    n7 = 13;
                    if (!bl2) break block5;
                    object = g3.i;
                    object = object.f(n7, n3, 0);
                    ((rh3$a_0)object).b();
                    // MONITOREXIT : g3
                    break block6;
                }
                object = new AtomicBoolean();
                H21 h21 = g3.i;
                object2 = h21.h(n7, object, 0, 0);
                ((rh3$a_0)object2).b();
                object2 = new CF0((AtomicBoolean)object);
                long l2 = g3.X;
                g3.p0((Supplier)object2, l2);
                n3 = (int)(((AtomicBoolean)object).get() ? 1 : 0);
                // MONITOREXIT : g3
                break;
            }
            // MONITOREXIT : g3
        }
        if (n3 != 0) return;
        n4 = 2;
        object = new ExoTimeoutException(n4);
        n3 = 1003;
        object2 = new ExoPlaybackException(n4, (Throwable)object, n3);
        this.y((ExoPlaybackException)object2);
    }

    public final void setHandleAudioBecomingNoisy(boolean bl2) {
        this.E();
        boolean bl3 = this.q0;
        if (bl3) {
            return;
        }
        this.A.a(bl2);
    }

    public final void setImageOutput(ImageOutput imageOutput) {
        this.E();
        this.u(4, 15, imageOutput);
    }

    public final void setMediaItems(List list, int n3, long l2) {
        this.E();
        list = this.i(list);
        this.setMediaSources(list, n3, l2);
    }

    public final void setMediaItems(List list, boolean bl2) {
        this.E();
        list = this.i(list);
        this.setMediaSources(list, bl2);
    }

    public final void setMediaSource(j object) {
        this.E();
        object = Collections.singletonList(object);
        this.setMediaSources((List)object);
    }

    public final void setMediaSource(j object, long l2) {
        this.E();
        object = Collections.singletonList(object);
        this.setMediaSources((List)object, 0, l2);
    }

    public final void setMediaSource(j object, boolean bl2) {
        this.E();
        object = Collections.singletonList(object);
        this.setMediaSources((List)object, bl2);
    }

    public final void setMediaSources(List list) {
        this.E();
        this.setMediaSources(list, true);
    }

    public final void setMediaSources(List list, int n3, long l2) {
        this.E();
        this.v(list, n3, l2, false);
    }

    public final void setMediaSources(List list, boolean bl2) {
        this.E();
        this.v(list, -1, -9223372036854775807L, bl2);
    }

    public final void setPauseAtEndOfMediaItems(boolean bl2) {
        this.E();
        boolean bl3 = this.O;
        if (bl3 == bl2) {
            return;
        }
        this.O = bl2;
        this.k.i.f(23, (int)(bl2 ? 1 : 0), 0).b();
    }

    public final void setPlayWhenReady(boolean bl2) {
        this.E();
        a a2 = this.B;
        int n3 = this.getPlaybackState();
        int n4 = a2.e(n3, bl2);
        n3 = -1;
        n3 = n4 == n3 ? 2 : 1;
        this.A(n4, n3, bl2);
    }

    public final void setPlaybackParameters(ot2_0 ot2_02) {
        ot2_0 ot2_03;
        int n3;
        this.E();
        if (ot2_02 == null) {
            ot2_02 = ot2_0.d;
        }
        if ((n3 = (ot2_03 = this.u0.o).equals(ot2_02)) != 0) {
            return;
        }
        Mt2 mt2 = this.u0.f(ot2_02);
        this.H = n3 = this.H + 1;
        this.k.i.d(4, ot2_02).b();
        this.B(mt2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void setPlaylistMetadata(androidx.media3.common.e object) {
        this.E();
        object.getClass();
        androidx.media3.common.e e2 = this.R;
        boolean bl2 = ((androidx.media3.common.e)object).equals(e2);
        if (bl2) {
            return;
        }
        this.R = object;
        object = new kf0_1(this);
        this.l.f(15, (vv1$a)object);
    }

    public final void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo) {
        this.E();
        this.u(1, 12, audioDeviceInfo);
    }

    public final void setPreloadConfiguration(ExoPlayer$e exoPlayer$e) {
        this.E();
        ExoPlayer$e exoPlayer$e2 = this.N;
        boolean bl2 = exoPlayer$e2.equals(exoPlayer$e);
        if (bl2) {
            return;
        }
        this.N = exoPlayer$e;
        this.k.i.d(28, exoPlayer$e).b();
    }

    public final void setPriority(int n3) {
        this.E();
        int n4 = this.o0;
        if (n4 == n3) {
            return;
        }
        n4 = (int)(this.p0 ? 1 : 0);
        if (n4 == 0) {
            this.o0 = n3;
            Integer n7 = n3;
            this.u(-1, 16, n7);
            return;
        }
        throw null;
    }

    public final void setPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
        this.E();
        boolean bl2 = Objects.equals(null, priorityTaskManager);
        if (bl2) {
            return;
        }
        bl2 = this.p0;
        if (!bl2) {
            this.p0 = false;
            return;
        }
        throw null;
    }

    public final void setRepeatMode(int n3) {
        this.E();
        int n4 = this.F;
        if (n4 != n3) {
            this.F = n3;
            Object object = this.k.i;
            int n7 = 11;
            object.f(n7, n3, 0).b();
            object = new gF0(n3);
            n3 = 8;
            vv1_0 vv1_02 = this.l;
            vv1_02.c(n3, (vv1$a)object);
            this.z();
            vv1_02.b();
        }
    }

    public final void setSeekParameters(ex2_0 object) {
        Object object2;
        boolean bl2;
        this.E();
        if (object == null) {
            object = ex2_0.c;
        }
        if (!(bl2 = ((ex2_0)(object2 = this.L)).equals(object))) {
            this.L = object;
            object2 = this.k.i;
            int n3 = 5;
            object = object2.d(n3, object);
            ((rh3$a_0)object).b();
        }
    }

    public final void setShuffleModeEnabled(boolean bl2) {
        this.E();
        boolean bl3 = this.G;
        if (bl3 != bl2) {
            this.G = bl2;
            Object object = this.k.i;
            int n3 = 12;
            object.f(n3, (int)(bl2 ? 1 : 0), 0).b();
            object = new lf0_1(bl2);
            int n4 = 9;
            vv1_0 vv1_02 = this.l;
            vv1_02.c(n4, (vv1$a)object);
            this.z();
            vv1_02.b();
        }
    }

    public final void setShuffleOrder(s s7) {
        au2_0 au2_02;
        this.E();
        int n3 = s7.getLength();
        Object object = this.o;
        int n4 = ((ArrayList)object).size();
        int n7 = 1;
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            au2_02 = null;
        }
        ct3.a(n3 != 0);
        this.M = s7;
        au2_02 = this.h();
        object = this.u0;
        int n8 = this.getCurrentMediaItemIndex();
        long l2 = this.getCurrentPosition();
        Pair pair = this.q(au2_02, n8, l2);
        Mt2 mt2 = this.p((Mt2)object, au2_02, pair);
        this.H = n3 = this.H + n7;
        this.k.i.d(21, s7).b();
        this.B(mt2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void setSkipSilenceEnabled(boolean bl2) {
        this.E();
        boolean bl3 = this.i0;
        if (bl3 == bl2) {
            return;
        }
        this.i0 = bl2;
        Object object = bl2;
        this.u(1, 9, object);
        object = new af0_1(bl2);
        this.l.f(23, (vv1$a)object);
    }

    public final void setTrackSelectionParameters(Fp3 object) {
        Fp3 fp3;
        this.E();
        Object object2 = this.h;
        object2.getClass();
        int n3 = object2 instanceof zn0;
        if (n3 != 0 && (n3 = ((Fp3)object).equals(fp3 = ((Gp3)object2).a())) == 0) {
            ((Gp3)object2).g((Fp3)object);
            object2 = new mf0_0(object);
            object = this.l;
            n3 = 19;
            ((vv1_0)object).f(n3, (vv1$a)object2);
        }
    }

    public final void setVideoChangeFrameRateStrategy(int n3) {
        this.E();
        int n4 = this.b0;
        if (n4 == n3) {
            return;
        }
        this.b0 = n3;
        Integer n7 = n3;
        this.u(2, 5, n7);
    }

    /*
     * WARNING - void declaration
     */
    public final void setVideoEffects(List list) {
        void var1_4;
        this.E();
        Object object = "androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory";
        object = Class.forName((String)object);
        int n3 = 1;
        Class[] classArray = new Class[n3];
        Class<MB3$a> clazz = MB3$a.class;
        classArray[0] = clazz;
        try {
            ((Class)object).getConstructor(classArray);
            this.u(2, 13, list);
            return;
        }
        catch (NoSuchMethodException noSuchMethodException) {
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        object = new IllegalStateException("Could not find required lib-effect dependencies.", (Throwable)var1_4);
        throw object;
    }

    public final void setVideoFrameMetadataListener(LB3 lB3) {
        this.E();
        this.k0 = lB3;
        Object object = this.z;
        object = this.j((m$b)object);
        ((m)object).e(7);
        ((m)object).d(lB3);
        ((m)object).c();
    }

    public final void setVideoScalingMode(int n3) {
        this.E();
        this.a0 = n3;
        Integer n4 = n3;
        this.u(2, 4, n4);
    }

    public final void setVideoSurface(Surface surface) {
        int n3;
        this.E();
        this.t();
        this.x(surface);
        if (surface == null) {
            n3 = 0;
            surface = null;
        } else {
            n3 = -1;
        }
        this.r(n3, n3);
    }

    public final void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.E();
        if (surfaceHolder == null) {
            this.clearVideoSurface();
        } else {
            boolean bl2;
            int n3;
            this.t();
            this.Y = n3 = 1;
            this.W = surfaceHolder;
            e$b e$b = this.y;
            surfaceHolder.addCallback((SurfaceHolder.Callback)e$b);
            e$b = surfaceHolder.getSurface();
            if (e$b != null && (bl2 = e$b.isValid())) {
                this.x(e$b);
                surfaceHolder = surfaceHolder.getSurfaceFrame();
                n3 = surfaceHolder.width();
                int n4 = surfaceHolder.height();
                this.r(n3, n4);
            } else {
                this.x(null);
                boolean bl3 = false;
                surfaceHolder = null;
                this.r(0, 0);
            }
        }
    }

    public final void setVideoSurfaceView(SurfaceView object) {
        this.E();
        boolean bl2 = object instanceof KB3;
        if (bl2) {
            this.t();
            this.x(object);
            object = object.getHolder();
            this.w((SurfaceHolder)object);
        } else {
            bl2 = object instanceof SphericalGLSurfaceView;
            if (bl2) {
                this.t();
                Object object2 = object;
                object2 = (SphericalGLSurfaceView)((Object)object);
                this.X = object2;
                object2 = this.z;
                object2 = this.j((m$b)object2);
                int n3 = 10000;
                ((m)object2).e(n3);
                Object object3 = this.X;
                ((m)object2).d(object3);
                ((m)object2).c();
                object2 = this.X.a;
                object3 = this.y;
                ((CopyOnWriteArrayList)object2).add(object3);
                object2 = this.X.getVideoSurface();
                this.x(object2);
                object = object.getHolder();
                this.w((SurfaceHolder)object);
            } else {
                object = object == null ? null : object.getHolder();
                this.setVideoSurfaceHolder((SurfaceHolder)object);
            }
        }
    }

    public final void setVideoTextureView(TextureView textureView) {
        this.E();
        if (textureView == null) {
            this.clearVideoSurface();
        } else {
            this.t();
            this.Z = textureView;
            Object object = textureView.getSurfaceTextureListener();
            if (object != null) {
                object = "Replacing existing SurfaceTextureListener.";
                Cx.f((String)object);
            }
            object = this.y;
            textureView.setSurfaceTextureListener(object);
            int n3 = textureView.isAvailable();
            Surface surface = null;
            if (n3 != 0) {
                object = textureView.getSurfaceTexture();
            } else {
                n3 = 0;
                object = null;
            }
            if (object == null) {
                this.x(null);
                boolean bl2 = false;
                textureView = null;
                this.r(0, 0);
            } else {
                surface = new Surface((SurfaceTexture)object);
                this.x(surface);
                this.V = surface;
                n3 = textureView.getWidth();
                int n4 = textureView.getHeight();
                this.r(n3, n4);
            }
        }
    }

    public final void setVolume(float f5) {
        this.E();
        Object object = null;
        float f6 = 1.0f;
        f5 = gz3.g(f5, 0.0f, f6);
        float f7 = this.h0;
        float f8 = f7 == f5 ? 0 : (f7 > f5 ? 1 : -1);
        if (f8 == false) {
            return;
        }
        this.h0 = f5;
        object = Float.valueOf(this.B.g * f5);
        this.u(1, 2, object);
        object = new bf0_1(f5);
        this.l.f(22, (vv1$a)object);
    }

    public final void setWakeMode(int n3) {
        this.E();
        int n4 = 0;
        XF3 xF3 = this.D;
        PE3 pE3 = this.C;
        if (n3 != 0) {
            int n7 = 1;
            if (n3 != n7) {
                n4 = 2;
                if (n3 == n4) {
                    pE3.a(n7 != 0);
                    xF3.a(n7 != 0);
                }
            } else {
                pE3.a(n7 != 0);
                xF3.a(false);
            }
        } else {
            pE3.a(false);
            xF3.a(false);
        }
    }

    public final void stop() {
        this.E();
        Object object = this.B;
        boolean bl2 = this.getPlayWhenReady();
        ((a)object).e(1, bl2);
        this.y(null);
        ImmutableList immutableList = ImmutableList.of();
        long cfr_ignored_0 = this.u0.s;
        this.j0 = object = new Ue0(immutableList);
    }

    public final void t() {
        Object object = this.X;
        e$b e$b = this.y;
        if (object != null) {
            object = this.z;
            object = this.j((m$b)object);
            int n3 = 10000;
            ((m)object).e(n3);
            ((m)object).d(null);
            ((m)object).c();
            object = this.X.a;
            ((CopyOnWriteArrayList)object).remove(e$b);
            this.X = null;
        }
        if ((object = this.Z) != null) {
            if ((object = object.getSurfaceTextureListener()) != e$b) {
                object = "SurfaceTextureListener already unset or replaced.";
                Cx.f((String)object);
            } else {
                object = this.Z;
                object.setSurfaceTextureListener(null);
            }
            this.Z = null;
        }
        if ((object = this.W) != null) {
            object.removeCallback((SurfaceHolder.Callback)e$b);
            this.W = null;
        }
    }

    public final void u(int n3, int n4, Object object) {
        for (n n7 : this.g) {
            int n8 = -1;
            if (n3 != n8 && (n8 = n7.m()) != n3) continue;
            m m2 = this.j(n7);
            m2.e(n4);
            m2.d(object);
            m2.c();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void v(List var1_1, int var2_2, long var3_3, boolean var5_4) {
        var6_5 = this;
        var7_6 = var2_2;
        var8_7 = this.u0;
        var9_8 = this.m((Mt2)var8_7);
        var10_9 = this.getCurrentPosition();
        var12_10 = this.H;
        var13_11 = 1;
        this.H = var12_10 += var13_11;
        var14_12 = this.o;
        var15_13 = var14_12.isEmpty();
        var16_14 = 0;
        if (var15_13 == 0) {
            var15_13 = var14_12.size();
            for (var17_15 = var15_13 + -1; var17_15 >= 0; var17_15 += -1) {
                var14_12.remove(var17_15);
            }
            var6_5.M = var14_12 = var6_5.M.a(0, var15_13);
        }
        var14_12 = var1_1;
        var18_16 = var6_5.e(0, var1_1);
        var14_12 = this.h();
        var15_13 = (int)var14_12.q();
        var17_15 = var14_12.f;
        if (var15_13 == 0 && var7_6 >= var17_15) {
            var19_17 = new IllegalStateException();
            throw var19_17;
        }
        var15_13 = -1;
        if (var5_4) {
            var7_6 = (int)var6_5.G;
            var7_6 = var14_12.a((boolean)var7_6);
            var20_19 = -9223372036854775807L;
lbl32:
            // 2 sources

            while (true) {
                var22_20 = var7_6;
                break;
            }
        } else if (var7_6 == var15_13) {
            var22_20 = var9_8;
            var20_19 = var10_9;
        } else {
            var20_19 = var3_3;
            ** continue;
        }
        var19_18 = var6_5.u0;
        var23_21 /* !! */  = var6_5.q((androidx.media3.common.g)var14_12, var22_20, var20_19);
        var19_18 = var6_5.p((Mt2)var19_18, (androidx.media3.common.g)var14_12, var23_21 /* !! */ );
        var24_22 = var19_18.e;
        if (var22_20 != var15_13 && var24_22 != var13_11) {
            var24_22 = (int)var14_12.q();
            var24_22 = var24_22 == 0 && var22_20 < var17_15 ? 2 : 4;
        }
        var23_21 /* !! */  = var19_18.g(var24_22);
        var25_23 = gz3.I(var20_19);
        var27_24 = var6_5.M;
        var19_18 = var6_5.k;
        var19_18.getClass();
        var8_7 = new g$a(var18_16, var27_24, var22_20, var25_23);
        var19_18 = var19_18.i;
        var28_25 = 17;
        var19_18.d(var28_25, var8_7).b();
        var19_18 = var6_5.u0.b.a;
        var8_7 = var23_21 /* !! */ .b.a;
        var7_6 = (int)var19_18.equals(var8_7);
        if (var7_6 != 0 || (var7_6 = (int)(var19_18 = var6_5.u0.a).q()) != 0) {
            var13_11 = 0;
        }
        var29_26 = var6_5.l((Mt2)var23_21 /* !! */ );
        var19_18 = this;
        var8_7 = var23_21 /* !! */ ;
        var24_22 = var13_11;
        var16_14 = -1;
        this.B((Mt2)var23_21 /* !! */ , 0, (boolean)var13_11, 4, var29_26, var16_14, false);
    }

    public final void w(SurfaceHolder surfaceHolder) {
        int n3;
        int n4 = 0;
        this.Y = false;
        this.W = surfaceHolder;
        e$b e$b = this.y;
        surfaceHolder.addCallback((SurfaceHolder.Callback)e$b);
        surfaceHolder = this.W.getSurface();
        if (surfaceHolder != null && (n3 = surfaceHolder.isValid()) != 0) {
            surfaceHolder = this.W.getSurfaceFrame();
            n4 = surfaceHolder.width();
            n3 = surfaceHolder.height();
            this.r(n4, n3);
        } else {
            this.r(0, 0);
        }
    }

    public final void x(Object object) {
        int n3;
        int n4;
        int n7;
        Object object2 = new ArrayList();
        Object object3 = this.g;
        int n8 = ((n[])object3).length;
        boolean bl2 = false;
        int n10 = 0;
        while (true) {
            n7 = 2;
            int n14 = 1;
            if (n10 >= n8) break;
            n n15 = object3[n10];
            int n16 = n15.m();
            if (n16 == n7) {
                m m2 = this.j(n15);
                m2.e(n14);
                m2.d(object);
                m2.c();
                ((ArrayList)object2).add(m2);
            }
            ++n10;
        }
        object3 = this.U;
        if (object3 != null && object3 != object) {
            block14: {
                try {
                    object2 = ((ArrayList)object2).iterator();
                }
                catch (TimeoutException timeoutException) {
                    bl2 = true;
                    break block14;
                }
                catch (InterruptedException interruptedException) {
                    object2 = Thread.currentThread();
                    ((Thread)object2).interrupt();
                }
                while (true) {
                    n4 = object2.hasNext();
                    if (n4 == 0) break;
                    object3 = object2.next();
                    object3 = (m)object3;
                    long l2 = this.E;
                    ((m)object3).a(l2);
                    continue;
                    break;
                }
            }
            if ((object2 = this.U) == (object3 = this.V)) {
                object3.release();
                n3 = 0;
                object2 = null;
                this.V = null;
            }
        }
        this.U = object;
        if (bl2) {
            n3 = 3;
            object = new ExoTimeoutException(n3);
            n4 = 1003;
            object2 = new ExoPlaybackException(n7, (Throwable)object, n4);
            this.y((ExoPlaybackException)object2);
        }
    }

    public final void y(ExoPlaybackException exoPlaybackException) {
        int n3;
        long l2;
        Mt2 mt2 = this.u0;
        j$b j$b = mt2.b;
        mt2 = mt2.b(j$b);
        mt2.q = l2 = mt2.s;
        mt2.r = l2 = 0L;
        int n4 = 1;
        mt2 = mt2.g(n4);
        if (exoPlaybackException != null) {
            mt2 = mt2.e(exoPlaybackException);
        }
        this.H = n3 = this.H + n4;
        this.k.i.b(6).b();
        this.B(mt2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void z() {
        Object object;
        boolean bl2;
        SparseBooleanArray sparseBooleanArray;
        int n3;
        int n4;
        int n7 = 1;
        Object object2 = this.P;
        int n8 = gz3.a;
        Object object3 = this.f;
        boolean bl3 = object3.isPlayingAd();
        boolean bl4 = object3.isCurrentMediaItemSeekable();
        int n10 = object3.hasPreviousMediaItem();
        boolean bl5 = object3.hasNextMediaItem();
        boolean bl6 = object3.isCurrentMediaItemLive();
        boolean bl7 = object3.isCurrentMediaItemDynamic();
        object3 = object3.getCurrentTimeline();
        n8 = (int)(((androidx.media3.common.g)object3).q() ? 1 : 0);
        f$a$a f$a$a = new f$a$a();
        c c2 = this.c.a;
        c$a c$a = f$a$a.a;
        c$a.getClass();
        for (n4 = 0; n4 < (n3 = (sparseBooleanArray = c2.a).size()); n4 += n7) {
            n3 = c2.a(n4);
            c$a.a(n3);
        }
        boolean bl8 = bl3 ^ true;
        n4 = 4;
        f$a$a.a(n4, bl8);
        n4 = bl4 && !bl3 ? 1 : 0;
        n3 = 5;
        f$a$a.a(n3, n4 != 0);
        n4 = n10 != 0 && !bl3 ? 1 : 0;
        n3 = 6;
        f$a$a.a(n3, n4 != 0);
        n10 = n8 == 0 && (n10 != 0 || !bl6 || bl4) && !bl3 ? 1 : 0;
        n4 = 7;
        f$a$a.a(n4, n10 != 0);
        n10 = bl5 && !bl3 ? 1 : 0;
        n4 = 8;
        f$a$a.a(n4, n10 != 0);
        if (n8 == 0 && (bl5 || bl6 && bl7) && !bl3) {
            n8 = 1;
        } else {
            n8 = 0;
            object3 = null;
        }
        n10 = 9;
        f$a$a.a(n10, n8 != 0);
        n8 = 10;
        f$a$a.a(n8, bl8);
        if (bl4 && !bl3) {
            n8 = 1;
        } else {
            n8 = 0;
            object3 = null;
        }
        n10 = 11;
        f$a$a.a(n10, n8 != 0);
        if (!bl4 || bl3) {
            bl2 = false;
            object = null;
        }
        n8 = 12;
        f$a$a.a(n8, bl2);
        object3 = c$a.b();
        object = new f$a((c)object3);
        this.P = object;
        boolean bl9 = ((f$a)object).equals(object2);
        if (!bl9) {
            object = new pg2_1(this);
            object2 = this.l;
            n8 = 13;
            ((vv1_0)object2).c(n8, (vv1$a)object);
        }
    }
}

