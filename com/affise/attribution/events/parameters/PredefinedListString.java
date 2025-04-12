/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.parameters;

import com.affise.attribution.events.parameters.Predefined;
import com.affise.attribution.events.parameters.PredefinedListString$Companion;

public final class PredefinedListString
extends Enum
implements Predefined {
    private static final /* synthetic */ PredefinedListString[] $VALUES;
    public static final /* enum */ PredefinedListString CONTENT_IDS;
    public static final PredefinedListString$Companion Companion;
    private final String value;

    private static final /* synthetic */ PredefinedListString[] $values() {
        PredefinedListString predefinedListString = CONTENT_IDS;
        PredefinedListString[] predefinedListStringArray = new PredefinedListString[]{predefinedListString};
        return predefinedListStringArray;
    }

    static {
        Object object = new PredefinedListString("CONTENT_IDS", 0, "content_ids");
        CONTENT_IDS = object;
        $VALUES = PredefinedListString.$values();
        Companion = object = new PredefinedListString$Companion(null);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private PredefinedListString() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static final /* synthetic */ String access$getValue$p(PredefinedListString predefinedListString) {
        return predefinedListString.value;
    }

    public static final PredefinedListString from(String string2) {
        return Companion.from(string2);
    }

    public static PredefinedListString valueOf(String string2) {
        return Enum.valueOf(PredefinedListString.class, string2);
    }

    public static PredefinedListString[] values() {
        return (PredefinedListString[])$VALUES.clone();
    }

    public String value() {
        StringBuilder stringBuilder = new StringBuilder("affise_p_");
        String string2 = this.value;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

