/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

public final class kg {
    public static final boolean a(GY2 object) {
        object = ((GY2)object).i();
        TY2 tY2 = MY2.j;
        return ((zy2_0)object).a.containsKey(tY2) ^ true;
    }

    public static final boolean b(GY2 object) {
        boolean bl2;
        object = object.c.s;
        bp1_0 bp1_02 = bp1_0.Rtl;
        if (object == bp1_02) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static final xp1_0 c(xp1_0 xp1_02, Function1 function1) {
        for (xp1_02 = xp1_02.A(); xp1_02 != null; xp1_02 = xp1_02.A()) {
            Boolean bl2 = (Boolean)function1.invoke(xp1_02);
            boolean bl3 = bl2;
            if (!bl3) continue;
            return xp1_02;
        }
        return null;
    }
}

