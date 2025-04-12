/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color;

import com.google.android.material.color.HarmonizedColorAttributes;
import com.google.android.material.color.HarmonizedColorsOptions$1;
import com.google.android.material.color.HarmonizedColorsOptions$Builder;

public class HarmonizedColorsOptions {
    private final int colorAttributeToHarmonizeWith;
    private final HarmonizedColorAttributes colorAttributes;
    private final int[] colorResourceIds;

    private HarmonizedColorsOptions(HarmonizedColorsOptions$Builder harmonizedColorsOptions$Builder) {
        int n3;
        Object object = HarmonizedColorsOptions$Builder.access$000(harmonizedColorsOptions$Builder);
        this.colorResourceIds = object;
        object = HarmonizedColorsOptions$Builder.access$100(harmonizedColorsOptions$Builder);
        this.colorAttributes = object;
        this.colorAttributeToHarmonizeWith = n3 = HarmonizedColorsOptions$Builder.access$200(harmonizedColorsOptions$Builder);
    }

    public /* synthetic */ HarmonizedColorsOptions(HarmonizedColorsOptions$Builder harmonizedColorsOptions$Builder, HarmonizedColorsOptions$1 harmonizedColorsOptions$1) {
        this(harmonizedColorsOptions$Builder);
    }

    public static HarmonizedColorsOptions createMaterialDefaults() {
        HarmonizedColorsOptions$Builder harmonizedColorsOptions$Builder = new HarmonizedColorsOptions$Builder();
        HarmonizedColorAttributes harmonizedColorAttributes = HarmonizedColorAttributes.createMaterialDefaults();
        return harmonizedColorsOptions$Builder.setColorAttributes(harmonizedColorAttributes).build();
    }

    public int getColorAttributeToHarmonizeWith() {
        return this.colorAttributeToHarmonizeWith;
    }

    public HarmonizedColorAttributes getColorAttributes() {
        return this.colorAttributes;
    }

    public int[] getColorResourceIds() {
        return this.colorResourceIds;
    }

    public int getThemeOverlayResourceId(int n3) {
        int n4;
        HarmonizedColorAttributes harmonizedColorAttributes = this.colorAttributes;
        if (harmonizedColorAttributes != null && (n4 = harmonizedColorAttributes.getThemeOverlay()) != 0) {
            HarmonizedColorAttributes harmonizedColorAttributes2 = this.colorAttributes;
            n3 = harmonizedColorAttributes2.getThemeOverlay();
        }
        return n3;
    }
}

