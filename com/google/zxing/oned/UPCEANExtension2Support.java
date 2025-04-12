/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.UPCEANReader;
import java.util.EnumMap;
import java.util.Map;

final class UPCEANExtension2Support {
    private final int[] decodeMiddleCounters;
    private final StringBuilder decodeRowStringBuffer;

    public UPCEANExtension2Support() {
        Object object = new int[4];
        this.decodeMiddleCounters = object;
        object = new StringBuilder;
        this.decodeRowStringBuffer = object;
    }

    private int decodeMiddle(BitArray object, int[] nArray, StringBuilder stringBuilder) {
        int[] nArray2 = this.decodeMiddleCounters;
        nArray2[0] = 0;
        int n3 = 1;
        nArray2[n3] = 0;
        int n4 = 2;
        nArray2[n4] = 0;
        nArray2[3] = 0;
        int n7 = ((BitArray)object).getSize();
        int n8 = nArray[n3];
        int n10 = 0;
        for (int i3 = 0; i3 < n4 && n8 < n7; ++i3) {
            int[][] nArray3 = UPCEANReader.L_AND_G_PATTERNS;
            int n14 = UPCEANReader.decodeDigit((BitArray)object, nArray2, n8, nArray3);
            int n15 = n14 % 10 + 48;
            stringBuilder.append((char)n15);
            for (int n16 : nArray2) {
                n8 += n16;
            }
            n15 = 10;
            if (n14 >= n15) {
                n14 = 1 - i3;
                n14 = n3 << n14;
                n10 |= n14;
            }
            if (i3 == n3) continue;
            n8 = ((BitArray)object).getNextSet(n8);
            n8 = ((BitArray)object).getNextUnset(n8);
        }
        int n17 = stringBuilder.length();
        if (n17 == n4) {
            object = stringBuilder.toString();
            n17 = Integer.parseInt((String)object) % 4;
            if (n17 == n10) {
                return n8;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static Map parseExtensionString(String object) {
        int n3;
        int n4 = ((String)object).length();
        if (n4 != (n3 = 2)) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        ResultMetadataType resultMetadataType = ResultMetadataType.ISSUE_NUMBER;
        object = Integer.valueOf((String)object);
        enumMap.put((Object)resultMetadataType, object);
        return enumMap;
    }

    public Result decodeRow(int n3, BitArray object, int[] object2) {
        CharSequence charSequence = this.decodeRowStringBuffer;
        charSequence.setLength(0);
        int n4 = this.decodeMiddle((BitArray)object, (int[])object2, (StringBuilder)charSequence);
        charSequence = charSequence.toString();
        Map map2 = UPCEANExtension2Support.parseExtensionString((String)charSequence);
        int n7 = object2[0];
        int n8 = 1;
        int n10 = object2[n8];
        float f5 = n7 + n10;
        n7 = 0x40000000;
        float f6 = 2.0f;
        float f7 = n3;
        ResultPoint resultPoint = new ResultPoint(f5 /= f6, f7);
        object2 = new ResultPoint;
        float f8 = n4;
        object2(f8, f7);
        n3 = 2;
        f7 = 2.8E-45f;
        ResultPoint[] resultPointArray = new ResultPoint[n3];
        resultPointArray[0] = resultPoint;
        resultPointArray[n8] = object2;
        object = BarcodeFormat.UPC_EAN_EXTENSION;
        n10 = 0;
        f5 = 0.0f;
        object2 = null;
        Result result2 = new Result((String)charSequence, null, resultPointArray, (BarcodeFormat)((Object)object));
        if (map2 != null) {
            result2.putAllMetadata(map2);
        }
        return result2;
    }
}

