/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.WebSettings
 */
import android.content.Context;
import android.webkit.WebSettings;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import java.util.Map;
import kotlin.Pair;

/*
 * Renamed from X31
 */
public final class x31_0
extends a01 {
    public static String f() {
        Object object = AJIOApplication.Companion;
        object.getClass();
        object = AJIOApplication$a.a();
        try {
            object = WebSettings.getDefaultUserAgent((Context)object);
        }
        catch (Exception exception) {
            object = "";
        }
        return Ft2.a((String)object, ";AJIO/9.20.0");
    }

    public final Map d() {
        Object object = h40_0.a;
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("akamai_image_header");
        Object object2 = z40$a.a((Context)AJIOApplication$a.a()).a;
        boolean bl2 = ((ao0_0)object2).a("isAkamaiImageManager");
        String string2 = "User-Agent";
        if (bl2) {
            object2 = x31_0.f();
            Pair pair = new Pair(string2, object2);
            object2 = new Pair("Accept", object);
            int n3 = 2;
            object = new Pair[n3];
            string2 = null;
            object[0] = pair;
            int n4 = 1;
            object[n4] = object2;
            object = fh1_2.i(object);
        } else {
            object = x31_0.f();
            object2 = new Pair(string2, object);
            object = eh1_2.d((Pair)object2);
        }
        return object;
    }
}

