/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.decoder.Version;

final class BitMatrixParser {
    private final BitMatrix mappingBitMatrix;
    private final BitMatrix readMappingMatrix;
    private final Version version;

    public BitMatrixParser(BitMatrix bitMatrix) {
        int n3 = bitMatrix.getHeight();
        int n4 = 8;
        if (n3 >= n4 && n3 <= (n4 = 144) && (n3 &= 1) == 0) {
            Object object = BitMatrixParser.readVersion(bitMatrix);
            this.version = object;
            this.mappingBitMatrix = bitMatrix = this.extractDataRegion(bitMatrix);
            n4 = bitMatrix.getWidth();
            int n7 = bitMatrix.getHeight();
            this.readMappingMatrix = object = new BitMatrix(n4, n7);
            return;
        }
        throw FormatException.getFormatInstance();
    }

    private BitMatrix extractDataRegion(BitMatrix bitMatrix) {
        Object object = this.version;
        int n3 = ((Version)object).getSymbolSizeRows();
        Version version = this.version;
        int n4 = version.getSymbolSizeColumns();
        int n7 = bitMatrix.getHeight();
        if (n7 == n3) {
            Version version2 = this.version;
            n7 = version2.getDataRegionSizeRows();
            Version version3 = this.version;
            int n8 = version3.getDataRegionSizeColumns();
            int n10 = (n3 /= n7) * n7;
            int n14 = (n4 /= n8) * n8;
            BitMatrix bitMatrix2 = new BitMatrix(n14, n10);
            for (n14 = 0; n14 < n3; ++n14) {
                int n15 = n14 * n7;
                for (int i3 = 0; i3 < n4; ++i3) {
                    int n16 = i3 * n8;
                    for (int i8 = 0; i8 < n7; ++i8) {
                        int n17 = (n7 + 2) * n14 + 1 + i8;
                        int n18 = n15 + i8;
                        for (int i10 = 0; i10 < n8; ++i10) {
                            int n19 = (n8 + 2) * i3 + 1 + i10;
                            if ((n19 = (int)(bitMatrix.get(n19, n17) ? 1 : 0)) == 0) continue;
                            n19 = n16 + i10;
                            bitMatrix2.set(n19, n18);
                        }
                    }
                }
            }
            return bitMatrix2;
        }
        object = new IllegalArgumentException("Dimension of bitMatrix must match the version size");
        throw object;
    }

    private int readCorner1(int n3, int n4) {
        int n7;
        int n8;
        int n74 = n3 + -1;
        int n84 = 0;
        int n10 = this.readModule(n74, 0, n3, n4);
        int n14 = 1;
        int n15 = n10 << n14;
        int n16 = this.readModule(n74, n14, n3, n4);
        if (n16 != 0) {
            n8 = n15 | 1;
        }
        void var5_8 = n8 << n14;
        n16 = 2;
        if ((n74 = (int)(this.readModule(n74, n16, n3, n4) ? 1 : 0)) != 0) {
            n7 = var5_8 | 1;
        }
        n74 = n7 << 1;
        int n17 = n4 + -2;
        boolean bl2 = this.readModule(0, n17, n3, n4);
        if (bl2) {
            n74 |= 1;
        }
        n74 <<= n14;
        int n18 = n4 + -1;
        n84 = this.readModule(0, n18, n3, n4);
        if (n84 != 0) {
            n74 |= 1;
        }
        n74 <<= n14;
        n84 = this.readModule(n14, n18, n3, n4);
        if (n84 != 0) {
            n74 |= 1;
        }
        n74 <<= n14;
        n84 = this.readModule(n16, n18, n3, n4);
        if (n84 != 0) {
            n74 |= 1;
        }
        n74 <<= n14;
        n84 = 3;
        if ((n3 = (int)(this.readModule(n84, n18, n3, n4) ? 1 : 0)) != 0) {
            n74 |= 1;
        }
        return n74;
    }

    private int readCorner2(int n3, int n4) {
        int n7 = n3 + -3;
        boolean bl2 = false;
        n7 = (int)(this.readModule(n7, 0, n3, n4) ? 1 : 0);
        int n8 = 1;
        n7 <<= n8;
        int n10 = n3 + -2;
        if ((n10 = (int)(this.readModule(n10, 0, n3, n4) ? 1 : 0)) != 0) {
            n7 |= 1;
        }
        n7 <<= n8;
        n10 = n3 + -1;
        if ((n10 = (int)(this.readModule(n10, 0, n3, n4) ? 1 : 0)) != 0) {
            n7 |= 1;
        }
        n7 <<= n8;
        n10 = n4 + -4;
        if ((n10 = (int)(this.readModule(0, n10, n3, n4) ? 1 : 0)) != 0) {
            n7 |= 1;
        }
        n7 <<= n8;
        n10 = n4 + -3;
        if ((n10 = (int)(this.readModule(0, n10, n3, n4) ? 1 : 0)) != 0) {
            n7 |= 1;
        }
        n7 <<= n8;
        n10 = n4 + -2;
        if ((n10 = (int)(this.readModule(0, n10, n3, n4) ? 1 : 0)) != 0) {
            n7 |= 1;
        }
        n7 <<= n8;
        n10 = n4 + -1;
        bl2 = this.readModule(0, n10, n3, n4);
        if (bl2) {
            n7 |= 1;
        }
        n7 <<= n8;
        if ((n3 = (int)(this.readModule(n8, n10, n3, n4) ? 1 : 0)) != 0) {
            n7 |= 1;
        }
        return n7;
    }

