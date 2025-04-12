/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class us3$e
extends Lambda
implements Function1 {
    public static final us3$e c;

    static {
        us3$e us3$e;
        c = us3$e = new Lambda(1);
    }

    public final Object invoke(Object object) {
        return object instanceof Number;
    }
}

