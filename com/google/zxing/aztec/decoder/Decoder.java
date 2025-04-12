/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.aztec.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.aztec.decoder.Decoder$1;
import com.google.zxing.aztec.decoder.Decoder$Table;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Arrays;

public final class Decoder {
    private static final String[] DIGIT_TABLE;
    private static final String[] LOWER_TABLE;
    private static final String[] MIXED_TABLE;
    private static final String[] PUNCT_TABLE;
    private static final String[] UPPER_TABLE;
    private AztecDetectorResult ddata;

    static {
        UPPER_TABLE = new String[]{"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
        LOWER_TABLE = new String[]{"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
        MIXED_TABLE = new String[]{"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
        PUNCT_TABLE = new String[]{"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
        DIGIT_TABLE = new String[]{"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};
    }

    public static byte[] convertBoolArrayToByteArray(boolean[] blArray) {
        int n3 = (blArray.length + 7) / 8;
        byte[] byArray = new byte[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = i3 << 3;
            byArray[i3] = n4 = (int)Decoder.readByte(blArray, n4);
        }
        return byArray;
    }

    private boolean[] correctBits(boolean[] object) {
        int n3;
        int n4;
        Object object2 = this.ddata;
        int n7 = ((AztecDetectorResult)object2).getNbLayers();
        if (n7 <= (n4 = 2)) {
            object2 = GenericGF.AZTEC_DATA_6;
            n3 = 6;
        } else {
            object2 = this.ddata;
            n7 = ((AztecDetectorResult)object2).getNbLayers();
            if (n7 <= (n3 = 8)) {
                object2 = GenericGF.AZTEC_DATA_8;
            } else {
                object2 = this.ddata;
                n7 = ((AztecDetectorResult)object2).getNbLayers();
                if (n7 <= (n3 = 22)) {
                    object2 = GenericGF.AZTEC_DATA_10;
                    n3 = 10;
                } else {
                    object2 = GenericGF.AZTEC_DATA_12;
                    n3 = 12;
                }
            }
        }
        AztecDetectorResult aztecDetectorResult = this.ddata;
        int n8 = aztecDetectorResult.getNbDatablocks();
        int n10 = ((boolean[])object).length / n3;
        if (n10 >= n8) {
            int n14;
            int n15;
            int n16;
            int n17 = ((boolean[])object).length % n3;
            int[] nArray = new int[n10];
            int n18 = 0;
            while (n18 < n10) {
                nArray[n18] = n16 = Decoder.readCode((boolean[])object, n17, n3);
                ++n18;
                n17 += n3;
            }
            object = new ReedSolomonDecoder;
            ((ReedSolomonDecoder)object)((GenericGF)object2);
            n10 -= n8;
            try {
                ((ReedSolomonDecoder)object).decode(nArray, n10);
                n15 = 1;
                n7 = n15 << n3;
                n10 = n7 + -1;
                n18 = 0;
            }
            catch (ReedSolomonException reedSolomonException) {
                throw FormatException.getFormatInstance(reedSolomonException);
            }
            for (n17 = 0; n17 < n8; ++n17) {
                n16 = nArray[n17];
                if (n16 != 0 && n16 != n10) {
                    if (n16 != n15 && n16 != (n14 = n7 + -2)) continue;
                    ++n18;
                    continue;
                }
                throw FormatException.getFormatInstance();
            }
            n10 = n8 * n3 - n18;
            boolean[] blArray = new boolean[n10];
            n18 = 0;
            for (n17 = 0; n17 < n8; ++n17) {
                n16 = nArray[n17];
                if (n16 != n15 && n16 != (n14 = n7 + -2)) {
                    for (n14 = n3 + -1; n14 >= 0; n14 += -1) {
                        int n19 = n18 + 1;
                        int n20 = n15 << n14 & n16;
                        n20 = n20 != 0 ? 1 : 0;
                        blArray[n18] = n20;
                        n18 = n19;
                    }
                    continue;
                }
                n14 = n18 + n3 - n15;
                n16 = n16 > n15 ? 1 : 0;
                Arrays.fill(blArray, n18, n14, n16 != 0);
                n18 = n16 = n3 + -1 + n18;
            }
            return blArray;
        }
        throw FormatException.getFormatInstance();
    }

    private boolean[] extractBits(BitMatrix bitMatrix) {
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        BitMatrix bitMatrix2 = bitMatrix;
        AztecDetectorResult aztecDetectorResult = this.ddata;
        int n15 = aztecDetectorResult.isCompact();
        AztecDetectorResult aztecDetectorResult2 = this.ddata;
        int n16 = aztecDetectorResult2.getNbLayers();
        int n17 = n15 != 0 ? 11 : 14;
        int n18 = n16 << 2;
        int[] nArray = new int[n17 += n18];
        int n19 = Decoder.totalBitsInLayer(n16, n15 != 0);
        boolean[] blArray = new boolean[n19];
        int n20 = 2;
        if (n15 != 0) {
            for (n14 = 0; n14 < n17; ++n14) {
                nArray[n14] = n14;
            }
        } else {
            n14 = n17 + 1;
            n10 = n17 / 2;
            n8 = ((n10 + -1) / 15 * 2 + n14) / n20;
            for (n14 = 0; n14 < n10; ++n14) {
                n7 = n14 / 15 + n14;
                n4 = n10 - n14 + -1;
                nArray[n4] = n3 = n8 - n7 + -1;
                n4 = n10 + n14;
                nArray[n4] = n7 = n7 + n8 + 1;
            }
        }
        n10 = 0;
        for (n14 = 0; n14 < n16; ++n14) {
            int n21;
            int n22;
            int n24;
            n8 = n16 - n14 << n20;
            n7 = n15 != 0 ? 9 : 12;
            n8 += n7;
            n7 = n14 << 1;
            n4 = n17 + -1 - n7;
            for (n3 = 0; n3 < n8; ++n3) {
                int n25 = n3 << 1;
                for (int i3 = 0; i3 < n20; ++i3) {
                    n24 = n10 + n25 + i3;
                    int n26 = n7 + i3;
                    n20 = nArray[n26];
                    n22 = n7 + n3;
                    n21 = nArray[n22];
                    blArray[n24] = n21 = (int)(bitMatrix2.get(n20, n21) ? 1 : 0);
                    n21 = n8 * 2 + n10 + n25 + i3;
                    n20 = nArray[n22];
                    n24 = n4 - i3;
                    n22 = n15;
                    n15 = nArray[n24];
                    blArray[n21] = n15 = (int)(bitMatrix2.get(n20, n15) ? 1 : 0);
                    n21 = n8 * 4 + n10 + n25 + i3;
                    n15 = nArray[n24];
                    n20 = n4 - n3;
                    n24 = n16;
                    n16 = nArray[n20];
                    blArray[n21] = n15 = (int)(bitMatrix2.get(n15, n16) ? 1 : 0);
                    n21 = n8 * 6 + n10 + n25 + i3;
                    n15 = nArray[n20];
                    n16 = nArray[n26];
                    blArray[n21] = n15 = (int)(bitMatrix2.get(n15, n16) ? 1 : 0);
                    n16 = n24;
                    n15 = n22;
                    n20 = 2;
                }
                n22 = n15;
                n24 = n16;
                n20 = 2;
            }
            n22 = n15;
            n24 = n16;
            n21 = n8 << 3;
            n10 += n21;
            n20 = 2;
        }
        return blArray;
    }

    private static String getCharacter(Decoder$Table object, int n3) {
        int[] nArray = Decoder$1.$SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table;
        int n4 = object.ordinal();
        int n7 = 1;
        if ((n4 = nArray[n4]) != n7) {
            n7 = 2;
            if (n4 != n7) {
                n7 = 3;
                if (n4 != n7) {
                    n7 = 4;
                    if (n4 != n7) {
                        n7 = 5;
                        if (n4 == n7) {
                            return DIGIT_TABLE[n3];
                        }
                        object = new IllegalStateException("Bad table");
                        throw object;
                    }
                    return PUNCT_TABLE[n3];
                }
                return MIXED_TABLE[n3];
            }
            return LOWER_TABLE[n3];
        }
        return UPPER_TABLE[n3];
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String getEncodedData(boolean[] blArray) {
        int n3 = blArray.length;
        Decoder$Table decoder$Table = Decoder$Table.UPPER;
        StringBuilder stringBuilder = new StringBuilder(20);
        Decoder$Table decoder$Table2 = decoder$Table;
        int n4 = 0;
        while (n4 < n3) {
            block7: {
                int n7;
                int n8;
                int n10;
                int n14;
                block9: {
                    String string2;
                    block8: {
                        Decoder$Table decoder$Table3 = Decoder$Table.BINARY;
                        n14 = 5;
                        if (decoder$Table != decoder$Table3) break block8;
                        n10 = n3 - n4;
                        if (n10 < n14) break;
                        n10 = Decoder.readCode(blArray, n4, n14);
                        n8 = n4 + 5;
                        if (n10 == 0) {
                            n10 = n3 - n8;
                            n14 = 11;
                            if (n10 < n14) break;
                            n10 = Decoder.readCode(blArray, n8, n14) + 31;
                            n8 = n4 + 16;
                        }
                        break block9;
                    }
                    n7 = n3 - n4;
                    Decoder$Table decoder$Table4 = Decoder$Table.DIGIT;
                    n8 = decoder$Table == decoder$Table4 ? 4 : 5;
                    if (n7 < n8) break;
                    n7 = Decoder.readCode(blArray, n4, n8);
                    n4 += n8;
                    String string3 = Decoder.getCharacter(decoder$Table, n7);
                    if ((n7 = (int)(string3.startsWith(string2 = "CTRL_") ? 1 : 0)) != 0) {
                        char c2 = string3.charAt(n14);
                        decoder$Table2 = Decoder.getTable(c2);
                        n8 = string3.charAt(6);
                        if (n8 != (n14 = 76)) {
                            Decoder$Table decoder$Table5 = decoder$Table2;
                            decoder$Table2 = decoder$Table;
                            decoder$Table = decoder$Table5;
                            continue;
                        }
                        break block7;
                    } else {
                        stringBuilder.append(string3);
                    }
                    break block7;
                }
                for (n4 = 0; n4 < n10; n8 += 8, ++n4) {
                    n14 = n3 - n8;
                    n7 = 8;
                    if (n14 < n7) {
                        n4 = n3;
                        break block7;
                    }
                    n14 = (char)Decoder.readCode(blArray, n8, n7);
                    stringBuilder.append((char)n14);
                }
                n4 = n8;
            }
            decoder$Table = decoder$Table2;
        }
        return stringBuilder.toString();
    }

    private static Decoder$Table getTable(char n3) {
        int n4 = 66;
        if (n3 != n4) {
            n4 = 68;
            if (n3 != n4) {
                n4 = 80;
                if (n3 != n4) {
                    n4 = 76;
                    if (n3 != n4) {
                        n4 = 77;
                        if (n3 != n4) {
                            return Decoder$Table.UPPER;
                        }
                        return Decoder$Table.MIXED;
                    }
                    return Decoder$Table.LOWER;
                }
                return Decoder$Table.PUNCT;
            }
            return Decoder$Table.DIGIT;
        }
        return Decoder$Table.BINARY;
    }

    public static String highLevelDecode(boolean[] blArray) {
        return Decoder.getEncodedData(blArray);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static byte readByte(boolean[] blArray, int n3) {
        int n4;
        int n7 = blArray.length - n3;
        int n8 = 8;
        if (n7 >= n8) {
            n4 = Decoder.readCode(blArray, n3, n8);
            return (byte)n4;
        }
        n4 = Decoder.readCode(blArray, n3, n7);
        n4 <<= (n8 -= n7);
        return (byte)n4;
    }

    private static int readCode(boolean[] blArray, int n3, int n4) {
        int n7;
        int n8 = 0;
        for (int i3 = n3; i3 < (n7 = n3 + n4); ++i3) {
            n8 <<= 1;
            n7 = blArray[i3];
            if (n7 == 0) continue;
            n8 |= 1;
        }
        return n8;
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

    public DecoderResult decode(AztecDetectorResult object) {
        this.ddata = object;
        object = ((DetectorResult)object).getBits();
        object = this.extractBits((BitMatrix)object);
        object = this.correctBits((boolean[])object);
        byte[] byArray = Decoder.convertBoolArrayToByteArray((boolean[])object);
        String string2 = Decoder.getEncodedData((boolean[])object);
        DecoderResult decoderResult = new DecoderResult(byArray, string2, null, null);
        int n3 = ((Object)object).length;
        decoderResult.setNumBits(n3);
        return decoderResult;
    }
}