    private int readCorner3(int n3, int n4) {
        int n7;
        int n74 = n3 + -1;
        boolean bl2 = false;
        int n8 = this.readModule(n74, 0, n3, n4);
        int n10 = 1;
        int n14 = n8 << n10;
        int n15 = n4 + -1;
        if ((n74 = (int)(this.readModule(n74, n15, n3, n4) ? 1 : 0)) != 0) {
            n7 = n14 | 1;
        }
        n74 = n7 << 1;
        int n16 = n4 + -3;
        int n17 = this.readModule(0, n16, n3, n4);
        if (n17 != 0) {
            n74 |= 1;
        }
        n74 <<= n10;
        n17 = n4 + -2;
        boolean bl3 = this.readModule(0, n17, n3, n4);
        if (bl3) {
            n74 |= 1;
        }
        n74 <<= n10;
        bl2 = this.readModule(0, n15, n3, n4);
        if (bl2) {
            n74 |= 1;
        }
        n74 <<= n10;
        bl2 = this.readModule(n10, n16, n3, n4);
        if (bl2) {
            n74 |= 1;
        }
        n74 <<= n10;
        bl2 = this.readModule(n10, n17, n3, n4);
        if (bl2) {
            n74 |= 1;
        }
        n74 <<= n10;
        if ((n3 = (int)(this.readModule(n10, n15, n3, n4) ? 1 : 0)) != 0) {
            n74 |= 1;
        }
        return n74;
    }

    private int readCorner4(int n3, int n4) {
        int n7 = n3 + -3;
        int n8 = 0;
        n7 = (int)(this.readModule(n7, 0, n3, n4) ? 1 : 0);
        int n10 = 1;
        n7 <<= n10;
        int n14 = n3 + -2;
        if ((n14 = (int)(this.readModule(n14, 0, n3, n4) ? 1 : 0)) != 0) {
            n7 |= 1;
        }
        n7 <<= n10;
        n14 = n3 + -1;
        if ((n14 = (int)(this.readModule(n14, 0, n3, n4) ? 1 : 0)) != 0) {
            n7 |= 1;
        }
        n7 <<= n10;
        n14 = n4 + -2;
        if ((n14 = (int)(this.readModule(0, n14, n3, n4) ? 1 : 0)) != 0) {
            n7 |= 1;
        }
        n7 <<= n10;
        n14 = n4 + -1;
        n8 = this.readModule(0, n14, n3, n4);
        if (n8 != 0) {
            n7 |= 1;
        }
        n7 <<= n10;
        n8 = this.readModule(n10, n14, n3, n4);
        if (n8 != 0) {
            n7 |= 1;
        }
        n7 <<= n10;
        n8 = this.readModule(2, n14, n3, n4);
        if (n8 != 0) {
            n7 |= 1;
        }
        n7 <<= n10;
        n8 = 3;
        if ((n3 = (int)(this.readModule(n8, n14, n3, n4) ? 1 : 0)) != 0) {
            n7 |= 1;
        }
        return n7;
    }

    private boolean readModule(int n3, int n4, int n7, int n8) {
        if (n3 < 0) {
            n3 += n7;
            n7 = n7 + 4 & 7;
            n7 = 4 - n7;
            n4 += n7;
        }
        if (n4 < 0) {
            n4 += n8;
            n7 = (n8 += 4) & 7;
            n7 = 4 - n7;
            n3 += n7;
        }
        this.readMappingMatrix.set(n4, n3);
        return this.mappingBitMatrix.get(n4, n3);
    }

