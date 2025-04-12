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

/*
 * Renamed from EW
 */
public final class ew_0
extends RecyclerView$n {
    public final int a;
    public final int b;

    public ew_0(int n3, int n4) {
        this.a = n3;
        this.b = n4;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        int n3 = recyclerView.getChildLayoutPosition(view);
        int n4 = this.b;
        int n7 = this.a;
        if (n3 == 0) {
            rect.left = n7;
            rect.right = n4;
        } else {
            int n8 = recyclerView$y.b() + -1;
            rect.right = n3 == n8 ? n7 : n4;
        }
    }
}

