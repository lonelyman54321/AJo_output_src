/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.RectF
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.ContextThemeWrapper
 */
package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel$1;
import com.google.android.material.shape.ShapeAppearanceModel$Builder;
import com.google.android.material.shape.ShapeAppearanceModel$CornerSizeUnaryOperator;

public class ShapeAppearanceModel {
    public static final CornerSize PILL;
    EdgeTreatment bottomEdge;
    CornerTreatment bottomLeftCorner;
    CornerSize bottomLeftCornerSize;
    CornerTreatment bottomRightCorner;
    CornerSize bottomRightCornerSize;
    EdgeTreatment leftEdge;
    EdgeTreatment rightEdge;
    EdgeTreatment topEdge;
    CornerTreatment topLeftCorner;
    CornerSize topLeftCornerSize;
    CornerTreatment topRightCorner;
    CornerSize topRightCornerSize;

    static {
        RelativeCornerSize relativeCornerSize = new RelativeCornerSize(0.5f);
        PILL = relativeCornerSize;
    }

    public ShapeAppearanceModel() {
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

    private ShapeAppearanceModel(ShapeAppearanceModel$Builder object) {
        Object object2 = ShapeAppearanceModel$Builder.access$100((ShapeAppearanceModel$Builder)object);
        this.topLeftCorner = object2;
        object2 = ShapeAppearanceModel$Builder.access$200((ShapeAppearanceModel$Builder)object);
        this.topRightCorner = object2;
        object2 = ShapeAppearanceModel$Builder.access$300((ShapeAppearanceModel$Builder)object);
        this.bottomRightCorner = object2;
        object2 = ShapeAppearanceModel$Builder.access$400((ShapeAppearanceModel$Builder)object);
        this.bottomLeftCorner = object2;
        this.topLeftCornerSize = object2 = ShapeAppearanceModel$Builder.access$500((ShapeAppearanceModel$Builder)object);
        this.topRightCornerSize = object2 = ShapeAppearanceModel$Builder.access$600((ShapeAppearanceModel$Builder)object);
        this.bottomRightCornerSize = object2 = ShapeAppearanceModel$Builder.access$700((ShapeAppearanceModel$Builder)object);
        this.bottomLeftCornerSize = object2 = ShapeAppearanceModel$Builder.access$800((ShapeAppearanceModel$Builder)object);
        this.topEdge = object2 = ShapeAppearanceModel$Builder.access$900((ShapeAppearanceModel$Builder)object);
        this.rightEdge = object2 = ShapeAppearanceModel$Builder.access$1000((ShapeAppearanceModel$Builder)object);
        this.bottomEdge = object2 = ShapeAppearanceModel$Builder.access$1100((ShapeAppearanceModel$Builder)object);
        this.leftEdge = object = ShapeAppearanceModel$Builder.access$1200((ShapeAppearanceModel$Builder)object);
    }

    public /* synthetic */ ShapeAppearanceModel(ShapeAppearanceModel$Builder shapeAppearanceModel$Builder, ShapeAppearanceModel$1 shapeAppearanceModel$1) {
        this(shapeAppearanceModel$Builder);
    }

    public static ShapeAppearanceModel$Builder builder() {
        ShapeAppearanceModel$Builder shapeAppearanceModel$Builder = new ShapeAppearanceModel$Builder();
        return shapeAppearanceModel$Builder;
    }

    public static ShapeAppearanceModel$Builder builder(Context context, int n3, int n4) {
        return ShapeAppearanceModel.builder(context, n3, n4, 0);
    }

    private static ShapeAppearanceModel$Builder builder(Context context, int n3, int n4, int n7) {
        float f5 = n7;
        AbsoluteCornerSize absoluteCornerSize = new AbsoluteCornerSize(f5);
        return ShapeAppearanceModel.builder(context, n3, n4, absoluteCornerSize);
    }

    private static ShapeAppearanceModel$Builder builder(Context object, int n3, int n4, CornerSize cornerSize) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(object, n3);
        if (n4 != 0) {
            object = new ContextThemeWrapper((Context)contextThemeWrapper, n4);
            contextThemeWrapper = object;
        }
        object = R$styleable.ShapeAppearance;
        object = contextThemeWrapper.obtainStyledAttributes((int[])object);
        n3 = R$styleable.ShapeAppearance_cornerFamily;
        n4 = 0;
        ShapeAppearanceModel$Builder shapeAppearanceModel$Builder = null;
        try {
            n3 = object.getInt(n3, 0);
            n4 = R$styleable.ShapeAppearance_cornerFamilyTopLeft;
            n4 = object.getInt(n4, n3);
            int n7 = R$styleable.ShapeAppearance_cornerFamilyTopRight;
            n7 = object.getInt(n7, n3);
            int n8 = R$styleable.ShapeAppearance_cornerFamilyBottomRight;
            n8 = object.getInt(n8, n3);
            int n10 = R$styleable.ShapeAppearance_cornerFamilyBottomLeft;
            n3 = object.getInt(n10, n3);
            n10 = R$styleable.ShapeAppearance_cornerSize;
            cornerSize = ShapeAppearanceModel.getCornerSize((TypedArray)object, n10, cornerSize);
            n10 = R$styleable.ShapeAppearance_cornerSizeTopLeft;
            CornerSize cornerSize2 = ShapeAppearanceModel.getCornerSize((TypedArray)object, n10, cornerSize);
            int n14 = R$styleable.ShapeAppearance_cornerSizeTopRight;
            CornerSize cornerSize3 = ShapeAppearanceModel.getCornerSize((TypedArray)object, n14, cornerSize);
            int n15 = R$styleable.ShapeAppearance_cornerSizeBottomRight;
            CornerSize cornerSize4 = ShapeAppearanceModel.getCornerSize((TypedArray)object, n15, cornerSize);
            int n16 = R$styleable.ShapeAppearance_cornerSizeBottomLeft;
            cornerSize = ShapeAppearanceModel.getCornerSize((TypedArray)object, n16, cornerSize);
            ShapeAppearanceModel$Builder shapeAppearanceModel$Builder2 = new ShapeAppearanceModel$Builder();
            shapeAppearanceModel$Builder = shapeAppearanceModel$Builder2.setTopLeftCorner(n4, cornerSize2);
            shapeAppearanceModel$Builder = shapeAppearanceModel$Builder.setTopRightCorner(n7, cornerSize3);
            shapeAppearanceModel$Builder = shapeAppearanceModel$Builder.setBottomRightCorner(n8, cornerSize4);
            ShapeAppearanceModel$Builder shapeAppearanceModel$Builder3 = shapeAppearanceModel$Builder.setBottomLeftCorner(n3, cornerSize);
            return shapeAppearanceModel$Builder3;
        }
        finally {
            object.recycle();
        }
    }

