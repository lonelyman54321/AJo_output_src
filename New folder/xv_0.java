/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeData;
import com.ril.ajio.services.entity.BannerAdData;
import com.ril.ajio.services.entity.ThirdPartyBannerAdsItem;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONArray;

/*
 * Renamed from xv
 */
public final class xv_0 {
    public static String a(BannerData object) {
        Integer n3 = ((BannerData)object).getActualWidth();
        object = ((BannerData)object).getActualHeight();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        stringBuilder.append("x");
        stringBuilder.append(object);
        return stringBuilder.toString();
    }

    public static ThirdPartyBannerAdsItem b(String object, HashMap object2) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        if (object2 != null && (bl4 = object2.containsKey(object)) == (bl3 = true) && (object = (ArrayList)object2.get(object)) != null && !(bl2 = object.isEmpty())) {
            object = ((ArrayList)object).iterator();
            object2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            while (bl2 = object.hasNext()) {
                Boolean bl5;
                object2 = (ThirdPartyBannerAdsItem)object.next();
                if (object2 != null) {
                    bl5 = ((ThirdPartyBannerAdsItem)object2).isVisited();
                    Boolean bl6 = Boolean.FALSE;
                    bl4 = Intrinsics.areEqual(bl5, bl6);
                } else {
                    bl4 = false;
                    bl5 = null;
                }
                if (!bl4) continue;
                object = Boolean.TRUE;
                ((ThirdPartyBannerAdsItem)object2).setVisited((Boolean)object);
                return object2;
            }
        }
        return null;
    }

    public static BannerAdData c(String iterator, BannerData bannerData, HashMap object) {
        boolean bl2;
        boolean bl3 = object.containsKey(iterator);
        if (bl3 && (iterator = (ArrayList)object.get(iterator)) != null && !(bl2 = iterator.isEmpty())) {
            iterator = ((ArrayList)((Object)iterator)).iterator();
            object = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(iterator, (String)object);
            while (bl2 = iterator.hasNext()) {
                object = iterator.next();
                Object object2 = "next(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                bl3 = ((BannerAdData)(object = (BannerAdData)object)).isVisited();
                if (bl3 || (object2 = (Collection)((BannerAdData)object).getCustomimage()) == null || (bl3 = object2.isEmpty()) || (object2 = ((BannerAdData)object).getCustomimage()) == null || (object2 = (Map)CollectionsKt.firstOrNull((List)object2)) == null) continue;
                boolean bl4 = bannerData.getActualWidth();
                int n3 = bannerData.getActualHeight();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((int)(bl4 ? 1 : 0));
                stringBuilder.append("x");
                stringBuilder.append(n3);
                String string2 = stringBuilder.toString();
                bl3 = object2.containsKey(string2);
                if (bl3 != (bl4 = true)) continue;
                ((BannerAdData)object).setVisited(bl4);
                return object;
            }
        }
        return null;
    }

    public static boolean d() {
        Object object;
        int n3 = 1;
        Object object2 = h40_0.a;
        object2 = h40_0.I();
        boolean bl2 = object2.has((String)(object = "experiment"));
        if (bl2) {
            object2 = h40_0.I().getString((String)object);
            Intrinsics.checkNotNull(object2);
        } else {
            object2 = "";
        }
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("cms_experiment_flags");
        JSONArray jSONArray = new JSONArray((String)object);
        int n4 = jSONArray.length();
        for (int i3 = 0; i3 < n4; i3 += n3) {
            Object object3 = z40_0.Companion;
            object3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object3).a;
            String string2 = jSONArray.getString(i3);
            String string3 = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            boolean bl3 = ((ao0_0)object3).a(string2);
            string2 = jSONArray.get(i3).toString();
            boolean bl4 = b.i((String)object2, string2, n3 != 0);
            if (!bl4 || !bl3) continue;
            return n3 != 0;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    public static void e(HomeData var0, HashMap var1_1, HashMap var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 33[TRYBLOCK] [35 : 389->394)] java.lang.Exception
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

    public static String f(String string2) {
        Intrinsics.checkNotNullParameter(string2, "input");
        string2 = b.n(string2, "-", "_", false);
        Locale locale = Locale.ROOT;
        string2 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        return string2;
    }

    public static boolean g() {
        UrlHelper$Companion urlHelper$Companion = UrlHelper.Companion;
        boolean bl2 = urlHelper$Companion.getISPREVIEW();
        if (bl2) {
            bl2 = ch_2.n;
            if (bl2 && (bl2 = xv_0.d())) {
                bl2 = true;
            } else {
                bl2 = false;
                urlHelper$Companion = null;
            }
        } else {
            bl2 = xv_0.d();
        }
        return bl2;
    }
}

