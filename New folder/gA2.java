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

public class gA2
extends q70_0 {
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public gA2(int n3, uj3_1 uj3_12, Context context, Bundle bundle) {
        RemoteViews remoteViews;
        int n4;
        RemoteViews remoteViews2;
        int n7;
        Object object;
        int n8;
        Object object2;
        gA2 gA22 = this;
        uj3_1 uj3_13 = uj3_12;
        Context context2 = context;
        Bundle bundle2 = bundle;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uj3_12, "renderer");
        Object object3 = "extras";
        Intrinsics.checkNotNullParameter(bundle, (String)object3);
        super(n3, uj3_12, context);
        Object object4 = uj3_12.m;
        Intrinsics.checkNotNull(object4);
        int n10 = 0;
        Object object5 = null;
        object4 = ((ArrayList)object4).get(0);
        String string2 = "get(...)";
        Intrinsics.checkNotNullExpressionValue(object4, string2);
        this.d = object4 = (String)object4;
        object4 = uj3_12.o;
        Intrinsics.checkNotNull(object4);
        object4 = ((ArrayList)object4).get(0);
        Intrinsics.checkNotNullExpressionValue(object4, string2);
        this.e = object4 = (String)object4;
        object4 = uj3_12.n;
        Intrinsics.checkNotNull(object4);
        object4 = ((ArrayList)object4).get(0);
        Intrinsics.checkNotNullExpressionValue(object4, string2);
        this.f = object4 = (String)object4;
        object4 = uj3_12.l;
        Intrinsics.checkNotNull(object4);
        object4 = ((ArrayList)object4).get(0);
        Intrinsics.checkNotNullExpressionValue(object4, string2);
        this.g = object4 = (String)object4;
        object4 = bundle.getString("extras_from", "");
        ArrayList<Context> arrayList = "PTReceiver";
        int n14 = Intrinsics.areEqual(object4, arrayList);
        if (n14 != 0) {
            object4 = "pt_current_position";
            n14 = bundle.getInt((String)object4, 0);
            arrayList = uj3_12.m;
            Intrinsics.checkNotNull(arrayList);
            arrayList = (String)arrayList.get(n14);
            this.d = arrayList;
            arrayList = uj3_12.o;
            Intrinsics.checkNotNull(arrayList);
            arrayList = (String)arrayList.get(n14);
            this.e = arrayList;
            arrayList = uj3_12.n;
            Intrinsics.checkNotNull(arrayList);
            arrayList = (String)arrayList.get(n14);
            this.f = arrayList;
            arrayList = uj3_12.l;
            Intrinsics.checkNotNull(arrayList);
            arrayList = (String)arrayList.get(n14);
            this.g = arrayList;
        } else {
            n14 = 0;
            object4 = null;
        }
        this.a();
        arrayList = uj3_13.m;
        Intrinsics.checkNotNull(arrayList);
        int n15 = arrayList.isEmpty();
        int n16 = 1;
        if ((n15 ^= n16) != 0) {
            n15 = R$id.product_name;
            object2 = gA22.d;
            gA22.j(n15, (String)object2);
        }
        arrayList = uj3_13.o;
        Intrinsics.checkNotNull(arrayList);
        n15 = arrayList.isEmpty() ^ n16;
        if (n15 != 0) {
            n15 = R$id.product_price;
            object2 = gA22.e;
            gA22.j(n15, (String)object2);
        }
        arrayList = uj3_13.r;
        gA22.c((String)((Object)arrayList));
        n15 = R$id.product_action;
        object2 = uj3_13.p;
        if (object2 != null && (n8 = ((String)object2).length()) > 0) {
            n8 = Build.VERSION.SDK_INT;
            object = gA22.c;
            n7 = 24;
            if (n8 >= n7) {
                object2 = jC2.a((String)object2);
                object.setTextViewText(n15, (CharSequence)object2);
            } else {
                object2 = Html.fromHtml((String)object2);
                object.setTextViewText(n15, (CharSequence)object2);
            }
        }
        n15 = R$id.product_action;
        object2 = uj3_13.q;
        if (object2 != null && (n8 = ((String)object2).length()) > 0) {
            remoteViews2 = gA22.c;
            n4 = xz3_0.h((String)object2, "#FFBB33");
            object = "setBackgroundColor";
            remoteViews2.setInt(n15, (String)object, n4);
        }
        n15 = R$id.product_action;
        object2 = uj3_13.G;
        if (object2 != null && (n8 = ((String)object2).length()) > 0) {
            remoteViews2 = gA22.c;
            object = "#FFFFFF";
            n4 = xz3_0.h((String)object2, (String)object);
            remoteViews2.setTextColor(n15, n4);
        }
        Intrinsics.checkNotNullParameter(bundle2, (String)object3);
        object3 = new ArrayList();
        arrayList = R$id.small_image1;
        ((ArrayList)object3).add(arrayList);
        arrayList = R$id.small_image2;
        ((ArrayList)object3).add(arrayList);
        n15 = R$id.small_image3;
        arrayList = n15;
        ((ArrayList)object3).add(arrayList);
        arrayList = new ArrayList<Context>();
        object2 = uj3_13.k;
        Intrinsics.checkNotNull(object2);
        n4 = ((ArrayList)object2).size();
        remoteViews2 = null;
        int n17 = 0;
        object = null;
        n7 = 0;
        for (n8 = 0; n8 < n4; ++n8) {
            Object object6 = ((ArrayList)object3).get(n17);
            Intrinsics.checkNotNullExpressionValue(object6, string2);
            int n18 = ((Number)object6).intValue();
            Object object7 = uj3_13.k;
            Intrinsics.checkNotNull(object7);
            object7 = (String)((ArrayList)object7).get(n8);
            remoteViews = gA22.c;
            object5 = gA22.a;
            xz3_0.p(n18, (String)object7, remoteViews, object5);
            object7 = object5.getPackageName();
            int n19 = n4;
            n4 = R$layout.image_view;
            super((String)object7, n4);
            n4 = R$id.fimg;
            object7 = uj3_13.k;
            Intrinsics.checkNotNull(object7);
            object7 = (String)((ArrayList)object7).get(n8);
            xz3_0.p(n4, (String)object7, object6, object5);
            n10 = (int)(Xv2.c ? 1 : 0);
            if (n10 == 0) {
                if (n7 == 0) {
                    n7 = 1;
                }
                object5 = ((ArrayList)object3).get(n17);
                Intrinsics.checkNotNullExpressionValue(object5, string2);
                n10 = ((Number)object5).intValue();
                n4 = 0;
                object2 = null;
                remoteViews.setViewVisibility(n10, 0);
                n10 = R$id.carousel_image;
                remoteViews.addView(n10, object6);
                ++n17;
                object5 = uj3_13.k;
                Intrinsics.checkNotNull(object5);
                object5 = object5.get(n8);
                arrayList.add((Context)object5);
            } else {
                n4 = 0;
                object2 = null;
                object5 = uj3_13.l;
                Intrinsics.checkNotNull(object5);
                object5.remove(n8);
                object5 = uj3_13.m;
                Intrinsics.checkNotNull(object5);
                object5.remove(n8);
                object5 = uj3_13.n;
                Intrinsics.checkNotNull(object5);
                object5.remove(n8);
                object5 = uj3_13.o;
                Intrinsics.checkNotNull(object5);
                object5 = object5.remove(n8);
                Intrinsics.checkNotNull(object5);
            }
            n4 = n19;
            n10 = 0;
            object5 = null;
            n16 = 1;
        }
        bundle2.putStringArrayList("pt_image_list", arrayList);
        object3 = uj3_13.l;
        bundle2.putStringArrayList("pt_deeplink_list", (ArrayList)object3);
        object3 = uj3_13.m;
        bundle2.putStringArrayList("pt_big_text_list", (ArrayList)object3);
        object3 = uj3_13.n;
        bundle2.putStringArrayList("pt_small_text_list", (ArrayList)object3);
        object3 = uj3_13.o;
        object5 = "pt_price_list";
        bundle2.putStringArrayList((String)object5, (ArrayList)object3);
        int n20 = 1;
        if (n17 <= n20) {
            ak2_1.a();
        }
        object3 = gA22.c;
        n10 = R$id.carousel_image;
        object3.setDisplayedChild(n10, n14);
        this.g();
        remoteViews = gA22.c;
        n8 = R$id.small_image1;
        n14 = uj3_13.Q;
        string2 = null;
        n15 = 21;
        object3 = context;
        object5 = bundle;
        object2 = uj3_12;
        object3 = sq2_1.b(context, n14, bundle, false, n15, uj3_12);
        remoteViews.setOnClickPendingIntent(n8, (PendingIntent)object3);
        object3 = uj3_13.l;
        Intrinsics.checkNotNull(object3);
        n20 = ((ArrayList)object3).size();
        n14 = 2;
        if (n20 >= n14) {
            remoteViews = gA22.c;
            n8 = R$id.small_image2;
            n14 = uj3_13.Q;
            string2 = null;
            n15 = 22;
            object3 = context;
            object3 = sq2_1.b(context, n14, bundle, false, n15, uj3_12);
            remoteViews.setOnClickPendingIntent(n8, (PendingIntent)object3);
        }
        object3 = uj3_13.l;
        Intrinsics.checkNotNull(object3);
        n20 = ((ArrayList)object3).size();
        n14 = 3;
        if (n20 >= n14) {
            remoteViews = gA22.c;
            n8 = R$id.small_image3;
            n14 = uj3_13.Q;
            string2 = null;
            n15 = 23;
            object3 = context;
            object5 = bundle;
            object2 = uj3_12;
            object3 = sq2_1.b(context, n14, bundle, false, n15, uj3_12);
            remoteViews.setOnClickPendingIntent(n8, (PendingIntent)object3);
        }
        object3 = bundle.clone();
        Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type android.os.Bundle");
        object3 = (Bundle)object3;
        n10 = 1;
        object3.putBoolean("img1", n10 != 0);
        n14 = uj3_13.Q;
        object3.putInt("notificationId", n14);
        string2 = gA22.g;
        object3.putString("pt_buy_now_dl", string2);
        object3.putBoolean("buynow", n10 != 0);
        object4 = gA22.c;
        n10 = R$id.product_action;
        string2 = gA22.g;
        n15 = uj3_13.Q;
        object3 = sq2_1.a(context2, (Bundle)object3, string2, n15);
        object4.setOnClickPendingIntent(n10, (PendingIntent)object3);
    }

    public final void j(int n3, String string2) {
        String string3 = "s";
        Intrinsics.checkNotNullParameter(string2, string3);
        int n4 = string2.length();
        if (n4 > 0) {
            n4 = Build.VERSION.SDK_INT;
            RemoteViews remoteViews = this.c;
            int n7 = 24;
            if (n4 >= n7) {
                string2 = jC2.a(string2);
                remoteViews.setTextViewText(n3, (CharSequence)string2);
            } else {
                string2 = Html.fromHtml((String)string2);
                remoteViews.setTextViewText(n3, (CharSequence)string2);
            }
        }
    }
}

