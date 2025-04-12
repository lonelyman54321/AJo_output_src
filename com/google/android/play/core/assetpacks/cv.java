/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.work.b;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.ExtractionWorker;
import com.google.android.play.core.assetpacks.bh;
import com.google.android.play.core.assetpacks.cb;
import com.google.android.play.core.assetpacks.ci;
import com.google.android.play.core.assetpacks.cu;
import com.google.android.play.core.assetpacks.dd;
import com.google.android.play.core.assetpacks.dt;
import com.google.android.play.core.assetpacks.er;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.z;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

final class cv {
    private static final o a;
    private final dt b;
    private final dd c;
    private final er d;
    private final ci e;
    private final bh f;
    private final aq g;
    private final aq h;
    private final aq i;

    static {
        o o3;
        a = o3 = new o("ExtractionWorkScheduler");
    }

    public cv(dt dt2, dd dd2, er er2, ci ci2, aq aq2, aq aq4, bh bh2, aq aq5) {
        this.g = aq2;
        this.b = dt2;
        this.c = dd2;
        this.d = er2;
        this.e = ci2;
        this.h = aq4;
        this.f = bh2;
        this.i = aq5;
    }

    public static /* synthetic */ void a(cv object, Bundle object2, AssetPackState assetPackState) {
        dt dt2 = ((cv)object).b;
        boolean bl2 = dt2.o((Bundle)object2);
        if (bl2) {
            object2 = ((cv)object).f;
            ((bh)object2).e(assetPackState);
            object = (z)((cv)object).h.a();
            object.f();
        }
    }

    public final void b(Bundle object, Bundle object2, Bundle object3) {
        int n3;
        int n4 = 1;
        Object object4 = object.getStringArrayList("pack_names");
        Object object5 = null;
        if (object4 != null && (n3 = object4.size()) == n4) {
            Object object6 = "enableExpeditedWork";
            boolean bl2 = object2.getBoolean((String)object6);
            if (bl2 && object3 == null) {
                object = a;
                object2 = new Object[]{};
                ((o)object).b("Notification options must be present when expedited work is enabled.", (Object[])object2);
                return;
            }
            object4 = (String)object4.get(0);
            object6 = this.c;
            Object[] objectArray = this.d;
            object4 = AssetPackState.b((Bundle)object, (String)object4, (dd)object6, (er)objectArray);
            object6 = a;
            objectArray = new Object[n4];
            objectArray[0] = object4;
            ((o)object6).a("ExtractionWorkScheduler.scheduleExtraction: %s", objectArray);
            object5 = (PendingIntent)object.getParcelable("confirmation_intent");
            if (object5 != null) {
                object6 = this.e;
                ((ci)object6).b((PendingIntent)object5);
            }
            object5 = (Executor)this.i.a();
            object6 = new cu(this, (Bundle)object, (AssetPackState)object4);
            object5.execute((Runnable)object6);
            object4 = "extractAssetPacks";
            object5 = "workerClass";
            object6 = ExtractionWorker.class;
            if (bl2) {
                Intrinsics.checkNotNullParameter(object6, (String)object5);
                object2 = new CI3$a((Class)object6);
                object5 = sg2.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
                Intrinsics.checkNotNullParameter(object5, "policy");
                object6 = ((CI3$a)object2).b;
                ((EI3)object6).q = n4;
                ((EI3)object6).r = object5;
                object = cb.c((Bundle)object, object3);
                object = (y92$a)((CI3$a)object2).e((b)object);
                object2 = (li3_1)this.g.a();
                object3 = DE0.APPEND;
                object = (y92)((CI3$a)object).a();
                ((li3_1)object2).d((String)object4, (DE0)((Object)object3), (y92)object);
                return;
            }
            Intrinsics.checkNotNullParameter(object6, (String)object5);
            object2 = new CI3$a((Class)object6);
            object3 = new Bundle();
            object = cb.c((Bundle)object, object3);
            object = (y92$a)((CI3$a)object2).e((b)object);
            object2 = (li3_1)this.g.a();
            object3 = DE0.APPEND;
            object = (y92)((CI3$a)object).a();
            ((li3_1)object2).d((String)object4, (DE0)((Object)object3), (y92)object);
            return;
        }
        object = a;
        object2 = new Object[]{};
        ((o)object).b("Corrupt packStateBundle.", (Object[])object2);
    }
}

