/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 */
package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.fragment.app.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class j {
    public final ArrayList a;
    public final HashMap b;
    public final HashMap c;
    public g d;

    public j() {
        Cloneable cloneable;
        this.a = cloneable = new Cloneable();
        this.b = cloneable;
        super();
        this.c = cloneable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Fragment object) {
        Serializable serializable = this.a;
        boolean bl2 = serializable.contains(object);
        if (!bl2) {
            serializable = this.a;
            synchronized (serializable) {
                ArrayList arrayList = this.a;
                arrayList.add(object);
            }
            ((Fragment)object).mAdded = true;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Fragment already added: ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        serializable = new IllegalStateException((String)object);
        throw serializable;
    }

    public final Fragment b(String object) {
        HashMap hashMap = this.b;
        if ((object = (h)hashMap.get(object)) != null) {
            return ((h)object).c;
        }
        return null;
    }

    public final Fragment c(String string2) {
        boolean bl2;
        Iterator iterator = this.b.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (h)iterator.next();
            if (object == null || (object = ((h)object).c.findFragmentByWho(string2)) == null) continue;
            return object;
        }
        return null;
    }

    public final ArrayList d() {
        boolean bl2;
        ArrayList<h> arrayList = new ArrayList<h>();
        Iterator iterator = this.b.values().iterator();
        while (bl2 = iterator.hasNext()) {
            h h3 = (h)iterator.next();
            if (h3 == null) continue;
            arrayList.add(h3);
        }
        return arrayList;
    }

    public final ArrayList e() {
        boolean bl2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Iterator iterator = this.b.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (h)iterator.next();
            if (object != null) {
                object = ((h)object).c;
                arrayList.add(object);
                continue;
            }
            bl2 = false;
            object = null;
            arrayList.add(null);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List f() {
        ArrayList arrayList = this.a;
        boolean bl2 = arrayList.isEmpty();
        if (bl2) {
            return Collections.emptyList();
        }
        arrayList = this.a;
        synchronized (arrayList) {
            ArrayList arrayList2 = this.a;
            return new ArrayList(arrayList2);
        }
    }

    public final void g(h object) {
        int n3;
        Fragment fragment = ((h)object).c;
        String string2 = fragment.mWho;
        HashMap hashMap = this.b;
        if ((string2 = hashMap.get(string2)) != null) {
            return;
        }
        string2 = fragment.mWho;
        hashMap.put(string2, object);
        boolean bl2 = fragment.mRetainInstanceChangedWhileDetached;
        if (bl2) {
            bl2 = fragment.mRetainInstance;
            if (bl2) {
                object = this.d;
                ((g)object).b(fragment);
            } else {
                object = this.d;
                ((g)object).e(fragment);
            }
            bl2 = false;
            object = null;
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (bl2 = Log.isLoggable((String)(object = "FragmentManager"), (int)(n3 = 2))) {
            fragment.toString();
        }
    }

    public final void h(h object) {
        Object object2;
        Fragment fragment = ((h)object).c;
        int n3 = fragment.mRetainInstance;
        if (n3 != 0) {
            object2 = this.d;
            ((g)object2).e(fragment);
        }
        object2 = this.b;
        String string2 = fragment.mWho;
        if ((string2 = ((HashMap)object2).get(string2)) != object) {
            return;
        }
        object = fragment.mWho;
        string2 = null;
        if ((object = (h)((HashMap)object2).put(object, null)) == null) {
            return;
        }
        object = "FragmentManager";
        n3 = 2;
        boolean bl2 = Log.isLoggable((String)object, (int)n3);
        if (bl2) {
            fragment.toString();
        }
    }

    public final Bundle i(Bundle bundle, String string2) {
        HashMap hashMap = this.c;
        if (bundle != null) {
            return hashMap.put(string2, bundle);
        }
        return (Bundle)hashMap.remove(string2);
    }
}

