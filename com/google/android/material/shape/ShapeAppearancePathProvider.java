/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.Path$Op
 *  android.graphics.PointF
 *  android.graphics.RectF
 */
package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider$Lazy;
import com.google.android.material.shape.ShapeAppearancePathProvider$PathListener;
import com.google.android.material.shape.ShapeAppearancePathProvider$ShapeAppearancePathSpec;
import com.google.android.material.shape.ShapePath;

public class ShapeAppearancePathProvider {
    private final Path boundsPath;
    private final Path cornerPath;
    private final ShapePath[] cornerPaths;
    private final Matrix[] cornerTransforms;
    private boolean edgeIntersectionCheckEnabled;
    private final Path edgePath;
    private final Matrix[] edgeTransforms;
    private final Path overlappedEdgePath;
    private final PointF pointF;
    private final float[] scratch;
    private final float[] scratch2;
    private final ShapePath shapePath;

    public ShapeAppearancePathProvider() {
        int n3 = 4;
        Object object = new ShapePath[n3];
        this.cornerPaths = object;
        object = new Matrix[n3];
        this.cornerTransforms = object;
        object = new Matrix[n3];
        this.edgeTransforms = object;
        this.pointF = object = new PointF();
        this.overlappedEdgePath = object;
        super();
        this.boundsPath = object;
        super();
        this.shapePath = object;
        int n4 = 2;
        Object[] objectArray = new float[n4];
        this.scratch = objectArray;
        object = new float[n4];
        this.scratch2 = (float[])object;
        super();
        this.edgePath = object;
        super();
        this.cornerPath = object;
        this.edgeIntersectionCheckEnabled = true;
        object = null;
        for (n4 = 0; n4 < n3; ++n4) {
            objectArray = this.cornerPaths;
            ShapePath shapePath = new ShapePath();
            objectArray[n4] = (float)shapePath;
            objectArray = this.cornerTransforms;
            super();
            objectArray[n4] = (float)shapePath;
            objectArray = this.edgeTransforms;
            super();
            objectArray[n4] = (float)shapePath;
        }
    }

    private float angleOfEdge(int n3) {
        return (n3 + 1) % 4 * 90;
    }

    private void appendCornerPath(ShapeAppearancePathProvider$ShapeAppearancePathSpec object, int n3) {
        Object object2 = this.scratch;
        float f5 = this.cornerPaths[n3].getStartX();
        float f6 = 0.0f;
        Path path = null;
        object2[0] = f5;
        object2 = this.scratch;
        f5 = this.cornerPaths[n3].getStartY();
        int n4 = 1;
        object2[n4] = f5;
        object2 = this.cornerTransforms[n3];
        Object object3 = this.scratch;
        object2.mapPoints(object3);
        if (n3 == 0) {
            object2 = ((ShapeAppearancePathProvider$ShapeAppearancePathSpec)object).path;
            object3 = this.scratch;
            f6 = object3[0];
            f5 = object3[n4];
            object2.moveTo(f6, f5);
        } else {
            object2 = ((ShapeAppearancePathProvider$ShapeAppearancePathSpec)object).path;
            object3 = this.scratch;
            f6 = object3[0];
            f5 = object3[n4];
            object2.lineTo(f6, f5);
        }
        object2 = this.cornerPaths[n3];
        object3 = this.cornerTransforms[n3];
        path = ((ShapeAppearancePathProvider$ShapeAppearancePathSpec)object).path;
        ((ShapePath)object2).applyToPath((Matrix)object3, path);
        object = ((ShapeAppearancePathProvider$ShapeAppearancePathSpec)object).pathListener;
        if (object != null) {
            object2 = this.cornerPaths[n3];
            object3 = this.cornerTransforms[n3];
            object.onCornerPathCreated((ShapePath)object2, (Matrix)object3, n3);
        }
    }

