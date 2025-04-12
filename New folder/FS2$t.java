/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class FS2$t
extends Lambda
implements Function1 {
    public static final FS2$t c;

    static {
        FS2$t fS2$t;
        c = fS2$t = new Lambda(1);
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.String");
        object = (String)object;
        object = jt2_0.a.b((String)object);
        hw1 hw12 = new hw1((Locale)object);
        return hw12;
    }
}

