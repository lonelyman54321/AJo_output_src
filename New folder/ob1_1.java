/*
 * Decompiled with CFR 0.152.
 */
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/*
 * Renamed from Ob1
 */
public final class ob1_1 {
    public static final char[] k;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final List g;
    public final String h;
    public final String i;
    public final boolean j;

    static {
        char[] cArray;
        char[] cArray2 = cArray = new char[16];
        char[] cArray3 = cArray;
        cArray2[0] = 48;
        cArray3[1] = 49;
        cArray2[2] = 50;
        cArray3[3] = 51;
        cArray2[4] = 52;
        cArray3[5] = 53;
        cArray2[6] = 54;
        cArray3[7] = 55;
        cArray2[8] = 56;
        cArray3[9] = 57;
        cArray2[10] = 65;
        cArray3[11] = 66;
        cArray2[12] = 67;
        cArray3[13] = 68;
        cArray2[14] = 69;
        cArray3[15] = 70;
        k = cArray;
    }

    public ob1_1(String string2, String string3, String string4, String string5, int n3, ArrayList arrayList, ArrayList arrayList2, String string6, String string7) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(string2, "scheme");
        Intrinsics.checkNotNullParameter(string3, "username");
        Intrinsics.checkNotNullParameter(string4, "password");
        Intrinsics.checkNotNullParameter(string5, "host");
        Intrinsics.checkNotNullParameter(arrayList, "pathSegments");
        Intrinsics.checkNotNullParameter(string7, "url");
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
        this.e = n3;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = string6;
        this.i = string7;
        this.j = bl2 = Intrinsics.areEqual(string2, "https");
    }

    public final String a() {
        String string2 = this.c;
        int n3 = string2.length();
        if (n3 == 0) {
            return "";
        }
        n3 = this.a.length() + 3;
        String string3 = this.i;
        n3 = StringsKt.N(string3, ':', n3, false, 4) + 1;
        int n4 = StringsKt.N(string3, '@', 0, false, 6);
        string2 = string3.substring(n3, n4);
        Intrinsics.checkNotNullExpressionValue(string2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return string2;
    }

    public final String b() {
        int n3 = this.a.length() + 3;
        String string2 = this.i;
        n3 = StringsKt.N(string2, '/', n3, false, 4);
        int n4 = string2.length();
        n4 = ez3.e(n3, n4, string2, "?#");
        String string3 = string2.substring(n3, n4);
        Intrinsics.checkNotNullExpressionValue(string3, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return string3;
    }

    public final ArrayList c() {
        String string2 = this.a;
        int n3 = string2.length() + 3;
        String string3 = this.i;
        char c2 = '/';
        int n4 = 4;
        n3 = StringsKt.N(string3, c2, n3, false, n4);
        int n7 = string3.length();
        n7 = ez3.e(n3, n7, string3, "?#");
        ArrayList<String> arrayList = new ArrayList<String>();
        while (n3 < n7) {
            int n8 = ez3.f(string3, c2, ++n3, n7);
            string2 = string3.substring(n3, n8);
            String string4 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
            Intrinsics.checkNotNullExpressionValue(string2, string4);
            arrayList.add(string2);
            n3 = n8;
        }
        return arrayList;
    }

    public final String d() {
        Object object = this.g;
        if (object == null) {
            return null;
        }
        String string2 = this.i;
        int n3 = StringsKt.N(string2, '?', 0, false, 6) + 1;
        int n4 = string2.length();
        n4 = ez3.f(string2, '#', n3, n4);
        object = string2.substring(n3, n4);
        Intrinsics.checkNotNullExpressionValue(object, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return object;
    }

    public final String e() {
        String string2 = this.b;
        int n3 = string2.length();
        if (n3 == 0) {
            return "";
        }
        n3 = this.a.length() + 3;
        String string3 = this.i;
        int n4 = string3.length();
        int n7 = ez3.e(n3, n4, string3, ":@");
        string2 = string3.substring(n3, n7);
        Intrinsics.checkNotNullExpressionValue(string2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return string2;
    }

    public final boolean equals(Object object) {
        String string2;
        boolean bl2;
        boolean bl3 = object instanceof ob1_1;
        if (bl3 && (bl2 = Intrinsics.areEqual(object = ((ob1_1)object).i, string2 = this.i))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final Ob1$a f() {
        int n3;
        Ob1$a ob1$a = new Ob1$a();
        Object object = this.a;
        ob1$a.a = object;
        Object object2 = this.e();
        String string2 = "<set-?>";
        Intrinsics.checkNotNullParameter(object2, string2);
        ob1$a.b = object2;
        object2 = this.a();
        Intrinsics.checkNotNullParameter(object2, string2);
        ob1$a.c = object2;
        object2 = this.d;
        ob1$a.d = object2;
        Intrinsics.checkNotNullParameter(object, "scheme");
        object2 = "http";
        int n4 = Intrinsics.areEqual(object, object2);
        int n7 = -1;
        n3 = n4 != 0 ? 80 : ((n3 = (int)(Intrinsics.areEqual(object, object2 = "https") ? 1 : 0)) != 0 ? 443 : -1);
        n4 = this.e;
        if (n4 != n3) {
            n7 = n4;
        }
        ob1$a.e = n7;
        object = ob1$a.f;
        ((ArrayList)object).clear();
        object2 = this.c();
        ((ArrayList)object).addAll(object2);
        object = this.d();
        ob1$a.d((String)object);
        object = this.h;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n4 = 6;
            string2 = this.i;
            n3 = StringsKt.N(string2, '#', 0, false, n4) + 1;
            object = string2.substring(n3);
            object2 = "this as java.lang.String).substring(startIndex)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        }
        ob1$a.h = object;
        return ob1$a;
    }

    public final Ob1$a g(String string2) {
        Object object = "link";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        object = new Ob1$a();
        try {
            ((Ob1$a)object).e(this, string2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            object = null;
        }
        return object;
    }

    public final String h() {
        List list = this.g;
        if (list == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Ob1$b.e(list, stringBuilder);
        return stringBuilder.toString();
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String i() {
        Ob1$a ob1$a = this.g("/...");
        Intrinsics.checkNotNull(ob1$a);
        ob1$a.getClass();
        String string2 = "";
        Intrinsics.checkNotNullParameter(string2, "username");
        ob1$a.b = string2 = Ob1$b.a(string2, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        String string3 = "";
        Intrinsics.checkNotNullParameter(string3, "password");
        ob1$a.c = string2 = Ob1$b.a(string3, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        return ob1$a.b().i;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final URI j() {
        boolean bl2;
        int n3;
        int n4;
        boolean bl3;
        boolean bl4;
        String string2;
        boolean bl5;
        String string3;
        Object object;
        Object object2;
        int n7;
        String string4;
        Object object3 = this.f();
        Object object4 = ((Ob1$a)object3).d;
        String string5 = "";
        Object object5 = null;
        if (object4 != null) {
            string4 = "[\"<>^`{|}]";
            object4 = oo1_1.a(string4, (String)object4, string5);
        } else {
            object4 = null;
        }
        ((Ob1$a)object3).d = object4;
        object4 = ((Ob1$a)object3).f;
        int n8 = ((ArrayList)object4).size();
        int n10 = 0;
        String string6 = null;
        for (n7 = 0; n7 < n8; ++n7) {
            object = object2 = ((ArrayList)object4).get(n7);
            object = (String)object2;
            int n14 = 227;
            string3 = null;
            bl5 = false;
            string2 = null;
            String string7 = "[]";
            bl4 = true;
            bl3 = true;
            n4 = 0;
            n3 = 0;
            object2 = Ob1$b.a(object, 0, 0, string7, bl4, bl3, false, false, null, n14);
            ((ArrayList)object4).set(n7, object2);
        }
        object4 = ((Ob1$a)object3).g;
        if (object4 != null) {
            n8 = object4.size();
            while (n10 < n8) {
                string6 = object4.get(n10);
                object2 = string6;
                object2 = string6;
                if (object2 != null) {
                    bl3 = true;
                    n3 = 195;
                    object = null;
                    string3 = null;
                    string2 = "\\^`{|}";
                    bl2 = true;
                    bl4 = true;
                    n4 = 0;
                    string6 = Ob1$b.a(object2, 0, 0, string2, bl2, bl4, bl3, false, null, n3);
                } else {
                    n7 = 0;
                    string6 = null;
                }
                object4.set(n10, string6);
                ++n10;
            }
        }
        if ((string6 = ((Ob1$a)object3).h) != null) {
            bl4 = false;
            n4 = 163;
            object2 = null;
            object = null;
            string3 = " \"#<>\\^`{|}";
            bl5 = true;
            bl2 = true;
            bl3 = true;
            object5 = Ob1$b.a(string6, 0, 0, string3, bl5, bl2, false, bl3, null, n4);
        }
        ((Ob1$a)object3).h = object5;
        object4 = ((Ob1$a)object3).toString();
        try {
            return new URI((String)object4);
        }
        catch (URISyntaxException uRISyntaxException) {
            try {
                string4 = "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]";
                object5 = new Regex(string4);
                object4 = ((Regex)object5).replace((CharSequence)object4, string5);
                object3 = URI.create((String)object4);
                object4 = "{\n      // Unlikely edge\u2026Unexpected!\n      }\n    }";
            }
            catch (Exception exception) {
                object4 = new RuntimeException(uRISyntaxException);
                throw object4;
            }
            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        }
        return object3;
    }

    public final URL k() {
        Object object;
        try {
            object = this.i;
        }
        catch (MalformedURLException malformedURLException) {
            object = new RuntimeException(malformedURLException);
            throw object;
        }
        URL uRL = new URL((String)object);
        return uRL;
    }

    public final String toString() {
        return this.i;
    }
}

