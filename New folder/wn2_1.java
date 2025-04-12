/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wn2
 */
public final class wn2_1
implements bx0_2,
o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ wn2_1(Function1 function1) {
        this.a = function1;
    }

    public void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        return (DataCallback)oj_0.a(this.a, "$tmp0", object, "p0", object);
    }
}

