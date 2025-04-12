/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vl1
 */
public final class vl1_2 {
    public static final void a(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "<this>");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final xs3_0 b(yt2_2 object, Product object2) {
        void var0_6;
        void var5_27;
        void var0_11;
        void var2_22;
        void var5_29;
        block12: {
            Object object3;
            block11: {
                String string2;
                String string3;
                block10: {
                    String string4;
                    Intrinsics.checkNotNullParameter(object, "screenName");
                    Intrinsics.checkNotNullParameter(object3, "product");
                    int[] nArray = vl1$a.$EnumSwitchMapping$0;
                    int n3 = ((Enum)object).ordinal();
                    n3 = nArray[n3];
                    int n4 = 1;
                    string3 = "";
                    if (n3 == n4) break block10;
                    n4 = 2;
                    if (n3 != n4 && n3 != (n4 = 3) && n3 != (n4 = 4)) {
                        int n7 = 5;
                        if (n3 != n7) {
                            NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                            throw noWhenBranchMatchedException;
                        }
                        String string5 = string3;
                        String string6 = string3;
                        return new xs3_0(var5_29, var2_22, var0_11);
                    }
                    String string7 = ((Product)object3).getBrickCategory();
                    if (string7 == null) {
                        String string8 = string3;
                    }
                    if ((string4 = ((Product)object3).getBrickSubCategory()) == null) {
                        String string9 = string3;
                    }
                    if ((object3 = ((Product)object3).getBrickName()) != null) break block11;
                    break block12;
                }
                String string10 = ((Product)object3).getSegmentNameText();
                if (string10 == null) {
                    String string11 = string3;
                }
                if ((string2 = ((Product)object3).getVerticalNameText()) == null) {
                    String string12 = string3;
                }
                if ((object3 = ((Product)object3).getBrickNameText()) == null) break block12;
            }
            String string13 = object3;
        }
        void var7_31 = var5_27;
        void var5_28 = var0_6;
        void var0_7 = var7_31;
        return new xs3_0(var5_29, var2_22, var0_11);
    }

    public static final boolean c() {
        boolean bl2;
        String string2 = "prod";
        String string3 = "qaregression";
        if (string2 != string3) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

