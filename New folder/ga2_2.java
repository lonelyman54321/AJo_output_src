/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ga2
 */
public final class ga2_2
extends RecyclerView$B {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final jo_2 e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public ga2_2(View object) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        int n3 = R$id.ic_os_assured_gift;
        Object object2 = object.findViewById(n3);
        Object object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (ImageView)object2;
        this.a = object2;
        n3 = R$id.id_os_gift_title;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (TextView)object2;
        this.b = object2;
        n3 = R$id.id_os_gift_details;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (TextView)object2;
        this.c = object2;
        n3 = R$id.id_os_view_rewards;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        object = (TextView)object;
        this.d = object;
        object2 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        AJIOApplication.Companion.getClass();
        object3 = AJIOApplication$a.a();
        super((Context)object3);
        this.e = object;
        this.f = "title";
        this.g = "description";
        this.h = "image";
        this.i = "cta_text";
        Bundle bundle = new Bundle();
        float f5 = ((jo_2)object).c();
        bundle.putFloat("amount_payable", f5);
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, "widget interaction", "free gift widget view", "", "widget_interaction", "order confirmation screen", "order confirmation screen", "", bundle, "", false, null, 1536, null);
    }
}

