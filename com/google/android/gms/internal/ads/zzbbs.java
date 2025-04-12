/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.MurmurHash3;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public final class zzbbs {
    public static int zza(String object) {
        String string2 = "UTF-8";
        try {
            object = ((String)object).getBytes(string2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            object = ((String)object).getBytes();
        }
        int n3 = ((Object)object).length;
        return MurmurHash3.murmurhash3_x86_32((byte[])object, 0, n3, 0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static String[] zzb(String object, boolean bl2) {
        int n3;
        int n4;
        if (object == null) {
            return null;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        char[] cArray = ((String)object).toCharArray();
        int n7 = 0;
        String string2 = null;
        int n8 = 0;
        for (int i3 = 0; i3 < (n3 = ((String)object).length()); i3 += n4) {
            block12: {
                block13: {
                    int n10;
                    block10: {
                        block9: {
                            Object object2;
                            block11: {
                                void var1_4;
                                int n14;
                                int n15;
                                block8: {
                                    Character.UnicodeBlock unicodeBlock;
                                    Character.UnicodeBlock unicodeBlock2;
                                    n3 = Character.codePointAt(cArray, i3);
                                    n4 = Character.charCount(n3);
                                    n15 = Character.isLetter(n3);
                                    if (n15 == 0 || (n10 = ((Object)(unicodeBlock2 = Character.UnicodeBlock.of(n3))).equals(unicodeBlock = Character.UnicodeBlock.BOPOMOFO)) == 0 && (n10 = ((Object)unicodeBlock2).equals(unicodeBlock = Character.UnicodeBlock.BOPOMOFO_EXTENDED)) == 0 && (n10 = ((Object)unicodeBlock2).equals(unicodeBlock = Character.UnicodeBlock.CJK_COMPATIBILITY)) == 0 && (n10 = (int)(((Object)unicodeBlock2).equals(unicodeBlock = Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) ? 1 : 0)) == 0 && (n10 = (int)(((Object)unicodeBlock2).equals(unicodeBlock = Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) ? 1 : 0)) == 0 && (n10 = (int)(((Object)unicodeBlock2).equals(unicodeBlock = Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) ? 1 : 0)) == 0 && (n10 = (int)(((Object)unicodeBlock2).equals(unicodeBlock = Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) ? 1 : 0)) == 0 && (n10 = (int)(((Object)unicodeBlock2).equals(unicodeBlock = Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) ? 1 : 0)) == 0 && (n10 = (int)(((Object)unicodeBlock2).equals(unicodeBlock = Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) ? 1 : 0)) == 0 && (n10 = (int)(((Object)unicodeBlock2).equals(unicodeBlock = Character.UnicodeBlock.HANGUL_JAMO) ? 1 : 0)) == 0 && (n10 = (int)(((Object)unicodeBlock2).equals(unicodeBlock = Character.UnicodeBlock.HANGUL_SYLLABLES) ? 1 : 0)) == 0 && (n10 = (int)(((Object)unicodeBlock2).equals(unicodeBlock = Character.UnicodeBlock.HIRAGANA) ? 1 : 0)) == 0 && (n10 = (int)(((Object)unicodeBlock2).equals(unicodeBlock = Character.UnicodeBlock.KATAKANA) ? 1 : 0)) == 0 && (n15 = (int)(((Object)unicodeBlock2).equals(unicodeBlock = Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) ? 1 : 0)) == 0 && (n3 < (n15 = 65382) || n3 > (n15 = (int)((char)-99))) && (n3 < (n15 = (int)((char)-95)) || n3 > (n15 = (int)((char)-36)))) break block8;
                                    if (n7 != 0) {
                                        n7 = i3 - n8;
                                        object2 = new String(cArray, n8, n7);
                                        arrayList.add(object2);
                                    }
                                    string2 = new String(cArray, i3, n4);
                                    arrayList.add(string2);
                                    break block9;
                                }
                                n15 = Character.isLetterOrDigit(n3);
                                n10 = 1;
                                if (n15 != 0 || (n15 = Character.getType(n3)) == (n14 = 6) || (n15 = Character.getType(n3)) == (n14 = 8)) break block10;
                                if (var1_4 == false || (n15 = Character.charCount(n3)) != n10 || (n3 = (int)(object2 = (Object)Character.toChars(n3))[0]) != (n15 = 39)) break block11;
                                if (n10 == n7) break block12;
                                break block13;
                            }
                            if (n7 != 0) {
                                n7 = i3 - n8;
                                object2 = new String(cArray, n8, n7);
                                arrayList.add(object2);
                            }
                        }
                        n7 = 0;
                        string2 = null;
                        continue;
                    }
                    if (n10 == n7) break block12;
                }
                n8 = i3;
            }
            n7 = 1;
        }
        if (n7 != 0) {
            String string3 = new String(cArray, n8, i3 -= n8);
            arrayList.add(string3);
        }
        String[] stringArray = new String[arrayList.size()];
        return arrayList.toArray(stringArray);
    }
}

