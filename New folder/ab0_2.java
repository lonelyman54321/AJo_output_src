/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ab0
 */
public final class ab0_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ab0_2(String string2, st_1 st_12, int n3) {
        this.a = string2;
        this.b = st_12;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$buttonText");
        Function0 function0 = this.b;
        Intrinsics.checkNotNullParameter(function0, "$onButtonClicked");
        int n3 = Me3.b(this.c | 1);
        function0 = (st_1)function0;
        gb0_1.a((String)object2, (st_1)function0, (b30_0)object, n3);
        return Unit.a;
    }
}

