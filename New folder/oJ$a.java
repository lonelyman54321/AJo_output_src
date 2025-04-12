/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.DatabaseUtils
 *  android.database.SQLException
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.util.SparseArray
 */
import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

public final class oJ$a
implements oJ$c {
    public static final String[] e = new String[]{"id", "key", "metadata"};
    public final Ai0 a;
    public final SparseArray b;
    public String c;
    public String d;

    public oJ$a(nb3_2 nb3_22) {
        this.a = nb3_22;
        this.b = nb3_22;
    }

    public final void a(nJ nJ3) {
        SparseArray sparseArray = this.b;
        int n3 = nJ3.a;
        sparseArray.put(n3, (Object)nJ3);
    }

    public final boolean b() {
        Object object;
        Ai0 ai0;
        try {
            ai0 = this.a;
        }
        catch (SQLException sQLException) {
            object = new IOException(sQLException);
            throw object;
        }
        ai0 = ai0.getReadableDatabase();
        object = this.c;
        object.getClass();
        boolean bl2 = true;
        int n3 = ob3_0.a((SQLiteDatabase)ai0, (String)object, (int)(bl2 ? 1 : 0));
        int n4 = -1;
        if (n3 == n4) {
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(HashMap var1_1) {
        block7: {
            block11: {
                block10: {
                    block9: {
                        block8: {
                            var1_1 = this.b;
                            var2_4 = var1_1.size();
                            if (var2_4 == 0) {
                                return;
                            }
                            try {
                                var3_5 = this.a;
                                var3_5 = var3_5.getWritableDatabase();
                                var3_5.beginTransactionNonExclusive();
                                var4_6 = 0;
                            }
                            catch (SQLException var1_3) {
                                break block7;
                            }
                            try lbl-1000:
                            // 2 sources

                            {
                                while (var4_6 < (var5_7 = var1_1.size())) {
                                    var6_8 = var1_1.valueAt(var4_6);
                                    if ((var6_8 = (nJ)var6_8) != null) break block8;
                                    var5_7 = var1_1.keyAt(var4_6);
                                    var7_9 = this.d;
                                    var7_9.getClass();
                                    var6_8 = Integer.toString(var5_7);
                                    var6_8 = new String[]{var6_8};
                                    var8_10 = "id = ?";
                                    var3_5.delete(var7_9, var8_10, var6_8);
                                    break block9;
                                }
                                break block10;
                            }
                            catch (Throwable var1_2) {
                                break block11;
                            }
                        }
                        this.h((SQLiteDatabase)var3_5, (nJ)var6_8);
                    }
                    ++var4_6;
                    ** GOTO lbl-1000
                }
                var3_5.setTransactionSuccessful();
                var1_1.clear();
                var3_5.endTransaction();
                return;
            }
            var3_5.endTransaction();
            throw var1_2;
        }
        var3_5 = new IOException(var1_3);
        throw var3_5;
    }

    public final void d(long l2) {
        String string2;
        this.c = string2 = Long.toHexString(l2);
        this.d = string2 = kp1_0.c("ExoPlayerCacheIndex", string2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void delete() {
        block12: {
            var1_1 = "ExoPlayerVersions";
            var2_5 = "ExoPlayerCacheIndex";
            var3_6 = this.a;
            var4_7 = this.c;
            var4_7.getClass();
            try {
                var2_5 = var2_5.concat((String)var4_7);
                var3_6 = var3_6.getWritableDatabase();
                var3_6.beginTransactionNonExclusive();
            }
            catch (SQLException var1_2) {
                break block12;
            }
            var5_8 = ob3_0.a;
            var5_8 = gz3.a;
            var6_9 /* !! */  = new String[]{var1_1};
            var7_10 = "sqlite_master";
            var8_11 = "tbl_name = ?";
            var9_12 = DatabaseUtils.queryNumEntries((SQLiteDatabase)var3_6, (String)var7_10, (String)var8_11, (String[])var6_9 /* !! */ );
            var11_13 = 0L;
            var13_14 = 1;
            var14_15 = var9_12 == var11_13 ? 0 : (var9_12 < var11_13 ? -1 : 1);
            if (var14_15 > 0) {
                var5_8 = 1;
            } else {
                var5_8 = 0;
                var6_9 /* !! */  = null;
            }
            if (var5_8 != 0) {
                var6_9 /* !! */  = "feature = ? AND instance_uid = ?";
                var7_10 = Integer.toString(var13_14);
                var4_7 = new String[]{var7_10, var4_7};
                var3_6.delete((String)var1_1, (String)var6_9 /* !! */ , var4_7);
            }
            var4_7 = "DROP TABLE IF EXISTS ";
            var1_1 = new StringBuilder((String)var4_7);
            var1_1.append((String)var2_5);
            ** GOTO lbl42
            {
                catch (Throwable var1_3) {
                    ** GOTO lbl-1000
                }
lbl42:
                // 1 sources

                var1_1 = var1_1.toString();
                var3_6.execSQL((String)var1_1);
                var3_6.setTransactionSuccessful();
                {
                    var3_6.endTransaction();
                    return;
                }
                catch (SQLException var1_4) {}
                {
                    var2_5 = new IOException(var1_4);
                    throw var2_5;
                }
            }
lbl-1000:
            // 1 sources

            {
                var3_6.endTransaction();
                throw var1_3;
            }
        }
        var2_5 = new IOException(var1_2);
        throw var2_5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(HashMap sparseArray) {
        SQLException sQLException2;
        Object object;
        block6: {
            Throwable throwable2;
            block7: {
                try {
                    object = this.a;
                    object = object.getWritableDatabase();
                    object.beginTransactionNonExclusive();
                }
                catch (SQLException sQLException2) {
                    break block6;
                }
                try {
                    boolean bl2;
                    this.i((SQLiteDatabase)object);
                    sparseArray = sparseArray.values();
                    sparseArray = sparseArray.iterator();
                    while (bl2 = sparseArray.hasNext()) {
                        Object object2 = sparseArray.next();
                        object2 = (nJ)object2;
                        this.h((SQLiteDatabase)object, (nJ)object2);
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                object.setTransactionSuccessful();
                sparseArray = this.b;
                sparseArray.clear();
                object.endTransaction();
                return;
            }
            object.endTransaction();
            throw throwable2;
        }
        object = new IOException(sQLException2);
        throw object;
    }

    public final void f(nJ nJ3, boolean bl2) {
        SparseArray sparseArray = this.b;
        int n3 = nJ3.a;
        if (bl2) {
            sparseArray.delete(n3);
        } else {
            bl2 = false;
            sparseArray.put(n3, null);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(HashMap var1_1, SparseArray var2_2) {
        block16: {
            var3_3 = this.a;
            var4_7 = this.b;
            var5_9 = var4_7.size();
            var6_10 = 1;
            if (var5_9 == 0) {
                var5_9 = 1;
            } else {
                var5_9 = 0;
                var4_7 = null;
            }
            ct3.f((boolean)var5_9);
            var4_7 = var3_3.getReadableDatabase();
            var7_11 = this.c;
            var7_11.getClass();
            var5_9 = ob3_0.a((SQLiteDatabase)var4_7, var7_11, var6_10);
            if (var5_9 != var6_10) {
                var4_7 = var3_3.getWritableDatabase();
                var4_7.beginTransactionNonExclusive();
            }
            ** GOTO lbl31
            {
                block18: {
                    catch (SQLiteException var3_4) {
                        break block16;
                    }
                    try {
                        this.i((SQLiteDatabase)var4_7);
                        var4_7.setTransactionSuccessful();
                    }
                    finally {
                        var4_7.endTransaction();
                    }
                    var7_11 = var3_3.getReadableDatabase();
                    var8_12 = this.d;
                    var8_12.getClass();
                    var9_13 /* !! */  = oJ$a.e;
                    var3_3 = var7_11.query((String)var8_12, var9_13 /* !! */ , null, null, null, null, null);
                    try {
                        while ((var5_9 = (int)var3_3.moveToNext()) != 0) {
                            var5_9 = var3_3.getInt(0);
                            var7_11 = var3_3.getString(var6_10);
                            var7_11.getClass();
                            var10_14 = 2;
                            var8_12 = var3_3.getBlob(var10_14);
                            var9_13 /* !! */  = new ByteArrayInputStream((byte[])var8_12);
                            var8_12 = new DataInputStream((InputStream)var9_13 /* !! */ );
                            var8_12 = oJ.a((DataInputStream)var8_12);
                            var9_13 /* !! */  = new nJ(var5_9, var7_11, (zl0_0)var8_12);
                            var1_1.put(var7_11, var9_13 /* !! */ );
                            var2_2.put(var5_9, (Object)var7_11);
                        }
                    }
                    catch (Throwable var4_8) {
                        break block18;
                    }
                    {
                        var3_3.close();
                        return;
                    }
                }
                if (var3_3 == null) throw var4_8;
                try {
                    var3_3.close();
                    throw var4_8;
                }
                catch (Throwable var3_6) {}
                {
                    var4_8.addSuppressed(var3_6);
                    throw var4_8;
                }
            }
        }
        var1_1.clear();
        var2_2.clear();
        var1_1 = new IOException(var3_4);
        throw var1_1;
    }

    public final void h(SQLiteDatabase sQLiteDatabase, nJ object) {
        Object object2 = new ByteArrayOutputStream();
        zl0_0 zl0_02 = ((nJ)object).e;
        Object object3 = new DataOutputStream((OutputStream)object2);
        oJ.b(zl0_02, (DataOutputStream)object3);
        object2 = ((ByteArrayOutputStream)object2).toByteArray();
        zl0_02 = new ContentValues();
        object3 = ((nJ)object).a;
        zl0_02.put("id", (Integer)object3);
        object = ((nJ)object).b;
        zl0_02.put("key", (String)object);
        zl0_02.put("metadata", (byte[])object2);
        object = this.d;
        object.getClass();
        sQLiteDatabase.replaceOrThrow((String)object, null, (ContentValues)zl0_02);
    }

    public final void i(SQLiteDatabase sQLiteDatabase) {
        CharSequence charSequence = this.c;
        charSequence.getClass();
        ob3_0.b(sQLiteDatabase, (String)charSequence, 1);
        charSequence = this.d;
        charSequence.getClass();
        charSequence = "DROP TABLE IF EXISTS ".concat((String)charSequence);
        sQLiteDatabase.execSQL((String)charSequence);
        charSequence = new StringBuilder("CREATE TABLE ");
        String string2 = this.d;
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(" (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        charSequence = ((StringBuilder)charSequence).toString();
        sQLiteDatabase.execSQL((String)charSequence);
    }
}

