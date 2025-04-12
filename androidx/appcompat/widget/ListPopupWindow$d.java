/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.AbsListView
 *  android.widget.AbsListView$OnScrollListener
 *  android.widget.PopupWindow
 */
package androidx.appcompat.widget;

import android.widget.AbsListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable;

public final class ListPopupWindow$d
implements AbsListView.OnScrollListener {
    public final /* synthetic */ ListPopupWindow a;

    public ListPopupWindow$d(ListPopupWindow listPopupWindow) {
        this.a = listPopupWindow;
    }

    public final void onScroll(AbsListView absListView, int n3, int n4, int n7) {
    }

    public final void onScrollStateChanged(AbsListView object, int n3) {
        int n4 = 1;
        if (n3 == n4) {
            int n7;
            object = this.a;
            PopupWindow popupWindow = ((ListPopupWindow)object).z;
            n3 = popupWindow.getInputMethodMode();
            if (n3 != (n7 = 2) && (popupWindow = ((ListPopupWindow)object).z.getContentView()) != null) {
                popupWindow = ((ListPopupWindow)object).v;
                object = ((ListPopupWindow)object).r;
                popupWindow.removeCallbacks((Runnable)object);
                ((ListPopupWindow$ResizePopupRunnable)object).run();
            }
        }
    }
}

