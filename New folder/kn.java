/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.window.OnBackInvokedDispatcher
 */
import android.app.Activity;
import android.content.Intent;
import android.window.OnBackInvokedDispatcher;
import java.io.Serializable;
import java.util.HashMap;

public final class kn {
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ Serializable b(Intent intent) {
        return intent.getSerializableExtra("GIFTS_ITEMS_DATA", HashMap.class);
    }
}

