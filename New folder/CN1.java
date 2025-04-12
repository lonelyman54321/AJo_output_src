/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import androidx.media3.exoplayer.l$a;
import androidx.media3.exoplayer.source.j$b;

public final class CN1
implements Runnable {
    public final /* synthetic */ l$a a;
    public final /* synthetic */ Pair b;

    public /* synthetic */ CN1(l$a l$a, Pair pair) {
        this.a = l$a;
        this.b = pair;
    }

    public final void run() {
        je je2 = this.a.b.h;
        Object object = this.b;
        int n3 = (Integer)object.first;
        object = (j$b)object.second;
        je2.b0(n3, (j$b)object);
    }
}

