/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.customviews.AddressWidgetView;
import com.ril.ajio.services.data.Address.AddressType;

public final class i5
implements View.OnClickListener {
    public final /* synthetic */ AddressWidgetView a;
    public final /* synthetic */ AddressType b;
    public final /* synthetic */ String c;

    public /* synthetic */ i5(AddressWidgetView addressWidgetView, AddressType addressType, String string2) {
        this.a = addressWidgetView;
        this.b = addressType;
        this.c = string2;
    }

    public final void onClick(View view) {
        AddressType addressType = this.b;
        String string2 = this.c;
        AddressWidgetView.a(this.a, addressType, string2, view);
    }
}

