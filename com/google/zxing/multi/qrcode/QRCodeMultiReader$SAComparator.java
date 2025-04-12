/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.multi.qrcode;

import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.multi.qrcode.QRCodeMultiReader$1;
import java.io.Serializable;
import java.util.Comparator;

final class QRCodeMultiReader$SAComparator
implements Serializable,
Comparator {
    private QRCodeMultiReader$SAComparator() {
    }

    public /* synthetic */ QRCodeMultiReader$SAComparator(QRCodeMultiReader$1 qRCodeMultiReader$1) {
        this();
    }

    public int compare(Result object, Result result2) {
        object = ((Result)object).getResultMetadata();
        ResultMetadataType resultMetadataType = ResultMetadataType.STRUCTURED_APPEND_SEQUENCE;
        int n3 = (Integer)object.get((Object)resultMetadataType);
        int n4 = (Integer)result2.getResultMetadata().get((Object)resultMetadataType);
        return Integer.compare(n3, n4);
    }
}

