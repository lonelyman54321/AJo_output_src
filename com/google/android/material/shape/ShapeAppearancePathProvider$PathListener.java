/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 */
package com.google.android.material.shape;

import android.graphics.Matrix;
import com.google.android.material.shape.ShapePath;

public interface ShapeAppearancePathProvider$PathListener {
    public void onCornerPathCreated(ShapePath var1, Matrix var2, int var3);

    public void onEdgePathCreated(ShapePath var1, Matrix var2, int var3);
}

