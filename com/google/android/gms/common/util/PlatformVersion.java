/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package com.google.android.gms.common.util;

import android.os.Build;

public final class PlatformVersion {
    private PlatformVersion() {
    }

    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    public static boolean isAtLeastJellyBean() {
        return true;
    }

    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    public static boolean isAtLeastJellyBeanMR2() {
        return true;
    }

    public static boolean isAtLeastKitKat() {
        return true;
    }

    public static boolean isAtLeastKitKatWatch() {
        return true;
    }

    public static boolean isAtLeastLollipop() {
        return true;
    }

    public static boolean isAtLeastLollipopMR1() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 22;
        return n3 >= n4;
    }

    public static boolean isAtLeastM() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        return n3 >= n4;
    }

    public static boolean isAtLeastN() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        return n3 >= n4;
    }

    public static boolean isAtLeastO() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        return n3 >= n4;
    }

    public static boolean isAtLeastP() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        return n3 >= n4;
    }

    public static boolean isAtLeastQ() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        return n3 >= n4;
    }

    public static boolean isAtLeastR() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        return n3 >= n4;
    }

    public static boolean isAtLeastS() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        return n3 >= n4;
    }

    public static boolean isAtLeastSv2() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 32;
        return n3 >= n4;
    }

    public static boolean isAtLeastT() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        return n3 >= n4;
    }

    public static boolean isAtLeastU() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 34;
        return n3 >= n4;
    }

    public static boolean isAtLeastV() {
        boolean bl2 = PlatformVersion.isAtLeastU();
        if (!bl2) {
            return false;
        }
        return tE.b();
    }
}

