/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.view.View
 */
package androidx.preference;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.preference.PreferenceFragmentCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$y;

public final class PreferenceFragmentCompat$b
extends RecyclerView$n {
    public Drawable a;
    public int b;
    public boolean c = true;
    public final /* synthetic */ PreferenceFragmentCompat d;

    public PreferenceFragmentCompat$b(PreferenceFragmentCompat preferenceFragmentCompat) {
        this.d = preferenceFragmentCompat;
    }

    public final boolean f(RecyclerView object, View view) {
        RecyclerView$B recyclerView$B = ((RecyclerView)object).getChildViewHolder(view);
        int n3 = recyclerView$B instanceof ly2_1;
        boolean bl2 = false;
        if (n3 != 0) {
            recyclerView$B = (ly2_1)recyclerView$B;
            boolean bl3 = ((ly2_1)recyclerView$B).e;
            if (bl3) {
                bl3 = this.c;
                int n4 = object.indexOfChild(view);
                n3 = object.getChildCount();
                int n7 = 1;
                if (n4 < (n3 -= n7)) {
                    n4 += n7;
                    view = object.getChildAt(n4);
                    if ((n4 = (object = ((RecyclerView)object).getChildViewHolder(view)) instanceof ly2_1) != 0) {
                        object = (ly2_1)object;
                        boolean bl4 = ((ly2_1)object).d;
                        if (bl4) {
                            bl2 = true;
                        }
                    }
                    bl3 = bl2;
                }
                return bl3;
            }
        }
        return false;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        int n3 = this.f(recyclerView, view);
        if (n3 != 0) {
            rect.bottom = n3 = this.b;
        }
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        recyclerView$y = this.a;
        if (recyclerView$y == null) {
            return;
        }
        int n3 = recyclerView.getChildCount();
        int n4 = recyclerView.getWidth();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = recyclerView.getChildAt(i3);
            int n7 = this.f(recyclerView, view);
            if (n7 == 0) continue;
            float f5 = view.getY();
            n7 = (int)f5;
            int n8 = view.getHeight() + n7;
            Drawable drawable2 = this.a;
            int n10 = this.b + n8;
            drawable2.setBounds(0, n8, n4, n10);
            view = this.a;
            view.draw(canvas);
        }
    }
}

