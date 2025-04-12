/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.FloatCompanionObject;

public final class Rj {
    public static final kl_1 a;
    public static final ll_1 b;
    public static final ml_2 c;
    public static final nl_2 d;
    public static final kl_1 e;
    public static final ll_1 f;
    public static final ml_2 g;
    public static final nl_2 h;

    static {
        Ol ol;
        float f5 = 1.0f / 0.0f;
        a = ol = new kl_1(f5);
        ol = new ll_1(f5, f5);
        b = ol;
        ol = new ml_2(f5, f5, f5);
        c = ol;
        ol = new nl_2(f5, f5, f5, f5);
        d = ol;
        f5 = -1.0f / 0.0f;
        e = ol = new kl_1(f5);
        ol = new ll_1(f5, f5);
        f = ol;
        ol = new ml_2(f5, f5, f5);
        g = ol;
        ol = new nl_2(f5, f5, f5, f5);
        h = ol;
    }

    public static Lj a(float f5) {
        Float f6 = Float.valueOf(f5);
        Object object = FloatCompanionObject.INSTANCE;
        object = ya3_0.a;
        Float f7 = Float.valueOf(0.01f);
        Lj lj = new Lj((Object)f6, (Ws3)object, (Object)f7, 8);
        return lj;
    }
}

