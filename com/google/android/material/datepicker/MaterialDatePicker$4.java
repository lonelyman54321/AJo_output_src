/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.OnSelectionChangedListener;

class MaterialDatePicker$4
extends OnSelectionChangedListener {
    final /* synthetic */ MaterialDatePicker this$0;

    public MaterialDatePicker$4(MaterialDatePicker materialDatePicker) {
        this.this$0 = materialDatePicker;
    }

    public void onIncompleteSelectionChanged() {
        MaterialDatePicker.access$300(this.this$0).setEnabled(false);
    }

    public void onSelectionChanged(Object object) {
        object = this.this$0;
        String string2 = ((MaterialDatePicker)object).getHeaderText();
        ((MaterialDatePicker)object).updateHeader(string2);
        object = MaterialDatePicker.access$300(this.this$0);
        boolean bl2 = MaterialDatePicker.access$200(this.this$0).isSelectionComplete();
        object.setEnabled(bl2);
    }
}

