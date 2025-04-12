/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.ril.ajio.login;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.login.CustomerStoreType$getDeviceUniqueClusterId$1$userDeviceIdCohortValueType$1;
import com.ril.ajio.login.CustomerStoreType$getLoginClusterId$1$userCohortValueType$1;
import com.ril.ajio.login.CustomerStoreType$getPageWiseClusterId$1$userCohortValueTypeV3$1;
import com.ril.ajio.services.data.Login.CustomerType$UserCohortValue;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class CustomerStoreType {
    public static final hh3_2 a;

    static {
        Dh0 dh0 = new Object();
        a = yr1_2.b(dh0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String a(String object, ScreenType object2) {
        int n3;
        Object object3;
        Object object4;
        int n4;
        Object object5;
        Object object6;
        String string2;
        String string3;
        block13: {
            block17: {
                int n7;
                block16: {
                    block14: {
                        block15: {
                            block12: {
                                Intrinsics.checkNotNullParameter(object2, "screenType");
                                string3 = "";
                                if (object == null) {
                                    object = string3;
                                }
                                boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                                string2 = "rilfnl_v1";
                                if (bl2 || (bl2 = ((String)object).equalsIgnoreCase((String)(object6 = ld3_2.STORE_AJIO.getStoreId())))) {
                                    object = string2;
                                }
                                object6 = CustomerStoreType.d();
                                object5 = h40_0.a;
                                boolean bl3 = h40_0.Y0();
                                object5 = bl3 ? CustomerStoreType.c(false, (UserInformation)object6, (ScreenType)((Object)object2), (String)object) : CustomerStoreType.b((String)object, (UserInformation)object6);
                                n4 = h40_0.Y0();
                                n7 = 1;
                                if (n4 == 0) break block12;
                                object2 = CustomerStoreType.c(n7 != 0, (UserInformation)object6, (ScreenType)((Object)object2), (String)object);
                                break block13;
                            }
                            object2 = ((UserInformation)object6).getUserDeviceIdCohortValue();
                            if (object2 == null) break block14;
                            object4 = new CustomerStoreType$getDeviceUniqueClusterId$1$userDeviceIdCohortValueType$1();
                            object3 = new Gson();
                            if ((object2 = (List)((Gson)object3).fromJson((String)object2, (Type)(object4 = ((TypeToken)object4).getType()))) == null) break block15;
                            object4 = object2;
                            object4 = (Collection)object2;
                            n4 = object4.isEmpty() ^ n7;
                            if (n4 != 0) break block16;
                        }
                        object4 = string3;
                        break block17;
                    }
                    object2 = string3;
                    break block13;
                }
                object2 = object2.iterator();
                block0: while (true) {
                    boolean bl4;
                    object4 = string3;
                    while (bl4 = object2.hasNext()) {
                        int n8;
                        object3 = (CustomerType$UserCohortValue)object2.next();
                        String string4 = ((CustomerType$UserCohortValue)object3).getKey();
                        if (string4 == null || (n8 = StringsKt.F(string4, (CharSequence)object, false)) != n7 || (string4 = ((CustomerType$UserCohortValue)object3).getValue()) == null || (n8 = string4.length()) == 0 || (object4 = ((CustomerType$UserCohortValue)object3).getValue()) != null) continue;
                        continue block0;
                    }
                    break;
                }
            }
            object2 = object4;
        }
        n4 = ((String)object5).length();
        if (n4 > 0) {
            object2 = ld3_2.STORE_AJIO.getStoreId();
            boolean bl5 = Intrinsics.areEqual(object, object2);
            if (!bl5) {
                boolean bl6 = StringsKt.F(string2, (CharSequence)object, false);
                if (!bl6) return object5;
            }
            object = Boolean.TRUE;
            ((UserInformation)object6).setCohortDataForGuestAjioStoreUser((String)object5, (Boolean)object);
            return object5;
        }
        object5 = ld3_2.STORE_AJIO;
        object4 = ((ld3_2)((Object)object5)).getStoreId();
        n4 = (int)(Intrinsics.areEqual(object, object4) ? 1 : 0);
        String string5 = "getCohortDataForGuestAjioStoreUser(...)";
        if ((n4 != 0 || (n4 = (int)(StringsKt.F(string2, (CharSequence)object, false) ? 1 : 0)) != 0) && (object4 = CustomerStoreType.d().getCohortDataForGuestAjioStoreUser()) != null && (n4 = ((String)object4).length()) != 0 && (n4 = (int)(Intrinsics.areEqual(object4 = CustomerStoreType.d().isAjioStoreGuestCohortValueFromCustomerApi(), object3 = Boolean.TRUE) ? 1 : 0)) != 0) {
            object = ((UserInformation)object6).getCohortDataForGuestAjioStoreUser();
            Intrinsics.checkNotNullExpressionValue(object, string5);
            return object;
        }
        n4 = ((String)object2).length();
        if (n4 > 0) {
            return object2;
        }
        object2 = h40_0.a;
        boolean bl7 = h40_0.V0();
        if (!bl7) return string3;
        object2 = ((ld3_2)((Object)object5)).getStoreId();
        bl7 = Intrinsics.areEqual(object, object2);
        if (!bl7) {
            n3 = StringsKt.F(string2, (CharSequence)object, false);
            if (n3 == 0) return string3;
        }
        if ((object = ((UserInformation)object6).getCohortLinkData()) == null || (n3 = ((String)object).length()) == 0) {
            object = CustomerStoreType.d().getCohortDataForGuestAjioStoreUser();
            if (object == null) return string3;
            n3 = ((String)object).length();
            if (n3 == 0) {
                return string3;
            }
        }
        if ((object = ((UserInformation)object6).getCohortLinkData()) != null && (n3 = ((String)object).length()) != 0) {
            object = ((UserInformation)object6).getCohortLinkData();
            Intrinsics.checkNotNullExpressionValue(object, "getCohortLinkData(...)");
            return object;
        }
        object = ((UserInformation)object6).getCohortDataForGuestAjioStoreUser();
        Intrinsics.checkNotNullExpressionValue(object, string5);
        return object;
    }

    public static String b(String object, UserInformation iterator) {
        Object object2;
        block5: {
            Intrinsics.checkNotNullParameter(iterator, "userInfo");
            iterator = ((UserInformation)((Object)iterator)).getUserCohortValue();
            object2 = "";
            if (iterator == null) break block5;
            Object object3 = new CustomerStoreType$getLoginClusterId$1$userCohortValueType$1();
            Gson gson = new Gson();
            if ((iterator = (List)gson.fromJson((String)((Object)iterator), (Type)(object3 = ((TypeToken)object3).getType()))) == null) break block5;
            object3 = iterator;
            object3 = (Collection)((Object)iterator);
            boolean bl2 = object3.isEmpty();
            boolean bl3 = true;
            if (!(bl2 ^= bl3)) break block5;
            iterator = iterator.iterator();
            object3 = object2;
            while (true) {
                Object object4;
                block7: {
                    block6: {
                        String string2;
                        int n3;
                        boolean bl4;
                        if (!(bl4 = iterator.hasNext())) break block6;
                        object4 = (CustomerType$UserCohortValue)iterator.next();
                        String string3 = ((CustomerType$UserCohortValue)object4).getKey();
                        if (string3 == null || (n3 = StringsKt.F(string3, string2 = String.valueOf(object), false)) != bl3 || (string3 = ((CustomerType$UserCohortValue)object4).getValue()) == null || (n3 = string3.length()) == 0) break block7;
                        object3 = ((CustomerType$UserCohortValue)object4).getValue();
                        if (object3 == null) {
                            object3 = object2;
                        }
                        if ((object4 = ((CustomerType$UserCohortValue)object4).getValue()) == null || (bl4 = StringsKt.F((CharSequence)object4, string3 = "earlyaccess", false)) != bl3) break block7;
                        AJIOApplication.Companion.getClass();
                        object = UserInformation.getInstance((Context)AJIOApplication$a.a());
                        ((UserInformation)object).setEarlyAccessMember(bl3);
                    }
                    object2 = object3;
                    break;
                }
                AJIOApplication.Companion.getClass();
                object4 = UserInformation.getInstance((Context)AJIOApplication$a.a());
                ((UserInformation)object4).setEarlyAccessMember(false);
            }
        }
        return object2;
    }

    public static String c(boolean bl2, UserInformation object, ScreenType object2, String string2) {
        Intrinsics.checkNotNullParameter(object, "userInfo");
        Object object3 = "screenType";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Object object4 = bl2 ? ((UserInformation)object).getUserDeviceIdCohortValueV3() : ((UserInformation)object).getUserCohortValueV3();
        object = "";
        if (object4 != null) {
            object3 = new CustomerStoreType$getPageWiseClusterId$1$userCohortValueTypeV3$1();
            Object object5 = new Gson();
            if ((object4 = (HashMap)((Gson)object5).fromJson((String)object4, (Type)(object3 = ((TypeToken)object3).getType()))) != null) {
                boolean bl3;
                boolean bl4;
                if (string2 != null) {
                    object3 = null;
                    object5 = "_v1";
                    bl4 = StringsKt.F(string2, (CharSequence)object5, false);
                    if (!bl4) {
                        string2 = string2.concat((String)object5);
                    }
                }
                if ((bl4 = object4.containsKey(string2)) && (object4 = (HashMap)object4.get(string2)) != null && (bl3 = ((HashMap)object4).containsKey(object2 = object2.getScreenName())) && (object4 = (String)((HashMap)object4).get(object2)) != null) {
                    object = object4;
                }
            }
        }
        return object;
    }

    public static UserInformation d() {
        Object object = a.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (UserInformation)object;
    }
}

