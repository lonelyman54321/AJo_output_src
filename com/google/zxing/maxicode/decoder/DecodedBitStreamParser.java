/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.maxicode.decoder;

import com.google.zxing.common.DecoderResult;
import java.text.DecimalFormat;
import java.text.NumberFormat;

final class DecodedBitStreamParser {
    private static final char ECI = '\ufffa';
    private static final char FS = '\u001c';
    private static final char GS = '\u001d';
    private static final char LATCHA = '\ufff7';
    private static final char LATCHB = '\ufff8';
    private static final char LOCK = '\ufff9';
    private static final char NS = '\ufffb';
    private static final char PAD = '\ufffc';
    private static final char RS = '\u001e';
    private static final String[] SETS = new String[]{"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb \ufffc\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{\ufffc}~\u007f;<=>?[\\]^_ ,./:@!|\ufffc\ufff5\ufff6\ufffc\ufff0\ufff2\ufff3\ufff4\ufff7", "\u00c0\u00c1\u00c2\u00c3\u00c4\u00c5\u00c6\u00c7\u00c8\u00c9\u00ca\u00cb\u00cc\u00cd\u00ce\u00cf\u00d0\u00d1\u00d2\u00d3\u00d4\u00d5\u00d6\u00d7\u00d8\u00d9\u00da\ufffa\u001c\u001d\u001e\u00db\u00dc\u00dd\u00de\u00df\u00aa\u00ac\u00b1\u00b2\u00b3\u00b5\u00b9\u00ba\u00bc\u00bd\u00be\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "\u00e0\u00e1\u00e2\u00e3\u00e4\u00e5\u00e6\u00e7\u00e8\u00e9\u00ea\u00eb\u00ec\u00ed\u00ee\u00ef\u00f0\u00f1\u00f2\u00f3\u00f4\u00f5\u00f6\u00f7\u00f8\u00f9\u00fa\ufffa\u001c\u001d\u001e\ufffb\u00fb\u00fc\u00fd\u00fe\u00ff\u00a1\u00a8\u00ab\u00af\u00b0\u00b4\u00b7\u00b8\u00bb\u00bf\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa\ufffc\ufffc\u001b\ufffb\u001c\u001d\u001e\u001f\u009f\u00a0\u00a2\u00a3\u00a4\u00a5\u00a6\u00a7\u00a9\u00ad\u00ae\u00b6\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};
    private static final char SHIFTA = '\ufff0';
    private static final char SHIFTB = '\ufff1';
    private static final char SHIFTC = '\ufff2';
    private static final char SHIFTD = '\ufff3';
    private static final char SHIFTE = '\ufff4';
    private static final char THREESHIFTA = '\ufff6';
    private static final char TWOSHIFTA = '\ufff5';

    private DecodedBitStreamParser() {
    }

