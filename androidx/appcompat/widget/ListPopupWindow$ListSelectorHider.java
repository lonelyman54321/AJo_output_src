/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.ListPopupWindow;

class ListPopupWindow$ListSelectorHider
implements Runnable {
    public final /* synthetic */ ListPopupWindow a;

    public ListPopupWindow$ListSelectorHider(ListPopupWindow listPopupWindow) {
        this.a = listPopupWindow;
    }

    public final void run() {
        DropDownListView dropDownListView = this.a.c;
        if (dropDownListView != null) {
            boolean bl2 = true;
            dropDownListView.setListSelectionHidden(bl2);
            dropDownListView.requestLayout();
        }
    }
}

