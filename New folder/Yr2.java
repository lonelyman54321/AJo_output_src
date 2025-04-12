/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.SpannableStringBuilder
 *  android.view.View
 *  android.widget.CheckBox
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class Yr2
extends rw_2 {
    public final dv_0 b;
    public final co2_0 c;
    public final View d;
    public final CheckBox e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final View j;
    public final TextView k;

    public Yr2(View view, dv_0 dv_02, co2_0 object) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "paymentInfoProvider");
        super(view);
        this.b = dv_02;
        this.c = object;
        int n3 = R$id.disableLayer;
        dv_02 = view.findViewById(n3);
        object = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(dv_02, (String)object);
        this.d = dv_02;
        n3 = R$id.cbWallet;
        dv_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(dv_02, (String)object);
        dv_02 = (CheckBox)dv_02;
        this.e = dv_02;
        n3 = R$id.tvDetails;
        dv_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(dv_02, (String)object);
        dv_02 = (TextView)dv_02;
        this.f = dv_02;
        int n4 = R$id.tvWalletName;
        View view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        view2 = (TextView)view2;
        this.g = view2;
        n4 = R$id.tvNewTag;
        view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        view2 = (TextView)view2;
        this.h = view2;
        n4 = R$id.tvWalletAmountInfo;
        view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        view2 = (TextView)view2;
        this.i = view2;
        n4 = R$id.walletClick;
        view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        this.j = view2;
        n4 = R$id.tvWalletGiftCardAmount;
        view = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, (String)object);
        view = (TextView)view;
        this.k = view;
        int n7 = og1_1.b();
        if (n7 != 0) {
            n7 = dv_02.getPaintFlags() | 8;
            dv_02.setPaintFlags(n7);
        }
        AnalyticsManager.Companion.getInstance().getGa().trackBannerImpressionEvent("AJIOWallet", "Ajio Cash shown");
    }

    public static SpannableStringBuilder w(String object, String string2, String string3) {
        FontsManager fontsManager = FontsManager.getInstance();
        AJIOApplication.Companion.getClass();
        Object object2 = AJIOApplication$a.a();
        fontsManager = fontsManager.getTypefaceWithFont((Context)object2, 10);
        Intrinsics.checkNotNullExpressionValue(fontsManager, "getTypefaceWithFont(...)");
        object2 = StringCompanionObject.INSTANCE;
        int n3 = 2;
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        objectArray[1] = string3;
        object = xh2_0.a(objectArray, n3, object, "format(...)");
        int n4 = StringsKt.O(object, "of", 0, false, 6);
        string3 = new SpannableStringBuilder((CharSequence)object);
        object = new AjioCustomTypefaceSpan("", (Typeface)fontsManager);
        string3.setSpan(object, 0, n4, 34);
        return string3;
    }
}

