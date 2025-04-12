/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from dw1$a
 */
public final class dw1$a_0
extends Lambda
implements Function0 {
    public static final dw1$a_0 c;

    static {
        dw1$a_0 dw1$a_0;
        c = dw1$a_0 = new Lambda(0);
    }

    public final Object invoke() {
        String string2 = "CompositionLocal LocalLifecycleOwner not present".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }
}

