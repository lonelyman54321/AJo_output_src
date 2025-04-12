/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.fragment.h;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.referral.transform.ReferralFAQTransform;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Dr2
 */
public final class dr2_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ dr2_1(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        boolean bl2;
        int n3;
        int n4 = this.a;
        object = (DataCallback)object;
        switch (n4) {
            default: {
                gg2_1 gg2_12 = (gg2_1)this.b;
                Intrinsics.checkNotNullParameter(gg2_12, "this$0");
                Object object2 = cp_1.Companion;
                int n7 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n7 == 0) return Unit.a;
                n7 = ((DataCallback)object).getStatus();
                if (n7 != 0) return Unit.a;
                object = (ReferralFAQTransform)((DataCallback)object).getData();
                object2 = gg2_12.f;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("referralViewModel");
                    n7 = 0;
                    object2 = null;
                }
                ((tH2)object2).k = object;
                n7 = 3;
                gg2_12.Oa(n7, object);
                return Unit.a;
            }
            case 0: 
        }
        h h3 = (h)this.b;
        Intrinsics.checkNotNullParameter(h3, "this$0");
        Intrinsics.checkNotNullParameter(object, "loyaltyPointCallback");
        Object object3 = h3.e;
        Object object4 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressView");
            n3 = 0;
            object3 = null;
        }
        ((PEProgressView)((Object)object3)).dismiss();
        n3 = ((DataCallback)object).getStatus();
        if (n3 != 0) {
            int n8 = ((DataCallback)object).getStatus();
            if (n8 != (n3 = 1)) return Unit.a;
            h3.D = null;
            h3.Va();
            return Unit.a;
        }
        h3.D = object = (LpStoredCardBalance)((DataCallback)object).getData();
        if (object != null && (object = ((LpStoredCardBalance)object).getError()) != null) {
            object = h3.D;
            if (object != null && (object = ((LpStoredCardBalance)object).getError()) != null) {
                object = ((Error)object).getDescription();
            } else {
                bl2 = false;
                object = null;
            }
            if (object != null) {
                h3.C = null;
            }
        }
        if ((object = h3.D) != null) {
            object3 = oo2_0.a;
            Intrinsics.checkNotNull(object);
            object3.getClass();
            bl2 = oo2_0.j((LpStoredCardBalance)object);
            if (bl2) {
                object = h3.D;
                if (object != null) {
                    object3 = Boolean.TRUE;
                    ((LpStoredCardBalance)object).setSelected((Boolean)object3);
                }
                h3.Va();
                object = h3.m;
                if (object == null) {
                    object = "numberEt";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    object4 = object;
                }
                object = h.Ra(object4.getText().toString());
                h3.Za((String)object);
                return Unit.a;
            }
        }
        h3.D = null;
        h3.Va();
        return Unit.a;
    }
}

