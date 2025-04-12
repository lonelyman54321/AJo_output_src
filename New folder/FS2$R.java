/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class FS2$R
extends Lambda
implements Function1 {
    public static final FS2$R c;

    static {
        FS2$R fS2$R;
        c = fS2$R = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = object != null ? (String)object : null;
        Intrinsics.checkNotNull(object);
        fb3_1 fb3_12 = new fb3_1((String)object);
        return fb3_12;
    }
}

