/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.customviews.widgets.onscrolllistener.RecyclerViewScrollListener;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eX1$b
 */
public final class ex1$b_0
extends RecyclerViewScrollListener {
    public final /* synthetic */ ex1_0 a;

    public ex1$b_0(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final boolean isLastPage() {
        ky1_0 ky1_02 = this.a.u;
        if (ky1_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closetViewModel");
            ky1_02 = null;
        }
        return ky1_02.h();
    }

    public final void onLoadMore() {
        ky1_0 ky1_02 = this.a.u;
        if (ky1_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closetViewModel");
            ky1_02 = null;
        }
        ky1_02.k();
    }
}

