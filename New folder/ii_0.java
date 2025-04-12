/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ii
 */
public final class ii_0
extends Lambda
implements Function0 {
    public static final ii_0 c;

    static {
        ii_0 ii_02;
        c = ii_02 = new Lambda(0);
    }

    public final Object invoke() {
        return UUID.randomUUID();
    }
}

