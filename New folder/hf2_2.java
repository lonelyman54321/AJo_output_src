/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hf2
 */
public final class hf2_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ qz1_2 d;
    public final /* synthetic */ int e;

    public /* synthetic */ hf2_2(String string2, sb2_1 sb2_12, b7_0 b7_02, qz1_2 qz1_22, int n3) {
        this.a = string2;
        this.b = sb2_12;
        this.c = b7_02;
        this.d = qz1_22;
        this.e = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$title");
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$onNeedHelpClicked");
        object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$onChatClicked");
        qz1_2 qz1_22 = this.d;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        int n3 = Me3.b(this.e | 1);
        Object object4 = object;
        object4 = (sb2_1)object;
        Object object5 = object2;
        object5 = (b7_0)object2;
        qf2_0.b(string2, (sb2_1)object4, (b7_0)object5, qz1_22, (b30_0)object3, n3);
        return Unit.a;
    }
}

