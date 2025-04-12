/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Wa
 */
public final class wa_1
implements Function1 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ j7_0 b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ wa_1(p83_0 p83_02, j7_0 j7_02, Ref$ObjectRef ref$ObjectRef) {
        this.a = p83_02;
        this.b = j7_02;
        this.c = ref$ObjectRef;
    }

    public final Object invoke(Object object) {
        object = (dt1_0)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$expandableList");
        j7_0 j7_02 = this.b;
        Intrinsics.checkNotNullParameter(j7_02, "$viewModel");
        Ref$ObjectRef ref$ObjectRef = this.c;
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$path");
        Intrinsics.checkNotNullParameter(object, "$this$LazyColumn");
        int n3 = ((p83_0)object2).size();
        eb$c eb$c = new eb$c((p83_0)object2, j7_02, ref$ObjectRef);
        object2 = new u10(-396071606, eb$c, true);
        bt1.b((dt1_0)object, n3, null, (u10)object2, 6);
        object2 = x10_0.a;
        bt1.a((dt1_0)object, null, (gx0_2)object2, 3);
        return Unit.a;
    }
}

