/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.util.Log
 */
package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.messaging.Store$Token;
import java.io.File;
import java.io.IOException;

class Store {
    static final String NO_BACKUP_FILE = "com.google.android.gms.appid-no-backup";
    static final String PREFERENCES = "com.google.android.gms.appid";
    private static final String SCOPE_ALL = "*";
    private static final String STORE_KEY_TOKEN = "|T|";
    final SharedPreferences store;

    public Store(Context context) {
        SharedPreferences sharedPreferences2;
        this.store = sharedPreferences2 = context.getSharedPreferences(PREFERENCES, 0);
        this.checkForRestore(context, NO_BACKUP_FILE);
    }

    private void checkForRestore(Context object, String string2) {
        block5: {
            File file = new File((File)(object = t70.getNoBackupFilesDir(object)), string2);
            boolean bl2 = file.exists();
            if (bl2) {
                return;
            }
            bl2 = file.createNewFile();
            if (!bl2) break block5;
            bl2 = this.isEmpty();
            if (bl2) break block5;
            try {
                this.deleteAll();
            }
            catch (IOException iOException) {
                string2 = "FirebaseMessaging";
                int n3 = 3;
                boolean bl3 = Log.isLoggable((String)string2, (int)n3);
                if (!bl3) break block5;
                iOException.getMessage();
            }
        }
    }

    private String createTokenKey(String string2, String string3) {
        return y02.a(string2, STORE_KEY_TOKEN, string3, "|*");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void deleteAll() {
        synchronized (this) {
            SharedPreferences sharedPreferences2 = this.store;
            sharedPreferences2 = sharedPreferences2.edit();
            sharedPreferences2 = sharedPreferences2.clear();
            sharedPreferences2.commit();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void deleteToken(String string2, String string3) {
        synchronized (this) {
            string2 = this.createTokenKey(string2, string3);
            string3 = this.store;
            string3 = string3.edit();
            string3.remove(string2);
            string3.commit();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Store$Token getToken(String object, String string2) {
        synchronized (this) {
            SharedPreferences sharedPreferences2 = this.store;
            object = this.createTokenKey((String)object, string2);
            string2 = null;
            object = sharedPreferences2.getString((String)object, null);
            return Store$Token.parse((String)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isEmpty() {
        synchronized (this) {
            Object object = this.store;
            object = object.getAll();
            return object.isEmpty();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void saveToken(String string2, String string3, String string4, String string5) {
        synchronized (this) {
            long l2 = System.currentTimeMillis();
            string4 = Store$Token.encode(string4, string5, l2);
            if (string4 == null) {
                return;
            }
            string5 = this.store;
            string5 = string5.edit();
            string2 = this.createTokenKey(string2, string3);
            string5.putString(string2, string4);
            string5.commit();
            return;
        }
    }
}

