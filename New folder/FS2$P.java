/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class FS2$P
extends Lambda
implements Function1 {
    public static final FS2$P c;

    static {
        FS2$P fS2$P;
        c = fS2$P = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = object != null ? (String)object : null;
        Intrinsics.checkNotNull(object);
        hx3 hx32 = new hx3((String)object);
        return hx32;
    }
}

