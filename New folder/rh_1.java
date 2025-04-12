/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.Point
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.util.DisplayMetrics
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.WebSettings
 *  android.webkit.WebViewClient
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 */
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.R$id;
import com.clevertap.android.sdk.R$layout;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppBaseFullFragment;
import com.clevertap.android.sdk.inapp.CTInAppNotification;

/*
 * Renamed from RH
 */
public abstract class rh_1
extends CTInAppBaseFullFragment {
    public fi_2 j;

    public RelativeLayout.LayoutParams cb() {
        int n3 = -1;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(n3, n3);
        n3 = this.j.getId();
        int n4 = 2;
        layoutParams.addRule(n4, n3);
        n3 = this.j.getId();
        layoutParams.addRule(1, n3);
        n3 = -(this.Sa(40) / n4);
        layoutParams.setMargins(n3, 0, 0, n3);
        return layoutParams;
    }

    public final void db() {
        this.j.a();
        Object object = this.e.h;
        int n3 = object.isEmpty();
        if (n3 != 0) {
            object = this.j.a;
            int n4 = ((Point)object).y;
            n3 = ((Point)object).x;
            DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
            float f5 = displayMetrics.density;
            n4 = (int)((float)n4 / f5);
            float f6 = (float)n3 / f5;
            n3 = (int)f6;
            String string2 = this.e.o;
            object = z41.a("<style>body{width:", "px; height: ", "px; margin: 0; padding:0;}</style>", n3, n4);
            String string3 = "<head>";
            StringBuilder stringBuilder = new StringBuilder(string3);
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            String string4 = string2.replaceFirst(string3, (String)object);
            com.clevertap.android.sdk.b.j();
            object = this.j;
            float f7 = 100.0f;
            n4 = (int)(f5 *= f7);
            object.setInitialScale(n4);
            fi_2 fi_22 = this.j;
            String string5 = "text/html";
            String string6 = "utf-8";
            fi_22.loadDataWithBaseURL(null, string4, string5, string6, null);
        } else {
            object = this.e.h;
            fi_2 fi_23 = this.j;
            WebViewClient webViewClient = new WebViewClient();
            fi_23.setWebViewClient(webViewClient);
            fi_23 = this.j;
            fi_23.loadUrl((String)object);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.db();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        try {
            CloseImageView closeImageView;
            fi_2 fi_22;
            int n3;
            RelativeLayout.LayoutParams layoutParams;
            int n4;
            RelativeLayout relativeLayout;
            int n7;
            block11: {
                block8: {
                    block9: {
                        block10: {
                            n7 = R$layout.inapp_html_full;
                            Object var5_12 = null;
                            object = object.inflate(n7, object2, false);
                            int n8 = R$id.inapp_html_full_relative_layout;
                            View view = object.findViewById(n8);
                            relativeLayout = (RelativeLayout)view;
                            n4 = -1;
                            layoutParams = new RelativeLayout.LayoutParams(n4, n4);
                            n4 = 13;
                            layoutParams.addRule(n4);
                            CTInAppNotification cTInAppNotification = this.e;
                            n3 = cTInAppNotification.B;
                            int n10 = 98;
                            if (n3 == n10) break block8;
                            n10 = 99;
                            if (n3 == n10) break block9;
                            n4 = 108;
                            if (n3 == n4) break block10;
                            n4 = 114;
                            if (n3 != n4) {
                                n4 = 116;
                                if (n3 == n4) {
                                    n4 = 10;
                                    layoutParams.addRule(n4);
                                }
                                break block11;
                            } else {
                                n4 = 11;
                                layoutParams.addRule(n4);
                            }
                            break block11;
                        }
                        n4 = 9;
                        layoutParams.addRule(n4);
                        break block11;
                    }
                    layoutParams.addRule(n4);
                    break block11;
                }
                n4 = 12;
                layoutParams.addRule(n4);
            }
            layoutParams.setMargins(0, 0, 0, 0);
            Context context = this.c;
            CTInAppNotification cTInAppNotification = this.e;
            int n14 = cTInAppNotification.K;
            int n15 = cTInAppNotification.l;
            int n16 = cTInAppNotification.L;
            int n17 = cTInAppNotification.m;
            fi_2 fi_23 = fi_22;
            this.j = fi_22 = new fi_2(context, n14, n15, n16, n17);
            rh$a_0 rh$a_0 = new rh$a_0(this);
            fi_2 fi_24 = this.j;
            fi_24.setWebViewClient(rh$a_0);
            CTInAppNotification cTInAppNotification2 = this.e;
            n4 = (int)(cTInAppNotification2.u ? 1 : 0);
            if (n4 != 0) {
                fi_2 fi_25 = this.j;
                WebSettings webSettings = fi_25.getSettings();
                n3 = 1;
                webSettings.setJavaScriptEnabled(n3 != 0);
                fi_2 fi_26 = this.j;
                WebSettings webSettings2 = fi_26.getSettings();
                webSettings2.setJavaScriptCanOpenWindowsAutomatically(false);
                fi_2 fi_27 = this.j;
                WebSettings webSettings3 = fi_27.getSettings();
                webSettings3.setAllowContentAccess(false);
                fi_2 fi_28 = this.j;
                WebSettings webSettings4 = fi_28.getSettings();
                webSettings4.setAllowFileAccess(false);
                fi_2 fi_29 = this.j;
                WebSettings webSettings5 = fi_29.getSettings();
                webSettings5.setAllowFileAccessFromFileURLs(false);
                fi_2 fi_210 = this.j;
                FragmentActivity fragmentActivity = this.getActivity();
                CleverTapInstanceConfig cleverTapInstanceConfig = this.b;
                a a2 = com.clevertap.android.sdk.a.k((Context)fragmentActivity, cleverTapInstanceConfig);
                li_1 li_12 = new li_1(a2, this);
                String string2 = "CleverTap";
                fi_210.addJavascriptInterface(li_12, string2);
            }
            CTInAppNotification cTInAppNotification3 = this.e;
            n4 = (int)(cTInAppNotification3.i ? 1 : 0);
            if (n4 != 0) {
                n4 = -1157627904;
                ColorDrawable colorDrawable = new ColorDrawable(n4);
                relativeLayout.setBackground((Drawable)colorDrawable);
            } else {
                ColorDrawable colorDrawable = new ColorDrawable(0);
                relativeLayout.setBackground((Drawable)colorDrawable);
            }
            fi_2 fi_211 = this.j;
            relativeLayout.addView((View)fi_211, (ViewGroup.LayoutParams)layoutParams);
            CTInAppNotification cTInAppNotification4 = this.e;
            n7 = (int)(cTInAppNotification4.C ? 1 : 0);
            if (n7 == 0) return object;
            Context context2 = this.c;
            this.a = closeImageView = new CloseImageView(context2);
            RelativeLayout.LayoutParams layoutParams2 = this.cb();
            CloseImageView closeImageView2 = this.a;
            qh_1 qh_12 = new qh_1(this);
            closeImageView2.setOnClickListener(qh_12);
            CloseImageView closeImageView3 = this.a;
            relativeLayout.addView((View)closeImageView3, (ViewGroup.LayoutParams)layoutParams2);
            return object;
        }
        catch (Throwable throwable) {
            object = this.b.b();
            String string3 = this.b.a;
            object.getClass();
            com.clevertap.android.sdk.b.m();
            return null;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.db();
    }
}

