/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.E$b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from R3
 */
public final class r3_0
implements az0_2 {
    public final ComponentActivity a;
    public final ComponentActivity b;
    public volatile p3_0 c;
    public final Object d;

    public r3_0(ComponentActivity componentActivity) {
        Object object;
        this.d = object = new Object();
        this.a = componentActivity;
        this.b = componentActivity;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object generatedComponent() {
        Object object = this.c;
        if (object != null) return this.c;
        object = this.d;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                Object object3;
                try {
                    object3 = this.c;
                    if (object3 != null) return this.c;
                    object3 = this.a;
                    object2 = this.b;
                    Object object4 = new q3_0((Context)object2);
                    object2 = "owner";
                    Intrinsics.checkNotNullParameter(object3, (String)object2);
                    Object object5 = "factory";
                    Intrinsics.checkNotNullParameter(object4, (String)object5);
                    object5 = object3.getViewModelStore();
                    Intrinsics.checkNotNullParameter(object3, (String)object2);
                    object3 = object3.getDefaultViewModelCreationExtras();
                    object2 = "store";
                    Intrinsics.checkNotNullParameter(object5, (String)object2);
                    object2 = "factory";
                    Intrinsics.checkNotNullParameter(object4, (String)object2);
                    object2 = "defaultCreationExtras";
                    Intrinsics.checkNotNullParameter(object3, (String)object2);
                    object2 = new pD3((rd3_0)object5, (E$b)object4, (Wd0)object3);
                    object3 = R3$b.class;
                    object4 = "modelClass";
                    Intrinsics.checkNotNullParameter(object3, (String)object4);
                    object4 = "<this>";
                    Intrinsics.checkNotNullParameter(object3, (String)object4);
                    object3 = Reflection.getOrCreateKotlinClass(object3);
                    object4 = "modelClass";
                    Intrinsics.checkNotNullParameter(object3, (String)object4);
                    Intrinsics.checkNotNullParameter(object3, (String)object4);
                    object4 = "<this>";
                    Intrinsics.checkNotNullParameter(object3, (String)object4);
                    object4 = object3.getQualifiedName();
                    if (object4 != null) {
                        object5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                        object4 = ((String)object5).concat((String)object4);
                        object3 = ((pD3)object2).a((yn1_2)object3, (String)object4);
                        object3 = (R3$b)object3;
                        this.c = object3 = ((R3$b)object3).a;
                        return this.c;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object2 = "Local and anonymous classes can not be ViewModels";
                object2 = object2.toString();
                object3 = new IllegalArgumentException((String)object2);
                throw object3;
            }
            throw throwable2;
        }
    }
}

