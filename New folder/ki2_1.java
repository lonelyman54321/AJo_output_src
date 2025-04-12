/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ki2
 */
public final class ki2_1
implements Function2 {
    public final /* synthetic */ li2_2 a;

    public /* synthetic */ ki2_1(li2_2 li2_22) {
        this.a = li2_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        li2_2 li2_22 = this.a;
        Intrinsics.checkNotNullParameter(li2_22, "this$0");
        Intrinsics.checkNotNullParameter(object, "brandCode");
        Intrinsics.checkNotNullParameter(object2, "brandName");
        li2_22.c.F8((String)object, (String)object2);
        return Unit.a;
    }
}

