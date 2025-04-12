/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import androidx.navigation.a$a;
import androidx.navigation.a$b;
import androidx.navigation.i;
import androidx.navigation.p;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public class a
extends p {
    public final Activity c;

    public a(Context object) {
        a$b a$b;
        block1: {
            boolean bl2;
            Intrinsics.checkNotNullParameter(object, "context");
            a$b = a$b.c;
            object = ez2_1.d(a$b, object).iterator();
            while (bl2 = object.hasNext()) {
                a$b a$b2 = a$b = object.next();
                a$b2 = (Context)a$b;
                boolean bl3 = a$b2 instanceof Activity;
                if (!bl3) continue;
                break block1;
            }
            bl2 = false;
            a$b = null;
        }
        a$b = (Activity)a$b;
        this.c = a$b;
    }

    public final i a() {
        Intrinsics.checkNotNullParameter(this, "activityNavigator");
        a$a a$a = new i(this);
        return a$a;
    }

    public final i c(i object) {
        object = (a$a)object;
        Intrinsics.checkNotNullParameter(object, "destination");
        Serializable serializable = new StringBuilder("Destination ");
        object = g30.a(((i)object).g, " does not have an Intent set.", serializable);
        object = object.toString();
        serializable = new IllegalStateException((String)object);
        throw serializable;
    }

    public final boolean f() {
        Activity activity = this.c;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }
}

