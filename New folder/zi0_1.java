/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteOpenHelper
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.io.Closeable;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from zi0
 */
public final class zi0_1
extends SQLiteOpenHelper {
    public final Context a;
    public final CleverTapInstanceConfig b;
    public final b c;
    public final File d;

    public zi0_1(Context object, CleverTapInstanceConfig cleverTapInstanceConfig, String string2, b b2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(cleverTapInstanceConfig, "config");
        Intrinsics.checkNotNullParameter(b2, "logger");
        super(object, string2, null, 5);
        this.a = object;
        this.b = cleverTapInstanceConfig;
        this.c = b2;
        object = object.getDatabasePath(string2);
        Intrinsics.checkNotNullExpressionValue(object, "context.getDatabasePath(dbName)");
        this.d = object;
    }

    public final boolean a() {
        File file = this.d;
        boolean bl2 = file.exists();
        boolean bl3 = true;
        if (bl2) {
            long l2;
            long l3 = file.getUsableSpace();
            long l4 = 0x1400000L;
            long l7 = (l3 = Math.max(l3, l4)) - (l2 = file.length());
            Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object < 0) {
                bl3 = false;
            }
        }
        return bl3;
    }

    public final void b(SQLiteDatabase sQLiteDatabase, String string2) {
        sQLiteDatabase = sQLiteDatabase.compileStatement(string2);
        this.c.a();
        sQLiteDatabase.execute();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String c(String var1_1) {
        block7: {
            block6: {
                var2_2 = "$add";
                var3_3 = "$set";
                var4_4 = "$D_";
                try {
                    var5_5 = new JSONObject((String)var1_1);
                    var6_6 = var5_5.keys();
lbl7:
                    // 5 sources

                    while (var7_7 = var6_6.hasNext()) {
                        var8_8 /* !! */  = var6_6.next();
                        break block6;
                    }
                    ** GOTO lbl54
                }
                catch (JSONException v0) {
                    var2_2 = this.c;
                    var2_2.getClass();
                    com.clevertap.android.sdk.b.n();
                    return var1_1;
                }
            }
            var9_9 = var5_5.get(var8_8 /* !! */  = (String)var8_8 /* !! */ );
            var10_10 = var9_9 instanceof String;
            if (var10_10) {
                var11_11 = var9_9;
                {
                    var11_11 = (String)var9_9;
                    var12_12 = null;
                    var10_10 = kotlin.text.b.s((String)var11_11, var4_4, false);
                    if (!var10_10) break block7;
                    var9_9 = (String)var9_9;
                    var9_9 = StringsKt.U((String)var9_9, var4_4);
                    var13_13 = Long.parseLong((String)var9_9);
                    var12_12 = var13_13;
                    var5_5.put(var8_8 /* !! */ , var13_13);
                    var9_9 = var12_12;
                }
            }
        }
        if (!(var10_10 = var9_9 instanceof JSONObject)) ** GOTO lbl7
        var11_11 = var9_9;
        {
            block8: {
                var11_11 = (JSONObject)var9_9;
                var10_10 = var11_11.has(var3_3);
                if (!var10_10) break block8;
                var9_9 = (JSONObject)var9_9;
                var9_9 = var9_9.getJSONArray(var3_3);
                var5_5.put(var8_8 /* !! */ , var9_9);
                ** GOTO lbl7
            }
            var11_11 = var9_9;
            var11_11 = (JSONObject)var9_9;
            var10_10 = var11_11.has((String)var2_2);
            if (!var10_10) ** GOTO lbl7
            var9_9 = (JSONObject)var9_9;
            var9_9 = var9_9.getJSONArray((String)var2_2);
            var5_5.put(var8_8 /* !! */ , var9_9);
            ** GOTO lbl7
lbl54:
            // 1 sources

            var2_2 = var5_5.toString();
            var3_3 = "{\n            val jsonOb\u2026ject.toString()\n        }";
            Intrinsics.checkNotNullExpressionValue(var2_2, var3_3);
            return var2_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(SQLiteDatabase sQLiteDatabase) {
        Throwable throwable2;
        Object object;
        block6: {
            Object object2;
            block5: {
                object2 = "', '";
                String string2 = "INSERT INTO temp_";
                object = je0_1.r;
                this.b(sQLiteDatabase, (String)object);
                object = this.b;
                Object object3 = ((CleverTapInstanceConfig)object).a;
                Intrinsics.checkNotNullExpressionValue(object3, "config.accountId");
                CharSequence charSequence = new StringBuilder("deviceId:");
                charSequence.append((String)object3);
                charSequence = charSequence.toString();
                object3 = kp1_0.c("fallbackId:", (String)object3);
                Object object4 = this.a;
                Object object5 = gc3_0.g(object4, (String)charSequence, null);
                if (object5 == null) {
                    boolean bl2 = ((CleverTapInstanceConfig)object).p;
                    object = bl2 ? gc3_0.g(object4, (String)charSequence, null) : gc3_0.g(object4, (String)object3, "");
                    object5 = object;
                    object = "if (config.isDefaultInst\u2026context, fallbackKey, \"\")";
                    Intrinsics.checkNotNullExpressionValue(object5, (String)object);
                }
                object = new StringBuilder("SELECT _id, data FROM ");
                object3 = ci3_1.USER_PROFILES;
                charSequence = ((ci3_1)((Object)object3)).getTableName();
                ((StringBuilder)object).append((String)charSequence);
                int n3 = 59;
                ((StringBuilder)object).append((char)n3);
                object = ((StringBuilder)object).toString();
                object = sQLiteDatabase.rawQuery((String)object, null);
                try {
                    n3 = (int)(object.moveToFirst() ? 1 : 0);
                    if (n3 == 0) break block5;
                    charSequence = "_id";
                    n3 = object.getColumnIndexOrThrow((String)charSequence);
                    charSequence = object.getString(n3);
                    object4 = "data";
                    int n4 = object.getColumnIndexOrThrow((String)object4);
                    object4 = object.getString(n4);
                    CharSequence charSequence2 = "dataString";
                    Intrinsics.checkNotNullExpressionValue(object4, (String)charSequence2);
                    object4 = this.c((String)object4);
                    charSequence2 = new StringBuilder(string2);
                    string2 = ((ci3_1)((Object)object3)).getTableName();
                    ((StringBuilder)charSequence2).append(string2);
                    string2 = " (_id, deviceID, data)\n                                 VALUES ('";
                    ((StringBuilder)charSequence2).append(string2);
                    ((StringBuilder)charSequence2).append((String)charSequence);
                    ((StringBuilder)charSequence2).append((String)object2);
                    ((StringBuilder)charSequence2).append((String)object5);
                    ((StringBuilder)charSequence2).append((String)object2);
                    ((StringBuilder)charSequence2).append((String)object4);
                    object2 = "');";
                    ((StringBuilder)charSequence2).append((String)object2);
                    object2 = ((StringBuilder)charSequence2).toString();
                    this.b(sQLiteDatabase, (String)object2);
                }
                catch (Throwable throwable2) {
                    break block6;
                }
            }
            object2 = Unit.a;
            xj3_1.b((Closeable)object, null);
            object2 = je0_1.s;
            this.b(sQLiteDatabase, (String)object2);
            object2 = je0_1.t;
            this.b(sQLiteDatabase, (String)object2);
            return;
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            xj3_1.b((Closeable)object, throwable2);
            throw throwable3;
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "db");
        this.c.a();
        String string2 = je0_1.a;
        this.b(sQLiteDatabase, string2);
        string2 = je0_1.b;
        this.b(sQLiteDatabase, string2);
        string2 = je0_1.c;
        this.b(sQLiteDatabase, string2);
        string2 = je0_1.q;
        this.b(sQLiteDatabase, string2);
        string2 = je0_1.d;
        this.b(sQLiteDatabase, string2);
        string2 = je0_1.h;
        this.b(sQLiteDatabase, string2);
        string2 = je0_1.j;
        this.b(sQLiteDatabase, string2);
        string2 = je0_1.l;
        this.b(sQLiteDatabase, string2);
        string2 = je0_1.f;
        this.b(sQLiteDatabase, string2);
        string2 = je0_1.g;
        this.b(sQLiteDatabase, string2);
        string2 = je0_1.k;
        this.b(sQLiteDatabase, string2);
        string2 = je0_1.i;
        this.b(sQLiteDatabase, string2);
        string2 = je0_1.e;
        this.b(sQLiteDatabase, string2);
        string2 = je0_1.m;
        this.b(sQLiteDatabase, string2);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int n3, int n4) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "db");
        Object object = this.c;
        ((b)object).a();
        n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 == n4) {
                    this.d(sQLiteDatabase);
                }
            } else {
                object = je0_1.p;
                this.b(sQLiteDatabase, (String)object);
                object = je0_1.l;
                this.b(sQLiteDatabase, (String)object);
                object = je0_1.m;
                this.b(sQLiteDatabase, (String)object);
                this.d(sQLiteDatabase);
            }
        } else {
            object = je0_1.n;
            this.b(sQLiteDatabase, (String)object);
            object = je0_1.o;
            this.b(sQLiteDatabase, (String)object);
            object = je0_1.p;
            this.b(sQLiteDatabase, (String)object);
            object = je0_1.d;
            this.b(sQLiteDatabase, (String)object);
            object = je0_1.h;
            this.b(sQLiteDatabase, (String)object);
            object = je0_1.j;
            this.b(sQLiteDatabase, (String)object);
            object = je0_1.l;
            this.b(sQLiteDatabase, (String)object);
            object = je0_1.k;
            this.b(sQLiteDatabase, (String)object);
            object = je0_1.i;
            this.b(sQLiteDatabase, (String)object);
            object = je0_1.e;
            this.b(sQLiteDatabase, (String)object);
            object = je0_1.m;
            this.b(sQLiteDatabase, (String)object);
            this.d(sQLiteDatabase);
        }
        n4 = 5;
        if (n3 < n4) {
            String string2 = je0_1.b;
            this.b(sQLiteDatabase, string2);
        }
    }
}

