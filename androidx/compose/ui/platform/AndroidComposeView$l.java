/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class AndroidComposeView$l
extends FunctionReferenceImpl
implements Function0 {
    public final Object invoke() {
        AndroidComposeView androidComposeView = (AndroidComposeView)this.receiver;
        return androidComposeView.R();
    }
}

