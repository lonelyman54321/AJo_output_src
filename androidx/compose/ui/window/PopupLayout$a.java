/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.window;

import androidx.compose.ui.window.PopupLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class PopupLayout$a
extends Lambda
implements Function1 {
    public static final PopupLayout$a c;

    static {
        PopupLayout$a popupLayout$a;
        c = popupLayout$a = new Lambda(1);
    }

    public final Object invoke(Object object) {
        boolean bl2 = (object = (PopupLayout)((Object)object)).isAttachedToWindow();
        if (bl2) {
            ((PopupLayout)((Object)object)).l();
        }
        return Unit.a;
    }
}

