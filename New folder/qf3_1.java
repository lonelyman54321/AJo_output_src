/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.net.http.SslError
 *  android.webkit.SslErrorHandler
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.payment.activity.TermsAndConditionActivity;
import com.ril.ajio.services.helper.UrlHelper;

/*
 * Renamed from qF3
 */
public final class qf3_1
extends WebViewClient {
    public final /* synthetic */ rf3_1 a;

    public qf3_1(rf3_1 rf3_12) {
        this.a = rf3_12;
    }

    public final void onPageFinished(WebView object, String object2) {
        boolean bl2;
        super.onPageFinished(object, (String)object2);
        object2 = this.a;
        Object object3 = ((rf3_1)object2).c;
        if (object3 != null && (object3 = ((Fragment)object2).getActivity()) != null && !(bl2 = (object3 = ((Fragment)object2).getActivity()).isFinishing())) {
            object3 = ((rf3_1)object2).c;
            ((PEProgressView)((Object)object3)).dismiss();
        }
        object = object.getTitle();
        object3 = ((Fragment)object2).getActivity();
        if (object3 != null && !(bl2 = (object3 = ((Fragment)object2).getActivity()).isFinishing())) {
            if (object == null && (bl2 = (object3 = ((Fragment)object2).getActivity()) instanceof TermsAndConditionActivity)) {
                object2 = ((TermsAndConditionActivity)((Fragment)object2).getActivity()).X;
                if (object2 != null) {
                    object2.setText((CharSequence)object);
                }
            } else {
                object = ((TermsAndConditionActivity)((Fragment)object2).getActivity()).X;
                if (object != null) {
                    object2 = "Terms And Conditions";
                    object.setText((CharSequence)object2);
                }
            }
        }
    }

    public final void onPageStarted(WebView object, String object2, Bitmap bitmap) {
        boolean bl2;
        super.onPageStarted((WebView)object, object2, bitmap);
        object = this.a;
        object2 = ((rf3_1)object).c;
        if (object2 != null && (object2 = ((Fragment)object).getActivity()) != null && !(bl2 = (object2 = ((Fragment)object).getActivity()).isFinishing())) {
            object = ((rf3_1)object).c;
            ((PEProgressView)((Object)object)).show();
        }
    }

    public final void onReceivedSslError(WebView object, SslErrorHandler sslErrorHandler, SslError sslError) {
        object = UrlHelper.getInstance();
        boolean bl2 = ((UrlHelper)object).isUATDomain();
        if (bl2) {
            sslErrorHandler.proceed();
        } else {
            sslErrorHandler.cancel();
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String charSequence) {
        CharSequence charSequence2 = "?uiel=Mobile&isAppsFlag=true";
        boolean bl2 = ((String)charSequence).contains(charSequence2);
        if (!bl2) {
            String string2;
            Uri uri = Uri.parse((String)charSequence);
            if (uri != null && (string2 = uri.getFragment()) != null) {
                charSequence2 = new StringBuilder("#");
                string2 = uri.getFragment();
                ((StringBuilder)charSequence2).append(string2);
                charSequence2 = ((StringBuilder)charSequence2).toString();
                string2 = "";
                charSequence = nn_2.a(((String)charSequence).replace(charSequence2, string2), "?uiel=Mobile&isAppsFlag=true#");
                charSequence2 = uri.getFragment();
                ((StringBuilder)charSequence).append((String)charSequence2);
                charSequence = ((StringBuilder)charSequence).toString();
            } else {
                charSequence = ((String)charSequence).concat((String)charSequence2);
            }
        }
        webView.loadUrl((String)charSequence);
        return true;
    }
}

