/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.R$string;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzah;

public final class GoogleServices {
    private static final Object zza;
    private static GoogleServices zzb;
    private final String zzc;
    private final Status zzd;
    private final boolean zze;
    private final boolean zzf;

    static {
        Object object;
        zza = object = new Object();
    }

    public GoogleServices(Context object) {
        boolean bl2;
        Object object2 = object.getResources();
        int n3 = R$string.common_google_play_services_unknown_issue;
        String string2 = object2.getResourcePackageName(n3);
        String string3 = "google_app_measurement_enable";
        n3 = object2.getIdentifier(string3, "integer", string2);
        boolean bl3 = true;
        if (n3 != 0) {
            int n4 = object2.getInteger(n3);
            if (n4 != 0) {
                n3 = 0;
                string2 = null;
            } else {
                n3 = 1;
            }
            if (n4 == 0) {
                bl3 = false;
                string3 = null;
            }
            this.zzf = n3;
        } else {
            this.zzf = false;
        }
        this.zze = bl3;
        object2 = zzah.zzb(object);
        if (object2 == null) {
            super((Context)object);
            object = "google_app_id";
            object2 = ((StringResourceValueReader)object2).getString((String)object);
        }
        if (bl2 = TextUtils.isEmpty((CharSequence)object2)) {
            super(10, "Missing google app id value from from string resources with name google_app_id.");
            this.zzd = object;
            this.zzc = null;
            return;
        }
        this.zzc = object2;
        object = Status.RESULT_SUCCESS;
        this.zzd = object;
    }

    public GoogleServices(String object, boolean bl2) {
        boolean bl3;
        this.zzc = object;
        this.zzd = object = Status.RESULT_SUCCESS;
        this.zze = bl2;
        this.zzf = bl3 = bl2 ^ true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static GoogleServices checkInitialized(String string2) {
        String string3 = "Initialize must be called before ";
        Object object = zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                try {
                    object2 = zzb;
                    if (object2 != null) {
                        return object2;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                StringBuilder stringBuilder = new StringBuilder(string3);
                stringBuilder.append(string2);
                string2 = ".";
                stringBuilder.append(string2);
                string2 = stringBuilder.toString();
                object2 = new IllegalStateException(string2);
                throw object2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void clearInstanceForTest() {
        Object object = zza;
        synchronized (object) {
            Object var1_1 = null;
            zzb = null;
            return;
        }
    }

    public static String getGoogleAppId() {
        return GoogleServices.checkInitialized((String)"getGoogleAppId").zzc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Status initialize(Context object) {
        Preconditions.checkNotNull(object, "Context must not be null.");
        Object object2 = zza;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        GoogleServices googleServices = zzb;
                        if (googleServices != null) break block3;
                        zzb = googleServices = new GoogleServices((Context)object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = zzb;
                return object.zzd;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Status initialize(Context object, String object2, boolean bl2) {
        Object object3 = "Context must not be null.";
        Preconditions.checkNotNull(object, object3);
        Preconditions.checkNotEmpty((String)object2, "App ID must be nonempty.");
        object = zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                try {
                    object3 = zzb;
                    if (object3 != null) {
                        return ((GoogleServices)object3).checkGoogleAppId((String)object2);
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                zzb = object3 = new GoogleServices((String)object2, bl2);
                return ((GoogleServices)object3).zzd;
            }
            throw throwable2;
        }
    }

    public static boolean isMeasurementEnabled() {
        boolean bl2;
        GoogleServices googleServices = GoogleServices.checkInitialized("isMeasurementEnabled");
        Status status = googleServices.zzd;
        boolean bl3 = status.isSuccess();
        return bl3 && (bl2 = googleServices.zze);
    }

    public static boolean isMeasurementExplicitlyDisabled() {
        return GoogleServices.checkInitialized((String)"isMeasurementExplicitlyDisabled").zzf;
    }

    public Status checkGoogleAppId(String string2) {
        boolean bl2;
        Object object = this.zzc;
        if (object != null && !(bl2 = ((String)object).equals(string2))) {
            string2 = this.zzc;
            string2 = cP.a("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '", string2, "'.");
            object = new Status(10, string2);
            return object;
        }
        return Status.RESULT_SUCCESS;
    }
}

