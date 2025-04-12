/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Dialog
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.TranslateAnimation
 *  android.widget.TextView
 */
package com.ril.ajio.view;

import android.app.Application;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import androidx.lifecycle.E$b;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest$Builder;
import com.google.android.gms.auth.api.credentials.Credentials;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$integer;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.Cart.CartCount;
import com.ril.ajio.services.query.QueryCustomer;
import com.ril.ajio.utility.NetworkRedirectionReceiver;
import com.ril.ajio.view.BaseSplitActivity$a;
import com.ril.ajio.view.BaseSplitActivity$b;
import com.ril.ajio.view.BaseSplitActivity$internetConnectionNotifier$1;
import com.ril.ajio.view.Hilt_BaseSplitActivity;
import com.ril.ajio.web.CustomWebViewActivity;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

public class BaseSplitActivity
extends Hilt_BaseSplitActivity
implements iw0_1 {
    public static final int $stable = 8;
    private jo_2 appPreferences;
    private Dialog dialog;
    private final ab0_0 errorMessageDisplayHandler;
    private final BroadcastReceiver internetConnectionNotifier;
    private NetworkRedirectionReceiver networkRedirectionReceiver;
    private TextView notifCount;
    private View notificationView;
    private AjioTextView progressSubText;
    private final rq1_2 smartLockManager$delegate;
    private final rq1_2 userViewModel$delegate;

    public BaseSplitActivity() {
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        Object object = new jo_2((Context)aJIOApplication);
        this.appPreferences = object;
        this.errorMessageDisplayHandler = object = new Object();
        object = new aw_2(this, 0);
        this.userViewModel$delegate = object = yr1_2.b((Function0)object);
        object = new bw_1(this);
        this.smartLockManager$delegate = object = yr1_2.b((Function0)object);
        object = new BaseSplitActivity$internetConnectionNotifier$1(this);
        this.internetConnectionNotifier = object;
    }

    public static final /* synthetic */ ab0_0 access$getErrorMessageDisplayHandler$p(BaseSplitActivity baseSplitActivity) {
        return baseSplitActivity.errorMessageDisplayHandler;
    }

    public static final /* synthetic */ View access$getNotificationView$p(BaseSplitActivity baseSplitActivity) {
        return baseSplitActivity.notificationView;
    }

    public static final /* synthetic */ boolean access$isActivityFinishing(BaseSplitActivity baseSplitActivity) {
        return baseSplitActivity.isActivityFinishing();
    }

    private static final void dismissSlowInternetNotification$lambda$5(View view, String string2) {
        Intrinsics.checkNotNullParameter(string2, "$contentDescription");
        view.setContentDescription((CharSequence)string2);
        ai0_2.a(view);
    }

    private static final void initProgress$lambda$10(BaseSplitActivity baseSplitActivity, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(baseSplitActivity, "this$0");
        baseSplitActivity.dismissDialogBackPressed();
    }

    private final boolean isActivityFinishing() {
        boolean bl2 = this.isFinishing();
        bl2 = bl2 || (bl2 = this.isDestroyed());
        return bl2;
    }

    public static /* synthetic */ hy3_0 p2(BaseSplitActivity baseSplitActivity) {
        return BaseSplitActivity.userViewModel_delegate$lambda$1(baseSplitActivity);
    }

    public static /* synthetic */ void r2(BaseSplitActivity baseSplitActivity, DialogInterface dialogInterface) {
        BaseSplitActivity.initProgress$lambda$10(baseSplitActivity, dialogInterface);
    }

    public static /* synthetic */ void s2(String string2, BaseSplitActivity baseSplitActivity) {
        BaseSplitActivity.showNotification$lambda$8(string2, baseSplitActivity);
    }

    public static /* synthetic */ void showNotification$default(BaseSplitActivity object, Context context, String string2, int n3, String string3, int n4, Object object2) {
        if (object2 == null) {
            if ((n4 &= 8) != 0) {
                string3 = null;
            }
            ((BaseSplitActivity)object).showNotification(context, string2, n3, string3);
            return;
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showNotification");
        throw object;
    }

    public static /* synthetic */ void showNotification$default(BaseSplitActivity object, String string2, String string3, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 2) != 0) {
                string3 = null;
            }
            ((BaseSplitActivity)object).showNotification(string2, string3);
            return;
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showNotification");
        throw object;
    }

    private static final void showNotification$lambda$8(String string2, BaseSplitActivity baseSplitActivity) {
        String string3 = "this$0";
        Intrinsics.checkNotNullParameter(baseSplitActivity, string3);
        if (string2 != null && (string3 = baseSplitActivity.notificationView) != null) {
            string3.setContentDescription((CharSequence)string2);
        }
        if ((string2 = baseSplitActivity.notificationView) != null) {
            ai0_2.a((View)string2);
        }
    }

    private static final void showNotification$lambda$9(int n3, BaseSplitActivity baseSplitActivity) {
        Intrinsics.checkNotNullParameter(baseSplitActivity, "this$0");
        float f5 = -100.0f;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, f5);
        long l2 = n3;
        translateAnimation.setDuration(l2);
        BaseSplitActivity$b baseSplitActivity$b = new BaseSplitActivity$b(baseSplitActivity);
        translateAnimation.setAnimationListener((Animation.AnimationListener)baseSplitActivity$b);
        baseSplitActivity$b = baseSplitActivity.notificationView;
        if (baseSplitActivity$b != null) {
            baseSplitActivity$b.startAnimation((Animation)translateAnimation);
        }
    }

    private static final void showSlowInternetNotification$lambda$6(View view, String string2) {
        Intrinsics.checkNotNullParameter(string2, "$contentDescription");
        view.setContentDescription((CharSequence)string2);
        ai0_2.a(view);
    }

    private static final x73_0 smartLockManager_delegate$lambda$2(BaseSplitActivity object) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = new Object();
        ((x73_0)object2).b = object;
        String[] stringArray = kd3_2.a();
        Object object3 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Object object4 = object.getViewModelStore();
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Object object5 = object.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Object object6 = object.getDefaultViewModelCreationExtras();
        Object object7 = "store";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object5, string2);
        String string3 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object6, string3);
        Object object8 = oa1_1.class;
        String string4 = "modelClass";
        object4 = rl3_0.b((rd3_0)object4, (E$b)object5, (Wd0)object6, object8, string4);
        object5 = "<this>";
        object6 = sw0_0.a(object8, (String)object5, object8, string4, string4);
        Intrinsics.checkNotNullParameter(object6, (String)object5);
        object8 = object6.getQualifiedName();
        String string5 = "Local and anonymous classes can not be ViewModels";
        if (object8 != null) {
            String string6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object8 = string6.concat((String)object8);
            ((x73_0)object2).c = object4 = (oa1_1)((pD3)object4).a((yn1_2)object6, (String)object8);
            object8 = object.getApplication();
            ((x73_0)object2).e = object6 = new jo_2((Context)object8);
            object8 = object.getApplication();
            object6 = new UserRepo((Application)object8);
            object8 = object.getApplication();
            stringArray.a = object6;
            stringArray.b = object8;
            Intrinsics.checkNotNullParameter(object, (String)object3);
            Intrinsics.checkNotNullParameter(stringArray, string2);
            object6 = object.getViewModelStore();
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object3 = object.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object6, (String)object7);
            Intrinsics.checkNotNullParameter(stringArray, string2);
            Intrinsics.checkNotNullParameter(object3, string3);
            object7 = hy3_0.class;
            stringArray = im_1.a((rd3_0)object6, (kd3_2)stringArray, (Wd0)object3, (Class)object7, string4);
            object3 = sw0_0.a((Class)object7, (String)object5, (Class)object7, string4, string4);
            Intrinsics.checkNotNullParameter(object3, (String)object5);
            object5 = object3.getQualifiedName();
            if (object5 != null) {
                object5 = string6.concat((String)object5);
                stringArray = (hy3_0)stringArray.a((yn1_2)object3, (String)object5);
                ((x73_0)object2).d = stringArray;
                stringArray = stringArray.l;
                object3 = new Object();
                stringArray.e((mu1_1)object, (F62)object3);
                stringArray = ((oa1_1)object4).k;
                object3 = new u73_0((x73_0)object2);
                stringArray.e((mu1_1)object, (F62)object3);
                AJIOApplication.Companion.getClass();
                ((x73_0)object2).a = object = Credentials.getClient((Context)AJIOApplication$a.a());
                object = new CredentialRequest$Builder();
                object = ((CredentialRequest$Builder)object).setPasswordLoginSupported(true);
                stringArray = new String[]{"https://accounts.google.com", "https://twitter.com"};
                ((CredentialRequest$Builder)object).setAccountTypes(stringArray).build();
                return object2;
            }
            object2 = string5.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string5.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public static /* synthetic */ hy3_0 t2(BaseSplitActivity baseSplitActivity) {
        return BaseSplitActivity.userViewModel_delegate$lambda$1$lambda$0(baseSplitActivity);
    }

    public static /* synthetic */ void u2(View view, String string2) {
        BaseSplitActivity.dismissSlowInternetNotification$lambda$5(view, string2);
    }

    private static final hy3_0 userViewModel_delegate$lambda$1(BaseSplitActivity object) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = new dw_2((BaseSplitActivity)object);
        Object object3 = new pw_2((Function0)object2);
        object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object3, string2);
        rd3_0 rd3_02 = object.getViewModelStore();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(object3, string2);
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        object2 = hy3_0.class;
        string2 = "modelClass";
        object = on_2.c(rd3_02, (pw_2)object3, (Wd0)object, object2, string2);
        object2 = ef0_0.a(object2, string2, string2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            return (hy3_0)((pD3)object).a((yn1_2)object2, (String)object3);
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    private static final hy3_0 userViewModel_delegate$lambda$1$lambda$0(BaseSplitActivity baseSplitActivity) {
        Intrinsics.checkNotNullParameter(baseSplitActivity, "this$0");
        Application application = baseSplitActivity.getApplication();
        String string2 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(application, string2);
        baseSplitActivity = baseSplitActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(baseSplitActivity, string2);
        UserRepo userRepo = new UserRepo((Application)baseSplitActivity);
        hy3_0 hy3_02 = new hy3_0(application, userRepo);
        return hy3_02;
    }

    public static /* synthetic */ void v2(View view, String string2) {
        BaseSplitActivity.showSlowInternetNotification$lambda$6(view, string2);
    }

    public static /* synthetic */ x73_0 w2(BaseSplitActivity baseSplitActivity) {
        return BaseSplitActivity.smartLockManager_delegate$lambda$2(baseSplitActivity);
    }

    public static /* synthetic */ void x2(int n3, BaseSplitActivity baseSplitActivity) {
        BaseSplitActivity.showNotification$lambda$9(n3, baseSplitActivity);
    }

    public void attachBaseContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "newBase");
        super.attachBaseContext(context);
        SplitCompat.install((Context)this);
    }

    public void dismissDialogBackPressed() {
        boolean bl2;
        boolean bl3;
        Dialog dialog = this.dialog;
        if (dialog != null && (bl3 = dialog.isShowing()) == (bl2 = true) && !(bl3 = this.isFinishing()) && (dialog = this.dialog) != null) {
            dialog.dismiss();
        }
    }

    public void dismissProgress() {
        boolean bl2;
        boolean bl3;
        Dialog dialog = this.dialog;
        if (dialog != null && (bl3 = dialog.isShowing()) == (bl2 = true) && !(bl3 = this.isFinishing()) && (dialog = this.dialog) != null) {
            dialog.dismiss();
        }
    }

    public final void dismissSlowInternetNotification() {
        int n3 = 1;
        int n4 = this.isActivityFinishing();
        if (n4 != 0) {
            return;
        }
        Object object = StringCompanionObject.INSTANCE;
        object = hv3_0.K(R$string.acc_alert_message);
        int n7 = R$string.connection_slow_error;
        Object object2 = hv3_0.K(n7);
        TranslateAnimation translateAnimation = new Object[n3];
        float f5 = 0.0f;
        Object object3 = null;
        translateAnimation[0] = object2;
        object2 = "format(...)";
        Object object4 = xh2_0.a((Object[])translateAnimation, n3, (String)object, (String)object2);
        n4 = R$id.slow_internet;
        object = this.findViewById(n4);
        if (object != null && (n7 = object.getVisibility()) == 0) {
            object2 = cp_1.Companion;
            n7 = (int)(km_1.b((cp$a)object2) ? 1 : 0);
            n7 = n7 != 0 ? hv3_0.w(R$integer.notification_anim_delay_accesibility) : hv3_0.w(R$integer.notification_anim_delay);
            f5 = -100.0f;
            translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, f5);
            long l2 = n7;
            translateAnimation.setDuration(l2);
            object3 = Looper.getMainLooper();
            object2 = new Handler(object3);
            object3 = new zw_1((View)object, (String)object4);
            long l3 = 100;
            object2.postDelayed((Runnable)object3, l3);
            object4 = new BaseSplitActivity$a(this, (View)object);
            translateAnimation.setAnimationListener((Animation.AnimationListener)object4);
            object.startAnimation((Animation)translateAnimation);
        }
    }

    public final jo_2 getAppPreferences() {
        return this.appPreferences;
    }

    public final BaseSplitActivity getBaseActivity() {
        return this;
    }

    public final TextView getNotifCount() {
        return this.notifCount;
    }

    public final x73_0 getSmartLockManager() {
        return (x73_0)this.smartLockManager$delegate.getValue();
    }

    public final hy3_0 getUserViewModel() {
        return (hy3_0)this.userViewModel$delegate.getValue();
    }

    public void initProgress() {
        Object object;
        this.dialog = object = new Dialog((Context)this, 16973836);
        int n3 = 1;
        object.requestWindowFeature(n3);
        object = this.dialog;
        if (object != null) {
            int n4 = R$layout.dynamicfeature_progress_view_layout;
            object.setContentView(n4);
        }
        if ((object = this.dialog) != null) {
            object.setCancelable(n3 != 0);
        }
        if ((object = this.dialog) != null) {
            ww_1 ww_12 = new ww_1(this);
            object.setOnDismissListener((DialogInterface.OnDismissListener)ww_12);
        }
        if ((object = this.dialog) != null) {
            n3 = R$id.tv_progress_subtext;
            object = (AjioTextView)object.findViewById(n3);
        } else {
            object = null;
        }
        this.progressSubText = object;
    }

    public void launchFeature(String string2, Bundle object) {
        Intrinsics.checkNotNullParameter(string2, "name");
        object = this.getResources();
        int bl2 = R$string.feature_customercare;
        object = object.getString(bl2);
        boolean bl3 = true;
        boolean bl4 = b.i(string2, (String)object, bl3);
        if (bl4) {
            object = hv3_0.l();
            string2 = new Intent((Context)this, (Class)object);
            object = this.getUserViewModel();
            boolean bl5 = ((hy3_0)object).p();
            if (!bl5) {
                int n3 = 7;
                this.startActivityForResult((Intent)string2, n3);
            } else {
                this.startActivity((Intent)string2);
            }
        }
    }

    public void onActivityResult(int n3, int n4, Intent object) {
        Object object2;
        super.onActivityResult(n3, n4, (Intent)object);
        int n7 = -1;
        String string2 = null;
        int n8 = 1;
        if (n3 == n8) {
            String string3 = "format(...)";
            if (n4 == n7) {
                Object object3 = yn3_0.a;
                Object[] objectArray = new Object[]{};
                ((yn3$a)object3).a("Credential Save: OK", objectArray);
                object3 = StringCompanionObject.INSTANCE;
                int n10 = R$string.acc_alert_message;
                object3 = hv3_0.K(n10);
                String string4 = "Credential Save Success";
                objectArray = new Object[n8];
                objectArray[0] = string4;
                object2 = Arrays.copyOf(objectArray, n8);
                object2 = String.format((String)object3, (Object[])object2);
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                mq0_2.b(string4, (String)object2);
            } else {
                Object object4 = yn3_0.a;
                Object[] objectArray = new Object[]{};
                ((yn3$a)object4).a("Credential Save: NOT OK", objectArray);
                object4 = StringCompanionObject.INSTANCE;
                int n14 = R$string.acc_error_message;
                object4 = hv3_0.K(n14);
                String string5 = "Credential Save Failed";
                objectArray = new Object[n8];
                objectArray[0] = string5;
                object2 = Arrays.copyOf(objectArray, n8);
                object2 = String.format((String)object4, (Object[])object2);
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                mq0_2.b(string5, (String)object2);
            }
        }
        if (n3 == (n8 = 2)) {
            if (n4 == n7) {
                boolean bl2;
                Object object5;
                n3 = 0;
                Object object6 = null;
                if (object != null) {
                    n4 = Build.VERSION.SDK_INT;
                    n7 = 33;
                    if (n4 > n7) {
                        object6 = (Parcelable)qx1_0.a((Intent)object);
                    } else {
                        object5 = object.getParcelableExtra("com.google.android.gms.credentials.Credential");
                        bl2 = object5 instanceof Credential;
                        if (bl2) {
                            object6 = object5;
                        }
                    }
                }
                object5 = this.getSmartLockManager();
                object5.getClass();
                object = ((Credential)object6).getId();
                bl2 = TextUtils.isEmpty((CharSequence)object);
                if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)(object = ((Credential)object6).getPassword()))) && (object = ((x73_0)object5).c) != null) {
                    String string6 = ((Credential)object6).getId();
                    object6 = ((Credential)object6).getPassword();
                    if (string6 != null && object6 != null) {
                        object2 = new QueryCustomer();
                        ((QueryCustomer)object2).setLogin(string6);
                        ((QueryCustomer)object2).setMobileNumberEnterered(false);
                        string2 = string6.toLowerCase();
                        ((QueryCustomer)object2).setEmail(string2);
                        string2 = "smartlock";
                        ((QueryCustomer)object2).setLoginvia(string2);
                        ((QueryCustomer)object2).setPassword((String)object6);
                        object5 = ((x73_0)object5).e.a();
                        ((QueryCustomer)object2).setAdId((String)object5);
                        object5 = "<set-?>";
                        Intrinsics.checkNotNullParameter(string6, (String)object5);
                        ((oa1_1)object).D = string6;
                        Intrinsics.checkNotNullParameter(object6, (String)object5);
                        ((oa1_1)object).E = object6;
                        object6 = "landing screen";
                        ((oa1_1)object).l((QueryCustomer)object2, (String)object6);
                    }
                }
            } else {
                yn3$a yn3$a = yn3_0.a;
                String string7 = "Credential Read: NOT OK";
                object = new Object[]{};
                yn3$a.a(string7, (Object[])object);
            }
        }
    }

    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = z40_0.Companion;
        Object object2 = this.getApplicationContext();
        String string2 = "getApplicationContext(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object.getClass();
        object = z40$a.a((Context)object2).a;
        object2 = "enableAppRedirection";
        boolean bl2 = object.a((String)object2);
        if (bl2 && !(bl2 = this instanceof CustomWebViewActivity)) {
            object = new NetworkRedirectionReceiver((Context)this);
            this.networkRedirectionReceiver = object;
            object2 = Xv1.a(this.getApplicationContext());
            String string3 = "network_redirection";
            string2 = new IntentFilter(string3);
            ((Xv1)object2).b((BroadcastReceiver)object, (IntentFilter)string2);
        }
    }

    public void onDestroy() {
        NetworkRedirectionReceiver networkRedirectionReceiver = this.networkRedirectionReceiver;
        if (networkRedirectionReceiver != null) {
            Xv1 xv1 = Xv1.a(this.getApplicationContext());
            xv1.d(networkRedirectionReceiver);
        }
        super.onDestroy();
    }

    public void onDownloadConfirmation(SplitInstallManager splitInstallManager, SplitInstallSessionState object) {
        if (splitInstallManager != null && object != null) {
            int n3 = 37;
            try {
                splitInstallManager.startConfirmationDialogForResult((SplitInstallSessionState)object, this, n3);
            }
            catch (Exception exception) {
                object = yn3_0.a;
                ((yn3$a)object).e(exception);
            }
        }
    }

    public void onPause() {
        super.onPause();
        Xv1 xv1 = Xv1.a(this.getApplicationContext());
        BroadcastReceiver broadcastReceiver2 = this.internetConnectionNotifier;
        xv1.d(broadcastReceiver2);
    }

    public void onResume() {
        super.onResume();
        Xv1 xv1 = Xv1.a(this.getApplicationContext());
        BroadcastReceiver broadcastReceiver2 = this.internetConnectionNotifier;
        IntentFilter intentFilter = new IntentFilter("ACTION_API_FAILURE");
        xv1.b(broadcastReceiver2, intentFilter);
    }

    public final void openCustomerCare() {
        Object object = lw0_1.Companion;
        AJIOApplication.Companion.getClass();
        Object object2 = AJIOApplication$a.a();
        object = ((Lw0$a)object).a((ContextWrapper)object2);
        object2 = hv3_0.K(R$string.feature_customercare);
        ((lw0_1)object).a((String)object2, this, null);
    }

    public final void setAppPreferences(jo_2 jo_22) {
        Intrinsics.checkNotNullParameter(jo_22, "<set-?>");
        this.appPreferences = jo_22;
    }

    public final void setCartWishListCount(CartCount cartCount) {
        if (cartCount != null) {
            jo_2 jo_22 = this.appPreferences;
            int n3 = cartCount.getCartCount();
            jo_22.p(n3);
            float f5 = cartCount.getCartAmount();
            jo_22 = this.appPreferences;
            jo_22.o(f5);
            this.invalidateOptionsMenu();
            this.updateCartWishCount();
        }
    }

    public final void setNotifCount(TextView textView) {
        this.notifCount = textView;
    }

    public final void showNotification(Context context, String string2, int n3, String string3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(string2, "message");
        ig0_0.Companion.getClass();
        Integer n4 = n3;
        ig0_0.a(context, string2, n4, string3);
    }

    public void showNotification(String string2, String string3) {
        Object object;
        int n3 = this.isActivityFinishing();
        if (n3 != 0) {
            return;
        }
        n3 = R$id.notification;
        this.notificationView = object = this.findViewById(n3);
        if (object == null) {
            return;
        }
        n3 = R$id.notification_text;
        object = (TextView)this.findViewById(n3);
        cp$a cp$a = cp_1.Companion;
        int n4 = km_1.b(cp$a);
        n4 = n4 != 0 ? hv3_0.w(R$integer.notification_anim_delay_accesibility) : hv3_0.w(R$integer.notification_anim_delay);
        cp_1 cp_12 = cp$a.e();
        cp_12.getClass();
        int n7 = cp_1.f();
        n7 = n7 != 0 ? hv3_0.w(R$integer.notification_anim_post_release_delay_accesibility) : hv3_0.w(R$integer.notification_anim_post_release_delay);
        if (string2 != null) {
            object.setText((CharSequence)string2);
        } else {
            string2 = "";
            object.setText((CharSequence)string2);
        }
        n3 = -1027080192;
        float f5 = -100.0f;
        Object object2 = null;
        string2 = new TranslateAnimation(0.0f, 0.0f, f5, 0.0f);
        long l2 = n4;
        string2.setDuration(l2);
        object = this.notificationView;
        if (object != null) {
            object2 = null;
            object.setVisibility(0);
        }
        object2 = Looper.getMainLooper();
        object = new Handler(object2);
        object2 = new xw_1(string3, this);
        long l3 = 100;
        object.postDelayed((Runnable)object2, l3);
        string3 = this.notificationView;
        if (string3 != null) {
            object = new yw_0(n4, this);
            long l4 = n7;
            string3.postDelayed((Runnable)object, l4);
        }
        if ((string3 = this.notificationView) != null) {
            string3.startAnimation((Animation)string2);
        }
    }

    public void showProgress(String string2) {
        boolean bl2;
        boolean bl3;
        Object object = this.dialog;
        if (object != null && (bl3 = object.isShowing()) == (bl2 = true) && !(bl3 = this.isFinishing())) {
            object = this.dialog;
            if (object != null) {
                object.show();
            }
            if ((object = this.progressSubText) != null) {
                object.setText((CharSequence)string2);
            }
        }
    }

    public final void showSlowInternetNotification() {
        Handler handler = null;
        int n3 = 1;
        int n4 = this.isActivityFinishing();
        if (n4 != 0) {
            return;
        }
        Object object = StringCompanionObject.INSTANCE;
        object = hv3_0.K(R$string.acc_alert_message);
        int n7 = R$string.connection_slow_error;
        String string2 = hv3_0.K(n7);
        TextView textView = new Object[n3];
        textView[0] = string2;
        string2 = "format(...)";
        String string3 = xh2_0.a((Object[])textView, n3, (String)object, string2);
        object = cp_1.Companion;
        n4 = km_1.b((cp$a)object);
        n4 = n4 != 0 ? hv3_0.w(R$integer.notification_anim_delay_accesibility) : hv3_0.w(R$integer.notification_anim_delay);
        n7 = R$id.slow_internet;
        string2 = this.findViewById(n7);
        if (string2 != null) {
            int n8 = R$id.slow_internet_text;
            textView = (TextView)this.findViewById(n8);
            int n10 = R$string.connection_slow_error;
            textView.setText(n10);
            n10 = -1027080192;
            float f5 = -100.0f;
            textView = new TranslateAnimation(0.0f, 0.0f, f5, 0.0f);
            long l2 = n4;
            textView.setDuration(l2);
            string2.setVisibility(0);
            object = Looper.getMainLooper();
            handler = new Handler((Looper)object);
            object = new cw_1((View)string2, string3);
            l2 = 100;
            handler.postDelayed((Runnable)object, l2);
            string2.setAnimation((Animation)textView);
        }
    }

    public void updateCartWishCount() {
        Object object = this.appPreferences;
        int n3 = ((jo_2)object).d();
        TextView textView = this.notifCount;
        if (textView != null) {
            if (n3 == 0) {
                if (textView != null) {
                    n3 = 8;
                    textView.setVisibility(n3);
                }
            } else {
                if (textView != null) {
                    textView.setVisibility(0);
                }
                if ((textView = this.notifCount) != null) {
                    object = String.valueOf(n3);
                    textView.setText((CharSequence)object);
                }
            }
        }
    }
}

