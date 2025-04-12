/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Bq1
 */
public final class bq1_1
extends Lambda
implements Function2 {
    public final /* synthetic */ mk2_0 c;
    public final /* synthetic */ G11 d;
    public final /* synthetic */ zp$e e;

    public bq1_1(mk2_0 mk2_02, G11$a g11$a, zp$e zp$e) {
        this.c = mk2_02;
        this.d = g11$a;
        this.e = zp$e;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (Vo0)object;
        object2 = (c60)object2;
        long l2 = ((c60)object2).a;
        int n3 = c60.i(l2);
        int n4 = -1 >>> 1;
        float f5 = 0.0f / 0.0f;
        if (n3 != n4) {
            bp1_0 bp1_02 = bp1_0.Ltr;
            Object object4 = this.c;
            f5 = h.c((mk2_0)object4, bp1_02);
            float f6 = h.b((mk2_0)object4, bp1_02) + f5;
            int n7 = c60.i(l2);
            int n8 = object3.e0(f6);
            n4 = n7 - n8;
            object4 = this.e;
            float f7 = object4.a();
            n7 = object3.e0(f7);
            object = CollectionsKt.j0(this.d.a(n4, n7));
            object2 = new int[((Object)object).length];
            object4.b((Vo0)object3, n4, (int[])object, bp1_02, (int[])object2);
            object4 = new lr1_1((int[])object, (int[])object2);
            return object4;
        }
        object2 = "LazyVerticalGrid's width should be bound by parent.".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

