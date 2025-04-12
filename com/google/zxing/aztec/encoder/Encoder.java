/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.aztec.encoder;

import com.google.zxing.aztec.encoder.AztecCode;
import com.google.zxing.aztec.encoder.HighLevelEncoder;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;

public final class Encoder {
    public static final int DEFAULT_AZTEC_LAYERS = 0;
    public static final int DEFAULT_EC_PERCENT = 33;
    private static final int MAX_NB_BITS = 32;
    private static final int MAX_NB_BITS_COMPACT = 4;
    private static final int[] WORD_SIZE;

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[33];
        int[] nArray3 = nArray;
        nArray2[0] = 4;
        nArray3[1] = 6;
        nArray2[2] = 6;
        nArray3[3] = 8;
        nArray2[4] = 8;
        nArray3[5] = 8;
        nArray2[6] = 8;
        nArray3[7] = 8;
        nArray2[8] = 8;
        nArray3[9] = 10;
        nArray2[10] = 10;
        nArray3[11] = 10;
        nArray2[12] = 10;
        nArray3[13] = 10;
        nArray2[14] = 10;
        nArray3[15] = 10;
        nArray2[16] = 10;
        nArray3[17] = 10;
        nArray2[18] = 10;
        nArray3[19] = 10;
        nArray2[20] = 10;
        nArray3[21] = 10;
        nArray2[22] = 10;
        nArray3[23] = 12;
        nArray2[24] = 12;
        nArray3[25] = 12;
        nArray2[26] = 12;
        nArray3[27] = 12;
        nArray2[28] = 12;
        nArray3[29] = 12;
        nArray2[30] = 12;
        nArray3[31] = 12;
        nArray3[32] = 12;
        WORD_SIZE = nArray;
    }

    private Encoder() {
    }

    private static int[] bitsToWords(BitArray bitArray, int n3, int n4) {
        int[] nArray = new int[n4];
        int n7 = bitArray.getSize() / n3;
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8 = 0;
            for (int i8 = 0; i8 < n3; ++i8) {
                int n10 = i3 * n3 + i8;
                if ((n10 = (int)(bitArray.get(n10) ? 1 : 0)) != 0) {
                    n10 = n3 - i8;
                    int n14 = 1;
                    n10 -= n14;
                    n10 = n14 << n10;
                } else {
                    n10 = 0;
                }
                n8 |= n10;
            }
            nArray[i3] = n8;
        }
        return nArray;
    }

    private static void drawBullsEye(BitMatrix bitMatrix, int n3, int n4) {
        int n7;
        int n8;
        for (n8 = 0; n8 < n4; n8 += 2) {
            int n10;
            for (int i3 = n7 = n3 - n8; i3 <= (n10 = n3 + n8); ++i3) {
                bitMatrix.set(i3, n7);
                bitMatrix.set(i3, n10);
                bitMatrix.set(n7, i3);
                bitMatrix.set(n10, i3);
            }
        }
        n8 = n3 - n4;
        bitMatrix.set(n8, n8);
        n7 = n8 + 1;
        bitMatrix.set(n7, n8);
        bitMatrix.set(n8, n7);
        bitMatrix.set(n3 += n4, n8);
        bitMatrix.set(n3, n7);
        n4 = n3 + -1;
        bitMatrix.set(n3, n4);
    }

    private static void drawModeMessage(BitMatrix bitMatrix, boolean n3, int n4, BitArray bitArray) {
        int n7;
        n4 /= 2;
        if (n3) {
            for (n7 = 0; n7 < (n3 = 7); ++n7) {
                n3 = n4 + -3 + n7;
                int n8 = bitArray.get(n7);
                if (n8 != 0) {
                    n8 = n4 + -5;
                    bitMatrix.set(n3, n8);
                }
                n8 = n7 + 7;
                if ((n8 = (int)(bitArray.get(n8) ? 1 : 0)) != 0) {
                    n8 = n4 + 5;
                    bitMatrix.set(n8, n3);
                }
                n8 = 20 - n7;
                if ((n8 = (int)(bitArray.get(n8) ? 1 : 0)) != 0) {
                    n8 = n4 + 5;
                    bitMatrix.set(n3, n8);
                }
                n8 = 27 - n7;
                if ((n8 = (int)(bitArray.get(n8) ? 1 : 0)) == 0) continue;
                n8 = n4 + -5;
                bitMatrix.set(n8, n3);
            }
            return;
        }
        while (n7 < (n3 = 10)) {
            n3 = n4 + -5 + n7;
            int n10 = n7 / 5 + n3;
            n3 = bitArray.get(n7);
            if (n3) {
                n3 = n4 + -7;
                bitMatrix.set(n10, n3);
            }
            n3 = n7 + 10;
            if (n3 = bitArray.get(n3)) {
                n3 = n4 + 7;
                bitMatrix.set(n3, n10);
            }
            n3 = 29 - n7;
            if (n3 = bitArray.get(n3)) {
                n3 = n4 + 7;
                bitMatrix.set(n10, n3);
            }
            n3 = 39 - n7;
            if (n3 = bitArray.get(n3)) {
                n3 = n4 + -7;
                bitMatrix.set(n3, n10);
            }
            ++n7;
        }
    }

    public static AztecCode encode(byte[] byArray) {
        return Encoder.encode(byArray, 33, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static AztecCode encode(byte[] byArray, int n3, int n4) {
        int n7;
        int n8;
        BitMatrix bitMatrix;
        Object object;
        int n10;
        int n14;
        block28: {
            int n15;
            int n16;
            int n17;
            int n18;
            int[] nArray;
            int n19;
            int n20;
            int n21;
            int n22;
            int[] nArray2;
            int n24 = n4;
            byte[] byArray2 = byArray;
            Object object2 = new HighLevelEncoder(byArray);
            object2 = ((HighLevelEncoder)object2).encode();
            int n25 = ((BitArray)object2).getSize() * n3 / 100;
            int n26 = 11;
            n14 = ((BitArray)object2).getSize() + (n25 += n26);
            int n27 = 32;
            int n28 = 1;
            if (n4 != 0) {
                n14 = n4 < 0 ? 1 : 0;
                n10 = Math.abs(n4);
                if (n14 != 0) {
                    n27 = 4;
                }
                if (n10 > n27) {
                    String string2 = Gj0.b(n24, "Illegal value ", " for layers");
                    object2 = new IllegalArgumentException(string2);
                    throw object2;
                }
                n24 = Encoder.totalBitsInLayer(n10, n14 != 0);
                nArray2 = WORD_SIZE;
                n27 = nArray2[n10];
                n22 = n24 % n27;
                n22 = n24 - n22;
                object2 = Encoder.stuffBits((BitArray)object2, n27);
                n21 = ((BitArray)object2).getSize() + n25;
                String string3 = "Data to large for user specified layer";
                if (n21 > n22) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
                    throw illegalArgumentException;
                }
                if (n14 != 0 && (n22 = ((BitArray)object2).getSize()) > (n21 = n27 << 6)) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
                    throw illegalArgumentException;
                }
            } else {
                n24 = 0;
                object = null;
                n10 = 0;
                n22 = 0;
                BitArray bitArray = null;
                while (true) {
                    if (n10 > n27) {
                        object = new IllegalArgumentException("Data too large for an Aztec code");
                        throw object;
                    }
                    n21 = 3;
                    if (n10 <= n21) {
                        n21 = 1;
                    } else {
                        n21 = 0;
                        bitMatrix = null;
                    }
                    n20 = n21 != 0 ? n10 + 1 : n10;
                    n8 = Encoder.totalBitsInLayer(n20, n21 != 0);
                    if (n14 <= n8) {
                        if (object == null || n22 != (n19 = (nArray = WORD_SIZE)[n20])) {
                            n24 = WORD_SIZE[n20];
                            bitArray = Encoder.stuffBits((BitArray)object2, n24);
                            n22 = n24;
                            object = bitArray;
                        }
                        n19 = n8 % n22;
                        n19 = n8 - n19;
                        if ((n21 == 0 || (n18 = ((BitArray)object).getSize()) <= (n17 = n22 << 6)) && (n18 = ((BitArray)object).getSize() + n25) <= n19) break;
                    }
                    n20 = 1;
                    ++n10;
                    n28 = 1;
                }
                object2 = object;
                n27 = n22;
                n14 = n21;
                n10 = n20;
                n24 = n8;
            }
            object = Encoder.generateCheckWords((BitArray)object2, n24, n27);
            n7 = ((BitArray)object2).getSize() / n27;
            BitArray bitArray = Encoder.generateModeMessage(n14 != 0, n10, n7);
            if (n14 == 0) {
                n26 = 14;
            }
            n27 = n10 << 2;
            nArray2 = new int[n26 += n27];
            n22 = 2;
            if (n14 != 0) {
                bitMatrix = null;
                for (n21 = 0; n21 < n26; ++n21) {
                    nArray2[n21] = n21;
                }
                n8 = n26;
            } else {
                n21 = n26 + 1;
                n20 = n26 / 2;
                n8 = (n20 + -1) / 15 * 2 + n21;
                n21 = n8 / 2;
                nArray = null;
                for (n19 = 0; n19 < n20; ++n19) {
                    n18 = n19 / 15 + n19;
                    n17 = n20 - n19 - n28;
                    nArray2[n17] = n16 = n21 - n18 + -1;
                    n17 = n20 + n19;
                    nArray2[n17] = n18 = n18 + n21 + n28;
                }
            }
            bitMatrix = new BitMatrix(n8);
            n20 = 0;
            n19 = 0;
            nArray = null;
            while (true) {
                if (n20 < n10) {
                    n18 = n10 - n20 << n22;
                    n17 = n14 != 0 ? 9 : 12;
                    n18 += n17;
                } else {
                    Encoder.drawModeMessage(bitMatrix, n14 != 0, n8, bitArray);
                    if (n14 == 0) break;
                    n24 = n8 / 2;
                    n25 = 5;
                    Encoder.drawBullsEye(bitMatrix, n24, n25);
                    break block28;
                }
                for (n17 = 0; n17 < n18; ++n17) {
                    n16 = n17 << 1;
                    for (n15 = 0; n15 < n22; ++n15) {
                        int n29 = n19 + n16;
                        n28 = n29 + n15;
                        if ((n28 = (int)(((BitArray)object).get(n28) ? 1 : 0)) != 0) {
                            n28 = n20 << 1;
                            n29 = n28 + n15;
                            n22 = nArray2[n29];
                            n28 += n17;
                            n28 = nArray2[n28];
                            bitMatrix.set(n22, n28);
                        }
                        n28 = (n18 << 1) + n19 + n16 + n15;
                        if ((n28 = (int)(((BitArray)object).get(n28) ? 1 : 0)) != 0) {
                            n28 = n20 << 1;
                            n22 = n28 + n17;
                            n22 = nArray2[n22];
                            n29 = n26 + -1 - n28 - n15;
                            n28 = nArray2[n29];
                            bitMatrix.set(n22, n28);
                        }
                        n28 = (n18 << 2) + n19 + n16 + n15;
                        if ((n28 = (int)(((BitArray)object).get(n28) ? 1 : 0)) != 0) {
                            n28 = n26 + -1;
                            n22 = n20 << 1;
                            n28 -= n22;
                            n22 = n28 - n15;
                            n22 = nArray2[n22];
                            n28 -= n17;
                            n28 = nArray2[n28];
                            bitMatrix.set(n22, n28);
                        }
                        n28 = n18 * 6 + n19 + n16 + n15;
                        if ((n28 = (int)(((BitArray)object).get(n28) ? 1 : 0)) != 0) {
                            n28 = n26 + -1;
                            n22 = n20 << 1;
                            n28 = n28 - n22 - n17;
                            n28 = nArray2[n28];
                            n22 += n15;
                            n22 = nArray2[n22];
                            bitMatrix.set(n28, n22);
                        }
                        n28 = 1;
                        n22 = 2;
                    }
                    n28 = 1;
                    n22 = 2;
                }
                n15 = n18 << 3;
                n19 += n15;
                ++n20;
                n28 = 1;
                n22 = 2;
            }
            n24 = n8 / 2;
            Encoder.drawBullsEye(bitMatrix, n24, 7);
            n25 = 0;
            Object var5_9 = null;
            n27 = 2;
            n15 = 0;
            while (true) {
                n28 = n26 / 2;
                n20 = 1;
                if (n15 >= (n28 -= n20)) break;
                for (n28 = n24 & 1; n28 < n8; n28 += 2) {
                    n22 = n24 - n25;
                    bitMatrix.set(n22, n28);
                    n19 = n24 + n25;
                    bitMatrix.set(n19, n28);
                    bitMatrix.set(n28, n22);
                    bitMatrix.set(n28, n19);
                }
                n15 += 15;
                n25 += 16;
            }
        }
        object = new AztecCode();
        ((AztecCode)object).setCompact(n14 != 0);
        ((AztecCode)object).setSize(n8);
        ((AztecCode)object).setLayers(n10);
        ((AztecCode)object).setCodeWords(n7);
        ((AztecCode)object).setMatrix(bitMatrix);
        return object;
    }

    private static BitArray generateCheckWords(BitArray object, int n3, int n4) {
        int n7 = ((BitArray)object).getSize() / n4;
        GenericGF genericGF = Encoder.getGF(n4);
        ReedSolomonEncoder reedSolomonEncoder = new ReedSolomonEncoder(genericGF);
        Object object2 = n3 / n4;
        object = Encoder.bitsToWords((BitArray)object, n4, object2);
        reedSolomonEncoder.encode((int[])object, (int)(object2 -= n7));
        BitArray bitArray = new BitArray();
        reedSolomonEncoder = null;
        bitArray.appendBits(0, n3 %= n4);
        n3 = ((Object)object).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            object2 = object[i3];
            bitArray.appendBits((int)object2, n4);
        }
        return bitArray;
    }

    public static BitArray generateModeMessage(boolean bl2, int n3, int n4) {
        BitArray bitArray;
        BitArray bitArray2 = new BitArray();
        int n7 = 4;
        if (bl2) {
            bitArray2.appendBits((int)(var1_3 += -1), 2);
            bitArray2.appendBits((int)(var2_4 += -1), 6);
            int n8 = 28;
            bitArray = Encoder.generateCheckWords(bitArray2, n8, n7);
        } else {
            bitArray2.appendBits((int)(var1_3 += -1), 5);
            bitArray2.appendBits((int)(var2_4 += -1), 11);
            int n10 = 40;
            bitArray = Encoder.generateCheckWords(bitArray2, n10, n7);
        }
        return bitArray;
    }

    private static GenericGF getGF(int n3) {
        int n4 = 4;
        if (n3 != n4) {
            n4 = 6;
            if (n3 != n4) {
                n4 = 8;
                if (n3 != n4) {
                    n4 = 10;
                    if (n3 != n4) {
                        n4 = 12;
                        if (n3 == n4) {
                            return GenericGF.AZTEC_DATA_12;
                        }
                        String string2 = String.valueOf(n3);
                        string2 = "Unsupported word size ".concat(string2);
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                        throw illegalArgumentException;
                    }
                    return GenericGF.AZTEC_DATA_10;
                }
                return GenericGF.AZTEC_DATA_8;
            }
            return GenericGF.AZTEC_DATA_6;
        }
        return GenericGF.AZTEC_PARAM;
    }

    /*
     * Unable to fully structure code
     */
    public static BitArray stuffBits(BitArray var0, int var1_1) {
        var2_2 = new BitArray();
        var3_3 = var0.getSize();
        var4_4 = 1;
        var5_5 = (var4_4 << var1_1) + -2;
        block0: for (var6_6 = 0; var6_6 < var3_3; var6_6 += var1_1) {
            var8_8 = 0;
            for (var7_7 = 0; var7_7 < var1_1; ++var7_7) {
                var9_9 = var6_6 + var7_7;
                if (var9_9 < var3_3 && (var9_9 = (int)var0.get(var9_9)) == 0) continue;
                var9_9 = var1_1 + -1 - var7_7;
                var9_9 = var4_4 << var9_9;
                var8_8 |= var9_9;
            }
            var7_7 = var8_8 & var5_5;
            if (var7_7 == var5_5) {
                var2_2.appendBits(var7_7, var1_1);
lbl17:
                // 2 sources

                while (true) {
                    var6_6 += -1;
                    continue block0;
                    break;
                }
            }
            if (var7_7 == 0) {
                var7_7 = var8_8 | 1;
                var2_2.appendBits(var7_7, var1_1);
                ** continue;
            }
            var2_2.appendBits(var8_8, var1_1);
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    private static int totalBitsInLayer(int n3, boolean bl2) {
        void var1_4;
        if (bl2) {
            int n4 = 88;
        } else {
            int n7 = 112;
        }
        int n8 = n3 << 4;
        return (int)((var1_4 + n8) * n3);
    }
}

