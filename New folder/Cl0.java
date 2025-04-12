/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
import android.os.Looper;
import androidx.media3.common.d;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$c;
import androidx.media3.exoplayer.drm.b$a;
import androidx.media3.exoplayer.video.f$a;

public final class Cl0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ Cl0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        Object object = this.c;
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (f$a)object2;
                object2.getClass();
                n3 = gz3.a;
                object2 = ((f$a)object2).b;
                object = (wc3_0)object;
                object2.a((wc3_0)object);
                return;
            }
            case 0: 
        }
        object2 = (DefaultDrmSessionManager$c)object2;
        DefaultDrmSessionManager defaultDrmSessionManager = ((DefaultDrmSessionManager$c)object2).e;
        int n4 = defaultDrmSessionManager.p;
        if (n4 != 0 && (n4 = (int)(((DefaultDrmSessionManager$c)object2).d ? 1 : 0)) == 0) {
            Looper looper = defaultDrmSessionManager.t;
            looper.getClass();
            b.a a2 = ((DefaultDrmSessionManager$c)object2).b;
            object = (d)object;
            ((DefaultDrmSessionManager$c)object2).c = object = defaultDrmSessionManager.e(looper, a2, (d)object, false);
            object = defaultDrmSessionManager.n;
            object.add(object2);
        }
    }
}

