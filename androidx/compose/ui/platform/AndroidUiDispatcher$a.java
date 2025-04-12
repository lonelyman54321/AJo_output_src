/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.Choreographer
 */
package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidUiDispatcher;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class AndroidUiDispatcher$a
extends Lambda
implements Function0 {
    public static final AndroidUiDispatcher$a c;

    static {
        AndroidUiDispatcher$a androidUiDispatcher$a;
        c = androidUiDispatcher$a = new Lambda(0);
    }

    public final Object invoke() {
        boolean bl2;
        Object object;
        Object object2 = Looper.myLooper();
        if (object2 == (object = Looper.getMainLooper())) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        if (bl2) {
            object2 = Choreographer.getInstance();
        } else {
            object2 = ir0_2.a;
            object2 = bg1_1.a;
            int n3 = 2;
            object = new qg3_2(n3, null);
            object2 = (Choreographer)Ae3.e((CoroutineContext)object2, (Function2)object);
        }
        object = y21_0.a(Looper.getMainLooper());
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher((Choreographer)object2, (Handler)object);
        object2 = androidUiDispatcher.k;
        return androidUiDispatcher.plus((CoroutineContext)object2);
    }
}

