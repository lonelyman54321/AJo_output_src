/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.ril.ajio.services.helper;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import com.ril.ajio.services.helper.UrlHelper$initApiHashMap$1;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class UrlHelper {
    public static final UrlHelper$Companion Companion;
    private static final String GCP_REPLICA_FILE_NAME = "gcp_replica_api.json";
    private static boolean ISPREVIEW = false;
    private static final String PREVIEW_PROD = "CMS Preview";
    private static final String PROD_API_NEW_FILE_NAME = "prod_api_new.json";
    private static final String PROD_URL = "https://www.ajio.com";
    private static final String SIT_FILE_NAME = "sit_api.json";
    private static final String UAT2_FILE_NAME = "uat2_api.json";
    private static final String UAT_FILE_NAME = "uat_api.json";
    private static UrlHelper urlHelper;
    private HashMap apiHashMap;
    private Context applicationContext;
    private String baseUrl = "";
    private String currentServer = "https://www.ajio.com";

    static {
        UrlHelper$Companion urlHelper$Companion;
        Companion = urlHelper$Companion = new UrlHelper$Companion(null);
    }

    private UrlHelper() {
        HashMap hashMap;
        this.apiHashMap = hashMap = new HashMap();
    }

    public /* synthetic */ UrlHelper(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ boolean access$getISPREVIEW$cp() {
        return ISPREVIEW;
    }

    public static final /* synthetic */ UrlHelper access$getUrlHelper$cp() {
        return urlHelper;
    }

    public static final /* synthetic */ void access$setISPREVIEW$cp(boolean bl2) {
        ISPREVIEW = bl2;
    }

    public static final /* synthetic */ void access$setUrlHelper$cp(UrlHelper urlHelper) {
        UrlHelper.urlHelper = urlHelper;
    }

    public static final UrlHelper getInstance() {
        return Companion.getInstance();
    }

    /*
     * Unable to fully structure code
     */
    private final String readApiFile(Context var1_1) {
        block33: {
            block30: {
                block27: {
                    var2_2 = null;
                    try {
                        var3_3 = this.isProdApiNewEnabled((Context)var1_1);
                    }
                    catch (IOException v0) {
                        ** continue;
                    }
                    var4_4 = this.currentServer;
                    if (var4_4 == null) break block26;
                    var5_5 = "https://www.ajio.com";
                    var6_6 = Intrinsics.areEqual(var4_4, var5_5);
                    var7_7 = 1;
                    if (var6_6 != 0) break block27;
                    var4_4 = this.currentServer;
                    var8_8 = "CMS Preview";
                    var6_6 = (int)b.i(var4_4, var8_8, (boolean)var7_7);
                    if (var6_6 == 0) ** break block28
                }
                if (var3_3 != 0) {
                    var9_9 = "prod_api_new.json";
                } else {
                    block26: {
                        block32: {
                            block31: {
                                block29: {
                                    var9_9 = this.currentServer;
                                    var6_6 = 0;
                                    var4_4 = null;
                                    if (var9_9 == null) break block29;
                                    var8_8 = "uat2";
                                    var3_3 = (int)StringsKt.F((CharSequence)var9_9, var8_8, false);
                                    if (var3_3 != var7_7) break block29;
                                    var9_9 = "uat2_api.json";
                                    break block30;
                                }
                                var9_9 = this.currentServer;
                                if (var9_9 == null) break block31;
                                var8_8 = "qa";
                                var3_3 = (int)StringsKt.F((CharSequence)var9_9, var8_8, false);
                                if (var3_3 != var7_7) break block31;
                                var9_9 = "uat_api.json";
                                break block30;
                            }
                            var9_9 = this.currentServer;
                            if (var9_9 == null) break block32;
                            var8_8 = "sit";
                            var3_3 = (int)StringsKt.F((CharSequence)var9_9, var8_8, false);
                            if (var3_3 != var7_7) break block32;
                            var9_9 = "sit_api.json";
                            break block30;
                        }
                        var9_9 = this.currentServer;
                        if (var9_9 == null) break block26;
                        var8_8 = "gcp";
                        var3_3 = (int)StringsKt.F((CharSequence)var9_9, var8_8, false);
                        if (var3_3 != var7_7) break block26;
                        var9_9 = "gcp_replica_api.json";
                        break block30;
                    }
                    var3_3 = 0;
                    var9_9 = null;
                }
            }
            if (var9_9 != null) {
                var6_6 = var9_9.length();
                if (var6_6 == 0) break block33;
                var1_1 = var1_1.getAssets();
                var1_1 = var1_1.open((String)var9_9);
                var9_9 = "open(...)";
                Intrinsics.checkNotNullExpressionValue(var1_1, (String)var9_9);
                var3_3 = var1_1.available();
                var9_9 = new byte[var3_3];
                var1_1.read((byte[])var9_9);
                var1_1.close();
                var1_1 = StandardCharsets.UTF_8;
                var4_4 = "UTF_8";
                Intrinsics.checkNotNullExpressionValue(var1_1, var4_4);
                var2_2 = var4_4 = new String((byte[])var9_9, (Charset)var1_1);
            }
        }
lbl95:
        // 2 sources

        return var2_2;
    }

    private final void setBaseUrl(String string2) {
        String string3;
        this.baseUrl = string2;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2 && !(bl2 = StringsKt.F(string2 = this.baseUrl, string3 = "https://", false))) {
            string2 = this.baseUrl;
            this.baseUrl = string2 = kp1_0.c(string3, string2);
        }
    }

    public final String addParams(String string2, HashMap object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(string2, "url");
        Object object2 = "params";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            char c2 = '?';
            boolean bl3 = StringsKt.G(string2, c2);
            if (bl3) {
                c2 = '&';
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(c2);
            string2 = stringBuilder.toString();
            Object k2 = object2.getKey();
            object2 = object2.getValue();
            stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(k2);
            stringBuilder.append("=");
            stringBuilder.append(object2);
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    public final String getApiUrl(String objectArray, String object, Object ... objectArray2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "urlName");
        Intrinsics.checkNotNullParameter(objectArray2, "formatArgs");
        Object object2 = this.applicationContext;
        Object object3 = null;
        String string2 = "applicationContext";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl2 = false;
            object2 = null;
        }
        bl2 = this.isProdApiNewEnabled((Context)object2);
        String string3 = "format(...)";
        int n3 = 0;
        Object object4 = "";
        if (bl2) {
            object2 = this.apiHashMap;
            if ((objectArray = (HashMap)((HashMap)object2).get(objectArray)) != null && !(bl2 = TextUtils.isEmpty((CharSequence)object))) {
                if ((objectArray = (String)objectArray.get(object)) != null) {
                    object4 = objectArray;
                }
                int n4 = objectArray2.length;
                if (n4 == 0) {
                    n3 = 1;
                }
                if ((n4 = n3 ^ 1) != 0) {
                    objectArray = StringCompanionObject.INSTANCE;
                    n4 = objectArray2.length;
                    objectArray = Arrays.copyOf(objectArray2, n4);
                    int n7 = objectArray.length;
                    object4 = xh2_0.a(objectArray, n7, (String)object4, string3);
                }
            }
            return object4;
        }
        object2 = this.currentServer;
        String string4 = PROD_URL;
        bl2 = Intrinsics.areEqual(object2, string4);
        if (!bl2 && !(bl2 = Intrinsics.areEqual(object2 = this.currentServer, string4 = PREVIEW_PROD))) {
            object2 = this.apiHashMap;
            if ((objectArray = (HashMap)((HashMap)object2).get(objectArray)) != null && !(bl2 = TextUtils.isEmpty((CharSequence)object))) {
                if ((objectArray = (String)objectArray.get(object)) != null) {
                    object4 = objectArray;
                }
                int n8 = objectArray2.length;
                if (n8 == 0) {
                    n3 = 1;
                }
                if ((n8 = n3 ^ 1) != 0) {
                    objectArray = StringCompanionObject.INSTANCE;
                    n8 = objectArray2.length;
                    objectArray = Arrays.copyOf(objectArray2, n8);
                    int n10 = objectArray.length;
                    object4 = xh2_0.a(objectArray, n10, (String)object4, string3);
                }
            }
        } else {
            object4 = "_";
            objectArray = UX.c("url_", (String)objectArray, (String)object4, (String)object);
            object = z40_0.Companion;
            object2 = this.applicationContext;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object2;
            }
            object.getClass();
            object = z40$a.a((Context)object3).a;
            object4 = ((ao0_0)object).b((String)objectArray);
            int n14 = objectArray2.length;
            if (n14 == 0) {
                n3 = 1;
            }
            if ((n14 = n3 ^ 1) != 0) {
                objectArray = StringCompanionObject.INSTANCE;
                n14 = objectArray2.length;
                objectArray = Arrays.copyOf(objectArray2, n14);
                int n15 = objectArray.length;
                object4 = xh2_0.a(objectArray, n15, (String)object4, string3);
            }
        }
        return object4;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String getCompleteUrl(String string2) {
        String string3;
        String string4 = "/";
        if (string2 != null) {
            StringBuilder stringBuilder;
            block15: {
                boolean bl2 = false;
                stringBuilder = null;
                bl2 = b.s(string2, string4, false);
                if (bl2) break block15;
                string2 = string4.concat(string2);
            }
            string4 = this.baseUrl;
            stringBuilder = new StringBuilder();
            stringBuilder.append(string4);
            stringBuilder.append(string2);
            return stringBuilder.toString();
        }
        try {
            string3 = this.baseUrl;
        }
        catch (Exception exception) {
            return string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        return stringBuilder.toString();
    }

    public final String getImageUrl(String string2) {
        if (string2 == null) {
            return "";
        }
        int n3 = string2.length();
        if (n3 == 0) {
            return string2;
        }
        String string3 = "http";
        boolean bl2 = false;
        String string4 = null;
        n3 = (int)(b.s(string2, string3, false) ? 1 : 0);
        if (n3 == 0) {
            string3 = "/";
            bl2 = b.s(string2, string3, false);
            if (bl2) {
                string3 = this.baseUrl;
                string2 = Ft2.a(string3, string2);
            } else {
                string4 = this.baseUrl;
                string2 = n1.a(string4, string3, string2);
            }
        }
        return string2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void initApiHashMap(Context var1_1) {
        synchronized (this) {
            block11: {
                block17: {
                    block13: {
                        block12: {
                            block16: {
                                block15: {
                                    block14: {
                                        block10: {
                                            var2_4 = "context";
                                            try {
                                                Intrinsics.checkNotNullParameter(var1_1, (String)var2_4);
                                                this.applicationContext = var1_1;
                                                var3_5 = this.isProdApiNewEnabled((Context)var1_1);
                                                var4_6 = this.currentServer;
                                                var5_7 = "https://www.ajio.com";
                                                var6_8 = Intrinsics.areEqual(var4_6, var5_7);
                                                var5_7 = null;
                                                var7_9 = true;
                                                if (var6_8 == 0 && (var6_8 = b.i((String)(var4_6 = this.currentServer), var8_10 = "CMS Preview", var7_9)) == 0) break block10;
                                            }
                                            catch (Throwable var1_2) {
                                                break block11;
                                            }
                                            if (!var3_5) break block10;
                                            var2_4 = z40_0.Companion;
                                            var2_4.getClass();
                                            var2_4 = z40$a.a((Context)var1_1);
                                            var2_4 = var2_4.a;
                                            var4_6 = "prod_api_new";
                                            var2_4 = var2_4.b((String)var4_6);
                                            ** GOTO lbl67
                                        }
                                        if ((var2_4 = this.currentServer) == null || (var3_5 = StringsKt.F((CharSequence)var2_4, (CharSequence)(var4_6 = "uat2"), false)) != var7_9) break block14;
                                        var2_4 = z40_0.Companion;
                                        var2_4.getClass();
                                        var2_4 = z40$a.a((Context)var1_1);
                                        var2_4 = var2_4.a;
                                        var4_6 = "uat2_api";
                                        var2_4 = var2_4.b((String)var4_6);
                                        ** GOTO lbl67
                                    }
                                    var2_4 = this.currentServer;
                                    if (var2_4 == null || (var3_5 = StringsKt.F((CharSequence)var2_4, (CharSequence)(var4_6 = "qa"), false)) != var7_9) break block15;
                                    var2_4 = z40_0.Companion;
                                    var2_4.getClass();
                                    var2_4 = z40$a.a((Context)var1_1);
                                    var2_4 = var2_4.a;
                                    var4_6 = "uat_api";
                                    var2_4 = var2_4.b((String)var4_6);
                                    ** GOTO lbl67
                                }
                                var2_4 = this.currentServer;
                                if (var2_4 == null || (var3_5 = StringsKt.F((CharSequence)var2_4, (CharSequence)(var4_6 = "sit"), false)) != var7_9) break block16;
                                var2_4 = z40_0.Companion;
                                var2_4.getClass();
                                var2_4 = z40$a.a((Context)var1_1);
                                var2_4 = var2_4.a;
                                var4_6 = "sit_api";
                                var2_4 = var2_4.b((String)var4_6);
                                ** GOTO lbl67
                            }
                            var2_4 = this.currentServer;
                            if (var2_4 != null && (var3_5 = StringsKt.F((CharSequence)var2_4, (CharSequence)(var4_6 = "gcp"), false)) == var7_9) {
                                var2_4 = z40_0.Companion;
                                var2_4.getClass();
                                var2_4 = z40$a.a((Context)var1_1);
                                var2_4 = var2_4.a;
                                var4_6 = "gcp_replica_api";
                                var2_4 = var2_4.b((String)var4_6);
lbl67:
                                // 5 sources

                                var6_8 = 0;
                                var4_6 = null;
                            } else {
                                var3_5 = false;
                                var2_4 = null;
                                var6_8 = 1;
                            }
                            if (var6_8 != 0) {
                                try {
                                    var1_1 = this.currentServer;
                                    var2_4 = "CMS Preview";
                                    var9_11 = b.i((String)var1_1, (String)var2_4, var7_9);
                                    if (var9_11) {
                                        UrlHelper.ISPREVIEW = var7_9;
                                    }
                                    break block12;
                                }
                                catch (Exception var1_3) {
                                    break block13;
                                }
                            }
                            if (var2_4 == null || (var6_8 = var2_4.length()) == 0) {
                                var2_4 = this.readApiFile((Context)var1_1);
                            }
                            var1_1 = new Gson();
                            var4_6 = new UrlHelper$initApiHashMap$1();
                            var4_6 = var4_6.getType();
                            var1_1 = var1_1.fromJson((String)var2_4, (Type)var4_6);
                            this.apiHashMap = var1_1 = (HashMap)var1_1;
                        }
                        var1_1 = "misc";
                        var2_4 = "backend";
                        var4_6 = new Object[]{};
                        var1_1 = this.getApiUrl((String)var1_1, (String)var2_4, var4_6);
                        this.setBaseUrl((String)var1_1);
                        break block17;
                    }
                    var2_4 = yn3_0.a;
                    var2_4.e(var1_3);
                }
                return;
            }
            throw var1_2;
        }
    }

    public final boolean isProdApiNewEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        z40_0.Companion.getClass();
        return z40$a.a((Context)context).a.a("is_prod_api_new");
    }

    public final boolean isUAT1Domain() {
        boolean bl2;
        Object object = Companion;
        String string2 = ((UrlHelper$Companion)object).getInstance().baseUrl;
        String string3 = "uat.";
        boolean bl3 = false;
        boolean bl4 = StringsKt.F(string2, string3, false);
        if (bl4 || (bl2 = StringsKt.F((CharSequence)(object = ((UrlHelper$Companion)object).getInstance().baseUrl), string2 = "qa.", false))) {
            bl3 = true;
        }
        return bl3;
    }

    public final boolean isUAT2Domain() {
        return StringsKt.F(UrlHelper.Companion.getInstance().baseUrl, "uat2.", false);
    }

    public final boolean isUATDomain() {
        boolean bl2;
        Object object = Companion;
        String string2 = ((UrlHelper$Companion)object).getInstance().baseUrl;
        String string3 = "ajiobeta.ril.com";
        boolean bl3 = false;
        boolean bl4 = StringsKt.F(string2, string3, false);
        if (bl4 || (bl4 = StringsKt.F(string2 = ((UrlHelper$Companion)object).getInstance().baseUrl, string3 = "10.129.49", false)) || (bl4 = StringsKt.F(string2 = ((UrlHelper$Companion)object).getInstance().baseUrl, string3 = "116.50.84", false)) || (bl4 = StringsKt.F(string2 = ((UrlHelper$Companion)object).getInstance().baseUrl, string3 = "cockpits.ajio.ril.com", false)) || (bl4 = StringsKt.F(string2 = ((UrlHelper$Companion)object).getInstance().baseUrl, string3 = "ajio-preview.ril.com", false)) || (bl4 = StringsKt.F(string2 = ((UrlHelper$Companion)object).getInstance().baseUrl, string3 = "qa.", false)) || (bl4 = StringsKt.F(string2 = ((UrlHelper$Companion)object).getInstance().baseUrl, string3 = "uat.", false)) || (bl2 = StringsKt.F((CharSequence)(object = ((UrlHelper$Companion)object).getInstance().baseUrl), string2 = "uat2.", false))) {
            bl3 = true;
        }
        return bl3;
    }

    public final boolean isUATServicesDomain() {
        boolean bl2;
        Object object = Companion;
        String string2 = ((UrlHelper$Companion)object).getInstance().baseUrl;
        String string3 = "uat.services.";
        boolean bl3 = false;
        boolean bl4 = StringsKt.F(string2, string3, false);
        if (bl4 || (bl2 = StringsKt.F((CharSequence)(object = ((UrlHelper$Companion)object).getInstance().baseUrl), string2 = "qa.services.", false))) {
            bl3 = true;
        }
        return bl3;
    }

    public final void setCurrentServer(String string2) {
        this.currentServer = string2;
    }
}

