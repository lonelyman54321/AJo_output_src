/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.EAN13Reader;
import com.google.zxing.oned.OneDReader;
import com.google.zxing.oned.UPCEANReader;
import com.google.zxing.oned.UPCEReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class MultiFormatUPCEANReader
extends OneDReader {
    private final UPCEANReader[] readers;

    public MultiFormatUPCEANReader(Map object) {
        DecodeHintType decodeHintType;
        boolean bl2;
        if (object == null) {
            bl2 = false;
            object = null;
        } else {
            decodeHintType = DecodeHintType.POSSIBLE_FORMATS;
            object = (Collection)object.get((Object)decodeHintType);
        }
        if (object != null) {
            Object object2 = BarcodeFormat.EAN_13;
            boolean bl3 = object.contains(object2);
            if (bl3) {
                super();
                ((ArrayList)((Object)decodeHintType)).add(object2);
            } else {
                object2 = BarcodeFormat.UPC_A;
                bl3 = object.contains(object2);
                if (bl3) {
                    super();
                    ((ArrayList)((Object)decodeHintType)).add(object2);
                }
            }
            object2 = BarcodeFormat.EAN_8;
            bl3 = object.contains(object2);
            if (bl3) {
                super();
                ((ArrayList)((Object)decodeHintType)).add(object2);
            }
            if (bl2 = object.contains(object2 = BarcodeFormat.UPC_E)) {
                object = new UPCEReader();
                ((ArrayList)((Object)decodeHintType)).add(object);
            }
        }
        if (bl2 = ((ArrayList)((Object)decodeHintType)).isEmpty()) {
            object = new EAN13Reader();
            ((ArrayList)((Object)decodeHintType)).add(object);
            super();
            ((ArrayList)((Object)decodeHintType)).add(object);
            object = new UPCEReader();
            ((ArrayList)((Object)decodeHintType)).add(object);
        }
        object = new UPCEANReader[((ArrayList)((Object)decodeHintType)).size()];
        object = ((ArrayList)((Object)decodeHintType)).toArray((T[])object);
        this.readers = object;
    }

    public Result decodeRow(int n3, BitArray bitArray, Map map2) {
        int[] nArray = UPCEANReader.findStartGuardPattern(bitArray);
        for (UPCEANReader uPCEANReader : this.readers) {
            ResultPoint[] resultPointArray;
            char c2;
            char c3;
            int n4;
            Object object;
            Object object2;
            Result result2;
            block27: {
                block26: {
                    block25: {
                        block24: {
                            try {
                                result2 = uPCEANReader.decodeRow(n3, bitArray, nArray, map2);
                            }
                            catch (ReaderException readerException) {
                                continue;
                            }
                            object2 = result2.getBarcodeFormat();
                            object = BarcodeFormat.EAN_13;
                            n4 = 1;
                            if (object2 != object) break block24;
                            object2 = result2.getText();
                            c3 = ((String)object2).charAt(0);
                            c2 = '0';
                            if (c3 != c2) break block24;
                            c3 = '\u0001';
                            break block25;
                        }
                        c3 = '\u0000';
                        object2 = null;
                    }
                    if (map2 == null) {
                        c2 = '\u0000';
                        object = null;
                    } else {
                        object = DecodeHintType.POSSIBLE_FORMATS;
                        object = map2.get(object);
                        object = (Collection)object;
                    }
                    if (object != null) {
                        resultPointArray = BarcodeFormat.UPC_A;
                        c2 = (char)(object.contains(resultPointArray) ? 1 : 0);
                        if (c2 != '\u0000') break block26;
                        c2 = '\u0000';
                        object = null;
                        break block27;
                    }
                }
                c2 = '\u0001';
            }
            if (c3 != '\u0000' && c2 != '\u0000') {
                object = result2.getText();
                object = ((String)object).substring(n4);
                byte[] byArray = result2.getRawBytes();
                resultPointArray = result2.getResultPoints();
                BarcodeFormat barcodeFormat = BarcodeFormat.UPC_A;
                object2 = new Result((String)object, byArray, resultPointArray, barcodeFormat);
                Map map3 = result2.getResultMetadata();
                ((Result)object2).putAllMetadata(map3);
                return object2;
            }
            return result2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public void reset() {
        for (UPCEANReader uPCEANReader : this.readers) {
            uPCEANReader.reset();
        }
    }
}

