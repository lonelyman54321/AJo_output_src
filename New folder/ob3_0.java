/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.SQLException
 *  android.database.sqlite.SQLiteDatabase
 */
import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.io.IOException;

/*
 * Renamed from oB3
 */
public final class ob3_0 {
    public static final /* synthetic */ int a;

    static {
        im1_0.a("media3.database");
    }

    /*
     * Exception decompiling
     */
    public static int a(SQLiteDatabase var0, String var1_3, int var2_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [11 : 176->182)] android.database.SQLException
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

    public static void b(SQLiteDatabase sQLiteDatabase, String object, int n3) {
        String string2 = "CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))";
        try {
            sQLiteDatabase.execSQL(string2);
        }
        catch (SQLException sQLException) {
            object = new IOException(sQLException);
            throw object;
        }
        string2 = new ContentValues();
        String string3 = "feature";
        Object object2 = n3;
        string2.put(string3, (Integer)object2);
        object2 = "instance_uid";
        string2.put((String)object2, (String)object);
        object = "version";
        n3 = 1;
        object2 = n3;
        string2.put((String)object, (Integer)object2);
        object = "ExoPlayerVersions";
        n3 = 0;
        object2 = null;
        sQLiteDatabase.replaceOrThrow((String)object, null, (ContentValues)string2);
    }
}

