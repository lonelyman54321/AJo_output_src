/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.widget.RemoteViews
 */
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.clevertap.android.pushtemplates.R$drawable;
import com.clevertap.android.pushtemplates.R$id;
import com.clevertap.android.pushtemplates.R$layout;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PD2
 */
public final class pd2_0
extends ze3_0 {
    public uj3_1 b;
    public Bundle c;

    public final RemoteViews b(Context object, uj3_1 object2) {
        int n3;
        Object object3;
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        String string3 = "renderer";
        Intrinsics.checkNotNullParameter(object2, string3);
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, string3);
        string3 = this.c;
        Intrinsics.checkNotNullParameter(string3, "extras");
        int n4 = R$layout.rating;
        ED2 eD2 = new ix_0(n4, (uj3_1)object2, (Context)object);
        string2 = eD2.c;
        int n7 = R$id.star1;
        int n8 = R$drawable.pt_star_outline;
        string2.setImageViewResource(n7, n8);
        string2 = eD2.c;
        n7 = R$id.star2;
        n8 = R$drawable.pt_star_outline;
        string2.setImageViewResource(n7, n8);
        string2 = eD2.c;
        n7 = R$id.star3;
        n8 = R$drawable.pt_star_outline;
        string2.setImageViewResource(n7, n8);
        string2 = eD2.c;
        n7 = R$id.star4;
        n8 = R$drawable.pt_star_outline;
        string2.setImageViewResource(n7, n8);
        string2 = eD2.c;
        n7 = R$id.star5;
        n8 = R$drawable.pt_star_outline;
        string2.setImageViewResource(n7, n8);
        n4 = 5;
        Object object4 = new int[n4];
        String string4 = null;
        for (n8 = 0; n8 < n4; ++n8) {
            int n10;
            object3 = new Random();
            object4[n8] = n10 = ((Random)object3).nextInt();
        }
        string4 = "requestCodes";
        string3.putIntArray(string4, object4);
        RemoteViews remoteViews = eD2.c;
        int n14 = R$id.star1;
        n8 = ((uj3_1)object2).Q;
        object4 = object;
        object3 = string3;
        object4 = sq2_1.b(object, n8, (Bundle)string3, false, 8, (uj3_1)object2);
        remoteViews.setOnClickPendingIntent(n14, (PendingIntent)object4);
        remoteViews = eD2.c;
        n14 = R$id.star2;
        n8 = ((uj3_1)object2).Q;
        object4 = object;
        object4 = sq2_1.b(object, n8, (Bundle)string3, false, 9, (uj3_1)object2);
        remoteViews.setOnClickPendingIntent(n14, (PendingIntent)object4);
        remoteViews = eD2.c;
        n14 = R$id.star3;
        n8 = ((uj3_1)object2).Q;
        object4 = object;
        object4 = sq2_1.b(object, n8, (Bundle)string3, false, 10, (uj3_1)object2);
        remoteViews.setOnClickPendingIntent(n14, (PendingIntent)object4);
        remoteViews = eD2.c;
        n14 = R$id.star4;
        n8 = ((uj3_1)object2).Q;
        object4 = object;
        object4 = sq2_1.b(object, n8, (Bundle)string3, false, 11, (uj3_1)object2);
        remoteViews.setOnClickPendingIntent(n14, (PendingIntent)object4);
        remoteViews = eD2.c;
        n14 = R$id.star5;
        n8 = ((uj3_1)object2).Q;
        int n15 = 12;
        object4 = object;
        object4 = sq2_1.b(object, n8, (Bundle)string3, false, n15, (uj3_1)object2);
        remoteViews.setOnClickPendingIntent(n14, (PendingIntent)object4);
        n7 = Build.VERSION.SDK_INT;
        n8 = 31;
        if (n7 >= n8) {
            object4 = eD2.c;
            n8 = R$id.tVRatingConfirmation;
            object4.setViewVisibility(n8, 0);
            n3 = ((uj3_1)object2).Q;
            object4 = "notificationId";
            string3.putInt((String)object4, n3);
            object2 = eD2.c;
            n7 = R$id.tVRatingConfirmation;
            object = np1_2.a(object, (Bundle)string3);
            object2.setOnClickPendingIntent(n7, (PendingIntent)object);
        } else {
            object = eD2.c;
            n3 = R$id.tVRatingConfirmation;
            n7 = 8;
            object.setViewVisibility(n3, n7);
        }
        object = string3.getString("extras_from", "");
        object2 = "PTReceiver";
        int n16 = Intrinsics.areEqual(object, object2);
        if (n16 != 0) {
            n7 = 1;
            object = "clickedStar";
            n3 = string3.getInt((String)object, 0);
            if (n7 == n3) {
                object2 = eD2.c;
                n7 = R$id.star1;
                n8 = R$drawable.pt_star_filled;
                object2.setImageViewResource(n7, n8);
            } else {
                object2 = eD2.c;
                n7 = R$id.star1;
                n8 = R$drawable.pt_star_outline;
                object2.setImageViewResource(n7, n8);
            }
            n3 = 2;
            n7 = string3.getInt((String)object, 0);
            if (n3 == n7) {
                object2 = eD2.c;
                n7 = R$id.star1;
                n8 = R$drawable.pt_star_filled;
                object2.setImageViewResource(n7, n8);
                object2 = eD2.c;
                n7 = R$id.star2;
                n8 = R$drawable.pt_star_filled;
                object2.setImageViewResource(n7, n8);
            } else {
                object2 = eD2.c;
                n7 = R$id.star2;
                n8 = R$drawable.pt_star_outline;
                object2.setImageViewResource(n7, n8);
            }
            n3 = 3;
            n7 = string3.getInt((String)object, 0);
            if (n3 == n7) {
                object2 = eD2.c;
                n7 = R$id.star1;
                n8 = R$drawable.pt_star_filled;
                object2.setImageViewResource(n7, n8);
                object2 = eD2.c;
                n7 = R$id.star2;
                n8 = R$drawable.pt_star_filled;
                object2.setImageViewResource(n7, n8);
                object2 = eD2.c;
                n7 = R$id.star3;
                n8 = R$drawable.pt_star_filled;
                object2.setImageViewResource(n7, n8);
            } else {
                object2 = eD2.c;
                n7 = R$id.star3;
                n8 = R$drawable.pt_star_outline;
                object2.setImageViewResource(n7, n8);
            }
            n3 = 4;
            n7 = string3.getInt((String)object, 0);
            if (n3 == n7) {
                object2 = eD2.c;
                n7 = R$id.star1;
                n8 = R$drawable.pt_star_filled;
                object2.setImageViewResource(n7, n8);
                object2 = eD2.c;
                n7 = R$id.star2;
                n8 = R$drawable.pt_star_filled;
                object2.setImageViewResource(n7, n8);
                object2 = eD2.c;
                n7 = R$id.star3;
                n8 = R$drawable.pt_star_filled;
                object2.setImageViewResource(n7, n8);
                object2 = eD2.c;
                n7 = R$id.star4;
                n8 = R$drawable.pt_star_filled;
                object2.setImageViewResource(n7, n8);
            } else {
                object2 = eD2.c;
                n7 = R$id.star4;
                n8 = R$drawable.pt_star_outline;
                object2.setImageViewResource(n7, n8);
            }
            n16 = string3.getInt((String)object, 0);
            if (n4 == n16) {
                object = eD2.c;
                n3 = R$id.star1;
                n4 = R$drawable.pt_star_filled;
                object.setImageViewResource(n3, n4);
                object = eD2.c;
                n3 = R$id.star2;
                n4 = R$drawable.pt_star_filled;
                object.setImageViewResource(n3, n4);
                object = eD2.c;
                n3 = R$id.star3;
                n4 = R$drawable.pt_star_filled;
                object.setImageViewResource(n3, n4);
                object = eD2.c;
                n3 = R$id.star4;
                n4 = R$drawable.pt_star_filled;
                object.setImageViewResource(n3, n4);
                object = eD2.c;
                n3 = R$id.star5;
                n4 = R$drawable.pt_star_filled;
                object.setImageViewResource(n3, n4);
            } else {
                object = eD2.c;
                n3 = R$id.star5;
                n4 = R$drawable.pt_star_outline;
                object.setImageViewResource(n3, n4);
            }
        }
        return eD2.c;
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
        return sq2_1.b(context, n3, bundle, false, 7, uj3_12);
    }

    public final RemoteViews e(Context context, uj3_1 uj3_12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uj3_12, "renderer");
        r73_0 r73_02 = new r73_0(context, uj3_12);
        return r73_02.c;
    }
}

