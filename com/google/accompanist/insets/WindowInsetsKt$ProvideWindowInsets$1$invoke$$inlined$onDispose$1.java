/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.ViewWindowInsetObserver;

public final class WindowInsetsKt$ProvideWindowInsets$1$invoke$$inlined$onDispose$1
implements Cr0 {
    final /* synthetic */ ViewWindowInsetObserver $observer$inlined;

    public WindowInsetsKt$ProvideWindowInsets$1$invoke$$inlined$onDispose$1(ViewWindowInsetObserver viewWindowInsetObserver) {
        this.$observer$inlined = viewWindowInsetObserver;
    }

    public void dispose() {
        this.$observer$inlined.stop();
    }
}

