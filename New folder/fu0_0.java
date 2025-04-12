/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Fu0
 */
public final class fu0_0
extends Lambda
implements Function1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fu0_0(Object object, int n3) {
        this.c = n3;
        this.d = object;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3 = this.c;
        switch (n3) {
            default: {
                object = (a11_0)object;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement)this.d;
                float f5 = shadowGraphicsLayerElement.b;
                f5 = object.J0(f5);
                object.t(f5);
                i13 i132 = shadowGraphicsLayerElement.c;
                object.I0(i132);
                boolean bl2 = shadowGraphicsLayerElement.d;
                object.r(bl2);
                long l2 = shadowGraphicsLayerElement.e;
                object.q(l2);
                long l3 = shadowGraphicsLayerElement.f;
                object.s(l3);
                return Unit.a;
            }
            case 0: 
        }
        object = (Vo0)object;
        long l4 = Ti1.a(ok1_1.b(((yu0_0)this.d).a.e()), 0);
        object = new Si1(l4);
        return object;
    }
}

