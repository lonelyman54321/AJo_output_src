/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.Cache$CacheException;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.media3.datasource.cache.c;
import androidx.media3.datasource.d;
import java.io.File;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;

public final class a
implements DataSource {
    public final Cache a;
    public final DataSource b;
    public final yi3_0 c;
    public final DataSource d;
    public final ej_0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public Uri i;
    public ti0_1 j;
    public ti0_1 k;
    public DataSource l;
    public long m;
    public long n;
    public long o;
    public kJ p;
    public boolean q;
    public boolean r;
    public long s;

    public a(c object, DataSource dataSource, DataSource dataSource2, CacheDataSink cacheDataSink, int n3) {
        dj_1 dj_12 = ej_0.a;
        this.a = object;
        this.b = dataSource2;
        this.e = dj_12;
        object = null;
        this.f = false;
        int n4 = n3 & 2;
        if (n4 != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            dataSource2 = null;
        }
        this.g = n4;
        this.h = false;
        object = null;
        if (dataSource != null) {
            this.d = dataSource;
            if (cacheDataSink != null) {
                object = new yi3_0(dataSource, cacheDataSink);
            }
            this.c = object;
        } else {
            this.d = dataSource = androidx.media3.datasource.d.a;
            this.c = null;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a(ti0_1 var1_1) {
        block15: {
            block16: {
                var2_2 = this;
                var3_3 = var1_1;
                var4_5 = this.a;
                try {
                    var5_6 = this.e;
                    var5_6 = (dj_1)var5_6;
                    var5_6.getClass();
                    var5_6 = var1_1.h;
                    var6_7 = var1_1.f;
                    if (var5_6 == null) ** GOTO lbl-1000
                    ** GOTO lbl17
                }
                catch (Throwable var3_4) {
                    break block15;
                }
lbl-1000:
                // 1 sources

                {
                    var5_6 = var1_1.a;
                    var5_6 = var5_6.toString();
lbl17:
                    // 2 sources

                    var8_8 = var1_1.a();
                    var8_8.h = var5_6;
                    var2_2.j = var8_8 = var8_8.a();
                    var9_9 /* !! */  = var8_8.a;
                    var10_10 = var4_5.a((String)var5_6);
                    var10_10 = var10_10.b;
                    var11_11 = "exo_redir";
                    var10_10 = var10_10.get(var11_11);
                    var10_10 = (byte[])var10_10;
                    var11_11 = null;
                    if (var10_10 != null) {
                        var13_13 = StandardCharsets.UTF_8;
                        var12_12 = new String((byte[])var10_10, var13_13);
                    } else {
                        var12_12 = null;
                    }
                    if (var12_12 != null) {
                        var11_11 = Uri.parse((String)var12_12);
                    }
                    if (var11_11 != null) {
                        var9_9 /* !! */  = var11_11;
                    }
                    var2_2.i = var9_9 /* !! */ ;
                    var2_2.n = var6_7;
                    var14_14 = var2_2.g;
                    var10_10 = null;
                }
                var15_15 = -1;
                var17_16 = var3_3.g;
                if (var14_14 && (var19_17 /* !! */  = var2_2.q) != 0 || (var19_17 /* !! */  = var2_2.h) != 0 && (var19_17 /* !! */  = var17_16 == var15_15 ? 0 : (var17_16 < var15_15 ? -1 : 1)) == 0) {
                    var19_17 /* !! */  = 1;
                } else {
                    var19_17 /* !! */  = 0;
                    var3_3 = null;
                }
                var2_2.r = var19_17 /* !! */ ;
                var20_18 = 0L;
                if (var19_17 /* !! */  == 0) break block16;
                var2_2.o = var15_15;
                ** GOTO lbl63
            }
            var3_3 = var4_5.a((String)var5_6);
            var2_2.o = var22_19 = u60_0.a((W60)var3_3);
            var19_17 /* !! */  = (int)(var22_19 == var15_15 ? 0 : (var22_19 < var15_15 ? -1 : 1));
            if (var19_17 /* !! */  == 0) ** GOTO lbl63
            {
                var2_2.o = var22_19 -= var6_7;
                var19_17 /* !! */  = (int)(var22_19 == var20_18 ? 0 : (var22_19 < var20_18 ? -1 : 1));
                if (var19_17 /* !! */  < 0) {
                    var24_20 = 2008;
                    var3_3 = new DataSourceException(var24_20);
                    throw var3_3;
                }
lbl63:
                // 4 sources

                var19_17 /* !! */  = var17_16 == var15_15 ? 0 : (var17_16 < var15_15 ? -1 : 1);
                if (var19_17 /* !! */  != 0) {
                    var22_19 = var2_2.o;
                    cfr_temp_0 = var22_19 - var15_15;
                    var25_22 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    var22_19 = var25_22 /* !! */  == false ? var17_16 : Math.min(var22_19, var17_16);
                    var2_2.o = var22_19;
                }
                if ((var25_22 /* !! */  = (cfr_temp_1 = (var22_19 = var2_2.o) - var20_18) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) > 0 || (var25_22 /* !! */  = var22_19 == var15_15 ? 0 : (var22_19 < var15_15 ? -1 : 1)) == false) {
                    var2_2.m((ti0_1)var8_8, false);
                }
                if (var19_17 /* !! */  == 0) return var2_2.o;
                return var17_16;
            }
        }
        var26_23 = var2_2.l;
        var5_6 = var2_2.b;
        if (var26_23 != var5_6) {
            var24_21 = var3_4 instanceof Cache$CacheException;
            if (var24_21 == false) throw var3_4;
        }
        var2_2.q = var27_24 = true;
        throw var3_4;
    }

    public final Map c() {
        boolean bl2;
        Map map2 = this.l;
        DataSource dataSource = this.b;
        boolean bl3 = true;
        if (map2 == dataSource) {
            bl2 = true;
        } else {
            bl2 = false;
            map2 = null;
        }
        map2 = (bl2 ^= bl3) ? this.d.c() : Collections.emptyMap();
        return map2;
    }

    public final void close() {
        long l2;
        Object var1_1 = null;
        this.j = null;
        this.i = null;
        this.n = l2 = 0L;
        try {
            this.l();
            return;
        }
        catch (Throwable throwable) {
            boolean bl2;
            DataSource dataSource = this.l;
            DataSource dataSource2 = this.b;
            if (dataSource == dataSource2 || (bl2 = throwable instanceof Cache$CacheException)) {
                this.q = bl2 = true;
            }
            throw throwable;
        }
    }

    public final void g(Kq3 kq3) {
        kq3.getClass();
        this.b.g(kq3);
        this.d.g(kq3);
    }

    public final Uri k() {
        return this.i;
    }

    public final void l() {
        Cache cache = this.a;
        Object object = this.l;
        if (object == null) {
            return;
        }
        try {
            object.close();
            return;
        }
        finally {
            this.k = null;
            this.l = null;
            object = this.p;
            if (object != null) {
                cache.b((kJ)object);
                this.p = null;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void m(ti0_1 var1_1, boolean var2_2) {
        block38: {
            block37: {
                block36: {
                    var3_3 = this;
                    var4_4 = var1_1;
                    var5_6 = var1_1.h;
                    var6_7 = gz3.a;
                    var6_7 = (int)this.r;
                    if (var6_7 != 0) {
                        var6_7 = 0;
                        var7_8 = null;
                    } else {
                        var6_7 = (int)this.f;
                        if (var6_7 != 0) {
                            try {
                                var7_8 = this.a;
                            }
                            catch (InterruptedException v0) {
                                Thread.currentThread().interrupt();
                                var4_4 = new InterruptedIOException();
                                throw var4_4;
                            }
                            var8_9 = this.n;
                            var10_11 = this.o;
                            var12_12 = var5_6;
                            var7_8 = var7_8.f(var8_9, var5_6, var10_11);
                        } else {
                            var8_10 = this.n;
                            var10_11 = this.o;
                            var7_8 = this.a;
                            var12_12 = var5_6;
                            var7_8 = var7_8.c(var8_10, var5_6, var10_11);
                        }
                    }
                    var13_13 = var3_3.c;
                    var14_14 = var3_3.b;
                    var12_12 = var3_3.a;
                    var10_11 = -1;
                    var15_15 = var3_3.d;
                    if (var7_8 == null) {
                        var16_16 = var1_1.a();
                        var16_16.f = var17_17 = var3_3.n;
                        var16_16.g = var17_17 = var3_3.o;
                        var16_16 = var16_16.a();
                        var19_18 = var14_14;
                        var14_14 = var12_12;
                        var20_19 = var15_15;
                    } else {
                        var21_20 /* !! */  = var7_8.d;
                        var17_17 = var7_8.c;
                        if (var21_20 /* !! */ ) {
                            var16_16 = Uri.fromFile((File)var7_8.e);
                            var22_21 = var3_3.n;
                            var20_19 = var15_15;
                            var24_22 = var7_8.b;
                            var17_17 -= (var22_21 -= var24_22);
                            var19_18 = var14_14;
                            var26_23 = var12_12;
                            var27_24 = var3_3.o;
                            cfr_temp_0 = var27_24 - var10_11;
                            var29_26 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                            if (var29_26 /* !! */  != false) {
                                var17_17 = Math.min(var17_17, var27_24);
                            }
                            var14_14 = var1_1.a();
                            var14_14.a = var16_16;
                            var14_14.b = var24_22;
                            var14_14.f = var22_21;
                            var14_14.g = var17_17;
                            var16_16 = var14_14.a();
                            var15_15 = var19_18;
lbl67:
                            // 2 sources

                            while (true) {
                                var14_14 = var26_23;
                                break;
                            }
                        } else {
                            var19_18 = var14_14;
                            var26_23 = var12_12;
                            var20_19 = var15_15;
                            var30_28 /* !! */  = (long)(var17_17 == var10_11 ? 0 : (var17_17 < var10_11 ? -1 : 1));
                            if (var30_28 /* !! */  == false) {
                                var17_17 = var3_3.o;
                            } else {
                                var27_25 = var3_3.o;
                                cfr_temp_1 = var27_25 - var10_11;
                                var31_27 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                if (var31_27 /* !! */  != false) {
                                    var17_17 = Math.min(var17_17, var27_25);
                                }
                            }
                            var14_14 = var1_1.a();
                            var14_14.f = var24_22 = var3_3.n;
                            var14_14.g = var17_17;
                            var16_16 = var14_14.a();
                            if (var13_13 != null) {
                                var15_15 = var13_13;
                                ** continue;
                            }
                            var14_14 = var26_23;
                            var26_23.b((kJ)var7_8);
                            var15_15 = var20_19;
                            var6_7 = 0;
                            var7_8 = null;
                        }
                    }
                    var32_29 = var3_3.r;
                    if (var32_29) break block36;
                    var12_12 = var20_19;
                    if (var15_15 != var20_19) break block37;
                    var17_17 = var3_3.n;
                    var22_21 = 102400L;
                    var17_17 += var22_21;
                    break block38;
                }
                var12_12 = var20_19;
            }
            var17_17 = 0x7FFFFFFFFFFFFFFFL;
        }
        var3_3.s = var17_17;
        var33_30 = true;
        if (var2_2) {
            var34_31 = var3_3.l;
            if (var34_31 == var12_12) {
                var35_32 = true;
            } else {
                var35_32 = false;
                var34_31 = null;
            }
            ct3.f(var35_32);
            if (var15_15 == var12_12) {
                return;
            }
            try {
                this.l();
            }
            catch (Throwable var4_5) {
                var13_13 = var4_5;
                var36_33 = var7_8.d ^ var33_30;
                if (var36_33) {
                    var14_14.b((kJ)var7_8);
                }
                throw var13_13;
            }
        }
        if (var7_8 != null && (var32_29 = var7_8.d ^ var33_30)) {
            var3_3.p = var7_8;
        }
        var3_3.l = var15_15;
        var3_3.k = var16_16;
        var3_3.m = 0L;
        var37_35 = var15_15.a((ti0_1)var16_16);
        var7_8 = new X60();
        var12_12 = var15_15;
        var24_22 = var16_16.g;
        cfr_temp_2 = var24_22 - var10_11;
        var21_20 /* !! */  = cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
        if (!var21_20 /* !! */  && (var31_27 /* !! */  = var37_35 == var10_11 ? 0 : (var37_35 < var10_11 ? -1 : 1)) != false) {
            var3_3.o = var37_35;
            var10_11 = var3_3.n + var37_35;
            var39_36 = var10_11;
            var40_37 = "exo_len";
            var7_8.a(var39_36, (String)var40_37);
        }
        var39_36 = var3_3.l;
        var40_37 = var19_18;
        if (var39_36 == var19_18) {
            var31_27 /* !! */  = 1;
        } else {
            var31_27 /* !! */  = 0;
            var41_38 = null;
        }
        var42_39 = var31_27 /* !! */  ^ 1;
        if (var42_39 != 0) {
            var12_12 = var12_12.k();
            var3_3.i = var12_12;
            var4_4 = var4_4.a;
            var36_34 = var4_4.equals(var12_12) ^ var33_30;
            if (var36_34) {
                var41_38 = var3_3.i;
            } else {
                var31_27 /* !! */  = 0;
                var41_38 = null;
            }
            var4_4 = "exo_redir";
            if (var41_38 == null) {
                var7_8.b.add(var4_4);
                var12_12 = var7_8.a;
                var12_12.remove(var4_4);
            } else {
                var12_12 = var41_38.toString();
                var7_8.a(var12_12, (String)var4_4);
            }
        }
        if ((var4_4 = var3_3.l) == var13_13) {
            var14_14.g(var5_6, (X60)var7_8);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int read(byte[] var1_1, int var2_2, int var3_3) {
        block12: {
            block11: {
                var4_4 = this;
                var5_5 = var3_3;
                var6_6 = this.b;
                var7_7 = false;
                var8_8 = null;
                if (var3_3 == 0) {
                    return 0;
                }
                var9_9 = this.o;
                var11_10 = -1;
                var12_11 = 0L;
                cfr_temp_0 = var9_9 - var12_11;
                var14_12 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                if (var14_12 /* !! */  == false) {
                    return var11_10;
                }
                var15_13 = this.j;
                var15_13.getClass();
                var16_14 = this.k;
                var16_14.getClass();
                var14_12 /* !! */  = 1;
                try {
                    var17_15 = this.n;
                    var19_16 = this.s;
                    var21_17 = var17_15 == var19_16 ? 0 : (var17_15 < var19_16 ? -1 : 1);
                    if (var21_17 < 0) break block11;
                    this.m((ti0_1)var15_13, (boolean)var14_12 /* !! */ );
                }
                catch (Throwable var22_18) {
                    break block12;
                }
            }
            var23_20 = var4_4.l;
            var23_20.getClass();
            var24_21 = var23_20.read(var1_1, var2_2, var5_5);
            var25_22 = -1;
            if (var24_21 == var11_10) ** GOTO lbl48
            var27_23 = var4_4.n;
            var29_24 = var24_21;
            var4_4.n = var27_23 += var29_24;
            var4_4.m = var27_23 = var4_4.m + var29_24;
            var27_23 = var4_4.o;
            cfr_temp_1 = var27_23 - var25_22;
            var5_5 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
            if (var5_5 == 0) return var24_21;
            {
                var4_4.o = var27_23 -= var29_24;
                return var24_21;
lbl48:
                // 1 sources

                var32_27 = var4_4.l;
                var33_28 = var32_27 == var6_6 ? 1 : 0;
                if ((var33_28 ^= var14_12 /* !! */ ) == 0) ** GOTO lbl71
                var31_26 = var24_21;
            }
            {
                var34_29 = var16_14.g;
                cfr_temp_2 = var34_29 - var25_22;
                var36_30 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                if (var36_30 /* !! */  != false && (var36_30 /* !! */  = (cfr_temp_3 = (var25_22 = var4_4.m) - var34_29) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) >= 0) ** GOTO lbl72
                var22_19 = var15_13.h;
            }
            {
                var4_4.o = var12_11;
                var15_13 = var4_4.c;
                if (var32_27 == var15_13) {
                    var7_7 = true;
                }
                if (var7_7 == false) return var31_26;
            }
            {
                var8_8 = new X60();
                var9_9 = var4_4.n;
                var15_13 = var9_9;
                var16_14 = "exo_len";
                var8_8.a(var15_13, (String)var16_14);
                var15_13 = var4_4.a;
                var15_13.g(var22_19, (X60)var8_8);
                return var31_26;
lbl71:
                // 1 sources

                var31_26 = var24_21;
lbl72:
                // 2 sources

                if ((var14_12 /* !! */  = (cfr_temp_4 = (var29_25 = var4_4.o) - var12_11) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) <= 0) {
                    var12_11 = -1;
                    cfr_temp_5 = var29_25 - var12_11;
                    var14_12 /* !! */  = (long)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                    if (var14_12 /* !! */  != false) return var31_26;
                }
                this.l();
                var4_4.m((ti0_1)var15_13, false);
                return this.read(var1_1, var2_2, var3_3);
            }
        }
        var8_8 = var4_4.l;
        if (var8_8 != var6_6) {
            var37_31 = var22_18 instanceof Cache$CacheException;
            if (var37_31 == false) throw var22_18;
        }
        var4_4.q = var37_31 = true;
        throw var22_18;
    }
}

