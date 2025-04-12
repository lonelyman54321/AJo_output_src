/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.widget.PopupWindow
 */
package androidx.appcompat.widget;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ListPopupWindow;

public final class ListPopupWindow$e
implements View.OnTouchListener {
    public final /* synthetic */ ListPopupWindow a;

    public ListPopupWindow$e(ListPopupWindow listPopupWindow) {
        this.a = listPopupWindow;
    }

    public final boolean onTouch(View view, MotionEvent object) {
        PopupWindow popupWindow;
        int n3;
        PopupWindow popupWindow2;
        int n4 = object.getAction();
        float f5 = object.getX();
        int n7 = (int)f5;
        float f6 = object.getY();
        int n8 = (int)f6;
        ListPopupWindow listPopupWindow = this.a;
        if (n4 == 0 && (popupWindow2 = listPopupWindow.z) != null && (n3 = popupWindow2.isShowing()) != 0 && n7 >= 0 && n7 < (n3 = (popupWindow2 = listPopupWindow.z).getWidth()) && n8 >= 0 && n8 < (n7 = (popupWindow = listPopupWindow.z).getHeight())) {
            view = listPopupWindow.v;
            object = listPopupWindow.r;
            long l2 = 250L;
            view.postDelayed((Runnable)object, l2);
        } else {
            n8 = 1;
            f6 = Float.MIN_VALUE;
            if (n4 == n8) {
                view = listPopupWindow.v;
                object = listPopupWindow.r;
                view.removeCallbacks((Runnable)object);
            }
        }
        return false;
    }
}

