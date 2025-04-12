/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

public final class WB1
implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ZipInputStream b;
    public final /* synthetic */ String c;

    public /* synthetic */ WB1(ZipInputStream zipInputStream, String string2) {
        this.a = null;
        this.b = zipInputStream;
        this.c = string2;
    }

    public final Object call() {
        Context context = this.a;
        ZipInputStream zipInputStream = this.b;
        String string2 = this.c;
        return cc1_0.i(context, zipInputStream, string2);
    }
}

