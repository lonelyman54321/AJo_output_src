/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.FrameLayout
 */
import android.view.View;
import android.widget.FrameLayout;
import com.ril.ajio.R$id;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class WO2
implements Function0 {
    public final /* synthetic */ View a;

    public /* synthetic */ WO2(View view) {
        this.a = view;
    }

    public final Object invoke() {
        View view = this.a;
        Intrinsics.checkNotNullParameter(view, "$view");
        int n3 = R$id.review_img_bg;
        return (FrameLayout)view.findViewById(n3);
    }
}

