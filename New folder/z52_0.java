/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.databinding.DialogNotificationPermissionBinding;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from z52
 */
public final class z52_0
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public static final z52$a_0 Companion;
    public static final /* synthetic */ gn1_2[] c;
    public final boolean a;
    public final cc3_2 b;

    static {
        Object object = jz.a(z52_0.class, "binding", "getBinding()Lcom/ril/ajio/databinding/DialogNotificationPermissionBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        c = gn1_2Array;
        Companion = object = new Object();
    }

    public z52_0() {
        boolean bl2;
        ld3_2 ld3_22;
        String string2;
        String string3;
        Object object = od3_2.a;
        int n3 = ((String)object).length();
        if (n3 == 0) {
            object = od3_2.a();
        }
        if ((n3 = (int)(s20.a ? 1 : 0)) == 0 && (n3 = (int)(Intrinsics.areEqual(string3 = od3_2.a(), string2 = (ld3_22 = ld3_2.STORE_AJIOGRAM).getStoreId()) ? 1 : 0)) == 0 && !(bl2 = Intrinsics.areEqual(object, string3 = ld3_22.getStoreId()))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        this.a = bl2;
        this.b = object = z80_0.c(z52$b_0.a, this);
    }

    public final DialogNotificationPermissionBinding Oa() {
        Object object = c[0];
        object = this.b.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (DialogNotificationPermissionBinding)object;
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        super.onActivityResult(n3, n4, intent);
        n4 = 1356;
        if (n3 == n4) {
            hv3_0.a.getClass();
            String string2 = "android.permission.POST_NOTIFICATIONS";
            n3 = (int)(hv3_0.R(string2) ? 1 : 0);
            if (n3 != 0) {
                this.dismissAllowingStateLoss();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        int n3;
        int n4;
        String string2 = "app_user_permissions";
        Bundle bundle = px1_2.b("event_category", string2, "event_action", "settings pop-up");
        Object object2 = AnalyticsManager.Companion;
        String string3 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
        String string4 = "screen_name";
        bundle.putString(string4, string3);
        object2 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
        string3 = "screenname";
        bundle.putString(string3, (String)object2);
        object2 = null;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.laTvNotNow;
        string4 = "event_label";
        if (object == null || (n3 = ((Integer)object).intValue()) != n7) {
            n7 = R$id.dlprClose;
            if (object == null || (n3 = ((Integer)object).intValue()) != n7) {
                n7 = R$id.dlprIvClose;
                if (object == null || (n3 = ((Integer)object).intValue()) != n7) {
                    n7 = R$id.laTvAllow;
                    if (object == null) {
                        return;
                    }
                    n4 = (Integer)object;
                    if (n4 != n7) return;
                    bundle.putString(string4, "allow");
                    GAEcommerceEvents.INSTANCE.pushGAEventBundle(string2, bundle);
                    object = new Intent();
                    object.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    AJIOApplication.Companion.getClass();
                    String string5 = AJIOApplication$a.a().getPackageName();
                    string2 = "package";
                    Uri uri = Uri.fromParts((String)string2, (String)string5, null);
                    object.setData(uri);
                    int n8 = 1356;
                    this.startActivityForResult((Intent)object, n8);
                    return;
                }
            }
        }
        bundle.putString(string4, "cancel");
        object = GAEcommerceEvents.INSTANCE;
        ((GAEcommerceEvents)object).pushGAEventBundle(string2, bundle);
        this.dismissAllowingStateLoss();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.dialog_notification_permission;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        boolean bl2 = this.a;
        String string2 = "onGetLayoutInflater(...)";
        if (bl2) {
            bundle = super.onGetLayoutInflater(bundle);
            Intrinsics.checkNotNullExpressionValue(bundle, string2);
            string2 = this.requireContext();
            int n3 = R$style.FleekTheme;
            d80 d802 = new d80((Context)string2, n3);
            bundle = bundle.cloneInContext((Context)d802);
            Intrinsics.checkNotNullExpressionValue(bundle, "cloneInContext(...)");
            return bundle;
        }
        bundle = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(bundle, string2);
        return bundle;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.Oa().laTvAllow.setOnClickListener((View.OnClickListener)this);
        this.Oa().laTvNotNow.setOnClickListener((View.OnClickListener)this);
        bundle = this.Oa().laAccessSubtitle;
        Intrinsics.checkNotNullExpressionValue(bundle, "laAccessSubtitle");
        int n3 = R$string.notification_turnon;
        Object object = this.getString(n3);
        ai0_2.A((TextView)bundle, (String)object);
        bundle = new Bundle();
        Object object2 = "app_user_permissions";
        bundle.putString("event_category", (String)object2);
        bundle.putString("event_action", "settings pop-up");
        bundle.putString("event_label", "seen");
        object = AnalyticsManager.Companion;
        String string2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
        String string3 = "screen_name";
        bundle.putString(string3, string2);
        object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
        string2 = "screenname";
        bundle.putString(string2, (String)object);
        object = GAEcommerceEvents.INSTANCE;
        ((GAEcommerceEvents)object).pushGAEventBundle((String)object2, bundle);
        int n4 = R$id.dlprLayoutContent;
        bundle = view.findViewById(n4);
        if (bundle != null) {
            object = this.getDialog();
            if (object != null) {
                object2 = new Object();
                object.setOnShowListener((DialogInterface.OnShowListener)object2);
            }
            bundle.bringToFront();
        }
        n4 = R$id.dlprClose;
        bundle = view.findViewById(n4);
        n3 = 8;
        if (bundle != null) {
            bundle.setVisibility(n3);
        }
        if ((view = (ImageView)view.findViewById(n4 = R$id.dlprIvClose)) != null) {
            view.setVisibility(n3);
        }
    }
}

