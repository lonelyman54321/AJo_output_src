/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 */
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hi2
 */
public final class hi2_1
implements View.OnClickListener {
    public final /* synthetic */ li2_2 a;

    public /* synthetic */ hi2_1(li2_2 li2_22) {
        this.a = li2_22;
    }

    public final void onClick(View view) {
        li2_2 li2_22 = this.a;
        Intrinsics.checkNotNullParameter(li2_22, "this$0");
        ImageView imageView = li2_22.n;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
            imageView = null;
        }
        ai0_2.B((View)imageView);
        if (view != null) {
            ai0_2.i(view);
        }
        li2_22.B(false);
    }
}

