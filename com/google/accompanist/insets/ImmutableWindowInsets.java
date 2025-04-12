/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.WindowInsets;
import com.google.accompanist.insets.WindowInsets$Type;
import com.google.accompanist.insets.WindowInsets$Type$Companion;
import com.google.accompanist.insets.WindowInsetsTypeKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ImmutableWindowInsets
implements WindowInsets {
    private final WindowInsets$Type displayCutout;
    private final WindowInsets$Type ime;
    private final WindowInsets$Type navigationBars;
    private final WindowInsets$Type statusBars;
    private final WindowInsets$Type systemBars;
    private final WindowInsets$Type systemGestures;

    public ImmutableWindowInsets() {
        this(null, null, null, null, null, 31, null);
    }

    public ImmutableWindowInsets(WindowInsets$Type windowInsets$Type, WindowInsets$Type windowInsets$Type2, WindowInsets$Type windowInsets$TypeArray, WindowInsets$Type windowInsets$Type3, WindowInsets$Type windowInsets$Type4) {
        Intrinsics.checkNotNullParameter(windowInsets$Type, "systemGestures");
        Intrinsics.checkNotNullParameter(windowInsets$Type2, "navigationBars");
        Intrinsics.checkNotNullParameter(windowInsets$TypeArray, "statusBars");
        Intrinsics.checkNotNullParameter(windowInsets$Type3, "ime");
        Intrinsics.checkNotNullParameter(windowInsets$Type4, "displayCutout");
        this.systemGestures = windowInsets$Type;
        this.navigationBars = windowInsets$Type2;
        this.statusBars = windowInsets$TypeArray;
        this.ime = windowInsets$Type3;
        this.displayCutout = windowInsets$Type4;
        windowInsets$Type = this.getStatusBars();
        windowInsets$Type2 = this.getNavigationBars();
        windowInsets$TypeArray = new WindowInsets$Type[]{windowInsets$Type, windowInsets$Type2};
        this.systemBars = windowInsets$Type = WindowInsetsTypeKt.derivedWindowInsetsTypeOf(windowInsets$TypeArray);
    }

    public /* synthetic */ ImmutableWindowInsets(WindowInsets$Type windowInsets$Type, WindowInsets$Type object, WindowInsets$Type windowInsets$Type2, WindowInsets$Type object2, WindowInsets$Type windowInsets$Type3, int n3, DefaultConstructorMarker object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            windowInsets$Type = WindowInsets$Type.Companion.getEmpty();
        }
        if ((n4 = n3 & 2) != 0) {
            object = WindowInsets$Type.Companion.getEmpty();
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object = WindowInsets$Type.Companion;
            windowInsets$Type2 = ((WindowInsets$Type$Companion)object).getEmpty();
        }
        WindowInsets$Type windowInsets$Type4 = windowInsets$Type2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object = WindowInsets$Type.Companion;
            object2 = ((WindowInsets$Type$Companion)object).getEmpty();
        }
        WindowInsets$Type windowInsets$Type5 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object = WindowInsets$Type.Companion;
            windowInsets$Type3 = ((WindowInsets$Type$Companion)object).getEmpty();
        }
        WindowInsets$Type windowInsets$Type6 = windowInsets$Type3;
        object = this;
        windowInsets$Type2 = windowInsets$Type;
        object2 = object3;
        windowInsets$Type3 = windowInsets$Type4;
        object3 = windowInsets$Type6;
        this(windowInsets$Type, (WindowInsets$Type)object2, windowInsets$Type4, windowInsets$Type5, windowInsets$Type6);
    }

    public final /* synthetic */ WindowInsets copy(WindowInsets$Type windowInsets$Type, WindowInsets$Type windowInsets$Type2, WindowInsets$Type windowInsets$Type3, WindowInsets$Type windowInsets$Type4, WindowInsets$Type windowInsets$Type5) {
        return jg3_2.a(this, windowInsets$Type, windowInsets$Type2, windowInsets$Type3, windowInsets$Type4, windowInsets$Type5);
    }

    public WindowInsets$Type getDisplayCutout() {
        return this.displayCutout;
    }

    public WindowInsets$Type getIme() {
        return this.ime;
    }

    public WindowInsets$Type getNavigationBars() {
        return this.navigationBars;
    }

    public WindowInsets$Type getStatusBars() {
        return this.statusBars;
    }

    public WindowInsets$Type getSystemBars() {
        return this.systemBars;
    }

    public WindowInsets$Type getSystemGestures() {
        return this.systemGestures;
    }
}

