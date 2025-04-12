/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import androidx.lifecycle.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public abstract class K3 {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final ArrayList d;
    public final transient LinkedHashMap e;
    public final LinkedHashMap f;
    public final Bundle g;

    public K3() {
        Bundle bundle = new LinkedHashMap();
        this.a = bundle;
        bundle = new LinkedHashMap();
        this.b = bundle;
        bundle = new LinkedHashMap();
        this.c = bundle;
        this.d = bundle;
        this.e = bundle = new LinkedHashMap();
        this.f = bundle = new LinkedHashMap();
        this.g = bundle = new Bundle();
    }

    public final boolean a(int n3, int n4, Intent intent) {
        boolean bl2;
        Object object = this.a;
        Object object2 = n3;
        if ((object2 = (String)((LinkedHashMap)object).get(object2)) == null) {
            return false;
        }
        object = (K3$a)this.e.get(object2);
        Object object3 = object != null ? ((K3$a)object).a : null;
        if (object3 != null && (bl2 = ((ArrayList)(object3 = this.d)).contains(object2))) {
            w3 w34 = ((K3$a)object).a;
            object = ((K3$a)object).b;
            Object object4 = ((x3)object).c(n4, intent);
            w34.a(object4);
            ((ArrayList)object3).remove(object2);
        } else {
            this.f.remove(object2);
            object = new ActivityResult(n4, intent);
            Bundle bundle = this.g;
            bundle.putParcelable((String)object2, (Parcelable)object);
        }
        return true;
    }

    public abstract void b(int var1, x3 var2, Object var3);

    public final M3 c(String charSequence, mu1_1 object, x3 x32, w3 w34) {
        Intrinsics.checkNotNullParameter(charSequence, "key");
        Intrinsics.checkNotNullParameter(object, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(x32, "contract");
        Intrinsics.checkNotNullParameter(w34, "callback");
        Object object2 = object.getLifecycle();
        Object object3 = ((i)object2).b();
        i$b i$b = i$b.STARTED;
        boolean bl2 = object3.isAtLeast(i$b) ^ true;
        if (bl2) {
            this.e((String)charSequence);
            object = this.c;
            object3 = (K3$b)((LinkedHashMap)object).get(charSequence);
            if (object3 == null) {
                object3 = new K3$b((i)object2);
            }
            object2 = new J3(this, (String)charSequence, w34, x32);
            Intrinsics.checkNotNullParameter(object2, "observer");
            ((K3$b)object3).a.a((lu1)object2);
            ((K3$b)object3).b.add(object2);
            object.put(charSequence, object3);
            object = new M3(this, (String)charSequence, x32);
            return object;
        }
        charSequence = new StringBuilder("LifecycleOwner ");
        ((StringBuilder)charSequence).append(object);
        ((StringBuilder)charSequence).append(" is attempting to register while current state is ");
        object = ((i)object2).b();
        ((StringBuilder)charSequence).append(object);
        ((StringBuilder)charSequence).append(". LifecycleOwners must call register before they are STARTED.");
        charSequence = ((StringBuilder)charSequence).toString();
        charSequence = charSequence.toString();
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public final N3 d(String string2, x3 x32, w3 object) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(x32, "contract");
        Intrinsics.checkNotNullParameter(object, "callback");
        this.e(string2);
        Object object2 = this.e;
        Object object3 = new K3$a(x32, (w3)object);
        object2.put(string2, object3);
        object2 = this.f;
        boolean bl2 = object2.containsKey(string2);
        if (bl2) {
            object3 = ((LinkedHashMap)object2).get(string2);
            object2.remove(string2);
            object.a(object3);
        }
        if ((object3 = (ActivityResult)BE.a((Bundle)(object2 = this.g), string2)) != null) {
            object2.remove(string2);
            int n3 = ((ActivityResult)object3).a;
            object3 = ((ActivityResult)object3).b;
            object2 = x32.c(n3, (Intent)object3);
            object.a(object2);
        }
        object = new N3(this, string2, x32);
        return object;
    }

    public final void e(String object) {
        boolean bl2;
        LinkedHashMap linkedHashMap = this.b;
        Object object2 = (Integer)linkedHashMap.get(object);
        if (object2 != null) {
            return;
        }
        Serializable serializable = L3.c;
        Intrinsics.checkNotNullParameter(serializable, "nextFunction");
        Serializable serializable2 = new cz2_2((Function0)((Object)serializable));
        object2 = new fz0_2((Function0)((Object)serializable), (Function1)((Object)serializable2));
        object2 = ez2_1.c((Sequence)object2).iterator();
        while (bl2 = object2.hasNext()) {
            serializable = (Number)object2.next();
            int n3 = ((Number)serializable).intValue();
            LinkedHashMap linkedHashMap2 = this.a;
            serializable2 = Integer.valueOf(n3);
            if ((n3 = linkedHashMap2.containsKey(serializable2) ^ 1) == 0) continue;
            int n4 = ((Number)serializable).intValue();
            serializable = Integer.valueOf(n4);
            linkedHashMap2.put(serializable, object);
            object2 = n4;
            linkedHashMap.put(object, object2);
            return;
        }
        object = new NoSuchElementException("Sequence contains no element matching the predicate.");
        throw object;
    }

    public final void f(String string2) {
        Object object;
        Intrinsics.checkNotNullParameter(string2, "key");
        Serializable serializable = this.d;
        boolean bl2 = ((ArrayList)serializable).contains(string2);
        if (!bl2 && (serializable = (Integer)this.b.remove(string2)) != null) {
            object = this.a;
            object.remove(serializable);
        }
        this.e.remove(string2);
        serializable = this.f;
        boolean bl3 = serializable.containsKey(string2);
        if (bl3) {
            object = ((LinkedHashMap)serializable).get(string2);
            Objects.toString(object);
            serializable.remove(string2);
        }
        if (bl3 = (serializable = this.g).containsKey(string2)) {
            object = (ActivityResult)BE.a((Bundle)serializable, string2);
            Objects.toString(object);
            serializable.remove(string2);
        }
        if ((object = (K3$b)((LinkedHashMap)(serializable = this.c)).get(string2)) != null) {
            boolean bl4;
            ArrayList arrayList = ((K3$b)object).b;
            Iterator iterator = arrayList.iterator();
            while (bl4 = iterator.hasNext()) {
                n n3 = (n)iterator.next();
                i i3 = ((K3$b)object).a;
                i3.c(n3);
            }
            arrayList.clear();
            serializable.remove(string2);
        }
    }
}

