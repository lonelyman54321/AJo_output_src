/*
 * Decompiled with CFR 0.152.
 */
package javax.annotation.meta;

public final class When
extends Enum {
    private static final /* synthetic */ When[] $VALUES;
    public static final /* enum */ When ALWAYS;
    public static final /* enum */ When MAYBE;
    public static final /* enum */ When NEVER;
    public static final /* enum */ When UNKNOWN;

    static {
        When when;
        When when2;
        When when3;
        When when4;
        ALWAYS = when4 = new When("ALWAYS", 0);
        int n3 = 1;
        UNKNOWN = when3 = new When("UNKNOWN", n3);
        int n4 = 2;
        MAYBE = when2 = new When("MAYBE", n4);
        int n7 = 3;
        NEVER = when = new When("NEVER", n7);
        When[] whenArray = new When[4];
        whenArray[0] = when4;
        whenArray[n3] = when3;
        whenArray[n4] = when2;
        whenArray[n7] = when;
        $VALUES = whenArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private When() {
        void var2_-1;
        void var1_-1;
    }

    public static When valueOf(String string2) {
        return Enum.valueOf(When.class, string2);
    }

    public static When[] values() {
        return (When[])$VALUES.clone();
    }
}

