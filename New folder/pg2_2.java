/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.referral.RefereeEarnCash;
import com.ril.ajio.services.data.referral.ReferralExpiresIn;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from pG2
 */
public final class pg2_2 {
    public static final pG2$a Companion;
    public static final long g;
    public final View a;
    public final TextView b;
    public final TextView c;
    public final View d;
    public final Handler e;
    public final ZT f;

    static {
        Object object = new Object();
        Companion = object;
        object = z40_0.Companion;
        long l2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.h("referee_widget_time");
        long l3 = 1000;
        g = l2 * l3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public pg2_2(View object, String object2) {
        int n3;
        block11: {
            float f5;
            int n4;
            Object object3;
            int n7;
            int n8;
            block12: {
                Exception exception2;
                Object object4;
                block10: {
                    float f6;
                    block9: {
                        block8: {
                            n8 = 2;
                            n7 = 1;
                            Intrinsics.checkNotNullParameter(object, "view");
                            Intrinsics.checkNotNullParameter(object2, "screenName");
                            this.a = object;
                            n3 = R$id.referee_cash_info;
                            object2 = object.findViewById(n3);
                            object3 = "findViewById(...)";
                            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                            object2 = (TextView)object2;
                            this.b = object2;
                            n3 = R$id.referee_cash_expire;
                            object2 = object.findViewById(n3);
                            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                            object2 = (TextView)object2;
                            this.c = object2;
                            n3 = R$id.referee_cancel;
                            object2 = object.findViewById(n3);
                            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                            this.d = object2;
                            int n10 = og1_1.c();
                            if (n10 != 0 || (n10 = bv1_0.d) == 0 || (object3 = bv1_0.a) == null || (n10 = ((String)object3).length()) == 0) break block11;
                            object3 = z40_0.Companion;
                            object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a;
                            object4 = "referral_feature_enable";
                            n10 = (int)(((ao0_0)object3).a((String)object4) ? 1 : 0);
                            if (n10 == 0 || (n10 = (int)(((ao0_0)(object3 = z40$a.a((Context)AJIOApplication$a.a()).a)).a((String)(object4 = "referee_enable")) ? 1 : 0)) == 0) break block11;
                            object3 = "format(...)";
                            object.setVisibility(0);
                            super(this);
                            object2.setOnClickListener((View.OnClickListener)object);
                            object2 = Looper.getMainLooper();
                            super((Looper)object2);
                            this.e = object;
                            object2 = new ZT(this, n7);
                            this.f = object2;
                            long l2 = g;
                            object.postDelayed((Runnable)object2, l2);
                            object = bv1_0.b;
                            if (object == null || (n4 = ((String)object).length()) == 0) {
                                bv1_0.b = object = "Your friend";
                            }
                            n4 = 0;
                            f5 = 0.0f;
                            object = null;
                            try {
                                object2 = StringCompanionObject.INSTANCE;
                                object2 = AJIOApplication$a.a();
                                object2 = z40$a.a((Context)object2);
                                object2 = object2.a;
                                object4 = "referral_congratulations_message";
                                object2 = object2.b((String)object4);
                                object4 = bv1_0.c;
                                if (object4 == null) break block8;
                                f6 = object4.getAmount();
                                break block9;
                            }
                            catch (Exception exception2) {
                                break block10;
                            }
                        }
                        f6 = 0.0f;
                        object4 = null;
                    }
                    object4 = Float.valueOf(f6);
                    object4 = qz2_0.x((Float)object4);
                    Object[] objectArray = new Object[n8];
                    String string2 = bv1_0.b;
                    objectArray[0] = string2;
                    objectArray[n7] = object4;
                    object4 = Arrays.copyOf(objectArray, n8);
                    object2 = String.format((String)object2, object4);
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                    break block12;
                }
                object4 = yn3_0.a;
                object4.e(exception2);
                object2 = StringCompanionObject.INSTANCE;
                object2 = bv1_0.c;
                if (object2 != null) {
                    f5 = object2.getAmount();
                }
                object = qz2_0.x(Float.valueOf(f5));
                object2 = new Object[n8];
                object4 = bv1_0.b;
                object2[0] = object4;
                object2[n7] = object;
                object = "%s has given you %s<sup><small>*</small></sup> cash";
                object2 = xh2_0.a((Object[])object2, n8, (String)object, (String)object3);
            }
            object = this.b;
            object2 = hv3_0.f((String)object2);
            object.setText((CharSequence)object2);
            object = bv1_0.c;
            n3 = 0;
            object2 = null;
            if (object != null && (object = ((RefereeEarnCash)object).getExpiresIn()) != null) {
                object = ((ReferralExpiresIn)object).getValue();
            } else {
                n4 = 0;
                object = null;
                f5 = 0.0f;
            }
            Object object5 = bv1_0.c;
            if (object5 != null && (object5 = ((RefereeEarnCash)object5).getExpiresIn()) != null) {
                object5 = ((ReferralExpiresIn)object5).getUnit();
            } else {
                n8 = 0;
                object5 = null;
            }
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(object);
            ((StringBuilder)object3).append(" ");
            ((StringBuilder)object3).append((String)object5);
            object = ((StringBuilder)object3).toString();
            n8 = R$string.referee_cash_expire;
            Object[] objectArray = new Object[n7];
            objectArray[0] = object;
            object = hv3_0.f(hv3_0.L(n8, objectArray));
            object5 = this.c;
            object5.setText((CharSequence)object);
            bv1_0.a = null;
            bv1_0.b = null;
            bv1_0.c = null;
            bv1_0.d = false;
            return;
        }
        n3 = 8;
        object.setVisibility(n3);
    }

    public final void a() {
        ZT zT = this.f;
        if (zT != null) {
            Handler handler = this.e;
            if (handler != null) {
                handler.removeCallbacks((Runnable)zT);
            }
            zT = this.a;
            int n3 = 8;
            zT.setVisibility(n3);
        }
    }
}

