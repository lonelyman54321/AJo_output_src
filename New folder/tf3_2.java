/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.webkit.URLUtil
 */
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from tF3
 */
public final class tf3_2 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a(int n3, String object) {
        int n4;
        Object object2;
        Object[] objectArray;
        String string2;
        Object object3;
        block27: {
            block26: {
                Object object4;
                Object object5;
                int n7;
                int n8;
                block25: {
                    object3 = "encodedUrl";
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    n8 = TextUtils.isEmpty((CharSequence)object);
                    string2 = "";
                    objectArray = null;
                    n7 = 0;
                    object5 = null;
                    if (n8 != 0) break block26;
                    object = ((Object)StringsKt.m0((CharSequence)object)).toString();
                    object3 = " ";
                    object4 = "%20";
                    object2 = tf3_2.b(n3, (String)(object = b.n((String)object, (String)object3, (String)object4, false)));
                    n4 = URLUtil.isValidUrl((String)object2);
                    if (n4 != 0) {
                        block24: {
                            try {
                                object = new URL((String)object2);
                                object = ((URL)object).getHost();
                            }
                            catch (MalformedURLException malformedURLException) {
                                n4 = 0;
                                object = null;
                                break block24;
                            }
                            try {
                                n8 = TextUtils.isEmpty((CharSequence)object);
                                if (n8 != 0) {
                                    object3 = UrlHelper.Companion;
                                    object3 = ((UrlHelper$Companion)object3).getInstance();
                                    object2 = ((UrlHelper)object3).getCompleteUrl((String)object2);
                                }
                                break block25;
                            }
                            catch (MalformedURLException malformedURLException) {}
                        }
                        object4 = yn3_0.a;
                        ((yn3$a)object4).e((Throwable)object3);
                        object3 = UrlHelper.Companion.getInstance();
                        object2 = ((UrlHelper)object3).getCompleteUrl((String)object2);
                    } else {
                        object2 = UrlHelper.Companion.getInstance().getCompleteUrl((String)object2);
                        n4 = 0;
                        object = null;
                    }
                }
                if (object2 != null) {
                    n8 = ((String)object2).length();
                    if (n8 > 0) {
                        n8 = 1;
                    } else {
                        n8 = 0;
                        object3 = null;
                    }
                    object5 = n8 != 0;
                }
                Intrinsics.checkNotNull(object5);
                n8 = (int)(((Boolean)object5).booleanValue() ? 1 : 0);
                if (n8 != 0) {
                    String string3;
                    object3 = "?site=rilfnl&uiel=Mobile&isAppsFlag=true";
                    n7 = StringsKt.F((CharSequence)object2, (CharSequence)object3, false);
                    if (n7 != 0) {
                        object2 = b.n((String)object2, (String)object3, string2, false);
                    } else {
                        object3 = "&site=rilfnl&uiel=Mobile&isAppsFlag=true";
                        n7 = StringsKt.F((CharSequence)object2, (CharSequence)object3, false);
                        if (n7 != 0) {
                            object2 = b.n((String)object2, (String)object3, string2, false);
                        } else {
                            object3 = "?uiel=Mobile&isAppsFlag=true";
                            n7 = StringsKt.F((CharSequence)object2, (CharSequence)object3, false);
                            if (n7 != 0) {
                                object2 = b.n((String)object2, (String)object3, string2, false);
                            } else {
                                object3 = "&uiel=Mobile&isAppsFlag=true";
                                n7 = (int)(StringsKt.F((CharSequence)object2, (CharSequence)object3, false) ? 1 : 0);
                                if (n7 != 0) {
                                    object2 = b.n((String)object2, (String)object3, string2, false);
                                }
                            }
                        }
                    }
                    object3 = "#";
                    n7 = StringsKt.F((CharSequence)object2, (CharSequence)object3, false);
                    if (n7 != 0) {
                        n7 = 6;
                        int n10 = StringsKt.O((CharSequence)object2, (String)object3, 0, false, n7);
                        object4 = ((String)object2).substring(0, n10);
                        string3 = "substring(...)";
                        Intrinsics.checkNotNullExpressionValue(object4, string3);
                        n8 = StringsKt.O((CharSequence)object2, (String)object3, 0, false, n7);
                        n7 = ((String)object2).length();
                        object2 = ((String)object2).substring(n8, n7);
                        Intrinsics.checkNotNullExpressionValue(object2, string3);
                        object3 = object2;
                        object2 = object4;
                    } else {
                        object3 = string2;
                    }
                    object5 = UrlHelper.Companion.getInstance().getBaseUrl();
                    n7 = (int)(StringsKt.F((CharSequence)object2, (CharSequence)object5, false) ? 1 : 0);
                    object4 = "?uiel=Mobile&site=rilfnl&isAppsFlag=true";
                    string3 = "&uiel=Mobile&site=rilfnl&isAppsFlag=true";
                    String string4 = "?";
                    if (n7 != 0) {
                        n4 = (int)(StringsKt.F((CharSequence)object2, string4, false) ? 1 : 0);
                        object2 = n4 != 0 ? ((String)object2).concat(string3) : ((String)object2).concat((String)object4);
                    } else {
                        cp_1.Companion.getClass();
                        object5 = cp$a.e();
                        object5.getClass();
                        n4 = (int)(cp_1.H((String)object) ? 1 : 0);
                        if (n4 != 0) {
                            n4 = (int)(StringsKt.F((CharSequence)object2, string4, false) ? 1 : 0);
                            object2 = n4 != 0 ? ((String)object2).concat(string3) : ((String)object2).concat((String)object4);
                        }
                    }
                    n4 = ((String)object3).length();
                    if (n4 > 0) {
                        object2 = Ft2.a((String)object2, (String)object3);
                    }
                }
                break block27;
            }
            object2 = tf3_2.b(n3, null);
        }
        object = yn3_0.a;
        object3 = kp1_0.c("webLinkUrl: ", (String)object2);
        objectArray = new Object[]{};
        ((yn3$a)object).a((String)object3, objectArray);
        if (object2 == null) return object2;
        n4 = ((String)object2).length();
        if (n4 != 0) return object2;
        return string2;
    }

    public static String b(int n3, String object) {
        Object object2;
        Object object3;
        String string2 = "misc";
        Object[] objectArray = null;
        if (object == null) {
            object = UrlHelper.Companion.getInstance();
            object3 = "terms_and_condition";
            object2 = new Object[]{};
            object = ((UrlHelper)object).getApiUrl(string2, (String)object3, (Object[])object2);
        }
        object3 = UrlHelper.Companion;
        object2 = ((UrlHelper$Companion)object3).getInstance();
        String string3 = "privacy_policy_link";
        Object[] objectArray2 = new Object[0];
        int n4 = ((String)(object2 = ((UrlHelper)object2).getApiUrl(string2, string3, objectArray2))).length();
        if (n4 == 0) {
            object2 = "https://www.ajio.com/privacypolicy?uiel=Mobile&isAppsFlag=true";
        }
        if (n3 != (n4 = 11)) {
            n4 = 12;
            if (n3 != n4) {
                string2 = "?site=rilfnl&uiel=Mobile&isAppsFlag=true";
                int n7 = 14;
                string3 = "?uiel=Mobile&isAppsFlag=true";
                if (n3 != n7) {
                    n7 = 16;
                    if (n3 != n7) {
                        int n8 = 24;
                        if (n3 == n8) {
                            object = object2;
                        }
                    } else {
                        n3 = (int)(StringsKt.F((CharSequence)object, string3, false) ? 1 : 0);
                        if (n3 == 0) {
                            object = ((String)object).concat(string2);
                        }
                    }
                } else {
                    n3 = (int)(StringsKt.F((CharSequence)object, string3, false) ? 1 : 0);
                    if (n3 == 0) {
                        object = ((String)object).concat(string2);
                    }
                }
            } else {
                UrlHelper urlHelper = ((UrlHelper$Companion)object3).getInstance();
                objectArray = new Object[]{};
                object = urlHelper.getApiUrl(string2, "about_us", objectArray);
            }
        } else {
            UrlHelper urlHelper = ((UrlHelper$Companion)object3).getInstance();
            objectArray = new Object[]{};
            object = urlHelper.getApiUrl(string2, "contact_us", objectArray);
        }
        return object;
    }
}

