/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from an0
 */
public final class an0_0
implements Runnable {
    public final /* synthetic */ Ref$ObjectRef a;

    public /* synthetic */ an0_0(Ref$ObjectRef ref$ObjectRef) {
        this.a = ref$ObjectRef;
    }

    public final void run() {
        Ref$ObjectRef ref$ObjectRef = this.a;
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$seekCancelLambda");
        Function0 function0 = (Function0)ref$ObjectRef.element;
        if (function0 != null) {
            function0.invoke();
        }
    }
}

