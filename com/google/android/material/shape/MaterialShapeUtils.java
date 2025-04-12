/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.View
 */
package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.CutCornerTreatment;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;

public class MaterialShapeUtils {
    private MaterialShapeUtils() {
    }

    public static CornerTreatment createCornerTreatment(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                return MaterialShapeUtils.createDefaultCornerTreatment();
            }
            CutCornerTreatment cutCornerTreatment = new CutCornerTreatment();
            return cutCornerTreatment;
        }
        RoundedCornerTreatment roundedCornerTreatment = new RoundedCornerTreatment();
        return roundedCornerTreatment;
    }

    public static CornerTreatment createDefaultCornerTreatment() {
        RoundedCornerTreatment roundedCornerTreatment = new RoundedCornerTreatment();
        return roundedCornerTreatment;
    }

    public static EdgeTreatment createDefaultEdgeTreatment() {
        EdgeTreatment edgeTreatment = new EdgeTreatment();
        return edgeTreatment;
    }

    public static void setElevation(View object, float f5) {
        boolean bl2 = (object = object.getBackground()) instanceof MaterialShapeDrawable;
        if (bl2) {
            object = (MaterialShapeDrawable)object;
            ((MaterialShapeDrawable)object).setElevation(f5);
        }
    }

    public static void setParentAbsoluteElevation(View view) {
        Drawable drawable2 = view.getBackground();
        boolean bl2 = drawable2 instanceof MaterialShapeDrawable;
        if (bl2) {
            drawable2 = (MaterialShapeDrawable)drawable2;
            MaterialShapeUtils.setParentAbsoluteElevation(view, (MaterialShapeDrawable)drawable2);
        }
    }

    public static void setParentAbsoluteElevation(View view, MaterialShapeDrawable materialShapeDrawable) {
        boolean bl2 = materialShapeDrawable.isElevationOverlayEnabled();
        if (bl2) {
            float f5 = ViewUtils.getParentAbsoluteElevation(view);
            materialShapeDrawable.setParentAbsoluteElevation(f5);
        }
    }
}

