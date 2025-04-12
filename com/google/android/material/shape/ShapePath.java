/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Path
 */
package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import com.google.android.material.shape.ShapePath$1;
import com.google.android.material.shape.ShapePath$ArcShadowOperation;
import com.google.android.material.shape.ShapePath$InnerCornerShadowOperation;
import com.google.android.material.shape.ShapePath$LineShadowOperation;
import com.google.android.material.shape.ShapePath$PathArcOperation;
import com.google.android.material.shape.ShapePath$PathCubicOperation;
import com.google.android.material.shape.ShapePath$PathLineOperation;
import com.google.android.material.shape.ShapePath$PathOperation;
import com.google.android.material.shape.ShapePath$PathQuadOperation;
import com.google.android.material.shape.ShapePath$ShadowCompatOperation;
import java.util.ArrayList;
import java.util.List;

public class ShapePath {
    protected static final float ANGLE_LEFT = 180.0f;
    private static final float ANGLE_UP = 270.0f;
    private boolean containsIncompatibleShadowOp;
    public float currentShadowAngle;
    public float endShadowAngle;
    public float endX;
    public float endY;
    private final List operations;
    private final List shadowCompatOperations;
    public float startX;
    public float startY;

    public ShapePath() {
        ArrayList arrayList;
        this.operations = arrayList = new ArrayList();
        this.shadowCompatOperations = arrayList = new ArrayList();
        this.reset(0.0f, 0.0f);
    }

    public ShapePath(float f5, float f6) {
        ArrayList arrayList;
        this.operations = arrayList = new ArrayList();
        this.shadowCompatOperations = arrayList = new ArrayList();
        this.reset(f5, f6);
    }

