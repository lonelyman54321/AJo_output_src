/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.CookieManager
 *  android.webkit.ValueCallback
 *  android.webkit.WebView
 */
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sF3
 */
public final class sf3_2
implements ValueCallback {
    public final /* synthetic */ CookieManager a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ jo_2 c;
    public final /* synthetic */ String d;

    public /* synthetic */ sf3_2(CookieManager cookieManager, WebView webView, jo_2 jo_22, String string2) {
        this.a = cookieManager;
        this.b = webView;
        this.c = jo_22;
        this.d = string2;
    }

    public final void onReceiveValue(Object object) {
        int n3;
        CharSequence charSequence;
        String string2;
        int n4;
        object = (Boolean)object;
        object = this.c;
        Intrinsics.checkNotNullParameter(object, "$appPreferences");
        CookieManager cookieManager = this.a;
        int n7 = 1;
        cookieManager.setAcceptCookie(n7 != 0);
        cookieManager.acceptCookie();
        Object object2 = this.b;
        cookieManager.setAcceptThirdPartyCookies((WebView)object2, n7 != 0);
        cookieManager.acceptThirdPartyCookies((WebView)object2);
        Object object3 = VX0.a(AJIOApplication.Companion);
        object2 = ((UserInformation)object3).getCustomerUUID();
        String string3 = this.d;
        String string4 = ";";
        if (object2 != null && (n4 = ((String)object2).length()) != 0) {
            object2 = ((UserInformation)object3).getCustomerUUID();
            string2 = "UUID=";
            charSequence = new StringBuilder(string2);
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append(string4);
            object2 = ((StringBuilder)charSequence).toString();
            cookieManager.setCookie(string3, (String)object2);
        }
        if ((object2 = ((UserInformation)object3).getSecureAccessToken()) != null && (n4 = ((String)object2).length()) != 0) {
            object2 = ((UserInformation)object3).getSecureAccessToken();
            string2 = "A=";
            charSequence = new StringBuilder(string2);
            ((StringBuilder)charSequence).append((String)object2);
            object2 = ((StringBuilder)charSequence).toString();
            cookieManager.setCookie(string3, (String)object2);
        }
        if ((object2 = ((UserInformation)object3).getUserId()) != null && (n4 = ((String)object2).length()) != 0) {
            object2 = ((UserInformation)object3).getUserId();
            string2 = "U=";
            charSequence = new StringBuilder(string2);
            ((StringBuilder)charSequence).append((String)object2);
            object2 = ((StringBuilder)charSequence).toString();
            cookieManager.setCookie(string3, (String)object2);
        }
        if ((object2 = ((UserInformation)object3).getSecureRefreshToken()) != null && (n4 = ((String)object2).length()) != 0) {
            object2 = ((UserInformation)object3).getSecureRefreshToken();
            string2 = "R=";
            charSequence = new StringBuilder(string2);
            ((StringBuilder)charSequence).append((String)object2);
            object2 = ((StringBuilder)charSequence).toString();
            cookieManager.setCookie(string3, (String)object2);
        }
        if ((object2 = ((UserInformation)object3).getUserPhoneNumber()) != null && (n4 = ((String)object2).length()) != 0) {
            object2 = ((UserInformation)object3).getUserPhoneNumber();
            string2 = "MN=";
            charSequence = new StringBuilder(string2);
            ((StringBuilder)charSequence).append((String)object2);
            object2 = ((StringBuilder)charSequence).toString();
            cookieManager.setCookie(string3, (String)object2);
        }
        if ((object2 = ((UserInformation)object3).getUserName()) != null && (n4 = ((String)object2).length()) != 0) {
            object3 = ((UserInformation)object3).getUserName();
            charSequence = "UN=";
            object2 = new StringBuilder((String)charSequence);
            ((StringBuilder)object2).append((String)object3);
            object3 = ((StringBuilder)object2).toString();
            cookieManager.setCookie(string3, (String)object3);
        }
        object3 = "FULL_NAME";
        object2 = "";
        charSequence = ((sw_0)object).getPreference((String)object3, (String)object2);
        string2 = "SN=";
        if (charSequence != null && (n3 = ((String)charSequence).length()) != 0) {
            object = ((sw_0)object).getPreference((String)object3, (String)object2);
            object3 = new StringBuilder(string2);
            ((StringBuilder)object3).append((String)object);
            object = ((StringBuilder)object3).toString();
            cookieManager.setCookie(string3, (String)object);
        } else {
            object = UserInformation.getInstance((Context)AJIOApplication$a.a()).getUserName();
            if (object != null && (n7 = ((String)object).length()) != 0) {
                object = string2.concat((String)object);
                cookieManager.setCookie(string3, (String)object);
            }
        }
        cookieManager.setCookie(string3, "V=201");
        object = p90.a((Context)AJIOApplication$a.a());
        n7 = ((String)object).length();
        if (n7 > 0) {
            object2 = "AV=";
            object3 = new StringBuilder((String)object2);
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append(string4);
            object = ((StringBuilder)object3).toString();
            cookieManager.setCookie(string3, (String)object);
        }
    }
}

