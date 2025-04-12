/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.MutableWindowInsetsType;
import com.google.accompanist.insets.WindowInsets;
import com.google.accompanist.insets.WindowInsets$Type;
import com.google.accompanist.insets.WindowInsetsTypeKt;

public final class RootWindowInsets
implements WindowInsets {
    private final MutableWindowInsetsType displayCutout;
    private final MutableWindowInsetsType ime;
    private final MutableWindowInsetsType navigationBars;
    private final MutableWindowInsetsType statusBars;
    private final WindowInsets$Type systemBars;
    private final MutableWindowInsetsType systemGestures;

    public RootWindowInsets() {
        WindowInsets$Type windowInsets$Type;
        this.systemGestures = windowInsets$Type = new MutableWindowInsetsType();
        this.navigationBars = windowInsets$Type = new MutableWindowInsetsType();
        this.statusBars = windowInsets$Type = new MutableWindowInsetsType();
        this.ime = windowInsets$Type = new MutableWindowInsetsType();
        this.displayCutout = windowInsets$Type = new MutableWindowInsetsType();
        windowInsets$Type = this.getStatusBars();
        MutableWindowInsetsType mutableWindowInsetsType = this.getNavigationBars();
        WindowInsets$Type[] windowInsets$TypeArray = new WindowInsets$Type[]{windowInsets$Type, mutableWindowInsetsType};
        windowInsets$Type = WindowInsetsTypeKt.derivedWindowInsetsTypeOf(windowInsets$TypeArray);
        this.systemBars = windowInsets$Type;
    }

    public final /* synthetic */ WindowInsets copy(WindowInsets$Type windowInsets$Type, WindowInsets$Type windowInsets$Type2, WindowInsets$Type windowInsets$Type3, WindowInsets$Type windowInsets$Type4, WindowInsets$Type windowInsets$Type5) {
        return jg3_2.a(this, windowInsets$Type, windowInsets$Type2, windowInsets$Type3, windowInsets$Type4, windowInsets$Type5);
    }

    public MutableWindowInsetsType getDisplayCutout() {
        return this.displayCutout;
    }

    public MutableWindowInsetsType getIme() {
        return this.ime;
    }

    public MutableWindowInsetsType getNavigationBars() {
        return this.navigationBars;
    }

    public MutableWindowInsetsType getStatusBars() {
        return this.statusBars;
    }

    public WindowInsets$Type getSystemBars() {
        return this.systemBars;
    }

    public MutableWindowInsetsType getSystemGestures() {
        return this.systemGestures;
    }
}

