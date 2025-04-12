/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.parameters;

import com.affise.attribution.events.parameters.Predefined;
import com.affise.attribution.events.parameters.PredefinedListObject$Companion;

public final class PredefinedListObject
extends Enum
implements Predefined {
    private static final /* synthetic */ PredefinedListObject[] $VALUES;
    public static final /* enum */ PredefinedListObject CONTENT_LIST;
    public static final PredefinedListObject$Companion Companion;
    private final String value;

    private static final /* synthetic */ PredefinedListObject[] $values() {
        PredefinedListObject predefinedListObject = CONTENT_LIST;
        PredefinedListObject[] predefinedListObjectArray = new PredefinedListObject[]{predefinedListObject};
        return predefinedListObjectArray;
    }

    static {
        Object object = new PredefinedListObject("CONTENT_LIST", 0, "content_list");
        CONTENT_LIST = object;
        $VALUES = PredefinedListObject.$values();
        Companion = object = new PredefinedListObject$Companion(null);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private PredefinedListObject() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static final /* synthetic */ String access$getValue$p(PredefinedListObject predefinedListObject) {
        return predefinedListObject.value;
    }

    public static final PredefinedListObject from(String string2) {
        return Companion.from(string2);
    }

    public static PredefinedListObject valueOf(String string2) {
        return Enum.valueOf(PredefinedListObject.class, string2);
    }

    public static PredefinedListObject[] values() {
        return (PredefinedListObject[])$VALUES.clone();
    }

    public String value() {
        StringBuilder stringBuilder = new StringBuilder("affise_p_");
        String string2 = this.value;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

