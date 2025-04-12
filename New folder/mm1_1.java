/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/*
 * Renamed from Mm1
 */
public class mm1_1
extends s0_0 {
    public final JsonObject f;
    public final SerialDescriptor g;
    public int h;
    public boolean i;

    public /* synthetic */ mm1_1(ml1_2 ml1_22, JsonObject jsonObject, String string2, int n3) {
        if ((n3 &= 4) != 0) {
            string2 = null;
        }
        this(ml1_22, jsonObject, string2, null);
    }

    public mm1_1(ml1_2 ml1_22, JsonObject jsonObject, String string2, SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(ml1_22, "json");
        Intrinsics.checkNotNullParameter(jsonObject, "value");
        super(ml1_22, jsonObject, string2);
        this.f = jsonObject;
        this.g = serialDescriptor;
    }

    public final boolean A() {
        boolean bl2 = this.i;
        bl2 = !bl2 && (bl2 = super.A());
        return bl2;
    }

    public String Q(SerialDescriptor object, int n3) {
        String string2;
        Object object2;
        block6: {
            boolean bl2;
            object2 = "descriptor";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Serializable serializable = this.c;
            xm1_2.e((ml1_2)((Object)serializable), (SerialDescriptor)object);
            string2 = object.e(n3);
            Set set = this.e;
            int n4 = ((sl1_2)((Object)set)).l;
            if (n4 == 0) {
                return string2;
            }
            set = this.a0().a.keySet();
            n4 = set.contains(string2);
            if (n4 != 0) {
                return string2;
            }
            set = "<this>";
            Intrinsics.checkNotNullParameter(serializable, (String)((Object)set));
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Intrinsics.checkNotNullParameter(serializable, (String)((Object)set));
            set = ((ml1_2)((Object)serializable)).c;
            pp0$a_1 pp0$a_1 = xm1_2.a;
            wm1_2 wm1_22 = new wm1_2((ml1_2)((Object)serializable), (SerialDescriptor)object);
            set.getClass();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            serializable = "key";
            Intrinsics.checkNotNullParameter(pp0$a_1, (String)((Object)serializable));
            Intrinsics.checkNotNullParameter(wm1_22, "defaultValue");
            Object object3 = ((pp0_2)((Object)set)).a((SerialDescriptor)object, pp0$a_1);
            if (object3 == null) {
                object3 = wm1_22.invoke();
                Intrinsics.checkNotNullParameter(object, (String)object2);
                Intrinsics.checkNotNullParameter(pp0$a_1, (String)((Object)serializable));
                Intrinsics.checkNotNullParameter(object3, "value");
                object2 = ((pp0_2)((Object)set)).a;
                serializable = ((ConcurrentHashMap)object2).get(object);
                if (serializable == null) {
                    n4 = 2;
                    serializable = new ConcurrentHashMap(n4);
                    ((ConcurrentHashMap)object2).put(object, serializable);
                }
                serializable = (Map)((Object)serializable);
                serializable.put(pp0$a_1, object3);
            }
            object3 = (Map)object3;
            object = ((Iterable)this.a0().a.keySet()).iterator();
            while (bl2 = object.hasNext()) {
                int n7;
                object2 = object.next();
                serializable = object2;
                serializable = (String)object2;
                if ((serializable = (Integer)object3.get(serializable)) == null || (n7 = ((Integer)serializable).intValue()) != n3) continue;
                break block6;
            }
            bl2 = false;
            object2 = null;
        }
        object2 = (String)object2;
        if (object2 != null) {
            return object2;
        }
        return string2;
    }

    public JsonElement V(String string2) {
        Intrinsics.checkNotNullParameter(string2, "tag");
        JsonObject jsonObject = this.a0();
        return (JsonElement)fh1_2.g(string2, jsonObject);
    }

    public JsonObject a0() {
        return this.f;
    }

    public final s30_0 c(SerialDescriptor object) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        Object object2 = this.g;
        if (object == object2) {
            JsonElement jsonElement = this.W();
            Object object3 = object2.h();
            boolean bl2 = jsonElement instanceof JsonObject;
            if (bl2) {
                jsonElement = (JsonObject)jsonElement;
                object3 = this.c;
                String string2 = this.d;
                object = new mm1_1((ml1_2)object3, (JsonObject)jsonElement, string2, (SerialDescriptor)object2);
                return object;
            }
            object = new StringBuilder("Expected ");
            object2 = Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(", but had ");
            object2 = Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(" as the serialized body of ");
            ((StringBuilder)object).append((String)object3);
            ((StringBuilder)object).append(" at element: ");
            object2 = this.U();
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            throw HT2.d(jsonElement.toString(), -1, (String)object);
        }
        return super.c((SerialDescriptor)object);
    }

    public void d(SerialDescriptor object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "descriptor");
        Object object3 = this.c;
        int n3 = xm1_2.d((ml1_2)object3, (SerialDescriptor)object);
        if (n3 == 0 && (n3 = (object2 = object.getKind()) instanceof nw2_2) == 0) {
            xm1_2.e((ml1_2)object3, (SerialDescriptor)object);
            object2 = this.e;
            n3 = ((sl1_2)object2).l;
            Object object4 = "<this>";
            if (n3 == 0) {
                Intrinsics.checkNotNullParameter(object, (String)object4);
                object = kt2_2.a((SerialDescriptor)object);
            } else {
                Intrinsics.checkNotNullParameter(object, (String)object4);
                object2 = kt2_2.a((SerialDescriptor)object);
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                object4 = xm1_2.a;
                object3 = ((ml1_2)object3).c;
                object = (Map)((pp0_2)object3).a((SerialDescriptor)object, (pp0$a_1)object4);
                object = object != null ? object.keySet() : null;
                if (object == null) {
                    object = vz0_2.a;
                }
                object = (Iterable)object;
                object = q03_0.h((Set)object2, (Iterable)object);
            }
            object3 = this.a0().a.keySet().iterator();
            while ((n3 = object3.hasNext()) != 0) {
                object2 = (String)object3.next();
                boolean bl2 = object.contains(object2);
                if (bl2 || (bl2 = Intrinsics.areEqual(object2, object4 = this.d))) continue;
                object = Gn.a("Encountered an unknown key '", (String)object2, "' at element: ");
                object3 = this.U();
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                object3 = this.a0().toString();
                n3 = -1;
                object3 = HT2.f(n3, (CharSequence)object3);
                ((StringBuilder)object).append(object3);
                object = ((StringBuilder)object).toString();
                throw HT2.c(n3, (String)object);
            }
        }
    }

    public int m(SerialDescriptor serialDescriptor) {
        int n3;
        int n4;
        int n7 = 1;
        Object object = "descriptor";
        Intrinsics.checkNotNullParameter(serialDescriptor, (String)object);
        while ((n4 = this.h) < (n3 = serialDescriptor.d())) {
            n4 = this.h;
            this.h = n3 = n4 + 1;
            object = this.R(serialDescriptor, n4);
            n3 = this.h - n7;
            boolean bl2 = false;
            this.i = false;
            Object object2 = this.a0();
            boolean bl3 = ((JsonObject)object2).containsKey(object);
            Object object3 = this.c;
            if (!bl3) {
                object2 = ((ml1_2)object3).a;
                bl3 = ((sl1_2)object2).f;
                if (!bl3 && !(bl3 = serialDescriptor.i(n3)) && (bl3 = (object2 = serialDescriptor.g(n3)).b())) {
                    bl3 = true;
                } else {
                    bl3 = false;
                    object2 = null;
                }
                this.i = bl3;
                if (!bl3) continue;
            }
            object2 = this.e;
            bl3 = ((sl1_2)object2).h;
            if (bl3) {
                Object object4;
                Object object5;
                boolean bl4;
                bl3 = serialDescriptor.i(n3);
                SerialDescriptor serialDescriptor2 = serialDescriptor.g(n3);
                if (bl3 && !(bl4 = serialDescriptor2.b()) && (bl4 = (object5 = this.V((String)object)) instanceof JsonNull)) continue;
                object5 = serialDescriptor2.getKind();
                bl4 = Intrinsics.areEqual(object5, object4 = XZ2$b.a);
                if (!(!bl4 || (bl4 = serialDescriptor2.b()) && (bl4 = (object5 = this.V((String)object)) instanceof JsonNull))) {
                    object = this.V((String)object);
                    bl4 = object instanceof JsonPrimitive;
                    object4 = null;
                    if (bl4) {
                        object = (JsonPrimitive)object;
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    if (object != null) {
                        object5 = bm1_1.a;
                        object5 = "<this>";
                        Intrinsics.checkNotNullParameter(object, (String)object5);
                        bl4 = object instanceof JsonNull;
                        if (!bl4) {
                            object4 = ((JsonPrimitive)object).a();
                        }
                    }
                    if (object4 != null) {
                        n4 = xm1_2.b(serialDescriptor2, (ml1_2)object3, (String)object4);
                        object3 = ((ml1_2)object3).a;
                        int n8 = ((sl1_2)object3).f;
                        if (n8 == 0 && (n8 = (int)(serialDescriptor2.b() ? 1 : 0)) != 0) {
                            bl2 = true;
                        }
                        if (n4 == (n8 = -3) && (bl3 || bl2)) continue;
                    }
                }
            }
            return n3;
        }
        return -1;
    }
}

