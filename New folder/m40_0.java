/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.c$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from M40
 */
public final class m40_0
implements bx0_2,
o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ m40_0(Function1 function1) {
        this.a = function1;
    }

    public void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        return (c$a)oj_0.a(this.a, "$tmp0", object, "p0", object);
    }
}

