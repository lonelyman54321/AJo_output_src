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
 * Renamed from mO
 */
public final class mo_2
extends RecyclerView$n {
    public final int a;
    public final int b;

    public mo_2(int n3, int n4) {
        this.a = n3;
        this.b = n4;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView object, RecyclerView$y recyclerView$y) {
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "parent");
        String string2 = "state";
        Intrinsics.checkNotNullParameter(recyclerView$y, string2);
        int n3 = ((RecyclerView)object).getChildAdapterPosition(view);
        if (n3 == 0) {
            int n4;
            rect.left = n4 = this.a;
        } else {
            int n7;
            int n8 = ((RecyclerView)object).getChildAdapterPosition(view);
            if ((object = ((RecyclerView)object).getAdapter()) != null) {
                n7 = ((RecyclerView$f)object).getItemCount();
            } else {
                n7 = 0;
                object = null;
            }
            if (n8 == (n7 += -1)) {
                rect.right = n8 = this.b;
            }
        }
    }
}

