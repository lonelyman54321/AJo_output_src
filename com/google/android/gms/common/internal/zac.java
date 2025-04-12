/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 */
package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.R$string;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

public final class zac {
    private static final a53 zaa;
    private static Locale zab;

    static {
        a53 a532;
        zaa = a532 = new a53();
    }

    public static String zaa(Context object) {
        String string2 = object.getPackageName();
        Object object2 = Wrappers.packageManager(object);
        object2 = ((PackageManagerWrapper)object2).getApplicationLabel(string2);
        try {
            return object2.toString();
        }
        catch (PackageManager.NameNotFoundException | NullPointerException throwable) {
            object = object.getApplicationInfo().name;
            boolean bl2 = TextUtils.isEmpty((CharSequence)object);
            if (bl2) {
                return string2;
            }
            return object;
        }
    }

    public static String zab(Context context, int n3) {
        context = context.getResources();
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    return context.getString(17039370);
                }
                n3 = com.google.android.gms.base.R$string.common_google_play_services_enable_button;
                return context.getString(n3);
            }
            n3 = com.google.android.gms.base.R$string.common_google_play_services_update_button;
            return context.getString(n3);
        }
        n3 = com.google.android.gms.base.R$string.common_google_play_services_install_button;
        return context.getString(n3);
    }

    public static String zac(Context context, int n3) {
        int n4 = 1;
        Resources resources = context.getResources();
        String string2 = zac.zaa(context);
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    n7 = 5;
                    if (n3 != n7) {
                        n7 = 7;
                        if (n3 != n7) {
                            n7 = 9;
                            if (n3 != n7) {
                                n7 = 20;
                                if (n3 != n7) {
                                    switch (n3) {
                                        default: {
                                            int n8 = R$string.common_google_play_services_unknown_issue;
                                            Object[] objectArray = new Object[n4];
                                            objectArray[0] = string2;
                                            return resources.getString(n8, objectArray);
                                        }
                                        case 18: {
                                            int n10 = com.google.android.gms.base.R$string.common_google_play_services_updating_text;
                                            Object[] objectArray = new Object[n4];
                                            objectArray[0] = string2;
                                            return resources.getString(n10, objectArray);
                                        }
                                        case 17: {
                                            return zac.zag(context, "common_google_play_services_sign_in_failed_text", string2);
                                        }
                                        case 16: 
                                    }
                                    return zac.zag(context, "common_google_play_services_api_unavailable_text", string2);
                                }
                                return zac.zag(context, "common_google_play_services_restricted_profile_text", string2);
                            }
                            int n14 = com.google.android.gms.base.R$string.common_google_play_services_unsupported_text;
                            Object[] objectArray = new Object[n4];
                            objectArray[0] = string2;
                            return resources.getString(n14, objectArray);
                        }
                        return zac.zag(context, "common_google_play_services_network_error_text", string2);
                    }
                    return zac.zag(context, "common_google_play_services_invalid_account_text", string2);
                }
                int n15 = com.google.android.gms.base.R$string.common_google_play_services_enable_text;
                Object[] objectArray = new Object[n4];
                objectArray[0] = string2;
                return resources.getString(n15, objectArray);
            }
            int n16 = DeviceProperties.isWearableWithoutPlayStore(context);
            if (n16 != 0) {
                n16 = com.google.android.gms.base.R$string.common_google_play_services_wear_update_text;
                return resources.getString(n16);
            }
            n16 = com.google.android.gms.base.R$string.common_google_play_services_update_text;
            Object[] objectArray = new Object[n4];
            objectArray[0] = string2;
            return resources.getString(n16, objectArray);
        }
        int n17 = com.google.android.gms.base.R$string.common_google_play_services_install_text;
        Object[] objectArray = new Object[n4];
        objectArray[0] = string2;
        return resources.getString(n17, objectArray);
    }

    public static String zad(Context context, int n3) {
        int n4 = 6;
        if (n3 != n4 && n3 != (n4 = 19)) {
            return zac.zac(context, n3);
        }
        String string2 = zac.zaa(context);
        return zac.zag(context, "common_google_play_services_resolution_required_text", string2);
    }

    public static String zae(Context context, int n3) {
        int n4 = 6;
        String string2 = n3 == n4 ? zac.zah(context, "common_google_play_services_resolution_required_title") : zac.zaf(context, n3);
        if (string2 == null) {
            context = context.getResources();
            n3 = com.google.android.gms.base.R$string.common_google_play_services_notification_ticker;
            return context.getString(n3);
        }
        return string2;
    }

    public static String zaf(Context context, int n3) {
        Resources resources = context.getResources();
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    int n7 = 5;
                    if (n3 != n7) {
                        n7 = 7;
                        if (n3 != n7) {
                            n7 = 17;
                            if (n3 != n7) {
                                n7 = 20;
                                if (n3 != n7) {
                                    return null;
                                }
                                return zac.zah(context, "common_google_play_services_restricted_profile_title");
                            }
                            return zac.zah(context, "common_google_play_services_sign_in_failed_title");
                        }
                        return zac.zah(context, "common_google_play_services_network_error_title");
                    }
                    return zac.zah(context, "common_google_play_services_invalid_account_title");
                }
                int n8 = com.google.android.gms.base.R$string.common_google_play_services_enable_title;
                return resources.getString(n8);
            }
            int n10 = com.google.android.gms.base.R$string.common_google_play_services_update_title;
            return resources.getString(n10);
        }
        int n14 = com.google.android.gms.base.R$string.common_google_play_services_install_title;
        return resources.getString(n14);
    }

    private static String zag(Context object, String object2, String string2) {
        Object[] objectArray = object.getResources();
        if ((object = zac.zah(object, (String)object2)) == null) {
            int n3 = R$string.common_google_play_services_unknown_issue;
            object = objectArray.getString(n3);
        }
        object2 = objectArray.getConfiguration().locale;
        objectArray = new Object[]{string2};
        return String.format((Locale)object2, (String)object, objectArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String zah(Context object, String string2) {
        Object object2 = null;
        a53 a532 = zaa;
        synchronized (a532) {
            Throwable throwable2;
            block10: {
                int n3;
                Object object3;
                Object object4;
                block9: {
                    try {
                        object4 = object.getResources();
                        object4 = object4.getConfiguration();
                        int n4 = Build.VERSION.SDK_INT;
                        int n7 = 24;
                        if (n4 >= n7) {
                            object4 = Q40.a((Configuration)object4);
                            qw1 qw12 = new qw1(object4);
                            object3 = new jw1(qw12);
                        } else {
                            object4 = ((Configuration)object4).locale;
                            n4 = 1;
                            object3 = new Locale[n4];
                            object3[0] = object4;
                            object3 = jw1.a(object3);
                        }
                        object4 = object3.a;
                        object2 = object4.get(0);
                        object4 = zab;
                        n3 = ((Locale)object2).equals(object4);
                        if (n3 != 0) break block9;
                        a532.clear();
                        zab = object2;
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                }
                object2 = a532.get(string2);
                if ((object2 = (String)object2) != null) {
                    return object2;
                }
                object = GooglePlayServicesUtil.getRemoteResource(object);
                object2 = null;
                if (object == null) {
                    return null;
                }
                object4 = "string";
                object3 = "com.google.android.gms";
                n3 = object.getIdentifier(string2, (String)object4, (String)object3);
                if (n3 == 0) {
                    return null;
                }
                if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(object = object.getString(n3))) ? 1 : 0)) != 0) {
                    return null;
                }
                a532.put(string2, object);
                return object;
            }
            throw throwable2;
        }
    }
}