    private void addConnectingShadowIfNecessary(float f5) {
        float f6 = this.getCurrentShadowAngle();
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            return;
        }
        f6 = this.getCurrentShadowAngle();
        f6 = f5 - f6;
        float f8 = 360.0f;
        float f11 = (f6 = (f6 + f8) % f8) - (f8 = 180.0f);
        Object object2 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object2 > 0) {
            return;
        }
        float f12 = this.getEndX();
        float f14 = this.getEndY();
        float f15 = this.getEndX();
        float f16 = this.getEndY();
        ShapePath$PathArcOperation shapePath$PathArcOperation = new ShapePath$PathArcOperation(f12, f14, f15, f16);
        f12 = this.getCurrentShadowAngle();
        ShapePath$PathArcOperation.access$600(shapePath$PathArcOperation, f12);
        ShapePath$PathArcOperation.access$700(shapePath$PathArcOperation, f6);
        List list = this.shadowCompatOperations;
        ShapePath$ArcShadowOperation shapePath$ArcShadowOperation = new ShapePath$ArcShadowOperation(shapePath$PathArcOperation);
        list.add(shapePath$ArcShadowOperation);
        this.setCurrentShadowAngle(f5);
    }

    private void addShadowCompatOperation(ShapePath$ShadowCompatOperation shapePath$ShadowCompatOperation, float f5, float f6) {
        this.addConnectingShadowIfNecessary(f5);
        this.shadowCompatOperations.add(shapePath$ShadowCompatOperation);
        this.setCurrentShadowAngle(f6);
    }

    private float getCurrentShadowAngle() {
        return this.currentShadowAngle;
    }

    private float getEndShadowAngle() {
        return this.endShadowAngle;
    }

    private void setCurrentShadowAngle(float f5) {
        this.currentShadowAngle = f5;
    }

    private void setEndShadowAngle(float f5) {
        this.endShadowAngle = f5;
    }

    private void setEndX(float f5) {
        this.endX = f5;
    }

    private void setEndY(float f5) {
        this.endY = f5;
    }

    private void setStartX(float f5) {
        this.startX = f5;
    }

    private void setStartY(float f5) {
        this.startY = f5;
    }

    public void addArc(float f5, float f6, float f7, float f8, float f11, float f12) {
        ShapePath$PathArcOperation shapePath$PathArcOperation = new ShapePath$PathArcOperation(f5, f6, f7, f8);
        ShapePath$PathArcOperation.access$600(shapePath$PathArcOperation, f11);
        ShapePath$PathArcOperation.access$700(shapePath$PathArcOperation, f12);
        this.operations.add(shapePath$PathArcOperation);
        ShapePath$ArcShadowOperation shapePath$ArcShadowOperation = new ShapePath$ArcShadowOperation(shapePath$PathArcOperation);
        float f14 = f11 + f12;
        float f15 = 0.0f;
        float f16 = f12 - 0.0f;
        float f17 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
        if (f17 < 0) {
            f17 = 1.0f;
            f12 = Float.MIN_VALUE;
        } else {
            f17 = 0.0f;
            f12 = 0.0f;
        }
        f15 = 360.0f;
        float f18 = 180.0f;
        if (f17 != false) {
            f11 = (f11 + f18) % f15;
        }
        f18 = f17 != false ? (f18 + f14) % f15 : f14;
        this.addShadowCompatOperation(shapePath$ArcShadowOperation, f11, f18);
        f11 = f5 + f7;
        f12 = 0.5f;
        f11 *= f12;
        f7 -= f5;
        f5 = 2.0f;
        f7 /= f5;
        double d2 = f14;
        f15 = (float)Math.cos(Math.toRadians(d2));
        f7 = f7 * f15 + f11;
        this.setEndX(f7);
        f7 = (f6 + f8) * f12;
        f8 = (f8 - f6) / f5;
        f5 = (float)Math.sin(Math.toRadians(d2));
        f8 = f8 * f5 + f7;
        this.setEndY(f8);
    }

    public void applyToPath(Matrix matrix, Path path) {
        List list = this.operations;
        int n3 = list.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            ShapePath$PathOperation shapePath$PathOperation = (ShapePath$PathOperation)this.operations.get(i3);
            shapePath$PathOperation.applyToPath(matrix, path);
        }
    }

    public boolean containsIncompatibleShadowOp() {
        return this.containsIncompatibleShadowOp;
    }

    public ShapePath$ShadowCompatOperation createShadowCompatOperation(Matrix object) {
        float f5 = this.getEndShadowAngle();
        this.addConnectingShadowIfNecessary(f5);
        Matrix matrix = new Matrix(object);
        Object object2 = this.shadowCompatOperations;
        object = new ArrayList(object2);
        object2 = new ShapePath$1(this, (List)object, matrix);
        return object2;
    }

    public void cubicToPoint(float f5, float f6, float f7, float f8, float f11, float f12) {
        ShapePath$PathCubicOperation shapePath$PathCubicOperation = new ShapePath$PathCubicOperation(f5, f6, f7, f8, f11, f12);
        this.operations.add(shapePath$PathCubicOperation);
        this.containsIncompatibleShadowOp = true;
        this.setEndX(f11);
        this.setEndY(f12);
    }

    public float getEndX() {
        return this.endX;
    }

    public float getEndY() {
        return this.endY;
    }

    public float getStartX() {
        return this.startX;
    }

    public float getStartY() {
        return this.startY;
    }

    public void lineTo(float f5, float f6) {
        ShapePath$PathLineOperation shapePath$PathLineOperation = new ShapePath$PathLineOperation();
        ShapePath$PathLineOperation.access$002(shapePath$PathLineOperation, f5);
        ShapePath$PathLineOperation.access$102(shapePath$PathLineOperation, f6);
        this.operations.add(shapePath$PathLineOperation);
        float f7 = this.getEndX();
        float f8 = this.getEndY();
        ShapePath$LineShadowOperation shapePath$LineShadowOperation = new ShapePath$LineShadowOperation(shapePath$PathLineOperation, f7, f8);
        float f11 = shapePath$LineShadowOperation.getAngle();
        f7 = 270.0f;
        f8 = shapePath$LineShadowOperation.getAngle() + f7;
        this.addShadowCompatOperation(shapePath$LineShadowOperation, f11 += f7, f8);
        this.setEndX(f5);
        this.setEndY(f6);
    }

    public void lineTo(float f5, float f6, float f7, float f8) {
        Object object;
        float f11;
        float f12;
        block6: {
            block5: {
                float f14;
                float f15;
                block4: {
                    f12 = this.getEndX();
                    float f16 = (f12 = Math.abs(f5 - f12)) - (f11 = 0.001f);
                    object = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                    if (object >= 0) break block4;
                    f12 = this.getEndY();
                    float f17 = (f12 = Math.abs(f6 - f12)) - f11;
                    object = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
                    if (object < 0) break block5;
                }
                if ((object = (f15 = (f12 = Math.abs(f5 - f7)) - f11) == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1)) >= 0 || (object = (f14 = (f12 = Math.abs(f6 - f8)) - f11) == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1)) >= 0) break block6;
            }
            this.lineTo(f7, f8);
            return;
        }
        ShapePath$PathLineOperation shapePath$PathLineOperation = new ShapePath$PathLineOperation();
        ShapePath$PathLineOperation.access$002(shapePath$PathLineOperation, f5);
        ShapePath$PathLineOperation.access$102(shapePath$PathLineOperation, f6);
        this.operations.add(shapePath$PathLineOperation);
        ShapePath$PathLineOperation shapePath$PathLineOperation2 = new ShapePath$PathLineOperation();
        ShapePath$PathLineOperation.access$002(shapePath$PathLineOperation2, f7);
        ShapePath$PathLineOperation.access$102(shapePath$PathLineOperation2, f8);
        this.operations.add(shapePath$PathLineOperation2);
        float f18 = this.getEndX();
        float f19 = this.getEndY();
        ShapePath$InnerCornerShadowOperation shapePath$InnerCornerShadowOperation = new ShapePath$InnerCornerShadowOperation(shapePath$PathLineOperation, shapePath$PathLineOperation2, f18, f19);
        f12 = shapePath$InnerCornerShadowOperation.getSweepAngle();
        f11 = 0.0f;
        shapePath$PathLineOperation2 = null;
        float f20 = f12 - 0.0f;
        object = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
        if (object > 0) {
            this.lineTo(f5, f6);
            this.lineTo(f7, f8);
            return;
        }
        f5 = shapePath$InnerCornerShadowOperation.getStartAngle();
        f6 = 270.0f;
        f12 = shapePath$InnerCornerShadowOperation.getEndAngle() + f6;
        this.addShadowCompatOperation(shapePath$InnerCornerShadowOperation, f5 += f6, f12);
        this.setEndX(f7);
        this.setEndY(f8);
    }

    public void quadToPoint(float f5, float f6, float f7, float f8) {
        ShapePath$PathQuadOperation shapePath$PathQuadOperation = new ShapePath$PathQuadOperation();
        ShapePath$PathQuadOperation.access$200(shapePath$PathQuadOperation, f5);
        ShapePath$PathQuadOperation.access$300(shapePath$PathQuadOperation, f6);
        ShapePath$PathQuadOperation.access$400(shapePath$PathQuadOperation, f7);
        ShapePath$PathQuadOperation.access$500(shapePath$PathQuadOperation, f8);
        this.operations.add(shapePath$PathQuadOperation);
        this.containsIncompatibleShadowOp = true;
        this.setEndX(f7);
        this.setEndY(f8);
    }

    public void reset(float f5, float f6) {
        this.reset(f5, f6, 270.0f, 0.0f);
    }

    public void reset(float f5, float f6, float f7, float f8) {
        this.setStartX(f5);
        this.setStartY(f6);
        this.setEndX(f5);
        this.setEndY(f6);
        this.setCurrentShadowAngle(f7);
        f7 = (f7 + f8) % 360.0f;
        this.setEndShadowAngle(f7);
        this.operations.clear();
        this.shadowCompatOperations.clear();
        this.containsIncompatibleShadowOp = false;
    }
}

