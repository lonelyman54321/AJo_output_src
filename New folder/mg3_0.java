/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Mg3
 */
public final class mg3_0 {
    public static final Object a(float f5, float f6, float f7, Gl gl, Function2 function2, f80_0 f80_02) {
        ni3_0 ni3_02;
        Object object = FloatCompanionObject.INSTANCE;
        object = ya3_0.a;
        Float f8 = new Float(f5);
        Float f11 = new Float(f6);
        Object object2 = new Float(f7);
        Object object3 = ((Ws3)object).a;
        if ((object2 = (Ol)object3.invoke(object2)) == null) {
            object2 = Pl.b((Ol)object3.invoke(f8));
        }
        Object object4 = object2;
        object2 = ni3_02;
        object3 = gl;
        ni3_02 = new ni3_0(gl, (Vs3)object, f8, f11, (Ol)object4);
        int n3 = 56;
        il_0 il_02 = new il_0((Vs3)object, f8, (Ol)object4, n3);
        object = function2;
        long l2 = Long.MIN_VALUE;
        lg3_2 lg3_22 = new lg3_2(function2);
        object = mg3_0.b(il_02, ni3_02, l2, lg3_22, f80_02);
        if (object != (object2 = j90_0.COROUTINE_SUSPENDED)) {
            object = Unit.a;
        }
        if (object == object2) {
            return object;
        }
        return Unit.a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object b(il_0 var0, ol_1 var1_1, long var2_2, Function1 var4_3, f80_0 var5_4) {
        block22: {
            block24: {
                block23: {
                    var6_5 = var0;
                    var7_6 = var1_1;
                    var8_12 = var5_4;
                    var9_13 = var5_4 instanceof Mg3$a;
                    if (var9_13 == 0) ** GOTO lbl-1000
                    var10_14 = var5_4;
                    var10_14 = (Mg3$a)var5_4;
                    var11_15 = var10_14.f;
                    var12_16 = -1 << -1;
                    var13_17 = -0.0f;
                    var14_18 = var11_15 & var12_16;
                    if (var14_18 != 0) {
                        var10_14.f = var11_15 -= var12_16;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var10_14 = new h80_0((f80_0)var8_12);
                    }
                    var15_19 = var10_14;
                    var8_12 = var10_14.e;
                    var16_20 = j90_0.COROUTINE_SUSPENDED;
                    var9_13 = var10_14.f;
                    var17_21 = 2;
                    var18_22 = 1;
                    if (var9_13 == 0) break block23;
                    if (var9_13 != var18_22) {
                        if (var9_13 != var17_21) {
                            var7_6 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var7_6;
                        }
                        var10_14 = var10_14.d;
                        var7_6 = var15_19.c;
                        var19_23 = var15_19.b;
                        var20_24 = var15_19.a;
                    } else {
                        var10_14 = var10_14.d;
                        var7_6 = var15_19.c;
                        var19_23 = var15_19.b;
                        var20_24 = var15_19.a;
                    }
                    vl2_2.b(var8_12);
                    var8_12 = var7_6;
                    var7_6 = var19_23;
                    ** GOTO lbl-1000
                }
                vl2_2.b(var8_12);
                var21_25 = 0L;
                var23_27 = var7_6.g(var21_25);
                var24_28 = var7_6.c(var21_25);
                var25_29 = new Ref$ObjectRef();
                var21_25 = -9223372036854775808L;
                var11_15 = var2_2 == var21_25 ? 0 : (var2_2 < var21_25 ? -1 : 1);
                if (var11_15 != 0) break block24;
                try {
                    var8_12 = var10_14.getContext();
                    var26_30 = mg3_0.h((CoroutineContext)var8_12);
                    var8_12 = var27_31;
                    var10_14 = var25_29;
                    var19_23 = var23_27;
                    var20_24 = var1_1;
                    var28_32 = var24_28;
                    var23_27 = var27_31;
                    var27_31 = var4_3;
                    var8_12((Ref$ObjectRef)var25_29, var19_23, (ol_1)var1_1, var24_28, (il_0)var0, var26_30, (Function1)var4_3);
                    var15_19.a = var6_5;
                    var15_19.b = var7_6;
                    var8_12 = var4_3;
                    var15_19.c = var8_12 = (Function1)var4_3;
                    var15_19.d = var25_29;
                    var15_19.f = var18_22;
                    var29_26 = var1_1.b();
                    if (var29_26) {
                        var8_12 = Tg1.a((Function1)var23_27, (f80_0)var15_19);
                    } else {
                        var9_13 = 1;
                        var8_12 = new f13(var23_27, var9_13);
                        var10_14 = var15_19.getContext();
                        var10_14 = aQ1.a((CoroutineContext)var10_14);
                        var8_12 = var10_14.R((Function1)var8_12, (f80_0)var15_19);
                    }
                    if (var8_12 == var16_20) {
                        return var16_20;
                    }
                    var8_12 = var4_3;
                    var20_24 = var6_5;
                    var10_14 = var25_29;
                    ** GOTO lbl-1000
                }
                catch (CancellationException var7_8) {}
                var10_14 = var25_29;
                break block22;
            }
            var30_33 = var1_1.f();
            var31_34 = var1_1.h();
            var8_12 = new Mg3$c((il_0)var6_5);
            var32_35 = var25_29;
            var25_29 = var27_31;
            try {
                var27_31 = new tl_1(var23_27, var30_33, var24_28, var2_2, var31_34, var2_2, (Function0)var8_12);
                var8_12 = var10_14.getContext();
                var13_17 = mg3_0.h((CoroutineContext)var8_12);
                var8_12 = var27_31;
                var28_32 = var1_1;
                mg3_0.g((tl_1)var27_31, var2_2, var13_17, (ol_1)var1_1, (il_0)var0, (Function1)var4_3);
                var32_35.element = var27_31;
                var8_12 = var4_3;
                var20_24 = var6_5;
                var10_14 = var32_35;
                ** GOTO lbl-1000
            }
            catch (CancellationException var7_9) {}
            ** GOTO lbl-1000
            catch (CancellationException var7_11) {
                var32_35 = var25_29;
            }
lbl-1000:
            // 2 sources

            {
                var10_14 = var32_35;
                break block22;
            }
            catch (CancellationException var7_7) {
                var6_5 = var20_24;
            }
        }
        var8_12 = (tl_1)var10_14.element;
        if (var8_12 != null) {
            var19_23 = Boolean.FALSE;
            var8_12 = var8_12.i;
            var8_12.setValue(var19_23);
        }
        var8_12 = (tl_1)var10_14.element;
        if (var8_12 != null && (var14_18 = (int)((cfr_temp_0 = (var21_25 = var8_12.g) - (var35_38 = var6_5.d)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) == 0) {
            var29_26 = false;
            var8_12 = null;
            var6_5.f = false;
        }
        throw var7_10;
lbl-1000:
        // 3 sources

        {
            do {
                var19_23 = var10_14.element;
                Intrinsics.checkNotNull(var19_23);
                var19_23 = (tl_1)var19_23;
                var19_23 = var19_23.i;
                var19_23 = var19_23.getValue();
                var19_23 = (Boolean)var19_23;
                var11_15 = (int)var19_23.booleanValue();
                if (var11_15 == 0) {
                    return Unit.a;
                }
                var19_23 = var15_19.getContext();
                var33_36 = mg3_0.h((CoroutineContext)var19_23);
                var0 = var28_32;
                var1_1 = var10_14;
                var4_3 = var20_24;
                var5_4 = var8_12;
                var28_32 = new Mg3$d((Ref$ObjectRef)var10_14, var33_36, (ol_1)var7_6, (il_0)var20_24, (Function1)var8_12);
                var15_19.a = var20_24;
                var15_19.b = var7_6;
                var19_23 = var8_12;
                var15_19.c = var19_23 = (Function1)var8_12;
                var15_19.d = var10_14;
                var15_19.f = var17_21;
                var11_15 = (int)var7_6.b();
                if (var11_15 != 0) {
                    var19_23 = Tg1.a((Function1)var28_32, (f80_0)var15_19);
                    continue;
                }
                var34_37 = 1;
                var19_23 = new f13(var28_32, var34_37);
                var28_32 = var15_19.getContext();
                var28_32 = aQ1.a((CoroutineContext)var28_32);
                var19_23 = var28_32.R((Function1)var19_23, (f80_0)var15_19);
            } while (var19_23 != var16_20);
            return var16_20;
        }
    }

    public static /* synthetic */ Object c(float f5, float f6, Gl gl, Function2 function2, f80_0 f80_02, int n3) {
        if ((n3 &= 8) != 0) {
            int n4 = 7;
            n3 = 0;
            gl = Hl.b(0.0f, n4, null);
        }
        return mg3_0.a(f5, f6, 0.0f, gl, function2, f80_02);
    }

    public static final Object d(il_0 object, vi0_0 object2, boolean bl2, Function1 function1, f80_0 f80_02) {
        Object object3 = ((il_0)object).b.getValue();
        Ol ol = ((il_0)object).c;
        Object object4 = ((il_0)object).a;
        ui0_0 ui0_02 = new ui0_0((vi0_0)object2, (Vs3)object4, object3, ol);
        long l2 = bl2 ? ((il_0)object).d : Long.MIN_VALUE;
        object4 = object;
        object = mg3_0.b((il_0)object, ui0_02, l2, function1, f80_02);
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object == object2) {
            return object;
        }
        return Unit.a;
    }

    public static final Object e(il_0 il_02, Float f5, Gl gl, boolean bl2, Function1 function1, f80_0 f80_02) {
        Object object = il_02.b.getValue();
        Ol ol = il_02.c;
        Object object2 = il_02.a;
        Object object3 = new ni3_0(gl, (Vs3)object2, object, f5, ol);
        long l2 = bl2 ? il_02.d : Long.MIN_VALUE;
        Object object4 = il_02;
        object2 = function1;
        object = f80_02;
        object4 = mg3_0.b(il_02, object3, l2, function1, f80_02);
        if (object4 == (object3 = j90_0.COROUTINE_SUSPENDED)) {
            return object4;
        }
        return Unit.a;
    }

    public static /* synthetic */ Object f(il_0 il_02, Float f5, xa3_2 xa3_22, boolean bl2, Function1 function1, f80_0 f80_02, int n3) {
        int n4;
        int n7 = n3 & 2;
        if (n7 != 0) {
            n4 = 0;
            n7 = 0;
            int n8 = 7;
            xa3_22 = Hl.b(0.0f, n8, null);
        }
        xa3_2 xa3_23 = xa3_22;
        n4 = n3 & 8;
        if (n4 != 0) {
            function1 = og3_2.c;
        }
        return mg3_0.e(il_02, f5, xa3_23, bl2, function1, f80_02);
    }

    public static final void g(tl_1 tl_12, long l2, float f5, ol_1 ol_12, il_0 il_02, Function1 function1) {
        long l3;
        float f6 = 0.0f;
        float f7 = f5 - 0.0f;
        float f8 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (f8 == false) {
            l3 = ol_12.e();
        } else {
            l3 = tl_12.c;
            f6 = (float)(l2 - l3) / f5;
            l3 = (long)f6;
        }
        tl_12.g = l2;
        Object object = ol_12.g(l3);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = tl_12.e;
        parcelableSnapshotMutableState.setValue(object);
        tl_12.f = object = ol_12.c(l3);
        boolean bl2 = ol_12.d(l3);
        if (bl2) {
            tl_12.h = l2 = tl_12.g;
            object = Boolean.FALSE;
            parcelableSnapshotMutableState = tl_12.i;
            parcelableSnapshotMutableState.setValue(object);
        }
        mg3_0.i(tl_12, il_02);
        function1.invoke(tl_12);
    }

    public static final float h(CoroutineContext object) {
        gq1$a_0 gq1$a_0 = gq1$a_0.a;
        float f5 = (object = (gq1_0)object.get(gq1$a_0)) != null ? object.C() : 1.0f;
        gq1$a_0 = null;
        float f6 = f5 - 0.0f;
        float f7 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (f7 >= 0) {
            return f5;
        }
        object = new IllegalStateException("negative scale factor");
        throw object;
    }

    public static final void i(tl_1 tl_12, il_0 il_02) {
        boolean bl2;
        long l2;
        Object object = tl_12.e.getValue();
        il_02.b.setValue(object);
        object = il_02.c;
        Ol ol = tl_12.f;
        int n3 = ((Ol)object).b();
        for (int i3 = 0; i3 < n3; ++i3) {
            float f5 = ol.a(i3);
            ((Ol)object).e(f5, i3);
        }
        il_02.e = l2 = tl_12.h;
        il_02.d = l2 = tl_12.g;
        il_02.f = bl2 = ((Boolean)tl_12.i.getValue()).booleanValue();
    }
}

