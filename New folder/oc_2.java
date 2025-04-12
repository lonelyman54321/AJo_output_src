/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oc
 */
public final class oc_2
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ oc_2(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Boolean)object;
                return Unit.a;
            }
            case 1: {
                object = (mv_2)object;
                Intrinsics.checkNotNullParameter(object, "$this$createClientPlugin");
                Object object2 = CollectionsKt.Z(((v91_0)((mv_2)object).b).a);
                Object object3 = (v91_0)((mv_2)object).b;
                List list = CollectionsKt.Z(((v91_0)object3).b);
                boolean bl2 = ((v91_0)object3).c;
                Object object4 = x03_0.a;
                W91$b w91$b = new W91$b(bl2, null);
                ((mv_2)object).a((lv_2)object4, w91$b);
                object3 = dz2_1.a;
                object4 = new W91$c((List)object2, null);
                ((mv_2)object).a((lv_2)object3, (qg3_2)object4);
                object2 = xj2_2.a;
                object3 = new W91$d(list, null);
                ((mv_2)object).a((lv_2)object2, (qg3_2)object3);
                object2 = c13_0.a;
                object3 = new W91$e(list, null);
                ((mv_2)object).a((lv_2)object2, (qg3_2)object3);
                return Unit.a;
            }
            case 0: 
        }
        object = (Throwable)object;
        yn3_0.a.e((Throwable)object);
        return Unit.a;
    }
}