    private void appendEdgePath(ShapeAppearancePathProvider$ShapeAppearancePathSpec object, int n3) {
        Object object2;
        float f5;
        int n4 = (n3 + 1) % 4;
        Object object3 = this.scratch;
        object3[0] = f5 = this.cornerPaths[n3].getEndX();
        object3 = this.scratch;
        f5 = this.cornerPaths[n3].getEndY();
        int n7 = 1;
        object3[n7] = f5;
        object3 = this.cornerTransforms[n3];
        Object object4 = this.scratch;
        object3.mapPoints((float[])object4);
        object3 = this.scratch2;
        object3[0] = f5 = this.cornerPaths[n4].getStartX();
        object3 = this.scratch2;
        object3[n7] = f5 = this.cornerPaths[n4].getStartY();
        object3 = this.cornerTransforms[n4];
        object4 = this.scratch2;
        object3.mapPoints((float[])object4);
        object3 = this.scratch;
        f5 = object3[0];
        Object object5 = this.scratch2;
        float f6 = object5[0];
        double d2 = f5 - f6;
        float f7 = object3[n7];
        f5 = object5[n7];
        double d5 = f7 - f5;
        d5 = Math.hypot(d2, d5);
        f7 = (float)d5 - 0.001f;
        f5 = 0.0f;
        f7 = Math.max(f7, 0.0f);
        object5 = ((ShapeAppearancePathProvider$ShapeAppearancePathSpec)object).bounds;
        float f8 = this.getEdgeCenterForIndex((RectF)object5, n3);
        this.shapePath.reset(0.0f, 0.0f);
        object4 = ((ShapeAppearancePathProvider$ShapeAppearancePathSpec)object).shapeAppearanceModel;
        object4 = this.getEdgeTreatmentForIndex(n3, (ShapeAppearanceModel)object4);
        f6 = ((ShapeAppearancePathProvider$ShapeAppearancePathSpec)object).interpolation;
        ShapePath shapePath = this.shapePath;
        ((EdgeTreatment)object4).getEdgePath(f7, f8, f6, shapePath);
        this.edgePath.reset();
        object3 = this.shapePath;
        object5 = this.edgeTransforms[n3];
        Path path = this.edgePath;
        object3.applyToPath((Matrix)object5, path);
        boolean bl2 = this.edgeIntersectionCheckEnabled;
        if (bl2 && ((bl2 = ((EdgeTreatment)object4).forceIntersection()) || (bl2 = this.pathOverlapsCorner((Path)(object3 = this.edgePath), n3)) || (n4 = (int)(this.pathOverlapsCorner((Path)(object3 = this.edgePath), n4) ? 1 : 0)) != 0)) {
            object2 = this.edgePath;
            object3 = this.boundsPath;
            object4 = Path.Op.DIFFERENCE;
            object2.op((Path)object2, (Path)object3, (Path.Op)object4);
            object2 = this.scratch;
            f7 = this.shapePath.getStartX();
            object2[0] = f7;
            object2 = this.scratch;
            f7 = this.shapePath.getStartY();
            object2[n7] = f7;
            object2 = this.edgeTransforms[n3];
            object3 = this.scratch;
            object2.mapPoints(object3);
            object2 = this.overlappedEdgePath;
            object3 = this.scratch;
            f5 = object3[0];
            f7 = object3[n7];
            object2.moveTo(f5, f7);
            object2 = this.shapePath;
            object3 = this.edgeTransforms[n3];
            object4 = this.overlappedEdgePath;
            ((ShapePath)object2).applyToPath((Matrix)object3, (Path)object4);
        } else {
            object2 = this.shapePath;
            object3 = this.edgeTransforms[n3];
            object4 = ((ShapeAppearancePathProvider$ShapeAppearancePathSpec)object).path;
            ((ShapePath)object2).applyToPath((Matrix)object3, (Path)object4);
        }
        object = ((ShapeAppearancePathProvider$ShapeAppearancePathSpec)object).pathListener;
        if (object != null) {
            object2 = this.shapePath;
            object3 = this.edgeTransforms[n3];
            object.onEdgePathCreated((ShapePath)object2, (Matrix)object3, n3);
        }
    }

