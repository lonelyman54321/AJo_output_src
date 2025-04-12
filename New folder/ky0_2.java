/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.CookieManager
 *  android.webkit.ValueCallback
 *  android.webkit.WebView
 */
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.ril.ajio.data.model.GameInfo;
import com.ril.ajio.web.game.GameWebViewActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kY0
 */
public final class ky0_2
implements ValueCallback {
    public final /* synthetic */ CookieManager a;
    public final /* synthetic */ GameWebViewActivity b;

    public /* synthetic */ ky0_2(CookieManager cookieManager, GameWebViewActivity gameWebViewActivity) {
        this.a = cookieManager;
        this.b = gameWebViewActivity;
    }

    public final void onReceiveValue(Object object) {
        object = (Boolean)object;
        object = GameWebViewActivity.Companion;
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.a;
        boolean bl2 = true;
        object2.setAcceptCookie(bl2);
        object2.acceptCookie();
        Object object3 = ((GameWebViewActivity)object).Z;
        object2.setAcceptThirdPartyCookies((WebView)object3, bl2);
        Object object4 = ((GameWebViewActivity)object).Z;
        object2.acceptThirdPartyCookies((WebView)object4);
        object4 = ((GameWebViewActivity)object).Y;
        Intrinsics.checkNotNull(object4);
        object4 = ((GameInfo)object4).getGameUrl();
        object3 = ((GameWebViewActivity)object).X;
        Object[] objectArray = null;
        String string2 = "gameWebViewModel";
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object3 = null;
        }
        object3 = ((ly0_2)object3).b();
        Object[] objectArray2 = ((GameWebViewActivity)object).X;
        if (objectArray2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            objectArray = objectArray2;
        }
        objectArray.getClass();
        objectArray = ly0_2.a((String)object4);
        object3 = ((ArrayList)object3).iterator();
        while (true) {
            boolean bl3 = object3.hasNext();
            objectArray2 = null;
            if (!bl3) break;
            string2 = (String)object3.next();
            object2.setCookie((String)objectArray, string2);
            yn3$a yn3$a = yn3_0.a;
            String string3 = "GameWebView: Cookie: ";
            String string4 = " is set to url domain: ";
            string2 = UX.c(string3, string2, string4, (String)objectArray);
            objectArray2 = new Object[]{};
            yn3$a.a(string2, objectArray2);
        }
        object2 = yn3_0.a;
        objectArray = new Object[]{};
        ((yn3$a)object2).a("Cookies set.", objectArray);
        ((GameWebViewActivity)object).y2((String)object4);
    }
}