    public static ShapeAppearanceModel$Builder builder(Context context, AttributeSet attributeSet, int n3, int n4) {
        return ShapeAppearanceModel.builder(context, attributeSet, n3, n4, 0);
    }

    public static ShapeAppearanceModel$Builder builder(Context context, AttributeSet attributeSet, int n3, int n4, int n7) {
        float f5 = n7;
        AbsoluteCornerSize absoluteCornerSize = new AbsoluteCornerSize(f5);
        return ShapeAppearanceModel.builder(context, attributeSet, n3, n4, absoluteCornerSize);
    }

    public static ShapeAppearanceModel$Builder builder(Context context, AttributeSet attributeSet, int n3, int n4, CornerSize cornerSize) {
        int[] nArray = R$styleable.MaterialShape;
        attributeSet = context.obtainStyledAttributes(attributeSet, nArray, n3, n4);
        n3 = R$styleable.MaterialShape_shapeAppearance;
        n3 = attributeSet.getResourceId(n3, 0);
        int n7 = R$styleable.MaterialShape_shapeAppearanceOverlay;
        n4 = attributeSet.getResourceId(n7, 0);
        attributeSet.recycle();
        return ShapeAppearanceModel.builder(context, n3, n4, cornerSize);
    }

    private static CornerSize getCornerSize(TypedArray object, int n3, CornerSize cornerSize) {
        TypedValue typedValue = object.peekValue(n3);
        if (typedValue == null) {
            return cornerSize;
        }
        int n4 = typedValue.type;
        int n7 = 5;
        if (n4 == n7) {
            n3 = typedValue.data;
            object = object.getResources().getDisplayMetrics();
            float f5 = TypedValue.complexToDimensionPixelSize((int)n3, (DisplayMetrics)object);
            cornerSize = new AbsoluteCornerSize(f5);
            return cornerSize;
        }
        int n8 = 6;
        float f6 = 8.4E-45f;
        if (n4 == n8) {
            float f7 = 1.0f;
            float f8 = typedValue.getFraction(f7, f7);
            object = new RelativeCornerSize(f8);
            return object;
        }
        return cornerSize;
    }

    public EdgeTreatment getBottomEdge() {
        return this.bottomEdge;
    }

    public CornerTreatment getBottomLeftCorner() {
        return this.bottomLeftCorner;
    }

    public CornerSize getBottomLeftCornerSize() {
        return this.bottomLeftCornerSize;
    }

