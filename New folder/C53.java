/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class C53
implements ag3_0 {
    public final String a;
    public final Object[] b;

    public C53(String string2) {
        Intrinsics.checkNotNullParameter(string2, "query");
        this(string2, null);
    }

    public C53(String string2, Object[] objectArray) {
        Intrinsics.checkNotNullParameter(string2, "query");
        this.a = string2;
        this.b = objectArray;
    }

    public final String a() {
        return this.a;
    }

    public final void b(zg3_2 zg3_22) {
        Intrinsics.checkNotNullParameter(zg3_22, "statement");
        Object[] objectArray = this.b;
        C53$a.a(zg3_22, objectArray);
    }
}

