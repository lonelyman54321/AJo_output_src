/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.style.ClickableSpan
 *  android.text.style.URLSpan
 *  android.view.View
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Dv3
 */
public final class dv3_0
extends ClickableSpan {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ URLSpan b;
    public final /* synthetic */ int c;

    public dv3_0(TextView textView, URLSpan uRLSpan) {
        this.a = textView;
        this.b = uRLSpan;
        this.c = 17;
    }

    public final void onClick(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        object = CustomWebViewActivity.Companion;
        Context context = this.a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Object object2 = this.b;
        object2 = object2 != null ? object2.getURL() : null;
        int n3 = this.c;
        CustomWebViewActivity$a.b((CustomWebViewActivity$a)object, context, (String)object2, n3);
    }
}

