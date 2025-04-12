/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.shape;

import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.CutCornerTreatment;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;

public final class ShapeAppearanceModel$Builder {
    private EdgeTreatment bottomEdge;
    private CornerTreatment bottomLeftCorner;
    private CornerSize bottomLeftCornerSize;
    private CornerTreatment bottomRightCorner;
    private CornerSize bottomRightCornerSize;
    private EdgeTreatment leftEdge;
    private EdgeTreatment rightEdge;
    private EdgeTreatment topEdge;
    private CornerTreatment topLeftCorner;
    private CornerSize topLeftCornerSize;
    private CornerTreatment topRightCorner;
    private CornerSize topRightCornerSize;

    public ShapeAppearanceModel$Builder() {
        Object object = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topLeftCorner = object;
        object = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topRightCorner = object;
        object = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomRightCorner = object;
        object = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomLeftCorner = object;
        this.topLeftCornerSize = object = new AbsoluteCornerSize(0.0f);
        this.topRightCornerSize = object = new AbsoluteCornerSize(0.0f);
        this.bottomRightCornerSize = object = new AbsoluteCornerSize(0.0f);
        this.bottomLeftCornerSize = object = new AbsoluteCornerSize(0.0f);
        this.topEdge = object = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.rightEdge = object = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.bottomEdge = object = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.leftEdge = object = MaterialShapeUtils.createDefaultEdgeTreatment();
    }

    public ShapeAppearanceModel$Builder(ShapeAppearanceModel object) {
        Object object2 = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topLeftCorner = object2;
        object2 = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topRightCorner = object2;
        object2 = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomRightCorner = object2;
        object2 = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomLeftCorner = object2;
        this.topLeftCornerSize = object2 = new AbsoluteCornerSize(0.0f);
        this.topRightCornerSize = object2 = new AbsoluteCornerSize(0.0f);
        this.bottomRightCornerSize = object2 = new AbsoluteCornerSize(0.0f);
        this.bottomLeftCornerSize = object2 = new AbsoluteCornerSize(0.0f);
        this.topEdge = object2 = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.rightEdge = object2 = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.bottomEdge = object2 = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.leftEdge = object2 = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.topLeftCorner = object2 = ((ShapeAppearanceModel)object).topLeftCorner;
        this.topRightCorner = object2 = ((ShapeAppearanceModel)object).topRightCorner;
        this.bottomRightCorner = object2 = ((ShapeAppearanceModel)object).bottomRightCorner;
        this.bottomLeftCorner = object2 = ((ShapeAppearanceModel)object).bottomLeftCorner;
        this.topLeftCornerSize = object2 = ((ShapeAppearanceModel)object).topLeftCornerSize;
        this.topRightCornerSize = object2 = ((ShapeAppearanceModel)object).topRightCornerSize;
        this.bottomRightCornerSize = object2 = ((ShapeAppearanceModel)object).bottomRightCornerSize;
        this.bottomLeftCornerSize = object2 = ((ShapeAppearanceModel)object).bottomLeftCornerSize;
        this.topEdge = object2 = ((ShapeAppearanceModel)object).topEdge;
        this.rightEdge = object2 = ((ShapeAppearanceModel)object).rightEdge;
        this.bottomEdge = object2 = ((ShapeAppearanceModel)object).bottomEdge;
        this.leftEdge = object = ((ShapeAppearanceModel)object).leftEdge;
    }

    public static /* synthetic */ CornerTreatment access$100(ShapeAppearanceModel$Builder shapeAppearanceModel$Builder) {
        return shapeAppearanceModel$Builder.topLeftCorner;
    }

    public static /* synthetic */ EdgeTreatment access$1000(ShapeAppearanceModel$Builder shapeAppearanceModel$Builder) {
        return shapeAppearanceModel$Builder.rightEdge;
    }

    public static /* synthetic */ EdgeTreatment access$1100(ShapeAppearanceModel$Builder shapeAppearanceModel$Builder) {
        return shapeAppearanceModel$Builder.bottomEdge;
    }

    public static /* synthetic */ EdgeTreatment access$1200(ShapeAppearanceModel$Builder shapeAppearanceModel$Builder) {
        return shapeAppearanceModel$Builder.leftEdge;
    }

    public static /* synthetic */ CornerTreatment access$200(ShapeAppearanceModel$Builder shapeAppearanceModel$Builder) {
        return shapeAppearanceModel$Builder.topRightCorner;
    }

    public static /* synthetic */ CornerTreatment access$300(ShapeAppearanceModel$Builder shapeAppearanceModel$Builder) {
        return shapeAppearanceModel$Builder.bottomRightCorner;
    }

    public static /* synthetic */ CornerTreatment access$400(ShapeAppearanceModel$Builder shapeAppearanceModel$Builder) {
        return shapeAppearanceModel$Builder.bottomLeftCorner;
    }

