/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.Callable;

public final class YB1
implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ YB1(Context context, String string2, String string3) {
        this.a = context;
        this.b = string2;
        this.c = string3;
    }

    public final Object call() {
        Context context = this.a;
        String string2 = this.b;
        String string3 = this.c;
        return cc1_0.c(context, string2, string3);
    }
}

