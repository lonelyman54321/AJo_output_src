/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fz0
 */
public final class fz0_1
implements View.OnClickListener,
z82_0 {
    public final Context a;
    public final View b;
    public final j82_0 c;
    public final TextView d;
    public final RecyclerView e;
    public final ImageView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final View j;
    public final hh3_2 k;

    public fz0_1(gc3_2 object, View object2, j82_0 objectArray) {
        Intrinsics.checkNotNullParameter(object2, "itemView");
        Intrinsics.checkNotNullParameter(objectArray, "onCartClickListener");
        this.a = object;
        this.b = object2;
        this.c = objectArray;
        super(1);
        object = yr1_2.b((Function0)object);
        this.k = object;
        object = yn3_0.a;
        objectArray = new Object[]{};
        String string2 = "initLayout";
        ((yn3$a)object).a(string2, objectArray);
        int n3 = R$id.cartEmptyContinueShopping;
        object = (TextView)object2.findViewById(n3);
        this.d = object;
        n3 = R$id.cartEmptyWishListRv;
        this.e = object = (RecyclerView)object2.findViewById(n3);
        n3 = R$id.userDummy;
        object = (ImageView)object2.findViewById(n3);
        this.f = object;
        n3 = R$id.loginBtn;
        object = (TextView)object2.findViewById(n3);
        this.g = object;
        n3 = R$id.addFromWishlist;
        object = (TextView)object2.findViewById(n3);
        this.h = object;
        n3 = R$id.cartEmptyInfoTv;
        object = (TextView)object2.findViewById(n3);
        this.i = object;
        n3 = (int)(og1_1.b() ? 1 : 0);
        if (n3 == 0) {
            n3 = R$id.cartEmptyContinueShopping2;
            object = object2.findViewById(n3);
            this.j = object;
            if (object != null) {
                object.setOnClickListener((View.OnClickListener)this);
            }
        }
        object = this.h;
        object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addWishlistBtn");
            n3 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnContinueShopping");
            n3 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.g;
        if (object == null) {
            object = "loginBtn";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object2.setOnClickListener((View.OnClickListener)this);
    }

    public final void a() {
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        GTMEvents gTMEvents = analyticsManager$Companion.getInstance().getGtmEvents();
        ak0_0.a(analyticsManager$Companion, gTMEvents, "Empty Cart", "Closet Product");
        this.c.a5();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(ProductsList object, Application object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object2, "application");
        object2 = yn3_0.a;
        boolean bl3 = false;
        Object object3 = new Object[]{};
        ((yn3$a)object2).a("setData", (Object[])object3);
        object2 = this.k.getValue();
        Intrinsics.checkNotNullExpressionValue(object2, "getValue(...)");
        object2 = (UserInformation)object2;
        int n3 = ((UserInformation)object2).isUserOnline();
        object3 = "loginBtn";
        String string2 = "btnContinueShopping";
        String string3 = "dummyUserImg";
        String string4 = "addWishlistBtn";
        String string5 = "cartEmptyInfoTv";
        String string6 = "closetItemsListView";
        int n4 = 8;
        Object object4 = null;
        if (n3 != 0) {
            boolean bl4;
            object2 = this.g;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n3 = 0;
                object2 = null;
            }
            object2.setVisibility(n4);
            object2 = this.c;
            int n7 = object2 instanceof Fragment;
            if (n7 == 0) return;
            object2 = (Fragment)object2;
            if (object2 == null) {
                return;
            }
            n7 = object instanceof ProductsList;
            if (n7 != 0) {
                object3 = ((ProductsList)object).getProducts();
                if (object3 != null) {
                    n7 = object3.size();
                } else {
                    n7 = 0;
                    object3 = null;
                }
                if (n7 > 0) {
                    object3 = this.h;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n7 = 0;
                        object3 = null;
                    }
                    object3.setVisibility(0);
                    object3 = this.f;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n7 = 0;
                        object3 = null;
                    }
                    object3.setVisibility(n4);
                    object3 = this.e;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string6);
                        n7 = 0;
                        object3 = null;
                    }
                    object3.setVisibility(0);
                    object3 = this.i;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                        n7 = 0;
                        object3 = null;
                    }
                    object3.setVisibility(0);
                    object3 = this.i;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                        n7 = 0;
                        object3 = null;
                    }
                    int n8 = R$string.wish_product_refresh;
                    string3 = hv3_0.K(n8);
                    object3.setText((CharSequence)string3);
                    n7 = (int)(og1_1.b() ? 1 : 0);
                    if (n7 == 0) {
                        object3 = this.j;
                        if (object3 != null) {
                            object3.setVisibility(n4);
                        }
                        if ((object3 = this.d) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n7 = 0;
                            object3 = null;
                        }
                        object3.setVisibility(0);
                    }
                    if ((object2 = ((Fragment)object2).getContext()) != null) {
                        object3 = new LinearLayoutManager((Context)object2, 0, false);
                    } else {
                        n7 = 0;
                        object3 = null;
                    }
                    object2 = this.e;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string6);
                        n3 = 0;
                        object2 = null;
                    }
                    ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object3);
                    object2 = this.e;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string6);
                        n3 = 0;
                        object2 = null;
                    }
                    bl3 = true;
                    ((RecyclerView)object2).setHasFixedSize(bl3);
                    object = ((ProductsList)object).getProducts();
                    object2 = new cz0_2((List)object, this);
                    object = this.e;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string6);
                    } else {
                        object4 = object;
                    }
                    ((RecyclerView)object4).setAdapter((RecyclerView$f)object2);
                    return;
                }
            }
            if ((object = this.h) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                bl4 = false;
                object = null;
            }
            object.setVisibility(n4);
            object = this.f;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl4 = false;
                object = null;
            }
            object.setVisibility(0);
            object = this.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string6);
                bl4 = false;
                object = null;
            }
            object.setVisibility(n4);
            object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                bl4 = false;
                object = null;
            }
            object.setVisibility(n4);
            bl4 = og1_1.b();
            if (bl4) return;
            object = this.j;
            if (object != null) {
                object.setVisibility(0);
            }
            if ((object = this.d) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object4 = object;
            }
            object4.setVisibility(n4);
            return;
        }
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            bl2 = false;
            object = null;
        }
        object.setVisibility(0);
        object = this.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            bl2 = false;
            object = null;
        }
        object.setVisibility(0);
        object = this.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string5);
            bl2 = false;
            object = null;
        }
        object.setVisibility(0);
        object = this.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string5);
            bl2 = false;
            object = null;
        }
        n3 = R$string.cart_wishlist_signin_refresh;
        object2 = hv3_0.K(n3);
        object.setText((CharSequence)object2);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            bl2 = false;
            object = null;
        }
        object.setVisibility(n4);
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string6);
            bl2 = false;
            object = null;
        }
        object.setVisibility(n4);
        bl2 = og1_1.b();
        if (bl2) return;
        object = this.j;
        if (object != null) {
            object.setVisibility(n4);
        }
        if ((object = this.d) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object4 = object;
        }
        object4.setVisibility(0);
    }

    public final void onClick(View object) {
        Object object2 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.addFromWishlist;
        Object object3 = this.c;
        String string2 = "Empty Cart";
        if (n3 == n4) {
            object = AnalyticsManager.Companion;
            object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
            object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
            String string3 = "Add from Closet";
            ((GTMEvents)object2).pushButtonTapEvent(string2, string3, (String)object);
            object3.a5();
        } else {
            n4 = R$id.cartEmptyContinueShopping;
            if (n3 != n4 && n3 != (n4 = R$id.cartEmptyContinueShopping2)) {
                n4 = R$id.loginBtn;
                if (n3 == n4) {
                    object3.N4();
                }
            } else {
                object = AnalyticsManager.Companion;
                object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
                object3 = "Continue Shopping";
                ak0_0.a((AnalyticsManager$Companion)object, (GTMEvents)object2, string2, (String)object3);
                object = this.a;
                at2_1.e((Context)object);
            }
        }
    }
}

