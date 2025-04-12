/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.Home.BottomNavigationData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Q7
implements Function1 {
    public final /* synthetic */ AjioHomeActivity a;

    public /* synthetic */ Q7(AjioHomeActivity ajioHomeActivity) {
        this.a = ajioHomeActivity;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        Object object2 = AjioHomeActivity.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "bottomNavigationDataDataCallback");
        Object object3 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n3 != 0 && (n3 = ((DataCallback)object).getStatus()) == 0) {
            String string2;
            object3 = ((AjioHomeActivity)object2).P2();
            Object object4 = (BottomNavigationData)((DataCallback)object).getData();
            ((h91)object3).n = object4;
            object3 = od3_2.a;
            int n4 = ((String)object3).length();
            if (n4 == 0) {
                object3 = od3_2.a();
            }
            if ((n3 = (int)(Intrinsics.areEqual(object3, string2 = ((ld3_2)((Object)(object4 = ld3_2.STORE_AJIO))).getStoreId()) ? 1 : 0)) != 0) {
                object = (BottomNavigationData)((DataCallback)object).getData();
                object3 = ((ld3_2)((Object)object4)).getStoreId();
                ((AjioHomeActivity)object2).k3((BottomNavigationData)object, (String)object3);
                int n7 = ((AjioHomeActivity)object2).f1;
                n3 = -1;
                if (n7 > n3) {
                    ((AjioHomeActivity)object2).f3(n7);
                }
                if ((object = ((AjioHomeActivity)object2).k1) != null) {
                    ((AjioHomeActivity)object2).a3((Bundle)object);
                    n7 = 0;
                    object = null;
                    ((AjioHomeActivity)object2).k1 = null;
                }
                ((AjioHomeActivity)object2).O2();
                ((AjioHomeActivity)object2).updateCartWishCount();
            }
            if ((object = ((AjioHomeActivity)object2).P2().o) == null) {
                object = ((AjioHomeActivity)object2).P2();
                object2 = ((h91)object).g;
                object = ((h91)object).b;
                ((HomeRepo)object).getLuxeBottomTabsData((zr1_1)object2);
            }
        }
        return Unit.a;
    }
}

