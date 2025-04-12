/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.databinding;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MergedDataBinderMapper
extends Zh0 {
    public final HashSet a;
    public final CopyOnWriteArrayList b;
    public final CopyOnWriteArrayList c;

    public MergedDataBinderMapper() {
        Cloneable cloneable;
        this.a = cloneable = new Cloneable();
        this.b = cloneable;
        super();
        this.c = cloneable;
    }

    public final ViewDataBinding b(ai0_0 ai0_02, View view, int n3) {
        boolean bl2;
        Iterator iterator = this.b.iterator();
        while (bl2 = iterator.hasNext()) {
            ViewDataBinding viewDataBinding = ((Zh0)iterator.next()).b(ai0_02, view, n3);
            if (viewDataBinding == null) continue;
            return viewDataBinding;
        }
        boolean bl3 = this.e();
        if (bl3) {
            return this.b(ai0_02, view, n3);
        }
        return null;
    }

    public final ViewDataBinding c(ai0_0 ai0_02, View[] viewArray, int n3) {
        boolean bl2;
        Iterator iterator = this.b.iterator();
        while (bl2 = iterator.hasNext()) {
            ViewDataBinding viewDataBinding = ((Zh0)iterator.next()).c(ai0_02, viewArray, n3);
            if (viewDataBinding == null) continue;
            return viewDataBinding;
        }
        boolean bl3 = this.e();
        if (bl3) {
            return this.c(ai0_02, viewArray, n3);
        }
        return null;
    }

    public final void d(Zh0 object) {
        HashSet hashSet = this.a;
        Class<?> clazz = object.getClass();
        boolean bl2 = hashSet.add(clazz);
        if (bl2) {
            clazz = this.b;
            ((CopyOnWriteArrayList)((Object)clazz)).add((Zh0)object);
            object = ((Zh0)object).a().iterator();
            while (bl2 = object.hasNext()) {
                clazz = (Zh0)object.next();
                this.d((Zh0)((Object)clazz));
            }
        }
    }

    public final boolean e() {
        boolean bl2;
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        Iterator iterator = copyOnWriteArrayList.iterator();
        boolean bl3 = false;
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            Object object = Class.forName(string2);
            Class<Zh0> clazz = Zh0.class;
            boolean bl4 = clazz.isAssignableFrom((Class<?>)object);
            if (!bl4) continue;
            object = ((Class)object).newInstance();
            object = (Zh0)object;
            this.d((Zh0)object);
            try {
                copyOnWriteArrayList.remove(string2);
                bl3 = true;
            }
            catch (ClassNotFoundException | IllegalAccessException | InstantiationException reflectiveOperationException) {}
        }
        return bl3;
    }
}

