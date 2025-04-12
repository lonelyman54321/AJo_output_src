/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.ServiceErrorEventTracker;
import com.ril.ajio.bonanza.model.ICouponBonanzaInfo;
import com.ril.ajio.bonanza.model.ICouponsAvailable;
import com.ril.ajio.bonanza.model.IFilter;
import com.ril.ajio.kmm.shared.bonanza.model.CouponAttributeValues;
import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaInfoRequest;
import com.ril.ajio.kmm.shared.bonanza.model.DisplayMessageInfo;
import com.ril.ajio.kmm.shared.bonanza.model.PointsBalance;
import com.ril.ajio.payment.activity.TermsAndConditionActivity;
import com.ril.ajio.services.data.user.UserInformation;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Ob0
 */
public final class ob0_1
extends Hj {
    public static final Ob0$a Companion;
    public boolean A;
    public int B;
    public final String C;
    public final ServiceErrorEventTracker D;
    public final NewCustomEventsRevamp E;
    public boolean F;
    public boolean G;
    public final Application a;
    public final hh3_2 b;
    public final ParcelableSnapshotMutableState c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;
    public final ParcelableSnapshotMutableState f;
    public final ParcelableSnapshotMutableState g;
    public final ParcelableSnapshotMutableState h;
    public final ParcelableSnapshotMutableState i;
    public final ParcelableSnapshotMutableState j;
    public final ParcelableSnapshotMutableState k;
    public final ParcelableSnapshotMutableState l;
    public final ParcelableSnapshotMutableState m;
    public final ParcelableSnapshotMutableState n;
    public final ParcelableSnapshotMutableState o;
    public final ParcelableSnapshotMutableState p;
    public final ParcelableSnapshotMutableState q;
    public final ParcelableSnapshotMutableState r;
    public DisplayMessageInfo s;
    public ICouponBonanzaInfo t;
    public final lb0_0 u;
    public final i23_0 v;
    public final ee2_2 w;
    public final i23_0 x;
    public final ee2_2 y;
    public final LinkedHashMap z;

    static {
        Ob0$a ob0$a;
        Companion = ob0$a = new Object();
    }

    public ob0_1(Application object) {
        pb3_0 pb3_02;
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        this.a = object = this.getApplication();
        LinkedHashMap linkedHashMap = new LinkedHashMap(this);
        linkedHashMap = yr1_2.b((Function0)((Object)linkedHashMap));
        this.b = linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        linkedHashMap = J83.g(linkedHashMap);
        this.c = linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        linkedHashMap = J83.g(linkedHashMap);
        this.d = linkedHashMap;
        linkedHashMap = J83.g(this.p());
        this.e = linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        linkedHashMap = J83.g(linkedHashMap);
        this.f = linkedHashMap;
        Object object2 = J83.g(0);
        this.g = object2;
        object2 = J83.g(0);
        this.h = object2;
        object2 = Boolean.FALSE;
        this.i = pb3_02 = J83.g(object2);
        this.j = pb3_02 = J83.g(object2);
        this.k = pb3_02 = J83.g(object2);
        this.l = pb3_02 = J83.g(object2);
        super();
        this.m = pb3_02 = J83.g(pb3_02);
        Object object3 = J83.g(null);
        this.n = object3;
        object3 = J83.g(object2);
        this.o = object3;
        object3 = J83.g(0);
        this.p = object3;
        object3 = J83.g(object2);
        this.q = object3;
        this.r = object2 = J83.g(object2);
        this.u = object2 = new lb0_0((Application)object);
        int n3 = 7;
        this.v = object3 = k23_0.b(0, 0, null, n3);
        this.w = object3 = ms0_1.a((i23_0)object3);
        linkedHashMap = k23_0.b(0, 0, null, n3);
        this.x = linkedHashMap;
        linkedHashMap = ms0_1.a((i23_0)((Object)linkedHashMap));
        this.y = linkedHashMap;
        this.z = linkedHashMap = new LinkedHashMap();
        z40_0.Companion.getClass();
        object = z40$a.a((Context)object).a.b("coupon_bonanza_game_name");
        this.C = object;
        object = ServiceErrorEventTracker.INSTANCE;
        this.D = object;
        object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.E = object;
    }

    public static final void b(ob0_1 object, String string2, Bundle bundle) {
        object.getClass();
        object = AnalyticsManager.Companion;
        NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        String string3 = bv_0.a((AnalyticsManager$Companion)object);
        String string4 = cv_0.a((AnalyticsManager$Companion)object);
        newCustomEventsRevamp.newPushCustomScreenView(string2, "coupon bonanza screen", string3, bundle, string4);
    }

    public static CouponBonanzaInfoRequest f(ob0_1 ob0_12, String object, int n3, int n4) {
        int n7;
        int n8 = n4 & 1;
        if (n8 != 0) {
            object = "";
        }
        String string2 = object;
        int n10 = n4 & 2;
        if (n10 != 0) {
            n3 = 0;
            n7 = 0;
        } else {
            n7 = n3;
        }
        String string3 = ob0_12.o();
        String string4 = String.valueOf(50);
        String string5 = ob0_12.n();
        String string6 = ob0_12.C;
        object = new CouponBonanzaInfoRequest(string3, string2, n7, string4, string6, null, string5, 32, null);
        return object;
    }

    public final void c(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "screen");
        Intrinsics.checkNotNullParameter(string3, "label");
        aW aW2 = md3_0.c(this);
        Ob0$c ob0$c = new Ob0$c(this, string2, string3, null);
        Ae3.d(aW2, null, null, ob0$c, 3);
    }

    public final void d(CouponBonanzaInfoRequest couponBonanzaInfoRequest) {
        boolean bl2 = true;
        this.w(bl2);
        this.A = bl2;
        aW aW2 = md3_0.c(this);
        Ob0$d ob0$d = new Ob0$d(this);
        Ob0$e ob0$e = new Ob0$e(this, couponBonanzaInfoRequest, null);
        Ae3.d(aW2, ob0$d, null, ob0$e, 2);
    }

    public final void e() {
        boolean bl2;
        LinkedHashMap linkedHashMap = this.z;
        linkedHashMap.clear();
        Iterator iterator = ((Iterable)this.m.getValue()).iterator();
        while (bl2 = iterator.hasNext()) {
            boolean bl3;
            Object object = (IFilter)iterator.next();
            p83_0 p83_02 = new p83_0();
            Object object2 = ((IFilter)object).getCouponAttributeValues();
            if (object2 != null) {
                object2 = ((p83_0)object2).listIterator();
                while (true) {
                    Boolean bl4;
                    Object object3 = object2;
                    object3 = (ob3_2)object2;
                    boolean bl5 = ((ob3_2)object3).hasNext();
                    if (!bl5) break;
                    Boolean bl6 = ((CouponAttributeValues)(object3 = (CouponAttributeValues)((ob3_2)object3).next())).getSelected();
                    bl5 = Intrinsics.areEqual(bl6, bl4 = Boolean.TRUE);
                    if (!bl5) continue;
                    p83_02.add(object3);
                }
            }
            if (!(bl3 = p83_02.isEmpty() ^ true)) continue;
            object = ((IFilter)object).getKey();
            Intrinsics.checkNotNull(object);
            linkedHashMap.put(object, p83_02);
        }
    }

    public final String g() {
        boolean bl2;
        Iterator iterator = this.z.entrySet().iterator();
        String string2 = "";
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            Object object2 = (String)object.getKey();
            object = (p83_0)object.getValue();
            String string3 = "=in=(";
            string2 = nb0_0.a(string2, (String)object2, string3);
            object = ((p83_0)object).listIterator();
            while (true) {
                object2 = object;
                object2 = (ob3_2)object;
                boolean bl3 = ((ob3_2)object2).hasNext();
                if (!bl3) break;
                object2 = ((CouponAttributeValues)((ob3_2)object2).next()).getValue();
                string3 = ",";
                string2 = nb0_0.a(string2, (String)object2, string3);
            }
            object = ");";
            string2 = Qj0.b(string2, (String)object);
        }
        return string2;
    }

    public final Integer h() {
        Object object = this.t;
        object = object != null && (object = ((ICouponBonanzaInfo)object).getPointsBalance()) != null ? ((PointsBalance)object).getRemainingBalance() : null;
        return object;
    }

    public final String i() {
        String string2;
        int n3 = 1;
        Object object = this.t;
        if (object != null && (object = ((ICouponBonanzaInfo)object).getPointsBalance()) != null && (object = ((PointsBalance)object).getRemainingBalance()) != null) {
            int n4 = ((Number)object).intValue();
            Object object2 = StringCompanionObject.INSTANCE;
            object2 = this.a;
            int n7 = R$string.remaining_bbs_coins;
            object2 = object2.getString(n7);
            Intrinsics.checkNotNullExpressionValue(object2, "getString(...)");
            object = n4;
            Object[] objectArray = new Object[n3];
            objectArray[0] = object;
            object = "format(...)";
            string2 = xh2_0.a(objectArray, n3, (String)object2, (String)object);
        } else {
            string2 = "";
        }
        return string2;
    }

    public final long j() {
        z40_0.Companion.getClass();
        return z40$a.a((Context)this.a).a.h("coupon_bonanza_sale_end_time_in_long");
    }

    public final long k() {
        z40_0.Companion.getClass();
        return z40$a.a((Context)this.a).a.h("coupon_bonanza_sale_start_time_in_long");
    }

    public final String l() {
        String string2 = null;
        long l2 = k7.q();
        long l3 = this.j();
        int n3 = 1;
        CharSequence charSequence = "getString(...)";
        Application application = this.a;
        String string3 = "format(...)";
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object > 0) {
            Object object2 = new SimpleDateFormat("dd MMM");
            long l4 = this.j();
            int n4 = 1000;
            long l7 = n4;
            Object object3 = l4 *= l7;
            object2 = ((Format)object2).format(object3);
            Intrinsics.checkNotNullExpressionValue(object2, string3);
            object3 = StringCompanionObject.INSTANCE;
            object3 = application.getResources();
            int n7 = R$string.sale_ended_on;
            object3 = object3.getString(n7);
            Intrinsics.checkNotNullExpressionValue(object3, (String)charSequence);
            Object[] objectArray = new Object[n3];
            objectArray[0] = object2;
            string2 = xh2_0.a(objectArray, n3, (String)object3, string3);
        } else {
            l3 = this.k();
            long l8 = this.j();
            long l12 = 0L;
            String string4 = " ";
            Object object4 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
            if (object4 <= 0 && (object = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1)) <= 0) {
                Object object5 = StringCompanionObject.INSTANCE;
                object5 = application.getResources();
                int n8 = R$string.sale_ends_in;
                object5 = object5.getString(n8);
                Intrinsics.checkNotNullExpressionValue(object5, (String)charSequence);
                Object object6 = TimeUnit.SECONDS;
                l3 = this.j();
                l8 = k7.q();
                l3 -= l8;
                l3 = ((TimeUnit)((Object)object6)).toDays(l3);
                long l14 = l3 == l12 ? 0 : (l3 < l12 ? -1 : 1);
                if (l14 <= 0) {
                    l3 = this.j();
                    l8 = k7.q();
                    long l15 = ((TimeUnit)((Object)object6)).toHours(l3 -= l8);
                    long l16 = l15 - l12;
                    Object object7 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                    if (object7 <= 0) {
                        object6 = application.getResources();
                        int n10 = R$string.less_than_an_hour;
                        object6 = object6.getString(n10);
                        Intrinsics.checkNotNull(object6);
                    } else {
                        Object object8 = application.getResources();
                        l14 = R$string.hours;
                        object8 = object8.getString((int)l14);
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(l15);
                        ((StringBuilder)charSequence).append(string4);
                        ((StringBuilder)charSequence).append((String)object8);
                        object6 = ((StringBuilder)charSequence).toString();
                    }
                } else {
                    object6 = application.getResources();
                    l14 = R$string.days;
                    object6 = object6.getString((int)l14);
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(l3);
                    ((StringBuilder)charSequence).append(string4);
                    ((StringBuilder)charSequence).append((String)object6);
                    object6 = ((StringBuilder)charSequence).toString();
                }
                Object[] objectArray = new Object[n3];
                objectArray[0] = object6;
                string2 = xh2_0.a(objectArray, n3, (String)object5, string3);
            } else {
                l3 = this.k();
                long l17 = l2 - l3;
                object = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
                if (object < 0) {
                    Object object9 = StringCompanionObject.INSTANCE;
                    object9 = application.getResources();
                    int n14 = R$string.sale_starts_in;
                    object9 = object9.getString(n14);
                    Intrinsics.checkNotNullExpressionValue(object9, (String)charSequence);
                    Object object10 = TimeUnit.SECONDS;
                    l3 = this.k();
                    l8 = k7.q();
                    l3 -= l8;
                    l3 = ((TimeUnit)((Object)object10)).toDays(l3);
                    long l18 = l3 == l12 ? 0 : (l3 < l12 ? -1 : 1);
                    if (l18 <= 0) {
                        l3 = this.k();
                        l8 = k7.q();
                        long l19 = ((TimeUnit)((Object)object10)).toHours(l3 -= l8);
                        long l20 = l19 - l12;
                        Object object11 = l20 == 0L ? 0 : (l20 < 0L ? -1 : 1);
                        if (object11 <= 0) {
                            object10 = application.getResources();
                            int n15 = R$string.less_than_an_hour;
                            object10 = object10.getString(n15);
                            Intrinsics.checkNotNull(object10);
                        } else {
                            Object object12 = application.getResources();
                            l18 = R$string.hours;
                            object12 = object12.getString((int)l18);
                            charSequence = new StringBuilder();
                            ((StringBuilder)charSequence).append(l19);
                            ((StringBuilder)charSequence).append(string4);
                            ((StringBuilder)charSequence).append((String)object12);
                            object10 = ((StringBuilder)charSequence).toString();
                        }
                    } else {
                        object10 = application.getResources();
                        l18 = R$string.days;
                        object10 = object10.getString((int)l18);
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(l3);
                        ((StringBuilder)charSequence).append(string4);
                        ((StringBuilder)charSequence).append((String)object10);
                        object10 = ((StringBuilder)charSequence).toString();
                    }
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object10;
                    string2 = xh2_0.a(objectArray, n3, (String)object9, string3);
                } else {
                    string2 = "";
                }
            }
        }
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String m() {
        long l2;
        long l3 = this.j();
        String string2 = "COUPON_BONANZA_SALE_END_TIME";
        this.u.a.putPreference(string2, l3);
        l3 = k7.q();
        boolean bl2 = this.p();
        String string3 = "sale_ended";
        String string4 = "benefits";
        if (!bl2) {
            long l4 = this.j();
            long l7 = l3 - l4;
            Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object <= 0) return string4;
            return string3;
        }
        long l8 = this.j();
        long l12 = l3 - l8;
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object > 0) return string3;
        long l14 = this.k();
        l8 = this.j();
        long l15 = l3 - l8;
        Object object2 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
        if (object2 <= 0 && (l2 = l14 == l3 ? 0 : (l14 < l3 ? -1 : 1)) <= 0) {
            return string4;
        }
        this.k();
        return string4;
    }

    public final String n() {
        boolean bl2 = this.p();
        String string2 = bl2 ? ((UserInformation)this.b.getValue()).getSecureAccessToken() : "";
        return kp1_0.c("Bearer ", string2);
    }

    public final String o() {
        String string2;
        boolean bl2 = this.p();
        if (bl2) {
            string2 = ((UserInformation)this.b.getValue()).getUserEmailId();
            Intrinsics.checkNotNull(string2);
        } else {
            string2 = "guest";
        }
        return string2;
    }

    public final boolean p() {
        return ((UserInformation)this.b.getValue()).isUserOnline();
    }

    public final void q(Activity object) {
        Intrinsics.checkNotNullParameter(object, "activity");
        z40_0.Companion.getClass();
        Application application = this.a;
        String string2 = z40$a.a((Context)application).a.b("coupon_bonanza_t_and_c_url");
        Class<TermsAndConditionActivity> clazz = TermsAndConditionActivity.class;
        Intent intent = new Intent((Context)object, clazz);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            int n3 = R$string.server_alert_msg;
            object = application.getString(n3);
            Intrinsics.checkNotNullExpressionValue(object, "getString(...)");
            hv3_0.o0(1, (String)object, null);
            return;
        }
        application = new Bundle();
        application.putString("url", string2);
        intent.putExtras((Bundle)application);
        object.startActivity(intent);
    }

    public final void r(int n3, String string2, String string3) {
        aW aW2 = md3_0.c(this);
        String string4 = "";
        pb0_1 pb0_12 = new pb0_1(this, string2, string3, n3, null, false, string4, string4, null);
        Ae3.d(aW2, null, null, pb0_12, 3);
    }

    public final void s() {
        this.w(false);
        Object object = StringCompanionObject.INSTANCE;
        object = hv3_0.K(R$string.acc_error_message_page_load_fail);
        String string2 = hv3_0.K(R$string.something_wrong_msg);
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        String string3 = xh2_0.a(objectArray, n3, (String)object, "format(...)");
        object = this.a;
        int n4 = R$string.something_went_wrong_error;
        object = object.getString(n4);
        Intrinsics.checkNotNullExpressionValue(object, "getString(...)");
        hv3_0.o0(n3, (String)object, string3);
    }

    public final void t(ICouponBonanzaInfo object) {
        Object object2;
        this.t = object;
        boolean bl2 = this.F;
        Integer n3 = 0;
        p83_0 p83_02 = null;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.c;
        if (bl2) {
            object2 = new p83_0();
            Object object3 = (Collection)parcelableSnapshotMutableState.getValue();
            ((p83_0)object2).addAll((Collection)object3);
            object3 = ((ICouponBonanzaInfo)object).getCouponsAvailable();
            object3 = object3 != null ? ((ICouponsAvailable)object3).getResponseBody() : null;
            Intrinsics.checkNotNull(object3);
            ((p83_0)object2).addAll((Collection)object3);
            parcelableSnapshotMutableState.setValue(object2);
            this.F = false;
        } else {
            object2 = ((ICouponBonanzaInfo)object).getCouponsAvailable();
            if (object2 != null) {
                object2 = ((ICouponsAvailable)object2).getResponseBody();
            } else {
                bl2 = false;
                object2 = null;
            }
            Intrinsics.checkNotNull(object2);
            parcelableSnapshotMutableState.setValue(object2);
            object2 = Boolean.TRUE;
            parcelableSnapshotMutableState = this.r;
            parcelableSnapshotMutableState.setValue(object2);
        }
        object2 = ((ICouponBonanzaInfo)object).getMyCoupons();
        Intrinsics.checkNotNull(object2);
        parcelableSnapshotMutableState = this.d;
        parcelableSnapshotMutableState.setValue(object2);
        object = ((ICouponBonanzaInfo)object).getCouponsAvailable();
        if (object != null) {
            p83_02 = ((ICouponsAvailable)object).getFilters();
        }
        Intrinsics.checkNotNull(p83_02);
        this.m.setValue(p83_02);
        this.v(false);
        object = new p83_0();
        this.f.setValue(object);
        this.g.setValue(n3);
        this.h.setValue(n3);
        this.e();
        this.w(false);
    }

    public final void u(boolean bl2) {
        Boolean bl3 = bl2;
        this.o.setValue(bl3);
    }

    public final void v(boolean bl2) {
        Boolean bl3 = bl2;
        this.q.setValue(bl3);
    }

    public final void w(boolean bl2) {
        Boolean bl3 = bl2;
        this.k.setValue(bl3);
    }
}

