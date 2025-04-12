/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class AndroidComposeView$q
extends Lambda
implements Function1 {
    public final /* synthetic */ int c;

    public AndroidComposeView$q(int n3) {
        this.c = n3;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (FocusTargetNode)object;
        int n3 = this.c;
        if ((object = yu0_1.h((FocusTargetNode)object, n3)) != null) {
            bl2 = (Boolean)object;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

