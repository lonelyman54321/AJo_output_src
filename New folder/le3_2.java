/*
 * Decompiled with CFR 0.152.
 */
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.f;

/*
 * Renamed from Le3
 */
public class le3_2
extends f {
    public static String B(int n3, String object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        if (n3 >= 0) {
            int n4 = ((String)object).length();
            if (n3 > n4) {
                n3 = n4;
            }
            String string3 = ((String)object).substring(n3);
            Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
            return string3;
        }
        String string4 = Gj0.b(n3, "Requested character count ", " is less than zero.");
        string4 = string4.toString();
        object = new IllegalArgumentException(string4);
        throw object;
    }

    public static String C(String string2) {
        String string3 = "<this>";
        Intrinsics.checkNotNullParameter(string2, string3);
        int n3 = string2.length() + -1;
        if (n3 < 0) {
            n3 = 0;
            string3 = null;
        }
        return le3_2.E(n3, string2);
    }

    public static char D(CharSequence object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.length();
        if (n3 != 0) {
            n3 = StringsKt.K((CharSequence)object);
            return object.charAt(n3);
        }
        object = new NoSuchElementException("Char sequence is empty.");
        throw object;
    }

    public static String E(int n3, String object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        if (n3 >= 0) {
            int n4 = ((String)object).length();
            if (n3 > n4) {
                n3 = n4;
            }
            String string3 = ((String)object).substring(0, n3);
            Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
            return string3;
        }
        String string4 = Gj0.b(n3, "Requested character count ", " is less than zero.");
        string4 = string4.toString();
        object = new IllegalArgumentException(string4);
        throw object;
    }
}

