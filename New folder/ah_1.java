/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.webkit.WebView
 */
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.webkit.WebView;
import com.jpl.crasdk.a;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from AH
 */
public final class ah_1 {
    public Activity a;
    public WebView b;

    public static void a(Intent object, Activity object2) {
        block13: {
            if (object2 != null) {
                boolean bl2;
                Object object3 = object2.getPackageManager();
                int n3 = 0;
                String string2 = null;
                object3 = object3 != null ? object3.queryIntentActivities(object, 0) : null;
                Object object4 = object3;
                object4 = (Collection)object3;
                String string3 = "com.android.chrome";
                String string4 = "";
                if (object4 != null && !(bl2 = object4.isEmpty())) {
                    Intrinsics.checkNotNull(object3);
                    object3 = object3.iterator();
                    while (bl2 = object3.hasNext()) {
                        object4 = ((ResolveInfo)object3.next()).activityInfo.packageName;
                        if (object4 == null) continue;
                        CharSequence charSequence = new StringBuilder();
                        Object object5 = com.jpl.crasdk.a.c;
                        if (object5 == null) {
                            object5 = new Object();
                            ((a)object5).b = string4;
                            com.jpl.crasdk.a.c = object5;
                        }
                        object5 = com.jpl.crasdk.a.c;
                        Intrinsics.checkNotNull(object5);
                        object5 = ((a)object5).b;
                        charSequence.append((String)object5);
                        charSequence.append(string4);
                        boolean bl3 = kotlin.text.b.s((String)object4, (String)(charSequence = charSequence.toString()), false);
                        if (bl3 || !(bl3 = kotlin.text.b.s((String)object4, (String)(charSequence = "com.android.browser"), false)) && !(bl3 = kotlin.text.b.s((String)object4, string3, false))) continue;
                        object.setPackage((String)object4);
                    }
                    object2.startActivityForResult(object, 0);
                } else {
                    object = "packageName";
                    Intrinsics.checkNotNullParameter(string3, (String)object);
                    object = object2.getPackageManager();
                    string2 = "android.intent.action.VIEW";
                    object4 = "market://details?id=com.android.chrome";
                    object4 = Uri.parse((String)object4);
                    object3 = new Intent(string2, (Uri)object4);
                    n3 = 0x10000000;
                    object3.setFlags(n3);
                    Intrinsics.checkNotNull(object);
                    object = object3.resolveActivity((PackageManager)object);
                    if (object == null) break block13;
                    try {
                        object2.startActivity((Intent)object3);
                    }
                    catch (Exception exception) {
                        object2 = new StringBuilder();
                        String string5 = exception.getMessage();
                        ((StringBuilder)object2).append(string5);
                        ((StringBuilder)object2).append(string4);
                        string5 = ((StringBuilder)object2).toString();
                        object3 = "TAG";
                        Intrinsics.checkNotNullParameter(object3, "tag");
                        object2 = "msg";
                        Intrinsics.checkNotNullParameter(string5, (String)object2);
                    }
                }
            }
        }
    }

    public static void b(Activity activity, String charSequence) {
        int n3;
        String string2 = "url";
        Intrinsics.checkNotNullParameter(charSequence, string2);
        if (activity != null && (n3 = ((String)charSequence).length()) != 0) {
            String string3 = "android.intent.action.VIEW";
            charSequence = Uri.parse((String)charSequence);
            string2 = new Intent(string3, (Uri)charSequence);
            int n4 = 0x10000000;
            string2.addFlags(n4);
            try {
                ah_1.a((Intent)string2, activity);
            }
            catch (Exception exception) {
                charSequence = new StringBuilder();
                String string4 = exception.getMessage();
                ((StringBuilder)charSequence).append(string4);
                ((StringBuilder)charSequence).append("");
                string4 = ((StringBuilder)charSequence).toString();
                string2 = "TAG";
                Intrinsics.checkNotNullParameter(string2, "tag");
                charSequence = "msg";
                Intrinsics.checkNotNullParameter(string4, (String)charSequence);
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final void __externalCall(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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
}

