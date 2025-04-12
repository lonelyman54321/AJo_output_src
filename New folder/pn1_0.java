/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.exoplayer.source.k;
import androidx.media3.exoplayer.source.k$a;
import java.io.IOException;

/*
 * Renamed from pN1
 */
public final class pn1_0
implements n60_0 {
    public final /* synthetic */ k$a a;
    public final /* synthetic */ Iv1 b;
    public final /* synthetic */ jm1_0 c;
    public final /* synthetic */ IOException d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ pn1_0(k$a k$a, Iv1 iv1, jm1_0 jm1_02, IOException iOException, boolean bl2) {
        this.a = k$a;
        this.b = iv1;
        this.c = jm1_02;
        this.d = iOException;
        this.e = bl2;
    }

    public final void accept(Object object) {
        Object object2 = object;
        object2 = (k)object;
        object = this.a;
        int n3 = ((k$a)object).a;
        IOException iOException = this.d;
        boolean bl2 = this.e;
        j$b j$b = ((k$a)object).b;
        Iv1 iv1 = this.b;
        jm1_0 jm1_02 = this.c;
        object2.i0(n3, j$b, iv1, jm1_02, iOException, bl2);
    }
}

