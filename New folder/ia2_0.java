/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.payment.fragment.f;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ia2
 */
public final class ia2_0
implements Runnable {
    public final /* synthetic */ f a;

    public /* synthetic */ ia2_0(f f5) {
        this.a = f5;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = h40_0.a;
        object2 = xv$a_0.ThankYou;
        boolean bl2 = h40_0.S0((xv$a_0)((Object)object2));
        if (bl2) {
            BannerAdViewModel bannerAdViewModel = (BannerAdViewModel)((f)object).I.getValue();
            Object object3 = ((f)object).K.getValue();
            String string2 = "getValue(...)";
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            object3 = (UserInformation)object3;
            boolean bl3 = ((UserInformation)object3).isUserOnline();
            object = ((ew_2)object).a.f();
            if (object == null) {
                object = "";
            }
            bannerAdViewModel.getAdsBannerDataMiscPages((xv$a_0)((Object)object2), bl3, (String)object);
        }
    }
}

