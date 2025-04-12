/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$a;
import androidx.media3.exoplayer.drm.g$a;
import androidx.media3.exoplayer.drm.g$d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface g {
    public Map a(byte[] var1);

    public g$d b();

    public byte[] c();

    public void d(byte[] var1, byte[] var2);

    public void e(DefaultDrmSessionManager$a var1);

    public void f(byte[] var1);

    public int g();

    public void h(byte[] var1, nu2 var2);

    public be0_0 i(byte[] var1);

    public void j(byte[] var1);

    public byte[] k(byte[] var1, byte[] var2);

    public g$a l(byte[] var1, List var2, int var3, HashMap var4);

    public boolean m(String var1, byte[] var2);

    public void release();
}

