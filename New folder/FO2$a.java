/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.reviewRatings.CustomerReviewsModel;
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class FO2$a
implements fs0_2 {
    public final /* synthetic */ EO2 a;

    public FO2$a(EO2 eO2) {
        this.a = eO2;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (DataCallback)object;
        int n3 = ((DataCallback)object).getStatus();
        EO2 eO2 = this.a;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 == n4) {
                eO2.x = n4 = eO2.x + -1;
            }
        } else {
            object = (CustomerReviewsModel)((DataCallback)object).getData();
            n3 = 0;
            object2 = null;
            if (object != null) {
                object = ((CustomerReviewsModel)object).getProductReviews();
            } else {
                boolean bl2 = false;
                object = null;
            }
            eO2.getClass();
            ArrayList<Object> arrayList = new ArrayList<Object>();
            if (object != null) {
                n3 = ((ArrayList)object).size();
                object2 = n3;
            }
            Intrinsics.checkNotNull(object2);
            n3 = (Integer)object2;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object3 = (ProductReview)((ArrayList)object).get(i3);
                Object object4 = rz3_0.Companion;
                Intrinsics.checkNotNull(object3);
                object4.getClass();
                object3 = Rz3$a.f((ProductReview)object3);
                arrayList.add(object3);
                object3 = eO2.A;
                object4 = OD2.b(arrayList);
                ((ArrayList)object3).addAll(object4);
            }
        }
        eO2.B = false;
        return Unit.a;
    }
}

