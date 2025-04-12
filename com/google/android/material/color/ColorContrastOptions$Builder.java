/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color;

import com.google.android.material.color.ColorContrastOptions;

public class ColorContrastOptions$Builder {
    private int highContrastThemeOverlayResourceId;
    private int mediumContrastThemeOverlayResourceId;

    public static /* synthetic */ int access$000(ColorContrastOptions$Builder colorContrastOptions$Builder) {
        return colorContrastOptions$Builder.mediumContrastThemeOverlayResourceId;
    }

    public static /* synthetic */ int access$100(ColorContrastOptions$Builder colorContrastOptions$Builder) {
        return colorContrastOptions$Builder.highContrastThemeOverlayResourceId;
    }

    public ColorContrastOptions build() {
        ColorContrastOptions colorContrastOptions = new ColorContrastOptions(this, null);
        return colorContrastOptions;
    }

    public ColorContrastOptions$Builder setHighContrastThemeOverlay(int n3) {
        this.highContrastThemeOverlayResourceId = n3;
        return this;
    }

    public ColorContrastOptions$Builder setMediumContrastThemeOverlay(int n3) {
        this.mediumContrastThemeOverlayResourceId = n3;
        return this;
    }
}

