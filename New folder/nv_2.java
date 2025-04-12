/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KTypeProjection$a;

/*
 * Renamed from NV
 */
public final class nv_2
implements za1_2 {
    public final Function0 a;
    public final Function1 b;
    public final xq_2 c;

    public nv_2(String string2, Function0 object, Function1 object2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(object, "createConfiguration");
        Object object3 = "body";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        this.a = object;
        this.b = object2;
        object = pv_1.class;
        object2 = Reflection.getOrCreateKotlinClass((Class)object);
        object3 = KTypeProjection.c;
        Object object4 = nv_2.class;
        object4 = Reflection.getOrCreateKotlinClass(object4);
        Object object5 = "PluginConfigT";
        nn1_1 nn1_12 = nn1_1.INVARIANT;
        object4 = Reflection.typeParameter(object4, (String)object5, nn1_12, false);
        object5 = Object.class;
        object5 = Reflection.typeOf((Class)object5);
        Reflection.setUpperBounds((ln1_2)object4, (kn1_1)object5);
        object4 = Reflection.typeOf((zn1_2)object4);
        object3.getClass();
        object3 = KTypeProjection$a.a((kn1_1)object4);
        try {
            object = Reflection.typeOf((Class)object, (KTypeProjection)object3);
        }
        catch (Throwable throwable) {
            object = null;
        }
        object3 = new at3_0((yn1_2)object2, (kn1_1)object);
        this.c = object = new xq_2(string2, (at3_0)object3);
    }

    public final void a(Object iterator, da1_2 da1_22) {
        boolean bl2;
        iterator = (pv_1)((Object)iterator);
        Intrinsics.checkNotNullParameter(iterator, "plugin");
        Object object = "scope";
        Intrinsics.checkNotNullParameter(da1_22, (String)object);
        iterator.getClass();
        Intrinsics.checkNotNullParameter(da1_22, (String)object);
        Object object2 = ((pv_1)((Object)iterator)).a;
        Object object3 = ((pv_1)((Object)iterator)).b;
        object = new mv_2((xq_2)object2, da1_22, object3);
        ((pv_1)((Object)iterator)).c.invoke(object);
        ((pv_1)((Object)iterator)).d = object2 = ((mv_2)object).d;
        iterator = ((mv_2)object).c.iterator();
        while (bl2 = iterator.hasNext()) {
            object = (k91)iterator.next();
            object.getClass();
            Intrinsics.checkNotNullParameter(da1_22, "client");
            object2 = (qg3_2)((k91)object).b;
            object = ((k91)object).a;
            object.a(da1_22, (qg3_2)object2);
        }
    }

    public final Object b(Function1 object) {
        Intrinsics.checkNotNullParameter(object, "block");
        Object object2 = this.a.invoke();
        object.invoke(object2);
        Function1 function1 = this.b;
        xq_2 xq_22 = this.c;
        object = new pv_1(xq_22, object2, function1);
        return object;
    }

    public final xq_2 getKey() {
        return this.c;
    }
}

