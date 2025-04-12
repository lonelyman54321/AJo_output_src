/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.LottieTask;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class sI2 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(Context var0, fc1_0 var1_1, String var2_2, String var3_3, String var4_4, String var5_5, f80_0 var6_6) {
        block21: {
            block16: {
                block19: {
                    block20: {
                        block17: {
                            block18: {
                                var7_7 = var0 /* !! */ ;
                                var8_8 = var1_1;
                                var9_9 = var6_6;
                                var10_10 = var6_6 instanceof pI2;
                                if (!var10_10) ** GOTO lbl-1000
                                var11_11 = var6_6;
                                var11_11 = (pI2)var6_6;
                                var12_12 = var11_11.f;
                                var13_13 = -1 << -1;
                                var14_14 = var12_12 & var13_13;
                                if (var14_14 != 0) {
                                    var11_11.f = var12_12 -= var13_13;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var11_11 = new h80_0((f80_0)var9_9);
                                }
                                var9_9 = var11_11.e;
                                var15_15 = j90_0.COROUTINE_SUSPENDED;
                                var13_13 = var11_11.f;
                                var14_14 = 3;
                                var16_16 = 2;
                                var17_17 = 1;
                                if (var13_13 == 0) break block17;
                                if (var13_13 == var17_17) break block18;
                                if (var13_13 != var16_16) {
                                    if (var13_13 == var14_14) {
                                        var7_7 = (QB1)var11_11.a;
                                        vl2_2.b(var9_9);
lbl27:
                                        // 2 sources

                                        while (true) {
                                            var15_15 = var7_7;
                                            break block16;
                                            break;
                                        }
                                    }
                                    var7_7 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw var7_7;
                                }
                                var7_7 = (QB1)var11_11.d;
                                var8_8 = var11_11.c;
                                var18_18 = var11_11.b;
                                var19_19 = (Context)var11_11.a;
                                vl2_2.b(var9_9);
                                var20_20 /* !! */  = var19_19;
                                break block19;
                            }
                            var7_7 = (String)var11_11.d;
                            var8_8 = var11_11.c;
                            var18_18 = var11_11.b;
                            var20_20 /* !! */  = (Context)var11_11.a;
                            vl2_2.b(var9_9);
                            var21_21 = var18_18;
                            var18_18 = var8_8;
                            var8_8 = var21_21;
                            break block20;
                        }
                        vl2_2.b(var9_9);
                        var22_23 = false;
                        var18_18 = var5_5;
                        var9_9 = sI2.b(var0 /* !! */ , (fc1_0)var1_1, var5_5, false);
                        if (var9_9 == null) break block21;
                        var11_11.a = var7_7;
                        var8_8 = var2_2;
                        var11_11.b = var2_2;
                        var18_18 = var3_3;
                        var11_11.c = var3_3;
                        var20_20 /* !! */  = var4_4;
                        var11_11.d = var4_4;
                        var11_11.f = var17_17;
                        var24_25 = zj1_2.b(var11_11);
                        var23_24 = new CancellableContinuationImpl(var17_17, (f80_0)var24_25);
                        var23_24.r();
                        var24_25 = new lI2((CancellableContinuationImpl)var23_24);
                        var9_9.b((EC1)var24_25);
                        var24_25 = new mI2((CancellableContinuationImpl)var23_24);
                        var9_9.a((EC1)var24_25);
                        var9_9 = var23_24.q();
                        if (var9_9 == var15_15) {
                            var23_24 = "frame";
                            Intrinsics.checkNotNullParameter(var11_11, (String)var23_24);
                        }
                        if (var9_9 == var15_15) break block16;
                        var21_22 /* !! */  = var20_20 /* !! */ ;
                        var20_20 /* !! */  = var7_7;
                        var7_7 = var21_22 /* !! */ ;
                    }
                    var9_9 = (QB1)var9_9;
                    var11_11.a = var20_20 /* !! */ ;
                    var11_11.b = var18_18;
                    var11_11.c = var7_7;
                    var11_11.d = var9_9;
                    var11_11.f = var16_16;
                    var19_19 = var9_9.d;
                    var16_16 = var19_19.isEmpty() ^ var17_17;
                    if (var16_16 == 0) {
                        var8_8 = Unit.a;
                    } else {
                        var19_19 = ir0_2.a;
                        var19_19 = em0_2.b;
                        var25_26 = new oI2((QB1)var9_9, var20_20 /* !! */ , (String)var8_8, null);
                        if ((var8_8 = Ae3.g(var11_11, (CoroutineContext)var19_19, var25_26)) != var15_15) {
                            var8_8 = Unit.a;
                        }
                    }
                    if (var8_8 == var15_15) break block16;
                    var8_8 = var7_7;
                    var7_7 = var9_9;
                }
                var11_11.a = var7_7;
                var11_11.b = null;
                var11_11.c = null;
                var11_11.d = null;
                var11_11.f = var14_14;
                var9_9 = var7_7.f;
                var22_23 = var9_9.isEmpty();
                if (var22_23) {
                    var8_8 = Unit.a;
                } else {
                    var9_9 = ir0_2.a;
                    var9_9 = em0_2.b;
                    var16_16 = 0;
                    var19_19 = null;
                    var0 /* !! */  = var26_27;
                    var1_1 = var7_7;
                    var2_2 = var20_20 /* !! */ ;
                    var3_3 = var18_18;
                    var4_4 = var8_8;
                    var5_5 = null;
                    var26_27 = new nI2((QB1)var7_7, var20_20 /* !! */ , (String)var18_18, (String)var8_8, null);
                    if ((var8_8 = Ae3.g(var11_11, (CoroutineContext)var9_9, var26_27)) != var15_15) {
                        var8_8 = Unit.a;
                    }
                }
                ** while (var8_8 != var15_15)
            }
            return var15_15;
        }
        var7_7 = new StringBuilder("Unable to create parsing task for ");
        var7_7.append(var1_1);
        var7_7.append(".");
        var7_7 = var7_7.toString();
        var7_7 = var7_7.toString();
        var8_8 = new IllegalArgumentException((String)var7_7);
        throw var8_8;
    }

    public static final LottieTask b(Context object, fc1_0 object2, String object3, boolean bl2) {
        String string2;
        block17: {
            block18: {
                block12: {
                    block16: {
                        block14: {
                            block15: {
                                boolean bl3;
                                block13: {
                                    block11: {
                                        bl3 = object2 instanceof fC1$e;
                                        string2 = "__LottieInternalDefaultCacheKey__";
                                        if (!bl3) break block11;
                                        bl2 = Intrinsics.areEqual(object3, string2);
                                        if (bl2) {
                                            object2 = (fC1$e)object2;
                                            int n3 = ((fC1$e)object2).a;
                                            object3 = cc1_0.m(n3, object);
                                            object = cc1_0.g(object, n3, (String)object3);
                                        } else {
                                            object2 = (fC1$e)object2;
                                            int n4 = ((fC1$e)object2).a;
                                            object = cc1_0.g(object, n4, (String)object3);
                                        }
                                        break block12;
                                    }
                                    bl3 = object2 instanceof fC1$f;
                                    if (!bl3) break block13;
                                    bl2 = Intrinsics.areEqual(object3, string2);
                                    if (bl2) {
                                        ((fC1$f)object2).getClass();
                                        object3 = "url_null";
                                        object2 = new SB1((Context)object, null, (String)object3);
                                        object = cc1_0.a((String)object3, (Callable)object2, null);
                                    } else {
                                        ((fC1$f)object2).getClass();
                                        object2 = new SB1((Context)object, null, (String)object3);
                                        object = cc1_0.a((String)object3, (Callable)object2, null);
                                    }
                                    break block12;
                                }
                                bl3 = object2 instanceof fC1$c;
                                if (!bl3) break block14;
                                if (!bl2) break block15;
                                boolean bl4 = false;
                                object = null;
                                break block12;
                            }
                            ((fC1$c)object2).getClass();
                            object = new FileInputStream(null);
                            Intrinsics.areEqual(object3, string2);
                            b.h(null, "zip", false);
                            throw null;
                        }
                        bl2 = object2 instanceof fC1$a;
                        if (!bl2) break block16;
                        bl2 = Intrinsics.areEqual(object3, string2);
                        if (bl2) {
                            object2 = ((fC1$a)object2).a;
                            object3 = cc1_0.a;
                            object3 = kp1_0.c("asset_", (String)object2);
                            object = object.getApplicationContext();
                            YB1 yB1 = new YB1((Context)object, (String)object2, (String)object3);
                            object = cc1_0.a((String)object3, yB1, null);
                        } else {
                            object2 = ((fC1$a)object2).a;
                            Object object4 = cc1_0.a;
                            object = object.getApplicationContext();
                            object4 = new YB1((Context)object, (String)object2, (String)object3);
                            object = cc1_0.a((String)object3, (Callable)object4, null);
                        }
                        break block12;
                    }
                    bl2 = object2 instanceof fC1$d;
                    if (!bl2) break block17;
                    boolean bl5 = Intrinsics.areEqual(object3, string2);
                    if (bl5) break block18;
                    object2 = (fC1$d)object2;
                    object2.getClass();
                    object = new XB1(null, (String)object3);
                    object = cc1_0.a((String)object3, (Callable)object, null);
                }
                return object;
            }
            ((fC1$d)object2).getClass();
            throw null;
        }
        bl2 = object2 instanceof fC1$b;
        if (bl2) {
            Object object5 = object.getContentResolver();
            ((fC1$b)object2).getClass();
            object2 = object5.openInputStream(null);
            bl2 = Intrinsics.areEqual(object3, string2);
            if (!bl2) {
                object5 = cc1_0.a;
                object = object.getApplicationContext();
                object5 = new TB1((Context)object, (InputStream)object2, (String)object3);
                return cc1_0.a((String)object3, (Callable)object5, null);
            }
            throw null;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }

    public static final ec1_0 c(fc1_0 object, b30_0 b30_02, int n3) {
        ec1_0 ec1_02;
        int n4;
        Intrinsics.checkNotNullParameter(object, "spec");
        b30_02.u(-1248473602);
        qI2 qI22 = new qg3_2(3, null);
        Object object2 = AndroidCompositionLocals_androidKt.b;
        Object object3 = object2 = b30_02.j((H30)object2);
        object3 = (Context)object2;
        b30_02.u(1388713953);
        int n7 = n3 & 0xE ^ 6;
        int n8 = 0;
        Object object4 = null;
        boolean bl2 = true;
        int n10 = 4;
        if (n7 > n10 && (n4 = b30_02.J(object)) != 0 || (n4 = n3 & 6) == n10) {
            n4 = 1;
        } else {
            n4 = 0;
            ec1_02 = null;
        }
        Object object5 = b30_02.v();
        Object object6 = b30$a.a;
        if (n4 != 0 || object5 == object6) {
            ec1_02 = new ec1_0();
            object5 = J83.g(ec1_02);
            b30_02.o(object5);
        }
        Object object7 = object5;
        object7 = (tr1_0)object5;
        b30_02.I();
        n4 = 1388714244;
        b30_02.u(n4);
        if (n7 > n10 && (n7 = (int)(b30_02.J(object) ? 1 : 0)) != 0 || (n3 &= 6) == n10) {
            n8 = 1;
        }
        String string2 = "__LottieInternalDefaultCacheKey__";
        n7 = b30_02.J(string2) | n8;
        object4 = b30_02.v();
        if (n7 != 0 || object4 == object6) {
            object4 = sI2.b((Context)object3, (fc1_0)object, string2, bl2);
            b30_02.o(object4);
        }
        object4 = (LottieTask)object4;
        b30_02.I();
        object4 = object2;
        object6 = string2;
        object2 = new rI2(qI22, (Context)object3, (fc1_0)object, null, "fonts/", ".ttf", string2, (tr1_0)object7, null);
        ly0_0.e(object, string2, (Function2)object2, b30_02);
        object = (ec1_0)object7.getValue();
        b30_02.I();
        return object;
    }
}

