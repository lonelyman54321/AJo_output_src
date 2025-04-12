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
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$y;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wB3
 */
public final class wb3_0
extends RecyclerView$n {
    public final int a;

    public wb3_0(int n3) {
        this.a = n3;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView object, RecyclerView$y recyclerView$y) {
        int n3;
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "parent");
        String string2 = "state";
        Intrinsics.checkNotNullParameter(recyclerView$y, string2);
        super.getItemOffsets(rect, view, (RecyclerView)object, recyclerView$y);
        int n4 = ((RecyclerView)object).getChildAdapterPosition(view);
        object = ((RecyclerView)object).getAdapter();
        if (object != null) {
            n3 = ((RecyclerView$f)object).getItemCount();
        } else {
            n3 = 0;
            object = null;
        }
        if (n4 != (n3 += -1)) {
            rect.bottom = n4 = this.a;
        }
    }
}

