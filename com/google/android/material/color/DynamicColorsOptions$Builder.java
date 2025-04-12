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
import com.google.android.material.color.DynamicColorsOptions;

public class DynamicColorsOptions$Builder {
    private Bitmap contentBasedSourceBitmap;
    private Integer contentBasedSourceColor;
    private DynamicColors$OnAppliedCallback onAppliedCallback;
    private DynamicColors$Precondition precondition;
    private int themeOverlay;

    public DynamicColorsOptions$Builder() {
        Object object = DynamicColorsOptions.access$500();
        this.precondition = object;
        this.onAppliedCallback = object = DynamicColorsOptions.access$600();
    }

    public static /* synthetic */ int access$000(DynamicColorsOptions$Builder dynamicColorsOptions$Builder) {
        return dynamicColorsOptions$Builder.themeOverlay;
    }

    public static /* synthetic */ DynamicColors$Precondition access$100(DynamicColorsOptions$Builder dynamicColorsOptions$Builder) {
        return dynamicColorsOptions$Builder.precondition;
    }

    public static /* synthetic */ DynamicColors$OnAppliedCallback access$200(DynamicColorsOptions$Builder dynamicColorsOptions$Builder) {
        return dynamicColorsOptions$Builder.onAppliedCallback;
    }

    public static /* synthetic */ Integer access$300(DynamicColorsOptions$Builder dynamicColorsOptions$Builder) {
        return dynamicColorsOptions$Builder.contentBasedSourceColor;
    }

    public static /* synthetic */ Bitmap access$400(DynamicColorsOptions$Builder dynamicColorsOptions$Builder) {
        return dynamicColorsOptions$Builder.contentBasedSourceBitmap;
    }

    public DynamicColorsOptions build() {
        DynamicColorsOptions dynamicColorsOptions = new DynamicColorsOptions(this, null);
        return dynamicColorsOptions;
    }

    public DynamicColorsOptions$Builder setContentBasedSource(int n3) {
        Integer n4;
        this.contentBasedSourceBitmap = null;
        this.contentBasedSourceColor = n4 = Integer.valueOf(n3);
        return this;
    }

    public DynamicColorsOptions$Builder setContentBasedSource(Bitmap bitmap) {
        this.contentBasedSourceBitmap = bitmap;
        this.contentBasedSourceColor = null;
        return this;
    }

    public DynamicColorsOptions$Builder setOnAppliedCallback(DynamicColors$OnAppliedCallback dynamicColors$OnAppliedCallback) {
        this.onAppliedCallback = dynamicColors$OnAppliedCallback;
        return this;
    }

    public DynamicColorsOptions$Builder setPrecondition(DynamicColors$Precondition dynamicColors$Precondition) {
        this.precondition = dynamicColors$Precondition;
        return this;
    }

    public DynamicColorsOptions$Builder setThemeOverlay(int n3) {
        this.themeOverlay = n3;
        return this;
    }
}

