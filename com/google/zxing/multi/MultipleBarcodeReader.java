/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.Result;
import java.util.Map;

public interface MultipleBarcodeReader {
    public Result[] decodeMultiple(BinaryBitmap var1);

    public Result[] decodeMultiple(BinaryBitmap var1, Map var2);
}

