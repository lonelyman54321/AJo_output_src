/*
 * Decompiled with CFR 0.152.
 */
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class lJ$b {
    public final kj2_2 a;
    public final jJ b;
    public final Date c;
    public final String d;
    public final Date e;
    public final String f;
    public final Date g;
    public final long h;
    public final long i;
    public final String j;
    public final int k;

    public lJ$b(kj2_2 kj2_22, jJ object) {
        int n3;
        int n4 = 1;
        this.a = kj2_22;
        this.b = object;
        this.k = n3 = -1;
        if (object != null) {
            long l2;
            this.h = l2 = ((jJ)object).c;
            this.i = l2 = ((jJ)object).d;
            object = ((jJ)object).f;
            int n7 = ((m41_0)object).size();
            for (int i3 = 0; i3 < n7; i3 += n4) {
                Object object2 = ((m41_0)object).c(i3);
                Object object3 = "Date";
                boolean bl2 = kotlin.text.b.i((String)object2, (String)object3, n4 != 0);
                Date date = null;
                String string2 = "name";
                if (bl2) {
                    Intrinsics.checkNotNullParameter(object3, string2);
                    object2 = ((m41_0)object).a((String)object3);
                    if (object2 != null) {
                        date = mi0_2.a((String)object2);
                    }
                    this.c = date;
                    object2 = ((m41_0)object).g(i3);
                    this.d = object2;
                    continue;
                }
                object3 = "Expires";
                bl2 = kotlin.text.b.i((String)object2, (String)object3, n4 != 0);
                if (bl2) {
                    Intrinsics.checkNotNullParameter(object3, string2);
                    object2 = ((m41_0)object).a((String)object3);
                    if (object2 != null) {
                        date = mi0_2.a((String)object2);
                    }
                    this.g = date;
                    continue;
                }
                object3 = "Last-Modified";
                bl2 = kotlin.text.b.i((String)object2, (String)object3, n4 != 0);
                if (bl2) {
                    Intrinsics.checkNotNullParameter(object3, string2);
                    object2 = ((m41_0)object).a((String)object3);
                    if (object2 != null) {
                        date = mi0_2.a((String)object2);
                    }
                    this.e = date;
                    object2 = ((m41_0)object).g(i3);
                    this.f = object2;
                    continue;
                }
                object3 = "ETag";
                boolean bl3 = kotlin.text.b.i((String)object2, (String)object3, n4 != 0);
                if (bl3) {
                    object2 = ((m41_0)object).g(i3);
                    this.j = object2;
                    continue;
                }
                object3 = "Age";
                int n8 = kotlin.text.b.i((String)object2, (String)object3, n4 != 0);
                if (n8 == 0) continue;
                object2 = ((m41_0)object).g(i3);
                object3 = m.a;
                if ((object2 = StringsKt.l0((String)object2)) != null) {
                    long l3;
                    long l4 = (Long)object2;
                    long l7 = l4 - (l3 = Integer.MAX_VALUE);
                    Object object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object4 > 0) {
                        n8 = -1 >>> 1;
                    } else {
                        l3 = 0L;
                        long l8 = l4 - l3;
                        object4 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                        if (object4 < 0) {
                            n8 = 0;
                            object2 = null;
                        } else {
                            n8 = (int)l4;
                        }
                    }
                } else {
                    n8 = -1;
                }
                this.k = n8;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final lj_0 a() {
        block20: {
            block21: {
                block26: {
                    block19: {
                        block25: {
                            block23: {
                                block24: {
                                    block22: {
                                        var1_1 = this;
                                        var2_2 = this.a;
                                        var3_3 = 0;
                                        var4_4 = null;
                                        var5_5 = this.b;
                                        if (var5_5 == null) {
                                            var5_5 = new lj_0((kj2_2)var2_2, null);
                                            return var5_5;
                                        }
                                        var6_6 = var2_2.a;
                                        var7_7 = var6_6.j;
                                        if (var7_7 && !(var7_7 = var5_5.e)) {
                                            var5_5 = new lj_0((kj2_2)var2_2, null);
                                            return var5_5;
                                        }
                                        var6_6 = var5_5.a;
                                        var8_8 = (ti_1)var6_6.getValue();
                                        var9_9 = var2_2.a();
                                        var10_10 = var9_9.b;
                                        if (var10_10) break block20;
                                        var9_9 = (ti_1)var6_6.getValue();
                                        var10_10 = var9_9.b;
                                        if (var10_10 || (var10_10 = Intrinsics.areEqual(var9_9 = var5_5.f.a("Vary"), var11_11 = "*"))) break block20;
                                        var9_9 = var2_2.a();
                                        var12_12 = var9_9.a;
                                        if (var12_12 || (var13_13 = var2_2.b((String)(var11_11 = "If-Modified-Since"))) != null || (var14_14 = var2_2.b(var13_13 = "If-None-Match")) != null) break block21;
                                        var15_15 = var1_1.i;
                                        var17_16 = var1_1.c;
                                        var18_17 = 0L;
                                        if (var17_16 != null) {
                                            var20_18 = var17_16.getTime();
                                            var20_18 = var15_15 - var20_18;
                                            var20_18 = Math.max(var18_17, var20_18);
                                        } else {
                                            var20_18 = var18_17;
                                        }
                                        var3_3 = var1_1.k;
                                        var22_19 = -1;
                                        if (var3_3 != var22_19) {
                                            var23_20 = TimeUnit.SECONDS;
                                            var24_21 = var11_11;
                                            var25_22 = var13_13;
                                            var26_23 = var3_3;
                                            var26_23 = var23_20.toMillis(var26_23);
                                            var20_18 = Math.max(var20_18, var26_23);
                                        } else {
                                            var24_21 = var11_11;
                                            var25_22 = var13_13;
                                        }
                                        var26_23 = var1_1.h;
                                        var28_24 = var15_15 - var26_23;
                                        var30_25 = ((Number)zn3.a.invoke()).longValue() - var15_15;
                                        var20_18 = var20_18 + var28_24 + var30_25;
                                        Intrinsics.checkNotNull(var5_5);
                                        var4_4 = (ti_1)var6_6.getValue();
                                        var3_3 = var4_4.c;
                                        var6_6 = var1_1.e;
                                        if (var3_3 == var22_19) break block22;
                                        var11_11 = TimeUnit.SECONDS;
                                        var32_26 = var3_3;
                                        var26_23 = var11_11.toMillis(var32_26);
                                        break block23;
                                    }
                                    var4_4 = var1_1.g;
                                    if (var4_4 == null) break block24;
                                    if (var17_16 != null) {
                                        var15_15 = var17_16.getTime();
                                    }
                                    if ((var3_3 = (int)((cfr_temp_0 = (var26_23 = var4_4.getTime() - var15_15) - (var15_15 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) <= 0) ** GOTO lbl-1000
                                    break block23;
                                }
                                if (var6_6 == null || (var4_4 = var2_2.a.h()) != null) ** GOTO lbl-1000
                                if (var17_16 != null) {
                                    var26_23 = var17_16.getTime();
                                }
                                Intrinsics.checkNotNull(var6_6);
                                var15_15 = var6_6.getTime();
                                var26_23 -= var15_15;
                                var15_15 = 0L;
                                var3_3 = (int)(var26_23 == var15_15 ? 0 : (var26_23 < var15_15 ? -1 : 1));
                                if (var3_3 > 0) {
                                    var3_3 = 10;
                                    var15_15 = var3_3;
                                    var26_23 /= var15_15;
                                } else lbl-1000:
                                // 3 sources

                                {
                                    var26_23 = 0L;
                                }
                            }
                            var3_3 = var9_9.c;
                            if (var3_3 != var22_19) {
                                var14_14 = TimeUnit.SECONDS;
                                var18_17 = var3_3;
                                var18_17 = var14_14.toMillis(var18_17);
                                var26_23 = Math.min(var26_23, var18_17);
                            }
                            if ((var3_3 = var9_9.i) != (var34_27 = -1)) {
                                var35_28 = TimeUnit.SECONDS;
                                var18_17 = var3_3;
                                var18_17 = var35_28.toMillis(var18_17);
                            } else {
                                var18_17 = 0L;
                            }
                            var3_3 = (int)var8_8.g;
                            if (var3_3 == 0 && (var3_3 = var9_9.h) != var34_27) {
                                var9_9 = TimeUnit.SECONDS;
                                var15_15 = var3_3;
                                var36_29 = var15_15 = var9_9.toMillis(var15_15);
                            } else {
                                var36_29 = 0L;
                            }
                            var3_3 = (int)var8_8.a;
                            if (var3_3 == 0 && (var3_3 = (int)((cfr_temp_1 = (var20_18 += var18_17) - (var26_23 += var36_29)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) < 0) {
                                var2_2 = new lj_0(null, (jJ)var5_5);
                                return var2_2;
                            }
                            var4_4 = var1_1.j;
                            if (var4_4 == null) break block25;
                            Intrinsics.checkNotNull(var4_4);
                            var11_11 = var25_22;
                            break block19;
                        }
                        if (var6_6 != null) {
                            var4_4 = var1_1.f;
                            Intrinsics.checkNotNull(var4_4);
lbl114:
                            // 2 sources

                            while (true) {
                                var11_11 = var24_21;
                                break block19;
                                break;
                            }
                        }
                        if (var17_16 != null) {
                            var4_4 = var1_1.d;
                            Intrinsics.checkNotNull(var4_4);
                            ** continue;
                        }
                        break block26;
                    }
                    var2_2 = var2_2.c();
                    var2_2.a((String)var11_11, (String)var4_4);
                    var2_2 = var2_2.b();
                    var4_4 = new lj_0((kj2_2)var2_2, (jJ)var5_5);
                    return var4_4;
                }
                var4_4 = new lj_0((kj2_2)var2_2, null);
                return var4_4;
            }
            var4_4 = new lj_0((kj2_2)var2_2, null);
            return var4_4;
        }
        var4_4 = new lj_0((kj2_2)var2_2, null);
        return var4_4;
    }
}

