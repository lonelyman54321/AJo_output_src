/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import java.util.List;

public final class m10
implements ComponentRegistrarProcessor {
    public static void a(StringBuilder stringBuilder, int n3, String string2, int n4, String string3) {
        stringBuilder.append(n3);
        stringBuilder.append(string2);
        stringBuilder.append(n4);
        stringBuilder.append(string3);
    }

    public List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }
}

