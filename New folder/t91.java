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

public final class t91
extends RecyclerView$n {
    public final int a;

    public t91(int n3) {
        this.a = n3;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        int n3;
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recyclerView, "parent");
        Intrinsics.checkNotNullParameter(recyclerView$y, "state");
        rect.right = n3 = this.a;
    }
}

