/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.cart.ConvenienceFeeConfig;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from m80
 */
public final class m80_0 {
    public static final m80$a Companion;
    public static boolean c;
    public static String d;
    public String a;
    public ConvenienceFeeConfig b;

    static {
        m80$a m80$a;
        Companion = m80$a = new Object();
    }

    public final String a() {
        Object object = this.b;
        object = object != null ? ((ConvenienceFeeConfig)object).getInfoLabel() : null;
        return object;
    }

    public final String b() {
        Object object = this.b;
        object = object != null ? ((ConvenienceFeeConfig)object).getPriorityDeliveryFeeLabel() : null;
        return object;
    }

    public final void c() {
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = "ConvenienceFeeConfig";
        this.a = object = ((ao0_0)object).b((String)object2);
        int n3 = ((String)object).length();
        if (n3 != 0) {
            object = this.a;
            object2 = ConvenienceFeeConfig.class;
            this.b = object = (ConvenienceFeeConfig)JsonUtils.fromJson((String)object, (Class)object2);
        }
    }

    public final boolean d() {
        boolean bl2 = this.e();
        boolean bl3 = false;
        if (bl2) {
            Object object = this.b;
            if (object != null) {
                object = ((ConvenienceFeeConfig)object).isCodFeeApplicable();
                Boolean bl4 = Boolean.TRUE;
                bl2 = Intrinsics.areEqual(object, bl4);
            } else {
                bl2 = false;
                object = null;
            }
            if (bl2) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final boolean e() {
        boolean bl2;
        Object object = this.b;
        if (object != null) {
            object = ((ConvenienceFeeConfig)object).getMasterFlag();
            Boolean bl3 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object, bl3);
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final boolean f() {
        boolean bl2 = this.e();
        boolean bl3 = false;
        if (bl2) {
            Object object = this.b;
            if (object != null) {
                object = ((ConvenienceFeeConfig)object).isRvpFeeApplicable();
                Boolean bl4 = Boolean.TRUE;
                bl2 = Intrinsics.areEqual(object, bl4);
            } else {
                bl2 = false;
                object = null;
            }
            if (bl2) {
                bl3 = true;
            }
        }
        return bl3;
    }
}

