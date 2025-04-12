/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.l;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wq3
 */
public final class wq3_0
implements F62 {
    public final /* synthetic */ aq3_0 a;

    public /* synthetic */ wq3_0(aq3_0 aq3_02) {
        this.a = aq3_02;
    }

    public final void onChanged(Object object) {
        object = (Pair)object;
        aq3_0 aq3_02 = this.a;
        Intrinsics.checkNotNullParameter(aq3_02, "this$0");
        HttpTransaction httpTransaction = (HttpTransaction)((Pair)object).a;
        object = (Boolean)((Pair)object).b;
        boolean n3 = (Boolean)object;
        if (httpTransaction != null) {
            l l2 = nu1_0.a(aq3_02);
            bq3_0 bq3_02 = new bq3_0(aq3_02, httpTransaction, n3, null);
            int n4 = 3;
            Ae3.d(l2, null, null, bq3_02, n4);
        }
    }
}

