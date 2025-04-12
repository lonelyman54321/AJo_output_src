/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.activity.result.ActivityResult;

public final class BE$a {
    public static Object a(Bundle bundle, String string2) {
        return bundle.getParcelable(string2, ActivityResult.class);
    }
}

