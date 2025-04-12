/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteProgram
 *  android.database.sqlite.SQLiteStatement
 */
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;

public final class jX0
extends iX0
implements bg3_0 {
    public final SQLiteStatement b;

    public jX0(SQLiteStatement sQLiteStatement) {
        Intrinsics.checkNotNullParameter(sQLiteStatement, "delegate");
        super((SQLiteProgram)sQLiteStatement);
        this.b = sQLiteStatement;
    }

    public final long Z() {
        return this.b.executeInsert();
    }

    public final int q() {
        return this.b.executeUpdateDelete();
    }
}

