/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 */
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.chuckerteam.chucker.internal.ui.MainActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l52$b
extends Lambda
implements Function0 {
    public final /* synthetic */ l52_0 c;

    public l52$b(l52_0 l52_02) {
        this.c = l52_02;
        super(0);
    }

    public final Object invoke() {
        Context context = this.c.a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, MainActivity.class);
        intent = intent.setFlags(0x10000000);
        String string2 = "Intent(context, MainActivity::class.java)\n            .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)";
        Intrinsics.checkNotNullExpressionValue(intent, string2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            n3 = 0x4000000;
        } else {
            n3 = 0;
            string2 = null;
        }
        return PendingIntent.getActivity((Context)context, (int)1138, (Intent)intent, (int)(n3 |= 0x8000000));
    }
}

