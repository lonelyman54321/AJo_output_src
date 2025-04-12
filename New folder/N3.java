/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class N3
extends I3 {
    public final /* synthetic */ K3 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ x3 c;

    public N3(K3 k3, String string2, x3 x32) {
        this.a = k3;
        this.b = string2;
        this.c = x32;
    }

    public final void a(Object object) {
        Object object2 = this.a;
        Serializable serializable = ((K3)object2).b;
        String string2 = this.b;
        serializable = ((LinkedHashMap)serializable).get(string2);
        x3 x32 = this.c;
        if (serializable != null) {
            serializable = (Number)serializable;
            int n3 = ((Number)serializable).intValue();
            ArrayList arrayList = ((K3)object2).d;
            arrayList.add(string2);
            try {
                ((K3)object2).b(n3, x32, object);
                return;
            }
            catch (Exception exception) {
                arrayList.remove(string2);
                throw exception;
            }
        }
        object2 = new StringBuilder("Attempting to launch an unregistered ActivityResultLauncher with contract ");
        ((StringBuilder)object2).append(x32);
        ((StringBuilder)object2).append(" and input ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
        object = ((StringBuilder)object2).toString();
        object = object.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public final void b() {
        K3 k3 = this.a;
        String string2 = this.b;
        k3.f(string2);
    }
}

