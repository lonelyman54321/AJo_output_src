/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cf2
 */
public final class cf2_1
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ int g;

    public /* synthetic */ cf2_1(qz1_2 qz1_22, String string2, rb2_1 rb2_12, sb2_1 sb2_12, b7_0 b7_02, u10 u102, int n3) {
        this.a = qz1_22;
        this.b = string2;
        this.c = rb2_12;
        this.d = sb2_12;
        this.e = b7_02;
        this.f = u102;
        this.g = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$title");
        object = this.c;
        Intrinsics.checkNotNullParameter(object, "$onBackPressed");
        object2 = this.d;
        Intrinsics.checkNotNullParameter(object2, "$onNeedHelpClicked");
        Object object4 = this.e;
        Intrinsics.checkNotNullParameter(object4, "$onChatClicked");
        Object object5 = this.f;
        Intrinsics.checkNotNullParameter(object5, "$content");
        int n3 = Me3.b(this.g | 1);
        object = (rb2_1)object;
        object2 = (sb2_1)object2;
        Function0 function0 = object4;
        function0 = (b7_0)object4;
        Function2 function2 = object5;
        function2 = (u10)object5;
        object4 = object;
        object5 = object2;
        qf2_0.a(qz1_22, string2, (rb2_1)object, (sb2_1)object2, (b7_0)function0, (u10)function2, (b30_0)object3, n3);
        return Unit.a;
    }
}

