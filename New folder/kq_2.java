/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 */
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ril.ajio.home.AjioHomeActivity;

/*
 * Renamed from kQ
 */
public final class kq_2
extends zj0_0 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void b(Bundle object, Boolean object2) {
        void var1_3;
        String string2;
        yn3$a yn3$a;
        Object object3 = this.a;
        boolean bl2 = object3 instanceof AjioHomeActivity;
        if (!bl2) {
            boolean bl3 = false;
            Object[] objectArray = new Object[]{};
            yn3$a = yn3_0.a;
            object3 = "Ajio Category Link Failed";
            yn3$a.k((String)object3, objectArray);
            return;
        }
        Activity activity = object3;
        activity = (AjioHomeActivity)object3;
        object3 = od3_2.a();
        boolean bl4 = ((String)object3).equals(string2 = ld3_2.STORE_LUXE.getStoreId());
        if (bl4) {
            zd1_1.Companion.getClass();
            object3 = new zd1_1();
            if (object != null) {
                ((Fragment)object3).setArguments((Bundle)object);
            }
            String string3 = "ZD1";
        } else {
            z6_0.Companion.getClass();
            object3 = new z6_0();
            if (object != null) {
                string2 = "IS_CATEGORY_POPUP";
                boolean bl5 = (Boolean)((Object)yn3$a);
                object.putBoolean(string2, bl5);
                ((Fragment)object3).setArguments((Bundle)object);
            }
            String string4 = "z6";
        }
        void var8_12 = var1_3;
        Object object4 = object3;
        boolean bl6 = (Boolean)((Object)yn3$a);
        if (bl6) {
            activity.t();
        }
        Fragment fragment = activity.T0;
        Boolean bl7 = Boolean.FALSE;
        boolean bl8 = true;
        activity.Q1(fragment, (Fragment)object4, bl8, (String)var8_12, bl7);
    }
}

