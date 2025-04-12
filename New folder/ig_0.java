/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ig
 */
public final class ig_0
extends Lambda
implements Function2 {
    public static final ig_0 c;

    static {
        ig_0 ig_02;
        c = ig_02 = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (GY2)object;
        object2 = (GY2)object2;
        object = ((GY2)object).d;
        TY2 tY2 = MY2.o;
        Lambda lambda = gg_0.c;
        float f5 = ((Number)((zy2_0)object).d(tY2, (Function0)((Object)lambda))).floatValue();
        object2 = ((GY2)object2).d;
        lambda = hg_0.c;
        float f6 = ((Number)((zy2_0)object2).d(tY2, (Function0)((Object)lambda))).floatValue();
        return Float.compare(f5, f6);
    }
}

