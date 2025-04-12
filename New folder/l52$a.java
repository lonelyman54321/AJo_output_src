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

public final class l52$a
extends Lambda
implements Function0 {
    public final /* synthetic */ l52_0 c;

    public l52$a(l52_0 l52_02) {
        this.c = l52_02;
        super(0);
    }

    public final Object invoke() {
        Context context = this.c.a;
        String string2 = "context";
        Intrinsics.checkNotNullParameter(context, string2);
        Intrinsics.checkNotNullParameter(context, string2);
        string2 = new Intent(context, MainActivity.class);
        string2 = string2.setFlags(0x10000000);
        Intrinsics.checkNotNullExpressionValue(string2, "Intent(context, MainActivity::class.java)\n            .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)");
        string2 = string2.putExtra("EXTRA_SCREEN", 2);
        String string3 = "getLaunchIntent(context).putExtra(MainActivity.EXTRA_SCREEN, screen)";
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            n3 = 0x4000000;
        } else {
            n3 = 0;
            string3 = null;
        }
        return PendingIntent.getActivity((Context)context, (int)3546, (Intent)string2, (int)(n3 |= 0x8000000));
    }
}

