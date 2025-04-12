/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.os.Bundle
 */
import android.graphics.Bitmap;
import android.os.Bundle;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.Home.BottomNavigationData;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class R7
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ R7(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = "this$0";
        Object[] objectArray = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (DataCallback)object;
                objectArray = (op2_2)objectArray;
                Intrinsics.checkNotNullParameter(objectArray, (String)object2);
                objectArray.n.k(object);
                return Unit.a;
            }
            case 1: {
                object = (qy_2)object;
                objectArray = (kd1_1)objectArray;
                Intrinsics.checkNotNullParameter(objectArray, "$imageDetails");
                object2 = ((qy_2)object).a;
                n3 = 0;
                Object object3 = null;
                if (object2 != null) {
                    object2 = yn3_0.a;
                    String string2 = objectArray.a;
                    String string3 = "Bottom tab image downloaded successful for url = ";
                    string2 = kp1_0.c(string3, string2);
                    object3 = new Object[]{};
                    ((yn3$a)object2).a(string2, object3);
                    object2 = aa_1.b;
                    object = ((qy_2)object).a;
                    Intrinsics.checkNotNull(object);
                    object2.getClass();
                    string2 = objectArray.a;
                    Intrinsics.checkNotNullParameter(string2, "id");
                    Intrinsics.checkNotNullParameter(object, "bitmap");
                    object2 = ((pn1_1)object2).a;
                    object3 = new SoftReference(object);
                    ((ConcurrentHashMap)object2).put(string2, object3);
                    object2 = aa_1.a;
                    object2.getClass();
                    n3 = (int)(aa_1.d((kd1_1)objectArray) ? 1 : 0);
                    if (n3 != 0) {
                        Intrinsics.checkNotNull(object);
                        aa_1.a((aa_1)object2, (Bitmap)object, string2);
                    } else {
                        Intrinsics.checkNotNull(object);
                        objectArray = objectArray.b;
                        objectArray.setImageBitmap((Bitmap)object);
                        Intrinsics.checkNotNull(object);
                        aa_1.a((aa_1)object2, (Bitmap)object, string2);
                    }
                } else {
                    object = yn3_0.a;
                    object2 = objectArray.a;
                    object2 = kp1_0.c("Bottom tab image not downloaded for url = ", (String)object2);
                    objectArray = new Object[]{};
                    ((yn3$a)object).a((String)object2, objectArray);
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        Object object4 = AjioHomeActivity.Companion;
        objectArray = (AjioHomeActivity)objectArray;
        Intrinsics.checkNotNullParameter(objectArray, (String)object2);
        Intrinsics.checkNotNullParameter(object, "bottomNavigationDataDataCallback");
        object2 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n4 != 0 && (n4 = ((DataCallback)object).getStatus()) == 0) {
            object2 = objectArray.P2();
            ((h91)object2).o = object4 = (BottomNavigationData)((DataCallback)object).getData();
            n4 = (int)(og1_1.c() ? 1 : 0);
            if (n4 != 0) {
                object = (BottomNavigationData)((DataCallback)object).getData();
                object2 = ld3_2.STORE_LUXE.getStoreId();
                objectArray.k3((BottomNavigationData)object, (String)object2);
                int n7 = objectArray.f1;
                n4 = -1;
                if (n7 > n4) {
                    objectArray.f3(n7);
                }
                if ((object = objectArray.k1) != null) {
                    objectArray.a3((Bundle)object);
                    n7 = 0;
                    object = null;
                    objectArray.k1 = null;
                }
                objectArray.O2();
                objectArray.updateCartWishCount();
            }
            if ((object = objectArray.P2().n) == null) {
                object = objectArray.P2();
                object2 = ((h91)object).f;
                object = ((h91)object).b;
                ((HomeRepo)object).getBottomTabsData((zr1_1)object2);
            }
        }
        return Unit.a;
    }
}

