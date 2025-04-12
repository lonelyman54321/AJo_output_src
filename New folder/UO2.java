/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 */
import android.view.View;
import android.widget.ImageView;
import com.ril.ajio.R$id;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class UO2
implements Function0 {
    public final /* synthetic */ View a;

    public /* synthetic */ UO2(View view) {
        this.a = view;
    }

    public final Object invoke() {
        View view = this.a;
        Intrinsics.checkNotNullParameter(view, "$view");
        int n3 = R$id.review_img_retry;
        return (ImageView)view.findViewById(n3);
    }
}

