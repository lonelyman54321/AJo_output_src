/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

public final class AndroidComposeView$m
extends MutablePropertyReference0Impl {
    public final Object get() {
        return ((AndroidComposeView)this.receiver).getLayoutDirection();
    }

    public final void set(Object object) {
        AndroidComposeView androidComposeView = (AndroidComposeView)this.receiver;
        object = (bp1_0)((Object)object);
        AndroidComposeView.F(androidComposeView, (bp1_0)((Object)object));
    }
}

