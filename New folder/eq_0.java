/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 *  android.util.Log
 */
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

/*
 * Renamed from eq
 */
public abstract class eq_0
implements ei0_0 {
    public final String a;
    public final AssetManager b;
    public Object c;

    public eq_0(AssetManager assetManager, String string2) {
        this.b = assetManager;
        this.a = string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void b() {
        Object object = this.c;
        if (object == null) {
            return;
        }
        try {
            this.c(object);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public abstract void c(Object var1);

    public final void cancel() {
    }

    public final void d(Az2 object, ei0$a ei0$a) {
        object = this.b;
        String string2 = this.a;
        object = this.f((AssetManager)object, string2);
        this.c = object;
        try {
            ei0$a.f(object);
        }
        catch (IOException iOException) {
            string2 = "AssetPathFetcher";
            int n3 = 3;
            Log.isLoggable((String)string2, (int)n3);
            ei0$a.c(iOException);
        }
    }

    public final pi0_0 e() {
        return pi0_0.LOCAL;
    }

    public abstract Object f(AssetManager var1, String var2);
}

