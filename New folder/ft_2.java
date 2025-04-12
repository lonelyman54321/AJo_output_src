/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ft
 */
public final class ft_2
implements Function1 {
    public final Object invoke(Object object) {
        boolean bl2;
        object = (o)object;
        Intrinsics.checkNotNullParameter(object, "$this$navigate");
        object.getClass();
        zt1_0 zt1_02 = zt1_0.e;
        Intrinsics.checkNotNullParameter(zt1_02, "popUpToBuilder");
        ((o)object).d = 0;
        ((o)object).f = false;
        Dw2 dw2 = new Dw2();
        zt1_02.invoke(dw2);
        ((o)object).f = bl2 = dw2.a;
        ((o)object).g = bl2 = dw2.b;
        return Unit.a;
    }
}

