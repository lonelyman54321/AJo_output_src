/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobSupport;

/*
 * Renamed from KF
 */
public final class kf_1 {
    public static final KF$a a;

    static {
        KF$a kF$a;
        a = kF$a = new KF$a();
    }

    public static final void a(gf_2 object, Throwable object2) {
        Object object3 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        if (object2 == null) {
            Serializable serializable;
            block13: {
                String string2 = "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;";
                int n3 = 1;
                Class<gf_2> clazz = gf_2.class;
                String string3 = "flushAndClose";
                serializable = object2;
                object2 = new FunctionReferenceImpl(n3, object, clazz, string3, string2, 0);
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object = a;
                try {
                    Intrinsics.checkNotNullParameter(object2, (String)object3);
                    object3 = "completion";
                }
                catch (Throwable throwable) {
                    el_2.a((f80_0)object, throwable);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(object, (String)object3);
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object3 = ((KF$a)object).a;
                serializable = f.a;
                if (object3 != serializable) break block13;
                object3 = new xj1_2((f80_0)object, (KF$b)object2);
            }
            serializable = new yj1_2((f80_0)object, (CoroutineContext)object3, (KF$b)object2);
            object3 = serializable;
            object2 = zj1_2.b((f80_0)object3);
            object3 = tl2_2.b;
            object3 = Unit.a;
            dr0_2.a((f80_0)object2, object3);
        }
        object.e((Throwable)object2);
    }

    public static final Object b(gf_2 object, byte[] object2, int n3, int n4, f80_0 f80_02) {
        ee_2 ee_22 = object.b();
        ee_22.n((byte[])object2, n3, n4);
        object = hf_2.a((gf_2)object, f80_02);
        object2 = (Object)j90_0.COROUTINE_SUSPENDED;
        if (object == object2) {
            return object;
        }
        return Unit.a;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object c(gf_2 var0, b93_0 var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof KF$c;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (KF$c)var2_2;
        var5_5 = var4_4.d;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.d = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new h80_0((f80_0)var2_2);
        }
        var2_2 = var4_4.c;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.d;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl27
        if (var6_6 == var7_7) {
            var0 = var4_4.b;
            var1_1 = var4_4.a;
            vl2_2.b(var2_2);
            var9_9 = var1_1;
            var1_1 = var0;
            var0 = var9_9;
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl27:
            // 1 sources

            vl2_2.b(var2_2);
        }
        while (!(var10_10 = var1_1.g())) {
            var2_2 = var0.b();
            var11_11 = af_2.c((b93_0)var1_1);
            var2_2.k((b93_0)var1_1, var11_11);
            var4_4.a = var0;
            var4_4.b = var1_1;
            var4_4.d = var7_7;
            var2_2 = hf_2.a((gf_2)var0, var4_4);
            if (var2_2 != var8_8) continue;
            return var8_8;
        }
        return Unit.a;
    }

    public static final rj3_2 d(i90_0 i90_02, CoroutineContext object, Function2 function2) {
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(i90_02, (String)object2);
        String string2 = "coroutineContext";
        Intrinsics.checkNotNullParameter(object, string2);
        String string3 = "block";
        Intrinsics.checkNotNullParameter(function2, string3);
        if_1 if_12 = new if_1(false);
        Intrinsics.checkNotNullParameter(i90_02, (String)object2);
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(if_12, "channel");
        Intrinsics.checkNotNullParameter(function2, string3);
        object2 = new lf_1(function2, if_12, null);
        i90_02 = Ae3.d(i90_02, (CoroutineContext)object, null, (Function2)object2, 2);
        object = new if_2(if_12);
        ((JobSupport)((Object)i90_02)).G((Function1)object);
        object = new rj3_2(if_12, (mb3_2)i90_02);
        return object;
    }

    public static /* synthetic */ rj3_2 e(i90_0 i90_02, CoroutineContext coroutineContext, Function2 function2, int n3) {
        if ((n3 &= 1) != 0) {
            coroutineContext = f.a;
        }
        return kf_1.d(i90_02, coroutineContext, function2);
    }
}

