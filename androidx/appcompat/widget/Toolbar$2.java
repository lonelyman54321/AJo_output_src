/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import androidx.appcompat.widget.Toolbar;

class Toolbar$2
implements Runnable {
    public final /* synthetic */ Toolbar a;

    public Toolbar$2(Toolbar toolbar) {
        this.a = toolbar;
    }

    public final void run() {
        this.a.showOverflowMenu();
    }
}

