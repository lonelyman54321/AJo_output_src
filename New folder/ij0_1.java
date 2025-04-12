/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Patterns
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.util.Patterns;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from iJ0
 */
public final class ij0_1 {
    public static final ij0_1 a;
    public static Map b;
    public static Map c;
    public static Map d;
    public static JSONObject e;
    public static boolean f;

    static {
        ij0_1 ij0_12;
        a = ij0_12 = new ij0_1();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final float[] a(String object, JSONObject object2) {
        Throwable throwable2;
        Class<ij0_1> clazz;
        block8: {
            JSONObject jSONObject;
            float[] fArray;
            clazz = ij0_1.class;
            int n3 = td0.b(clazz);
            if (n3 != 0) {
                return null;
            }
            Object object3 = "viewHierarchy";
            try {
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object3 = "appName";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                n3 = f;
                if (n3 == 0) {
                    return null;
                }
                n3 = 30;
                fArray = new float[n3];
                for (int i3 = 0; i3 < n3; ++i3) {
                    jSONObject = null;
                    fArray[i3] = 0.0f;
                }
            }
            catch (Throwable throwable2) {
                break block8;
            }
            try {
                String string2 = ((String)object).toLowerCase();
                object = "this as java.lang.String).toLowerCase()";
                Intrinsics.checkNotNullExpressionValue(string2, (String)object);
                object3 = "view";
                object3 = object2.optJSONObject((String)object3);
                object3 = object3.toString();
                object = new JSONObject((String)object3);
                object3 = "screenname";
                String string3 = object2.optString((String)object3);
                JSONArray jSONArray = new JSONArray();
                object2 = a;
                ((ij0_1)object2).h(jSONArray, (JSONObject)object);
                object3 = ((ij0_1)object2).g((JSONObject)object);
                ((ij0_1)object2).k(fArray, (float[])object3);
                jSONObject = ((ij0_1)object2).b((JSONObject)object);
                if (jSONObject == null) {
                    return null;
                }
                object3 = "screenName";
                Intrinsics.checkNotNullExpressionValue(string3, (String)object3);
                String string4 = object.toString();
                object = "viewTree.toString()";
                Intrinsics.checkNotNullExpressionValue(string4, (String)object);
                object = ((ij0_1)object2).f(jSONObject, jSONArray, string3, string4, string2);
                ((ij0_1)object2).k(fArray, (float[])object);
                return fArray;
            }
            catch (JSONException jSONException) {
                return fArray;
            }
        }
        td0.a(clazz, throwable2);
        return null;
    }

    public static final String c(String string2, String string3, String string4) {
        Class<ij0_1> clazz = ij0_1.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return null;
        }
        CharSequence charSequence = "buttonText";
        try {
            Intrinsics.checkNotNullParameter(string2, (String)charSequence);
            charSequence = "activityName";
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return null;
        }
        Intrinsics.checkNotNullParameter(string3, (String)charSequence);
        charSequence = "appName";
        Intrinsics.checkNotNullParameter(string4, (String)charSequence);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string4);
        string4 = " | ";
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append(string3);
        string3 = ", ";
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(string2);
        string2 = ((StringBuilder)charSequence).toString();
        string2 = string2.toLowerCase();
        string3 = "this as java.lang.String).toLowerCase()";
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void d(File file) {
        int n3 = 3;
        int n4 = 2;
        int n7 = 0;
        Pair pair = null;
        int n8 = 4;
        int n10 = 1;
        String string2 = "4";
        String string3 = "3";
        String string4 = "2";
        String string5 = "1";
        Class<ij0_1> clazz = ij0_1.class;
        int n14 = (int)(td0.b(clazz) ? 1 : 0);
        if (n14 != 0) {
            return;
        }
        try {
            Map map3;
            Map map2;
            Pair pair2;
            Object object4;
            Object object3;
            Object object2;
            Object object;
            try {
                object = new JSONObject();
                e = object;
                object2 = file;
                object = new FileInputStream(file);
                int n15 = ((InputStream)object).available();
                object2 = new byte[n15];
                ((InputStream)object).read((byte[])object2);
                ((InputStream)object).close();
                object3 = Charsets.UTF_8;
                object4 = new String((byte[])object2, (Charset)object3);
                object = new JSONObject((String)object4);
                e = object;
                object = "ENGLISH";
                object2 = new Pair(object, string5);
                object = "GERMAN";
                object4 = new Pair(object, string4);
                object = "SPANISH";
                object3 = new Pair(object, string3);
                object = "JAPANESE";
                pair2 = new Pair(object, string2);
            }
            catch (Exception exception) {
                return;
            }
            object = new Pair[n8];
            object[0] = object2;
            object[n10] = object4;
            object[n4] = object3;
            object[n3] = pair2;
            b = object = fh1_2.i((Pair[])object);
            object = "VIEW_CONTENT";
            object2 = "0";
            object4 = new Pair(object, object2);
            object = "SEARCH";
            object2 = new Pair(object, string5);
            object = "ADD_TO_CART";
            object3 = new Pair(object, string4);
            object = "ADD_TO_WISHLIST";
            pair2 = new Pair(object, string3);
            object = "INITIATE_CHECKOUT";
            Pair pair3 = new Pair(object, string2);
            object = "ADD_PAYMENT_INFO";
            String string6 = "5";
            Pair pair4 = new Pair(object, string6);
            String string7 = "PURCHASE";
            object = "6";
            Pair pair5 = new Pair(string7, object);
            String string8 = "LEAD";
            object = "7";
            Pair pair6 = new Pair(string8, object);
            String string9 = "COMPLETE_REGISTRATION";
            object = "8";
            pair = new Pair(string9, object);
            n8 = 9;
            Pair[] pairArray = new Pair[n8];
            n14 = 0;
            object = null;
            pairArray[0] = object4;
            n14 = 1;
            pairArray[n14] = object2;
            n14 = 2;
            pairArray[n14] = object3;
            n14 = 3;
            pairArray[n14] = pair2;
            n14 = 4;
            pairArray[n14] = pair3;
            n14 = 5;
            pairArray[n14] = pair4;
            n3 = 6;
            pairArray[n3] = pair5;
            n3 = 7;
            pairArray[n3] = pair6;
            n3 = 8;
            pairArray[n3] = pair;
            c = map2 = fh1_2.i(pairArray);
            String string10 = "BUTTON_TEXT";
            pair5 = new Pair(string10, string5);
            String string11 = "PAGE_TITLE";
            pair = new Pair(string11, string4);
            String string12 = "RESOLVED_DOCUMENT_LINK";
            Pair pair7 = new Pair(string12, string3);
            String string13 = "BUTTON_ID";
            pair6 = new Pair(string13, string2);
            n3 = 4;
            Pair[] pairArray2 = new Pair[n3];
            string2 = null;
            pairArray2[0] = pair5;
            n4 = 1;
            pairArray2[n4] = pair;
            n7 = 2;
            pairArray2[n7] = pair7;
            n7 = 3;
            pairArray2[n7] = pair6;
            d = map3 = fh1_2.i(pairArray2);
            f = n4;
            return;
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final JSONObject b(JSONObject jSONObject) {
        int n3;
        block12: {
            n3 = td0.b(this);
            if (n3 != 0) {
                return null;
            }
            String string2 = "is_interacted";
            n3 = jSONObject.optBoolean(string2);
            if (n3 != 0) {
                return jSONObject;
            }
            string2 = "childviews";
            jSONObject = jSONObject.optJSONArray(string2);
            if (jSONObject != null) break block12;
            return null;
        }
        try {
            n3 = jSONObject.length();
        }
        catch (JSONException jSONException) {
            return null;
        }
        for (int i3 = 0; i3 < n3; ++i3) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(i3);
            String string3 = "children.getJSONObject(i)";
            Intrinsics.checkNotNullExpressionValue(jSONObject2, string3);
            try {
                jSONObject2 = this.b(jSONObject2);
                if (jSONObject2 == null) continue;
                return jSONObject2;
            }
            catch (Throwable throwable) {
                td0.a(this, throwable);
                return null;
            }
        }
        return null;
    }

    public final boolean e(String[] stringArray, String[] stringArray2) {
        Throwable throwable2;
        block9: {
            int n3 = td0.b(this);
            if (n3 != 0) {
                return false;
            }
            n3 = stringArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                String string2 = stringArray[i3];
                int n4 = stringArray2.length;
                for (int i8 = 0; i8 < n4; ++i8) {
                    String string3;
                    try {
                        string3 = stringArray2[i8];
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    boolean bl2 = StringsKt.F(string3, string2, false);
                    if (!bl2) continue;
                    return true;
                }
            }
            return false;
        }
        td0.a(this, throwable2);
        return false;
    }

    /*
     * Exception decompiling
     */
    public final float[] f(JSONObject var1_1, JSONArray var2_2, String var3_3, String var4_4, String var5_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 105->109)] java.lang.Throwable
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
    public final float[] g(JSONObject var1_1) {
        block18: {
            var2_3 /* !! */  = "this as java.lang.String).toLowerCase()";
            var3_4 = td0.b(this);
            if (var3_4 != 0) {
                return null;
            }
            var3_4 = 30;
            var4_5 = 4.2E-44f;
            try {
                var5_6 = new float[var3_4];
                var6_7 = 0;
                var8_9 = 0.0f;
                var9_10 /* !! */  = null;
                for (var7_8 = 0; var7_8 < var3_4; ++var7_8) {
                    var10_11 = null;
                    var5_6[var7_8] = 0.0f;
                }
            }
            catch (Throwable var1_2) {
                break block18;
            }
            var11_12 /* !! */  = "text";
            var11_12 /* !! */  = var1_1.optString((String)var11_12 /* !! */ );
            var9_10 /* !! */  = "node.optString(TEXT_KEY)";
            Intrinsics.checkNotNullExpressionValue(var11_12 /* !! */ , (String)var9_10 /* !! */ );
            var11_12 /* !! */  = var11_12 /* !! */ .toLowerCase();
            Intrinsics.checkNotNullExpressionValue(var11_12 /* !! */ , (String)var2_3 /* !! */ );
            var9_10 /* !! */  = "hint";
            var9_10 /* !! */  = var1_1.optString((String)var9_10 /* !! */ );
            var10_11 = "node.optString(HINT_KEY)";
            Intrinsics.checkNotNullExpressionValue(var9_10 /* !! */ , var10_11);
            var9_10 /* !! */  = var9_10 /* !! */ .toLowerCase();
            Intrinsics.checkNotNullExpressionValue(var9_10 /* !! */ , (String)var2_3 /* !! */ );
            var10_11 = "classname";
            var10_11 = var1_1.optString(var10_11);
            var12_13 /* !! */  = "node.optString(CLASS_NAME_KEY)";
            Intrinsics.checkNotNullExpressionValue(var10_11, (String)var12_13 /* !! */ );
            var10_11 = var10_11.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(var10_11, (String)var2_3 /* !! */ );
            var2_3 /* !! */  = "inputtype";
            var13_14 = -1;
            var14_15 = 0.0f / 0.0f;
            {
                var15_16 = var1_1.optInt((String)var2_3 /* !! */ , var13_14);
                var9_10 /* !! */  = new String[]{var11_12 /* !! */ , var9_10 /* !! */ };
                var12_13 /* !! */  = "$";
                var16_17 = "amount";
                var17_18 = "price";
                var18_19 = "total";
                var12_13 /* !! */  = new String[]{var12_13 /* !! */ , var16_17, var17_18, var18_19};
                var13_14 = (int)this.e(var12_13 /* !! */ , var9_10 /* !! */ );
                var19_20 = 1.0f;
                if (var13_14 == 0) ** GOTO lbl52
                var14_15 = var5_6[0] + var19_20;
            }
            {
                var5_6[0] = var14_15;
lbl52:
                // 2 sources

                var12_13 /* !! */  = "password";
                var17_18 = "pwd";
                var13_14 = (int)this.e(var12_13 /* !! */  = new String[]{var12_13 /* !! */ , var17_18}, var9_10 /* !! */ );
                if (var13_14 == 0) ** GOTO lbl60
                var13_14 = 1;
                var14_15 = 1.4E-45f;
                var20_21 = var5_6[var13_14] + var19_20;
            }
            {
                var5_6[var13_14] = var20_21;
lbl60:
                // 2 sources

                var12_13 /* !! */  = "tel";
                var17_18 = "phone";
                var12_13 /* !! */  = new String[]{var12_13 /* !! */ , var17_18};
                var13_14 = (int)this.e(var12_13 /* !! */ , var9_10 /* !! */ );
                var21_22 = 2;
                var20_21 = 2.8E-45f;
                if (var13_14 == 0) ** GOTO lbl69
                var14_15 = var5_6[var21_22] + var19_20;
            }
            {
                var5_6[var21_22] = var14_15;
lbl69:
                // 2 sources

                var12_13 /* !! */  = "search";
                var7_8 = (int)this.e(var12_13 /* !! */  = new String[]{var12_13 /* !! */ }, var9_10 /* !! */ );
                if (var7_8 == 0) ** GOTO lbl76
                var7_8 = 4;
                var8_9 = 5.6E-45f;
                var14_15 = var5_6[var7_8] + var19_20;
            }
            {
                var5_6[var7_8] = var14_15;
lbl76:
                // 2 sources

                if (var15_16 < 0) ** GOTO lbl81
                var7_8 = 5;
                var8_9 = 7.0E-45f;
                var14_15 = var5_6[var7_8] + var19_20;
            }
            {
                block19: {
                    var5_6[var7_8] = var14_15;
lbl81:
                    // 2 sources

                    if (var15_16 == var21_22) break block19;
                    var7_8 = 3;
                    var8_9 = 4.2E-45f;
                    if (var15_16 != var7_8) ** GOTO lbl90
                }
                var7_8 = 6;
                var8_9 = 8.4E-45f;
                var14_15 = var5_6[var7_8] + var19_20;
            }
            {
                block20: {
                    var5_6[var7_8] = var14_15;
lbl90:
                    // 2 sources

                    var7_8 = 32;
                    var8_9 = 4.5E-44f;
                    if (var15_16 == var7_8) break block20;
                    var2_3 /* !! */  = Patterns.EMAIL_ADDRESS;
                    var15_16 = (int)(var2_3 /* !! */  = var2_3 /* !! */ .matcher((CharSequence)var11_12 /* !! */ )).matches();
                    if (var15_16 == 0) ** GOTO lbl100
                }
                var15_16 = 7;
                var8_9 = var5_6[var15_16] + var19_20;
            }
            {
                var5_6[var15_16] = var8_9;
lbl100:
                // 2 sources

                if ((var15_16 = (int)StringsKt.F(var10_11, (CharSequence)(var2_3 /* !! */  = "checkbox"), false)) == 0) ** GOTO lbl104
                var15_16 = 8;
                var8_9 = var5_6[var15_16] + var19_20;
            }
            {
                var5_6[var15_16] = var8_9;
lbl104:
                // 2 sources

                var2_3 /* !! */  = "complete";
                var9_10 /* !! */  = "confirm";
                var12_13 /* !! */  = "done";
                var17_18 = "submit";
                var15_16 = (int)this.e(var2_3 /* !! */  = new String[]{var2_3 /* !! */ , var9_10 /* !! */ , var12_13 /* !! */ , var17_18}, var11_12 /* !! */  = new String[]{var11_12 /* !! */ });
                if (var15_16 == 0) ** GOTO lbl113
                var15_16 = 10;
                var4_5 = var5_6[var15_16] + var19_20;
            }
            {
                var5_6[var15_16] = var4_5;
lbl113:
                // 2 sources

                if ((var15_16 = (int)StringsKt.F(var10_11, (CharSequence)(var2_3 /* !! */  = "radio"), false)) == 0 || (var15_16 = (int)StringsKt.F(var10_11, (CharSequence)(var2_3 /* !! */  = "button"), false)) == 0) ** GOTO lbl117
                var15_16 = 12;
                var4_5 = var5_6[var15_16] + var19_20;
            }
            {
                var5_6[var15_16] = var4_5;
lbl117:
                // 2 sources

                var2_3 /* !! */  = "childviews";
                try {
                    var1_1 = var1_1.optJSONArray((String)var2_3 /* !! */ );
                    var15_16 = var1_1.length();
                    while (var6_7 < var15_16) {
                        var11_12 /* !! */  = var1_1.getJSONObject(var6_7);
                        var9_10 /* !! */  = "childViews.getJSONObject(i)";
                        Intrinsics.checkNotNullExpressionValue(var11_12 /* !! */ , (String)var9_10 /* !! */ );
                        var11_12 /* !! */  = (String[])this.g((JSONObject)var11_12 /* !! */ );
                        this.k(var5_6, (float[])var11_12 /* !! */ );
                        ++var6_7;
                    }
                    return var5_6;
                }
                catch (JSONException v0) {}
            }
            return var5_6;
        }
        td0.a(this, var1_2);
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean h(JSONArray jSONArray, JSONObject jSONObject) {
        Throwable throwable2;
        int n3;
        int n4;
        JSONObject jSONObject2;
        JSONArray jSONArray2;
        int n7;
        JSONArray jSONArray3;
        String string2;
        String string3;
        block11: {
            string3 = "childviews";
            string2 = "is_interacted";
            boolean bl2 = td0.b(this);
            if (bl2) {
                return false;
            }
            try {
                bl2 = jSONObject.optBoolean(string2);
                boolean bl3 = true;
                if (bl2) {
                    return bl3;
                }
                jSONArray3 = jSONObject.optJSONArray(string3);
                n7 = jSONArray3.length();
                jSONArray2 = null;
                for (int i3 = 0; i3 < n7; i3 += 1) {
                    jSONObject2 = jSONArray3.getJSONObject(i3);
                    n4 = jSONObject2.optBoolean(string2);
                    if (n4 == 0) continue;
                    n3 = 1;
                    n7 = 1;
                    break block11;
                }
            }
            catch (Throwable throwable2) {
            }
            n3 = 0;
            string2 = null;
            n7 = 0;
        }
        jSONArray2 = new JSONArray();
        if (n3 != 0) {
            int n8 = jSONArray3.length();
            int n10 = 0;
            string3 = null;
            while (n10 < n8) {
                string2 = jSONArray3.getJSONObject(n10);
                jSONArray.put((Object)string2);
                ++n10;
            }
            return n7 != 0;
        }
        n3 = jSONArray3.length();
        n4 = 0;
        jSONObject2 = null;
        while (true) {
            if (n4 >= n3) {
                jSONObject.put(string3, (Object)jSONArray2);
                return n7 != 0;
            }
            JSONObject jSONObject3 = jSONArray3.getJSONObject(n4);
            String string4 = "child";
            Intrinsics.checkNotNullExpressionValue(jSONObject3, string4);
            boolean bl4 = this.h(jSONArray, jSONObject3);
            if (bl4) {
                jSONArray2.put((Object)jSONObject3);
                n7 = 1;
            }
            ++n4;
        }
        catch (JSONException jSONException) {
            return false;
        }
        td0.a(this, throwable2);
        return false;
    }

    public final boolean i(String object, String string2) {
        boolean bl2 = td0.b(this);
        if (bl2) {
            return false;
        }
        try {
            object = Pattern.compile((String)object);
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return false;
        }
        object = ((Pattern)object).matcher(string2);
        return ((Matcher)object).find();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean j(String string2, String string3, String string4) {
        Throwable throwable2;
        block11: {
            Object object;
            Object object2;
            Object object3;
            boolean bl2;
            boolean bl3;
            Object object4;
            block10: {
                object4 = "ENGLISH";
                bl3 = td0.b(this);
                bl2 = false;
                if (bl3) {
                    return false;
                }
                try {
                    object3 = e;
                    object2 = null;
                    if (object3 != null) break block10;
                    object3 = "rules";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    bl3 = false;
                    object3 = null;
                }
                catch (Throwable throwable2) {
                    break block11;
                }
            }
            if ((object3 = object3.optJSONObject((String)(object = "rulesForLanguage"))) != null) {
                object = b;
                if (object == null) {
                    object = "languageInfo";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    object = null;
                }
                object4 = object.get(object4);
                if ((object4 = object3.optJSONObject((String)object4)) != null && (object4 = object4.optJSONObject((String)(object3 = "rulesForEvent"))) != null) {
                    object3 = c;
                    if (object3 == null) {
                        object3 = "eventInfo";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        bl3 = false;
                        object3 = null;
                    }
                    string2 = object3.get(string2);
                    if ((string2 = object4.optJSONObject(string2)) != null && (string2 = string2.optJSONObject((String)(object4 = "positiveRules"))) != null) {
                        object4 = d;
                        if (object4 == null) {
                            object4 = "textTypeInfo";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        } else {
                            object2 = object4;
                        }
                        string3 = object2.get(string3);
                        object2 = string2.optString(string3);
                    }
                }
            }
            if (object2 != null) return this.i((String)object2, string4);
            return bl2;
        }
        td0.a(this, throwable2);
        return false;
    }

    public final void k(float[] fArray, float[] fArray2) {
        Throwable throwable2;
        block7: {
            int n3 = td0.b(this);
            if (n3 != 0) {
                return;
            }
            n3 = fArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                float f5;
                try {
                    f5 = fArray[i3];
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                float f6 = fArray2[i3];
                f5 += f6;
                fArray[i3] = f5;
                continue;
            }
            return;
        }
        td0.a(this, throwable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(JSONObject jSONObject, StringBuilder stringBuilder, StringBuilder stringBuilder2) {
        int n3;
        String string2;
        String string3;
        String string4;
        block11: {
            Throwable throwable2;
            block10: {
                String string5;
                block9: {
                    string5 = "this as java.lang.String).toLowerCase()";
                    string4 = "";
                    boolean bl2 = td0.b(this);
                    if (bl2) {
                        return;
                    }
                    string3 = "text";
                    try {
                        string3 = jSONObject.optString(string3, string4);
                        string2 = "view.optString(TEXT_KEY, \"\")";
                        Intrinsics.checkNotNullExpressionValue(string3, string2);
                        string3 = string3.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(string3, string5);
                        string2 = "hint";
                        string4 = jSONObject.optString(string2, string4);
                        string2 = "view.optString(HINT_KEY, \"\")";
                        Intrinsics.checkNotNullExpressionValue(string4, string2);
                        string4 = string4.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(string4, string5);
                        n3 = string3.length();
                        string2 = " ";
                        if (n3 <= 0) break block9;
                        stringBuilder.append(string3);
                        stringBuilder.append(string2);
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                }
                if ((n3 = string4.length()) > 0) {
                    stringBuilder2.append(string4);
                    stringBuilder2.append(string2);
                }
                if ((jSONObject = jSONObject.optJSONArray(string5 = "childviews")) == null) {
                    return;
                }
                break block11;
            }
            td0.a(this, throwable2);
            return;
        }
        n3 = jSONObject.length();
        int n4 = 0;
        string4 = null;
        while (n4 < n3) {
            try {
                string3 = jSONObject.getJSONObject(n4);
                string2 = "currentChildView";
                Intrinsics.checkNotNullExpressionValue(string3, string2);
                this.l((JSONObject)string3, stringBuilder, stringBuilder2);
            }
            catch (JSONException jSONException) {}
            ++n4;
        }
        return;
    }
}

