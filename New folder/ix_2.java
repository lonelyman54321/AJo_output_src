/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.drawable.Drawable
 */
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iX
 */
public final class ix_2
implements hx0_2 {
    public final /* synthetic */ ke1_2 a;
    public final /* synthetic */ he1_2 b;
    public final /* synthetic */ hx0_2 c;
    public final /* synthetic */ hx0_2 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ ix0_2 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ Function2 h;

    public ix_2(ke1_2 ke1_22, he1_2 he1_22, hx0_2 hx0_22, hx0_2 hx0_23, Function0 function0, ix0_2 ix0_22, Function1 function1, Function2 function2) {
        this.a = ke1_22;
        this.b = he1_22;
        this.c = hx0_22;
        this.d = hx0_23;
        this.e = function0;
        this.f = ix0_22;
        this.g = function1;
        this.h = function2;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        block22: {
            block18: {
                Object object5;
                Object object6;
                Object object7;
                int n3;
                Object object8;
                int n4;
                int n7;
                int n8;
                int n10;
                Object object9;
                block21: {
                    block20: {
                        block19: {
                            block17: {
                                object9 = object;
                                object9 = (PA)object;
                                object2 = (zd1_2)object2;
                                object3 = (b30_0)object3;
                                n10 = ((Number)object4).intValue();
                                Intrinsics.checkNotNullParameter(object9, "$this$ImageRequest");
                                object4 = "imageState";
                                Intrinsics.checkNotNullParameter(object2, (String)object4);
                                n8 = n10 & 6;
                                if (n8 == 0) {
                                    n8 = (int)(object3.J(object9) ? 1 : 0);
                                    n8 = n8 != 0 ? 4 : 2;
                                    n8 |= n10;
                                } else {
                                    n8 = n10;
                                }
                                n7 = 32;
                                if ((n10 &= 0x30) == 0) {
                                    n10 = (int)(object3.J(object2) ? 1 : 0);
                                    n10 = n10 != 0 ? 32 : 16;
                                    n8 |= n10;
                                }
                                if ((n10 = n8 & 0x93) != (n4 = 146) || (n10 = (int)(object3.h() ? 1 : 0)) == 0) break block17;
                                object3.D();
                                break block18;
                            }
                            object3.K(279518236);
                            n10 = n8 & 0x70;
                            n4 = 1;
                            if (n10 == n7) {
                                n10 = 1;
                            } else {
                                n10 = 0;
                                object = null;
                            }
                            object8 = object3.v();
                            if (n10 != 0 || object8 == (object = b30$a.a)) {
                                object8 = xw_0.a((zd1_2)object2);
                                object = this.g;
                                object.invoke(object8);
                                object3.o(object8);
                            }
                            object = object8;
                            object = (ww_0)object8;
                            object3.E();
                            n3 = object instanceof WW$c;
                            if (n3 == 0) break block19;
                            n10 = 279523975;
                            object3.K(n10);
                            object3.E();
                            break block18;
                        }
                        n3 = object instanceof WW$b;
                        object8 = this.e;
                        if (n3 == 0) break block20;
                        n3 = 75364373;
                        object3.K(n3);
                        LP1 lP1 = e60_0.a((PA)object9);
                        Object object10 = this.h;
                        he1_2 he1_22 = this.b;
                        object2 = new hx_1((Function0)object8, (Function2)object10, he1_22);
                        n7 = 1518529224;
                        u10 u102 = v10.c(n7, (fx0_2)object2, (b30_0)object3);
                        int n14 = 3072;
                        object10 = this.a;
                        Object object11 = object3;
                        md1_2.b((ke1_2)object10, lP1, he1_22, u102, (b30_0)object3, n14);
                        object2 = this.c;
                        if (object2 != null) {
                            object4 = n8 &= 0xE;
                            object2.invoke(object9, object, object3, object4);
                            object = Unit.a;
                        }
                        object3.E();
                        break block18;
                    }
                    n3 = object instanceof WW$a;
                    if (n3 == 0) break block21;
                    n3 = 75879407;
                    object3.K(n3);
                    LP1 lP1 = e60_0.a((PA)object9);
                    object2 = object;
                    Throwable throwable = ((WW$a)object).b;
                    he1_2 he1_23 = this.b;
                    boolean bl2 = false;
                    ke1_2 ke1_22 = this.a;
                    Object object12 = object3;
                    md1_2.a(ke1_22, lP1, he1_23, throwable, (b30_0)object3, 0);
                    object2 = this.d;
                    if (object2 != null) {
                        object4 = n8 &= 0xE;
                        object2.invoke(object9, object, object3, object4);
                        object = Unit.a;
                    }
                    object3.E();
                    break block18;
                }
                n3 = object instanceof WW$d;
                if (n3 == 0) break block22;
                n3 = 76172915;
                object3.K(n3);
                Object object13 = e60_0.a((PA)object9);
                Object object14 = ((pe1_0)object8.invoke()).b;
                object2 = object;
                object2 = (WW$d)object;
                object8 = ((WW$d)object2).a;
                if (object8 != null && (object8 = bu0_0.a((Drawable)object8)) != null && (object8 = object8.copy(object7 = Bitmap.Config.ARGB_8888, n4 != 0)) != null) {
                    object5 = object6 = new ih_0((Bitmap)object8);
                } else {
                    n7 = 0;
                    object8 = null;
                    object5 = null;
                }
                object7 = this.b;
                object6 = this.a;
                md1_2.c((ke1_2)object6, (LP1)object13, object14, (he1_2)object7, object5, (b30_0)object3, 0);
                object2 = ((WW$d)object2).a;
                if (object2 == null) {
                    object3.E();
                } else {
                    object8 = this.a;
                    n4 = object8 instanceof ke1_2;
                    object8 = n4 != 0 ? ((ke1_2)object8).a : mz0_2.a;
                    object13 = ji2_2.a((Drawable)object2, (List)object8, (b30_0)object3);
                    object2 = this.f;
                    if (object2 != null) {
                        object3.K(76706332);
                        n3 = n8 & 0xE;
                        object7 = n3;
                        object8 = this.f;
                        object6 = object;
                        object14 = object3;
                        object8.invoke(object9, object, object13, object3, object7);
                        object3.E();
                    } else {
                        n10 = 76782902;
                        object3.K(n10);
                        object = e60_0.a((PA)object9);
                        object2 = this.b;
                        object4 = ((he1_2)object2).g;
                        object = androidx.compose.ui.platform.e.a((LP1)object, (String)object4);
                        ie3_1.a((he1_2)object2, (LP1)object, (im2)object13, (b30_0)object3, 0);
                        object3.E();
                    }
                    object3.E();
                }
            }
            return Unit.a;
        }
        object3.K(279523930);
        object3.E();
        object = new NoWhenBranchMatchedException();
        throw object;
    }
}

