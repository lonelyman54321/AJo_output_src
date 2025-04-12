/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from h03
 */
public final class h03_0 {
    public static final KSerializer a(Collection object, i0_0 object2) {
        block11: {
            boolean bl2;
            Object object3;
            block10: {
                int n3;
                KSerializer kSerializer;
                object = (Iterable)object;
                object3 = CollectionsKt.J((Iterable)object);
                int n4 = 10;
                int n7 = yx_2.o((Iterable)object3, n4);
                Object object4 = new ArrayList(n7);
                object3 = ((ArrayList)object3).iterator();
                while ((n7 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                    kSerializer = h03_0.b(object3.next(), (i0_0)object2);
                    ((ArrayList)object4).add(kSerializer);
                }
                object2 = new Object();
                object3 = new ArrayList();
                object4 = ((ArrayList)object4).iterator();
                while ((n7 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                    kSerializer = object4.next();
                    Object object5 = kSerializer;
                    object5 = kSerializer.getDescriptor().h();
                    boolean bl3 = ((HashSet)object2).add(object5);
                    if (!bl3) continue;
                    ((ArrayList)object3).add(kSerializer);
                }
                int n8 = ((ArrayList)object3).size();
                if (n8 > (n3 = 1)) {
                    object = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
                    n3 = yx_2.o(object3, n4);
                    object2 = new Object(n3);
                    object3 = ((ArrayList)object3).iterator();
                    while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                        object4 = ((KSerializer)object3.next()).getDescriptor().h();
                        ((ArrayList)object2).add(object4);
                    }
                    ((StringBuilder)object).append(object2);
                    object = ((StringBuilder)object).toString();
                    object = object.toString();
                    object2 = new Object((String)object);
                    throw object2;
                }
                object2 = (KSerializer)CollectionsKt.b0(object3);
                if (object2 == null) {
                    xe_1.D(StringCompanionObject.INSTANCE);
                    object2 = pe3_2.a;
                }
                if (bl2 = (object3 = object2.getDescriptor()).b()) {
                    return object2;
                }
                object3 = "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>";
                Intrinsics.checkNotNull(object2, object3);
                bl2 = object instanceof Collection;
                if (!bl2) break block10;
                object3 = object;
                object3 = (Collection)object;
                bl2 = object3.isEmpty();
                if (bl2) break block11;
            }
            object = ((Iterable)object).iterator();
            while (bl2 = object.hasNext()) {
                object3 = object.next();
                if (object3 != null) continue;
                return xe_1.p(object2);
            }
        }
        return object2;
    }

    /*
     * Unable to fully structure code
     */
    public static final KSerializer b(Object var0, i0_0 var1_1) {
        var2_2 = "module";
        Intrinsics.checkNotNullParameter(var1_1, (String)var2_2);
        if (var0 == null) {
            xe_1.D(StringCompanionObject.INSTANCE);
            var0 = xe_1.p(pe3_2.a);
        } else {
            var3_3 = var0 instanceof List;
            if (var3_3) {
                var0 = xe_1.g(h03_0.a((Collection)var0, (i0_0)var1_1));
            } else {
                var3_3 = var0 instanceof Object[];
                if (var3_3) {
                    if ((var0 = tp_2.A((Object[])var0)) != null) {
                        var0 = h03_0.b(var0, (i0_0)var1_1);
                    } else {
                        xe_1.D(StringCompanionObject.INSTANCE);
                        var0 = xe_1.g(pe3_2.a);
                    }
                } else {
                    var3_3 = var0 instanceof Set;
                    if (var3_3) {
                        var0 = h03_0.a((Collection)var0, (i0_0)var1_1);
                        Intrinsics.checkNotNullParameter(var0, "elementSerializer");
                        var1_1 = new pu1_2((KSerializer)var0);
                        while (true) {
                            var0 = var1_1;
                            break;
                        }
                    } else {
                        var3_3 = var0 instanceof Map;
                        if (var3_3) {
                            var0 = (Map)var0;
                            var2_2 = h03_0.a(var0.keySet(), (i0_0)var1_1);
                            var0 = h03_0.a(var0.values(), (i0_0)var1_1);
                            var0 = xe_1.i((KSerializer)var2_2, (KSerializer)var0);
                        } else {
                            if ((var1_1 = var1_1.K((yn1_2)(var2_2 = Reflection.getOrCreateKotlinClass(var0.getClass())), var4_4 = mz0_2.a)) != null) ** continue;
                            var0 = m03_0.b(Reflection.getOrCreateKotlinClass(var0.getClass()));
                        }
                    }
                }
            }
        }
        Intrinsics.checkNotNull(var0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return var0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final KSerializer c(i0_0 object, at3_0 object2) {
        boolean bl2;
        Object object3;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object2, "typeInfo");
        Object object4 = ((at3_0)object2).b;
        if (object4 != null) {
            object3 = object4.getArguments();
            boolean bl3 = object3.isEmpty();
            if (bl3) {
                bl2 = false;
                object4 = null;
            } else {
                object4 = m03_0.c((i0_0)object, (kn1_1)object4);
            }
            if (object4 != null) return object4;
        }
        object4 = mz0_2.a;
        object3 = ((at3_0)object2).a;
        object = ((i0_0)object).K((yn1_2)object3, (List)object4);
        bl2 = true;
        object2 = ((at3_0)object2).b;
        if (object != null) {
            if (object2 == null) return object;
            boolean bl4 = object2.isMarkedNullable();
            if (bl4 != bl2) return object;
            object = xe_1.p((KSerializer)object);
            return object;
        }
        object = m03_0.b((yn1_2)object3);
        if (object2 == null) return object;
        boolean bl5 = object2.isMarkedNullable();
        if (bl5 != bl2) return object;
        return xe_1.p((KSerializer)object);
    }

    public static final String d(Object object) {
        int n3 = 1;
        Object object2 = object.getClass();
        boolean bl2 = object2.isAnonymousClass();
        object2 = bl2 ? object.getClass().getName() : object.getClass().getSimpleName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object2);
        stringBuilder.append('@');
        object2 = StringCompanionObject.INSTANCE;
        object = System.identityHashCode(object);
        object2 = new Object[n3];
        object2[0] = object;
        object = Arrays.copyOf(object2, n3);
        object = String.format("%07x", object);
        Intrinsics.checkNotNullExpressionValue(object, "format(format, *args)");
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }
}

