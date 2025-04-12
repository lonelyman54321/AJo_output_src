/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
import android.os.Looper;
import androidx.media3.common.d;
import androidx.media3.common.f;
import androidx.media3.common.f$c;
import androidx.media3.exoplayer.audio.AudioSink$a;
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.exoplayer.source.k;
import com.google.common.collect.ImmutableList;

public interface je
extends f$c,
k,
iv$a,
b {
    public void B(oe var1);

    public void G();

    public void X(ImmutableList var1, j$b var2);

    public void b(fj0 var1);

    public void c(d var1, hj0 var2);

    public void d(String var1);

    public void d0(int var1, int var2, boolean var3);

    public void e(AudioSink$a var1);

    public void f(String var1);

    public void f0(oe var1);

    public void g(AudioSink$a var1);

    public void h(d var1, hj0 var2);

    public void i(long var1, String var3, long var4);

    public void k(Exception var1);

    public void m(long var1);

    public void m0(f var1, Looper var2);

    public void n(Exception var1);

    public void o(long var1, Object var3);

    public void q(int var1, long var2);

    public void r(fj0 var1);

    public void release();

    public void s(fj0 var1);

    public void u(int var1, long var2);

    public void v(long var1, String var3, long var4);

    public void x(Exception var1);

    public void y(int var1, long var2, long var4);

    public void z(fj0 var1);
}

