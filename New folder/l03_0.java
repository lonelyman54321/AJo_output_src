/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from l03
 */
public final class l03_0 {
    public static final g03_0 a;
    public static final g03_0 b;
    public static final om2_2 c;
    public static final om2_2 d;

    static {
        int n3 = 1;
        Object object = new ft0_1(n3);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = cj_1.a;
        g03_0 g03_02 = bl2 ? new xu_1((Function1)object) : new a40_0((Function1)object);
        a = g03_02;
        object = new gt0_1(n3);
        Intrinsics.checkNotNullParameter(object, string2);
        Object object2 = bl2 ? new xu_1((Function1)object) : new a40_0((Function1)object);
        b = object2;
        object2 = new Object();
        Intrinsics.checkNotNullParameter(object2, string2);
        object = bl2 ? new zu_1((Function2)object2) : new b40_0((Function2)object2);
        c = object;
        object2 = new Object();
        Intrinsics.checkNotNullParameter(object2, string2);
        object = bl2 ? new zu_1((Function2)object2) : new b40_0((Function2)object2);
        d = object;
    }
}

