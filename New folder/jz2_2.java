/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from JZ2
 */
public final class jz2_2
extends FunctionReferenceImpl
implements Function1 {
    public static final jz2_2 a;

    static {
        jz2_2 jz2_22;
        a = jz2_22 = new jz2_2();
    }

    public jz2_2() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    public final Object invoke(Object object) {
        object = (Iterable)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return object.iterator();
    }
}

