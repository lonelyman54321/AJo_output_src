/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.WindowInsets$Companion;
import com.google.accompanist.insets.WindowInsets$Type;

public interface WindowInsets {
    public static final WindowInsets$Companion Companion = WindowInsets$Companion.$$INSTANCE;

    public WindowInsets copy(WindowInsets$Type var1, WindowInsets$Type var2, WindowInsets$Type var3, WindowInsets$Type var4, WindowInsets$Type var5);

    public WindowInsets$Type getDisplayCutout();

    public WindowInsets$Type getIme();

    public WindowInsets$Type getNavigationBars();

    public WindowInsets$Type getStatusBars();

    public WindowInsets$Type getSystemBars();

    public WindowInsets$Type getSystemGestures();
}

