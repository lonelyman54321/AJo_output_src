/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.viewinterop;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class AndroidViewHolder$e
extends Lambda
implements Function1 {
    public final /* synthetic */ AndroidViewHolder c;

    public AndroidViewHolder$e(ViewFactoryHolder viewFactoryHolder) {
        this.c = viewFactoryHolder;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2 = (object = (sg2_0)object) instanceof AndroidComposeView;
        object = bl2 ? (AndroidComposeView)object : null;
        AndroidViewHolder androidViewHolder = this.c;
        if (object != null) {
            AndroidViewHolder androidViewHolder2 = androidViewHolder;
            androidViewHolder2 = (ViewFactoryHolder)androidViewHolder;
            wf_0 wf_02 = new wf_0((AndroidComposeView)object, (ViewFactoryHolder)androidViewHolder2);
            ((AndroidComposeView)object).t(wf_02);
        }
        androidViewHolder.removeAllViewsInLayout();
        return Unit.a;
    }
}

