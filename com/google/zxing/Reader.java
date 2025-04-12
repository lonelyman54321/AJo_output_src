/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.Result;
import java.util.Map;

public interface Reader {
    public Result decode(BinaryBitmap var1);

    public Result decode(BinaryBitmap var1, Map var2);

    public void reset();
}

