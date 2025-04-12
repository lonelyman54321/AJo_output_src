/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.window.OnBackInvokedCallback
 *  android.window.OnBackInvokedDispatcher
 */
import android.content.Intent;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import java.io.Serializable;

public final class jn {
    public static /* bridge */ /* synthetic */ Serializable a(Intent intent) {
        return intent.getSerializableExtra("RETURN_ITEMS_DATA", ReturnOrderItemDetails.class);
    }

    public static /* bridge */ /* synthetic */ void b(OnBackInvokedDispatcher onBackInvokedDispatcher, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
    }
}