    private int readUtah(int n3, int n4, int n7, int n8) {
        int n10 = n3 + -2;
        int n14 = n4 + -2;
        int n15 = this.readModule(n10, n14, n7, n8) << 1;
        int n16 = n4 + -1;
        if ((n10 = (int)(this.readModule(n10, n16, n7, n8) ? 1 : 0)) != 0) {
            n15 |= 1;
        }
        n10 = n15 << 1;
        n15 = n3 + -1;
        boolean bl2 = this.readModule(n15, n14, n7, n8);
        if (bl2) {
            n10 |= 1;
        }
        n10 <<= 1;
        bl2 = this.readModule(n15, n16, n7, n8);
        if (bl2) {
            n10 |= 1;
        }
        n10 <<= 1;
        if ((n15 = (int)(this.readModule(n15, n4, n7, n8) ? 1 : 0)) != 0) {
            n10 |= 1;
        }
        n10 <<= 1;
        if ((n14 = (int)(this.readModule(n3, n14, n7, n8) ? 1 : 0)) != 0) {
            n10 |= 1;
        }
        n10 <<= 1;
        n14 = (int)(this.readModule(n3, n16, n7, n8) ? 1 : 0);
        if (n14 != 0) {
            n10 |= 1;
        }
        n10 <<= 1;
        if ((n3 = (int)(this.readModule(n3, n4, n7, n8) ? 1 : 0)) != 0) {
            n10 |= 1;
        }
        return n10;
    }

    private static Version readVersion(BitMatrix bitMatrix) {
        int n3 = bitMatrix.getHeight();
        int n4 = bitMatrix.getWidth();
        return Version.getVersionForDimensions(n3, n4);
    }

    public Version getVersion() {
        return this.version;
    }

    public byte[] readCodewords() {
        int n3 = this.version.getTotalCodewords();
        byte[] byArray = new byte[n3];
        Object object = this.mappingBitMatrix;
        int n4 = ((BitMatrix)object).getHeight();
        BitMatrix bitMatrix = this.mappingBitMatrix;
        int n7 = bitMatrix.getWidth();
        int n8 = 0;
        int n10 = 4;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        int n17 = 0;
        int n18 = 0;
        int n19 = 4;
        do {
            BitMatrix bitMatrix2;
            int n20;
            int n21;
            int n22 = 1;
            if (n19 == n4 && n8 == 0 && n14 == 0) {
                n14 = n15 + 1;
                byArray[n15] = n21 = (int)((byte)this.readCorner1(n4, n7));
                n19 += -2;
                n8 += 2;
                n15 = n14;
                n14 = 1;
                continue;
            }
            n21 = n4 + -2;
            if (n19 == n21 && n8 == 0 && (n20 = n7 & 3) != 0 && n16 == 0) {
                n16 = n15 + 1;
                byArray[n15] = n21 = (int)((byte)this.readCorner2(n4, n7));
                n19 += -2;
                n8 += 2;
                n15 = n16;
                n16 = 1;
                continue;
            }
            n20 = n4 + 4;
            if (n19 == n20 && n8 == (n20 = 2) && (n20 = n7 & 7) == 0 && n17 == 0) {
                n17 = n15 + 1;
                byArray[n15] = n21 = (int)((byte)this.readCorner3(n4, n7));
                n19 += -2;
                n8 += 2;
                n15 = n17;
                n17 = 1;
                continue;
            }
            if (n19 == n21 && n8 == 0 && (n21 = n7 & 7) == n10 && n18 == 0) {
                n18 = n15 + 1;
                byArray[n15] = n21 = (int)((byte)this.readCorner4(n4, n7));
                n19 += -2;
                n8 += 2;
                n15 = n18;
                n18 = 1;
                continue;
            }
            while (true) {
                if (n19 < n4 && n8 >= 0 && (n22 = (int)((bitMatrix2 = this.readMappingMatrix).get(n8, n19) ? 1 : 0)) == 0) {
                    n22 = n15 + 1;
                    byArray[n15] = n21 = (int)((byte)this.readUtah(n19, n8, n4, n7));
                    n15 = n22;
                }
                n22 = n19 + -2;
                n21 = n8 + 2;
                if (n22 < 0 || n21 >= n7) break;
                n19 = n22;
                n8 = n21;
            }
            n19 += -1;
            n8 += 5;
            while (true) {
                if (n19 >= 0 && n8 < n7 && (n22 = (int)((bitMatrix2 = this.readMappingMatrix).get(n8, n19) ? 1 : 0)) == 0) {
                    n22 = n15 + 1;
                    byArray[n15] = n21 = (int)((byte)this.readUtah(n19, n8, n4, n7));
                    n15 = n22;
                }
                n22 = n19 + 2;
                n21 = n8 + -2;
                if (n22 >= n4 || n21 < 0) break;
                n19 = n22;
                n8 = n21;
            }
            n19 += 5;
            n8 += -1;
        } while (n19 < n4 || n8 < n7);
        object = this.version;
        n4 = ((Version)object).getTotalCodewords();
        if (n15 == n4) {
            return byArray;
        }
        throw FormatException.getFormatInstance();
    }
}

