/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdprefresh.fragments;

public final class NewProductDetailsFragment$a$a
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ NewProductDetailsFragment$a$a[] $VALUES;
    public static final /* enum */ NewProductDetailsFragment$a$a FullScreen;
    public static final /* enum */ NewProductDetailsFragment$a$a HalfCard;
    public static final /* enum */ NewProductDetailsFragment$a$a NavigateBack;

    private static final /* synthetic */ NewProductDetailsFragment$a$a[] $values() {
        NewProductDetailsFragment$a$a newProductDetailsFragment$a$a = HalfCard;
        newProductDetailsFragment$a$a = FullScreen;
        newProductDetailsFragment$a$a = NavigateBack;
        NewProductDetailsFragment$a$a[] newProductDetailsFragment$a$aArray = new NewProductDetailsFragment$a$a[]{newProductDetailsFragment$a$a, newProductDetailsFragment$a$a, newProductDetailsFragment$a$a};
        return newProductDetailsFragment$a$aArray;
    }

    static {
        Enum[] enumArray = new NewProductDetailsFragment$a$a("HalfCard", 0);
        HalfCard = enumArray;
        enumArray = new NewProductDetailsFragment$a$a("FullScreen", 1);
        FullScreen = enumArray;
        enumArray = new NewProductDetailsFragment$a$a("NavigateBack", 2);
        NavigateBack = enumArray;
        enumArray = NewProductDetailsFragment$a$a.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NewProductDetailsFragment$a$a() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static NewProductDetailsFragment$a$a valueOf(String string2) {
        return Enum.valueOf(NewProductDetailsFragment$a$a.class, string2);
    }

    public static NewProductDetailsFragment$a$a[] values() {
        return (NewProductDetailsFragment$a$a[])$VALUES.clone();
    }
}

