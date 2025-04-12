/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.AbstractWindowedCursor
 *  android.database.Cursor
 *  android.database.MatrixCursor
 *  android.os.Build$VERSION
 */
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import java.io.Closeable;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class Oh0 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(xg3_1 xg3_12) {
        Throwable throwable2;
        Object object;
        block7: {
            Object object2;
            boolean bl2;
            Intrinsics.checkNotNullParameter(xg3_12, "db");
            Object object3 = new vu1_2();
            object = xg3_12.r0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
            try {
                while (bl2 = object.moveToNext()) {
                    object2 = object.getString(0);
                    ((vu1_2)object3).add(object2);
                }
            }
            catch (Throwable throwable2) {
                break block7;
            }
            object2 = Unit.a;
            bl2 = false;
            object2 = null;
            xj3_1.b((Closeable)object, null);
            object3 = a.a((vu1_2)object3).listIterator(0);
            while (true) {
                object = object3;
                object = (vu1$a_0)object3;
                bl2 = ((vu1$a_0)object).hasNext();
                if (!bl2) {
                    return;
                }
                object = (String)((vu1$a_0)object).next();
                Intrinsics.checkNotNullExpressionValue(object, "triggerName");
                object2 = "room_fts_content_sync_";
                bl2 = b.s((String)object, (String)object2, false);
                if (!bl2) continue;
                object2 = "DROP TRIGGER IF EXISTS ";
                object = ((String)object2).concat((String)object);
                xg3_12.o((String)object);
            }
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            xj3_1.b((Closeable)object, throwable2);
            throw throwable3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Cursor b(FP2 fP2, ag3_0 object, boolean n3) {
        Object[] objectArray;
        int n4;
        int n7;
        block15: {
            int n8;
            Intrinsics.checkNotNullParameter(fP2, "db");
            Intrinsics.checkNotNullParameter(object, "sqLiteQuery");
            fP2 = fP2.query((ag3_0)object, null);
            if (n3 != 0 && (n8 = fP2 instanceof AbstractWindowedCursor) != 0) {
                object = fP2;
                object = (AbstractWindowedCursor)fP2;
                n3 = object.getCount();
                n7 = object.hasWindow();
                if (n7 != 0) {
                    object = object.getWindow();
                    n8 = object.getNumRows();
                } else {
                    n8 = n3;
                }
                n7 = Build.VERSION.SDK_INT;
                n4 = 23;
                if (n7 < n4 || n8 < n3) {
                    object = "c";
                    Intrinsics.checkNotNullParameter(fP2, (String)object);
                    try {
                        objectArray = ((Cursor)fP2).getColumnNames();
                        n7 = ((Cursor)fP2).getCount();
                        object = new MatrixCursor((String[])objectArray, n7);
                        break block15;
                    }
                    catch (Throwable throwable) {}
                    try {
                        throw throwable;
                    }
                    catch (Throwable throwable) {
                        xj3_1.b((Closeable)((Object)fP2), throwable);
                        throw throwable;
                    }
                }
            }
            return (Cursor)fP2;
        }
        while ((n3 = (int)(((Cursor)fP2).moveToNext() ? 1 : 0)) != 0) {
            n3 = ((Cursor)fP2).getColumnCount();
            objectArray = new Object[n3];
            n7 = ((Cursor)fP2).getColumnCount();
            for (n4 = 0; n4 < n7; ++n4) {
                int n10 = ((Cursor)fP2).getType(n4);
                if (n10 != 0) {
                    Object object2;
                    int n14 = 1;
                    if (n10 != n14) {
                        n14 = 2;
                        if (n10 != n14) {
                            n14 = 3;
                            if (n10 != n14) {
                                n14 = 4;
                                if (n10 != n14) {
                                    object = new IllegalStateException();
                                    throw object;
                                }
                                objectArray[n4] = object2 = (Object)((Cursor)fP2).getBlob(n4);
                                continue;
                            }
                            objectArray[n4] = object2 = ((Cursor)fP2).getString(n4);
                            continue;
                        }
                        double d2 = ((Cursor)fP2).getDouble(n4);
                        objectArray[n4] = object2 = Double.valueOf(d2);
                        continue;
                    }
                    long l2 = ((Cursor)fP2).getLong(n4);
                    objectArray[n4] = object2 = Long.valueOf(l2);
                    continue;
                }
                objectArray[n4] = null;
            }
            object.addRow(objectArray);
        }
        xj3_1.b((Closeable)((Object)fP2), null);
        return object;
    }
}

