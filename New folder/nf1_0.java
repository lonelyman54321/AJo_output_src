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

/*
 * Renamed from nF1
 */
public final class nf1_0
implements View.OnClickListener {
    public final /* synthetic */ of1_0 a;
    public final /* synthetic */ LuxeFooterData b;

    public /* synthetic */ nf1_0(of1_0 of1_02, LuxeFooterData luxeFooterData) {
        this.a = of1_02;
        this.b = luxeFooterData;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$luxeFooterData");
        object = ((of1_0)object).a;
        object2 = ((LuxeFooterData)object2).getLink();
        Intrinsics.checkNotNull(object2);
        object.g7((String)object2);
    }
}