    public static DecoderResult decode(byte[] byArray, int n3) {
        Object object;
        int n4;
        CharSequence charSequence = new StringBuilder(144);
        int n7 = 2;
        if (n3 != n7 && n3 != (n4 = 3)) {
            n7 = 4;
            n4 = 1;
            if (n3 != n7) {
                n7 = 5;
                if (n3 == n7) {
                    n7 = 77;
                    object = DecodedBitStreamParser.getMessage(byArray, n4, n7);
                    ((StringBuilder)charSequence).append((String)object);
                }
            } else {
                n7 = 93;
                object = DecodedBitStreamParser.getMessage(byArray, n4, n7);
                ((StringBuilder)charSequence).append((String)object);
            }
        } else {
            long l2;
            Object object2;
            String string2;
            int n8;
            n4 = 0;
            StringBuilder stringBuilder = null;
            if (n3 == n7) {
                n7 = DecodedBitStreamParser.getPostCode2(byArray);
                n8 = DecodedBitStreamParser.getPostCode2Length(byArray);
                string2 = "0000000000".substring(0, n8);
                object2 = new DecimalFormat(string2);
                l2 = n7;
                object = ((NumberFormat)object2).format(l2);
            } else {
                object = DecodedBitStreamParser.getPostCode3(byArray);
            }
            object2 = new DecimalFormat("000");
            int n10 = DecodedBitStreamParser.getCountry(byArray);
            l2 = n10;
            string2 = ((NumberFormat)object2).format(l2);
            long l3 = DecodedBitStreamParser.getServiceClass(byArray);
            object2 = ((NumberFormat)object2).format(l3);
            CharSequence charSequence2 = DecodedBitStreamParser.getMessage(byArray, 10, 84);
            ((StringBuilder)charSequence).append((String)charSequence2);
            charSequence2 = ((StringBuilder)charSequence).toString();
            String string3 = "[)>\u001e01\u001d";
            n8 = (int)(((String)charSequence2).startsWith(string3) ? 1 : 0);
            char c2 = '\u001d';
            if (n8 != 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                stringBuilder.append(c2);
                stringBuilder.append(string2);
                stringBuilder.append(c2);
                stringBuilder.append((String)object2);
                stringBuilder.append(c2);
                object = stringBuilder.toString();
                n4 = 9;
                ((StringBuilder)charSequence).insert(n4, (String)object);
            } else {
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append((String)object);
                ((StringBuilder)charSequence2).append(c2);
                ((StringBuilder)charSequence2).append(string2);
                ((StringBuilder)charSequence2).append(c2);
                ((StringBuilder)charSequence2).append((String)object2);
                ((StringBuilder)charSequence2).append(c2);
                object = ((StringBuilder)charSequence2).toString();
                ((StringBuilder)charSequence).insert(0, (String)object);
            }
        }
        charSequence = ((StringBuilder)charSequence).toString();
        String string4 = String.valueOf(n3);
        object = new DecoderResult(byArray, (String)charSequence, null, string4);
        return object;
    }

    private static int getBit(int n3, byte[] byArray) {
        int n4 = (n3 += -1) / 6;
        byte by2 = byArray[n4];
        n3 %= 6;
        n3 = 5 - n3;
        n4 = 1;
        if ((n3 = n4 << n3 & by2) == 0) {
            return 0;
        }
        return n4;
    }

    private static int getCountry(byte[] byArray) {
        byte[] byArray2;
        byte[] byArray3 = byArray2 = new byte[10];
        byte[] byArray4 = byArray2;
        byArray3[0] = 53;
        byArray4[1] = 54;
        byArray3[2] = 43;
        byArray4[3] = 44;
        byArray3[4] = 45;
        byArray4[5] = 46;
        byArray3[6] = 47;
        byArray4[7] = 48;
        byArray3[8] = 37;
        byArray4[9] = 38;
        return DecodedBitStreamParser.getInt(byArray, byArray2);
    }

    private static int getInt(byte[] object, byte[] byArray) {
        int n3 = byArray.length;
        if (n3 != 0) {
            int n4;
            int n7 = 0;
            for (n3 = 0; n3 < (n4 = byArray.length); ++n3) {
                n4 = DecodedBitStreamParser.getBit(byArray[n3], object);
                int n8 = byArray.length - n3 + -1;
                n7 += (n4 <<= n8);
            }
            return n7;
        }
        object = new IllegalArgumentException;
        object();
        throw object;
    }

