/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioDeviceInfo
 */
package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.media3.common.d;
import java.nio.ByteBuffer;

public interface AudioSink {
    public boolean a(d var1);

    public boolean b();

    public Dr c(d var1);

    public boolean d();

    public void e(int var1);

    public void f();

    public void flush();

    public void g(dr_1 var1);

    public ot2_0 getPlaybackParameters();

    public boolean h(ByteBuffer var1, long var2, int var4);

    public void i();

    public void j(int var1, int var2);

    public long k(boolean var1);

    public void l(d var1, int[] var2);

    public void m();

    public void n(nu2 var1);

    public void o();

    public int p(d var1);

    public void pause();

    public void play();

    public void q(VV var1);

    public void release();

    public void reset();

    public void setAudioSessionId(int var1);

    public void setAuxEffectInfo(dt var1);

    public void setPlaybackParameters(ot2_0 var1);

    public void setPreferredDevice(AudioDeviceInfo var1);

    public void setSkipSilenceEnabled(boolean var1);

    public void setVolume(float var1);
}

