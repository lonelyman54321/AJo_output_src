/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Is2
 */
public abstract class is2_2
implements i90_0 {
    public final Object a;

    public is2_2(Object object) {
        Intrinsics.checkNotNullParameter(object, "context");
        this.a = object;
    }

    public abstract Object a(f80_0 var1, Object var2);

    public abstract Object b();

    public abstract Object c(f80_0 var1);

    public abstract Object d(f80_0 var1, Object var2);
}

