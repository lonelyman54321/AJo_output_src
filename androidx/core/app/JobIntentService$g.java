/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Intent
 */
package androidx.core.app;

import android.content.ComponentName;
import android.content.Intent;

public abstract class JobIntentService$g {
    public final ComponentName a;
    public boolean b;
    public int c;

    public JobIntentService$g(ComponentName componentName) {
        this.a = componentName;
    }

    public abstract void a(Intent var1);

    public final void b(int n3) {
        block4: {
            block3: {
                int n4;
                block2: {
                    n4 = this.b;
                    if (n4 != 0) break block2;
                    n4 = 1;
                    this.b = n4;
                    this.c = n3;
                    break block3;
                }
                n4 = this.c;
                if (n4 != n3) break block4;
            }
            return;
        }
        CharSequence charSequence = wk0_0.a(n3, "Given job ID ", " is different than previous ");
        int n7 = this.c;
        charSequence.append(n7);
        charSequence = charSequence.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
        throw illegalArgumentException;
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }
}

