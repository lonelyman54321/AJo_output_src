/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.encoder;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import com.google.zxing.qrcode.decoder.Version$ECBlocks;
import com.google.zxing.qrcode.encoder.BlockPair;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.Encoder$1;
import com.google.zxing.qrcode.encoder.MaskUtil;
import com.google.zxing.qrcode.encoder.MatrixUtil;
import com.google.zxing.qrcode.encoder.QRCode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

public final class Encoder {
    private static final int[] ALPHANUMERIC_TABLE;
    static final String DEFAULT_BYTE_MODE_ENCODING = "ISO-8859-1";

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[96];
        int[] nArray3 = nArray;
        nArray2[0] = -1;
        nArray3[1] = -1;
        nArray2[2] = -1;
        nArray3[3] = -1;
        nArray2[4] = -1;
        nArray3[5] = -1;
        nArray2[6] = -1;
        nArray3[7] = -1;
        nArray2[8] = -1;
        nArray3[9] = -1;
        nArray2[10] = -1;
        nArray3[11] = -1;
        nArray2[12] = -1;
        nArray3[13] = -1;
        nArray2[14] = -1;
        nArray3[15] = -1;
        nArray2[16] = -1;
        nArray3[17] = -1;
        nArray2[18] = -1;
        nArray3[19] = -1;
        nArray2[20] = -1;
        nArray3[21] = -1;
        nArray2[22] = -1;
        nArray3[23] = -1;
        nArray2[24] = -1;
        nArray3[25] = -1;
        nArray2[26] = -1;
        nArray3[27] = -1;
        nArray2[28] = -1;
        nArray3[29] = -1;
        nArray2[30] = -1;
        nArray3[31] = -1;
        nArray2[32] = 36;
        nArray3[33] = -1;
        nArray2[34] = -1;
        nArray3[35] = -1;
        nArray2[36] = 37;
        nArray3[37] = 38;
        nArray2[38] = -1;
        nArray3[39] = -1;
        nArray2[40] = -1;
        nArray3[41] = -1;
        nArray2[42] = 39;
        nArray3[43] = 40;
        nArray2[44] = -1;
        nArray3[45] = 41;
        nArray2[46] = 42;
        nArray3[47] = 43;
        nArray2[48] = 0;
        nArray3[49] = 1;
        nArray2[50] = 2;
        nArray3[51] = 3;
        nArray2[52] = 4;
        nArray3[53] = 5;
        nArray2[54] = 6;
        nArray3[55] = 7;
        nArray2[56] = 8;
        nArray3[57] = 9;
        nArray2[58] = 44;
        nArray3[59] = -1;
        nArray2[60] = -1;
        nArray3[61] = -1;
        nArray2[62] = -1;
        nArray3[63] = -1;
        nArray2[64] = -1;
        nArray3[65] = 10;
        nArray2[66] = 11;
        nArray3[67] = 12;
        nArray2[68] = 13;
        nArray3[69] = 14;
        nArray2[70] = 15;
        nArray3[71] = 16;
        nArray2[72] = 17;
        nArray3[73] = 18;
        nArray2[74] = 19;
        nArray3[75] = 20;
        nArray2[76] = 21;
        nArray3[77] = 22;
        nArray2[78] = 23;
        nArray3[79] = 24;
        nArray2[80] = 25;
        nArray3[81] = 26;
        nArray2[82] = 27;
        nArray3[83] = 28;
        nArray2[84] = 29;
        nArray3[85] = 30;
        nArray2[86] = 31;
        nArray3[87] = 32;
        nArray2[88] = 33;
        nArray3[89] = 34;
        nArray2[90] = 35;
        nArray3[91] = -1;
        nArray2[92] = -1;
        nArray3[93] = -1;
        nArray2[94] = -1;
        nArray3[95] = -1;
        ALPHANUMERIC_TABLE = nArray;
    }

    private Encoder() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void append8BitBytes(String object, BitArray object2, String string2) {
        try {
            object = ((String)object).getBytes(string2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            object2 = new WriterException(unsupportedEncodingException);
            throw object2;
        }
        int n3 = ((Object)object).length;
        int n4 = 0;
        while (n4 < n3) {
            Object object3 = object[n4];
            int n7 = 8;
            ((BitArray)object2).appendBits((int)object3, n7);
            ++n4;
        }
        return;
    }

    public static void appendAlphanumericBytes(CharSequence object, BitArray bitArray) {
        int n3 = object.length();
        int n4 = 0;
        while (n4 < n3) {
            int n7;
            int n8 = Encoder.getAlphanumericCode(object.charAt(n4));
            if (n8 != (n7 = -1)) {
                int n10 = n4 + 1;
                if (n10 < n3) {
                    if ((n10 = Encoder.getAlphanumericCode(object.charAt(n10))) != n7) {
                        n8 = n8 * 45 + n10;
                        n7 = 11;
                        bitArray.appendBits(n8, n7);
                        n4 += 2;
                        continue;
                    }
                    object = new WriterException();
                    throw object;
                }
                bitArray.appendBits(n8, 6);
                n4 = n10;
                continue;
            }
            object = new WriterException();
            throw object;
        }
    }

    public static void appendBytes(String object, Mode object2, BitArray bitArray, String string2) {
        int[] nArray = Encoder$1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode;
        int n3 = object2.ordinal();
        int n4 = nArray[n3];
        if (n4 != (n3 = 1)) {
            n3 = 2;
            if (n4 != n3) {
                n3 = 3;
                if (n4 != n3) {
                    int n7 = 4;
                    if (n4 == n7) {
                        Encoder.appendKanjiBytes((String)object, bitArray);
                        return;
                    }
                    object2 = String.valueOf(object2);
                    object2 = "Invalid mode: ".concat((String)object2);
                    object = new WriterException((String)object2);
                    throw object;
                }
                Encoder.append8BitBytes((String)object, bitArray, string2);
                return;
            }
            Encoder.appendAlphanumericBytes((CharSequence)object, bitArray);
            return;
        }
        Encoder.appendNumericBytes((CharSequence)object, bitArray);
    }

    private static void appendECI(CharacterSetECI characterSetECI, BitArray bitArray) {
        int n3 = Mode.ECI.getBits();
        bitArray.appendBits(n3, 4);
        int n4 = characterSetECI.getValue();
        bitArray.appendBits(n4, 8);
    }

    /*
     * Unable to fully structure code
     */
    public static void appendKanjiBytes(String var0, BitArray var1_2) {
        var2_3 = "Shift_JIS";
        try {
            var0 = var0.getBytes(var2_3);
        }
        catch (UnsupportedEncodingException var0_1) {
            var1_2 = new WriterException(var0_1);
            throw var1_2;
        }
        var3_4 = ((Object)var0).length;
        for (var4_5 = 0; var4_5 < var3_4; var4_5 += 2) {
            var5_6 = var0[var4_5] & 255;
            var6_7 = var4_5 + 1;
            var6_7 = var0[var6_7] & 255;
            var5_6 = var5_6 << 8 | var6_7;
            var6_7 = 33088;
            var7_8 = -1;
            if (var5_6 >= var6_7 && var5_6 <= (var8_9 = 40956)) lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_6 -= var6_7;
                    break;
                }
            } else {
                var6_7 = 57408;
                if (var5_6 >= var6_7 && var5_6 <= (var6_7 = 60351)) {
                    var6_7 = 49472;
                    ** continue;
                }
                var5_6 = -1;
            }
            if (var5_6 != var7_8) {
                var6_7 = (var5_6 >> 8) * 192;
                var5_6 = 13;
                var1_2.appendBits(var6_7 += (var5_6 &= 255), var5_6);
                continue;
            }
            var0 = new WriterException("Invalid byte sequence");
            throw var0;
        }
        return;
    }

    public static void appendLengthInfo(int n3, Version object, Mode mode, BitArray object2) {
        int n4 = 1;
        int n7 = mode.getCharacterCountBits((Version)object);
        int n8 = n4 << n7;
        if (n3 < n8) {
            ((BitArray)object2).appendBits(n3, n7);
            return;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(n3);
        ((StringBuilder)object2).append(" is bigger than ");
        ((StringBuilder)object2).append(n8 -= n4);
        String string2 = ((StringBuilder)object2).toString();
        object = new WriterException(string2);
        throw object;
    }

    public static void appendModeInfo(Mode mode, BitArray bitArray) {
        int n3 = mode.getBits();
        bitArray.appendBits(n3, 4);
    }

    public static void appendNumericBytes(CharSequence charSequence, BitArray bitArray) {
        int n3 = charSequence.length();
        int n4 = 0;
        while (n4 < n3) {
            int n7 = charSequence.charAt(n4) + -48;
            int n8 = n4 + 2;
            if (n8 < n3) {
                int n10 = n4 + 1;
                n10 = charSequence.charAt(n10) + -48;
                n8 = charSequence.charAt(n8) + -48;
                n7 *= 100;
                int n14 = 10;
                n7 = a60.a(n10, n14, n7, n8);
                bitArray.appendBits(n7, n14);
                n4 += 3;
                continue;
            }
            if (++n4 < n3) {
                n4 = charSequence.charAt(n4) + -48;
                n7 = n7 * 10 + n4;
                bitArray.appendBits(n7, 7);
                n4 = n8;
                continue;
            }
            n8 = 4;
            bitArray.appendBits(n7, n8);
        }
    }

    private static int calculateBitsNeeded(Mode mode, BitArray bitArray, BitArray bitArray2, Version version) {
        int n3 = bitArray.getSize();
        int n4 = mode.getCharacterCountBits(version) + n3;
        return bitArray2.getSize() + n4;
    }

    private static int calculateMaskPenalty(ByteMatrix byteMatrix) {
        int n3 = MaskUtil.applyMaskPenaltyRule1(byteMatrix);
        int n4 = MaskUtil.applyMaskPenaltyRule2(byteMatrix);
        n3 += n4;
        n4 = MaskUtil.applyMaskPenaltyRule3(byteMatrix);
        int n7 = MaskUtil.applyMaskPenaltyRule4(byteMatrix);
        return (n3 += n4) + n7;
    }

    private static int chooseMaskPattern(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, ByteMatrix byteMatrix) {
        int n3;
        int n4 = -1 >>> 1;
        int n7 = -1;
        for (int i3 = 0; i3 < (n3 = 8); ++i3) {
            MatrixUtil.buildMatrix(bitArray, errorCorrectionLevel, version, i3, byteMatrix);
            n3 = Encoder.calculateMaskPenalty(byteMatrix);
            if (n3 >= n4) continue;
            n7 = i3;
            n4 = n3;
        }
        return n7;
    }

    public static Mode chooseMode(String string2) {
        return Encoder.chooseMode(string2, null);
    }

    private static Mode chooseMode(String string2, String string3) {
        int n3;
        String string4 = "Shift_JIS";
        int n4 = string4.equals(string3);
        if (n4 != 0 && (n4 = Encoder.isOnlyDoubleByteKanji(string2)) != 0) {
            return Mode.KANJI;
        }
        string3 = null;
        int n7 = 0;
        string4 = null;
        boolean bl2 = false;
        for (n4 = 0; n4 < (n3 = string2.length()); ++n4) {
            int n8;
            n3 = string2.charAt(n4);
            if (n3 >= (n8 = 48) && n3 <= (n8 = 57)) {
                bl2 = true;
                continue;
            }
            n7 = Encoder.getAlphanumericCode(n3);
            if (n7 != (n3 = -1)) {
                n7 = 1;
                continue;
            }
            return Mode.BYTE;
        }
        if (n7 != 0) {
            return Mode.ALPHANUMERIC;
        }
        if (bl2) {
            return Mode.NUMERIC;
        }
        return Mode.BYTE;
    }

    private static Version chooseVersion(int n3, ErrorCorrectionLevel errorCorrectionLevel) {
        int n4;
        for (int i3 = 1; i3 <= (n4 = 40); ++i3) {
            Version version = Version.getVersionForNumber(i3);
            boolean bl2 = Encoder.willFit(n3, version, errorCorrectionLevel);
            if (!bl2) continue;
            return version;
        }
        WriterException writerException = new WriterException("Data too big");
        throw writerException;
    }

    public static QRCode encode(String string2, ErrorCorrectionLevel errorCorrectionLevel) {
        return Encoder.encode(string2, errorCorrectionLevel, null);
    }

    public static QRCode encode(String object, ErrorCorrectionLevel errorCorrectionLevel, Map object2) {
        int n3;
        boolean bl2;
        Object object3;
        Object object4;
        int n4;
        if (object2 != null && (n4 = object2.containsKey(object4 = EncodeHintType.CHARACTER_SET)) != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object4 = null;
        }
        if (n4 != 0) {
            object3 = EncodeHintType.CHARACTER_SET;
            object3 = object2.get(object3).toString();
        } else {
            object3 = DEFAULT_BYTE_MODE_ENCODING;
        }
        Object object5 = Encoder.chooseMode((String)object, (String)object3);
        BitArray bitArray = new BitArray();
        Mode mode = Mode.BYTE;
        if (object5 == mode && n4 != 0 && (object4 = CharacterSetECI.getCharacterSetECIByName((String)object3)) != null) {
            Encoder.appendECI((CharacterSetECI)((Object)object4), bitArray);
        }
        if (object2 != null && (bl2 = object2.containsKey(object4 = EncodeHintType.GS1_FORMAT)) && (n4 = ((Boolean)(object4 = Boolean.valueOf(object2.get(object4).toString()))).booleanValue()) != 0) {
            object4 = Mode.FNC1_FIRST_POSITION;
            Encoder.appendModeInfo((Mode)((Object)object4), bitArray);
        }
        Encoder.appendModeInfo(object5, bitArray);
        object4 = new BitArray();
        Encoder.appendBytes((String)object, object5, (BitArray)object4, (String)object3);
        if (object2 != null && (bl2 = object2.containsKey(object3 = EncodeHintType.QR_VERSION))) {
            int n7 = Integer.parseInt(object2.get(object3).toString());
            n3 = Encoder.willFit(Encoder.calculateBitsNeeded(object5, bitArray, (BitArray)object4, (Version)(object2 = Version.getVersionForNumber(n7))), (Version)object2, errorCorrectionLevel);
            if (n3 == 0) {
                object = new WriterException("Data too big for requested version");
                throw object;
            }
        } else {
            object2 = Encoder.recommendVersion(errorCorrectionLevel, object5, bitArray, (BitArray)object4);
        }
        object3 = new BitArray();
        ((BitArray)object3).appendBitArray(bitArray);
        int n8 = object5 == mode ? ((BitArray)object4).getSizeInBytes() : ((String)object).length();
        Encoder.appendLengthInfo(n8, (Version)object2, object5, (BitArray)object3);
        ((BitArray)object3).appendBitArray((BitArray)object4);
        object = ((Version)object2).getECBlocksForLevel(errorCorrectionLevel);
        n4 = ((Version)object2).getTotalCodewords();
        int n10 = ((Version$ECBlocks)object).getTotalECCodewords();
        Encoder.terminateBits(n4 -= n10, (BitArray)object3);
        n10 = ((Version)object2).getTotalCodewords();
        n8 = ((Version$ECBlocks)object).getNumBlocks();
        object = Encoder.interleaveWithECBytes((BitArray)object3, n10, n4, n8);
        object4 = new QRCode();
        ((QRCode)object4).setECLevel(errorCorrectionLevel);
        ((QRCode)object4).setMode((Mode)((Object)object5));
        ((QRCode)object4).setVersion((Version)object2);
        n3 = ((Version)object2).getDimensionForVersion();
        object5 = new ByteMatrix(n3, n3);
        n3 = Encoder.chooseMaskPattern((BitArray)object, errorCorrectionLevel, (Version)object2, (ByteMatrix)object5);
        ((QRCode)object4).setMaskPattern(n3);
        MatrixUtil.buildMatrix((BitArray)object, errorCorrectionLevel, (Version)object2, n3, (ByteMatrix)object5);
        ((QRCode)object4).setMatrix((ByteMatrix)object5);
        return object4;
    }

    public static byte[] generateECBytes(byte[] object, int n3) {
        int n4;
        int n7 = ((byte[])object).length;
        int n8 = n7 + n3;
        int[] nArray = new int[n8];
        int n10 = 0;
        GenericGF genericGF = null;
        for (n4 = 0; n4 < n7; ++n4) {
            int n14;
            nArray[n4] = n14 = object[n4] & 0xFF;
        }
        object = new ReedSolomonEncoder;
        genericGF = GenericGF.QR_CODE_FIELD_256;
        object(genericGF);
        object.encode(nArray, n3);
        object = new byte[n3];
        while (n10 < n3) {
            n4 = n7 + n10;
            object[n10] = n4 = (int)((byte)nArray[n4]);
            ++n10;
        }
        return object;
    }

    public static int getAlphanumericCode(int n3) {
        int[] nArray = ALPHANUMERIC_TABLE;
        int n4 = nArray.length;
        if (n3 < n4) {
            return nArray[n3];
        }
        return -1;
    }

    public static void getNumDataBytesAndNumECBytesForBlockID(int n3, int n4, int n7, int n8, int[] nArray, int[] nArray2) {
        if (n8 < n7) {
            int n10;
            int n14 = n3 % n7;
            int n15 = n7 - n14;
            int n16 = n3 / n7;
            int n17 = n16 + 1;
            if ((n16 -= (n4 /= n7)) == (n17 -= (n10 = n4 + 1))) {
                int n18 = n15 + n14;
                if (n7 == n18) {
                    n7 = (n4 + n16) * n15;
                    n18 = (n10 + n17) * n14 + n7;
                    if (n3 == n18) {
                        n3 = 0;
                        Object var12_12 = null;
                        if (n8 < n15) {
                            nArray[0] = n4;
                            nArray2[0] = n16;
                            return;
                        }
                        nArray[0] = n10;
                        nArray2[0] = n17;
                        return;
                    }
                    WriterException writerException = new WriterException("Total bytes mismatch");
                    throw writerException;
                }
                WriterException writerException = new WriterException("RS blocks mismatch");
                throw writerException;
            }
            WriterException writerException = new WriterException("EC bytes mismatch");
            throw writerException;
        }
        WriterException writerException = new WriterException("Block ID too large");
        throw writerException;
    }

    public static BitArray interleaveWithECBytes(BitArray bitArray, int n3, int n4, int n7) {
        int n8 = n3;
        int n10 = n4;
        int n14 = n7;
        int n15 = bitArray.getSizeInBytes();
        if (n15 == n4) {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            int n16;
            int n17;
            ArrayList<int[]> arrayList = new ArrayList<int[]>(n7);
            int n18 = 0;
            int n19 = 0;
            int n20 = 0;
            int n21 = 0;
            for (int i3 = 0; i3 < n14; ++i3) {
                n15 = 1;
                int[] nArray = new int[n15];
                int[] nArray2 = new int[n15];
                n15 = n3;
                n17 = n4;
                n16 = n7;
                object5 = i3;
                object4 = nArray;
                Encoder.getNumDataBytesAndNumECBytesForBlockID(n3, n4, n7, i3, nArray, nArray2);
                n15 = nArray[0];
                object3 = new byte[n15];
                n16 = n19 << 3;
                object2 = bitArray;
                bitArray.toBytes(n16, (byte[])object3, 0, n15);
                n16 = nArray2[0];
                object = Encoder.generateECBytes((byte[])object3, n16);
                object4 = new BlockPair;
                object4((byte[])object3, (byte[])object);
                arrayList.add((int[])object4);
                n20 = Math.max(n20, n15);
                n15 = ((Object)object).length;
                n21 = Math.max(n21, n15);
                n15 = nArray[0];
                n19 += n15;
            }
            if (n10 == n19) {
                int n22;
                Object object6 = new BitArray();
                n17 = 0;
                object3 = null;
                while (true) {
                    n16 = 8;
                    if (n17 >= n20) break;
                    object2 = arrayList.iterator();
                    while ((n22 = object2.hasNext()) != 0) {
                        object4 = ((BlockPair)object2.next()).getDataBytes();
                        int n24 = ((int[])object4).length;
                        if (n17 >= n24) continue;
                        n22 = object4[n17];
                        ((BitArray)object6).appendBits(n22, n16);
                    }
                    ++n17;
                }
                while (n18 < n21) {
                    object3 = arrayList.iterator();
                    while ((object5 = (Object)object3.hasNext()) != 0) {
                        object2 = ((BlockPair)object3.next()).getErrorCorrectionBytes();
                        n22 = ((Object)object2).length;
                        if (n18 >= n22) continue;
                        object5 = object2[n18];
                        ((BitArray)object6).appendBits((int)object5, n16);
                    }
                    ++n18;
                }
                n17 = ((BitArray)object6).getSizeInBytes();
                if (n8 == n17) {
                    return object6;
                }
                object = wk0_0.a(n8, "Interleaving error: ", " and ");
                n15 = ((BitArray)object6).getSizeInBytes();
                ((StringBuilder)object).append(n15);
                ((StringBuilder)object).append(" differ.");
                object6 = ((StringBuilder)object).toString();
                object3 = new WriterException((String)object6);
                throw object3;
            }
            WriterException writerException = new WriterException("Data bytes does not match offset");
            throw writerException;
        }
        WriterException writerException = new WriterException("Number of bits and data bytes does not match");
        throw writerException;
    }

    private static boolean isOnlyDoubleByteKanji(String object) {
        String string2 = "Shift_JIS";
        try {
            object = ((String)object).getBytes(string2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return false;
        }
        int n3 = ((Object)object).length;
        int n4 = n3 % 2;
        if (n4 != 0) {
            return false;
        }
        for (n4 = 0; n4 < n3; n4 += 2) {
            int n7 = object[n4] & 0xFF;
            int n8 = 129;
            if (n7 >= n8 && n7 <= (n8 = 159) || n7 >= (n8 = 224) && n7 <= (n8 = 235)) {
                continue;
            }
            return false;
        }
        return true;
    }

    private static Version recommendVersion(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, BitArray bitArray, BitArray bitArray2) {
        Version version = Version.getVersionForNumber(1);
        version = Encoder.chooseVersion(Encoder.calculateBitsNeeded(mode, bitArray, bitArray2, version), errorCorrectionLevel);
        return Encoder.chooseVersion(Encoder.calculateBitsNeeded(mode, bitArray, bitArray2, version), errorCorrectionLevel);
    }

    public static void terminateBits(int n3, BitArray object) {
        int n4 = n3 << 3;
        int n7 = ((BitArray)object).getSize();
        if (n7 <= n4) {
            int n8;
            int n10;
            n7 = 0;
            Object var4_4 = null;
            for (n10 = 0; n10 < (n8 = 4) && (n8 = ((BitArray)object).getSize()) < n4; ++n10) {
                ((BitArray)object).appendBit(false);
            }
            n8 = 8;
            if (n10 > 0) {
                for (n10 = ((BitArray)object).getSize() & 7; n10 < n8; ++n10) {
                    ((BitArray)object).appendBit(false);
                }
            }
            n10 = ((BitArray)object).getSizeInBytes();
            n3 -= n10;
            while (n7 < n3) {
                n10 = n7 & 1;
                n10 = n10 == 0 ? 236 : 17;
                ((BitArray)object).appendBits(n10, n8);
                ++n7;
            }
            n3 = ((BitArray)object).getSize();
            if (n3 == n4) {
                return;
            }
            WriterException writerException = new WriterException("Bits size does not equal capacity");
            throw writerException;
        }
        StringBuilder stringBuilder = new StringBuilder("data bits cannot fit in the QR Code");
        int n14 = ((BitArray)object).getSize();
        stringBuilder.append(n14);
        stringBuilder.append(" > ");
        stringBuilder.append(n4);
        object = stringBuilder.toString();
        WriterException writerException = new WriterException((String)object);
        throw writerException;
    }

    private static boolean willFit(int n3, Version object, ErrorCorrectionLevel errorCorrectionLevel) {
        int n4 = ((Version)object).getTotalCodewords();
        int n7 = ((Version$ECBlocks)(object = ((Version)object).getECBlocksForLevel(errorCorrectionLevel))).getTotalECCodewords();
        return (n4 -= n7) >= (n3 = (n3 + 7) / 8);
    }
}

