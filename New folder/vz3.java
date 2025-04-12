/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.widget.Toast
 */
import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import java.util.concurrent.Callable;

public final class vz3
implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;

    public vz3(String string2, Context context) {
        this.a = string2;
        this.b = context;
    }

    public final Object call() {
        String string2 = this.a;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            Context context = this.b;
            string2 = Toast.makeText((Context)context, (CharSequence)string2, (int)0);
            string2.show();
        }
        return null;
    }
}

