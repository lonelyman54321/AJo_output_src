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
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xB3
 */
public final class xb3_2
extends RecyclerView$n {
    public final int a;

    public xb3_2(int n3) {
        this.a = n3;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView object, RecyclerView$y object2) {
        int n3;
        int n4;
        int n7;
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "parent");
        String string2 = "state";
        Intrinsics.checkNotNullParameter(object2, string2);
        object2 = ((RecyclerView)object).getAdapter();
        if (object2 != null) {
            n7 = 0;
            string2 = null;
            n4 = ((RecyclerView$f)object2).getItemViewType(0);
            object2 = n4;
        } else {
            n4 = 0;
            object2 = null;
        }
        n7 = 1;
        int n8 = 11;
        int n10 = this.a;
        if (object2 != null && (n3 = ((Integer)object2).intValue()) == n8) {
            n4 = ((RecyclerView)object).getChildAdapterPosition(view);
            if (n4 == 0) {
                rect.top = n10;
            }
        } else if (object2 != null && (n3 = ((Integer)object2).intValue()) == 0) {
            n4 = ((RecyclerView)object).getChildAdapterPosition(view);
            if (n4 == 0) {
                rect.top = n10;
            }
        } else if (object2 == null || (n4 = ((Integer)object2).intValue()) != n8) {
            n4 = ((RecyclerView)object).getChildAdapterPosition(view);
            if (n4 == 0) {
                rect.top = n10;
            }
            if ((n4 = ((RecyclerView)object).getChildAdapterPosition(view)) == n7) {
                rect.top = n10;
            }
        }
        if ((object2 = ((RecyclerView)object).getAdapter()) != null && (n8 = object2 instanceof zQ2) != 0) {
            int n14 = ((RecyclerView)object).getChildAdapterPosition(view);
            object2 = (zQ2)object2;
            object = ((zQ2)object2).b;
            int n15 = ((ArrayList)object).size() - n7;
            if (n14 < n15) {
                rect.bottom = n10;
            }
        }
    }
}

