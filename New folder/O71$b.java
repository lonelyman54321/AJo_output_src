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

public final class O71$b
extends RecyclerView$B {
    public final AjioRoundedCornerImageView a;
    public final TextView b;
    public final TextView c;
    public final ScaleRatingBar d;
    public final TextView e;
    public final TextView f;
    public final /* synthetic */ o71_0 g;

    public O71$b(o71_0 object, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.g = object;
        super(view);
        int n3 = R$id.homepage_item_image;
        object = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AjioRoundedCornerImageView)((Object)object);
        this.a = object;
        n3 = R$id.homepage_item_brand_tv;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.b = object;
        n3 = R$id.homepage_item_description_tv;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.c = object;
        n3 = R$id.homepage_item_rating;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (ScaleRatingBar)((Object)object);
        this.d = object;
        n3 = R$id.homepage_rating_experience;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.e = object;
        n3 = R$id.homepage_rating_submitted;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.f = object;
    }
}

