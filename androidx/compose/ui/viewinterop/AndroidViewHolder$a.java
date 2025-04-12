/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package androidx.compose.ui.viewinterop;

import android.os.Handler;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class AndroidViewHolder$a
extends Lambda
implements Function1 {
    public static final AndroidViewHolder$a c;

    static {
        AndroidViewHolder$a androidViewHolder$a;
        c = androidViewHolder$a = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (AndroidViewHolder)object;
        Handler handler = object.getHandler();
        object = ((AndroidViewHolder)object).n;
        Gj gj = new Gj(object, 0);
        handler.post((Runnable)gj);
        return Unit.a;
    }
}

