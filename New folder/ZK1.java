/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class ZK1
implements bx0_2 {
    public static int a(al1_1 al1_12, Rj1 rj1, List list, int n3) {
        int n4 = list.size();
        ArrayList<dm0_1> arrayList = new ArrayList<dm0_1>(n4);
        n4 = list.size();
        bp1_0 bp1_02 = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            Qj1 qj1 = (Qj1)list.get(i3);
            Sj1 sj1 = Sj1.Max;
            Vj1 vj1 = Vj1.Height;
            dm0_1 dm0_12 = new dm0_1(qj1, sj1, vj1);
            arrayList.add(dm0_12);
        }
        long l2 = f60.b(n3, 0, 13);
        bp1_02 = rj1.getLayoutDirection();
        dk1 dk12 = new dk1(rj1, bp1_02);
        return al1_12.c(dk12, arrayList, l2).getHeight();
    }

    public static int b(al1_1 al1_12, Rj1 rj1, List list, int n3) {
        int n4 = list.size();
        ArrayList<dm0_1> arrayList = new ArrayList<dm0_1>(n4);
        n4 = list.size();
        bp1_0 bp1_02 = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            Qj1 qj1 = (Qj1)list.get(i3);
            Sj1 sj1 = Sj1.Max;
            Vj1 vj1 = Vj1.Width;
            dm0_1 dm0_12 = new dm0_1(qj1, sj1, vj1);
            arrayList.add(dm0_12);
        }
        long l2 = f60.b(0, n3, 7);
        bp1_02 = rj1.getLayoutDirection();
        dk1 dk12 = new dk1(rj1, bp1_02);
        return al1_12.c(dk12, arrayList, l2).getWidth();
    }

    public static int c(al1_1 al1_12, Rj1 rj1, List list, int n3) {
        int n4 = list.size();
        ArrayList<dm0_1> arrayList = new ArrayList<dm0_1>(n4);
        n4 = list.size();
        bp1_0 bp1_02 = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            Qj1 qj1 = (Qj1)list.get(i3);
            Sj1 sj1 = Sj1.Min;
            Vj1 vj1 = Vj1.Height;
            dm0_1 dm0_12 = new dm0_1(qj1, sj1, vj1);
            arrayList.add(dm0_12);
        }
        long l2 = f60.b(n3, 0, 13);
        bp1_02 = rj1.getLayoutDirection();
        dk1 dk12 = new dk1(rj1, bp1_02);
        return al1_12.c(dk12, arrayList, l2).getHeight();
    }

    public static int d(al1_1 al1_12, Rj1 rj1, List list, int n3) {
        int n4 = list.size();
        ArrayList<dm0_1> arrayList = new ArrayList<dm0_1>(n4);
        n4 = list.size();
        bp1_0 bp1_02 = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            Qj1 qj1 = (Qj1)list.get(i3);
            Sj1 sj1 = Sj1.Min;
            Vj1 vj1 = Vj1.Width;
            dm0_1 dm0_12 = new dm0_1(qj1, sj1, vj1);
            arrayList.add(dm0_12);
        }
        long l2 = f60.b(0, n3, 7);
        bp1_02 = rj1.getLayoutDirection();
        dk1 dk12 = new dk1(rj1, bp1_02);
        return al1_12.c(dk12, arrayList, l2).getWidth();
    }

    public static void e(Object[] object, int n3, String string2, String string3, String string4) {
        object = Arrays.copyOf(object, n3);
        object = String.format(string2, object);
        Intrinsics.checkNotNullExpressionValue(object, string3);
        mq0_2.c(string4, (String)object);
    }

    public Object apply(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        String string2 = "LP_OTP";
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(object2, "t");
        return ApiErrorRepo.INSTANCE.handleApiException((Throwable)object2, string2, true, "single page checkout", "Forward");
    }
}

