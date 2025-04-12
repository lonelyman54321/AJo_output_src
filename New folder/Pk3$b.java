/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Pk3$b
extends Lambda
implements Function1 {
    public static final Pk3$b c;

    static {
        Pk3$b pk3$b;
        c = pk3$b = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (List)object;
        Object object2 = object.get(1);
        String string2 = "null cannot be cast to non-null type kotlin.Boolean";
        Intrinsics.checkNotNull(object2, string2);
        object2 = (Boolean)object2;
        boolean bl2 = (Boolean)object2;
        object2 = bl2 ? pg2_0.Vertical : pg2_0.Horizontal;
        object = object.get(0);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Float");
        float f5 = ((Float)object).floatValue();
        Pk3 pk3 = new Pk3((pg2_0)((Object)object2), f5);
        return pk3;
    }
}

