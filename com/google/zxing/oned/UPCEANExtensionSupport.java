/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.UPCEANExtension2Support;
import com.google.zxing.oned.UPCEANExtension5Support;
import com.google.zxing.oned.UPCEANReader;

final class UPCEANExtensionSupport {
    private static final int[] EXTENSION_START_PATTERN;
    private final UPCEANExtension5Support fiveSupport;
    private final UPCEANExtension2Support twoSupport;

    static {
        int n3 = 1;
        EXTENSION_START_PATTERN = new int[]{n3, n3, 2};
    }

    public UPCEANExtensionSupport() {
        Object object = new UPCEANExtension2Support();
        this.twoSupport = object;
        this.fiveSupport = object = new UPCEANExtension5Support();
    }

    public Result decodeRow(int n3, BitArray bitArray, int n4) {
        UPCEANExtension5Support uPCEANExtension5Support = null;
        int[] nArray = EXTENSION_START_PATTERN;
        int[] nArray2 = UPCEANReader.findGuardPattern(bitArray, n4, false, nArray);
        try {
            uPCEANExtension5Support = this.fiveSupport;
        }
        catch (ReaderException readerException) {
            return this.twoSupport.decodeRow(n3, bitArray, nArray2);
        }
        return uPCEANExtension5Support.decodeRow(n3, bitArray, nArray2);
    }
}

