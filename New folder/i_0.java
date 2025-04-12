/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from i
 */
public final class i_0 {
    public static final ff_2 a = ff$a_0.c("/");
    public static final ff_2 b = ff$a_0.c("\\");
    public static final ff_2 c = ff$a_0.c("/\\");
    public static final ff_2 d = ff$a_0.c(".");
    public static final ff_2 e = ff$a_0.c("..");

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final int a(hn2_2 comparable) {
        Object object = ((hn2_2)comparable).a;
        int n3 = ((ff_2)object).d();
        int n4 = -1;
        if (n3 == 0) return n4;
        comparable = ((hn2_2)comparable).a;
        n3 = 0;
        object = null;
        int n7 = ((ff_2)comparable).i(0);
        int n8 = 47;
        int n10 = 1;
        if (n7 == n8) {
            return 1;
        }
        n7 = ((ff_2)comparable).i(0);
        n8 = 92;
        int n14 = 2;
        if (n7 == n8) {
            n3 = ((ff_2)comparable).d();
            if (n3 <= n14) return 1;
            n3 = ((ff_2)comparable).i(n10);
            if (n3 != n8) return 1;
            object = b;
            String string2 = "other";
            Intrinsics.checkNotNullParameter(object, string2);
            object = ((ff_2)object).a;
            n3 = ((ff_2)comparable).f(n14, (byte[])object);
            if (n3 != n4) return n3;
            int n15 = ((ff_2)comparable).d();
            return n15;
        }
        n7 = ((ff_2)comparable).d();
        if (n7 <= n14) return n4;
        n7 = ((ff_2)comparable).i(n10);
        if (n7 != (n10 = 58)) return n4;
        n7 = ((ff_2)comparable).i(n14);
        if (n7 != n8) return n4;
        n3 = 97;
        char c2 = (char)((ff_2)comparable).i(0);
        if (n3 <= c2 && c2 < (n3 = 123)) return 3;
        n3 = 65;
        if (n3 > c2) return n4;
        n3 = 91;
        if (c2 >= n3) return n4;
        return 3;
    }

