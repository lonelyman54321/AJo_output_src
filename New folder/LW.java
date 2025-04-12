/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import java.util.Locale;
import java.util.regex.Pattern;

public final class LW {
    public static final byte[] a;
    public static final String[] b;
    public static final Pattern c;

    static {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[4];
        byte[] byArray3 = byArray;
        byArray2[0] = 0;
        byArray3[1] = 0;
        byArray2[2] = 0;
        byArray3[3] = 1;
        a = byArray;
        b = new String[]{"", "A", "B", "C"};
        c = Pattern.compile("^\\D?(\\d+)$");
    }

    public static String a(int n3, boolean n4, int n7, int n8, int[] nArray, int n10) {
        int n14 = 1;
        Object[] objectArray = b;
        Object object = objectArray[n3];
        Object object2 = n7;
        Object[] objectArray2 = Integer.valueOf(n8);
        n4 = n4 != 0 ? 72 : 76;
        Object object3 = Character.valueOf((char)n4);
        Integer n15 = n10;
        int n16 = 5;
        objectArray = new Object[n16];
        objectArray[0] = object;
        objectArray[n14] = object2;
        objectArray[2] = objectArray2;
        objectArray[3] = object3;
        objectArray[4] = n15;
        n3 = gz3.a;
        object = Locale.US;
        object3 = "hvc1.%s%d.%X.%c%d";
        object = String.format((Locale)object, (String)object3, objectArray);
        StringBuilder stringBuilder = new StringBuilder((String)object);
        for (n3 = nArray.length; n3 > 0; n3 += -1) {
            n4 = n3 + -1;
            if ((n4 = nArray[n4]) != 0) break;
        }
        object3 = null;
        for (n4 = 0; n4 < n3; n4 += n14) {
            n7 = nArray[n4];
            object2 = n7;
            objectArray2 = new Object[n14];
            objectArray2[0] = object2;
            object2 = String.format(".%02X", objectArray2);
            stringBuilder.append((String)object2);
        }
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    public static Pair b(String var0, String[] var1_1, VX var2_2) {
        block66: {
            block62: {
                block64: {
                    block65: {
                        block63: {
                            var3_3 = 16;
                            var4_4 = 8;
                            var5_5 = 3;
                            var6_6 = 6;
                            var7_7 = 2;
                            var8_8 = 1;
                            var9_9 = ((String[])var1_1).length;
                            var10_10 = "Ignoring malformed HEVC codec string: ";
                            var11_11 = 4;
                            if (var9_9 < var11_11) {
                                KW.b(var10_10, (String)var0);
                                return null;
                            }
                            var12_12 = var1_1[var8_8];
                            var13_13 = LW.c;
                            var14_14 = (var12_12 = var13_13.matcher((CharSequence)var12_12)).matches();
                            if (!var14_14) {
                                KW.b(var10_10, (String)var0);
                                return null;
                            }
                            var0 = var12_12.group(var8_8);
                            var12_12 = "1";
                            var9_9 = (int)var12_12.equals(var0);
                            var15_15 = 4096;
                            if (var9_9 == 0) break block63;
                            var16_16 = 1;
                            break block64;
                        }
                        var12_12 = "2";
                        var9_9 = (int)var12_12.equals(var0);
                        if (var9_9 == 0) break block65;
                        var16_16 = var2_2 != null && (var16_16 = var2_2.c) == var6_6 ? 4096 : 2;
                        break block64;
                    }
                    var2_2 = "6";
                    var17_17 = (int)var2_2.equals(var0);
                    if (var17_17 == 0) break block66;
                    var16_16 = 6;
                }
                var1_1 = var1_1[var5_5];
                if (var1_1 == null) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var17_17 = 0;
                        var2_2 = null;
                        break block62;
                        break;
                    }
                }
                var17_17 = -1;
                var9_9 = var1_1.hashCode();
                switch (var9_9) lbl-1000:
                // 27 sources

                {
                    default: {
                        var5_5 = -1;
                        break;
                    }
                    case 2312995: {
                        var18_18 = "L186";
                        var5_5 = (int)var1_1.equals(var18_18);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 25;
                        break;
                    }
                    case 2312992: {
                        var18_19 = "L183";
                        var5_5 = (int)var1_1.equals(var18_19);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 24;
                        break;
                    }
                    case 2312989: {
                        var18_20 = "L180";
                        var5_5 = (int)var1_1.equals(var18_20);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 23;
                        break;
                    }
                    case 2312902: {
                        var18_21 = "L156";
                        var5_5 = (int)var1_1.equals(var18_21);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 22;
                        break;
                    }
                    case 2312899: {
                        var18_22 = "L153";
                        var5_5 = (int)var1_1.equals(var18_22);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 21;
                        break;
                    }
                    case 2312896: {
                        var18_23 = "L150";
                        var5_5 = (int)var1_1.equals(var18_23);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 20;
                        break;
                    }
                    case 2312806: {
                        var18_24 = "L123";
                        var5_5 = (int)var1_1.equals(var18_24);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 19;
                        break;
                    }
                    case 2312803: {
                        var18_25 = "L120";
                        var5_5 = (int)var1_1.equals(var18_25);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 18;
                        break;
                    }
                    case 2193831: {
                        var18_26 = "H186";
                        var5_5 = (int)var1_1.equals(var18_26);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 17;
                        break;
                    }
                    case 2193828: {
                        var18_27 = "H183";
                        var5_5 = (int)var1_1.equals(var18_27);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 16;
                        break;
                    }
                    case 2193825: {
                        var18_28 = "H180";
                        var5_5 = (int)var1_1.equals(var18_28);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 15;
                        break;
                    }
                    case 2193738: {
                        var18_29 = "H156";
                        var5_5 = (int)var1_1.equals(var18_29);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 14;
                        break;
                    }
                    case 2193735: {
                        var18_30 = "H153";
                        var5_5 = (int)var1_1.equals(var18_30);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 13;
                        break;
                    }
                    case 2193732: {
                        var18_31 = "H150";
                        var5_5 = (int)var1_1.equals(var18_31);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 12;
                        break;
                    }
                    case 2193642: {
                        var18_32 = "H123";
                        var5_5 = (int)var1_1.equals(var18_32);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 11;
                        break;
                    }
                    case 2193639: {
                        var18_33 = "H120";
                        var5_5 = (int)var1_1.equals(var18_33);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 10;
                        break;
                    }
                    case 74854: {
                        var18_34 = "L93";
                        var5_5 = (int)var1_1.equals(var18_34);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 9;
                        break;
                    }
                    case 74851: {
                        var18_35 = "L90";
                        var5_5 = (int)var1_1.equals(var18_35);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 8;
                        break;
                    }
                    case 74761: {
                        var18_36 = "L63";
                        var5_5 = (int)var1_1.equals(var18_36);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 7;
                        break;
                    }
                    case 74758: {
                        var18_37 = "L60";
                        var5_5 = (int)var1_1.equals(var18_37);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 6;
                        break;
                    }
                    case 74665: {
                        var18_38 = "L30";
                        var5_5 = (int)var1_1.equals(var18_38);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 5;
                        break;
                    }
                    case 71010: {
                        var18_39 = "H93";
                        var5_5 = (int)var1_1.equals(var18_39);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 4;
                        break;
                    }
                    case 71007: {
                        var19_43 = "H90";
                        var6_6 = (int)var1_1.equals(var19_43);
                        if (var6_6 != 0) break;
                        ** GOTO lbl-1000
                    }
                    case 70917: {
                        var18_40 = "H63";
                        var5_5 = (int)var1_1.equals(var18_40);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 2;
                        break;
                    }
                    case 70914: {
                        var18_41 = "H60";
                        var5_5 = (int)var1_1.equals(var18_41);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 1;
                        break;
                    }
                    case 70821: {
                        var18_42 = "H30";
                        var5_5 = (int)var1_1.equals(var18_42);
                        if (var5_5 == 0) ** GOTO lbl-1000
                        var5_5 = 0;
                        var18_42 = null;
                    }
                }
                switch (var5_5) {
                    default: {
                        ** continue;
                    }
                    case 25: {
                        var17_17 = 0x1000000;
                        var2_2 = var17_17;
                        break;
                    }
                    case 24: {
                        var17_17 = 0x400000;
                        var2_2 = var17_17;
                        break;
                    }
                    case 23: {
                        var17_17 = 0x100000;
                        var2_2 = var17_17;
                        break;
                    }
                    case 22: {
                        var17_17 = 262144;
                        var2_2 = var17_17;
                        break;
                    }
                    case 21: {
                        var17_17 = 65536;
                        var2_2 = var17_17;
                        break;
                    }
                    case 20: {
                        var17_17 = 16384;
                        var2_2 = var17_17;
                        break;
                    }
                    case 19: {
                        var2_2 = var15_15;
                        break;
                    }
                    case 18: {
                        var17_17 = 1024;
                        var2_2 = var17_17;
                        break;
                    }
                    case 17: {
                        var17_17 = 0x2000000;
                        var2_2 = var17_17;
                        break;
                    }
                    case 16: {
                        var17_17 = 0x800000;
                        var2_2 = var17_17;
                        break;
                    }
                    case 15: {
                        var17_17 = 0x200000;
                        var2_2 = var17_17;
                        break;
                    }
                    case 14: {
                        var17_17 = 524288;
                        var2_2 = var17_17;
                        break;
                    }
                    case 13: {
                        var17_17 = 131072;
                        var2_2 = var17_17;
                        break;
                    }
                    case 12: {
                        var17_17 = 32768;
                        var2_2 = var17_17;
                        break;
                    }
                    case 11: {
                        var17_17 = 8192;
                        var2_2 = var17_17;
                        break;
                    }
                    case 10: {
                        var17_17 = 2048;
                        var2_2 = var17_17;
                        break;
                    }
                    case 9: {
                        var17_17 = 256;
                        var2_2 = var17_17;
                        break;
                    }
                    case 8: {
                        var17_17 = 64;
                        var2_2 = var17_17;
                        break;
                    }
                    case 7: {
                        var2_2 = var3_3;
                        break;
                    }
                    case 6: {
                        var2_2 = var11_11;
                        break;
                    }
                    case 5: {
                        var2_2 = var8_8;
                        break;
                    }
                    case 4: {
                        var17_17 = 512;
                        var2_2 = var17_17;
                        break;
                    }
                    case 3: {
                        var17_17 = 128;
                        var2_2 = var17_17;
                        break;
                    }
                    case 2: {
                        var17_17 = 32;
                        var2_2 = var17_17;
                        break;
                    }
                    case 1: {
                        var2_2 = var4_4;
                        break;
                    }
                    case 0: {
                        var2_2 = var7_7;
                    }
                }
            }
            if (var2_2 == null) {
                KW.b("Unknown HEVC level string: ", (String)var1_1);
                return null;
            }
            var0 = var16_16;
            var1_1 = new Pair(var0, var2_2);
            return var1_1;
        }
        KW.b("Unknown HEVC profile string: ", (String)var0);
        return null;
    }
}

