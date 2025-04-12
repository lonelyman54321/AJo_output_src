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

/*
 * Renamed from BJ3
 */
public final class bj3_1
extends ze3_0 {
    public uj3_1 b;

    public final RemoteViews b(Context context, uj3_1 object) {
        int n3;
        int n4;
        String string2 = "context";
        Intrinsics.checkNotNullParameter(context, string2);
        String string3 = "renderer";
        Intrinsics.checkNotNullParameter(object, string3);
        Intrinsics.checkNotNullParameter(context, string2);
        Intrinsics.checkNotNullParameter(object, string3);
        int n7 = R$layout.zero_bezel;
        yj3_0 yj3_02 = new q70_0(n7, (uj3_1)object, context);
        yj3_02.a();
        string2 = ((uj3_1)object).c;
        yj3_02.h(string2);
        string2 = ((uj3_1)object).d;
        yj3_02.e(string2);
        string2 = ((uj3_1)object).e;
        if (string2 != null && (n4 = string2.length()) > 0) {
            n4 = Build.VERSION.SDK_INT;
            RemoteViews remoteViews = yj3_02.c;
            int n8 = 24;
            if (n4 >= n8) {
                n4 = R$id.msg;
                string2 = jC2.a(string2);
                remoteViews.setTextViewText(n4, (CharSequence)string2);
            } else {
                n4 = R$id.msg;
                string2 = Html.fromHtml((String)string2);
                remoteViews.setTextViewText(n4, (CharSequence)string2);
            }
        }
        string2 = ((uj3_1)object).h;
        yj3_02.i(string2);
        string2 = ((uj3_1)object).r;
        yj3_02.c(string2);
        string2 = ((uj3_1)object).i;
        yj3_02.f(string2);
        object = ((uj3_1)object).g;
        string2 = yj3_02.c;
        n4 = 8;
        if (object != null && (n3 = ((String)object).length()) > 0) {
            n3 = R$id.big_image;
            xz3_0.p(n3, (String)object, (RemoteViews)string2, context);
            int n10 = Xv2.c;
            if (n10 != 0) {
                n10 = R$id.big_image;
                string2.setViewVisibility(n10, n4);
            }
        } else {
            int n14 = R$id.big_image;
            string2.setViewVisibility(n14, n4);
        }
        yj3_02.g();
        return yj3_02.c;
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
        return sq2_1.b(context, n3, bundle, true, 29, uj3_12);
    }

    public final RemoteViews e(Context object, uj3_1 object2) {
        String string2;
        boolean bl2;
        String string3 = "context";
        Intrinsics.checkNotNullParameter(object, string3);
        String string4 = "renderer";
        Intrinsics.checkNotNullParameter(object2, string4);
        Object object3 = ((uj3_1)object2).t;
        int n3 = 8;
        if (object3 != null && (bl2 = Intrinsics.areEqual(object3, string2 = "text_only"))) {
            Intrinsics.checkNotNullParameter(object, string3);
            Intrinsics.checkNotNullParameter(object2, string4);
            int n4 = R$layout.cv_small_text_only;
            object3 = new aj3_1(n4, (uj3_1)object2, (Context)object);
            object = ((q70_0)object3).c;
            n4 = R$id.msg;
            object.setViewVisibility(n4, n3);
            object = ((uj3_1)object2).f;
            ((q70_0)object3).d((String)object);
            object = ((q70_0)object3).c;
        } else {
            int n7;
            Intrinsics.checkNotNullParameter(object, string3);
            Intrinsics.checkNotNullParameter(object2, string4);
            int n8 = R$layout.cv_small_zero_bezel;
            object3 = new aj3_1(n8, (uj3_1)object2, (Context)object);
            string3 = ((uj3_1)object2).d;
            ((q70_0)object3).e(string3);
            object2 = ((uj3_1)object2).g;
            string3 = ((q70_0)object3).c;
            if (object2 != null && (n7 = ((String)object2).length()) > 0) {
                n7 = R$id.big_image;
                xz3_0.p(n7, (String)object2, (RemoteViews)string3, object);
                int n10 = Xv2.c;
                if (n10 != 0) {
                    n10 = R$id.big_image;
                    string3.setViewVisibility(n10, n3);
                }
            } else {
                int n14 = R$id.big_image;
                string3.setViewVisibility(n14, n3);
            }
            object = ((q70_0)object3).c;
        }
        return object;
    }
}

