/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class AndroidComposeView$u
extends Lambda
implements Function0 {
    public final /* synthetic */ AndroidComposeView c;

    public AndroidComposeView$u(AndroidComposeView androidComposeView) {
        this.c = androidComposeView;
        super(0);
    }

    public final Object invoke() {
        return AndroidComposeView.D(this.c);
    }
}

