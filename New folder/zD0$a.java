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
import androidx.appcompat.app.AppCompatActivity;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import kotlin.jvm.internal.Intrinsics;

public final class zD0$a
extends ClickableSpan {
    public final /* synthetic */ zd0_2 a;

    public zD0$a(zd0_2 zd0_22) {
        this.a = zd0_22;
    }

    public final void onClick(View object) {
        Intrinsics.checkNotNullParameter(object, "widget");
        object = UrlHelper.Companion.getInstance();
        Object object2 = new Object[]{};
        object = ((UrlHelper)object).getApiUrl("misc", "faq_returns", object2);
        object2 = CustomWebViewActivity.Companion;
        AppCompatActivity appCompatActivity = this.a.a;
        CustomWebViewActivity$a.b((CustomWebViewActivity$a)object2, (Context)appCompatActivity, (String)object, 14);
    }
}

