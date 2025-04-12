/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 */
import android.content.res.AssetManager;
import java.io.InputStream;

/*
 * Renamed from Sd3
 */
public final class sd3_1
extends eq_0 {
    public final Class a() {
        return InputStream.class;
    }

    public final void c(Object object) {
        ((InputStream)object).close();
    }

    public final Object f(AssetManager assetManager, String string2) {
        return assetManager.open(string2);
    }
}

