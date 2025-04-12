/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.os.Bundle
 */
package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.A;
import androidx.lifecycle.E$a;
import androidx.lifecycle.E$b;
import androidx.lifecycle.E$c;
import androidx.lifecycle.E$d;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.z;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from androidx.lifecycle.B
 */
public final class b_0
extends E$d
implements E$b {
    public final Application a;
    public final E$a b;
    public final Bundle c;
    public final i d;
    public final xs2_1 e;

    public b_0() {
        E$a e$a;
        this.b = e$a = new E$a(null);
    }

    public b_0(Application object, zs2_1 object2, Bundle object3) {
        xs2_1 xs2_12;
        Intrinsics.checkNotNullParameter(object2, "owner");
        this.e = xs2_12 = object2.getSavedStateRegistry();
        this.d = object2 = object2.getLifecycle();
        this.c = object3;
        this.a = object;
        if (object != null) {
            object2 = E$a.b;
            object2 = "application";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object3 = E$a.b;
            if (object3 == null) {
                Intrinsics.checkNotNullParameter(object, (String)object2);
                super((Application)object);
                E$a.b = object3;
            }
            object = E$a.b;
            Intrinsics.checkNotNull(object);
        } else {
            object2 = null;
            super(null);
        }
        this.b = object;
    }

    public final void a(jD3 jD32) {
        Intrinsics.checkNotNullParameter(jD32, "viewModel");
        i i3 = this.d;
        if (i3 != null) {
            xs2_1 xs2_12 = this.e;
            Intrinsics.checkNotNull(xs2_12);
            Intrinsics.checkNotNull(i3);
            g.a(jD32, xs2_12, i3);
        }
    }

    public final jD3 b(Class object, String object2) {
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object2, "key");
        Intrinsics.checkNotNullParameter(object, "modelClass");
        Object object3 = this.d;
        if (object3 != null) {
            Object[] objectArray = Hj.class;
            int n4 = objectArray.isAssignableFrom((Class<?>)object);
            Application application = this.a;
            Constructor constructor = n4 != 0 && application != null ? AS2.a(AS2.a, (Class)object) : AS2.a(AS2.b, (Class)object);
            if (constructor == null) {
                if (application != null) {
                    object2 = this.b;
                    object = ((E$a)object2).create((Class)object);
                } else {
                    E$c.Companion.getClass();
                    object2 = E$c.access$get_instance$cp();
                    if (object2 == null) {
                        object2 = new E$c();
                        E$c.access$set_instance$cp((E$c)object2);
                    }
                    object2 = E$c.access$get_instance$cp();
                    Intrinsics.checkNotNull(object2);
                    object = ((E$c)object2).create((Class)object);
                }
                return object;
            }
            xs2_1 xs2_12 = this.e;
            Intrinsics.checkNotNull(xs2_12);
            Bundle bundle = this.c;
            object2 = g.b(xs2_12, (i)object3, (String)object2, bundle);
            object3 = ((z)object2).b;
            if (n4 != 0 && application != null) {
                Intrinsics.checkNotNull(application);
                n4 = 2;
                objectArray = new Object[n4];
                objectArray[0] = application;
                objectArray[n3] = object3;
                object = AS2.b((Class)object, constructor, objectArray);
            } else {
                Object[] objectArray2 = new Object[n3];
                objectArray2[0] = object3;
                object = AS2.b((Class)object, constructor, objectArray2);
            }
            ((jD3)object).addCloseable("androidx.lifecycle.savedstate.vm.tag", (AutoCloseable)object2);
            return object;
        }
        object = new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        throw object;
    }

    public final jD3 create(Class serializable) {
        Intrinsics.checkNotNullParameter(serializable, "modelClass");
        String string2 = serializable.getCanonicalName();
        if (string2 != null) {
            return this.b((Class)serializable, string2);
        }
        serializable = new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        throw serializable;
    }

    public final jD3 create(Class object, Wd0 object2) {
        block6: {
            block9: {
                block8: {
                    Object object3;
                    block7: {
                        int n3 = 1;
                        Intrinsics.checkNotNullParameter(object, "modelClass");
                        Intrinsics.checkNotNullParameter(object2, "extras");
                        object3 = E$c.VIEW_MODEL_KEY;
                        object3 = (String)((Wd0)object2).a((Wd0$b)object3);
                        if (object3 == null) break block6;
                        Object[] objectArray = A.a;
                        if ((objectArray = ((Wd0)object2).a((Wd0$b)objectArray)) == null) break block7;
                        objectArray = A.b;
                        if ((objectArray = ((Wd0)object2).a((Wd0$b)objectArray)) == null) break block7;
                        object3 = E$a.c;
                        object3 = (Application)((Wd0)object2).a((Wd0$b)object3);
                        objectArray = Hj.class;
                        int n4 = objectArray.isAssignableFrom((Class<?>)object);
                        Constructor constructor = n4 != 0 && object3 != null ? AS2.a(AS2.a, (Class)object) : AS2.a(AS2.b, (Class)object);
                        if (constructor == null) {
                            return this.b.create((Class)object, (Wd0)object2);
                        }
                        if (n4 != 0 && object3 != null) {
                            object2 = A.a((or1_2)object2);
                            n4 = 2;
                            objectArray = new Object[n4];
                            objectArray[0] = object3;
                            objectArray[n3] = object2;
                            object = AS2.b((Class)object, constructor, objectArray);
                        } else {
                            object2 = A.a((or1_2)object2);
                            Object[] objectArray2 = new Object[n3];
                            objectArray2[0] = object2;
                            object = AS2.b((Class)object, constructor, objectArray2);
                        }
                        break block8;
                    }
                    if ((object2 = this.d) == null) break block9;
                    object = this.b((Class)object, (String)object3);
                }
                return object;
            }
            object = new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            throw object;
        }
        object = new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        throw object;
    }

    public final /* synthetic */ jD3 create(yn1_2 yn1_22, Wd0 wd0) {
        wd0 = (or1_2)wd0;
        return oD3.a(this, yn1_22, (or1_2)wd0);
    }
}

