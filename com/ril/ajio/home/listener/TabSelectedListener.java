/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.webkit.URLUtil
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.home.listener;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$Tab;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.home.listener.TabSelectedListener$1;
import com.ril.ajio.services.data.Home.BottomNavigationData;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.Child;
import com.ril.ajio.view.BaseActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

public final class TabSelectedListener
implements TabLayout$OnTabSelectedListener {
    public BottomNavigationData a;
    public final AjioHomeActivity b;
    public final NewEEcommerceEventsRevamp c;
    public final NewCustomEventsRevamp d;
    public final String e;
    public final String f;

    public TabSelectedListener(AjioHomeActivity ajioHomeActivity) {
        Object object = AnalyticsManager.getInstance().getNewEEcommerceEventsRevamp();
        this.c = object;
        Object object2 = AnalyticsManager.getInstance().getNewCustomEventsRevamp();
        this.d = object2;
        this.e = object2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        this.f = object = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        this.b = ajioHomeActivity;
    }

    public static boolean h(CMSNavigation cMSNavigation) {
        boolean bl2;
        Object object = cMSNavigation.getAlternateData();
        if (object != null && (object = cMSNavigation.getAlternateData().getInactiveImageUrl()) != null && (bl2 = cMSNavigation.getSwitchable())) {
            bl2 = true;
        } else {
            bl2 = false;
            cMSNavigation = null;
        }
        return bl2;
    }

    public final void a() {
        boolean bl2;
        AjioHomeActivity ajioHomeActivity = this.b;
        if (ajioHomeActivity != null && !(bl2 = ajioHomeActivity.isFinishing())) {
            FragmentManager fragmentManager = ajioHomeActivity.getSupportFragmentManager();
            int n3 = fragmentManager.J();
            for (int i3 = 0; i3 < n3; ++i3) {
                boolean bl3 = ajioHomeActivity.isFinishing();
                if (bl3) continue;
                fragmentManager.W();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        int n3;
        int n4;
        int n7;
        Object object;
        AjioHomeActivity ajioHomeActivity;
        block6: {
            boolean bl2;
            ajioHomeActivity = this.b;
            if (ajioHomeActivity == null || (bl2 = ajioHomeActivity.isFinishing())) return;
            try {
                object = ajioHomeActivity.getSupportFragmentManager();
                n7 = ((FragmentManager)object).J() + -1;
                n4 = 0;
                break block6;
            }
            catch (Exception exception) {}
            yn3_0.a(exception);
            at2_1.e((Context)ajioHomeActivity);
            return;
        }
        for (n3 = 0; n3 < n7; ++n3) {
            boolean bl3 = ajioHomeActivity.isFinishing();
            if (bl3) continue;
            ((FragmentManager)object).W();
        }
        n7 = R$id.content;
        if ((object = ((FragmentManager)object).D(n7)) == null) return;
        String string2 = "fragment";
        Intrinsics.checkNotNullParameter(object, string2);
        ajioHomeActivity.T0 = object;
        object = ((Fragment)object).getChildFragmentManager();
        n7 = ((FragmentManager)object).J() + -1;
        while (n4 < n7) {
            n3 = (int)(ajioHomeActivity.isFinishing() ? 1 : 0);
            if (n3 == 0) {
                ((FragmentManager)object).W();
            }
            ++n4;
        }
    }

    public final void c(String string2) {
        NewCustomEventsRevamp newCustomEventsRevamp = this.d;
        String string3 = newCustomEventsRevamp.getEVENT_CATEGORY_FOOTER_NAVIGATION_INTERACTIONS();
        Object object = this.d;
        String string4 = ((NewCustomEventsRevamp)object).getEVENT_ACTION_ICON_CLICK();
        String string5 = ((NewCustomEventsRevamp)object).getEVENT_FOOTER_NAVIGATION_MENU_CLICK();
        String string6 = AnalyticsManager.getInstance().getGtmEvents().getScreenName();
        String string7 = AnalyticsManager.getInstance().getGtmEvents().getScreenName();
        String string8 = this.f;
        String string9 = this.e;
        object = string4;
        string4 = string2;
        newCustomEventsRevamp.newPushCustomEvent(string3, (String)object, string2, string5, string6, string7, string9, null, string8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void d(TabLayout$Tab tabLayout$Tab) {
        int n3;
        Object object;
        int n4;
        boolean bl2;
        Object object2;
        int n7;
        Object object3;
        Object object4;
        int n8;
        TabSelectedListener tabSelectedListener = this;
        Object object5 = this.a;
        if (object5 == null) return;
        if (tabLayout$Tab == null) return;
        if ((object5 = ((BottomNavigationData)object5).getData()) == null) return;
        object5 = this.a.getData().getChildDetails();
        if (object5 == null) return;
        object5 = this.a.getData().getChildDetails();
        int n10 = tabLayout$Tab.getPosition();
        if ((object5 = object5.get(n10)) == null) return;
        object5 = this.a.getData().getChildDetails();
        n10 = tabLayout$Tab.getPosition();
        object5 = (CMSNavigation)object5.get(n10);
        if (object5 == null) {
            return;
        }
        n10 = tabLayout$Tab.getPosition();
        int n14 = 1;
        Object object6 = "first_tab_tag";
        Object object7 = "";
        Object object8 = n10 != 0 ? (n10 != n14 ? (n10 != (n8 = 2) ? (n10 != (n8 = 3) ? (n10 != (n8 = 4) ? object7 : "fifth_tab_tag") : "fourth_tab_tag") : "third_tab_tag") : "second_tab_tag") : object6;
        n8 = (int)(TextUtils.isEmpty((CharSequence)object8) ? 1 : 0);
        if (n8 == 0) {
            hv3_0.a.getClass();
            object4 = hv3_0.M();
            object8 = ((String)object8).concat((String)object4);
        }
        object4 = tabLayout$Tab.getCustomView();
        AjioHomeActivity ajioHomeActivity = tabSelectedListener.b;
        Object object9 = "/switch-stores";
        if (object4 != null) {
            object3 = ((CMSNavigation)object5).getActiveAltText();
            int n15 = TextUtils.isEmpty((CharSequence)object3);
            if (n15 == 0) {
                object3 = ((CMSNavigation)object5).getActiveAltText();
                object4.setContentDescription((CharSequence)object3);
            }
            if ((object3 = object4.findViewById(n15 = R$id.bottom_indicator)) != null && (n7 = ((String)(object2 = ((CMSNavigation)object5).getUrl())).equals(object9)) == 0) {
                object3.setVisibility(0);
            } else {
                object3 = ((CMSNavigation)object5).getUrl();
                n15 = (int)(((String)object3).equalsIgnoreCase((String)object9) ? 1 : 0);
                if (n15 != 0) {
                    object3 = ajioHomeActivity.getSupportFragmentManager().E((String)object8);
                    if (object3 != null) {
                        object3 = ((Fragment)object3).getChildFragmentManager();
                        n7 = R$id.home_content;
                        if ((n7 = (object3 = ((FragmentManager)object3).D(n7)) instanceof q9_0) != 0) {
                            object3 = (q9_0)object3;
                            ((q9_0)object3).Jb(n14 != 0);
                            ((q9_0)object3).mb();
                        }
                    }
                    object2 = Looper.getMainLooper();
                    object3 = new Handler((Looper)object2);
                    object2 = new TabSelectedListener$1(tabSelectedListener);
                    long l2 = 300L;
                    object3.postDelayed((Runnable)object2, l2);
                }
            }
            n15 = R$id.tab_icon;
            object3 = (ImageView)object4.findViewById(n15);
            object2 = ((CMSNavigation)object5).getActiveImageUrl();
            if (object2 != null) {
                object2 = ((CMSNavigation)object5).getActiveImageUrl();
                n7 = (int)(URLUtil.isValidUrl((String)object2) ? 1 : 0);
                if (n7 != 0) {
                    object2 = hv3_0.a;
                    String string2 = ((CMSNavigation)object5).getActiveMediaType();
                    object2.getClass();
                    n7 = (int)(hv3_0.Z(string2) ? 1 : 0);
                    if (n7 != 0) {
                        String string3;
                        object2 = new da$a();
                        ((da$a)object2).x = n14;
                        ((da$a)object2).y = string3 = ((CMSNavigation)object5).getActiveImageUrl();
                        String string4 = ((CMSNavigation)object5).getActiveImageUrl();
                        ((da$a)object2).n = string4;
                        ((da$a)object2).u = object3;
                        ((da$a)object2).a();
                    } else {
                        String string5;
                        object2 = new da$a();
                        ((da$a)object2).x = n14;
                        ((da$a)object2).y = string5 = ((CMSNavigation)object5).getActiveImageUrl();
                        String string6 = ((CMSNavigation)object5).getActiveImageUrl();
                        ((da$a)object2).n = string6;
                        ((da$a)object2).u = object3;
                        ((da$a)object2).a();
                    }
                }
            } else {
                n7 = (int)(TabSelectedListener.h((CMSNavigation)object5) ? 1 : 0);
                if (n7 != 0 && (object2 = ((CMSNavigation)object5).getInactiveImageUrl()) != null && (n7 = (int)(URLUtil.isValidUrl((String)(object2 = ((CMSNavigation)object5).getInactiveImageUrl())) ? 1 : 0)) != 0) {
                    object2 = hv3_0.a;
                    String string7 = ((CMSNavigation)object5).getInactiveMediaType();
                    object2.getClass();
                    n7 = (int)(hv3_0.Z(string7) ? 1 : 0);
                    if (n7 != 0) {
                        String string8;
                        object2 = new da$a();
                        ((da$a)object2).x = n14;
                        ((da$a)object2).y = string8 = ((CMSNavigation)object5).getInactiveImageUrl();
                        String string9 = ((CMSNavigation)object5).getInactiveImageUrl();
                        ((da$a)object2).n = string9;
                        ((da$a)object2).u = object3;
                        ((da$a)object2).a();
                    } else {
                        String string10;
                        object2 = new da$a();
                        ((da$a)object2).x = n14;
                        ((da$a)object2).y = string10 = ((CMSNavigation)object5).getInactiveImageUrl();
                        String string11 = ((CMSNavigation)object5).getInactiveImageUrl();
                        ((da$a)object2).n = string11;
                        ((da$a)object2).u = object3;
                        ((da$a)object2).a();
                    }
                }
            }
            n15 = R$id.tab_title;
            object4 = (TextView)object4.findViewById(n15);
            object3 = FontsManager.getInstance();
            n7 = 9;
            object3 = ((FontsManager)object3).getTypefaceWithFont((Context)ajioHomeActivity, n7);
            object4.setTypeface((Typeface)object3);
            object3 = "#202020";
            int n16 = Color.parseColor((String)object3);
            object4.setTextColor(n16);
            n16 = (int)(TabSelectedListener.h((CMSNavigation)object5) ? 1 : 0);
            if (n16 != 0) {
                object3 = ((CMSNavigation)object5).getName();
                object4.setText((CharSequence)object3);
            } else {
                FontsManager fontsManager = FontsManager.getInstance();
                object2 = fontsManager.getTypefaceWithFont((Context)ajioHomeActivity, n7);
                object4.setTypeface((Typeface)object2);
                n15 = Color.parseColor((String)object3);
                object4.setTextColor(n15);
            }
        }
        if ((n8 = (int)(ajioHomeActivity.C0 ? 1 : 0)) == 0) {
            ajioHomeActivity.v0 = n14;
            ajioHomeActivity.C0 = n14;
            return;
        }
        String string12 = AnalyticsManager.getInstance().getGtmEvents().getScreenName();
        object4 = ((CMSNavigation)object5).getName();
        object3 = (CMSNavigation)tabLayout$Tab.getTag();
        Object object10 = "/home";
        if (object3 != null && (object2 = ((CMSNavigation)object3).getUrl()) != null && (n7 = ((String)(object2 = ((CMSNavigation)object3).getUrl())).equalsIgnoreCase((String)object9)) != 0) {
            object2 = ((CMSNavigation)object3).getDisplayedUrl();
            n7 = (int)(((String)object2).equalsIgnoreCase((String)object10) ? 1 : 0);
            if (n7 != 0) {
                object9 = ((CMSNavigation)object3).getAlternateData();
                if (object9 != null) {
                    object4 = ((CMSNavigation)object3).getAlternateData().getName();
                }
            } else {
                object2 = ((CMSNavigation)object3).getDisplayedUrl();
                n7 = (int)(((String)object2).equalsIgnoreCase((String)object9) ? 1 : 0);
                if (n7 != 0) {
                    object4 = ((CMSNavigation)object3).getName();
                } else {
                    object2 = ((CMSNavigation)object3).getUrl();
                    bl2 = ((String)object2).equalsIgnoreCase((String)object9);
                    if (bl2 && (object9 = ((CMSNavigation)object3).getAlternateData()) != null && !(bl2 = TextUtils.isEmpty((CharSequence)(object9 = ((CMSNavigation)object3).getAlternateData().getName())))) {
                        object4 = ((CMSNavigation)object3).getAlternateData().getName();
                    }
                }
            }
        }
        if (bl2 = ajioHomeActivity.v0) {
            object9 = new jo_2((Context)ajioHomeActivity);
            Bundle bundle = new Bundle();
            object3 = new StringBuilder((String)object7);
            n4 = ((jo_2)object9).d();
            ((StringBuilder)object3).append(n4);
            object7 = ((StringBuilder)object3).toString();
            bundle.putString("number_of_items_on_cart", (String)object7);
            object3 = AnalyticsManager.getInstance().getGtmEvents();
            object7 = ne_0.b(bundle);
            object9 = bundle;
            Object object11 = object4;
            object = object10;
            object10 = object7;
            ((GTMEvents)object3).pushButtonTapEvent("footer clicks", object4, string12, (AnalyticsData)object7, null);
            object7 = tabSelectedListener.d;
            String string13 = ((NewCustomEventsRevamp)object7).getEC_USER_INTERACTION();
            String string14 = ((NewCustomEventsRevamp)object7).getEA_NAV_CLICK_FOOTER();
            String string15 = AnalyticsManager.getInstance().getGtmEvents().getScreenName();
            String string16 = AnalyticsManager.getInstance().getGtmEvents().getScreenName();
            object3 = tabSelectedListener.f;
            String string17 = "navigation_click";
            object2 = tabSelectedListener.e;
            ((NewCustomEventsRevamp)object7).newPushCustomEvent(string13, string14, (String)object4, string17, string15, string16, (String)object2, (Bundle)object9, (String)object3);
            n4 = (int)(ajioHomeActivity.v0 ? 1 : 0);
            if (n4 != 0 && (n4 = (int)(((String)object4).contains((CharSequence)(object7 = "switch")) ? 1 : 0)) == 0) {
                tabSelectedListener.c((String)object4);
            }
        } else {
            object = object10;
        }
        ajioHomeActivity.v0 = n14;
        object7 = ((CMSNavigation)object5).getUrl();
        if (object7 != null && (n4 = ((h91)(object7 = ajioHomeActivity.P2())).b()) == 0 && (n4 = (int)(((String)(object7 = ((CMSNavigation)object5).getUrl())).equalsIgnoreCase((String)(object4 = "/wishlist")) ? 1 : 0)) != 0) {
            ajioHomeActivity.B0 = n14;
            ajioHomeActivity.c1 = n3 = tabLayout$Tab.getPosition();
            ajioHomeActivity.v0 = n14;
            ajioHomeActivity.z0(6, "source - closet");
            return;
        }
        int n17 = ((String)object8).contains((CharSequence)object6);
        if (n17 != 0 && (n17 = ((FragmentManager)(object6 = ajioHomeActivity.getSupportFragmentManager())).J()) > n14) {
            object6 = ajioHomeActivity.getSupportFragmentManager().I(0).getName();
            Objects.requireNonNull(object6);
            object7 = "first_tab_tag_ajio";
            n17 = (int)(((String)object6).equalsIgnoreCase((String)object7) ? 1 : 0);
            if (n17 != 0 && (n17 = (int)(og1_1.c() ? 1 : 0)) != 0) {
                ajioHomeActivity.c(n14 != 0);
                return;
            }
        }
        if ((object6 = ajioHomeActivity.getSupportFragmentManager().E((String)object8)) == null) {
            object6 = new tm2_2();
            BaseActivity.y2(ajioHomeActivity, (tm2_2)object6, (String)object8);
        }
        Intrinsics.checkNotNullParameter(object6, "fragment");
        ajioHomeActivity.T0 = object6;
        object7 = ((Fragment)object6).getChildFragmentManager();
        n4 = ((FragmentManager)object7).J();
        if (n4 <= 0) {
            object8 = ((CMSNavigation)object5).getUrl();
            if (object8 == null) return;
            object8 = ((CMSNavigation)object5).getUrl();
            boolean bl3 = ((String)object8).equalsIgnoreCase((String)object);
            if (bl3) return;
            object5 = ((CMSNavigation)object5).getUrl();
            object = kj0_1.g();
            object8 = ajioHomeActivity.j1;
            Boolean bl4 = Boolean.FALSE;
            ((kj0_1)object).s(ajioHomeActivity, (String)object5, (Bundle)object8, bl4);
            object5 = ajioHomeActivity.j1;
            if (object5 == null) return;
            n3 = 0;
            object5 = null;
            ajioHomeActivity.j1 = null;
            return;
        } else {
            object5 = ajioHomeActivity.getSupportFragmentManager();
            object = ajioHomeActivity.getSupportFragmentManager();
            int n18 = ((FragmentManager)object).J() - n14;
            if ((object5 = ((FragmentManager)object5).I(n18).getName()) != null) {
                n3 = (int)(((String)object5).equalsIgnoreCase((String)object8) ? 1 : 0);
                if (n3 != 0) return;
            }
            object5 = ajioHomeActivity.getSupportFragmentManager();
            object5 = Vp0.a((FragmentManager)object5, (FragmentManager)object5);
            n18 = R$id.content;
            ((k)object5).j(n18, (Fragment)object6, (String)object8);
            ((k)object5).c((String)object8);
            ((a)object5).o(n14 != 0, n14 != 0);
        }
    }

    /*
     * Exception decompiling
     */
    public final void e(TabLayout$Tab var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 764->769)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void f(TabLayout$Tab tabLayout$Tab) {
        int n3;
        String string2;
        int n4;
        Object object;
        int n7;
        Object object2;
        TabSelectedListener tabSelectedListener = this;
        Object object3 = this.a;
        int n8 = 0;
        FragmentManager fragmentManager = null;
        if (object3 == null) return;
        if (tabLayout$Tab == null) return;
        if ((object3 = ((BottomNavigationData)object3).getNavigationNode()) == null) return;
        object3 = this.a.getNavigationNode().getChildren();
        if (object3 == null) return;
        object3 = this.a.getNavigationNode().getChildren();
        int n10 = tabLayout$Tab.getPosition();
        if ((object3 = object3.get(n10)) == null) return;
        object3 = this.a.getNavigationNode().getChildren();
        n10 = tabLayout$Tab.getPosition();
        object3 = (Child)object3.get(n10);
        if (object3 == null) {
            return;
        }
        Object object4 = tabLayout$Tab.getCustomView();
        int n14 = 1;
        AjioHomeActivity ajioHomeActivity = tabSelectedListener.b;
        if (object4 != null) {
            object2 = ((Child)object3).getAppMedia();
            if (object2 != null && (object2 = ((Child)object3).getAppMedia().getURL()) != null) {
                n7 = R$id.tab_icon;
                object2 = (ImageView)object4.findViewById(n7);
                object = ((Child)object3).getAppMedia().getURL();
                n4 = (int)(URLUtil.isValidUrl((String)object) ? 1 : 0);
                if (n4 != 0) {
                    object = new da$a();
                    ((da$a)object).x = n14;
                    ((da$a)object).y = string2 = ((Child)object3).getAppMedia().getURL();
                    string2 = ((Child)object3).getAppMedia().getURL();
                    ((da$a)object).n = string2;
                    ((da$a)object).u = object2;
                    ((da$a)object).a();
                }
            }
            n7 = R$id.tab_title;
            object4 = (TextView)object4.findViewById(n7);
            object2 = FontsManager.getInstance();
            n4 = 10;
            object2 = ((FontsManager)object2).getTypefaceWithFont((Context)ajioHomeActivity, n4);
            object4.setTypeface((Typeface)object2);
            object2 = "#202020";
            n7 = Color.parseColor((String)object2);
            object4.setTextColor(n7);
        }
        if ((n10 = ajioHomeActivity.C0) == 0) {
            ajioHomeActivity.v0 = n14;
            ajioHomeActivity.C0 = n14;
            return;
        }
        object4 = AnalyticsManager.getInstance().getGtmEvents();
        String string3 = ((GTMEvents)object4).getScreenName();
        String string4 = ((Child)object3).getTitle();
        n10 = (int)(ajioHomeActivity.v0 ? 1 : 0);
        Object object5 = "";
        if (n10 != 0) {
            object4 = new jo_2((Context)ajioHomeActivity);
            Bundle bundle = new Bundle();
            object2 = new StringBuilder((String)object5);
            n10 = ((jo_2)object4).d();
            ((StringBuilder)object2).append(n10);
            object4 = ((StringBuilder)object2).toString();
            bundle.putString("number_of_items_on_cart", (String)object4);
            object2 = AnalyticsManager.getInstance().getGtmEvents();
            Object object6 = ne_0.b(bundle);
            string2 = string4;
            ((GTMEvents)object2).pushButtonTapEvent("footer clicks", string4, string3, (AnalyticsData)object6, null);
            object6 = tabSelectedListener.d;
            String string5 = ((NewCustomEventsRevamp)object6).getEC_USER_INTERACTION();
            String string6 = ((NewCustomEventsRevamp)object6).getEA_NAV_CLICK_FOOTER();
            object4 = AnalyticsManager.getInstance().getGtmEvents().getScreenName();
            String string7 = AnalyticsManager.getInstance().getGtmEvents().getScreenName();
            object2 = tabSelectedListener.c;
            String string8 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
            String string9 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
            object = bundle;
            String string10 = "navigation_click";
            object2 = object5;
            object5 = object4;
            ((NewCustomEventsRevamp)object6).newPushCustomEvent(string5, string6, string4, string10, (String)object4, string7, string8, (Bundle)object, string9);
        } else {
            object2 = object5;
        }
        ajioHomeActivity.v0 = n14;
        object4 = ((Child)object3).getNodeurlLink();
        if (object4 != null && (n10 = (int)(((h91)(object4 = ajioHomeActivity.P2())).b() ? 1 : 0)) == 0 && (n10 = (int)(((String)(object4 = ((Child)object3).getNodeurlLink())).equalsIgnoreCase((String)(object = "/wishlist")) ? 1 : 0)) != 0) {
            ajioHomeActivity.B0 = n14;
            ajioHomeActivity.c1 = n3 = tabLayout$Tab.getPosition();
            ajioHomeActivity.v0 = n14;
            ajioHomeActivity.z0(6, "source - closet");
            return;
        }
        n10 = tabLayout$Tab.getPosition();
        object5 = n10 != 0 ? (n10 != n14 ? (n10 != (n4 = 2) ? (n10 != (n4 = 3) ? (n10 != (n4 = 4) ? object2 : "fifth_tab_tag") : "fourth_tab_tag") : "third_tab_tag") : "second_tab_tag") : "first_tab_tag";
        n10 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0);
        if (n10 == 0) {
            hv3_0.a.getClass();
            object4 = hv3_0.M();
            object5 = ((String)object5).concat((String)object4);
        }
        if ((object4 = ajioHomeActivity.getSupportFragmentManager().E((String)object5)) == null) {
            object4 = new tm2_2();
            BaseActivity.y2(ajioHomeActivity, (tm2_2)object4, (String)object5);
        }
        Intrinsics.checkNotNullParameter(object4, "fragment");
        ajioHomeActivity.T0 = object4;
        object2 = ((Fragment)object4).getChildFragmentManager();
        n7 = ((FragmentManager)object2).J();
        if (n7 <= 0) {
            String string11;
            object4 = ((Child)object3).getNodeurlLink();
            if (object4 == null) return;
            object4 = ((Child)object3).getNodeurlLink();
            n10 = (int)(((String)object4).equalsIgnoreCase(string11 = "/home") ? 1 : 0);
            if (n10 != 0) return;
            object3 = ((Child)object3).getNodeurlLink();
            object4 = kj0_1.g();
            string11 = ajioHomeActivity.j1;
            object2 = Boolean.FALSE;
            ((kj0_1)object4).s(ajioHomeActivity, (String)object3, (Bundle)string11, (Boolean)object2);
            object3 = ajioHomeActivity.j1;
            if (object3 == null) return;
            ajioHomeActivity.j1 = null;
            return;
        } else {
            object3 = ajioHomeActivity.getSupportFragmentManager();
            fragmentManager = ajioHomeActivity.getSupportFragmentManager();
            n8 = fragmentManager.J() - n14;
            if ((object3 = ((FragmentManager)object3).I(n8).getName()) != null) {
                n3 = (int)(((String)object3).equalsIgnoreCase((String)object5) ? 1 : 0);
                if (n3 != 0) return;
            }
            object3 = ajioHomeActivity.getSupportFragmentManager();
            object3 = Vp0.a((FragmentManager)object3, (FragmentManager)object3);
            n8 = R$id.content;
            ((k)object3).j(n8, (Fragment)object4, (String)object5);
            ((k)object3).c((String)object5);
            ((a)object3).o(n14 != 0, n14 != 0);
        }
    }

    /*
     * Exception decompiling
     */
    public final void g(TabLayout$Tab var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 423->428)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public final void onTabReselected(TabLayout$Tab var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 106->111)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void onTabSelected(TabLayout$Tab tabLayout$Tab) {
        boolean bl2 = og1_1.c();
        if (bl2) {
            Object object = this.a;
            if (object != null && (object = ((BottomNavigationData)object).getData()) != null) {
                this.d(tabLayout$Tab);
            } else {
                this.f(tabLayout$Tab);
            }
        } else {
            Object object = this.a;
            if (object != null && (object = ((BottomNavigationData)object).getData()) != null) {
                this.d(tabLayout$Tab);
            } else {
                this.f(tabLayout$Tab);
            }
        }
    }

    public final void onTabUnselected(TabLayout$Tab tabLayout$Tab) {
        boolean bl2 = og1_1.c();
        if (bl2) {
            Object object = this.a;
            if (object != null && (object = ((BottomNavigationData)object).getData()) != null) {
                this.e(tabLayout$Tab);
            } else {
                this.g(tabLayout$Tab);
            }
        } else {
            Object object = this.a;
            if (object != null && (object = ((BottomNavigationData)object).getData()) != null) {
                this.e(tabLayout$Tab);
            } else {
                this.g(tabLayout$Tab);
            }
        }
    }
}

