/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.dresstool.Question;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vg2
 */
public final class vg2_2
implements Function2 {
    public final /* synthetic */ Question a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ vg2_2(Question question, gv0_1 gv0_12, int n3) {
        this.a = question;
        this.b = gv0_12;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$question");
        Function1 function1 = this.b;
        Intrinsics.checkNotNullParameter(function1, "$onItemClick");
        int n3 = Me3.b(this.c | 1);
        function1 = (gv0_1)function1;
        ag2_1.a((Question)object2, (gv0_1)function1, (b30_0)object, n3);
        return Unit.a;
    }
}

