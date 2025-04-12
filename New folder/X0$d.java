/*
 * Decompiled with CFR 0.152.
 */
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

public final class X0$d
extends x0_0
implements RandomAccess {
    public final x0_0 b;
    public final int c;
    public final int d;

    public X0$d(x0_0 x0_02, int n3, int n4) {
        Intrinsics.checkNotNullParameter(x0_02, "list");
        this.b = x0_02;
        this.c = n3;
        X0$a x0$a = x0_0.a;
        int n7 = x0_02.a();
        x0$a.getClass();
        X0$a.d(n3, n4, n7);
        this.d = n4 -= n3;
    }

    public final int a() {
        return this.d;
    }

    public final Object get(int n3) {
        X0$a x0$a = x0_0.a;
        int n4 = this.d;
        x0$a.getClass();
        X0$a.b(n3, n4);
        int n7 = this.c + n3;
        return this.b.get(n7);
    }
}

