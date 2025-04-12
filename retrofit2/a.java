/*
 * Decompiled with CFR 0.152.
 */
package retrofit2;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import retrofit2.KotlinExtensions$suspendAndThrow$2$1;
import retrofit2.a$a;
import retrofit2.a$b;
import retrofit2.a$c;
import retrofit2.a$d;

public final class a {
    public static final Object a(jj_2 object, f80_0 f80_02) {
        Object object2 = zj1_2.b(f80_02);
        int n3 = 1;
        Object object3 = new CancellableContinuationImpl(n3, (f80_0)object2);
        object3.r();
        object2 = new a$a((jj_2)object);
        object3.x((Function1)object2);
        object2 = new a$b((CancellableContinuationImpl)object3);
        object.h((vj_2)object2);
        object = object3.q();
        object3 = j90_0.COROUTINE_SUSPENDED;
        if (object == object3) {
            object3 = "frame";
            Intrinsics.checkNotNullParameter(f80_02, (String)object3);
        }
        return object;
    }

    public static final Object b(jj_2 object, f80_0 f80_02) {
        Object object2 = zj1_2.b(f80_02);
        int n3 = 1;
        Object object3 = new CancellableContinuationImpl(n3, (f80_0)object2);
        object3.r();
        object2 = new a$c((jj_2)object);
        object3.x((Function1)object2);
        object2 = new a$d((CancellableContinuationImpl)object3);
        object.h((vj_2)object2);
        object = object3.q();
        object3 = j90_0.COROUTINE_SUSPENDED;
        if (object == object3) {
            object3 = "frame";
            Intrinsics.checkNotNullParameter(f80_02, (String)object3);
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public static final j90_0 c(f80_0 var0, Throwable var1_1) {
        var2_2 = var0 instanceof ko1_2;
        if (!var2_2) ** GOTO lbl-1000
        var3_3 = var0;
        var3_3 = (ko1_2)var0;
        var4_4 = var3_3.b;
        var5_5 = -1 << -1;
        var6_6 = var4_4 & var5_5;
        if (var6_6 != 0) {
            var3_3.b = var4_4 -= var5_5;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = new h80_0((f80_0)var0);
        }
        var0 = var3_3.a;
        var7_7 = j90_0.COROUTINE_SUSPENDED;
        var5_5 = var3_3.b;
        var6_6 = 1;
        if (var5_5 != 0) {
            if (var5_5 != var6_6) {
                var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var0;
            }
            vl2_2.b(var0);
            var0 = new KotlinNothingValueException();
            throw var0;
        }
        vl2_2.b(var0);
        var3_3.getClass();
        var3_3.b = var6_6;
        var0 = ir0_2.a;
        var8_8 = var3_3.getContext();
        var9_9 = new KotlinExtensions$suspendAndThrow$2$1((ko1_2)var3_3, var1_1);
        var0.J0(var8_8, var9_9);
        Intrinsics.checkNotNullParameter(var3_3, "frame");
        return var7_7;
    }
}

