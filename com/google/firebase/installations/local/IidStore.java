/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.util.Base64
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.firebase.FirebaseApp;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class IidStore {
    private static final String[] ALLOWABLE_SCOPES = new String[]{"*", "FCM", "GCM", ""};
    private static final String IID_SHARED_PREFS_NAME = "com.google.android.gms.appid";
    private static final String JSON_ENCODED_PREFIX = "{";
    private static final String JSON_TOKEN_KEY = "token";
    private static final String STORE_KEY_ID = "|S|id";
    private static final String STORE_KEY_PUB = "|S||P|";
    private static final String STORE_KEY_SEPARATOR = "|";
    private static final String STORE_KEY_TOKEN = "|T|";
    private final String defaultSenderId;
    private final SharedPreferences iidPrefs;

    public IidStore(SharedPreferences sharedPreferences2, String string2) {
        this.iidPrefs = sharedPreferences2;
        this.defaultSenderId = string2;
    }

    public IidStore(FirebaseApp object) {
        SharedPreferences sharedPreferences2;
        this.iidPrefs = sharedPreferences2 = ((FirebaseApp)object).getApplicationContext().getSharedPreferences(IID_SHARED_PREFS_NAME, 0);
        this.defaultSenderId = object = IidStore.getDefaultSenderId((FirebaseApp)object);
    }

    private String createTokenKey(String string2, String string3) {
        return UX.c(STORE_KEY_TOKEN, string2, STORE_KEY_SEPARATOR, string3);
    }

    private static String getDefaultSenderId(FirebaseApp object) {
        int n3;
        boolean bl2;
        String string2 = ((FirebaseApp)object).getOptions().getGcmSenderId();
        if (string2 != null) {
            return string2;
        }
        boolean n4 = ((String)(object = ((FirebaseApp)object).getOptions().getApplicationId())).startsWith(string2 = "1:");
        if (!n4 && !(bl2 = ((String)object).startsWith(string2 = "2:"))) {
            return object;
        }
        string2 = ":";
        int n7 = ((Object)(object = ((String)object).split(string2))).length;
        if (n7 != (n3 = 4)) {
            return null;
        }
        boolean bl3 = ((String)(object = object[1])).isEmpty();
        if (bl3) {
            return null;
        }
        return object;
    }

    private static String getIdFromPublicKey(PublicKey object) {
        object = object.getEncoded();
        Object object2 = "SHA1";
        try {
            object2 = MessageDigest.getInstance((String)object2);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return null;
        }
        object = ((MessageDigest)object2).digest((byte[])object);
        object2 = null;
        int n3 = (object[0] & 0xF) + 112 & 0xFF;
        object[0] = n3;
        n3 = 8;
        int n4 = 11;
        return Base64.encodeToString((byte[])object, (int)0, (int)n3, (int)n4);
    }

    private String parseIidTokenFromJson(String string2) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(string2);
            string2 = JSON_TOKEN_KEY;
        }
        catch (JSONException jSONException) {
            return null;
        }
        return jSONObject.getString(string2);
    }

    /*
     * WARNING - void declaration
     */
    private PublicKey parseKey(String object) {
        void var1_5;
        int n3 = 8;
        object = Base64.decode((String)object, (int)n3);
        Object object2 = "RSA";
        object2 = KeyFactory.getInstance((String)object2);
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec((byte[])object);
        try {
            return ((KeyFactory)object2).generatePublic(x509EncodedKeySpec);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        var1_5.toString();
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String readInstanceIdFromLocalStorage() {
        SharedPreferences sharedPreferences2 = this.iidPrefs;
        synchronized (sharedPreferences2) {
            Object object = this.iidPrefs;
            String string2 = STORE_KEY_ID;
            return object.getString(string2, null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String readPublicKeyFromLocalStorageAndCalculateInstanceId() {
        SharedPreferences sharedPreferences2 = this.iidPrefs;
        synchronized (sharedPreferences2) {
            Throwable throwable2;
            block4: {
                Object object;
                try {
                    object = this.iidPrefs;
                    String string2 = STORE_KEY_PUB;
                    object = object.getString(string2, null);
                    if (object == null) {
                        return null;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                if ((object = this.parseKey((String)object)) != null) return IidStore.getIdFromPublicKey((PublicKey)object);
                return null;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String readIid() {
        SharedPreferences sharedPreferences2 = this.iidPrefs;
        synchronized (sharedPreferences2) {
            try {
                String string2 = this.readInstanceIdFromLocalStorage();
                if (string2 == null) return this.readPublicKeyFromLocalStorageAndCalculateInstanceId();
                return string2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String readToken() {
        SharedPreferences sharedPreferences2 = this.iidPrefs;
        synchronized (sharedPreferences2) {
            int n3;
            int n4;
            Object object;
            try {
                object = ALLOWABLE_SCOPES;
                n4 = ((String[])object).length;
                n3 = 0;
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (true) {
                boolean bl2;
                String string2 = null;
                if (n3 >= n4) {
                    return null;
                }
                String string3 = object[n3];
                String string4 = this.defaultSenderId;
                string4 = this.iidPrefs;
                string2 = string4.getString(string3 = this.createTokenKey(string4, string3), null);
                if (string2 != null && !(bl2 = string2.isEmpty())) {
                    object = JSON_ENCODED_PREFIX;
                    boolean bl3 = string2.startsWith((String)object);
                    if (!bl3) return string2;
                    return this.parseIidTokenFromJson(string2);
                }
                ++n3;
            }
        }
    }
}

