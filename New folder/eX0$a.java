/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteCursor
 *  android.database.sqlite.SQLiteCursorDriver
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteProgram
 *  android.database.sqlite.SQLiteQuery
 */
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class eX0$a
extends Lambda
implements hx0_2 {
    public final /* synthetic */ ag3_0 c;

    public eX0$a(ag3_0 ag3_02) {
        this.c = ag3_02;
        super(4);
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (SQLiteDatabase)object;
        object2 = (SQLiteCursorDriver)object2;
        object3 = (String)object3;
        object4 = (SQLiteQuery)object4;
        Intrinsics.checkNotNull(object4);
        object = new iX0((SQLiteProgram)object4);
        this.c.b((zg3_2)object);
        object = new SQLiteCursor((SQLiteCursorDriver)object2, (String)object3, (SQLiteQuery)object4);
        return object;
    }
}

