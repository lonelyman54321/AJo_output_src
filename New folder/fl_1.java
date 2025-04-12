/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Fl
 */
public final class fl_1
extends Lambda
implements Function1 {
    public static final fl_1 c;

    static {
        fl_1 fl_12;
        c = fl_12 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        return Intrinsics.areEqual(((M11)object).b, "remember");
    }
}

