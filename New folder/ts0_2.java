/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.TypeIntrinsics;

/*
 * Renamed from TS0
 */
public final class ts0_2
extends qg3_2
implements gx0_2 {
    public Ref$ObjectRef a;
    public Ref$LongRef b;
    public int c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ es0_2 g;

    public ts0_2(ss0_2 ss0_22, ge2_2 ge2_22, f80_0 f80_02) {
        this.f = ss0_22;
        this.g = ge2_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (i90_0)object;
        object2 = (fs0_2)object2;
        object3 = (f80_0)object3;
        ss0_2 ss0_22 = (ss0_2)this.f;
        ge2_2 ge2_22 = (ge2_2)this.g;
        ts0_2 ts0_22 = new ts0_2(ss0_22, ge2_22, (f80_0)object3);
        ts0_22.d = object;
        ts0_22.e = object2;
        object = Unit.a;
        return ts0_22.invokeSuspend(object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block14: {
            block10: {
                block11: {
                    var2_2 = this;
                    var3_3 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                    var4_4 = this.c;
                    var5_5 = 1;
                    var6_6 = 2;
                    if (var4_4 == 0) break block11;
                    if (var4_4 != var5_5) {
                        if (var4_4 == var6_6) {
                            var7_7 = this.a;
                            var8_8 = (af2_2)this.e;
                            var9_9 = (fs0_2)this.d;
                            vl2_2.b(var1_1);
                            var10_10 = var9_9;
                            var5_5 = 2;
                            var9_9 = var8_8;
                            while (true) {
                                var8_8 = var7_7;
                                break block10;
                                break;
                            }
                        }
                        var3_3 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var3_3 /* !! */ ;
                    }
                    var7_7 = this.b;
                    var8_8 = this.a;
                    var9_9 = (af2_2)this.e;
                    var10_10 = (fs0_2)this.d;
                    vl2_2.b(var1_1);
                    ** GOTO lbl73
                }
                vl2_2.b(var1_1);
                var7_7 = (i90_0)this.d;
                var8_8 = (fs0_2)this.e;
                var10_10 = (ge2_2)this.g;
                var9_9 = new TS0$c((ge2_2)var10_10, null);
                var10_10 = kotlin.coroutines.f.a;
                var11_11 /* !! */  = he_2.SUSPEND;
                var12_12 = l90_0.DEFAULT;
                var13_13 = 4;
                var11_11 /* !! */  = sr_2.a(0, var13_13, var11_11 /* !! */ );
                var7_7 = a90_0.b((i90_0)var7_7, (CoroutineContext)var10_10);
                var10_10 = new fr_2((CoroutineContext)var7_7, (le_2)var11_11 /* !! */ , (boolean)var5_5, (boolean)var5_5);
                var12_12.invoke((Function2)var9_9, var10_10, (f80_0)var10_10);
                var7_7 = new Ref$ObjectRef();
                var9_9 = var10_10;
                var10_10 = var8_8;
                var8_8 = var7_7;
lbl45:
                // 2 sources

                while ((var7_7 = var8_8.element) != (var11_11 /* !! */  = k52_0.c)) {
                    block12: {
                        block13: {
                            var7_7 = new Ref$LongRef();
                            var11_11 /* !! */  = var8_8.element;
                            if (var11_11 /* !! */  == null) break block12;
                            var12_12 = k52_0.a;
                            if (var11_11 /* !! */  == var12_12) {
                                var14_14 /* !! */  = 0;
                                var11_11 /* !! */  = null;
                            }
                            var15_15 = var2_2.f;
                            var11_11 /* !! */  = (Number)var15_15.invoke((Object)var11_11 /* !! */ );
                            var7_7.element = var16_16 = var11_11 /* !! */ .longValue();
                            var18_17 = 0L;
                            cfr_temp_0 = var16_16 - var18_17;
                            var14_14 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                            if (var14_14 /* !! */  < 0) break block13;
                            if (var14_14 /* !! */  == 0) {
                                var11_11 /* !! */  = var8_8.element;
                                if (var11_11 /* !! */  == var12_12) {
                                    var14_14 /* !! */  = 0;
                                    var11_11 /* !! */  = null;
                                }
                                var2_2.d = var10_10;
                                var2_2.e = var9_9;
                                var2_2.a = var8_8;
                                var2_2.b = var7_7;
                                var2_2.c = var5_5;
                                if ((var11_11 /* !! */  = var10_10.emit((Object)var11_11 /* !! */ , var2_2)) == var3_3 /* !! */ ) {
                                    return var3_3 /* !! */ ;
                                } else {
                                    ** GOTO lbl73
                                }
                            }
                            break block12;
lbl73:
                            // 3 sources

                            var8_8.element = null;
                            break block12;
                        }
                        var7_7 = "Debounce timeout should not be negative".toString();
                        var3_3 /* !! */  = new IllegalArgumentException((String)var7_7);
                        throw var3_3 /* !! */ ;
                    }
                    var20_18 = var8_8;
                    var8_8 = var7_7;
                    var7_7 = var20_18;
                    var11_11 /* !! */  = this.getContext();
                    var21_19 = new fx2_2((CoroutineContext)var11_11 /* !! */ );
                    var11_11 /* !! */  = var20_18.element;
                    if (var11_11 /* !! */  != null) {
                        var22_20 = var8_8.element;
                        var8_8 = new TS0$a(null, (fs0_2)var10_10, (Ref$ObjectRef)var20_18);
                        var15_15 = new i92_0(var22_20);
                        var11_11 /* !! */  = h92_0.a;
                        Intrinsics.checkNotNull((Object)var11_11 /* !! */ , "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
                        var24_21 = 3;
                        var11_11 /* !! */  = TypeIntrinsics.beforeCheckcastToFunctionOfArity((Object)var11_11 /* !! */ , var24_21);
                        var25_22 = var11_11 /* !! */ ;
                        var25_22 = (gx0_2)var11_11 /* !! */ ;
                        var26_23 = HX2$a.a;
                        var27_24 = hx2_2.e;
                        var11_11 /* !! */  = var12_12;
                        var28_25 /* !! */  = var12_12;
                        var12_12 = var21_19;
                        var29_26 = var21_19;
                        var21_19 = var27_24;
                        var27_24 = var8_8;
                        var11_11 /* !! */ ((fx2_2)var12_12, var15_15, (gx0_2)var25_22, var26_23, var21_19, (qg3_2)var8_8, null);
                        var12_12.i((FX2$a)var11_11 /* !! */ , false);
                    } else {
                        var29_26 = var21_19;
                    }
                    var28_25 /* !! */  = var9_9.l();
                    var8_8 = new TS0$b(null, (fs0_2)var10_10, (Ref$ObjectRef)var7_7);
                    var29_26.h(var28_25 /* !! */ , (TS0$b)var8_8);
                    var2_2.d = var10_10;
                    var2_2.e = var9_9;
                    var2_2.a = var7_7;
                    var2_2.b = null;
                    var2_2.c = var5_5 = 2;
                    if ((var29_26 = (var30_27 = (var8_8 = fx2_2.f.get(var29_26)) instanceof FX2$a) != false ? var29_26.e(var2_2) : var29_26.f(var2_2)) != var3_3 /* !! */ ) ** continue;
                    return var3_3 /* !! */ ;
                }
                break block14;
            }
            var5_5 = 1;
            var6_6 = 2;
            ** GOTO lbl45
        }
        return Unit.a;
    }
}

