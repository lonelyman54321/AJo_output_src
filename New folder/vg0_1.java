/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.web.CustomWebViewActivity;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from vg0
 */
public final class vg0_1
implements Runnable {
    public final /* synthetic */ CustomWebViewActivity a;
    public final /* synthetic */ String b;

    public /* synthetic */ vg0_1(CustomWebViewActivity customWebViewActivity, String string2) {
        this.a = customWebViewActivity;
        this.b = string2;
    }

    public final void run() {
        int n3 = 1;
        Object object = CustomWebViewActivity.Companion;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        AjioTextView ajioTextView = ((CustomWebViewActivity)object).E2().toolbarHeaderView.toolbarTitleTv;
        Object object2 = StringCompanionObject.INSTANCE;
        object2 = hv3_0.K(R$string.acc_webview);
        String string2 = this.b;
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        Object object3 = Arrays.copyOf(objectArray, n3);
        object3 = String.format((String)object2, object3);
        Intrinsics.checkNotNullExpressionValue(object3, "format(...)");
        ajioTextView.setContentDescription((CharSequence)object3);
        object3 = ((CustomWebViewActivity)object).E2().toolbarHeaderView.toolbarTitleTv;
        Intrinsics.checkNotNullExpressionValue(object3, "toolbarTitleTv");
        ai0_2.a((View)object3);
    }
}

