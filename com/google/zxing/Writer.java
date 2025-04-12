/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

public interface Writer {
    public BitMatrix encode(String var1, BarcodeFormat var2, int var3, int var4);

    public BitMatrix encode(String var1, BarcodeFormat var2, int var3, int var4, Map var5);
}

