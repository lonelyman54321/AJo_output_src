/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonException;

/*
 * Renamed from xm1
 */
public final class xm1_2 {
    public static final pp0$a_1 a;

    static {
        pp0$a_1 pp0$a_1;
        a = pp0$a_1 = new Object();
    }

    public static final void a(LinkedHashMap object, SerialDescriptor object2, String string2, int n3) {
        Object object3;
        Object object4 = object2.getKind();
        boolean bl2 = Intrinsics.areEqual(object4, object3 = XZ2$b.a);
        object4 = bl2 ? "enum value" : "property";
        boolean bl3 = object.containsKey(string2);
        if (!bl3) {
            object2 = n3;
            object.put(string2, object2);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("The suggested name '");
        stringBuilder.append(string2);
        stringBuilder.append("' for ");
        stringBuilder.append((String)object4);
        char c2 = ' ';
        stringBuilder.append(c2);
        String string3 = object2.e(n3);
        stringBuilder.append(string3);
        stringBuilder.append(" is already one of the names for ");
        stringBuilder.append((String)object4);
        stringBuilder.append(c2);
        int n4 = ((Number)fh1_2.g(string2, (Map)object)).intValue();
        object = object2.e(n4);
        stringBuilder.append((String)object);
        stringBuilder.append(" in ");
        stringBuilder.append(object2);
        object = stringBuilder.toString();
        object3 = new JsonException((String)object);
        throw object3;
    }

    public static final int b(SerialDescriptor object, ml1_2 object2, String string2) {
        Object object3;
        Object object4 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        Intrinsics.checkNotNullParameter(object2, "json");
        Intrinsics.checkNotNullParameter(string2, "name");
        Map<pp0$a_1, Object> map2 = ((ml1_2)object2).a;
        int n3 = ((sl1_2)((Object)map2)).m;
        int n4 = 2;
        String string3 = "value";
        String string4 = "defaultValue";
        String string5 = "key";
        pp0$a_1 pp0$a_1 = a;
        String string6 = "descriptor";
        int n7 = -3;
        pp0_2 pp0_22 = ((ml1_2)object2).c;
        if (n3 != 0 && (n3 = (int)(Intrinsics.areEqual(map2 = object.getKind(), object3 = XZ2$b.a) ? 1 : 0)) != 0) {
            map2 = Locale.ROOT;
            string2 = string2.toLowerCase((Locale)((Object)map2));
            map2 = "toLowerCase(...)";
            Intrinsics.checkNotNullExpressionValue(string2, (String)((Object)map2));
            Intrinsics.checkNotNullParameter(object2, (String)object4);
            Intrinsics.checkNotNullParameter(object, string6);
            Intrinsics.checkNotNullParameter(object2, (String)object4);
            object4 = new wm1_2((ml1_2)object2, (SerialDescriptor)object);
            pp0_22.getClass();
            Intrinsics.checkNotNullParameter(object, string6);
            Intrinsics.checkNotNullParameter(pp0$a_1, string5);
            Intrinsics.checkNotNullParameter(object4, string4);
            object2 = pp0_22.a((SerialDescriptor)object, pp0$a_1);
            if (object2 == null) {
                object2 = ((wm1_2)object4).invoke();
                Intrinsics.checkNotNullParameter(object, string6);
                Intrinsics.checkNotNullParameter(pp0$a_1, string5);
                Intrinsics.checkNotNullParameter(object2, string3);
                object4 = pp0_22.a;
                map2 = ((ConcurrentHashMap)object4).get(object);
                if (map2 == null) {
                    map2 = new Map<pp0$a_1, Object>(n4);
                    ((ConcurrentHashMap)object4).put(object, map2);
                }
                map2 = map2;
                map2.put(pp0$a_1, object2);
            }
            object2 = (Map)object2;
            object = (Integer)object2.get(string2);
            if (object != null) {
                n7 = (Integer)object;
            }
            return n7;
        }
        xm1_2.e((ml1_2)object2, (SerialDescriptor)object);
        n3 = object.c(string2);
        if (n3 != n7) {
            return n3;
        }
        object3 = ((ml1_2)object2).a;
        boolean bl2 = ((sl1_2)object3).l;
        if (!bl2) {
            return n3;
        }
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        Intrinsics.checkNotNullParameter(object, string6);
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        object4 = new wm1_2((ml1_2)object2, (SerialDescriptor)object);
        pp0_22.getClass();
        Intrinsics.checkNotNullParameter(object, string6);
        Intrinsics.checkNotNullParameter(pp0$a_1, string5);
        Intrinsics.checkNotNullParameter(object4, string4);
        object2 = pp0_22.a((SerialDescriptor)object, pp0$a_1);
        if (object2 == null) {
            object2 = ((wm1_2)object4).invoke();
            Intrinsics.checkNotNullParameter(object, string6);
            Intrinsics.checkNotNullParameter(pp0$a_1, string5);
            Intrinsics.checkNotNullParameter(object2, string3);
            object4 = pp0_22.a;
            map2 = ((ConcurrentHashMap)object4).get(object);
            if (map2 == null) {
                map2 = new Map<pp0$a_1, Object>(n4);
                ((ConcurrentHashMap)object4).put(object, map2);
            }
            map2 = map2;
            map2.put(pp0$a_1, object2);
        }
        object2 = (Map)object2;
        object = (Integer)object2.get(string2);
        if (object != null) {
            n7 = (Integer)object;
        }
        return n7;
    }

    public static final int c(SerialDescriptor object, ml1_2 object2, String string2, String string3) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object2, "json");
        Intrinsics.checkNotNullParameter(string2, "name");
        CharSequence charSequence = "suffix";
        Intrinsics.checkNotNullParameter(string3, (String)charSequence);
        int n3 = xm1_2.b((SerialDescriptor)object, (ml1_2)object2, string2);
        int n4 = -3;
        if (n3 != n4) {
            return n3;
        }
        charSequence = new StringBuilder();
        object = object.h();
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append(" does not contain element with name '");
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append('\'');
        ((StringBuilder)charSequence).append(string3);
        object = ((StringBuilder)charSequence).toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public static final boolean d(ml1_2 object, SerialDescriptor object2) {
        boolean bl2;
        block5: {
            block2: {
                block4: {
                    boolean bl3;
                    block3: {
                        Intrinsics.checkNotNullParameter(object2, "<this>");
                        String string2 = "json";
                        Intrinsics.checkNotNullParameter(object, string2);
                        object = ((ml1_2)object).a;
                        bl2 = ((sl1_2)object).b;
                        if (bl2) break block2;
                        object = object2.getAnnotations();
                        bl3 = object instanceof Collection;
                        if (!bl3) break block3;
                        object2 = object;
                        object2 = (Collection)object;
                        bl3 = object2.isEmpty();
                        if (bl3) break block4;
                    }
                    object = ((Iterable)object).iterator();
                    while (bl3 = object.hasNext()) {
                        object2 = (Annotation)object.next();
                        bl3 = object2 instanceof nm1_1;
                        if (!bl3) continue;
                        break block2;
                    }
                }
                bl2 = false;
                object = null;
                break block5;
            }
            bl2 = true;
        }
        return bl2;
    }

    public static final void e(ml1_2 object, SerialDescriptor object2) {
        Intrinsics.checkNotNullParameter(object2, "<this>");
        Intrinsics.checkNotNullParameter(object, "json");
        object2 = object2.getKind();
        Ye3$a ye3$a = Ye3$a.a;
        boolean bl2 = Intrinsics.areEqual(object2, ye3$a);
        if (bl2) {
            object = ((ml1_2)object).a;
            object.getClass();
        }
    }
}

