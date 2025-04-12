/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color;

import com.google.android.material.R$attr;
import com.google.android.material.color.HarmonizedColorAttributes;
import com.google.android.material.color.HarmonizedColorsOptions;

public class HarmonizedColorsOptions$Builder {
    private int colorAttributeToHarmonizeWith;
    private HarmonizedColorAttributes colorAttributes;
    private int[] colorResourceIds;

    public HarmonizedColorsOptions$Builder() {
        int n3;
        int[] nArray = new int[]{};
        this.colorResourceIds = nArray;
        this.colorAttributeToHarmonizeWith = n3 = R$attr.colorPrimary;
    }

    public static /* synthetic */ int[] access$000(HarmonizedColorsOptions$Builder harmonizedColorsOptions$Builder) {
        return harmonizedColorsOptions$Builder.colorResourceIds;
    }

    public static /* synthetic */ HarmonizedColorAttributes access$100(HarmonizedColorsOptions$Builder harmonizedColorsOptions$Builder) {
        return harmonizedColorsOptions$Builder.colorAttributes;
    }

    public static /* synthetic */ int access$200(HarmonizedColorsOptions$Builder harmonizedColorsOptions$Builder) {
        return harmonizedColorsOptions$Builder.colorAttributeToHarmonizeWith;
    }

    public HarmonizedColorsOptions build() {
        HarmonizedColorsOptions harmonizedColorsOptions = new HarmonizedColorsOptions(this, null);
        return harmonizedColorsOptions;
    }

    public HarmonizedColorsOptions$Builder setColorAttributeToHarmonizeWith(int n3) {
        this.colorAttributeToHarmonizeWith = n3;
        return this;
    }

    public HarmonizedColorsOptions$Builder setColorAttributes(HarmonizedColorAttributes harmonizedColorAttributes) {
        this.colorAttributes = harmonizedColorAttributes;
        return this;
    }

    public HarmonizedColorsOptions$Builder setColorResourceIds(int[] nArray) {
        this.colorResourceIds = nArray;
        return this;
    }
}

