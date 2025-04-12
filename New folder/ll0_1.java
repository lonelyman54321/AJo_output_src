/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetFileDescriptor
 *  android.content.res.AssetManager
 */
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;

/*
 * Renamed from lL0
 */
public final class ll0_1
extends eq_0 {
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    public final void c(Object object) {
        ((AssetFileDescriptor)object).close();
    }

    public final Object f(AssetManager assetManager, String string2) {
        return assetManager.openFd(string2);
    }
}

