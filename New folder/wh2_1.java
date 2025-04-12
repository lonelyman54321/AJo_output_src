/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from wH2
 */
public final class wh2_1
extends RecyclerView$B {
    public final View a;
    public final uh2_0 b;
    public final TextView c;
    public final View d;
    public final ShimmerFrameLayout e;
    public final TextView f;
    public final ImageView g;
    public final boolean h;
    public final NewCustomEventsRevamp i;
    public final String j;
    public final String k;

    public wh2_1(View view, uh2_0 object) {
        int n3;
        String string2;
        Intrinsics.checkNotNullParameter(view, "view");
        Object object2 = "referralWidgetInfo";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super(view);
        this.a = view;
        this.b = object;
        object = od3_2.a;
        int n4 = object.length();
        if (n4 == 0) {
            object = od3_2.a();
        }
        n4 = (int)(s20.a ? 1 : 0);
        boolean bl2 = true;
        if (n4 == 0 && (n4 = (int)(Intrinsics.areEqual(object2 = od3_2.a(), string2 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0)) == 0) {
            n4 = 0;
            object2 = null;
        } else {
            n4 = 1;
        }
        if (n4 == 0 && (n3 = Intrinsics.areEqual(object, object2 = ld3_2.STORE_AJIOGRAM.getStoreId())) == 0) {
            bl2 = false;
        }
        this.h = bl2;
        object = AnalyticsManager.Companion;
        this.i = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.j = object2 = bv_0.a((AnalyticsManager$Companion)object);
        this.k = object = cv_0.a((AnalyticsManager$Companion)object);
        Intrinsics.checkNotNullParameter(view, "itemView");
        n3 = R$id.rw_earn_info;
        object = (TextView)view.findViewById(n3);
        this.c = object;
        n3 = R$id.rw_parent;
        object = view.findViewById(n3);
        this.d = object;
        n3 = R$id.referral_row_shimmer_view;
        object = (ShimmerFrameLayout)view.findViewById(n3);
        this.e = object;
        n3 = R$id.rw_header;
        object = (TextView)view.findViewById(n3);
        this.f = object;
        n3 = R$id.rw_wallet;
        view = (ImageView)view.findViewById(n3);
        this.g = view;
    }

    public final void w(float f5, wg2_1 wg2_12) {
        Object[] objectArray;
        boolean bl2;
        float f6;
        Object object;
        wh2_1 wh2_12 = this;
        ShimmerFrameLayout shimmerFrameLayout = this.e;
        int n3 = 1;
        Object object2 = this.c;
        String string2 = null;
        Object object3 = "format(...)";
        Object object4 = this.f;
        String string3 = null;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("widgetHeaderTV");
            object = 0;
            object4 = null;
            f6 = 0.0f;
        }
        Object[] objectArray2 = z40_0.Companion;
        objectArray2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)objectArray2).a;
        Object object5 = "referrer_widget_heading";
        objectArray2 = objectArray2.b((String)object5);
        object4.setText((CharSequence)objectArray2);
        object4 = wh2_12.d;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentView");
            object = 0;
            object4 = null;
            f6 = 0.0f;
        }
        object5 = wg2_12;
        objectArray2 = new vh2_0(wg2_12, 0);
        object4.setOnClickListener((View.OnClickListener)objectArray2);
        object = wh2_12.h;
        int n4 = 8;
        if (object != 0 && (object4 = wh2_12.g) != null) {
            object4.setVisibility(n4);
        }
        f6 = -1.0f;
        object5 = "referralShimmerView";
        String string4 = "earnInfoTv";
        object = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (object == 0) {
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                object2 = null;
            }
            object2.setVisibility(n4);
            if (shimmerFrameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                bl2 = false;
                shimmerFrameLayout = null;
            }
            hv3_0.s0(shimmerFrameLayout);
        } else {
            f6 = 0.0f;
            object4 = null;
            float f7 = f5 - 0.0f;
            object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object > 0) {
                object4 = StringCompanionObject.INSTANCE;
                object4 = AJIOApplication$a.a();
                object4 = z40$a.a((Context)object4);
                object4 = ((z40_0)object4).a;
                objectArray2 = "referral_widget_message";
                object4 = ((ao0_0)object4).b((String)objectArray2);
                objectArray2 = Float.valueOf(f5);
                objectArray2 = qz2_0.x((Float)objectArray2);
                objectArray = new Object[n3];
                objectArray[0] = objectArray2;
                objectArray2 = Arrays.copyOf(objectArray, n3);
                object4 = String.format((String)object4, objectArray2);
                try {
                    Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                }
                catch (Exception exception) {
                    yn3_0.a.e(exception);
                    object4 = StringCompanionObject.INSTANCE;
                    object4 = qz2_0.x(Float.valueOf(f5));
                    objectArray2 = new Object[n3];
                    objectArray2[0] = object4;
                    object4 = xh2_0.a(objectArray2, n3, "You get %s AJIO Cash for every friend", (String)object3);
                }
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    object3 = null;
                } else {
                    object3 = object2;
                }
                object3.setText((CharSequence)object4);
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    object2 = null;
                }
                object2.setVisibility(0);
                if (shimmerFrameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    bl2 = false;
                    shimmerFrameLayout = null;
                }
                hv3_0.s0(shimmerFrameLayout);
            } else {
                if (shimmerFrameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    bl2 = false;
                    shimmerFrameLayout = null;
                }
                hv3_0.p0(shimmerFrameLayout);
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    object2 = null;
                }
                object2.setVisibility(n4);
            }
        }
        object4 = wh2_12.b;
        bl2 = ((uh2_0)object4).b;
        if (!bl2) {
            object2 = wh2_12.i;
            string2 = ((NewCustomEventsRevamp)object2).getEC_WIDGET_INTERACTION();
            int n7 = 1536;
            object3 = "widget view";
            string3 = "referral widget";
            objectArray2 = "widget_view";
            string4 = ((uh2_0)object4).e;
            objectArray = wh2_12.j;
            String string5 = wh2_12.k;
            object5 = string4;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string2, (String)object3, string3, (String)objectArray2, string4, string4, (String)objectArray, null, string5, false, null, n7, null);
            ((uh2_0)object4).b = n3;
        }
    }
}

