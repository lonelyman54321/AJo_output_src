/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.transition.Transition
 *  android.widget.PopupWindow
 */
package androidx.appcompat.widget;

import android.transition.Transition;
import android.widget.PopupWindow;

public final class MenuPopupWindow$a {
    public static void a(PopupWindow popupWindow, Transition transition2) {
        popupWindow.setEnterTransition(transition2);
    }

    public static void b(PopupWindow popupWindow, Transition transition2) {
        popupWindow.setExitTransition(transition2);
    }
}

