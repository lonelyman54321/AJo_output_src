/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.parameters;

import com.affise.attribution.events.parameters.Predefined;
import com.affise.attribution.events.parameters.PredefinedObject$Companion;

public final class PredefinedObject
extends Enum
implements Predefined {
    private static final /* synthetic */ PredefinedObject[] $VALUES;
    public static final /* enum */ PredefinedObject CONTENT;
    public static final PredefinedObject$Companion Companion;
    private final String value;

    private static final /* synthetic */ PredefinedObject[] $values() {
        PredefinedObject predefinedObject = CONTENT;
        PredefinedObject[] predefinedObjectArray = new PredefinedObject[]{predefinedObject};
        return predefinedObjectArray;
    }

    static {
        Object object = new PredefinedObject("CONTENT", 0, "content");
        CONTENT = object;
        $VALUES = PredefinedObject.$values();
        Companion = object = new PredefinedObject$Companion(null);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private PredefinedObject() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static final /* synthetic */ String access$getValue$p(PredefinedObject predefinedObject) {
        return predefinedObject.value;
    }

    public static final PredefinedObject from(String string2) {
        return Companion.from(string2);
    }

    public static PredefinedObject valueOf(String string2) {
        return Enum.valueOf(PredefinedObject.class, string2);
    }

    public static PredefinedObject[] values() {
        return (PredefinedObject[])$VALUES.clone();
    }

    public String value() {
        StringBuilder stringBuilder = new StringBuilder("affise_p_");
        String string2 = this.value;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

