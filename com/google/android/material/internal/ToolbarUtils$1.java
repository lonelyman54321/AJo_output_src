/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.internal;

import android.view.View;
import java.util.Comparator;

class ToolbarUtils$1
implements Comparator {
    public int compare(View view, View view2) {
        int n3 = view.getTop();
        int n4 = view2.getTop();
        return n3 - n4;
    }
}

