/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color;

import com.google.android.material.R$attr;
import com.google.android.material.R$style;

public final class HarmonizedColorAttributes {
    private static final int[] HARMONIZED_MATERIAL_ATTRIBUTES;
    private final int[] attributes;
    private final int themeOverlay;

    static {
        int n3 = R$attr.colorError;
        int n4 = R$attr.colorOnError;
        int n7 = R$attr.colorErrorContainer;
        int n8 = R$attr.colorOnErrorContainer;
        HARMONIZED_MATERIAL_ATTRIBUTES = new int[]{n3, n4, n7, n8};
    }

    private HarmonizedColorAttributes(int[] object, int n3) {
        int n4;
        if (n3 != 0 && (n4 = ((int[])object).length) == 0) {
            object = new IllegalArgumentException;
            super("Theme overlay should be used with the accompanying int[] attributes.");
            throw object;
        }
        this.attributes = object;
        this.themeOverlay = n3;
    }

    public static HarmonizedColorAttributes create(int[] nArray) {
        HarmonizedColorAttributes harmonizedColorAttributes = new HarmonizedColorAttributes(nArray, 0);
        return harmonizedColorAttributes;
    }

    public static HarmonizedColorAttributes create(int[] nArray, int n3) {
        HarmonizedColorAttributes harmonizedColorAttributes = new HarmonizedColorAttributes(nArray, n3);
        return harmonizedColorAttributes;
    }

    public static HarmonizedColorAttributes createMaterialDefaults() {
        int[] nArray = HARMONIZED_MATERIAL_ATTRIBUTES;
        int n3 = R$style.ThemeOverlay_Material3_HarmonizedColors;
        return HarmonizedColorAttributes.create(nArray, n3);
    }

    public int[] getAttributes() {
        return this.attributes;
    }

    public int getThemeOverlay() {
        return this.themeOverlay;
    }
}

