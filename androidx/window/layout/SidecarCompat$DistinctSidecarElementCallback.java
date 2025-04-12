/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  androidx.window.sidecar.SidecarDeviceState
 *  androidx.window.sidecar.SidecarInterface$SidecarCallback
 *  androidx.window.sidecar.SidecarWindowLayoutInfo
 */
package androidx.window.layout;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

final class SidecarCompat$DistinctSidecarElementCallback
implements SidecarInterface.SidecarCallback {
    public final v43 a;
    public final SidecarInterface.SidecarCallback b;
    public final ReentrantLock c;
    public SidecarDeviceState d;
    public final WeakHashMap e;

    public SidecarCompat$DistinctSidecarElementCallback(v43 weakHashMap, SidecarInterface.SidecarCallback sidecarCallback) {
        Intrinsics.checkNotNullParameter(weakHashMap, "sidecarAdapter");
        Intrinsics.checkNotNullParameter(sidecarCallback, "callbackInterface");
        this.a = weakHashMap;
        this.b = sidecarCallback;
        weakHashMap = new WeakHashMap();
        this.c = weakHashMap;
        this.e = weakHashMap = new WeakHashMap();
    }

    public void onDeviceStateChanged(SidecarDeviceState object) {
        v43 v432;
        ReentrantLock reentrantLock;
        block8: {
            Intrinsics.checkNotNullParameter(object, "newDeviceState");
            reentrantLock = this.c;
            reentrantLock.lock();
            v432 = this.a;
            SidecarDeviceState sidecarDeviceState = this.d;
            v432.getClass();
            boolean bl2 = v43.a(sidecarDeviceState, object);
            if (!bl2) break block8;
            reentrantLock.unlock();
            return;
        }
        try {
            this.d = object;
            v432 = this.b;
            v432.onDeviceStateChanged((SidecarDeviceState)object);
            object = Unit.a;
            return;
        }
        finally {
            reentrantLock.unlock();
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        Intrinsics.checkNotNullParameter(iBinder, "token");
        Intrinsics.checkNotNullParameter(sidecarWindowLayoutInfo, "newLayout");
        ReentrantLock reentrantLock = this.c;
        synchronized (reentrantLock) {
            WeakHashMap<IBinder, SidecarWindowLayoutInfo> weakHashMap;
            block12: {
                weakHashMap = this.e;
                weakHashMap = weakHashMap.get(iBinder);
                weakHashMap = (SidecarWindowLayoutInfo)weakHashMap;
                v43 v432 = this.a;
                v432.getClass();
                boolean bl2 = v43.d((SidecarWindowLayoutInfo)weakHashMap, sidecarWindowLayoutInfo);
                if (!bl2) break block12;
                return;
            }
            weakHashMap = this.e;
            weakHashMap = weakHashMap.put(iBinder, sidecarWindowLayoutInfo);
            weakHashMap = (SidecarWindowLayoutInfo)weakHashMap;
            this.b.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            return;
        }
    }
}

