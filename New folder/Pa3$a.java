/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 *  android.text.TextUtils
 */
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.internal.Intrinsics;

public final class Pa3$a
extends AsyncTask {
    public final UserInformation a;

    public Pa3$a(UserInformation userInformation) {
        this.a = userInformation;
    }

    public final Object doInBackground(Object[] object) {
        Intrinsics.checkNotNullParameter((String[])object, "params");
        AJIOApplication.Companion.getClass();
        object = AJIOApplication$a.a();
        Intrinsics.checkNotNullParameter(object, "context");
        ZX0 zX0 = ZX0.b;
        if (zX0 == null) {
            ZX0.b = zX0 = new ZX0((AJIOApplication)object);
        }
        object = ZX0.b;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ajio.ril.core.analytics.GATracker");
        return object.a.get("&cid");
    }

    public final void onPostExecute(Object object) {
        UserInformation userInformation;
        object = (String)object;
        super.onPostExecute(object);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2 && (userInformation = this.a) != null) {
            userInformation.setClientId((String)object);
        }
    }
}

