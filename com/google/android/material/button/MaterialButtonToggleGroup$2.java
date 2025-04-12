/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.button;

import android.view.View;
import androidx.core.view.a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;

class MaterialButtonToggleGroup$2
extends a {
    final /* synthetic */ MaterialButtonToggleGroup this$0;

    public MaterialButtonToggleGroup$2(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.this$0 = materialButtonToggleGroup;
    }

    public void onInitializeAccessibilityNodeInfo(View object, C2 c2) {
        super.onInitializeAccessibilityNodeInfo((View)object, c2);
        int n3 = MaterialButtonToggleGroup.access$100(this.this$0, object);
        boolean bl2 = ((MaterialButton)object).isChecked();
        object = C2$f.a(0, 1, n3, 1, false, bl2);
        c2.n((C2$f)object);
    }
}

