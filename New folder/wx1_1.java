/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GoogleAnalyticsEvents;
import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.data.repo.CouponRepo;
import com.ril.ajio.data.repo.RtbRepo;
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.permission.PermissionTrigger;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartAssuredGiftModel;
import com.ril.ajio.services.data.Cart.CartEarnPointData;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.CartModification;
import com.ril.ajio.services.data.Order.EarnPoint;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.Product.QuickViewProduct;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.query.QueryCart;
import com.ril.ajio.services.query.QuerySingleData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from wX1
 */
public final class wx1_1
extends Hj {
    public final zr1_1 A;
    public final zr1_1 A0;
    public final zr1_1 B;
    public final zr1_1 B0;
    public final zr1_1 C;
    public final zr1_1 C0;
    public final zr1_1 D;
    public final zr1_1 D0;
    public final zr1_1 E;
    public final zr1_1 E0;
    public final zr1_1 F;
    public final zr1_1 F0;
    public final zr1_1 G;
    public final zr1_1 G0;
    public final zr1_1 H;
    public final zr1_1 H0;
    public final zr1_1 I;
    public final zr1_1 I0;
    public final zr1_1 J;
    public final zr1_1 J0;
    public final zr1_1 K;
    public final zr1_1 K0;
    public final zr1_1 L;
    public final zr1_1 L0;
    public final zr1_1 M;
    public final zr1_1 M0;
    public final zr1_1 N;
    public ArrayList N0;
    public final zr1_1 O;
    public ArrayList O0;
    public final zr1_1 P;
    public List P0;
    public final zr1_1 Q;
    public ArrayList Q0;
    public final zr1_1 R;
    public ArrayList R0;
    public final zr1_1 S;
    public Cart S0;
    public final zr1_1 T;
    public final ArrayList T0;
    public final zr1_1 U;
    public final ArrayList U0;
    public ProductsList V0;
    public boolean W0;
    public final zr1_1 X;
    public boolean X0;
    public final zr1_1 Y;
    public boolean Y0;
    public final zr1_1 Z;
    public boolean Z0;
    public final hh3_2 a;
    public CartEntry a1;
    public boolean b;
    public CartEntry b1;
    public final CartApiRepo c;
    public EarnPoint c1;
    public final WishListRepo d;
    public final CartEarnPointData d1;
    public final CouponRepo e;
    public boolean e1;
    public final RtbRepo f;
    public int f1;
    public final t30_0 g;
    public int g1;
    public final zr1_1 h;
    public QuickViewProduct h1;
    public final zr1_1 i;
    public boolean i1;
    public final zr1_1 j;
    public boolean j1;
    public final zr1_1 k;
    public final zr1_1 k0;
    public int k1;
    public final zr1_1 l;
    public CartEntry l1;
    public final zr1_1 m;
    public CartAssuredGiftModel m1;
    public final zr1_1 n;
    public final cn_1 n1;
    public final zr1_1 o;
    public final m80_0 o1;
    public boolean p;
    public final zr1_1 p0;
    public HashSet p1;
    public final zr1_1 q;
    public final zr1_1 q0;
    public final jo_2 q1;
    public final zr1_1 r;
    public final zr1_1 r0;
    public final zr1_1 s;
    public final zr1_1 s0;
    public final zr1_1 t;
    public final zr1_1 t0;
    public final zr1_1 u;
    public final zr1_1 u0;
    public final zr1_1 v;
    public final zr1_1 v0;
    public final zr1_1 w;
    public final zr1_1 w0;
    public final zr1_1 x;
    public final zr1_1 x0;
    public final zr1_1 y;
    public final zr1_1 y0;
    public final zr1_1 z;
    public final zr1_1 z0;

    public wx1_1(Application application) {
        Object object;
        Intrinsics.checkNotNullParameter(application, "application");
        super(application);
        super();
        this.a = object = yr1_2.b((Function0)object);
        Object object2 = this.getApplication();
        this.c = object = new CartApiRepo((Context)object2);
        this.d = object = new WishListRepo((Context)application);
        this.e = object = new CouponRepo((Context)application);
        object2 = this.getApplication();
        this.f = object = new RtbRepo((Context)object2);
        this.g = object = new t30_0();
        this.h = object = new zr1_1();
        this.i = object;
        this.j = object = new zr1_1();
        this.k = object;
        this.l = object = new zr1_1();
        this.m = object;
        this.n = object = new zr1_1();
        this.o = object;
        this.p = true;
        this.q = object = new zr1_1();
        this.r = object;
        this.s = object = new zr1_1();
        this.t = object;
        this.u = object = new zr1_1();
        this.v = object;
        this.w = object = new zr1_1();
        this.x = object;
        this.y = object = new zr1_1();
        this.z = object;
        this.A = object = new zr1_1();
        this.B = object = new zr1_1();
        this.C = object;
        this.D = object = new zr1_1();
        this.E = object;
        this.F = object = new zr1_1();
        this.G = object;
        this.H = object = new zr1_1();
        this.I = object;
        this.J = object = new zr1_1();
        this.K = object;
        this.L = object = new zr1_1();
        this.M = object;
        this.N = object = new zr1_1();
        this.O = object;
        this.P = object = new zr1_1();
        this.Q = object;
        this.R = object = new zr1_1();
        this.S = object;
        this.T = object = new zr1_1();
        this.U = object;
        this.X = object = new zr1_1();
        this.Y = object;
        this.Z = object = new zr1_1();
        this.k0 = object;
        this.p0 = object = new zr1_1();
        this.q0 = object;
        this.r0 = object = new zr1_1();
        this.s0 = object;
        this.t0 = object = new zr1_1();
        this.u0 = object;
        this.v0 = object = new zr1_1();
        this.w0 = object;
        this.x0 = object = new zr1_1();
        this.y0 = object;
        this.z0 = object = new zr1_1();
        this.A0 = object;
        this.B0 = object = new zr1_1();
        this.C0 = object;
        this.D0 = object = new zr1_1();
        this.E0 = object;
        this.F0 = object = new zr1_1();
        this.G0 = object;
        this.H0 = object = new zr1_1();
        this.I0 = object;
        this.J0 = object = new zr1_1();
        this.K0 = object;
        this.L0 = object = new zr1_1();
        this.M0 = object;
        object = new ArrayList();
        this.T0 = object;
        object = new ArrayList();
        this.U0 = object;
        super();
        this.a1 = object;
        super();
        this.b1 = object;
        object2 = object;
        this.d1 = object = new CartEarnPointData(0.0, 0.0f, null, 7, null);
        this.n1 = object = new Object();
        this.o1 = object = new Object();
        object = new HashSet();
        this.p1 = object;
        application = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(application, "getApplicationContext(...)");
        this.q1 = object = new jo_2((Context)application);
        new ArrayList();
    }

    public final void b(ProductsList productsList, boolean bl2) {
        Object object = yn3_0.a;
        Object object2 = new StringBuilder("init delete success: ");
        ((StringBuilder)object2).append(bl2);
        object2 = ((StringBuilder)object2).toString();
        Object[] objectArray = new Object[]{};
        ((yn3$a)object).a((String)object2, objectArray);
        object = md3_0.c(this);
        object2 = new wX1$a(this, productsList, bl2, null);
        Ae3.d((i90_0)object, null, null, (Function2)object2, 3);
    }

    public final boolean c() {
        Object object = this.a.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return ((UserInformation)object).isUserOnline();
    }

    public final void d(CartEntry object, CartEntry object2) {
        int n3;
        Object object3;
        Object object4 = new QueryCart();
        Object object5 = null;
        if (object != null && (object3 = ((CartEntry)object).getProduct()) != null) {
            object3 = ((Product)object3).getCode();
        } else {
            n3 = 0;
            object3 = null;
        }
        ((QueryCart)object4).setProductCode((String)object3);
        n3 = 1;
        ((QueryCart)object4).setQuantity(n3);
        QuerySingleData querySingleData = new QuerySingleData(null, n3, null);
        if (object2 != null) {
            object5 = ((CartEntry)object2).getEntryNumber();
        }
        object2 = String.valueOf(object5);
        querySingleData.setData((String)object2);
        if (object == null || (object = ((CartEntry)object).getSourceStoreId()) == null) {
            object = "ajio";
        }
        object = this.c.moveToClosetAndDelete((QueryCart)object4, querySingleData, (String)object, "bag screen");
        object2 = new v4_0(this, 1);
        object4 = new lx1_0(0, (Function1)object2);
        object2 = new Object();
        object5 = new nx1_0(0, (Function1)object2);
        object = ((g53_0)object).f((o60_0)object4, (o60_0)object5);
        this.g.b((yr0_2)object);
    }

    public final void e(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "cartRvItemList");
        Serializable serializable = this.S0;
        if (serializable != null) {
            int n3;
            Object object = this.O0;
            if (object != null) {
                boolean bl2;
                object = ((ArrayList)object).iterator();
                block0: while (bl2 = object.hasNext()) {
                    Object object2;
                    int n4;
                    Object object3 = (CartModification)object.next();
                    Object object4 = ((Cart)serializable).getEntries();
                    int n7 = ((ArrayList)object4).size();
                    int n8 = 0;
                    Object object5 = null;
                    int n10 = 0;
                    String string2 = null;
                    while (true) {
                        boolean bl3;
                        Object object6;
                        n4 = 1;
                        if (n10 >= n7) break;
                        object2 = (CartEntry)((Cart)serializable).getEntries().get(n10);
                        if (object2 != null) {
                            object6 = ((CartEntry)object2).getProduct();
                        } else {
                            bl3 = false;
                            object6 = null;
                        }
                        if (object6 != null) {
                            if (object3 != null && (object6 = ((CartModification)object3).getEntry()) != null && (object6 = ((CartEntry)object6).getProduct()) != null) {
                                object6 = ((Product)object6).getCode();
                            } else {
                                bl3 = false;
                                object6 = null;
                            }
                            bl3 = TextUtils.isEmpty((CharSequence)object6);
                            if (!bl3) {
                                if (object3 != null && (object6 = ((CartModification)object3).getEntry()) != null && (object6 = ((CartEntry)object6).getProduct()) != null) {
                                    object6 = ((Product)object6).getCode();
                                } else {
                                    bl3 = false;
                                    object6 = null;
                                }
                                String string3 = ((CartEntry)object2).getProduct().getCode();
                                bl3 = Intrinsics.areEqual(object6, string3);
                                if (bl3) {
                                    ((CartEntry)object2).setStatus(n4);
                                    break;
                                }
                            }
                        }
                        ++n10;
                    }
                    if ((n7 = ((ArrayList)(object4 = ((Cart)serializable).getOosCartEntries())).size()) == 0) {
                        object4 = ((Cart)serializable).getOosCartEntries();
                        if (object3 != null) {
                            object3 = ((CartModification)object3).getEntry();
                        } else {
                            bl2 = false;
                            object3 = null;
                        }
                        ((ArrayList)object4).add(object3);
                        continue;
                    }
                    object4 = ((Cart)serializable).getOosCartEntries();
                    n7 = ((ArrayList)object4).size();
                    while (n8 < n7) {
                        string2 = ((CartEntry)((Cart)serializable).getOosCartEntries().get(n8)).getProduct().getCode();
                        n10 = (int)(kotlin.text.b.i(string2, (String)(object2 = object3 != null && (object2 = ((CartModification)object3).getEntry()) != null && (object2 = ((CartEntry)object2).getProduct()) != null ? ((Product)object2).getCode() : null), n4 != 0) ? 1 : 0);
                        if (n10 != 0) continue block0;
                        ++n8;
                    }
                    object4 = ((Cart)serializable).getOosCartEntries();
                    if (object3 != null) {
                        object5 = ((CartModification)object3).getEntry();
                    } else {
                        n8 = 0;
                        object5 = null;
                    }
                    ((ArrayList)object4).add(object5);
                    if (object3 != null && (object4 = ((CartModification)object3).getEntry()) != null && (object4 = ((CartEntry)object4).getProduct()) != null) {
                        object4 = ((Product)object4).getCode();
                    } else {
                        n7 = 0;
                        object4 = null;
                    }
                    if ((n7 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0)) != 0) continue;
                    object4 = AnalyticsManager.Companion.getInstance().getGa();
                    if (object3 != null && (object3 = ((CartModification)object3).getEntry()) != null && (object3 = ((CartEntry)object3).getProduct()) != null) {
                        object3 = ((Product)object3).getCode();
                    } else {
                        bl2 = false;
                        object3 = null;
                    }
                    object5 = "bag screen";
                    string2 = "inventory";
                    String string4 = "outOfStock";
                    ((GoogleAnalyticsEvents)object4).trackCustomDimension((String)object3, string2, string4, (String)object5);
                }
                this.O0 = null;
            }
            if ((n3 = ((ArrayList)(serializable = ((Cart)serializable).getOosCartEntries())).size()) > 0) {
                n3 = 4;
                jo_1.a(n3, null, null, arrayList);
            }
        }
    }

    public final void f(String object) {
        object = this.f.sendRTBRequest((String)object, "bag screen");
        Function1 function1 = new Object();
        rx1_1 rx1_12 = new rx1_1(0, function1);
        function1 = new dj0_2(1);
        m4_0 m4_02 = new m4_0(function1);
        object = ((g53_0)object).f(rx1_12, m4_02);
        this.g.b((yr0_2)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean g(boolean bl2) {
        Object object = h40_0.a;
        boolean bl3 = h40_0.k1();
        boolean bl4 = false;
        if (!bl3) return false;
        object = h40_0.E().getTouchPointList();
        if (object == null) return false;
        String string2 = PermissionTrigger.CART.getValue();
        bl3 = StringsKt.F((CharSequence)object, string2, false);
        if (!bl3) return false;
        bl3 = true;
        if (!bl3) {
            return false;
        }
        object = this.S0;
        if (object != null) {
            object = ((Cart)object).getEntries();
        } else {
            bl3 = false;
            object = null;
        }
        if (object != null && !(bl3 = object.isEmpty())) {
            bl3 = false;
            object = null;
        } else {
            bl3 = true;
        }
        if (bl3) return bl4;
        if (bl2) return true;
        bl2 = this.W0;
        if (!bl2) return bl4;
        return true;
    }

    public final void h(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "postalPinCode");
        Intrinsics.checkNotNullParameter(string3, "addressId");
        aW aW2 = md3_0.c(this);
        wX1$b wX1$b = new wX1$b(this, string2, string3, null);
        Ae3.d(aW2, null, null, wX1$b, 3);
    }

    public final void i(int n3, int n4, String string2) {
        Intrinsics.checkNotNullParameter(string2, "productCode");
        QueryCart queryCart = new QueryCart();
        queryCart.setCartEntryNumber(n4);
        queryCart.setQuantity(n3);
        queryCart.setProductCode(string2);
        aW aW2 = md3_0.c(this);
        wX1$c wX1$c = new wX1$c(this, queryCart, null);
        Ae3.d(aW2, null, null, wX1$c, 3);
    }

    public final void onCleared() {
        super.onCleared();
        this.g.d();
    }
}

