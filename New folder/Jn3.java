/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.Html
 *  android.widget.RemoteViews
 */
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.RemoteViews;
import com.clevertap.android.pushtemplates.R$id;
import com.clevertap.android.pushtemplates.R$layout;
import kotlin.jvm.internal.Intrinsics;

public final class Jn3
extends ze3_0 {
    public uj3_1 b;

    public final RemoteViews b(Context context, uj3_1 object) {
        int n3;
        int n4;
        String string2 = "context";
        Intrinsics.checkNotNullParameter(context, string2);
        String string3 = "renderer";
        Intrinsics.checkNotNullParameter(object, string3);
        Object object2 = this.g();
        if (object2 == null) {
            return null;
        }
        Integer n7 = this.g();
        Intrinsics.checkNotNullParameter(context, string2);
        Intrinsics.checkNotNullParameter(object, string3);
        int n8 = R$layout.timer;
        object2 = new In3(context, n7, (uj3_1)object, n8);
        string2 = ((uj3_1)object).r;
        ((q70_0)object2).c(string2);
        string2 = ((uj3_1)object).e;
        if (string2 != null && (n4 = string2.length()) > 0) {
            n4 = Build.VERSION.SDK_INT;
            n7 = ((q70_0)object2).c;
            int n10 = 24;
            if (n4 >= n10) {
                n4 = R$id.msg;
                string2 = jC2.a(string2);
                n7.setTextViewText(n4, string2);
            } else {
                n4 = R$id.msg;
                string2 = Html.fromHtml((String)string2);
                n7.setTextViewText(n4, string2);
            }
        }
        object = ((uj3_1)object).g;
        string2 = ((q70_0)object2).c;
        n4 = 8;
        if (object != null && (n3 = ((String)object).length()) > 0) {
            n3 = R$id.big_image;
            xz3_0.p(n3, (String)object, (RemoteViews)string2, context);
            int n14 = Xv2.c;
            if (n14 != 0) {
                n14 = R$id.big_image;
                string2.setViewVisibility(n14, n4);
            }
        } else {
            int n15 = R$id.big_image;
            string2.setViewVisibility(n15, n4);
        }
        return ((q70_0)object2).c;
    }

    public final PendingIntent c(Context context, Bundle bundle, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "extras");
        return null;
    }

    public final PendingIntent d(Context context, Bundle bundle, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "extras");
        uj3_1 uj3_12 = this.b;
        return sq2_1.b(context, n3, bundle, true, 30, uj3_12);
    }

    public final RemoteViews e(Context context, uj3_1 uj3_12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uj3_12, "renderer");
        Object object = this.g();
        if (object == null) {
            return null;
        }
        Integer n3 = this.g();
        int n4 = R$layout.timer_collapsed;
        object = new In3(context, n3, uj3_12, n4);
        return ((q70_0)object).c;
    }

    public final Integer g() {
        Object object = this.b;
        int n3 = ((uj3_1)object).v;
        int n4 = -1;
        int n7 = 10;
        if (n3 != n4 && n3 >= n7) {
            n3 = n3 * 1000 + 1000;
            object = n3;
        } else {
            int n8 = ((uj3_1)object).A;
            if (n8 >= n7) {
                n8 = n8 * 1000 + 1000;
                object = n8;
            } else {
                ak2_1.a();
                n8 = 0;
                object = null;
            }
        }
        return object;
    }
}

