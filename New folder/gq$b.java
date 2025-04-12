/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 */
import android.content.res.AssetManager;

public final class gq$b
implements CP1,
gq$a {
    public final AssetManager a;

    public gq$b(AssetManager assetManager) {
        this.a = assetManager;
    }

    public final ei0_0 a(AssetManager assetManager, String string2) {
        ll0_1 ll0_12 = new eq_0(assetManager, string2);
        return ll0_12;
    }

    public final BP1 c(OQ1 object) {
        AssetManager assetManager = this.a;
        object = new gq_0(assetManager, this);
        return object;
    }
}

