/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.c;
import kotlin.ranges.f;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from HP1
 */
public final class hp1_1 {
    public static final hp1_1 a;
    public static final ConcurrentHashMap b;
    public static final List c;
    public static final List d;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        a = concurrentHashMap;
        b = concurrentHashMap = new ConcurrentHashMap();
        c = xx_2.i("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");
        d = xx_2.i("none", "address", "health");
    }

    public static final File d(HP1$a object) {
        block7: {
            Class<hp1_1> clazz = hp1_1.class;
            boolean bl2 = td0.b(clazz);
            if (bl2) {
                return null;
            }
            Object object2 = "task";
            try {
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = b;
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
                return null;
            }
            object = object.toUseCase();
            object = ((ConcurrentHashMap)object2).get(object);
            object = (HP1$b)object;
            if (object != null) break block7;
            return null;
        }
        return ((HP1$b)object).f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String[] f(HP1$a object, float[][] object2, String[] objectArray) {
        Throwable throwable2;
        Class<hp1_1> clazz;
        block9: {
            wg1_1 wg1_12;
            Object object3;
            clazz = hp1_1.class;
            boolean bl2 = td0.b(clazz);
            String[] stringArray = null;
            if (bl2) {
                return null;
            }
            Object object4 = "task";
            try {
                Intrinsics.checkNotNullParameter(object, (String)object4);
                object4 = "denses";
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                object4 = "texts";
                Intrinsics.checkNotNullParameter(objectArray, (String)object4);
                object4 = b;
                object3 = ((HP1$a)((Object)object)).toUseCase();
                object4 = ((ConcurrentHashMap)object4).get(object3);
                object4 = (HP1$b)object4;
                if (object4 == null) return stringArray;
                object3 = ((HP1$b)object4).g;
                if (object3 == null) {
                    return stringArray;
                }
                object4 = ((HP1$b)object4).e;
                int n3 = objectArray.length;
                float[] fArray = object2[0];
                int n4 = fArray.length;
                int[] nArray = new int[]{n3, n4};
                wg1_12 = new wg1_1(nArray);
                nArray = null;
                for (int i3 = 0; i3 < n3; ++i3) {
                    float[] fArray2 = object2[i3];
                    float[] fArray3 = wg1_12.c;
                    int n7 = i3 * n4;
                    System.arraycopy(fArray2, 0, fArray3, n7, n4);
                }
            }
            catch (Throwable throwable2) {
                break block9;
            }
            object2 = ((HP1$a)((Object)object)).toKey();
            if ((object2 = (Object)((xp1_2)object3).a(wg1_12, (String[])objectArray, (String)object2)) == null) return stringArray;
            if (object4 == null) return stringArray;
            objectArray = object2.c;
            int n8 = objectArray.length;
            if (n8 == 0) {
                return stringArray;
            }
            n8 = ((Object)object4).length;
            if (n8 == 0) {
                return stringArray;
            }
            objectArray = HP1$c.$EnumSwitchMapping$0;
            Object object5 = ((Enum)object).ordinal();
            object5 = objectArray[object5];
            n8 = 1;
            object3 = a;
            if (object5 == n8) return ((hp1_1)object3).h((wg1_1)object2, (float[])object4);
            n8 = 2;
            if (object5 == n8) {
                return ((hp1_1)object3).g((wg1_1)object2, (float[])object4);
            }
            object = new NoWhenBranchMatchedException();
            throw object;
        }
        td0.a(clazz, throwable2);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(JSONObject jSONObject) {
        boolean bl2 = td0.b(this);
        if (bl2) {
            return;
        }
        try {
            Iterator iterator = jSONObject.keys();
            try {
                boolean bl3;
                while (bl3 = iterator.hasNext()) {
                    Object object = iterator.next();
                    object = (String)object;
                    object = jSONObject.getJSONObject(object);
                    if ((object = HP1$b$a.a(object)) == null) continue;
                    ConcurrentHashMap concurrentHashMap = b;
                    String string2 = ((HP1$b)object).a;
                    concurrentHashMap.put(string2, object);
                }
                return;
            }
            catch (JSONException jSONException) {}
            return;
        }
        catch (Throwable throwable222) {}
        td0.a(this, throwable222);
    }

    /*
     * Exception decompiling
     */
    public final void b() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 32[TRYBLOCK] [37 : 305->313)] java.lang.Throwable
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

    public final JSONObject c() {
        Object object;
        block12: {
            boolean bl2 = td0.b(this);
            if (bl2) {
                return null;
            }
            object = "use_case";
            String string2 = "version_id";
            String string3 = "asset_uri";
            String string4 = "rules_uri";
            String string5 = "thresholds";
            try {
                object = new String[]{object, string2, string3, string4, string5};
            }
            catch (Throwable throwable) {
                td0.a(this, throwable);
                return null;
            }
            string2 = new Bundle();
            string3 = "fields";
            string4 = ",";
            object = TextUtils.join((CharSequence)string4, (Object[])object);
            string2.putString(string3, (String)object);
            object = GraphRequest.j;
            object = "app/model_asset";
            object = GraphRequest$c.g(null, (String)object, null);
            string3 = "<set-?>";
            Intrinsics.checkNotNullParameter(string2, string3);
            ((GraphRequest)object).d = string2;
            object = ((GraphRequest)object).c();
            object = ((com.facebook.f)object).b;
            if (object != null) break block12;
            return null;
        }
        return this.e((JSONObject)object);
    }

    /*
     * Exception decompiling
     */
    public final JSONObject e(JSONObject var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 18[TRYBLOCK] [35, 34 : 206->211)] java.lang.Throwable
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
    public final String[] g(wg1_1 stringArray, float[] fArray) {
        int n3 = td0.b(this);
        if (n3 != 0) {
            return null;
        }
        try {
            int[] nArray = stringArray.a;
            int n4 = nArray[0];
            int n7 = 1;
            n3 = nArray[n7];
            stringArray = (String[])stringArray.c;
            n7 = fArray.length;
            if (n3 != n7) {
                return null;
            }
            KMappedMarker kMappedMarker = f.m(0, n4);
            int n8 = 10;
            n8 = yx_2.o((Iterable)((Object)kMappedMarker), n8);
            ArrayList<String> arrayList = new ArrayList<String>(n8);
            kMappedMarker = ((c)kMappedMarker).d();
            while (true) {
                int n10;
                int n14;
                Object object;
                if ((n8 = (int)(((ui1_2)kMappedMarker).c ? 1 : 0)) != 0) {
                    n8 = ((mi1_2)kMappedMarker).nextInt();
                    object = "none";
                    n14 = fArray.length;
                    n10 = 0;
                } else {
                    stringArray = new String[]{};
                    return arrayList.toArray(stringArray);
                }
                for (int i3 = 0; i3 < n14; ++i3) {
                    float f5 = fArray[i3];
                    int n15 = n10 + 1;
                    int n16 = n8 * n3 + n10;
                    reference var17_18 = stringArray[n16];
                    reference cfr_temp_0 = var17_18 - f5;
                    Object object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                    if (object2 >= 0) {
                        object = d;
                        object = object.get(n10);
                    }
                    n10 = n15;
                }
                arrayList.add((String)object);
            }
        }
        catch (Throwable throwable) {}
        td0.a(this, throwable);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String[] h(wg1_1 stringArray, float[] fArray) {
        int n3 = td0.b(this);
        if (n3 != 0) {
            return null;
        }
        try {
            int[] nArray = stringArray.a;
            int n4 = nArray[0];
            int n7 = 1;
            n3 = nArray[n7];
            stringArray = (String[])stringArray.c;
            n7 = fArray.length;
            if (n3 != n7) {
                return null;
            }
            KMappedMarker kMappedMarker = f.m(0, n4);
            int n8 = 10;
            n8 = yx_2.o((Iterable)((Object)kMappedMarker), n8);
            ArrayList<String> arrayList = new ArrayList<String>(n8);
            kMappedMarker = ((c)kMappedMarker).d();
            while (true) {
                int n10;
                int n14;
                Object object;
                if ((n8 = (int)(((ui1_2)kMappedMarker).c ? 1 : 0)) != 0) {
                    n8 = ((mi1_2)kMappedMarker).nextInt();
                    object = "other";
                    n14 = fArray.length;
                    n10 = 0;
                } else {
                    stringArray = new String[]{};
                    return arrayList.toArray(stringArray);
                }
                for (int i3 = 0; i3 < n14; ++i3) {
                    float f5 = fArray[i3];
                    int n15 = n10 + 1;
                    int n16 = n8 * n3 + n10;
                    reference var17_18 = stringArray[n16];
                    reference cfr_temp_0 = var17_18 - f5;
                    Object object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                    if (object2 >= 0) {
                        object = c;
                        object = object.get(n10);
                    }
                    n10 = n15;
                }
                arrayList.add((String)object);
            }
        }
        catch (Throwable throwable) {}
        td0.a(this, throwable);
        return null;
    }
}

