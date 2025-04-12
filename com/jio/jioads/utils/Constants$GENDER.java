/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.utils;

public final class Constants$GENDER
extends Enum {
    public static final /* enum */ Constants$GENDER FEMALE;
    public static final /* enum */ Constants$GENDER MALE;
    public static final /* enum */ Constants$GENDER OTHER;
    public static final /* synthetic */ Constants$GENDER[] b;
    public static final /* synthetic */ ga0_2 c;
    public final String a;

    static {
        Constants$GENDER constants$GENDER;
        Object object = "MALE";
        MALE = constants$GENDER = new Constants$GENDER(0, object, object);
        int n3 = 1;
        Object object2 = "FEMALE";
        object = new Constants$GENDER(n3, object2, object2);
        FEMALE = object;
        int n4 = 2;
        Enum[] enumArray = "OTHER";
        object2 = new Constants$GENDER(n4, (String)enumArray, (String)enumArray);
        OTHER = object2;
        enumArray = new Constants$GENDER[3];
        enumArray[0] = constants$GENDER;
        enumArray[n3] = object;
        enumArray[n4] = object2;
        b = enumArray;
        c = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public Constants$GENDER() {
        void var3_2;
        void var1_-1;
        void var2_-1;
        this.a = var3_2;
    }

    public static ga0_2 getEntries() {
        return c;
    }

    public static Constants$GENDER valueOf(String string2) {
        return Enum.valueOf(Constants$GENDER.class, string2);
    }

    public static Constants$GENDER[] values() {
        return (Constants$GENDER[])b.clone();
    }

    public final String getValue() {
        return this.a;
    }
}

