/*
 * Decompiled with CFR 0.152.
 */
package androidx.constraintlayout.widget;

import androidx.constraintlayout.widget.c$a;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

public final class c {
    public HashMap a;

    public final void a(int n3, c$a c$a) {
        Object object;
        HashMap hashMap = this.a;
        Serializable serializable = Integer.valueOf(n3);
        if ((serializable = (HashSet)hashMap.get(serializable)) == null) {
            serializable = new HashSet();
            object = n3;
            hashMap.put(object, serializable);
        }
        object = new WeakReference(c$a);
        ((HashSet)serializable).add(object);
    }
}

