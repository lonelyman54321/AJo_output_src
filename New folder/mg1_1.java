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
 * Renamed from MG1
 */
public final class mg1_1
extends ze3_0 {
    public uj3_1 b;
    public Bundle c;

    public final RemoteViews b(Context context, uj3_1 uj3_12) {
        int n3;
        ArrayList arrayList;
        Object object;
        int n4;
        String string2;
        int n7;
        int n8;
        Object object2;
        int n10;
        Context context2 = context;
        uj3_1 uj3_13 = uj3_12;
        Object object3 = "context";
        Intrinsics.checkNotNullParameter(context, (String)object3);
        Object object4 = "renderer";
        Intrinsics.checkNotNullParameter(uj3_12, (String)object4);
        Intrinsics.checkNotNullParameter(context, (String)object3);
        Intrinsics.checkNotNullParameter(uj3_12, (String)object4);
        Bundle bundle = this.c;
        Intrinsics.checkNotNullParameter(bundle, "extras");
        int n14 = R$layout.manual_carousel;
        lg1_1 lg1_12 = new ix_0(n14, uj3_12, context);
        object3 = uj3_12.e;
        if (object3 != null && (n10 = ((String)object3).length()) > 0) {
            n10 = Build.VERSION.SDK_INT;
            object2 = lg1_12.c;
            n8 = 24;
            if (n10 >= n8) {
                n10 = R$id.msg;
                object3 = jC2.a((String)object3);
                object2.setTextViewText(n10, (CharSequence)object3);
            } else {
                n10 = R$id.msg;
                object3 = Html.fromHtml((String)object3);
                object2.setTextViewText(n10, (CharSequence)object3);
            }
        }
        object3 = lg1_12.c;
        n10 = R$id.leftArrowPos0;
        int n15 = 0;
        object2 = null;
        object3.setViewVisibility(n10, 0);
        object3 = lg1_12.c;
        n10 = R$id.rightArrowPos0;
        object3.setViewVisibility(n10, 0);
        object3 = uj3_13.l;
        Intrinsics.checkNotNull(object3);
        object3 = ((ArrayList)object3).get(0);
        Intrinsics.checkNotNullExpressionValue(object3, "get(...)");
        object3 = (String)object3;
        object3 = new ArrayList();
        object4 = uj3_13.k;
        Intrinsics.checkNotNull(object4);
        n10 = ((ArrayList)object4).size();
        n8 = 0;
        String string3 = null;
        int n16 = 0;
        String string4 = null;
        int n17 = 0;
        int n18 = 0;
        RemoteViews remoteViews = null;
        while (true) {
            n7 = 1;
            if (n8 >= n10) break;
            string2 = context.getPackageName();
            n4 = R$layout.image_view_rounded;
            object = new RemoteViews(string2, n4);
            int n19 = R$id.flipper_img;
            Object object5 = uj3_13.k;
            Intrinsics.checkNotNull(object5);
            object5 = (String)((ArrayList)object5).get(n8);
            xz3_0.p(n19, (String)object5, (RemoteViews)object, context2);
            n19 = (int)(Xv2.c ? 1 : 0);
            if (n19 == 0) {
                if (n16 == 0) {
                    n17 = n8;
                    n16 = 1;
                }
                arrayList = lg1_12.c;
                n19 = R$id.carousel_image;
                arrayList.addView(n19, (RemoteViews)object);
                arrayList = lg1_12.c;
                n19 = R$id.carousel_image_right;
                arrayList.addView(n19, (RemoteViews)object);
                arrayList = lg1_12.c;
                n19 = R$id.carousel_image_left;
                arrayList.addView(n19, (RemoteViews)object);
                ++n18;
                arrayList = uj3_13.k;
                Intrinsics.checkNotNull(arrayList);
                arrayList = arrayList.get(n8);
                ((ArrayList)object3).add(arrayList);
            } else {
                arrayList = uj3_13.l;
                if (arrayList != null) {
                    Intrinsics.checkNotNull(arrayList);
                    n7 = arrayList.size();
                    object = uj3_13.k;
                    Intrinsics.checkNotNull(object);
                    n3 = ((ArrayList)object).size();
                    if (n7 == n3) {
                        arrayList = uj3_13.l;
                        Intrinsics.checkNotNull(arrayList);
                        arrayList.remove(n8);
                    }
                }
                ak2_1.a();
            }
            ++n8;
        }
        object4 = uj3_13.P;
        if (object4 == null || (n10 = (int)(((String)object4).equalsIgnoreCase(string3 = "filmstrip") ? 1 : 0)) == 0) {
            object4 = lg1_12.c;
            n8 = R$id.carousel_image_right;
            n16 = 8;
            object4.setViewVisibility(n8, n16);
            object4 = lg1_12.c;
            n8 = R$id.carousel_image_left;
            object4.setViewVisibility(n8, n16);
        }
        object4 = "right_swipe";
        n8 = (int)(bundle.containsKey((String)object4) ? 1 : 0);
        string4 = "manual_carousel_from";
        object = "wzrk_dl";
        string2 = "pt_manual_carousel_current";
        if (n8 != 0) {
            n8 = (int)(bundle.getBoolean((String)object4) ? 1 : 0);
            n17 = bundle.getInt(string2);
            if (n17 == (n18 = ((ArrayList)object3).size() - n7)) {
                n18 = 0;
                remoteViews = null;
            } else {
                n18 = n17 + 1;
            }
            n4 = n17 == 0 ? ((ArrayList)object3).size() - n7 : n17 + -1;
            object2 = lg1_12.c;
            n7 = R$id.carousel_image;
            object2.setDisplayedChild(n7, n17);
            object2 = lg1_12.c;
            n7 = R$id.carousel_image_right;
            object2.setDisplayedChild(n7, n18);
            object2 = lg1_12.c;
            n7 = R$id.carousel_image_left;
            object2.setDisplayedChild(n7, n4);
            if (n8 != 0) {
                object2 = lg1_12.c;
                n8 = R$id.carousel_image;
                object2.showNext(n8);
                object2 = lg1_12.c;
                n8 = R$id.carousel_image_right;
                object2.showNext(n8);
                object2 = lg1_12.c;
                n8 = R$id.carousel_image_left;
                object2.showNext(n8);
            } else {
                object2 = lg1_12.c;
                n8 = R$id.carousel_image;
                object2.showPrevious(n8);
                object2 = lg1_12.c;
                n8 = R$id.carousel_image_right;
                object2.showPrevious(n8);
                object2 = lg1_12.c;
                n8 = R$id.carousel_image_left;
                object2.showPrevious(n8);
                n18 = n4;
            }
            object2 = uj3_13.l;
            if (object2 != null && (n8 = ((ArrayList)object2).size()) == (n14 = ((ArrayList)object3).size())) {
                object3 = (String)((ArrayList)object2).get(n18);
            } else if (object2 != null && (n14 = ((ArrayList)object2).size()) == (n8 = 1)) {
                n14 = 0;
                object3 = (String)((ArrayList)object2).get(0);
            } else if (object2 != null && (n14 = ((ArrayList)object2).size()) > n18) {
                object3 = (String)((ArrayList)object2).get(n18);
            } else if (object2 != null && (n14 = ((ArrayList)object2).size()) < n18) {
                n14 = 0;
                object3 = (String)((ArrayList)object2).get(0);
            } else {
                object3 = "";
            }
            bundle.putInt(string2, n18);
            bundle.remove((String)object4);
            bundle.putString((String)object, (String)object3);
            bundle.putInt(string4, n17);
            remoteViews = lg1_12.c;
            n7 = R$id.rightArrowPos0;
            n10 = uj3_13.Q;
            object3 = context;
            object2 = bundle;
            object3 = sq2_1.b(context, n10, bundle, false, 4, null);
            remoteViews.setOnClickPendingIntent(n7, (PendingIntent)object3);
            remoteViews = lg1_12.c;
            n7 = R$id.leftArrowPos0;
            n10 = uj3_13.Q;
            n8 = 0;
            string3 = null;
            n16 = 5;
            n17 = 0;
            object3 = context;
            object3 = sq2_1.b(context, n10, bundle, false, n16, null);
            remoteViews.setOnClickPendingIntent(n7, (PendingIntent)object3);
        } else {
            object4 = lg1_12.c;
            n15 = R$id.carousel_image_right;
            n8 = 1;
            object4.setDisplayedChild(n15, n8);
            object4 = lg1_12.c;
            n15 = R$id.carousel_image;
            object4.setDisplayedChild(n15, 0);
            object4 = lg1_12.c;
            n15 = R$id.carousel_image_left;
            n7 = ((ArrayList)object3).size() - n8;
            object4.setDisplayedChild(n15, n7);
            bundle.putInt(string2, n17);
            bundle.putStringArrayList("pt_image_list", object3);
            object3 = uj3_13.l;
            bundle.putStringArrayList("pt_deeplink_list", (ArrayList)object3);
            object3 = uj3_13.l;
            Intrinsics.checkNotNull(object3);
            object4 = null;
            object3 = (String)((ArrayList)object3).get(0);
            bundle.putString((String)object, (String)object3);
            bundle.putInt(string4, 0);
            arrayList = lg1_12.c;
            n3 = R$id.rightArrowPos0;
            n10 = uj3_13.Q;
            object3 = context;
            object2 = bundle;
            object3 = sq2_1.b(context, n10, bundle, false, 4, uj3_12);
            arrayList.setOnClickPendingIntent(n3, (PendingIntent)object3);
            arrayList = lg1_12.c;
            n3 = R$id.leftArrowPos0;
            n10 = uj3_13.Q;
            n8 = 0;
            string3 = null;
            n16 = 5;
            object3 = context;
            object3 = sq2_1.b(context, n10, bundle, false, n16, uj3_12);
            arrayList.setOnClickPendingIntent(n3, (PendingIntent)object3);
            n14 = 2;
            if (n18 < n14) {
                ak2_1.a();
            }
        }
        return lg1_12.c;
    }

    public final PendingIntent c(Context context, Bundle bundle, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "extras");
        uj3_1 uj3_12 = this.b;
        return sq2_1.b(context, n3, bundle, false, 6, uj3_12);
    }

    public final PendingIntent d(Context context, Bundle bundle, int n3) {
        String string2;
        boolean bl2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "extras");
        String string3 = bundle.getString("extras_from");
        if (string3 != null && (bl2 = Intrinsics.areEqual(string3, string2 = "PTReceiver"))) {
            boolean bl3 = true;
            int n4 = 3;
            string2 = context;
            context = sq2_1.b(context, n3, bundle, bl3, n4, null);
        } else {
            uj3_1 uj3_12 = this.b;
            boolean bl4 = true;
            int n7 = 3;
            string3 = context;
            context = sq2_1.b(context, n3, bundle, bl4, n7, uj3_12);
        }
        return context;
    }

    public final RemoteViews e(Context context, uj3_1 uj3_12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uj3_12, "renderer");
        r73_0 r73_02 = new r73_0(context, uj3_12);
        return r73_02.c;
    }
}

