/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XA2
 */
public final class xa2_2
implements Function2 {
    public final /* synthetic */ Function0 a;

    public /* synthetic */ xa2_2(Function0 function0) {
        this.a = function0;
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$onViewAllClicked");
        object2.invoke();
        return Unit.a;
    }
}

