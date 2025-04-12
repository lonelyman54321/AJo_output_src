/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.web.game.GameWebViewActivity;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from iY0
 */
public final class iy0_2
extends zj0_0 {
    public Boolean c;
    public final UserInformation d;

    public iy0_2(Activity object) {
        super((Activity)object);
        object = Boolean.FALSE;
        this.c = object;
        object = VX0.a(AJIOApplication.Companion);
        this.d = object;
    }

    public final void b(String object, boolean bl2) {
        if (bl2) {
            boolean bl3;
            Object object2 = this.d;
            boolean bl4 = ((UserInformation)object2).isUserOnline();
            Activity activity = this.a;
            if (!bl4 && !(bl3 = ((Boolean)(object2 = this.c)).booleanValue())) {
                object2 = "source - game";
                at2_1.i(activity, (String)object, (String)object2);
            } else {
                boolean bl5;
                String string2;
                HashMap<String, Object> hashMap;
                object2 = UrlHelper.getInstance();
                boolean bl6 = ((UrlHelper)object2).isUATDomain();
                if (bl6) {
                    object2 = UrlHelper.getInstance();
                    boolean bl7 = ((UrlHelper)object2).isUAT1Domain();
                    hashMap = "www.ajio.com";
                    if (bl7) {
                        object2 = "qa.services.ajio.com";
                        object = ((String)object).replace((CharSequence)((Object)hashMap), (CharSequence)object2);
                    } else {
                        object2 = UrlHelper.getInstance();
                        boolean bl8 = ((UrlHelper)object2).isUAT2Domain();
                        if (bl8) {
                            object2 = "uat2.ajio.ril.com";
                            object = ((String)object).replace((CharSequence)((Object)hashMap), (CharSequence)object2);
                        }
                    }
                }
                GameWebViewActivity.Companion.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(object, "deeplinkUrl");
                object2 = "http";
                hashMap = null;
                boolean bl9 = kotlin.text.b.s((String)object, (String)object2, false);
                object2 = bl9 ? object : Ft2.a(UrlHelper.Companion.getInstance().getBaseUrl(), (String)object);
                String string3 = " ";
                boolean bl10 = StringsKt.F((CharSequence)object2, string3, false);
                if (bl10) {
                    string2 = "%20";
                    boolean bl11 = true;
                    object2 = kotlin.text.b.n((String)object2, string3, string2, bl11);
                }
                if (bl5 = StringsKt.F((CharSequence)object, string3 = "/assured-gifts", false)) {
                    AJIOApplication.Companion.getClass();
                    hashMap = AJIOApplication$a.a();
                    object = new jo_2((Context)hashMap);
                    hashMap = new HashMap<String, Object>();
                    float f5 = ((jo_2)object).c();
                    object = String.valueOf(Float.valueOf(f5));
                    string3 = "orderValue";
                    hashMap.put(string3, object);
                    object = UrlHelper.Companion.getInstance();
                    object2 = ((UrlHelper)object).addParams((String)object2, hashMap);
                }
                object = Uri.parse((String)object2);
                string3 = object.getLastPathSegment();
                Intrinsics.checkNotNull(string3);
                string2 = "gameName";
                object = object.getQueryParameter(string2);
                hashMap = new HashMap<String, Object>(string3, (String)object, (String)object2);
                object = new Intent((Context)activity, GameWebViewActivity.class);
                object2 = "GAME_INFO";
                object.putExtra((String)object2, hashMap);
                int n3 = 43;
                activity.startActivityForResult((Intent)object, n3);
            }
        }
    }

    public final void c() {
        Boolean bl2;
        this.c = bl2 = Boolean.TRUE;
    }
}

