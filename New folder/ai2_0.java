/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 */
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$y;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ai2
 */
public final class ai2_0
extends RecyclerView$n {
    public final int a;

    public ai2_0(int n3) {
        this.a = n3;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recyclerView, "parent");
        String string2 = "state";
        Intrinsics.checkNotNullParameter(recyclerView$y, string2);
        super.getItemOffsets(rect, view, recyclerView, recyclerView$y);
        int n3 = recyclerView.getChildLayoutPosition(view);
        if (n3 > 0) {
            rect.top = n3 = this.a;
        }
    }
}

