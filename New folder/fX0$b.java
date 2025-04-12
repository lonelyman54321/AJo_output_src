/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.DatabaseErrorHandler
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.database.sqlite.SQLiteOpenHelper
 */
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

public final class fX0$b
extends SQLiteOpenHelper {
    public static final /* synthetic */ int h;
    public final Context a;
    public final fX0$a b;
    public final yg3$a c;
    public final boolean d;
    public boolean e;
    public final Fz2 f;
    public boolean g;

    public fX0$b(Context object, String string2, fX0$a object2, yg3$a object3, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(object2, "dbRef");
        String string3 = "callback";
        Intrinsics.checkNotNullParameter(object3, string3);
        int n3 = ((yg3$a)object3).a;
        gx0_0 gx0_02 = new gx0_0((yg3$a)object3, (fX0$a)object2);
        super(object, string2, null, n3, (DatabaseErrorHandler)gx0_02);
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = bl2;
        if (string2 == null) {
            string2 = UUID.randomUUID().toString();
            object3 = "randomUUID().toString()";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object3);
        }
        object = object.getCacheDir();
        this.f = object2 = new Fz2(string2, (File)object, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final xg3_1 a(boolean bl2) {
        Throwable throwable2;
        Fz2 fz2;
        block6: {
            String string2;
            boolean bl3;
            boolean bl4;
            block5: {
                block4: {
                    fz2 = this.f;
                    try {
                        bl4 = this.g;
                        bl3 = false;
                        if (bl4 || (string2 = this.getDatabaseName()) == null) break block4;
                        bl4 = true;
                        break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                bl4 = false;
                string2 = null;
            }
            fz2.a(bl4);
            this.e = false;
            string2 = this.d(bl2);
            bl3 = this.e;
            if (bl3) {
                this.close();
                xg3_1 xg3_12 = this.a(bl2);
                fz2.b();
                return xg3_12;
            }
            ex0_1 ex0_12 = this.b((SQLiteDatabase)string2);
            fz2.b();
            return ex0_12;
        }
        fz2.b();
        throw throwable2;
    }

    public final ex0_1 b(SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sqLiteDatabase");
        return fX0$b$c.a(this.b, sQLiteDatabase);
    }

    public final SQLiteDatabase c(boolean bl2) {
        SQLiteDatabase sQLiteDatabase;
        String string2 = "{\n                super.\u2026eDatabase()\n            }";
        if (bl2) {
            sQLiteDatabase = this.getWritableDatabase();
            Intrinsics.checkNotNullExpressionValue(sQLiteDatabase, string2);
        } else {
            sQLiteDatabase = this.getReadableDatabase();
            Intrinsics.checkNotNullExpressionValue(sQLiteDatabase, string2);
        }
        return sQLiteDatabase;
    }

    public final void close() {
        Fz2 fz2 = this.f;
        boolean bl2 = fz2.a;
        fz2.a(bl2);
        super.close();
        fX0$a fX0$a = this.b;
        fX0$a.a = null;
        bl2 = false;
        fX0$a = null;
        try {
            this.g = false;
            return;
        }
        finally {
            fz2.b();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final SQLiteDatabase d(boolean bl2) {
        int n3;
        File file;
        String string2 = this.getDatabaseName();
        boolean bl3 = this.g;
        Context context = this.a;
        if (string2 != null && !bl3 && (file = context.getDatabasePath(string2).getParentFile()) != null) {
            file.mkdirs();
            n3 = file.isDirectory();
            if (n3 == 0) {
                ((Object)file).toString();
            }
        }
        try {
            return this.c(bl2);
        }
        catch (Throwable throwable) {
            super.close();
            long l2 = 500L;
            try {
                Thread.sleep(l2);
            }
            catch (InterruptedException interruptedException) {}
            try {
                return this.c(bl2);
            }
            catch (Throwable throwable2) {
                block21: {
                    block20: {
                        super.close();
                        n3 = throwable2 instanceof fX0$b$a;
                        if (n3 != 0) {
                            fX0$b$a fX0$b$a = (fX0$b$a)throwable2;
                            int[] nArray = fX0$b$d.$EnumSwitchMapping$0;
                            fX0$b$b fX0$b$b = fX0$b$a.a;
                            int n4 = fX0$b$b.ordinal();
                            n3 = nArray[n4];
                            n4 = 1;
                            Throwable throwable3 = fX0$b$a.b;
                            if (n3 != n4 && n3 != (n4 = 2) && n3 != (n4 = 3) && n3 != (n4 = 4)) {
                                n3 = throwable3 instanceof SQLiteException;
                                if (n3 == 0) {
                                    throw throwable3;
                                }
                                break block20;
                            } else {
                                throw throwable3;
                            }
                        }
                        n3 = throwable2 instanceof SQLiteException;
                        if (n3 == 0) {
                            throw throwable2;
                        }
                        if (string2 == null || (n3 = this.d) == 0) break block21;
                    }
                    context.deleteDatabase(string2);
                    try {
                        return this.c(bl2);
                    }
                    catch (fX0$b$a fX0$b$a) {
                        throw fX0$b$a.b;
                    }
                }
                throw throwable2;
            }
        }
    }

    public final void onConfigure(SQLiteDatabase object) {
        int n3;
        Object object2 = "db";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = this.e;
        Object object3 = this.c;
        if (n4 == 0 && (n4 = object3.a) != (n3 = object.getVersion())) {
            n4 = 1;
            object.setMaxSqlCacheSize(n4);
        }
        try {
            object = this.b((SQLiteDatabase)object);
        }
        catch (Throwable throwable) {
            object3 = fX0$b$b.ON_CONFIGURE;
            object2 = new fX0$b$a((fX0$b$b)((Object)object3), throwable);
            throw object2;
        }
        object3.b((ex0_1)object);
    }

    public final void onCreate(SQLiteDatabase object) {
        Object object2 = "sqLiteDatabase";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        try {
            object2 = this.c;
        }
        catch (Throwable throwable) {
            fX0$b$b fX0$b$b = fX0$b$b.ON_CREATE;
            object2 = new fX0$b$a(fX0$b$b, throwable);
            throw object2;
        }
        object = this.b((SQLiteDatabase)object);
        ((yg3$a)object2).c((ex0_1)object);
    }

    public final void onDowngrade(SQLiteDatabase object, int n3, int n4) {
        boolean bl2;
        Object object2 = "db";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        this.e = bl2 = true;
        try {
            object2 = this.c;
        }
        catch (Throwable throwable) {
            fX0$b$b fX0$b$b = fX0$b$b.ON_DOWNGRADE;
            fX0$b$a fX0$b$a = new fX0$b$a(fX0$b$b, throwable);
            throw fX0$b$a;
        }
        object = this.b((SQLiteDatabase)object);
        ((yg3$a)object2).d((ex0_1)object, n3, n4);
    }

    public final void onOpen(SQLiteDatabase object) {
        Object object2 = "db";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = this.e;
        if (!bl2) {
            try {
                object2 = this.c;
            }
            catch (Throwable throwable) {
                fX0$b$b fX0$b$b = fX0$b$b.ON_OPEN;
                object2 = new fX0$b$a(fX0$b$b, throwable);
                throw object2;
            }
            object = this.b((SQLiteDatabase)object);
            ((yg3$a)object2).e((ex0_1)object);
        }
        this.g = true;
    }

    public final void onUpgrade(SQLiteDatabase object, int n3, int n4) {
        boolean bl2;
        Object object2 = "sqLiteDatabase";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        this.e = bl2 = true;
        try {
            object2 = this.c;
        }
        catch (Throwable throwable) {
            fX0$b$b fX0$b$b = fX0$b$b.ON_UPGRADE;
            fX0$b$a fX0$b$a = new fX0$b$a(fX0$b$b, throwable);
            throw fX0$b$a;
        }
        object = this.b((SQLiteDatabase)object);
        ((yg3$a)object2).f((ex0_1)object, n3, n4);
    }
}

