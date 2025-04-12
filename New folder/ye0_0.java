/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f$c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YE0
 */
public final class ye0_0
implements vv1$a,
o60_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ ye0_0(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public void invoke(Object object) {
        object = (f$c)object;
        Mt2 mt2 = (Mt2)this.a;
        boolean bl2 = mt2.l;
        int n3 = mt2.e;
        object.h0(n3, bl2);
    }
}

