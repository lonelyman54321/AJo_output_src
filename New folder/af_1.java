/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aF
 */
public final class af_1
implements BK2 {
    public final vs0 a;

    public af_1(vs0 vs02) {
        this.a = vs02;
    }

    public final boolean a(Object object, Z92 z92) {
        object = (ByteBuffer)object;
        this.a.getClass();
        return true;
    }

    public final wk2_0 b(Object object, int n3, int n4, Z92 z92) {
        object = (ByteBuffer)object;
        vs0 vs02 = this.a;
        List list = vs02.d;
        Kp kp = vs02.c;
        list = (ArrayList)list;
        ne1$a ne1$a = new ne1$a((ByteBuffer)object, (ArrayList)list, kp);
        vs0$a vs0$a = vs0.k;
        return vs02.a(ne1$a, n3, n4, z92, vs0$a);
    }
}

