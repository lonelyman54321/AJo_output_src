/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from Wn
 */
public final class wn_0 {
    public static final Map a;
    public static final Map b;
    public static final Map c;

    static {
        int n3 = 1;
        Pair[] pairArray = sn_0.ANON_ID;
        Object object = v80_0.USER_DATA;
        Object object2 = w80_0.ANON_ID;
        Object object3 = new Wn$c((v80_0)((Object)object), (w80_0)((Object)object2));
        object2 = new Pair(pairArray, object3);
        pairArray = sn_0.APP_USER_ID;
        Object object4 = w80_0.FB_LOGIN_ID;
        object3 = new Wn$c((v80_0)((Object)object), (w80_0)((Object)object4));
        object4 = new Pair(pairArray, object3);
        pairArray = sn_0.ADVERTISER_ID;
        Object object5 = w80_0.MAD_ID;
        object3 = new Wn$c((v80_0)((Object)object), (w80_0)((Object)object5));
        object5 = new Pair(pairArray, object3);
        pairArray = sn_0.PAGE_ID;
        Object object6 = w80_0.PAGE_ID;
        object3 = new Wn$c((v80_0)((Object)object), (w80_0)((Object)object6));
        object6 = new Pair(pairArray, object3);
        pairArray = sn_0.PAGE_SCOPED_USER_ID;
        Object object7 = w80_0.PAGE_SCOPED_USER_ID;
        object3 = new Wn$c((v80_0)((Object)object), (w80_0)((Object)object7));
        object7 = new Pair(pairArray, object3);
        pairArray = sn_0.ADV_TE;
        Object object8 = v80_0.APP_DATA;
        Object object9 = w80_0.ADV_TE;
        object3 = new Wn$c((v80_0)((Object)object8), (w80_0)((Object)object9));
        object9 = new Pair(pairArray, object3);
        pairArray = sn_0.APP_TE;
        Object object10 = w80_0.APP_TE;
        object3 = new Wn$c((v80_0)((Object)object8), (w80_0)((Object)object10));
        object10 = new Pair(pairArray, object3);
        pairArray = sn_0.CONSIDER_VIEWS;
        Object object11 = w80_0.CONSIDER_VIEWS;
        object3 = new Wn$c((v80_0)((Object)object8), (w80_0)((Object)object11));
        object11 = new Pair(pairArray, object3);
        pairArray = sn_0.DEVICE_TOKEN;
        Object object12 = w80_0.DEVICE_TOKEN;
        object3 = new Wn$c((v80_0)((Object)object8), (w80_0)((Object)object12));
        object12 = new Pair(pairArray, object3);
        pairArray = sn_0.EXT_INFO;
        Object object13 = w80_0.EXT_INFO;
        object3 = new Wn$c((v80_0)((Object)object8), (w80_0)((Object)object13));
        object13 = new Pair(pairArray, object3);
        pairArray = sn_0.INCLUDE_DWELL_DATA;
        Object object14 = w80_0.INCLUDE_DWELL_DATA;
        object3 = new Wn$c((v80_0)((Object)object8), (w80_0)((Object)object14));
        object14 = new Pair(pairArray, object3);
        pairArray = sn_0.INCLUDE_VIDEO_DATA;
        Object object15 = w80_0.INCLUDE_VIDEO_DATA;
        object3 = new Wn$c((v80_0)((Object)object8), (w80_0)((Object)object15));
        object15 = new Pair(pairArray, object3);
        pairArray = sn_0.INSTALL_REFERRER;
        Object object16 = object15;
        object15 = w80_0.INSTALL_REFERRER;
        object3 = new Wn$c((v80_0)((Object)object8), (w80_0)((Object)object15));
        object15 = new Pair(pairArray, object3);
        pairArray = sn_0.INSTALLER_PACKAGE;
        Object object17 = object15;
        object15 = w80_0.INSTALLER_PACKAGE;
        object3 = new Wn$c((v80_0)((Object)object8), (w80_0)((Object)object15));
        object15 = new Pair(pairArray, object3);
        pairArray = sn_0.RECEIPT_DATA;
        Object object18 = object15;
        object15 = w80_0.RECEIPT_DATA;
        object3 = new Wn$c((v80_0)((Object)object8), (w80_0)((Object)object15));
        object15 = new Pair(pairArray, object3);
        pairArray = sn_0.URL_SCHEMES;
        Object object19 = object15;
        object15 = w80_0.URL_SCHEMES;
        object3 = new Wn$c((v80_0)((Object)object8), (w80_0)((Object)object15));
        object15 = new Pair(pairArray, object3);
        pairArray = sn_0.USER_DATA;
        object3 = new Wn$c((v80_0)((Object)object), null);
        object = new Pair(pairArray, object3);
        object3 = new Pair[17];
        object3[0] = object2;
        object3[n3] = object4;
        object3[2] = object5;
        object3[3] = object6;
        object3[4] = object7;
        object3[5] = object9;
        object3[6] = object10;
        object3[7] = object11;
        object3[8] = object12;
        object3[9] = object13;
        object3[10] = object14;
        object3[11] = object16;
        object3[12] = object17;
        object3[13] = object18;
        object3[14] = object19;
        object3[15] = object15;
        object3[16] = object;
        a = fh1_2.i(object3);
        pairArray = ff0_0.EVENT_TIME;
        object15 = t80_0.EVENT_TIME;
        object3 = new Wn$b(null, (t80_0)((Object)object15));
        object15 = new Pair(pairArray, object3);
        pairArray = ff0_0.EVENT_NAME;
        object = t80_0.EVENT_NAME;
        object3 = new Wn$b(null, (t80_0)((Object)object));
        object = new Pair(pairArray, object3);
        pairArray = ff0_0.VALUE_TO_SUM;
        object2 = v80_0.CUSTOM_DATA;
        object4 = t80_0.VALUE_TO_SUM;
        object3 = new Wn$b((v80_0)((Object)object2), (t80_0)((Object)object4));
        object4 = new Pair(pairArray, object3);
        pairArray = ff0_0.CONTENT_IDS;
        object5 = t80_0.CONTENT_IDS;
        object3 = new Wn$b((v80_0)((Object)object2), (t80_0)((Object)object5));
        object5 = new Pair(pairArray, object3);
        pairArray = ff0_0.CONTENTS;
        object6 = t80_0.CONTENTS;
        object3 = new Wn$b((v80_0)((Object)object2), (t80_0)((Object)object6));
        object6 = new Pair(pairArray, object3);
        pairArray = ff0_0.CONTENT_TYPE;
        object7 = t80_0.CONTENT_TYPE;
        object3 = new Wn$b((v80_0)((Object)object2), (t80_0)((Object)object7));
        object7 = new Pair(pairArray, object3);
        pairArray = ff0_0.CURRENCY;
        object8 = t80_0.CURRENCY;
        object3 = new Wn$b((v80_0)((Object)object2), (t80_0)((Object)object8));
        object8 = new Pair(pairArray, object3);
        pairArray = ff0_0.DESCRIPTION;
        object9 = t80_0.DESCRIPTION;
        object3 = new Wn$b((v80_0)((Object)object2), (t80_0)((Object)object9));
        object9 = new Pair(pairArray, object3);
        pairArray = ff0_0.LEVEL;
        object10 = t80_0.LEVEL;
        object3 = new Wn$b((v80_0)((Object)object2), (t80_0)((Object)object10));
        object10 = new Pair(pairArray, object3);
        pairArray = ff0_0.MAX_RATING_VALUE;
        object11 = t80_0.MAX_RATING_VALUE;
        object3 = new Wn$b((v80_0)((Object)object2), (t80_0)((Object)object11));
        object11 = new Pair(pairArray, object3);
        pairArray = ff0_0.NUM_ITEMS;
        object12 = t80_0.NUM_ITEMS;
        object3 = new Wn$b((v80_0)((Object)object2), (t80_0)((Object)object12));
        object12 = new Pair(pairArray, object3);
        pairArray = ff0_0.PAYMENT_INFO_AVAILABLE;
        object13 = t80_0.PAYMENT_INFO_AVAILABLE;
        object3 = new Wn$b((v80_0)((Object)object2), (t80_0)((Object)object13));
        object13 = new Pair(pairArray, object3);
        pairArray = ff0_0.REGISTRATION_METHOD;
        object14 = t80_0.REGISTRATION_METHOD;
        object3 = new Wn$b((v80_0)((Object)object2), (t80_0)((Object)object14));
        object14 = new Pair(pairArray, object3);
        pairArray = ff0_0.SEARCH_STRING;
        object16 = object14;
        object14 = t80_0.SEARCH_STRING;
        object3 = new Wn$b((v80_0)((Object)object2), (t80_0)((Object)object14));
        object14 = new Pair(pairArray, object3);
        pairArray = ff0_0.SUCCESS;
        object17 = object14;
        object14 = t80_0.SUCCESS;
        object3 = new Wn$b((v80_0)((Object)object2), (t80_0)((Object)object14));
        object14 = new Pair(pairArray, object3);
        pairArray = ff0_0.ORDER_ID;
        object18 = object14;
        object14 = t80_0.ORDER_ID;
        object3 = new Wn$b((v80_0)((Object)object2), (t80_0)((Object)object14));
        object14 = new Pair(pairArray, object3);
        pairArray = ff0_0.AD_TYPE;
        object19 = object14;
        object14 = t80_0.AD_TYPE;
        object3 = new Wn$b((v80_0)((Object)object2), (t80_0)((Object)object14));
        object2 = new Pair(pairArray, object3);
        pairArray = new Pair[17];
        pairArray[0] = object15;
        pairArray[n3] = object;
        pairArray[2] = object4;
        pairArray[3] = object5;
        pairArray[4] = object6;
        pairArray[5] = object7;
        pairArray[6] = object8;
        pairArray[7] = object9;
        pairArray[8] = object10;
        pairArray[9] = object11;
        pairArray[10] = object12;
        pairArray[11] = object13;
        pairArray[12] = object16;
        pairArray[13] = object17;
        pairArray[14] = object18;
        pairArray[15] = object19;
        pairArray[16] = object2;
        b = fh1_2.i(pairArray);
        pairArray = u80_0.UNLOCKED_ACHIEVEMENT;
        object3 = new Pair("fb_mobile_achievement_unlocked", pairArray);
        pairArray = u80_0.ACTIVATED_APP;
        object15 = new Pair("fb_mobile_activate_app", pairArray);
        pairArray = u80_0.ADDED_PAYMENT_INFO;
        object = new Pair("fb_mobile_add_payment_info", pairArray);
        pairArray = u80_0.ADDED_TO_CART;
        object2 = new Pair("fb_mobile_add_to_cart", pairArray);
        pairArray = u80_0.ADDED_TO_WISHLIST;
        object4 = new Pair("fb_mobile_add_to_wishlist", pairArray);
        pairArray = u80_0.COMPLETED_REGISTRATION;
        object5 = new Pair("fb_mobile_complete_registration", pairArray);
        pairArray = u80_0.VIEWED_CONTENT;
        object6 = new Pair("fb_mobile_content_view", pairArray);
        pairArray = u80_0.INITIATED_CHECKOUT;
        object7 = new Pair("fb_mobile_initiated_checkout", pairArray);
        pairArray = u80_0.ACHIEVED_LEVEL;
        object8 = new Pair("fb_mobile_level_achieved", pairArray);
        pairArray = u80_0.PURCHASED;
        object9 = new Pair("fb_mobile_purchase", pairArray);
        pairArray = u80_0.RATED;
        object10 = new Pair("fb_mobile_rate", pairArray);
        pairArray = u80_0.SEARCHED;
        object11 = new Pair("fb_mobile_search", pairArray);
        pairArray = u80_0.SPENT_CREDITS;
        object12 = new Pair("fb_mobile_spent_credits", pairArray);
        pairArray = u80_0.COMPLETED_TUTORIAL;
        object13 = new Pair("fb_mobile_tutorial_completion", pairArray);
        pairArray = new Pair[14];
        pairArray[0] = object3;
        pairArray[n3] = object15;
        pairArray[2] = object;
        pairArray[3] = object2;
        pairArray[4] = object4;
        pairArray[5] = object5;
        pairArray[6] = object6;
        pairArray[7] = object7;
        pairArray[8] = object8;
        pairArray[9] = object9;
        pairArray[10] = object10;
        pairArray[11] = object11;
        pairArray[12] = object12;
        pairArray[13] = object13;
        c = fh1_2.i(pairArray);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object a(Object var0, String var1_1) {
        var2_4 = 0;
        var3_5 = 2;
        var4_6 = 1;
        Intrinsics.checkNotNullParameter(var1_1 /* !! */ , "field");
        Intrinsics.checkNotNullParameter(var0, "value");
        Wn$d.Companion.getClass();
        Intrinsics.checkNotNullParameter(var1_1 /* !! */ , "rawValue");
        var5_7 = sn_0.EXT_INFO.getRawValue();
        var6_8 = Intrinsics.areEqual(var1_1 /* !! */ , var5_7);
        var7_9 = false;
        var8_10 = null;
        if (var6_8) {
            var1_1 /* !! */  = Wn$d.ARRAY;
        } else {
            var5_7 = sn_0.URL_SCHEMES.getRawValue();
            var6_8 = Intrinsics.areEqual(var1_1 /* !! */ , var5_7);
            if (var6_8) {
                var1_1 /* !! */  = Wn$d.ARRAY;
            } else {
                var5_7 = ff0_0.CONTENT_IDS.getRawValue();
                var6_8 = Intrinsics.areEqual(var1_1 /* !! */ , var5_7);
                if (var6_8) {
                    var1_1 /* !! */  = Wn$d.ARRAY;
                } else {
                    var5_7 = ff0_0.CONTENTS.getRawValue();
                    var6_8 = Intrinsics.areEqual(var1_1 /* !! */ , var5_7);
                    if (var6_8) {
                        var1_1 /* !! */  = Wn$d.ARRAY;
                    } else {
                        var5_7 = Wn$a.OPTIONS.getRawValue();
                        var6_8 = Intrinsics.areEqual(var1_1 /* !! */ , var5_7);
                        if (var6_8) {
                            var1_1 /* !! */  = Wn$d.ARRAY;
                        } else {
                            var5_7 = sn_0.ADV_TE.getRawValue();
                            var6_8 = Intrinsics.areEqual(var1_1 /* !! */ , var5_7);
                            if (var6_8) {
                                var1_1 /* !! */  = Wn$d.BOOL;
                            } else {
                                var5_7 = sn_0.APP_TE.getRawValue();
                                var6_8 = Intrinsics.areEqual(var1_1 /* !! */ , var5_7);
                                if (var6_8) {
                                    var1_1 /* !! */  = Wn$d.BOOL;
                                } else {
                                    var5_7 = ff0_0.EVENT_TIME.getRawValue();
                                    var9_11 = (int)Intrinsics.areEqual(var1_1 /* !! */ , var5_7);
                                    if (var9_11 != 0) {
                                        var1_1 /* !! */  = Wn$d.INT;
                                    } else {
                                        var9_11 = 0;
                                        var1_1 /* !! */  = null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        var6_8 = var0 instanceof String;
        if (var6_8) {
            var5_7 = var0;
            var5_7 = (String)var0;
        } else {
            var6_8 = false;
            var5_7 = null;
        }
        if (var1_1 /* !! */  == null) return var0;
        if (var5_7 == null) {
            return var0;
        }
        var10_12 /* !! */  = Wn$e.$EnumSwitchMapping$0;
        var9_11 = var1_1 /* !! */ .ordinal();
        if ((var9_11 = var10_12 /* !! */ [var9_11]) != var4_6) {
            if (var9_11 != var3_5) {
                var2_4 = 3;
                if (var9_11 == var2_4) {
                    return StringsKt.toIntOrNull(var0.toString());
                }
                var0 = new NoWhenBranchMatchedException();
                throw var0;
            }
            var0 = StringsKt.toIntOrNull((String)var5_7);
            if (var0 == null) return var8_10;
            var11_13 = var0.intValue();
            if (var11_13 == 0) return (boolean)var2_4;
            var2_4 = 1;
            return (boolean)var2_4;
        }
        try {
            var1_1 /* !! */  = new JSONArray((String)var5_7);
            var1_1 /* !! */  = lz3_0.h((JSONArray)var1_1 /* !! */ );
            var5_7 = new ArrayList();
            var1_1 /* !! */  = var1_1 /* !! */ .iterator();
lbl83:
            // 2 sources

            while (true) {
                var7_9 = var1_1 /* !! */ .hasNext();
                if (var7_9 == false) return var5_7;
                var8_10 = var1_1 /* !! */ .next();
                var8_10 = (String)var8_10;
                break;
            }
        }
        catch (JSONException var1_2) {
            ** GOTO lbl107
        }
        try {
            var10_12 /* !! */  = (int[])new JSONObject;
            var10_12 /* !! */ ((String)var8_10);
            var8_10 = lz3_0.i((JSONObject)var10_12 /* !! */ );
            ** GOTO lbl-1000
        }
        catch (JSONException v0) {
            try {
                var10_12 /* !! */  = (int[])new JSONArray;
                var10_12 /* !! */ ((String)var8_10);
                var8_10 = lz3_0.h((JSONArray)var10_12 /* !! */ );
            }
            catch (JSONException v1) {
                ** continue;
            }
lbl-1000:
            // 3 sources

            {
                while (true) {
                    var5_7.add(var8_10);
                    ** continue;
                    break;
                }
            }
lbl107:
            // 1 sources

            var5_7 = sx1.d;
            var5_7 = Ax1.APP_EVENTS;
            var12_14 = new Object[var3_5];
            var12_14[0] = var0;
            var12_14[var4_6] = var1_2;
            var1_3 = "\n transformEvents JSONException: \n%s\n%s";
            sx1$a.b((Ax1)var5_7, "AppEventsConversionsAPITransformer", var1_3, var12_14);
            return Unit.a;
        }
    }
}

