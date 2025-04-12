/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
package com.google.android.material.color;

import android.graphics.Bitmap;
import com.google.android.material.color.DynamicColors$OnAppliedCallback;
import com.google.android.material.color.DynamicColors$Precondition;
import com.google.android.material.color.DynamicColorsOptions$1;
import com.google.android.material.color.DynamicColorsOptions$2;
import com.google.android.material.color.DynamicColorsOptions$Builder;
import com.google.android.material.color.utilities.QuantizerCelebi;
import com.google.android.material.color.utilities.Score;

public class DynamicColorsOptions {
    private static final DynamicColors$Precondition ALWAYS_ALLOW;
    private static final DynamicColors$OnAppliedCallback NO_OP_CALLBACK;
    private Integer contentBasedSeedColor;
    private final DynamicColors$OnAppliedCallback onAppliedCallback;
    private final DynamicColors$Precondition precondition;
    private final int themeOverlay;

    static {
        Object object = new DynamicColorsOptions$1();
        ALWAYS_ALLOW = object;
        NO_OP_CALLBACK = object = new DynamicColorsOptions$2();
    }

    private DynamicColorsOptions(DynamicColorsOptions$Builder object) {
        int n3;
        this.themeOverlay = n3 = DynamicColorsOptions$Builder.access$000((DynamicColorsOptions$Builder)object);
        Object object2 = DynamicColorsOptions$Builder.access$100((DynamicColorsOptions$Builder)object);
        this.precondition = object2;
        this.onAppliedCallback = object2 = DynamicColorsOptions$Builder.access$200((DynamicColorsOptions$Builder)object);
        object2 = DynamicColorsOptions$Builder.access$300((DynamicColorsOptions$Builder)object);
        if (object2 != null) {
            this.contentBasedSeedColor = object = DynamicColorsOptions$Builder.access$300((DynamicColorsOptions$Builder)object);
        } else {
            object2 = DynamicColorsOptions$Builder.access$400((DynamicColorsOptions$Builder)object);
            if (object2 != null) {
                int n4 = DynamicColorsOptions.extractSeedColorFromImage(DynamicColorsOptions$Builder.access$400((DynamicColorsOptions$Builder)object));
                this.contentBasedSeedColor = object = Integer.valueOf(n4);
            }
        }
    }

    public /* synthetic */ DynamicColorsOptions(DynamicColorsOptions$Builder dynamicColorsOptions$Builder, DynamicColorsOptions$1 var2_2) {
        this(dynamicColorsOptions$Builder);
    }

    public static /* synthetic */ DynamicColors$Precondition access$500() {
        return ALWAYS_ALLOW;
    }

    public static /* synthetic */ DynamicColors$OnAppliedCallback access$600() {
        return NO_OP_CALLBACK;
    }

    private static int extractSeedColorFromImage(Bitmap bitmap) {
        int n3 = bitmap.getWidth();
        int n4 = bitmap.getHeight();
        int[] nArray = new int[n3 * n4];
        bitmap.getPixels(nArray, 0, n3, 0, 0, n3, n4);
        return (Integer)Score.score(QuantizerCelebi.quantize(nArray, 128)).get(0);
    }

    public Integer getContentBasedSeedColor() {
        return this.contentBasedSeedColor;
    }

    public DynamicColors$OnAppliedCallback getOnAppliedCallback() {
        return this.onAppliedCallback;
    }

    public DynamicColors$Precondition getPrecondition() {
        return this.precondition;
    }

    public int getThemeOverlay() {
        return this.themeOverlay;
    }
}

