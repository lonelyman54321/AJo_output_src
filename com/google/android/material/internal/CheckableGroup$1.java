/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.internal;

import com.google.android.material.internal.CheckableGroup;
import com.google.android.material.internal.MaterialCheckable;
import com.google.android.material.internal.MaterialCheckable$OnCheckedChangeListener;

class CheckableGroup$1
implements MaterialCheckable$OnCheckedChangeListener {
    final /* synthetic */ CheckableGroup this$0;

    public CheckableGroup$1(CheckableGroup checkableGroup) {
        this.this$0 = checkableGroup;
    }

    public void onCheckedChanged(MaterialCheckable object, boolean bl2) {
        boolean bl3;
        CheckableGroup checkableGroup;
        boolean bl4;
        CheckableGroup checkableGroup2;
        boolean bl5;
        if (bl2 ? (bl5 = CheckableGroup.access$000(checkableGroup2 = this.this$0, (MaterialCheckable)object)) : (bl4 = CheckableGroup.access$200(checkableGroup = this.this$0, (MaterialCheckable)object, bl3 = CheckableGroup.access$100(checkableGroup)))) {
            object = this.this$0;
            CheckableGroup.access$300((CheckableGroup)object);
        }
    }
}

