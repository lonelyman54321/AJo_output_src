/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Q53
implements Function1 {
    public final /* synthetic */ R53 a;
    public final /* synthetic */ F62 b;

    public /* synthetic */ Q53(R53 r53, F62 f62) {
        this.a = r53;
        this.b = f62;
    }

    public final Object invoke(Object object) {
        R53 r53 = this.a;
        Intrinsics.checkNotNullParameter(r53, "this$0");
        F62 f62 = this.b;
        Intrinsics.checkNotNullParameter(f62, "$observer");
        AtomicBoolean atomicBoolean = r53.l;
        boolean bl2 = true;
        boolean bl3 = atomicBoolean.compareAndSet(bl2, false);
        if (bl3) {
            f62.onChanged(object);
        }
        return Unit.a;
    }
}

