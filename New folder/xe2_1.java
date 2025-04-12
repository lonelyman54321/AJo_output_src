/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

/*
 * Renamed from xE2
 */
public final class xe2_1
implements uf_1 {
    public final we2_2 b;
    public final CoroutineContext c;
    public yv_2 d;
    public final ee_2 e;
    public final xl1_2 f;
    public final CoroutineContext g;

    public xe2_1(ci1_2 object, CoroutineContext coroutineContext) {
        xl1_2 xl1_22;
        Intrinsics.checkNotNullParameter(object, "source");
        Intrinsics.checkNotNullParameter(coroutineContext, "parent");
        this.b = object;
        this.c = coroutineContext;
        this.e = object;
        object = i$a.a;
        object = (i)coroutineContext.get((CoroutineContext$a)object);
        this.f = xl1_22 = new xl1_2((i)object);
        object = coroutineContext.plus(xl1_22);
        super("RawSourceChannel");
        this.g = object = object.plus(coroutineContext);
    }

    public final void e(Throwable throwable) {
        Object object = this.d;
        if (object != null) {
            return;
        }
        object = this.f;
        Object object2 = throwable.getMessage();
        String string2 = "Channel was cancelled";
        if (object2 == null) {
            object2 = string2;
        }
        object2 = xc0_2.a((String)object2, throwable);
        ((JobSupport)object).d((CancellationException)object2);
        this.b.close();
        String string3 = throwable.getMessage();
        if (string3 != null) {
            string2 = string3;
        }
        object2 = new IOException(string2, throwable);
        this.d = object = new yv_2((Throwable)object2);
    }

    public final Throwable f() {
        Object object = this.d;
        if (object != null) {
            xv_2 xv_22 = xv_2.a;
            object = ((yv_2)object).a(xv_22);
        } else {
            object = null;
        }
        return object;
    }

    public final b93_0 g() {
        return this.e;
    }

    /*
     * Unable to fully structure code
     */
    public final Object h(int var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof xE2$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (xE2$a)var2_2;
        var5_5 = var4_4.e;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7) {
            var4_4.e = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new xE2$a(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.c;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.e;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl24
        if (var6_6 == var7_7) {
            var1_1 = var4_4.b;
            var4_4 = var4_4.a;
            vl2_2.b(var2_2);
        } else {
            var9_9 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var9_9;
lbl24:
            // 1 sources

            vl2_2.b(var2_2);
            var2_2 = this.d;
            if (var2_2 != null) {
                return Boolean.TRUE;
            }
            var6_6 = 0;
            var2_2 = new xE2$b(this, var1_1, null);
            var4_4.a = this;
            var4_4.b = var1_1;
            var4_4.e = var7_7;
            var10_10 = this.g;
            if ((var2_2 = Ae3.g((f80_0)var4_4, var10_10, (Function2)var2_2)) == var8_8) {
                return var8_8;
            }
            var4_4 = this;
        }
        var2_2 = var4_4.e;
        var11_11 = af_2.c((b93_0)var2_2);
        var13_12 = var1_1;
        var6_6 = (int)(var11_11 == var13_12 ? 0 : (var11_11 < var13_12 ? -1 : 1));
        if (var6_6 < 0) {
            var7_7 = 0;
        }
        return (boolean)var7_7;
    }

    public final boolean i() {
        boolean bl2;
        Object object = this.d;
        if (object != null && (bl2 = ((ee_2)(object = this.e)).g())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

