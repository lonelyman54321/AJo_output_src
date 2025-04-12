/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.io.InputStream;
import java.util.concurrent.Callable;

public final class TB1
implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ InputStream b;
    public final /* synthetic */ String c;

    public /* synthetic */ TB1(Context context, InputStream inputStream, String string2) {
        this.a = context;
        this.b = inputStream;
        this.c = string2;
    }

    public final Object call() {
        Context context = this.a;
        InputStream inputStream = this.b;
        String string2 = this.c;
        return cc1_0.d(context, inputStream, string2);
    }
}

