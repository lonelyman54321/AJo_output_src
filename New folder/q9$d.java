/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.widget.ImageView
 */
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$Tab;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Home.NativeCategoryNavigationListDetail;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class q9$d
implements TabLayout$OnTabSelectedListener {
    public final /* synthetic */ q9_0 a;

    public q9$d(q9_0 q9_02) {
        this.a = q9_02;
    }

    public final void onTabReselected(TabLayout$Tab tabLayout$Tab) {
    }

    public final void onTabSelected(TabLayout$Tab tabLayout$Tab) {
        boolean bl2;
        int n3;
        Object object;
        Object object2;
        boolean bl3 = false;
        q9_0 q9_02 = this.a;
        boolean bl4 = true;
        if (tabLayout$Tab != null) {
            Object object3;
            int n4;
            object2 = q9_02.X;
            object = "ajiohomeViewModel";
            int n7 = 0;
            Object object4 = null;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(object);
                n3 = 0;
                object2 = null;
            }
            if ((object2 = ((x9_0)object2).I) != null) {
                n4 = tabLayout$Tab.getPosition();
                object2 = (NativeCategoryNavigationListDetail)((ArrayList)object2).get(n4);
            } else {
                n3 = 0;
                object2 = null;
            }
            if (object2 != null && (object2 = tabLayout$Tab.getCustomView()) != null) {
                object3 = q9_02.X;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(object);
                    n4 = 0;
                    object3 = null;
                }
                object3 = ((x9_0)object3).I;
                Intrinsics.checkNotNull(object3);
                int n8 = tabLayout$Tab.getPosition();
                object3 = (NativeCategoryNavigationListDetail)((ArrayList)object3).get(n8);
                n4 = (int)(((NativeCategoryNavigationListDetail)object3).getDefaultNode() ? 1 : 0);
                if (n4 != 0) {
                    object3 = q9_02.k;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("homeListener");
                        n4 = 0;
                        object3 = null;
                    }
                    object3.r1("/switch-stores");
                    n4 = R$id.category_img;
                    object3 = (ImageView)object2.findViewById(n4);
                    String string2 = hv3_0.K(R$string.acc_top_navigation_active_home);
                    object2.setContentDescription((CharSequence)string2);
                    object2 = od3_2.a;
                    n8 = ((String)object2).length();
                    if (n8 == 0) {
                        object2 = od3_2.a();
                    }
                    if ((n3 = (int)(Intrinsics.areEqual(object2, string2 = ld3_2.STORE_LUXE.getStoreId()) ? 1 : 0)) != 0) {
                        if (object3 != null) {
                            n3 = R$drawable.luxe_home_selected_nav;
                            object3.setImageResource(n3);
                        }
                        q9_02.wb(bl4);
                    } else {
                        object2 = h40_0.a;
                        n3 = (int)(h40_0.c() ? 1 : 0);
                        if (n3 != 0 && (n3 = (int)(Intrinsics.areEqual(object2 = od3_2.a(), string2 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0)) != 0) {
                            if (object3 != null) {
                                n3 = R$drawable.luxe_home_selected_nav;
                                object3.setImageResource(n3);
                            }
                            q9_02.wb(bl4);
                        } else {
                            if (object3 != null) {
                                n3 = R$drawable.home_selected_ajio_tab;
                                object3.setImageResource(n3);
                            }
                            q9_02.tb(bl4);
                        }
                    }
                } else {
                    object3 = q9_02.X;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(object);
                        n4 = 0;
                        object3 = null;
                    }
                    if ((object3 = ((x9_0)object3).I) != null && (object3 = (NativeCategoryNavigationListDetail)((ArrayList)object3).get(n8 = tabLayout$Tab.getPosition())) != null) {
                        object3 = ((NativeCategoryNavigationListDetail)object3).getActiveAltText();
                    } else {
                        n4 = 0;
                        object3 = null;
                    }
                    object2.setContentDescription((CharSequence)object3);
                }
            }
            q9_02.C1 = n3 = tabLayout$Tab.getPosition();
            object2 = q9_02.X;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(object);
                n3 = 0;
                object2 = null;
            }
            ((x9_0)object2).x = n4 = q9_02.C1;
            object2 = q9_02.X;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(object);
                n3 = 0;
                object2 = null;
            }
            ((x9_0)object2).z = n4 = q9_02.C1;
            object2 = q9_02.I;
            object3 = q9_02.J;
            hv3_0.r0((ShimmerFrameLayout)((Object)object2), (View)object3);
            n3 = q9_02.C1;
            q9_02.yb(n3, false);
            n3 = tabLayout$Tab.getPosition();
            if (n3 != 0) {
                object2 = q9_02.X;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(object);
                    n3 = 0;
                    object2 = null;
                }
                if ((n4 = (int)(((x9_0)object2).u ? 1 : 0)) != 0) {
                    ((x9_0)object2).v = bl4;
                }
            }
            if ((object2 = q9_02.X) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(object);
                n3 = 0;
                object2 = null;
            }
            if ((object2 = ((x9_0)object2).I) != null) {
                int n10 = tabLayout$Tab.getPosition();
                object4 = object2 = ((ArrayList)object2).get(n10);
                object4 = (NativeCategoryNavigationListDetail)object2;
            }
            if ((n3 = tabLayout$Tab.getPosition()) == 0) {
                n3 = tabLayout$Tab.getPosition();
                object = "Home";
                object4 = "Home.png";
                q9_02.Vb(n3, (String)object, (String)object4);
            } else {
                object2 = "";
                if (object4 == null || (object = ((NativeCategoryNavigationListDetail)object4).getInactiveAltText()) == null) {
                    object = object2;
                }
                if (object4 != null && (object4 = ((NativeCategoryNavigationListDetail)object4).getImgUrlForTab()) != null) {
                    object2 = object4;
                }
                n7 = tabLayout$Tab.getPosition();
                q9_02.Vb(n7, (String)object, (String)object2);
            }
        }
        object2 = h40_0.a;
        n3 = h40_0.c();
        if (n3 != 0 && (n3 = Intrinsics.areEqual(object2 = od3_2.a(), object = ld3_2.STORE_AJIOGRAM.getStoreId())) != 0) {
            if (tabLayout$Tab != null && !(bl2 = tabLayout$Tab.getPosition())) {
                bl3 = true;
            }
            bl2 = bl3 ^ true;
            q9_02.hb(bl2);
        }
        if (bl2 = q9_02.u2) {
            q9_02.Fb();
        }
        q9_02.u2 = bl4;
    }

    public final void onTabUnselected(TabLayout$Tab object) {
        Object object2;
        int n3;
        int n4 = 0;
        Object object3 = null;
        if (object != null) {
            n3 = ((TabLayout$Tab)object).getPosition();
            object2 = n3;
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null && (object2 = ((TabLayout$Tab)object).getCustomView()) != null) {
            int n7;
            int n8;
            object2 = this.a;
            Object object4 = ((q9_0)object2).X;
            String string2 = "ajiohomeViewModel";
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n8 = 0;
                object4 = null;
            }
            if ((object4 = ((x9_0)object4).I) != null) {
                n7 = ((TabLayout$Tab)object).getPosition();
                object4 = (NativeCategoryNavigationListDetail)((ArrayList)object4).get(n7);
            } else {
                n8 = 0;
                object4 = null;
            }
            if (object4 != null && (object4 = ((TabLayout$Tab)object).getCustomView()) != null) {
                Object object5 = ((q9_0)object2).X;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n7 = 0;
                    object5 = null;
                }
                object5 = ((x9_0)object5).I;
                Intrinsics.checkNotNull(object5);
                int n10 = ((TabLayout$Tab)object).getPosition();
                object5 = (NativeCategoryNavigationListDetail)((ArrayList)object5).get(n10);
                n7 = (int)(((NativeCategoryNavigationListDetail)object5).getDefaultNode() ? 1 : 0);
                if (n7 != 0) {
                    object = ((q9_0)object2).k;
                    if (object == null) {
                        object = "homeListener";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    } else {
                        object3 = object;
                    }
                    object3.r1("/home");
                    object = hv3_0.K(R$string.acc_top_navigation_inactive_home);
                    object4.setContentDescription((CharSequence)object);
                    int n14 = R$id.category_img;
                    object = (ImageView)object4.findViewById(n14);
                    object3 = od3_2.a;
                    n8 = ((String)object3).length();
                    if (n8 == 0) {
                        object3 = od3_2.a();
                    }
                    object4 = ld3_2.STORE_LUXE.getStoreId();
                    n4 = Intrinsics.areEqual(object3, object4);
                    n8 = 0;
                    object4 = null;
                    if (n4 != 0) {
                        if (object != null) {
                            n4 = R$drawable.luxe_home_unselected;
                            object.setImageResource(n4);
                        }
                        ((q9_0)object2).wb(false);
                    } else {
                        object3 = od3_2.a();
                        n4 = (int)(Intrinsics.areEqual(object3, string2 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0);
                        if (n4 != 0) {
                            if (object != null) {
                                n4 = R$drawable.ajio_home_unselected_nav;
                                object.setImageResource(n4);
                            }
                            ((q9_0)object2).tb(false);
                        } else {
                            if (object != null) {
                                n4 = R$drawable.ajio_home_unselected_nav;
                                object.setImageResource(n4);
                            }
                            ((q9_0)object2).tb(false);
                        }
                    }
                } else {
                    int n15;
                    Object object6;
                    object5 = od3_2.a();
                    n7 = (int)(Intrinsics.areEqual(object5, object6 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0);
                    if (n7 != 0 && (object5 = ((TabLayout$Tab)object).getCustomView()) != null) {
                        n10 = R$id.category_label;
                        object5 = (AjioTextView)object5.findViewById(n10);
                        AJIOApplication.Companion.getClass();
                        object6 = AJIOApplication$a.a();
                        int n16 = R$color.color_6B6D70;
                        n10 = t70.getColor((Context)object6, n16);
                        object5.setTextColor(n10);
                    }
                    if ((object2 = ((q9_0)object2).X) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n3 = 0;
                        object2 = null;
                    }
                    if ((object2 = ((x9_0)object2).I) != null && (object = (NativeCategoryNavigationListDetail)((ArrayList)object2).get(n15 = ((TabLayout$Tab)object).getPosition())) != null) {
                        object3 = ((NativeCategoryNavigationListDetail)object).getInactiveAltText();
                    }
                    object4.setContentDescription((CharSequence)object3);
                }
            }
        }
    }
}

