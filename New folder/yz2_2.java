/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from YZ2
 */
public final class yz2_2
extends i0_0 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final boolean f;

    public yz2_2(nz0_2 nz0_22, nz0_2 nz0_23, nz0_2 nz0_24, nz0_2 nz0_25, nz0_2 nz0_26) {
        Intrinsics.checkNotNullParameter(nz0_22, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(nz0_23, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(nz0_24, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(nz0_25, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(nz0_26, "polyBase2DefaultDeserializerProvider");
        this.a = nz0_22;
        this.b = nz0_23;
        this.c = nz0_24;
        this.d = nz0_25;
        this.e = nz0_26;
        this.f = false;
    }

    public final void H(hm1_1 object) {
        int n3;
        Object object2;
        Object object3;
        boolean bl2;
        yn1_2 yn1_22;
        Object object4;
        String string2;
        boolean bl3;
        Iterator iterator;
        block6: {
            Intrinsics.checkNotNullParameter(object, "collector");
            iterator = this.a.entrySet().iterator();
            while (true) {
                bl3 = iterator.hasNext();
                string2 = "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>";
                if (!bl3) break block6;
                object4 = iterator.next();
                yn1_22 = (yn1_2)object4.getKey();
                object4 = (e80_0)object4.getValue();
                bl2 = object4 instanceof e80$a;
                object3 = null;
                if (bl2) {
                    Intrinsics.checkNotNull(yn1_22, string2);
                    ((e80$a)object4).getClass();
                    object4 = "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>";
                    Intrinsics.checkNotNull(null, (String)object4);
                    ((hm1_1)object).a(yn1_22);
                    continue;
                }
                boolean bl4 = object4 instanceof e80$b;
                if (!bl4) break;
                object4 = (e80$b)object4;
                object4.getClass();
                ((hm1_1)object).b(yn1_22, null);
            }
            object = new NoWhenBranchMatchedException();
            throw object;
        }
        iterator = this.b.entrySet().iterator();
        while (bl3 = iterator.hasNext()) {
            object4 = iterator.next();
            yn1_22 = (yn1_2)object4.getKey();
            object4 = ((Map)object4.getValue()).entrySet().iterator();
            while (bl2 = object4.hasNext()) {
                object2 = (Map.Entry)object4.next();
                object3 = (yn1_2)object2.getKey();
                object2 = (KSerializer)object2.getValue();
                Intrinsics.checkNotNull(yn1_22, string2);
                Intrinsics.checkNotNull(object3, string2);
                String string3 = "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>";
                Intrinsics.checkNotNull(object2, string3);
                ((hm1_1)object).c(yn1_22, (yn1_2)object3, (KSerializer)object2);
            }
        }
        iterator = this.c.entrySet().iterator();
        while (true) {
            bl3 = iterator.hasNext();
            n3 = 1;
            if (!bl3) break;
            object4 = iterator.next();
            object2 = (yn1_2)object4.getKey();
            object4 = (Function1)object4.getValue();
            Intrinsics.checkNotNull(object2, string2);
            object3 = "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>";
            Intrinsics.checkNotNull(object4, (String)object3);
            object4 = (Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object4, n3);
            ((hm1_1)object).e((yn1_2)object2, (Function1)object4);
        }
        iterator = this.e.entrySet().iterator();
        while (bl3 = iterator.hasNext()) {
            object4 = iterator.next();
            object2 = (yn1_2)object4.getKey();
            object4 = (Function1)object4.getValue();
            Intrinsics.checkNotNull(object2, string2);
            object3 = "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>";
            Intrinsics.checkNotNull(object4, (String)object3);
            object4 = (Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object4, n3);
            ((hm1_1)object).d((yn1_2)object2, (Function1)object4);
        }
    }

    public final KSerializer K(yn1_2 object, List list) {
        Intrinsics.checkNotNullParameter(object, "kClass");
        Intrinsics.checkNotNullParameter(list, "typeArgumentsSerializers");
        object = (e80_0)this.a.get(object);
        Object object2 = null;
        object = object != null ? ((e80_0)object).a(list) : null;
        boolean bl2 = object instanceof KSerializer;
        if (bl2) {
            object2 = object;
        }
        return (KSerializer)object2;
    }

    public final boolean L() {
        return this.f;
    }

    public final qp0_2 N(yn1_2 object, String string2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "baseClass");
        Object object2 = (Map)this.d.get(object);
        Object object3 = null;
        if (object2 != null) {
            object2 = (KSerializer)object2.get(string2);
        } else {
            bl2 = false;
            object2 = null;
        }
        boolean bl3 = object2 instanceof KSerializer;
        if (!bl3) {
            bl2 = false;
            object2 = null;
        }
        if (object2 != null) {
            return (qp0_2)object2;
        }
        object2 = this.e;
        bl2 = TypeIntrinsics.isFunctionOfArity(object = object2.get(object), 1);
        if ((object = bl2 ? (Function1)object : null) != null) {
            object3 = object = ((Function1)object).invoke(string2);
            object3 = (qp0_2)object;
        }
        return (qp0_2)object3;
    }

    public final b03_0 O(yn1_2 object, Object object2) {
        Intrinsics.checkNotNullParameter(object, "baseClass");
        Object object3 = "value";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        boolean bl2 = object.isInstance(object2);
        Object object4 = null;
        if (!bl2) {
            return null;
        }
        object3 = (Map)this.b.get(object);
        if (object3 != null) {
            yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass(object2.getClass());
            object3 = (KSerializer)object3.get(yn1_22);
        } else {
            bl2 = false;
            object3 = null;
        }
        boolean bl3 = object3 instanceof b03_0;
        if (!bl3) {
            bl2 = false;
            object3 = null;
        }
        if (object3 != null) {
            return (b03_0)object3;
        }
        object3 = this.c;
        bl2 = TypeIntrinsics.isFunctionOfArity(object = object3.get(object), 1);
        if ((object = bl2 ? (Function1)object : null) != null) {
            object4 = object = ((Function1)object).invoke(object2);
            object4 = (b03_0)object;
        }
        return (b03_0)object4;
    }
}

