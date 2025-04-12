/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.button;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButton$OnPressedChangeListener;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.button.MaterialButtonToggleGroup$1;

class MaterialButtonToggleGroup$PressedStateTracker
implements MaterialButton$OnPressedChangeListener {
    final /* synthetic */ MaterialButtonToggleGroup this$0;

    private MaterialButtonToggleGroup$PressedStateTracker(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.this$0 = materialButtonToggleGroup;
    }

    public /* synthetic */ MaterialButtonToggleGroup$PressedStateTracker(MaterialButtonToggleGroup materialButtonToggleGroup, MaterialButtonToggleGroup$1 materialButtonToggleGroup$1) {
        this(materialButtonToggleGroup);
    }

    public void onPressedChanged(MaterialButton materialButton, boolean bl2) {
        this.this$0.invalidate();
    }
}

