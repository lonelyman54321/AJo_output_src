/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

import com.google.zxing.common.detector.MathUtils;

public class ResultPoint {
    private final float x;
    private final float y;

    public ResultPoint(float f5, float f6) {
        this.x = f5;
        this.y = f6;
    }

    private static float crossProductZ(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        float f5 = resultPoint2.x;
        float f6 = resultPoint2.y;
        float f7 = resultPoint3.x - f5;
        float f8 = (resultPoint.y - f6) * f7;
        float f11 = resultPoint3.y - f6;
        float f12 = (resultPoint.x - f5) * f11;
        return f8 - f12;
    }

    public static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        float f5 = resultPoint.x;
        float f6 = resultPoint.y;
        float f7 = resultPoint2.x;
        float f8 = resultPoint2.y;
        return MathUtils.distance(f5, f6, f7, f8);
    }

    public static void orderBestPatterns(ResultPoint[] resultPointArray) {
        ResultPoint resultPoint = resultPointArray[0];
        int n3 = 1;
        ResultPoint resultPoint2 = resultPointArray[n3];
        float f5 = ResultPoint.distance(resultPoint, resultPoint2);
        resultPoint2 = resultPointArray[n3];
        int n4 = 2;
        ResultPoint resultPoint3 = resultPointArray[n4];
        float f6 = ResultPoint.distance(resultPoint2, resultPoint3);
        resultPoint3 = resultPointArray[0];
        ResultPoint resultPoint4 = resultPointArray[n4];
        float f7 = ResultPoint.distance(resultPoint3, resultPoint4);
        Object object = f6 == f5 ? 0 : (f6 > f5 ? 1 : -1);
        if (object >= 0 && (object = f6 == f7 ? 0 : (f6 > f7 ? 1 : -1)) >= 0) {
            resultPoint = resultPointArray[0];
            resultPoint2 = resultPointArray[n3];
            resultPoint3 = resultPointArray[n4];
        } else {
            float f8;
            Object object2 = f7 == f6 ? 0 : (f7 > f6 ? 1 : -1);
            if (object2 >= 0 && (f8 = f7 == f5 ? 0 : (f7 > f5 ? 1 : -1)) >= 0) {
                resultPoint = resultPointArray[n3];
                resultPoint2 = resultPointArray[0];
                resultPoint3 = resultPointArray[n4];
            } else {
                resultPoint = resultPointArray[n4];
                resultPoint2 = resultPointArray[0];
                resultPoint3 = resultPointArray[n3];
            }
        }
        float f11 = ResultPoint.crossProductZ(resultPoint2, resultPoint, resultPoint3);
        float f12 = f11 - 0.0f;
        object = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (object < 0) {
            ResultPoint resultPoint5 = resultPoint3;
            resultPoint3 = resultPoint2;
            resultPoint2 = resultPoint5;
        }
        resultPointArray[0] = resultPoint2;
        resultPointArray[n3] = resultPoint;
        resultPointArray[n4] = resultPoint3;
    }

    public final boolean equals(Object object) {
        Object object2 = object instanceof ResultPoint;
        if (object2) {
            float f5;
            float f6;
            float f7;
            object = (ResultPoint)object;
            float f8 = this.x;
            float f11 = ((ResultPoint)object).x;
            float f12 = f8 - f11;
            object2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            if (!object2 && (f7 = (f6 = (f8 = this.y) - (f5 = ((ResultPoint)object).y)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) == false) {
                return true;
            }
        }
        return false;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.x) * 31;
        return Float.floatToIntBits(this.y) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        float f5 = this.x;
        stringBuilder.append(f5);
        stringBuilder.append(',');
        f5 = this.y;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

