/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.sqlite.SQLiteException
 *  org.json.JSONObject
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from Mh0
 */
public final class mh0_0 {
    public volatile ax3_0 a;
    public final b b;
    public final zi0_1 c;
    public boolean d;

    public mh0_0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        zi0_1 zi0_12;
        CharSequence charSequence;
        b b2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cleverTapInstanceConfig, "config");
        this.b = b2 = cleverTapInstanceConfig.b();
        boolean bl2 = cleverTapInstanceConfig.p;
        if (bl2) {
            charSequence = "clevertap";
        } else {
            super("clevertap_");
            String string2 = cleverTapInstanceConfig.a;
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        Intrinsics.checkNotNullExpressionValue(b2, "logger");
        this.c = zi0_12 = new zi0_1(context, cleverTapInstanceConfig, (String)charSequence, b2);
        this.d = true;
    }

    public final void a(ci3_1 object, long l2) {
        String string2 = "created_at <= ";
        long l3 = System.currentTimeMillis() - l2;
        int n3 = 1000;
        l2 = n3;
        l3 /= l2;
        object = ((ci3_1)((Object)object)).getTableName();
        zi0_1 zi0_12 = this.c;
        zi0_12 = zi0_12.getWritableDatabase();
        CharSequence charSequence = new StringBuilder(string2);
        charSequence.append(l3);
        charSequence = charSequence.toString();
        string2 = null;
        try {
            zi0_12.delete((String)object, (String)charSequence, null);
        }
        catch (SQLiteException sQLiteException) {
            object = this.b;
            object.getClass();
            com.clevertap.android.sdk.b.n();
            this.e();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            ci3_1 ci3_12 = ci3_1.PUSH_NOTIFICATIONS;
            long l2 = 0L;
            this.a(ci3_12, l2);
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void c(String var1_1, ci3_1 var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [11 : 63->67)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(ci3_1 ci3_12) {
        synchronized (this) {
            String string2 = "table";
            Intrinsics.checkNotNullParameter((Object)ci3_12, string2);
            long l2 = 432000000L;
            this.a(ci3_12, l2);
            return;
        }
    }

    public final void e() {
        Object object = this.c;
        object.close();
        File file = ((zi0_1)((Object)object)).d;
        boolean bl2 = file.delete();
        if (!bl2) {
            object = ((zi0_1)((Object)object)).c;
            object.getClass();
            com.clevertap.android.sdk.b.e();
        }
    }

    /*
     * Exception decompiling
     */
    public final JSONObject f(ci3_1 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [17, 16 : 150->153)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String g(String string2) {
        Object object;
        b b2;
        block8: {
            b2 = this.b;
            String string3 = ci3_1.PUSH_NOTIFICATIONS.getTableName();
            object = "";
            Object object2 = this.c;
            object2 = object2.getReadableDatabase();
            String string4 = "data =?";
            String[] stringArray = new String[]{string2};
            string2 = object2.query(string3, null, string4, stringArray, null, null, null);
            if (string2 == null) return object;
            {
                Throwable throwable2222222;
                block10: {
                    int n3;
                    block9: {
                        catch (Exception exception) {
                            break block8;
                        }
                        try {
                            n3 = string2.moveToFirst();
                            if (n3 == 0) break block9;
                            object2 = "data";
                            n3 = string2.getColumnIndexOrThrow((String)object2);
                            object2 = string2.getString(n3);
                            string3 = "cursor.getString(cursor.\u2026ndexOrThrow(Column.DATA))";
                            Intrinsics.checkNotNullExpressionValue(object2, string3);
                            object = object2;
                        }
                        catch (Throwable throwable2222222) {
                            break block10;
                        }
                    }
                    b2.a();
                    object2 = Unit.a;
                    n3 = 0;
                    object2 = null;
                    {
                        xj3_1.b((Closeable)((Object)string2), null);
                        return object;
                    }
                }
                try {
                    throw throwable2222222;
                }
                catch (Throwable throwable3) {}
                {
                    xj3_1.b((Closeable)((Object)string2), throwable2222222);
                    throw throwable3;
                }
            }
        }
        b2.getClass();
        com.clevertap.android.sdk.b.n();
        return object;
    }

    /*
     * Exception decompiling
     */
    public final JSONObject h(String var1_1, String var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 12[TRYBLOCK] [18, 17 : 162->169)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList i(String object) {
        synchronized (this) {
            Object object2;
            block14: {
                Throwable throwable222;
                block15: {
                    object2 = "userId";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    object2 = ci3_1.INBOX_MESSAGES;
                    Object object3 = ((ci3_1)((Object)object2)).getTableName();
                    object2 = new ArrayList();
                    Object object4 = this.c;
                    object4 = object4.getReadableDatabase();
                    String string2 = "messageUser = ?";
                    String[] stringArray = new String[]{object};
                    String string3 = "created_at DESC";
                    int n3 = 0;
                    Object object5 = null;
                    object = object4.query((String)object3, null, string2, stringArray, null, null, string3);
                    if (object == null) break block14;
                    try {
                        boolean bl2;
                        while (bl2 = object.moveToNext()) {
                            long l2;
                            object4 = new ui_2();
                            object3 = "_id";
                            int n4 = object.getColumnIndexOrThrow((String)object3);
                            object3 = object.getString(n4);
                            ((ui_2)object4).d = object3;
                            object5 = "data";
                            n3 = object.getColumnIndexOrThrow((String)object5);
                            object5 = object.getString(n3);
                            object3 = new JSONObject((String)object5);
                            ((ui_2)object4).e = object3;
                            object5 = "wzrkParams";
                            n3 = object.getColumnIndexOrThrow((String)object5);
                            object5 = object.getString(n3);
                            object3 = new JSONObject((String)object5);
                            ((ui_2)object4).i = object3;
                            object3 = "created_at";
                            n4 = object.getColumnIndexOrThrow((String)object3);
                            ((ui_2)object4).b = l2 = object.getLong(n4);
                            object3 = "expires";
                            n4 = object.getColumnIndexOrThrow((String)object3);
                            ((ui_2)object4).c = l2 = object.getLong(n4);
                            object3 = "isRead";
                            n4 = object.getColumnIndexOrThrow((String)object3);
                            if ((n4 = object.getInt(n4)) != (n3 = 1)) {
                                n3 = 0;
                                object5 = null;
                            }
                            ((ui_2)object4).f = n3;
                            object3 = "messageUser";
                            n4 = object.getColumnIndexOrThrow((String)object3);
                            object3 = object.getString(n4);
                            ((ui_2)object4).h = object3;
                            object3 = "tags";
                            n4 = object.getColumnIndexOrThrow((String)object3);
                            object3 = object.getString(n4);
                            object5 = ",";
                            object3 = object3.split((String)object5);
                            object5 = ((ui_2)object4).g;
                            object3 = Arrays.asList(object3);
                            object5.addAll(object3);
                            object3 = "campaignId";
                            n4 = object.getColumnIndexOrThrow((String)object3);
                            ((ui_2)object4).a = object3 = object.getString(n4);
                            ((ArrayList)object2).add(object4);
                        }
                        object4 = Unit.a;
                        bl2 = false;
                        object4 = null;
                    }
                    catch (Throwable throwable222) {
                        break block15;
                    }
                    xj3_1.b((Closeable)object, null);
                    break block14;
                }
                try {
                    throw throwable222;
                }
                catch (Throwable throwable3) {
                    try {
                        xj3_1.b((Closeable)object, throwable222);
                        throw throwable3;
                    }
                    catch (Throwable throwable4) {}
                    throw throwable4;
                    catch (Exception exception) {}
                }
                object = this.b;
                object.getClass();
                com.clevertap.android.sdk.b.n();
            }
            return object2;
        }
    }

    /*
     * Exception decompiling
     */
    public final void j(ci3_1 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [8 : 41->45)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long k(JSONObject object, ci3_1 object2) {
        String string2 = "SELECT COUNT(*) FROM ";
        synchronized (this) {
            Throwable throwable2;
            block8: {
                Object object3 = "obj";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object3 = "table";
                Intrinsics.checkNotNullParameter(object2 /* !! */ , (String)object3);
                object3 = this.c;
                boolean bl2 = ((zi0_1)((Object)object3)).a();
                if (!bl2) {
                    object = this.b;
                    ((b)object).a();
                    return -2;
                }
                {
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    object2 /* !! */  = object2 /* !! */ .getTableName();
                    object3 = new ContentValues();
                    Object object4 = "data";
                    object = object.toString();
                    object3.put((String)object4, (String)object);
                    object = "created_at";
                    long l2 = System.currentTimeMillis();
                    object4 = l2;
                    object3.put((String)object, (Long)object4);
                    try {
                        object = this.c;
                        object = object.getWritableDatabase();
                        object4 = null;
                        object.insert((String)object2 /* !! */ , null, (ContentValues)object3);
                        object = new StringBuilder(string2);
                        ((StringBuilder)object).append((String)object2 /* !! */ );
                        object = ((StringBuilder)object).toString();
                        object2 /* !! */  = this.c;
                        object2 /* !! */  = object2 /* !! */ .getWritableDatabase();
                        object = object2 /* !! */ .compileStatement((String)object);
                        return object.simpleQueryForLong();
                    }
                    catch (SQLiteException sQLiteException) {}
                    {
                        object = this.b;
                        ((b)object).a();
                        this.e();
                    }
                    return -1;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Exception decompiling
     */
    public final void l() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 32->35)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public final long m(String var1_1, String var2_3, JSONObject var3_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 65->68)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(String[] var1_1) {
        synchronized (this) {
            block12: {
                var2_3 /* !! */  = "ids";
                Intrinsics.checkNotNullParameter(var1_1, var2_3 /* !! */ );
                var3_4 = ((String[])var1_1).length;
                if (var3_4 == 0) {
                }
                ** GOTO lbl12
                {
                    catch (Throwable var1_2) {
                        break block12;
                    }
                    return;
lbl12:
                    // 1 sources

                    var2_3 /* !! */  = this.c;
                    var3_4 = (int)var2_3 /* !! */ .a();
                    if (var3_4 == 0) {
                        var1_1 = this.b;
                        var1_1.a();
                        return;
                    }
                    var2_3 /* !! */  = ci3_1.PUSH_NOTIFICATIONS;
                    var2_3 /* !! */  = var2_3 /* !! */ .getTableName();
                    var4_5 = new ContentValues();
                    var5_6 = "isRead";
                    var6_7 = 1;
                    var7_8 = var6_7;
                    var4_5.put(var5_6, (Integer)var7_8);
                    var8_9 = ((Object)var1_1).length;
                    var7_8 = new Comparable<Integer>();
                    if (var8_9 > 0) {
                        var9_10 = "?";
                        var7_8.append(var9_10);
                        var8_9 -= var6_7;
                        var10_11 /* !! */  = null;
                        for (var6_7 = 0; var6_7 < var8_9; ++var6_7) {
                            var9_10 = ", ?";
                            var7_8.append(var9_10);
                        }
                    }
                    var5_6 = var7_8.toString();
                    var10_11 /* !! */  = "StringBuilder().apply(builderAction).toString()";
                    Intrinsics.checkNotNullExpressionValue(var5_6, var10_11 /* !! */ );
                    try {
                        var10_11 /* !! */  = this.c;
                        var10_11 /* !! */  = var10_11 /* !! */ .getWritableDatabase();
                        var7_8 = new Comparable<Integer>();
                        var9_10 = "data IN (";
                        var7_8.append(var9_10);
                        var7_8.append(var5_6);
                        var8_9 = 41;
                        var7_8.append((char)var8_9);
                        var5_6 = var7_8.toString();
                        var10_11 /* !! */ .update(var2_3 /* !! */ , var4_5, var5_6, (String[])var1_1);
                        this.d = false;
                        ** GOTO lbl62
                    }
                    catch (SQLiteException v0) {}
                    {
                        var1_1 = this.b;
                        var1_1.a();
                        this.e();
lbl62:
                        // 2 sources

                        return;
                    }
                }
            }
            throw var1_2;
        }
    }

    /*
     * Exception decompiling
     */
    public final void o(ArrayList var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [5 : 41->45)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final ax3_0 p() {
        ax3_0 ax3_02;
        block10: {
            ax3_02 = this.a;
            if (ax3_02 != null) break block10;
            synchronized (this) {
                Throwable throwable2;
                block11: {
                    block9: {
                        try {
                            ax3_02 = this.a;
                            if (ax3_02 != null) break block9;
                        }
                        catch (Throwable throwable2) {}
                        zi0_1 zi0_12 = this.c;
                        b b2 = this.b;
                        Object object = "logger";
                        Intrinsics.checkNotNullExpressionValue(b2, object);
                        object = ci3_1.USER_EVENT_LOGS_TABLE;
                        ax3_02 = new ax3_0(zi0_12, b2, (ci3_1)((Object)object));
                        this.a = ax3_02;
                        break block11;
                    }
                    break block10;
                }
                throw throwable2;
            }
        }
        return ax3_02;
    }
}

