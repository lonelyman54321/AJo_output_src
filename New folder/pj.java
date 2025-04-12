/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 */
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class pj
implements Xw3 {
    public final Context a;

    public pj(Context context) {
        this.a = context;
    }

    public final void a(String string2) {
        IllegalArgumentException illegalArgumentException;
        String string3;
        Context context;
        try {
            context = this.a;
            string3 = "android.intent.action.VIEW";
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            string2 = oj_0.b('.', "Can't open ", string2);
            illegalArgumentException = new IllegalArgumentException(string2, activityNotFoundException);
            throw illegalArgumentException;
        }
        Uri uri = Uri.parse((String)string2);
        illegalArgumentException = new Intent(string3, uri);
        context.startActivity((Intent)illegalArgumentException);
    }
}

