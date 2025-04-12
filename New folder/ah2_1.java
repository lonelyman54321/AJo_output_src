/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.view.View
 */
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$y;
import com.ril.ajio.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ah2
 */
public final class ah2_1
extends RecyclerView$n {
    public final Drawable a;

    public ah2_1() {
        Drawable drawable2 = hv3_0.r(R$drawable.ajiogram_line_divider);
        Intrinsics.checkNotNull(drawable2);
        this.a = drawable2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recyclerView, "parent");
        String string2 = "state";
        Intrinsics.checkNotNullParameter(recyclerView$y, string2);
        super.getItemOffsets(rect, view, recyclerView, recyclerView$y);
        int n3 = recyclerView.getChildAdapterPosition(view);
        if (n3 == 0) {
            return;
        }
        rect.top = n3 = this.a.getIntrinsicHeight();
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(recyclerView, "parent");
        String string2 = "state";
        Intrinsics.checkNotNullParameter(recyclerView$y, string2);
        float f5 = hv3_0.x(20.0f);
        int n3 = (int)f5;
        int n4 = recyclerView.getWidth() - n3;
        int n7 = recyclerView.getChildCount();
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8 = n7 + -1;
            if (i3 == n8) continue;
            View view = recyclerView.getChildAt(i3);
            Object object = view.getLayoutParams();
            String string3 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams";
            Intrinsics.checkNotNull(object, string3);
            object = (RecyclerView$LayoutParams)((Object)object);
            n8 = view.getBottom();
            int n10 = object.bottomMargin;
            object = this.a;
            int n14 = object.getIntrinsicHeight() + (n8 += n10);
            object.setBounds(n3, n8, n4, n14);
            object.draw(canvas);
        }
    }
}

