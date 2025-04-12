/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.chip;

import com.google.android.material.chip.ChipGroup;
import com.google.android.material.internal.CheckableGroup;
import com.google.android.material.internal.CheckableGroup$OnCheckedStateChangeListener;
import java.util.List;
import java.util.Set;

class ChipGroup$1
implements CheckableGroup$OnCheckedStateChangeListener {
    final /* synthetic */ ChipGroup this$0;

    public ChipGroup$1(ChipGroup chipGroup) {
        this.this$0 = chipGroup;
    }

    public void onCheckedStateChanged(Set object) {
        object = ChipGroup.access$100(this.this$0);
        if (object != null) {
            object = ChipGroup.access$100(this.this$0);
            ChipGroup chipGroup = this.this$0;
            Object object2 = ChipGroup.access$200(chipGroup);
            ChipGroup chipGroup2 = this.this$0;
            object2 = ((CheckableGroup)object2).getCheckedIdsSortedByChildOrder(chipGroup2);
            object.onCheckedChanged(chipGroup, (List)object2);
        }
    }
}

