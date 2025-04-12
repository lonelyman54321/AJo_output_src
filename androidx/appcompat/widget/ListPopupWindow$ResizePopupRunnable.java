/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.ListPopupWindow;

class ListPopupWindow$ResizePopupRunnable
implements Runnable {
    public final /* synthetic */ ListPopupWindow a;

    public ListPopupWindow$ResizePopupRunnable(ListPopupWindow listPopupWindow) {
        this.a = listPopupWindow;
    }

    public final void run() {
        DropDownListView dropDownListView;
        int n3;
        int n4;
        ListPopupWindow listPopupWindow = this.a;
        DropDownListView dropDownListView2 = listPopupWindow.c;
        if (dropDownListView2 != null && (n4 = dropDownListView2.isAttachedToWindow()) != 0 && (n4 = (dropDownListView2 = listPopupWindow.c).getCount()) > (n3 = (dropDownListView = listPopupWindow.c).getChildCount()) && (n4 = (dropDownListView2 = listPopupWindow.c).getChildCount()) <= (n3 = listPopupWindow.m)) {
            dropDownListView2 = listPopupWindow.z;
            n3 = 2;
            dropDownListView2.setInputMethodMode(n3);
            listPopupWindow.show();
        }
    }
}

