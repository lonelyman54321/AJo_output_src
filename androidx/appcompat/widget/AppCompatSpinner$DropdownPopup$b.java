/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.PopupWindow$OnDismissListener
 */
package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatSpinner$DropdownPopup;

public final class AppCompatSpinner$DropdownPopup$b
implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;
    public final /* synthetic */ AppCompatSpinner$DropdownPopup b;

    public AppCompatSpinner$DropdownPopup$b(AppCompatSpinner$DropdownPopup appCompatSpinner$DropdownPopup, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2) {
        this.b = appCompatSpinner$DropdownPopup;
        this.a = onGlobalLayoutListener2;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.H.getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.a;
            viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener2);
        }
    }
}

