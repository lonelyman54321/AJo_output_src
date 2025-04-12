/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from ul
 */
public final class ul_1 {
    public final Function0 a;
    public final Function0 b;
    public final ul$l c;
    public final ul$d d;
    public final ul$e e;
    public final LinkedHashSet f;
    public final LinkedHashSet g;
    public final LinkedHashSet h;

    public ul_1(P20 object, Q20 object2) {
        Iterable iterable;
        int n3 = 1;
        int n4 = 2;
        this.a = object;
        this.b = object2;
        super(this);
        this.c = object = new ul$j((Function1)object2);
        Set set = new wl_1(this);
        this.d = object2 = new ul$j((Function1)((Object)set));
        Object object3 = new xl_1(this);
        this.e = set = new ul$j((Function1)object3);
        object3 = new ul$j[n4];
        object3[0] = object;
        object3[n3] = set;
        object = p03_0.f(object3);
        boolean bl2 = pk_0.e;
        if (bl2) {
            super(this);
            set = new ul$j((Function1)object3);
            set = O03.b(set);
        } else {
            set = mz0_2.a;
        }
        set = set;
        object = q03_0.h((Set)object, set);
        bl2 = Xg1.c;
        if (bl2) {
            super(this);
            set = new ul$j((Function1)object3);
            set = O03.b(set);
        } else {
            set = vz0_2.a;
        }
        set = set;
        object = q03_0.h((Set)object, set);
        bl2 = qk_0.c;
        set = bl2 ? O03.b(object2) : vz0_2.a;
        set = set;
        this.f = object = q03_0.h((Set)object, set);
        bl2 = pw3.a;
        if (bl2) {
            super(this);
            set = new ul$j((Function1)object3);
            Object object4 = new dl_0(this);
            Object[] objectArray = Reflection.getOrCreateKotlinClass(ni3_0.class);
            super((yn1_2)objectArray, (Function1)object4);
            objectArray = new el_0(this);
            yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass(ui0_0.class);
            object4 = new ul$i(yn1_22, (Function1)objectArray);
            int n7 = 3;
            objectArray = new ul$j[n7];
            objectArray[0] = set;
            objectArray[n3] = object3;
            objectArray[n4] = object4;
            iterable = p03_0.f(objectArray);
        } else {
            iterable = mz0_2.a;
        }
        iterable = iterable;
        this.g = object = q03_0.h((Set)object, iterable);
        object2 = O03.b(object2);
        this.h = object = q03_0.h((Set)object, (Iterable)object2);
    }
}

