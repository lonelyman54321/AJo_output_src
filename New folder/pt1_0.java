/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from PT1
 */
public final class pt1_0
extends Lambda
implements hx0_2 {
    public final /* synthetic */ gx2_0 c;
    public final /* synthetic */ d d;
    public final /* synthetic */ bs2_1 e;
    public final /* synthetic */ tr1_0 f;
    public final /* synthetic */ ib3_0 g;

    public pt1_0(gx2_0 gx2_02, d d2, cs2_1 cs2_12, tr1_0 tr1_02, ib3_0 ib3_02) {
        this.c = gx2_02;
        this.d = d2;
        this.e = cs2_12;
        this.f = tr1_02;
        this.g = ib3_02;
        super(4);
    }

    public final Object invoke(Object object, Object object2, Object object3, Object listIterator) {
        object = (ek_1)object;
        object2 = (d)object2;
        object3 = (b30_0)object3;
        ((Number)((Object)listIterator)).intValue();
        listIterator = this.c.c.getValue();
        Object object4 = this.d;
        int n3 = Intrinsics.areEqual(listIterator, object4);
        object4 = this.f;
        int n4 = aU1.c((tr1_0)object4);
        if (n4 == 0 && n3 == 0) {
            block3: {
                listIterator = (List)this.g.getValue();
                n4 = listIterator.size();
                listIterator = listIterator.listIterator(n4);
                while ((n4 = (int)(listIterator.hasPrevious() ? 1 : 0)) != 0) {
                    Object object5 = object4 = listIterator.previous();
                    object5 = (d)object4;
                    boolean bl2 = Intrinsics.areEqual(object2, object5);
                    if (!bl2) continue;
                    break block3;
                }
                n4 = 0;
                object4 = null;
            }
            object2 = object4;
            object2 = (d)object4;
        }
        if (object2 != null) {
            listIterator = new ListIterator((d)object2, (ek_1)object);
            int n7 = -1263531443;
            object = v10.c(n7, listIterator, (b30_0)object3);
            n3 = 384;
            object4 = this.e;
            US1.a((d)object2, (bs2_1)object4, (u10)object, (b30_0)object3, n3);
        }
        return Unit.a;
    }
}

