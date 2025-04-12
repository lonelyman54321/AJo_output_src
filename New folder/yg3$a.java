/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 */
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public abstract class yg3$a {
    public final int a;

    public yg3$a(int n3) {
        this.a = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(String string2) {
        Object object = ":memory:";
        int n3 = 1;
        int n4 = b.i(string2, (String)object, n3 != 0);
        if (n4 != 0) return;
        n4 = string2.length() - n3;
        int n7 = 0;
        boolean bl2 = false;
        while (n7 <= n4) {
            int n8 = !bl2 ? n7 : n4;
            n8 = string2.charAt(n8);
            int n10 = 32;
            n8 = Intrinsics.compare(n8, n10);
            n8 = n8 <= 0 ? 1 : 0;
            if (!bl2) {
                if (n8 == 0) {
                    bl2 = true;
                    continue;
                }
                ++n7;
                continue;
            }
            if (n8 == 0) break;
            n4 += -1;
        }
        n4 += n3;
        object = ((Object)string2.subSequence(n7, n4)).toString();
        if ((n4 = ((String)object).length()) == 0) {
            return;
        }
        try {
            object = new File(string2);
            string2 = "file";
            Intrinsics.checkNotNullParameter(object, string2);
            SQLiteDatabase.deleteDatabase((File)object);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public void b(ex0_1 ex0_12) {
        Intrinsics.checkNotNullParameter(ex0_12, "db");
    }

    public abstract void c(ex0_1 var1);

    public abstract void d(ex0_1 var1, int var2, int var3);

    public void e(ex0_1 ex0_12) {
        Intrinsics.checkNotNullParameter(ex0_12, "db");
    }

    public abstract void f(ex0_1 var1, int var2, int var3);
}

