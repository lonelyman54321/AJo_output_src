/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks2
 *  android.content.res.Configuration
 */
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public final class Jg
implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration a;
    public final /* synthetic */ Le1 b;

    public Jg(Configuration configuration, Le1 le1) {
        this.a = configuration;
        this.b = le1;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int n3;
        Configuration configuration2 = this.a;
        int n4 = configuration2.updateFrom(configuration);
        Iterator iterator = this.b.a.entrySet().iterator();
        while ((n3 = iterator.hasNext()) != 0) {
            Le1$a le1$a = (Le1$a)((WeakReference)iterator.next().getValue()).get();
            if (le1$a != null) {
                n3 = le1$a.b;
                if ((n3 = (int)(Configuration.needNewResources((int)n4, (int)n3) ? 1 : 0)) == 0) continue;
            }
            iterator.remove();
        }
        configuration2.setTo(configuration);
    }

    public final void onLowMemory() {
        this.b.a.clear();
    }

    public final void onTrimMemory(int n3) {
        this.b.a.clear();
    }
}

