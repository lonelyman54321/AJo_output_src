/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetFileDescriptor
 *  android.content.res.Resources
 *  android.net.Uri
 */
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

public final class NK2$a
implements CP1 {
    public final Resources a;

    public NK2$a(Resources resources) {
        this.a = resources;
    }

    public final BP1 c(OQ1 object) {
        object = ((OQ1)object).c(Uri.class, AssetFileDescriptor.class);
        Resources resources = this.a;
        NK2 nK2 = new NK2(resources, (BP1)object);
        return nK2;
    }
}

