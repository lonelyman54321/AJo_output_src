/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

public final class E0$a
extends qg3_2
implements Function2 {
    public Ey2$b a;
    public int b;
    public final /* synthetic */ B0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ wr1_1 e;

    public E0$a(B0 b02, long l2, wr1_1 wr1_12, f80_0 f80_02) {
        this.c = b02;
        this.d = l2;
        this.e = wr1_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        long l2 = this.d;
        wr1_1 wr1_12 = this.e;
        B0 b02 = this.c;
        object = new E0$a(b02, l2, wr1_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (E0$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((E0$a)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block34: {
            block32: {
                block33: {
                    block28: {
                        block29: {
                            block30: {
                                block31: {
                                    var2_2 = this;
                                    var3_3 = 1;
                                    var4_4 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                    var5_5 = this.b;
                                    var6_6 = this.c;
                                    var7_7 = 2;
                                    if (var5_5 == 0) break block29;
                                    if (var5_5 == var3_3) break block30;
                                    if (var5_5 != var7_7) break block31;
                                    var8_8 = this.a;
                                    vl2_2.b(var1_1);
                                    break block32;
                                }
                                var8_9 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var8_9;
                            }
                            vl2_2.b(var1_1);
                            break block33;
                        }
                        vl2_2.b(var1_1);
                        var6_6.getClass();
                        var9_11 = new Ref$BooleanRef();
                        var10_12 = ut2_1.p;
                        var11_13 = new ev_0((Ref$BooleanRef)var9_11);
                        var12_14 = var6_6.a;
                        var13_15 = var12_14.m;
                        if (!var13_15) break block34;
                        var12_14 = var12_14.e;
                        var14_16 = go0.f(var6_6);
                        block0: while (var14_16 != null) {
                            var15_17 = var14_16.y.e;
                            var16_18 = var15_17.d;
                            var17_19 = 262144;
                            if ((var16_18 &= var17_19) != 0) {
                                while (var12_14 != null) {
                                    var16_18 = var12_14.c & var17_19;
                                    if (var16_18 != 0) {
                                        var15_17 = var12_14;
                                        var18_20 = null;
                                        while (var15_17 != null) {
                                            var19_21 = var15_17 instanceof yr3_0;
                                            if (var19_21 != 0) {
                                                var20_22 = (var15_17 = (yr3_0)var15_17).v();
                                                var19_21 = (int)Intrinsics.areEqual(var10_12, var20_22);
                                                if (var19_21 != 0) {
                                                    var15_17 = (Boolean)var11_13.invoke(var15_17);
                                                    var16_18 = (int)var15_17.booleanValue();
                                                } else {
                                                    var16_18 = 1;
                                                }
                                                if (var16_18 == 0) {
                                                    break block0;
                                                }
                                            } else {
                                                var19_21 = ((LP1$c)var15_17).c & var17_19;
                                                if (var19_21 != 0) {
                                                    var19_21 = 1;
                                                } else {
                                                    var19_21 = 0;
                                                    var20_22 = null;
                                                }
                                                if (var19_21 != 0 && (var19_21 = var15_17 instanceof mo0_0) != 0) {
                                                    var20_22 = var15_17;
                                                    var20_22 = ((mo0_0)var15_17).o;
                                                    var21_23 = 0;
                                                    while (var20_22 != null) {
                                                        var22_24 = var20_22.c & var17_19;
                                                        if (var22_24 != 0) {
                                                            var22_24 = 1;
                                                        } else {
                                                            var22_24 = 0;
                                                            var23_25 = null;
                                                        }
                                                        if (var22_24 != 0) {
                                                            if ((var21_23 += var3_3) == var3_3) {
                                                                var15_17 = var20_22;
                                                            } else {
                                                                if (var18_20 == null) {
                                                                    var22_24 = 16;
                                                                    var23_25 = new LP1$c[var22_24];
                                                                    var18_20 = new WR1(var23_25);
                                                                }
                                                                if (var15_17 != null) {
                                                                    var18_20.b(var15_17);
                                                                    var16_18 = 0;
                                                                    var15_17 = null;
                                                                }
                                                                var18_20.b(var20_22);
                                                            }
                                                        }
                                                        var20_22 = var20_22.f;
                                                    }
                                                    if (var21_23 == var3_3) continue;
                                                }
                                            }
                                            var15_17 = go0.b(var18_20);
                                        }
                                    }
                                    var12_14 = var12_14.e;
                                }
                            }
                            if ((var14_16 = var14_16.A()) != null && (var12_14 = var14_16.y) != null) {
                                var12_14 = var12_14.d;
                                continue;
                            }
                            var12_14 = null;
                        }
                        if ((var5_5 = (int)var9_11.element) != 0) ** GOTO lbl-1000
                        var5_5 = JV.b;
                        for (var9_11 = ho0_0.a(var6_6).getParent(); var9_11 != null && (var24_26 = var9_11 instanceof ViewGroup); var9_11 = var9_11.getParent()) {
                            var24_26 = (var9_11 = (ViewGroup)var9_11).shouldDelayChildPressedState();
                            if (!var24_26) continue;
                            var5_5 = 1;
                            break block28;
                        }
                        var5_5 = 0;
                        var9_11 = null;
                    }
                    if (var5_5 == 0) {
                        var21_23 = 0;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var21_23 = 1;
                    }
                    if (var21_23 != 0) {
                        var25_27 = JV.a;
                        var2_2.b = var3_3;
                        var8_8 = bo0_2.a(var25_27, var2_2);
                        if (var8_8 == var4_4 /* !! */ ) {
                            return var4_4 /* !! */ ;
                        }
                    }
                }
                var25_27 = var2_2.d;
                var8_8 = new Ey2$b(var25_27);
                var2_2.a = var8_8;
                var2_2.b = var7_7;
                var9_11 = var2_2.e.a((kj1)var8_8, var2_2);
                if (var9_11 == var4_4 /* !! */ ) {
                    return var4_4 /* !! */ ;
                }
            }
            var6_6.z = var8_8;
            return Unit.a;
        }
        var4_4 /* !! */  = "visitAncestors called on an unattached node".toString();
        var8_10 = new IllegalStateException((String)var4_4 /* !! */ );
        throw var8_10;
    }
}

