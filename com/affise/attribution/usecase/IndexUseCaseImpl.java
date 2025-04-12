/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 */
package com.affise.attribution.usecase;

import android.content.SharedPreferences;
import com.affise.attribution.usecase.IndexUseCase;
import com.affise.attribution.usecase.IndexUseCaseImpl$Companion;
import kotlin.jvm.internal.Intrinsics;

public final class IndexUseCaseImpl
implements IndexUseCase {
    private static final String AFFISE_EVENT_ID_INDEX_KEY = "com.affise.attribution.index.AFFISE_EVENT_ID_INDEX_KEY";
    public static final IndexUseCaseImpl$Companion Companion;
    private static final String UUID_INDEX_KEY = "com.affise.attribution.index.UUID_INDEX_KEY";
    private long affiseEventIdIndexValue;
    private final SharedPreferences preferences;
    private long uuidIndexValue;

    static {
        IndexUseCaseImpl$Companion indexUseCaseImpl$Companion;
        Companion = indexUseCaseImpl$Companion = new IndexUseCaseImpl$Companion(null);
    }

    public IndexUseCaseImpl(SharedPreferences sharedPreferences2) {
        long l2;
        long l3;
        Intrinsics.checkNotNullParameter(sharedPreferences2, "preferences");
        this.preferences = sharedPreferences2;
        long l4 = 0L;
        this.uuidIndexValue = l3 = sharedPreferences2.getLong(UUID_INDEX_KEY, l4);
        this.affiseEventIdIndexValue = l2 = sharedPreferences2.getLong(AFFISE_EVENT_ID_INDEX_KEY, l4);
    }

    private final void prefSave(String string2, long l2) {
        SharedPreferences.Editor editor = this.preferences.edit();
        editor.putLong(string2, l2);
        editor.commit();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long getAffiseEventIdIndex() {
        synchronized (this) {
            long l2 = this.affiseEventIdIndexValue;
            long l3 = 1L;
            this.affiseEventIdIndexValue = l2 += l3;
            String string2 = AFFISE_EVENT_ID_INDEX_KEY;
            long l4 = this.uuidIndexValue;
            this.prefSave(string2, l4);
            return this.affiseEventIdIndexValue;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long getUuidIndex() {
        synchronized (this) {
            long l2 = this.uuidIndexValue;
            long l3 = 1L;
            this.uuidIndexValue = l2 += l3;
            String string2 = UUID_INDEX_KEY;
            this.prefSave(string2, l2);
            return this.uuidIndexValue;
        }
    }
}

