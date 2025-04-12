/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.willy.ratingbar.ScaleRatingBar;
import kotlin.jvm.internal.Intrinsics;

public final class SK0$a
extends RecyclerView$B {
    public final AjioRoundedCornerImageView a;
    public final TextView b;
    public final TextView c;
    public final ScaleRatingBar d;
    public final /* synthetic */ sk0_0 e;

    public SK0$a(sk0_0 object, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.e = object;
        super(view);
        int n3 = R$id.feedbackpage_item_image;
        object = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AjioRoundedCornerImageView)((Object)object);
        this.a = object;
        n3 = R$id.feedbackpage_item_brand_tv;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.b = object;
        n3 = R$id.feedbackpage_item_description_tv;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.c = object;
        n3 = R$id.feedbackpage_item_rating;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (ScaleRatingBar)((Object)object);
        this.d = object;
    }
}

