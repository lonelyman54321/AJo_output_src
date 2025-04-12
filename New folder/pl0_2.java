/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/*
 * Renamed from PL0
 */
public final class pl0_2
extends FunctionReferenceImpl
implements Function1 {
    public pl0_2(ol0_1 ol0_12) {
        super(1, ol0_12, ol0_1.class, "cachedInAppImageV1", "cachedInAppImageV1(Ljava/lang/String;)Landroid/graphics/Bitmap;", 0);
    }

    public final Object invoke(Object object) {
        object = (String)object;
        return ((ol0_1)this.receiver).b((String)object);
    }
}

