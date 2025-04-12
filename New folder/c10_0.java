/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.IntentSender$SendIntentException
 */
import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity$f;
import java.io.Serializable;

/*
 * Renamed from c10
 */
public final class c10_0
implements Runnable {
    public final /* synthetic */ ComponentActivity$f a;
    public final /* synthetic */ int b;
    public final /* synthetic */ IntentSender.SendIntentException c;

    public /* synthetic */ c10_0(ComponentActivity$f componentActivity$f, int n3, IntentSender.SendIntentException sendIntentException) {
        this.a = componentActivity$f;
        this.b = n3;
        this.c = sendIntentException;
    }

    public final void run() {
        Intent intent = new Intent();
        intent = intent.setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Object object = this.c;
        intent = intent.putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable)object);
        object = this.a;
        int n3 = this.b;
        ((K3)object).a(n3, 0, intent);
    }
}

