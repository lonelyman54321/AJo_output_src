/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.exoplayer.source.k;
import androidx.media3.exoplayer.source.k$a;

public final class mN1
implements n60_0 {
    public final /* synthetic */ k$a a;
    public final /* synthetic */ jm1_0 b;

    public /* synthetic */ mN1(k$a k$a, jm1_0 jm1_02) {
        this.a = k$a;
        this.b = jm1_02;
    }

    public final void accept(Object object) {
        object = (k)object;
        Object object2 = this.a;
        int n3 = ((k$a)object2).a;
        object2 = ((k$a)object2).b;
        jm1_0 jm1_02 = this.b;
        object.J(n3, (j$b)object2, jm1_02);
    }
}

