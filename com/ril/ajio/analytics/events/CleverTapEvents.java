/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.ril.ajio.analytics.events;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.services.data.Home.NativeCategoryNavigationListDetail;
import com.ril.ajio.services.data.user.LocationData;
import com.ril.ajio.services.data.user.UserProfileData;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class CleverTapEvents {
    public static final int $stable = 8;
    private final jo_2 appPreferences;
    private a cleverTapAPI;
    private final AJIOApplication context;

    public CleverTapEvents() {
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a();
        this.context = object;
        Object object2 = new jo_2((Context)object);
        this.appPreferences = object2;
        object = a.g((Context)object);
        Intrinsics.checkNotNull(object);
        try {
            this.cleverTapAPI = object;
        }
        catch (Exception exception) {
            object2 = yn3_0.a;
            ((yn3$a)object2).e(exception);
        }
    }

    private final void pushEvent(String string2) {
        String string3;
        boolean bl2;
        a a2 = this.cleverTapAPI;
        if (a2 != null && string2 != null && !(bl2 = (string3 = string2.trim()).isEmpty())) {
            bl2 = false;
            string3 = null;
            a2.p(string2, null);
        }
    }

    private final void pushEvent(String string2, HashMap hashMap) {
        a a2 = this.cleverTapAPI;
        if (a2 != null) {
            if (a2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cleverTapAPI");
                a2 = null;
            }
            a2.p(string2, hashMap);
        }
    }

    public final void accountManagement(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Account_Management", (HashMap)object);
    }

    public final void addedToCart(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Added_to_Cart", (HashMap)object);
    }

    public final void addedToCloset(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Added_to_Closet", (HashMap)object);
    }

    public final void categoryAutoSet(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Category_auto set", (HashMap)object);
    }

    public final void categoryChanged(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Category_changed", (HashMap)object);
    }

    public final void categorySelected(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Category_selected", (HashMap)object);
    }

    public final void checkoutInitiated(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Checkout_Initiated", (HashMap)object);
    }

    public final void couponApplied(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Coupon_Applied", (HashMap)object);
    }

    public final void filterApplied(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Filter_applied", (HashMap)object);
    }

    public final String getAttributionId() {
        Object object = this.cleverTapAPI;
        if (object != null) {
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cleverTapAPI");
                object = null;
            }
            object = ((a)object).b.c.f();
            Intrinsics.checkNotNull(object);
        } else {
            object = "";
        }
        return object;
    }

    public final void launchedUTM(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Launched_UTM", (HashMap)object);
    }

    public final void lineOfBuisness(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Lineofbusiness", (HashMap)object);
    }

    public final void loginComplete(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Login_complete", (HashMap)object);
    }

    public final void notiFrequentHours(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("notif_freq_hours", (HashMap)object);
    }

    public final void notificationDelivered(AnalyticsData analyticsData) {
        Intrinsics.checkNotNullParameter(analyticsData, "data");
        Object object = this.cleverTapAPI;
        if (object != null) {
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cleverTapAPI");
                object = null;
            }
            analyticsData = analyticsData.getBundle();
            object = ((a)object).b.f;
            ((we)object).c0((Bundle)analyticsData);
        }
    }

    public final void notigroup(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("notifgroup", (HashMap)object);
    }

    public final void pageViewed(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Page_viewed", (HashMap)object);
    }

    public final void paymentInitiated(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Payment_initiated", (HashMap)object);
    }

    public final void pdpViewed(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("PDP_Viewed", (HashMap)object);
    }

    public final void plpViewed(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("PLP_Viewed", (HashMap)object);
    }

    public final void productSort(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Product_sort", (HashMap)object);
    }

    public final void pushCategorySelectionData() {
        boolean bl2;
        Object object = this.appPreferences.e();
        if (object == null) {
            object = "";
        }
        if (bl2 = TextUtils.isEmpty((CharSequence)object)) {
            object = "Default";
        }
        object = p3.a("Shopping Category", (String)object);
        a a2 = this.cleverTapAPI;
        if (a2 != null) {
            a2.q((HashMap)object);
        }
    }

    public final void pushCategorySelectionData(NativeCategoryNavigationListDetail object) {
        Object object2 = object != null ? ((NativeCategoryNavigationListDetail)object).getNativeCategoryName() : null;
        if (object2 != null) {
            object = ((NativeCategoryNavigationListDetail)object).getNativeCategoryName();
            Intrinsics.checkNotNull(object);
        } else {
            object = this.appPreferences.e();
            if (object == null) {
                object = "";
            }
        }
        object = p3.a("Shopping Category", (String)object);
        object2 = this.cleverTapAPI;
        if (object2 != null) {
            ((a)object2).q((HashMap)object);
        }
    }

    public final void pushEvent(HashMap hashMap, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(hashMap, "chargeDetails");
        Intrinsics.checkNotNullParameter(arrayList, "items");
        a a2 = this.cleverTapAPI;
        if (a2 != null) {
            if (a2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cleverTapAPI");
                a2 = null;
            }
            a2.o(hashMap, arrayList);
        }
    }

    public final void pushLocaleData(LocationData object) {
        if (object != null) {
            int n3;
            String string2;
            int n4;
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            String string3 = ((LocationData)object).getPincode();
            if (string3 != null && (n4 = string3.length()) != 0) {
                string3 = ((LocationData)object).getPincode();
                Intrinsics.checkNotNull(string3);
                string2 = "pincode";
                hashMap.put(string2, string3);
            }
            if ((string3 = ((LocationData)object).getCity()) != null && (n4 = string3.length()) != 0) {
                string3 = ((LocationData)object).getCity();
                Intrinsics.checkNotNull(string3);
                string2 = "city";
                hashMap.put(string2, string3);
            }
            if ((string3 = ((LocationData)object).getState()) != null && (n4 = string3.length()) != 0) {
                string3 = ((LocationData)object).getState();
                Intrinsics.checkNotNull(string3);
                string2 = "state";
                hashMap.put(string2, string3);
            }
            if ((string3 = ((LocationData)object).getZone()) != null && (n4 = string3.length()) != 0) {
                object = ((LocationData)object).getZone();
                Intrinsics.checkNotNull(object);
                string3 = "zone";
                hashMap.put(string3, object);
            }
            object = this.appPreferences;
            string3 = "IDENTITY";
            string2 = "";
            if ((object = ((sw_0)object).getPreference(string3, string2)) != null && (n3 = ((String)object).length()) != 0) {
                object = this.appPreferences.getPreference(string3, string2);
                Intrinsics.checkNotNull(object);
                string3 = "Identity";
                hashMap.put(string3, object);
            }
            if ((object = this.cleverTapAPI) != null) {
                ((a)object).q(hashMap);
            }
        }
    }

    public final void pushNotifyMeEvent(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("notify_me_coming_soon", (HashMap)object);
    }

    public final void registrationComplete(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Registration_Complete", (HashMap)object);
    }

    public final void search(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Search", (HashMap)object);
    }

    public final void sendAdId(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        a a2 = this.cleverTapAPI;
        if (a2 != null) {
            object = ((AnalyticsData)object).getEventMap();
            a2.q((HashMap)object);
        }
    }

    public final void sendNotificationInfo(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Notification_Info", (HashMap)object);
    }

    public final void sendNotificationPermissionEvent(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("Notification_Permission_Status", (HashMap)object);
    }

    public final void sendNotifyMeEvent(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("notify_me", (HashMap)object);
    }

    public final void userLogin(UserProfileData object) {
        HashMap<CharSequence, Object> hashMap = new HashMap<CharSequence, Object>();
        if (object != null) {
            int n3;
            String string2;
            CharSequence charSequence = ((UserProfileData)object).getGenderType();
            if (charSequence != null) {
                charSequence = ((UserProfileData)object).getGenderType();
                string2 = "getGenderType(...)";
                Intrinsics.checkNotNullExpressionValue(charSequence, string2);
                n3 = ((String)charSequence).length();
                if (n3 > 0) {
                    charSequence = ((UserProfileData)object).getGenderType();
                    boolean bl2 = true;
                    n3 = (int)(b.i((String)charSequence, "male", bl2) ? 1 : 0);
                    string2 = "Gender";
                    if (n3 != 0) {
                        charSequence = "M";
                        hashMap.put(string2, charSequence);
                    } else {
                        String string3;
                        charSequence = ((UserProfileData)object).getGenderType();
                        n3 = (int)(b.i((String)charSequence, string3 = "female", bl2) ? 1 : 0);
                        if (n3 != 0) {
                            charSequence = "F";
                            hashMap.put(string2, charSequence);
                        }
                    }
                }
            }
            if ((n3 = TextUtils.isEmpty((CharSequence)(charSequence = ((UserProfileData)object).getFirstName()))) == 0) {
                charSequence = "FirstName";
                string2 = ((UserProfileData)object).getFirstName();
                hashMap.put(charSequence, string2);
            }
            if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(charSequence = ((UserProfileData)object).getLastName())) ? 1 : 0)) == 0) {
                charSequence = "LastName";
                string2 = ((UserProfileData)object).getLastName();
                hashMap.put(charSequence, string2);
            }
            if ((charSequence = ((UserProfileData)object).getIdentity()) != null) {
                charSequence = ((UserProfileData)object).getIdentity();
                string2 = "getIdentity(...)";
                Intrinsics.checkNotNullExpressionValue(charSequence, string2);
                n3 = ((String)charSequence).length();
                if (n3 > 0) {
                    charSequence = "Identity";
                    string2 = ((UserProfileData)object).getIdentity();
                    hashMap.put(charSequence, string2);
                }
            }
            if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(charSequence = ((UserProfileData)object).getMobileNumber())) ? 1 : 0)) == 0) {
                charSequence = "mobile";
                string2 = ((UserProfileData)object).getMobileNumber();
                hashMap.put(charSequence, string2);
            }
            if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(charSequence = ((UserProfileData)object).getDisplayUid())) ? 1 : 0)) == 0) {
                charSequence = "email";
                string2 = ((UserProfileData)object).getDisplayUid();
                hashMap.put(charSequence, string2);
            }
            if ((charSequence = ((UserProfileData)object).getMobileNumber()) != null && (n3 = ((String)charSequence).length()) != 0) {
                cp_1.Companion.getClass();
                cp$a.e().getClass();
                object = ((UserProfileData)object).getMobileNumber();
                string2 = "+91";
                charSequence = new StringBuilder(string2);
                ((StringBuilder)charSequence).append((String)object);
                object = ((StringBuilder)charSequence).toString();
                charSequence = "Phone";
                hashMap.put(charSequence, object);
            }
        }
        if ((object = this.cleverTapAPI) != null) {
            ((a)object).n(hashMap);
        }
    }

    public final void viewCart(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("View_cart", (HashMap)object);
    }

    public final void viewWishlist(AnalyticsData object) {
        Intrinsics.checkNotNullParameter(object, "data");
        object = ((AnalyticsData)object).getEventMap();
        this.pushEvent("View_wishlist", (HashMap)object);
    }
}

