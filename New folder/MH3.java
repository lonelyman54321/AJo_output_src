/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ConnectivityManager
 *  android.os.Build$VERSION
 */
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class MH3 {
    public final List a;

    public MH3(aq3 object) {
        Intrinsics.checkNotNullParameter(object, "trackers");
        Object object2 = object.b;
        sx_0 sx_02 = new sx_0((N50)object2);
        Object object3 = object.c;
        object2 = new vx_2((wx_1)object3);
        Object object4 = object.e;
        object3 = new hc3_1((N50)object4);
        Object object5 = object.d;
        object4 = new pu1_1((N50)object5);
        tv1_1 tv1_12 = new tv1_1((N50)object5);
        vu1_0 vu1_02 = new vu1_0((N50)object5);
        uu1_1 uu1_12 = new uu1_1((N50)object5);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            n3 = OH3.b;
            object = object.a;
            Intrinsics.checkNotNullParameter(object, "context");
            object = object.getSystemService("connectivity");
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.net.ConnectivityManager");
            object = object;
            object5 = new gv1_0((ConnectivityManager)object);
        } else {
            n3 = 0;
            object5 = null;
        }
        object = new w50[]{sx_02, object2, object3, object4, tv1_12, vu1_02, uu1_12, object5};
        Intrinsics.checkNotNullParameter(object, "elements");
        object = tp_2.y((Object[])object);
        Intrinsics.checkNotNullParameter(object, "controllers");
        this.a = object;
    }

    public final boolean a(EI3 object) {
        boolean bl2;
        Object object2;
        Object object3;
        boolean bl3;
        Intrinsics.checkNotNullParameter(object, "workSpec");
        Object object4 = this.a;
        ArrayList arrayList = new ArrayList();
        object4 = object4.iterator();
        while (bl3 = object4.hasNext()) {
            object3 = object4.next();
            object2 = object3;
            object2 = (w50)object3;
            bl2 = object2.a((EI3)object);
            if (!bl2) continue;
            arrayList.add(object3);
        }
        boolean bl4 = arrayList.isEmpty() ^ true;
        if (bl4) {
            object = qx1.a();
            mh3$a_0 mh3$a_0 = mh3$a_0.c;
            bl2 = false;
            object2 = null;
            int n3 = 31;
            object3 = arrayList;
            CollectionsKt.R(arrayList, null, null, null, mh3$a_0, n3);
            object.getClass();
        }
        return arrayList.isEmpty();
    }

    public final es0_2 b(EI3 es0_2Array) {
        Object object;
        Object object2;
        int n3;
        Intrinsics.checkNotNullParameter(es0_2Array, "spec");
        Object object3 = this.a;
        Object object4 = new ArrayList();
        object3 = object3.iterator();
        while ((n3 = object3.hasNext()) != 0) {
            object = object2 = object3.next();
            object = (w50)object2;
            boolean bl2 = object.c((EI3)es0_2Array);
            if (!bl2) continue;
            ((ArrayList)object4).add(object2);
        }
        n3 = yx_2.o(object4, 10);
        object3 = new ArrayList(n3);
        object4 = ((ArrayList)object4).iterator();
        while ((n3 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
            object2 = (w50)object4.next();
            object = es0_2Array.j;
            object2 = object2.b((b60)object);
            object3.add(object2);
        }
        es0_2Array = CollectionsKt.k0(object3);
        object3 = new es0_2[]{};
        es0_2Array = es0_2Array.toArray((T[])object3);
        object3 = new MH3$b(es0_2Array);
        return ms0_1.h((es0_2)object3);
    }
}

