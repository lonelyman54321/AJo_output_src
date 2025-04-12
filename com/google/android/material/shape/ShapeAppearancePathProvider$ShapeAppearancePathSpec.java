/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.RectF
 */
package com.google.android.material.shape;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider$PathListener;

final class ShapeAppearancePathProvider$ShapeAppearancePathSpec {
    public final RectF bounds;
    public final float interpolation;
    public final Path path;
    public final ShapeAppearancePathProvider$PathListener pathListener;
    public final ShapeAppearanceModel shapeAppearanceModel;

    public ShapeAppearancePathProvider$ShapeAppearancePathSpec(ShapeAppearanceModel shapeAppearanceModel, float f5, RectF rectF, ShapeAppearancePathProvider$PathListener shapeAppearancePathProvider$PathListener, Path path) {
        this.pathListener = shapeAppearancePathProvider$PathListener;
        this.shapeAppearanceModel = shapeAppearanceModel;
        this.interpolation = f5;
        this.bounds = rectF;
        this.path = path;
    }
}