    private void getCoordinatesOfCorner(int n3, RectF rectF, PointF pointF) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    float f5 = rectF.right;
                    float f6 = rectF.top;
                    pointF.set(f5, f6);
                } else {
                    float f7 = rectF.left;
                    float f8 = rectF.top;
                    pointF.set(f7, f8);
                }
            } else {
                float f11 = rectF.left;
                float f12 = rectF.bottom;
                pointF.set(f11, f12);
            }
        } else {
            float f14 = rectF.right;
            float f15 = rectF.bottom;
            pointF.set(f14, f15);
        }
    }

    private CornerSize getCornerSizeForIndex(int n3, ShapeAppearanceModel shapeAppearanceModel) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    return shapeAppearanceModel.getTopRightCornerSize();
                }
                return shapeAppearanceModel.getTopLeftCornerSize();
            }
            return shapeAppearanceModel.getBottomLeftCornerSize();
        }
        return shapeAppearanceModel.getBottomRightCornerSize();
    }

    private CornerTreatment getCornerTreatmentForIndex(int n3, ShapeAppearanceModel shapeAppearanceModel) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    return shapeAppearanceModel.getTopRightCorner();
                }
                return shapeAppearanceModel.getTopLeftCorner();
            }
            return shapeAppearanceModel.getBottomLeftCorner();
        }
        return shapeAppearanceModel.getBottomRightCorner();
    }

    private float getEdgeCenterForIndex(RectF rectF, int n3) {
        int n4;
        float f5;
        float[] fArray = this.scratch;
        ShapePath shapePath = this.cornerPaths[n3];
        fArray[0] = f5 = shapePath.endX;
        float f6 = shapePath.endY;
        int n7 = 1;
        f5 = Float.MIN_VALUE;
        fArray[n7] = f6;
        shapePath = this.cornerTransforms[n3];
        shapePath.mapPoints(fArray);
        if (n3 != n7 && n3 != (n4 = 3)) {
            float f7 = rectF.centerY();
            float f8 = this.scratch[n7];
            return Math.abs(f7 - f8);
        }
        float f11 = rectF.centerX();
        float f12 = this.scratch[0];
        return Math.abs(f11 - f12);
    }

    private EdgeTreatment getEdgeTreatmentForIndex(int n3, ShapeAppearanceModel shapeAppearanceModel) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    return shapeAppearanceModel.getRightEdge();
                }
                return shapeAppearanceModel.getTopEdge();
            }
            return shapeAppearanceModel.getLeftEdge();
        }
        return shapeAppearanceModel.getBottomEdge();
    }

    public static ShapeAppearancePathProvider getInstance() {
        return ShapeAppearancePathProvider$Lazy.INSTANCE;
    }

    private boolean pathOverlapsCorner(Path path, int n3) {
        float f5;
        float f6;
        float f7;
        float f8;
        this.cornerPath.reset();
        ShapePath shapePath = this.cornerPaths[n3];
        Matrix matrix = this.cornerTransforms[n3];
        Path path2 = this.cornerPath;
        shapePath.applyToPath(matrix, path2);
        matrix = new RectF();
        boolean bl2 = true;
        path.computeBounds((RectF)matrix, bl2);
        this.cornerPath.computeBounds((RectF)matrix, bl2);
        path2 = this.cornerPath;
        Path.Op op2 = Path.Op.INTERSECT;
        path.op(path2, op2);
        path.computeBounds((RectF)matrix, bl2);
        int n4 = matrix.isEmpty();
        if (n4 != 0 && ((n4 = (f8 = (f7 = matrix.width()) - (f6 = 1.0f)) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) <= 0 || (n4 = (int)((f5 = (f7 = matrix.height()) - f6) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) <= 0)) {
            bl2 = false;
            shapePath = null;
        }
        return bl2;
    }

    private void setCornerPathAndTransform(ShapeAppearancePathProvider$ShapeAppearancePathSpec shapeAppearancePathProvider$ShapeAppearancePathSpec, int n3) {
        ShapeAppearanceModel shapeAppearanceModel = shapeAppearancePathProvider$ShapeAppearancePathSpec.shapeAppearanceModel;
        CornerSize cornerSize = this.getCornerSizeForIndex(n3, shapeAppearanceModel);
        shapeAppearanceModel = shapeAppearancePathProvider$ShapeAppearancePathSpec.shapeAppearanceModel;
        CornerTreatment cornerTreatment = this.getCornerTreatmentForIndex(n3, shapeAppearanceModel);
        ShapePath shapePath = this.cornerPaths[n3];
        float f5 = shapeAppearancePathProvider$ShapeAppearancePathSpec.interpolation;
        RectF rectF = shapeAppearancePathProvider$ShapeAppearancePathSpec.bounds;
        cornerTreatment.getCornerPath(shapePath, 90.0f, f5, rectF, cornerSize);
        float f6 = this.angleOfEdge(n3);
        this.cornerTransforms[n3].reset();
        shapeAppearancePathProvider$ShapeAppearancePathSpec = shapeAppearancePathProvider$ShapeAppearancePathSpec.bounds;
        cornerTreatment = this.pointF;
        this.getCoordinatesOfCorner(n3, (RectF)shapeAppearancePathProvider$ShapeAppearancePathSpec, (PointF)cornerTreatment);
        shapeAppearancePathProvider$ShapeAppearancePathSpec = this.cornerTransforms[n3];
        cornerTreatment = this.pointF;
        float f7 = ((PointF)cornerTreatment).x;
        float f8 = ((PointF)cornerTreatment).y;
        shapeAppearancePathProvider$ShapeAppearancePathSpec.setTranslate(f7, f8);
        this.cornerTransforms[n3].preRotate(f6);
    }

    private void setEdgePathAndTransform(int n3) {
        float f5;
        Object object = this.scratch;
        object[0] = f5 = this.cornerPaths[n3].getEndX();
        object = this.scratch;
        f5 = this.cornerPaths[n3].getEndY();
        int n4 = 1;
        object[n4] = f5;
        object = this.cornerTransforms[n3];
        Object object2 = this.scratch;
        object.mapPoints(object2);
        float f6 = this.angleOfEdge(n3);
        this.edgeTransforms[n3].reset();
        object2 = this.edgeTransforms[n3];
        float[] fArray = this.scratch;
        float f7 = fArray[0];
        float f8 = fArray[n4];
        object2.setTranslate(f7, f8);
        this.edgeTransforms[n3].preRotate(f6);
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f5, RectF rectF, Path path) {
        this.calculatePath(shapeAppearanceModel, f5, rectF, null, path);
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f5, RectF rectF, ShapeAppearancePathProvider$PathListener shapeAppearancePathProvider$PathListener, Path path) {
        int n3;
        path.rewind();
        this.overlappedEdgePath.rewind();
        this.boundsPath.rewind();
        Object object = this.boundsPath;
        Path.Direction direction = Path.Direction.CW;
        object.addRect(rectF, direction);
        object = new ShapeAppearancePathProvider$ShapeAppearancePathSpec(shapeAppearanceModel, f5, rectF, shapeAppearancePathProvider$PathListener, path);
        int n4 = 0;
        shapeAppearanceModel = null;
        f5 = 0.0f;
        Path.Op op2 = null;
        for (int i3 = 0; i3 < (n3 = 4); ++i3) {
            this.setCornerPathAndTransform((ShapeAppearancePathProvider$ShapeAppearancePathSpec)object, i3);
            this.setEdgePathAndTransform(i3);
        }
        while (n4 < n3) {
            this.appendCornerPath((ShapeAppearancePathProvider$ShapeAppearancePathSpec)object, n4);
            this.appendEdgePath((ShapeAppearancePathProvider$ShapeAppearancePathSpec)object, n4);
            ++n4;
        }
        path.close();
        this.overlappedEdgePath.close();
        shapeAppearanceModel = this.overlappedEdgePath;
        n4 = (int)(shapeAppearanceModel.isEmpty() ? 1 : 0);
        if (n4 == 0) {
            shapeAppearanceModel = this.overlappedEdgePath;
            op2 = Path.Op.UNION;
            path.op((Path)shapeAppearanceModel, op2);
        }
    }

    public void setEdgeIntersectionCheckEnable(boolean bl2) {
        this.edgeIntersectionCheckEnabled = bl2;
    }
}

