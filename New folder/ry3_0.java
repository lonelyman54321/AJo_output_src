/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ry3
 */
public final class ry3_0
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ ry3_0(tw0_1 tw0_12) {
        this.a = tw0_12;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

