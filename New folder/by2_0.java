/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from by2
 */
public final class by2_0
implements ui0 {
    public final ui0 a;

    public by2_0(X53 x53) {
        Intrinsics.checkNotNullParameter(x53, "delegate");
        this.a = x53;
    }

    public final Object a(Function2 function2, f80_0 f80_02) {
        by2$a_0 by2$a_0 = new by2$a_0(function2, null);
        return this.a.a(by2$a_0, f80_02);
    }

    public final es0_2 getData() {
        return this.a.getData();
    }
}

