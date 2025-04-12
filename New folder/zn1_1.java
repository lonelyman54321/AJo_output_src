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
 * Renamed from zN1
 */
public final class zn1_1
implements Runnable {
    public final /* synthetic */ l$a a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ int c;

    public /* synthetic */ zn1_1(l$a l$a, Pair pair, int n3) {
        this.a = l$a;
        this.b = pair;
        this.c = n3;
    }

    public final void run() {
        je je2 = this.a.b.h;
        Object object = this.b;
        int n3 = (Integer)object.first;
        object = (j$b)object.second;
        int n4 = this.c;
        je2.O(n3, (j$b)object, n4);
    }
}

