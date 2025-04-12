/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 */
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CN
 */
public final class cn_2
extends RecyclerView$B {
    public final ImageView a;

    public cn_2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
        yn3$a yn3$a = yn3_0.a;
        Object[] objectArray = new Object[]{};
        String string2 = "initLayout";
        yn3$a.a(string2, objectArray);
        int n3 = R$id.cartBannerIv;
        view = (ImageView)view.findViewById(n3);
        this.a = view;
        int n4 = hv3_0.F();
        n3 = 1042284544;
        float f5 = 0.15625f;
        float f6 = (float)n4 * f5;
        n4 = (int)f6;
        yn3$a = this.a;
        if (yn3$a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerImv");
            n3 = 0;
            f5 = 0.0f;
            yn3$a = null;
        }
        objectArray = yn3$a.getLayoutParams();
        Intrinsics.checkNotNull(objectArray, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        objectArray = (FrameLayout.LayoutParams)objectArray;
        objectArray.height = n4;
        objectArray.width = -1;
        yn3$a.setLayoutParams((ViewGroup.LayoutParams)objectArray);
    }
}

