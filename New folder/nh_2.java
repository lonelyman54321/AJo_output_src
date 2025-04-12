/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nH
 */
public final class nh_2 {
    public static final nh$a_0 Companion;
    public final oh_2 a;
    public nh$b_0 b;

    static {
        nh$a_0 nh$a_0;
        Companion = nh$a_0 = new Object();
    }

    public nh_2(oh_2 oh_22) {
        Intrinsics.checkNotNullParameter(oh_22, "cmsLPTimerViewData");
        this.a = oh_22;
    }

    public final void a(String string2) {
        int n3;
        oh_2 oh_22 = this.a;
        Object object = oh_22.a;
        if (object != null) {
            n3 = 8;
            object.setVisibility(n3);
        }
        object = Companion;
        long l2 = oh_22.h;
        object.getClass();
        boolean bl2 = nh$a_0.a(l2);
        if (bl2) {
            object = oh_22.a;
            if (object != null) {
                n3 = 0;
                object.setVisibility(0);
            }
            if ((oh_22 = oh_22.b) != null) {
                if (string2 == null) {
                    int n4 = R$string.ends_in;
                    string2 = hv3_0.K(n4);
                }
                oh_22.setText(string2);
            }
            this.b();
        }
    }

    public final void b() {
        nh$b_0 nh$b_0;
        long l2 = this.a.h;
        long l3 = System.currentTimeMillis();
        this.b = nh$b_0 = new nh$b_0(this, l2 -= l3);
        nh$b_0.start();
    }
}

