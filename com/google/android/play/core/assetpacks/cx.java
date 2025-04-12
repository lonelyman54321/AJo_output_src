/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.os.Bundle;
import androidx.work.b;
import androidx.work.c$a;
import androidx.work.c$a$a;
import androidx.work.c$a$c;
import com.google.android.play.core.assetpacks.cb;
import com.google.android.play.core.assetpacks.cz;
import com.google.android.play.core.assetpacks.da;
import com.google.android.play.core.assetpacks.dt;
import com.google.android.play.core.assetpacks.ep;
import com.google.android.play.core.assetpacks.internal.o;

final class cx {
    private static final o a;
    private final dt b;
    private final da c;
    private final ep d;

    static {
        o o3;
        a = o3 = new o("ExtractionWorker");
    }

    public cx(dt dt2, da da3, ep ep2) {
        this.b = dt2;
        this.c = da3;
        this.d = ep2;
    }

    public final AV0 a(b b2) {
        Object object = this.d;
        b2 = cb.a(b2);
        ((ep)object).b((Bundle)b2);
        b2 = this.d.a((Bundle)b2);
        object = new AV0(-1883842196, (Notification)b2, 0);
        return object;
    }

    public final c$a b(b object) {
        block3: {
            Object object2;
            object = cb.b((b)object);
            try {
                object2 = this.b;
            }
            catch (cz cz2) {
                object2 = a;
                Object object3 = cz2.getMessage();
                Object[] objectArray = new Object[]{object3};
                ((o)object2).b("Error while updating ExtractorSessionStoreView: %s", objectArray);
                object3 = new c$a$a();
                return object3;
            }
            boolean bl2 = ((dt)object2).p((Bundle)object);
            if (!bl2) break block3;
            object = this.c;
            ((da)object).a();
        }
        object = new c$a$c();
        return object;
    }
}

