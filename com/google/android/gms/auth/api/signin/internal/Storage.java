/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.text.TextUtils
 *  org.json.JSONException
 */
package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class Storage {
    private static final Lock zaa;
    private static Storage zab;
    private final Lock zac;
    private final SharedPreferences zad;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        zaa = reentrantLock;
    }

    public Storage(Context context) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.zac = reentrantLock;
        context = context.getSharedPreferences("com.google.android.gms.signin", 0);
        this.zad = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Storage getInstance(Context object) {
        Throwable throwable2;
        block3: {
            Lock lock;
            block2: {
                Preconditions.checkNotNull(object);
                lock = zaa;
                lock.lock();
                try {
                    Storage storage = zab;
                    if (storage != null) break block2;
                    object = object.getApplicationContext();
                    zab = storage = new Storage((Context)object);
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            object = zab;
            lock.unlock();
            return object;
        }
        zaa.unlock();
        throw throwable2;
    }

    private static final String zae(String string2, String string3) {
        return n1.a(string2, ":", string3);
    }

    public void clear() {
        Lock lock = this.zac;
        lock.lock();
        try {
            lock = this.zad;
            lock = lock.edit();
            lock = lock.clear();
            lock.apply();
            return;
        }
        finally {
            this.zac.unlock();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        String string2 = this.zaa("defaultGoogleSignInAccount");
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        GoogleSignInAccount googleSignInAccount = null;
        if (bl2) {
            return googleSignInAccount;
        }
        String string3 = "googleSignInAccount";
        string2 = Storage.zae(string3, string2);
        if ((string2 = this.zaa(string2)) == null) return googleSignInAccount;
        try {
            return GoogleSignInAccount.zab(string2);
        }
        catch (JSONException jSONException) {
            return googleSignInAccount;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        String string2 = this.zaa("defaultGoogleSignInAccount");
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        GoogleSignInOptions googleSignInOptions = null;
        if (bl2) {
            return googleSignInOptions;
        }
        String string3 = "googleSignInOptions";
        string2 = Storage.zae(string3, string2);
        if ((string2 = this.zaa(string2)) == null) return googleSignInOptions;
        try {
            return GoogleSignInOptions.zab(string2);
        }
        catch (JSONException jSONException) {
            return googleSignInOptions;
        }
    }

    public String getSavedRefreshToken() {
        return this.zaa("refreshToken");
    }

    public void saveDefaultGoogleSignInAccount(GoogleSignInAccount object, GoogleSignInOptions object2) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object2);
        String string2 = ((GoogleSignInAccount)object).zac();
        this.zad("defaultGoogleSignInAccount", string2);
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object2);
        string2 = ((GoogleSignInAccount)object).zac();
        String string3 = Storage.zae("googleSignInAccount", string2);
        object = ((GoogleSignInAccount)object).zad();
        this.zad(string3, (String)object);
        object = Storage.zae("googleSignInOptions", string2);
        object2 = ((GoogleSignInOptions)object2).zaf();
        this.zad((String)object, (String)object2);
    }

    public final String zaa(String string2) {
        Lock lock = this.zac;
        lock.lock();
        try {
            lock = this.zad;
            string2 = lock.getString(string2, null);
            return string2;
        }
        finally {
            this.zac.unlock();
        }
    }

    public final void zab(String string2) {
        Lock lock = this.zac;
        lock.lock();
        try {
            lock = this.zad;
            lock = lock.edit();
            string2 = lock.remove(string2);
            string2.apply();
            return;
        }
        finally {
            this.zac.unlock();
        }
    }

    public final void zac() {
        String string2 = "defaultGoogleSignInAccount";
        String string3 = this.zaa(string2);
        this.zab(string2);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (bl2) {
            return;
        }
        string2 = Storage.zae("googleSignInAccount", string3);
        this.zab(string2);
        string2 = Storage.zae("googleSignInOptions", string3);
        this.zab(string2);
    }

    public final void zad(String string2, String string3) {
        Lock lock = this.zac;
        lock.lock();
        try {
            lock = this.zad;
            lock = lock.edit();
            string2 = lock.putString(string2, string3);
            string2.apply();
            return;
        }
        finally {
            this.zac.unlock();
        }
    }
}

