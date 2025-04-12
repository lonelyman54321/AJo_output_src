/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zY1
 */
public final class zy1_1
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ zy1_1(yy1_2 yy1_22) {
        this.a = yy1_22;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

