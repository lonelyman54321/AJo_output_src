/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.data.repo.CategoryNavigationRepo;
import com.ril.ajio.services.data.ratings.RatingsModel;
import com.willy.ratingbar.BaseRatingBar;
import com.willy.ratingbar.BaseRatingBar$a;
import com.willy.ratingbar.ScaleRatingBar;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vQ
 */
public final class vq_1
implements bx0_2,
o60_0,
BaseRatingBar$a {
    public final /* synthetic */ Object a;

    public /* synthetic */ vq_1(Object object) {
        this.a = object;
    }

    public void a(float f5, boolean bl2) {
        Object object;
        wd2_0 wd2_02 = (wd2_0)this.a;
        Intrinsics.checkNotNullParameter(wd2_02, "this$0");
        Object object2 = wd2_02.getView();
        if (object2 != null) {
            ai0_2.j((View)object2);
        }
        if ((object2 = wd2_02.h) != null) {
            float f6 = 1.0f;
            ((BaseRatingBar)((Object)object2)).setMinimumStars(f6);
        }
        if ((object2 = wd2_02.b) != null) {
            Float f7 = Float.valueOf(f5);
            ((RatingsModel)object2).setProductRating(f7);
        }
        wd2_02.q = object = Float.valueOf(f5);
        wd2_02.fb();
        object = wd2_02.h;
        if (object != null) {
            ai0_2.b((ScaleRatingBar)((Object)object));
        }
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        return CategoryNavigationRepo.a((uq_1)((Function1)this.a), object);
    }
}

