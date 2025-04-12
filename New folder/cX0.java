/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteCursor
 *  android.database.sqlite.SQLiteCursorDriver
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteProgram
 *  android.database.sqlite.SQLiteQuery
 */
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import kotlin.jvm.internal.Intrinsics;

public final class cX0
implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ ag3_0 a;

    public /* synthetic */ cX0(ag3_0 ag3_02) {
        this.a = ag3_02;
    }

    public final Cursor newCursor(SQLiteDatabase object, SQLiteCursorDriver sQLiteCursorDriver, String string2, SQLiteQuery sQLiteQuery) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$query");
        Intrinsics.checkNotNull(sQLiteQuery);
        iX0 iX02 = new iX0((SQLiteProgram)sQLiteQuery);
        object.b(iX02);
        object = new SQLiteCursor(sQLiteCursorDriver, string2, sQLiteQuery);
        return object;
    }
}

