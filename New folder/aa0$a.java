/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.Gson;
import com.ril.ajio.bonanza.activity.CouponBonanzaActivity;
import com.ril.ajio.bonanza.model.ICouponBonanzaInfo;
import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaErrorInfo;
import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaInfo;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class aa0$a
implements fs0_2 {
    public final /* synthetic */ CouponBonanzaActivity a;

    public aa0$a(CouponBonanzaActivity couponBonanzaActivity) {
        this.a = couponBonanzaActivity;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object emit(Object object, f80_0 object2) {
        block13: {
            int n3;
            Object object3;
            Object object4;
            block14: {
                object = (BaseResponse)object;
                object2 = this.a.l2();
                object2.getClass();
                Intrinsics.checkNotNullParameter(object, "response");
                object4 = ((BaseResponse)object).getResponseStatusType();
                object3 = Ob0$b.$EnumSwitchMapping$0;
                n3 = ((Enum)object4).ordinal();
                n3 = object3[n3];
                object3 = ((ob0_1)object2).p;
                int n4 = 1;
                if (n3 == n4) break block14;
                int n7 = 2;
                Object object5 = " Throwable message is null";
                String string2 = "couponBonanza_getCouponInfo";
                int n8 = 500;
                if (n3 != n7) {
                    n7 = 3;
                    if (n3 != n7) {
                        int n10 = 4;
                        if (n3 != n10) {
                            object = new NoWhenBranchMatchedException();
                            throw object;
                        }
                        ((ob0_1)object2).w(n4 != 0);
                        break block13;
                    } else {
                        object4 = ((BaseResponse)object).getStatusCode();
                        n3 = object4 != null ? (Integer)object4 : 500;
                        object4 = n3;
                        ((h83_0)object3).setValue(object4);
                        object4 = ((BaseResponse)object).getThrowable();
                        if (object4 != null && (object4 = ((Throwable)object4).getMessage()) != null) {
                            object5 = object4;
                        }
                        if ((object = ((BaseResponse)object).getStatusCode()) != null) {
                            n8 = (Integer)object;
                        }
                        ((ob0_1)object2).r(n8, string2, (String)object5);
                    }
                    break block13;
                } else {
                    object4 = ((BaseResponse)object).getStatusCode();
                    n3 = object4 != null ? (Integer)object4 : 500;
                    object4 = n3;
                    ((h83_0)object3).setValue(object4);
                    object4 = ((BaseResponse)object).getThrowable();
                    if (object4 != null && (object4 = ((Throwable)object4).getMessage()) != null) {
                        object5 = object4;
                    }
                    if ((object = ((BaseResponse)object).getStatusCode()) != null) {
                        n8 = (Integer)object;
                    }
                    ((ob0_1)object2).r(n8, string2, (String)object5);
                }
                break block13;
            }
            if ((object = ((BaseResponse)object).getData()) != null) {
                n3 = object instanceof CouponBonanzaInfo;
                if (n3 != 0) {
                    object = (CouponBonanzaInfo)object;
                    object4 = new Gson();
                    object = ((Gson)object4).toJson(object);
                    object4 = ICouponBonanzaInfo.class;
                    object = (ICouponBonanzaInfo)Z90.a((Class)object4, (String)object);
                    Intrinsics.checkNotNull(object);
                    ((ob0_1)object2).t((ICouponBonanzaInfo)object);
                    boolean bl2 = false;
                    object = null;
                    ((h83_0)object3).setValue(null);
                } else {
                    n3 = object instanceof CouponBonanzaErrorInfo;
                    if (n3 != 0) {
                        object = (CouponBonanzaErrorInfo)object;
                        ((ob0_1)object2).w(false);
                        object = ((CouponBonanzaErrorInfo)object).getStatusCodeValue();
                        ((h83_0)object3).setValue(object);
                    }
                }
            }
        }
        ((ob0_1)object2).A = false;
        return Unit.a;
    }
}