    /*
     * Unable to fully structure code
     */
    private static String getMessage(byte[] var0, int var1_1, int var2_2) {
        var3_3 = new StringBuilder();
        var4_4 = var1_1;
        var5_5 = 0;
        var6_6 = -1;
        var7_7 = 0;
        while (true) {
            var8_8 = var1_1 + var2_2;
            var9_9 = 1;
            if (var4_4 >= var8_8) break;
            var10_10 = DecodedBitStreamParser.SETS[var5_5];
            var11_11 = var0[var4_4];
            var8_8 = var10_10.charAt(var11_11);
            block0 : switch (var8_8) {
                default: {
                    var3_3.append((char)var8_8);
                    break;
                }
                case 65531: {
                    var8_8 = var4_4 + 1;
                    var8_8 = var0[var8_8] << 24;
                    var11_11 = var4_4 + 2;
                    var11_11 = var0[var11_11] << 18;
                    var8_8 += var11_11;
                    var11_11 = var4_4 + 3;
                    var11_11 = var0[var11_11] << 12;
                    var8_8 += var11_11;
                    var11_11 = var4_4 + 4;
                    var11_11 = var0[var11_11] << 6;
                    var8_8 += var11_11;
                    var11_11 = var0[var4_4 += 5];
                    var13_13 = "000000000";
                    var12_12 = new DecimalFormat(var13_13);
                    var14_14 = var8_8 += var11_11;
                    var10_10 = var12_12.format(var14_14);
                    var3_3.append(var10_10);
                    break;
                }
lbl38:
                // 3 sources

                case 65529: {
                    var6_6 = -1;
                    break;
                }
                case 65528: {
                    var5_5 = 1;
                    ** GOTO lbl38
                }
                case 65527: {
                    var5_5 = 0;
                    ** GOTO lbl38
                }
                case 65526: {
                    var6_6 = 3;
lbl49:
                    // 2 sources

                    while (true) {
                        var7_7 = var5_5;
                        var5_5 = 0;
                        break block0;
                        break;
                    }
                }
                case 65525: {
                    var6_6 = 2;
                    ** continue;
                }
                case 65520: 
                case 65521: 
                case 65522: 
                case 65523: 
                case 65524: {
                    var7_7 = var5_5;
                    var5_5 = var8_8 -= (char)-16;
                    var6_6 = 1;
                }
            }
            var8_8 = var6_6 + -1;
            if (var6_6 == 0) {
                var5_5 = var7_7;
            }
            var4_4 += var9_9;
            var6_6 = var8_8;
        }
        while ((var16_15 = var3_3.length()) > 0) {
            var16_15 = var3_3.length() - var9_9;
            if ((var16_15 = (int)var3_3.charAt(var16_15)) != (var1_1 = (int)((char)-4))) break;
            var16_15 = var3_3.length() - var9_9;
            var3_3.setLength(var16_15);
        }
        return var3_3.toString();
    }

    private static int getPostCode2(byte[] byArray) {
        byte[] byArray2;
        byte[] byArray3 = byArray2 = new byte[30];
        byte[] byArray4 = byArray2;
        byArray3[0] = 33;
        byArray4[1] = 34;
        byArray3[2] = 35;
        byArray4[3] = 36;
        byArray3[4] = 25;
        byArray4[5] = 26;
        byArray3[6] = 27;
        byArray4[7] = 28;
        byArray3[8] = 29;
        byArray4[9] = 30;
        byArray3[10] = 19;
        byArray4[11] = 20;
        byArray3[12] = 21;
        byArray4[13] = 22;
        byArray3[14] = 23;
        byArray4[15] = 24;
        byArray3[16] = 13;
        byArray4[17] = 14;
        byArray3[18] = 15;
        byArray4[19] = 16;
        byArray3[20] = 17;
        byArray4[21] = 18;
        byArray3[22] = 7;
        byArray4[23] = 8;
        byArray3[24] = 9;
        byArray4[25] = 10;
        byArray3[26] = 11;
        byArray4[27] = 12;
        byArray3[28] = 1;
        byArray4[29] = 2;
        return DecodedBitStreamParser.getInt(byArray, byArray2);
    }

    private static int getPostCode2Length(byte[] byArray) {
        byte[] byArray2;
        byte[] byArray3 = byArray2 = new byte[6];
        byte[] byArray4 = byArray2;
        byArray3[0] = 39;
        byArray4[1] = 40;
        byArray3[2] = 41;
        byArray4[3] = 42;
        byArray3[4] = 31;
        byArray4[5] = 32;
        return DecodedBitStreamParser.getInt(byArray, byArray2);
    }

