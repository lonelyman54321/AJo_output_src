/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$OnHierarchyChangeListener
 */
package com.google.android.material.chip;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.chip.ChipGroup$1;
import com.google.android.material.internal.CheckableGroup;
import com.google.android.material.internal.MaterialCheckable;

class ChipGroup$PassThroughHierarchyChangeListener
implements ViewGroup.OnHierarchyChangeListener {
    private ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;
    final /* synthetic */ ChipGroup this$0;

    private ChipGroup$PassThroughHierarchyChangeListener(ChipGroup chipGroup) {
        this.this$0 = chipGroup;
    }

    public /* synthetic */ ChipGroup$PassThroughHierarchyChangeListener(ChipGroup chipGroup, ChipGroup.1 var2_2) {
        this(chipGroup);
    }

    public static /* synthetic */ ViewGroup.OnHierarchyChangeListener access$302(ChipGroup$PassThroughHierarchyChangeListener chipGroup$PassThroughHierarchyChangeListener, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        chipGroup$PassThroughHierarchyChangeListener.onHierarchyChangeListener = onHierarchyChangeListener;
        return onHierarchyChangeListener;
    }

    public void onChildViewAdded(View view, View view2) {
        int n3;
        Object object = this.this$0;
        if (view == object && (n3 = view2 instanceof Chip) != 0) {
            int n4;
            n3 = view2.getId();
            if (n3 == (n4 = -1)) {
                object = ViewCompat.a;
                n3 = View.generateViewId();
                view2.setId(n3);
            }
            object = ChipGroup.access$200(this.this$0);
            Object object2 = view2;
            object2 = (Chip)view2;
            ((CheckableGroup)object).addCheckable((MaterialCheckable)object2);
        }
        if ((object = this.onHierarchyChangeListener) != null) {
            object.onChildViewAdded(view, view2);
        }
    }

    public void onChildViewRemoved(View view, View view2) {
        boolean bl2;
        Object object = this.this$0;
        if (view == object && (bl2 = view2 instanceof Chip)) {
            object = ChipGroup.access$200(object);
            Object object2 = view2;
            object2 = (Chip)view2;
            ((CheckableGroup)object).removeCheckable((MaterialCheckable)object2);
        }
        if ((object = this.onHierarchyChangeListener) != null) {
            object.onChildViewRemoved(view, view2);
        }
    }
}

