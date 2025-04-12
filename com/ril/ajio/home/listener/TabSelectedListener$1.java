/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.home.listener;

import com.ril.ajio.home.listener.TabSelectedListener;

class TabSelectedListener$1
implements Runnable {
    public final /* synthetic */ TabSelectedListener a;

    public TabSelectedListener$1(TabSelectedListener tabSelectedListener) {
        this.a = tabSelectedListener;
    }

    public final void run() {
        this.a.b();
    }
}

