/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.datamatrix.decoder.Version$ECB;
import com.google.zxing.datamatrix.decoder.Version$ECBlocks;

public final class Version {
    private static final Version[] VERSIONS = Version.buildVersions();
    private final int dataRegionSizeColumns;
    private final int dataRegionSizeRows;
    private final Version$ECBlocks ecBlocks;
    private final int symbolSizeColumns;
    private final int symbolSizeRows;
    private final int totalCodewords;
    private final int versionNumber;

    private Version(int n3, int n4, int n7, int n8, int n10, Version$ECBlocks object) {
        this.versionNumber = n3;
        this.symbolSizeRows = n4;
        this.symbolSizeColumns = n7;
        this.dataRegionSizeRows = n8;
        this.dataRegionSizeColumns = n10;
        this.ecBlocks = object;
        n3 = ((Version$ECBlocks)object).getECCodewords();
        Version$ECB[] version$ECBArray = ((Version$ECBlocks)object).getECBlocks();
        n7 = version$ECBArray.length;
        n10 = 0;
        for (n8 = 0; n8 < n7; ++n8) {
            object = version$ECBArray[n8];
            int n14 = ((Version$ECB)object).getCount();
            int n15 = (((Version$ECB)object).getDataCodewords() + n3) * n14;
            n10 += n15;
        }
        this.totalCodewords = n10;
    }

