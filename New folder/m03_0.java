/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from m03
 */
public final class m03_0 {
    /*
     * Unable to fully structure code
     */
    public static final KSerializer a(yn1_2 var0, ArrayList var1_1, Function0 var2_2) {
        block6: {
            block7: {
                block9: {
                    block11: {
                        block12: {
                            block10: {
                                block8: {
                                    Intrinsics.checkNotNullParameter(var0, "<this>");
                                    Intrinsics.checkNotNullParameter(var1_1, "serializers");
                                    Intrinsics.checkNotNullParameter(var2_2, "elementClassifierIfArray");
                                    var3_3 = Reflection.getOrCreateKotlinClass(Collection.class);
                                    var4_4 = Intrinsics.areEqual(var0, var3_3);
                                    if (var4_4 || (var6_6 = Intrinsics.areEqual(var0, var5_5 = Reflection.getOrCreateKotlinClass((Class)(var3_3 = List.class)))) != 0 || (var4_4 = Intrinsics.areEqual(var0, var3_3 = Reflection.getOrCreateKotlinClass((Class)var3_3))) || (var4_4 = Intrinsics.areEqual(var0, var3_3 = Reflection.getOrCreateKotlinClass(ArrayList.class)))) break block7;
                                    var3_3 = Reflection.getOrCreateKotlinClass(HashSet.class);
                                    var4_4 = Intrinsics.areEqual(var0, var3_3);
                                    if (!var4_4) break block8;
                                    var3_3 = (KSerializer)var1_1.get(0);
                                    var2_2 = new r31_0((KSerializer)var3_3);
                                    break block6;
                                }
                                var3_3 = Set.class;
                                var5_5 = Reflection.getOrCreateKotlinClass(var3_3);
                                var6_6 = Intrinsics.areEqual(var0, var5_5);
                                if (var6_6 != 0 || (var4_4 = Intrinsics.areEqual(var0, var3_3 = Reflection.getOrCreateKotlinClass((Class)var3_3))) || (var4_4 = Intrinsics.areEqual(var0, var3_3 = Reflection.getOrCreateKotlinClass(LinkedHashSet.class)))) break block9;
                                var3_3 = Reflection.getOrCreateKotlinClass(HashMap.class);
                                var4_4 = Intrinsics.areEqual(var0, var3_3);
                                var6_6 = 1;
                                if (!var4_4) break block10;
                                var3_3 = (KSerializer)var1_1.get(0);
                                var5_5 = (KSerializer)var1_1.get(var6_6);
                                var2_2 = new p31_0((KSerializer)var3_3, (KSerializer)var5_5);
                                break block6;
                            }
                            var3_3 = Map.class;
                            var7_7 = Reflection.getOrCreateKotlinClass(var3_3);
                            var8_8 = Intrinsics.areEqual(var0, var7_7);
                            if (var8_8 || (var4_4 = Intrinsics.areEqual(var0, var3_3 = Reflection.getOrCreateKotlinClass((Class)var3_3))) || (var4_4 = Intrinsics.areEqual(var0, var3_3 = Reflection.getOrCreateKotlinClass(LinkedHashMap.class)))) break block11;
                            var3_3 = Reflection.getOrCreateKotlinClass(Map.Entry.class);
                            var4_4 = Intrinsics.areEqual(var0, var3_3);
                            var7_7 = "valueSerializer";
                            var9_9 = "keySerializer";
                            if (var4_4) {
                                var2_2 = (KSerializer)var1_1.get(0);
                                var3_3 = (KSerializer)var1_1.get(var6_6);
                                Intrinsics.checkNotNullParameter(var2_2, var9_9);
                                Intrinsics.checkNotNullParameter(var3_3, (String)var7_7);
                                var5_5 = new ug1_2((KSerializer)var2_2, (KSerializer)var3_3);
lbl41:
                                // 3 sources

                                while (true) {
                                    var2_2 = var5_5;
                                    break block6;
                                    break;
                                }
                            }
                            var3_3 = Reflection.getOrCreateKotlinClass(Pair.class);
                            var4_4 = Intrinsics.areEqual(var0, var3_3);
                            if (!var4_4) break block12;
                            var2_2 = (KSerializer)var1_1.get(0);
                            var3_3 = (KSerializer)var1_1.get(var6_6);
                            Intrinsics.checkNotNullParameter(var2_2, var9_9);
                            Intrinsics.checkNotNullParameter(var3_3, (String)var7_7);
                            var5_5 = new nm2_2((KSerializer)var2_2, (KSerializer)var3_3);
                            ** GOTO lbl41
                        }
                        var3_3 = Reflection.getOrCreateKotlinClass(xs3_0.class);
                        var4_4 = Intrinsics.areEqual(var0, var3_3);
                        if (var4_4) {
                            var2_2 = (KSerializer)var1_1.get(0);
                            var3_3 = (KSerializer)var1_1.get(var6_6);
                            var6_6 = 2;
                            var5_5 = (KSerializer)var1_1.get(var6_6);
                            Intrinsics.checkNotNullParameter(var2_2, "aSerializer");
                            Intrinsics.checkNotNullParameter(var3_3, "bSerializer");
                            Intrinsics.checkNotNullParameter(var5_5, "cSerializer");
                            var2_2 = var7_7 = new ys3_0((KSerializer)var2_2, (KSerializer)var3_3, (KSerializer)var5_5);
                        } else {
                            Intrinsics.checkNotNullParameter(var0, "rootClass");
                            var3_3 = rn1_2.a(var0);
                            var4_4 = var3_3.isArray();
                            if (var4_4) {
                                var2_2 = var2_2.invoke();
                                Intrinsics.checkNotNull(var2_2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                                var2_2 = (yn1_2)var2_2;
                                var3_3 = (KSerializer)var1_1.get(0);
                                Intrinsics.checkNotNullParameter(var2_2, "kClass");
                                Intrinsics.checkNotNullParameter(var3_3, "elementSerializer");
                                var5_5 = new rg2_2((yn1_2)var2_2, (KSerializer)var3_3);
                                ** continue;
                            }
                            var10_10 = 0;
                            var2_2 = null;
                        }
                        break block6;
                    }
                    var3_3 = (KSerializer)var1_1.get(0);
                    var5_5 = (KSerializer)var1_1.get(var6_6);
                    var2_2 = new nu1_2((KSerializer)var3_3, (KSerializer)var5_5);
                    break block6;
                }
                var3_3 = (KSerializer)var1_1.get(0);
                var2_2 = new pu1_2((KSerializer)var3_3);
                break block6;
            }
            var3_3 = (KSerializer)var1_1.get(0);
            var2_2 = new ip_2((KSerializer)var3_3);
        }
        if (var2_2 == null) {
            var2_2 = new KSerializer[]{};
            var1_1 = var1_1.toArray((T[])var2_2);
            var10_10 = var1_1.length;
            var1_1 = Arrays.copyOf(var1_1, var10_10);
            var2_2 = gt2_2.a(var0, var1_1);
        }
        return var2_2;
    }

    public static final KSerializer b(yn1_2 yn1_22) {
        Intrinsics.checkNotNullParameter(yn1_22, "<this>");
        KSerializer kSerializer = m03_0.d(yn1_22);
        if (kSerializer != null) {
            return kSerializer;
        }
        kt2_2.d(yn1_22);
        throw null;
    }

    public static final KSerializer c(i0_0 i0_02, kn1_1 kn1_12) {
        Intrinsics.checkNotNullParameter(i0_02, "<this>");
        Intrinsics.checkNotNullParameter(kn1_12, "type");
        return o03_0.a(i0_02, kn1_12, false);
    }

    public static final KSerializer d(yn1_2 object) {
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = new KSerializer[]{};
        object3 = gt2_2.a((yn1_2)object, object3);
        if (object3 == null) {
            object3 = zz2_2.a;
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = zz2_2.a;
            object = ((ng1_2)object2).get(object);
            object3 = object;
            object3 = (KSerializer)object;
        }
        return object3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final ArrayList e(i0_0 object, List iterator, boolean bl2) {
        ArrayList<Object> arrayList;
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(iterator, "typeArguments");
        ArrayList<Object> arrayList2 = null;
        int n3 = 10;
        if (bl2) {
            kn1_1 kn1_12;
            block4: {
                iterator = (Iterable)((Object)iterator);
                n3 = yx_2.o((Iterable)((Object)iterator), n3);
                arrayList = new ArrayList<Object>(n3);
                iterator = iterator.iterator();
                while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    kn1_12 = (kn1_1)iterator.next();
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    Intrinsics.checkNotNullParameter(kn1_12, "type");
                    boolean bl3 = true;
                    KSerializer kSerializer = o03_0.a((i0_0)object, kn1_12, bl3);
                    if (kSerializer != null) {
                        arrayList.add(kSerializer);
                        continue;
                    }
                    break block4;
                }
                return arrayList;
            }
            object = kt2_2.c(kn1_12);
            Intrinsics.checkNotNullParameter(object, (String)object2);
            kt2_2.d((yn1_2)object);
            throw null;
        }
        iterator = (Iterable)((Object)iterator);
        int n4 = yx_2.o((Iterable)((Object)iterator), n3);
        arrayList = new ArrayList<Object>(n4);
        iterator = iterator.iterator();
        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object2 = (kn1_1)iterator.next();
            if ((object2 = m03_0.c((i0_0)object, (kn1_1)object2)) == null) return arrayList2;
            arrayList.add(object2);
        }
        return arrayList;
    }
}

