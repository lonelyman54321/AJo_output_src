/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/*
 * Renamed from zn3$a
 */
public final class zn3$a_0
extends FunctionReferenceImpl
implements Function0 {
    public static final zn3$a_0 a;

    static {
        zn3$a_0 zn3$a_0;
        a = zn3$a_0 = new FunctionReferenceImpl(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    public final Object invoke() {
        return System.currentTimeMillis();
    }
}

