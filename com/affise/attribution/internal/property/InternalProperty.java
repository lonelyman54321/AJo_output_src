/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.internal.property;

public final class InternalProperty
extends Enum {
    private static final /* synthetic */ InternalProperty[] $VALUES;
    private final String type;

    private static final /* synthetic */ InternalProperty[] $values() {
        return new InternalProperty[0];
    }

    static {
        $VALUES = InternalProperty.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private InternalProperty() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static InternalProperty valueOf(String string2) {
        return Enum.valueOf(InternalProperty.class, string2);
    }

    public static InternalProperty[] values() {
        return (InternalProperty[])$VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }
}

