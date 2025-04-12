/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.Surface
 */
package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$a;
import androidx.media3.exoplayer.mediacodec.d$d;
import java.nio.ByteBuffer;

public interface d {
    public void a(int var1, Fe0 var2, long var3, int var5);

    public void b(Bundle var1);

    public void c(int var1, int var2, int var3, long var4);

    public void d(d$d var1, Handler var2);

    public MediaFormat e();

    public void f();

    public void flush();

    public ByteBuffer g(int var1);

    public void h(Surface var1);

    public void i(int var1);

    public void j(int var1, long var2);

    public int k();

    public int l(MediaCodec.BufferInfo var1);

    public ByteBuffer m(int var1);

    public boolean n(MediaCodecRenderer$a var1);

    public void release();

    public void setVideoScalingMode(int var1);
}

