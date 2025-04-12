/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.Window
 */
package com.google.android.material.internal;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.color.MaterialColors;

public class EdgeToEdgeUtils {
    private static final int EDGE_TO_EDGE_BAR_ALPHA = 128;

    private EdgeToEdgeUtils() {
    }

    public static void applyEdgeToEdge(Window window, boolean bl2) {
        EdgeToEdgeUtils.applyEdgeToEdge(window, bl2, null, null);
    }

    public static void applyEdgeToEdge(Window window, boolean bl2, Integer n3, Integer n4) {
        int n7;
        Integer n8;
        int n10;
        Integer n14;
        int n15 = 0;
        int n16 = 1;
        n10 = n14 != null && (n10 = n14.intValue()) != 0 ? 0 : 1;
        if (n8 == null || (n7 = n8.intValue()) == 0) {
            n15 = 1;
        }
        if (n10 != 0 || n15 != 0) {
            Context context = window.getContext();
            n7 = 0x1010031;
            int n17 = -16777216;
            n16 = MaterialColors.getColor(context, n7, n17);
            if (n10 != 0) {
                n14 = n16;
            }
            if (n15 != 0) {
                n8 = n16;
            }
        }
        n15 = bl2 ^ 1;
        ag3_1.a(window, n15 != 0);
        n15 = EdgeToEdgeUtils.getStatusBarColor(window.getContext(), bl2);
        int n18 = EdgeToEdgeUtils.getNavigationBarColor(window.getContext(), bl2);
        window.setStatusBarColor(n15);
        window.setNavigationBarColor(n18);
        boolean bl3 = MaterialColors.isColorLight(n14);
        bl3 = EdgeToEdgeUtils.isUsingLightSystemBar(n15, bl3);
        EdgeToEdgeUtils.setLightStatusBar(window, bl3);
        bl3 = MaterialColors.isColorLight(n8);
        boolean bl4 = EdgeToEdgeUtils.isUsingLightSystemBar(n18, bl3);
        EdgeToEdgeUtils.setLightNavigationBar(window, bl4);
    }

    private static int getNavigationBarColor(Context context, boolean bl2) {
        int n3;
        int n4;
        int n7 = -16777216;
        int n8 = 16843858;
        if (bl2 && (n4 = Build.VERSION.SDK_INT) < (n3 = 27)) {
            return hZ.i(MaterialColors.getColor(context, n8, n7), 128);
        }
        if (bl2) {
            return 0;
        }
        return MaterialColors.getColor(context, n8, n7);
    }

    private static int getStatusBarColor(Context context, boolean bl2) {
        int n3;
        int n4;
        int n7 = -16777216;
        int n8 = 16843857;
        if (bl2 && (n4 = Build.VERSION.SDK_INT) < (n3 = 23)) {
            return hZ.i(MaterialColors.getColor(context, n8, n7), 128);
        }
        if (bl2) {
            return 0;
        }
        return MaterialColors.getColor(context, n8, n7);
    }

    private static boolean isUsingLightSystemBar(int n3, boolean bl2) {
        boolean bl3 = MaterialColors.isColorLight(n3);
        n3 = !(bl3 || n3 == 0 && bl2) ? 0 : 1;
        return n3 != 0;
    }

    public static void setLightNavigationBar(Window window, boolean bl2) {
        Object object = window.getDecorView();
        c93 c932 = new c93((View)object);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 35;
        object = n3 >= n4 ? new UG3$d(window, c932) : (n3 >= (n4 = 30) ? new UG3$d(window, c932) : (n3 >= (n4 = 26) ? new UG3$a(window, c932) : (n3 >= (n4 = 23) ? new UG3$a(window, c932) : new UG3$a(window, c932))));
        ((UG3$g)object).e(bl2);
    }

    public static void setLightStatusBar(Window window, boolean bl2) {
        Object object = window.getDecorView();
        c93 c932 = new c93((View)object);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 35;
        object = n3 >= n4 ? new UG3$d(window, c932) : (n3 >= (n4 = 30) ? new UG3$d(window, c932) : (n3 >= (n4 = 26) ? new UG3$a(window, c932) : (n3 >= (n4 = 23) ? new UG3$a(window, c932) : new UG3$a(window, c932))));
        ((UG3$g)object).f(bl2);
    }
}

