/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.viewinterop;

import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class AndroidViewHolder$n
extends Lambda
implements Function0 {
    public final /* synthetic */ AndroidViewHolder c;

    public AndroidViewHolder$n(ViewFactoryHolder viewFactoryHolder) {
        this.c = viewFactoryHolder;
        super(0);
    }

    public final Object invoke() {
        this.c.getLayoutNode().G();
        return Unit.a;
    }
}

