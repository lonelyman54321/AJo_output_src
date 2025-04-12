/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.Intent
 *  android.os.Parcelable
 */
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Parcelable;

public final class E13$a {
    public final Intent a;
    public CharSequence b;

    public E13$a(Context context) {
        String string2;
        Intent intent;
        block3: {
            boolean bl2;
            context.getClass();
            intent = new Intent();
            this.a = intent = intent.setAction("android.intent.action.SEND");
            String string3 = context.getPackageName();
            intent.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", string3);
            string2 = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
            string3 = context.getPackageName();
            intent.putExtra(string2, string3);
            int n3 = 524288;
            intent.addFlags(n3);
            while (bl2 = context instanceof ContextWrapper) {
                bl2 = context instanceof Activity;
                if (bl2) {
                    context = (Activity)context;
                    break block3;
                }
                context = ((ContextWrapper)context).getBaseContext();
            }
            context = null;
        }
        if (context != null) {
            context = context.getComponentName();
            this.a.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", (Parcelable)context);
            intent = this.a;
            string2 = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
            intent.putExtra(string2, (Parcelable)context);
        }
    }

    public final Intent a() {
        Intent intent = this.a;
        intent.setAction("android.intent.action.SEND");
        intent.removeExtra("android.intent.extra.STREAM");
        intent.setClipData(null);
        int n3 = intent.getFlags() & 0xFFFFFFFE;
        intent.setFlags(n3);
        return intent;
    }
}

