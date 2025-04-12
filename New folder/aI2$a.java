/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ItemRatingsViewReturnOrderBinding;
import com.ril.ajio.services.data.Order.QuestionResponse;
import com.ril.ajio.services.data.Order.Rating;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.ratings.RatingsModel;
import com.ril.ajio.services.data.ratings.ReviewModel;
import com.ril.ajio.services.data.ratings.UserReviewModel;
import com.willy.ratingbar.ScaleRatingBar;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class aI2$a
extends RecyclerView$B {
    public final ItemRatingsViewReturnOrderBinding a;
    public final ScaleRatingBar b;
    public final AjioTextView c;
    public final AjioTextView d;
    public final RecyclerView e;
    public final ComposeView f;
    public final /* synthetic */ ai2_1 g;

    public aI2$a(ai2_1 object, ItemRatingsViewReturnOrderBinding itemRatingsViewReturnOrderBinding) {
        Intrinsics.checkNotNullParameter(itemRatingsViewReturnOrderBinding, "itemRatingsOrderBinding");
        this.g = object;
        object = itemRatingsViewReturnOrderBinding.getRoot();
        super((View)object);
        this.a = itemRatingsViewReturnOrderBinding;
        object = itemRatingsViewReturnOrderBinding.odItemRatingCl;
        Intrinsics.checkNotNullExpressionValue(object, "odItemRatingCl");
        this.b = object;
        object = itemRatingsViewReturnOrderBinding.odEditFeedback;
        Intrinsics.checkNotNullExpressionValue(object, "odEditFeedback");
        this.c = object;
        object = itemRatingsViewReturnOrderBinding.odCustomerImp;
        Intrinsics.checkNotNullExpressionValue(object, "odCustomerImp");
        this.d = object;
        object = itemRatingsViewReturnOrderBinding.odReviewList;
        Intrinsics.checkNotNullExpressionValue(object, "odReviewList");
        this.e = object;
        object = itemRatingsViewReturnOrderBinding.reviewComposeLayout;
        Intrinsics.checkNotNullExpressionValue(object, "reviewComposeLayout");
        this.f = object;
    }

    public static RatingsModel w(Product product, float f5, Rating rating) {
        String string2;
        String string3;
        String string4;
        String string5;
        Object object;
        Object object2 = rating;
        UserReviewModel userReviewModel = null;
        if (rating != null) {
            object = rating.brandName;
            string5 = object;
        } else {
            string5 = null;
        }
        if (product != null) {
            object = product.getName();
            string4 = object;
        } else {
            string4 = null;
        }
        String string6 = mz3_0.p(product);
        if (product != null) {
            object = product.getCode();
            string3 = object;
        } else {
            string3 = null;
        }
        if (product != null) {
            object = product.getBrickCategory();
            string2 = object;
        } else {
            string2 = null;
        }
        Object object3 = object2 != null ? (object = ((Rating)object2).userSubRatings) : null;
        Object object4 = object2 != null ? (object = ((Rating)object2).baseProductId) : null;
        Object object5 = object2 != null && (object = ((Rating)object2).questionResponse) != null ? (object = ((QuestionResponse)object).questions) : null;
        if (object2 != null) {
            userReviewModel = ((Rating)object2).review;
        }
        ReviewModel reviewModel = tE2.a(userReviewModel);
        Float f6 = Float.valueOf(f5);
        object2 = new RatingsModel(string5, string4, string6, f6, string3, "ORDER_DETAILS", (ArrayList)object3, null, string2, (String)object4, (ArrayList)object5, null, reviewModel, null, 10368, null);
        return object2;
    }
}

