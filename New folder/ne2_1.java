/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Product.Product;
import java.io.Serializable;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Ne2
 */
public final class ne2_1
implements gx0_2 {
    public final /* synthetic */ CartEntry a;
    public final /* synthetic */ Ref$IntRef b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public ne2_1(CartEntry cartEntry, Ref$IntRef ref$IntRef, Ref$ObjectRef ref$ObjectRef, boolean bl2, boolean bl3) {
        this.a = cartEntry;
        this.b = ref$IntRef;
        this.c = ref$ObjectRef;
        this.d = bl2;
        this.e = bl3;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        ne2_1 ne2_12 = this;
        Object object4 = object;
        object4 = (PA)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        Object object7 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        int n4 = n3 & 0xE;
        int n7 = 4;
        if (n4 == 0) {
            n4 = (int)(object5.J(object4) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n3 |= n4;
        }
        if ((n3 &= 0x5B) == (n4 = 18) && (n3 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
        } else {
            object6 = hv3_0.a;
            CartEntry cartEntry = ne2_12.a;
            object7 = cartEntry.getProduct();
            object6.getClass();
            object6 = hv3_0.j((Product)object7);
            object5.u(1998134191);
            object6 = u63.a(object6, (b30_0)object5, 8);
            object5.I();
            object7 = hv3_0.K(R$string.product_image);
            Object object8 = ne2_12.b;
            int n8 = ((Ref$IntRef)object8).element;
            object7 = LO1.a(n8, (String)object7, " ");
            Object object9 = (LP1)ne2_12.c.element;
            Object object10 = SP2.a(10);
            object9 = QV.a((LP1)object9, (i13)object10);
            int n10 = 120;
            object10 = null;
            int n14 = 0;
            boolean bl2 = false;
            Object object11 = null;
            Serializable serializable = null;
            Object object12 = object5;
            Ref$IntRef ref$IntRef = object8;
            int n15 = 0;
            object8 = null;
            int n16 = 8;
            Pd1.a((im2)object6, (String)object7, (LP1)object9, null, null, 0.0f, null, (b30_0)object5, 0, n10);
            ref$IntRef.element = n3 = ref$IntRef.element + 1;
            n3 = (int)(ne2_12.e ? 1 : 0);
            n4 = (int)(ne2_12.d ? 1 : 0);
            if (n4 != 0 || n3 != 0) {
                if (n4 != 0) {
                    object5.K(-879367897);
                    n3 = R$string.od_cancelled;
                    object6 = nk_0.f((b30_0)object5, n3);
                    object7 = no_2.b(cartEntry);
                    object9 = "CANCELLED";
                    n4 = (int)(((String)object9).equalsIgnoreCase((String)object7) ? 1 : 0);
                    if (n4 != 0) {
                        object5.K(-879102258);
                        n3 = R$string.od_cancelled;
                        object6 = nk_0.f((b30_0)object5, n3);
                        object5.E();
                    } else {
                        object9 = "CANCELLATION_REQUESTED";
                        object7 = no_2.b(cartEntry);
                        n4 = (int)(((String)object9).equalsIgnoreCase((String)object7) ? 1 : 0);
                        if (n4 == 0 && (n4 = (int)(((String)(object9 = "CANCELLATION REQUESTED")).equalsIgnoreCase((String)(object7 = no_2.b(cartEntry))) ? 1 : 0)) == 0) {
                            n4 = -878299482;
                            object5.K(n4);
                            object5.E();
                        } else {
                            object5.K(-878458047);
                            n3 = R$string.od_cancellation_requested;
                            object6 = nk_0.f((b30_0)object5, n3);
                            object5.E();
                        }
                    }
                    object5.E();
                } else if (n3 != 0) {
                    object5.K(-878140886);
                    n3 = R$string.exchange;
                    object6 = nk_0.f((b30_0)object5, n3);
                    object5.E();
                } else {
                    n3 = -877969332;
                    object5.K(n3);
                    object5.E();
                    object6 = "";
                }
                n4 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0);
                if (n4 == 0) {
                    object7 = LP1$a.b;
                    object9 = Nc$a.h;
                    object10 = object4.a((LP1)object7, (Nc)object9);
                    float f5 = n7;
                    n15 = 7;
                    bl2 = false;
                    object9 = h.i((LP1)object10, 0.0f, 0.0f, 0.0f, f5, n15);
                    object10 = HA.e(Nc$a.a, false);
                    n14 = object5.F();
                    object11 = object5.m();
                    object9 = a30_0.c((b30_0)object5, (LP1)object9);
                    N20.W.getClass();
                    serializable = N20$a.b;
                    object12 = object5.i();
                    boolean bl3 = object12 instanceof mp;
                    if (bl3) {
                        object5.A();
                        bl3 = object5.e();
                        if (bl3) {
                            object5.C((Function0)((Object)serializable));
                        } else {
                            object5.n();
                        }
                        serializable = N20$a.e;
                        Ow3.a((b30_0)object5, object10, (Function2)((Object)serializable));
                        object10 = N20$a.d;
                        Ow3.a((b30_0)object5, object11, (Function2)object10);
                        object10 = N20$a.f;
                        bl2 = object5.e();
                        if (bl2 || !(bl2 = Intrinsics.areEqual(object11 = object5.v(), serializable = Integer.valueOf(n14)))) {
                            re0_0.a(n14, (b30_0)object5, n14, (N20$a$a)object10);
                        }
                        object10 = N20$a.c;
                        Ow3.a((b30_0)object5, object9, (Function2)object10);
                        object9 = Locale.ROOT;
                        object6 = ((String)object6).toUpperCase((Locale)object9);
                        object9 = "toUpperCase(...)";
                        Intrinsics.checkNotNullExpressionValue(object6, (String)object9);
                        long l2 = Em3.f(n16);
                        long l3 = OX.f;
                        long l4 = xx_1.z;
                        object8 = SP2.a(2);
                        object7 = h.e(androidx.compose.foundation.a.b((LP1)object7, l4, (i13)object8), f5);
                        object12 = tv0_0.o;
                        int n17 = 131024;
                        serializable = null;
                        n15 = 0;
                        object8 = null;
                        long l7 = 0L;
                        n7 = 0;
                        cartEntry = null;
                        long l8 = 0L;
                        object4 = object5;
                        n10 = 0;
                        int n18 = 200064;
                        Ll3.b((String)object6, (LP1)object7, l3, l2, null, (tv0_0)object12, null, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object5, n18, 0, n17);
                        object5.p();
                    } else {
                        s20.a();
                        throw null;
                    }
                }
            }
        }
        return Unit.a;
    }
}

