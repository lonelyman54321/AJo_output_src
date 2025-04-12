/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.OnSelectionChangedListener;
import java.util.AbstractCollection;
import java.util.LinkedHashSet;

abstract class PickerFragment
extends Fragment {
    protected final LinkedHashSet onSelectionChangedListeners;

    public PickerFragment() {
        LinkedHashSet linkedHashSet;
        this.onSelectionChangedListeners = linkedHashSet = new LinkedHashSet();
    }

    public boolean addOnSelectionChangedListener(OnSelectionChangedListener onSelectionChangedListener) {
        return ((AbstractCollection)this.onSelectionChangedListeners).add(onSelectionChangedListener);
    }

    public void clearOnSelectionChangedListeners() {
        ((AbstractCollection)this.onSelectionChangedListeners).clear();
    }

    public abstract DateSelector getDateSelector();

    public boolean removeOnSelectionChangedListener(OnSelectionChangedListener onSelectionChangedListener) {
        return ((AbstractCollection)this.onSelectionChangedListeners).remove(onSelectionChangedListener);
    }
}

