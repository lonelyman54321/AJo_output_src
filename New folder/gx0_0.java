/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.DatabaseErrorHandler
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.util.Pair
 */
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import java.io.IOException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gX0
 */
public final class gx0_0
implements DatabaseErrorHandler {
    public final /* synthetic */ yg3$a a;
    public final /* synthetic */ fX0$a b;

    public /* synthetic */ gx0_0(yg3$a yg3$a, fX0$a fX0$a) {
        this.a = yg3$a;
        this.b = fX0$a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCorruption(SQLiteDatabase object) {
        boolean bl2;
        Object object4 = this.a;
        Intrinsics.checkNotNullParameter(object4, "$callback");
        Object object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "$dbRef");
        int n3 = fX0$b.h;
        Object object2 = "dbObj";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = fX0$b$c.a((fX0$a)object3, (SQLiteDatabase)object);
        object4.getClass();
        object4 = "p.second";
        Intrinsics.checkNotNullParameter(object, "db");
        Objects.toString(object);
        object3 = ((ex0_1)object).a;
        n3 = (int)(object3.isOpen() ? 1 : 0);
        if (n3 == 0) {
            object = object3.getPath();
            if (object == null) return;
            yg3$a.a((String)object);
            return;
        }
        n3 = 0;
        object2 = null;
        try {
            try {
                object2 = object3.getAttachedDbs();
            }
            catch (SQLiteException sQLiteException) {}
            try {
                ((ex0_1)object).close();
            }
            catch (IOException iOException) {}
        }
        catch (Throwable throwable) {
            if (object2 == null) {
                object4 = object3.getPath();
                if (object4 == null) throw throwable;
                yg3$a.a((String)object4);
                throw throwable;
            }
            object2 = (Iterable)object2;
            object3 = object2.iterator();
            while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object2 = ((Pair)object3.next()).second;
                Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                object2 = (String)object2;
                yg3$a.a((String)object2);
            }
            throw throwable;
        }
        if (object2 == null) {
            object = object3.getPath();
            if (object == null) return;
            yg3$a.a((String)object);
            return;
        }
        object2 = (Iterable)object2;
        object = object2.iterator();
        while (bl2 = object.hasNext()) {
            object3 = ((Pair)object.next()).second;
            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
            object3 = (String)object3;
            yg3$a.a((String)object3);
        }
    }
}

