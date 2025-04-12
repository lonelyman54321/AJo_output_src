/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package androidx.media3.exoplayer;

import android.os.Looper;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.m$a;
import androidx.media3.exoplayer.m$b;
import java.util.concurrent.TimeoutException;

public final class m {
    public final m$b a;
    public final m$a b;
    public final VV c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    public m(m$a m$a, m$b m$b, androidx.media3.common.g g3, int n3, VV vV, Looper looper) {
        this.b = m$a;
        this.a = m$b;
        this.f = looper;
        this.c = vV;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(long l2) {
        synchronized (this) {
            Throwable throwable2;
            Object object;
            block8: {
                try {
                    long l3;
                    long l4;
                    long l7;
                    boolean bl2;
                    boolean bl3 = this.g;
                    ct3.f(bl3);
                    Object object2 = this.f;
                    object2 = object2.getThread();
                    Thread thread2 = Thread.currentThread();
                    if (object2 != thread2) {
                        bl3 = true;
                    } else {
                        bl3 = false;
                        object2 = null;
                    }
                    ct3.f(bl3);
                    object2 = this.c;
                    long l8 = object2.elapsedRealtime() + l2;
                    while (!(bl2 = this.i) && (l7 = (l4 = l2 - (l3 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
                        VV vV = this.c;
                        vV.getClass();
                        this.wait(l2);
                        object = this.c;
                        l2 = object.elapsedRealtime();
                        l2 = l8 - l2;
                    }
                    if (!bl2) break block8;
                }
                catch (Throwable throwable2) {}
                return;
            }
            String string2 = "Message delivery timed out.";
            object = new TimeoutException(string2);
            throw object;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(boolean bl2) {
        synchronized (this) {
            boolean bl3 = this.h;
            this.h = bl2 |= bl3;
            this.i = bl2 = true;
            this.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        boolean bl2 = this.g;
        boolean bl3 = true;
        ct3.f(bl2 ^= bl3);
        this.g = bl3;
        g g3 = (g)this.b;
        synchronized (g3) {
            Throwable throwable2;
            block5: {
                Object object;
                block4: {
                    try {
                        bl3 = g3.D;
                        if (bl3) break block4;
                        object = g3.k;
                        bl3 = ((Thread)(object = object.getThread())).isAlive();
                        if (bl3) {
                            object = g3.i;
                            int n3 = 14;
                            object = object.d(n3, this);
                            ((rh3$a_0)object).b();
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object = "Ignoring messages sent after release.";
                Cx.f((String)object);
                bl3 = false;
                object = null;
                this.b(false);
                return;
            }
            throw throwable2;
        }
    }

    public final void d(Object object) {
        ct3.f(this.g ^ true);
        this.e = object;
    }

    public final void e(int n3) {
        ct3.f(this.g ^ true);
        this.d = n3;
    }
}

