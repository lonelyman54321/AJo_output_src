/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.nodes;

import java.util.Arrays;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.EntitiesData;

public final class Entities$EscapeMode
extends Enum {
    private static final /* synthetic */ Entities$EscapeMode[] $VALUES;
    public static final /* enum */ Entities$EscapeMode base;
    public static final /* enum */ Entities$EscapeMode extended;
    public static final /* enum */ Entities$EscapeMode xhtml;
    private int[] codeKeys;
    private int[] codeVals;
    private String[] nameKeys;
    private String[] nameVals;

    private static /* synthetic */ Entities$EscapeMode[] $values() {
        Entities$EscapeMode entities$EscapeMode = xhtml;
        entities$EscapeMode = base;
        entities$EscapeMode = extended;
        Entities$EscapeMode[] entities$EscapeModeArray = new Entities$EscapeMode[]{entities$EscapeMode, entities$EscapeMode, entities$EscapeMode};
        return entities$EscapeModeArray;
    }

    static {
        Entities$EscapeMode entities$EscapeMode;
        String string2 = EntitiesData.xmlPoints;
        xhtml = entities$EscapeMode = new Entities$EscapeMode("xhtml", 0, string2, 4);
        string2 = EntitiesData.basePoints;
        base = entities$EscapeMode = new Entities$EscapeMode("base", 1, string2, 106);
        string2 = EntitiesData.fullPoints;
        extended = entities$EscapeMode = new Entities$EscapeMode("extended", 2, string2, 2125);
        $VALUES = Entities$EscapeMode.$values();
    }

    /*
     * WARNING - void declaration
     */
    private Entities$EscapeMode() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        Entities.access$000(this, (String)var3_2, (int)var4_1);
    }

    public static /* synthetic */ String[] access$100(Entities$EscapeMode entities$EscapeMode) {
        return entities$EscapeMode.nameKeys;
    }

    public static /* synthetic */ String[] access$102(Entities$EscapeMode entities$EscapeMode, String[] stringArray) {
        entities$EscapeMode.nameKeys = stringArray;
        return stringArray;
    }

    public static /* synthetic */ int[] access$200(Entities$EscapeMode entities$EscapeMode) {
        return entities$EscapeMode.codeVals;
    }

    public static /* synthetic */ int[] access$202(Entities$EscapeMode entities$EscapeMode, int[] nArray) {
        entities$EscapeMode.codeVals = nArray;
        return nArray;
    }

    public static /* synthetic */ int[] access$300(Entities$EscapeMode entities$EscapeMode) {
        return entities$EscapeMode.codeKeys;
    }

    public static /* synthetic */ int[] access$302(Entities$EscapeMode entities$EscapeMode, int[] nArray) {
        entities$EscapeMode.codeKeys = nArray;
        return nArray;
    }

    public static /* synthetic */ String[] access$400(Entities$EscapeMode entities$EscapeMode) {
        return entities$EscapeMode.nameVals;
    }

    public static /* synthetic */ String[] access$402(Entities$EscapeMode entities$EscapeMode, String[] stringArray) {
        entities$EscapeMode.nameVals = stringArray;
        return stringArray;
    }

    private int size() {
        return this.nameKeys.length;
    }

    public static Entities$EscapeMode valueOf(String string2) {
        return Enum.valueOf(Entities$EscapeMode.class, string2);
    }

    public static Entities$EscapeMode[] values() {
        return (Entities$EscapeMode[])$VALUES.clone();
    }

    public int codepointForName(String string2) {
        Object[] objectArray = this.nameKeys;
        Object object = Arrays.binarySearch(objectArray, string2);
        if (object >= 0) {
            objectArray = this.codeVals;
            object = objectArray[object];
        } else {
            object = -1;
        }
        return object;
    }

    public String nameForCodepoint(int n3) {
        int[] nArray = this.codeKeys;
        int n4 = Arrays.binarySearch(nArray, n3);
        if (n4 >= 0) {
            int n7;
            int[] nArray2;
            String[] stringArray = this.nameVals;
            int n8 = stringArray.length + -1;
            String string2 = n4 < n8 && (n8 = (nArray2 = this.codeKeys)[n7 = n4 + 1]) == n3 ? stringArray[n7] : stringArray[n4];
            return string2;
        }
        return "";
    }
}

