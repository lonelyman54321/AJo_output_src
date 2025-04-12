/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class ViewFactoryHolder$a
extends Lambda
implements Function0 {
    public final /* synthetic */ ViewFactoryHolder c;

    public ViewFactoryHolder$a(ViewFactoryHolder viewFactoryHolder) {
        this.c = viewFactoryHolder;
        super(0);
    }

    public final Object invoke() {
        ViewFactoryHolder viewFactoryHolder = this.c;
        View view = viewFactoryHolder.x;
        viewFactoryHolder.getReleaseBlock().invoke(view);
        ViewFactoryHolder.e(viewFactoryHolder);
        return Unit.a;
    }
}

