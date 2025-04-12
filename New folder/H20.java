/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BlendMode
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.os.CancellationSignal
 *  android.os.CancellationSignal$OnCancelListener
 *  android.view.ScrollCaptureCallback
 *  android.view.ScrollCaptureSession
 */
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.j;

public final class H20
implements ScrollCaptureCallback {
    public final GY2 a;
    public final Vi1 b;
    public final H20$a c;
    public final c80 d;
    public final eI2 e;

    public H20(GY2 object, Vi1 object2, c80 c802, H20$a object3) {
        this.a = object;
        this.b = object2;
        this.c = object3;
        object = Iq0.a;
        object = c802.a.plus((CoroutineContext)object);
        this.d = object3 = new c80((CoroutineContext)object);
        int n3 = ((Vi1)object2).d;
        int n4 = ((Vi1)object2).b;
        object2 = new k20_0(this, null);
        this.e = object = new eI2(n3 -= n4, (k20_0)object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(H20 var0, ScrollCaptureSession var1_2, Vi1 var2_3, f80_0 var3_4) {
        block23: {
            block24: {
                block27: {
                    block25: {
                        block26: {
                            block21: {
                                block22: {
                                    block18: {
                                        block19: {
                                            block20: {
                                                var0.getClass();
                                                var4_5 = var3_4 instanceof I20;
                                                if (var4_5 == 0) ** GOTO lbl-1000
                                                var5_6 = var3_4;
                                                var5_6 = (I20)var3_4;
                                                var6_7 = var5_6.h;
                                                var7_8 = -1 << -1;
                                                var8_9 = var6_7 & var7_8;
                                                if (var8_9 != 0) {
                                                    var5_6.h = var6_7 -= var7_8;
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var5_6 = new I20((H20)var0, (f80_0)var3_4);
                                                }
                                                var3_4 = var5_6.f;
                                                var9_10 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                                var7_8 = var5_6.h;
                                                var8_9 = 2;
                                                var10_11 = 2.8E-45f;
                                                var11_12 = 1;
                                                var12_13 = 1.4E-45f;
                                                if (var7_8 == 0) break block18;
                                                if (var7_8 == var11_12) break block19;
                                                if (var7_8 != var8_9) break block20;
                                                var13_14 = var5_6.e;
                                                var14_15 = var5_6.d;
                                                var2_3 = var5_6.c;
                                                var9_10 /* !! */  = D20.a(var5_6.b);
                                                var5_6 = var5_6.a;
                                                vl2_2.b(var3_4);
                                                break block21;
                                            }
                                            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            throw var0;
                                        }
                                        var13_14 = var5_6.e;
                                        var14_15 = var5_6.d;
                                        var2_3 = var5_6.c;
                                        var15_16 = D20.a(var5_6.b);
                                        var16_17 = var5_6.a;
                                        vl2_2.b(var3_4);
                                        var17_18 = var13_14;
                                        var18_19 = var14_15;
                                        var1_2 /* !! */  = var15_16;
                                        var0 = var16_17;
                                        break block22;
                                    }
                                    vl2_2.b(var3_4);
                                    var18_19 = var2_3.b;
                                    var15_16 = var0.e;
                                    var5_6.a = var0;
                                    var5_6.b = var1_2 /* !! */ ;
                                    var5_6.c = var2_3;
                                    var5_6.d = var18_19;
                                    var5_6.e = var17_18 = var2_3.d;
                                    var5_6.h = var11_12;
                                    if (var18_19 > var17_18) break block23;
                                    var11_12 = var17_18 - var18_19;
                                    var19_20 = var15_16.a;
                                    if (var11_12 > var19_20) break block24;
                                    var12_13 = var18_19;
                                    var20_21 = var15_16.c;
                                    cfr_temp_0 = var12_13 - var20_21;
                                    var21_22 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                    if (var21_22 >= 0 && (var21_22 = (cfr_temp_1 = (var22_23 = (float)var17_18) - (var23_24 = (float)var19_20 + var20_21)) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1)) <= 0) {
                                        var15_16 = Unit.a;
                                    } else {
                                        var11_12 = var12_13 == var20_21 ? 0 : (var12_13 < var20_21 ? -1 : 1);
                                        var11_12 = var11_12 < 0 ? var18_19 : var17_18 - var19_20;
                                        if ((var15_16 = var15_16.a(var12_13 = (float)var11_12 - var20_21, (f80_0)var5_6)) != var9_10 /* !! */ ) {
                                            var15_16 = Unit.a;
                                        }
                                        if (var15_16 != var9_10 /* !! */ ) {
                                            var15_16 = Unit.a;
                                        }
                                    }
                                    if (var15_16 == var9_10 /* !! */ ) break block25;
                                }
                                var5_6.a = var0;
                                var5_6.b = var1_2 /* !! */ ;
                                var5_6.c = var2_3;
                                var5_6.d = var18_19;
                                var5_6.e = var17_18;
                                var5_6.h = var8_9;
                                var15_16 = aQ1.a(var5_6.getContext());
                                var24_25 = j20_0.c;
                                var5_6 = var15_16.R(var24_25, (f80_0)var5_6);
                                if (var5_6 == var9_10 /* !! */ ) break block25;
                                var5_6 = var0;
                                var9_10 /* !! */  = var1_2 /* !! */ ;
                                var14_15 = var18_19;
                                var13_14 = var17_18;
                            }
                            var3_4 = var5_6.e;
                            var7_8 = ok1_1.b(var3_4.c);
                            var14_15 -= var7_8;
                            var18_19 = var3_4.a;
                            var7_8 = 0;
                            var15_16 = null;
                            var14_15 = f.g(var14_15, 0, var18_19);
                            var3_4 = var5_6.e;
                            var10_11 = var3_4.c;
                            var8_9 = ok1_1.b(var10_11);
                            var13_14 -= var8_9;
                            var18_19 = var3_4.a;
                            var13_14 = f.g(var13_14, 0, var18_19);
                            var18_19 = var2_3.a;
                            if (var14_15 != var13_14) break block26;
                            var9_10 /* !! */  = Vi1.e;
                            break block25;
                        }
                        var15_16 = var5_6.a.c();
                        if (var15_16 == null) break block27;
                        var24_25 = F20.a(E20.a((ScrollCaptureSession)var9_10 /* !! */ ));
                        var16_17 = gf_0.a();
                        G20.a((Canvas)var24_25, (BlendMode)var16_17);
                        var16_17 = Nf.a;
                        var16_17 = new mf_0();
                        var16_17.a = var24_25;
                        var25_26 = -((float)var18_19);
                        var26_27 = -((float)var14_15);
                        var16_17.g(var25_26, var26_27);
                        var17_18 = 0;
                        var25_26 = 0.0f;
                        var15_16.Y0((iL)var16_17, null);
                        var5_6 = var5_6.e;
                        var27_28 = var5_6.c;
                        var4_5 = ok1_1.b(var27_28);
                        var28_29 = var2_3.c;
                        var9_10 /* !! */  = new Vi1(var18_19, var14_15 += var4_5, var28_29, var13_14 += var4_5);
                    }
                    return var9_10 /* !! */ ;
                    finally {
                        E20.a((ScrollCaptureSession)var9_10 /* !! */ ).unlockCanvasAndPost((Canvas)var24_25);
                    }
                }
                var1_2 /* !! */  = "Could not find coordinator for semantics node.".toString();
                var0 = new IllegalStateException((String)var1_2 /* !! */ );
                throw var0;
            }
            var0 = D70.b(var11_12, var19_20, "Expected range (", ") to be \u2264 viewportSize=");
            var0 = var0.toString();
            var1_2 /* !! */  = new IllegalArgumentException((String)var0);
            throw var1_2 /* !! */ ;
        }
        var15_16.getClass();
        var0 = new StringBuilder("Expected min=");
        var0.append(var18_19);
        var0.append(" \u2264 max=");
        var0.append(var17_18);
        var0 = var0.toString();
        var0 = var0.toString();
        var1_2 /* !! */  = new IllegalArgumentException((String)var0);
        throw var1_2 /* !! */ ;
    }

    public final void onScrollCaptureEnd(Runnable runnable2) {
        c80 c802 = this.d;
        j j3 = j.a;
        H20$b h20$b = new H20$b(this, runnable2, null);
        Ae3.d(c802, j3, null, h20$b, 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession object, CancellationSignal cancellationSignal, Rect object2, Consumer consumer) {
        c80 c802 = this.d;
        H20$c h20$c = new H20$c(this, (ScrollCaptureSession)object, (Rect)object2, consumer, null);
        object = Ae3.d(c802, null, null, h20$c, 3);
        object2 = new M20(cancellationSignal);
        ((JobSupport)object).G((Function1)object2);
        object2 = new L20((mb3_2)object);
        cancellationSignal.setOnCancelListener((CancellationSignal.OnCancelListener)object2);
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        cancellationSignal = cf_2.d(this.b);
        yx_0.b(consumer, (Rect)cancellationSignal);
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable2) {
        this.e.c = 0.0f;
        this.c.a();
        runnable2.run();
    }
}

