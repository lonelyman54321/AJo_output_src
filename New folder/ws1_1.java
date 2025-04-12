/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from WS1
 */
public final class ws1_1
extends Lambda
implements Function1 {
    public static final ws1_1 c;

    static {
        ws1_1 ws1_12;
        c = ws1_12 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (o)object;
        Intrinsics.checkNotNullParameter(object, "$this$navOptions");
        ((o)object).c = true;
        return Unit.a;
    }
}

