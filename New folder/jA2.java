/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.os.Bundle
 *  android.widget.RemoteViews
 */
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.clevertap.android.pushtemplates.R$id;
import com.clevertap.android.pushtemplates.R$layout;
import kotlin.jvm.internal.Intrinsics;

public final class jA2
extends ze3_0 {
    public uj3_1 b;
    public Bundle c;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final RemoteViews b(Context object, uj3_1 object2) {
        int n3;
        void var1_6;
        String string2;
        Object object3 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        String string3 = "renderer";
        Intrinsics.checkNotNullParameter(string2, string3);
        Object object4 = ((uj3_1)((Object)string2)).E;
        Bundle bundle = this.c;
        if (object4 != null) {
            Intrinsics.checkNotNull(object4);
            int n4 = ((String)object4).length();
            if (n4 != 0) {
                int n7 = R$layout.product_display_linear_expanded;
                object3 = new gA2(n7, (uj3_1)((Object)string2), (Context)object, bundle);
                RemoteViews remoteViews = ((q70_0)object3).c;
                return var1_6;
            }
        }
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(bundle, "extras");
        int n8 = R$layout.product_display_template;
        object4 = new gA2(n8, (uj3_1)((Object)string2), (Context)object, bundle);
        String string4 = ((gA2)object4).d;
        ((q70_0)object4).h(string4);
        String string5 = ((gA2)object4).f;
        ((q70_0)object4).e(string5);
        int n10 = R$id.msg;
        object3 = ((uj3_1)((Object)string2)).i;
        string3 = "#000000";
        if (object3 != null && (n3 = ((String)object3).length()) > 0) {
            bundle = ((q70_0)object4).c;
            n8 = xz3_0.h((String)object3, string3);
            bundle.setTextColor(n10, n8);
        }
        n10 = R$id.title;
        string2 = ((uj3_1)((Object)string2)).h;
        if (string2 != null && (n8 = string2.length()) > 0) {
            object3 = ((q70_0)object4).c;
            int n14 = xz3_0.h(string2, string3);
            object3.setTextColor(n10, n14);
        }
        RemoteViews remoteViews = ((q70_0)object4).c;
        return var1_6;
    }

    public final PendingIntent c(Context context, Bundle bundle, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "extras");
        uj3_1 uj3_12 = this.b;
        return sq2_1.b(context, n3, bundle, false, 28, uj3_12);
    }

    public final PendingIntent d(Context context, Bundle bundle, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "extras");
        uj3_1 uj3_12 = this.b;
        return sq2_1.b(context, n3, bundle, true, 20, uj3_12);
    }

    public final RemoteViews e(Context context, uj3_1 uj3_12) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(context, string2);
        String string3 = "renderer";
        Intrinsics.checkNotNullParameter(uj3_12, string3);
        Intrinsics.checkNotNullParameter(context, string2);
        Intrinsics.checkNotNullParameter(uj3_12, string3);
        int n3 = R$layout.content_view_small_single_line_msg;
        iA2 iA22 = new r73_0(n3, uj3_12, context);
        return iA22.c;
    }
}

