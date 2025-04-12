/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 */
import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

public final class fX0$b$c {
    public static ex0_1 a(fX0$a fX0$a, SQLiteDatabase sQLiteDatabase) {
        ex0_1 ex0_12;
        block3: {
            block2: {
                Intrinsics.checkNotNullParameter(fX0$a, "refHolder");
                String string2 = "sqLiteDatabase";
                Intrinsics.checkNotNullParameter(sQLiteDatabase, string2);
                ex0_12 = fX0$a.a;
                if (ex0_12 == null) break block2;
                Intrinsics.checkNotNullParameter(sQLiteDatabase, string2);
                string2 = ex0_12.a;
                boolean bl2 = Intrinsics.areEqual(string2, sQLiteDatabase);
                if (bl2) break block3;
            }
            fX0$a.a = ex0_12 = new ex0_1(sQLiteDatabase);
        }
        return ex0_12;
    }
}

