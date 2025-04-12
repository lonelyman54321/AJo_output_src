/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f$c;
import com.ril.ajio.payment.fragment.e;
import com.ril.ajio.payment.view.NpsView$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XE0
 */
public final class xe0_0
implements vv1$a,
NpsView$a,
o60_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ xe0_0(Object object) {
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
        boolean cfr_ignored_0 = mt2.g;
        object.getClass();
        boolean bl2 = mt2.g;
        object.W(bl2);
    }

    public void w8(int n3) {
        e e2 = (e)this.a;
        Intrinsics.checkNotNullParameter(e2, "this$0");
        e2.e = n3;
    }
}

