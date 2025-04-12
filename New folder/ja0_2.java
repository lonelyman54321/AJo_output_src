/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from JA0
 */
public final class ja0_2
implements Serializable {
    private static final JA0$a b;
    private static final long serialVersionUID;
    public final Class a;

    static {
        JA0$a jA0$a;
        b = jA0$a = new JA0$a(null);
    }

    public ja0_2(Enum[] object) {
        Intrinsics.checkNotNullParameter(object, "entries");
        object = object.getClass().getComponentType();
        Intrinsics.checkNotNull(object);
        this.a = object;
    }

    private final Object readResolve() {
        T[] TArray = this.a.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(TArray, "getEnumConstants(...)");
        return ha0_2.a((Enum[])TArray);
    }
}

