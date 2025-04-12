/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g$a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class g
extends jD3 {
    public static final g$a g;
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final boolean d;
    public boolean e;
    public boolean f;

    static {
        g$a g$a;
        g = g$a = new Object();
    }

    public g(boolean bl2) {
        HashMap hashMap;
        this.a = hashMap = new HashMap();
        this.b = hashMap = new HashMap();
        this.c = hashMap = new HashMap();
        this.e = false;
        this.f = false;
        this.d = bl2;
    }

    public final void b(Fragment fragment) {
        boolean bl2 = this.f;
        String string2 = "FragmentManager";
        int n3 = 2;
        if (bl2) {
            Log.isLoggable((String)string2, (int)n3);
            return;
        }
        HashMap hashMap = this.a;
        String string3 = fragment.mWho;
        boolean bl3 = hashMap.containsKey(string3);
        if (bl3) {
            return;
        }
        string3 = fragment.mWho;
        hashMap.put(string3, fragment);
        bl2 = Log.isLoggable((String)string2, (int)n3);
        if (bl2) {
            fragment.toString();
        }
    }

    public final void c(String string2, boolean bl2) {
        Log.isLoggable((String)"FragmentManager", (int)3);
        this.d(string2, bl2);
    }

    public final void d(String string2, boolean bl2) {
        Object object;
        Object object2 = this.b;
        g g3 = (g)((HashMap)object2).get(string2);
        if (g3 != null) {
            if (bl2) {
                boolean bl3;
                object = new ArrayList();
                Object object3 = g3.b.keySet();
                ((ArrayList)object).addAll(object3);
                object = ((ArrayList)object).iterator();
                while (bl3 = object.hasNext()) {
                    object3 = (String)object.next();
                    boolean bl4 = true;
                    g3.c((String)object3, bl4);
                }
            }
            g3.onCleared();
            ((HashMap)object2).remove(string2);
        }
        if ((object2 = (rd3_0)((HashMap)(object = this.c)).get(string2)) != null) {
            ((rd3_0)object2).a();
            ((HashMap)object).remove(string2);
        }
    }

    public final void e(Fragment fragment) {
        boolean bl2 = this.f;
        String string2 = "FragmentManager";
        int n3 = 2;
        if (bl2) {
            Log.isLoggable((String)string2, (int)n3);
            return;
        }
        HashMap hashMap = this.a;
        String string3 = fragment.mWho;
        if ((hashMap = hashMap.remove(string3)) != null && (bl2 = Log.isLoggable((String)string2, (int)n3))) {
            fragment.toString();
        }
    }

    public final boolean equals(Object object) {
        Serializable serializable;
        Object object2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object2 = g.class) == (serializable = object.getClass())) {
            boolean bl3;
            object = (g)object;
            serializable = this.a;
            object2 = ((g)object).a;
            boolean bl4 = serializable.equals(object2);
            if (!(bl4 && (bl4 = (serializable = this.b).equals(object2 = ((g)object).b)) && (bl3 = (serializable = this.c).equals(object = ((g)object).c)))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = ((Object)this.a).hashCode() * 31;
        int n4 = (((Object)this.b).hashCode() + n3) * 31;
        return ((Object)this.c).hashCode() + n4;
    }

    public final void onCleared() {
        String string2 = "FragmentManager";
        int n3 = 3;
        boolean bl2 = Log.isLoggable((String)string2, (int)n3);
        if (bl2) {
            this.toString();
        }
        this.e = true;
    }

    public final String toString() {
        Object object;
        String string2;
        boolean bl2;
        StringBuilder stringBuilder = new StringBuilder("FragmentManagerViewModel{");
        int n3 = System.identityHashCode(this);
        Iterator iterator = Integer.toHexString(n3);
        stringBuilder.append((String)((Object)iterator));
        stringBuilder.append("} Fragments (");
        iterator = this.a.values().iterator();
        while (true) {
            bl2 = iterator.hasNext();
            string2 = ", ";
            if (!bl2) break;
            object = iterator.next();
            stringBuilder.append(object);
            bl2 = iterator.hasNext();
            if (!bl2) continue;
            stringBuilder.append(string2);
        }
        stringBuilder.append(") Child Non Config (");
        iterator = this.b.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            object = (String)iterator.next();
            stringBuilder.append((String)object);
            bl2 = iterator.hasNext();
            if (!bl2) continue;
            stringBuilder.append(string2);
        }
        stringBuilder.append(") ViewModelStores (");
        iterator = this.c.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            object = (String)iterator.next();
            stringBuilder.append((String)object);
            bl2 = iterator.hasNext();
            if (!bl2) continue;
            stringBuilder.append(string2);
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

