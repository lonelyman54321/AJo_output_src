/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f$c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TG2
 */
public final class tg2_0
implements bx0_2,
o60_0,
vv1$a {
    public final /* synthetic */ Object a;

    public /* synthetic */ tg2_0(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        return (q63_0)oj_0.a((Function1)this.a, "$tmp0", object, "p0", object);
    }

    public void invoke(Object object) {
        object = (f$c)object;
        ot2_0 ot2_02 = ((Mt2)this.a).o;
        object.j0(ot2_02);
    }
}

