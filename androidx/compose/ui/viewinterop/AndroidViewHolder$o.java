/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.viewinterop;

import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.AndroidViewHolder$a;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class AndroidViewHolder$o
extends Lambda
implements Function0 {
    public final /* synthetic */ AndroidViewHolder c;

    public AndroidViewHolder$o(ViewFactoryHolder viewFactoryHolder) {
        this.c = viewFactoryHolder;
        super(0);
    }

    public final Object invoke() {
        Object object;
        AndroidViewHolder androidViewHolder = this.c;
        boolean bl2 = androidViewHolder.e;
        if (bl2 && (bl2 = androidViewHolder.isAttachedToWindow()) && (object = androidViewHolder.getView().getParent()) == androidViewHolder) {
            object = androidViewHolder;
            object = AndroidViewHolder.b((ViewFactoryHolder)androidViewHolder);
            AndroidViewHolder$a androidViewHolder$a = AndroidViewHolder.w;
            Function0 function0 = androidViewHolder.getUpdate();
            ((ch2)object).a(androidViewHolder, androidViewHolder$a, function0);
        }
        return Unit.a;
    }
}

