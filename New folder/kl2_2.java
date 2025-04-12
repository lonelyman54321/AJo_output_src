/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.dresstool.Question;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KL2
 */
public final class kl2_2
implements Function2 {
    public final /* synthetic */ Question a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ kl2_2(Question question, xv0_2 xv0_22, int n3) {
        this.a = question;
        this.b = xv0_22;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$question");
        Function0 function0 = this.b;
        Intrinsics.checkNotNullParameter(function0, "$onNextCallback");
        int n3 = Me3.b(this.c | 1);
        function0 = (xv0_2)function0;
        ml2_1.a((Question)object2, (xv0_2)function0, (b30_0)object, n3);
        return Unit.a;
    }
}

