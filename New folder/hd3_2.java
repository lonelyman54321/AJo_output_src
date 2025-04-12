/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.payment.activity.OrderConfirmationActivity;

/*
 * Renamed from hd3
 */
public final class hd3_2
extends zj0_0 {
    public hd3_2(Activity activity) {
        super(activity);
    }

    public final void b(Fragment objectArray, int n3, String string2, int n4, String object, String string3) {
        Object object2 = this.a;
        boolean bl2 = object2 instanceof AjioHomeActivity;
        if (bl2) {
            Activity activity = object2;
            activity = (AjioHomeActivity)object2;
            boolean bl3 = activity.X2(string2);
            if (bl3) {
                string3 = new Bundle();
                int n7 = TextUtils.isEmpty((CharSequence)object);
                if (n7 == 0) {
                    object2 = "search_landing_experiment";
                    string3.putString((String)object2, (String)object);
                }
                object = h40_0.a;
                int n8 = h40_0.c();
                if (n8 != 0 && (n8 = ((String)(object = od3_2.a())).equals(object2 = ld3_2.STORE_AJIOGRAM.getStoreId())) != 0 && (n7 = (object = activity.getSupportFragmentManager().c.f()).size()) > 0) {
                    block12: {
                        object = ((Fragment)object.get((int)0)).getChildFragmentManager().c.f().iterator();
                        while ((n7 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                            object2 = object.next();
                            bl2 = object2 instanceof q9_0;
                            if (!bl2) continue;
                            object2 = (q9_0)object2;
                            break block12;
                        }
                        n7 = 0;
                        object2 = null;
                    }
                    if (object2 != null) {
                        object = object2.ab();
                        AjioHomeActivity.Companion.getClass();
                        object2 = AjioHomeActivity.D1;
                        if (object2 != null) {
                            object2.add(object);
                        }
                    }
                }
                object = ed3_2.Companion;
                object.getClass();
                ed3_2 ed3_22 = ed3$a.a((Bundle)string3, string2);
                n8 = 1000;
                if (n4 == n8) {
                    Fragment fragment = activity.T0;
                    Boolean bl4 = Boolean.FALSE;
                    boolean bl5 = true;
                    activity.Q1(fragment, ed3_22, bl5, string2, bl4);
                } else {
                    zj0_0.a((Fragment)objectArray, ed3_22, n3, string2);
                }
            }
        } else {
            boolean bl6 = object2 instanceof OrderConfirmationActivity;
            if (bl6) {
                objectArray = kj0_1.g();
                object2 = (OrderConfirmationActivity)object2;
                objectArray.getClass();
                kj0_1.k((OrderConfirmationActivity)object2, string3);
            } else {
                objectArray = new Object[]{};
                yn3$a yn3$a = yn3_0.a;
                string2 = "Not a BaseActivity";
                yn3$a.k(string2, objectArray);
            }
        }
    }
}

