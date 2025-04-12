/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LB
 */
public final class lb_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lb_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                hq_2 hq_22 = (hq_2)this.b;
                Intrinsics.checkNotNullParameter(hq_22, "this$0");
                hq_22 = hq_22.getApplication();
                jo_2 jo_22 = new jo_2((Context)hq_22);
                return jo_22;
            }
            case 0: 
        }
        Object object = (ft1_2)this.b;
        Intrinsics.checkNotNullParameter(object, "$lazyRowState");
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        object = (Js1)CollectionsKt.firstOrNull(((ft1_2)object).j().i());
        if (object != null) {
            n3 = object.getIndex();
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }
}

