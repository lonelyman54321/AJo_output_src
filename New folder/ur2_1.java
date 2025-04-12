/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.CheckBox
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ur2
 */
public final class ur2_1
extends rw_2 {
    public final dv_0 b;
    public final View c;
    public final CheckBox d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;

    public ur2_1(View view, dv_0 dv_02) {
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        this.b = dv_02;
        int n3 = R$id.disableLayer;
        dv_02 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(dv_02, string2);
        this.c = dv_02;
        n3 = R$id.cbWallet;
        dv_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(dv_02, string2);
        dv_02 = (CheckBox)dv_02;
        this.d = dv_02;
        n3 = R$id.tryAgainTV;
        dv_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(dv_02, string2);
        dv_02 = (TextView)dv_02;
        this.e = dv_02;
        int n4 = R$id.tvWalletName;
        View view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.f = view2;
        n4 = R$id.tvNewTag;
        view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.g = view2;
        n4 = R$id.tvWalletError;
        view = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.h = view;
        int n7 = og1_1.b();
        if (n7 != 0) {
            n7 = dv_02.getPaintFlags() | 8;
            dv_02.setPaintFlags(n7);
        }
        AnalyticsManager.Companion.getInstance().getGa().trackBannerImpressionEvent("AJIOWallet", "Ajio Cash shown");
    }
}

