/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from la1
 */
public final class la1_2 {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public Function1 d;
    public boolean e;
    public boolean f;
    public boolean g;

    public la1_2() {
        boolean bl2;
        Object object = new LinkedHashMap();
        this.a = object;
        object = new LinkedHashMap();
        this.b = object;
        object = new LinkedHashMap();
        this.c = object;
        this.d = object = new ha1_2(0);
        this.e = bl2 = true;
        this.f = bl2;
        bl2 = jt2_2.a;
    }

    public final void a(za1_2 za1_22, Function1 object) {
        Intrinsics.checkNotNullParameter(za1_22, "plugin");
        Intrinsics.checkNotNullParameter(object, "configure");
        Object object2 = this.b;
        Object object3 = za1_22.getKey();
        object3 = (Function1)((LinkedHashMap)object2).get(object3);
        xq_2 xq_22 = za1_22.getKey();
        ga1_2 ga1_22 = new ga1_2((Function1)object3, (Function1)object);
        object2.put(xq_22, ga1_22);
        object = this.a;
        object2 = za1_22.getKey();
        boolean bl2 = object.containsKey(object2);
        if (bl2) {
            return;
        }
        object2 = za1_22.getKey();
        object3 = new ng0_2(za1_22, 1);
        object.put(object2, object3);
    }

    public final void b(la1_2 object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "other");
        this.e = bl2 = ((la1_2)object).e;
        this.f = bl2 = ((la1_2)object).f;
        this.g = bl2 = ((la1_2)object).g;
        LinkedHashMap linkedHashMap = this.a;
        LinkedHashMap linkedHashMap2 = ((la1_2)object).a;
        linkedHashMap.putAll(linkedHashMap2);
        linkedHashMap = this.b;
        linkedHashMap2 = ((la1_2)object).b;
        linkedHashMap.putAll(linkedHashMap2);
        linkedHashMap = this.c;
        object = ((la1_2)object).c;
        linkedHashMap.putAll(object);
    }
}

