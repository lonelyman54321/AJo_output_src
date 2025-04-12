/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.graphics.SurfaceTexture$OnFrameAvailableListener
 */
import android.graphics.SurfaceTexture;

public final class jT2
implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ kt2_1 a;

    public /* synthetic */ jT2(kt2_1 kt2_12) {
        this.a = kt2_12;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.a.a.set(true);
    }
}

