/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.Decoder;
import com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData;
import com.google.zxing.qrcode.detector.Detector;
import java.util.Map;

public class QRCodeReader
implements Reader {
    private static final ResultPoint[] NO_POINTS = new ResultPoint[0];
    private final Decoder decoder;

    public QRCodeReader() {
        Decoder decoder;
        this.decoder = decoder = new Decoder();
    }

    private static BitMatrix extractPureBits(BitMatrix bitMatrix) {
        int[] nArray = bitMatrix.getTopLeftOnBit();
        Object object = bitMatrix.getBottomRightOnBit();
        if (nArray != null && object != null) {
            float f5 = QRCodeReader.moduleSize(nArray, bitMatrix);
            int n3 = 1;
            float f6 = Float.MIN_VALUE;
            int n4 = nArray[n3];
            int n7 = object[n3];
            int n8 = nArray[0];
            int n10 = object[0];
            if (n8 < n10 && n4 < n7) {
                int n14 = n7 - n4;
                int n15 = n10 - n8;
                if (n14 != n15 && (n10 = n8 + n14) >= (n15 = bitMatrix.getWidth())) {
                    throw NotFoundException.getNotFoundInstance();
                }
                float f7 = (float)(n10 - n8 + n3) / f5;
                n15 = Math.round(f7);
                f6 = (float)(n14 += n3) / f5;
                n3 = Math.round(f6);
                if (n15 > 0 && n3 > 0) {
                    if (n3 == n15) {
                        float f8;
                        float f11 = f5 / 2.0f;
                        n14 = (int)f11;
                        n4 += n14;
                        float f12 = (float)(n15 + -1) * f5;
                        int n16 = (int)f12 + (n8 += n14) - n10;
                        if (n16 > 0) {
                            if (n16 <= n14) {
                                n8 -= n16;
                            } else {
                                throw NotFoundException.getNotFoundInstance();
                            }
                        }
                        if ((n10 = (int)(f8 = (float)(n3 + -1) * f5) + n4 - n7) > 0) {
                            if (n10 <= n14) {
                                n4 -= n10;
                            } else {
                                throw NotFoundException.getNotFoundInstance();
                            }
                        }
                        object = new BitMatrix;
                        ((BitMatrix)object)(n15, n3);
                        for (n7 = 0; n7 < n3; ++n7) {
                            f11 = (float)n7 * f5;
                            n14 = (int)f11 + n4;
                            f12 = 0.0f;
                            for (n16 = 0; n16 < n15; ++n16) {
                                float f14 = (float)n16 * f5;
                                int n17 = (int)f14 + n8;
                                if ((n17 = (int)(bitMatrix.get(n17, n14) ? 1 : 0)) == 0) continue;
                                ((BitMatrix)object).set(n16, n7);
                            }
                        }
                        return object;
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                throw NotFoundException.getNotFoundInstance();
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static float moduleSize(int[] nArray, BitMatrix bitMatrix) {
        int n3;
        int n4 = bitMatrix.getHeight();
        int n7 = bitMatrix.getWidth();
        int n8 = nArray[0];
        int n10 = 1;
        int n14 = 0;
        for (n3 = nArray[n10]; n8 < n7 && n3 < n4; ++n8, ++n3) {
            int n15 = bitMatrix.get(n8, n3);
            if (n10 == n15) continue;
            n15 = 5;
            if (++n14 == n15) break;
            n10 ^= 1;
        }
        if (n8 != n7 && n3 != n4) {
            int n16 = nArray[0];
            return (float)(n8 - n16) / 7.0f;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public Result decode(BinaryBitmap binaryBitmap) {
        return this.decode(binaryBitmap, null);
    }

    public final Result decode(BinaryBitmap object, Map object2) {
        boolean bl2;
        Object object3;
        Object object4;
        boolean bl3;
        if (object2 != null && (bl3 = object2.containsKey(object4 = DecodeHintType.PURE_BARCODE))) {
            object = QRCodeReader.extractPureBits(object.getBlackMatrix());
            object4 = this.decoder;
            object = ((Decoder)object4).decode((BitMatrix)object, (Map)object2);
            object2 = NO_POINTS;
        } else {
            object = object.getBlackMatrix();
            object4 = new Detector((BitMatrix)object);
            object = ((Detector)object4).detect((Map)object2);
            object4 = this.decoder;
            object3 = object.getBits();
            object2 = ((Decoder)object4).decode((BitMatrix)object3, (Map)object2);
            object = object.getPoints();
            ResultPoint[] resultPointArray = object2;
            object2 = object;
            object = resultPointArray;
        }
        object4 = object.getOther();
        bl3 = object4 instanceof QRCodeDecoderMetaData;
        if (bl3) {
            object4 = (QRCodeDecoderMetaData)object.getOther();
            ((QRCodeDecoderMetaData)object4).applyMirroredCorrection((ResultPoint[])object2);
        }
        object3 = object.getText();
        byte[] byArray = object.getRawBytes();
        BarcodeFormat barcodeFormat = BarcodeFormat.QR_CODE;
        object4 = new Result((String)object3, byArray, (ResultPoint[])object2, barcodeFormat);
        object2 = object.getByteSegments();
        if (object2 != null) {
            object3 = ResultMetadataType.BYTE_SEGMENTS;
            ((Result)object4).putMetadata((ResultMetadataType)((Object)object3), object2);
        }
        if ((object2 = object.getECLevel()) != null) {
            object3 = ResultMetadataType.ERROR_CORRECTION_LEVEL;
            ((Result)object4).putMetadata((ResultMetadataType)((Object)object3), object2);
        }
        if (bl2 = object.hasStructuredAppend()) {
            object2 = ResultMetadataType.STRUCTURED_APPEND_SEQUENCE;
            int n3 = object.getStructuredAppendSequenceNumber();
            object3 = n3;
            ((Result)object4).putMetadata((ResultMetadataType)((Object)object2), object3);
            object2 = ResultMetadataType.STRUCTURED_APPEND_PARITY;
            int n4 = object.getStructuredAppendParity();
            object = n4;
            ((Result)object4).putMetadata((ResultMetadataType)((Object)object2), object);
        }
        return object4;
    }

    public final Decoder getDecoder() {
        return this.decoder;
    }

    public void reset() {
    }
}

