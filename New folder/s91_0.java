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
 * Renamed from s91
 */
public final class s91_0
extends RecyclerView$n {
    public int a;

    public final void getItemOffsets(Rect rect, View view, RecyclerView object, RecyclerView$y object2) {
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "parent");
        String string2 = "state";
        Intrinsics.checkNotNullParameter(object2, string2);
        object2 = ((RecyclerView)object).getAdapter();
        if (object2 != null) {
            int n3 = ((RecyclerView)object).getChildAdapterPosition(view);
            object = ((RecyclerView)object).getAdapter();
            Intrinsics.checkNotNull(object);
            int n4 = ((RecyclerView$f)object).getItemCount() + -1;
            if (n3 != n4) {
                rect.right = n3 = this.a;
            }
        }
    }
}

