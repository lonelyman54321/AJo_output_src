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
 * Renamed from lO
 */
public final class lo_1
extends RecyclerView$n {
    public final int a;
    public final int b;

    public lo_1(int n3, int n4) {
        this.a = n3;
        this.b = n4;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView object, RecyclerView$y recyclerView$y) {
        int n3;
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "parent");
        String string2 = "state";
        Intrinsics.checkNotNullParameter(recyclerView$y, string2);
        int n4 = ((RecyclerView)object).getChildAdapterPosition(view);
        int n7 = this.a;
        if (n4 == 0) {
            rect.left = n7;
        }
        int n8 = ((RecyclerView)object).getChildAdapterPosition(view);
        if ((object = ((RecyclerView)object).getAdapter()) != null) {
            n3 = ((RecyclerView$f)object).getItemCount();
        } else {
            n3 = 0;
            object = null;
        }
        rect.right = n8 == (n3 += -1) ? n7 : (n8 = this.b);
    }
}

