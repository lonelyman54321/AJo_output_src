/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.CodaBarReader;
import com.google.zxing.oned.Code128Reader;
import com.google.zxing.oned.Code39Reader;
import com.google.zxing.oned.Code93Reader;
import com.google.zxing.oned.ITFReader;
import com.google.zxing.oned.MultiFormatUPCEANReader;
import com.google.zxing.oned.OneDReader;
import com.google.zxing.oned.rss.RSS14Reader;
import com.google.zxing.oned.rss.expanded.RSSExpandedReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class MultiFormatOneDReader
extends OneDReader {
    private final OneDReader[] readers;

    public MultiFormatOneDReader(Map object) {
        boolean bl2;
        DecodeHintType decodeHintType;
        Object v4;
        Object object2;
        boolean bl3;
        if (object == null) {
            bl3 = false;
            object2 = null;
        } else {
            object2 = DecodeHintType.POSSIBLE_FORMATS;
            object2 = (Collection)object.get(object2);
        }
        if (object != null && (v4 = object.get((Object)(decodeHintType = DecodeHintType.ASSUME_CODE_39_CHECK_DIGIT))) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            Object var4_16 = null;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (object2 != null) {
            BarcodeFormat barcodeFormat;
            BarcodeFormat barcodeFormat2;
            BarcodeFormat barcodeFormat3;
            BarcodeFormat barcodeFormat4;
            BarcodeFormat barcodeFormat5;
            BarcodeFormat barcodeFormat6;
            BarcodeFormat barcodeFormat7;
            BarcodeFormat barcodeFormat8;
            BarcodeFormat barcodeFormat9;
            BarcodeFormat barcodeFormat10;
            BarcodeFormat barcodeFormat11 = BarcodeFormat.EAN_13;
            boolean bl4 = object2.contains((Object)barcodeFormat11);
            if (bl4 || (bl4 = object2.contains((Object)(barcodeFormat10 = BarcodeFormat.UPC_A))) || (bl4 = object2.contains((Object)(barcodeFormat9 = BarcodeFormat.EAN_8))) || (bl4 = object2.contains((Object)(barcodeFormat8 = BarcodeFormat.UPC_E)))) {
                MultiFormatUPCEANReader multiFormatUPCEANReader = new MultiFormatUPCEANReader((Map)object);
                arrayList.add(multiFormatUPCEANReader);
            }
            if (bl4 = object2.contains((Object)(barcodeFormat7 = BarcodeFormat.CODE_39))) {
                Code39Reader code39Reader = new Code39Reader(bl2);
                arrayList.add(code39Reader);
            }
            if (bl2 = object2.contains((Object)(barcodeFormat6 = BarcodeFormat.CODE_93))) {
                Code93Reader code93Reader = new Code93Reader();
                arrayList.add(code93Reader);
            }
            if (bl2 = object2.contains((Object)(barcodeFormat5 = BarcodeFormat.CODE_128))) {
                Code128Reader code128Reader = new Code128Reader();
                arrayList.add(code128Reader);
            }
            if (bl2 = object2.contains((Object)(barcodeFormat4 = BarcodeFormat.ITF))) {
                ITFReader iTFReader = new ITFReader();
                arrayList.add(iTFReader);
            }
            if (bl2 = object2.contains((Object)(barcodeFormat3 = BarcodeFormat.CODABAR))) {
                CodaBarReader codaBarReader = new CodaBarReader();
                arrayList.add(codaBarReader);
            }
            if (bl2 = object2.contains((Object)(barcodeFormat2 = BarcodeFormat.RSS_14))) {
                RSS14Reader rSS14Reader = new RSS14Reader();
                arrayList.add(rSS14Reader);
            }
            if (bl3 = object2.contains((Object)(barcodeFormat = BarcodeFormat.RSS_EXPANDED))) {
                object2 = new RSSExpandedReader();
                arrayList.add(object2);
            }
        }
        if (bl3 = arrayList.isEmpty()) {
            object2 = new MultiFormatUPCEANReader((Map)object);
            arrayList.add(object2);
            Code39Reader code39Reader = new Code39Reader();
            arrayList.add(code39Reader);
            CodaBarReader codaBarReader = new CodaBarReader();
            arrayList.add(codaBarReader);
            Code93Reader code93Reader = new Code93Reader();
            arrayList.add(code93Reader);
            Code128Reader code128Reader = new Code128Reader();
            arrayList.add(code128Reader);
            ITFReader iTFReader = new ITFReader();
            arrayList.add(iTFReader);
            RSS14Reader rSS14Reader = new RSS14Reader();
            arrayList.add(rSS14Reader);
            RSSExpandedReader rSSExpandedReader = new RSSExpandedReader();
            arrayList.add(rSSExpandedReader);
        }
        OneDReader[] oneDReaderArray2 = new OneDReader[arrayList.size()];
        oneDReaderArray2 = arrayList.toArray(oneDReaderArray2);
        this.readers = oneDReaderArray2;
    }

    public Result decodeRow(int n3, BitArray bitArray, Map map2) {
        for (OneDReader oneDReader : this.readers) {
            try {
                return oneDReader.decodeRow(n3, bitArray, map2);
            }
            catch (ReaderException readerException) {
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public void reset() {
        for (OneDReader oneDReader : this.readers) {
            oneDReader.reset();
        }
    }
}

