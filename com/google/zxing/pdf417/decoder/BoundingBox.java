/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.decoder;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

final class BoundingBox {
    private final ResultPoint bottomLeft;
    private final ResultPoint bottomRight;
    private final BitMatrix image;
    private final int maxX;
    private final int maxY;
    private final int minX;
    private final int minY;
    private final ResultPoint topLeft;
    private final ResultPoint topRight;

    public BoundingBox(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        int n3;
        int n4 = 0;
        float f5 = 0.0f;
        int n7 = 1;
        float f6 = Float.MIN_VALUE;
        boolean bl2 = resultPoint == null || resultPoint2 == null;
        if (resultPoint3 == null || resultPoint4 == null) {
            n4 = 1;
            f5 = Float.MIN_VALUE;
        }
        if (bl2 && n4 != 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (bl2) {
            float f7 = resultPoint3.getY();
            n4 = 0;
            f5 = 0.0f;
            resultPoint = new ResultPoint(0.0f, f7);
            f6 = resultPoint4.getY();
            resultPoint2 = new ResultPoint(0.0f, f6);
        } else if (n4 != 0) {
            int n8 = bitMatrix.getWidth() - n7;
            float f8 = n8;
            f5 = resultPoint.getY();
            resultPoint3 = new ResultPoint(f8, f5);
            n4 = bitMatrix.getWidth() - n7;
            f5 = n4;
            f6 = resultPoint2.getY();
            resultPoint4 = new ResultPoint(f5, f6);
        }
        this.image = bitMatrix;
        this.topLeft = resultPoint;
        this.bottomLeft = resultPoint2;
        this.topRight = resultPoint3;
        this.bottomRight = resultPoint4;
        float f11 = resultPoint.getX();
        f5 = resultPoint2.getX();
        this.minX = n3 = (int)Math.min(f11, f5);
        f11 = resultPoint3.getX();
        f5 = resultPoint4.getX();
        this.maxX = n3 = (int)Math.max(f11, f5);
        f11 = resultPoint.getY();
        float f12 = resultPoint3.getY();
        this.minY = n3 = (int)Math.min(f11, f12);
        f11 = resultPoint2.getY();
        f12 = resultPoint4.getY();
        this.maxY = n3 = (int)Math.max(f11, f12);
    }

    public BoundingBox(BoundingBox boundingBox) {
        int n3;
        int n4;
        Object object = boundingBox.image;
        this.image = object;
        this.topLeft = object = boundingBox.getTopLeft();
        this.bottomLeft = object = boundingBox.getBottomLeft();
        this.topRight = object = boundingBox.getTopRight();
        this.bottomRight = object = boundingBox.getBottomRight();
        this.minX = n4 = boundingBox.getMinX();
        this.maxX = n4 = boundingBox.getMaxX();
        this.minY = n4 = boundingBox.getMinY();
        this.maxY = n3 = boundingBox.getMaxY();
    }

    public static BoundingBox merge(BoundingBox boundingBox, BoundingBox boundingBox2) {
        if (boundingBox == null) {
            return boundingBox2;
        }
        if (boundingBox2 == null) {
            return boundingBox;
        }
        BitMatrix bitMatrix = boundingBox.image;
        ResultPoint resultPoint = boundingBox.topLeft;
        ResultPoint resultPoint2 = boundingBox.bottomLeft;
        ResultPoint resultPoint3 = boundingBox2.topRight;
        ResultPoint resultPoint4 = boundingBox2.bottomRight;
        BoundingBox boundingBox3 = new BoundingBox(bitMatrix, resultPoint, resultPoint2, resultPoint3, resultPoint4);
        return boundingBox3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public BoundingBox addMissingRows(int n3, int n4, boolean bl2) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        block9: {
            ResultPoint resultPoint;
            block8: {
                ResultPoint resultPoint2;
                block6: {
                    Object object5;
                    block7: {
                        Object object6;
                        block5: {
                            ResultPoint resultPoint3;
                            block4: {
                                ResultPoint resultPoint4;
                                block2: {
                                    block3: {
                                        resultPoint4 = this.topLeft;
                                        resultPoint2 = this.bottomLeft;
                                        resultPoint3 = this.topRight;
                                        resultPoint = this.bottomRight;
                                        if (n3 <= 0) break block2;
                                        ResultPoint resultPoint5 = bl2 ? resultPoint4 : resultPoint3;
                                        float f5 = resultPoint5.getY();
                                        int n7 = (int)f5 - n3;
                                        if (n7 < 0) {
                                            n7 = 0;
                                            f5 = 0.0f;
                                        }
                                        float f6 = resultPoint5.getX();
                                        f5 = n7;
                                        object6 = new ResultPoint(f6, f5);
                                        if (!bl2) break block3;
                                        object4 = object6;
                                        break block4;
                                    }
                                    object3 = object6;
                                    object4 = resultPoint4;
                                    break block5;
                                }
                                object4 = resultPoint4;
                            }
                            object3 = resultPoint3;
                        }
                        if (n4 <= 0) break block6;
                        object6 = bl2 ? this.bottomLeft : this.bottomRight;
                        float f7 = ((ResultPoint)object6).getY();
                        int n8 = (int)f7 + n4;
                        if (n8 >= (n4 = ((BitMatrix)(object5 = this.image)).getHeight())) {
                            object5 = this.image;
                            n4 = ((BitMatrix)object5).getHeight();
                            n8 = n4 + -1;
                        }
                        float f8 = ((ResultPoint)object6).getX();
                        f7 = n8;
                        object5 = new ResultPoint(f8, f7);
                        if (!bl2) break block7;
                        object2 = object5;
                        break block8;
                    }
                    object = object5;
                    object2 = resultPoint2;
                    break block9;
                }
                object2 = resultPoint2;
            }
            object = resultPoint;
        }
        BitMatrix bitMatrix = this.image;
        return new BoundingBox(bitMatrix, (ResultPoint)object4, (ResultPoint)object2, (ResultPoint)object3, (ResultPoint)object);
    }

    public ResultPoint getBottomLeft() {
        return this.bottomLeft;
    }

    public ResultPoint getBottomRight() {
        return this.bottomRight;
    }

    public int getMaxX() {
        return this.maxX;
    }

    public int getMaxY() {
        return this.maxY;
    }

    public int getMinX() {
        return this.minX;
    }

    public int getMinY() {
        return this.minY;
    }

    public ResultPoint getTopLeft() {
        return this.topLeft;
    }

    public ResultPoint getTopRight() {
        return this.topRight;
    }
}