    private static Version[] buildVersions() {
        Version version;
        int n3 = 1;
        Object object = new Version$ECB(n3, 3, null);
        int n4 = 5;
        Object object2 = new Version$ECBlocks(n4, (Version$ECB)object, null);
        int n7 = 8;
        object = version;
        version = new Version(1, 10, 10, 8, n7, (Version$ECBlocks)object2);
        Object object3 = new Version$ECB(n3, n4, null);
        Object object4 = new Version$ECBlocks(7, (Version$ECB)object3, null);
        int n8 = 12;
        Object object5 = object;
        object = new Version(2, 12, n8, 10, 10, (Version$ECBlocks)object4);
        Object object6 = new Version$ECB(n3, n7, null);
        object3 = new Version$ECBlocks(10, (Version$ECB)object6, null);
        object4 = new Version(3, 14, 14, 12, 12, (Version$ECBlocks)object3);
        object5 = new Version$ECB(n3, n8, null);
        object6 = new Version$ECBlocks(n8, (Version$ECB)object5, null);
        object5 = object3;
        n8 = 16;
        int n10 = 14;
        int n14 = 14;
        object3 = new Version(4, 16, n8, n10, n14, (Version$ECBlocks)object6);
        int n15 = 18;
        Object object7 = new Version$ECB(n3, n15, null);
        object5 = new Version$ECBlocks(14, (Version$ECB)object7, null);
        object6 = new Version(5, 18, 18, 16, 16, (Version$ECBlocks)object5);
        Object object8 = new Version$ECB(n3, 22, null);
        Object object9 = object7 = new Version$ECBlocks(n15, (Version$ECB)object8, null);
        object5 = new Version(6, 20, 20, 18, 18, (Version$ECBlocks)object7);
        Object object10 = new Version$ECB(n3, 30, null);
        object7 = new Version$ECBlocks(20, (Version$ECB)object10, null);
        object8 = new Version(7, 22, 22, 20, 20, (Version$ECBlocks)object7);
        int n16 = 36;
        Object object11 = new Version$ECB(n3, n16, null);
        object10 = new Version$ECBlocks(24, (Version$ECB)object11, null);
        Object object12 = object7;
        Object object13 = object10;
        object7 = new Version(8, 24, 24, 22, 22, (Version$ECBlocks)object10);
        Version[] versionArray = new Version$ECB(n3, 44, null);
        object11 = new Version$ECBlocks(28, (Version$ECB)versionArray, null);
        object13 = object10;
        Object object14 = object11;
        object10 = new Version(9, 26, 26, 24, 24, (Version$ECBlocks)object11);
        Object object15 = new Version$ECB(n3, 62, null);
        object11 = new Version$ECBlocks(n16, (Version$ECB)object15, null);
        object12 = versionArray;
        object13 = object11;
        versionArray = new Version(10, 32, 32, 14, 14, (Version$ECBlocks)object11);
        Object object16 = new Version$ECB(n3, 86, null);
        object11 = new Version$ECBlocks(42, (Version$ECB)object16, null);
        object13 = object15;
        object14 = object11;
        object9 = object15 = new Version(11, 36, 36, 16, 16, (Version$ECBlocks)object11);
        object2 = new Version$ECB(n3, 114, null);
        object11 = new Version$ECBlocks(48, (Version$ECB)object2, null);
        object14 = object16;
        Object object17 = object16 = new Version(12, 40, 40, 18, 18, (Version$ECBlocks)object11);
        object15 = new Version$ECB(n3, 144, null);
        object11 = new Version$ECBlocks(56, (Version$ECB)object15, null);
        Object object18 = object2;
        object13 = object2 = new Version(13, 44, 44, 20, 20, (Version$ECBlocks)object11);
        object16 = new Version$ECB(n3, 174, null);
        object11 = new Version$ECBlocks(68, (Version$ECB)object16, null);
        Object object19 = object15;
        Object object20 = object11;
        Object object21 = object15 = new Version(14, 48, 48, 22, 22, (Version$ECBlocks)object11);
        n4 = 2;
        Object object22 = new Version$ECB(n4, 102, null);
        object11 = new Version$ECBlocks(42, (Version$ECB)object22, null);
        object20 = object16;
        Object object23 = object11;
        Object object24 = object16 = new Version(15, 52, 52, 24, 24, (Version$ECBlocks)object11);
        object11 = new Version$ECB(n4, 140, null);
        object22 = new Version$ECBlocks(56, (Version$ECB)object11, null);
        object19 = object2;
        object20 = object22;
        object2 = new Version(16, 64, 64, 14, 14, (Version$ECBlocks)object22);
        n16 = 4;
        object11 = new Version$ECB(n16, 92, null);
        object22 = new Version$ECBlocks(36, (Version$ECB)object11, null);
        object20 = object16;
        object23 = object22;
        Object object25 = object16 = new Version(17, 72, 72, 16, 16, (Version$ECBlocks)object22);
        object11 = new Version$ECB(n16, 114, null);
        object15 = new Version$ECBlocks(48, (Version$ECB)object11, null);
        object23 = object22;
        object22 = new Version(18, 80, 80, 18, 18, (Version$ECBlocks)object15);
        object11 = new Version$ECB(n16, 144, null);
        object15 = new Version$ECBlocks(56, (Version$ECB)object11, null);
        Object object26 = object16;
        Object object27 = object15;
        object14 = object16 = new Version(19, 88, 88, 20, 20, (Version$ECBlocks)object15);
        object11 = new Version$ECB(n16, 174, null);
        object15 = new Version$ECBlocks(68, (Version$ECB)object11, null);
        object27 = object22;
        object22 = new Version(20, 96, 96, 22, 22, (Version$ECBlocks)object15);
        n16 = 6;
        Object object28 = object22;
        object11 = new Version$ECB(n16, 136, null);
        object15 = new Version$ECBlocks(56, (Version$ECB)object11, null);
        object26 = object16;
        object27 = object15;
        object18 = object16 = new Version(21, 104, 104, 24, 24, (Version$ECBlocks)object15);
        object11 = new Version$ECB(n16, 175, null);
        object15 = new Version$ECBlocks(68, (Version$ECB)object11, null);
        object27 = object22;
        Object object29 = object22 = new Version(22, 120, 120, 18, 18, (Version$ECBlocks)object15);
        object11 = new Version$ECB(8, 163, null);
        object15 = new Version$ECBlocks(62, (Version$ECB)object11, null);
        object26 = object16;
        object27 = object15;
        object16 = new Version(23, 132, 132, 20, 20, (Version$ECBlocks)object15);
        object15 = new Version$ECB(8, 156, null);
        Version[] versionArray2 = versionArray;
        object16 = new Version$ECB(2, 155, null);
        object22 = new Version$ECBlocks(62, (Version$ECB)object15, (Version$ECB)object16, null);
        object2 = new Version(24, 144, 144, 22, 22, (Version$ECBlocks)object22);
        object22 = new Version$ECB(1, 5, null);
        object16 = new Version$ECBlocks(7, (Version$ECB)object22, null);
        versionArray = new Version(25, 8, 18, 6, 16, (Version$ECBlocks)object16);
        object12 = versionArray;
        object15 = new Version$ECB(1, 10, null);
        object22 = new Version$ECBlocks(11, (Version$ECB)object15, null);
        Object object30 = object16 = new Version(26, 8, 32, 6, 14, (Version$ECBlocks)object22);
        object11 = new Version$ECB(1, 16, null);
        object15 = new Version$ECBlocks(14, (Version$ECB)object11, null);
        object20 = object22 = new Version(27, 12, 26, 10, 24, (Version$ECBlocks)object15);
        object11 = new Version$ECB(1, 22, null);
        object15 = new Version$ECBlocks(18, (Version$ECB)object11, null);
        object27 = object16 = new Version(28, 12, 36, 10, 16, (Version$ECBlocks)object15);
        object15 = new Version$ECB(1, 32, null);
        object22 = new Version$ECBlocks(24, (Version$ECB)object15, null);
        Version[] versionArray3 = versionArray = new Version(29, 16, 36, 14, 16, (Version$ECBlocks)object22);
        object15 = new Version$ECB(1, 49, null);
        object22 = new Version$ECBlocks(28, (Version$ECB)object15, null);
        object16 = new Version(30, 16, 48, 14, 22, (Version$ECBlocks)object22);
        versionArray = new Version[]{version, object, object4, object3, object6, object5, object8, object7, object10, versionArray2, object9, object17, object13, object21, object24, object19, object25, object23, object14, object28, object18, object29, object26, object2, object12, object30, object20, object27, versionArray3, object16};
        return versionArray;
    }

    public static Version getVersionForDimensions(int n3, int n4) {
        int n7 = n3 & 1;
        if (n7 == 0 && (n7 = n4 & 1) == 0) {
            for (Version version : VERSIONS) {
                int n8 = version.symbolSizeRows;
                if (n8 != n3 || (n8 = version.symbolSizeColumns) != n4) continue;
                return version;
            }
            throw FormatException.getFormatInstance();
        }
        throw FormatException.getFormatInstance();
    }

    public int getDataRegionSizeColumns() {
        return this.dataRegionSizeColumns;
    }

    public int getDataRegionSizeRows() {
        return this.dataRegionSizeRows;
    }

    public Version$ECBlocks getECBlocks() {
        return this.ecBlocks;
    }

    public int getSymbolSizeColumns() {
        return this.symbolSizeColumns;
    }

    public int getSymbolSizeRows() {
        return this.symbolSizeRows;
    }

    public int getTotalCodewords() {
        return this.totalCodewords;
    }

    public int getVersionNumber() {
        return this.versionNumber;
    }

    public String toString() {
        return String.valueOf(this.versionNumber);
    }
}

