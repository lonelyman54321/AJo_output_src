/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.E$b;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from g3
 */
public final class g3_0
implements az0_2 {
    public volatile Rh0 a;
    public final Object b;
    public final Activity c;
    public final r3_0 d;

    public g3_0(Activity activity) {
        Object object;
        this.b = object = new Object();
        this.c = activity;
        activity = (ComponentActivity)activity;
        this.d = object = new r3_0((ComponentActivity)activity);
    }

    public final Rh0 a() {
        Object object = this.c;
        Object object2 = object.getApplication();
        boolean bl2 = object2 instanceof az0_2;
        if (!bl2) {
            StringBuilder stringBuilder = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
            Class<Application> clazz = Application.class;
            Serializable serializable = object.getApplication().getClass();
            boolean bl3 = clazz.equals(serializable);
            if (bl3) {
                object = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
            } else {
                clazz = "Found: ";
                serializable = new StringBuilder((String)((Object)clazz));
                object = object.getApplication().getClass();
                ((StringBuilder)serializable).append(object);
                object = ((StringBuilder)serializable).toString();
            }
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        object = this.d;
        object = ((g3$a)da0_2.a(g3$a.class, object)).a();
        object.getClass();
        Th0 th0 = ((Qh0)object).b;
        object = ((Qh0)object).a;
        object2 = new Rh0((Wh0)object, th0);
        return object2;
    }

    public final ts2_2 b() {
        Object object = this.d;
        Object object2 = ((r3_0)object).a;
        object = ((r3_0)object).b;
        Object object3 = new q3_0((Context)object);
        object = "owner";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        String string2 = "factory";
        Intrinsics.checkNotNullParameter(object3, string2);
        rd3_0 rd3_02 = object2.getViewModelStore();
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = object2.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(object3, string2);
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        object2 = new pD3(rd3_02, (E$b)object3, (Wd0)object);
        object = R3$b.class;
        object3 = "modelClass";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        string2 = "<this>";
        object = sw0_0.a(object, string2, object, (String)object3, (String)object3);
        Intrinsics.checkNotNullParameter(object, string2);
        object3 = object.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            return ((R3$b)((pD3)object2).a((yn1_2)object, (String)object3)).b;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object generatedComponent() {
        Object object = this.a;
        if (object != null) return this.a;
        object = this.b;
        synchronized (object) {
            try {
                Rh0 rh0 = this.a;
                if (rh0 != null) return this.a;
                this.a = rh0 = this.a();
                return this.a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

