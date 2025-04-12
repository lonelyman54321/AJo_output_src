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
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wr
 */
public final class wr_1
extends ze3_0 {
    public uj3_1 b;

    public final RemoteViews b(Context object, uj3_1 uj3_12) {
        int n3;
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        String string3 = "renderer";
        Intrinsics.checkNotNullParameter(uj3_12, string3);
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(uj3_12, string3);
        int n4 = R$layout.auto_carousel;
        vr_1 vr_12 = new ix_0(n4, uj3_12, (Context)object);
        object = uj3_12.e;
        if (object != null && (n4 = ((String)object).length()) > 0) {
            n4 = Build.VERSION.SDK_INT;
            string3 = vr_12.c;
            n3 = 24;
            if (n4 >= n3) {
                n4 = R$id.msg;
                object = jC2.a((String)object);
                string3.setTextViewText(n4, (CharSequence)object);
            } else {
                n4 = R$id.msg;
                object = Html.fromHtml((String)object);
                string3.setTextViewText(n4, (CharSequence)object);
            }
        }
        int n7 = uj3_12.N;
        string2 = vr_12.c;
        int n8 = R$id.view_flipper;
        String string4 = "setFlipInterval";
        string2.setInt(n8, string4, n7);
        object = uj3_12.k;
        Intrinsics.checkNotNull(object);
        n7 = ((ArrayList)object).size();
        string2 = null;
        for (n4 = 0; n4 < n7; ++n4) {
            string4 = vr_12.a;
            String string5 = string4.getPackageName();
            int n10 = R$layout.image_view;
            string3 = new RemoteViews(string5, n10);
            int n14 = R$id.fimg;
            Object object2 = uj3_12.k;
            Intrinsics.checkNotNull(object2);
            object2 = (String)((ArrayList)object2).get(n4);
            xz3_0.p(n14, (String)object2, (RemoteViews)string3, (Context)string4);
            n3 = (int)(Xv2.c ? 1 : 0);
            if (n3 == 0) {
                string4 = vr_12.c;
                n14 = R$id.view_flipper;
                string4.addView(n14, (RemoteViews)string3);
                continue;
            }
            ak2_1.a();
        }
        return vr_12.c;
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
        return sq2_1.b(context, n3, bundle, true, 2, uj3_12);
    }

    public final RemoteViews e(Context context, uj3_1 uj3_12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uj3_12, "renderer");
        r73_0 r73_02 = new r73_0(context, uj3_12);
        return r73_02.c;
    }
}

