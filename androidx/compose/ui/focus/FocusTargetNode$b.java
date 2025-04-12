/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class FocusTargetNode$b
extends Lambda
implements Function0 {
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ FocusTargetNode d;

    public FocusTargetNode$b(Ref$ObjectRef ref$ObjectRef, FocusTargetNode focusTargetNode) {
        this.c = ref$ObjectRef;
        this.d = focusTargetNode;
        super(0);
    }

    public final Object invoke() {
        ju0_0 ju0_02 = this.d.r1();
        this.c.element = ju0_02;
        return Unit.a;
    }
}

