/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.entity.Component;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pa2
 */
public final class pa2_1 {
    public final int a;
    public float b;
    public final Component c;

    public pa2_1(int n3, float f5, Component component, int n4) {
        int n7 = n4 & 2;
        if (n7 != 0) {
            f5 = 0.0f;
        }
        if ((n4 &= 4) != 0) {
            component = null;
        }
        this.a = n3;
        this.b = f5;
        this.c = component;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof pa2_1;
        if (n3 == 0) {
            return false;
        }
        object = (pa2_1)object;
        int n4 = this.a;
        n3 = ((pa2_1)object).a;
        if (n4 != n3) {
            return false;
        }
        float f5 = this.b;
        float f6 = ((pa2_1)object).b;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        Component component = this.c;
        object = ((pa2_1)object).c;
        boolean bl3 = Intrinsics.areEqual(component, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a;
        int n4 = 31;
        n3 *= 31;
        float f5 = this.b;
        n3 = UR0.a(f5, n3, n4);
        Component component = this.c;
        if (component == null) {
            n4 = 0;
            component = null;
        } else {
            n4 = component.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        float f5 = this.b;
        StringBuilder stringBuilder = new StringBuilder("OrderConfirmUiComponent(type=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", ajioPointAmount=");
        stringBuilder.append(f5);
        stringBuilder.append(", component=");
        Component component = this.c;
        stringBuilder.append(component);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

