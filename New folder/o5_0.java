/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.referral.transform.ReferralFAQTransform;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from O5
 */
public final class o5_0
implements Function1 {
    public final /* synthetic */ q5_0 a;

    public /* synthetic */ o5_0(q5_0 q5_02) {
        this.a = q5_02;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        q5_0 q5_02 = this.a;
        Intrinsics.checkNotNullParameter(q5_02, "this$0");
        Object object2 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n3 != 0 && (n3 = ((DataCallback)object).getStatus()) == 0) {
            object = (ReferralFAQTransform)((DataCallback)object).getData();
            object2 = q5_02.e;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ajioWalletVM");
                n3 = 0;
                object2 = null;
            }
            ((wc_1)object2).l = object;
            n3 = 4;
            q5_02.Oa(n3, object);
        }
        return Unit.a;
    }
}

