/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pq3
 */
public final class pq3_0
implements F62 {
    public final /* synthetic */ rq3 a;

    public /* synthetic */ pq3_0(rq3 rq32) {
        this.a = rq32;
    }

    public final void onChanged(Object object) {
        object = (List)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        hq3_0 hq3_02 = ((rq3)object2).c;
        if (hq3_02 != null) {
            Intrinsics.checkNotNullExpressionValue(object, "transactionTuples");
            String string2 = "httpTransactions";
            Intrinsics.checkNotNullParameter(object, string2);
            hq3_02.b = object;
            hq3_02.notifyDataSetChanged();
            object2 = ((rq3)object2).b;
            if (object2 != null) {
                int n3 = object.isEmpty();
                if (n3 != 0) {
                    n3 = 0;
                    object = null;
                } else {
                    n3 = 8;
                }
                ((wU)object2).d.setVisibility(n3);
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("transactionsBinding");
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transactionsAdapter");
        throw null;
    }
}

