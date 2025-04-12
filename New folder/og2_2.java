/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.text.TextUtils
 */
import android.app.Activity;
import android.text.TextUtils;
import com.ril.ajio.view.BaseActivity;

/*
 * Renamed from og2
 */
public final class og2_2
extends zj0_0 {
    public og2_2(Activity activity) {
        super(activity);
    }

    public final void b(String objectArray, String object, String string2) {
        Activity activity = this.a;
        int n3 = activity instanceof BaseActivity;
        if (n3 != 0) {
            activity = (BaseActivity)activity;
            n3 = 1;
            activity.C2(n3, (String)objectArray, (String)object, string2);
        } else {
            objectArray = new Object[]{};
            object = yn3_0.a;
            string2 = "MyAccount Deeplink Failed";
            ((yn3$a)object).k(string2, objectArray);
        }
    }

    public final void c(String object) {
        Object object2 = bj0_1.e((String)object);
        boolean n3 = TextUtils.isEmpty((CharSequence)object2);
        if (!n3) {
            object2 = "/order/";
            boolean bl2 = ((String)object).contains((CharSequence)object2);
            if (bl2) {
                int n4;
                int n7 = ((Object)(object = bj0_1.e((String)object).split((String)object2))).length;
                if (n7 > (n4 = 1)) {
                    object = object[n4];
                    this.b((String)object, null, null);
                }
            } else {
                object2 = "/order-details";
                boolean bl3 = ((String)object).contains((CharSequence)object2);
                if (bl3) {
                    object2 = "orderId";
                    object = bj0_1.a((String)object2, (String)object);
                    this.b((String)object, null, null);
                } else {
                    object2 = "/odp";
                    boolean bl4 = ((String)object).contains((CharSequence)object2);
                    String string2 = "oid";
                    if (bl4) {
                        object2 = bj0_1.a(string2, (String)object);
                        string2 = "pid";
                        object = bj0_1.a(string2, (String)object);
                        this.b((String)object2, null, (String)object);
                    } else {
                        object2 = "/rcc";
                        boolean bl5 = ((String)object).contains((CharSequence)object2);
                        if (bl5) {
                            object2 = bj0_1.a(string2, (String)object);
                            string2 = "rid";
                            object = bj0_1.a(string2, (String)object);
                            this.b((String)object2, (String)object, null);
                        }
                    }
                }
            }
        } else {
            object = new Object[]{};
            object2 = yn3_0.a;
            String string3 = "MyAccount Deeplink Failed";
            ((yn3$a)object2).k(string3, (Object[])object);
        }
    }
}

