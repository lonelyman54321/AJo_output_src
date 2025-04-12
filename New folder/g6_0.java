/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Login.LoginSignupBenefitsBannerData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from G6
 */
public final class g6_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g6_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (UY2)object;
                Intrinsics.checkNotNullParameter(object, "$this$semantics");
                String string2 = (String)this.b;
                RY2.e((UY2)object, string2);
                return Unit.a;
            }
            case 0: 
        }
        object = (LoginSignupBenefitsBannerData)object;
        Object object2 = (oa1_1)this.b;
        String string3 = "$loginViewModel";
        Intrinsics.checkNotNullParameter(object2, string3);
        if (object != null) {
            boolean bl2;
            Z6.f = bl2 = true;
            object2.getClass();
            Intrinsics.checkNotNullParameter(object, "data");
            vl0_0.a = bl2;
            vl0_0.b = object;
            object = ((LoginSignupBenefitsBannerData)object).getAppLoginBannerUrl();
            object2 = Z6.d;
            ((h83_0)object2).setValue(object);
        }
        return Unit.a;
    }
}

