/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Choreographer$FrameCallback
 */
package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidUiDispatcher;
import java.util.List;
import kotlin.Unit;

public final class AndroidUiDispatcher$dispatchCallback$1
implements Choreographer.FrameCallback,
Runnable {
    public final /* synthetic */ AndroidUiDispatcher a;

    public AndroidUiDispatcher$dispatchCallback$1(AndroidUiDispatcher androidUiDispatcher) {
        this.a = androidUiDispatcher;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void doFrame(long l2) {
        List list;
        int n4;
        this.a.c.removeCallbacks((Runnable)this);
        AndroidUiDispatcher.N0(this.a);
        AndroidUiDispatcher androidUiDispatcher = this.a;
        Object object = androidUiDispatcher.d;
        synchronized (object) {
            List list2;
            n4 = androidUiDispatcher.i;
            if (n4 == 0) {
                return;
            }
            n4 = 0;
            androidUiDispatcher.i = false;
            list = androidUiDispatcher.f;
            androidUiDispatcher.f = list2 = androidUiDispatcher.g;
            androidUiDispatcher.g = list;
        }
        int n3 = list.size();
        while (true) {
            if (n4 >= n3) {
                list.clear();
                return;
            }
            object = (Choreographer.FrameCallback)list.get(n4);
            object.doFrame(l2);
            ++n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        AndroidUiDispatcher.N0(this.a);
        Object object = this.a;
        Object object2 = ((AndroidUiDispatcher)object).d;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        List list = ((AndroidUiDispatcher)object).f;
                        boolean bl2 = list.isEmpty();
                        if (!bl2) break block3;
                        list = ((AndroidUiDispatcher)object).b;
                        list.removeFrameCallback(this);
                        bl2 = false;
                        list = null;
                        ((AndroidUiDispatcher)object).i = false;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = Unit.a;
                return;
            }
            throw throwable2;
        }
    }
}

