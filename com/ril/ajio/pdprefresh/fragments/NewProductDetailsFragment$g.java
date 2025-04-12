/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.DisplayMetrics
 */
package com.ril.ajio.pdprefresh.fragments;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.o;
import kotlin.jvm.internal.Intrinsics;

public final class NewProductDetailsFragment$g
extends o {
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        return 0.1f;
    }

    public final int getVerticalSnapPreference() {
        return -1;
    }
}

