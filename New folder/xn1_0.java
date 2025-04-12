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
 * Renamed from xN1
 */
public final class xn1_0
implements Runnable {
    public final /* synthetic */ l$a a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ Iv1 c;
    public final /* synthetic */ jm1_0 d;

    public /* synthetic */ xn1_0(l$a l$a, Pair pair, Iv1 iv1, jm1_0 jm1_02) {
        this.a = l$a;
        this.b = pair;
        this.c = iv1;
        this.d = jm1_02;
    }

    public final void run() {
        je je2 = this.a.b.h;
        Object object = this.b;
        int n3 = (Integer)object.first;
        object = (j$b)object.second;
        Iv1 iv1 = this.c;
        jm1_0 jm1_02 = this.d;
        je2.N(n3, (j$b)object, iv1, jm1_02);
    }
}

