/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package androidx.appcompat.view.menu;

import android.view.ViewTreeObserver;
import androidx.appcompat.view.menu.CascadingMenuPopup;
import androidx.appcompat.view.menu.CascadingMenuPopup$c;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.MenuPopupWindow;
import java.util.ArrayList;

class CascadingMenuPopup$1
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ CascadingMenuPopup a;

    public CascadingMenuPopup$1(CascadingMenuPopup cascadingMenuPopup) {
        this.a = cascadingMenuPopup;
    }

    public final void onGlobalLayout() {
        Object object;
        int n3;
        Object object2 = this.a;
        boolean bl2 = ((CascadingMenuPopup)object2).a();
        if (bl2 && (n3 = ((ArrayList)(object = ((CascadingMenuPopup)object2).i)).size()) > 0) {
            MenuPopupWindow menuPopupWindow = ((CascadingMenuPopup$c)((ArrayList)object).get((int)0)).a;
            n3 = (int)(menuPopupWindow.y ? 1 : 0);
            if (n3 == 0) {
                menuPopupWindow = ((CascadingMenuPopup)object2).p;
                if (menuPopupWindow != null && (n3 = (int)(menuPopupWindow.isShown() ? 1 : 0)) != 0) {
                    object2 = ((ArrayList)object).iterator();
                    while (bl2 = object2.hasNext()) {
                        object = ((CascadingMenuPopup$c)object2.next()).a;
                        ((ListPopupWindow)object).show();
                    }
                } else {
                    ((CascadingMenuPopup)object2).dismiss();
                }
            }
        }
    }
}

