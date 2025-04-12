/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.c$a;
import androidx.work.c$a$a;
import androidx.work.c$a$b;
import androidx.work.impl.workers.ConstraintTrackingWorker$a;
import androidx.work.impl.workers.ConstraintTrackingWorker$b;
import androidx.work.impl.workers.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

public final class ConstraintTrackingWorker
extends CoroutineWorker {
    public final WorkerParameters d;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(context, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        super(context, workerParameters);
        this.d = workerParameters;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object c(ConstraintTrackingWorker var0, c var1_1, MH3 var2_2, EI3 var3_3, f80_0 var4_4) {
        block8: {
            block7: {
                block5: {
                    block6: {
                        var0.getClass();
                        var5_5 = var4_4 /* !! */  instanceof P50;
                        if (!var5_5) ** GOTO lbl-1000
                        var6_6 = var4_4 /* !! */ ;
                        var6_6 = (P50)var4_4 /* !! */ ;
                        var7_7 = var6_6.c;
                        var8_8 = -1 << -1;
                        var9_9 = var7_7 & var8_8;
                        if (var9_9 != 0) {
                            var6_6.c = var7_7 -= var8_8;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var6_6 = new P50((ConstraintTrackingWorker)var0, var4_4 /* !! */ );
                        }
                        var0 = var6_6.a;
                        var4_4 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                        var7_7 = var6_6.c;
                        var8_8 = 1;
                        if (var7_7 == 0) break block5;
                        if (var7_7 != var8_8) break block6;
                        vl2_2.b(var0);
                        break block7;
                    }
                    var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var0;
                }
                vl2_2.b(var0);
                var7_7 = 0;
                var0 = new a((c)var1_1, var2_2, var3_3, null);
                var6_6.c = var8_8;
                var0 = kotlinx.coroutines.d.c((Function2)var0, var6_6);
                if (var0 == var4_4 /* !! */ ) break block8;
            }
            var1_1 = "delegate: ListenableWork\u2026.cancel()\n        }\n    }";
            Intrinsics.checkNotNullExpressionValue(var0, (String)var1_1);
            var4_4 /* !! */  = var0;
        }
        return var4_4 /* !! */ ;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object d(ConstraintTrackingWorker var0, f80_0 var1_1) {
        block22: {
            block20: {
                block21: {
                    var2_2 = var0.d;
                    var3_3 = var1_1 instanceof Q50;
                    if (var3_3 == 0) ** GOTO lbl-1000
                    var4_4 = var1_1;
                    var4_4 = (Q50)var1_1;
                    var5_5 = var4_4.e;
                    var6_6 = -1 << -1;
                    var7_7 = var5_5 & var6_6;
                    if (var7_7 != 0) {
                        var4_4.e = var5_5 -= var6_6;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_4 = new Q50(var0, var1_1);
                    }
                    var8_8 = var4_4;
                    var4_4 = var4_4.c;
                    var9_12 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                    var5_5 = var8_8.e;
                    var10_13 = 1;
                    if (var5_5 == 0) break block21;
                    if (var5_5 != var10_13) {
                        var8_8 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var8_8;
                    }
                    var2_2 = var8_8.b;
                    var11_14 = var8_8.a;
                    try {
                        vl2_2.b(var4_4);
                        ** GOTO lbl-1000
                    }
                    catch (CancellationException var8_9) {
                        var12_15 = var11_14;
                        break block20;
                    }
                }
                vl2_2.b(var4_4);
                var4_4 = var0.getInputData().c("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                var11_14 = "failure()";
                if (var4_4 != null && (var6_6 = var4_4.length()) != 0) {
                    var13_16 = ni3_1.i(var0.getApplicationContext());
                    Intrinsics.checkNotNullExpressionValue(var13_16, "getInstance(applicationContext)");
                    var14_17 = var13_16.c.f();
                    var15_18 = var0.getId().toString();
                    var16_19 = "id.toString()";
                    Intrinsics.checkNotNullExpressionValue(var15_18, (String)var16_19);
                    var14_17 = var14_17.i((String)var15_18);
                    if (var14_17 == null) {
                        var9_12 /* !! */  = new c$a$a();
                        Intrinsics.checkNotNullExpressionValue((Object)var9_12 /* !! */ , (String)var11_14);
                        return var9_12 /* !! */ ;
                    }
                    var16_19 = "workManagerImpl.trackers";
                    var17_20 = var13_16.j;
                    Intrinsics.checkNotNullExpressionValue(var17_20, (String)var16_19);
                    var15_18 = new MH3((aq3)var17_20);
                    var18_21 = var15_18.a((EI3)var14_17);
                    if (var18_21 == 0) {
                        qx1.a().getClass();
                        var9_12 /* !! */  = new c$a$b();
                        var8_8 = "retry()";
                        Intrinsics.checkNotNullExpressionValue((Object)var9_12 /* !! */ , (String)var8_8);
                        return var9_12 /* !! */ ;
                    }
                    var18_21 = V50.a;
                    var16_19 = qx1.a();
                    var16_19.getClass();
                    try {
                        var16_19 = var0.getWorkerFactory();
                        var17_20 = var0.getApplicationContext();
                        var19_22 = "applicationContext";
                        Intrinsics.checkNotNullExpressionValue(var17_20, (String)var19_22);
                        var16_19 = var16_19.b((Context)var17_20, (String)var4_4, (WorkerParameters)var2_2);
                        var2_2 = var2_2.h.a();
                        var4_4 = "workerParameters.taskExecutor.mainThreadExecutor";
                    }
                    catch (Throwable v0) {
                        qx1.a().getClass();
                        var8_8 = var13_16.b;
                        var8_8.getClass();
                        var9_12 /* !! */  = new c$a$a();
                        Intrinsics.checkNotNullExpressionValue((Object)var9_12 /* !! */ , (String)var11_14);
                        return var9_12 /* !! */ ;
                    }
                    Intrinsics.checkNotNullExpressionValue(var2_2, (String)var4_4);
                    try {
                        var17_20 = h83.a((Executor)var2_2);
                        var2_2 = var19_22;
                        var4_4 = var0;
                        var11_14 = var16_19;
                        var13_16 = var15_18;
                        var15_18 = null;
                        var19_22 = new r50_0(var0, (c)var16_19, (MH3)var13_16, (EI3)var14_17, null);
                        var8_8.a = var0;
                        var8_8.b = var16_19;
                        var8_8.e = var10_13;
                        var4_4 = Ae3.g((f80_0)var8_8, (CoroutineContext)var17_20, (Function2)var19_22);
                        if (var4_4 == var9_12 /* !! */ ) {
                            return var9_12 /* !! */ ;
                        }
                        var11_14 = var0;
                        var2_2 = var16_19;
                    }
                    catch (CancellationException var8_10) {
                        var12_15 = var0;
                        var2_2 = var16_19;
                        break block20;
                    }
                }
                break block22;
lbl-1000:
                // 2 sources

                {
                    var4_4 = (c$a)var4_4;
                    return var4_4;
                }
            }
            var3_3 = var12_15.isStopped();
            if (var3_3 != 0 || (var3_3 = var8_11 instanceof ConstraintTrackingWorker$a) != 0) {
                var3_3 = Build.VERSION.SDK_INT;
                var5_5 = 31;
                if (var3_3 < var5_5) {
                    var3_3 = -512;
                } else {
                    var3_3 = (int)var12_15.isStopped();
                    if (var3_3 != 0) {
                        var3_3 = var12_15.getStopReason();
                    } else {
                        var3_3 = var8_11 instanceof ConstraintTrackingWorker$a;
                        if (var3_3 == 0) {
                            var8_11 = new IllegalStateException("Unreachable");
                            throw var8_11;
                        }
                        var4_4 = var8_11;
                        var4_4 = (ConstraintTrackingWorker$a)var8_11;
                        var3_3 = var4_4.a;
                    }
                }
                var2_2.stop(var3_3);
            }
            if ((var20_23 = var8_11 instanceof ConstraintTrackingWorker$a) == false) throw (Throwable)var8_11;
            var8_11 = new c$a$b();
            var2_2 = "{\n            // there a\u2026throw cancelled\n        }";
            Intrinsics.checkNotNullExpressionValue(var8_11, (String)var2_2);
            return var8_11;
        }
        var8_8 = qx1.a();
        var8_8.getClass();
        var9_12 /* !! */  = new c$a$a();
        Intrinsics.checkNotNullExpressionValue((Object)var9_12 /* !! */ , (String)var11_14);
        return var9_12 /* !! */ ;
    }

    public final Object b(f80_0 f80_02) {
        Object object = this.getBackgroundExecutor();
        Intrinsics.checkNotNullExpressionValue(object, "backgroundExecutor");
        object = h83.a((Executor)object);
        ConstraintTrackingWorker$b constraintTrackingWorker$b = new ConstraintTrackingWorker$b(this, null);
        return Ae3.g(f80_02, (CoroutineContext)object, constraintTrackingWorker$b);
    }
}

