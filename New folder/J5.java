/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class J5
implements Function0 {
    public final /* synthetic */ k5_0 a;

    public /* synthetic */ J5(k5_0 k5_02) {
        this.a = k5_02;
    }

    public final Object invoke() {
        k5_0 k5_02 = this.a;
        Intrinsics.checkNotNullParameter(k5_02, "this$0");
        return k5_02.requireActivity().getApplication();
    }
}

