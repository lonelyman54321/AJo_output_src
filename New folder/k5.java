/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.c$a;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.jioads.mediation.partners.GooglePlayServicesRewardedInterstitial;
import com.ril.ajio.data.repo.ImpsRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class k5
implements bx0_2,
o60_0,
OnUserEarnedRewardListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k5(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.b;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                return ImpsRepo.b((j5_0)((Function1)object2), object);
            }
            case 0: 
        }
        return (c$a)oj_0.a((Function1)object2, "$tmp0", object, "p0", object);
    }

    public void onUserEarnedReward(RewardItem rewardItem) {
        GooglePlayServicesRewardedInterstitial.a((GooglePlayServicesRewardedInterstitial)this.b, rewardItem);
    }
}

