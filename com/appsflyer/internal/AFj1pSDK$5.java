/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.net.Uri
 */
package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFc1dSDK;
import com.appsflyer.internal.AFj1pSDK;
import com.appsflyer.internal.AFj1sSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

final class AFj1pSDK$5
extends AFc1dSDK {
    private /* synthetic */ AFj1pSDK getMonetizationNetwork;

    public AFj1pSDK$5(AFj1pSDK aFj1pSDK, Context context, Executor executor, String string2, String ... stringArray) {
        this.getMonetizationNetwork = aFj1pSDK;
        super(context, executor, string2, stringArray);
    }

    private static void F_(String string2, Map map2, Cursor object) {
        long l2;
        int n3;
        int n4 = object.getColumnIndex(string2);
        if (n4 == (n3 = -1)) {
            return;
        }
        long l3 = object.getLong(n4);
        long l4 = l3 - (l2 = 0L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false) {
            return;
        }
        object = l3;
        map2.put(string2, object);
    }

    private static void G_(String string2, Map map2, Cursor object) {
        int n3;
        int n4 = object.getColumnIndex(string2);
        if (n4 == (n3 = -1)) {
            return;
        }
        if ((object = object.getString(n4)) == null) {
            return;
        }
        map2.put(string2, object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Map getRevenue() {
        Throwable throwable2;
        Object object;
        block16: {
            Object object2;
            String string2;
            block14: {
                block15: {
                    string2 = "FEATURE_NOT_SUPPORTED";
                    object2 = "response";
                    object = null;
                    try {
                        block18: {
                            Object object3;
                            Object object4;
                            block17: {
                                object4 = this.getRevenue;
                                object3 = object4.getContentResolver();
                                Object object5 = "content://";
                                object4 = new StringBuilder((String)object5);
                                object5 = this.AFAdRevenueData;
                                ((StringBuilder)object4).append((String)object5);
                                object4 = object4.toString();
                                object5 = Uri.parse((String)object4);
                                boolean bl2 = false;
                                object = object3.query((Uri)object5, null, null, null, null);
                                if (object == null) break block17;
                                boolean bl3 = object.moveToFirst();
                                if (bl3) {
                                    object4 = this.getMonetizationNetwork;
                                    object4 = ((AFj1sSDK)object4).getMediationNetwork;
                                    object3 = "OK";
                                    object4.put(object2, object3);
                                    object4 = "referrer";
                                    object3 = this.getMonetizationNetwork;
                                    object3 = ((AFj1sSDK)object3).getMediationNetwork;
                                    AFj1pSDK$5.G_((String)object4, (Map)object3, object);
                                    object4 = "click_ts";
                                    object3 = this.getMonetizationNetwork;
                                    object3 = ((AFj1sSDK)object3).getMediationNetwork;
                                    AFj1pSDK$5.F_((String)object4, (Map)object3, object);
                                    object4 = "install_begin_ts";
                                    object3 = this.getMonetizationNetwork;
                                    object3 = ((AFj1sSDK)object3).getMediationNetwork;
                                    AFj1pSDK$5.F_((String)object4, (Map)object3, object);
                                    object4 = "install_end_ts";
                                    object3 = this.getMonetizationNetwork;
                                    object3 = ((AFj1sSDK)object3).getMediationNetwork;
                                    AFj1pSDK$5.F_((String)object4, (Map)object3, object);
                                    object4 = "organic_keywords";
                                    object3 = this.getMonetizationNetwork;
                                    object3 = ((AFj1sSDK)object3).getMediationNetwork;
                                    AFj1pSDK$5.G_((String)object4, (Map)object3, object);
                                    object4 = "attr_type";
                                    object3 = this.getMonetizationNetwork;
                                    object3 = ((AFj1sSDK)object3).getMediationNetwork;
                                    AFj1pSDK$5.G_((String)object4, (Map)object3, object);
                                    object4 = new HashMap();
                                    object3 = "instant";
                                    boolean bl4 = object.getColumnIndex((String)object3);
                                    bl2 = -1 != 0;
                                    if (bl4 != bl2 && (object5 = object.getString((int)(bl4 ? 1 : 0))) != null) {
                                        bl4 = Boolean.parseBoolean((String)object5);
                                        object5 = bl4;
                                        ((HashMap)object4).put(object3, object5);
                                    }
                                    object3 = "click_server_ts";
                                    AFj1pSDK$5.F_((String)object3, (Map)object4, object);
                                    object3 = "install_begin_server_ts";
                                    AFj1pSDK$5.F_((String)object3, (Map)object4, object);
                                    object3 = "install_version";
                                    AFj1pSDK$5.G_((String)object3, (Map)object4, object);
                                    boolean bl5 = ((HashMap)object4).isEmpty();
                                    if (!bl5) {
                                        object3 = this.getMonetizationNetwork;
                                        object3 = ((AFj1sSDK)object3).getMediationNetwork;
                                        object5 = "custom";
                                        object3.put(object5, object4);
                                    }
                                    break block18;
                                } else {
                                    object4 = this.getMonetizationNetwork;
                                    object4 = ((AFj1sSDK)object4).getMediationNetwork;
                                    object4.put(object2, string2);
                                }
                                break block18;
                            }
                            object4 = this.getMonetizationNetwork;
                            object4 = ((AFj1sSDK)object4).getMediationNetwork;
                            object3 = "SERVICE_UNAVAILABLE";
                            object4.put(object2, object3);
                        }
                        if (object == null) break block14;
                        break block15;
                    }
                    catch (Throwable throwable2) {
                        break block16;
                    }
                    catch (Exception exception) {}
                    Object object6 = this.getMonetizationNetwork;
                    object6 = ((AFj1sSDK)object6).getMediationNetwork;
                    object6.put(object2, string2);
                    string2 = exception.getMessage();
                    object2 = null;
                    boolean bl6 = true;
                    AFLogger.afErrorLog(string2, exception, false, bl6);
                    if (object == null) break block14;
                }
                object.close();
            }
            string2 = this.getRevenue.getPackageManager();
            object2 = this.AFAdRevenueData;
            string2 = string2.resolveContentProvider((String)object2, (int)128).packageName;
            object2 = this.getMonetizationNetwork.getMediationNetwork;
            object = AFb1qSDK.AFAdRevenueData(this.getRevenue, string2);
            object2.put("api_ver", object);
            object2 = this.getMonetizationNetwork.getMediationNetwork;
            string2 = AFb1qSDK.getMediationNetwork(this.getRevenue, string2);
            object2.put("api_ver_name", string2);
            this.getMonetizationNetwork.getRevenue();
            return this.getMonetizationNetwork.getMediationNetwork;
        }
        if (object != null) {
            object.close();
        }
        throw throwable2;
    }

    public final /* synthetic */ Object getMonetizationNetwork() {
        return this.getRevenue();
    }
}

