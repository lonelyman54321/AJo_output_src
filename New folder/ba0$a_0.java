/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.google.gson.Gson;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.bonanza.activity.CouponBonanzaActivity;
import com.ril.ajio.bonanza.model.ICoupon;
import com.ril.ajio.bonanza.model.ICouponBonanzaInfo;
import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaErrorInfo;
import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaInfo;
import com.ril.ajio.kmm.shared.bonanza.model.DisplayMessageInfo;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ba0$a
 */
public final class ba0$a_0
implements fs0_2 {
    public final /* synthetic */ CouponBonanzaActivity a;

    public ba0$a_0(CouponBonanzaActivity couponBonanzaActivity) {
        this.a = couponBonanzaActivity;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object emit(Object object, f80_0 f80_02) {
        int n3;
        Object object2 = object;
        object2 = (BaseResponse)object;
        Object object3 = this.a.l2();
        object3.getClass();
        Intrinsics.checkNotNullParameter(object2, "response");
        Object object4 = ((BaseResponse)object2).getResponseStatusType();
        Object object5 = Ob0$b.$EnumSwitchMapping$0;
        int n4 = ((Enum)object4).ordinal();
        n4 = object5[n4];
        int n7 = 3;
        int n8 = 1;
        if (n4 != n8) {
            int n10 = 2;
            int n14 = 500;
            Object object6 = " Throwable message is null";
            String string2 = "couponBonanza_purchaseCoupons";
            if (n4 != n10) {
                if (n4 != n7) {
                    int n15 = 4;
                    if (n4 == n15) {
                        ((ob0_1)object3).w(n8 != 0);
                        return Unit.a;
                    }
                    object2 = new NoWhenBranchMatchedException();
                    throw object2;
                }
                ((ob0_1)object3).s();
                object4 = ((BaseResponse)object2).getThrowable();
                if (object4 != null && (object4 = ((Throwable)object4).getMessage()) != null) {
                    object6 = object4;
                }
                if ((object2 = ((BaseResponse)object2).getStatusCode()) != null) {
                    n14 = (Integer)object2;
                }
                ((ob0_1)object3).r(n14, string2, (String)object6);
                return Unit.a;
            }
            ((ob0_1)object3).s();
            object4 = ((BaseResponse)object2).getThrowable();
            if (object4 != null && (object4 = ((Throwable)object4).getMessage()) != null) {
                object6 = object4;
            }
            if ((object2 = ((BaseResponse)object2).getStatusCode()) != null) {
                n14 = (Integer)object2;
            }
            ((ob0_1)object3).r(n14, string2, (String)object6);
            return Unit.a;
        }
        if ((object2 = ((BaseResponse)object2).getData()) == null) return Unit.a;
        n4 = object2 instanceof CouponBonanzaInfo;
        boolean bl2 = false;
        int n16 = 0;
        if (n4 != 0) {
            Object object7;
            object2 = (CouponBonanzaInfo)object2;
            object4 = new Gson();
            object2 = ((Gson)object4).toJson(object2);
            object2 = (ICouponBonanzaInfo)Z90.a(ICouponBonanzaInfo.class, (String)object2);
            object4 = ((Iterable)((ob0_1)object3).f.getValue()).iterator();
            Object object8 = object5 = (Object)"";
            while ((n7 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                object5 = (ICoupon)object4.next();
                int n17 = ((String)object8).length();
                if (n17 > 0) {
                    object7 = ",";
                    object8 = Qj0.b((String)object8, (String)object7);
                }
                object5 = ((ICoupon)object5).getExtraLabel();
                object8 = Qj0.b((String)object8, (String)object5);
            }
            object4 = new Bundle();
            n7 = ((Number)((ob0_1)object3).h.getValue()).intValue();
            object7 = "bbs_coins_used";
            object4.putInt((String)object7, n7);
            object5 = ((ob0_1)object3).h();
            if (object5 != null) {
                n7 = (Integer)object5;
            } else {
                n7 = 0;
                object5 = null;
            }
            object4.putInt("bbs_coins_remaining", n7);
            object5 = (Number)((ob0_1)object3).g.getValue();
            n7 = ((Number)object5).intValue();
            object4.putInt("no_coupons", n7);
            object7 = ((ob0_1)object3).E;
            String string3 = "coupon bonanza interaction";
            String string4 = "coupon unlocked successfully";
            String string5 = "coupon_bonanza_coupon_unlock_success";
            String string6 = "";
            int n18 = 1648;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object7, string3, string4, (String)object8, string5, null, null, null, (Bundle)object4, string6, false, null, n18, null);
            ((ob0_1)object3).v(false);
            ((ob0_1)object3).u(false);
            ((p83_0)((ob0_1)object3).c.getValue()).clear();
            ((p83_0)((ob0_1)object3).d.getValue()).clear();
            ((p83_0)((ob0_1)object3).m.getValue()).clear();
            Intrinsics.checkNotNull(object2);
            ((ob0_1)object3).t((ICouponBonanzaInfo)object2);
            object2 = Boolean.TRUE;
            object4 = ((ob0_1)object3).l;
            ((h83_0)object4).setValue(object2);
            object2 = ((ob0_1)object3).a;
            int n19 = R$string.coupons_unlocked_successfully;
            object2 = object2.getString(n19);
            object3 = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            hv3_0.o0(n8, (String)object2, null);
            return Unit.a;
        }
        n4 = object2 instanceof CouponBonanzaErrorInfo;
        if (n4 == 0) return Unit.a;
        object2 = (CouponBonanzaErrorInfo)object2;
        ((ob0_1)object3).w(false);
        object4 = ((CouponBonanzaErrorInfo)object2).getCode();
        if (object4 != null && (n4 = ((Integer)object4).intValue()) == (n3 = 2001)) {
            object2 = ((CouponBonanzaErrorInfo)object2).getDisplayMessage();
            object4 = DisplayMessageInfo.class;
            ((ob0_1)object3).s = object2 = (DisplayMessageInfo)JsonUtils.fromJson((String)object2, (Class)object4);
            ((ob0_1)object3).u(n8 != 0);
            ((ob0_1)object3).v(n8 != 0);
        } else {
            int n20;
            ((ob0_1)object3).v(false);
            ((ob0_1)object3).u(false);
            object4 = ((CouponBonanzaErrorInfo)object2).getCode();
            if (object4 != null && (n16 = ((Integer)object4).intValue()) == (n3 = 2002)) {
                if ((object2 = ((CouponBonanzaErrorInfo)object2).getDisplayMessage()) != null) {
                    hv3_0.o0(n8, (String)object2, null);
                }
            } else if (object4 != null && (n20 = ((Integer)object4).intValue()) == (n4 = 2003)) {
                ((ob0_1)object3).s();
            } else {
                ((ob0_1)object3).s();
            }
        }
        object2 = md3_0.c((jD3)object3);
        object4 = new sb0_2((ob0_1)object3, null);
        Ae3.d((i90_0)object2, null, null, (Function2)object4, n7);
        return Unit.a;
    }
}

