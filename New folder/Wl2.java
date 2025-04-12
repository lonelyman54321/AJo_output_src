/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class Wl2 {
    public static final Ml2 a(Ml2 object, zj3_0 object2, Object object3) {
        Object object4 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        String string2 = "terminalSeparatorType";
        Intrinsics.checkNotNullParameter(object2, string2);
        Intrinsics.checkNotNullParameter(object3, "item");
        xl2_0 xl2_02 = new xl2_0(null, object3);
        Intrinsics.checkNotNullParameter(object, (String)object4);
        Intrinsics.checkNotNullParameter(object2, string2);
        object3 = "generator";
        Intrinsics.checkNotNullParameter(xl2_02, (String)object3);
        es0_2 es0_22 = ((Ml2)object).a;
        Intrinsics.checkNotNullParameter(es0_22, (String)object4);
        Intrinsics.checkNotNullParameter(object2, string2);
        Intrinsics.checkNotNullParameter(xl2_02, (String)object3);
        object4 = new tZ2(xl2_02, null);
        object3 = new qZ2((zj3_0)((Object)object2), (tZ2)object4);
        object2 = new sz2_0(es0_22, (qZ2)object3);
        object3 = ll2_0.c;
        object4 = ((Ml2)object).b;
        object = ((Ml2)object).c;
        Ml2 ml2 = new Ml2((es0_2)object2, (tu3)object4, (z61)object, (Function0)object3);
        return ml2;
    }
}

