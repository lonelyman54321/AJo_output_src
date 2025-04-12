/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Hq3
extends jD3 {
    public final zr1_1 a;
    public final zr1_1 b;
    public final kn1_0 c;
    public final kn1_0 d;
    public final kn1_0 e;
    public final LiveData f;
    public final kn1_0 g;

    public Hq3(long l2) {
        zr1_1 zr1_12;
        Object object = Boolean.FALSE;
        super(object);
        this.a = zr1_12;
        this.b = zr1_12;
        object = bf0_0.a;
        String string2 = "You can't access the transaction repository if you don't initialize it!";
        if (object != null) {
            object = ((lb1_0)object).b(l2);
            Object object2 = Hq3$d.c;
            this.c = object = ft0.a((LiveData)object, zr1_12, (Function2)object2);
            object = bf0_0.a;
            if (object != null) {
                object = ((lb1_0)object).b(l2);
                object2 = new Object();
                object = br3.a((LiveData)object, (NX0)object2);
                object2 = "Transformations.map(this) { transform(it) }";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                this.d = object;
                object = bf0_0.a;
                if (object != null) {
                    Hq3$c hq3$c;
                    object = ((lb1_0)object).b(l2);
                    super();
                    object = br3.a((LiveData)object, hq3$c);
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                    this.e = object;
                    object2 = bf0_0.a;
                    if (object2 != null) {
                        Object object3 = ((lb1_0)object2).b(l2);
                        this.f = object3;
                        object3 = hq3$a_0.c;
                        this.g = object3 = ft0.a((LiveData)object, zr1_12, (Function2)object3);
                        return;
                    }
                    String string3 = string2.toString();
                    IllegalStateException illegalStateException = new IllegalStateException(string3);
                    throw illegalStateException;
                }
                String string4 = string2.toString();
                IllegalStateException illegalStateException = new IllegalStateException(string4);
                throw illegalStateException;
            }
            String string5 = string2.toString();
            IllegalStateException illegalStateException = new IllegalStateException(string5);
            throw illegalStateException;
        }
        String string6 = string2.toString();
        IllegalStateException illegalStateException = new IllegalStateException(string6);
        throw illegalStateException;
    }
}

