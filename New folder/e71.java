/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Home.LuxeFooterData;
import kotlin.jvm.internal.Intrinsics;

public final class e71
implements View.OnClickListener {
    public final /* synthetic */ LuxeFooterData a;
    public final /* synthetic */ f71_0 b;

    public /* synthetic */ e71(LuxeFooterData luxeFooterData, f71_0 f71_02) {
        this.a = luxeFooterData;
        this.b = f71_02;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$luxeFooterData");
        Object object2 = this.b;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object2, string2);
        object = ((LuxeFooterData)object).getLink();
        if (object != null && (object2 = ((f71_0)object2).b) != null) {
            object2.g7((String)object);
        }
    }
}

