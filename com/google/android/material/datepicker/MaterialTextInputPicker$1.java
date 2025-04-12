/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import com.google.android.material.datepicker.MaterialTextInputPicker;
import com.google.android.material.datepicker.OnSelectionChangedListener;
import java.util.AbstractCollection;
import java.util.Iterator;

class MaterialTextInputPicker$1
extends OnSelectionChangedListener {
    final /* synthetic */ MaterialTextInputPicker this$0;

    public MaterialTextInputPicker$1(MaterialTextInputPicker materialTextInputPicker) {
        this.this$0 = materialTextInputPicker;
    }

    public void onIncompleteSelectionChanged() {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this.this$0.onSelectionChangedListeners).iterator();
        while (bl2 = iterator.hasNext()) {
            OnSelectionChangedListener onSelectionChangedListener = (OnSelectionChangedListener)iterator.next();
            onSelectionChangedListener.onIncompleteSelectionChanged();
        }
    }

    public void onSelectionChanged(Object object) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this.this$0.onSelectionChangedListeners).iterator();
        while (bl2 = iterator.hasNext()) {
            OnSelectionChangedListener onSelectionChangedListener = (OnSelectionChangedListener)iterator.next();
            onSelectionChangedListener.onSelectionChanged(object);
        }
    }
}

