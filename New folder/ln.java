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
import com.ril.ajio.services.data.Payment.EmiSdkInformation;
import java.io.Serializable;

public final class ln {
    public static /* bridge */ /* synthetic */ Serializable a(Intent intent) {
        return intent.getSerializableExtra("data_emi_json", EmiSdkInformation.class);
    }

    public static /* bridge */ /* synthetic */ void b(OnBackInvokedDispatcher onBackInvokedDispatcher, mn mn4) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback)mn4);
    }
}

