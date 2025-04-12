/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.common;

import com.google.zxing.FormatException;
import java.util.HashMap;
import java.util.Map;

public final class CharacterSetECI
extends Enum {
    private static final /* synthetic */ CharacterSetECI[] $VALUES;
    public static final /* enum */ CharacterSetECI ASCII;
    public static final /* enum */ CharacterSetECI Big5;
    public static final /* enum */ CharacterSetECI Cp1250;
    public static final /* enum */ CharacterSetECI Cp1251;
    public static final /* enum */ CharacterSetECI Cp1252;
    public static final /* enum */ CharacterSetECI Cp1256;
    public static final /* enum */ CharacterSetECI Cp437;
    public static final /* enum */ CharacterSetECI EUC_KR;
    public static final /* enum */ CharacterSetECI GB18030;
    public static final /* enum */ CharacterSetECI ISO8859_1;
    public static final /* enum */ CharacterSetECI ISO8859_10;
    public static final /* enum */ CharacterSetECI ISO8859_11;
    public static final /* enum */ CharacterSetECI ISO8859_13;
    public static final /* enum */ CharacterSetECI ISO8859_14;
    public static final /* enum */ CharacterSetECI ISO8859_15;
    public static final /* enum */ CharacterSetECI ISO8859_16;
    public static final /* enum */ CharacterSetECI ISO8859_2;
    public static final /* enum */ CharacterSetECI ISO8859_3;
    public static final /* enum */ CharacterSetECI ISO8859_4;
    public static final /* enum */ CharacterSetECI ISO8859_5;
    public static final /* enum */ CharacterSetECI ISO8859_6;
    public static final /* enum */ CharacterSetECI ISO8859_7;
    public static final /* enum */ CharacterSetECI ISO8859_8;
    public static final /* enum */ CharacterSetECI ISO8859_9;
    private static final Map NAME_TO_ECI;
    public static final /* enum */ CharacterSetECI SJIS;
    public static final /* enum */ CharacterSetECI UTF8;
    public static final /* enum */ CharacterSetECI UnicodeBigUnmarked;
    private static final Map VALUE_TO_ECI;
    private final String[] otherEncodingNames;
    private final int[] values;

    static {
        Object object;
        CharacterSetECI characterSetECI;
        CharacterSetECI characterSetECI2;
        int n3 = 2;
        Object object2 = new int[]{0, n3};
        Object object3 = new String[]{};
        CharacterSetECI[] characterSetECIArray = new CharacterSetECI("Cp437", 0, (int[])object2, object3);
        Cp437 = characterSetECIArray;
        object2 = (Object)new CharacterSetECI;
        int n4 = 1;
        int n7 = 3;
        Object object4 = new int[]{n4, n7};
        Object object5 = new String[]{"ISO-8859-1"};
        object2("ISO8859_1", n4, object4, object5);
        ISO8859_1 = (CharacterSetECI)((Object)object2);
        object4 = (Object)new CharacterSetECI;
        object5 = new String[]{"ISO-8859-2"};
        int n8 = 4;
        object4("ISO8859_2", n3, n8, object5);
        ISO8859_2 = (CharacterSetECI)((Object)object4);
        Object object6 = new String[]{"ISO-8859-3"};
        int n10 = 5;
        ISO8859_3 = object5 = new CharacterSetECI("ISO8859_3", n7, n10, object6);
        Object object7 = new String[]{"ISO-8859-4"};
        int n14 = 6;
        ISO8859_4 = object6 = new CharacterSetECI("ISO8859_4", n8, n14, object7);
        Object object8 = new String[]{"ISO-8859-5"};
        int n15 = 7;
        ISO8859_5 = object7 = new CharacterSetECI("ISO8859_5", n10, n15, object8);
        Object object9 = new String[]{"ISO-8859-6"};
        n8 = 8;
        ISO8859_6 = object8 = new CharacterSetECI("ISO8859_6", n14, n8, object9);
        object9 = new String[]{"ISO-8859-7"};
        n7 = 9;
        ISO8859_7 = characterSetECI2 = new CharacterSetECI("ISO8859_7", n15, n7, object9);
        object9 = new String[]{"ISO-8859-8"};
        n3 = 10;
        ISO8859_8 = characterSetECI = new CharacterSetECI("ISO8859_8", n8, n3, object9);
        Object object10 = new String[]{"ISO-8859-9"};
        n4 = 11;
        ISO8859_9 = object9 = new CharacterSetECI("ISO8859_9", n7, n4, object10);
        object10 = new String[]{"ISO-8859-10"};
        Object object11 = new CharacterSetECI("ISO8859_10", n3, 12, object10);
        ISO8859_10 = object11;
        object10 = new String[]{"ISO-8859-11"};
        Object object12 = new CharacterSetECI("ISO8859_11", n4, 13, object10);
        ISO8859_11 = object12;
        object10 = new String[]{"ISO-8859-13"};
        String[] stringArray = object12;
        Object object13 = new CharacterSetECI("ISO8859_13", 12, 15, object10);
        ISO8859_13 = object13;
        object12 = new String[]{"ISO-8859-14"};
        String[] stringArray2 = object13;
        ISO8859_14 = object3 = new CharacterSetECI("ISO8859_14", 13, 16, (String[])object12);
        object12 = new String[]{"ISO-8859-15"};
        Object object14 = object3;
        object13 = new CharacterSetECI("ISO8859_15", 14, 17, (String[])object12);
        ISO8859_15 = object13;
        object10 = new String[]{"ISO-8859-16"};
        String[] stringArray3 = object13;
        object12 = new CharacterSetECI("ISO8859_16", 15, 18, object10);
        ISO8859_16 = object12;
        object13 = new String[]{"Shift_JIS"};
        String[] stringArray4 = object12;
        Object object15 = new CharacterSetECI("SJIS", 16, 20, object13);
        SJIS = object15;
        object12 = new String[]{"windows-1250"};
        String[] stringArray5 = object15;
        Cp1250 = object13 = new CharacterSetECI("Cp1250", 17, 21, (String[])object12);
        object12 = new String[]{"windows-1251"};
        Object object16 = object13;
        object15 = new CharacterSetECI("Cp1251", 18, 22, (String[])object12);
        Cp1251 = object15;
        object12 = new String[]{"windows-1252"};
        String[] stringArray6 = object15;
        Cp1252 = object13 = new CharacterSetECI("Cp1252", 19, 23, (String[])object12);
        object12 = new String[]{"windows-1256"};
        Object object17 = object13;
        Cp1256 = object3 = new CharacterSetECI("Cp1256", 20, 24, (String[])object12);
        object12 = new String[]{"UTF-16BE", "UnicodeBig"};
        Object object18 = object3;
        UnicodeBigUnmarked = object13 = new CharacterSetECI("UnicodeBigUnmarked", 21, 25, (String[])object12);
        object12 = new String[]{"UTF-8"};
        Object object19 = object13;
        UTF8 = object3 = new CharacterSetECI("UTF8", 22, 26, (String[])object12);
        n7 = 27;
        object12 = new int[]{n7, 170};
        object10 = new String[]{"US-ASCII"};
        Object object20 = object3;
        ASCII = object13 = new CharacterSetECI("ASCII", 23, (int[])object12, object10);
        object15 = new CharacterSetECI("Big5", 24, 28);
        Big5 = object15;
        object10 = "GBK";
        String[] stringArray7 = object15;
        object15 = new String[]{"GB2312", "EUC_CN", object10};
        String[] stringArray8 = object13;
        GB18030 = object3 = new CharacterSetECI("GB18030", 25, 29, object15);
        object13 = new String[]{"EUC-KR"};
        object12 = "EUC_KR";
        n15 = 30;
        Object object21 = object3;
        EUC_KR = object15 = new CharacterSetECI((String)object12, 26, n15, object13);
        object13 = new CharacterSetECI[27];
        n4 = 0;
        object3 = null;
        object13[0] = characterSetECIArray;
        object13[1] = (String)object2;
        object13[2] = (String)object4;
        object13[3] = object5;
        object13[4] = object6;
        object13[5] = object7;
        object13[6] = object8;
        object13[7] = characterSetECI2;
        object13[8] = characterSetECI;
        object13[9] = object9;
        object13[10] = object11;
        object13[11] = stringArray;
        object13[12] = stringArray2;
        object13[13] = object14;
        object13[14] = stringArray3;
        object13[15] = stringArray4;
        object13[16] = stringArray5;
        object13[17] = object16;
        object13[18] = stringArray6;
        object13[19] = object17;
        object13[20] = object18;
        object13[21] = object19;
        object13[22] = object20;
        object13[23] = stringArray8;
        object13[24] = stringArray7;
        object13[25] = object21;
        int n16 = 26;
        object13[n16] = object15;
        $VALUES = object13;
        characterSetECIArray = new HashMap();
        VALUE_TO_ECI = characterSetECIArray;
        characterSetECIArray = new HashMap();
        NAME_TO_ECI = characterSetECIArray;
        characterSetECIArray = CharacterSetECI.values();
        int n17 = characterSetECIArray.length;
        object13 = null;
        for (n3 = 0; n3 < n17; n3 += object) {
            int n18;
            object2 = (Object)characterSetECIArray[n3];
            object12 = ((CharacterSetECI)((Object)object2)).values;
            int n19 = ((String[])object12).length;
            object5 = null;
            for (n18 = 0; n18 < n19; n18 += object) {
                object = object12[n18];
                object11 = VALUE_TO_ECI;
                object6 = (int)object;
                object11.put(object6, object2);
                object = true;
            }
            object12 = NAME_TO_ECI;
            object4 = ((Enum)object2).name();
            object12.put(object4, object2);
            object12 = ((CharacterSetECI)((Object)object2)).otherEncodingNames;
            n19 = ((Object)object12).length;
            object5 = null;
            for (n18 = 0; n18 < n19; n18 += object) {
                object6 = object12[n18];
                object11 = NAME_TO_ECI;
                object11.put(object6, object2);
                object = true;
            }
            object = true;
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CharacterSetECI() {
        void var2_-1;
        void var1_-1;
        void var3_3;
        int[] nArray = new int[]{var3_3};
        String[] stringArray = new String[]{};
        this((String)var1_-1, (int)var2_-1, nArray, stringArray);
    }

    /*
     * WARNING - void declaration
     */
    private CharacterSetECI() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        int[] nArray = new int[]{var3_2};
        this.values = nArray;
        this.otherEncodingNames = var4_1;
    }

    /*
     * WARNING - void declaration
     */
    private CharacterSetECI() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.values = var3_2;
        this.otherEncodingNames = var4_1;
    }

    public static CharacterSetECI getCharacterSetECIByName(String string2) {
        return (CharacterSetECI)((Object)NAME_TO_ECI.get(string2));
    }

    public static CharacterSetECI getCharacterSetECIByValue(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = 900)) {
            Map map2 = VALUE_TO_ECI;
            Integer n7 = n3;
            return (CharacterSetECI)((Object)map2.get(n7));
        }
        throw FormatException.getFormatInstance();
    }

    public static CharacterSetECI valueOf(String string2) {
        return Enum.valueOf(CharacterSetECI.class, string2);
    }

    public static CharacterSetECI[] values() {
        return (CharacterSetECI[])$VALUES.clone();
    }

    public int getValue() {
        return this.values[0];
    }
}

