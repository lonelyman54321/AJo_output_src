/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.PEProgressView;

/*
 * Renamed from rF3
 */
public class rf3_1
extends Fragment
implements Handler.Callback {
    public FragmentActivity a;
    public WebView b;
    public PEProgressView c;
    public String d;

    public final boolean handleMessage(Message message) {
        return false;
    }

    public final void onAttach(Context object) {
        super.onAttach((Context)object);
        object = this.getActivity();
        this.a = object;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            object = this.getArguments();
            String string2 = "url";
            object = object.getString(string2);
            this.d = object;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int n3 = R$layout.pesdk_fragment_web;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        this.a.getWindow().setSoftInputMode(3);
    }

    public final void onViewCreated(View object, Bundle object2) {
        super.onViewCreated((View)object, (Bundle)object2);
        int bl2 = R$id.ajio_webpages;
        object2 = (WebView)object.findViewById(bl2);
        this.b = object2;
        int n3 = R$id.fragment_web_progressView;
        object = (PEProgressView)object.findViewById(n3);
        this.c = object;
        object = this.b;
        object2 = new rF3$a(this);
        object.setWebViewClient((WebViewClient)object2);
        object = this.b.getSettings();
        boolean bl3 = true;
        object.setJavaScriptEnabled(bl3);
        this.b.getSettings().setJavaScriptCanOpenWindowsAutomatically(bl3);
        object = this.d;
        String string2 = "?uiel=Mobile&isAppsFlag=true";
        boolean bl4 = object.contains(string2);
        if (!bl4) {
            object = new StringBuilder();
            string2 = this.d;
            String string3 = "?site=rilfnl&uiel=Mobile&isAppsFlag=true";
            object = h30_0.a((StringBuilder)object, string2, string3);
            this.d = object;
        }
        object = new qf3_1(this);
        this.b.setWebViewClient((WebViewClient)object);
        this.b.getSettings().setLoadWithOverviewMode(bl3);
        this.b.getSettings().setUseWideViewPort(bl3);
        this.b.getSettings().setLoadsImagesAutomatically(bl3);
        this.b.getSettings().setJavaScriptEnabled(bl3);
        this.b.setScrollBarStyle(0);
        object = this.d;
        this.b.loadUrl((String)object);
    }
}

