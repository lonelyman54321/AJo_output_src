/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  org.json.JSONObject
 */
import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.g;
import java.util.Objects;
import org.json.JSONObject;

/*
 * Renamed from eB2
 */
public final class eb2_0
implements lz3$a {
    public final void a(JSONObject jSONObject) {
        Profile profile;
        String string2;
        Uri uri = null;
        String string3 = jSONObject != null ? (string2 = jSONObject.optString("id")) : null;
        if (string3 == null) {
            return;
        }
        string2 = jSONObject.optString("link");
        Object object = jSONObject.optString("profile_picture", null);
        String string4 = jSONObject.optString("first_name");
        String string5 = jSONObject.optString("middle_name");
        String string6 = jSONObject.optString("last_name");
        String string7 = jSONObject.optString("name");
        JSONObject jSONObject2 = string2 != null ? (jSONObject = Uri.parse((String)string2)) : null;
        if (object != null) {
            uri = Uri.parse((String)object);
        }
        object = profile;
        profile = new Profile(string3, string4, string5, string6, string7, (Uri)jSONObject2, uri);
        g.d.a().a(profile, true);
    }

    public final void b(FacebookException facebookException) {
        Objects.toString(facebookException);
    }
}

