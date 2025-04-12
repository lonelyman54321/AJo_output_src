/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.viewinterop;

import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import androidx.compose.ui.viewinterop.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class AndroidViewHolder$i
extends Lambda
implements Function1 {
    public final /* synthetic */ AndroidViewHolder c;
    public final /* synthetic */ xp1_0 d;

    public AndroidViewHolder$i(ViewFactoryHolder viewFactoryHolder, xp1_0 xp1_02) {
        this.c = viewFactoryHolder;
        this.d = xp1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (zp1)object;
        object = this.d;
        AndroidViewHolder androidViewHolder = this.c;
        a.a((ViewFactoryHolder)androidViewHolder, (xp1_0)object);
        androidViewHolder.c.z();
        return Unit.a;
    }
}

