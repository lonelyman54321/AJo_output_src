/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.PopupWindow
 */
package com.google.android.material.textfield;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

class MaterialAutoCompleteTextView$1
implements AdapterView.OnItemClickListener {
    final /* synthetic */ MaterialAutoCompleteTextView this$0;

    public MaterialAutoCompleteTextView$1(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        this.this$0 = materialAutoCompleteTextView;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void onItemClick(AdapterView object, View object2, int n3, long l2) {
        PopupWindow popupWindow;
        int n4;
        int n7 = 0;
        Object var1_2 = null;
        Object object3 = this.this$0;
        if (n4 < 0) {
            object3 = MaterialAutoCompleteTextView.access$000((MaterialAutoCompleteTextView)object3);
            popupWindow = ((ListPopupWindow)object3).z;
            boolean bl2 = popupWindow.isShowing();
            object3 = !bl2 ? null : ((ListPopupWindow)object3).c.getSelectedItem();
        } else {
            object3 = object3.getAdapter().getItem(n4);
        }
        MaterialAutoCompleteTextView.access$100(this.this$0, object3);
        object3 = this.this$0;
        popupWindow = object3.getOnItemClickListener();
        if (popupWindow != null) {
            void var2_13;
            long l3;
            void var2_12;
            if (var2_12 == null || n4 < 0) {
                void var1_4;
                ListPopupWindow listPopupWindow = MaterialAutoCompleteTextView.access$000(this.this$0);
                PopupWindow popupWindow2 = listPopupWindow.z;
                n4 = (int)(popupWindow2.isShowing() ? 1 : 0);
                if (n4 != 0) {
                    View view = listPopupWindow.c.getSelectedView();
                }
                void var2_15 = var1_4;
                ListPopupWindow listPopupWindow2 = MaterialAutoCompleteTextView.access$000(this.this$0);
                popupWindow2 = listPopupWindow2.z;
                n4 = (int)(popupWindow2.isShowing() ? 1 : 0);
                if (n4 == 0) {
                    n7 = -1;
                    n4 = -1;
                } else {
                    DropDownListView dropDownListView = listPopupWindow2.c;
                    n4 = n7 = dropDownListView.getSelectedItemPosition();
                }
                ListPopupWindow listPopupWindow3 = MaterialAutoCompleteTextView.access$000(this.this$0);
                PopupWindow popupWindow3 = listPopupWindow3.z;
                boolean bl3 = popupWindow3.isShowing();
                if (!bl3) {
                    l3 = Long.MIN_VALUE;
                } else {
                    DropDownListView dropDownListView = listPopupWindow3.c;
                    l3 = dropDownListView.getSelectedItemId();
                }
            }
            ListPopupWindow listPopupWindow = MaterialAutoCompleteTextView.access$000(this.this$0);
            DropDownListView dropDownListView = listPopupWindow.c;
            popupWindow.onItemClick((AdapterView)dropDownListView, (View)var2_13, n4, l3);
        }
        MaterialAutoCompleteTextView.access$000(this.this$0).dismiss();
    }
}

