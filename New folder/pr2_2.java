/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.earlyaccess.entity.EarlyAccessBanner;
import com.ril.ajio.earlyaccess.entity.EarlyAccessBannerData;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.services.data.user.ScreenType;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from PR2
 */
public final class pr2_2 {
    public static final PR2$a Companion;
    public final View a;
    public final nr2_1 b;
    public final boolean c;
    public boolean d;
    public final Toolbar e;
    public final TextView f;
    public final TextView g;
    public final View h;
    public final TextView i;
    public final ImageView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final AppBarLayout n;
    public final View o;

    static {
        PR2$a pR2$a;
        Companion = pR2$a = new Object();
    }

    public pr2_2(View view, nr2_1 nr2_12, boolean bl2) {
        int n3;
        Object object;
        String string2 = "saleToolbarListener";
        Intrinsics.checkNotNullParameter(nr2_12, string2);
        this.a = view;
        this.b = nr2_12;
        this.c = bl2;
        int n4 = 0;
        nr2_12 = null;
        if (view != null) {
            int n7 = R$id.saleToolbar;
            object = (Toolbar)view.findViewById(n7);
        } else {
            boolean bl3 = false;
            object = null;
        }
        this.e = object;
        if (object != null) {
            n3 = R$id.toolbar_title_tv;
            string2 = (TextView)object.findViewById(n3);
        } else {
            n3 = 0;
            string2 = null;
        }
        this.f = string2;
        if (object != null) {
            n3 = R$id.toolbar_subtitle_tv;
            object = (TextView)object.findViewById(n3);
        } else {
            boolean bl4 = false;
            object = null;
        }
        this.g = object;
        if (view != null) {
            int n8 = R$id.saleHeaderContainer;
            object = view.findViewById(n8);
        } else {
            boolean bl5 = false;
            object = null;
        }
        this.h = object;
        if (view != null) {
            int n10 = R$id.showPriceBtn;
            object = (TextView)view.findViewById(n10);
        } else {
            boolean bl6 = false;
            object = null;
        }
        this.i = object;
        if (view != null) {
            int n14 = R$id.saleHeaderIV;
            object = (ImageView)view.findViewById(n14);
        } else {
            boolean bl7 = false;
            object = null;
        }
        this.j = object;
        if (view != null) {
            int n15 = R$id.saleHeaderTV;
            object = (TextView)view.findViewById(n15);
        } else {
            boolean bl8 = false;
            object = null;
        }
        this.k = object;
        if (view != null) {
            int n16 = R$id.saleInfoTV;
            object = (TextView)view.findViewById(n16);
        } else {
            boolean bl9 = false;
            object = null;
        }
        this.l = object;
        if (view != null) {
            int n17 = R$id.saleInfo2TV;
            object = (TextView)view.findViewById(n17);
        } else {
            boolean bl10 = false;
            object = null;
        }
        this.m = object;
        if (view != null) {
            int n18 = R$id.saleAppBarLayout;
            object = (AppBarLayout)view.findViewById(n18);
        } else {
            boolean bl11 = false;
            object = null;
        }
        this.n = object;
        if (view != null) {
            n4 = R$id.collapsedHeaderContainer;
            nr2_12 = view.findViewById(n4);
        }
        this.o = nr2_12;
    }

    public final void a() {
        int n3;
        Object object = tr2_2.a;
        Object object2 = tr2_2.b;
        int n4 = 1;
        ((sw_0)object2).putPreference("SALE_BTN_CLICKED", n4 != 0);
        object = hv3_0.a;
        object = this.a;
        if (object != null) {
            n3 = 2;
            object.performHapticFeedback(n4, n3);
        }
        if ((object = this.l) != null) {
            object2 = tr2_2.g();
            object.setText((CharSequence)object2);
        }
        if ((object = this.i) != null) {
            n3 = 8;
            object.setVisibility(n3);
        }
    }

    public final void b() {
        boolean bl2;
        Object object = CustomerStoreType.a;
        Object object2 = ScreenType.SCREEN_PLP;
        object = CustomerStoreType.a("rilfnl_v1", (ScreenType)((Object)object2));
        object2 = tr2_2.a;
        object2 = null;
        boolean bl3 = tr2_2.n(false);
        if (bl3 && (bl2 = mz3_0.y((String)object))) {
            object = this.m;
            if (object != null) {
                object.setVisibility(0);
            }
            if (object != null) {
                object2 = tr2_2.b();
                object2 = object2 != null && (object2 = ((EarlyAccessBannerData)object2).getEarlyAccessBanner()) != null ? ((EarlyAccessBanner)object2).getSaleInfo() : null;
                Intrinsics.checkNotNull(object2);
                object.setText((CharSequence)object2);
            }
        }
    }

