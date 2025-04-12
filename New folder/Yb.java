/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Yb
implements bx0_2,
o60_0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ Yb(int n3, Function1 function1) {
        this.a = n3;
        this.b = function1;
    }

    public void accept(Object object) {
        Function1 function1 = this.b;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                return (q63_0)oj_0.a(this.b, "$tmp0", object, "p0", object);
            }
            case 0: 
        }
        return (q63_0)oj_0.a(this.b, "$tmp0", object, "p0", object);
    }
}

