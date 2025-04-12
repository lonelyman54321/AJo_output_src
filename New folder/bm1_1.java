/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/*
 * Renamed from bm1
 */
public final class bm1_1 {
    public static final yh1_2 a;

    static {
        xe_1.D(StringCompanionObject.INSTANCE);
        pe3_2 pe3_22 = pe3_2.a;
        a = ah1_2.a("kotlinx.serialization.json.JsonUnquotedLiteral", pe3_22);
    }

    public static final JsonPrimitive a(Number number) {
        tm1_1 tm1_12 = new tm1_1(number, false, null);
        return tm1_12;
    }

    public static final JsonPrimitive b(String string2) {
        if (string2 == null) {
            return JsonNull.INSTANCE;
        }
        tm1_1 tm1_12 = new tm1_1(string2, true, null);
        return tm1_12;
    }

    public static final void c(String string2, JsonElement object) {
        StringBuilder stringBuilder = new StringBuilder("Element ");
        object = Reflection.getOrCreateKotlinClass(object.getClass());
        stringBuilder.append(object);
        stringBuilder.append(" is not a ");
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static final JsonObject d(JsonElement jsonElement) {
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(jsonElement, (String)object);
        boolean bl2 = jsonElement instanceof JsonObject;
        if (bl2) {
            object = jsonElement;
            object = (JsonObject)jsonElement;
        } else {
            bl2 = false;
            object = null;
        }
        if (object != null) {
            return object;
        }
        bm1_1.c("JsonObject", jsonElement);
        throw null;
    }

    public static final long e(JsonPrimitive object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = ((JsonPrimitive)object).a();
        je3_1 je3_12 = new je3_1((String)object);
        long l2 = je3_12.i();
        int c2 = je3_12.f();
        int n3 = 10;
        if (c2 != n3) {
            int n4 = je3_12.a;
            int n7 = n4 + -1;
            String string2 = je3_12.e;
            n3 = string2.length();
            if (n4 != n3 && n7 >= 0) {
                char c3 = string2.charAt(n7);
                object = String.valueOf(c3);
            } else {
                object = "EOF";
            }
            object = cP.a("Expected input to contain a single valid number, but got '", (String)object, "' after it");
            q0_0.r(je3_12, (String)object, n7, null, 4);
            throw null;
        }
        return l2;
    }
}