    public final void c() {
        Object object;
        Object object2 = this.l;
        if (object2 != null) {
            object = tr2_2.a;
            object = tr2_2.g();
            object2.setText((CharSequence)object);
        }
        object2 = tr2_2.a;
        boolean bl2 = tr2_2.n(this.c);
        object = this.i;
        int n3 = 8;
        if (bl2) {
            if (object != null) {
                object.setVisibility(n3);
            }
        } else {
            object2 = tr2_2.b;
            bl2 = ((jo_2)object2).n();
            if (!bl2 && !(bl2 = tr2_2.i())) {
                if (object != null) {
                    bl2 = false;
                    object2 = null;
                    object.setVisibility(0);
                }
                if (object != null) {
                    object2 = tr2_2.d().p;
                    object.setText((CharSequence)object2);
                }
                if (object != null) {
                    n3 = 2;
                    object2 = new q80_0(this, n3);
                    object.setOnClickListener((View.OnClickListener)object2);
                }
            } else if (object != null) {
                object.setVisibility(n3);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        Object object;
        Object object2;
        Object object3;
        block16: {
            Exception exception2;
            block15: {
                int n3;
                block14: {
                    object3 = this.o;
                    try {
                        object2 = this.k;
                        if (object2 == null) break block14;
                        object = tr2_2.a;
                        object = tr2_2.e();
                        object2.setText((CharSequence)object);
                    }
                    catch (Exception exception2) {
                        break block15;
                    }
                }
                this.c();
                this.b();
                object2 = Companion;
                object2.getClass();
                PR2$a.a(object3);
                object2 = this.j;
                boolean bl2 = this.c;
                if (object2 != null) {
                    Object object4 = tr2_2.a;
                    n3 = tr2_2.n(bl2);
                    boolean bl3 = true;
                    if (n3 != 0) {
                        int n4;
                        object4 = new da$a();
                        ((da$a)object4).k = bl3;
                        ((da$a)object4).b = n4 = R$drawable.ic_sale_header_default;
                        ((da$a)object4).c = n4;
                        ((da$a)object4).r = bl3;
                        Object object5 = tr2_2.b();
                        if (object5 != null && (object5 = ((EarlyAccessBannerData)object5).getEarlyAccessBanner()) != null) {
                            object5 = ((EarlyAccessBanner)object5).getSaleImage();
                        } else {
                            n4 = 0;
                            object5 = null;
                        }
                        Intrinsics.checkNotNull(object5);
                        ((da$a)object4).n = object5;
                        ((da$a)object4).u = object2;
                        ((da$a)object4).i = bl3;
                        ((da$a)object4).a();
                    } else {
                        int n7;
                        object4 = new da$a();
                        ((da$a)object4).k = bl3;
                        ((da$a)object4).b = n7 = R$drawable.ic_sale_header_default;
                        ((da$a)object4).c = n7;
                        ((da$a)object4).r = bl3;
                        Object object6 = tr2_2.d();
                        ((da$a)object4).n = object6 = ((kr2_2)object6).g;
                        ((da$a)object4).u = object2;
                        ((da$a)object4).i = bl3;
                        ((da$a)object4).a();
                    }
                }
                object2 = tr2_2.a;
                int n8 = tr2_2.n(bl2);
                if (n8 != 0) {
                    object2 = tr2_2.a();
                } else {
                    object2 = tr2_2.d();
                    object2 = ((kr2_2)object2).i;
                }
                if (!bl2) {
                    object = this.h;
                    if (object != null) {
                        n3 = Color.parseColor((String)object2);
                        object.setBackgroundColor(n3);
                    }
                    if (object3 != null) {
                        n8 = Color.parseColor((String)object2);
                        object3.setBackgroundColor(n8);
                    }
                }
                break block16;
            }
            object2 = yn3_0.a;
            ((yn3$a)object2).e(exception2);
        }
        object3 = new Ref$ObjectRef();
        object2 = this.n;
        if (object2 != null) {
            object = new or2_2((Ref$ObjectRef)object3, this);
            ((AppBarLayout)object2).addOnOffsetChangedListener((AppBarLayout$OnOffsetChangedListener)object);
        }
    }
}

