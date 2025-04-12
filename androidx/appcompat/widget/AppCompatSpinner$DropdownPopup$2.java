/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatSpinner$DropdownPopup;

class AppCompatSpinner$DropdownPopup$2
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AppCompatSpinner$DropdownPopup a;

    public AppCompatSpinner$DropdownPopup$2(AppCompatSpinner$DropdownPopup dropdownPopup) {
        this.a = dropdownPopup;
    }

    public final void onGlobalLayout() {
        Rect rect;
        boolean bl2;
        AppCompatSpinner$DropdownPopup appCompatSpinner$DropdownPopup = this.a;
        AppCompatSpinner appCompatSpinner = appCompatSpinner$DropdownPopup.H;
        appCompatSpinner$DropdownPopup.getClass();
        boolean bl3 = appCompatSpinner.isAttachedToWindow();
        if (bl3 && (bl2 = appCompatSpinner.getGlobalVisibleRect(rect = appCompatSpinner$DropdownPopup.F))) {
            appCompatSpinner$DropdownPopup.q();
            appCompatSpinner$DropdownPopup.show();
        } else {
            appCompatSpinner$DropdownPopup.dismiss();
        }
    }
}

