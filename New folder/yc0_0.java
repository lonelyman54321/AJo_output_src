/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Yc0
 */
public final class yc0_0
implements o60_0,
bx0_2 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ yc0_0(Function1 function1) {
        this.a = function1;
    }

    public void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        return (q63_0)oj_0.a(this.a, "$tmp0", object, "p0", object);
    }
}

