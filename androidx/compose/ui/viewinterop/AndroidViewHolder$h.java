/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 */
package androidx.compose.ui.viewinterop;

import android.graphics.Canvas;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class AndroidViewHolder$h
extends Lambda
implements Function1 {
    public final /* synthetic */ AndroidViewHolder c;
    public final /* synthetic */ xp1_0 d;
    public final /* synthetic */ AndroidViewHolder e;

    public AndroidViewHolder$h(ViewFactoryHolder viewFactoryHolder, xp1_0 xp1_02, ViewFactoryHolder viewFactoryHolder2) {
        this.c = viewFactoryHolder;
        this.d = xp1_02;
        this.e = viewFactoryHolder2;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3;
        object = ((Kt0)object).M0().a();
        AndroidViewHolder androidViewHolder = this.c;
        Object object2 = androidViewHolder.getView();
        int n4 = object2.getVisibility();
        if (n4 != (n3 = 8)) {
            n4 = 1;
            androidViewHolder.u = n4;
            object2 = this.d.i;
            n3 = object2 instanceof AndroidComposeView;
            if (n3 != 0) {
                object2 = (AndroidComposeView)object2;
            } else {
                n4 = 0;
                object2 = null;
            }
            if (object2 != null) {
                object = Nf.a((iL)object);
                ((Object)((Object)((AndroidComposeView)object2).getAndroidViewsHandler$ui_release())).getClass();
                object2 = this.e;
                object2.draw((Canvas)object);
            }
            object = null;
            androidViewHolder.u = false;
        }
        return Unit.a;
    }
}

