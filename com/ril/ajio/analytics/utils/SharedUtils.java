/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.ril.ajio.analytics.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class SharedUtils {
    public static final int $stable = 0;
    public static final SharedUtils INSTANCE;
    private static final String REDIRECTION_B = "b";
    private static final String REDIRECTION_C = "c";
    private static final String REDIRECTION_S = "s";
    private static final String REDIRECTION_SEARCH = "Search";
    private static final UserRepo userRepo;

    static {
        Object object = new SharedUtils();
        INSTANCE = object;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        userRepo = object = new UserRepo(aJIOApplication);
        $stable = 8;
    }

    private SharedUtils() {
    }

    public final String getCustomerSegmentId() {
        AJIOApplication.Companion.getClass();
        String string2 = UserInformation.getInstance((Context)AJIOApplication$a.a()).getUserSegementIds();
        Intrinsics.checkNotNullExpressionValue(string2, "getUserSegementIds(...)");
        return string2;
    }

    public final String getLoggedINStatus() {
        AJIOApplication.Companion.getClass();
        String string2 = UserInformation.getInstance((Context)AJIOApplication$a.a()).getLoggedInStatus();
        Intrinsics.checkNotNullExpressionValue(string2, "getLoggedInStatus(...)");
        return string2;
    }

    public final String getLoginStatus() {
        AJIOApplication.Companion.getClass();
        String string2 = UserInformation.getInstance((Context)AJIOApplication$a.a()).getUserStatusMessage();
        Intrinsics.checkNotNullExpressionValue(string2, "getUserStatusMessage(...)");
        return string2;
    }

    public final String getPreviousScreenName() {
        return bv_0.a(AnalyticsManager.Companion);
    }

    public final String getStoreType() {
        boolean bl2 = og1_1.c();
        String string2 = bl2 ? "luxe" : "ajio";
        return string2;
    }

    public final String getTypeOfRedirection(String string2) {
        boolean bl2;
        String string3;
        boolean bl3;
        String string4 = REDIRECTION_SEARCH;
        if (string2 != null && (bl3 = string2.equalsIgnoreCase(string3 = ProductsList.Companion.getSEARCH_PAGE()))) {
            return string4;
        }
        if (string2 != null && (bl3 = string2.equalsIgnoreCase(string3 = ProductsList.Companion.getCATEGORY_PAGE()))) {
            return REDIRECTION_C;
        }
        if (string2 != null && (bl3 = string2.equalsIgnoreCase(string3 = ProductsList.Companion.getCURATED_PAGE()))) {
            return REDIRECTION_S;
        }
        if (string2 != null && (bl2 = string2.equalsIgnoreCase(string3 = ProductsList.Companion.getBRAND_PAGE()))) {
            return REDIRECTION_B;
        }
        return string4;
    }

    public final String getUserId() {
        AJIOApplication.Companion.getClass();
        String string2 = UserInformation.getInstance((Context)AJIOApplication$a.a()).getUserId();
        Intrinsics.checkNotNullExpressionValue(string2, "getUserId(...)");
        return string2;
    }

    public final UserRepo getUserRepo() {
        return userRepo;
    }

    public final String getUserStatus() {
        AJIOApplication.Companion.getClass();
        String string2 = UserInformation.getInstance((Context)AJIOApplication$a.a()).getUserStatus();
        Intrinsics.checkNotNullExpressionValue(string2, "getUserStatus(...)");
        return string2;
    }

    public final String getUserType() {
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        jo_2 jo_22 = new jo_2((Context)aJIOApplication);
        return jo_22.f();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String[] trimProductId(String object) {
        String string2;
        String[] stringArray;
        block16: {
            int n3;
            int n4;
            block15: {
                Object object2;
                n4 = 2;
                stringArray = new String[n4];
                stringArray[0] = string2 = "";
                int n7 = 1;
                stringArray[n7] = string2;
                int n8 = TextUtils.isEmpty((CharSequence)object);
                if (n8 != 0) {
                    return stringArray;
                }
                if (object != null) {
                    int n10;
                    n8 = ((String)object).length();
                    if (n8 == (n10 = 10)) {
                        stringArray[0] = object;
                        stringArray[n7] = string2;
                    } else {
                        n8 = ((String)object).length();
                        if (n8 > (n10 = 9)) {
                            Object object3;
                            object2 = "_";
                            boolean bl2 = StringsKt.F((CharSequence)object, (CharSequence)object2, false);
                            if (bl2) {
                                stringArray = new String[]{object2};
                                n10 = 6;
                                object = StringsKt.a0((CharSequence)object, stringArray, false, 0, n10);
                                stringArray = new String[]{};
                                stringArray = object.toArray(stringArray);
                            } else {
                                object3 = ((String)object).substring(0, n10);
                                String string3 = "substring(...)";
                                Intrinsics.checkNotNullExpressionValue(object3, string3);
                                stringArray[0] = object3;
                                object = ((String)object).substring(n10);
                                Intrinsics.checkNotNullExpressionValue(object, string3);
                                stringArray[n7] = object;
                            }
                            object = stringArray;
                            object = stringArray;
                            Object object4 = object[n7];
                            n10 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
                            if (n10 == 0 && (object4 = object[n7]) != null && (n10 = (int)(b.s((String)object4, (String)object2, false) ? 1 : 0)) == n7) {
                                object4 = object[n7];
                                if (object4 != null) {
                                    object3 = new Regex((String)object2);
                                    object2 = ((Regex)object3).d((String)object4);
                                } else {
                                    n8 = 0;
                                    object2 = null;
                                }
                                object[n7] = object2;
                            }
                        } else {
                            stringArray[0] = object;
                        }
                    }
                }
                if ((n3 = stringArray.length) <= n7) break block15;
                object = stringArray;
                object = stringArray;
                object2 = object[n7];
                n8 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                if (n8 != 0) break block16;
            }
            if ((n3 = stringArray.length) >= n4) return stringArray;
            object = new String[n4];
            String string4 = stringArray[0];
            object[0] = string4;
            object[n7] = string2;
            return object;
        }
        object[n7] = string2;
        return stringArray;
    }
}

