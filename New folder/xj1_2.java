/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/*
 * Renamed from Xj1
 */
public final class xj1_2
extends ql2_2 {
    public int a;
    public final /* synthetic */ Function1 b;

    public xj1_2(f80_0 f80_02, KF$b kF$b) {
        this.b = kF$b;
        Intrinsics.checkNotNull(f80_02, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        super(f80_02);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                String string2 = "This coroutine had already completed".toString();
                object = new IllegalStateException(string2);
                throw object;
            }
        } else {
            this.a = n4;
            vl2_2.b(object);
            Function1 function1 = this.b;
            Intrinsics.checkNotNull(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
            return ((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, n4)).invoke(this);
        }
        this.a = n3 = 2;
        vl2_2.b(object);
        return object;
    }
}

