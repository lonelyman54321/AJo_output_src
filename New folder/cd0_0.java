/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cd0
 */
public final class cd0_0
implements ao_0 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = Ox1.Companion;
        AJIOApplication.Companion.getClass();
        Object object2 = AJIOApplication$a.a();
        object.getClass();
        Intrinsics.checkNotNullParameter(object2, "context");
        object = Ox1.b;
        if (object == null) {
            Ox1.b = object = new Ox1((AJIOApplication)object2);
        }
        object = Ox1.b;
        Intrinsics.checkNotNull(object);
        object2 = FirebaseApp.getApps(((Ox1)object).a);
        boolean bl2 = object2.isEmpty();
        if (bl2) {
            object2 = ((Ox1)object).a;
            FirebaseApp.initializeApp((Context)object2);
        }
        object2 = FirebaseCrashlytics.getInstance();
        boolean bl3 = true;
        object2.setCrashlyticsCollectionEnabled(bl3);
        object2 = yn3_0.a;
        object = ((Ox1)object).a;
        Object object3 = new sd0_1((Context)object);
        object2.getClass();
        object = "tree";
        Intrinsics.checkNotNullParameter(object3, (String)object);
        if (object3 == object2) {
            object = "Cannot plant Timber into itself.".toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        object = yn3_0.b;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                try {
                    ((ArrayList)object).add(object3);
                    bl2 = false;
                    object2 = null;
                    object2 = new yn3$b[]{};
                    object2 = ((ArrayList)object).toArray((T[])object2);
                    if (object2 == null) break block7;
                    yn3_0.c = object2;
                    object2 = Unit.a;
                }
                catch (Throwable throwable2) {}
                return;
            }
            object3 = "null cannot be cast to non-null type kotlin.Array<T>";
            object2 = new NullPointerException((String)object3);
            throw object2;
            throw throwable2;
        }
    }
}

