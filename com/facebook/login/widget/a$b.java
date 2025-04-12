/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.login.widget;

public final class a$b
extends Enum {
    private static final /* synthetic */ a$b[] $VALUES;
    public static final /* enum */ a$b BLACK;
    public static final /* enum */ a$b BLUE;

    private static final /* synthetic */ a$b[] $values() {
        a$b a$b = BLUE;
        a$b = BLACK;
        a$b[] a$bArray = new a$b[]{a$b, a$b};
        return a$bArray;
    }

    static {
        a$b a$b;
        BLUE = a$b = new a$b("BLUE", 0);
        BLACK = a$b = new a$b("BLACK", 1);
        $VALUES = a$b.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private a$b() {
        void var2_-1;
        void var1_-1;
    }

    public static a$b valueOf(String string2) {
        return Enum.valueOf(a$b.class, string2);
    }

    public static a$b[] values() {
        return (a$b[])$VALUES.clone();
    }
}

