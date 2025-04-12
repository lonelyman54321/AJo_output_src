/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteStatement
 *  android.os.CancellationSignal
 *  android.text.TextUtils
 */
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eX0
 */
public final class ex0_1
implements xg3_1 {
    public static final String[] b = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] c = new String[0];
    public final SQLiteDatabase a;

    public ex0_1(SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "delegate");
        this.a = sQLiteDatabase;
    }

    public final void B() {
        this.a.beginTransactionNonExclusive();
    }

    public final boolean B0() {
        SQLiteDatabase sQLiteDatabase = this.a;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final int E0(ContentValues object, Object[] object2) {
        String string2 = "WorkSpec";
        Intrinsics.checkNotNullParameter(string2, "table");
        String string3 = "values";
        Intrinsics.checkNotNullParameter(object, string3);
        int n3 = object.size();
        if (n3 != 0) {
            int n4;
            boolean bl2;
            n3 = object.size();
            int n7 = ((Object[])object2).length + n3;
            Object[] objectArray = new Object[n7];
            StringBuilder stringBuilder = new StringBuilder("UPDATE ");
            Object object3 = b[3];
            stringBuilder.append((String)object3);
            stringBuilder.append("WorkSpec SET ");
            object3 = object.keySet().iterator();
            int n8 = 0;
            String string4 = null;
            while (bl2 = object3.hasNext()) {
                Object object4 = (String)object3.next();
                String string5 = n8 > 0 ? "," : "";
                stringBuilder.append(string5);
                stringBuilder.append((String)object4);
                int n10 = n8 + 1;
                objectArray[n8] = object4 = object.get((String)object4);
                string4 = "=?";
                stringBuilder.append(string4);
                n8 = n10;
            }
            for (n4 = n3; n4 < n7; ++n4) {
                int n14 = n4 - n3;
                objectArray[n4] = object3 = object2[n14];
            }
            object = "last_enqueue_time = 0 AND interval_duration <> 0 ";
            n4 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            if (n4 == 0) {
                object = " WHERE last_enqueue_time = 0 AND interval_duration <> 0 ";
                stringBuilder.append((String)object);
            }
            object = stringBuilder.toString();
            Intrinsics.checkNotNullExpressionValue(object, "StringBuilder().apply(builderAction).toString()");
            object = this.e0((String)object);
            C53$a.a((zg3_2)object, objectArray);
            return ((jX0)object).b.executeUpdateDelete();
        }
        object2 = "Empty values".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void F() {
        this.a.endTransaction();
    }

    public final void close() {
        this.a.close();
    }

    public final bg3_0 e0(String string2) {
        Intrinsics.checkNotNullParameter(string2, "sql");
        string2 = this.a.compileStatement(string2);
        Intrinsics.checkNotNullExpressionValue(string2, "delegate.compileStatement(sql)");
        jX0 jX02 = new jX0((SQLiteStatement)string2);
        return jX02;
    }

    public final void i() {
        this.a.beginTransaction();
    }

    public final boolean isOpen() {
        return this.a.isOpen();
    }

    public final Cursor j(ag3_0 object) {
        Intrinsics.checkNotNullParameter(object, "query");
        String[] stringArray = new eX0$a((ag3_0)object);
        dX0 dX02 = new dX0((eX0$a)stringArray);
        object = object.a();
        stringArray = c;
        object = this.a.rawQueryWithFactory((SQLiteDatabase.CursorFactory)dX02, (String)object, stringArray, null);
        Intrinsics.checkNotNullExpressionValue(object, "delegate.rawQueryWithFac\u2026EMPTY_STRING_ARRAY, null)");
        return object;
    }

    public final void n0(Object[] objectArray) {
        String string2 = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";
        Intrinsics.checkNotNullParameter(string2, "sql");
        Intrinsics.checkNotNullParameter(objectArray, "bindArgs");
        this.a.execSQL(string2, objectArray);
    }

    public final void o(String string2) {
        Intrinsics.checkNotNullParameter(string2, "sql");
        this.a.execSQL(string2);
    }

    public final Cursor o0(ag3_0 ag3_02, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(ag3_02, "query");
        String string2 = ag3_02.a();
        String[] stringArray = c;
        Intrinsics.checkNotNull(cancellationSignal);
        cX0 cX02 = new cX0(ag3_02);
        SQLiteDatabase sQLiteDatabase = this.a;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        Intrinsics.checkNotNullParameter(string2, "sql");
        Intrinsics.checkNotNullParameter(stringArray, "selectionArgs");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        Intrinsics.checkNotNullParameter(cX02, "cursorFactory");
        ag3_02 = sQLiteDatabase.rawQueryWithFactory((SQLiteDatabase.CursorFactory)cX02, string2, stringArray, null, cancellationSignal);
        Intrinsics.checkNotNullExpressionValue(ag3_02, "sQLiteDatabase.rawQueryW\u2026ationSignal\n            )");
        return ag3_02;
    }

    public final Cursor r0(String string2) {
        Intrinsics.checkNotNullParameter(string2, "query");
        C53 c53 = new C53(string2);
        return this.j(c53);
    }

    public final void y() {
        this.a.setTransactionSuccessful();
    }

    public final boolean z0() {
        return this.a.inTransaction();
    }
}

