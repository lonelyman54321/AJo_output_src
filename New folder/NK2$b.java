/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.net.Uri
 */
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

public final class NK2$b
implements CP1 {
    public final Resources a;

    public NK2$b(Resources resources) {
        this.a = resources;
    }

    public final BP1 c(OQ1 object) {
        object = ((OQ1)object).c(Uri.class, InputStream.class);
        Resources resources = this.a;
        NK2 nK2 = new NK2(resources, (BP1)object);
        return nK2;
    }
}

