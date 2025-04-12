/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from y62
 */
public abstract class y62_0
implements be2_2 {
    public final /* synthetic */ int a;
    public Object b;

    public y62_0() {
        this.a = 1;
        Object object = dz3.a;
        object = new ArrayDeque;
        super(20);
        this.b = object;
    }

    public y62_0(Object object) {
        this.a = 0;
        this.b = object;
    }

    public void a(uw2_0 uw2_02) {
        int n3;
        ArrayDeque arrayDeque = (ArrayDeque)this.b;
        int n4 = arrayDeque.size();
        if (n4 < (n3 = 20)) {
            arrayDeque.offer(uw2_02);
        }
    }

    public Object b(gn1_2 gn1_22, Object object) {
        Intrinsics.checkNotNullParameter(gn1_22, "property");
        return this.b;
    }

    public String toString() {
        int n3 = this.a;
        switch (n3) {
            default: {
                return super.toString();
            }
            case 0: 
        }
        StringBuilder stringBuilder = new StringBuilder("ObservableProperty(value=");
        Object object = this.b;
        return gl1_0.a(stringBuilder, object, ')');
    }
}

