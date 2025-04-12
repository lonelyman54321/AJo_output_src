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
import com.ril.ajio.gamezone.GameZoneWebViewActivity;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zY0
 */
public final class zy0_0
implements ValueCallback {
    public final /* synthetic */ CookieManager a;
    public final /* synthetic */ GameZoneWebViewActivity b;
    public final /* synthetic */ String c;

    public /* synthetic */ zy0_0(CookieManager cookieManager, GameZoneWebViewActivity gameZoneWebViewActivity, String string2) {
        this.a = cookieManager;
        this.b = gameZoneWebViewActivity;
        this.c = string2;
    }

    public final void onReceiveValue(Object object) {
        boolean bl2;
        object = (Boolean)object;
        object = GameZoneWebViewActivity.Companion;
        Iterator iterator = this.b;
        Intrinsics.checkNotNullParameter(iterator, "this$0");
        Object object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$gameUrl");
        object = this.a;
        boolean bl3 = true;
        object.setAcceptCookie(bl3);
        object.acceptCookie();
        Object object3 = ((GameZoneWebViewActivity)((Object)iterator)).y2().agWebView;
        object.setAcceptThirdPartyCookies((WebView)object3, bl3);
        Object object4 = ((GameZoneWebViewActivity)((Object)iterator)).y2().agWebView;
        object.acceptThirdPartyCookies((WebView)object4);
        object4 = ((GameZoneWebViewActivity)((Object)iterator)).Y;
        object3 = null;
        Object object5 = "gameZoneWebViewModel";
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            bl3 = false;
            object4 = null;
        }
        object4.getClass();
        Object object6 = new ArrayList();
        Object object7 = UserInformation.getInstance((Context)((fy0_0)object4).b);
        CharSequence charSequence = ((UserInformation)object7).getSecureAccessToken();
        String string2 = "A=";
        CharSequence charSequence2 = new StringBuilder(string2);
        charSequence2.append((String)charSequence);
        charSequence = charSequence2.toString();
        ((ArrayList)object6).add(charSequence);
        charSequence = new StringBuilder("CV=");
        object4 = ((fy0_0)object4).d;
        ((StringBuilder)charSequence).append((String)object4);
        object4 = ((StringBuilder)charSequence).toString();
        ((ArrayList)object6).add(object4);
        object4 = ((UserInformation)object7).getUserId();
        charSequence2 = "U=";
        charSequence = new StringBuilder((String)charSequence2);
        ((StringBuilder)charSequence).append((String)object4);
        object4 = ((StringBuilder)charSequence).toString();
        ((ArrayList)object6).add(object4);
        object4 = ((UserInformation)object7).getSecureRefreshToken();
        charSequence = "R=";
        object7 = new StringBuilder((String)charSequence);
        ((StringBuilder)object7).append((String)object4);
        object4 = ((StringBuilder)object7).toString();
        ((ArrayList)object6).add(object4);
        ((ArrayList)object6).add("V=201");
        object4 = "AB=A";
        ((ArrayList)object6).add(object4);
        iterator = ((GameZoneWebViewActivity)((Object)iterator)).Y;
        if (iterator == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
        } else {
            object3 = iterator;
        }
        object3.getClass();
        Intrinsics.checkNotNullParameter(object2, "gameUrl");
        iterator = UrlHelper.Companion;
        object2 = ((UrlHelper$Companion)((Object)iterator)).getInstance();
        boolean bl4 = object2.isUATServicesDomain();
        object4 = ".ajio.com";
        if (!bl4 && (bl2 = ((UrlHelper)((Object)(iterator = ((UrlHelper$Companion)((Object)iterator)).getInstance()))).isUATDomain())) {
            object4 = ".ril.com";
        }
        iterator = ((ArrayList)object6).iterator();
        while (true) {
            bl4 = iterator.hasNext();
            object3 = null;
            if (!bl4) break;
            object2 = (String)iterator.next();
            object.setCookie((String)object4, (String)object2);
            object5 = yn3_0.a;
            object6 = "GameWebView: Cookie: ";
            object7 = " is set to url domain: ";
            object2 = UX.c((String)object6, (String)object2, (String)object7, (String)object4);
            object3 = new Object[]{};
            ((yn3$a)object5).a((String)object2, (Object[])object3);
        }
        object = yn3_0.a;
        object2 = new Object[]{};
        ((yn3$a)object).a("Cookies set.", object2);
    }
}

