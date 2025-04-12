/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from jg
 */
public final class jg_0
extends Lambda
implements Function1 {
    public static final jg_0 c;

    static {
        jg_0 jg_02;
        c = jg_02 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        TY2 tY2;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        if ((object = ((xp1_0)object).w()) == null || (bl4 = ((zy2_0)object).b) != (bl3 = true) || !(bl2 = (object = ((zy2_0)object).a).containsKey(tY2 = MY2.y))) {
            bl3 = false;
        }
        return bl3;
    }
}

