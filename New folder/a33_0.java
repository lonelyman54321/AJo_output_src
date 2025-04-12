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
 * Renamed from A33
 */
public final class a33_0
implements View.OnClickListener {
    public final /* synthetic */ b33_0 a;

    public /* synthetic */ a33_0(b33_0 b33_02) {
        this.a = b33_02;
    }

    public final void onClick(View object) {
        boolean bl2;
        object = "this$0";
        b33_0 b33_02 = this.a;
        Intrinsics.checkNotNullParameter(b33_02, (String)object);
        b33_02.R = bl2 = true;
        ImageView imageView = b33_02.x;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
            imageView = null;
        }
        imageView.setVisibility(8);
        b33_02.B(bl2);
    }
}

