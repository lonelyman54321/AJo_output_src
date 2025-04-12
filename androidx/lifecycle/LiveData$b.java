/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveData$c;
import androidx.lifecycle.i$a;
import androidx.lifecycle.i$b;
import androidx.lifecycle.n;

public final class LiveData$b
extends LiveData$c
implements n {
    public final mu1_1 e;
    public final /* synthetic */ LiveData f;

    public LiveData$b(LiveData liveData, mu1_1 mu1_12, F62 f62) {
        this.f = liveData;
        super(liveData, f62);
        this.e = mu1_12;
    }

    public final void c() {
        this.e.getLifecycle().c(this);
    }

    public final boolean d(mu1_1 mu1_12) {
        boolean bl2;
        mu1_1 mu1_13 = this.e;
        if (mu1_13 == mu1_12) {
            bl2 = true;
        } else {
            bl2 = false;
            mu1_12 = null;
        }
        return bl2;
    }

    public final boolean e() {
        i$b i$b = this.e.getLifecycle().b();
        i$b i$b2 = i$b.STARTED;
        return i$b.isAtLeast(i$b2);
    }

    public final void k(mu1_1 object, i$a object2) {
        Object object3;
        object = this.e;
        object2 = object.getLifecycle().b();
        if (object2 == (object3 = i$b.DESTROYED)) {
            object = this.f;
            object2 = this.a;
            ((LiveData)object).j((F62)object2);
            return;
        }
        boolean bl2 = false;
        object3 = null;
        while (object3 != object2) {
            bl2 = this.e();
            this.b(bl2);
            i$b i$b = object.getLifecycle().b();
            object3 = object2;
            object2 = i$b;
        }
    }
}

