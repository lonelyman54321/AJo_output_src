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
import kotlin.coroutines.a;

public final class AndroidUiDispatcher$b
extends ThreadLocal {
    public final Object initialValue() {
        Object object;
        Object object2 = Choreographer.getInstance();
        Looper looper = Looper.myLooper();
        if (looper != null) {
            looper = y21_0.a(looper);
            object = new AndroidUiDispatcher((Choreographer)object2, (Handler)looper);
            object2 = ((AndroidUiDispatcher)object).k;
            return ((a)object).plus((CoroutineContext)object2);
        }
        object2 = "no Looper on this thread".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

