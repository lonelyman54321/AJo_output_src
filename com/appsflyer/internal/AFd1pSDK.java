/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.text.TextUtils
 *  android.view.View$MeasureSpec
 *  android.widget.ExpandableListView
 */
package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import com.appsflyer.internal.AFk1oSDK;
import com.appsflyer.internal.AFk1pSDK;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class AFd1pSDK
extends HashMap {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFAdRevenueData = 0;
    private static int component3 = 1;
    private static char[] getMediationNetwork;
    private static int[] getMonetizationNetwork;
    private final Map getCurrencyIso4217Code;
    private final Context getRevenue;

    static {
        AFd1pSDK.getRevenue();
        TextUtils.getOffsetAfter((CharSequence)"", (int)0);
        Color.green((int)0);
        ExpandableListView.getPackedPositionGroup((long)0L);
        View.MeasureSpec.getMode((int)0);
        AFAdRevenueData = (component3 + 33) % 128;
    }

    public AFd1pSDK(Map object, Context object2) {
        this.getCurrencyIso4217Code = object;
        this.getRevenue = object2;
        object = this.AFAdRevenueData();
        object2 = this.getMonetizationNetwork();
        ((AbstractMap)this).put(object, object2);
    }

    /*
     * Exception decompiling
     */
    private String AFAdRevenueData() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 28[TRYBLOCK] [28 : 350->353)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static void a(String string2, boolean bl2, int[] nArray, Object[] objectArray) {
        void var23_28;
        void var23_26;
        int n3;
        Object object;
        Object object2 = string2;
        if (string2 != null) {
            object = "ISO-8859-1";
            object2 = string2.getBytes((String)object);
        }
        object2 = (byte[])object2;
        object = new AFk1oSDK();
        int n4 = nArray[0];
        int n7 = 1;
        int n8 = nArray[n7];
        int n10 = 2;
        int n14 = nArray[n10];
        int n15 = nArray[3];
        char[] cArray = getMediationNetwork;
        if (cArray != null) {
            void var16_18;
            char[] cArray2;
            int n16 = $11 + 19;
            $10 = n3 = n16 % 128;
            if ((n16 %= n10) != 0) {
                n16 = cArray.length;
                cArray2 = new char[n16];
                boolean bl3 = true;
            } else {
                n16 = cArray.length;
                cArray2 = new char[n16];
                boolean bl4 = false;
            }
            while (var16_18 < n16) {
                char c2;
                long l2 = cArray[var16_18];
                long l3 = 740144413554588574L;
                int n17 = (int)(l2 ^= l3);
                cArray2[var16_18] = c2 = (char)n17;
                ++var16_18;
            }
            cArray = cArray2;
        }
        char[] cArray3 = new char[n8];
        System.arraycopy(cArray, n4, cArray3, 0, n8);
        if (object2 != null) {
            $10 = n4 = ($11 + 49) % 128;
            char[] cArray4 = new char[n8];
            ((AFk1oSDK)object).getCurrencyIso4217Code = 0;
            int n18 = 0;
            cArray = null;
            while ((n3 = ((AFk1oSDK)object).getCurrencyIso4217Code) < n8) {
                Object object3 = object2[n3];
                if (object3 == n7) {
                    object3 = cArray3[n3] * 2 + n7 - n18;
                    cArray4[n3] = n18 = (int)((char)object3);
                    $11 = n18 = ($10 + 61) % 128;
                } else {
                    object3 = cArray3[n3] * 2 - n18;
                    cArray4[n3] = n18 = (int)((char)object3);
                }
                n18 = cArray4[n3];
                ((AFk1oSDK)object).getCurrencyIso4217Code = ++n3;
            }
            char[] cArray5 = cArray4;
        }
        if (n15 > 0) {
            object2 = new char[n8];
            System.arraycopy(var23_26, 0, object2, 0, n8);
            n4 = n8 - n15;
            System.arraycopy(object2, 0, var23_26, n4, n15);
            System.arraycopy(object2, n15, var23_26, 0, n4);
        }
        if (bl2) {
            object2 = new char[n8];
            ((AFk1oSDK)object).getCurrencyIso4217Code = 0;
            while ((n4 = ((AFk1oSDK)object).getCurrencyIso4217Code) < n8) {
                n15 = n8 - n4 - n7;
                n15 = var23_26[n15];
                object2[n4] = n15;
                ((AFk1oSDK)object).getCurrencyIso4217Code = ++n4;
            }
            Object object4 = object2;
        }
        if (n14 > 0) {
            int n19;
            ((AFk1oSDK)object).getCurrencyIso4217Code = 0;
            while ((n19 = ((AFk1oSDK)object).getCurrencyIso4217Code) < n8) {
                n4 = $10 + 9;
                $11 = n7 = n4 % 128;
                if ((n4 %= n10) == 0) {
                    n4 = var23_28[n19];
                    n14 = nArray[n10];
                    var23_28[n19] = n4 = (int)((char)(n4 * n14));
                    n19 += -1;
                } else {
                    n4 = var23_28[n19];
                    n14 = nArray[n10];
                    var23_28[n19] = n4 = (int)((char)(n4 - n14));
                }
                ((AFk1oSDK)object).getCurrencyIso4217Code = ++n19;
                $10 = n7 = (n7 + 77) % 128;
            }
        }
        objectArray[0] = object2 = new String((char[])var23_28);
    }

    private static void b(int[] nArray, int n3, Object[] objectArray) {
        int n4;
        int n7;
        int n8;
        int n10;
        int[] nArray2;
        Object object = nArray;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        int n14 = 4;
        char[] cArray = new char[n14];
        int n15 = nArray.length;
        int n16 = 2;
        char[] cArray2 = new char[n15 *= 2];
        int[] nArray3 = getMonetizationNetwork;
        long l2 = 7040698834646313678L;
        if (nArray3 != null) {
            int n17 = nArray3.length;
            nArray2 = new int[n17];
            for (n10 = 0; n10 < n17; ++n10) {
                n8 = nArray3[n10];
                long l3 = (long)n8 ^ l2;
                nArray2[n10] = n7 = (int)l3;
            }
            nArray3 = nArray2;
        }
        int n18 = nArray3.length;
        int[] nArray4 = new int[n18];
        nArray2 = getMonetizationNetwork;
        if (nArray2 != null) {
            $10 = ($11 + 65) % 128;
            n10 = nArray2.length;
            int[] nArray5 = new int[n10];
            for (n7 = 0; n7 < n10; ++n7) {
                int n19;
                int n20;
                long l4 = (long)nArray2[n7] ^ l2;
                nArray5[n7] = n20 = (int)l4;
                $10 = n19 = ($11 + 79) % 128;
            }
            nArray2 = nArray5;
        }
        System.arraycopy(nArray2, 0, nArray4, 0, n18);
        aFk1pSDK.AFAdRevenueData = 0;
        while ((n18 = aFk1pSDK.AFAdRevenueData) < (n4 = ((int[])object).length)) {
            int n21;
            $11 = ($10 + 101) % 128;
            n4 = object[n18];
            cArray[0] = n21 = (int)(n4 >> 16);
            n4 = (char)n4;
            int n22 = 1;
            cArray[n22] = n4;
            n10 = n18 + 1;
            n10 = object[n10];
            n8 = 16;
            cArray[n16] = n10 = (int)((char)(n10 >> n8));
            ++n18;
            n18 = (char)object[n18];
            n7 = 3;
            cArray[n7] = n18;
            aFk1pSDK.getCurrencyIso4217Code = n21 = (n21 << n8) + n4;
            aFk1pSDK.getMonetizationNetwork = n4 = (n10 << 16) + n18;
            AFk1pSDK.getCurrencyIso4217Code(nArray4);
            nArray3 = null;
            for (n18 = 0; n18 < n8; ++n18) {
                n4 = aFk1pSDK.getCurrencyIso4217Code;
                n21 = nArray4[n18];
                aFk1pSDK.getCurrencyIso4217Code = n4 ^= n21;
                n4 = AFk1pSDK.getRevenue(n4);
                n21 = aFk1pSDK.getMonetizationNetwork;
                n4 ^= n21;
                n21 = aFk1pSDK.getCurrencyIso4217Code;
                aFk1pSDK.getCurrencyIso4217Code = n4;
                aFk1pSDK.getMonetizationNetwork = n21;
            }
            n18 = aFk1pSDK.getCurrencyIso4217Code;
            aFk1pSDK.getCurrencyIso4217Code = n4 = aFk1pSDK.getMonetizationNetwork;
            aFk1pSDK.getMonetizationNetwork = n18;
            n21 = nArray4[n8];
            aFk1pSDK.getMonetizationNetwork = n18 ^= n21;
            n21 = nArray4[17];
            aFk1pSDK.getCurrencyIso4217Code = n4 ^= n21;
            cArray[0] = n21 = (int)((char)(n4 >>> 16));
            cArray[n22] = n4 = (int)((char)n4);
            cArray[n16] = n4 = (int)((char)(n18 >>> 16));
            cArray[n7] = n18 = (int)((char)n18);
            AFk1pSDK.getCurrencyIso4217Code(nArray4);
            n18 = aFk1pSDK.AFAdRevenueData;
            n4 = n18 * 2;
            cArray2[n4] = n21 = cArray[0];
            n4 = n18 * 2 + n22;
            cArray2[n4] = n21 = cArray[n22];
            n4 = n18 * 2 + n16;
            cArray2[n4] = n21 = cArray[n16];
            n4 = n18 * 2 + n7;
            cArray2[n4] = n21 = cArray[n7];
            aFk1pSDK.AFAdRevenueData = n18 += n16;
        }
        object = new String;
        object(cArray2, 0, n3);
        objectArray[0] = object;
    }

    /*
     * Exception decompiling
     */
    private String getMonetizationNetwork() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 61[TRYBLOCK] [64 : 1106->1110)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static StringBuilder getMonetizationNetwork(String ... stringArray) {
        int n3;
        Serializable serializable = new ArrayList();
        int cfr_ignored_0 = stringArray.length;
        StringBuilder stringBuilder = null;
        for (int i3 = 0; i3 < (n3 = 3); ++i3) {
            n3 = stringArray[i3].length();
            Integer n4 = n3;
            ((ArrayList)serializable).add(n4);
        }
        Collections.sort(serializable);
        serializable = (Integer)((ArrayList)serializable).get(0);
        int n7 = ((Number)serializable).intValue();
        stringBuilder = new StringBuilder();
        for (int i8 = 0; i8 < n7; ++i8) {
            AFAdRevenueData = (component3 + 1) % 128;
            int n8 = 0;
            Object object = null;
            for (int i10 = 0; i10 < n3; ++i10) {
                String string2 = stringArray[i10];
                int n10 = string2.charAt(i8);
                if (object == null) {
                    component3 = n8 = (AFAdRevenueData + 79) % 128;
                } else {
                    n8 = ((Number)object).intValue();
                    n10 ^= n8;
                }
                object = n10;
            }
            n8 = ((Number)object).intValue();
            object = Integer.toHexString(n8);
            stringBuilder.append((String)object);
        }
        return stringBuilder;
    }

    public static void getRevenue() {
        Object[] objectArray;
        char[] cArray = objectArray = new char[219];
        char[] cArray2 = objectArray;
        cArray[0] = 15322;
        cArray2[1] = 15124;
        cArray[2] = 15127;
        cArray2[3] = 15118;
        cArray[4] = 15115;
        cArray2[5] = 15116;
        cArray[6] = 15118;
        cArray2[7] = 15117;
        cArray[8] = 15108;
        cArray2[9] = 15119;
        cArray[10] = 15120;
        cArray2[11] = 15115;
        cArray[12] = 15113;
        cArray2[13] = 15018;
        cArray[14] = 15018;
        cArray2[15] = 15016;
        cArray[16] = 14991;
        cArray2[17] = 14988;
        cArray[18] = 15019;
        cArray2[19] = 15024;
        cArray[20] = 14997;
        cArray2[21] = 14999;
        cArray[22] = 15029;
        cArray2[23] = 15024;
        cArray[24] = 14997;
        cArray2[25] = 14999;
        cArray[26] = 15022;
        cArray2[27] = 15023;
        cArray[28] = 15018;
        cArray2[29] = 15022;
        cArray[30] = 15025;
        cArray2[31] = 15023;
        cArray[32] = 15025;
        cArray2[33] = 15025;
        cArray[34] = 15026;
        cArray2[35] = 14999;
        cArray[36] = 14998;
        cArray2[37] = 15028;
        cArray[38] = 15024;
        cArray2[39] = 15022;
        cArray[40] = 15029;
        cArray2[41] = 15031;
        cArray[42] = 14999;
        cArray2[43] = 14988;
        cArray[44] = 15019;
        cArray2[45] = 14976;
        cArray[46] = 15002;
        cArray2[47] = 14996;
        cArray[48] = 15029;
        cArray2[49] = 15020;
        cArray[50] = 15026;
        cArray2[51] = 14999;
        cArray[52] = 15339;
        cArray2[53] = 15348;
        cArray[54] = 15350;
        cArray2[55] = 15331;
        cArray[56] = 15348;
        cArray2[57] = 15291;
        cArray[58] = 15347;
        cArray2[59] = 15335;
        cArray[60] = 15344;
        cArray2[61] = 15330;
        cArray[62] = 15291;
        cArray2[63] = 15328;
        cArray[64] = 15348;
        cArray2[65] = 15342;
        cArray[66] = 15291;
        cArray2[67] = 15349;
        cArray[68] = 15348;
        cArray2[69] = 15342;
        cArray[70] = 15291;
        cArray2[71] = 15346;
        cArray[72] = 15341;
        cArray2[73] = 15344;
        cArray[74] = 15335;
        cArray2[75] = 15352;
        cArray[76] = 15337;
        cArray2[77] = 15348;
        cArray[78] = 15341;
        cArray2[79] = 15348;
        cArray[80] = 15346;
        cArray2[81] = 15291;
        cArray[82] = 15351;
        cArray2[83] = 15348;
        cArray[84] = 15343;
        cArray2[85] = 15344;
        cArray[86] = 15352;
        cArray2[87] = 15349;
        cArray[88] = 15291;
        cArray2[89] = 15265;
        cArray[90] = 15341;
        cArray2[91] = 15338;
        cArray[92] = 15344;
        cArray2[93] = 15335;
        cArray[94] = 15348;
        cArray2[95] = 15176;
        cArray[96] = 15172;
        cArray2[97] = 15174;
        cArray[98] = 15177;
        cArray2[99] = 15173;
        cArray[100] = 15276;
        cArray2[101] = 15281;
        cArray[102] = 15277;
        cArray2[103] = 15350;
        cArray[104] = 15337;
        cArray2[105] = 15310;
        cArray[106] = 15159;
        cArray2[107] = 15154;
        cArray[108] = 15164;
        cArray2[109] = 15161;
        cArray[110] = 15129;
        cArray2[111] = 15329;
        cArray[112] = 15167;
        cArray2[113] = 15162;
        cArray[114] = 15135;
        cArray2[115] = 15329;
        cArray[116] = 15160;
        cArray2[117] = 15161;
        cArray[118] = 15156;
        cArray2[119] = 15160;
        cArray[120] = 15163;
        cArray2[121] = 15161;
        cArray[122] = 15163;
        cArray2[123] = 15163;
        cArray[124] = 15164;
        cArray2[125] = 15329;
        cArray[126] = 15328;
        cArray2[127] = 15166;
        cArray[128] = 15162;
        cArray2[129] = 15160;
        cArray[130] = 15167;
        cArray2[131] = 15105;
        cArray[132] = 15329;
        cArray2[133] = 15328;
        cArray[134] = 15159;
        cArray2[135] = 15154;
        cArray[136] = 15164;
        cArray2[137] = 15113;
        cArray[138] = 15134;
        cArray2[139] = 15134;
        cArray[140] = 15167;
        cArray2[141] = 15158;
        cArray[142] = 15164;
        cArray2[143] = 15234;
        cArray[144] = 15274;
        cArray2[145] = 15278;
        cArray[146] = 15279;
        cArray2[147] = 15314;
        cArray[148] = 15317;
        cArray2[149] = 15275;
        cArray[150] = 15312;
        cArray2[151] = 15316;
        cArray[152] = 15276;
        cArray2[153] = 15274;
        cArray[154] = 15276;
        cArray2[155] = 15316;
        cArray[156] = 15357;
        cArray2[157] = 15357;
        cArray[158] = 15357;
        cArray2[159] = 15359;
        cArray[160] = 15359;
        cArray2[161] = 15292;
        cArray[162] = 15322;
        cArray2[163] = 15320;
        cArray[164] = 15316;
        cArray2[165] = 15321;
        cArray[166] = 15322;
        cArray2[167] = 15323;
        cArray[168] = 15311;
        cArray2[169] = 15298;
        cArray[170] = 15307;
        cArray2[171] = 15317;
        cArray[172] = 15314;
        cArray2[173] = 15306;
        cArray[174] = 15316;
        cArray2[175] = 15327;
        cArray[176] = 15270;
        cArray2[177] = 15312;
        cArray[178] = 15344;
        cArray2[179] = 15346;
        cArray[180] = 15344;
        cArray2[181] = 15349;
        cArray[182] = 15356;
        cArray2[183] = 15321;
        cArray[184] = 15311;
        cArray2[185] = 15343;
        cArray[186] = 15351;
        cArray2[187] = 15346;
        cArray[188] = 15343;
        cArray2[189] = 15349;
        cArray[190] = 15317;
        cArray2[191] = 15319;
        cArray[192] = 15352;
        cArray2[193] = 15346;
        cArray[194] = 15342;
        cArray2[195] = 15349;
        cArray[196] = 15351;
        cArray2[197] = 15353;
        cArray[198] = 15300;
        cArray2[199] = 15115;
        cArray[200] = 15338;
        cArray2[201] = 15112;
        cArray[202] = 14998;
        cArray2[203] = 15272;
        cArray[204] = 15353;
        cArray2[205] = 15348;
        cArray[206] = 15344;
        cArray2[207] = 15355;
        cArray[208] = 15316;
        cArray2[209] = 15276;
        cArray[210] = 15311;
        cArray2[211] = 15310;
        cArray[212] = 15310;
        cArray2[213] = 15310;
        cArray[214] = 15311;
        cArray2[215] = 15310;
        cArray[216] = 15310;
        cArray2[217] = 15310;
        cArray2[218] = 15317;
        getMediationNetwork = objectArray;
        Object[] objectArray2 = objectArray = (Object[])new int[18];
        Object[] objectArray3 = objectArray;
        objectArray2[0] = -1334944241;
        objectArray3[1] = -2015133716;
        objectArray2[2] = 1811231825;
        objectArray3[3] = -1913690757;
        objectArray2[4] = -174115752;
        objectArray3[5] = 1467114833;
        objectArray2[6] = 1797153774;
        objectArray3[7] = 2026579881;
        objectArray2[8] = 1639262049;
        objectArray3[9] = 1847177514;
        objectArray2[10] = 514793336;
        objectArray3[11] = 368887070;
        objectArray2[12] = 831481797;
        objectArray3[13] = -2035262010;
        objectArray2[14] = -2018931947;
        objectArray3[15] = -1447277916;
        objectArray2[16] = 1856515781;
        objectArray3[17] = -1151882951;
        getMonetizationNetwork = objectArray;
    }
}

