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
 * Renamed from yB3
 */
public final class yb3_1
extends RecyclerView$n {
    public final int a;

    public yb3_1() {
        this.a = 18;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        int n3;
        rect.bottom = n3 = this.a;
    }
}

