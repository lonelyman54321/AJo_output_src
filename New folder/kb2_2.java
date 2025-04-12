/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kb2
 */
public final class kb2_2
implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ kb2_2(Function0 function0, u10 u102, int n3) {
        this.a = function0;
        this.b = u102;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$closeButtonClick");
        Function2 function2 = this.b;
        Intrinsics.checkNotNullParameter(function2, "$content");
        int n3 = Me3.b(this.c | 1);
        function2 = (u10)function2;
        vb2.d((Function0)object2, (u10)function2, (b30_0)object, n3);
        return Unit.a;
    }
}

