/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.transition.platform;

import android.view.View;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$ShapeProvider;

public class MaterialContainerTransformSharedElementCallback$ShapeableViewShapeProvider
implements MaterialContainerTransformSharedElementCallback$ShapeProvider {
    public ShapeAppearanceModel provideShape(View object) {
        boolean bl2 = object instanceof Shapeable;
        object = bl2 ? ((Shapeable)object).getShapeAppearanceModel() : null;
        return object;
    }
}

