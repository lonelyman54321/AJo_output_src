/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.Choreographer
 *  android.view.Choreographer$FrameCallback
 */
package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidUiDispatcher$a;
import androidx.compose.ui.platform.AndroidUiDispatcher$b;
import androidx.compose.ui.platform.AndroidUiDispatcher$dispatchCallback$1;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.c;

public final class AndroidUiDispatcher
extends c {
    public static final hh3_2 l;
    public static final AndroidUiDispatcher$b m;
    public final Choreographer b;
    public final Handler c;
    public final Object d;
    public final fp_2 e;
    public List f;
    public List g;
    public boolean h;
    public boolean i;
    public final AndroidUiDispatcher$dispatchCallback$1 j;
    public final nj_2 k;

    static {
        AndroidUiDispatcher$b androidUiDispatcher$b;
        l = yr1_2.b(AndroidUiDispatcher$a.c);
        m = androidUiDispatcher$b = new ThreadLocal();
    }

    public AndroidUiDispatcher(Choreographer choreographer, Handler object) {
        this.b = choreographer;
        this.c = object;
        this.d = object;
        super();
        this.e = object;
        super();
        this.f = object;
        super();
        this.g = object;
        super(this);
        this.j = object;
        super(choreographer, this);
        this.k = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static final void N0(AndroidUiDispatcher androidUiDispatcher) {
        boolean bl2;
        do {
            block6: {
                block5: {
                    Object object = androidUiDispatcher.O0();
                    while (object != null) {
                        object.run();
                        object = androidUiDispatcher.O0();
                    }
                    object = androidUiDispatcher.d;
                    // MONITORENTER : object
                    fp_2 fp_22 = androidUiDispatcher.e;
                    bl2 = fp_22.isEmpty();
                    if (!bl2) break block5;
                    bl2 = false;
                    fp_22 = null;
                    androidUiDispatcher.h = false;
                    break block6;
                }
                bl2 = true;
            }
            // MONITOREXIT : object
        } while (bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void J0(CoroutineContext object, Runnable object2) {
        object = this.d;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Object object3 = this.e;
                        ((fp_2)object3).addLast(object2);
                        boolean bl2 = this.h;
                        if (bl2) break block3;
                        this.h = bl2 = true;
                        object3 = this.c;
                        AndroidUiDispatcher$dispatchCallback$1 androidUiDispatcher$dispatchCallback$1 = this.j;
                        object3.post((Runnable)androidUiDispatcher$dispatchCallback$1);
                        boolean bl3 = this.i;
                        if (bl3) break block3;
                        this.i = bl2;
                        object2 = this.b;
                        object3 = this.j;
                        object2.postFrameCallback((Choreographer.FrameCallback)object3);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object2 = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Runnable O0() {
        Object object = this.d;
        synchronized (object) {
            Object object2 = this.e;
            boolean bl2 = ((fp_2)object2).isEmpty();
            object2 = bl2 ? null : ((fp_2)object2).removeFirst();
            return (Runnable)object2;
        }
    }
}

