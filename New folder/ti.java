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
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

public final class ti
implements bt2_2,
i90_0 {
    public final View a;
    public final Al3 b;
    public final i90_0 c;
    public final AtomicReference d;

    public ti(View object, Al3 al3, i90_0 i90_02) {
        this.a = object;
        this.b = al3;
        this.c = i90_02;
        super(null);
        this.d = object;
    }

    /*
     * Unable to fully structure code
     */
    public final j90_0 a(xt1_0 var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof pi_0;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (pi_0)var2_2;
        var5_5 = var4_4.c;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.c = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new pi_0(this, (f80_0)var2_2);
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
            var2_2 = this.d;
            var9_9 = new ri_0((xt1_0)var1_1, this);
            var1_1 = new si_1(this, null);
            var4_4.c = var7_7;
            var10_10 = new z03_0(var9_9, (AtomicReference)var2_2, (Function2)var1_1, null);
            var1_1 = kotlinx.coroutines.d.c(var10_10, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        var1_1 = new KotlinNothingValueException();
        throw var1_1;
    }

    public final CoroutineContext getCoroutineContext() {
        return this.c.getCoroutineContext();
    }

    public final View getView() {
        return this.a;
    }
}