    public static /* synthetic */ CornerSize access$500(ShapeAppearanceModel$Builder shapeAppearanceModel$Builder) {
        return shapeAppearanceModel$Builder.topLeftCornerSize;
    }

    public static /* synthetic */ CornerSize access$600(ShapeAppearanceModel$Builder shapeAppearanceModel$Builder) {
        return shapeAppearanceModel$Builder.topRightCornerSize;
    }

    public static /* synthetic */ CornerSize access$700(ShapeAppearanceModel$Builder shapeAppearanceModel$Builder) {
        return shapeAppearanceModel$Builder.bottomRightCornerSize;
    }

    public static /* synthetic */ CornerSize access$800(ShapeAppearanceModel$Builder shapeAppearanceModel$Builder) {
        return shapeAppearanceModel$Builder.bottomLeftCornerSize;
    }

    public static /* synthetic */ EdgeTreatment access$900(ShapeAppearanceModel$Builder shapeAppearanceModel$Builder) {
        return shapeAppearanceModel$Builder.topEdge;
    }

    private static float compatCornerTreatmentSize(CornerTreatment cornerTreatment) {
        boolean bl2 = cornerTreatment instanceof RoundedCornerTreatment;
        if (bl2) {
            return ((RoundedCornerTreatment)cornerTreatment).radius;
        }
        bl2 = cornerTreatment instanceof CutCornerTreatment;
        if (bl2) {
            return ((CutCornerTreatment)cornerTreatment).size;
        }
        return -1.0f;
    }

    public ShapeAppearanceModel build() {
        ShapeAppearanceModel shapeAppearanceModel = new ShapeAppearanceModel(this, null);
        return shapeAppearanceModel;
    }

    public ShapeAppearanceModel$Builder setAllCornerSizes(float f5) {
        return this.setTopLeftCornerSize(f5).setTopRightCornerSize(f5).setBottomRightCornerSize(f5).setBottomLeftCornerSize(f5);
    }

    public ShapeAppearanceModel$Builder setAllCornerSizes(CornerSize cornerSize) {
        return this.setTopLeftCornerSize(cornerSize).setTopRightCornerSize(cornerSize).setBottomRightCornerSize(cornerSize).setBottomLeftCornerSize(cornerSize);
    }

    public ShapeAppearanceModel$Builder setAllCorners(int n3, float f5) {
        CornerTreatment cornerTreatment = MaterialShapeUtils.createCornerTreatment(n3);
        return this.setAllCorners(cornerTreatment).setAllCornerSizes(f5);
    }

    public ShapeAppearanceModel$Builder setAllCorners(CornerTreatment cornerTreatment) {
        return this.setTopLeftCorner(cornerTreatment).setTopRightCorner(cornerTreatment).setBottomRightCorner(cornerTreatment).setBottomLeftCorner(cornerTreatment);
    }

    public ShapeAppearanceModel$Builder setAllEdges(EdgeTreatment edgeTreatment) {
        return this.setLeftEdge(edgeTreatment).setTopEdge(edgeTreatment).setRightEdge(edgeTreatment).setBottomEdge(edgeTreatment);
    }

    public ShapeAppearanceModel$Builder setBottomEdge(EdgeTreatment edgeTreatment) {
        this.bottomEdge = edgeTreatment;
        return this;
    }

    public ShapeAppearanceModel$Builder setBottomLeftCorner(int n3, float f5) {
        CornerTreatment cornerTreatment = MaterialShapeUtils.createCornerTreatment(n3);
        return this.setBottomLeftCorner(cornerTreatment).setBottomLeftCornerSize(f5);
    }

    public ShapeAppearanceModel$Builder setBottomLeftCorner(int n3, CornerSize cornerSize) {
        CornerTreatment cornerTreatment = MaterialShapeUtils.createCornerTreatment(n3);
        return this.setBottomLeftCorner(cornerTreatment).setBottomLeftCornerSize(cornerSize);
    }

