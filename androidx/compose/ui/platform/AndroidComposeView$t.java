/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package androidx.compose.ui.platform;

import android.os.Looper;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class AndroidComposeView$t
extends Lambda
implements Function1 {
    public final /* synthetic */ AndroidComposeView c;

    public AndroidComposeView$t(AndroidComposeView androidComposeView) {
        this.c = androidComposeView;
        super(1);
    }

    public final Object invoke(Object object) {
        Looper looper;
        object = (Function0)object;
        AndroidComposeView androidComposeView = this.c;
        Object object2 = androidComposeView.getHandler();
        object2 = object2 != null ? object2.getLooper() : null;
        if (object2 == (looper = Looper.myLooper())) {
            object.invoke();
        } else if ((androidComposeView = androidComposeView.getHandler()) != null) {
            int n3 = 1;
            object2 = new i4_0(object, n3);
            androidComposeView.post((Runnable)object2);
        }
        return Unit.a;
    }
}

