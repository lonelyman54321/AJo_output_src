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
 * Renamed from Lv1
 */
public final class lv1_2
extends RecyclerView$B {
    public final RecyclerViewScrollListener a;
    public final ShimmerFrameLayout b;

    public lv1_2(View object, RecyclerViewScrollListener recyclerViewScrollListener) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        this.a = recyclerViewScrollListener;
        int n3 = R$id.closet_row_shimmer_view;
        object = (ShimmerFrameLayout)object.findViewById(n3);
        this.b = object;
    }
}

