/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteCursorDriver
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteQuery
 */
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import kotlin.jvm.internal.Intrinsics;

public final class dX0
implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ hx0_2 a;

    public /* synthetic */ dX0(eX0$a eX0$a) {
        this.a = eX0$a;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String string2, SQLiteQuery sQLiteQuery) {
        hx0_2 hx0_22 = this.a;
        Intrinsics.checkNotNullParameter(hx0_22, "$tmp0");
        return (Cursor)hx0_22.invoke(sQLiteDatabase, sQLiteCursorDriver, string2, sQLiteQuery);
    }
}

