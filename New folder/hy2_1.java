/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from HY2
 */
public final class hy2_1
extends Lambda
implements Function1 {
    public static final hy2_1 c;

    static {
        hy2_1 hy2_12;
        c = hy2_12 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        boolean bl3;
        object = ((xp1_0)object).w();
        boolean bl4 = false;
        if (object != null && (bl3 = ((zy2_0)object).b) == (bl2 = true)) {
            bl4 = true;
        }
        return bl4;
    }
}

