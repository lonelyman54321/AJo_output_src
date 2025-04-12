/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from De3
 */
public final class de3_2
extends Lambda
implements Function1 {
    public static final de3_2 c;

    static {
        de3_2 de3_22;
        c = de3_22 = new Lambda(1);
    }

    public de3_2() {
        super(1);
    }

    public final String a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "line");
        return string2;
    }
}

