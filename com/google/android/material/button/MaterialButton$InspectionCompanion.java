/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.inspector.InspectionCompanion
 *  android.view.inspector.PropertyMapper
 *  android.view.inspector.PropertyReader
 */
package com.google.android.material.button;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import com.google.android.material.R$attr;
import com.google.android.material.button.MaterialButton;

public final class MaterialButton$InspectionCompanion
implements InspectionCompanion {
    private int mIconPaddingId;
    private boolean mPropertiesMapped = false;

    public void mapProperties(PropertyMapper propertyMapper) {
        int n3;
        int n4 = R$attr.iconPadding;
        this.mIconPaddingId = n3 = th1_1.a(propertyMapper, n4);
        this.mPropertiesMapped = true;
    }

    public void readProperties(MaterialButton materialButton, PropertyReader propertyReader) {
        int n3 = this.mPropertiesMapped;
        if (n3 != 0) {
            n3 = this.mIconPaddingId;
            int n4 = materialButton.getIconPadding();
            sh1_2.a(propertyReader, n3, n4);
            return;
        }
        throw uh1_2.a();
    }
}

