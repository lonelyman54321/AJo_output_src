/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.view.Surface
 *  android.view.SurfaceHolder
 *  android.view.SurfaceHolder$Callback
 *  android.view.TextureView$SurfaceTextureListener
 */
package androidx.media3.exoplayer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.common.Metadata;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.d;
import androidx.media3.common.e$a;
import androidx.media3.exoplayer.AudioBecomingNoisyManager$a;
import androidx.media3.exoplayer.ExoPlayer$b;
import androidx.media3.exoplayer.a$b;
import androidx.media3.exoplayer.audio.AudioSink$a;
import androidx.media3.exoplayer.audio.b;
import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.video.f;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView$b;
import java.util.List;

public final class e$b
implements f,
b,
jm3,
HO1,
SurfaceHolder.Callback,
TextureView.SurfaceTextureListener,
SphericalGLSurfaceView$b,
a$b,
AudioBecomingNoisyManager$a,
ExoPlayer$b {
    public final /* synthetic */ e a;

    public e$b(e e2) {
        this.a = e2;
    }

    public final void A() {
        this.a.D();
    }

    public final void B() {
        this.a.x(null);
    }

    public final void a(wc3_0 wc3_02) {
        Object object = this.a;
        ((e)object).s0 = wc3_02;
        object = ((e)object).l;
        wf0_1 wf0_12 = new wf0_1(wc3_02);
        ((vv1_0)object).f(25, wf0_12);
    }

    public final void b(fj0 fj02) {
        e e2 = this.a;
        e2.r.b(fj02);
        e2.S = null;
        e2.d0 = null;
    }

    public final void c(d d2, hj0 hj02) {
        e e2 = this.a;
        e2.S = d2;
        e2.r.c(d2, hj02);
    }

    public final void d(String string2) {
        this.a.r.d(string2);
    }

    public final void e(AudioSink$a audioSink$a) {
        this.a.r.e(audioSink$a);
    }

    public final void f(String string2) {
        this.a.r.f(string2);
    }

    public final void g(AudioSink$a audioSink$a) {
        this.a.r.g(audioSink$a);
    }

    public final void h(d d2, hj0 hj02) {
        e e2 = this.a;
        e2.T = d2;
        e2.r.h(d2, hj02);
    }

    public final void i(long l2, String string2, long l3) {
        this.a.r.i(l2, string2, l3);
    }

    public final void j(boolean bl2) {
        e e2 = this.a;
        boolean bl3 = e2.i0;
        if (bl3 == bl2) {
            return;
        }
        e2.i0 = bl2;
        xf0_0 xf0_02 = new xf0_0(bl2);
        e2.l.f(23, xf0_02);
    }

    public final void k(Exception exception) {
        this.a.r.k(exception);
    }

    public final void l(List list) {
        vv1_0 vv1_02 = this.a.l;
        vf0_0 vf0_02 = new vf0_0(list);
        vv1_02.f(27, vf0_02);
    }

    public final void m(long l2) {
        this.a.r.m(l2);
    }

    public final void n(Exception exception) {
        this.a.r.n(exception);
    }

    public final void o(long l2, Object object) {
        e e2 = this.a;
        je je2 = e2.r;
        je2.o(l2, object);
        Object object2 = e2.U;
        if (object2 == object) {
            object2 = new Object();
            int n3 = 26;
            object = e2.l;
            ((vv1_0)object).f(n3, (vv1$a)object2);
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int n3, int n4) {
        e e2 = this.a;
        e2.getClass();
        Surface surface = new Surface(surfaceTexture);
        e2.x(surface);
        e2.V = surface;
        e2.r(n3, n4);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture object) {
        object = this.a;
        ((e)object).x(null);
        ((e)object).r(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int n3, int n4) {
        this.a.r(n3, n4);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void p(Surface surface) {
        this.a.x(surface);
    }

    public final void q(int n3, long l2) {
        this.a.r.q(n3, l2);
    }

    public final void r(fj0 fj02) {
        e e2 = this.a;
        e2.d0 = fj02;
        e2.r.r(fj02);
    }

    public final void s(fj0 fj02) {
        e e2 = this.a;
        e2.r.s(fj02);
        e2.T = null;
        e2.e0 = null;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int n3, int n4, int n7) {
        this.a.r(n4, n7);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        e e2 = this.a;
        boolean bl2 = e2.Y;
        if (bl2) {
            surfaceHolder = surfaceHolder.getSurface();
            e2.x(surfaceHolder);
        }
    }

    public final void surfaceDestroyed(SurfaceHolder object) {
        object = this.a;
        boolean bl2 = ((e)object).Y;
        if (bl2) {
            bl2 = false;
            ((e)object).x(null);
        }
        ((e)object).r(0, 0);
    }

    public final void t(Ue0 ue0) {
        Object object = this.a;
        ((e)object).j0 = ue0;
        object = ((e)object).l;
        wc0_0 wc0_02 = new wc0_0(ue0, 2);
        ((vv1_0)object).f(27, wc0_02);
    }

    public final void u(int n3, long l2) {
        this.a.r.u(n3, l2);
    }

    public final void v(long l2, String string2, long l3) {
        this.a.r.v(l2, string2, l3);
    }

    public final void w(Metadata metadata) {
        Object object;
        int n3;
        int n4;
        Object object2 = this.a;
        Object object3 = ((e)object2).t0.a();
        androidx.media3.common.e e2 = null;
        for (n4 = 0; n4 < (n3 = ((Metadata$Entry[])(object = metadata.a)).length); ++n4) {
            object = object[n4];
            object.u((e$a)object3);
        }
        ((e)object2).t0 = e2 = new androidx.media3.common.e((e$a)object3);
        object3 = ((e)object2).g();
        e2 = ((e)object2).Q;
        n4 = (int)(((androidx.media3.common.e)object3).equals(e2) ? 1 : 0);
        object = ((e)object2).l;
        if (n4 == 0) {
            ((e)object2).Q = object3;
            object2 = new tF0(this);
            int n7 = 14;
            ((vv1_0)object).c(n7, (vv1$a)object2);
        }
        object2 = new uf0_1(metadata);
        ((vv1_0)object).c(28, (vv1$a)object2);
        ((vv1_0)object).b();
    }

    public final void x(Exception exception) {
        this.a.r.x(exception);
    }

    public final void y(int n3, long l2, long l3) {
        this.a.r.y(n3, l2, l3);
    }

    public final void z(fj0 fj02) {
        e e2 = this.a;
        e2.e0 = fj02;
        e2.r.z(fj02);
    }
}

