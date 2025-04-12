/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.Context;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

public final class Se3 {
    public static final Object a;

    static {
        Object object;
        a = object = new Object();
    }

    public static final boolean a(int n3, int n4) {
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    /*
     * Exception decompiling
     */
    public static void b(Context var0, String var1_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [4, 3 : 42->46)] java.lang.Throwable
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
    public static String c(Context var0) {
        var1_3 = Se3.a;
        synchronized (var1_3) {
            block21: {
                var2_4 = "";
                var3_5 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";
                var3_5 = var0.openFileInput((String)var3_5);
                var4_6 = Xml.newPullParser();
                var5_7 = "UTF-8";
                var4_6.setInput((InputStream)var3_5, var5_7);
                var6_8 = var4_6.getDepth();
                ** while ((var7_9 = var4_6.next()) != (var8_10 = 1) && (var7_9 != (var8_10 = 3) || (var9_11 = var4_6.getDepth()) > var6_8))
lbl-1000:
                // 1 sources

                {
                    if (var7_9 == var8_10 || var7_9 == (var8_10 = 4)) continue;
                    try {
                        var10_12 = var4_6.getName();
                        var7_9 = (int)var10_12.equals(var11_13 = "locales");
                        if (var7_9 == 0) continue;
                        var5_7 = "application_locales";
                        var7_9 = 0;
                        var10_12 = null;
                        var2_4 = var4_6.getAttributeValue(null, var5_7);
                        break;
                    }
                    catch (Throwable var0_1) {
                        ** GOTO lbl-1000
                    }
                    catch (IOException | XmlPullParserException v0) {
                        ** GOTO lbl33
                    }
                }
lbl27:
                // 2 sources

                if (var3_5 == null) ** GOTO lbl39
                ** GOTO lbl34
lbl-1000:
                // 1 sources

                {
                    block20: {
                        if (var3_5 == null) throw var0_1;
                        var3_5.close();
                        throw var0_1;
lbl33:
                        // 1 sources

                        if (var3_5 == null) break block20;
lbl34:
                        // 2 sources

                        ** try [egrp 3[TRYBLOCK] [27 : 174->195)] { 
lbl35:
                        // 1 sources

                        try {
                            var3_5.close();
                        }
                        catch (IOException v1) {}
                    }
                    var12_14 = var2_4.isEmpty();
                    if (var12_14) {
                        var3_5 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";
                        var0.deleteFile((String)var3_5);
                    }
                    return var2_4;
                }
lbl-1000:
                // 3 sources

                {
                    catch (Throwable var0_2) {
                        break block21;
                    }
                }
                {
                    catch (IOException v2) {
                        throw var0_1;
                    }
                }
                {
                    catch (FileNotFoundException v3) {}
                    return var2_4;
                }
            }
            throw var0_2;
        }
    }
}

