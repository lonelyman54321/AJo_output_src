/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import android.os.Build;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from sG1
 */
public final class sg1_1 {
    public static final sg1_1 a;
    public static boolean b;
    public static JSONArray c;
    public static final String[] d;

    static {
        sg1_1 sg1_12;
        a = sg1_12 = new sg1_1();
        d = new String[]{"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(Bundle bundle, String string2) {
        Throwable throwable2;
        Class<sg1_1> clazz;
        block11: {
            char c2;
            String string3;
            Object object;
            Object object2;
            CharSequence charSequence;
            String string4;
            block10: {
                block9: {
                    string4 = "ANDROID";
                    charSequence = "event";
                    clazz = sg1_1.class;
                    boolean bl2 = td0.b(clazz);
                    if (bl2) {
                        return;
                    }
                    object2 = "params";
                    try {
                        Intrinsics.checkNotNullParameter(bundle, (String)object2);
                        Intrinsics.checkNotNullParameter(string2, (String)charSequence);
                        bundle.putString((String)charSequence, string2);
                        string2 = "_locale";
                        charSequence = new StringBuilder();
                        object2 = lz3_0.a;
                        object2.getClass();
                        object = lz3_0.j;
                        string3 = null;
                        if (object == null) break block9;
                        object = ((Locale)object).getLanguage();
                        break block10;
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                }
                c2 = '\u0000';
                object = null;
            }
            CharSequence charSequence2 = "";
            if (object == null) {
                object = charSequence2;
            }
            ((StringBuilder)charSequence).append((String)object);
            c2 = '_';
            ((StringBuilder)charSequence).append(c2);
            object2.getClass();
            object = lz3_0.j;
            if (object != null) {
                string3 = ((Locale)object).getCountry();
            }
            if (string3 == null) {
                string3 = charSequence2;
            }
            ((StringBuilder)charSequence).append(string3);
            charSequence = ((StringBuilder)charSequence).toString();
            bundle.putString(string2, (String)charSequence);
            string2 = "_appVersion";
            object2.getClass();
            charSequence = lz3_0.i;
            if (charSequence == null) {
                charSequence = charSequence2;
            }
            bundle.putString(string2, (String)charSequence);
            string2 = "_deviceOS";
            bundle.putString(string2, string4);
            string2 = "_platform";
            charSequence = "mobile";
            bundle.putString(string2, (String)charSequence);
            string2 = "_deviceModel";
            charSequence = Build.MODEL;
            if (charSequence == null) {
                charSequence = charSequence2;
            }
            bundle.putString(string2, (String)charSequence);
            string2 = "_nativeAppID";
            charSequence = FacebookSdk.b();
            bundle.putString(string2, (String)charSequence);
            string2 = "_nativeAppShortVersion";
            object2.getClass();
            charSequence = lz3_0.i;
            if (charSequence != null) {
                charSequence2 = charSequence;
            }
            bundle.putString(string2, charSequence2);
            string2 = "_timezone";
            object2.getClass();
            charSequence = lz3_0.g;
            bundle.putString(string2, (String)charSequence);
            string2 = "_carrier";
            object2.getClass();
            charSequence = lz3_0.h;
            bundle.putString(string2, (String)charSequence);
            string2 = "_deviceOSTypeName";
            bundle.putString(string2, string4);
            string2 = "_deviceOSVersion";
            string4 = Build.VERSION.RELEASE;
            bundle.putString(string2, string4);
            string2 = "_remainingDiskGB";
            object2.getClass();
            long l2 = lz3_0.e;
            bundle.putLong(string2, l2);
            return;
        }
        td0.a(clazz, throwable2);
    }

    public static final String b(JSONObject object) {
        Throwable throwable2;
        Class<sg1_1> clazz;
        block7: {
            block6: {
                clazz = sg1_1.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return null;
                }
                String string2 = "logic";
                try {
                    Intrinsics.checkNotNullParameter(object, string2);
                    object = object.keys();
                }
                catch (Throwable throwable2) {}
                bl2 = object.hasNext();
                if (!bl2) break block6;
                object = object.next();
                return (String)object;
                break block7;
            }
            return null;
        }
        td0.a(clazz, throwable2);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String c(Bundle object) {
        Object object2;
        block8: {
            Class<sg1_1> clazz = sg1_1.class;
            int n3 = td0.b(clazz);
            if (n3 != 0) {
                return null;
            }
            try {
                object2 = c;
                if (object2 == null) return "[]";
                if (object2 != null && (n3 = object2.length()) == 0) {
                    return "[]";
                }
                break block8;
            }
            catch (Throwable throwable) {}
            td0.a(clazz, throwable);
            return null;
        }
        object2 = c;
        ArrayList<Object> arrayList = "null cannot be cast to non-null type org.json.JSONArray";
        Intrinsics.checkNotNull(object2, (String)((Object)arrayList));
        arrayList = new ArrayList<Object>();
        int n4 = object2.length();
        int n7 = 0;
        while (true) {
            long l2;
            JSONObject jSONObject;
            long l3;
            long l4;
            long l7;
            if (n7 >= n4) {
                object = new JSONArray(arrayList);
                object = object.toString();
                object2 = "JSONArray(res).toString()";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                return object;
            }
            Object object3 = object2.optString(n7);
            if (object3 != null && (l7 = (l4 = (l3 = (jSONObject = new JSONObject((String)object3)).optLong((String)(object3 = "id"))) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
                object3 = "rule";
                if ((object3 = jSONObject.optString((String)object3)) != null && (l7 = (long)sg1_1.d(object, (String)object3)) != false) {
                    object3 = l3;
                    arrayList.add(object3);
                }
            }
            ++n7;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final boolean d(Bundle bundle, String string2) {
        String string3;
        boolean bl2;
        int n3;
        int n4;
        Object object;
        block21: {
            Throwable throwable2;
            Class<sg1_1> clazz;
            block22: {
                String string4;
                block23: {
                    block20: {
                        block19: {
                            clazz = sg1_1.class;
                            boolean bl3 = td0.b(clazz);
                            if (bl3) {
                                return false;
                            }
                            if (string2 == null) return false;
                            if (bundle == null) {
                                return false;
                            }
                            try {
                                object = new JSONObject(string2);
                                string2 = sg1_1.b((JSONObject)object);
                                if (string2 == null) {
                                    return false;
                                }
                                object = object.get(string2);
                                n4 = string2.hashCode();
                                n3 = 3555;
                                bl2 = true;
                                if (n4 == n3) break block19;
                                n3 = 96727;
                                if (n4 != n3) {
                                    String string5;
                                    n3 = 109267;
                                    if (n4 == n3 && (n4 = (int)(string2.equals(string5 = "not") ? 1 : 0)) != 0) {
                                        string2 = object.toString();
                                        return sg1_1.d(bundle, string2) ^ bl2;
                                    }
                                    break block20;
                                }
                                string3 = "and";
                                n4 = (int)(string2.equals(string3) ? 1 : 0);
                                if (n4 == 0) break block20;
                                if ((object = (JSONArray)object) == null) {
                                    return false;
                                }
                                break block21;
                            }
                            catch (Throwable throwable2) {}
                            break block22;
                        }
                        string4 = "or";
                        n4 = (int)(string2.equals(string4) ? 1 : 0);
                        if (n4 != 0) break block23;
                    }
                    if (object != null) return sg1_1.g(string2, (JSONObject)object, bundle);
                    return false;
                }
                if ((object = (JSONArray)object) == null) {
                    return false;
                }
                int n7 = object.length();
                n4 = 0;
                string4 = null;
                while (n4 < n7) {
                    Object object2 = object.get(n4);
                    n3 = (int)(sg1_1.d(bundle, (String)(object2 = object2.toString())) ? 1 : 0);
                    if (n3 != 0) {
                        return bl2;
                    }
                    ++n4;
                }
                return false;
            }
            td0.a(clazz, throwable2);
            return false;
        }
        int n8 = object.length();
        n4 = 0;
        string3 = null;
        while (n4 < n8) {
            Object object3 = object.get(n4);
            n3 = (int)(sg1_1.d(bundle, (String)(object3 = object3.toString())) ? 1 : 0);
            if (n3 == 0) {
                return false;
            }
            ++n4;
        }
        return bl2;
    }

    public static final void e(Bundle bundle, String string2) {
        Throwable throwable2;
        Class<sg1_1> clazz;
        block9: {
            block8: {
                clazz = sg1_1.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return;
                }
                String string3 = "event";
                try {
                    Intrinsics.checkNotNullParameter(string2, string3);
                    bl2 = b;
                    if (!bl2 || bundle == null) break block8;
                }
                catch (Throwable throwable2) {}
                sg1_1.a(bundle, string2);
                string2 = "_audiencePropertyIds";
                string3 = sg1_1.c(bundle);
                bundle.putString(string2, string3);
                string2 = "cs_maca";
                string3 = "1";
                try {
                    bundle.putString(string2, string3);
                    sg1_1.f(bundle);
                    break block8;
                }
                catch (Exception exception) {}
                break block9;
            }
            return;
        }
        td0.a(clazz, throwable2);
    }

    public static final void f(Bundle bundle) {
        Throwable throwable2;
        Class<sg1_1> clazz = sg1_1.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return;
        }
        String[] stringArray = "params";
        Intrinsics.checkNotNullParameter(bundle, (String)stringArray);
        stringArray = d;
        int n3 = stringArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2;
            try {
                string2 = stringArray[i3];
            }
            catch (Throwable throwable2) {
            }
            bundle.remove(string2);
            continue;
        }
        return;
        td0.a(clazz, throwable2);
    }

    /*
     * Exception decompiling
     */
    public static final boolean g(String var0, JSONObject var1_2, Bundle var2_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 15[TRYBLOCK] [17 : 242->245)] java.lang.Throwable
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
}

