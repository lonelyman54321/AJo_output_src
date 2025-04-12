/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class oA1
implements Function1 {
    public final /* synthetic */ pA1 a;

    public /* synthetic */ oA1(pA1 pA12) {
        this.a = pA12;
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        pA1 pA12 = this.a;
        Intrinsics.checkNotNullParameter(pA12, "this$0");
        object = pA12.r;
        Intrinsics.checkNotNull(object);
        object.setVisibility(8);
        return Unit.a;
    }
}

