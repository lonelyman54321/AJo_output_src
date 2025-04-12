/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 *  android.graphics.drawable.Drawable$Callback
 *  android.view.View
 */
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;

public final class OU0 {
    public final JR1 a;
    public final HashMap b;
    public final HashMap c;
    public final AssetManager d;
    public String e;

    public OU0(Drawable.Callback callback2) {
        Object object;
        this.a = object;
        object = new HashMap();
        this.b = object;
        object = new HashMap();
        this.c = object;
        this.e = object = ".ttf";
        boolean bl2 = callback2 instanceof View;
        if (!bl2) {
            rx1.b("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
            return;
        }
        callback2 = ((View)callback2).getContext().getAssets();
        this.d = callback2;
    }
}

