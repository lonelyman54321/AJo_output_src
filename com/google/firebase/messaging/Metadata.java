/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;

class Metadata {
    private static final String ACTION_C2DM_REGISTER = "com.google.android.c2dm.intent.REGISTER";
    private static final String ACTION_IID_TOKEN_REQUEST = "com.google.iid.TOKEN_REQUEST";
    static final int GMSCORE_NOT_FOUND = 0;
    private static final String GMSCORE_SEND_PERMISSION = "com.google.android.c2dm.permission.SEND";
    static final String GMS_PACKAGE = "com.google.android.gms";
    static final int IID_VIA_RECEIVER = 2;
    static final int IID_VIA_SERVICE = 1;
    private String appVersionCode;
    private String appVersionName;
    private final Context context;
    private int gmsVersionCode;
    private int iidImplementation = 0;

    public Metadata(Context context) {
        this.context = context;
    }

    public static String getDefaultSenderId(FirebaseApp object) {
        int n3;
        String string2 = ((FirebaseApp)object).getOptions().getGcmSenderId();
        if (string2 != null) {
            return string2;
        }
        boolean n4 = ((String)(object = ((FirebaseApp)object).getOptions().getApplicationId())).startsWith(string2 = "1:");
        if (!n4) {
            return object;
        }
        string2 = ":";
        int n7 = ((Object)(object = ((String)object).split(string2))).length;
        if (n7 < (n3 = 2)) {
            return null;
        }
        boolean bl2 = ((String)(object = object[1])).isEmpty();
        if (bl2) {
            return null;
        }
        return object;
    }

    private PackageInfo getPackageInfo(String string2) {
        Context context;
        try {
            context = this.context;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            ((Object)((Object)nameNotFoundException)).toString();
            return null;
        }
        context = context.getPackageManager();
        return context.getPackageInfo(string2, 0);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void populateAppVersionInfo() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        String string2;
                        Object object = this.context;
                        object = object.getPackageName();
                        object = this.getPackageInfo((String)object);
                        if (object == null) break block4;
                        int n3 = object.versionCode;
                        this.appVersionCode = string2 = Integer.toString(n3);
                        object = object.versionName;
                        this.appVersionName = object;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getAppVersionCode() {
        synchronized (this) {
            try {
                String string2 = this.appVersionCode;
                if (string2 != null) return this.appVersionCode;
                this.populateAppVersionInfo();
                return this.appVersionCode;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getAppVersionName() {
        synchronized (this) {
            try {
                String string2 = this.appVersionName;
                if (string2 != null) return this.appVersionName;
                this.populateAppVersionInfo();
                return this.appVersionName;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int getGmsVersionCode() {
        synchronized (this) {
            try {
                int n3 = this.gmsVersionCode;
                if (n3 != 0) return this.gmsVersionCode;
                String string2 = GMS_PACKAGE;
                if ((string2 = this.getPackageInfo(string2)) == null) return this.gmsVersionCode;
                this.gmsVersionCode = n3 = ((PackageInfo)string2).versionCode;
                return this.gmsVersionCode;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int getIidImplementation() {
        synchronized (this) {
            String string2;
            int n3;
            int n4;
            Object object;
            Object object2;
            Throwable throwable2;
            int n7;
            block10: {
                block9: {
                    try {
                        n7 = this.iidImplementation;
                        if (n7 == 0) break block9;
                    }
                    catch (Throwable throwable2) {}
                    return n7;
                }
                object2 = this.context;
                object2 = object2.getPackageManager();
                object = GMSCORE_SEND_PERMISSION;
                String string3 = GMS_PACKAGE;
                n4 = object2.checkPermission((String)object, string3);
                n3 = -1;
                if (n4 != n3) break block10;
                return 0;
            }
            n4 = (int)(PlatformVersion.isAtLeastO() ? 1 : 0);
            n3 = 1;
            if (n4 == 0) {
                string2 = ACTION_C2DM_REGISTER;
                object = new Intent(string2);
                string2 = GMS_PACKAGE;
                object.setPackage(string2);
                object = object2.queryIntentServices((Intent)object, 0);
                if (object != null && (n4 = object.size()) > 0) {
                    this.iidImplementation = n3;
                    return n3;
                }
            }
            string2 = ACTION_IID_TOKEN_REQUEST;
            object = new Intent(string2);
            string2 = GMS_PACKAGE;
            object.setPackage(string2);
            object2 = object2.queryBroadcastReceivers((Intent)object, 0);
            n4 = 2;
            if (object2 != null && (n7 = object2.size()) > 0) {
                this.iidImplementation = n4;
                return n4;
            }
            n7 = (int)(PlatformVersion.isAtLeastO() ? 1 : 0);
            this.iidImplementation = n7 != 0 ? n4 : n3;
            return this.iidImplementation;
            throw throwable2;
        }
    }

    public boolean isGmscorePresent() {
        int n3 = this.getIidImplementation();
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }
}

