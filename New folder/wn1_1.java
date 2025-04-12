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
 * Renamed from wN1
 */
public final class wn1_1
implements Runnable {
    public final /* synthetic */ l$a a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ wn1_1(l$a l$a, Pair pair, Exception exception) {
        this.a = l$a;
        this.b = pair;
        this.c = exception;
    }

    public final void run() {
        je je2 = this.a.b.h;
        Object object = this.b;
        int n3 = (Integer)object.first;
        object = (j$b)object.second;
        Exception exception = this.c;
        je2.S(n3, (j$b)object, exception);
    }
}

