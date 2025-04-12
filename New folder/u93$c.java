/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class u93$c
implements Function2 {
    public final /* synthetic */ u93_0 a;

    public u93$c(u93_0 u93_02) {
        this.a = u93_02;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            Object object3;
            object2 = this.a;
            Object object4 = ((Fragment)object2).getArguments();
            Object object5 = "SORT";
            if (object4 == null || (object4 = object4.getString((String)(object3 = "SORT_FILTER_PAGE_SOURCE"))) == null) {
                object4 = object5;
            }
            boolean bl2 = Intrinsics.areEqual(object4, object5);
            object3 = ((u93_0)object2).h;
            int n7 = 8;
            if (bl2) {
                n3 = 1936369580;
                object.K(n3);
                object4 = (yh0_0)((D)object3).getValue();
                object5 = new v93_0((u93_0)object2);
                r93_0.b((yh0_0)object4, (v93_0)object5, (b30_0)object, n7);
                object.E();
            } else {
                object5 = "FILTER";
                n3 = (int)(Intrinsics.areEqual(object4, object5) ? 1 : 0);
                if (n3 != 0) {
                    n3 = 1936651835;
                    object.K(n3);
                    object4 = (yh0_0)((D)object3).getValue();
                    int n8 = 1;
                    object5 = new u02_0(object2, n8);
                    object3 = new w93_0((u93_0)object2);
                    tm0_1.b((yh0_0)object4, (u02_0)object5, (w93_0)object3, (b30_0)object, n7);
                    object.E();
                } else {
                    n4 = 1937324132;
                    object.K(n4);
                    object.E();
                }
            }
        }
        return Unit.a;
    }
}

