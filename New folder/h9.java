/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Surface
 *  android.view.View
 */
import android.view.Surface;
import android.view.View;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView$b;
import kotlin.jvm.internal.Intrinsics;

public final class h9
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h9(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2;
                object = (SphericalGLSurfaceView)((Object)object);
                Surface surface = ((SphericalGLSurfaceView)((Object)object)).h;
                if (surface != null) {
                    boolean bl2;
                    object2 = ((SphericalGLSurfaceView)((Object)object)).a.iterator();
                    while (bl2 = object2.hasNext()) {
                        SphericalGLSurfaceView$b sphericalGLSurfaceView$b = (SphericalGLSurfaceView$b)object2.next();
                        sphericalGLSurfaceView$b.B();
                    }
                }
                if ((object2 = ((SphericalGLSurfaceView)((Object)object)).g) != null) {
                    object2.release();
                }
                if (surface != null) {
                    surface.release();
                }
                ((SphericalGLSurfaceView)((Object)object)).g = null;
                ((SphericalGLSurfaceView)((Object)object)).h = null;
                return;
            }
            case 0: 
        }
        Object object3 = q9_0.Companion;
        object = (q9_0)object;
        object3 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object = ((q9_0)object).R1;
        if (object != null) {
            ai0_2.a((View)object);
        }
    }
}

