/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.multi.qrcode.detector.MultiFinderPatternFinder;
import com.google.zxing.qrcode.detector.Detector;
import com.google.zxing.qrcode.detector.FinderPatternInfo;
import java.util.ArrayList;
import java.util.Map;

public final class MultiDetector
extends Detector {
    private static final DetectorResult[] EMPTY_DETECTOR_RESULTS = new DetectorResult[0];

    public MultiDetector(BitMatrix bitMatrix) {
        super(bitMatrix);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public DetectorResult[] detectMulti(Map objectArray) {
        void var4_7;
        int n3;
        Cloneable cloneable = this.getImage();
        if (objectArray == null) {
            n3 = 0;
            Object var4_4 = null;
        } else {
            DecodeHintType decodeHintType = DecodeHintType.NEED_RESULT_POINT_CALLBACK;
            ResultPointCallback resultPointCallback = (ResultPointCallback)objectArray.get((Object)decodeHintType);
        }
        MultiFinderPatternFinder multiFinderPatternFinder = new MultiFinderPatternFinder((BitMatrix)cloneable, (ResultPointCallback)var4_7);
        objectArray = multiFinderPatternFinder.findMulti((Map)objectArray);
        int n4 = objectArray.length;
        if (n4 == 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        cloneable = new ArrayList();
        n3 = objectArray.length;
        int n7 = 0;
        multiFinderPatternFinder = null;
        while (true) {
            if (n7 < n3) {
                Object object = objectArray[n7];
                object = this.processFinderPatternInfo((FinderPatternInfo)object);
                ((ArrayList)cloneable).add(object);
            } else {
                boolean bl2 = ((ArrayList)cloneable).isEmpty();
                if (bl2) {
                    return EMPTY_DETECTOR_RESULTS;
                }
                objectArray = new DetectorResult[((ArrayList)cloneable).size()];
                return (DetectorResult[])((ArrayList)cloneable).toArray(objectArray);
                catch (ReaderException readerException) {}
            }
            ++n7;
        }
    }
}

