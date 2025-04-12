/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.sidesheet;

import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.sidesheet.SheetCallback;

interface Sheet
extends MaterialBackHandler {
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 0;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;

    public void addCallback(SheetCallback var1);

    public int getState();

    public void removeCallback(SheetCallback var1);

    public void setState(int var1);
}

