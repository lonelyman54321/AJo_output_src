/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.content.ClipboardManager
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.database.entity.NotificationActions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from MZ1
 */
public final class mz1_2
extends RecyclerView$B
implements View.OnClickListener {
    public final View a;
    public final n52_0 b;
    public final TextView c;
    public final TextView d;
    public final View e;
    public final LinearLayout f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final LinearLayout j;
    public final LinearLayout k;
    public final LinearLayout l;
    public final ImageView m;
    public final TextView n;
    public final TextView o;
    public final FrameLayout p;
    public final View q;
    public final LinearLayout r;
    public final TextView s;
    public final View t;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public int x;

    public mz1_2(View view, List list, n52_0 object) {
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        this.a = view;
        this.b = object;
        int n3 = R$id.noti_title;
        object = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.c = object;
        n3 = R$id.noti_message;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.d = object;
        n3 = R$id.left_bar;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.e = object;
        n3 = R$id.noti_footer_layout;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (LinearLayout)object;
        this.f = object;
        n3 = R$id.action_1;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.g = object;
        n3 = R$id.action_2;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.h = object;
        n3 = R$id.action_3;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.i = object;
        n3 = R$id.action_1_layout;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (LinearLayout)object;
        this.j = object;
        int n4 = R$id.action_2_layout;
        View view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (LinearLayout)view2;
        this.k = view2;
        int n7 = R$id.action_3_layout;
        View view3 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view3, string2);
        view3 = (LinearLayout)view3;
        this.l = view3;
        int n8 = R$id.noti_image;
        View view4 = view.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(view4, string2);
        view4 = (ImageView)view4;
        this.m = view4;
        n8 = R$id.coupon_text;
        view4 = view.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(view4, string2);
        view4 = (TextView)view4;
        this.n = view4;
        int n10 = R$id.expiry_text;
        View view5 = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view5, string2);
        view5 = (TextView)view5;
        this.o = view5;
        n10 = R$id.image_and_coupon_layout;
        view5 = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view5, string2);
        view5 = (FrameLayout)view5;
        this.p = view5;
        n10 = R$id.expiry_disabled_layout;
        view5 = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view5, string2);
        this.q = view5;
        n10 = R$id.expired_layout;
        view5 = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view5, string2);
        view5 = (LinearLayout)view5;
        this.r = view5;
        n10 = R$id.unread;
        view5 = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view5, string2);
        view5 = (TextView)view5;
        this.s = view5;
        n10 = R$id.coupon_nc;
        view5 = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view5, string2);
        this.t = view5;
        int n14 = R$id.coupon_noti_title;
        View view6 = view5.findViewById(n14);
        Intrinsics.checkNotNullExpressionValue(view6, string2);
        view6 = (TextView)view6;
        this.u = view6;
        n14 = R$id.coupon_noti_message;
        view6 = view5.findViewById(n14);
        Intrinsics.checkNotNullExpressionValue(view6, string2);
        view6 = (TextView)view6;
        this.v = view6;
        n14 = R$id.coupon_unread;
        view6 = view.findViewById(n14);
        Intrinsics.checkNotNullExpressionValue(view6, string2);
        view6 = (TextView)view6;
        this.w = view6;
        n14 = R$id.noti_coupon_layout;
        view5 = view5.findViewById(n14);
        Intrinsics.checkNotNullExpressionValue(view5, string2);
        view5 = (LinearLayout)view5;
        object.setOnClickListener((View.OnClickListener)this);
        view2.setOnClickListener((View.OnClickListener)this);
        view3.setOnClickListener((View.OnClickListener)this);
        view5.setOnClickListener((View.OnClickListener)this);
        view4.setOnClickListener((View.OnClickListener)this);
        object = new lz1_0(this, list);
        view.setOnClickListener((View.OnClickListener)object);
    }

    public static ArrayList w(List object) {
        ArrayList<NotificationActions> arrayList = new ArrayList<NotificationActions>();
        if (object != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                int n3;
                NotificationActions notificationActions = (NotificationActions)object.next();
                int n4 = notificationActions.getActionType();
                if (n4 != (n3 = 5002)) continue;
                arrayList.add(notificationActions);
            }
        }
        return arrayList;
    }

    public final void onClick(View view) {
        mz1_2 mz1_22 = this;
        int n3 = 1;
        Object object = "view";
        Object object2 = view;
        Intrinsics.checkNotNullParameter(view, (String)object);
        int n4 = view.getId();
        int n7 = R$id.action_1_layout;
        if (n4 != n7 && n4 != (n7 = R$id.action_2_layout) && n4 != (n7 = R$id.action_3_layout)) {
            int n8 = R$id.coupon_text;
            if (n4 == n8 || n4 == (n8 = R$id.noti_coupon_layout)) {
                object = mz1_22.a.getContext().getSystemService("clipboard");
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.content.ClipboardManager");
                object = (ClipboardManager)object;
                object2 = ((Object)mz1_22.n.getText()).toString();
                Object[] objectArray = "coupon label";
                object2 = ClipData.newPlainText((CharSequence)objectArray, (CharSequence)object2);
                if (object2 == null) {
                    return;
                }
                object.setPrimaryClip((ClipData)object2);
                object = StringCompanionObject.INSTANCE;
                n4 = R$string.acc_alert_message;
                object = hv3_0.K(n4);
                object2 = "Coupon copied";
                objectArray = new Object[n3];
                Object var10_12 = null;
                objectArray[0] = object2;
                Object object3 = Arrays.copyOf(objectArray, n3);
                object3 = String.format((String)object, object3);
                object = "format(...)";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object);
                mq0_2.b((String)object2, (String)object3);
            }
        } else {
            Object object4 = view.getTag();
            Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type com.ril.ajio.data.database.entity.NotificationActions");
            object4 = (NotificationActions)object4;
            object = new Bundle();
            object2 = ((NotificationActions)object4).getTitle();
            object.putString("notification_type", (String)object2);
            object2 = AnalyticsManager.Companion;
            Object object5 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
            object.putString("screenname", (String)object5);
            object5 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
            object.putString("screen_name", (String)object5);
            FirebaseEvents.Companion.getInstance().sendEvent("inapp_notification_clicked", (Bundle)object);
            object5 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
            String string2 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp().getEC_NOTI_INTERACTION();
            String string3 = ((NotificationActions)object4).getTitle();
            Intrinsics.checkNotNullExpressionValue(string3, "getTitle(...)");
            String string4 = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp().getPrevScreen();
            String string5 = cv_0.a((AnalyticsManager$Companion)object2);
            String string6 = "notification click";
            String string7 = "notification_click";
            String string8 = "notification screen";
            String string9 = "notification screen";
            int n10 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, string2, string6, string3, string7, string8, string9, string4, null, string5, false, null, n10, null);
            object = new Bundle();
            object2 = "DEEP_LINK_MY_ACCOUNT";
            object4 = ((NotificationActions)object4).getDeepLinkUrl();
            object.putString((String)object2, (String)object4);
            int n14 = mz1_22.x;
            object.putInt("NOTIFICATION_POSITION", n14);
            object4 = mz1_22.b;
            if (object4 != null) {
                long l2 = -1;
                object2 = l2;
                object4.J6((Bundle)object, (Long)object2);
            }
        }
    }
}

