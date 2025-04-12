/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f$a;
import androidx.media3.common.f$c;
import androidx.media3.exoplayer.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PG2
 */
public final class pg2_1
implements bx0_2,
o60_0,
vv1$a {
    public final /* synthetic */ Object a;

    public /* synthetic */ pg2_1(Object object) {
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
        f$a f$a = ((e)this.a).P;
        object.Q(f$a);
    }
}

