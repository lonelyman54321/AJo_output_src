/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class JN1$a {
    public static jn1_0 a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Object object = jn1_0.d.matcher(string2);
        boolean n3 = ((Matcher)object).lookingAt();
        char c2 = '\"';
        if (n3) {
            ArrayList<Object> arrayList;
            Object object2;
            String string3;
            block6: {
                int n4 = 1;
                string3 = ((Matcher)object).group(n4);
                Intrinsics.checkNotNullExpressionValue(string3, "typeSubtype.group(1)");
                object2 = Locale.US;
                arrayList = "US";
                Object object3 = "this as java.lang.String).toLowerCase(locale)";
                string3 = zn0_1.a((Locale)object2, (String)((Object)arrayList), string3, (Locale)object2, (String)object3);
                int n7 = 2;
                String string4 = ((Matcher)object).group(n7);
                String string5 = "typeSubtype.group(2)";
                Intrinsics.checkNotNullExpressionValue(string4, string5);
                Intrinsics.checkNotNullExpressionValue(object2, (String)((Object)arrayList));
                object2 = string4.toLowerCase((Locale)object2);
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                arrayList = new ArrayList<Object>();
                object3 = jn1_0.e.matcher(string2);
                int n8 = ((Matcher)object).end();
                while (true) {
                    int n10 = string2.length();
                    int n14 = 0;
                    string5 = null;
                    if (n8 >= n10) break block6;
                    n10 = string2.length();
                    ((Matcher)object3).region(n8, n10);
                    n10 = (int)(((Matcher)object3).lookingAt() ? 1 : 0);
                    if (n10 == 0) break;
                    object = ((Matcher)object3).group(n4);
                    if (object == null) {
                        n8 = ((Matcher)object3).end();
                        continue;
                    }
                    string4 = ((Matcher)object3).group(n7);
                    if (string4 == null) {
                        n10 = 3;
                        string4 = ((Matcher)object3).group(n10);
                    } else {
                        String string6 = "'";
                        boolean bl2 = b.s(string4, string6, false);
                        if (bl2 && (n14 = b.h(string4, string6, false)) != 0 && (n14 = string4.length()) > n7) {
                            n14 = string4.length() - n4;
                            string4 = string4.substring(n4, n14);
                            string5 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
                            Intrinsics.checkNotNullExpressionValue(string4, string5);
                        }
                    }
                    arrayList.add(object);
                    arrayList.add(string4);
                    n8 = ((Matcher)object3).end();
                }
                StringBuilder stringArray = new StringBuilder("Parameter is not formatted correctly: \"");
                object = string2.substring(n8);
                Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String).substring(startIndex)");
                stringArray.append((String)object);
                stringArray.append("\" for: \"");
                string2 = ui0_1.a(stringArray, string2, c2);
                string2 = string2.toString();
                object = new IllegalArgumentException(string2);
                throw object;
            }
            String[] stringArray = new String[]{};
            stringArray = arrayList.toArray(stringArray);
            object = new jn1_0(string2, string3, (String)object2, stringArray);
            return object;
        }
        string2 = oj_0.b(c2, "No subtype found for: \"", string2);
        string2 = string2.toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static jn1_0 b(String object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        try {
            object = JN1$a.a((String)object);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            object = null;
        }
        return object;
    }
}

