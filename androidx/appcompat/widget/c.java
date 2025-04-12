/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemSelectedListener
 */
package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.ListPopupWindow;

public final class c
implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ ListPopupWindow a;

    public c(ListPopupWindow listPopupWindow) {
        this.a = listPopupWindow;
    }

    public final void onItemSelected(AdapterView object, View view, int n3, long l2) {
        int n4 = -1;
        if (n3 != n4 && (object = this.a.c) != null) {
            ((DropDownListView)((Object)object)).setListSelectionHidden(false);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}

