/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.video.f;
import androidx.media3.exoplayer.video.f$a;

/*
 * Renamed from oC3
 */
public final class oc3_0
implements Runnable {
    public final /* synthetic */ f$a a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ oc3_0(f$a f$a, String string2, long l2, long l3) {
        this.a = f$a;
        this.b = string2;
        this.c = l2;
        this.d = l3;
    }

    public final void run() {
        f$a f$a = this.a;
        f$a.getClass();
        f f5 = f$a.b;
        String string2 = this.b;
        long l2 = this.c;
        long l3 = this.d;
        f5.i(l2, string2, l3);
    }
}

