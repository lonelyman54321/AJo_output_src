/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.widget.PopupWindow
 */
package androidx.appcompat.widget;

import android.graphics.Rect;
import android.widget.PopupWindow;

public final class ListPopupWindow$b {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean bl2) {
        popupWindow.setIsClippedToScreen(bl2);
    }
}

