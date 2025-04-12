/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 */
package com.affise.attribution.usecase;

import android.content.SharedPreferences;
import com.affise.attribution.parameters.ProviderType;
import com.affise.attribution.session.CurrentActiveActivityCountProvider;
import com.affise.attribution.usecase.FirstAppOpenUseCase$Companion;
import com.affise.attribution.usecase.FirstAppOpenUseCase$checkSaveUUIDs$1$1;
import com.affise.attribution.usecase.FirstAppOpenUseCase$checkSaveUUIDs$1$2;
import com.affise.attribution.usecase.FirstAppOpenUseCase$checkSaveUUIDs$1$3;
import com.affise.attribution.utils.PrefUtilsKt;
import com.affise.attribution.utils.TimestampKt;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class FirstAppOpenUseCase {
    private static final String AFF_ALT_DEVICE_ID = "AFF_ALT_DEVICE_ID";
    private static final String AFF_DEVICE_ID = "AFF_DEVICE_ID";
    public static final FirstAppOpenUseCase$Companion Companion;
    private static final String FIRST_OPENED = "FIRST_OPENED";
    private static final String FIRST_OPENED_DATE_KEY = "FIRST_OPENED_DATE_KEY";
    private final CurrentActiveActivityCountProvider activityCountProvider;
    private boolean firstRun;
    private boolean isFirstOpenValue;
    private final SharedPreferences preferences;

    static {
        FirstAppOpenUseCase$Companion firstAppOpenUseCase$Companion;
        Companion = firstAppOpenUseCase$Companion = new FirstAppOpenUseCase$Companion(null);
    }

    public FirstAppOpenUseCase(SharedPreferences sharedPreferences2, CurrentActiveActivityCountProvider currentActiveActivityCountProvider) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(sharedPreferences2, "preferences");
        Intrinsics.checkNotNullParameter(currentActiveActivityCountProvider, "activityCountProvider");
        this.preferences = sharedPreferences2;
        this.activityCountProvider = currentActiveActivityCountProvider;
        this.isFirstOpenValue = bl2 = sharedPreferences2.getBoolean(FIRST_OPENED, true);
    }

    private final void checkSaveUUIDs() {
        SharedPreferences sharedPreferences2 = this.preferences;
        Lambda lambda = FirstAppOpenUseCase$checkSaveUUIDs$1$1.INSTANCE;
        PrefUtilsKt.checkSaveString(sharedPreferences2, AFF_DEVICE_ID, lambda);
        lambda = FirstAppOpenUseCase$checkSaveUUIDs$1$2.INSTANCE;
        PrefUtilsKt.checkSaveString(sharedPreferences2, AFF_ALT_DEVICE_ID, lambda);
        String string2 = ProviderType.RANDOM_USER_ID.getProvider();
        lambda = FirstAppOpenUseCase$checkSaveUUIDs$1$3.INSTANCE;
        PrefUtilsKt.checkSaveString(sharedPreferences2, string2, lambda);
    }

    private final void onAppFirstOpen() {
        long l2 = TimestampKt.timestamp();
        this.checkSaveUUIDs();
        PrefUtilsKt.saveBoolean$default(this.preferences, FIRST_OPENED, true, 0, 4, null);
        PrefUtilsKt.saveLong$default(this.preferences, FIRST_OPENED_DATE_KEY, l2, 0, 4, null);
    }

    public final void completeFirstOpen() {
        this.isFirstOpenValue = false;
        SharedPreferences.Editor editor = this.preferences.edit();
        boolean bl2 = this.isFirstOpenValue;
        editor.putBoolean(FIRST_OPENED, bl2);
        editor.apply();
    }

    public final String getAffiseAltDeviseId() {
        return this.preferences.getString(AFF_ALT_DEVICE_ID, "");
    }

    public final String getAffiseDeviseId() {
        return this.preferences.getString(AFF_DEVICE_ID, "");
    }

    public final Date getFirstOpenDate() {
        Object object = this.preferences;
        String string2 = FIRST_OPENED_DATE_KEY;
        long l2 = 0L;
        long l3 = object.getLong(string2, l2);
        long l4 = l3 - l2;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false) {
            object = null;
        } else {
            Date date = new Date(l3);
            object = date;
        }
        return object;
    }

    public final String getRandomUserId() {
        SharedPreferences sharedPreferences2 = this.preferences;
        String string2 = ProviderType.RANDOM_USER_ID.getProvider();
        return sharedPreferences2.getString(string2, "");
    }

    public final boolean isFirstOpen() {
        return this.isFirstOpenValue;
    }

    public final boolean isFirstRun() {
        return this.firstRun;
    }

    public final void onAppCreated() {
        boolean bl2;
        SharedPreferences sharedPreferences2 = this.preferences;
        String string2 = FIRST_OPENED_DATE_KEY;
        long l2 = 0L;
        long l3 = sharedPreferences2.getLong(string2, l2);
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            this.onAppFirstOpen();
        }
        this.checkSaveUUIDs();
        this.firstRun = bl2 = this.preferences.getBoolean(FIRST_OPENED, true);
        this.activityCountProvider.init();
    }
}