    public static final hn2_2 b(hn2_2 comparable, hn2_2 hn2_22, boolean bl2) {
        Intrinsics.checkNotNullParameter(comparable, "<this>");
        Object object = "child";
        Intrinsics.checkNotNullParameter(hn2_22, (String)object);
        hn2_22.getClass();
        int n3 = i_0.a(hn2_22);
        int n4 = -1;
        if (n3 != n4 || (object = hn2_22.g()) != null) {
            return hn2_22;
        }
        object = i_0.c(comparable);
        if (object == null && (object = i_0.c(hn2_22)) == null) {
            object = hn2_2.b;
            object = i_0.e();
        }
        ce_2 ce_22 = new ce_2();
        comparable = comparable.a;
        ce_22.P((ff_2)comparable);
        long l2 = ce_22.b;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 > 0) {
            ce_22.P((ff_2)object);
        }
        comparable = hn2_22.a;
        ce_22.P((ff_2)comparable);
        return i_0.d(ce_22, bl2);
    }

    public static final ff_2 c(hn2_2 comparable) {
        int n3;
        int n4;
        ff_2 ff_22 = comparable.a;
        ff_2 ff_23 = a;
        int n7 = ff_2.g(ff_22, ff_23);
        if (n7 == (n4 = -1) && (n3 = ff_2.g((ff_2)(comparable = comparable.a), ff_23 = b)) == n4) {
            ff_23 = null;
        }
        return ff_23;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final hn2_2 d(ce_2 var0, boolean var1_1) {
        var2_2 = var0;
        var3_3 = "<this>";
        Intrinsics.checkNotNullParameter(var0, (String)var3_3);
        var4_4 = new ce_2();
        var5_5 /* !! */  = 0;
        var6_6 = null;
        var7_7 = 0;
        var8_8 = 0;
        var9_9 = null;
        while (true) {
            block23: {
                block21: {
                    block22: {
                        block24: {
                            if ((var13_12 = var2_2.l(var11_11 = 0L, (ff_2)(var10_10 = i_0.a))) != 0 || (var14_13 = var2_2.l(var11_11, (ff_2)(var10_10 = i_0.b))) != 0) break block23;
                            var14_13 = 2;
                            var14_13 = var8_8 >= var14_13 && (var14_13 = (int)Intrinsics.areEqual(var6_6, var10_10)) != 0 ? 1 : 0;
                            var16_17 = i_0.c;
                            var17_18 = -1;
                            if (var14_13 == 0) break block24;
                            Intrinsics.checkNotNull(var6_6);
                            var4_4.P((ff_2)var6_6);
                            var4_4.P((ff_2)var6_6);
                            ** GOTO lbl25
                        }
                        if (var8_8 > 0) {
                            Intrinsics.checkNotNull(var6_6);
                            var4_4.P((ff_2)var6_6);
lbl25:
                            // 3 sources

                            while (true) {
                                var19_20 = var3_3;
                                break;
                            }
                        } else {
                            var20_19 = var2_2.E(var16_17);
                            if (var6_6 == null) {
                                var5_5 /* !! */  = (byte)(var20_19 == var17_18 ? 0 : (var20_19 < var17_18 ? -1 : 1));
                                if (var5_5 /* !! */  == 0) {
                                    var6_6 = hn2_2.b;
                                    var6_6 = i_0.e();
                                } else {
                                    var5_5 /* !! */  = var2_2.n(var20_19);
                                    var6_6 = i_0.f(var5_5 /* !! */ );
                                }
                            }
                            if ((var8_8 = (int)Intrinsics.areEqual(var6_6, var10_10)) == 0) ** continue;
                            var22_21 = var2_2.b;
                            var19_20 = var3_3;
                            var24_22 = 2;
                            cfr_temp_0 = var22_21 - var24_22;
                            var26_23 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                            if (var26_23 /* !! */  >= 0 && (var8_8 = (int)var2_2.n(var22_21 = 1L)) == (var13_12 = 58) && ((var13_12 = 97) <= (var8_8 = (int)((char)var2_2.n(var11_11))) && var8_8 < (var13_12 = 123) || (var13_12 = 65) <= var8_8 && var8_8 < (var13_12 = 91))) {
                                var8_8 = (int)(var20_19 == var24_22 ? 0 : (var20_19 < var24_22 ? -1 : 1));
                                if (var8_8 == 0) {
                                    var24_22 = 3;
                                    var4_4.s0((ce_2)var2_2, var24_22);
                                } else {
                                    var4_4.s0((ce_2)var2_2, var24_22);
                                }
                            }
                        }
                        var24_22 = var4_4.b;
                        var8_8 = (int)(var24_22 == var11_11 ? 0 : (var24_22 < var11_11 ? -1 : 1));
                        if (var8_8 > 0) {
                            var27_15 = 1;
                        } else {
                            var27_15 = 0;
                            var28_16 = null;
                        }
                        var3_3 = new ArrayList<ff_2>();
                        block2: while (true) {
                            var8_8 = (int)var0.g();
                            var10_10 = i_0.d;
                            if (var8_8 != 0) break block21;
                            var20_19 = var2_2.E(var16_17);
                            cfr_temp_1 = var20_19 - var17_18;
                            var8_8 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                            if (var8_8 == 0) {
                                var20_19 = var2_2.b;
                                var9_9 = var2_2.b0(var20_19);
                            } else {
                                var9_9 = var2_2.b0(var20_19);
                                var0.readByte();
                            }
                            var15_14 = i_0.e;
                            var29_24 = Intrinsics.areEqual(var9_9, var15_14);
                            if (!var29_24) break block22;
                            if (var27_15 != 0 && (var13_12 = (int)var3_3.isEmpty()) != 0) continue;
                            if (!var1_1 || var27_15 == 0 && ((var13_12 = (int)var3_3.isEmpty()) != 0 || (var13_12 = (int)Intrinsics.areEqual(var10_10 = CollectionsKt.S(var3_3), var15_14)) != 0)) break;
                            if (var14_13 != 0 && (var8_8 = var3_3.size()) == (var13_12 = 1)) continue;
                            var15_14 = var19_20;
                            Intrinsics.checkNotNullParameter(var3_3, (String)var19_20);
                            var8_8 = (int)var3_3.isEmpty();
                            if (var8_8 == 0) {
                                var8_8 = xx_2.h(var3_3);
                                var3_3.remove(var8_8);
                            }
lbl85:
                            // 6 sources

                            while (true) {
                                var19_20 = var15_14;
                                continue block2;
                                break;
                            }
                            break;
                        }
                        var15_14 = var19_20;
                        var3_3.add(var9_9);
                        ** GOTO lbl85
                    }
                    var15_14 = var19_20;
                    var13_12 = (int)Intrinsics.areEqual(var9_9, var10_10);
                    if (var13_12 != 0 || (var13_12 = (int)Intrinsics.areEqual(var9_9, var10_10 = ff_2.d)) != 0) ** GOTO lbl85
                    var3_3.add(var9_9);
                    ** continue;
                }
                var30_25 = var3_3.size();
                while (var7_7 < var30_25) {
                    if (var7_7 > 0) {
                        var4_4.P((ff_2)var6_6);
                    }
                    var28_16 = (ff_2)var3_3.get(var7_7);
                    var4_4.P(var28_16);
                    var27_15 = 1;
                    var7_7 += var27_15;
                }
                var31_26 = var4_4.b;
                cfr_temp_2 = var31_26 - var11_11;
                var33_27 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                if (var33_27 /* !! */  == false) {
                    var4_4.P((ff_2)var10_10);
                }
                var24_22 = var4_4.b;
                var28_16 = var4_4.b0(var24_22);
                var2_2 = new hn2_2(var28_16);
                return var2_2;
            }
            var15_14 = var3_3;
            var27_15 = var0.readByte();
            if (var6_6 == null) {
                var28_16 = i_0.f(var27_15);
                var6_6 = var28_16;
            }
            var27_15 = 1;
            var8_8 += var27_15;
            var3_3 = var15_14;
        }
    }

    public static final ff_2 e() {
        Object object;
        Object object2;
        block4: {
            block3: {
                boolean bl2;
                block2: {
                    object2 = hn2_2.b;
                    object = "/";
                    bl2 = Intrinsics.areEqual(object2, object);
                    if (!bl2) break block2;
                    object2 = a;
                    break block3;
                }
                object = "\\";
                bl2 = Intrinsics.areEqual(object2, object);
                if (!bl2) break block4;
                object2 = b;
            }
            return object2;
        }
        object2 = kp1_0.c("not a directory separator: ", (String)object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final ff_2 f(byte n3) {
        int n4 = 47;
        if (n3 == n4) return a;
        n4 = 92;
        if (n3 == n4) {
            return b;
        }
        String string2 = hj0_0.a(n3, "not a directory separator: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }
}

