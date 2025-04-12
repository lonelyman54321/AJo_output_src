/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import androidx.media3.exoplayer.l$a;
import androidx.media3.exoplayer.source.j$b;

/*
 * Renamed from vN1
 */
public final class vn1_0
implements Runnable {
    public final /* synthetic */ l$a a;
    public final /* synthetic */ Pair b;

    public /* synthetic */ vn1_0(l$a l$a, Pair pair) {
        this.a = l$a;
        this.b = pair;
    }

    public final void run() {
        je je2 = this.a.b.h;
        Object object = this.b;
        int n3 = (Integer)object.first;
        object = (j$b)object.second;
        je2.L(n3, (j$b)object);
    }
}

