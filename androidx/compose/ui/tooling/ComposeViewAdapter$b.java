/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.tooling;

import androidx.compose.ui.tooling.ComposeViewAdapter;
import androidx.lifecycle.i;

public final class ComposeViewAdapter$b
implements h82_0 {
    public final d82_0 a;
    public final /* synthetic */ ComposeViewAdapter b;

    public ComposeViewAdapter$b(ComposeViewAdapter object) {
        this.b = object;
        super(null);
        this.a = object;
    }

    public final i getLifecycle() {
        return this.b.r.a;
    }

    public final d82_0 getOnBackPressedDispatcher() {
        return this.a;
    }
}

