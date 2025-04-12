/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.aztec.AztecReader;
import com.google.zxing.datamatrix.DataMatrixReader;
import com.google.zxing.maxicode.MaxiCodeReader;
import com.google.zxing.oned.MultiFormatOneDReader;
import com.google.zxing.pdf417.PDF417Reader;
import com.google.zxing.qrcode.QRCodeReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class MultiFormatReader
implements Reader {
    private Map hints;
    private Reader[] readers;

    private Result decodeInternal(BinaryBitmap binaryBitmap) {
        Reader[] readerArray = this.readers;
        if (readerArray != null) {
            for (Reader reader : readerArray) {
                Map map2;
                try {
                    map2 = this.hints;
                }
                catch (ReaderException readerException) {
                    continue;
                }
                return reader.decode(binaryBitmap, map2);
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public Result decode(BinaryBitmap binaryBitmap) {
        this.setHints(null);
        return this.decodeInternal(binaryBitmap);
    }

    public Result decode(BinaryBitmap binaryBitmap, Map map2) {
        this.setHints(map2);
        return this.decodeInternal(binaryBitmap);
    }

    public Result decodeWithState(BinaryBitmap binaryBitmap) {
        Reader[] readerArray = this.readers;
        if (readerArray == null) {
            readerArray = null;
            this.setHints(null);
        }
        return this.decodeInternal(binaryBitmap);
    }

    public void reset() {
        Reader[] readerArray = this.readers;
        if (readerArray != null) {
            for (Reader reader : readerArray) {
                reader.reset();
            }
        }
    }

    public void setHints(Map readerArray) {
        Object object;
        DecodeHintType decodeHintType;
        boolean bl2;
        this.hints = readerArray;
        boolean bl3 = false;
        Reader reader = null;
        boolean bl4 = true;
        if (readerArray != null && (bl2 = readerArray.containsKey((Object)(decodeHintType = DecodeHintType.TRY_HARDER)))) {
            bl2 = true;
        } else {
            bl2 = false;
            decodeHintType = null;
        }
        if (readerArray == null) {
            object = null;
        } else {
            object = DecodeHintType.POSSIBLE_FORMATS;
            object = (Collection)readerArray.get(object);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (object != null) {
            Object object2;
            BarcodeFormat barcodeFormat = BarcodeFormat.UPC_A;
            boolean bl5 = object.contains((Object)barcodeFormat);
            if (bl5 || (bl5 = object.contains((Object)(barcodeFormat = BarcodeFormat.UPC_E))) || (bl5 = object.contains((Object)(barcodeFormat = BarcodeFormat.EAN_13))) || (bl5 = object.contains((Object)(barcodeFormat = BarcodeFormat.EAN_8))) || (bl5 = object.contains((Object)(barcodeFormat = BarcodeFormat.CODABAR))) || (bl5 = object.contains((Object)(barcodeFormat = BarcodeFormat.CODE_39))) || (bl5 = object.contains((Object)(barcodeFormat = BarcodeFormat.CODE_93))) || (bl5 = object.contains((Object)(barcodeFormat = BarcodeFormat.CODE_128))) || (bl5 = object.contains((Object)(barcodeFormat = BarcodeFormat.ITF))) || (bl5 = object.contains((Object)(barcodeFormat = BarcodeFormat.RSS_14))) || (bl5 = object.contains((Object)(barcodeFormat = BarcodeFormat.RSS_EXPANDED)))) {
                bl3 = true;
            }
            if (bl3 && !bl2) {
                object2 = new MultiFormatOneDReader((Map)readerArray);
                arrayList.add(object2);
            }
            if (bl4 = object.contains(object2 = BarcodeFormat.QR_CODE)) {
                object2 = new QRCodeReader();
                arrayList.add(object2);
            }
            if (bl4 = object.contains(object2 = BarcodeFormat.DATA_MATRIX)) {
                object2 = new DataMatrixReader();
                arrayList.add(object2);
            }
            if (bl4 = object.contains(object2 = BarcodeFormat.AZTEC)) {
                object2 = new AztecReader();
                arrayList.add(object2);
            }
            if (bl4 = object.contains(object2 = BarcodeFormat.PDF_417)) {
                object2 = new PDF417Reader();
                arrayList.add(object2);
            }
            if (bl4 = object.contains(object2 = BarcodeFormat.MAXICODE)) {
                object2 = new MaxiCodeReader();
                arrayList.add(object2);
            }
            if (bl3 && bl2) {
                reader = new MultiFormatOneDReader((Map)readerArray);
                arrayList.add(reader);
            }
        }
        if (bl3 = arrayList.isEmpty()) {
            if (!bl2) {
                reader = new MultiFormatOneDReader((Map)readerArray);
                arrayList.add(reader);
            }
            reader = new QRCodeReader();
            arrayList.add(reader);
            reader = new DataMatrixReader();
            arrayList.add(reader);
            reader = new AztecReader();
            arrayList.add(reader);
            reader = new PDF417Reader();
            arrayList.add(reader);
            reader = new MaxiCodeReader();
            arrayList.add(reader);
            if (bl2) {
                reader = new MultiFormatOneDReader((Map)readerArray);
                arrayList.add(reader);
            }
        }
        readerArray = new Reader[arrayList.size()];
        readerArray = arrayList.toArray(readerArray);
        this.readers = readerArray;
    }
}

