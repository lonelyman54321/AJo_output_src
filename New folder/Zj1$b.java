/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

public final class Zj1$b
extends h80_0 {
    public int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Object c;

    public Zj1$b(f80_0 f80_02, CoroutineContext coroutineContext, Function2 function2, Object object) {
        this.b = function2;
        this.c = object;
        Intrinsics.checkNotNull(f80_02, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        super(f80_02, coroutineContext);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        int n3 = this.a;
        int n4 = 2;
        int n7 = 1;
        if (n3 != 0) {
            if (n3 != n7) {
                String string2 = "This coroutine had already completed".toString();
                object = new IllegalStateException(string2);
                throw object;
            }
        } else {
            this.a = n7;
            vl2_2.b(object);
            Object object2 = this.b;
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            object = (Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object2, n4);
            object2 = this.c;
            return object.invoke(object2, this);
        }
        this.a = n4;
        vl2_2.b(object);
        return object;
    }
}

