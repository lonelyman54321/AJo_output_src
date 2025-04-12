/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import java.util.Map;

public final class ByQuadrantReader
implements Reader {
    private final Reader delegate;

    public ByQuadrantReader(Reader reader) {
        this.delegate = reader;
    }

    private static void makeAbsolute(ResultPoint[] resultPointArray, int n3, int n4) {
        if (resultPointArray != null) {
            int n7;
            for (int i3 = 0; i3 < (n7 = resultPointArray.length); ++i3) {
                ResultPoint resultPoint;
                ResultPoint resultPoint2 = resultPointArray[i3];
                float f5 = resultPoint2.getX();
                float f6 = n3;
                f5 += f6;
                float f7 = resultPoint2.getY();
                f6 = n4;
                resultPointArray[i3] = resultPoint = new ResultPoint(f5, f7 += f6);
            }
        }
    }

    public Result decode(BinaryBitmap binaryBitmap) {
        return this.decode(binaryBitmap, null);
    }

    public Result decode(BinaryBitmap object, Map map2) {
        ResultPoint[] resultPointArray;
        ResultPoint[] resultPointArray2;
        int n3 = ((BinaryBitmap)object).getWidth();
        int n4 = ((BinaryBitmap)object).getHeight();
        n3 /= 2;
        n4 /= 2;
        int n7 = 0;
        Object object2 = null;
        try {
            resultPointArray2 = this.delegate;
        }
        catch (NotFoundException notFoundException) {
            try {
                resultPointArray2 = this.delegate;
            }
            catch (NotFoundException notFoundException2) {
                try {
                    resultPointArray2 = this.delegate;
                }
                catch (NotFoundException notFoundException3) {
                    try {
                        object2 = this.delegate;
                    }
                    catch (NotFoundException notFoundException4) {
                        n7 = n3 / 2;
                        int n8 = n4 / 2;
                        object = ((BinaryBitmap)object).crop(n7, n8, n3, n4);
                        object = this.delegate.decode((BinaryBitmap)object, map2);
                        ByQuadrantReader.makeAbsolute(((Result)object).getResultPoints(), n7, n8);
                        return object;
                    }
                    resultPointArray2 = ((BinaryBitmap)object).crop(n3, n4, n3, n4);
                    object2 = object2.decode((BinaryBitmap)resultPointArray2, map2);
                    resultPointArray2 = ((Result)object2).getResultPoints();
                    ByQuadrantReader.makeAbsolute(resultPointArray2, n3, n4);
                    return object2;
                }
                resultPointArray = ((BinaryBitmap)object).crop(0, n4, n3, n4);
                resultPointArray2 = resultPointArray2.decode((BinaryBitmap)resultPointArray, map2);
                resultPointArray = resultPointArray2.getResultPoints();
                ByQuadrantReader.makeAbsolute(resultPointArray, 0, n4);
                return resultPointArray2;
            }
            resultPointArray = ((BinaryBitmap)object).crop(n3, 0, n3, n4);
            resultPointArray2 = resultPointArray2.decode((BinaryBitmap)resultPointArray, map2);
            resultPointArray = resultPointArray2.getResultPoints();
            ByQuadrantReader.makeAbsolute(resultPointArray, n3, 0);
            return resultPointArray2;
        }
        resultPointArray = ((BinaryBitmap)object).crop(0, 0, n3, n4);
        return resultPointArray2.decode((BinaryBitmap)resultPointArray, map2);
    }

    public void reset() {
        this.delegate.reset();
    }
}

