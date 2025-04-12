/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.firebase.installations.local;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.local.PersistedInstallationEntry$Builder;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class PersistedInstallation {
    private static final String AUTH_TOKEN_KEY = "AuthToken";
    private static final String EXPIRES_IN_SECONDS_KEY = "ExpiresInSecs";
    private static final String FIREBASE_INSTALLATION_ID_KEY = "Fid";
    private static final String FIS_ERROR_KEY = "FisError";
    private static final String PERSISTED_STATUS_KEY = "Status";
    private static final String REFRESH_TOKEN_KEY = "RefreshToken";
    private static final String SETTINGS_FILE_NAME_PREFIX = "PersistedInstallation";
    private static final String TOKEN_CREATION_TIME_IN_SECONDS_KEY = "TokenCreationEpochInSecs";
    private File dataFile;
    private final FirebaseApp firebaseApp;

    public PersistedInstallation(FirebaseApp firebaseApp) {
        this.firebaseApp = firebaseApp;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private File getDataFile() {
        Object object = "PersistedInstallation.";
        File file = this.dataFile;
        if (file != null) return this.dataFile;
        synchronized (this) {
            try {
                file = this.dataFile;
                if (file != null) return this.dataFile;
                Object object2 = this.firebaseApp;
                object2 = ((FirebaseApp)object2).getApplicationContext();
                object2 = object2.getFilesDir();
                StringBuilder stringBuilder = new StringBuilder((String)object);
                object = this.firebaseApp;
                object = ((FirebaseApp)object).getPersistenceKey();
                stringBuilder.append((String)object);
                object = ".json";
                stringBuilder.append((String)object);
                object = stringBuilder.toString();
                this.dataFile = file = new File((File)object2, (String)object);
                return this.dataFile;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private JSONObject readJSONFromFile() {
        JSONObject jSONObject;
        int n3;
        Object object = new ByteArrayOutputStream();
        int n4 = 16384;
        byte[] byArray = new byte[n4];
        File file = this.getDataFile();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            file = null;
            n3 = fileInputStream.read(byArray, 0, n4);
            if (n3 >= 0) break block10;
            object = ((ByteArrayOutputStream)object).toString();
            jSONObject = new JSONObject((String)object);
            break;
        }
        catch (Throwable throwable) {}
        {
            block10: {
                fileInputStream.close();
                return jSONObject;
            }
            ((ByteArrayOutputStream)object).write(byArray, 0, n3);
            continue;
        }
        try {
            fileInputStream.close();
            throw throwable;
        }
        catch (Throwable throwable) {
            try {
                throwable.addSuppressed(throwable);
                throw throwable;
            }
            catch (IOException | JSONException throwable2) {}
        }
        return new JSONObject();
    }

    public void clearForTesting() {
        this.getDataFile().delete();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public PersistedInstallationEntry insertOrUpdatePersistedInstallationEntry(PersistedInstallationEntry persistedInstallationEntry) {
        block30: {
            JSONObject jSONObject = new JSONObject();
            Object object = FIREBASE_INSTALLATION_ID_KEY;
            Object object2 = persistedInstallationEntry.getFirebaseInstallationId();
            jSONObject.put((String)object, object2);
            object = PERSISTED_STATUS_KEY;
            object2 = persistedInstallationEntry.getRegistrationStatus();
            int n3 = ((Enum)object2).ordinal();
            jSONObject.put((String)object, n3);
            object = AUTH_TOKEN_KEY;
            object2 = persistedInstallationEntry.getAuthToken();
            jSONObject.put((String)object, object2);
            object = REFRESH_TOKEN_KEY;
            object2 = persistedInstallationEntry.getRefreshToken();
            jSONObject.put((String)object, object2);
            object = TOKEN_CREATION_TIME_IN_SECONDS_KEY;
            long l2 = persistedInstallationEntry.getTokenCreationEpochInSecs();
            jSONObject.put((String)object, l2);
            object = EXPIRES_IN_SECONDS_KEY;
            l2 = persistedInstallationEntry.getExpiresInSecs();
            jSONObject.put((String)object, l2);
            object = FIS_ERROR_KEY;
            object2 = persistedInstallationEntry.getFisError();
            jSONObject.put((String)object, object2);
            object = SETTINGS_FILE_NAME_PREFIX;
            object2 = "tmp";
            Object object3 = this.firebaseApp;
            object3 = ((FirebaseApp)object3).getApplicationContext();
            object3 = object3.getFilesDir();
            object = File.createTempFile((String)object, (String)object2, (File)object3);
            object2 = new FileOutputStream((File)object);
            String string2 = jSONObject.toString();
            object3 = "UTF-8";
            byte[] byArray = string2.getBytes((String)object3);
            ((FileOutputStream)object2).write(byArray);
            ((FileOutputStream)object2).close();
            File file = this.getDataFile();
            boolean bl2 = ((File)object).renameTo(file);
            if (bl2) break block30;
            object = "unable to rename the tmpfile to PersistedInstallation";
            try {
                IOException iOException = new IOException((String)object);
                throw iOException;
            }
            catch (IOException | JSONException throwable) {
                return persistedInstallationEntry;
            }
        }
        return persistedInstallationEntry;
    }

    public PersistedInstallationEntry readPersistedInstallationEntryValue() {
        Object object = this.readJSONFromFile();
        Object object2 = object.optString(FIREBASE_INSTALLATION_ID_KEY, null);
        int n3 = PersistedInstallation$RegistrationStatus.ATTEMPT_MIGRATION.ordinal();
        n3 = object.optInt(PERSISTED_STATUS_KEY, n3);
        String string2 = object.optString(AUTH_TOKEN_KEY, null);
        String string3 = object.optString(REFRESH_TOKEN_KEY, null);
        long l2 = 0L;
        long l3 = object.optLong(TOKEN_CREATION_TIME_IN_SECONDS_KEY, l2);
        long l4 = object.optLong(EXPIRES_IN_SECONDS_KEY, l2);
        object = object.optString(FIS_ERROR_KEY, null);
        object2 = PersistedInstallationEntry.builder().setFirebaseInstallationId((String)object2);
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus = PersistedInstallation$RegistrationStatus.values()[n3];
        return ((PersistedInstallationEntry$Builder)object2).setRegistrationStatus(persistedInstallation$RegistrationStatus).setAuthToken(string2).setRefreshToken(string3).setTokenCreationEpochInSecs(l3).setExpiresInSecs(l4).setFisError((String)object).build();
    }
}