    public ShapeAppearanceModel$Builder setBottomLeftCorner(CornerTreatment cornerTreatment) {
        float f5;
        this.bottomLeftCorner = cornerTreatment;
        float f6 = ShapeAppearanceModel$Builder.compatCornerTreatmentSize(cornerTreatment);
        float f7 = f6 - (f5 = -1.0f);
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.setBottomLeftCornerSize(f6);
        }
        return this;
    }

    public ShapeAppearanceModel$Builder setBottomLeftCornerSize(float f5) {
        AbsoluteCornerSize absoluteCornerSize = new AbsoluteCornerSize(f5);
        this.bottomLeftCornerSize = absoluteCornerSize;
        return this;
    }

    public ShapeAppearanceModel$Builder setBottomLeftCornerSize(CornerSize cornerSize) {
        this.bottomLeftCornerSize = cornerSize;
        return this;
    }

    public ShapeAppearanceModel$Builder setBottomRightCorner(int n3, float f5) {
        CornerTreatment cornerTreatment = MaterialShapeUtils.createCornerTreatment(n3);
        return this.setBottomRightCorner(cornerTreatment).setBottomRightCornerSize(f5);
    }

    public ShapeAppearanceModel$Builder setBottomRightCorner(int n3, CornerSize cornerSize) {
        CornerTreatment cornerTreatment = MaterialShapeUtils.createCornerTreatment(n3);
        return this.setBottomRightCorner(cornerTreatment).setBottomRightCornerSize(cornerSize);
    }

    public ShapeAppearanceModel$Builder setBottomRightCorner(CornerTreatment cornerTreatment) {
        float f5;
        this.bottomRightCorner = cornerTreatment;
        float f6 = ShapeAppearanceModel$Builder.compatCornerTreatmentSize(cornerTreatment);
        float f7 = f6 - (f5 = -1.0f);
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.setBottomRightCornerSize(f6);
        }
        return this;
    }

    public ShapeAppearanceModel$Builder setBottomRightCornerSize(float f5) {
        AbsoluteCornerSize absoluteCornerSize = new AbsoluteCornerSize(f5);
        this.bottomRightCornerSize = absoluteCornerSize;
        return this;
    }

    public ShapeAppearanceModel$Builder setBottomRightCornerSize(CornerSize cornerSize) {
        this.bottomRightCornerSize = cornerSize;
        return this;
    }

    public ShapeAppearanceModel$Builder setLeftEdge(EdgeTreatment edgeTreatment) {
        this.leftEdge = edgeTreatment;
        return this;
    }

    public ShapeAppearanceModel$Builder setRightEdge(EdgeTreatment edgeTreatment) {
        this.rightEdge = edgeTreatment;
        return this;
    }

    public ShapeAppearanceModel$Builder setTopEdge(EdgeTreatment edgeTreatment) {
        this.topEdge = edgeTreatment;
        return this;
    }

    public ShapeAppearanceModel$Builder setTopLeftCorner(int n3, float f5) {
        CornerTreatment cornerTreatment = MaterialShapeUtils.createCornerTreatment(n3);
        return this.setTopLeftCorner(cornerTreatment).setTopLeftCornerSize(f5);
    }

    public ShapeAppearanceModel$Builder setTopLeftCorner(int n3, CornerSize cornerSize) {
        CornerTreatment cornerTreatment = MaterialShapeUtils.createCornerTreatment(n3);
        return this.setTopLeftCorner(cornerTreatment).setTopLeftCornerSize(cornerSize);
    }

    public ShapeAppearanceModel$Builder setTopLeftCorner(CornerTreatment cornerTreatment) {
        float f5;
        this.topLeftCorner = cornerTreatment;
        float f6 = ShapeAppearanceModel$Builder.compatCornerTreatmentSize(cornerTreatment);
        float f7 = f6 - (f5 = -1.0f);
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.setTopLeftCornerSize(f6);
        }
        return this;
    }

    public ShapeAppearanceModel$Builder setTopLeftCornerSize(float f5) {
        AbsoluteCornerSize absoluteCornerSize = new AbsoluteCornerSize(f5);
        this.topLeftCornerSize = absoluteCornerSize;
        return this;
    }

    public ShapeAppearanceModel$Builder setTopLeftCornerSize(CornerSize cornerSize) {
        this.topLeftCornerSize = cornerSize;
        return this;
    }

    public ShapeAppearanceModel$Builder setTopRightCorner(int n3, float f5) {
        CornerTreatment cornerTreatment = MaterialShapeUtils.createCornerTreatment(n3);
        return this.setTopRightCorner(cornerTreatment).setTopRightCornerSize(f5);
    }

    public ShapeAppearanceModel$Builder setTopRightCorner(int n3, CornerSize cornerSize) {
        CornerTreatment cornerTreatment = MaterialShapeUtils.createCornerTreatment(n3);
        return this.setTopRightCorner(cornerTreatment).setTopRightCornerSize(cornerSize);
    }

    public ShapeAppearanceModel$Builder setTopRightCorner(CornerTreatment cornerTreatment) {
        float f5;
        this.topRightCorner = cornerTreatment;
        float f6 = ShapeAppearanceModel$Builder.compatCornerTreatmentSize(cornerTreatment);
        float f7 = f6 - (f5 = -1.0f);
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.setTopRightCornerSize(f6);
        }
        return this;
    }

    public ShapeAppearanceModel$Builder setTopRightCornerSize(float f5) {
        AbsoluteCornerSize absoluteCornerSize = new AbsoluteCornerSize(f5);
        this.topRightCornerSize = absoluteCornerSize;
        return this;
    }

    public ShapeAppearanceModel$Builder setTopRightCornerSize(CornerSize cornerSize) {
        this.topRightCornerSize = cornerSize;
        return this;
    }
}

