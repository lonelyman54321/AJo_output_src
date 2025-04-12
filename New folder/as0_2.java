/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.CountDownTimer
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.home.DodCacheBurstReceiver;
import kotlin.jvm.internal.Ref$LongRef;

/*
 * Renamed from as0
 */
public final class as0_2
extends CountDownTimer {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;

    public as0_2(Ref$LongRef ref$LongRef, long l2, long l3) {
        this.a = l2;
        this.b = l3;
        long l4 = ref$LongRef.element;
        super(l4, 1000L);
    }

    public final void onFinish() {
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        Intent intent = new Intent((Context)aJIOApplication, DodCacheBurstReceiver.class);
        aJIOApplication = new Bundle();
        aJIOApplication.putBoolean("IS_AT_DEAL_START", true);
        long l2 = this.a;
        aJIOApplication.putLong("DEAL_START_TIME", l2);
        l2 = this.b;
        aJIOApplication.putLong("DEAL_END_TIME", l2);
        intent.putExtra("DEAL_BUNDLE", (Bundle)aJIOApplication);
        AJIOApplication$a.a().sendBroadcast(intent);
    }

    public final void onTick(long l2) {
    }
}

