/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.button;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

class MaterialButtonToggleGroup$1
implements Comparator {
    final /* synthetic */ MaterialButtonToggleGroup this$0;

    public MaterialButtonToggleGroup$1(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.this$0 = materialButtonToggleGroup;
    }

    public int compare(MaterialButton object, MaterialButton object2) {
        boolean bl2;
        Boolean bl3;
        Boolean bl4 = ((MaterialButton)object).isChecked();
        int n3 = bl4.compareTo(bl3 = Boolean.valueOf(bl2 = ((MaterialButton)object2).isChecked()));
        if (n3 != 0) {
            return n3;
        }
        bl4 = object.isPressed();
        n3 = bl4.compareTo(bl3 = Boolean.valueOf(bl2 = object2.isPressed()));
        if (n3 != 0) {
            return n3;
        }
        object = this.this$0.indexOfChild((View)object);
        object2 = this.this$0.indexOfChild((View)object2);
        return ((Integer)object).compareTo((Integer)object2);
    }
}

