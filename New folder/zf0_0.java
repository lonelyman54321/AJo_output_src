/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.n;

/*
 * Renamed from zF0
 */
public final class zf0_0
implements Runnable {
    public final /* synthetic */ g a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ zf0_0(g g3, int n3, boolean bl2) {
        this.a = g3;
        this.b = n3;
        this.c = bl2;
    }

    public final void run() {
        Object object = this.a;
        n[] nArray = ((g)object).a;
        int n3 = this.b;
        int n4 = nArray[n3].m();
        object = ((g)object).y;
        boolean bl2 = this.c;
        object.d0(n3, n4, bl2);
    }
}

