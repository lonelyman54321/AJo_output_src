/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.customviews.widgets.onscrolllistener.RecyclerViewScrollListener;
import kotlin.jvm.internal.Intrinsics;

public final class t21$b
extends RecyclerViewScrollListener {
    public final /* synthetic */ t21_0 a;

    public t21$b(t21_0 t21_02) {
        this.a = t21_02;
    }

    public final boolean isLastPage() {
        ky1_0 ky1_02 = this.a.h;
        if (ky1_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closetViewModel");
            ky1_02 = null;
        }
        return ky1_02.h();
    }

    public final void onLoadMore() {
        ky1_0 ky1_02 = this.a.h;
        if (ky1_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closetViewModel");
            ky1_02 = null;
        }
        ky1_02.k();
    }
}

