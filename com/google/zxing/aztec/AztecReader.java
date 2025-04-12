/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.aztec.decoder.Decoder;
import com.google.zxing.aztec.detector.Detector;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.DetectorResult;
import java.util.Map;

public final class AztecReader
implements Reader {
    public Result decode(BinaryBitmap binaryBitmap) {
        return this.decode(binaryBitmap, null);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Result decode(BinaryBitmap object, Map object2) {
        ResultPoint[] resultPointArray;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        block20: {
            int n3;
            block21: {
                void var1_4;
                block19: {
                    boolean bl2;
                    block18: {
                        block17: {
                            block16: {
                                object = ((BinaryBitmap)object).getBlackMatrix();
                                object7 = new Detector((BitMatrix)object);
                                n3 = 0;
                                object = null;
                                bl2 = false;
                                object6 = null;
                                try {
                                    object5 = ((Detector)object7).detect(false);
                                    object4 = ((DetectorResult)object5).getPoints();
                                }
                                catch (FormatException formatException) {
                                    object4 = null;
                                    break block16;
                                }
                                catch (NotFoundException notFoundException) {
                                    object4 = null;
                                    break block17;
                                }
                                try {
                                    object3 = new Decoder();
                                    object5 = object3.decode((AztecDetectorResult)object5);
                                    object3 = object4;
                                    object4 = null;
                                    object6 = object5;
                                    object5 = null;
                                    break block18;
                                }
                                catch (FormatException formatException) {
                                }
                                catch (NotFoundException notFoundException) {
                                    break block17;
                                }
                            }
                            object3 = object4;
                            object4 = object5;
                            object5 = null;
                            break block18;
                        }
                        object3 = object4;
                        object4 = null;
                    }
                    if (object6 == null) {
                        bl2 = true;
                        try {
                            object7 = ((Detector)object7).detect(bl2);
                            object3 = ((DetectorResult)object7).getPoints();
                            object6 = new Decoder();
                            object6 = ((Decoder)object6).decode((AztecDetectorResult)object7);
                        }
                        catch (FormatException formatException) {
                            break block19;
                        }
                        catch (NotFoundException notFoundException) {
                            // empty catch block
                            break block19;
                        }
                    }
                    resultPointArray = object3;
                    if (object2 == null) break block20;
                    break block21;
                }
                if (object5 != null) {
                    throw object5;
                }
                if (object4 != null) {
                    throw object4;
                }
                throw var1_4;
            }
            object7 = DecodeHintType.NEED_RESULT_POINT_CALLBACK;
            if ((object2 = (ResultPointCallback)object2.get(object7)) != null) {
                int n4 = ((ResultPoint[])object3).length;
                while (n3 < n4) {
                    object5 = resultPointArray[n3];
                    object2.foundPossibleResultPoint((ResultPoint)object5);
                    ++n3;
                }
            }
        }
        object4 = ((DecoderResult)object6).getText();
        object3 = ((DecoderResult)object6).getRawBytes();
        int n7 = ((DecoderResult)object6).getNumBits();
        BarcodeFormat barcodeFormat = BarcodeFormat.AZTEC;
        long l2 = System.currentTimeMillis();
        object5 = object;
        object = new Result((String)object4, (byte[])object3, n7, resultPointArray, barcodeFormat, l2);
        object2 = ((DecoderResult)object6).getByteSegments();
        if (object2 != null) {
            object7 = ResultMetadataType.BYTE_SEGMENTS;
            ((Result)object).putMetadata((ResultMetadataType)((Object)object7), object2);
        }
        if ((object2 = ((DecoderResult)object6).getECLevel()) != null) {
            object7 = ResultMetadataType.ERROR_CORRECTION_LEVEL;
            ((Result)object).putMetadata((ResultMetadataType)((Object)object7), object2);
        }
        return object;
    }

    public void reset() {
    }
}

