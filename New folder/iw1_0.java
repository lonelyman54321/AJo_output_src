/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iW1
 */
public final class iw1_0
implements View.OnClickListener {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ iw1_0(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final void onClick(View object) {
        boolean bl2;
        boolean bl3;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = ((ex1_0)object2).t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
            bl3 = false;
            object = null;
        }
        if (bl3 = ((wx1_1)object).g(bl2 = ((ex1_0)object2).pb())) {
            bl2 = false;
            object = new kw1_0((Fragment)object2, 0);
            object2 = ((ex1_0)object2).g;
            ((lq2_1)object2).a((Function1)object);
        } else {
            ((ex1_0)object2).onNavigationClick();
        }
    }
}

