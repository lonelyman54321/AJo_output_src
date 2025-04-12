/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.DataMask;
import com.google.zxing.qrcode.decoder.FormatInformation;
import com.google.zxing.qrcode.decoder.Version;

final class BitMatrixParser {
    private final BitMatrix bitMatrix;
    private boolean mirror;
    private FormatInformation parsedFormatInfo;
    private Version parsedVersion;

    public BitMatrixParser(BitMatrix bitMatrix) {
        int n3 = bitMatrix.getHeight();
        int n4 = 21;
        if (n3 >= n4 && (n3 &= 3) == (n4 = 1)) {
            this.bitMatrix = bitMatrix;
            return;
        }
        throw FormatException.getFormatInstance();
    }

    private int copyBit(int n3, int n4, int n7) {
        boolean bl2 = this.mirror;
        if (bl2) {
            BitMatrix bitMatrix = this.bitMatrix;
            n3 = (int)(bitMatrix.get(n4, n3) ? 1 : 0);
        } else {
            BitMatrix bitMatrix = this.bitMatrix;
            n3 = (int)(bitMatrix.get(n3, n4) ? 1 : 0);
        }
        if (n3 != 0) {
            return n7 << 1 | 1;
        }
        return n7 << 1;
    }

    public void mirror() {
        BitMatrix bitMatrix;
        int n3;
        int n4 = 0;
        while (n4 < (n3 = (bitMatrix = this.bitMatrix).getWidth())) {
            BitMatrix bitMatrix2;
            int n7;
            for (int i3 = n3 = n4 + 1; i3 < (n7 = (bitMatrix2 = this.bitMatrix).getHeight()); ++i3) {
                BitMatrix bitMatrix3;
                int n8;
                bitMatrix2 = this.bitMatrix;
                n7 = (int)(bitMatrix2.get(n4, i3) ? 1 : 0);
                if (n7 == (n8 = (bitMatrix3 = this.bitMatrix).get(i3, n4))) continue;
                this.bitMatrix.flip(i3, n4);
                bitMatrix2 = this.bitMatrix;
                bitMatrix2.flip(n4, i3);
            }
            n4 = n3;
        }
    }

    public byte[] readCodewords() {
        BitMatrixParser bitMatrixParser = this;
        Object object = this.readFormatInformation();
        Version version = this.readVersion();
        Object object2 = DataMask.values();
        int n3 = ((FormatInformation)object).getDataMask();
        object = object2[n3];
        object2 = this.bitMatrix;
        int n4 = ((BitMatrix)object2).getHeight();
        Object object3 = this.bitMatrix;
        ((DataMask)((Object)object)).unmaskBitMatrix((BitMatrix)object3, n4);
        object = version.buildFunctionPattern();
        int n7 = version.getTotalCodewords();
        object3 = new byte[n7];
        int n8 = n4 + -1;
        boolean bl2 = true;
        int n10 = 0;
        int n14 = 0;
        int n15 = 0;
        for (int i3 = n8; i3 > 0; i3 += -2) {
            int n16 = 6;
            if (i3 == n16) {
                i3 += -1;
            }
            for (n16 = 0; n16 < n4; ++n16) {
                int n17;
                int n18 = bl2 ? n8 - n16 : n16;
                for (int i8 = 0; i8 < (n17 = 2); ++i8) {
                    n17 = i3 - i8;
                    boolean bl3 = ((BitMatrix)object).get(n17, n18);
                    if (bl3) continue;
                    ++n14;
                    n15 <<= 1;
                    BitMatrix bitMatrix = bitMatrixParser.bitMatrix;
                    int n19 = bitMatrix.get(n17, n18);
                    if (n19 != 0) {
                        n15 = n19 = n15 | 1;
                    }
                    if (n14 != (n19 = 8)) continue;
                    n19 = n10 + 1;
                    n14 = (byte)n15;
                    object3[n10] = n14;
                    n10 = n19;
                    n14 = 0;
                    n15 = 0;
                }
            }
            bl2 ^= true;
        }
        n3 = version.getTotalCodewords();
        if (n10 == n3) {
            return object3;
        }
        throw FormatException.getFormatInstance();
    }

    public FormatInformation readFormatInformation() {
        int n3;
        int n4;
        FormatInformation formatInformation = this.parsedFormatInfo;
        if (formatInformation != null) {
            return formatInformation;
        }
        int n7 = 0;
        formatInformation = null;
        int n8 = 0;
        int n10 = 0;
        BitMatrix bitMatrix = null;
        while (true) {
            n4 = 6;
            n3 = 8;
            if (n8 >= n4) break;
            n10 = this.copyBit(n8, n3, n10);
            ++n8;
        }
        n8 = 7;
        n10 = this.copyBit(n8, n3, n10);
        n10 = this.copyBit(n3, n3, n10);
        n8 = this.copyBit(n3, n8, n10);
        for (n10 = 5; n10 >= 0; n10 += -1) {
            n8 = this.copyBit(n3, n10, n8);
        }
        bitMatrix = this.bitMatrix;
        n10 = bitMatrix.getHeight();
        n4 = n10 + -7;
        for (int i3 = n10 + -1; i3 >= n4; i3 += -1) {
            n7 = this.copyBit(n3, i3, n7);
        }
        for (n4 = n10 + -8; n4 < n10; ++n4) {
            n7 = this.copyBit(n4, n3, n7);
        }
        this.parsedFormatInfo = formatInformation = FormatInformation.decodeFormatInformation(n8, n7);
        if (formatInformation != null) {
            return formatInformation;
        }
        throw FormatException.getFormatInstance();
    }

    public Version readVersion() {
        int n3;
        int n4;
        Object object = this.parsedVersion;
        if (object != null) {
            return object;
        }
        object = this.bitMatrix;
        int n7 = ((BitMatrix)object).getHeight();
        int n8 = (n7 + -17) / 4;
        if (n8 <= (n4 = 6)) {
            return Version.getVersionForNumber(n8);
        }
        n8 = n7 + -11;
        n4 = 5;
        int n10 = 0;
        int n14 = 0;
        for (n3 = 5; n3 >= 0; n3 += -1) {
            for (int i3 = n7 + -9; i3 >= n8; i3 += -1) {
                n14 = this.copyBit(i3, n3, n14);
            }
        }
        Version version = Version.decodeVersionInformation(n14);
        if (version != null && (n14 = version.getDimensionForVersion()) == n7) {
            this.parsedVersion = version;
            return version;
        }
        while (n4 >= 0) {
            for (n3 = n7 + -9; n3 >= n8; n3 += -1) {
                n10 = this.copyBit(n4, n3, n10);
            }
            n4 += -1;
        }
        Version version2 = Version.decodeVersionInformation(n10);
        if (version2 != null && (n4 = version2.getDimensionForVersion()) == n7) {
            this.parsedVersion = version2;
            return version2;
        }
        throw FormatException.getFormatInstance();
    }

    public void remask() {
        Object object = this.parsedFormatInfo;
        if (object == null) {
            return;
        }
        object = DataMask.values();
        int n3 = this.parsedFormatInfo.getDataMask();
        object = object[n3];
        n3 = this.bitMatrix.getHeight();
        BitMatrix bitMatrix = this.bitMatrix;
        ((DataMask)((Object)object)).unmaskBitMatrix(bitMatrix, n3);
    }

    public void setMirror(boolean bl2) {
        this.parsedVersion = null;
        this.parsedFormatInfo = null;
        this.mirror = bl2;
    }
}

