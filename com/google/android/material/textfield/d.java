/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import com.google.android.material.textfield.ClearTextEndIconDelegate;

public final class d
implements Runnable {
    public final /* synthetic */ ClearTextEndIconDelegate a;

    public /* synthetic */ d(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        this.a = clearTextEndIconDelegate;
    }

    public final void run() {
        ClearTextEndIconDelegate.e(this.a);
    }
}

