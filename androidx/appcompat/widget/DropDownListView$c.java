/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.AbsListView
 */
package androidx.appcompat.widget;

import android.widget.AbsListView;

public final class DropDownListView$c {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean bl2) {
        absListView.setSelectedChildViewEnabled(bl2);
    }
}

