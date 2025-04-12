/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaDrm
 *  android.media.MediaDrm$OnEventListener
 */
import android.media.MediaDrm;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$a;
import androidx.media3.exoplayer.drm.g$b;
import androidx.media3.exoplayer.drm.h;

public final class XW0
implements MediaDrm.OnEventListener {
    public final /* synthetic */ h a;
    public final /* synthetic */ g$b b;

    public /* synthetic */ XW0(h h3, DefaultDrmSessionManager$a defaultDrmSessionManager$a) {
        this.a = h3;
        this.b = defaultDrmSessionManager$a;
    }

    public final void onEvent(MediaDrm object, byte[] byArray, int n3, int n4, byte[] byArray2) {
        object = this.a;
        g$b g$b = this.b;
        object.getClass();
        object = ((DefaultDrmSessionManager$a)g$b).a.y;
        object.getClass();
        object.obtainMessage(n3, (Object)byArray).sendToTarget();
    }
}

