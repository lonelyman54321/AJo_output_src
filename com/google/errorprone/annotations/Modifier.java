/*
 * Decompiled with CFR 0.152.
 */
package com.google.errorprone.annotations;

public final class Modifier
extends Enum {
    private static final /* synthetic */ Modifier[] $VALUES;
    public static final /* enum */ Modifier ABSTRACT;
    public static final /* enum */ Modifier DEFAULT;
    public static final /* enum */ Modifier FINAL;
    public static final /* enum */ Modifier NATIVE;
    public static final /* enum */ Modifier PRIVATE;
    public static final /* enum */ Modifier PROTECTED;
    public static final /* enum */ Modifier PUBLIC;
    public static final /* enum */ Modifier STATIC;
    public static final /* enum */ Modifier STRICTFP;
    public static final /* enum */ Modifier SYNCHRONIZED;
    public static final /* enum */ Modifier TRANSIENT;
    public static final /* enum */ Modifier VOLATILE;

    private static /* synthetic */ Modifier[] $values() {
        Modifier modifier2 = PUBLIC;
        modifier2 = PROTECTED;
        modifier2 = PRIVATE;
        modifier2 = ABSTRACT;
        modifier2 = DEFAULT;
        modifier2 = STATIC;
        modifier2 = FINAL;
        modifier2 = TRANSIENT;
        modifier2 = VOLATILE;
        modifier2 = SYNCHRONIZED;
        modifier2 = NATIVE;
        modifier2 = STRICTFP;
        Modifier[] modifierArray = new Modifier[]{modifier2, modifier2, modifier2, modifier2, modifier2, modifier2, modifier2, modifier2, modifier2, modifier2, modifier2, modifier2};
        return modifierArray;
    }

    static {
        Modifier modifier2;
        PUBLIC = modifier2 = new Modifier("PUBLIC", 0);
        PROTECTED = modifier2 = new Modifier("PROTECTED", 1);
        PRIVATE = modifier2 = new Modifier("PRIVATE", 2);
        ABSTRACT = modifier2 = new Modifier("ABSTRACT", 3);
        DEFAULT = modifier2 = new Modifier("DEFAULT", 4);
        STATIC = modifier2 = new Modifier("STATIC", 5);
        FINAL = modifier2 = new Modifier("FINAL", 6);
        TRANSIENT = modifier2 = new Modifier("TRANSIENT", 7);
        VOLATILE = modifier2 = new Modifier("VOLATILE", 8);
        SYNCHRONIZED = modifier2 = new Modifier("SYNCHRONIZED", 9);
        NATIVE = modifier2 = new Modifier("NATIVE", 10);
        STRICTFP = modifier2 = new Modifier("STRICTFP", 11);
        $VALUES = Modifier.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Modifier() {
        void var2_-1;
        void var1_-1;
    }

    public static Modifier valueOf(String string2) {
        return Enum.valueOf(Modifier.class, string2);
    }

    public static Modifier[] values() {
        return (Modifier[])$VALUES.clone();
    }
}

