/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 */
package com.google.android.material.shape;

import android.graphics.Matrix;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearancePathProvider$PathListener;
import com.google.android.material.shape.ShapePath;
import com.google.android.material.shape.ShapePath$ShadowCompatOperation;

class MaterialShapeDrawable$1
implements ShapeAppearancePathProvider$PathListener {
    final /* synthetic */ MaterialShapeDrawable this$0;

    public MaterialShapeDrawable$1(MaterialShapeDrawable materialShapeDrawable) {
        this.this$0 = materialShapeDrawable;
    }

    public void onCornerPathCreated(ShapePath object, Matrix matrix, int n3) {
        ShapePath$ShadowCompatOperation[] shapePath$ShadowCompatOperationArray = MaterialShapeDrawable.access$000(this.this$0);
        boolean bl2 = ((ShapePath)object).containsIncompatibleShadowOp();
        shapePath$ShadowCompatOperationArray.set(n3, bl2);
        shapePath$ShadowCompatOperationArray = MaterialShapeDrawable.access$100(this.this$0);
        shapePath$ShadowCompatOperationArray[n3] = object = ((ShapePath)object).createShadowCompatOperation(matrix);
    }

    public void onEdgePathCreated(ShapePath object, Matrix matrix, int n3) {
        ShapePath$ShadowCompatOperation[] shapePath$ShadowCompatOperationArray = MaterialShapeDrawable.access$000(this.this$0);
        int n4 = n3 + 4;
        boolean bl2 = ((ShapePath)object).containsIncompatibleShadowOp();
        shapePath$ShadowCompatOperationArray.set(n4, bl2);
        shapePath$ShadowCompatOperationArray = MaterialShapeDrawable.access$200(this.this$0);
        shapePath$ShadowCompatOperationArray[n3] = object = ((ShapePath)object).createShadowCompatOperation(matrix);
    }
}

