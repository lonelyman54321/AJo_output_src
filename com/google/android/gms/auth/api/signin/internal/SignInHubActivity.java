/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.view.accessibility.AccessibilityEvent
 */
package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.loader.content.a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.zbn;
import com.google.android.gms.auth.api.signin.internal.zbw;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.reflect.Modifier;

public class SignInHubActivity
extends FragmentActivity {
    private static boolean zba = false;
    private boolean zbb = false;
    private SignInConfiguration zbc;
    private boolean zbd;
    private int zbe;
    private Intent zbf;

    public static /* bridge */ /* synthetic */ int zba(SignInHubActivity signInHubActivity) {
        return signInHubActivity.zbe;
    }

    public static /* bridge */ /* synthetic */ Intent zbb(SignInHubActivity signInHubActivity) {
        return signInHubActivity.zbf;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zbc() {
        block12: {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            block11: {
                Throwable throwable2;
                block10: {
                    block8: {
                        Object object6;
                        block9: {
                            Looper looper;
                            object5 = this.getSupportLoaderManager();
                            object4 = null;
                            object3 = new zbw(this, null);
                            object5 = (vv1_1)object5;
                            object2 = ((vv1_1)object5).b;
                            boolean bl2 = ((vv1$c_0)object2).b;
                            if (bl2) {
                                object5 = new IllegalStateException("Called while creating a loader");
                                throw object5;
                            }
                            object6 = Looper.getMainLooper();
                            if (object6 != (looper = Looper.myLooper())) {
                                object5 = new IllegalStateException("initLoader must be called on the main thread");
                                throw object5;
                            }
                            object6 = ((vv1$c_0)object2).a;
                            looper = null;
                            object = (vv1$a_0)((ca3)object6).f(0);
                            object5 = ((vv1_1)object5).a;
                            if (object != null) break block11;
                            object = "Object returned from onCreateLoader must not be a non-static inner member class: ";
                            int n3 = 1;
                            try {
                                ((vv1$c_0)object2).b = n3;
                                object4 = object3.onCreateLoader(0, null);
                                if (object4 == null) break block8;
                                Class<?> clazz = object4.getClass();
                                n3 = clazz.isMemberClass();
                                if (n3 == 0) break block9;
                                clazz = object4.getClass();
                                n3 = clazz.getModifiers();
                                if ((n3 = (int)(Modifier.isStatic(n3) ? 1 : 0)) == 0) {
                                    object3 = new StringBuilder((String)object);
                                    ((StringBuilder)object3).append(object4);
                                    object3 = ((StringBuilder)object3).toString();
                                    object5 = new IllegalArgumentException((String)object3);
                                    throw object5;
                                }
                            }
                            catch (Throwable throwable2) {
                                break block10;
                            }
                        }
                        object = new vv1$a_0((a)object4);
                        ((ca3)object6).i(0, object);
                        ((vv1$c_0)object2).b = false;
                        object2 = ((vv1$a_0)object).n;
                        object4 = new vv1$b_0((a)object2, (Uv1$a)object3);
                        ((LiveData)object).e((mu1_1)object5, (F62)object4);
                        object3 = ((vv1$a_0)object).p;
                        if (object3 != null) {
                            ((vv1$a_0)object).j((F62)object3);
                        }
                        ((vv1$a_0)object).o = object5;
                        ((vv1$a_0)object).p = object4;
                        break block12;
                    }
                    object3 = "Object returned from onCreateLoader must not be null";
                    object5 = new IllegalArgumentException((String)object3);
                    throw object5;
                }
                ((vv1$c_0)object2).b = false;
                throw throwable2;
            }
            object2 = ((vv1$a_0)object).n;
            object4 = new vv1$b_0((a)object2, (Uv1$a)object3);
            ((LiveData)object).e((mu1_1)object5, (F62)object4);
            object3 = ((vv1$a_0)object).p;
            if (object3 != null) {
                ((vv1$a_0)object).j((F62)object3);
            }
            ((vv1$a_0)object).o = object5;
            ((vv1$a_0)object).p = object4;
        }
        zba = false;
    }

    private final void zbd(int n3) {
        Status status = new Status(n3);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", (Parcelable)status);
        this.setResult(0, intent);
        this.finish();
        zba = false;
    }

    private final void zbe(String object) {
        Intent intent = new Intent((String)object);
        String string2 = "com.google.android.gms.auth.GOOGLE_SIGN_IN";
        boolean n3 = ((String)object).equals(string2);
        if (n3) {
            object = "com.google.android.gms";
            intent.setPackage((String)object);
        } else {
            object = this.getPackageName();
            intent.setPackage((String)object);
        }
        object = this.zbc;
        string2 = "config";
        intent.putExtra(string2, (Parcelable)object);
        int n4 = 40962;
        try {
            this.startActivityForResult(intent, n4);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            this.zbb = true;
            this.zbd(17);
            return;
        }
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        int n7 = this.zbb;
        if (n7 != 0) {
            return;
        }
        String string2 = null;
        this.setResult(0);
        n7 = 40962;
        if (n3 != n7) {
            return;
        }
        n3 = 8;
        if (intent != null) {
            AbstractSafeParcelable abstractSafeParcelable;
            string2 = "signInAccount";
            Object object = (SignInAccount)intent.getParcelableExtra(string2);
            if (object != null && (abstractSafeParcelable = ((SignInAccount)object).zba()) != null) {
                GoogleSignInAccount googleSignInAccount = ((SignInAccount)object).zba();
                object = zbn.zbc((Context)this);
                abstractSafeParcelable = this.zbc.zba();
                googleSignInAccount.getClass();
                ((zbn)object).zbe((GoogleSignInOptions)abstractSafeParcelable, googleSignInAccount);
                intent.removeExtra(string2);
                intent.putExtra("googleSignInAccount", (Parcelable)googleSignInAccount);
                this.zbd = true;
                this.zbe = n4;
                this.zbf = intent;
                this.zbc();
                return;
            }
            String string3 = "errorCode";
            n7 = (int)(intent.hasExtra(string3) ? 1 : 0);
            if (n7 != 0) {
                if ((n3 = intent.getIntExtra(string3, n3)) == (n4 = 13)) {
                    n3 = 12501;
                }
                this.zbd(n3);
                return;
            }
        }
        this.zbd(n3);
    }

    public final void onCreate(Bundle object) {
        int n3;
        super.onCreate((Bundle)object);
        Object object2 = this.getIntent();
        String string2 = object2.getAction();
        string2.getClass();
        String string3 = "com.google.android.gms.auth.NO_IMPL";
        boolean bl2 = string3.equals(string2);
        if (bl2) {
            this.zbd(12500);
            return;
        }
        string3 = "com.google.android.gms.auth.GOOGLE_SIGN_IN";
        bl2 = string2.equals(string3);
        if (!bl2 && !(bl2 = string2.equals(string3 = "com.google.android.gms.auth.APPAUTH_SIGN_IN"))) {
            object = String.valueOf(object2.getAction());
            "Unknown action: ".concat((String)object);
            this.finish();
            return;
        }
        string3 = "config";
        object2 = object2.getBundleExtra(string3);
        object2.getClass();
        object2 = (SignInConfiguration)object2.getParcelable(string3);
        bl2 = false;
        string3 = null;
        if (object2 == null) {
            this.setResult(0);
            this.finish();
            return;
        }
        this.zbc = object2;
        if (object == null) {
            boolean bl3 = zba;
            if (bl3) {
                this.setResult(0);
                this.zbd(12502);
                return;
            }
            zba = true;
            this.zbe(string2);
            return;
        }
        object2 = "signingInGoogleApiClients";
        this.zbd = n3 = object.getBoolean((String)object2);
        if (n3 != 0) {
            this.zbe = n3 = object.getInt("signInResultCode");
            object2 = "signInResultData";
            object = (Intent)object.getParcelable((String)object2);
            object.getClass();
            this.zbf = object;
            this.zbc();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        zba = false;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String string2 = "signingInGoogleApiClients";
        boolean bl2 = this.zbd;
        bundle.putBoolean(string2, bl2);
        int n3 = this.zbd;
        if (n3 != 0) {
            n3 = this.zbe;
            bundle.putInt("signInResultCode", n3);
            string2 = this.zbf;
            String string3 = "signInResultData";
            bundle.putParcelable(string3, (Parcelable)string2);
        }
    }
}

