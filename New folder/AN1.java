/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import androidx.media3.exoplayer.l$a;
import androidx.media3.exoplayer.source.j$b;
import java.io.IOException;

public final class AN1
implements Runnable {
    public final /* synthetic */ l$a a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ Iv1 c;
    public final /* synthetic */ jm1_0 d;
    public final /* synthetic */ IOException e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ AN1(l$a a2, Pair pair, Iv1 iv1, jm1_0 jm1_02, IOException iOException, boolean bl2) {
        this.a = a2;
        this.b = pair;
        this.c = iv1;
        this.d = jm1_02;
        this.e = iOException;
        this.f = bl2;
    }

    public final void run() {
        je je2 = this.a.b.h;
        Object object = this.b;
        int n3 = (Integer)object.first;
        Object object2 = object = object.second;
        object2 = (j$b)object;
        Iv1 iv1 = this.c;
        jm1_0 jm1_02 = this.d;
        IOException iOException = this.e;
        boolean bl2 = this.f;
        je2.i0(n3, (j$b)object2, iv1, jm1_02, iOException, bl2);
    }
}