    private static String getPostCode3(byte[] byArray) {
        byte[] byArray2;
        byte[] byArray3;
        Object object = SETS;
        String string2 = object[0];
        int n3 = 6;
        Object object2 = new byte[n3];
        byte[] byArray4 = object2;
        byte[] byArray5 = object2;
        byArray4[0] = 39;
        byArray5[1] = 40;
        byArray4[2] = 41;
        byArray5[3] = 42;
        byArray4[4] = 31;
        byArray5[5] = 32;
        int n4 = DecodedBitStreamParser.getInt(byArray, (byte[])object2);
        char c2 = string2.charAt(n4);
        object2 = object[0];
        Object object3 = new byte[n3];
        byte[] byArray6 = object3;
        byte[] byArray7 = object3;
        byArray6[0] = 33;
        byArray7[1] = 34;
        byArray6[2] = 35;
        byArray7[3] = 36;
        byArray6[4] = 25;
        byArray7[5] = 26;
        int n7 = DecodedBitStreamParser.getInt(byArray, (byte[])object3);
        n4 = ((String)object2).charAt(n7);
        object3 = object[0];
        Object object4 = new byte[n3];
        byte[] byArray8 = object4;
        byte[] byArray9 = object4;
        byArray8[0] = 27;
        byArray9[1] = 28;
        byArray8[2] = 29;
        byArray9[3] = 30;
        byArray8[4] = 19;
        byArray9[5] = 20;
        int n8 = DecodedBitStreamParser.getInt(byArray, (byte[])object4);
        n7 = ((String)object3).charAt(n8);
        object4 = object[0];
        Object object5 = new byte[n3];
        byte[] byArray10 = object5;
        byte[] byArray11 = object5;
        byArray10[0] = 21;
        byArray11[1] = 22;
        byArray10[2] = 23;
        byArray11[3] = 24;
        byArray10[4] = 13;
        byArray11[5] = 14;
        int n10 = DecodedBitStreamParser.getInt(byArray, (byte[])object5);
        n8 = ((String)object4).charAt(n10);
        object5 = object[0];
        byte[] byArray12 = byArray3 = new byte[n3];
        byte[] byArray13 = byArray3;
        byArray12[0] = 15;
        byArray13[1] = 16;
        byArray12[2] = 17;
        byArray13[3] = 18;
        byArray12[4] = 7;
        byArray13[5] = 8;
        int n14 = DecodedBitStreamParser.getInt(byArray, byArray3);
        n10 = ((String)object5).charAt(n14);
        object = object[0];
        byte[] byArray14 = byArray2 = new byte[n3];
        byte[] byArray15 = byArray2;
        byArray14[0] = 9;
        byArray15[1] = 10;
        byArray14[2] = 11;
        byArray15[3] = 12;
        byArray14[4] = 1;
        byArray15[5] = 2;
        int n15 = DecodedBitStreamParser.getInt(byArray, byArray2);
        n15 = object.charAt(n15);
        object = new char[n3];
        object[0] = (String)c2;
        object[1] = (String)n4;
        object[2] = (String)n7;
        object[3] = (String)n8;
        object[4] = (String)n10;
        object[5] = (String)n15;
        return String.valueOf((char[])object);
    }

    private static int getServiceClass(byte[] byArray) {
        byte[] byArray2;
        byte[] byArray3 = byArray2 = new byte[10];
        byte[] byArray4 = byArray2;
        byArray3[0] = 55;
        byArray4[1] = 56;
        byArray3[2] = 57;
        byArray4[3] = 58;
        byArray3[4] = 59;
        byArray4[5] = 60;
        byArray3[6] = 49;
        byArray4[7] = 50;
        byArray3[8] = 51;
        byArray4[9] = 52;
        return DecodedBitStreamParser.getInt(byArray, byArray2);
    }
}

