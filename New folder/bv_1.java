/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.dresstool.Question;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bv
 */
public final class bv_1
implements Function2 {
    public final /* synthetic */ Question a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ bv_1(Question question, u2_0 u2_02, int n3) {
        this.a = question;
        this.b = u2_02;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$question");
        Function0 function0 = this.b;
        Intrinsics.checkNotNullParameter(function0, "$onNextClick");
        int n3 = Me3.b(this.c | 1);
        function0 = (u2_0)function0;
        cv_1.a((Question)object2, (u2_0)function0, (b30_0)object, n3);
        return Unit.a;
    }
}

