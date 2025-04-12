/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YD2
 */
public final class yd2_0
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ yd2_0(xd2_0 xd2_02) {
        this.a = xd2_02;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

