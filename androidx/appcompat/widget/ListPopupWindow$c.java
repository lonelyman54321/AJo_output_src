/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.DataSetObserver
 *  android.widget.PopupWindow
 */
package androidx.appcompat.widget;

import android.database.DataSetObserver;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ListPopupWindow;

public final class ListPopupWindow$c
extends DataSetObserver {
    public final /* synthetic */ ListPopupWindow a;

    public ListPopupWindow$c(ListPopupWindow listPopupWindow) {
        this.a = listPopupWindow;
    }

    public final void onChanged() {
        ListPopupWindow listPopupWindow = this.a;
        PopupWindow popupWindow = listPopupWindow.z;
        boolean bl2 = popupWindow.isShowing();
        if (bl2) {
            listPopupWindow.show();
        }
    }

    public final void onInvalidated() {
        this.a.dismiss();
    }
}

