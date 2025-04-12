/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.jioads.mediation.partners.GooglePlayServicesRewarded;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from w01
 */
public final class w01_0
implements OnUserEarnedRewardListener,
o60_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ w01_0(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public void onUserEarnedReward(RewardItem rewardItem) {
        GooglePlayServicesRewarded.a((GooglePlayServicesRewarded)this.a, rewardItem);
    }
}

