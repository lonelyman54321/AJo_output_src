/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.customviews.AddressWidgetView;
import com.ril.ajio.customviews.ChangeLocationListener;
import com.ril.ajio.services.data.Address.AddressType;
import kotlin.jvm.internal.Intrinsics;

public final class W4
extends RecyclerView$B {
    public final ChangeLocationListener a;

    public W4(View view, ChangeLocationListener changeLocationListener) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(changeLocationListener, "changeLocationListener");
        super(view);
        this.a = changeLocationListener;
    }

    public final void w(AddressType addressType, String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter((Object)addressType, "addressType");
        Intrinsics.checkNotNullParameter(string2, "address");
        Intrinsics.checkNotNullParameter(string3, "storeType");
        Intrinsics.checkNotNullParameter(string4, "pincode");
        Intrinsics.checkNotNullParameter(string5, "name");
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View view = this.itemView;
        ChangeLocationListener changeLocationListener = this.a;
        AddressWidgetView addressWidgetView = new AddressWidgetView(context, view, changeLocationListener);
        AddressWidgetView.setData$default(addressWidgetView, addressType, string2, string3, string5, string4, "plp screen", null, 64, null);
    }
}

