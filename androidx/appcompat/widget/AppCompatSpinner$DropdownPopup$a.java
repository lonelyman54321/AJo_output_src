/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListAdapter
 */
package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatSpinner$DropdownPopup;
import androidx.appcompat.widget.ListPopupWindow;

public final class AppCompatSpinner$DropdownPopup$a
implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AppCompatSpinner$DropdownPopup a;

    public AppCompatSpinner$DropdownPopup$a(AppCompatSpinner$DropdownPopup appCompatSpinner$DropdownPopup) {
        this.a = appCompatSpinner$DropdownPopup;
    }

    public final void onItemClick(AdapterView object, View view, int n3, long l2) {
        object = this.a;
        ((AppCompatSpinner$DropdownPopup)object).H.setSelection(n3);
        Object object2 = ((AppCompatSpinner$DropdownPopup)object).H.getOnItemClickListener();
        if (object2 != null) {
            object2 = ((AppCompatSpinner$DropdownPopup)object).H;
            ListAdapter listAdapter = ((AppCompatSpinner$DropdownPopup)object).E;
            long l3 = listAdapter.getItemId(n3);
            object2.performItemClick(view, n3, l3);
        }
        ((ListPopupWindow)object).dismiss();
    }
}

