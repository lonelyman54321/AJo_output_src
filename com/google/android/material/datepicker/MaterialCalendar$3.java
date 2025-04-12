/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import androidx.recyclerview.widget.RecyclerView$f;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.MaterialCalendar$OnDayClickListener;
import com.google.android.material.datepicker.OnSelectionChangedListener;
import java.util.AbstractCollection;

class MaterialCalendar$3
implements MaterialCalendar$OnDayClickListener {
    final /* synthetic */ MaterialCalendar this$0;

    public MaterialCalendar$3(MaterialCalendar materialCalendar) {
        this.this$0 = materialCalendar;
    }

    public void onDayClick(long l2) {
        Object object = MaterialCalendar.access$100(this.this$0).getDateValidator();
        boolean bl2 = object.isValid(l2);
        if (bl2) {
            boolean bl3;
            object = MaterialCalendar.access$200(this.this$0);
            object.select(l2);
            Object object2 = ((AbstractCollection)this.this$0.onSelectionChangedListeners).iterator();
            while (bl3 = object2.hasNext()) {
                OnSelectionChangedListener onSelectionChangedListener = (OnSelectionChangedListener)object2.next();
                object = MaterialCalendar.access$200(this.this$0).getSelection();
                onSelectionChangedListener.onSelectionChanged(object);
            }
            MaterialCalendar.access$000(this.this$0).getAdapter().notifyDataSetChanged();
            object2 = MaterialCalendar.access$300(this.this$0);
            if (object2 != null) {
                object2 = MaterialCalendar.access$300(this.this$0).getAdapter();
                ((RecyclerView$f)object2).notifyDataSetChanged();
            }
        }
    }
}

