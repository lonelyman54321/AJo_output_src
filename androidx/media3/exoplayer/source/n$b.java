/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.d;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.source.f;
import androidx.media3.exoplayer.source.f$a;
import androidx.media3.exoplayer.source.m;
import androidx.media3.exoplayer.source.n;
import androidx.media3.exoplayer.source.n$e;
import androidx.media3.exoplayer.upstream.Loader$c;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

public final class n$b
implements Loader$c,
f$a {
    public final long a;
    public final Uri b;
    public final yc3 c;
    public final m d;
    public final gi0_0 e;
    public final f40 f;
    public final Pw2 g;
    public volatile boolean h;
    public boolean i;
    public long j;
    public ti0_1 k;
    public wp3 l;
    public boolean m;
    public final /* synthetic */ n n;

    public n$b(n object, Uri uri, DataSource dataSource, m m2, gi0_0 gi0_02, f40 f402) {
        long l2;
        this.n = object;
        this.b = uri;
        this.c = object = new yc3(dataSource);
        this.d = m2;
        this.e = gi0_02;
        this.f = f402;
        this.g = object = new Object();
        this.i = true;
        this.a = l2 = Iv1.b.getAndIncrement();
        this.k = object = this.c(0L);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        block33: {
            var1_1 = this;
            var2_2 /* !! */  = false;
            var3_3 = null;
            var4_5 = 0;
            var5_6 = null;
            while (var4_5 == 0) {
                block32: {
                    block29: {
                        block31: {
                            block30: {
                                var6_7 = var1_1.h;
                                if (var6_7 != false) return;
                                var7_8 = -1;
                                var9_9 = 1;
                                try {
                                    var10_10 = var1_1.g;
                                    var11_11 = var10_10.a;
                                    var1_1.k = var10_10 = var1_1.c(var11_11);
                                    var13_12 = var1_1.c;
                                    var14_13 = var13_12.a((ti0_1)var10_10);
                                    var16_14 /* !! */  = var1_1.h;
                                    if (var16_14 /* !! */  == 0) break block29;
                                    if (var4_5 != var9_9) break block30;
                                    break block31;
                                }
                                catch (Throwable var3_4) {
                                    ** GOTO lbl109
                                }
                            }
                            var3_3 = (fe_0)var1_1.d;
                            var17_15 = var3_3.a();
                            cfr_temp_0 = var17_15 - var7_8;
                            var2_2 /* !! */  = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                            if (var2_2 /* !! */ ) {
                                var3_3 = var1_1.g;
                                var5_6 = (fe_0)var1_1.d;
                                var3_3.a = var19_28 = var5_6.a();
                            }
                        }
                        var3_3 = var1_1.c;
                        if (var3_3 == null) return;
                        var3_3.close();
                        return;
                    }
                    var16_14 /* !! */  = (int)(var14_13 == var7_8 ? 0 : (var14_13 < var7_8 ? -1 : 1));
                    if (var16_14 /* !! */  != 0) {
                        var14_13 += var11_11;
                        var21_16 = var1_1.n;
                        var22_17 = var21_16.r;
                        var24_19 = null;
                        var23_18 = new wB2(var21_16, 0);
                        var22_17.post((Runnable)var23_18);
                    }
                    var25_20 = var14_13;
                    var10_10 = var1_1.n;
                    var13_12 = var1_1.c;
                    var13_12 = var13_12.a;
                    var13_12 = var13_12.c();
                    var10_10.t = var13_12 = IcyHeaders.a((Map)var13_12);
                    var10_10 = var1_1.c;
                    var13_12 = var1_1.n;
                    var13_12 = var13_12.t;
                    if (var13_12 != null && (var27_21 = var13_12.f) != (var16_14 /* !! */  = -1)) {
                        var21_16 = new f((DataSource)var10_10, var27_21, var1_1);
                        var10_10 = var1_1.n;
                        var10_10.getClass();
                        var13_12 = new n$e(0, (boolean)var9_9);
                        var1_1.l = var10_10 = var10_10.z((n$e)var13_12);
                        var13_12 = androidx.media3.exoplayer.source.n.R;
                        var10_10.d((d)var13_12);
                    } else {
                        var21_16 = var10_10;
                    }
                    var10_10 = var1_1.d;
                    var22_17 = var1_1.b;
                    var13_12 = var1_1.c;
                    var13_12 = var13_12.a;
                    var23_18 = var13_12.c();
                    var24_19 = var1_1.e;
                    var13_12 = var10_10;
                    var13_12 = (fe_0)var10_10;
                    var10_10 = var24_19;
                    var28_22 = var11_11;
                    var7_8 = var11_11;
                    var11_11 = var25_20;
                    var13_12.b((DataSource)var21_16, (Uri)var22_17, (Map)var23_18, var28_22, var25_20, var24_19);
                    var10_10 = var1_1.n;
                    var10_10 = var10_10.t;
                    if (var10_10 == null) ** GOTO lbl90
                    var10_10 = var1_1.d;
                    var10_10 = (fe_0)var10_10;
                    var10_10 = var10_10.b;
                    if (var10_10 == null || (var27_21 = (var10_10 = var10_10.e()) instanceof yq1_1) == 0) ** GOTO lbl90
                    {
                        var10_10 = (yq1_1)var10_10;
                        var10_10.s = var9_9;
lbl90:
                        // 3 sources

                        if ((var30_23 = (long)var1_1.i) != false) {
                            var10_10 = var1_1.d;
                            var31_24 = var1_1.j;
                            var10_10 = (fe_0)var10_10;
                            var10_10 = var10_10.b;
                            var10_10.getClass();
                            var10_10.c(var7_8, var31_24);
                            var1_1.i = false;
                        }
lbl99:
                        // 4 sources

                        while (true) {
                            var11_11 = var7_8;
lbl101:
                            // 2 sources

                            while (var4_5 == 0 && !(var6_7 = var1_1.h)) {
                                var33_25 = var1_1.f;
                                var33_25.a();
                                var33_25 = var1_1.d;
                                var34_26 = var1_1.g;
                            }
                            break block32;
                            break;
                        }
lbl109:
                        // 1 sources

                        if (var4_5 != var9_9 && (var30_23 = (cfr_temp_1 = (var19_29 = (var5_6 = (fe_0)var1_1.d).a()) - (var35_27 = (long)-1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) != false) {
                            var5_6 = var1_1.g;
                            var33_25 = (fe_0)var1_1.d;
                            var5_6.a = var7_8 = var33_25.a();
                        }
                        if ((var5_6 = var1_1.c) == null) throw var3_4;
                        var5_6.close();
                        throw var3_4;
                        catch (IOException v0) {}
                        return;
                        catch (InterruptedException v1) {
                            break block33;
                        }
                        var33_25 = (fe_0)var33_25;
                        var10_10 = var33_25.b;
                        var10_10.getClass();
                        var33_25 = var33_25.c;
                        var33_25.getClass();
                        var4_5 = var10_10.a((fi0_0)var33_25, (Pw2)var34_26);
                        var33_25 = var1_1.d;
                        var33_25 = (fe_0)var33_25;
                        var7_8 = var33_25.a();
                        var10_10 = var1_1.n;
                        var14_13 = var10_10.j + var11_11;
                        cfr_temp_2 = var7_8 - var14_13;
                        var16_14 /* !! */  = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                        if (var16_14 /* !! */  <= 0) ** GOTO lbl101
                        var10_10 = var1_1.f;
                        synchronized (var10_10) {
                            var10_10.a = false;
                        }
                    }
                    {
                        var10_10 = var1_1.n;
                        var13_12 = var10_10.r;
                        var10_10 = var10_10.q;
                        var13_12.post((Runnable)var10_10);
                        ** continue;
                    }
                }
                if (var4_5 == var9_9) {
                    var4_5 = 0;
                    var5_6 = null;
                } else {
                    var33_25 = (fe_0)var1_1.d;
                    var7_8 = var33_25.a();
                    cfr_temp_3 = var7_8 - (var17_15 = (long)-1);
                    var27_21 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                    if (var27_21 != 0) {
                        var33_25 = var1_1.g;
                        var34_26 = (fe_0)var1_1.d;
                        var33_25.a = var35_27 = var34_26.a();
                    }
                }
                if ((var33_25 = var1_1.c) == null) continue;
                try {
                    var33_25.close();
                }
                catch (IOException v2) {}
            }
            return;
        }
        var3_3 = new InterruptedIOException();
        throw var3_3;
        catch (IOException v3) {
            throw var3_4;
        }
    }

    public final void b() {
        this.h = true;
    }

    public final ti0_1 c(long l2) {
        Collections.emptyMap();
        String string2 = this.n.i;
        Map map2 = androidx.media3.exoplayer.source.n.Q;
        Uri uri = this.b;
        ct3.i(uri, "The uri must be set.");
        ti0_1 ti0_12 = new ti0_1(uri, 0L, 1, null, map2, l2, -1, string2, 6, null);
        return ti0_12;
    }
}

