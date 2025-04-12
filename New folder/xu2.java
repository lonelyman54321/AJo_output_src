/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.AttachedSurfaceControl
 *  android.view.SurfaceControl$Transaction
 *  android.view.SurfaceView
 *  android.window.SurfaceSyncGroup
 */
import android.view.AttachedSurfaceControl;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;
import androidx.media3.ui.PlayerView$d;

public final class xu2
implements Runnable {
    public final /* synthetic */ PlayerView$d a;
    public final /* synthetic */ SurfaceView b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ xu2(PlayerView$d playerView$d, SurfaceView surfaceView, gw1_2 gw1_22) {
        this.a = playerView$d;
        this.b = surfaceView;
        this.c = gw1_22;
    }

    public final void run() {
        Object object = this.a;
        object.getClass();
        AttachedSurfaceControl attachedSurfaceControl = uu2_0.a(this.b);
        if (attachedSurfaceControl != null) {
            SurfaceSyncGroup surfaceSyncGroup;
            ((PlayerView$d)object).a = surfaceSyncGroup = su2_1.a();
            object = new Object();
            boolean bl2 = vu2.a(surfaceSyncGroup, attachedSurfaceControl, (yu2)object);
            ct3.f(bl2);
            this.c.run();
            object = tu2_0.a();
            wu2.a(attachedSurfaceControl, (SurfaceControl.Transaction)object);
        }
    }
}

