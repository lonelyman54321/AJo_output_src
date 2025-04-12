/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Za1
 */
public final class za1_1 {
    public static final Set a;
    public static final ux1_2 b;
    public static final eb0_2 c;
    public static final nv_2 d;

    static {
        int n3 = 1;
        Object object = new pa1_0[2];
        Object object2 = pa1_0.b;
        object[0] = object2;
        object2 = pa1_0.d;
        object[n3] = object2;
        a = p03_0.f(object);
        b = Q93.a("io.ktor.client.plugins.HttpRedirect");
        c = object = new Object();
        object = Za1$a.a;
        object2 = new ot0_1(n3);
        d = td0_2.a("HttpRedirect", (Function0)object, (Function1)object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(dZ2$a var0, db1_2 var1_1, ea1_2 var2_2, da1_2 var3_3, f80_0 var4_4) {
        block15: {
            block13: {
                block14: {
                    var5_5 /* !! */  = var4_4;
                    var6_6 = var4_4 instanceof ab1_2;
                    if (!var6_6) ** GOTO lbl-1000
                    var7_7 = var4_4;
                    var7_7 = (ab1_2)var4_4;
                    var8_8 = var7_7.k;
                    var9_9 = -1 << -1;
                    var10_10 = var8_8 & var9_9;
                    if (var10_10 != 0) {
                        var7_7.k = var8_8 -= var9_9;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var7_7 = new h80_0((f80_0)var5_5 /* !! */ );
                    }
                    var5_5 /* !! */  = var7_7.j;
                    var11_11 = j90_0.COROUTINE_SUSPENDED;
                    var9_9 = var7_7.k;
                    var10_10 = 1;
                    if (var9_9 == 0) break block13;
                    if (var9_9 != var10_10) break block14;
                    var9_9 = (int)var7_7.i;
                    var12_12 = var7_7.h;
                    var13_13 = var7_7.g;
                    var14_14 = var7_7.f;
                    var15_15 = var7_7.e;
                    var16_16 = var7_7.d;
                    var17_17 = var7_7.c;
                    var18_18 = var7_7.b;
                    var19_19 = var7_7.a;
                    vl2_2.b(var5_5 /* !! */ );
                    var20_20 = var7_7;
                    var7_7 = var17_17;
                    var17_17 = var14_14;
                    var14_14 = var13_13;
                    var13_13 = var18_18;
                    var18_18 = var15_15;
                    var21_21 = var9_9;
                    ** GOTO lbl186
                }
                var5_5 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var5_5 /* !! */ ;
            }
            vl2_2.b(var5_5 /* !! */ );
            var5_5 /* !! */  = var2_2.d().e();
            var22_22 = za1_1.b((ub1_2)var5_5 /* !! */ );
            if (var22_22) break block15;
            var5_5 /* !! */  = var2_2;
            ** GOTO lbl191
        }
        var5_5 /* !! */  = new Ref$ObjectRef();
        var20_20 = var2_2;
        var5_5 /* !! */ .element = var2_2;
        var12_12 = new Ref$ObjectRef();
        var13_13 = var1_1;
        var12_12.element = var1_1;
        var14_14 = var2_2.c().getUrl().j;
        var20_20 = var2_2.c().getUrl();
        var15_15 = "<this>";
        Intrinsics.checkNotNullParameter(var20_20, (String)var15_15);
        var16_16 = new StringBuilder();
        Intrinsics.checkNotNullParameter(var20_20, (String)var15_15);
        var17_17 = new StringBuilder();
        var18_18 = (String)var20_20.m.getValue();
        var19_19 = (String)var20_20.n.getValue();
        Intrinsics.checkNotNullParameter(var17_17, (String)var15_15);
        var23_23 = ':';
        if (var18_18 != null) {
            var17_17.append((String)var18_18);
            if (var19_19 != null) {
                var17_17.append(var23_23);
                var17_17.append((String)var19_19);
            }
            var18_18 = "@";
            var17_17.append((String)var18_18);
        }
        var17_17 = var17_17.toString();
        var16_16.append((String)var17_17);
        Intrinsics.checkNotNullParameter(var20_20, (String)var15_15);
        var24_24 = var20_20.b;
        var18_18 = var20_20.a;
        if (var24_24 != 0) {
            var19_19 = var20_20.j;
            var25_25 = var19_19.b;
            if (var24_24 != var25_25) {
                Intrinsics.checkNotNullParameter(var20_20, (String)var15_15);
                var20_20 = new StringBuilder();
                var20_20.append((String)var18_18);
                var20_20.append(var23_23);
                var15_15 = var24_24;
                if (var24_24 == 0) {
                    var21_21 = 0;
                    var15_15 = null;
                }
                var21_21 = var15_15 != null ? var15_15.intValue() : var19_19.b;
                var20_20.append(var21_21);
                var18_18 = var20_20.toString();
            }
        }
        var16_16.append((String)var18_18);
        var20_20 = var16_16.toString();
        var21_21 = 0;
        var15_15 = null;
        var17_17 = var12_12;
        var16_16 = var14_14;
        var12_12 = var5_5 /* !! */ ;
        var14_14 = var20_20;
        var5_5 /* !! */  = var0;
        var20_20 = var7_7;
        var7_7 = var3_3;
        while (true) {
            block19: {
                block17: {
                    block18: {
                        block16: {
                            var18_18 = var7_7.k;
                            var19_19 = ((ea1_2)var12_12.element).d();
                            var26_26 = za1_1.c;
                            var18_18.a((eb0_2)var26_26, var19_19);
                            var18_18 = ((ea1_2)var12_12.element).d().getHeaders();
                            var19_19 = ja1_1.a;
                            var18_18 = var18_18.get("Location");
                            var19_19 = Gn.a("Received redirect response to ", (String)var18_18, " for request ");
                            var26_26 = var13_13.a;
                            var19_19.append(var26_26);
                            var19_19 = var19_19.toString();
                            var26_26 = za1_1.b;
                            var26_26.g((String)var19_19);
                            var19_19 = new db1_2();
                            var27_27 = (db1_2)var17_17.element;
                            var19_19.b((db1_2)var27_27);
                            var27_27 = var19_19.a;
                            var28_28 = var27_27.j;
                            var28_28.clear();
                            if (var18_18 != null) {
                                hu3_0.b((eu3_0)var27_27, (String)var18_18);
                            }
                            var18_18 = var13_13.a;
                            if (var21_21 != 0 || !(var29_29 = ie3_1.d((iu3_0)var16_16)) || (var29_29 = ie3_1.d((iu3_0)(var28_28 = var27_27.c())))) break block16;
                            var5_5 /* !! */  = new StringBuilder("Can not redirect ");
                            var5_5 /* !! */ .append(var18_18);
                            var7_7 = " because of security downgrade";
                            var5_5 /* !! */ .append((String)var7_7);
                            var5_5 /* !! */  = var5_5 /* !! */ .toString();
                            var26_26.g((String)var5_5 /* !! */ );
                            var5_5 /* !! */  = var12_12.element;
                            break block17;
                        }
                        var25_25 = (int)Intrinsics.areEqual(var14_14, var27_27 = fu3_0.b((eu3_0)var27_27));
                        if (var25_25 == 0) {
                            var27_27 = var19_19.c;
                            var27_27.getClass();
                            var28_28 = "name";
                            var30_30 = "Authorization";
                            Intrinsics.checkNotNullParameter(var30_30, (String)var28_28);
                            var27_27.b.remove(var30_30);
                            var27_27 = "Removing Authorization header from redirect for ";
                            var30_30 = new StringBuilder((String)var27_27);
                            var30_30.append(var18_18);
                            var30_30 = var30_30.toString();
                            var26_26.g((String)var30_30);
                        }
                        var17_17.element = var19_19;
                        var20_20.a = var5_5 /* !! */ ;
                        var20_20.b = var13_13;
                        var20_20.c = var7_7;
                        var20_20.d = var12_12;
                        var20_20.e = var17_17;
                        var20_20.f = var16_16;
                        var20_20.g = var14_14;
                        var20_20.h = var12_12;
                        var20_20.i = var21_21;
                        var20_20.k = var10_10 = 1;
                        var18_18 = var5_5 /* !! */ .a.a((db1_2)var19_19, (f80_0)var20_20);
                        if (var18_18 != var11_11) break block18;
                        var5_5 /* !! */  = var11_11;
                        break block17;
                    }
                    var19_19 = var5_5 /* !! */ ;
                    var5_5 /* !! */  = var18_18;
                    var18_18 = var17_17;
                    var17_17 = var16_16;
                    var16_16 = var12_12;
lbl186:
                    // 2 sources

                    var12_12.element = var5_5 /* !! */ ;
                    var5_5 /* !! */  = ((ea1_2)var16_16.element).d().e();
                    var22_22 = za1_1.b((ub1_2)var5_5 /* !! */ );
                    if (var22_22) break block19;
                    var5_5 /* !! */  = var16_16.element;
                }
                return var5_5 /* !! */ ;
            }
            var12_12 = var16_16;
            var16_16 = var17_17;
            var17_17 = var18_18;
            var5_5 /* !! */  = var19_19;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean b(ub1_2 ub1_22) {
        int n3 = ub1_22.a;
        ub1_2 ub1_23 = ub1_2.c;
        ub1_23 = ub1_2.c;
        int n4 = ub1_23.a;
        if (n3 == n4) return 1 != 0;
        ub1_23 = ub1_2.d;
        n4 = ub1_23.a;
        if (n3 == n4) return 1 != 0;
        ub1_23 = ub1_2.f;
        n4 = ub1_23.a;
        if (n3 == n4) return 1 != 0;
        ub1_23 = ub1_2.g;
        n4 = ub1_23.a;
        if (n3 == n4) return 1 != 0;
        ub1_23 = ub1_2.e;
        n4 = ub1_23.a;
        if (n3 != n4) return 0 != 0;
        return 1 != 0;
    }
}

