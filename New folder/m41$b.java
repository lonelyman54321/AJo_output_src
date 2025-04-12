/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class m41$b {
    public static void a(String object) {
        int n3 = 1;
        int n4 = ((String)object).length();
        if (n4 > 0) {
            n4 = ((String)object).length();
            Integer n7 = null;
            for (int i3 = 0; i3 < n4; i3 += n3) {
                int n8 = 33;
                int n10 = ((String)object).charAt(i3);
                if (n8 <= n10 && n10 < (n8 = 127)) {
                    continue;
                }
                Integer n14 = n10;
                n7 = i3;
                Object[] objectArray = new Object[3];
                objectArray[0] = n14;
                objectArray[n3] = n7;
                objectArray[2] = object;
                object = ez3.i("Unexpected char %#04x at %d in header name: %s", objectArray);
                object = object.toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                throw illegalArgumentException;
            }
            return;
        }
        String string2 = "name is empty".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static void b(String string2, String object) {
        int n3 = 1;
        int n4 = string2.length();
        Integer n7 = null;
        for (int i3 = 0; i3 < n4; i3 += n3) {
            int n8;
            int n10 = string2.charAt(i3);
            if (n10 == (n8 = 9) || (n8 = 32) <= n10 && n10 < (n8 = 127)) continue;
            StringBuilder stringBuilder = new StringBuilder();
            Integer n14 = n10;
            n7 = i3;
            n8 = 3;
            Object[] objectArray = new Object[n8];
            objectArray[0] = n14;
            objectArray[n3] = n7;
            n3 = 2;
            objectArray[n3] = object;
            String string3 = ez3.i("Unexpected char %#04x at %d in %s value", objectArray);
            stringBuilder.append(string3);
            boolean bl2 = ez3.q((String)object);
            if (bl2) {
                string2 = "";
            } else {
                object = ": ";
                string2 = ((String)object).concat(string2);
            }
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
            string2 = string2.toString();
            object = new IllegalArgumentException(string2);
            throw object;
        }
    }

    public static m41_0 c(String ... stringArray) {
        Object object = "namesAndValues";
        Intrinsics.checkNotNullParameter(stringArray, (String)object);
        int n3 = stringArray.length;
        int n4 = 2;
        if ((n3 %= n4) == 0) {
            int n7;
            stringArray = (String[])stringArray.clone();
            n3 = stringArray.length;
            int n8 = 0;
            String string2 = null;
            for (n7 = 0; n7 < n3; ++n7) {
                String string3 = stringArray[n7];
                if (string3 != null) {
                    stringArray[n7] = string3 = ((Object)StringsKt.m0(string3)).toString();
                    continue;
                }
                object = "Headers cannot be null".toString();
                stringArray = new IllegalArgumentException((String)object);
                throw stringArray;
            }
            n3 = stringArray.length + -1;
            if ((n3 = vb2_1.a(0, n3, n4)) >= 0) {
                while (true) {
                    String string4 = stringArray[n8];
                    n7 = n8 + 1;
                    string2 = stringArray[n7];
                    m41$b.a(string4);
                    m41$b.b(string2, string4);
                    if (n8 == n3) break;
                    n8 += 2;
                }
            }
            object = new m41_0(stringArray);
            return object;
        }
        object = "Expected alternating header names and values".toString();
        stringArray = new IllegalArgumentException((String)object);
        throw stringArray;
    }
}

