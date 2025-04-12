/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;

public final class HT2 {
    public static final HT2 a;

    static {
        HT2 hT2;
        a = hT2 = new Object();
    }

    public static final JsonEncodingException a(String charSequence, Number number) {
        Intrinsics.checkNotNullParameter(number, "value");
        Intrinsics.checkNotNullParameter(charSequence, "output");
        StringBuilder stringBuilder = new StringBuilder("Unexpected special floating-point value ");
        stringBuilder.append(number);
        stringBuilder.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        charSequence = HT2.f(-1, charSequence);
        stringBuilder.append((Object)charSequence);
        charSequence = stringBuilder.toString();
        JsonEncodingException jsonEncodingException = new JsonEncodingException((String)charSequence);
        return jsonEncodingException;
    }

    public static final JsonEncodingException b(SerialDescriptor object) {
        Intrinsics.checkNotNullParameter(object, "keyDescriptor");
        StringBuilder stringBuilder = new StringBuilder("Value of type '");
        String string2 = object.h();
        stringBuilder.append(string2);
        stringBuilder.append("' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '");
        object = object.getKind();
        stringBuilder.append(object);
        stringBuilder.append("'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
        object = stringBuilder.toString();
        JsonEncodingException jsonEncodingException = new JsonEncodingException((String)object);
        return jsonEncodingException;
    }

    public static final JsonDecodingException c(int n3, String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        if (n3 >= 0) {
            String string3 = "Unexpected JSON token at offset ";
            StringBuilder stringBuilder = new StringBuilder(string3);
            stringBuilder.append(n3);
            String string4 = ": ";
            stringBuilder.append(string4);
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
        }
        JsonDecodingException jsonDecodingException = new JsonDecodingException(string2);
        return jsonDecodingException;
    }

    public static final JsonDecodingException d(CharSequence charSequence, int n3, String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        Intrinsics.checkNotNullParameter(charSequence, "input");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("\nJSON input: ");
        charSequence = HT2.f(n3, charSequence);
        stringBuilder.append((Object)charSequence);
        charSequence = stringBuilder.toString();
        return HT2.c(n3, (String)charSequence);
    }

    public static final void e(q0_0 q0_02, String string2) {
        Intrinsics.checkNotNullParameter(q0_02, "<this>");
        Intrinsics.checkNotNullParameter(string2, "entity");
        StringBuilder stringBuilder = new StringBuilder("Trailing comma before the end of JSON ");
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        int n3 = q0_02.a + -1;
        q0_02.q(n3, string2, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence f(int n3, CharSequence charSequence) {
        int n4;
        CharSequence charSequence2 = "<this>";
        Intrinsics.checkNotNullParameter(charSequence, (String)charSequence2);
        int n7 = charSequence.length();
        int n8 = 200;
        if (n7 < n8) {
            return charSequence;
        }
        n7 = -1;
        String string2 = ".....";
        if (n3 == n7) {
            n3 = charSequence.length() + -60;
            if (n3 <= 0) {
                return charSequence;
            }
            charSequence2 = new StringBuilder(string2);
            n8 = charSequence.length();
            String string3 = ((Object)charSequence.subSequence(n3, n8)).toString();
            ((StringBuilder)charSequence2).append(string3);
            return ((StringBuilder)charSequence2).toString();
        }
        n7 = n3 + -30;
        CharSequence charSequence3 = "";
        CharSequence charSequence4 = n7 <= 0 ? charSequence3 : string2;
        int n10 = charSequence.length();
        if ((n3 += 30) >= n10) {
            string2 = charSequence3;
        }
        charSequence3 = Ex0.a(charSequence4);
        if (n7 < 0) {
            n7 = 0;
            charSequence2 = null;
        }
        if (n3 > (n4 = charSequence.length())) {
            n3 = n4;
        }
        String string4 = ((Object)charSequence.subSequence(n7, n3)).toString();
        ((StringBuilder)charSequence3).append(string4);
        ((StringBuilder)charSequence3).append(string2);
        return ((StringBuilder)charSequence3).toString();
    }

    public static final void g(q0_0 q0_02, Number object) {
        Intrinsics.checkNotNullParameter(q0_02, "<this>");
        Intrinsics.checkNotNullParameter(object, "result");
        StringBuilder stringBuilder = new StringBuilder("Unexpected special floating-point value ");
        stringBuilder.append(object);
        stringBuilder.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification");
        object = stringBuilder.toString();
        q0_0.r(q0_02, (String)object, 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String h(Number object, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder("Unexpected special floating-point value ");
        stringBuilder.append(object);
        stringBuilder.append(" with key ");
        stringBuilder.append(string2);
        stringBuilder.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        object = HT2.f(-1, string3);
        stringBuilder.append(object);
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void i(GY2 object, int n3, ft2$a_0 ft2$a_0) {
        Object[] objectArray = new GY2[16];
        WR1 wR1 = new WR1(objectArray);
        objectArray = null;
        object = ((GY2)object).g(false, false, false);
        while (true) {
            int n4 = wR1.c;
            wR1.d(n4, (List)object);
            while (true) {
                int n7;
                if ((n7 = wR1.l()) == 0) {
                    return;
                }
                n7 = wR1.c + -1;
                object = (GY2)wR1.n(n7);
                n4 = VY2.e((GY2)object) ? 1 : 0;
                if (n4 == 0) continue;
                Object object2 = MY2.j;
                Object object3 = ((GY2)object).d;
                Object object4 = ((zy2_0)object3).a;
                n4 = object4.containsKey(object2) ? 1 : 0;
                if (n4 != 0) continue;
                object2 = ((GY2)object).c();
                if (object2 == null) {
                    bh1_1.d("Expected semantics node to have a coordinator.");
                    throw null;
                }
                object4 = Wi1.a(ap1_0.c((zp1)object2));
                int n8 = ((Vi1)object4).a;
                int n10 = ((Vi1)object4).c;
                if (n8 >= n10 || (n8 = ((Vi1)object4).b) >= (n10 = ((Vi1)object4).d)) continue;
                Object object5 = yY2.e;
                object5 = (Function2)AY2.a((zy2_0)object3, (TY2)object5);
                TY2 tY2 = MY2.q;
                object3 = (CT2)AY2.a((zy2_0)object3, tY2);
                if (object5 == null || object3 == null) break;
                object3 = (Number)((CT2)object3).b.invoke();
                float f5 = ((Number)object3).floatValue();
                n8 = 0;
                object5 = null;
                float f6 = f5 - 0.0f;
                float f7 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
                if (f7 <= 0) break;
                f7 = n3 + 1;
                object5 = new GT2((GY2)object, (int)f7, (Vi1)object4, (w32_0)object2);
                ft2$a_0.invoke(object5);
                HT2.i((GY2)object, (int)f7, ft2$a_0);
            }
            object = ((GY2)object).g(false, false, false);
        }
    }
}

