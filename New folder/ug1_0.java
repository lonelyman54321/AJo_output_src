/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ug1
 */
public final class ug1_0 {
    public final xc1_1 a;

    public ug1_0(int n3) {
        xc1_1 xc1_12;
        super(n3);
        this.a = xc1_12;
    }

    public final void a(Object object, String string2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(object, "value");
        this.a.put(string2, object);
    }

    public final Object b(String string2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        return this.a.get(string2);
    }

    public final Object c(String string2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        return this.a.remove(string2);
    }
}

