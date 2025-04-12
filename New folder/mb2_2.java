/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mb2
 */
public final class mb2_2
implements Function2 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ mb2_2(u10 u102, u10 u103, int n3) {
        this.a = u102;
        this.b = u103;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$alwaysVisibleContent");
        Function2 function2 = this.b;
        Intrinsics.checkNotNullParameter(function2, "$expandableContent");
        int n3 = Me3.b(this.c | 1);
        object2 = (u10)object2;
        function2 = (u10)function2;
        vb2.f((u10)object2, (u10)function2, (b30_0)object, n3);
        return Unit.a;
    }
}

