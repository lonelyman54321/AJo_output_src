/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.workers;

import androidx.work.c;
import androidx.work.c$a;
import androidx.work.impl.workers.ConstraintTrackingWorker$a;
import androidx.work.impl.workers.a$a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class a
extends qg3_2
implements Function2 {
    public ListenableFuture a;
    public mb3_2 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ c e;
    public final /* synthetic */ MH3 f;
    public final /* synthetic */ EI3 g;

    public a(c c2, MH3 mH3, EI3 eI3, f80_0 f80_02) {
        this.e = c2;
        this.f = mH3;
        this.g = eI3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        MH3 mH3 = this.f;
        EI3 eI3 = this.g;
        c c2 = this.e;
        a a2 = new a(c2, mH3, eI3, f80_02);
        a2.d = object;
        return a2;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((a)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        block16: {
            block18: {
                block17: {
                    var2_2 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                    var3_9 = this.c;
                    var4_10 = -256;
                    var5_11 = this.e;
                    var6_12 = 1;
                    if (var3_9 == 0) break block18;
                    if (var3_9 != var6_12) {
                        var2_2 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var2_2 /* !! */ ;
                    }
                    var7_13 = this.b;
                    var8_14 = this.a;
                    var2_2 /* !! */  = this.d;
                    var9_15 = var2_2 /* !! */ ;
                    var9_15 = (AtomicInteger)var2_2 /* !! */ ;
                    try {
                        vl2_2.b(var1_1);
                        var10_16 = var8_14;
                        var8_14 = var1_1;
                        break block16;
                    }
                    catch (Throwable var2_3) {}
                    try {
                        var4_10 = V50.a;
                        var15_21 = qx1.a();
                        var5_11 = var5_11.getClass();
                        var5_11.toString();
                        var15_21.getClass();
                        throw var2_3;
                    }
                    catch (Throwable var2_8) {}
                    {
                        break block17;
lbl32:
                        // 2 sources

                        while (true) {
                            var13_19 = qx1.a();
                            var5_11 = var5_11.getClass();
                            var5_11.toString();
                            var13_19.getClass();
                            var16_22 = var9_15.get();
                            if (var16_22 == var4_10) {
                                var6_12 = 0;
                            }
                            var4_10 = (int)var8_14.isCancelled();
                            if (var4_10 != 0 && var6_12 != 0) {
                                var4_10 = var9_15.get();
                                var2_6 = new ConstraintTrackingWorker$a(var4_10);
                                throw var2_6;
                            }
                            throw var2_6;
                        }
                    }
                }
                var7_13.d(null);
                throw var2_8;
                catch (CancellationException var2_4) {
                    ** GOTO lbl32
                }
            }
            vl2_2.b(var1_1);
            var7_13 = (i90_0)this.d;
            var11_17 = new AtomicInteger(var4_10);
            var10_16 = var5_11.startWork();
            Intrinsics.checkNotNullExpressionValue(var10_16, "delegate.startWork()");
            var9_15 = this.f;
            var13_19 = this.g;
            var8_14 = var12_18;
            var12_18 = new a$a((MH3)var9_15, (EI3)var13_19, var11_17, var10_16, null);
            var14_20 = 3;
            var7_13 = Ae3.d(var7_13, null, null, var12_18, var14_20);
            try {
                this.d = var11_17;
                this.a = var10_16;
                this.b = var7_13;
                this.c = var6_12;
                var8_14 = androidx.concurrent.futures.a.a(var10_16, this);
                if (var8_14 == var2_2 /* !! */ ) {
                    return var2_2 /* !! */ ;
                }
                var9_15 = var11_17;
            }
            catch (CancellationException var2_7) {
                var9_15 = var11_17;
                ** continue;
            }
        }
        try {
            var8_14 = (c$a)var8_14;
        }
        catch (CancellationException var2_5) lbl-1000:
        // 2 sources

        {
            while (true) {
                var8_14 = var10_16;
                ** continue;
                break;
            }
        }
        var7_13.d(null);
        return var8_14;
    }
}

