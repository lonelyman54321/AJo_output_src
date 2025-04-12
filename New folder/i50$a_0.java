/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from I50$a
 */
public final class i50$a_0
extends Lambda
implements Function0 {
    public final /* synthetic */ List c;
    public final /* synthetic */ i50_0 d;
    public final /* synthetic */ eb3_2 e;

    public i50$a_0(List list, i50_0 i50_02, eb3_2 eb3_22) {
        this.c = list;
        this.d = i50_02;
        this.e = eb3_22;
        super(0);
    }

    public final Object invoke() {
        Object object;
        Object object2 = this.c;
        int n3 = object2.size();
        int n4 = 0;
        eb3_2 eb3_22 = null;
        while (true) {
            object = this.d;
            if (n4 >= n3) break;
            Object object3 = ((xk1_0)object2.get(n4)).B();
            boolean bl2 = object3 instanceof B50;
            object3 = bl2 ? (B50)object3 : null;
            if (object3 != null) {
                Object object4 = ((i50_0)object).a;
                Object object5 = ((B50)object3).a;
                object4 = ((y50_0)object4).a((oq1_1)object5);
                object5 = ((t50)object5).b;
                r50 r502 = new r50(object5, (tg_1)object4);
                object4 = ((B50)object3).b;
                object4.invoke(r502);
            }
            object = ((i50_0)object).f;
            ((ArrayList)object).add(object3);
            ++n4;
        }
        object2 = ((i50_0)object).a;
        object2.getClass();
        K50$e k50$e = new K50$e();
        object2 = ((y50_0)object2).a;
        eb3_22 = this.e;
        K50.h((tg_1)object2, eb3_22, k50$e);
        return Unit.a;
    }
}

