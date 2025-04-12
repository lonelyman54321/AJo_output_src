/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.chip;

import com.google.android.material.chip.ChipGroup;
import com.google.android.material.chip.ChipGroup$OnCheckedChangeListener;
import com.google.android.material.chip.ChipGroup$OnCheckedStateChangeListener;
import com.google.android.material.internal.CheckableGroup;
import java.util.List;

class ChipGroup$2
implements ChipGroup$OnCheckedStateChangeListener {
    final /* synthetic */ ChipGroup this$0;
    final /* synthetic */ ChipGroup$OnCheckedChangeListener val$listener;

    public ChipGroup$2(ChipGroup chipGroup, ChipGroup$OnCheckedChangeListener chipGroup$OnCheckedChangeListener) {
        this.this$0 = chipGroup;
        this.val$listener = chipGroup$OnCheckedChangeListener;
    }

    public void onCheckedChanged(ChipGroup chipGroup, List object) {
        object = ChipGroup.access$200(this.this$0);
        boolean bl2 = ((CheckableGroup)object).isSingleSelection();
        if (!bl2) {
            return;
        }
        object = this.val$listener;
        int n3 = this.this$0.getCheckedChipId();
        object.onCheckedChanged(chipGroup, n3);
    }
}

