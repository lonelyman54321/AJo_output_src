/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package androidx.appcompat.view.menu;

import android.view.ViewTreeObserver;
import androidx.appcompat.view.menu.StandardMenuPopup;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.MenuPopupWindow;

class StandardMenuPopup$1
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ StandardMenuPopup a;

    public StandardMenuPopup$1(StandardMenuPopup standardMenuPopup) {
        this.a = standardMenuPopup;
    }

    public final void onGlobalLayout() {
        q43 q432 = this.a;
        boolean bl2 = ((StandardMenuPopup)q432).a();
        if (bl2) {
            MenuPopupWindow menuPopupWindow = ((StandardMenuPopup)q432).i;
            bl2 = menuPopupWindow.y;
            if (!bl2) {
                menuPopupWindow = ((StandardMenuPopup)q432).n;
                if (menuPopupWindow != null && (bl2 = menuPopupWindow.isShown())) {
                    q432 = ((StandardMenuPopup)q432).i;
                    ((ListPopupWindow)q432).show();
                } else {
                    ((StandardMenuPopup)q432).dismiss();
                }
            }
        }
    }
}

