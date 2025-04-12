/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.drm.b;
import androidx.media3.exoplayer.drm.b$a;
import androidx.media3.exoplayer.source.j$b;

/*
 * Renamed from Sv0
 */
public final class sv0_0
implements Runnable {
    public final /* synthetic */ b$a a;
    public final /* synthetic */ b b;
    public final /* synthetic */ int c;

    public /* synthetic */ sv0_0(b$a b$a, b b2, int n3) {
        this.a = b$a;
        this.b = b2;
        this.c = n3;
    }

    public final void run() {
        Object object = this.a;
        int n3 = ((b$a)object).a;
        object = ((b$a)object).b;
        b b2 = this.b;
        int n4 = this.c;
        b2.O(n3, (j$b)object, n4);
    }
}

