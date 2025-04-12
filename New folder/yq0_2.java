/*
 * Decompiled with CFR 0.152.
 */
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView$d;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YQ0
 */
public final class yq0_2
implements bx0_2,
NestedScrollView$d {
    public final /* synthetic */ Object a;

    public /* synthetic */ yq0_2(Object object) {
        this.a = object;
    }

    public void a(NestedScrollView nestedScrollView) {
        vv2_2 vv2_22 = (vv2_2)this.a;
        Intrinsics.checkNotNullParameter(vv2_22, "this$0");
        Intrinsics.checkNotNullParameter(nestedScrollView, "v");
        hv3_0.S(vv2_22.getActivity());
    }

    public Object apply(Object object) {
        return (DataCallback)oj_0.a((Function1)this.a, "$tmp0", object, "p0", object);
    }
}

