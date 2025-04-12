/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f$c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WE0
 */
public final class we0_2
implements vv1$a,
o60_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ we0_2(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public void invoke(Object object) {
        object = (f$c)object;
        bq3 bq32 = ((Mt2)this.a).i.d;
        object.e0(bq32);
    }
}

