/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView$Companion;
import com.ril.ajio.services.data.Home.UserUnratedItem;
import com.willy.ratingbar.BaseRatingBar;
import com.willy.ratingbar.BaseRatingBar$a;
import com.willy.ratingbar.ScaleRatingBar;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SK0
 */
public final class sk0_0
extends RecyclerView$f {
    public final ArrayList a;
    public R71 b;

    public sk0_0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final int getItemCount() {
        int n3;
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            n3 = arrayList.size();
        } else {
            n3 = 0;
            arrayList = null;
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "viewHolder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        boolean bl2 = recyclerView$B instanceof SK0$a;
        if (bl2) {
            UserUnratedItem userUnratedItem;
            object = this.a;
            if (object != null) {
                userUnratedItem = (UserUnratedItem)((ArrayList)object).get(n3);
            } else {
                n3 = 0;
                userUnratedItem = null;
            }
            recyclerView$B = (SK0$a)recyclerView$B;
            recyclerView$B.getClass();
            if (userUnratedItem != null) {
                Object object2;
                Object object3;
                object = userUnratedItem.getBrandName();
                if (object != null) {
                    object3 = ((SK0$a)recyclerView$B).b;
                    object3.setText((CharSequence)object);
                }
                if ((object = userUnratedItem.getBrandTitle()) != null) {
                    object3 = ((SK0$a)recyclerView$B).c;
                    object3.setText((CharSequence)object);
                }
                if ((object = userUnratedItem.getImageUrl()) != null) {
                    object3 = AjioRoundedCornerImageView.Companion;
                    float f5 = hv3_0.q(R$dimen.dp4);
                    ((AjioRoundedCornerImageView$Companion)object3).setRadius(f5);
                    object3 = new da$a();
                    int n4 = 1;
                    f5 = Float.MIN_VALUE;
                    ((da$a)object3).k = n4;
                    ((da$a)object3).r = n4;
                    n4 = R$string.acc_banner;
                    object2 = hv3_0.K(n4);
                    ((da$a)object3).b((String)object2);
                    ((da$a)object3).n = object;
                    object = ((SK0$a)recyclerView$B).a;
                    ((da$a)object3).u = object;
                    ((da$a)object3).a();
                }
                object = userUnratedItem.getProductRating();
                object3 = ((SK0$a)recyclerView$B).d;
                if (object != null) {
                    float f6 = ((Number)object).floatValue();
                    ((BaseRatingBar)((Object)object3)).setRating(f6);
                } else {
                    bl2 = false;
                    float f7 = 0.0f;
                    object = null;
                    ((BaseRatingBar)((Object)object3)).setRating(0.0f);
                }
                if (object3 != null) {
                    ai0_2.b((ScaleRatingBar)((Object)object3));
                }
                object2 = ((SK0$a)recyclerView$B).e;
                object = new rk0_0((sk0_0)object2, userUnratedItem, (SK0$a)recyclerView$B);
                ((BaseRatingBar)((Object)object3)).setOnRatingChangeListener((BaseRatingBar$a)object);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.rating_item_feedback_unrated;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        SK0$a sK0$a = new SK0$a(this, (View)viewGroup);
        return sK0$a;
    }
}

