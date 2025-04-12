/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class AndroidComposeView$k
extends FunctionReferenceImpl
implements Function0 {
    public final Object invoke() {
        AndroidComposeView androidComposeView = (AndroidComposeView)this.receiver;
        boolean bl2 = androidComposeView.isFocused();
        if (bl2 || (bl2 = androidComposeView.hasFocus())) {
            androidComposeView.clearFocus();
        }
        return Unit.a;
    }
}

