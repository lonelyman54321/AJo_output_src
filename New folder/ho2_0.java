/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.SpannableStringBuilder
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.view.View
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hO2
 */
public final class ho2_0
extends vw_0 {
    public final TextView a;
    public final Typeface b;
    public final Typeface c;

    public ho2_0(View object) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        int n3 = R$id.return_window_closed_tv;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (TextView)object;
        this.a = object;
        object = FontsManager.getInstance();
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        object = ((FontsManager)object).getTypefaceWithFont((Context)aJIOApplication, 10);
        this.b = object;
        object = FontsManager.getInstance();
        aJIOApplication = AJIOApplication$a.a();
        object = ((FontsManager)object).getTypefaceWithFont((Context)aJIOApplication, 9);
        this.c = object;
    }

    public final void w(Object object, Object object2) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.revamp.OrderDetailData");
        object = (pa2_0)object;
        String string2 = hv3_0.K(R$string.ret_ref_exchange_window_closed);
        object2 = new SpannableStringBuilder((CharSequence)string2);
        int n3 = object2.length();
        object = ((pa2_0)object).b;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.String");
        object = (String)object;
        String string3 = "";
        Typeface typeface = this.c;
        Object object3 = new AjioCustomTypefaceSpan(string3, typeface);
        int n4 = n3 + -11;
        int n7 = 34;
        object2.setSpan(object3, 0, n4, n7);
        Typeface typeface2 = this.b;
        object3 = new AjioCustomTypefaceSpan(string3, typeface2);
        object2.setSpan(object3, n4, n3, n7);
        object3 = new go2_1(this, (String)object);
        int n8 = 18;
        object2.setSpan(object3, n4, n3, n8);
        int n10 = hv3_0.m(R$color.accent_color_4);
        object3 = new ForegroundColorSpan(n10);
        object2.setSpan(object3, n4, n3, n8);
        object = this.a;
        object.setText((CharSequence)object2);
        object2 = LinkMovementMethod.getInstance();
        object.setMovementMethod((MovementMethod)object2);
    }
}

