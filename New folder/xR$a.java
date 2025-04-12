/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

public final class xR$a
implements bt2_2 {
    public final /* synthetic */ bt2_2 a;
    public final /* synthetic */ bt2_2 b;
    public final /* synthetic */ AtomicReference c;
    public final /* synthetic */ yr_0 d;

    public xR$a(bt2_2 bt2_22, AtomicReference atomicReference, yr_0 yr_02) {
        this.b = bt2_22;
        this.c = atomicReference;
        this.d = yr_02;
        this.a = bt2_22;
    }

    /*
     * Unable to fully structure code
     */
    public final j90_0 a(xt1_0 var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof ur_1;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (ur_1)var2_2;
        var5_5 = var4_4.c;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.c = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new ur_1(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.a;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.c;
        var7_7 = 1;
        if (var6_6 != 0) {
            if (var6_6 != var7_7) {
                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var1_1;
            }
            vl2_2.b(var2_2);
        } else {
            vl2_2.b(var2_2);
            var9_9 = this.b;
            var10_10 = this.d;
            var2_2 = new wr_0(var10_10, (xt1_0)var1_1, (bt2_2)var9_9, null);
            var4_4.c = var7_7;
            var9_9 = vr_0.c;
            var11_11 = this.c;
            var1_1 = new z03_0((Function1)var9_9, var11_11, (Function2)var2_2, null);
            var1_1 = kotlinx.coroutines.d.c((Function2)var1_1, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        var1_1 = new KotlinNothingValueException();
        throw var1_1;
    }

    public final CoroutineContext getCoroutineContext() {
        return this.a.getCoroutineContext();
    }

    public final View getView() {
        return this.a.getView();
    }
}

