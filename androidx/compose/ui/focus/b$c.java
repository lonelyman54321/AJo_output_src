/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class b$c
extends Lambda
implements Function1 {
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ int d;

    public b$c(Ref$ObjectRef ref$ObjectRef, int n3) {
        this.c = ref$ObjectRef;
        this.d = n3;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (FocusTargetNode)object;
        int n3 = this.d;
        object = yu0_1.h((FocusTargetNode)object, n3);
        Ref$ObjectRef ref$ObjectRef = this.c;
        ref$ObjectRef.element = object;
        if (object != null) {
            bl2 = (Boolean)object;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

