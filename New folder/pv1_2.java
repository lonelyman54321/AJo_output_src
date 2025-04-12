/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Login.LoginSignupBenefitsBannerData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PV1
 */
public final class pv1_2
implements Function1 {
    public final /* synthetic */ qv1_2 a;

    public /* synthetic */ pv1_2(qv1_2 qv1_22) {
        this.a = qv1_22;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        Object object2 = qv1_2.Companion;
        object2 = this.a;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNull(object);
        object2.getClass();
        int n3 = ((DataCallback)object).getStatus();
        if (n3 == 0 && (object = (LoginSignupBenefitsBannerData)((DataCallback)object).getData()) != null) {
            object3 = ((qv1_2)object2).h;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoginViewModel");
                n3 = 0;
                object3 = null;
            }
            object3.getClass();
            object3 = "data";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            n3 = 1;
            vl0_0.a = n3;
            vl0_0.b = object;
            ((qv1_2)object2).gb((LoginSignupBenefitsBannerData)object);
        }
        return Unit.a;
    }
}

