/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.onscrolllistener.RecyclerViewScrollListener;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qW
 */
public final class qw_1
extends RecyclerView$B {
    public final RecyclerViewScrollListener a;
    public final ShimmerFrameLayout b;

    public qw_1(View object, RecyclerViewScrollListener recyclerViewScrollListener) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        this.a = recyclerViewScrollListener;
        int n3 = R$id.closet_row_shimmer_view;
        object = (ShimmerFrameLayout)object.findViewById(n3);
        this.b = object;
    }

    public final void w() {
        ShimmerFrameLayout shimmerFrameLayout = this.b;
        int n3 = 8;
        shimmerFrameLayout.setVisibility(n3);
        RecyclerViewScrollListener recyclerViewScrollListener = this.a;
        if (recyclerViewScrollListener != null) {
            recyclerViewScrollListener.onLoadMore();
            boolean bl2 = recyclerViewScrollListener.isLastPage();
            if (bl2) {
                shimmerFrameLayout.setVisibility(n3);
                shimmerFrameLayout.stopShimmer();
            } else {
                n3 = 0;
                shimmerFrameLayout.setVisibility(0);
                shimmerFrameLayout.startShimmer();
            }
        }
    }
}

