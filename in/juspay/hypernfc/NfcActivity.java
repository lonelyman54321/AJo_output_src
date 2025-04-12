/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 *  org.json.JSONObject
 */
package in.juspay.hypernfc;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.cardreader.card_reader_lib.CardTask;
import in.juspay.hypernfc.NfcActivity$onCreate$2;
import in.juspay.hypernfc.NfcActivity$onNewIntent$1;
import in.juspay.hypernfc.NfcActivity$onNewIntent$3;
import in.juspay.hypernfc.NfcActivity$timedOut$1;
import in.juspay.hypernfc.R$drawable;
import in.juspay.hypernfc.R$id;
import in.juspay.hypernfc.R$layout;
import in.juspay.hypernfc.R$string;
import in.juspay.hypernfc.Wave;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class NfcActivity
extends FragmentActivity {
    private final CardTask cardTask;
    private final JSONObject data;
    private TimerTask task;
    private final Timer timerForWaitingInActivity;
    private final Timer timerToReadChangedMessage;

    public NfcActivity() {
        Object object;
        this.data = object = new JSONObject();
        this.cardTask = object;
        super();
        this.timerForWaitingInActivity = object;
        super();
        this.timerToReadChangedMessage = object;
    }

    public static final /* synthetic */ JSONObject access$getData$p(NfcActivity nfcActivity) {
        return nfcActivity.data;
    }

    public static final /* synthetic */ void access$timedOut(NfcActivity nfcActivity, JSONObject jSONObject) {
        nfcActivity.timedOut(jSONObject);
    }

    private static final void onCreate$lambda$0(NfcActivity object, ImageView imageView) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        int n3 = R$id.rippleView;
        object = (Wave)object.findViewById(n3);
        n3 = imageView.getTop();
        int n4 = imageView.getHeight() / 2 + n3;
        ((Wave)((Object)object)).startRippleAnimation(n4);
    }

    private static final void onNewIntent$lambda$1(NfcActivity nfcActivity) {
        Intrinsics.checkNotNullParameter(nfcActivity, "this$0");
        int n3 = R$id.backgroundImage;
        View view = nfcActivity.findViewById(n3);
        nfcActivity = nfcActivity.getApplicationContext();
        int n4 = R$drawable.image_border;
        nfcActivity = t70.getDrawable((Context)nfcActivity, n4);
        view.setBackground((Drawable)nfcActivity);
    }

    public static /* synthetic */ void p2(NfcActivity nfcActivity, ImageView imageView) {
        NfcActivity.onCreate$lambda$0(nfcActivity, imageView);
    }

    public static /* synthetic */ void r2(NfcActivity nfcActivity) {
        NfcActivity.onNewIntent$lambda$1(nfcActivity);
    }

    private final void timedOut(JSONObject jSONObject) {
        int n3 = R$id.nfcStatus;
        Object object = (TextView)this.findViewById(n3);
        int n4 = R$string.no_card_detected;
        object.setText(n4);
        object = new NfcActivity$timedOut$1(jSONObject, this);
        this.task = object;
        this.timerToReadChangedMessage.schedule((TimerTask)object, 1500L);
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        this.setResult(0, intent);
        this.finish();
    }

    public void onCreate(Bundle bundle) {
        int n3;
        Object object;
        super.onCreate(bundle);
        bundle = this.getIntent().getExtras();
        if (bundle != null) {
            object = "waitingTime";
            n3 = bundle.getInt((String)object);
        } else {
            n3 = 7000;
        }
        int n4 = R$layout.activity_nfc;
        this.setContentView(n4);
        n4 = R$id.backgroundImage;
        object = (ImageView)this.findViewById(n4);
        Object object2 = new th_2(2, this, object);
        object.post((Runnable)object2);
        this.task = object = new NfcActivity$onCreate$2(this);
        object2 = this.timerForWaitingInActivity;
        long l2 = n3;
        ((Timer)object2).schedule((TimerTask)object, l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onDestroy() {
        super.onDestroy();
        try {
            Object object = this.task;
            if (object != null) {
                ((TimerTask)object).cancel();
            }
            object = this.timerForWaitingInActivity;
            ((Timer)object).cancel();
            object = this.timerToReadChangedMessage;
            ((Timer)object).cancel();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public void onNewIntent(Intent object) {
        long l2;
        Timer timer;
        int n3;
        String string2;
        Object object2;
        block23: {
            object2 = "intent";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            super.onNewIntent((Intent)object);
            object2 = this.cardTask;
            object = ((CardTask)object2).getCardDetails((Intent)object);
            object2 = this.data;
            string2 = "error";
            n3 = 0;
            timer = null;
            object2.put(string2, null);
            object2 = this.data;
            string2 = "data";
            object2.put(string2, object);
            l2 = 1500L;
            if (object == null) break block23;
            int n4 = R$id.nfcStatus;
            object = this.findViewById(n4);
            object = (TextView)object;
            n3 = R$string.scan_successful;
            object.setText(n3);
            object = new NfcActivity$onNewIntent$1(this);
            this.task = object;
            timer = this.timerToReadChangedMessage;
            timer.schedule((TimerTask)object, l2);
        }
        n3 = 1;
        object = new sw_1(this, n3);
        this.runOnUiThread((Runnable)object);
        int n7 = R$id.nfcStatus;
        object = this.findViewById(n7);
        object = (TextView)object;
        n3 = R$string.scan_failed;
        object.setText(n3);
        object = new NfcActivity$onNewIntent$3(this);
        this.task = object;
        timer = this.timerToReadChangedMessage;
        try {
            timer.schedule((TimerTask)object, l2);
        }
        catch (Exception exception) {
            object = new Intent();
            string2 = "{\"error\":\"Couldn't recognize card ! Try again or type your card number\"}";
            object.putExtra("result_data", string2);
            object2 = null;
            this.setResult(0, (Intent)object);
            this.finish();
        }
    }

    public void onPause() {
        super.onPause();
        CardTask cardTask = this.cardTask;
        boolean bl2 = cardTask.isNFCEnabled((Context)this);
        if (bl2) {
            cardTask = this.cardTask;
            cardTask.onPauseClone(this);
        }
    }

    public void onResume() {
        super.onResume();
        CardTask cardTask = this.cardTask;
        boolean bl2 = cardTask.isNFCEnabled((Context)this);
        if (bl2) {
            cardTask = this.cardTask;
            cardTask.onResumeClone(this);
        }
    }
}

