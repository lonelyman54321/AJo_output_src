/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TO2
 */
public final class to2_0
implements Function0 {
    public final /* synthetic */ View a;

    public /* synthetic */ to2_0(View view) {
        this.a = view;
    }

    public final Object invoke() {
        View view = this.a;
        Intrinsics.checkNotNullParameter(view, "$view");
        int n3 = R$id.selected_review_img;
        return (AjioRoundedCornerImageView)view.findViewById(n3);
    }
}

