/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.graphics.Color
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.Html
 *  android.widget.RemoteViews
 */
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.RemoteViews;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ze3
 */
public abstract class ze3_0 {
    public final uj3_1 a;

    public ze3_0(uj3_1 uj3_12) {
        Intrinsics.checkNotNullParameter(uj3_12, "renderer");
        this.a = uj3_12;
    }

    public J42 a(Context context, Bundle bundle, int n3, J42 j42) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "extras");
        Intrinsics.checkNotNullParameter(j42, "nb");
        uj3_1 uj3_12 = this.a;
        RemoteViews remoteViews = this.e(context, uj3_12);
        RemoteViews remoteViews2 = this.b(context, uj3_12);
        String string2 = uj3_12.c;
        PendingIntent pendingIntent = this.d(context, bundle, n3);
        PendingIntent pendingIntent2 = this.c(context, bundle, n3);
        return this.f(j42, remoteViews, remoteViews2, string2, pendingIntent, pendingIntent2);
    }

    public abstract RemoteViews b(Context var1, uj3_1 var2);

    public abstract PendingIntent c(Context var1, Bundle var2, int var3);

    public abstract PendingIntent d(Context var1, Bundle var2, int var3);

    public abstract RemoteViews e(Context var1, uj3_1 var2);

    public J42 f(J42 j42, RemoteViews object, RemoteViews object2, String string2, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        long l2;
        boolean bl2 = true;
        String string3 = "notificationBuilder";
        Intrinsics.checkNotNullParameter(j42, string3);
        if (pendingIntent2 != null) {
            string3 = j42.P;
            ((Notification)string3).deleteIntent = pendingIntent2;
        }
        if (object != null) {
            j42.G = object;
        }
        if (object2 != null) {
            j42.H = object2;
        }
        int n3 = Build.VERSION.SDK_INT;
        object2 = this.a;
        int n4 = 31;
        if (n3 >= n4) {
            object = object2.M;
            j42.getClass();
            object = J42.b((CharSequence)object);
            j42.q = object;
        }
        j42.P.icon = n3 = object2.u;
        object = J42.b((CharSequence)Html.fromHtml((String)string2));
        j42.e = object;
        j42.g = pendingIntent;
        object = new long[bl2];
        long l3 = 0L;
        n4 = 0;
        pendingIntent2 = null;
        object[0] = (RemoteViews)l3;
        string2 = j42.P;
        ((Notification)string2).vibrate = (long[])object;
        ((Notification)string2).when = l2 = System.currentTimeMillis();
        object = object2.H;
        if (object == null) {
            object = "#FFFFFF";
        }
        j42.D = n3 = Color.parseColor((String)object);
        j42.d(16, bl2);
        j42.d(8, bl2);
        Intrinsics.checkNotNullExpressionValue(j42, "setOnlyAlertOnce(...)");
        return j42;
    }
}

