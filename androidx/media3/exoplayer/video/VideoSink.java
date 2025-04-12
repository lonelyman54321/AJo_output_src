/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Surface
 */
package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.common.d;
import androidx.media3.exoplayer.video.b$a;
import androidx.media3.exoplayer.video.b$b;
import java.util.List;
import java.util.concurrent.Executor;

public interface VideoSink {
    public boolean b();

    public void d();

    public Surface e();

    public void g(long var1, long var3);

    public void h(long var1, long var3, long var5, long var7);

    public void i();

    public boolean isInitialized();

    public boolean j(boolean var1);

    public boolean k(long var1, boolean var3, long var4, long var6, b.b var8);

    public void l(Surface var1, A63 var2);

    public void m(d var1);

    public void n(boolean var1);

    public void o();

    public void p(d var1);

    public void q();

    public void r(int var1);

    public void release();

    public void s();

    public void setPlaybackSpeed(float var1);

    public void setVideoEffects(List var1);

    public void setVideoFrameMetadataListener(LB3 var1);

    public void t(boolean var1);

    public void u(boolean var1);

    public void v(b.a var1, Executor var2);
}

