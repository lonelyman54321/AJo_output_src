/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

public class NG1$d {
    public final ng1_2 a;
    public int b;
    public int c;
    public int d;

    public NG1$d(ng1_2 ng1_22) {
        int n3;
        Intrinsics.checkNotNullParameter(ng1_22, "map");
        this.a = ng1_22;
        this.c = -1;
        this.d = n3 = ng1_22.h;
        this.c();
    }

    public final void a() {
        Serializable serializable = this.a;
        int n3 = serializable.h;
        int n4 = this.d;
        if (n3 == n4) {
            return;
        }
        serializable = new ConcurrentModificationException();
        throw serializable;
    }

    public final void c() {
        while (true) {
            Object object;
            int n3 = this.b;
            Object object2 = this.a;
            int n4 = ((ng1_2)object2).f;
            if (n3 >= n4 || (object = (object2 = (Object)((ng1_2)object2).c)[n3]) >= 0) break;
            this.b = ++n3;
        }
    }

    public final boolean hasNext() {
        int n3 = this.b;
        ng1_2 ng1_22 = this.a;
        int n4 = ng1_22.f;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final void remove() {
        this.a();
        int n3 = this.c;
        int n4 = -1;
        if (n3 != n4) {
            ng1_2 ng1_22 = this.a;
            ng1_22.e();
            int n7 = this.c;
            ng1_22.n(n7);
            this.c = n4;
            this.d = n3 = ng1_22.h;
            return;
        }
        String string2 = "Call next() before removing element from the iterator.".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }
}

