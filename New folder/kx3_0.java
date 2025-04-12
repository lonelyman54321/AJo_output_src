/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kx3
 */
public final class kx3_0 {
    public static boolean a = true;
    public static ProductsList b;
    public static boolean c = true;

    public static final im2_2 a(km2_2 object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "parameters");
        Object object2 = mm2_1.a();
        Iterator iterator = ((Iterable)((xe3_2)object).b.keySet()).iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            Object object3 = ((xe3_2)object).f(string2);
            if (object3 == null) {
                object3 = mz0_2.a;
            }
            int n3 = 15;
            string2 = pw_1.d(string2, 0, 0, false, n3);
            object3 = (Iterable)object3;
            int n4 = yx_2.o((Iterable)object3, 10);
            ArrayList<String> arrayList = new ArrayList<String>(n4);
            object3 = object3.iterator();
            while ((n4 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                String string3 = (String)object3.next();
                boolean bl3 = true;
                int n7 = 11;
                string3 = pw_1.d(string3, 0, 0, bl3, n7);
                arrayList.add(string3);
            }
            ((xe3_2)object2).a(string2, arrayList);
        }
        object2 = ((xe3_2)object2).b;
        Intrinsics.checkNotNullParameter(object2, "values");
        object = new ye3_2((Map)object2);
        return object;
    }
}

