/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.text.TextUtils
 */
package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.auth.api.signin.internal.zbm;
import com.google.android.gms.auth.api.signin.internal.zbn;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public final class GoogleSignIn {
    private GoogleSignIn() {
    }

    public static GoogleSignInAccount getAccountForExtension(Context object, GoogleSignInOptionsExtension scopeArray) {
        Preconditions.checkNotNull(object, "please provide a valid Context object");
        String string2 = "please provide valid GoogleSignInOptionsExtension";
        Preconditions.checkNotNull(scopeArray, string2);
        object = GoogleSignIn.getLastSignedInAccount((Context)object);
        if (object == null) {
            object = GoogleSignInAccount.createDefault();
        }
        scopeArray = GoogleSignIn.zbb(scopeArray.getImpliedScopes());
        return ((GoogleSignInAccount)object).requestExtraScopes(scopeArray);
    }

    public static GoogleSignInAccount getAccountForScopes(Context object, Scope scope, Scope ... scopeArray) {
        Preconditions.checkNotNull(object, "please provide a valid Context object");
        Scope[] scopeArray2 = "please provide at least one valid scope";
        Preconditions.checkNotNull(scope, scopeArray2);
        object = GoogleSignIn.getLastSignedInAccount((Context)object);
        if (object == null) {
            object = GoogleSignInAccount.createDefault();
        }
        scopeArray2 = new Scope[]{scope};
        ((GoogleSignInAccount)object).requestExtraScopes(scopeArray2);
        ((GoogleSignInAccount)object).requestExtraScopes(scopeArray);
        return object;
    }

    public static GoogleSignInClient getClient(Activity activity, GoogleSignInOptions googleSignInOptions) {
        googleSignInOptions = (GoogleSignInOptions)Preconditions.checkNotNull(googleSignInOptions);
        GoogleSignInClient googleSignInClient = new GoogleSignInClient(activity, googleSignInOptions);
        return googleSignInClient;
    }

    public static GoogleSignInClient getClient(Context context, GoogleSignInOptions googleSignInOptions) {
        googleSignInOptions = (GoogleSignInOptions)Preconditions.checkNotNull(googleSignInOptions);
        GoogleSignInClient googleSignInClient = new GoogleSignInClient(context, googleSignInOptions);
        return googleSignInClient;
    }

    public static GoogleSignInAccount getLastSignedInAccount(Context context) {
        return zbn.zbc(context).zba();
    }

    public static Task getSignedInAccountFromIntent(Intent object) {
        object = zbm.zbd((Intent)object);
        GoogleSignInAccount googleSignInAccount = ((GoogleSignInResult)object).getSignInAccount();
        Status status = ((GoogleSignInResult)object).getStatus();
        boolean bl2 = status.isSuccess();
        if (bl2 && googleSignInAccount != null) {
            return Tasks.forResult(googleSignInAccount);
        }
        return Tasks.forException(ApiExceptionUtil.fromStatus(((GoogleSignInResult)object).getStatus()));
    }

    public static boolean hasPermissions(GoogleSignInAccount googleSignInAccount, GoogleSignInOptionsExtension scopeArray) {
        Preconditions.checkNotNull(scopeArray, "Please provide a non-null GoogleSignInOptionsExtension");
        scopeArray = GoogleSignIn.zbb(scopeArray.getImpliedScopes());
        return GoogleSignIn.hasPermissions(googleSignInAccount, scopeArray);
    }

    public static boolean hasPermissions(GoogleSignInAccount googleSignInAccount, Scope ... scopeArray) {
        if (googleSignInAccount == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, scopeArray);
        return googleSignInAccount.getGrantedScopes().containsAll(hashSet);
    }

    public static void requestPermissions(Activity activity, int n3, GoogleSignInAccount googleSignInAccount, GoogleSignInOptionsExtension scopeArray) {
        Preconditions.checkNotNull(activity, "Please provide a non-null Activity");
        Preconditions.checkNotNull(scopeArray, "Please provide a non-null GoogleSignInOptionsExtension");
        scopeArray = GoogleSignIn.zbb(scopeArray.getImpliedScopes());
        GoogleSignIn.requestPermissions(activity, n3, googleSignInAccount, scopeArray);
    }

    public static void requestPermissions(Activity activity, int n3, GoogleSignInAccount googleSignInAccount, Scope ... scopeArray) {
        Preconditions.checkNotNull(activity, "Please provide a non-null Activity");
        Preconditions.checkNotNull(scopeArray, "Please provide at least one scope");
        googleSignInAccount = GoogleSignIn.zba(activity, googleSignInAccount, scopeArray);
        activity.startActivityForResult((Intent)googleSignInAccount, n3);
    }

    public static void requestPermissions(Fragment fragment, int n3, GoogleSignInAccount googleSignInAccount, GoogleSignInOptionsExtension scopeArray) {
        Preconditions.checkNotNull(fragment, "Please provide a non-null Fragment");
        Preconditions.checkNotNull(scopeArray, "Please provide a non-null GoogleSignInOptionsExtension");
        scopeArray = GoogleSignIn.zbb(scopeArray.getImpliedScopes());
        GoogleSignIn.requestPermissions(fragment, n3, googleSignInAccount, scopeArray);
    }

    public static void requestPermissions(Fragment fragment, int n3, GoogleSignInAccount googleSignInAccount, Scope ... scopeArray) {
        Preconditions.checkNotNull(fragment, "Please provide a non-null Fragment");
        Preconditions.checkNotNull(scopeArray, "Please provide at least one scope");
        googleSignInAccount = GoogleSignIn.zba(fragment.getActivity(), googleSignInAccount, scopeArray);
        fragment.startActivityForResult((Intent)googleSignInAccount, n3);
    }

    private static Intent zba(Activity activity, GoogleSignInAccount object, Scope ... scopeArray) {
        boolean bl2;
        GoogleSignInOptions$Builder googleSignInOptions$Builder = new GoogleSignInOptions$Builder();
        int n3 = scopeArray.length;
        if (n3 > 0) {
            n3 = 0;
            Scope scope = scopeArray[0];
            googleSignInOptions$Builder.requestScopes(scope, scopeArray);
        }
        if (object != null && !(bl2 = TextUtils.isEmpty((CharSequence)(scopeArray = ((GoogleSignInAccount)object).getEmail())))) {
            object = (String)Preconditions.checkNotNull(((GoogleSignInAccount)object).getEmail());
            googleSignInOptions$Builder.setAccountName((String)object);
        }
        scopeArray = googleSignInOptions$Builder.build();
        object = new GoogleSignInClient(activity, (GoogleSignInOptions)scopeArray);
        return ((GoogleSignInClient)object).getSignInIntent();
    }

    private static Scope[] zbb(List list) {
        if (list == null) {
            return new Scope[0];
        }
        Scope[] scopeArray = new Scope[list.size()];
        return list.toArray(scopeArray);
    }
}

