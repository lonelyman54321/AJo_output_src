/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.Intrinsics;

public final class G1$a
extends BroadcastReceiver {
    public final /* synthetic */ G1 a;

    public G1$a(G1 g1) {
        this.a = g1;
    }

    public final void onReceive(Context object, Intent intent) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        object = intent.getAction();
        String string2 = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";
        boolean bl2 = Intrinsics.areEqual(string2, object);
        if (bl2) {
            object = lz3_0.a;
            object = FacebookSdk.a;
            object = (AccessToken)intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN");
            object = (AccessToken)intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN");
            object = this.a;
            ((G1)object).a();
        }
    }
}

