/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.l;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.customviews.widgets.onscrolllistener.RecyclerViewScrollListener;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oY1$b
 */
public final class oy1$b_0
extends RecyclerViewScrollListener {
    public final /* synthetic */ oy1_1 a;

    public oy1$b_0(oy1_1 oy1_12) {
        this.a = oy1_12;
    }

    public final boolean isLastPage() {
        return this.a.Qa().h();
    }

    public final void onLoadMore() {
        Object object = this.a;
        ky1_0 ky1_02 = ((oy1_1)object).Qa();
        boolean bl2 = ky1_02.k();
        object = ((oy1_1)object).G;
        if (object != null) {
            ((RecyclerViewScrollListener)object).setLoadingSate(bl2);
        }
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        Object object2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onScrollStateChanged((RecyclerView)object, n3);
        if (n3 == 0) {
            object = this.a;
            object.getClass();
            l l2 = nu1_0.a((mu1_1)object);
            object2 = new ry1_2((oy1_1)object, null);
            int n4 = 3;
            Ae3.d(l2, null, null, (Function2)object2, n4);
        }
    }
}

