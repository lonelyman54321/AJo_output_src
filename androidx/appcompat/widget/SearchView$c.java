/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 */
package androidx.appcompat.widget;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.R$dimen;
import androidx.appcompat.widget.SearchView;

public final class SearchView$c
implements View.OnLayoutChangeListener {
    public final /* synthetic */ SearchView a;

    public SearchView$c(SearchView searchView) {
        this.a = searchView;
    }

    public final void onLayoutChange(View object, int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16) {
        object = this.a;
        View view = object.i;
        n4 = view.getWidth();
        if (n4 > (n7 = 1)) {
            Resources resources = object.getContext().getResources();
            View view2 = object.c;
            n8 = view2.getPaddingLeft();
            Rect rect = new Rect();
            n14 = (int)(dE3.a ? 1 : 0);
            n14 = object.getLayoutDirection();
            n15 = 0;
            if (n14 != n7) {
                n7 = 0;
            }
            n14 = (int)(object.y ? 1 : 0);
            if (n14 != 0) {
                n14 = R$dimen.abc_dropdownitem_icon_width;
                n14 = resources.getDimensionPixelSize(n14);
                n15 = R$dimen.abc_dropdownitem_text_padding_left;
                n4 = resources.getDimensionPixelSize(n15);
                n15 = n4 + n14;
            }
            object = object.a;
            resources = object.getDropDownBackground();
            resources.getPadding(rect);
            if (n7 != 0) {
                n4 = -rect.left;
            } else {
                n4 = rect.left + n15;
                n4 = n8 - n4;
            }
            object.setDropDownHorizontalOffset(n4);
            n3 = view.getWidth();
            n4 = rect.left;
            n3 += n4;
            n4 = rect.right;
            n3 = n3 + n4 + n15 - n8;
            object.setDropDownWidth(n3);
        }
    }
}

