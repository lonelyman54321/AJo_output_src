/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class AndroidComposeView$c
extends Lambda
implements Function1 {
    public final /* synthetic */ AndroidComposeView c;

    public AndroidComposeView$c(AndroidComposeView androidComposeView) {
        this.c = androidComposeView;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Vh1)object;
        int n3 = ((Vh1)object).a;
        boolean bl2 = false;
        int n4 = 1;
        int n7 = n3 == n4 ? 1 : 0;
        AndroidComposeView androidComposeView = this.c;
        if (n7 != 0) {
            bl2 = androidComposeView.isInTouchMode();
        } else {
            n7 = 2;
            if (n3 == n7) {
                n3 = (int)(androidComposeView.isInTouchMode() ? 1 : 0);
                bl2 = n3 != 0 ? androidComposeView.requestFocusFromTouch() : true;
            }
        }
        return bl2;
    }
}

