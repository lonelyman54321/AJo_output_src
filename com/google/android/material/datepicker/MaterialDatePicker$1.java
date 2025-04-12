/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import java.util.AbstractCollection;

class MaterialDatePicker$1
implements View.OnClickListener {
    final /* synthetic */ MaterialDatePicker this$0;

    public MaterialDatePicker$1(MaterialDatePicker materialDatePicker) {
        this.this$0 = materialDatePicker;
    }

    public void onClick(View object) {
        boolean bl2;
        object = ((AbstractCollection)MaterialDatePicker.access$000(this.this$0)).iterator();
        while (bl2 = object.hasNext()) {
            MaterialPickerOnPositiveButtonClickListener materialPickerOnPositiveButtonClickListener = (MaterialPickerOnPositiveButtonClickListener)object.next();
            Object object2 = this.this$0.getSelection();
            materialPickerOnPositiveButtonClickListener.onPositiveButtonClick(object2);
        }
        this.this$0.dismiss();
    }
}

