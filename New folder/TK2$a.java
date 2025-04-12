/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetFileDescriptor
 */
import android.content.Context;
import android.content.res.AssetFileDescriptor;

public final class TK2$a
implements CP1 {
    public final Context a;

    public TK2$a(Context context) {
        this.a = context;
    }

    public final BP1 c(OQ1 object) {
        object = ((OQ1)object).c(Integer.class, AssetFileDescriptor.class);
        Context context = this.a;
        TK2 tK2 = new TK2(context, (BP1)object);
        return tK2;
    }
}

