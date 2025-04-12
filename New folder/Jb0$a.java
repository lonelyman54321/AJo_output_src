/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;
import com.ril.ajio.analytics.AnalyticsUtil;
import com.ril.ajio.analytics.AnalyticsUtil$Companion;
import com.ril.ajio.analytics.MyRewardsOption;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.web.game.MyRewardsWebActivity;
import com.ril.ajio.web.game.MyRewardsWebActivity$a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Jb0$a
extends qg3_2
implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ ob0_1 b;

    public Jb0$a(Activity activity, ob0_1 ob0_12, f80_0 f80_02) {
        this.a = activity;
        this.b = ob0_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Activity activity = this.a;
        ob0_1 ob0_12 = this.b;
        object = new Jb0$a(activity, ob0_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Jb0$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Jb0$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.b;
        j90_02 = this.a;
        if (j90_02 != null) {
            object.getClass();
            Intrinsics.checkNotNullParameter((Object)j90_02, "activity");
            Object object2 = AnalyticsUtil.Companion;
            Object object3 = z40_0.Companion;
            Object object4 = j90_02.getApplication();
            String string2 = "getApplication(...)";
            Intrinsics.checkNotNullExpressionValue(object4, string2);
            object3.getClass();
            object3 = z40$a.a((Context)object4).a.b("enable_my_rewards_status");
            object2 = ((AnalyticsUtil$Companion)object2).mapperToMyRewardsOption((String)object3);
            object3 = UrlHelper.Companion.getInstance().getBaseUrl();
            Intrinsics.checkNotNull(object2);
            object4 = ((MyRewardsOption)object2).getUrlEndPoint();
            object3 = Ft2.a((String)object3, (String)object4);
            object4 = MyRewardsWebActivity.Companion;
            object2 = ((MyRewardsOption)object2).getTitle();
            object4.getClass();
            int n3 = 14;
            MyRewardsWebActivity$a.a(n3, (Activity)j90_02, (String)object3, (String)object2);
        }
        ((ob0_1)object).c("coupon bonanza - coupons list screen", "My Rewards");
        return Unit.a;
    }
}

