/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.input.pointer.CancelTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class Wg3$a
implements ru_0,
Vo0,
f80_0 {
    public final f80_0 a;
    public final /* synthetic */ wg3_2 b;
    public bl_2 c;
    public Nv2 d;
    public final f e;
    public final /* synthetic */ wg3_2 f;

    public Wg3$a(wg3_2 object, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f = object;
        this.a = cancellableContinuationImpl;
        this.b = object;
        object = Nv2.Main;
        this.d = object;
        object = kotlin.coroutines.f.a;
        this.e = object;
    }

    public final float D0(int n3) {
        return this.b.D0(n3);
    }

    public final float E0(float f5) {
        float f6 = this.b.getDensity();
        return f5 / f6;
    }

    public final float H(long l2) {
        wg3_2 wg3_22 = this.b;
        wg3_22.getClass();
        return mv0_0.a(l2, wg3_22);
    }

    public final float H0() {
        return this.b.H0();
    }

    public final float J0(float f5) {
        return this.b.getDensity() * f5;
    }

    /*
     * Unable to fully structure code
     */
    public final Object N0(long var1_1, ei3_1 var3_2, f80_0 var4_3) {
        var5_4 = var4_3 instanceof xg3_2;
        if (!var5_4) ** GOTO lbl-1000
        var6_5 = var4_3;
        var6_5 = (xg3_2)var4_3;
        var7_6 = var6_5.c;
        var8_7 = -1 << -1;
        var9_8 = var7_6 & var8_7;
        if (var9_8 != 0) {
            var6_5.c = var7_6 -= var8_7;
        } else lbl-1000:
        // 2 sources

        {
            var6_5 = new xg3_2(this, (f80_0)var4_3);
        }
        var4_3 = var6_5.a;
        var10_9 = j90_0.COROUTINE_SUSPENDED;
        var8_7 = var6_5.c;
        var9_8 = 1;
        if (var8_7 != 0) {
            if (var8_7 == var9_8) {
                vl2_2.b(var4_3);
            }
            var11_10 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var11_10;
        }
        vl2_2.b(var4_3);
        var6_5.c = var9_8;
        try {
            var4_3 = this.u(var1_1, var3_2, var6_5);
            if (var4_3 == var10_9) {
                return var10_9;
            }
        }
        catch (PointerEventTimeoutCancellationException v0) {
            var4_3 = null;
        }
        return var4_3;
    }

    public final long O(float f5) {
        return this.b.O(f5);
    }

    public final int O0(long l2) {
        return this.b.O0(l2);
    }

    public final long Z() {
        wg3_2 wg3_22 = this.f;
        wg3_22.getClass();
        long l2 = Uo0.d(go0.f((fo0)wg3_22).t.d(), wg3_22);
        long l3 = wg3_22.w;
        float f5 = C63.d(l2);
        float f6 = (int)(l3 >> 32);
        f5 -= f6;
        f5 = Math.max(0.0f, f5);
        float f7 = 2.0f;
        float f8 = C63.b(l2);
        float f11 = (int)(l3 & 0xFFFFFFFFL);
        f8 -= f11;
        f8 = Math.max(0.0f, f8) / f7;
        return bo1_1.a(f5 /= f7, f8);
    }

    public final long Z0(long l2) {
        wg3_2 wg3_22 = this.b;
        wg3_22.getClass();
        return Uo0.d(l2, wg3_22);
    }

    public final long a() {
        return this.f.w;
    }

    public final int e0(float f5) {
        wg3_2 wg3_22 = this.b;
        wg3_22.getClass();
        return Uo0.a(f5, wg3_22);
    }

    public final CoroutineContext getContext() {
        return this.e;
    }

    public final float getDensity() {
        return this.b.getDensity();
    }

    public final NC3 getViewConfiguration() {
        wg3_2 wg3_22 = this.f;
        wg3_22.getClass();
        return go0.f((fo0)wg3_22).t;
    }

    public final float h0(long l2) {
        wg3_2 wg3_22 = this.b;
        wg3_22.getClass();
        return Uo0.c(l2, wg3_22);
    }

    public final mv2_0 p0() {
        return this.f.s;
    }

    public final void resumeWith(Object object) {
        Object object2 = this.f;
        WR1 wR1 = ((wg3_2)object2).t;
        synchronized (wR1) {
            object2 = ((wg3_2)object2).t;
            ((WR1)object2).m(this);
            object2 = Unit.a;
            this.a.resumeWith(object);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object u(long var1_1, Function2 var3_2, f80_0 var4_3) {
        block9: {
            block8: {
                var5_4 = var4_3 instanceof Wg3$a$a;
                if (!var5_4) ** GOTO lbl-1000
                var6_5 = var4_3;
                var6_5 = (Wg3$a$a)var4_3;
                var7_6 = var6_5.d;
                var8_7 = -1 << -1;
                var9_8 = var7_6 & var8_7;
                if (var9_8 != 0) {
                    var6_5.d = var7_6 -= var8_7;
                } else lbl-1000:
                // 2 sources

                {
                    var6_5 = new Wg3$a$a(this, (f80_0)var4_3);
                }
                var4_3 = var6_5.b;
                var10_9 = j90_0.COROUTINE_SUSPENDED;
                var8_7 = var6_5.d;
                var9_8 = 1;
                if (var8_7 != 0) {
                    if (var8_7 != var9_8) {
                        var11_11 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var11_11;
                    }
                    var11_10 = var6_5.a;
                    try {
                        vl2_2.b(var4_3);
                        break block8;
                    }
                    catch (Throwable var12_12) {
                        break block9;
                    }
                }
                vl2_2.b(var4_3);
                var13_14 = 0L;
                var15_15 = var1_1 == var13_14 ? 0 : (var1_1 < var13_14 ? -1 : 1);
                if (var15_15 <= 0 && (var4_3 = this.c) != null) {
                    var16_16 = tl2_2.b;
                    var16_16 = new PointerEventTimeoutCancellationException(var1_1);
                    var16_16 = vl2_2.a((Throwable)var16_16);
                    var4_3.resumeWith(var16_16);
                }
                var4_3 = this.f.f1();
                var16_16 = new Wg3$a$b(var1_1, this, null);
                var17_17 = 3;
                var11_10 = Ae3.d((i90_0)var4_3, null, null, (Function2)var16_16, var17_17);
                {
                    var6_5.a = var11_10;
                    var6_5.d = var9_8;
                    var4_3 = var3_2.invoke(this, var6_5);
                    if (var4_3 != var10_9) break block8;
                    return var10_9;
                }
            }
            var12_13 = CancelTimeoutCancellationException.a;
            var11_10.d(var12_13);
            return var4_3;
        }
        var3_2 = CancelTimeoutCancellationException.a;
        var11_10.d((CancellationException)var3_2);
        throw var12_12;
    }

    public final Object x0(Nv2 object, f80_0 f80_02) {
        f80_0 f80_03 = zj1_2.b(f80_02);
        int n3 = 1;
        Object object2 = new CancellableContinuationImpl(n3, f80_03);
        object2.r();
        this.d = object;
        this.c = object2;
        object = object2.q();
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object == object2) {
            object2 = "frame";
            Intrinsics.checkNotNullParameter(f80_02, (String)object2);
        }
        return object;
    }

    public final long z(long l2) {
        wg3_2 wg3_22 = this.b;
        wg3_22.getClass();
        return Uo0.b(l2, wg3_22);
    }
}

