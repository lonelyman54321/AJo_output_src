/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$n;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from K7
 */
public final class k7_0
implements FragmentManager$n {
    public final /* synthetic */ AjioHomeActivity a;

    public /* synthetic */ k7_0(AjioHomeActivity ajioHomeActivity) {
        this.a = ajioHomeActivity;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        IllegalStateException illegalStateException2;
        int n3;
        Object object;
        Object object2;
        boolean bl2;
        block5: {
            boolean bl3;
            Object object3;
            block4: {
                block3: {
                    bl2 = true;
                    object3 = AjioHomeActivity.Companion;
                    object3 = this.a;
                    Intrinsics.checkNotNullParameter(object3, "this$0");
                    object2 = z40_0.Companion;
                    object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
                    object = "inAppUpdateEnable";
                    bl3 = ((ao0_0)object2).a((String)object);
                    if (!bl3) return;
                    object3.getClass();
                    try {
                        object2 = ((AjioHomeActivity)object3).T0;
                        if (object2 == null || (object2 = ((Fragment)object2).getChildFragmentManager()) == null) break block3;
                        n3 = R$id.home_content;
                        object2 = ((FragmentManager)object2).D(n3);
                        break block4;
                    }
                    catch (IllegalStateException illegalStateException2) {
                        break block5;
                    }
                }
                bl3 = false;
                object2 = null;
            }
            n3 = qo_0.c;
            if (n3 != 0) return;
            if (object2 == null) return;
            bl3 = object2 instanceof qn_2;
            if (bl3) return;
            {
                bl3 = qo_0.b;
                if (bl3) return;
                object = ((AjioHomeActivity)object3).O0;
                object2 = new oo_0((zr1_1)object, (Activity)object3);
                ((oo_0)object2).a(bl2);
                return;
            }
        }
        object2 = yn3_0.a;
        String string2 = ((Object)illegalStateException2).toString();
        Object[] objectArray = new Object[bl2];
        n3 = 0;
        object = null;
        objectArray[0] = string2;
        string2 = "ParentNotFound";
        ((yn3$a)object2).d(string2, objectArray);
    }
}

