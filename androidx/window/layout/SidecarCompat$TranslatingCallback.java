/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.IBinder
 *  androidx.window.sidecar.SidecarDeviceState
 *  androidx.window.sidecar.SidecarInterface$SidecarCallback
 *  androidx.window.sidecar.SidecarWindowLayoutInfo
 */
package androidx.window.layout;

import android.app.Activity;
import android.os.IBinder;
import androidx.window.layout.SidecarCompat;
import androidx.window.layout.SidecarCompat$a;
import androidx.window.layout.SidecarCompat$b;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class SidecarCompat$TranslatingCallback
implements SidecarInterface.SidecarCallback {
    public final /* synthetic */ SidecarCompat a;

    public SidecarCompat$TranslatingCallback(SidecarCompat sidecarCompat) {
        Intrinsics.checkNotNullParameter(sidecarCompat, "this$0");
        this.a = sidecarCompat;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(sidecarDeviceState, "newDeviceState");
        Object object = SidecarCompat.e(this.a).values();
        SidecarCompat sidecarCompat = this.a;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2;
            Activity activity = (Activity)object.next();
            Object object3 = SidecarCompat$a.a(activity);
            Object object4 = null;
            if (object3 != null && (object2 = sidecarCompat.f()) != null) {
                object4 = object2.getWindowLayoutInfo((IBinder)object3);
            }
            if ((object3 = SidecarCompat.c(sidecarCompat)) == null) continue;
            object2 = SidecarCompat.d(sidecarCompat);
            object4 = ((v43)object2).e((SidecarWindowLayoutInfo)object4, sidecarDeviceState);
            ((SidecarCompat$b)object3).a(activity, (gH3)object4);
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo object) {
        Intrinsics.checkNotNullParameter(iBinder, "windowToken");
        Intrinsics.checkNotNullParameter(object, "newLayout");
        Object object2 = SidecarCompat.e(this.a);
        iBinder = (Activity)((LinkedHashMap)object2).get(iBinder);
        if (iBinder == null) {
            return;
        }
        object2 = SidecarCompat.d(this.a);
        Object object3 = this.a.f();
        object3 = object3 == null ? null : object3.getDeviceState();
        if (object3 == null) {
            object3 = new SidecarDeviceState();
        }
        object = ((v43)object2).e((SidecarWindowLayoutInfo)object, (SidecarDeviceState)object3);
        object2 = SidecarCompat.c(this.a);
        if (object2 != null) {
            ((SidecarCompat$b)object2).a((Activity)iBinder, (gH3)object);
        }
    }
}

