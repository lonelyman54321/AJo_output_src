/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.opengl.GLSurfaceView
 *  android.opengl.GLSurfaceView$Renderer
 *  android.util.AttributeSet
 */
package androidx.media3.exoplayer.video;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView$a;
import java.util.concurrent.atomic.AtomicReference;

public final class VideoDecoderGLSurfaceView
extends GLSurfaceView
implements KB3 {
    public static final /* synthetic */ int b;
    public final VideoDecoderGLSurfaceView$a a;

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    public VideoDecoderGLSurfaceView(Context object, AttributeSet attributeSet) {
        super(object, attributeSet);
        super(this);
        this.a = object;
        this.setPreserveEGLContextOnPause(true);
        this.setEGLContextClientVersion(2);
        this.setRenderer((GLSurfaceView.Renderer)object);
        this.setRenderMode(0);
    }

    public KB3 getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(JB3 jB3) {
        VideoDecoderGLSurfaceView$a videoDecoderGLSurfaceView$a = this.a;
        AtomicReference atomicReference = videoDecoderGLSurfaceView$a.f;
        if ((jB3 = atomicReference.getAndSet(jB3)) == null) {
            videoDecoderGLSurfaceView$a.a.requestRender();
            return;
        }
        throw null;
    }
}

