/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xD0
 */
public final class xd0_2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView$B b;

    public /* synthetic */ xd0_2(RecyclerView$B recyclerView$B, int n3) {
        this.a = n3;
        this.b = recyclerView$B;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                x71_0 x71_02 = (x71_0)this.b;
                Intrinsics.checkNotNullParameter(x71_02, "this$0");
                object = x71_02.g;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
                    n3 = 0;
                    object = null;
                }
                object = object.getContext();
                Intrinsics.checkNotNullExpressionValue(object, "getContext(...)");
                x71_02.x((Context)object);
                return;
            }
            case 0: 
        }
        object = (zd0_2)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        CustomWebViewActivity$a customWebViewActivity$a = CustomWebViewActivity.Companion;
        object = object.y.getContext();
        Intrinsics.checkNotNullExpressionValue(object, "getContext(...)");
        hv3_0.a.getClass();
        String string2 = hv3_0.t();
        CustomWebViewActivity$a.b(customWebViewActivity$a, (Context)object, string2, 18);
    }
}

