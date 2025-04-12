/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.AsyncTask$Status
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.util.DisplayMetrics
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.view.autofill.AutofillManager
 *  android.webkit.WebView
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.facebook.internal;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.common.R$drawable;
import com.facebook.common.R$string;
import com.facebook.common.R$style;
import com.facebook.internal.WebDialog$b;
import com.facebook.internal.WebDialog$c;
import com.facebook.internal.WebDialog$d;
import com.facebook.internal.WebDialog$e;
import com.facebook.internal.WebDialog$setUpWebView$1;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public class WebDialog
extends Dialog {
    public static final int m = R$style.com_facebook_activity_theme;
    public static volatile int n;
    public String a;
    public String b;
    public WebDialog$c c;
    public WebDialog$setUpWebView$1 d;
    public ProgressDialog e;
    public ImageView f;
    public FrameLayout g;
    public final WebDialog$d h;
    public boolean i;
    public boolean j;
    public boolean k;
    public WindowManager.LayoutParams l;

    public WebDialog(Context object, String string2, Bundle bundle, LA1 object2, WebDialog$c object3) {
        boolean bl2;
        boolean n3;
        int n4 = 1;
        Xz3.h();
        int n7 = n;
        super(object, n7);
        Object object4 = "fbconnect://success";
        this.b = object4;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (n3 = lz3_0.x(object)) {
            object4 = "fbconnect://chrome_os_success";
        }
        this.b = object4;
        bundle.putString("redirect_uri", (String)object4);
        bundle.putString("display", "touch");
        object = FacebookSdk.b();
        bundle.putString("client_id", (String)object);
        object = StringCompanionObject.INSTANCE;
        object = Locale.ROOT;
        object4 = new Object[n4];
        object4[0] = "18.0.2";
        String string3 = "android-%s";
        String string4 = "format(locale, format, *args)";
        object = IV0.a(object4, n4, (Locale)object, string3, string4);
        object4 = "sdk";
        bundle.putString((String)object4, (String)object);
        this.c = object3;
        object = "share";
        boolean bl3 = Intrinsics.areEqual(string2, object);
        if (bl3 && (bl2 = bundle.containsKey((String)(object = "media")))) {
            super(this, string2, bundle);
            this.h = object;
        } else {
            object = WebDialog$e.$EnumSwitchMapping$0;
            int n8 = ((Enum)object2).ordinal();
            Context context = object[n8];
            if (context == n4) {
                object = q03.c();
                string2 = "oauth/authorize";
                object = lz3_0.b(bundle, (String)object, string2);
            } else {
                object = q03.a();
                object2 = new StringBuilder();
                object3 = FacebookSdk.e();
                ((StringBuilder)object2).append((String)object3);
                object3 = "/dialog/";
                ((StringBuilder)object2).append((String)object3);
                ((StringBuilder)object2).append(string2);
                string2 = ((StringBuilder)object2).toString();
                object = lz3_0.b(bundle, (String)object, string2);
            }
            object = object.toString();
            this.a = object;
        }
    }

    public static int a(int n3, float f5, int n4, int n7) {
        double d2;
        float f6 = (float)n3 / f5;
        int n8 = (int)f6;
        if (n8 <= n4) {
            d2 = 1.0;
        } else {
            double d5 = 0.5;
            if (n8 >= n7) {
                d2 = d5;
            } else {
                n8 = n7 - n8;
                double d7 = n8;
                d2 = n7 -= n4;
                d7 = d7 / d2 * d5;
                d2 = d7 + d5;
            }
        }
        return (int)((double)n3 * d2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b(Context object) {
        ApplicationInfo applicationInfo;
        if (object == null) {
            return;
        }
        try {
            void var1_7;
            int n3;
            PackageManager packageManager = object.getPackageManager();
            String string2 = object.getPackageName();
            int n4 = 128;
            applicationInfo = packageManager.getApplicationInfo(string2, n4);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
            } else {
                n3 = 0;
                Object var1_6 = null;
            }
            if (var1_7 == null) {
                return;
            }
            n3 = n;
            if (n3 != 0) return;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        String string3 = "com.facebook.sdk.WebDialogTheme";
        int n7 = bundle.getInt(string3);
        if (n7 == 0) {
            n7 = m;
        }
        n = n7;
    }

    public Bundle c(String string2) {
        string2 = Uri.parse((String)string2);
        Bundle bundle = lz3_0.F(string2.getQuery());
        string2 = lz3_0.F(string2.getFragment());
        bundle.putAll((Bundle)string2);
        return bundle;
    }

    public void cancel() {
        boolean bl2;
        Object object = this.c;
        if (object != null && !(bl2 = this.i)) {
            object = new FacebookOperationCanceledException();
            this.e((Exception)object);
        }
    }

    public final void d() {
        Object object = this.getContext().getSystemService("window");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.WindowManager");
        object = ((WindowManager)object).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        object.getMetrics(displayMetrics);
        int n3 = displayMetrics.widthPixels;
        int n4 = displayMetrics.heightPixels;
        int n7 = n3 < n4 ? n3 : n4;
        if (n3 < n4) {
            n3 = n4;
        }
        float f5 = displayMetrics.density;
        int n8 = 800;
        n4 = WebDialog.a(n7, f5, 480, n8);
        n7 = displayMetrics.widthPixels;
        n4 = Math.min(n4, n7);
        float f6 = displayMetrics.density;
        int n10 = 1280;
        n3 = WebDialog.a(n3, f6, n8, n10);
        int n14 = displayMetrics.heightPixels;
        n3 = Math.min(n3, n14);
        displayMetrics = this.getWindow();
        if (displayMetrics != null) {
            displayMetrics.setLayout(n4, n3);
        }
    }

    public final void dismiss() {
        boolean bl2;
        boolean bl3;
        WebDialog$setUpWebView$1 webDialog$setUpWebView$1 = this.d;
        if (webDialog$setUpWebView$1 != null) {
            webDialog$setUpWebView$1.stopLoading();
        }
        if (!(bl3 = this.j) && (webDialog$setUpWebView$1 = this.e) != null && (bl2 = webDialog$setUpWebView$1.isShowing())) {
            webDialog$setUpWebView$1.dismiss();
        }
        super.dismiss();
    }

    public final void e(Exception object) {
        boolean bl2;
        Object object2 = this.c;
        if (object2 != null && !(bl2 = this.i)) {
            this.i = true;
            bl2 = object instanceof FacebookException;
            object = bl2 ? (FacebookException)object : (object2 = new RuntimeException((Throwable)object));
            object2 = this.c;
            if (object2 != null) {
                object2.a(null, (FacebookException)object);
            }
            this.dismiss();
        }
    }

    public final void f(int n3) {
        String string2;
        WebDialog$b webDialog$b;
        Object object;
        Object object2 = this.getContext();
        Object object3 = new LinearLayout(object2);
        object2 = this.getContext();
        this.d = object = new WebView(object2);
        object2 = null;
        object.setVerticalScrollBarEnabled(false);
        object = this.d;
        if (object != null) {
            object.setHorizontalScrollBarEnabled(false);
        }
        if ((object = this.d) != null) {
            webDialog$b = new WebDialog$b(this);
            object.setWebViewClient(webDialog$b);
        }
        object = this.d;
        webDialog$b = null;
        object = object != null ? object.getSettings() : null;
        boolean bl2 = true;
        if (object != null) {
            object.setJavaScriptEnabled(bl2);
        }
        object = this.d;
        if (object != null) {
            string2 = this.a;
            if (string2 != null) {
                object.loadUrl(string2);
            } else {
                object3 = "Required value was null.".toString();
                IllegalStateException illegalStateException = new IllegalStateException((String)object3);
                throw illegalStateException;
            }
        }
        if ((object = this.d) != null) {
            int n4 = -1;
            string2 = new FrameLayout.LayoutParams(n4, n4);
            object.setLayoutParams((ViewGroup.LayoutParams)string2);
        }
        if ((object = this.d) != null) {
            int n7 = 4;
            object.setVisibility(n7);
        }
        if ((object = (object = this.d) != null ? object.getSettings() : null) != null) {
            object.setSavePassword(false);
        }
        object = this.d;
        if (object != null) {
            webDialog$b = object.getSettings();
        }
        if (webDialog$b != null) {
            webDialog$b.setSaveFormData(false);
        }
        object2 = this.d;
        if (object2 != null) {
            object2.setFocusable(bl2);
        }
        if ((object2 = this.d) != null) {
            object2.setFocusableInTouchMode(bl2);
        }
        if ((object2 = this.d) != null) {
            object = new Object();
            object2.setOnTouchListener((View.OnTouchListener)object);
        }
        object3.setPadding(n3, n3, n3, n3);
        WebDialog$setUpWebView$1 webDialog$setUpWebView$1 = this.d;
        object3.addView((View)webDialog$setUpWebView$1);
        n3 = -872415232;
        object3.setBackgroundColor(n3);
        webDialog$setUpWebView$1 = this.g;
        if (webDialog$setUpWebView$1 != null) {
            webDialog$setUpWebView$1.addView((View)object3);
        }
    }

    public final void onAttachedToWindow() {
        boolean bl2 = false;
        this.j = false;
        Object object = this.getContext();
        Object object2 = "context";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        lz3_0 lz3_02 = lz3_0.a;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4 && (object = cf_0.a(bf_0.a(object, (Class)(object2 = af_0.a())))) != null && (n3 = (int)(hz3_0.a((AutofillManager)object) ? 1 : 0)) != 0 && (bl2 = iz3_0.a((AutofillManager)object)) && (object = this.l) != null) {
            n3 = 0;
            object2 = null;
            if (object != null) {
                lz3_02 = object.token;
            } else {
                n4 = 0;
                lz3_02 = null;
            }
            if (lz3_02 == null) {
                if (object != null) {
                    lz3_02 = this.getOwnerActivity();
                    if (lz3_02 != null && (lz3_02 = lz3_02.getWindow()) != null && (lz3_02 = lz3_02.getAttributes()) != null) {
                        lz3_02 = ((WindowManager.LayoutParams)lz3_02).token;
                    } else {
                        n4 = 0;
                        lz3_02 = null;
                    }
                    object.token = lz3_02;
                }
                if ((object = this.l) != null) {
                    object2 = object.token;
                }
                Objects.toString(object2);
                object = FacebookSdk.a;
            }
        }
        super.onAttachedToWindow();
    }

    public final void onCreate(Bundle object) {
        int n3;
        Object object2;
        super.onCreate(object);
        Object object3 = this.getContext();
        object = new ProgressDialog(object3);
        this.e = object;
        int n4 = 1;
        object.requestWindowFeature(n4);
        object = this.e;
        if (object != null) {
            object2 = this.getContext();
            int n7 = R$string.com_facebook_loading;
            object2 = object2.getString(n7);
            object.setMessage((CharSequence)object2);
        }
        if ((object = this.e) != null) {
            n3 = 0;
            object2 = null;
            object.setCanceledOnTouchOutside(false);
        }
        if ((object = this.e) != null) {
            object2 = new nf3_1(this);
            object.setOnCancelListener((DialogInterface.OnCancelListener)object2);
        }
        this.requestWindowFeature(n4);
        object2 = this.getContext();
        object = new FrameLayout((Context)object2);
        this.g = object;
        this.d();
        object = this.getWindow();
        if (object != null) {
            n3 = 17;
            object.setGravity(n3);
        }
        if ((object = this.getWindow()) != null) {
            n3 = 16;
            object.setSoftInputMode(n3);
        }
        object2 = this.getContext();
        object = new ImageView((Context)object2);
        this.f = object;
        object2 = new of3_2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.getContext().getResources();
        n3 = R$drawable.com_facebook_close;
        object = object.getDrawable(n3);
        object2 = this.f;
        if (object2 != null) {
            object2.setImageDrawable((Drawable)object);
        }
        if ((object = this.f) != null) {
            n3 = 4;
            object.setVisibility(n3);
        }
        object = this.a;
        object2 = "Required value was null.";
        if (object != null) {
            object = this.f;
            if (object != null) {
                object = object.getDrawable();
                int n8 = object.getIntrinsicWidth() / 2 + n4;
                this.f(n8);
            } else {
                object3 = object2.toString();
                object = new IllegalStateException((String)object3);
                throw object;
            }
        }
        if ((object = this.g) != null) {
            object3 = this.f;
            int n10 = -2;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(n10, n10);
            object.addView((View)object3, layoutParams);
        }
        if ((object = this.g) != null) {
            this.setContentView((View)object);
            return;
        }
        object3 = object2.toString();
        object = new IllegalStateException((String)object3);
        throw object;
    }

    public final void onDetachedFromWindow() {
        this.j = true;
        super.onDetachedFromWindow();
    }

    public final boolean onKeyDown(int n3, KeyEvent keyEvent) {
        Object object = "event";
        Intrinsics.checkNotNullParameter(keyEvent, object);
        int n4 = 4;
        if (n3 == n4) {
            int n7;
            object = this.d;
            if (object != null && (n4 = (int)(object.canGoBack() ? 1 : 0)) == (n7 = 1)) {
                WebDialog$setUpWebView$1 webDialog$setUpWebView$1 = this.d;
                if (webDialog$setUpWebView$1 != null) {
                    webDialog$setUpWebView$1.goBack();
                }
                return n7;
            }
            this.cancel();
        }
        return super.onKeyDown(n3, keyEvent);
    }

    public final void onStart() {
        AsyncTask.Status status;
        Object[] objectArray;
        super.onStart();
        WebDialog$d webDialog$d = this.h;
        if (webDialog$d != null && (objectArray = webDialog$d != null ? webDialog$d.getStatus() : null) == (status = AsyncTask.Status.PENDING)) {
            if (webDialog$d != null) {
                objectArray = new Void[]{};
                webDialog$d.execute(objectArray);
            }
            if ((webDialog$d = this.e) != null) {
                webDialog$d.show();
            }
        } else {
            this.d();
        }
    }

    public final void onStop() {
        WebDialog$d webDialog$d = this.h;
        if (webDialog$d != null) {
            boolean bl2 = true;
            webDialog$d.cancel(bl2);
            webDialog$d = this.e;
            if (webDialog$d != null) {
                webDialog$d.dismiss();
            }
        }
        super.onStop();
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "params");
        IBinder iBinder = layoutParams.token;
        if (iBinder == null) {
            this.l = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }
}

