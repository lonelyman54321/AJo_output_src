/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.databinding.FragmentStoreLandingPageBinding;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Yc3
 */
public final class yc3_1
implements Runnable {
    public final /* synthetic */ ed3_2 a;

    public /* synthetic */ yc3_1(ed3_2 ed3_22) {
        this.a = ed3_22;
    }

    public final void run() {
        Object object = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((ed3_2)object).s;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            object = null;
        }
        object = ((FragmentStoreLandingPageBinding)object).errorContainer.pageErrorHomePageLyt;
        Intrinsics.checkNotNullExpressionValue(object, "pageErrorHomePageLyt");
        ai0_2.a((View)object);
    }
}

