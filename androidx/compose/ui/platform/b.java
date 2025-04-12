/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b
extends Lambda
implements Function1 {
    public final /* synthetic */ LT0 c;

    public b(LT0 lT0) {
        this.c = lT0;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (FocusTargetNode)object;
        LT0 lT0 = this.c;
        int n3 = lT0.a;
        boolean bl2 = (object = yu0_1.h((FocusTargetNode)object, n3)) != null ? (Boolean)object : true;
        return bl2;
    }
}

