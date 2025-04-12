/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.os.Build$VERSION
 */
import android.database.Cursor;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class yf0 {
    /*
     * Enabled aggressive block sorting
     */
    public static final int a(Cursor stringArray, String string2) {
        int n3;
        int n4;
        block5: {
            Intrinsics.checkNotNullParameter(stringArray, "c");
            String string3 = "name";
            Intrinsics.checkNotNullParameter(string2, string3);
            int n7 = stringArray.getColumnIndex(string2);
            if (n7 >= 0) {
                return n7;
            }
            String string4 = "`";
            StringBuilder stringBuilder = new StringBuilder(string4);
            stringBuilder.append(string2);
            int n8 = 96;
            stringBuilder.append((char)n8);
            String string5 = stringBuilder.toString();
            n7 = stringArray.getColumnIndex(string5);
            if (n7 >= 0) {
                return n7;
            }
            n7 = Build.VERSION.SDK_INT;
            int n10 = 25;
            n4 = -1;
            if (n7 > n10) return -1;
            n7 = string2.length();
            if (n7 == 0) {
                return -1;
            }
            stringArray = stringArray.getColumnNames();
            String string6 = "columnNames";
            Intrinsics.checkNotNullExpressionValue(stringArray, string6);
            Intrinsics.checkNotNullParameter(stringArray, string6);
            Intrinsics.checkNotNullParameter(string2, string3);
            string3 = ".";
            String string7 = string3.concat(string2);
            string3 = oj_0.b((char)n8, string3, string2);
            n10 = stringArray.length;
            int n14 = 0;
            n3 = 0;
            while (n14 < n10) {
                boolean bl2;
                int n15;
                String string8 = stringArray[n14];
                int n16 = n3 + 1;
                int n17 = string8.length();
                if (n17 < (n15 = string2.length() + 2) || (n17 = (int)(b.h(string8, string7, false) ? 1 : 0)) == 0 && ((n17 = (int)string8.charAt(0)) != n8 || !(bl2 = b.h(string8, string3, false)))) {
                    ++n14;
                    n3 = n16;
                    continue;
                }
                break block5;
            }
            return n4;
        }
        n4 = n3;
        return n4;
    }

    public static final int b(Cursor object, String string2) {
        Intrinsics.checkNotNullParameter(object, "c");
        Object object2 = "name";
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        int n3 = yf0.a((Cursor)object, string2);
        if (n3 >= 0) {
            return n3;
        }
        object = object.getColumnNames();
        object2 = "c.columnNames";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        n3 = 63;
        try {
            object = tp_2.G(n3, null, object);
        }
        catch (Exception exception) {
            object = "unknown";
        }
        object = UX.c("column '", string2, "' does not exist. Available columns: ", (String)object);
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

