/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.ratings.fragment.RatingFeedbackFragment$setDataInView$1$onRatingsClicked$1$1;
import com.ril.ajio.services.data.Home.UserUnratedItem;
import com.ril.ajio.services.data.ratings.RatingsModel;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;

public final class ID2
implements R71 {
    public final /* synthetic */ GD2 a;

    public ID2(GD2 gD2) {
        this.a = gD2;
    }

    public final void a(float f5, int n3, Object object) {
        Object object2 = object;
        object2 = (UserUnratedItem)object;
        Intrinsics.checkNotNullParameter(object2, "data");
        GD2 gD2 = this.a;
        FragmentActivity fragmentActivity = gD2.getActivity();
        if (fragmentActivity != null) {
            String string2 = ((UserUnratedItem)object2).getImageUrl();
            String string3 = ((UserUnratedItem)object2).getBrandTitle();
            Object object3 = ((UserUnratedItem)object2).getBrandName();
            String string4 = ((UserUnratedItem)object2).getSkuId();
            String string5 = gD2.a;
            Object object4 = object2;
            Float f6 = Float.valueOf(f5);
            int n4 = 16320;
            object2 = new RatingsModel((String)object3, string3, string2, f6, string4, string5, null, null, null, null, null, null, null, null, n4, null);
            object2 = wD2$a.b(wd2_0.Companion, (RatingsModel)object2);
            object4 = gD2.i;
            if (object4 != null) {
                ((Timer)object4).cancel();
            }
            gD2.i = object4 = new Timer();
            object3 = new RatingFeedbackFragment$setDataInView$1$onRatingsClicked$1$1((wd2_0)object2, gD2, fragmentActivity);
            long l2 = 500L;
            ((Timer)object4).schedule((TimerTask)object3, l2);
        }
    }
}

