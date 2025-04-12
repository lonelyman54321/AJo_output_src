/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 */
package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.auth.api.signin.internal.zbb;
import com.google.android.gms.auth.api.signin.internal.zbg;
import com.google.android.gms.auth.api.signin.internal.zbi;
import com.google.android.gms.auth.api.signin.internal.zbk;
import com.google.android.gms.auth.api.signin.internal.zbn;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.util.Collection;
import java.util.HashSet;

public final class zbm {
    private static final Logger zba;

    static {
        Logger logger;
        String[] stringArray = new String[]{};
        zba = logger = new Logger("GoogleSignInCommon", stringArray);
    }

    public static Intent zba(Context context, GoogleSignInOptions googleSignInOptions) {
        Logger logger = zba;
        Object[] objectArray = new Object[]{};
        logger.d("getFallbackSignInIntent()", objectArray);
        context = zbm.zbc(context, googleSignInOptions);
        context.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return context;
    }

    public static Intent zbb(Context context, GoogleSignInOptions googleSignInOptions) {
        Logger logger = zba;
        Object[] objectArray = new Object[]{};
        logger.d("getNoImplementationSignInIntent()", objectArray);
        context = zbm.zbc(context, googleSignInOptions);
        context.setAction("com.google.android.gms.auth.NO_IMPL");
        return context;
    }

    public static Intent zbc(Context context, GoogleSignInOptions googleSignInOptions) {
        Object object = zba;
        Object object2 = new Object[]{};
        ((Logger)object).d("getSignInIntent()", object2);
        object2 = context.getPackageName();
        object = new SignInConfiguration((String)object2, googleSignInOptions);
        googleSignInOptions = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        object2 = context.getPackageName();
        googleSignInOptions.setPackage((String)object2);
        googleSignInOptions.setClass(context, SignInHubActivity.class);
        context = new Bundle();
        object2 = "config";
        context.putParcelable((String)object2, (Parcelable)object);
        googleSignInOptions.putExtra((String)object2, (Bundle)context);
        return googleSignInOptions;
    }

    public static GoogleSignInResult zbd(Intent object) {
        GoogleSignInResult googleSignInResult = null;
        if (object == null) {
            Status status = Status.RESULT_INTERNAL_ERROR;
            object = new GoogleSignInResult(null, status);
            return object;
        }
        Status status = (Status)object.getParcelableExtra("googleSignInStatus");
        String string2 = "googleSignInAccount";
        if ((object = (GoogleSignInAccount)object.getParcelableExtra(string2)) == null) {
            if (status == null) {
                status = Status.RESULT_INTERNAL_ERROR;
            }
            object = new GoogleSignInResult(null, status);
            return object;
        }
        status = Status.RESULT_SUCCESS;
        googleSignInResult = new GoogleSignInResult((GoogleSignInAccount)object, status);
        return googleSignInResult;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static OptionalPendingResult zbe(GoogleApiClient var0, Context var1_1, GoogleSignInOptions var2_2, boolean var3_3) {
        block4: {
            var4_4 = zbm.zba;
            var5_5 = null;
            var6_6 = new Object[]{};
            var4_4.d("silentSignIn()", (Object[])var6_6);
            var7_7 = new Object[]{};
            var4_4.d("getEligibleSavedSignInResult()", var7_7);
            Preconditions.checkNotNull(var2_2);
            var6_6 = zbn.zbc((Context)var1_1 /* !! */ ).zbb();
            var7_7 = null;
            if (var6_6 == null) lbl-1000:
            // 3 sources

            {
                while (true) {
                    var8_8 = false;
                    var9_9 = null;
                    break block4;
                    break;
                }
            }
            var9_9 = var6_6.getAccount();
            var10_10 /* !! */  = var2_2.getAccount();
            if (!(var9_9 == null ? var10_10 /* !! */  == null : (var8_8 = var9_9.equals((Object)var10_10 /* !! */ )) != false) || (var8_8 = var2_2.isServerAuthCodeRequested()) || (var8_8 = var2_2.isIdTokenRequested()) && (!(var8_8 = var6_6.isIdTokenRequested()) || !(var8_8 = Objects.equal(var9_9 = var2_2.getServerClientId(), var10_10 /* !! */  = var6_6.getServerClientId())))) ** GOTO lbl-1000
            var6_6 = var6_6.getScopes();
            var9_9 = new HashSet(var6_6);
            var10_10 /* !! */  = var2_2.getScopes();
            var6_6 = new HashSet(var10_10 /* !! */ );
            var11_11 = var9_9.containsAll((Collection<?>)var6_6);
            if (var11_11 && (var6_6 = zbn.zbc((Context)var1_1 /* !! */ ).zba()) != null && !(var8_8 = var6_6.isExpired())) ** break;
            ** while (true)
            var10_10 /* !! */  = Status.RESULT_SUCCESS;
            var9_9 = new GoogleSignInResult((GoogleSignInAccount)var6_6, (Status)var10_10 /* !! */ );
        }
        if (var9_9 != null) {
            var1_1 /* !! */  = new Object[]{};
            var4_4.d("Eligible saved sign in result found", var1_1 /* !! */ );
            return PendingResults.immediatePendingResult((Result)var9_9, (GoogleApiClient)var0);
        }
        if (var3_3) {
            var2_2 = new Status(4);
            var1_1 /* !! */  = new GoogleSignInResult(null, (Status)var2_2);
            return PendingResults.immediatePendingResult((Result)var1_1 /* !! */ , (GoogleApiClient)var0);
        }
        var5_5 = new Object[]{};
        var4_4.d("trySilentSignIn()", var5_5);
        var12_12 = new zbg((GoogleApiClient)var0, (Context)var1_1 /* !! */ , (GoogleSignInOptions)var2_2);
        var0 = var0.enqueue(var12_12);
        var1_1 /* !! */  = new OptionalPendingResultImpl((PendingResult)var0);
        return var1_1 /* !! */ ;
    }

    public static PendingResult zbf(GoogleApiClient googleApiClient, Context object, boolean bl2) {
        Object object2 = zba;
        Object[] objectArray = new Object[]{};
        String string2 = "Revoking access";
        ((Logger)object2).d(string2, objectArray);
        object2 = Storage.getInstance(object).getSavedRefreshToken();
        zbm.zbh(object);
        if (bl2) {
            return zbb.zba((String)object2);
        }
        object = new zbk(googleApiClient);
        return googleApiClient.execute((BaseImplementation$ApiMethodImpl)object);
    }

    public static PendingResult zbg(GoogleApiClient googleApiClient, Context object, boolean bl2) {
        Logger logger = zba;
        Object[] objectArray = new Object[]{};
        String string2 = "Signing out";
        logger.d(string2, objectArray);
        zbm.zbh(object);
        if (bl2) {
            return PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, googleApiClient);
        }
        object = new zbi(googleApiClient);
        return googleApiClient.execute((BaseImplementation$ApiMethodImpl)object);
    }

    private static void zbh(Context object) {
        boolean bl2;
        zbn.zbc((Context)object).zbd();
        object = GoogleApiClient.getAllClients().iterator();
        while (bl2 = object.hasNext()) {
            GoogleApiClient googleApiClient = (GoogleApiClient)object.next();
            googleApiClient.maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
    }
}

