/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.FacetValue;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public abstract class q22
extends RecyclerView$f {
    public static final q22$a_0 Companion;
    public boolean a;
    public final ArrayList b;
    public final HashMap c;
    public final hh3_2 d;
    public Yj2 e;

    static {
        q22$a_0 q22$a_0;
        Companion = q22$a_0 = new Object();
    }

    public q22() {
        Object object = new ArrayList();
        this.b = object;
        this.c = object;
        object = new Object();
        this.d = object = yr1_2.b((Function0)object);
        object = Yj2.GRID;
        this.e = object;
    }

    public abstract int g(int var1);

    public abstract int h(int var1);

    public final void i(ArrayList object) {
        boolean bl2;
        HashMap hashMap = this.c;
        hashMap.clear();
        ArrayList arrayList = this.b;
        arrayList.clear();
        Object object2 = h40_0.a;
        object2 = z40_0.Companion;
        object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
        Object object3 = "android_slp_visual_gender_filter_min_item_count";
        int n3 = ((ao0_0)object2).g((String)object3);
        if (object != null) {
            boolean bl3;
            object = object.iterator();
            while (bl3 = object.hasNext()) {
                boolean bl4;
                int n4;
                object3 = (Facet)object.next();
                ArrayList<Object> arrayList2 = ((Facet)object3).getValues();
                if (arrayList2 == null) continue;
                arrayList2 = ((Facet)object3).getValues();
                Intrinsics.checkNotNull(arrayList2);
                int n7 = arrayList2.size();
                if (n7 < (n4 = 2)) continue;
                arrayList2 = new ArrayList<Object>();
                Object object4 = ((Facet)object3).getValues();
                Intrinsics.checkNotNull(object4);
                object4 = ((ArrayList)object4).iterator();
                Object object5 = "iterator(...)";
                Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
                while (bl4 = object4.hasNext()) {
                    object5 = object4.next();
                    String string2 = "next(...)";
                    Intrinsics.checkNotNullExpressionValue(object5, string2);
                    int n8 = ((FacetValue)(object5 = (FacetValue)object5)).getCount();
                    if (n8 <= n3) continue;
                    arrayList2.add(object5);
                }
                int n10 = arrayList2.size();
                if (n10 < n4) continue;
                String string3 = ((Facet)object3).getCode();
                if (string3 != null) {
                    string3 = ((Facet)object3).getCode();
                    Intrinsics.checkNotNull(string3);
                    hashMap.put(string3, arrayList2);
                }
                arrayList.add(object3);
            }
        }
        this.a = bl2 = hashMap.isEmpty() ^ true;
    }
}

