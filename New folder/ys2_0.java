/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yS2
 */
public final class ys2_0 {
    public final zs2_1 a;
    public final xs2_1 b;
    public boolean c;

    public ys2_0(zs2_1 object) {
        this.a = object;
        this.b = object = new xs2_1();
    }

    public final void a() {
        i$b i$b;
        Object object = this.a;
        Object object2 = object.getLifecycle();
        Object object3 = ((i)object2).b();
        if (object3 == (i$b = i$b.INITIALIZED)) {
            object3 = new ZF2((zs2_1)object);
            ((i)object2).a((lu1)object3);
            object = this.b;
            object.getClass();
            object3 = "lifecycle";
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            boolean bl2 = ((xs2_1)object).b;
            boolean bl3 = true;
            if (bl2 ^= bl3) {
                object3 = new ws2_1((xs2_1)object);
                ((i)object2).a((lu1)object3);
                ((xs2_1)object).b = bl3;
                this.c = bl3;
                return;
            }
            object2 = "SavedStateRegistry was already attached.".toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        object2 = "Restarter must be created only during owner's initialization stage".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public final void b(Bundle object) {
        boolean bl2 = this.c;
        if (!bl2) {
            this.a();
        }
        Object object2 = this.a.getLifecycle();
        Object object3 = ((i)object2).b();
        i$b i$b = i$b.STARTED;
        boolean bl3 = object3.isAtLeast(i$b);
        boolean bl4 = true;
        if (bl3 ^= bl4) {
            object2 = this.b;
            bl3 = ((xs2_1)object2).b;
            if (bl3) {
                bl3 = ((xs2_1)object2).d ^ bl4;
                if (bl3) {
                    if (object != null) {
                        object3 = "androidx.lifecycle.BundlableSavedStateRegistry.key";
                        object = object.getBundle((String)object3);
                    } else {
                        object = null;
                    }
                    ((xs2_1)object2).c = object;
                    ((xs2_1)object2).d = bl4;
                    return;
                }
                object2 = "SavedStateRegistry was already restored.".toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
            object2 = "You must call performAttach() before calling performRestore(Bundle).".toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        object = new StringBuilder("performRestore cannot be called when owner is ");
        object2 = ((i)object2).b();
        ((StringBuilder)object).append(object2);
        object = ((StringBuilder)object).toString();
        object = object.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public final void c(Bundle bundle) {
        boolean bl2;
        String string2 = "outBundle";
        Intrinsics.checkNotNullParameter(bundle, string2);
        Object object = this.b;
        object.getClass();
        Intrinsics.checkNotNullParameter(bundle, string2);
        string2 = new Bundle();
        Object object2 = ((xs2_1)object).c;
        if (object2 != null) {
            string2.putAll((Bundle)object2);
        }
        object = ((xs2_1)object).a;
        object.getClass();
        object2 = new CR2$d((CR2)object);
        object = ((CR2)object).c;
        Object object3 = Boolean.FALSE;
        ((WeakHashMap)object).put(object2, object3);
        object = "this.components.iteratorWithAdditions()";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object);
        while (bl2 = ((CR2$d)object2).hasNext()) {
            object = (Map.Entry)((CR2$d)object2).next();
            object3 = (String)object.getKey();
            object = ((xS2$b)object.getValue()).a();
            string2.putBundle((String)object3, (Bundle)object);
        }
        bl2 = string2.isEmpty();
        if (!bl2) {
            object = "androidx.lifecycle.BundlableSavedStateRegistry.key";
            bundle.putBundle((String)object, (Bundle)string2);
        }
    }
}