    public CornerTreatment getBottomRightCorner() {
        return this.bottomRightCorner;
    }

    public CornerSize getBottomRightCornerSize() {
        return this.bottomRightCornerSize;
    }

    public EdgeTreatment getLeftEdge() {
        return this.leftEdge;
    }

    public EdgeTreatment getRightEdge() {
        return this.rightEdge;
    }

    public EdgeTreatment getTopEdge() {
        return this.topEdge;
    }

    public CornerTreatment getTopLeftCorner() {
        return this.topLeftCorner;
    }

    public CornerSize getTopLeftCornerSize() {
        return this.topLeftCornerSize;
    }

    public CornerTreatment getTopRightCorner() {
        return this.topRightCorner;
    }

    public CornerSize getTopRightCornerSize() {
        return this.topRightCornerSize;
    }

    public boolean isRoundRect(RectF rectF) {
        float f5;
        float f6;
        boolean bl2;
        float f7;
        Class<?> clazz = this.leftEdge.getClass();
        Object object = EdgeTreatment.class;
        boolean bl3 = clazz.equals(object);
        boolean bl4 = false;
        if (bl3 && (bl3 = (clazz = this.rightEdge.getClass()).equals(object)) && (bl3 = (clazz = this.topEdge.getClass()).equals(object)) && (bl3 = (clazz = this.bottomEdge.getClass()).equals(object))) {
            bl3 = true;
        } else {
            bl3 = false;
            clazz = null;
        }
        object = this.topLeftCornerSize;
        float f8 = object.getCornerSize(rectF);
        CornerSize cornerSize = this.topRightCornerSize;
        float f11 = cornerSize.getCornerSize(rectF);
        float f12 = f11 == f8 ? 0 : (f11 > f8 ? 1 : -1);
        if (f12 == false && (f12 = (f7 = (f11 = (cornerSize = this.bottomLeftCornerSize).getCornerSize(rectF)) - f8) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) == false && !(bl2 = (f6 = (f5 = (cornerSize = this.bottomRightCornerSize).getCornerSize(rectF)) - f8) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) {
            bl2 = true;
            f5 = Float.MIN_VALUE;
        } else {
            bl2 = false;
            f5 = 0.0f;
            rectF = null;
        }
        object = this.topRightCorner;
        boolean bl5 = object instanceof RoundedCornerTreatment;
        if (bl5 && (bl5 = (object = this.topLeftCorner) instanceof RoundedCornerTreatment) && (bl5 = (object = this.bottomRightCorner) instanceof RoundedCornerTreatment) && (bl5 = (object = this.bottomLeftCorner) instanceof RoundedCornerTreatment)) {
            bl5 = true;
            f8 = Float.MIN_VALUE;
        } else {
            bl5 = false;
            f8 = 0.0f;
            object = null;
        }
        if (bl3 && bl2 && bl5) {
            bl4 = true;
        }
        return bl4;
    }

    public ShapeAppearanceModel$Builder toBuilder() {
        ShapeAppearanceModel$Builder shapeAppearanceModel$Builder = new ShapeAppearanceModel$Builder(this);
        return shapeAppearanceModel$Builder;
    }

    public ShapeAppearanceModel withCornerSize(float f5) {
        return this.toBuilder().setAllCornerSizes(f5).build();
    }

    public ShapeAppearanceModel withCornerSize(CornerSize cornerSize) {
        return this.toBuilder().setAllCornerSizes(cornerSize).build();
    }

    public ShapeAppearanceModel withTransformedCornerSizes(ShapeAppearanceModel$CornerSizeUnaryOperator object) {
        ShapeAppearanceModel$Builder shapeAppearanceModel$Builder = this.toBuilder();
        CornerSize cornerSize = this.getTopLeftCornerSize();
        cornerSize = object.apply(cornerSize);
        shapeAppearanceModel$Builder = shapeAppearanceModel$Builder.setTopLeftCornerSize(cornerSize);
        cornerSize = this.getTopRightCornerSize();
        cornerSize = object.apply(cornerSize);
        shapeAppearanceModel$Builder = shapeAppearanceModel$Builder.setTopRightCornerSize(cornerSize);
        cornerSize = this.getBottomLeftCornerSize();
        cornerSize = object.apply(cornerSize);
        shapeAppearanceModel$Builder = shapeAppearanceModel$Builder.setBottomLeftCornerSize(cornerSize);
        cornerSize = this.getBottomRightCornerSize();
        object = object.apply(cornerSize);
        return shapeAppearanceModel$Builder.setBottomRightCornerSize((CornerSize)object).build();
    }
}

