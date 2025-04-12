/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.ril.ajio.services.utils;

import android.text.TextUtils;
import com.ril.ajio.services.data.FacetValue;
import com.ril.ajio.services.data.Product.WidgetRecord;
import com.ril.ajio.services.query.FacetInternalQuery;
import com.ril.ajio.services.query.FacetQuery;
import com.ril.ajio.services.query.ProductListQuery;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class NewQueryUtil {
    private static final String ADVFILTER = "advfilter";
    public static final String AUTO_SUGEST_SEARCH_TERM = "autoSuggestSearchTerm";
    private static final String AUTO_SUGGEST_TYPE = "autosuggestType";
    private static final String BRAND_CODE = "brandCode";
    private static final String CURRENT_PAGE = "currentPage";
    private static final String DEVICE_ID = "deviceID";
    private static final String FIELDS = "fields";
    private static final String FULL = "FULL";
    public static final NewQueryUtil INSTANCE;
    private static final String OSPREY_SEARCH = "ospreySearch";
    private static final String PAGE_SIZE = "pageSize";
    private static final String PAGE_TYPE = "pageType";
    private static final String PINCODE = "pincode";
    private static final String PREVIOUS_SOURCE = "previousSource";
    private static final String PRODUCTS = "products";
    private static final String QUERY = "query";
    private static final String SESSION_ID = "sessionID";
    private static final String SHOW_DEFAULT = "showDefaultIfNoData";
    private static final String SHOW_FACETS = "showFacets";
    private static final String SHOW_VIEW_ALL_WIDGET = "showViewAllWidget";
    private static final String SORT = "sort";
    private static final String STORE = "store";
    private static final String URGENCY_DRIVER_ENABLED = "urgencyDriverEnabled";
    private static final String USER_ID = "userId";
    private static final String UTF_8 = "UTF-8";
    private static final String WIDGET_ID = "widgetID";
    private static final String WIDGET_LEVEL = "widgetLevel";
    private static final String WIDGET_MIN_PROD_COUNT = "widgetMinProdCount";
    private static final String WIDGET_NAME = "widgetName";
    private static final String WIDGET_QUERY = "widgetItemFilters";
    private static final String WIDGET_TYPE = "widgetType";

    static {
        NewQueryUtil newQueryUtil;
        INSTANCE = newQueryUtil = new NewQueryUtil();
    }

    private NewQueryUtil() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final String decode(String string2) {
        String string3 = UTF_8;
        try {
            return URLDecoder.decode(string2, string3);
        }
        catch (Exception exception) {
            return string2;
        }
    }

    private final String generateQueryTagForProduct(List object, String string2) {
        int n3;
        int n4;
        Object object2;
        StringBuilder stringBuilder = new StringBuilder();
        if (object != null) {
            object2 = object;
            object2 = (Collection)object;
            n4 = object2.isEmpty() ^ 1;
            if (n4 != 0) {
                object = object.iterator();
                while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    object2 = (FacetValue)object.next();
                    boolean bl2 = ((FacetValue)object2).getSelected();
                    if (bl2) {
                        object2 = ((FacetValue)object2).getQuery();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((FacetQuery)object2).getQuery();
                        Intrinsics.checkNotNull(object2);
                        object2 = ((FacetInternalQuery)object2).getValue();
                        stringBuilder.append((String)object2);
                    }
                    object2 = ":";
                    stringBuilder.append((String)object2);
                }
            }
        }
        if (string2 == null || (n3 = string2.length()) == 0) {
            string2 = "";
        }
        object = stringBuilder.toString();
        object2 = "toString(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        n4 = stringBuilder.length();
        if (n4 > 0) {
            n3 = stringBuilder.length() + -1;
            n4 = 0;
            object2 = null;
            object = stringBuilder.substring(0, n3);
        }
        return Ft2.a(string2, object);
    }

    public static /* synthetic */ Map getProductsParameter$default(NewQueryUtil newQueryUtil, ProductListQuery productListQuery, boolean bl2, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            bl2 = false;
        }
        return newQueryUtil.getProductsParameter(productListQuery, bl2);
    }

    private final void handleQueryParam(HashMap hashMap, ProductListQuery object) {
        String string2;
        int n3;
        boolean bl2;
        String string3;
        Object object2 = ((ProductListQuery)object).getAdaptiveSearchReplayResponse();
        Object object3 = null;
        if (object2 != null) {
            object2 = ((ProductListQuery)object).getAdaptiveSearchReplayResponse().getAutoSuggestSearchTerm();
            string3 = ((ProductListQuery)object).getAdaptiveSearchReplayResponse().getAutosuggestType();
        } else {
            bl2 = false;
            object2 = null;
            string3 = null;
        }
        String string4 = ((ProductListQuery)object).getSessionId();
        if (string4 != null && (n3 = string4.length()) != 0) {
            string4 = SESSION_ID;
            string2 = ((ProductListQuery)object).getSessionId();
            hashMap.put(string4, string2);
        }
        if ((string4 = ((ProductListQuery)object).getDeviceid()) != null && (n3 = string4.length()) != 0) {
            string4 = DEVICE_ID;
            string2 = ((ProductListQuery)object).getDeviceid();
            hashMap.put(string4, string2);
        }
        if (object2 != null) {
            string4 = AUTO_SUGEST_SEARCH_TERM;
            hashMap.put(string4, object2);
        }
        if (string3 != null) {
            object2 = AUTO_SUGGEST_TYPE;
            hashMap.put(object2, string3);
        }
        if ((object2 = ((ProductListQuery)object).getWidgetRecord()) != null) {
            object2 = ((ProductListQuery)object).getWidgetRecord();
            if (object2 != null && (object2 = ((WidgetRecord)object2).getWidgetID()) != null) {
                string3 = WIDGET_ID;
                hashMap.put(string3, object2);
            }
            if ((object2 = ((ProductListQuery)object).getWidgetRecord()) != null && (object2 = ((WidgetRecord)object2).getWidgetType()) != null) {
                hashMap.put(WIDGET_TYPE, object2);
                string3 = "USER";
                bl2 = ((String)object2).equals(string3);
                if (bl2 && (object2 = ((ProductListQuery)object).getWidgetRecord()) != null && (object2 = ((WidgetRecord)object2).getShowDefault()) != null) {
                    bl2 = (Boolean)object2;
                    string3 = SHOW_DEFAULT;
                    object2 = String.valueOf(bl2);
                    hashMap.put(string3, object2);
                }
            }
            if ((object2 = ((ProductListQuery)object).getWidgetRecord()) != null && (object2 = ((WidgetRecord)object2).getWidgetFilters()) != null) {
                string3 = WIDGET_QUERY;
                hashMap.put(string3, object2);
            }
            if ((object2 = ((ProductListQuery)object).getWidgetRecord()) != null && (object2 = ((WidgetRecord)object2).getWidgetName()) != null) {
                string3 = WIDGET_NAME;
                hashMap.put(string3, object2);
            }
            if ((object2 = ((ProductListQuery)object).getWidgetRecord()) != null && (object2 = ((WidgetRecord)object2).getWidgetMinProdCount()) != null) {
                string3 = WIDGET_MIN_PROD_COUNT;
                hashMap.put(string3, object2);
            }
            if ((object2 = ((ProductListQuery)object).getWidgetRecord()) != null) {
                object2 = ((WidgetRecord)object2).getShowViewAllWidget();
            } else {
                bl2 = false;
                object2 = null;
            }
            string3 = SHOW_VIEW_ALL_WIDGET;
            if (object2 != null) {
                object2 = ((ProductListQuery)object).getWidgetRecord();
                if (object2 != null) {
                    object3 = ((WidgetRecord)object2).getShowViewAllWidget();
                }
                object2 = String.valueOf(object3);
                hashMap.put(string3, object2);
            } else {
                object2 = "true";
                hashMap.put(string3, object2);
            }
        }
        object2 = ((ProductListQuery)object).getBrandCode();
        object3 = BRAND_CODE;
        if (object2 != null) {
            hashMap.put(object3, object2);
        }
        if (bl2 = ((ProductListQuery)object).isBrandMiniPLP()) {
            object2 = SHOW_FACETS;
            string3 = "false";
            hashMap.put(object2, string3);
            object = ((ProductListQuery)object).getBrandId();
            if (object != null) {
                hashMap.put(object3, object);
            }
        }
    }

    private final a53 processQueryString(String object) {
        boolean bl2;
        String string2;
        int n3;
        Object object2;
        int n4 = 0;
        a53 a532 = new a53(0);
        object = this.decode((String)object);
        Object object3 = "&\\w+=";
        Iterable iterable = fT1.a((String)object3, (String)object);
        int n7 = iterable.isEmpty();
        int n8 = 1;
        if (n7 == 0) {
            n7 = iterable.size();
            object2 = iterable.listIterator(n7);
            while ((n3 = object2.hasPrevious()) != 0) {
                string2 = (String)object2.previous();
                n3 = string2.length();
                if (n3 == 0) continue;
                iterable = iterable;
                n7 = object2.nextIndex() + n8;
                iterable = CollectionsKt.f0(iterable, n7);
                break;
            }
        } else {
            iterable = mz0_2.a;
        }
        iterable = iterable;
        object2 = new String[]{};
        iterable = iterable.toArray((T[])object2);
        object2 = new ArrayList();
        string2 = QUERY;
        ((ArrayList)object2).add(string2);
        object3 = Pattern.compile((String)object3);
        object = ((Pattern)object3).matcher((CharSequence)object);
        while (bl2 = ((Matcher)object).find()) {
            int n10;
            object3 = ((Matcher)object).group();
            n3 = ((String)object3).charAt(0);
            if (n3 == (n10 = 38)) {
                n3 = ((String)object3).length() - n8;
                if ((n3 = (int)((String)object3).charAt(n3)) == (n10 = 61)) {
                    Intrinsics.checkNotNull(object3);
                    n3 = ((String)object3).length() - n8;
                    object3 = ((String)object3).substring(n8, n3);
                    string2 = "substring(...)";
                    Intrinsics.checkNotNullExpressionValue(object3, string2);
                }
            }
            ((ArrayList)object2).add(object3);
        }
        int n14 = ((List)iterable).length;
        while (n4 < n14) {
            object3 = ((ArrayList)object2).get(n4);
            Intrinsics.checkNotNullExpressionValue(object3, "get(...)");
            object3 = (String)object3;
            List list = iterable[n4];
            n3 = ((String)((Object)list)).length();
            if (n3 > 0) {
                a532.put(object3, list);
            }
            ++n4;
        }
        return a532;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final Map getCategoryProductParameter(ProductListQuery var1_1) {
        block16: {
            block12: {
                block15: {
                    block14: {
                        block13: {
                            var2_3 = ":";
                            var3_4 = new HashMap<Object, Object>();
                            if (var1_1 == null) {
                                return var3_4;
                            }
                            var4_5 = var1_1.getStoreId();
                            if (var4_5 != null) {
                                var4_5 = "store";
                                var5_6 = var1_1.getStoreId();
                                var3_4.put(var4_5, var5_6);
                            }
                            if ((var4_5 = var1_1.getSelectedSort()) != null) {
                                var4_5 = var1_1.getSelectedSort().getCode();
                            } else {
                                var6_7 = 0;
                                var4_5 = null;
                            }
                            var5_6 = new StringBuilder();
                            var7_8 = var1_1.getQueryText();
                            var8_9 = TextUtils.isEmpty((CharSequence)var7_8);
                            if (var8_9) break block13;
                            var7_8 = var1_1.getQueryText();
                            var5_6.append((String)var7_8);
                            break block13;
                            catch (Exception var1_2) {
                                break block12;
                            }
                        }
                        var7_8 = "fields";
                        var9_10 = "FULL";
                        var3_4.put(var7_8, var9_10);
                        var7_8 = "urgencyDriverEnabled";
                        var9_10 = var1_1.getUrgencyDriverEnabled();
                        var9_10 = var9_10.toString();
                        var3_4.put(var7_8, var9_10);
                        var8_9 = TextUtils.isEmpty((CharSequence)var4_5);
                        var10_11 = 0;
                        var9_10 = null;
                        var11_12 = "query";
                        if (var8_9) break block14;
                        var7_8 = var1_1.getQueryText();
                        if (var7_8 == null) ** GOTO lbl-1000
                        var7_8 = var1_1.getQueryText();
                        var12_13 = "getQueryText(...)";
                        Intrinsics.checkNotNullExpressionValue(var7_8, var12_13);
                        Intrinsics.checkNotNull(var4_5);
                        var8_9 = StringsKt.F((CharSequence)var7_8, (CharSequence)var4_5, false);
                        if (var8_9) {
                            var2_3 = var1_1.getQueryText();
                            var3_4.put(var11_12, var2_3);
                        } else lbl-1000:
                        // 2 sources

                        {
                            Intrinsics.checkNotNull(var4_5);
                            var7_8 = new StringBuilder((String)var2_3);
                            var7_8.append((String)var4_5);
                            var2_3 = var7_8.toString();
                            var3_4.put(var11_12, var2_3);
                        }
                        break block15;
                    }
                    var2_3 = var1_1.getQueryText();
                    if (var2_3 != null) {
                        var2_3 = "";
                        var3_4.put(var11_12, var2_3);
                    }
                }
                var2_3 = var5_6.toString();
                var4_5 = "toString(...)";
                Intrinsics.checkNotNullExpressionValue(var2_3, (String)var4_5);
                var2_3 = this.processQueryString((String)var2_3);
                var6_7 = var2_3.c;
                while (var10_11 < var6_7) {
                    var5_6 = var2_3.l(var10_11);
                    if (var5_6 != null) {
                        var5_6 = var2_3.h(var10_11);
                        var7_8 = var2_3.l(var10_11);
                        var3_4.put(var5_6, var7_8);
                    }
                    ++var10_11;
                }
                var2_3 = var1_1.getPageType();
                if (var2_3 != null && (var13_14 = var2_3.length()) != 0) {
                    var2_3 = "pageType";
                    var4_5 = var1_1.getPageType();
                    var3_4.put(var2_3, var4_5);
                }
                var2_3 = "pageSize";
                var6_7 = var1_1.getPageSize();
                var4_5 = String.valueOf(var6_7);
                var3_4.put(var2_3, var4_5);
                var2_3 = "currentPage";
                var6_7 = var1_1.getCurrentPage();
                var4_5 = String.valueOf(var6_7);
                var3_4.put(var2_3, var4_5);
                var2_3 = "advfilter";
                var4_5 = "true";
                var3_4.put(var2_3, var4_5);
                this.handleQueryParam(var3_4, var1_1);
                break block16;
            }
            var2_3 = yn3_0.a;
            var2_3.e(var1_2);
        }
        return var3_4;
    }

    public final HashMap getCuratedWidgetApiQueryParam(WidgetRecord object, String string2) {
        String string3;
        Intrinsics.checkNotNullParameter(object, "widgetRecord");
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Object object2 = ((WidgetRecord)object).getWidgetID();
        if (object2 != null) {
            string3 = WIDGET_ID;
            hashMap.put(string3, object2);
        }
        if ((object2 = ((WidgetRecord)object).getWidgetType()) != null) {
            hashMap.put(WIDGET_LEVEL, object2);
            string3 = "USER";
            boolean bl2 = ((String)object2).equals(string3);
            if (bl2 && (object2 = ((WidgetRecord)object).getShowDefault()) != null) {
                bl2 = (Boolean)object2;
                string3 = SHOW_DEFAULT;
                object2 = String.valueOf(bl2);
                hashMap.put(string3, object2);
            }
        }
        if ((object2 = ((WidgetRecord)object).getWidgetName()) != null) {
            string3 = WIDGET_NAME;
            hashMap.put(string3, object2);
        }
        if ((object2 = ((WidgetRecord)object).getWidgetMinProdCount()) != null) {
            string3 = WIDGET_MIN_PROD_COUNT;
            hashMap.put(string3, object2);
        }
        if ((object = ((WidgetRecord)object).getCurrentStore()) != null) {
            object2 = STORE;
            hashMap.put(object2, object);
        }
        if (string2 != null) {
            object = hashMap.put(USER_ID, string2);
        }
        return hashMap;
    }

    public final Map getProductsParameter(ProductListQuery productListQuery, boolean bl2) {
        int n3;
        Intrinsics.checkNotNullParameter(productListQuery, "queryProductList");
        Object object = productListQuery.getSelectedSort();
        if (object != null) {
            object = productListQuery.getSelectedSort().getCode();
        } else {
            n3 = 0;
            object = null;
        }
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        CharSequence charSequence = new StringBuilder();
        String string2 = productListQuery.getQueryText();
        boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl3) {
            string2 = productListQuery.getQueryText();
            charSequence.append(string2);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)object))) {
            Intrinsics.checkNotNull(object);
            string2 = SORT;
            hashMap.put(string2, object);
        }
        if ((n3 = TextUtils.isEmpty((CharSequence)charSequence)) != 0) {
            object = "";
        } else {
            object = charSequence.toString();
            charSequence = "toString(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)charSequence);
        }
        hashMap.put(QUERY, object);
        object = String.valueOf(productListQuery.getPageSize());
        hashMap.put(PAGE_SIZE, object);
        n3 = productListQuery.getCurrentPage();
        object = String.valueOf(n3);
        hashMap.put(CURRENT_PAGE, object);
        hashMap.put(FIELDS, FULL);
        charSequence = "true";
        hashMap.put(ADVFILTER, charSequence);
        object = productListQuery.getUrgencyDriverEnabled();
        if (object != null) {
            object = productListQuery.getUrgencyDriverEnabled().toString();
            string2 = URGENCY_DRIVER_ENABLED;
            hashMap.put(string2, object);
        }
        object = "rilfnl";
        string2 = STORE;
        if (bl2) {
            String string3 = productListQuery.getStoreId();
            if (string3 != null) {
                hashMap.put(string2, object);
            }
            hashMap.put(OSPREY_SEARCH, charSequence);
            string3 = productListQuery.getPreviousSource();
            if (string3 != null && (bl2 = string3.length())) {
                string3 = PREVIOUS_SOURCE;
                object = productListQuery.getPreviousSource();
                hashMap.put(string3, object);
            }
        } else {
            String string4 = productListQuery.getStoreId();
            if (string4 != null) {
                boolean bl4;
                string4 = productListQuery.getStoreId();
                bl2 = b.i(string4, (String)(charSequence = "ajio"), bl4 = true);
                if (bl2) {
                    hashMap.put(string2, object);
                } else {
                    string4 = productListQuery.getStoreId();
                    hashMap.put(string2, string4);
                }
            }
        }
        this.handleQueryParam(hashMap, productListQuery);
        return hashMap;
    }

    /*
     * Exception decompiling
     */
    public final Map getSearchProductsParameter(ProductListQuery var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [8 : 187->194)] java.lang.Exception
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

