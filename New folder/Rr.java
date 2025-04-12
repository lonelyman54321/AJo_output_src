/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 */
import android.media.AudioTrack;

public final class Rr {
    public final Rr$a a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public Rr(AudioTrack audioTrack) {
        Rr$a rr$a;
        this.a = rr$a = new Rr$a(audioTrack);
        this.a();
    }

    public final void a() {
        Rr$a rr$a = this.a;
        if (rr$a != null) {
            rr$a = null;
            this.b(0);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(int n3) {
        this.b = n3;
        long l2 = 10000L;
        if (n3 == 0) {
            this.e = 0L;
            this.f = -1;
            long l3 = System.nanoTime();
            long l4 = 1000L;
            this.c = l3 /= l4;
            this.d = l2;
            return;
        }
        int n4 = 1;
        if (n3 == n4) {
            this.d = l2;
            return;
        }
        int n7 = 2;
        if (n3 != n7 && n3 != (n7 = 3)) {
            n7 = 4;
            if (n3 == n7) {
                this.d = l2 = 500000L;
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException();
            throw illegalStateException;
        }
        this.d = l2 = 10000000L;
    }
}

