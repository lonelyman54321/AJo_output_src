/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.style.ClickableSpan
 *  android.view.View
 */
import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import kotlin.jvm.internal.Intrinsics;

public final class Cy1
extends ClickableSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;

    public Cy1(String string2, gc3_2 gc3_22) {
        this.a = "T&C Click";
        this.b = string2;
        this.c = gc3_22;
    }

    public final void onClick(View object) {
        Intrinsics.checkNotNullParameter(object, "widget");
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string2 = this.b;
        String string3 = this.a;
        ((GTMEvents)object).pushButtonTapEvent("Welcome to AJIO", string3, string2);
        object = CustomWebViewActivity.Companion;
        string3 = this.c;
        CustomWebViewActivity$a.b((CustomWebViewActivity$a)object, (Context)string3, null, 13);
    }
}

