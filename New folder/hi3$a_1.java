/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Hi3$a
 */
public final class hi3$a_1
extends rl2_2
implements Function2 {
    public Object b;
    public Object c;
    public Ref$ObjectRef d;
    public long e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ i90_0 h;
    public final /* synthetic */ gx0_2 i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ dy2_1 m;

    public hi3$a_1(i90_0 i90_02, gx0_2 gx0_22, Function1 function1, Function1 function12, Function1 function13, dy2_1 dy2_12, f80_0 f80_02) {
        this.h = i90_02;
        this.i = gx0_22;
        this.j = function1;
        this.k = function12;
        this.l = function13;
        this.m = dy2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Function1 function1 = this.l;
        dy2_1 dy2_12 = this.m;
        i90_0 i90_02 = this.h;
        gx0_2 gx0_22 = this.i;
        Function1 function12 = this.j;
        Function1 function13 = this.k;
        hi3$a_1 hi3$a_1 = new hi3$a_1(i90_02, gx0_22, function12, function13, function1, dy2_12, f80_02);
        hi3$a_1.g = object;
        return hi3$a_1;
    }

    public final Object invoke(Object object, Object object2) {
        object = (ru_0)object;
        object2 = (f80_0)object2;
        object = (hi3$a_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hi3$a_1)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        block44: {
            block40: {
                block45: {
                    block43: {
                        block46: {
                            block42: {
                                block41: {
                                    var2_2 = this;
                                    var3_3 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                    var4_4 = this.f;
                                    var5_5 = this.h;
                                    var6_6 = 3;
                                    var7_7 = 0;
                                    var8_8 = null;
                                    var9_9 = this.i;
                                    var10_10 = this.l;
                                    var11_11 = this.j;
                                    var12_12 = this.m;
                                    block7 : switch (var4_4) {
                                        default: {
                                            var3_3 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            throw var3_3 /* !! */ ;
                                        }
                                        case 6: {
                                            vl2_2.b(var1_1);
                                            var13_13 = var5_5;
                                            var4_4 = 0;
                                            var14_14 = null;
                                            var15_16 = var12_12;
                                            ** GOTO lbl246
                                        }
                                        case 5: {
                                            var14_15 = (aw2_0)this.c;
                                            var9_9 = (Ref$ObjectRef)this.b;
                                            var16_17 = (ru_0)this.g;
                                            try {
                                                vl2_2.b(var1_1);
                                                return Unit.a;
                                            }
                                            catch (PointerEventTimeoutCancellationException v0) {
                                                var13_13 = var5_5;
                                                var17_18 = var11_11;
                                                var15_16 = var12_12;
                                                break block40;
                                            }
                                        }
                                        case 4: {
                                            var18_19 = this.e;
                                            var14_15 = (Ref$ObjectRef)this.b;
                                            var20_21 = (ru_0)this.g;
                                            vl2_2.b(var1_1);
                                            var21_22 = var14_15;
                                            var22_23 = var20_21;
                                            var14_15 = var1_1;
                                            var23_24 = var18_19;
                                            break block45;
                                        }
                                        case 3: {
                                            var18_20 = this.e;
                                            var14_15 = (Ref$ObjectRef)this.b;
                                            var20_21 = (ru_0)this.g;
                                            vl2_2.b(var1_1);
                                            break block46;
                                        }
                                        case 2: {
                                            var18_20 = this.e;
                                            var14_15 = this.d;
                                            var20_21 = (Ref$ObjectRef)this.c;
                                            var25_25 = (aw2_0)this.b;
                                            var22_23 = (ru_0)this.g;
                                            try {
                                                vl2_2.b(var1_1);
                                                var21_22 = var22_23;
                                                var22_23 = var25_25;
                                                var25_25 = var20_21;
                                                var20_21 = var1_1;
                                                break block41;
                                            }
                                            catch (PointerEventTimeoutCancellationException v1) {
                                                var14_15 = var20_21;
lbl66:
                                                // 2 sources

                                                while (true) {
                                                    var20_21 = var22_23;
                                                    break block42;
                                                    break;
                                                }
                                            }
                                        }
                                        case 1: {
                                            var14_15 = (ru_0)this.g;
                                            vl2_2.b(var1_1);
                                            var16_17 = var1_1;
                                            while (true) {
                                                var22_23 = var14_15;
                                                break block7;
                                                break;
                                            }
                                        }
                                        case 0: {
                                            vl2_2.b(var1_1);
                                            this.g = var14_15 = (ru_0)this.g;
                                            this.f = var26_26 = 1;
                                            if ((var16_17 = Di3.c((ru_0)var14_15, this, var6_6)) != var3_3 /* !! */ ) ** continue;
                                            return var3_3 /* !! */ ;
                                        }
                                    }
                                    var25_25 = var16_17;
                                    var25_25 = (aw2_0)var16_17;
                                    var25_25.a();
                                    var14_15 = new Hi3$a$b(var12_12, null);
                                    Ae3.d((i90_0)var5_5, null, null, (Function2)var14_15, var6_6);
                                    var14_15 = Di3.a;
                                    if (var9_9 != var14_15) {
                                        var14_15 = new Hi3$a$c((gx0_2)var9_9, var12_12, (aw2_0)var25_25, null);
                                        Ae3.d((i90_0)var5_5, null, null, (Function2)var14_15, var6_6);
                                    }
                                    if (var11_11 != null) {
                                        var14_15 = var22_23.getViewConfiguration();
                                        var18_20 = var14_15.b();
                                    } else {
                                        var18_20 = 0x3FFFFFFFFFFFFFFFL;
                                    }
                                    var14_15 = new Ref$ObjectRef();
                                    try {
                                        var27_27 = 2;
                                        var20_21 = new rl2_2(var27_27, null);
                                        var2_2.g = var22_23;
                                        var2_2.b = var25_25;
                                        var2_2.c = var14_15;
                                        var2_2.d = var14_15;
                                        var2_2.e = var18_20;
                                        var2_2.f = var27_27;
                                        var20_21 = var22_23.u(var18_20, (Function2)var20_21, var2_2);
                                        if (var20_21 == var3_3 /* !! */ ) {
                                            return var3_3 /* !! */ ;
                                        }
                                        var21_22 = var22_23;
                                        var22_23 = var25_25;
                                        var25_25 = var14_15;
                                    }
                                    catch (PointerEventTimeoutCancellationException v2) {
                                        ** continue;
                                    }
                                }
                                try {
                                    var14_15.element = var20_21;
                                    var14_15 = var25_25.element;
                                    if (var14_15 == null) {
                                        var14_15 = new Hi3$a$e(var12_12, null);
                                        Ae3.d((i90_0)var5_5, null, null, (Function2)var14_15, var6_6);
                                        break block43;
                                    }
                                }
                                catch (PointerEventTimeoutCancellationException v3) {
                                    var14_15 = var25_25;
                                    var25_25 = var22_23;
                                    var20_21 = var21_22;
                                    break block42;
                                }
                                {
                                    var14_15 = (aw2_0)var14_15;
                                    var14_15.a();
                                    var14_15 = new Hi3$a$f(var12_12, null);
                                    Ae3.d((i90_0)var5_5, null, null, (Function2)var14_15, var6_6);
                                    break block43;
                                }
                            }
                            if (var11_11 != null) {
                                var28_28 = var25_25.c;
                                var21_22 = new e72(var28_28);
                                var11_11.invoke(var21_22);
                            }
                            var2_2.g = var20_21;
                            var2_2.b = var14_15;
                            var2_2.c = null;
                            var2_2.d = null;
                            var2_2.e = var18_20;
                            var2_2.f = var6_6;
                            var25_25 = Di3.a((ru_0)var20_21, var2_2);
                            if (var25_25 == var3_3 /* !! */ ) {
                                return var3_3 /* !! */ ;
                            }
                        }
                        var25_25 = new Hi3$a$g(var12_12, null);
                        Ae3.d((i90_0)var5_5, null, null, (Function2)var25_25, var6_6);
                        var25_25 = var14_15;
                        var21_22 = var20_21;
                    }
                    var14_15 = var25_25.element;
                    if (var14_15 == null) return Unit.a;
                    var20_21 = var2_2.k;
                    if (var20_21 == null) {
                        if (var10_10 == null) return Unit.a;
                        var14_15 = (aw2_0)var14_15;
                        var30_29 = var14_15.c;
                        var3_3 /* !! */  = new e72(var30_29);
                        var10_10.invoke((Object)var3_3 /* !! */ );
                        return Unit.a;
                    }
                    var14_15 = (aw2_0)var14_15;
                    var2_2.g = var21_22;
                    var2_2.b = var25_25;
                    var2_2.c = null;
                    var2_2.d = null;
                    var2_2.e = var18_20;
                    var2_2.f = var32_31 = 4;
                    var20_21 = Di3.a;
                    var20_21 = var21_22.getViewConfiguration();
                    var33_32 = var18_20;
                    var18_20 = var20_21.a();
                    var20_21 = new ei3_1((aw2_0)var14_15, null);
                    if ((var14_15 = var21_22.N0(var18_20, (ei3_1)var20_21, var2_2)) == var3_3 /* !! */ ) {
                        return var3_3 /* !! */ ;
                    }
                    var22_23 = var21_22;
                    var21_22 = var25_25;
                    var23_24 = var33_32;
                }
                var14_15 = (aw2_0)var14_15;
                if (var14_15 == null) {
                    if (var10_10 == null) return Unit.a;
                    var3_3 /* !! */  = (aw2_0)var21_22.element;
                    var35_33 = var3_3 /* !! */ .c;
                    var5_5 = new e72(var35_33);
                    var10_10.invoke(var5_5);
                    return Unit.a;
                }
                var16_17 = new Hi3$a$h(var12_12, null);
                Ae3.d((i90_0)var5_5, null, null, (Function2)var16_17, var6_6);
                var16_17 = Di3.a;
                if (var9_9 != var16_17) {
                    var16_17 = new Hi3$a$i((gx0_2)var9_9, var12_12, (aw2_0)var14_15, null);
                    Ae3.d((i90_0)var5_5, null, null, (Function2)var16_17, var6_6);
                }
                var37_34 = var2_2.h;
                var16_17 = var2_2.k;
                var38_35 = var2_2.l;
                var8_8 = var2_2.m;
                var13_13 = var16_17;
                var16_17 = var9_9;
                var17_18 = var11_11;
                var15_16 = var12_12;
                var20_21 = var13_13;
                var25_25 = var38_35;
                var38_35 = var22_23;
                var22_23 = var21_22;
                var13_13 = var5_5;
                var5_5 = var21_22;
                var21_22 = var8_8;
                break block44;
            }
lbl224:
            // 2 sources

            while (true) {
                if (var10_10 != null) {
                    var5_5 = (aw2_0)var9_9.element;
                    var39_36 = var5_5.c;
                    var8_8 = new e72(var39_36);
                    var10_10.invoke(var8_8);
                }
                if (var17_18 != null) {
                    var30_30 = var14_15.c;
                    var38_35 = new e72(var30_30);
                    var14_15 = var17_18;
                    var17_18.invoke(var38_35);
                }
                var4_4 = 0;
                var14_15 = null;
                var2_2.g = null;
                var2_2.b = null;
                var2_2.c = null;
                var2_2.f = var41_37 = 6;
                var5_5 = Di3.a((ru_0)var16_17, var2_2);
                if (var5_5 == var3_3 /* !! */ ) {
                    return var3_3 /* !! */ ;
                }
lbl246:
                // 3 sources

                var5_5 = var15_16;
                var3_3 /* !! */  = new Hi3$a$a(var15_16, null);
                var5_5 = var13_13;
                var6_6 = 3;
                Ae3.d((i90_0)var13_13, null, null, (Function2)var3_3 /* !! */ , var6_6);
                return Unit.a;
            }
        }
        try {
            var9_9 = new Hi3$a$j(var37_34, (Function1)var20_21, (Function1)var25_25, (Ref$ObjectRef)var22_23, (dy2_1)var8_8, null);
            var2_2.g = var38_35;
            var2_2.b = var22_23;
            var2_2.c = var14_15;
            var2_2.f = var7_7 = 5;
            var14_15 = var38_35.u(var23_24, (Function2)var9_9, var2_2);
            if (var14_15 != var3_3 /* !! */ ) return Unit.a;
            return var3_3 /* !! */ ;
        }
        catch (PointerEventTimeoutCancellationException v4) lbl-1000:
        // 2 sources

        {
            while (true) {
                var9_9 = var5_5;
                var16_17 = var38_35;
                ** continue;
                break;
            }
        }
        catch (PointerEventTimeoutCancellationException v5) {
            var13_13 = var5_5;
            var17_18 = var11_11;
            var15_16 = var12_12;
            var38_35 = var22_23;
            var5_5 = var21_22;
            ** continue;
        }
    }
}

