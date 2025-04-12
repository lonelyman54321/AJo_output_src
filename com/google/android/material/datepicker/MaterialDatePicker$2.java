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
import java.util.AbstractCollection;
import java.util.Iterator;

class MaterialDatePicker$2
implements View.OnClickListener {
    final /* synthetic */ MaterialDatePicker this$0;

    public MaterialDatePicker$2(MaterialDatePicker materialDatePicker) {
        this.this$0 = materialDatePicker;
    }

    public void onClick(View view) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)MaterialDatePicker.access$100(this.this$0)).iterator();
        while (bl2 = iterator.hasNext()) {
            View.OnClickListener onClickListener = (View.OnClickListener)iterator.next();
            onClickListener.onClick(view);
        }
        this.this$0.dismiss();
    }
}

