/*
 * Decompiled with CFR 0.152.
 */
package com.facebook;

public final class AccessToken$c {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        F1 f1;
        int n7 = F1.values().length;
        int[] nArray = new int[n7];
        try {
            f1 = F1.FACEBOOK_APPLICATION_WEB;
            n4 = f1.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            f1 = F1.CHROME_CUSTOM_TAB;
            n4 = f1.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            f1 = F1.WEB_VIEW;
            n4 = f1.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

