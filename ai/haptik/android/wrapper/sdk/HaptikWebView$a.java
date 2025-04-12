/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowInsetsController
 *  android.webkit.PermissionRequest
 *  android.webkit.ValueCallback
 *  android.webkit.WebChromeClient
 *  android.webkit.WebChromeClient$CustomViewCallback
 *  android.webkit.WebChromeClient$FileChooserParams
 *  android.webkit.WebView
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.Toast
 */
package ai.haptik.android.wrapper.sdk;

import ai.haptik.android.wrapper.sdk.HaptikWebView;
import ai.haptik.android.wrapper.sdk.R$bool;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsController;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.Intrinsics;

public final class HaptikWebView$a
extends WebChromeClient {
    public View a;
    public WebChromeClient.CustomViewCallback b;
    public int c;
    public final /* synthetic */ HaptikWebView d;

    public HaptikWebView$a(HaptikWebView haptikWebView) {
        Intrinsics.checkNotNullParameter(haptikWebView, "this$0");
        this.d = haptikWebView;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onHideCustomView() {
        super.onHideCustomView();
        HaptikWebView haptikWebView = this.d;
        Resources resources = haptikWebView.getResources();
        int n3 = R$bool.portrait_only;
        int n4 = resources.getBoolean(n3);
        n4 = n4 != 0 ? 1 : -1;
        haptikWebView.setRequestedOrientation(n4);
        resources = (FrameLayout)haptikWebView.getWindow().getDecorView();
        View view = this.a;
        resources.removeView(view);
        n4 = Build.VERSION.SDK_INT;
        n3 = 30;
        if (n4 >= n3) {
            resources = G31.a(haptikWebView.getWindow());
            if (resources != null) {
                H31.a((WindowInsetsController)resources);
                n3 = I31.a();
                K31.a((WindowInsetsController)resources, n3);
            }
        } else {
            resources = haptikWebView.getWindow().getDecorView();
            n3 = this.c;
            resources.setSystemUiVisibility(n3);
        }
        haptikWebView = haptikWebView.X;
        n4 = 0;
        resources = null;
        if (haptikWebView != null) {
            haptikWebView.clearFocus();
            this.a = null;
            haptikWebView = this.b;
            Intrinsics.checkNotNull(haptikWebView);
            haptikWebView.onCustomViewHidden();
            this.b = null;
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webView");
        throw null;
    }

    public final void onPermissionRequest(PermissionRequest object) {
        if (object != null) {
            Object object2 = this.d;
            object2.getClass();
            String string2 = "<set-?>";
            Intrinsics.checkNotNullParameter(object, string2);
            ((HaptikWebView)object2).r0 = object;
            object = "android.permission.RECORD_AUDIO";
            int n3 = t70.checkSelfPermission((Context)object2, (String)object);
            if (n3 == 0) {
                object = ((HaptikWebView)object2).p2();
                object2 = ((HaptikWebView)object2).p2().getResources();
                object.grant((String[])object2);
            } else {
                n3 = Build.VERSION.SDK_INT;
                int n4 = 23;
                if (n3 >= n4 && (n3 = (int)(Hk0.b((AppCompatActivity)object2) ? 1 : 0)) != 0) {
                    n3 = 1;
                    object = Toast.makeText((Context)object2, (CharSequence)"Please grant Mic permission from the App Settings.", (int)n3);
                    object.show();
                } else {
                    object2 = ((HaptikWebView)object2).q0;
                    if (object2 != null) {
                        ((I3)object2).a(object);
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("permissionHelper");
                        throw null;
                    }
                }
            }
        }
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        int n3;
        super.onShowCustomView(view, customViewCallback);
        this.a = view;
        HaptikWebView haptikWebView = this.d;
        this.c = n3 = haptikWebView.getWindow().getDecorView().getSystemUiVisibility();
        this.b = customViewCallback;
        customViewCallback = (FrameLayout)haptikWebView.getWindow().getDecorView();
        int n4 = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n4, n4);
        customViewCallback.addView(view, (ViewGroup.LayoutParams)layoutParams);
        int n7 = Build.VERSION.SDK_INT;
        int n8 = 30;
        if (n7 >= n8) {
            view = G31.a(haptikWebView.getWindow());
            if (view != null) {
                H31.a((WindowInsetsController)view);
                n8 = I31.a();
                J31.a((WindowInsetsController)view, n8);
            }
        } else {
            view = haptikWebView.getWindow().getDecorView();
            n8 = 262;
            view.setSystemUiVisibility(n8);
        }
        haptikWebView.setRequestedOrientation(4);
    }

    public final boolean onShowFileChooser(WebView object, ValueCallback stringArray, WebChromeClient.FileChooserParams fileChooserParams) {
        HaptikWebView haptikWebView = this.d;
        if (fileChooserParams != null) {
            haptikWebView.k0 = stringArray;
            object = haptikWebView.p0;
            if (object != null) {
                stringArray = fileChooserParams.getAcceptTypes();
                ((I3)object).a(stringArray);
                return true;
            }
            Intrinsics.throwUninitializedPropertyAccessException("openDocumentPicker");
            throw null;
        }
        stringArray = haptikWebView.k0;
        return super.onShowFileChooser((WebView)object, (ValueCallback)stringArray, fileChooserParams);
    }
}

